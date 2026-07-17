/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ti extends pc {
    static j field_u;
    private int field_o;
    private int field_w;
    private int[] field_q;
    float field_t;
    private int field_v;
    int field_y;
    private int field_s;
    int field_p;
    static ll field_x;
    private int field_r;
    static int field_z;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        hj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        var9 = HoldTheLine.field_D;
        if (param0 == -55) {
          L0: {
            var2 = 50 - ((ti) this).field_s;
            if (((ti) this).field_y != 2) {
              break L0;
            } else {
              var2 = -(((ti) this).field_a * 5) + (((ti) this).field_r + 25);
              break L0;
            }
          }
          L1: {
            if (var2 >= 0) {
              break L1;
            } else {
              var2 = 0;
              break L1;
            }
          }
          L2: {
            var3 = (int)((double)we.field_n * (-Math.exp((double)((float)var2 * 0.20000000298023224f)) + 1.0));
            if (((ti) this).field_y > 2) {
              var3 = 640;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (((ti) this).field_o == 12) {
              this.c(var3, false);
              break L3;
            } else {
              var4 = 0;
              L4: while (true) {
                if (((ti) this).field_a <= var4) {
                  break L3;
                } else {
                  L5: {
                    stackOut_12_0 = this;
                    stackOut_12_1 = this.e(var4, -125);
                    stackOut_12_2 = var4;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    if (~((ti) this).field_c != ~var4) {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = stackIn_14_2;
                      stackOut_14_3 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      stackIn_15_3 = stackOut_14_3;
                      break L5;
                    } else {
                      stackOut_13_0 = this;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = stackIn_13_2;
                      stackOut_13_3 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      break L5;
                    }
                  }
                  ((ti) this).a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0, (byte) -116);
                  var4++;
                  continue L4;
                }
              }
            }
          }
          L6: {
            if (((ti) this).field_o == 2) {
              this.a(true, var3);
              break L6;
            } else {
              if (((ti) this).field_o != 3) {
                if (((ti) this).field_o != 4) {
                  if (((ti) this).field_o == 5) {
                    this.i(var3, -11468);
                    break L6;
                  } else {
                    if (6 != ((ti) this).field_o) {
                      if (((ti) this).field_o != 9) {
                        if (((ti) this).field_o != 7) {
                          if (8 == ((ti) this).field_o) {
                            this.c((byte) -18);
                            break L6;
                          } else {
                            if (((ti) this).field_o != 10) {
                              if (((ti) this).field_o != 11) {
                                break L6;
                              } else {
                                this.h(12);
                                break L6;
                              }
                            } else {
                              L7: {
                                if (480.0f == ((ti) this).field_t) {
                                  break L7;
                                } else {
                                  this.h(12);
                                  break L7;
                                }
                              }
                              if (0.0f == ((ti) this).field_t) {
                                break L6;
                              } else {
                                this.n(param0 + -10912);
                                break L6;
                              }
                            }
                          }
                        } else {
                          this.c((byte) -18);
                          break L6;
                        }
                      } else {
                        this.l(29280);
                        break L6;
                      }
                    } else {
                      this.f(45, var3);
                      break L6;
                    }
                  }
                } else {
                  this.i(var3, -11468);
                  break L6;
                }
              } else {
                this.a(true, var3);
                break L6;
              }
            }
          }
          L8: {
            if (((ti) this).field_o == 0) {
              break L8;
            } else {
              if (((ti) this).field_o == 12) {
                break L8;
              } else {
                if (((ti) this).field_y <= 2) {
                  L9: {
                    var4 = 0;
                    var5_int = 8;
                    if (10 == ((ti) this).field_o) {
                      var5_int = var5_int - (int)((ti) this).field_t;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (((ti) this).field_y != 2) {
                      break L10;
                    } else {
                      var6 = -(((ti) this).field_a * 5) + -5 + (25 + ((ti) this).field_r);
                      var4 = (int)((double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)var6))));
                      break L10;
                    }
                  }
                  fl.a(qe.field_g[((ti) this).field_o].toUpperCase(), var4, 5, param0 + -1698, var5_int);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
          }
          L11: {
            if (((ti) this).field_o == 0) {
              L12: {
                var4 = -140 + ((ti) this).field_j;
                if (((ti) this).field_y != 0) {
                  break L12;
                } else {
                  var5_int = -((ti) this).field_s + 50;
                  var4 = var4 - (int)((double)((ti) this).field_j * Math.exp((double)(0.20000000298023224f * (float)var5_int)));
                  break L12;
                }
              }
              L13: {
                if (((ti) this).field_y != 3) {
                  break L13;
                } else {
                  var4 = (int)((double)((ti) this).field_j * (Math.exp((double)(0.20000000298023224f * (float)(40 - ((ti) this).field_w))) - 1.0) / (-1.0 + Math.exp(8.0))) + -140;
                  break L13;
                }
              }
              L14: {
                tc.c(0, var4 - -100, 640, 5, 0, 128);
                var5 = fd.field_e.a(8192);
                if (var5 != null) {
                  var13 = new int[4];
                  tc.b(var13);
                  tc.e(0, var4, 640, var4 - -100);
                  var7 = 0;
                  L15: while (true) {
                    if (var7 >= 11) {
                      tc.a(var13);
                      tc.b(0, -1 + var4, 640, 0);
                      var7 = 0;
                      L16: while (true) {
                        if (var7 >= 11) {
                          tc.b(0, var4 + 8, 640, 0);
                          tc.b(0, 90 + var4, 640, 0);
                          var7 = 0;
                          L17: while (true) {
                            if (var7 >= 11) {
                              tc.b(0, var4 + 99, 640, 0);
                              break L14;
                            } else {
                              tc.b(var7 * 64, 91 + var4, 32, 16777215);
                              tc.b(var7 * 64 - -32, var4 + 91, 32, 16711680);
                              var8 = 0;
                              L18: while (true) {
                                if (var8 >= 6) {
                                  tc.b(var7 * 64, 98 + var4, 32, 8421504);
                                  tc.b(var7 * 64 - -32, 98 + var4, 32, 8388608);
                                  var7++;
                                  continue L17;
                                } else {
                                  tc.b(var7 * 64 - 1, 92 + (var4 - -var8), 32, 14737632);
                                  tc.b(31 + var7 * 64, 92 + var4 - -var8, 32, 14680064);
                                  var8++;
                                  continue L18;
                                }
                              }
                            }
                          }
                        } else {
                          tc.b(-16 + 64 * var7, var4, 32, 16777215);
                          tc.b(16 + 64 * var7, var4, 32, 16711680);
                          var8 = 0;
                          L19: while (true) {
                            if (var8 >= 6) {
                              tc.b(64 * var7 + -16, 7 + var4, 32, 8421504);
                              tc.b(16 + 64 * var7, 7 + var4, 32, 8388608);
                              var7++;
                              continue L16;
                            } else {
                              tc.b(-17 + 64 * var7, var8 + var4 - -1, 32, 14737632);
                              tc.b(15 + var7 * 64, 1 + var4 + var8, 32, 14680064);
                              var8++;
                              continue L19;
                            }
                          }
                        }
                      }
                    } else {
                      fd.field_e.a(8192).b(60 * var7, var4);
                      fd.field_e.a(param0 ^ -8247).b(60 * var7, 60 + var4);
                      var7++;
                      continue L15;
                    }
                  }
                } else {
                  break L14;
                }
              }
              uk.field_a.d(207, -15 + var4, 128);
              im.field_b.a(202, -20 + var4);
              break L11;
            } else {
              break L11;
            }
          }
          oi.a(param0 ^ -56, ((ti) this).field_o);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = HoldTheLine.field_D;
          cg.a(-param2 + 40, 102, 560, (byte) 41, 312);
          if (param1 == 0) {
            break L0;
          } else {
            ((ti) this).a(-4);
            break L0;
          }
        }
        L1: {
          var4 = 132;
          q.a(od.field_i[param0], HoldTheLine.field_F, 2, -param2 + 320, (byte) -127, var4);
          var4 += 40;
          var5 = sf.field_m % 180 / 5;
          var6 = param0;
          if (var6 == 0) {
            wb.a(20, sk.field_f, 0, 0, 560, var4 + -20, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
            var4 += 120;
            q.a(am.field_c, HoldTheLine.field_F, 2, -param2 + 320, (byte) -127, var4);
            var4 += 30;
            am.a(310 + -param2, qm.field_a, true, HoldTheLine.field_F, var4, 1);
            var4 += 20;
            am.a(-param2 + 310, ra.field_fb, true, HoldTheLine.field_F, var4, 1);
            var4 += 20;
            am.a(310 - param2, fk.field_a, true, HoldTheLine.field_F, var4, 1);
            var4 += 20;
            am.a(310 - param2, en.field_c, true, HoldTheLine.field_F, var4, 1);
            var4 += 20;
            am.a(-param2 + 310, vm.field_xb, true, HoldTheLine.field_F, var4, 1);
            var4 -= 80;
            ei.a(-param2 + 320, 1, b.field_a, 0, var4, HoldTheLine.field_F);
            var4 += 20;
            ei.a(-param2 + 320, param1 ^ 1, pa.field_i, 0, var4, HoldTheLine.field_F);
            var4 += 20;
            ei.a(320 + -param2, 1, gi.field_H, 0, var4, HoldTheLine.field_F);
            var4 += 20;
            ei.a(320 + -param2, 1, cf.field_t, 0, var4, HoldTheLine.field_F);
            var4 += 20;
            ei.a(320 + -param2, param1 + 1, kc.field_c, 0, var4, HoldTheLine.field_F);
            var4 += 20;
            break L1;
          } else {
            if (var6 != 1) {
              if (var6 == 2) {
                wb.a(20, sf.field_k, 0, 0, 560, -20 + var4, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                var4 += 185;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= 3) {
                    ei.a(200 - param2, param1 + 1, wn.field_k, 0, var4, HoldTheLine.field_F);
                    ei.a(-param2 + 440, 1, gn.field_h, 0, var4, HoldTheLine.field_F);
                    var4 += 30;
                    ei.a(200 - param2, 1, bf.field_a, 0, var4, HoldTheLine.field_F);
                    ei.a(440 - param2, 1, HoldTheLine.field_B, 0, var4, HoldTheLine.field_F);
                    var4 += 30;
                    break L1;
                  } else {
                    oi.field_a.b(-(20 * var6) + 168 - param2, -20 + var4 + 5);
                    oi.field_a.b(-(var6 * 20) + 408 + -param2, -20 + (var4 - -5));
                    oi.field_a.b(-param2 + (168 - var6 * 20), 10 + (var4 - -5));
                    oi.field_a.b(408 - (param2 + 20 * var6), var4 + 15);
                    ha.field_k.a(16, var5, 9, 16).a(-(var6 * 20) + (-param2 + 170), -20 + (var4 - -7));
                    pk.field_O.a(16, var5, param1 ^ 9, 16).a(-param2 + 410 + -(var6 * 20), 7 + var4 - 20);
                    na.field_q.a(16, var5, 9, 16).a(-(var6 * 20) + -param2 + 170, 10 + (var4 + 7));
                    cf.field_u.a(16, var5, param1 + 9, 16).a(-param2 + 410 - var6 * 20, 10 + (var4 - -7));
                    var6++;
                    continue L2;
                  }
                }
              } else {
                if (var6 == 3) {
                  wb.a(20, ik.field_k, 0, 0, 560, var4 - 20, -param2 + 40, -var4 + 414, -1, 1, HoldTheLine.field_F);
                  var4 += 25;
                  var6 = 1;
                  L3: while (true) {
                    if (4 <= var6) {
                      var4 += 20;
                      ei.a(125 - param2, 1, bj.field_J, 0, var4, HoldTheLine.field_F);
                      ei.a(-param2 + 415, 1, uk.field_f, 0, var4, HoldTheLine.field_F);
                      var4 += 20;
                      ei.a(-param2 + 125, 1, vg.field_K, 0, var4, HoldTheLine.field_F);
                      ei.a(-param2 + 415, param1 + 1, ga.field_h, 0, var4, HoldTheLine.field_F);
                      var4 += 20;
                      ei.a(-param2 + 125, 1, oa.field_o, 0, var4, HoldTheLine.field_F);
                      ei.a(-param2 + 415, 1, sg.field_K, 0, var4, HoldTheLine.field_F);
                      var4 += 40;
                      ei.a(320 - param2, 1, wl.field_e, 0, var4, HoldTheLine.field_F);
                      var4 += 20;
                      ei.a(-param2 + 320, 1, kb.field_d, 0, var4, HoldTheLine.field_F);
                      var4 += 20;
                      ei.a(320 + -param2, 1, gj.field_v, 0, var4, HoldTheLine.field_F);
                      var4 += 40;
                      wb.a(20, mk.field_o, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, param1 + -1, 1, HoldTheLine.field_F);
                      break L1;
                    } else {
                      var7 = 0;
                      L4: while (true) {
                        if (~var6 >= ~var7) {
                          var6++;
                          continue L3;
                        } else {
                          oi.field_a.b(-param2 + 93 + -(var7 * 20), var4 + (-20 - (-5 + -(20 * var6))));
                          oi.field_a.b(-param2 + (383 + -(var7 * 20)), -20 + var4 - (-5 - 20 * var6));
                          oi.field_a.b(288 + -param2 - var7 * 20, 20 * var6 + (60 + var4 + 5));
                          ha.field_k.a(16, var5, 9, 16).a(-(20 * var7) + (95 - param2), 20 * var6 + (var4 - 13));
                          pk.field_O.a(16, var5, 9, 16).a(-param2 + (385 + -(20 * var7)), 7 + (-20 + var4) + 20 * var6);
                          na.field_q.a(16, var5, param1 ^ 9, 16).a(290 - param2 - 20 * var7, var6 * 20 + var4 + 67);
                          var7++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  if (var6 != 4) {
                    if (var6 != 5) {
                      if (var6 == 6) {
                        wb.a(20, io.field_f, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, param1 + -1, 1, HoldTheLine.field_F);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      wb.a(20, ji.field_n, 0, 0, 560, var4 - 20, -param2 + 40, -var4 + 414, ~param1, 1, HoldTheLine.field_F);
                      var4 += 80;
                      q.a(hc.field_a, HoldTheLine.field_F, 2, 160 - param2, (byte) -127, var4);
                      q.a(o.field_a, HoldTheLine.field_F, 2, 480 + -param2, (byte) -128, var4);
                      var4 += 20;
                      q.a(gm.field_a, HoldTheLine.field_F, 2, -param2 + 160, (byte) -128, var4);
                      q.a(im.field_f, HoldTheLine.field_F, 2, 480 - param2, (byte) -128, var4);
                      q.a(m.field_b, HoldTheLine.field_F, 1, -param2 + 320, (byte) -127, var4);
                      var4 += 40;
                      am.a(-param2 + 200, qm.field_a, true, HoldTheLine.field_F, var4, 1);
                      var4 += 20;
                      am.a(-param2 + 200, ra.field_fb, true, HoldTheLine.field_F, var4, 1);
                      var4 += 20;
                      am.a(-param2 + 200, fk.field_a, true, HoldTheLine.field_F, var4, 1);
                      var4 += 20;
                      am.a(-param2 + 200, en.field_c, true, HoldTheLine.field_F, var4, 1);
                      var4 += 20;
                      am.a(200 + -param2, cc.field_A, true, HoldTheLine.field_F, var4, 1);
                      var4 -= 80;
                      ei.a(440 - param2, 1, dj.field_H, 1, var4, HoldTheLine.field_F);
                      var4 += 20;
                      ei.a(-param2 + 440, param1 ^ 1, p.field_f, 1, var4, HoldTheLine.field_F);
                      var4 += 20;
                      ei.a(-param2 + 440, 1, vd.field_e, 1, var4, HoldTheLine.field_F);
                      var4 += 20;
                      ei.a(-param2 + 440, 1, ka.field_a, 1, var4, HoldTheLine.field_F);
                      var4 += 20;
                      ei.a(-param2 + 440, param1 ^ 1, jh.field_b, 1, var4, HoldTheLine.field_F);
                      var4 -= 80;
                      q.a(b.field_a, HoldTheLine.field_F, 0, -param2 + 320, (byte) -128, var4);
                      var4 += 20;
                      q.a(pa.field_i, HoldTheLine.field_F, 0, 320 + -param2, (byte) -127, var4);
                      var4 += 20;
                      q.a(gi.field_H, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
                      var4 += 20;
                      q.a(cf.field_t, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
                      var4 += 20;
                      q.a(kc.field_c, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
                      var4 += 20;
                      break L1;
                    }
                  } else {
                    wb.a(20, aa.field_p, 0, 0, 560, -20 + var4, -param2 + 40, 414 + -var4, -1, 1, HoldTheLine.field_F);
                    var4 += 40;
                    wb.a(20, hl.field_e, 0, 0, 560, -20 + var4, -param2 + 40, 414 - var4, -1, 1, HoldTheLine.field_F);
                    var4 += 80;
                    wb.a(20, wb.field_b, 0, 0, 560, var4 + -20, 40 + -param2, -var4 + 414, -1, 1, HoldTheLine.field_F);
                    var4 += 60;
                    wb.a(20, ub.field_D, 0, 0, 560, -20 + var4, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                    var4 += 60;
                    break L1;
                  }
                }
              }
            } else {
              wb.a(20, vg.field_L, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, -1, 1, HoldTheLine.field_F);
              break L1;
            }
          }
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          var3 = em.field_i[((ti) this).field_o][param0];
          if (18 == var3) {
            if (aa.field_n != 102) {
              if (aa.field_n != 103) {
                super.b(param0, -24489);
                break L0;
              } else {
                if (256 <= ol.field_d) {
                  break L0;
                } else {
                  ol.field_d = 256;
                  ui discarded$1 = qf.a(293, cf.field_r);
                  break L0;
                }
              }
            } else {
              ol.field_d = 0;
              break L0;
            }
          } else {
            if (var3 == 19) {
              if (aa.field_n != 102) {
                if (aa.field_n != 103) {
                  super.b(param0, -24489);
                  break L0;
                } else {
                  ll.a(param1 + 24365, 160);
                  break L0;
                }
              } else {
                ll.a(-118, 0);
                break L0;
              }
            } else {
              super.b(param0, -24489);
              break L0;
            }
          }
        }
        L1: {
          if (param1 == -24489) {
            break L1;
          } else {
            ((ti) this).field_r = 66;
            break L1;
          }
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
            field_z = -119;
        }
        return ((ti) this).field_y == 4 ? true : false;
    }

    private final void e(byte param0) {
        ((ti) this).field_y = 1;
        ((ti) this).field_s = 50 + 5 * ((ti) this).field_a;
    }

    private final void l(int param0) {
        int var2 = 0;
        if (((ti) this).field_y > 2) {
            return;
        }
        cg.a(-var2 + 40, 140, 560, (byte) 41, 200);
        int var3 = 170;
        nm.field_c.b(nc.field_b, 320 - var2, var3, 2, -1);
        var3 += 40;
        wb.a(20, ko.field_a, 0, 0, 560, -20 + var3, 40 + -var2, -var3 + 414, -1, 1, HoldTheLine.field_F);
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = -((ti) this).field_s + 50;
          if (((ti) this).field_y == 2) {
            var2 = -(((ti) this).field_a * 5) + ((ti) this).field_r + 25;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var2 >= 0) {
            break L1;
          } else {
            var2 = 0;
            break L1;
          }
        }
        var3 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var2)) + 1.0));
        if (param0 == -5302) {
          L2: {
            if (((ti) this).field_y <= 2) {
              break L2;
            } else {
              var3 = 640;
              break L2;
            }
          }
          L3: {
            tn.field_a = this.a(rf.field_X, (byte) -128, nc.field_g, var3);
            if (tn.field_a == -1) {
              break L3;
            } else {
              ci.a(0, (byte) 118, ((ti) this).field_o, tn.field_a);
              break L3;
            }
          }
          L4: {
            ci.field_j = this.a(rf.field_X, param0 + 5465, nc.field_g, var3);
            if (gg.field_J == 1) {
              ui discarded$7 = qf.a(293, cf.field_r);
              if (tn.field_a == -1) {
                break L4;
              } else {
                if (tn.field_a != ha.field_p) {
                  L5: {
                    L6: {
                      if (pj.field_m != en.field_b) {
                        break L6;
                      } else {
                        if (ha.field_p == wa.field_j) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ((ti) this).field_t = ((ti) this).field_t - 640.0f;
                    wa.field_j = ha.field_p;
                    en.field_b = pj.field_m;
                    break L5;
                  }
                  ((ti) this).field_p = 640;
                  ha.field_p = tn.field_a;
                  break L4;
                } else {
                  break L4;
                }
              }
            } else {
              break L4;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void i(int param0) {
        ((ti) this).field_y = 2;
        int var2 = 44 / ((param0 - -25) / 61);
        sf.field_m = 0;
    }

    private final void m(int param0) {
        int var3 = 0;
        L0: {
          var3 = HoldTheLine.field_D;
          if (0.0f >= ((ti) this).field_t) {
            L1: {
              if (aa.field_n != 84) {
                break L1;
              } else {
                if (((ti) this).field_c == 1) {
                  this.a((byte) 117, 6, false);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (aa.field_n != 98) {
                break L2;
              } else {
                if (((ti) this).field_o == 10) {
                  ((ti) this).field_c = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (aa.field_n == 99) {
              ((ti) this).field_c = 1;
              break L0;
            } else {
              if (((ti) this).field_c == 0) {
                ((ti) this).a(true);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            if (aa.field_n == 84) {
              if (((ti) this).field_c == 0) {
                ((ti) this).c(((ti) this).field_c, -3565);
                break L0;
              } else {
                if (bl.field_r != null) {
                  L3: {
                    if (t.field_l == -1) {
                      break L3;
                    } else {
                      bl.field_r.field_C[0].a(20385, ge.field_c[t.field_l]);
                      break L3;
                    }
                  }
                  wm.a(false, false, -1);
                  ui discarded$1 = qf.a(293, cf.field_r);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              if (aa.field_n != 98) {
                if (99 != aa.field_n) {
                  L4: {
                    if (96 != aa.field_n) {
                      break L4;
                    } else {
                      if (((ti) this).field_c == 1) {
                        t.field_l = go.field_g[kn.b((byte) -49).field_p][0];
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (aa.field_n != 97) {
                      break L5;
                    } else {
                      if (((ti) this).field_c == 1) {
                        t.field_l = go.field_g[kn.b((byte) -49).field_p][1];
                        break L0;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (((ti) this).field_c == 0) {
                    ((ti) this).a(true);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  ((ti) this).field_c = 1;
                  break L0;
                }
              } else {
                ((ti) this).field_c = 0;
                break L0;
              }
            }
          }
        }
    }

    private final void b(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        var13 = HoldTheLine.field_D;
        var5 = -7 + param3 - -param2;
        if (param1 < -45) {
          var6 = 0;
          L0: while (true) {
            if (var6 >= 8) {
              var6 = 0;
              L1: while (true) {
                if (var6 >= 4) {
                  return;
                } else {
                  tc.b(-var6 + (param3 + param2) + -7, param0 + (var6 - -22), 1 + var6 * 2, 16711680);
                  var6++;
                  continue L1;
                }
              }
            } else {
              var7 = param2 - -(256 * var6 / 16);
              var8 = var7 + 8;
              var9 = var6 * 30 / 16;
              var10 = 22 + param0;
              var11 = var10 - var9;
              tc.b(var7 - -(var9 / 2), -1 + var11, 10, 0);
              var12 = 1;
              L2: while (true) {
                if (var12 > var9) {
                  tc.b(-1 + var7, var10, 10, 0);
                  if (var7 <= var5) {
                    if (var5 < var8) {
                      var12 = 1;
                      L3: while (true) {
                        if (var12 <= var9) {
                          if (var5 >= 2 + var7) {
                            L4: {
                              stackOut_29_0 = var5 + var12 / 2;
                              stackOut_29_1 = -var12 + var10;
                              stackOut_29_2 = var7 - (-8 - -var5);
                              stackIn_31_0 = stackOut_29_0;
                              stackIn_31_1 = stackOut_29_1;
                              stackIn_31_2 = stackOut_29_2;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              stackIn_30_2 = stackOut_29_2;
                              if (var12 == var9) {
                                stackOut_31_0 = stackIn_31_0;
                                stackOut_31_1 = stackIn_31_1;
                                stackOut_31_2 = stackIn_31_2;
                                stackOut_31_3 = 4210752;
                                stackIn_32_0 = stackOut_31_0;
                                stackIn_32_1 = stackOut_31_1;
                                stackIn_32_2 = stackOut_31_2;
                                stackIn_32_3 = stackOut_31_3;
                                break L4;
                              } else {
                                stackOut_30_0 = stackIn_30_0;
                                stackOut_30_1 = stackIn_30_1;
                                stackOut_30_2 = stackIn_30_2;
                                stackOut_30_3 = 8421504;
                                stackIn_32_0 = stackOut_30_0;
                                stackIn_32_1 = stackOut_30_1;
                                stackIn_32_2 = stackOut_30_2;
                                stackIn_32_3 = stackOut_30_3;
                                break L4;
                              }
                            }
                            tc.b(stackIn_32_0, stackIn_32_1, stackIn_32_2, stackIn_32_3);
                            var12++;
                            continue L3;
                          } else {
                            L5: {
                              tc.b(var5 - -(var12 / 2), var10 - var12, var7 + (2 - var5), 4210752);
                              stackOut_25_0 = var12 / 2 + (var7 + 2);
                              stackOut_25_1 = var10 + -var12;
                              stackOut_25_2 = 6;
                              stackIn_27_0 = stackOut_25_0;
                              stackIn_27_1 = stackOut_25_1;
                              stackIn_27_2 = stackOut_25_2;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              stackIn_26_2 = stackOut_25_2;
                              if (var9 != var12) {
                                stackOut_27_0 = stackIn_27_0;
                                stackOut_27_1 = stackIn_27_1;
                                stackOut_27_2 = stackIn_27_2;
                                stackOut_27_3 = 8421504;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                stackIn_28_2 = stackOut_27_2;
                                stackIn_28_3 = stackOut_27_3;
                                break L5;
                              } else {
                                stackOut_26_0 = stackIn_26_0;
                                stackOut_26_1 = stackIn_26_1;
                                stackOut_26_2 = stackIn_26_2;
                                stackOut_26_3 = 4210752;
                                stackIn_28_0 = stackOut_26_0;
                                stackIn_28_1 = stackOut_26_1;
                                stackIn_28_2 = stackOut_26_2;
                                stackIn_28_3 = stackOut_26_3;
                                break L5;
                              }
                            }
                            tc.b(stackIn_28_0, stackIn_28_1, stackIn_28_2, stackIn_28_3);
                            var12++;
                            continue L3;
                          }
                        } else {
                          var6++;
                          continue L0;
                        }
                      }
                    } else {
                      var6++;
                      continue L0;
                    }
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  L6: {
                    tc.b(var7 + (var12 / 2 + -1), -var12 + var10, 1, 0);
                    stackOut_6_0 = var12 / 2 + var7;
                    stackOut_6_1 = var10 - var12;
                    stackOut_6_2 = 2;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    if (var7 > var5) {
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = stackIn_8_2;
                      stackOut_8_3 = 4210752;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      stackIn_9_3 = stackOut_8_3;
                      break L6;
                    } else {
                      stackOut_7_0 = stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = stackIn_7_2;
                      stackOut_7_3 = 8421504;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_9_2 = stackOut_7_2;
                      stackIn_9_3 = stackOut_7_3;
                      break L6;
                    }
                  }
                  L7: {
                    tc.b(stackIn_9_0, stackIn_9_1, stackIn_9_2, stackIn_9_3);
                    stackOut_9_0 = 2 + (var7 + var12 / 2);
                    stackOut_9_1 = var10 - var12;
                    stackOut_9_2 = 6;
                    stackIn_13_0 = stackOut_9_0;
                    stackIn_13_1 = stackOut_9_1;
                    stackIn_13_2 = stackOut_9_2;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    if (var9 == var12) {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = stackIn_13_2;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      if (var5 < var7) {
                        stackOut_15_0 = stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = stackIn_15_2;
                        stackOut_15_3 = 4210752;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        stackIn_16_3 = stackOut_15_3;
                        break L7;
                      } else {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = stackIn_14_2;
                        stackOut_14_3 = 8421504;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        stackIn_16_3 = stackOut_14_3;
                        break L7;
                      }
                    } else {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = stackIn_10_2;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      if (var5 >= var7) {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = stackIn_12_2;
                        stackOut_12_3 = 16777215;
                        stackIn_16_0 = stackOut_12_0;
                        stackIn_16_1 = stackOut_12_1;
                        stackIn_16_2 = stackOut_12_2;
                        stackIn_16_3 = stackOut_12_3;
                        break L7;
                      } else {
                        stackOut_11_0 = stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = stackIn_11_2;
                        stackOut_11_3 = 8421504;
                        stackIn_16_0 = stackOut_11_0;
                        stackIn_16_1 = stackOut_11_1;
                        stackIn_16_2 = stackOut_11_2;
                        stackIn_16_3 = stackOut_11_3;
                        break L7;
                      }
                    }
                  }
                  tc.b(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3);
                  tc.b(8 + (var12 / 2 + var7), -var12 + var10, 1, 0);
                  var12++;
                  continue L2;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        hj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var12 = HoldTheLine.field_D;
        cg.a(60, 101, 520, (byte) 41, 320);
        qe.field_a = 0;
        var2 = 160;
        var3 = 125;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= 16) {
            L1: {
              if (-1 != ok.field_e) {
                stackOut_9_0 = ok.field_e;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = v.field_E;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_10_0;
              if (-1 != var5) {
                this.a(false, var5, 128, 291, 12, 320);
                am.a(200, pf.field_b, true, HoldTheLine.field_F, 252, 0);
                ei.a(440, 1, vj.field_o, 0, 252, HoldTheLine.field_F);
                q.a(Integer.toString(le.field_o[var5][0]), HoldTheLine.field_F, 0, 140, (byte) -128, 282);
                var6 = pf.a((byte) -123);
                var7 = le.field_o[var5][1];
                var8 = sf.field_m / 15 % (var7 + 2);
                var9 = sf.field_m / 5 % 3;
                var10 = 0;
                L3: while (true) {
                  if (var10 >= var7) {
                    nm.field_c.b(ae.field_c[var5], 320, 217, 0, -1);
                    wb.a(20, lf.field_j[var5], 0, 0, 400, 362, 120, 80, -1, 1, HoldTheLine.field_F);
                    break L2;
                  } else {
                    L4: {
                      var11 = 0;
                      if (var8 == var10) {
                        var11 = var9;
                        break L4;
                      } else {
                        if (var10 == var8 + -1) {
                          var11 = -var9 + 3;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var6.d(-var11 + 460 + 16 * var10, -var11 + 262, 32 + 2 * var11, 32 - -(var11 * 2));
                    var10++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            fl.a(p.field_b, 0, 0, -1753, 448);
            return;
          } else {
            var6_int = e.field_d[var5];
            if (0 != (1 << var6_int & ii.field_c)) {
              this.a(true, var6_int, vl.field_h[var6_int], var3, 12, var2);
              var2 += 40;
              var4++;
              if (9 == var4) {
                var3 += 40;
                var2 = 180;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final static void k(int param0) {
        if (param0 >= -77) {
            int[] discarded$0 = ti.a(56, 62, (byte) 72);
        }
        ce.field_n.field_c = 0;
        ce.field_n.field_f = 0;
    }

    private final void i(int param0, int param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        if (((ti) this).field_y > 2) {
            return;
        }
        if (((ti) this).field_y != 1) {
            this.a(ih.field_p, 0, param0);
        } else {
            for (var3 = 0; var3 < 7; var3++) {
                this.a(var3, 0, (int)((ti) this).field_t + param0 - 640 * var3);
            }
        }
    }

    private final void f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        hj var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = HoldTheLine.field_D;
        if (((ti) this).field_y <= 2) {
          L0: {
            if (param0 > 4) {
              break L0;
            } else {
              this.f((byte) -103);
              break L0;
            }
          }
          cg.a(60 - param1, 101, 520, (byte) 41, 320);
          qe.field_a = 0;
          var3 = 156;
          var4 = 125;
          var5 = 0;
          var6 = 0;
          L1: while (true) {
            if (16 <= var6) {
              L2: {
                if (ok.field_e != -1) {
                  stackOut_14_0 = ok.field_e;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                } else {
                  stackOut_13_0 = v.field_E;
                  stackIn_15_0 = stackOut_13_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_15_0;
                if (var6 == -1) {
                  if (pj.b((byte) 104)) {
                    q.a(nk.field_M, HoldTheLine.field_F, 0, 320 + -param1, (byte) -127, 270);
                    q.a(ue.field_b, HoldTheLine.field_F, 0, 320 - param1, (byte) -128, 290);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  this.a(false, var6, 128, 276, 12, -param1 + 320);
                  am.a(200 - param1, pf.field_b, true, HoldTheLine.field_F, 252, 0);
                  ei.a(-param1 + 440, 1, vj.field_o, 0, 252, HoldTheLine.field_F);
                  q.a(Integer.toString(le.field_o[var6][0]), HoldTheLine.field_F, 0, -param1 + 160, (byte) -127, 282);
                  var7 = pf.a((byte) -123);
                  var8 = le.field_o[var6][1];
                  var9 = sf.field_m / 15 % (2 + var8);
                  var10 = sf.field_m / 5 % 3;
                  var11 = 0;
                  L4: while (true) {
                    if (var11 >= var8) {
                      L5: {
                        if (0 == (field_z & 1 << var6)) {
                          if (sf.field_m % 80 < 40) {
                            q.a(fc.field_b, HoldTheLine.field_F, 2, 320 - param1, (byte) -127, 352);
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          q.a(ln.field_j, HoldTheLine.field_F, 1, 320 + -param1, (byte) -127, 357);
                          break L5;
                        }
                      }
                      nm.field_c.b(ae.field_c[var6], 320 - param1, 207, 0, -1);
                      wb.a(20, lf.field_j[var6], 0, 0, 400, 357, 120 - param1, 80, -1, 1, HoldTheLine.field_F);
                      break L3;
                    } else {
                      L6: {
                        var12 = 0;
                        if (var11 == var9) {
                          var12 = var10;
                          break L6;
                        } else {
                          if (~var11 == ~(var9 + -1)) {
                            var12 = 3 + -var10;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7.d(-var12 + (460 + (-param1 + 16 * var11)), 262 + -var12, 32 - -(2 * var12), 32 + 2 * var12);
                      var11++;
                      continue L4;
                    }
                  }
                }
              }
              fl.a(p.field_b, param1, 0, -1753, 448);
              return;
            } else {
              L7: {
                if (this.h(var6, 176)) {
                  var7_int = e.field_d[var6];
                  this.a(true, var7_int, vl.field_h[var7_int], var4, 12, -param1 + var3);
                  var3 += 46;
                  var5++;
                  if (var5 != 8) {
                    break L7;
                  } else {
                    var4 += 40;
                    var3 = 179;
                    if (!this.h(15, 176)) {
                      break L7;
                    } else {
                      var3 -= 23;
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              var6++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param0 == 0) {
            break L0;
          } else {
            int discarded$6 = this.b(123, -77, -90);
            break L0;
          }
        }
        L1: {
          if (!hn.field_T) {
            L2: {
              hj[] discarded$7 = kc.field_a.a(180);
              hj discarded$8 = rm.field_A.a(param0 + 8192);
              hj discarded$9 = jf.field_a.a(8192);
              hj discarded$10 = bo.field_d.a(8192);
              if (!kc.field_a.a((byte) 127)) {
                break L2;
              } else {
                if (!rm.field_A.b((byte) 10)) {
                  break L2;
                } else {
                  if (!jf.field_a.b((byte) 10)) {
                    break L2;
                  } else {
                    if (bo.field_d.b((byte) 10)) {
                      gd.a(di.field_w, rm.field_A.field_b, 0);
                      wj.a(0, 19189, 80, 20, 50, 0, -1500, jf.field_a.field_b, 80);
                      te.a(param0 + -4, kc.field_a.field_i);
                      nm.a(bo.field_d.field_b, 22210);
                      oh.a(true, true);
                      hn.field_T = true;
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            break L1;
          } else {
            L3: {
              stackOut_3_0 = -86;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param1) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L3;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L3;
              }
            }
            var3 = pd.a((byte) stackIn_6_0, stackIn_6_1 != 0);
            if (3 == var3) {
              ch.a(en.a(99), (byte) 65);
              break L1;
            } else {
              if (var3 == 1) {
                this.a((byte) 117, 0, false);
                break L1;
              } else {
                if (var3 != 2) {
                  break L1;
                } else {
                  this.a((byte) 117, 0, true);
                  break L1;
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hj var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        hj stackIn_18_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        hj stackOut_17_0 = null;
        hj stackOut_16_0 = null;
        L0: {
          var11 = HoldTheLine.field_D;
          if (0 == (1 << param1 & field_z)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if ((1 << param1 & 65284) == 0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (param2 != 32) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (var7 == 0) {
            L4: {
              if (var8 != 0) {
                break L4;
              } else {
                if (!of.a(param4 + -981)) {
                  L5: {
                    if (var9 == 0) {
                      stackOut_17_0 = kj.field_q;
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = ka.field_f;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    }
                  }
                  var10 = stackIn_18_0;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            var10 = ak.a(param4 ^ -108, var9 != 0, -1);
            break L3;
          } else {
            var10 = ak.a(param4 + -48, var9 != 0, param1);
            break L3;
          }
        }
        L6: {
          if (var9 != 0) {
            var10.a(-16 + param5, -16 + param3);
            break L6;
          } else {
            if (param2 == 128) {
              var10.a(-64 + param5, param3 + -64);
              break L6;
            } else {
              var10.d(-(param2 >> 1) + param5, -(param2 >> 1) + param3, param2, param2);
              break L6;
            }
          }
        }
        L7: {
          if (param4 != param1) {
            break L7;
          } else {
            if (var7 == 0) {
              break L7;
            } else {
              pe.a(param2, 4209, param5, param3);
              break L7;
            }
          }
        }
        L8: {
          if (!param0) {
            break L8;
          } else {
            dm.field_e[qe.field_a] = param5;
            co.field_d[qe.field_a] = param3;
            kn.field_b[qe.field_a] = param2;
            nk.field_J[qe.field_a] = param1;
            qe.field_a = qe.field_a + 1;
            break L8;
          }
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        if (param0 != 117) {
            return;
        }
        ui discarded$0 = qf.a(293, cf.field_r);
        this.a(param1, param2, param0 ^ -95);
    }

    final void f(int param0) {
        ((ti) this).field_y = 2;
        ie.field_n = -ie.field_n + 80;
        ((ti) this).field_r = -((ti) this).field_s + (((ti) this).field_a * 5 + 25);
        if (param0 != 0) {
            ((ti) this).field_w = 0;
        }
    }

    private final void f(byte param0) {
        L0: {
          v.field_E = this.b(-21, nc.field_g, rf.field_X);
          if (gg.field_J == 1) {
            ui discarded$11 = qf.a(293, cf.field_r);
            if (ok.field_e == v.field_E) {
              ok.field_e = -1;
              break L0;
            } else {
              if (v.field_E == -1) {
                break L0;
              } else {
                ok.field_e = v.field_E;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 > 82) {
            break L1;
          } else {
            ((ti) this).a(49, false);
            break L1;
          }
        }
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String[][] stackIn_24_0 = null;
        String[][] stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        String[][] stackIn_25_0 = null;
        String[][] stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        String[][] stackIn_26_0 = null;
        String[][] stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        String[][] stackIn_27_0 = null;
        String[][] stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        String[][] stackIn_28_0 = null;
        String[][] stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        String[][] stackIn_29_0 = null;
        String[][] stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        String[][] stackIn_30_0 = null;
        String[][] stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        String[] stackIn_30_3 = null;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        String[][] stackOut_23_0 = null;
        String[][] stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        String[][] stackOut_25_0 = null;
        String[][] stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        String[][] stackOut_29_0 = null;
        String[][] stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        String[] stackOut_29_3 = null;
        String[][] stackOut_26_0 = null;
        String[][] stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        String[][] stackOut_28_0 = null;
        String[][] stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        Object stackOut_28_3 = null;
        String[][] stackOut_27_0 = null;
        String[][] stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        String[] stackOut_27_3 = null;
        String[][] stackOut_24_0 = null;
        String[][] stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        String[] stackOut_24_3 = null;
        var5 = HoldTheLine.field_D;
        ((ti) this).field_y = 0;
        ((ti) this).field_w = 0;
        ((ti) this).field_r = 0;
        ((ti) this).field_s = 0;
        var3 = 0;
        L0: while (true) {
          if (~var3 <= ~((ti) this).field_q.length) {
            L1: {
              L2: {
                bd.field_S = -20;
                sf.field_m = 0;
                if (((ti) this).field_o == 4) {
                  break L2;
                } else {
                  if (((ti) this).field_o != 5) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ih.field_p = 0;
              break L1;
            }
            L3: {
              L4: {
                if (((ti) this).field_o == 2) {
                  break L4;
                } else {
                  if (((ti) this).field_o != 3) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var3 = 0;
              L5: while (true) {
                if (var3 >= 4) {
                  break L3;
                } else {
                  mg.field_g[var3] = null;
                  var3++;
                  continue L5;
                }
              }
            }
            L6: {
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (param0) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L6;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L6;
              }
            }
            L7: {
              L8: {
                ((ti) this).field_g = stackIn_16_1 != 0;
                v.field_E = -1;
                ((ti) this).field_t = 0.0f;
                ca.field_s = 0;
                qd.field_h = 2;
                ((ti) this).field_p = 0;
                ci.field_j = -1;
                stackOut_16_0 = this;
                stackIn_19_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (10 == ((ti) this).field_o) {
                  break L8;
                } else {
                  stackOut_17_0 = this;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (((ti) this).field_o == 11) {
                    break L8;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = 0;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L7;
                  }
                }
              }
              stackOut_19_0 = this;
              stackOut_19_1 = 1;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              break L7;
            }
            L9: {
              ((ti) this).field_c = stackIn_20_1;
              qe.field_a = 0;
              ok.field_e = -1;
              g.field_o = 0;
              ((ti) this).field_v = -1;
              if (((ti) this).field_o != 0) {
                break L9;
              } else {
                if (cf.field_v == -1) {
                  break L9;
                } else {
                  ((ti) this).field_c = cf.field_v;
                  break L9;
                }
              }
            }
            L10: {
              ((ti) this).a((byte) 117);
              var3 = cf.field_w;
              stackOut_23_0 = new String[1][];
              stackOut_23_1 = new String[1][];
              stackOut_23_2 = 0;
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              if (10 != ((ti) this).field_o) {
                stackOut_25_0 = (String[][]) (Object) stackIn_25_0;
                stackOut_25_1 = (String[][]) (Object) stackIn_25_1;
                stackOut_25_2 = stackIn_25_2;
                stackIn_29_0 = stackOut_25_0;
                stackIn_29_1 = stackOut_25_1;
                stackIn_29_2 = stackOut_25_2;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                stackIn_26_2 = stackOut_25_2;
                if (2 == ((ti) this).field_o) {
                  stackOut_29_0 = (String[][]) (Object) stackIn_29_0;
                  stackOut_29_1 = (String[][]) (Object) stackIn_29_1;
                  stackOut_29_2 = stackIn_29_2;
                  stackOut_29_3 = ga.field_k;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  stackIn_30_3 = stackOut_29_3;
                  break L10;
                } else {
                  stackOut_26_0 = (String[][]) (Object) stackIn_26_0;
                  stackOut_26_1 = (String[][]) (Object) stackIn_26_1;
                  stackOut_26_2 = stackIn_26_2;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  if (((ti) this).field_o != 3) {
                    stackOut_28_0 = (String[][]) (Object) stackIn_28_0;
                    stackOut_28_1 = (String[][]) (Object) stackIn_28_1;
                    stackOut_28_2 = stackIn_28_2;
                    stackOut_28_3 = null;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_30_2 = stackOut_28_2;
                    stackIn_30_3 = (String[]) (Object) stackOut_28_3;
                    break L10;
                  } else {
                    stackOut_27_0 = (String[][]) (Object) stackIn_27_0;
                    stackOut_27_1 = (String[][]) (Object) stackIn_27_1;
                    stackOut_27_2 = stackIn_27_2;
                    stackOut_27_3 = ga.field_k;
                    stackIn_30_0 = stackOut_27_0;
                    stackIn_30_1 = stackOut_27_1;
                    stackIn_30_2 = stackOut_27_2;
                    stackIn_30_3 = stackOut_27_3;
                    break L10;
                  }
                }
              } else {
                stackOut_24_0 = (String[][]) (Object) stackIn_24_0;
                stackOut_24_1 = (String[][]) (Object) stackIn_24_1;
                stackOut_24_2 = stackIn_24_2;
                stackOut_24_3 = v.field_A[var3];
                stackIn_30_0 = stackOut_24_0;
                stackIn_30_1 = stackOut_24_1;
                stackIn_30_2 = stackOut_24_2;
                stackIn_30_3 = stackOut_24_3;
                break L10;
              }
            }
            L11: {
              stackIn_30_1[stackIn_30_2] = stackIn_30_3;
              om.a(stackIn_30_0, 79, ((ti) this).field_o);
              if (param1 < -81) {
                break L11;
              } else {
                ((ti) this).field_q = null;
                break L11;
              }
            }
            var4 = 0;
            L12: while (true) {
              if (var4 >= 16) {
                L13: {
                  if (hn.field_T) {
                    oh.a(param0, true);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              } else {
                vl.field_h[var4] = 32;
                var4++;
                continue L12;
              }
            }
          } else {
            ((ti) this).field_q[var3] = 0;
            var3++;
            continue L0;
          }
        }
    }

    private final void b(byte param0) {
        ((ti) this).field_y = 4;
        ((ti) this).field_w = 40;
    }

    final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          L1: {
            var4 = HoldTheLine.field_D;
            var3 = em.field_i[((ti) this).field_o][param1];
            if (var3 != 5) {
              if (10 == var3) {
                break L1;
              } else {
                if (var3 != 24) {
                  if (25 != var3) {
                    if (var3 != 18) {
                      if (var3 == 19) {
                        if (mk.field_e >= 140) {
                          ll.a(-125, 160);
                          break L0;
                        } else {
                          ll.a(-108, 20 * (8 * mk.field_e / 160) - -20);
                          break L0;
                        }
                      } else {
                        if (var3 == 21) {
                          L2: {
                            ui discarded$6 = qf.a(293, cf.field_r);
                            if (em.field_o) {
                              stackOut_34_0 = 0;
                              stackIn_35_0 = stackOut_34_0;
                              break L2;
                            } else {
                              stackOut_33_0 = 1;
                              stackIn_35_0 = stackOut_33_0;
                              break L2;
                            }
                          }
                          em.field_o = stackIn_35_0 != 0;
                          ((ti) this).field_q[param1] = 50;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      if (ol.field_d < 224) {
                        ol.field_d = 32 * (1 + ol.field_d * 8 / 256);
                        ui discarded$7 = qf.a(293, cf.field_r);
                        break L0;
                      } else {
                        if (ol.field_d >= 256) {
                          break L0;
                        } else {
                          ol.field_d = 256;
                          ui discarded$8 = qf.a(293, cf.field_r);
                          break L0;
                        }
                      }
                    }
                  } else {
                    L3: {
                      int fieldTemp$9 = qd.field_h + 1;
                      qd.field_h = qd.field_h + 1;
                      stackOut_16_0 = ~fieldTemp$9;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (ih.field_p != -1 + od.field_i.length) {
                        stackOut_18_0 = stackIn_18_0;
                        stackOut_18_1 = 2;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        break L3;
                      } else {
                        stackOut_17_0 = stackIn_17_0;
                        stackOut_17_1 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        break L3;
                      }
                    }
                    if (stackIn_19_0 < ~stackIn_19_1) {
                      L4: {
                        if (ih.field_p == 0) {
                          stackOut_23_0 = 1;
                          stackIn_24_0 = stackOut_23_0;
                          break L4;
                        } else {
                          stackOut_22_0 = 0;
                          stackIn_24_0 = stackOut_22_0;
                          break L4;
                        }
                      }
                      qd.field_h = stackIn_24_0;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                } else {
                  int fieldTemp$10 = ca.field_s + 1;
                  ca.field_s = ca.field_s + 1;
                  if (fieldTemp$10 <= 3) {
                    break L0;
                  } else {
                    ca.field_s = 0;
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          int fieldTemp$11 = g.field_o + 1;
          g.field_o = g.field_o + 1;
          if (fieldTemp$11 <= 1) {
            break L0;
          } else {
            g.field_o = 0;
            break L0;
          }
        }
        L5: {
          if (param0 > 97) {
            break L5;
          } else {
            ((ti) this).field_v = -111;
            break L5;
          }
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_74_0 = 0;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        boolean stackIn_123_0 = false;
        int stackIn_123_1 = 0;
        boolean stackIn_124_0 = false;
        int stackIn_124_1 = 0;
        boolean stackIn_125_0 = false;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        boolean stackOut_122_0 = false;
        int stackOut_122_1 = 0;
        boolean stackOut_124_0 = false;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        boolean stackOut_123_0 = false;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        Object stackOut_77_0 = null;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_57_0 = null;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        L0: {
          var7 = HoldTheLine.field_D;
          var4 = -78 % ((param2 - 36) / 41);
          var6 = param0;
          if (var6 == 2) {
            wm.a(param1, false, -1);
            break L0;
          } else {
            if (var6 != 13) {
              if (var6 != 14) {
                if (var6 == 15) {
                  wm.a(param1, false, 4);
                  ((ti) this).field_v = param0;
                  break L0;
                } else {
                  if (var6 != 16) {
                    if (var6 != 17) {
                      if (var6 != 0) {
                        if (var6 == 3) {
                          wm.a(param1, false, lm.field_a);
                          break L0;
                        } else {
                          if (var6 != 7) {
                            if (var6 != 8) {
                              if (var6 != 4) {
                                if (5 != var6) {
                                  if (var6 == 9) {
                                    L1: {
                                      if (((ti) this).field_o == 2) {
                                        break L1;
                                      } else {
                                        if (((ti) this).field_o != 6) {
                                          if (((ti) this).field_o != 9) {
                                            ch.a(en.a(98), (byte) 47);
                                            break L0;
                                          } else {
                                            L2: {
                                              if (mi.field_d != 7) {
                                                L3: {
                                                  if (0 != ii.field_c) {
                                                    stackOut_73_0 = 8;
                                                    stackIn_74_0 = stackOut_73_0;
                                                    break L3;
                                                  } else {
                                                    stackOut_72_0 = 12;
                                                    stackIn_74_0 = stackOut_72_0;
                                                    break L3;
                                                  }
                                                }
                                                var6 = stackIn_74_0;
                                                break L2;
                                              } else {
                                                L4: {
                                                  if (ii.field_c == 0) {
                                                    stackOut_69_0 = 3;
                                                    stackIn_70_0 = stackOut_69_0;
                                                    break L4;
                                                  } else {
                                                    stackOut_68_0 = 7;
                                                    stackIn_70_0 = stackOut_68_0;
                                                    break L4;
                                                  }
                                                }
                                                var6 = stackIn_70_0;
                                                break L2;
                                              }
                                            }
                                            qf.a(var6, true, 3865, param1);
                                            break L0;
                                          }
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                    i.a((byte) 71, true);
                                    break L0;
                                  } else {
                                    if (var6 != 10) {
                                      if (var6 != 11) {
                                        if (var6 == 24) {
                                          if (-1 != ca.field_s) {
                                            if (ca.field_s != 0) {
                                              var5 = -1 + ca.field_s;
                                              if (~var5 == ~pj.field_m) {
                                                break L0;
                                              } else {
                                                L5: {
                                                  L6: {
                                                    if (~en.field_b != ~pj.field_m) {
                                                      break L6;
                                                    } else {
                                                      if (~ha.field_p == ~wa.field_j) {
                                                        break L5;
                                                      } else {
                                                        break L6;
                                                      }
                                                    }
                                                  }
                                                  ((ti) this).field_t = ((ti) this).field_t - 640.0f;
                                                  en.field_b = pj.field_m;
                                                  wa.field_j = ha.field_p;
                                                  break L5;
                                                }
                                                pj.field_m = var5;
                                                ((ti) this).field_p = 640;
                                                break L0;
                                              }
                                            } else {
                                              this.a(0, param1, -125);
                                              break L0;
                                            }
                                          } else {
                                            break L0;
                                          }
                                        } else {
                                          if (var6 == 25) {
                                            if (qd.field_h == 0) {
                                              if (0 < ih.field_p) {
                                                L7: {
                                                  int fieldTemp$2 = ih.field_p - 1;
                                                  ih.field_p = ih.field_p - 1;
                                                  if (0 != fieldTemp$2) {
                                                    break L7;
                                                  } else {
                                                    qd.field_h = 2;
                                                    break L7;
                                                  }
                                                }
                                                ((ti) this).field_p = ih.field_p * 640;
                                                break L0;
                                              } else {
                                                break L0;
                                              }
                                            } else {
                                              if (2 != qd.field_h) {
                                                if (qd.field_h == 1) {
                                                  wm.a(param1, false, lm.field_a);
                                                  break L0;
                                                } else {
                                                  break L0;
                                                }
                                              } else {
                                                if (ih.field_p < 6) {
                                                  L8: {
                                                    int fieldTemp$3 = ih.field_p + 1;
                                                    ih.field_p = ih.field_p + 1;
                                                    if (fieldTemp$3 != 6) {
                                                      break L8;
                                                    } else {
                                                      qd.field_h = 1;
                                                      break L8;
                                                    }
                                                  }
                                                  ((ti) this).field_p = 640 * ih.field_p;
                                                  break L0;
                                                } else {
                                                  break L0;
                                                }
                                              }
                                            }
                                          } else {
                                            if (var6 == 12) {
                                              if (nd.field_e) {
                                                hf.c(0);
                                                break L0;
                                              } else {
                                                wm.a(param1, false, 13);
                                                ((ti) this).field_v = param0;
                                                break L0;
                                              }
                                            } else {
                                              if (var6 == 6) {
                                                L9: {
                                                  if (ek.field_x == 2) {
                                                    break L9;
                                                  } else {
                                                    if (ek.field_x == 6) {
                                                      break L9;
                                                    } else {
                                                      L10: {
                                                        if (ek.field_x == 4) {
                                                          break L10;
                                                        } else {
                                                          if (ek.field_x == 5) {
                                                            break L10;
                                                          } else {
                                                            ij.a(param1, -81);
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                      if (!pj.b((byte) 108)) {
                                                        if (ii.field_c != 0) {
                                                          wm.a(param1, false, 8);
                                                          break L0;
                                                        } else {
                                                          L11: {
                                                            stackOut_122_0 = param1;
                                                            stackOut_122_1 = 0;
                                                            stackIn_124_0 = stackOut_122_0;
                                                            stackIn_124_1 = stackOut_122_1;
                                                            stackIn_123_0 = stackOut_122_0;
                                                            stackIn_123_1 = stackOut_122_1;
                                                            if (of.a(-969)) {
                                                              stackOut_124_0 = stackIn_124_0;
                                                              stackOut_124_1 = stackIn_124_1;
                                                              stackOut_124_2 = 0;
                                                              stackIn_125_0 = stackOut_124_0;
                                                              stackIn_125_1 = stackOut_124_1;
                                                              stackIn_125_2 = stackOut_124_2;
                                                              break L11;
                                                            } else {
                                                              stackOut_123_0 = stackIn_123_0;
                                                              stackOut_123_1 = stackIn_123_1;
                                                              stackOut_123_2 = 12;
                                                              stackIn_125_0 = stackOut_123_0;
                                                              stackIn_125_1 = stackOut_123_1;
                                                              stackIn_125_2 = stackOut_123_2;
                                                              break L11;
                                                            }
                                                          }
                                                          wm.a(stackIn_125_0, stackIn_125_1 != 0, stackIn_125_2);
                                                          break L0;
                                                        }
                                                      } else {
                                                        L12: {
                                                          if (0 != ii.field_c) {
                                                            break L12;
                                                          } else {
                                                            if (!ad.field_a) {
                                                              wm.a(param1, false, 12);
                                                              break L0;
                                                            } else {
                                                              break L12;
                                                            }
                                                          }
                                                        }
                                                        wm.a(param1, false, 9);
                                                        break L0;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (!pj.b((byte) 102)) {
                                                  if (ii.field_c != 0) {
                                                    wm.a(param1, false, 7);
                                                    break L0;
                                                  } else {
                                                    wm.a(param1, false, 3);
                                                    break L0;
                                                  }
                                                } else {
                                                  wm.a(param1, false, 9);
                                                  break L0;
                                                }
                                              } else {
                                                if (var6 == 26) {
                                                  hf.c(0);
                                                  break L0;
                                                } else {
                                                  if (var6 != 1) {
                                                    break L0;
                                                  } else {
                                                    te.a(true);
                                                    break L0;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        eb.field_o = null;
                                        field_z = 0;
                                        ii.field_c = 0;
                                        wm.a(param1, false, 12);
                                        break L0;
                                      }
                                    } else {
                                      L13: {
                                        stackOut_77_0 = this;
                                        stackIn_79_0 = stackOut_77_0;
                                        stackIn_78_0 = stackOut_77_0;
                                        if (g.field_o == 0) {
                                          stackOut_79_0 = this;
                                          stackOut_79_1 = 9;
                                          stackIn_80_0 = stackOut_79_0;
                                          stackIn_80_1 = stackOut_79_1;
                                          break L13;
                                        } else {
                                          stackOut_78_0 = this;
                                          stackOut_78_1 = 0;
                                          stackIn_80_0 = stackOut_78_0;
                                          stackIn_80_1 = stackOut_78_1;
                                          break L13;
                                        }
                                      }
                                      this.a(stackIn_80_1, param1, -35);
                                      break L0;
                                    }
                                  }
                                } else {
                                  L14: {
                                    stackOut_57_0 = this;
                                    stackIn_59_0 = stackOut_57_0;
                                    stackIn_58_0 = stackOut_57_0;
                                    if (g.field_o != 0) {
                                      stackOut_59_0 = this;
                                      stackOut_59_1 = 0;
                                      stackIn_60_0 = stackOut_59_0;
                                      stackIn_60_1 = stackOut_59_1;
                                      break L14;
                                    } else {
                                      stackOut_58_0 = this;
                                      stackOut_58_1 = 4;
                                      stackIn_60_0 = stackOut_58_0;
                                      stackIn_60_1 = stackOut_58_1;
                                      break L14;
                                    }
                                  }
                                  this.a(stackIn_60_1, param1, -24);
                                  break L0;
                                }
                              } else {
                                wm.a(param1, false, 3);
                                break L0;
                              }
                            } else {
                              L15: {
                                if (((ti) this).field_o != 10) {
                                  break L15;
                                } else {
                                  if (0.0f >= ((ti) this).field_t) {
                                    break L15;
                                  } else {
                                    if (3 != ek.field_x) {
                                      break L15;
                                    } else {
                                      wm.a(param1, false, 13);
                                      break L0;
                                    }
                                  }
                                }
                              }
                              this.a(7, param1, -12);
                              break L0;
                            }
                          } else {
                            bl.field_r.field_mb = -1;
                            qn.a(7, param1, true);
                            break L0;
                          }
                        }
                      } else {
                        L16: {
                          if (of.a(-969)) {
                            break L16;
                          } else {
                            L17: {
                              if (((ti) this).field_o == 9) {
                                break L17;
                              } else {
                                if (7 == ((ti) this).field_o) {
                                  break L17;
                                } else {
                                  if (8 == ((ti) this).field_o) {
                                    break L17;
                                  } else {
                                    if (((ti) this).field_o == 3) {
                                      break L17;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                            wm.a(param1, false, 12);
                            break L0;
                          }
                        }
                        wm.a(param1, false, 0);
                        break L0;
                      }
                    } else {
                      if (null != kf.field_U) {
                        em.a(-29486, false);
                        break L0;
                      } else {
                        oe.b((byte) 108);
                        break L0;
                      }
                    }
                  } else {
                    wm.a(param1, false, 5);
                    ((ti) this).field_v = param0;
                    break L0;
                  }
                }
              } else {
                wm.a(param1, false, 6);
                ((ti) this).field_v = param0;
                break L0;
              }
            } else {
              wm.a(param1, false, 2);
              ((ti) this).field_v = param0;
              break L0;
            }
          }
        }
    }

    final static void c(boolean param0) {
        if (null != mc.field_a) {
          return;
        } else {
          mc.field_a = new om[73];
          mc.field_a[1] = new om(5, 543, cf.field_u, i.field_j, -1);
          mc.field_a[2] = new om(5, 540, ha.field_k, i.field_j, -1);
          mc.field_a[3] = new om(5, 541, pk.field_O, i.field_j, -1);
          mc.field_a[4] = new om(5, 542, na.field_q, i.field_j, -1);
          mc.field_a[5] = new om(12, 6, 352, 0);
          mc.field_a[6] = new om(12, 6, 352, 0);
          mc.field_a[7] = new om(12, 6, 352, 0);
          mc.field_a[8] = new om(12, 6, 352, 0);
          mc.field_a[9] = new om(4, 1180, wn.field_f, fh.field_d, -1);
          mc.field_a[10] = null;
          mc.field_a[11] = new om(4, 8300, wb.field_d, ao.field_d, -1);
          mc.field_a[12] = new om(10, 0, qb.field_b, 2);
          mc.field_a[13] = new om(15, 0, t.field_i, 2);
          mc.field_a[14] = new om(20, 0, cd.field_d, 2);
          mc.field_a[15] = new om(25, 0, ci.field_k, 2);
          mc.field_a[16] = new om(40, 0, ud.field_o, 2);
          mc.field_a[17] = new om(25, 50, 524320, ub.field_A, 0);
          mc.field_a[18] = new om(25, 50, 524320, aj.field_c, 0);
          mc.field_a[19] = new om(25, 50, 524320, jf.field_c, 0);
          mc.field_a[20] = new om(15, 30, 32, ie.field_k, 0);
          mc.field_a[21] = new om(15, 30, 32, sj.field_I, 0);
          mc.field_a[22] = new om(15, 30, 32, ch.field_u, 0);
          mc.field_a[23] = new om(10, 10, 16384, bl.field_s, 0);
          mc.field_a[24] = new om(5, 0, vh.field_i, 0);
          mc.field_a[25] = new om(5, 0, ae.field_b, 0);
          mc.field_a[26] = new om(5, 0, ma.field_l, 0);
          mc.field_a[27] = new om(80, 40, 1081376, h.field_b, 0);
          mc.field_a[28] = new om(80, 4, 32, pd.field_h, 1);
          mc.field_a[29] = new om(10, 0, aj.field_a, -1);
          mc.field_a[30] = new om(15, 25, 16416, gh.field_a, 0);
          mc.field_a[31] = new om(15, 25, 16416, ag.field_r, 0);
          mc.field_a[32] = new om(10, 0, 16384, w.field_a, 2);
          mc.field_a[33] = new om(15, 0, 16384, n.field_r, 2);
          mc.field_a[34] = new om(20, 0, 16384, tf.field_o, 2);
          mc.field_a[35] = new om(15, 0, 16384, aa.field_q, 2);
          mc.field_a[36] = new om(20, 0, 16384, kc.field_d, 2);
          mc.field_a[37] = new om(25, 0, 16384, nd.field_c, 2);
          mc.field_a[38] = new om(50, 50, 16416, ig.field_t, ko.field_c, 0);
          mc.field_a[39] = new om(5, 0, n.field_j, 0);
          mc.field_a[40] = new om(5, 0, mo.field_r, 0);
          mc.field_a[41] = new om(10, 10, 65568, gi.field_J, 0);
          mc.field_a[42] = new om(10, 10, 65568, gk.field_b, 0);
          mc.field_a[43] = new om(10, 10, 16384, om.field_i, 0);
          mc.field_a[44] = new om(15, 15, 16384, en.field_e, 0);
          mc.field_a[45] = new om(20, 20, 16384, q.field_d, 0);
          mc.field_a[46] = new om(10, 16384, co.field_b, 2);
          mc.field_a[47] = new om(15, 16384, tf.field_A, 2);
          mc.field_a[48] = new om(20, 16384, uk.field_b, 2);
          mc.field_a[49] = new om(25, 16384, ac.field_c, 2);
          mc.field_a[50] = new om(40, 16384, ri.field_a, 2);
          mc.field_a[51] = new om(15, 32, ci.field_l, 0);
          mc.field_a[52] = new om(10, 32, fj.field_s, 0);
          mc.field_a[53] = new om(5, 25, 32, gn.field_f, 3);
          mc.field_a[54] = new om(3, 40, ai.field_b, 3);
          mc.field_a[55] = new om(80, 40, 32, um.field_e, 0);
          mc.field_a[56] = new om(8, 4, 1146912, we.field_p, 0);
          mc.field_a[57] = new om(15, 7, 32, lc.field_c, 0);
          mc.field_a[58] = new om(10, 16384, jo.field_a, 2);
          mc.field_a[59] = new om(15, 16384, hm.field_b, 2);
          mc.field_a[60] = new om(20, 16384, in.field_b, 2);
          mc.field_a[61] = new om(25, 16384, ie.field_i, 2);
          mc.field_a[62] = new om(12, 6, 352, 0);
          mc.field_a[63] = new om(12, 6, 352, 0);
          mc.field_a[64] = new om(12, 6, 352, 0);
          mc.field_a[65] = new om(12, 6, 352, 0);
          mc.field_a[66] = new om(12, 6, 352, 0);
          mc.field_a[67] = new om(12, 6, 352, 0);
          mc.field_a[68] = new om(12, 6, 352, 0);
          mc.field_a[69] = new om(12, 6, 352, 0);
          mc.field_a[70] = new om(10, 10, 360488, pg.field_K, fk.field_c, -1);
          mc.field_a[71] = new om(10, 10, 360489, jk.field_p, fk.field_c, -1);
          mc.field_a[72] = new om(12, 360490, la.field_g, -1);
          return;
        }
    }

    public static void g(int param0) {
        field_u = null;
        if (param0 != -21006) {
            ti.k(-12);
        }
        field_x = null;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param0) {
            break L0;
          } else {
            this.j(35);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= 4) {
            L2: {
              bn.a(ha.field_p + 4, -107);
              if (!pj.b((byte) 118)) {
                if (1 != ((ti) this).field_y) {
                  this.a(en.field_b, param1, ha.field_p, (byte) 83);
                  break L2;
                } else {
                  this.a(en.field_b, -(int)((ti) this).field_t + param1, wa.field_j, (byte) 116);
                  this.a(pj.field_m, -(int)((ti) this).field_t + (param1 - -640), ha.field_p, (byte) -108);
                  break L2;
                }
              } else {
                cg.a(30 - param1, 170, 580, (byte) 41, 260);
                var3 = 280;
                q.a(nk.field_M, nm.field_c, 0, -param1 + 320, (byte) -128, var3 + -nm.field_c.field_G);
                q.a(ue.field_b, nm.field_c, 0, -param1 + 320, (byte) -127, var3);
                break L2;
              }
            }
            ni.field_a.b(e.field_b, 320 + param1, 474, 0, -1);
            return;
          } else {
            L3: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var3 == tn.field_a) {
                stackOut_6_0 = this;
                stackOut_6_1 = 4210752;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = wd.field_l[var3];
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              stackOut_7_0 = this;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 2;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (tn.field_a == var3) {
                stackOut_9_0 = this;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = 16777215;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                break L4;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = vk.field_q[var3];
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                break L4;
              }
            }
            this.a(stackIn_10_1, stackIn_10_2, stackIn_10_3, 2, var3 * 128 + 128 + -param1, 110, 80, p.a(0, (byte) -83, var3), 60);
            var3++;
            continue L1;
          }
        }
    }

    private final void c(int param0, boolean param1) {
        bn.a(7, -119);
        b.field_c.a(false);
        if (!(!hn.field_T)) {
            en.a((byte) 49);
        }
    }

    private final boolean h(int param0, int param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param1 == 176) {
            break L0;
          } else {
            ((ti) this).field_t = 0.4921543300151825f;
            break L0;
          }
        }
        L1: {
          if ((1 << param0 & field_z) == 0) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var3 = stackIn_5_0;
            if (var3 != 0) {
              break L3;
            } else {
              if (15 != param0) {
                break L3;
              } else {
                if (!kb.a(16616, 0)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L2;
        }
        return stackIn_11_0 != 0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, hj param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var15 = HoldTheLine.field_D;
        try {
          L0: {
            var10_int = param4 - param6 / 2;
            var11 = param5 + -(param8 / param1);
            var12 = var10_int + param6;
            var13 = var11 - -param8;
            var14 = 0;
            L1: while (true) {
              if (var14 >= param3) {
                L2: {
                  L3: {
                    if (param6 != param7.field_s) {
                      break L3;
                    } else {
                      if (param8 == param7.field_y) {
                        param7.b(var10_int, var11);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param7.a(var10_int, var11, param6, param8);
                  break L2;
                }
                break L0;
              } else {
                tc.b(var10_int + (-1 + -var14), -var14 + (var11 + -1), var14 * 2 + (2 + param6), param2);
                tc.b(-var14 + -1 + var10_int, var13 - -var14, param6 - -2 + var14 * 2, param0);
                tc.h(var10_int - (1 - -var14), var11 + -var14, 2 * var14 + param8, param2);
                tc.h(var12 - -var14, var11 - var14, 2 * var14 + param8, param0);
                var14++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("ti.HA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param7 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param8 + 41);
        }
    }

    final void e(int param0) {
        ((ti) this).field_a = em.field_i[((ti) this).field_o].length;
        int var2 = 76 % ((param0 - 25) / 35);
        ((ti) this).field_q = new int[((ti) this).field_a];
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        float var3_float = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var5 = HoldTheLine.field_D;
          if (gg.field_J != 1) {
            break L0;
          } else {
            L1: {
              if (0 == ((ti) this).field_y) {
                gg.field_J = 0;
                this.e((byte) -116);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ti) this).field_y == 2) {
                break L2;
              } else {
                if (((ti) this).field_y == 3) {
                  break L2;
                } else {
                  break L0;
                }
              }
            }
            gg.field_J = 0;
            this.b((byte) -100);
            break L0;
          }
        }
        L3: {
          if (((ti) this).field_o == 12) {
            break L3;
          } else {
            if (((ti) this).field_y <= 1) {
              L4: while (true) {
                if (!qh.c(-47)) {
                  if (!na.field_k) {
                    break L3;
                  } else {
                    L5: {
                      L6: {
                        ((ti) this).b(12515);
                        if (((ti) this).field_o == 2) {
                          break L6;
                        } else {
                          if (((ti) this).field_o != 3) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.j(-5302);
                      break L5;
                    }
                    L7: {
                      L8: {
                        if (10 == ((ti) this).field_o) {
                          break L8;
                        } else {
                          if (((ti) this).field_o == 11) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                      this.d((byte) -88);
                      break L7;
                    }
                    L9: {
                      if (((ti) this).field_o == 6) {
                        break L9;
                      } else {
                        if (((ti) this).field_o == 7) {
                          break L9;
                        } else {
                          if (((ti) this).field_o == 8) {
                            break L9;
                          } else {
                            if (((ti) this).field_o == 9) {
                              break L9;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    this.f((byte) 98);
                    break L3;
                  }
                } else {
                  L10: {
                    if (aa.field_n != 13) {
                      break L10;
                    } else {
                      if (0 != ((ti) this).field_o) {
                        if (em.field_i[((ti) this).field_o].length <= 0) {
                          break L10;
                        } else {
                          L11: {
                            if (2 == em.field_i[((ti) this).field_o][0]) {
                              break L11;
                            } else {
                              if (0 == em.field_i[((ti) this).field_o][0]) {
                                break L11;
                              } else {
                                if (em.field_i[((ti) this).field_o][0] == 4) {
                                  break L11;
                                } else {
                                  if (em.field_i[((ti) this).field_o][0] == 3) {
                                    break L11;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                          ((ti) this).c(0, -3565);
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (mg.field_c) {
                      L13: {
                        if (aa.field_n == 28) {
                          hn.field_T = false;
                          wm.a(false, false, 12);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      if (aa.field_n == 1) {
                        L14: {
                          if (kb.field_c) {
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            break L14;
                          } else {
                            stackOut_30_0 = 1;
                            stackIn_32_0 = stackOut_30_0;
                            break L14;
                          }
                        }
                        kb.field_c = stackIn_32_0 != 0;
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L15: {
                    if (!mg.field_c) {
                      break L15;
                    } else {
                      if (aa.field_n != 1) {
                        break L15;
                      } else {
                        if (!mg.field_c) {
                          break L15;
                        } else {
                          if (lk.field_g[82]) {
                            ao.field_b = 3;
                            l.field_b = true;
                            hk.field_d = -1 + pc.field_l[3];
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                  }
                  L16: {
                    if (2 == ((ti) this).field_o) {
                      break L16;
                    } else {
                      if (3 == ((ti) this).field_o) {
                        break L16;
                      } else {
                        L17: {
                          if (((ti) this).field_o == 10) {
                            break L17;
                          } else {
                            if (11 != ((ti) this).field_o) {
                              L18: {
                                if (((ti) this).field_o == 4) {
                                  break L18;
                                } else {
                                  if (((ti) this).field_o == 5) {
                                    break L18;
                                  } else {
                                    ((ti) this).a(true);
                                    continue L4;
                                  }
                                }
                              }
                              ((ti) this).a(true);
                              if (-1 == ((ti) this).field_c) {
                                continue L4;
                              } else {
                                if (em.field_i[((ti) this).field_o][((ti) this).field_c] != 25) {
                                  continue L4;
                                } else {
                                  L19: {
                                    L20: {
                                      if (2 > qd.field_h) {
                                        break L20;
                                      } else {
                                        if (ih.field_p == -1 + od.field_i.length) {
                                          break L19;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    if (qd.field_h > 0) {
                                      continue L4;
                                    } else {
                                      if (0 == ih.field_p) {
                                        break L19;
                                      } else {
                                        continue L4;
                                      }
                                    }
                                  }
                                  qd.field_h = 1;
                                  continue L4;
                                }
                              }
                            } else {
                              break L17;
                            }
                          }
                        }
                        this.m(-1);
                        continue L4;
                      }
                    }
                  }
                  this.o(-1);
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
        }
        var3 = 0;
        L21: while (true) {
          if (~((ti) this).field_q.length >= ~var3) {
            L22: {
              if (((ti) this).field_y != 0) {
                if (2 == ((ti) this).field_y) {
                  ((ti) this).field_r = ((ti) this).field_r + 1;
                  var3 = ((ti) this).field_r + 25 + -(5 * (1 + ((ti) this).field_a));
                  var4 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var3)) + 1.0));
                  if (var4 < -260) {
                    ((ti) this).field_y = 3;
                    break L22;
                  } else {
                    break L22;
                  }
                } else {
                  if (((ti) this).field_y == 3) {
                    ((ti) this).field_w = ((ti) this).field_w + 1;
                    if (40 > ((ti) this).field_w) {
                      break L22;
                    } else {
                      ((ti) this).field_y = 4;
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
              } else {
                L23: {
                  if (((ti) this).field_s != 0) {
                    break L23;
                  } else {
                    ui discarded$2 = bd.a(17405, 64, 0, j.field_c.field_f);
                    ui discarded$3 = bd.a(17405, 64, 256, j.field_c.field_h);
                    break L23;
                  }
                }
                ((ti) this).field_s = ((ti) this).field_s + 1;
                if (~(((ti) this).field_a * 5 + 25) == ~((ti) this).field_s) {
                  ((ti) this).field_y = 1;
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            L24: {
              sf.field_m = sf.field_m + 1;
              if ((float)((ti) this).field_p != ((ti) this).field_t) {
                var3_float = (float)((ti) this).field_p - ((ti) this).field_t;
                ((ti) this).field_t = ((ti) this).field_t + var3_float * 0.20000000298023224f;
                if (1.0f <= var3_float) {
                  break L24;
                } else {
                  L25: {
                    if (((ti) this).field_o == 2) {
                      break L25;
                    } else {
                      if (((ti) this).field_o == 3) {
                        break L25;
                      } else {
                        break L24;
                      }
                    }
                  }
                  ((ti) this).field_p = 0;
                  ((ti) this).field_t = 0.0f;
                  en.field_b = pj.field_m;
                  wa.field_j = ha.field_p;
                  break L24;
                }
              } else {
                break L24;
              }
            }
            L26: {
              L27: {
                var3 = -125 % ((-30 - param0) / 62);
                if (((ti) this).field_o == 6) {
                  break L27;
                } else {
                  if (7 == ((ti) this).field_o) {
                    break L27;
                  } else {
                    if (((ti) this).field_o == 8) {
                      break L27;
                    } else {
                      break L26;
                    }
                  }
                }
              }
              this.d(1);
              break L26;
            }
            L28: {
              if (((ti) this).field_o != 12) {
                break L28;
              } else {
                this.b(0, param1);
                break L28;
              }
            }
            return;
          } else {
            L29: {
              if (((ti) this).field_q[var3] > 0) {
                ((ti) this).field_q[var3] = ((ti) this).field_q[var3] - 1;
                break L29;
              } else {
                break L29;
              }
            }
            var3++;
            continue L21;
          }
        }
    }

    final int a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HoldTheLine.field_D;
          if (!param0) {
            break L0;
          } else {
            this.a(true, -31, -22, -74, -57, -16);
            break L0;
          }
        }
        var4 = -1;
        var5 = 0;
        L1: while (true) {
          if (((ti) this).field_a <= var5) {
            if (var4 != -1) {
              if (em.field_i[((ti) this).field_o][var4] != 5) {
                if (em.field_i[((ti) this).field_o][var4] != 10) {
                  if (em.field_i[((ti) this).field_o][var4] == 24) {
                    ca.field_s = fj.a(qb.field_a, (byte) -119, param2);
                    return var4;
                  } else {
                    if (em.field_i[((ti) this).field_o][var4] == 25) {
                      qd.field_h = fj.a(mo.field_v, (byte) -119, param2);
                      return var4;
                    } else {
                      L2: {
                        if (param2 < ((ti) this).field_m) {
                          break L2;
                        } else {
                          if (((ti) this).field_f <= param2) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                      return -1;
                    }
                  }
                } else {
                  g.field_o = fj.a(qd.field_l, (byte) -119, param2);
                  return var4;
                }
              } else {
                g.field_o = fj.a(va.field_c, (byte) -119, param2);
                return var4;
              }
            } else {
              return -1;
            }
          } else {
            var6 = param1 + -this.e(var5, 6);
            if (var6 >= 0) {
              if (var6 <= 30) {
                var4 = var5;
                var5++;
                continue L1;
              } else {
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final int e(int param0, int param1) {
        int var4 = -87 % ((param1 - -65) / 43);
        int var3 = 10 != ((ti) this).field_o ? 0 : (int)((ti) this).field_t;
        if (!(((ti) this).field_o != 1)) {
            return param0 == 0 ? 43 : 35 * (param0 - 1) + 165 + -var3;
        }
        if (!(em.field_i[((ti) this).field_o][param0] != 26)) {
            return 445;
        }
        return -var3 + ((((ti) this).field_o != 0 ? 43 : 165) + 35 * param0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = HoldTheLine.field_D;
          var7 = 50 - ((ti) this).field_s - -(5 * param1);
          if (0 <= var7) {
            break L0;
          } else {
            var7 = 0;
            break L0;
          }
        }
        L1: {
          var7 = var7 + ((ti) this).field_q[param1];
          if (((ti) this).field_y != 4) {
            if (3 == ((ti) this).field_y) {
              param0 = (int)((double)param0 * ((-1.0 + Math.exp((double)((float)(-((ti) this).field_w + 40) * 0.20000000298023224f))) / (-1.0 + Math.exp(8.0))));
              break L1;
            } else {
              break L1;
            }
          } else {
            param0 = 0;
            break L1;
          }
        }
        L2: {
          var8 = 123 % ((-51 - param3) / 46);
          if (((ti) this).field_y != 2) {
            break L2;
          } else {
            if (param1 != ((ti) this).field_v) {
              var7 = -(5 * (-param1 + ((ti) this).field_a)) + (25 + ((ti) this).field_r);
              if (var7 >= 0) {
                break L2;
              } else {
                var7 = 0;
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L3: {
          var9 = (int)((double)we.field_n * (-Math.exp((double)((float)var7 * 0.20000000298023224f)) + 1.0));
          var10 = em.field_i[((ti) this).field_o][param1];
          var11 = var10;
          if (var11 != 18) {
            if (var11 != 19) {
              super.a(param0, param1, param2, 81, param4, param5);
              break L3;
            } else {
              param4 = param4 - (-7 + (172 + var9));
              if (param4 > 0) {
                if (param4 < 128) {
                  ll.a(-128, param4 * 160 / 128);
                  break L3;
                } else {
                  ll.a(93, 160);
                  break L3;
                }
              } else {
                ll.a(-111, 0);
                break L3;
              }
            }
          } else {
            L4: {
              param4 = param4 - (var9 - -165);
              if (0 >= param4) {
                ol.field_d = 0;
                break L4;
              } else {
                if (128 > param4) {
                  ol.field_d = 256 * param4 / 128;
                  break L4;
                } else {
                  ol.field_d = 256;
                  break L4;
                }
              }
            }
            if (-bd.field_S + sf.field_m <= 20) {
              break L3;
            } else {
              ui discarded$1 = qf.a(293, cf.field_r);
              bd.field_S = sf.field_m;
              break L3;
            }
          }
        }
    }

    final void c(int param0, int param1) {
        if (param1 != -3565) {
            ((ti) this).field_q = null;
        }
        if (0 == ((ti) this).field_o) {
            cf.field_v = param0;
        }
        ui discarded$8 = qf.a(293, cf.field_r);
        this.a(em.field_i[((ti) this).field_o][param0], !((ti) this).field_g ? true : false, 103);
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var4 = HoldTheLine.field_D;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 16) {
            return;
          } else {
            L1: {
              if (ok.field_e == var2) {
                stackOut_6_0 = 48;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                if (v.field_E != var2) {
                  stackOut_5_0 = 32;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 40;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
            }
            var3 = stackIn_7_0;
            if (vl.field_h[var2] > var3) {
              vl.field_h[var2] = vl.field_h[var2] - 1;
              var2++;
              continue L0;
            } else {
              if (vl.field_h[var2] < var3) {
                vl.field_h[var2] = vl.field_h[var2] + 1;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int var8 = 0;
        String var9 = null;
        hj var10_ref_hj = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        String var16 = null;
        int var17 = 0;
        String var18 = null;
        int var19 = 0;
        int var20 = 0;
        vk var21 = null;
        String[] var22 = null;
        long[] var26 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        hj stackIn_19_2 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        hj stackIn_20_2 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        hj stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        hj stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        hj stackIn_23_2 = null;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        hj stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        int stackIn_58_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        hj stackOut_18_2 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        hj stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        hj stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        hj stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        hj stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        hj stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        L0: {
          var20 = HoldTheLine.field_D;
          var6 = 6 / ((23 - param3) / 55);
          var7_int = param2;
          if (var7_int == 0) {
            var5 = 32;
            break L0;
          } else {
            if (var7_int != 1) {
              if (var7_int != 2) {
                if (var7_int == 3) {
                  var5 = 35;
                  break L0;
                } else {
                  throw new RuntimeException();
                }
              } else {
                var5 = 33;
                break L0;
              }
            } else {
              var5 = 34;
              break L0;
            }
          }
        }
        L1: {
          cg.a(30 + -param1, 170, 580, (byte) 41, 260);
          if (null != mg.field_g[param2]) {
            break L1;
          } else {
            if (-1 == var5) {
              break L1;
            } else {
              mg.field_g[param2] = il.a(5, 3, var5, 10, (byte) -66);
              break L1;
            }
          }
        }
        var7 = mg.field_g[param2].field_m;
        var8 = 0;
        L2: while (true) {
          if (var8 >= 4) {
            L3: {
              q.a(gl.field_a, HoldTheLine.field_F, 0, 280 + -param1, (byte) -127, 204);
              var8 = 0;
              if (var7 != null) {
                var22 = var7[param0];
                var26 = mg.field_g[param2].field_k[param0];
                var11 = mg.field_g[param2].field_p[param0];
                var12 = -1;
                var13 = -1;
                var14 = 0;
                var15 = 0;
                L4: while (true) {
                  if (var15 >= 10) {
                    var15 = 220 + nm.field_c.field_G + -6;
                    var16_int = 0;
                    L5: while (true) {
                      if (10 <= var16_int) {
                        if (-1 != var12) {
                          break L3;
                        } else {
                          if (eb.field_o == null) {
                            break L3;
                          } else {
                            if (var5 != eb.field_o.field_j) {
                              break L3;
                            } else {
                              var16 = ng.field_e;
                              var9 = var16;
                              var9 = var16;
                              ei.a(-param1 + 54, 1, var16, 5, var15, HoldTheLine.field_F);
                              ei.a(240 - param1, 1, cb.a(48, -eb.field_o.field_r[0]), 5, var15, HoldTheLine.field_F);
                              var17 = 0;
                              L6: while (true) {
                                if (var17 >= 4) {
                                  break L3;
                                } else {
                                  q.a(io.a(eb.field_o.field_r[1 - -var17], (byte) -61), HoldTheLine.field_F, 5, cj.field_K[var17] + (32 - param1), (byte) -127, var15);
                                  var17++;
                                  continue L6;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L7: {
                          if (var22[var16_int] == null) {
                            break L7;
                          } else {
                            L8: {
                              if (~var12 != ~var16_int) {
                                if (~var13 != ~var16_int) {
                                  stackOut_57_0 = 0;
                                  stackIn_58_0 = stackOut_57_0;
                                  break L8;
                                } else {
                                  stackOut_56_0 = 3;
                                  stackIn_58_0 = stackOut_56_0;
                                  break L8;
                                }
                              } else {
                                stackOut_54_0 = 5;
                                stackIn_58_0 = stackOut_54_0;
                                break L8;
                              }
                            }
                            L9: {
                              var17 = stackIn_58_0;
                              var18 = var22[var16_int];
                              am.a(-param1 + 54, 1 + var16_int + ". ", true, HoldTheLine.field_F, var15, var17);
                              ei.a(54 + -param1, 1, var18, var17, var15, HoldTheLine.field_F);
                              if (var12 != var16_int) {
                                if (var13 != var16_int) {
                                  stackOut_62_0 = 1;
                                  stackIn_63_0 = stackOut_62_0;
                                  break L9;
                                } else {
                                  stackOut_61_0 = 2;
                                  stackIn_63_0 = stackOut_61_0;
                                  break L9;
                                }
                              } else {
                                stackOut_59_0 = 5;
                                stackIn_63_0 = stackOut_59_0;
                                break L9;
                              }
                            }
                            L10: {
                              var17 = stackIn_63_0;
                              ei.a(-param1 + 235, 1, cb.a(42, -var11[5 * var16_int]), var17, var15, HoldTheLine.field_F);
                              if (~var16_int != ~var13) {
                                if (var12 != var16_int) {
                                  stackOut_67_0 = 0;
                                  stackIn_68_0 = stackOut_67_0;
                                  break L10;
                                } else {
                                  stackOut_66_0 = 5;
                                  stackIn_68_0 = stackOut_66_0;
                                  break L10;
                                }
                              } else {
                                stackOut_64_0 = 3;
                                stackIn_68_0 = stackOut_64_0;
                                break L10;
                              }
                            }
                            var17 = stackIn_68_0;
                            var19 = 0;
                            L11: while (true) {
                              if (var19 >= 4) {
                                var8 = 1;
                                break L7;
                              } else {
                                q.a(io.a(var11[5 * var16_int - (-1 + -var19)], (byte) -61), HoldTheLine.field_F, var17, 32 + cj.field_K[var19] + -param1, (byte) -127, var15);
                                var19++;
                                continue L11;
                              }
                            }
                          }
                        }
                        var16_int++;
                        var15 += 20;
                        continue L5;
                      }
                    }
                  } else {
                    L12: {
                      if (var22[var15] != null) {
                        L13: {
                          if (eb.field_o == null) {
                            break L13;
                          } else {
                            if (!ra.a(var22[var15], false)) {
                              break L13;
                            } else {
                              if (eb.field_o.field_m == var26[var15]) {
                                var16_int = 1;
                                var17 = 0;
                                L14: while (true) {
                                  L15: {
                                    if (var17 >= 4) {
                                      break L15;
                                    } else {
                                      if (~eb.field_o.field_r[var17] == ~var11[5 * var15 + var17]) {
                                        var17++;
                                        continue L14;
                                      } else {
                                        var16_int = 0;
                                        break L15;
                                      }
                                    }
                                  }
                                  if (var16_int == 0) {
                                    break L13;
                                  } else {
                                    var12 = var15;
                                    break L13;
                                  }
                                }
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        if (ci.field_j != -1) {
                          L16: {
                            if (var13 == -1) {
                              break L16;
                            } else {
                              if (var14 > var11[var15 * 5 + 1 - -ci.field_j]) {
                                break L16;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var13 = var15;
                          var14 = var11[1 + 5 * var15 - -ci.field_j];
                          break L12;
                        } else {
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    var15++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            L17: {
              if (var8 != 0) {
                break L17;
              } else {
                if (40 > sf.field_m % 80) {
                  L18: {
                    if (var7 == null) {
                      var9 = fm.field_b;
                      break L18;
                    } else {
                      if (!mg.field_g[param2].field_j) {
                        var9 = ri.field_d;
                        break L18;
                      } else {
                        var9 = an.field_d;
                        break L18;
                      }
                    }
                  }
                  var10 = 90 + (220 + nm.field_c.field_G);
                  nm.field_c.b(var9, 337 - param1, var10, 0, -1);
                  break L17;
                } else {
                  break L17;
                }
              }
            }
            return;
          } else {
            L19: {
              var21 = tk.field_c[param2][var8];
              boolean discarded$1 = var21.b(3);
              var10_ref_hj = var21.a(9392, 0, 60);
              if (var10_ref_hj == null) {
                break L19;
              } else {
                L20: {
                  stackOut_18_0 = this;
                  stackOut_18_1 = -141;
                  stackOut_18_2 = (hj) var10_ref_hj;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  if (~var8 != ~ci.field_j) {
                    stackOut_20_0 = this;
                    stackOut_20_1 = stackIn_20_1;
                    stackOut_20_2 = (hj) (Object) stackIn_20_2;
                    stackOut_20_3 = vk.field_q[param2];
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    stackIn_21_3 = stackOut_20_3;
                    break L20;
                  } else {
                    stackOut_19_0 = this;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = (hj) (Object) stackIn_19_2;
                    stackOut_19_3 = 16777215;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    stackIn_21_3 = stackOut_19_3;
                    break L20;
                  }
                }
                L21: {
                  stackOut_21_0 = this;
                  stackOut_21_1 = stackIn_21_1;
                  stackOut_21_2 = (hj) (Object) stackIn_21_2;
                  stackOut_21_3 = stackIn_21_3;
                  stackOut_21_4 = -param1 + (32 + cj.field_K[var8]);
                  stackOut_21_5 = 190;
                  stackOut_21_6 = 2;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  stackIn_23_4 = stackOut_21_4;
                  stackIn_23_5 = stackOut_21_5;
                  stackIn_23_6 = stackOut_21_6;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  stackIn_22_3 = stackOut_21_3;
                  stackIn_22_4 = stackOut_21_4;
                  stackIn_22_5 = stackOut_21_5;
                  stackIn_22_6 = stackOut_21_6;
                  if (ci.field_j != var8) {
                    stackOut_23_0 = this;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = (hj) (Object) stackIn_23_2;
                    stackOut_23_3 = stackIn_23_3;
                    stackOut_23_4 = stackIn_23_4;
                    stackOut_23_5 = stackIn_23_5;
                    stackOut_23_6 = stackIn_23_6;
                    stackOut_23_7 = wd.field_l[param2];
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    stackIn_24_4 = stackOut_23_4;
                    stackIn_24_5 = stackOut_23_5;
                    stackIn_24_6 = stackOut_23_6;
                    stackIn_24_7 = stackOut_23_7;
                    break L21;
                  } else {
                    stackOut_22_0 = this;
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = (hj) (Object) stackIn_22_2;
                    stackOut_22_3 = stackIn_22_3;
                    stackOut_22_4 = stackIn_22_4;
                    stackOut_22_5 = stackIn_22_5;
                    stackOut_22_6 = stackIn_22_6;
                    stackOut_22_7 = 0;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    stackIn_24_5 = stackOut_22_5;
                    stackIn_24_6 = stackOut_22_6;
                    stackIn_24_7 = stackOut_22_7;
                    break L21;
                  }
                }
                this.a(stackIn_24_1, stackIn_24_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7);
                break L19;
              }
            }
            var8++;
            continue L2;
          }
        }
    }

    private final void o(int param0) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          if (99 == aa.field_n) {
            break L0;
          } else {
            if (aa.field_n == 98) {
              break L0;
            } else {
              if (((ti) this).field_c == 0) {
                ((ti) this).b(((ti) this).field_c, -24489);
                return;
              } else {
                L1: {
                  if (((ti) this).field_c != 1) {
                    break L1;
                  } else {
                    L2: {
                      if (aa.field_n == 84) {
                        ui discarded$5 = qf.a(293, cf.field_r);
                        if (tn.field_a != -1) {
                          if (aa.field_n != 96) {
                            break L2;
                          } else {
                            int fieldTemp$6 = tn.field_a - 1;
                            tn.field_a = tn.field_a - 1;
                            if (fieldTemp$6 >= 0) {
                              break L2;
                            } else {
                              tn.field_a = 3;
                              break L2;
                            }
                          }
                        } else {
                          if (aa.field_n != 96) {
                            break L2;
                          } else {
                            int fieldTemp$7 = tn.field_a - 1;
                            tn.field_a = tn.field_a - 1;
                            if (fieldTemp$7 >= 0) {
                              break L2;
                            } else {
                              tn.field_a = 3;
                              break L2;
                            }
                          }
                        }
                      } else {
                        if (aa.field_n != 96) {
                          break L2;
                        } else {
                          int fieldTemp$8 = tn.field_a - 1;
                          tn.field_a = tn.field_a - 1;
                          if (fieldTemp$8 >= 0) {
                            break L2;
                          } else {
                            tn.field_a = 3;
                            break L2;
                          }
                        }
                      }
                    }
                    if (97 != aa.field_n) {
                      break L1;
                    } else {
                      int fieldTemp$9 = tn.field_a + 1;
                      tn.field_a = tn.field_a + 1;
                      if (fieldTemp$9 >= 4) {
                        tn.field_a = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
        L3: {
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 != ((ti) this).field_c) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L3;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L3;
          }
        }
        ((ti) this).field_c = stackIn_6_1;
        if (((ti) this).field_c != 1) {
          return;
        } else {
          L4: {
            if (tn.field_a == -1) {
              tn.field_a = 0;
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_24_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param0 == 1) {
            break L0;
          } else {
            ((ti) this).i(-61);
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = em.field_i[((ti) this).field_o][param1];
            if (var3 != 5) {
              if (var3 != 10) {
                L3: {
                  if (var3 != 24) {
                    if (var3 == 25) {
                      L4: {
                        int fieldTemp$5 = qd.field_h - 1;
                        qd.field_h = qd.field_h - 1;
                        stackOut_17_0 = ~fieldTemp$5;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (ih.field_p != 0) {
                          stackOut_19_0 = stackIn_19_0;
                          stackOut_19_1 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L4;
                        } else {
                          stackOut_18_0 = stackIn_18_0;
                          stackOut_18_1 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L4;
                        }
                      }
                      if (stackIn_20_0 <= ~stackIn_20_1) {
                        break L3;
                      } else {
                        L5: {
                          if (-1 + od.field_i.length != ih.field_p) {
                            stackOut_23_0 = 2;
                            stackIn_24_0 = stackOut_23_0;
                            break L5;
                          } else {
                            stackOut_22_0 = 1;
                            stackIn_24_0 = stackOut_22_0;
                            break L5;
                          }
                        }
                        qd.field_h = stackIn_24_0;
                        break L1;
                      }
                    } else {
                      if (18 != var3) {
                        if (var3 == 19) {
                          if (mk.field_e <= 20) {
                            ll.a(49, 0);
                            break L1;
                          } else {
                            ll.a(param0 ^ -123, (-1 + (-1 + (8 * mk.field_e + 160)) / 160) * 20);
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        if (ol.field_d <= 32) {
                          if (0 < ol.field_d) {
                            ol.field_d = 0;
                            ui discarded$6 = qf.a(293, cf.field_r);
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          ol.field_d = -32 + 32 * ((ol.field_d * 8 + 255) / 256);
                          ui discarded$7 = qf.a(293, cf.field_r);
                          break L1;
                        }
                      }
                    }
                  } else {
                    int fieldTemp$8 = ca.field_s - 1;
                    ca.field_s = ca.field_s - 1;
                    if (fieldTemp$8 >= 0) {
                      break L3;
                    } else {
                      ca.field_s = 3;
                      break L1;
                    }
                  }
                }
                break L1;
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
          int fieldTemp$9 = g.field_o - 1;
          g.field_o = g.field_o - 1;
          if (fieldTemp$9 >= 0) {
            break L1;
          } else {
            g.field_o = 1;
            break L1;
          }
        }
    }

    ti(int param0) {
        super(em.field_i[param0].length, 15, 360, 165, 35);
        ((ti) this).field_o = param0;
        ((ti) this).field_q = new int[em.field_i[param0].length];
        nk.field_J = new int[16];
        vl.field_h = new int[16];
        dm.field_e = new int[16];
        kn.field_b = new int[16];
        co.field_d = new int[16];
        ((ti) this).b(false, -116);
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        float var7_float = 0.0f;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        String[] var11_ref_String__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        String stackIn_35_0 = null;
        int stackIn_56_0 = 0;
        int[] stackIn_69_0 = null;
        String[] stackIn_69_1 = null;
        int stackIn_69_2 = 0;
        int[] stackIn_70_0 = null;
        String[] stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        int[] stackIn_71_0 = null;
        String[] stackIn_71_1 = null;
        int stackIn_71_2 = 0;
        int[] stackIn_72_0 = null;
        String[] stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        int[] stackIn_73_0 = null;
        String[] stackIn_73_1 = null;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        int[] stackIn_76_0 = null;
        String[] stackIn_76_1 = null;
        int stackIn_76_2 = 0;
        int[] stackIn_77_0 = null;
        String[] stackIn_77_1 = null;
        int stackIn_77_2 = 0;
        int[] stackIn_78_0 = null;
        String[] stackIn_78_1 = null;
        int stackIn_78_2 = 0;
        int[] stackIn_79_0 = null;
        String[] stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        int[] stackIn_82_0 = null;
        String[] stackIn_82_1 = null;
        int stackIn_82_2 = 0;
        int[] stackIn_83_0 = null;
        String[] stackIn_83_1 = null;
        int stackIn_83_2 = 0;
        int[] stackIn_84_0 = null;
        String[] stackIn_84_1 = null;
        int stackIn_84_2 = 0;
        int[] stackIn_85_0 = null;
        String[] stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        int[] stackIn_86_0 = null;
        String[] stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        String[] stackIn_99_0 = null;
        String[] stackIn_99_1 = null;
        int stackIn_99_2 = 0;
        String[] stackIn_100_0 = null;
        String[] stackIn_100_1 = null;
        int stackIn_100_2 = 0;
        String[] stackIn_101_0 = null;
        String[] stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        String stackIn_101_3 = null;
        String[] stackIn_102_0 = null;
        String[] stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        String[] stackIn_103_0 = null;
        String[] stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        String[] stackIn_104_0 = null;
        String[] stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        String stackIn_104_3 = null;
        int[] stackIn_105_0 = null;
        String[] stackIn_105_1 = null;
        int stackIn_105_2 = 0;
        int[] stackIn_106_0 = null;
        String[] stackIn_106_1 = null;
        int stackIn_106_2 = 0;
        int[] stackIn_107_0 = null;
        String[] stackIn_107_1 = null;
        int stackIn_107_2 = 0;
        int[] stackIn_108_0 = null;
        String[] stackIn_108_1 = null;
        int stackIn_108_2 = 0;
        int[] stackIn_109_0 = null;
        String[] stackIn_109_1 = null;
        int stackIn_109_2 = 0;
        int stackIn_109_3 = 0;
        int[] stackIn_111_0 = null;
        String[] stackIn_111_1 = null;
        int stackIn_111_2 = 0;
        int[] stackIn_112_0 = null;
        String[] stackIn_112_1 = null;
        int stackIn_112_2 = 0;
        int[] stackIn_113_0 = null;
        String[] stackIn_113_1 = null;
        int stackIn_113_2 = 0;
        int[] stackIn_114_0 = null;
        String[] stackIn_114_1 = null;
        int stackIn_114_2 = 0;
        int[] stackIn_115_0 = null;
        String[] stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_122_0 = 0;
        String stackOut_34_0 = null;
        String stackOut_33_0 = null;
        int stackOut_54_0 = 0;
        int stackOut_55_0 = 0;
        int[] stackOut_110_0 = null;
        String[] stackOut_110_1 = null;
        int stackOut_110_2 = 0;
        int[] stackOut_111_0 = null;
        String[] stackOut_111_1 = null;
        int stackOut_111_2 = 0;
        int[] stackOut_114_0 = null;
        String[] stackOut_114_1 = null;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int[] stackOut_112_0 = null;
        String[] stackOut_112_1 = null;
        int stackOut_112_2 = 0;
        int[] stackOut_113_0 = null;
        String[] stackOut_113_1 = null;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        String[] stackOut_98_0 = null;
        String[] stackOut_98_1 = null;
        int stackOut_98_2 = 0;
        String[] stackOut_100_0 = null;
        String[] stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        String stackOut_100_3 = null;
        String[] stackOut_99_0 = null;
        String[] stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        String stackOut_99_3 = null;
        String[] stackOut_101_0 = null;
        String[] stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        String[] stackOut_103_0 = null;
        String[] stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        String stackOut_103_3 = null;
        String[] stackOut_102_0 = null;
        String[] stackOut_102_1 = null;
        int stackOut_102_2 = 0;
        String stackOut_102_3 = null;
        int[] stackOut_104_0 = null;
        String[] stackOut_104_1 = null;
        int stackOut_104_2 = 0;
        int[] stackOut_105_0 = null;
        String[] stackOut_105_1 = null;
        int stackOut_105_2 = 0;
        int[] stackOut_108_0 = null;
        String[] stackOut_108_1 = null;
        int stackOut_108_2 = 0;
        int stackOut_108_3 = 0;
        int[] stackOut_106_0 = null;
        String[] stackOut_106_1 = null;
        int stackOut_106_2 = 0;
        int[] stackOut_107_0 = null;
        String[] stackOut_107_1 = null;
        int stackOut_107_2 = 0;
        int stackOut_107_3 = 0;
        int[] stackOut_81_0 = null;
        String[] stackOut_81_1 = null;
        int stackOut_81_2 = 0;
        int[] stackOut_82_0 = null;
        String[] stackOut_82_1 = null;
        int stackOut_82_2 = 0;
        int[] stackOut_85_0 = null;
        String[] stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        int[] stackOut_83_0 = null;
        String[] stackOut_83_1 = null;
        int stackOut_83_2 = 0;
        int[] stackOut_84_0 = null;
        String[] stackOut_84_1 = null;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        int[] stackOut_75_0 = null;
        String[] stackOut_75_1 = null;
        int stackOut_75_2 = 0;
        int[] stackOut_76_0 = null;
        String[] stackOut_76_1 = null;
        int stackOut_76_2 = 0;
        int[] stackOut_77_0 = null;
        String[] stackOut_77_1 = null;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        int[] stackOut_78_0 = null;
        String[] stackOut_78_1 = null;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        int[] stackOut_68_0 = null;
        String[] stackOut_68_1 = null;
        int stackOut_68_2 = 0;
        int[] stackOut_69_0 = null;
        String[] stackOut_69_1 = null;
        int stackOut_69_2 = 0;
        int[] stackOut_72_0 = null;
        String[] stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        int[] stackOut_70_0 = null;
        String[] stackOut_70_1 = null;
        int stackOut_70_2 = 0;
        int[] stackOut_71_0 = null;
        String[] stackOut_71_1 = null;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        int stackOut_121_0 = 0;
        int stackOut_120_0 = 0;
        L0: {
          var14 = HoldTheLine.field_D;
          var5 = em.field_i[((ti) this).field_o][param1];
          if (((ti) this).field_y < 3) {
            break L0;
          } else {
            if (var5 == ((ti) this).field_v) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          if (param3 < -75) {
            break L1;
          } else {
            ((ti) this).f(-38);
            break L1;
          }
        }
        L2: {
          var6 = 50 - (((ti) this).field_s + -(5 * param1));
          if (var6 < 0) {
            var6 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var6 = var6 + ((ti) this).field_q[param1];
          if (((ti) this).field_y != 4) {
            if (((ti) this).field_y != 3) {
              break L3;
            } else {
              var7_float = (float)((Math.exp((double)((float)(40 - ((ti) this).field_w) * 0.20000000298023224f)) - 1.0) / (Math.exp(8.0) - 1.0));
              param0 = (int)((float)param0 - (float)(param0 - 8) * (1.0f - var7_float));
              break L3;
            }
          } else {
            param0 = 0;
            break L3;
          }
        }
        L4: {
          if (2 != ((ti) this).field_y) {
            break L4;
          } else {
            if (~var5 == ~((ti) this).field_v) {
              break L4;
            } else {
              var6 = 25 + (((ti) this).field_r - (-param1 + ((ti) this).field_a) * 5);
              if (var6 < 0) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
          }
        }
        L5: {
          L6: {
            L7: {
              var7 = (int)((double)we.field_n * (-Math.exp((double)((float)var6 * 0.20000000298023224f)) + 1.0));
              var15 = uk.field_c[var5];
              var8 = var15;
              var8 = var15;
              if (var15 == null) {
                break L7;
              } else {
                if (((ti) this).field_o == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            if (((ti) this).field_o == 1) {
              break L6;
            } else {
              break L5;
            }
          }
          var8 = var15.toUpperCase();
          break L5;
        }
        L8: {
          if (var5 != 3) {
            break L8;
          } else {
            L9: {
              if (lm.field_a == 0) {
                break L9;
              } else {
                if (0 == ej.field_b) {
                  break L9;
                } else {
                  L10: {
                    if (lm.field_a == 1) {
                      break L10;
                    } else {
                      if (ej.field_b == 1) {
                        break L10;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var8 = gb.field_J;
                  break L8;
                }
              }
            }
            var8 = uk.field_c[0];
            break L8;
          }
        }
        L11: {
          if (var5 != 6) {
            break L11;
          } else {
            L12: {
              if (ek.field_x != 1) {
                stackOut_34_0 = hk.field_b;
                stackIn_35_0 = stackOut_34_0;
                break L12;
              } else {
                stackOut_33_0 = qj.field_J;
                stackIn_35_0 = stackOut_33_0;
                break L12;
              }
            }
            var8 = stackIn_35_0;
            break L11;
          }
        }
        L13: {
          if (12 != var5) {
            break L13;
          } else {
            if (!nd.field_e) {
              break L13;
            } else {
              var8 = eb.field_p.toUpperCase();
              break L13;
            }
          }
        }
        L14: {
          if (var5 != 7) {
            break L14;
          } else {
            if (bl.field_r == null) {
              break L14;
            } else {
              if (3 != bl.field_r.field_J) {
                break L14;
              } else {
                var8 = sa.field_c.toUpperCase();
                break L14;
              }
            }
          }
        }
        L15: {
          if (var5 == 8) {
            L16: {
              if (((ti) this).field_o != 10) {
                break L16;
              } else {
                if (0.0f >= ((ti) this).field_t) {
                  break L16;
                } else {
                  if (ek.field_x != 3) {
                    break L16;
                  } else {
                    var8 = hl.field_c.toUpperCase();
                    break L15;
                  }
                }
              }
            }
            var8 = ka.field_e.toUpperCase();
            break L15;
          } else {
            break L15;
          }
        }
        L17: {
          if (var8 != null) {
            break L17;
          } else {
            var8 = "ERROR: missing text";
            break L17;
          }
        }
        L18: {
          L19: {
            if (!param2) {
              break L19;
            } else {
              if (((ti) this).field_y != 1) {
                break L19;
              } else {
                stackOut_54_0 = 2;
                stackIn_56_0 = stackOut_54_0;
                break L18;
              }
            }
          }
          stackOut_55_0 = 1;
          stackIn_56_0 = stackOut_55_0;
          break L18;
        }
        L20: {
          var9 = stackIn_56_0;
          if (((ti) this).field_v != var5) {
            break L20;
          } else {
            L21: {
              if (((ti) this).field_y == 3) {
                break L21;
              } else {
                if (((ti) this).field_y != 2) {
                  break L20;
                } else {
                  break L21;
                }
              }
            }
            var9 = 5;
            break L20;
          }
        }
        L22: {
          if (var5 == 24) {
            L23: {
              L24: {
                stackOut_110_0 = qb.field_a;
                stackOut_110_1 = pg.field_L;
                stackOut_110_2 = -121;
                stackIn_113_0 = stackOut_110_0;
                stackIn_113_1 = stackOut_110_1;
                stackIn_113_2 = stackOut_110_2;
                stackIn_111_0 = stackOut_110_0;
                stackIn_111_1 = stackOut_110_1;
                stackIn_111_2 = stackOut_110_2;
                if (!param2) {
                  break L24;
                } else {
                  stackOut_111_0 = (int[]) (Object) stackIn_111_0;
                  stackOut_111_1 = (String[]) (Object) stackIn_111_1;
                  stackOut_111_2 = stackIn_111_2;
                  stackIn_114_0 = stackOut_111_0;
                  stackIn_114_1 = stackOut_111_1;
                  stackIn_114_2 = stackOut_111_2;
                  stackIn_112_0 = stackOut_111_0;
                  stackIn_112_1 = stackOut_111_1;
                  stackIn_112_2 = stackOut_111_2;
                  if (1 == ((ti) this).field_y) {
                    stackOut_114_0 = (int[]) (Object) stackIn_114_0;
                    stackOut_114_1 = (String[]) (Object) stackIn_114_1;
                    stackOut_114_2 = stackIn_114_2;
                    stackOut_114_3 = ca.field_s;
                    stackIn_115_0 = stackOut_114_0;
                    stackIn_115_1 = stackOut_114_1;
                    stackIn_115_2 = stackOut_114_2;
                    stackIn_115_3 = stackOut_114_3;
                    break L23;
                  } else {
                    stackOut_112_0 = (int[]) (Object) stackIn_112_0;
                    stackOut_112_1 = (String[]) (Object) stackIn_112_1;
                    stackOut_112_2 = stackIn_112_2;
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    stackIn_113_2 = stackOut_112_2;
                    break L24;
                  }
                }
              }
              stackOut_113_0 = (int[]) (Object) stackIn_113_0;
              stackOut_113_1 = (String[]) (Object) stackIn_113_1;
              stackOut_113_2 = stackIn_113_2;
              stackOut_113_3 = -1;
              stackIn_115_0 = stackOut_113_0;
              stackIn_115_1 = stackOut_113_1;
              stackIn_115_2 = stackOut_113_2;
              stackIn_115_3 = stackOut_113_3;
              break L23;
            }
            fk.a(stackIn_115_0, stackIn_115_1, stackIn_115_2, stackIn_115_3, param0, 1 + pj.field_m, var7);
            break L22;
          } else {
            if (var5 == 25) {
              L25: {
                L26: {
                  var10_ref_String = uk.field_c[3];
                  if (0 == lm.field_a) {
                    break L26;
                  } else {
                    if (ej.field_b == 0) {
                      break L26;
                    } else {
                      L27: {
                        if (lm.field_a == 1) {
                          break L27;
                        } else {
                          if (ej.field_b != 1) {
                            break L25;
                          } else {
                            break L27;
                          }
                        }
                      }
                      var10_ref_String = gb.field_J;
                      break L25;
                    }
                  }
                }
                var10_ref_String = uk.field_c[0];
                break L25;
              }
              L28: {
                stackOut_98_0 = new String[3];
                stackOut_98_1 = new String[3];
                stackOut_98_2 = 0;
                stackIn_100_0 = stackOut_98_0;
                stackIn_100_1 = stackOut_98_1;
                stackIn_100_2 = stackOut_98_2;
                stackIn_99_0 = stackOut_98_0;
                stackIn_99_1 = stackOut_98_1;
                stackIn_99_2 = stackOut_98_2;
                if (0 >= ih.field_p) {
                  stackOut_100_0 = (String[]) (Object) stackIn_100_0;
                  stackOut_100_1 = (String[]) (Object) stackIn_100_1;
                  stackOut_100_2 = stackIn_100_2;
                  stackOut_100_3 = "";
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  stackIn_101_2 = stackOut_100_2;
                  stackIn_101_3 = stackOut_100_3;
                  break L28;
                } else {
                  stackOut_99_0 = (String[]) (Object) stackIn_99_0;
                  stackOut_99_1 = (String[]) (Object) stackIn_99_1;
                  stackOut_99_2 = stackIn_99_2;
                  stackOut_99_3 = lg.field_r;
                  stackIn_101_0 = stackOut_99_0;
                  stackIn_101_1 = stackOut_99_1;
                  stackIn_101_2 = stackOut_99_2;
                  stackIn_101_3 = stackOut_99_3;
                  break L28;
                }
              }
              L29: {
                stackIn_101_1[stackIn_101_2] = stackIn_101_3;
                stackIn_101_0[1] = var10_ref_String;
                stackOut_101_0 = (String[]) (Object) stackIn_101_0;
                stackOut_101_1 = (String[]) (Object) stackIn_101_0;
                stackOut_101_2 = 2;
                stackIn_103_0 = stackOut_101_0;
                stackIn_103_1 = stackOut_101_1;
                stackIn_103_2 = stackOut_101_2;
                stackIn_102_0 = stackOut_101_0;
                stackIn_102_1 = stackOut_101_1;
                stackIn_102_2 = stackOut_101_2;
                if (ih.field_p >= 6) {
                  stackOut_103_0 = (String[]) (Object) stackIn_103_0;
                  stackOut_103_1 = (String[]) (Object) stackIn_103_1;
                  stackOut_103_2 = stackIn_103_2;
                  stackOut_103_3 = "";
                  stackIn_104_0 = stackOut_103_0;
                  stackIn_104_1 = stackOut_103_1;
                  stackIn_104_2 = stackOut_103_2;
                  stackIn_104_3 = stackOut_103_3;
                  break L29;
                } else {
                  stackOut_102_0 = (String[]) (Object) stackIn_102_0;
                  stackOut_102_1 = (String[]) (Object) stackIn_102_1;
                  stackOut_102_2 = stackIn_102_2;
                  stackOut_102_3 = ej.field_d;
                  stackIn_104_0 = stackOut_102_0;
                  stackIn_104_1 = stackOut_102_1;
                  stackIn_104_2 = stackOut_102_2;
                  stackIn_104_3 = stackOut_102_3;
                  break L29;
                }
              }
              L30: {
                L31: {
                  stackIn_104_1[stackIn_104_2] = stackIn_104_3;
                  var11_ref_String__ = stackIn_104_0;
                  stackOut_104_0 = mo.field_v;
                  stackOut_104_1 = (String[]) var11_ref_String__;
                  stackOut_104_2 = -111;
                  stackIn_107_0 = stackOut_104_0;
                  stackIn_107_1 = stackOut_104_1;
                  stackIn_107_2 = stackOut_104_2;
                  stackIn_105_0 = stackOut_104_0;
                  stackIn_105_1 = stackOut_104_1;
                  stackIn_105_2 = stackOut_104_2;
                  if (!param2) {
                    break L31;
                  } else {
                    stackOut_105_0 = (int[]) (Object) stackIn_105_0;
                    stackOut_105_1 = (String[]) (Object) stackIn_105_1;
                    stackOut_105_2 = stackIn_105_2;
                    stackIn_108_0 = stackOut_105_0;
                    stackIn_108_1 = stackOut_105_1;
                    stackIn_108_2 = stackOut_105_2;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    stackIn_106_2 = stackOut_105_2;
                    if (((ti) this).field_y == 1) {
                      stackOut_108_0 = (int[]) (Object) stackIn_108_0;
                      stackOut_108_1 = (String[]) (Object) stackIn_108_1;
                      stackOut_108_2 = stackIn_108_2;
                      stackOut_108_3 = qd.field_h;
                      stackIn_109_0 = stackOut_108_0;
                      stackIn_109_1 = stackOut_108_1;
                      stackIn_109_2 = stackOut_108_2;
                      stackIn_109_3 = stackOut_108_3;
                      break L30;
                    } else {
                      stackOut_106_0 = (int[]) (Object) stackIn_106_0;
                      stackOut_106_1 = (String[]) (Object) stackIn_106_1;
                      stackOut_106_2 = stackIn_106_2;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      stackIn_107_2 = stackOut_106_2;
                      break L31;
                    }
                  }
                }
                stackOut_107_0 = (int[]) (Object) stackIn_107_0;
                stackOut_107_1 = (String[]) (Object) stackIn_107_1;
                stackOut_107_2 = stackIn_107_2;
                stackOut_107_3 = -1;
                stackIn_109_0 = stackOut_107_0;
                stackIn_109_1 = stackOut_107_1;
                stackIn_109_2 = stackOut_107_2;
                stackIn_109_3 = stackOut_107_3;
                break L30;
              }
              fk.a(stackIn_109_0, stackIn_109_1, stackIn_109_2, stackIn_109_3, param0, -1, var7);
              break L22;
            } else {
              if (26 != var5) {
                L32: {
                  if (var5 == 0) {
                    break L32;
                  } else {
                    if (var5 != 3) {
                      if (var5 != 5) {
                        if (var5 != 10) {
                          L33: {
                            if (var5 != ((ti) this).field_v) {
                              break L33;
                            } else {
                              if (((ti) this).field_y != 3) {
                                break L33;
                              } else {
                                var10 = (-((ti) this).field_w + 80) * ((ti) this).field_w;
                                var10 = (-var10 + 3200) * var10;
                                var11 = var10 * 381 / 2560000;
                                var12 = (-nm.field_c.a(var8) + 640) / 2;
                                var13 = 15 - -(var10 * (-15 + var12) / 2560000);
                                rd.a(var11, var9, (byte) -83, var13, param0, var8);
                                break L22;
                              }
                            }
                          }
                          v.a((byte) -122, var8, var9, var7, param0);
                          break L22;
                        } else {
                          L34: {
                            L35: {
                              stackOut_81_0 = qd.field_l;
                              stackOut_81_1 = ki.field_i;
                              stackOut_81_2 = -127;
                              stackIn_84_0 = stackOut_81_0;
                              stackIn_84_1 = stackOut_81_1;
                              stackIn_84_2 = stackOut_81_2;
                              stackIn_82_0 = stackOut_81_0;
                              stackIn_82_1 = stackOut_81_1;
                              stackIn_82_2 = stackOut_81_2;
                              if (!param2) {
                                break L35;
                              } else {
                                stackOut_82_0 = (int[]) (Object) stackIn_82_0;
                                stackOut_82_1 = (String[]) (Object) stackIn_82_1;
                                stackOut_82_2 = stackIn_82_2;
                                stackIn_85_0 = stackOut_82_0;
                                stackIn_85_1 = stackOut_82_1;
                                stackIn_85_2 = stackOut_82_2;
                                stackIn_83_0 = stackOut_82_0;
                                stackIn_83_1 = stackOut_82_1;
                                stackIn_83_2 = stackOut_82_2;
                                if (((ti) this).field_y == 1) {
                                  stackOut_85_0 = (int[]) (Object) stackIn_85_0;
                                  stackOut_85_1 = (String[]) (Object) stackIn_85_1;
                                  stackOut_85_2 = stackIn_85_2;
                                  stackOut_85_3 = g.field_o;
                                  stackIn_86_0 = stackOut_85_0;
                                  stackIn_86_1 = stackOut_85_1;
                                  stackIn_86_2 = stackOut_85_2;
                                  stackIn_86_3 = stackOut_85_3;
                                  break L34;
                                } else {
                                  stackOut_83_0 = (int[]) (Object) stackIn_83_0;
                                  stackOut_83_1 = (String[]) (Object) stackIn_83_1;
                                  stackOut_83_2 = stackIn_83_2;
                                  stackIn_84_0 = stackOut_83_0;
                                  stackIn_84_1 = stackOut_83_1;
                                  stackIn_84_2 = stackOut_83_2;
                                  break L35;
                                }
                              }
                            }
                            stackOut_84_0 = (int[]) (Object) stackIn_84_0;
                            stackOut_84_1 = (String[]) (Object) stackIn_84_1;
                            stackOut_84_2 = stackIn_84_2;
                            stackOut_84_3 = -1;
                            stackIn_86_0 = stackOut_84_0;
                            stackIn_86_1 = stackOut_84_1;
                            stackIn_86_2 = stackOut_84_2;
                            stackIn_86_3 = stackOut_84_3;
                            break L34;
                          }
                          fk.a(stackIn_86_0, stackIn_86_1, stackIn_86_2, stackIn_86_3, param0, -1, var7);
                          break L22;
                        }
                      } else {
                        L36: {
                          L37: {
                            stackOut_75_0 = va.field_c;
                            stackOut_75_1 = th.field_n;
                            stackOut_75_2 = -120;
                            stackIn_78_0 = stackOut_75_0;
                            stackIn_78_1 = stackOut_75_1;
                            stackIn_78_2 = stackOut_75_2;
                            stackIn_76_0 = stackOut_75_0;
                            stackIn_76_1 = stackOut_75_1;
                            stackIn_76_2 = stackOut_75_2;
                            if (!param2) {
                              break L37;
                            } else {
                              stackOut_76_0 = (int[]) (Object) stackIn_76_0;
                              stackOut_76_1 = (String[]) (Object) stackIn_76_1;
                              stackOut_76_2 = stackIn_76_2;
                              stackIn_78_0 = stackOut_76_0;
                              stackIn_78_1 = stackOut_76_1;
                              stackIn_78_2 = stackOut_76_2;
                              stackIn_77_0 = stackOut_76_0;
                              stackIn_77_1 = stackOut_76_1;
                              stackIn_77_2 = stackOut_76_2;
                              if (1 != ((ti) this).field_y) {
                                break L37;
                              } else {
                                stackOut_77_0 = (int[]) (Object) stackIn_77_0;
                                stackOut_77_1 = (String[]) (Object) stackIn_77_1;
                                stackOut_77_2 = stackIn_77_2;
                                stackOut_77_3 = g.field_o;
                                stackIn_79_0 = stackOut_77_0;
                                stackIn_79_1 = stackOut_77_1;
                                stackIn_79_2 = stackOut_77_2;
                                stackIn_79_3 = stackOut_77_3;
                                break L36;
                              }
                            }
                          }
                          stackOut_78_0 = (int[]) (Object) stackIn_78_0;
                          stackOut_78_1 = (String[]) (Object) stackIn_78_1;
                          stackOut_78_2 = stackIn_78_2;
                          stackOut_78_3 = -1;
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          stackIn_79_2 = stackOut_78_2;
                          stackIn_79_3 = stackOut_78_3;
                          break L36;
                        }
                        fk.a(stackIn_79_0, stackIn_79_1, stackIn_79_2, stackIn_79_3, param0, -1, var7);
                        break L22;
                      }
                    } else {
                      break L32;
                    }
                  }
                }
                L38: {
                  L39: {
                    stackOut_68_0 = th.field_k;
                    stackOut_68_1 = new String[]{var8};
                    stackOut_68_2 = 82;
                    stackIn_71_0 = stackOut_68_0;
                    stackIn_71_1 = stackOut_68_1;
                    stackIn_71_2 = stackOut_68_2;
                    stackIn_69_0 = stackOut_68_0;
                    stackIn_69_1 = stackOut_68_1;
                    stackIn_69_2 = stackOut_68_2;
                    if (!param2) {
                      break L39;
                    } else {
                      stackOut_69_0 = (int[]) (Object) stackIn_69_0;
                      stackOut_69_1 = (String[]) (Object) stackIn_69_1;
                      stackOut_69_2 = stackIn_69_2;
                      stackIn_72_0 = stackOut_69_0;
                      stackIn_72_1 = stackOut_69_1;
                      stackIn_72_2 = stackOut_69_2;
                      stackIn_70_0 = stackOut_69_0;
                      stackIn_70_1 = stackOut_69_1;
                      stackIn_70_2 = stackOut_69_2;
                      if (((ti) this).field_y == 1) {
                        stackOut_72_0 = (int[]) (Object) stackIn_72_0;
                        stackOut_72_1 = (String[]) (Object) stackIn_72_1;
                        stackOut_72_2 = stackIn_72_2;
                        stackOut_72_3 = 0;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        stackIn_73_2 = stackOut_72_2;
                        stackIn_73_3 = stackOut_72_3;
                        break L38;
                      } else {
                        stackOut_70_0 = (int[]) (Object) stackIn_70_0;
                        stackOut_70_1 = (String[]) (Object) stackIn_70_1;
                        stackOut_70_2 = stackIn_70_2;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        stackIn_71_2 = stackOut_70_2;
                        break L39;
                      }
                    }
                  }
                  stackOut_71_0 = (int[]) (Object) stackIn_71_0;
                  stackOut_71_1 = (String[]) (Object) stackIn_71_1;
                  stackOut_71_2 = stackIn_71_2;
                  stackOut_71_3 = -1;
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  stackIn_73_2 = stackOut_71_2;
                  stackIn_73_3 = stackOut_71_3;
                  break L38;
                }
                fk.a(stackIn_73_0, stackIn_73_1, stackIn_73_2, stackIn_73_3, param0, -1, var7);
                break L22;
              } else {
                fl.a(var8, var7, var9, -1753, param0);
                break L22;
              }
            }
          }
        }
        L40: {
          L41: {
            if (18 == var5) {
              break L41;
            } else {
              if (var5 != 19) {
                break L40;
              } else {
                break L41;
              }
            }
          }
          L42: {
            if (var5 == 18) {
              stackOut_121_0 = ol.field_d * 128 / 256;
              stackIn_122_0 = stackOut_121_0;
              break L42;
            } else {
              stackOut_120_0 = mk.field_e * 128 / 160;
              stackIn_122_0 = stackOut_120_0;
              break L42;
            }
          }
          var10 = stackIn_122_0;
          var11 = 172 + var7;
          this.b(param0, (byte) -52, var11, var10);
          break L40;
        }
    }

    private final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        vk var8 = null;
        float var8_float = 0.0f;
        float var9_float = 0.0f;
        int[] var9 = null;
        float var10_float = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14_int = 0;
        String var14 = null;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        String stackIn_57_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        String stackOut_56_0 = null;
        String stackOut_55_0 = null;
        L0: {
          var18 = HoldTheLine.field_D;
          var2 = -(int)((ti) this).field_t + 570;
          if (((ti) this).field_y > 2) {
            break L0;
          } else {
            L1: {
              var3 = 0;
              if (((ti) this).field_y != 2) {
                break L1;
              } else {
                var4 = ((ti) this).field_r + 25 + -((((ti) this).field_a - -1) * 5);
                var3 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var4)) + 1.0));
                break L1;
              }
            }
            fl.a(ik.field_e, var3, 1, -1753, 488 - (int)((ti) this).field_t);
            break L0;
          }
        }
        L2: {
          var3 = 0;
          if (param0 == -10967) {
            break L2;
          } else {
            ((ti) this).field_y = 8;
            break L2;
          }
        }
        L3: {
          var4 = 298;
          var5 = 224;
          var6 = 331;
          var7 = 10 + var2;
          stackOut_6_0 = this;
          stackOut_6_1 = this.e(0, -110) + 480;
          stackOut_6_2 = 0;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_8_2 = stackOut_6_2;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          stackIn_7_2 = stackOut_6_2;
          if (((ti) this).field_c != 0) {
            stackOut_8_0 = this;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = stackIn_8_2;
            stackOut_8_3 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            stackIn_9_3 = stackOut_8_3;
            break L3;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = stackIn_7_2;
            stackOut_7_3 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            stackIn_9_3 = stackOut_7_3;
            break L3;
          }
        }
        L4: {
          ((ti) this).a(stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0, (byte) -94);
          if (((ti) this).field_y != 0) {
            L5: {
              if (((ti) this).field_y != 2) {
                break L5;
              } else {
                if (ej.field_b != -1) {
                  var8_float = 0.10000000149011612f;
                  var9_float = (float)Math.exp((double)(-var8_float * 80.0f));
                  var10 = ((ti) this).field_r + 40;
                  var3 = (int)((-1.0 + Math.exp((double)(var8_float * (float)var10))) * (double)(300.0f * var9_float));
                  var6 = var6 + (int)((-1.0 + Math.exp((double)(var8_float * (float)(var10 - -5)))) * (double)(var9_float * 300.0f));
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (2 >= ((ti) this).field_y) {
                break L6;
              } else {
                if (ej.field_b != -1) {
                  return;
                } else {
                  break L6;
                }
              }
            }
            if (1 < ((ti) this).field_y) {
              if (ej.field_b != -1) {
                break L4;
              } else {
                var8_float = 0.20000000298023224f;
                var9_float = -(float)Math.exp((double)(-var8_float * (float)sf.field_m)) + 1.0f;
                var4 = (int)(var9_float * 342.0f) + 298;
                var6 = (int)((1.0f - var9_float) * (float)var6);
                var5 = (int)(var9_float * 256.0f) + 224;
                var3 = (int)(600.0f * var9_float);
                var7 = (int)((float)var7 * (-var9_float + 1.0f));
                break L4;
              }
            } else {
              break L4;
            }
          } else {
            var8_int = 80;
            var9_float = 0.10000000149011612f;
            var10_float = (float)Math.exp((double)(-var9_float * 80.0f));
            var11 = -sf.field_m + var8_int;
            var3 = (int)((Math.exp((double)(var9_float * (float)var11)) - 1.0) * (double)(300.0f * var10_float)) - 10;
            var6 = var6 + (-5 + (int)((Math.exp((double)(var9_float * (float)(-5 + var11))) - 1.0) * (double)(var10_float * 300.0f)));
            break L4;
          }
        }
        L7: {
          var8 = kn.b((byte) -49);
          nm.field_c.b(ue.field_c + var8.field_b, var3 + 320, var2, 0, -1);
          var2 += 15;
          if (we.field_o != null) {
            break L7;
          } else {
            we.field_o = new hj(640, 480);
            break L7;
          }
        }
        L8: {
          vb.a(-72, we.field_o);
          vl.a(0);
          ug.b(param0 + 10966);
          tc.c(var6 + -5, var7 - 5, 10 + var4, var5 - -10, 0, 128);
          if (bl.field_r == null) {
            break L8;
          } else {
            if (bl.field_r.field_r != 3) {
              break L8;
            } else {
              tc.f(var6, var7, var4, var5, 0);
              break L8;
            }
          }
        }
        L9: {
          L10: {
            we.field_o.a(var6, var7, var4, var5);
            var2 += 247;
            nm.field_c.b(jc.field_a, -var3 + 320, var2, 0, -1);
            var2 += 8;
            var9 = go.field_g[var8.field_p];
            stackOut_27_0 = 166 + -var3;
            stackOut_27_1 = -5 + var2;
            stackOut_27_2 = 148;
            stackOut_27_3 = 114;
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_30_2 = stackOut_27_2;
            stackIn_30_3 = stackOut_27_3;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            stackIn_28_2 = stackOut_27_2;
            stackIn_28_3 = stackOut_27_3;
            if (var9[0] != t.field_l) {
              break L10;
            } else {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = stackIn_28_1;
              stackOut_28_2 = stackIn_28_2;
              stackOut_28_3 = stackIn_28_3;
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              stackIn_31_3 = stackOut_28_3;
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              stackIn_29_3 = stackOut_28_3;
              if (((ti) this).field_c == 1) {
                stackOut_31_0 = stackIn_31_0;
                stackOut_31_1 = stackIn_31_1;
                stackOut_31_2 = stackIn_31_2;
                stackOut_31_3 = stackIn_31_3;
                stackOut_31_4 = 16777215;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                stackIn_32_2 = stackOut_31_2;
                stackIn_32_3 = stackOut_31_3;
                stackIn_32_4 = stackOut_31_4;
                break L9;
              } else {
                stackOut_29_0 = stackIn_29_0;
                stackOut_29_1 = stackIn_29_1;
                stackOut_29_2 = stackIn_29_2;
                stackOut_29_3 = stackIn_29_3;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                stackIn_30_2 = stackOut_29_2;
                stackIn_30_3 = stackOut_29_3;
                break L10;
              }
            }
          }
          stackOut_30_0 = stackIn_30_0;
          stackOut_30_1 = stackIn_30_1;
          stackOut_30_2 = stackIn_30_2;
          stackOut_30_3 = stackIn_30_3;
          stackOut_30_4 = 0;
          stackIn_32_0 = stackOut_30_0;
          stackIn_32_1 = stackOut_30_1;
          stackIn_32_2 = stackOut_30_2;
          stackIn_32_3 = stackOut_30_3;
          stackIn_32_4 = stackOut_30_4;
          break L9;
        }
        L11: {
          L12: {
            tc.c(stackIn_32_0, stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4, 128);
            oe.field_i.a(104, var9[0], 9, 138).b(-var3 + 171, var2);
            stackOut_32_0 = var3 + 326;
            stackOut_32_1 = -5 + var2;
            stackOut_32_2 = 148;
            stackOut_32_3 = 114;
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_35_2 = stackOut_32_2;
            stackIn_35_3 = stackOut_32_3;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            stackIn_33_2 = stackOut_32_2;
            stackIn_33_3 = stackOut_32_3;
            if (~var9[1] != ~t.field_l) {
              break L12;
            } else {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = stackIn_33_1;
              stackOut_33_2 = stackIn_33_2;
              stackOut_33_3 = stackIn_33_3;
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              stackIn_36_3 = stackOut_33_3;
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              stackIn_34_3 = stackOut_33_3;
              if (((ti) this).field_c == 1) {
                stackOut_36_0 = stackIn_36_0;
                stackOut_36_1 = stackIn_36_1;
                stackOut_36_2 = stackIn_36_2;
                stackOut_36_3 = stackIn_36_3;
                stackOut_36_4 = 16777215;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                stackIn_37_2 = stackOut_36_2;
                stackIn_37_3 = stackOut_36_3;
                stackIn_37_4 = stackOut_36_4;
                break L11;
              } else {
                stackOut_34_0 = stackIn_34_0;
                stackOut_34_1 = stackIn_34_1;
                stackOut_34_2 = stackIn_34_2;
                stackOut_34_3 = stackIn_34_3;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                stackIn_35_2 = stackOut_34_2;
                stackIn_35_3 = stackOut_34_3;
                break L12;
              }
            }
          }
          stackOut_35_0 = stackIn_35_0;
          stackOut_35_1 = stackIn_35_1;
          stackOut_35_2 = stackIn_35_2;
          stackOut_35_3 = stackIn_35_3;
          stackOut_35_4 = 0;
          stackIn_37_0 = stackOut_35_0;
          stackIn_37_1 = stackOut_35_1;
          stackIn_37_2 = stackOut_35_2;
          stackIn_37_3 = stackOut_35_3;
          stackIn_37_4 = stackOut_35_4;
          break L11;
        }
        tc.c(stackIn_37_0, stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4, 128);
        oe.field_i.a(104, var9[1], 9, 138).b(var3 + 331, var2);
        var12 = 0;
        var22 = new int[4];
        var21 = var22;
        var20 = var21;
        var19 = var20;
        var13 = var19;
        var10 = 0;
        L13: while (true) {
          if (var10 >= 4) {
            var2 = 640 + -(int)((ti) this).field_t;
            nm.field_c.b(qh.field_e, 160 + -var3, var2, 0, -1);
            var2 += 40;
            var10 = 0;
            L14: while (true) {
              if (4 <= var10) {
                return;
              } else {
                var11 = 0;
                L15: while (true) {
                  if (4 <= var11) {
                    var10++;
                    continue L14;
                  } else {
                    L16: {
                      if (~var10 != ~var22[var11]) {
                        break L16;
                      } else {
                        L17: {
                          if (((ti) this).field_y == 0) {
                            var14_int = 60;
                            var15 = 0.10000000149011612f;
                            var16 = (float)Math.exp((double)(-var15 * 80.0f));
                            var17 = -sf.field_m + var14_int + 5 * var12;
                            var3 = (int)((-1.0 + Math.exp((double)(var15 * (float)var17))) * (double)(var16 * 300.0f));
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          if (t.field_j[var11] != 1) {
                            stackOut_56_0 = t.field_j[var11] + ij.field_a;
                            stackIn_57_0 = stackOut_56_0;
                            break L18;
                          } else {
                            stackOut_55_0 = la.field_h;
                            stackIn_57_0 = stackOut_55_0;
                            break L18;
                          }
                        }
                        var14 = stackIn_57_0;
                        nm.field_c.a(var14, -var3 + 170, var2, var11 + 6, -1);
                        nm.field_c.c(rf.field_Y[var10], 150 + -var3, var2, var11 + 6, -1);
                        var12++;
                        var2 += 30;
                        break L16;
                      }
                    }
                    var11++;
                    continue L15;
                  }
                }
              }
            }
          } else {
            var11 = 0;
            L19: while (true) {
              if (var11 >= 4) {
                var10++;
                continue L13;
              } else {
                L20: {
                  if (t.field_j[var11] > t.field_j[var10]) {
                    var13[var10] = var13[var10] + 1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                var11++;
                continue L19;
              }
            }
          }
        }
    }

    final static int[] a(int param0, int param1, byte param2) {
        int var3 = tn.a(param1, 5255);
        if (param2 >= -42) {
            return null;
        }
        int var4 = hc.a(0, param1);
        int var5 = tn.a(param0, 5255);
        int var6 = hc.a(0, param0);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    private final int a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HoldTheLine.field_D;
          if (param0 < 168) {
            break L0;
          } else {
            if (param0 <= 213) {
              if (param1 == 163) {
                var5 = 0;
                L1: while (true) {
                  if (var5 >= 4) {
                    return -1;
                  } else {
                    L2: {
                      if (~param2 > ~(-param3 + (2 + cj.field_K[var5]))) {
                        break L2;
                      } else {
                        if (param2 <= cj.field_K[var5] - (-62 + param3)) {
                          return var5;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                return -42;
              }
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    private final void a(int param0, hj param1, int param2, int param3, int param4, int param5, int param6) {
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
              this.a(param6, 2, param2, param5, param3, param4, param1.field_s, param1, param1.field_y);
              if (param0 == -141) {
                break L1;
              } else {
                ((ti) this).field_w = 23;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ti.GA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        uf var14 = null;
        uf var15 = null;
        uf var16 = null;
        String var17 = null;
        String var18 = null;
        int stackIn_5_0 = 0;
        double stackIn_7_0 = 0.0;
        double stackIn_8_0 = 0.0;
        double stackIn_9_0 = 0.0;
        int stackIn_9_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_38_0 = 0;
        String stackIn_49_0 = null;
        int stackIn_55_0 = 0;
        String stackIn_77_0 = null;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        String stackIn_84_4 = null;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        String stackIn_85_4 = null;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        String stackIn_86_4 = null;
        int stackIn_86_5 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        double stackOut_6_0 = 0.0;
        double stackOut_8_0 = 0.0;
        int stackOut_8_1 = 0;
        double stackOut_7_0 = 0.0;
        int stackOut_7_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        String stackOut_76_0 = null;
        String stackOut_75_0 = null;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        String stackOut_83_4 = null;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        String stackOut_85_4 = null;
        int stackOut_85_5 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        String stackOut_84_4 = null;
        int stackOut_84_5 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        String stackOut_48_0 = null;
        String stackOut_47_0 = null;
        var13 = HoldTheLine.field_D;
        if (bl.field_r != null) {
          L0: {
            var2 = 140 + -(int)((ti) this).field_t;
            var3 = 0;
            var4 = 500;
            var5 = 0.10000000149011612f;
            var6 = (float)Math.exp((double)(400.0f * -var5));
            if (((ti) this).field_y > 1) {
              stackOut_4_0 = sf.field_m;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = -sf.field_m + var4;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (!bl.field_r.field_E) {
              var8 = (int)((-1.0 + Math.exp((double)(var5 * (float)var7))) * (double)(300.0f * var6));
              if (bl.field_r.field_C[0].field_R < 3) {
                var16 = ha.field_o[bl.field_r.field_C[0].field_R];
                if (var16.a(8192) != null) {
                  var16.field_b.a(256, -64 + var2 + -var8);
                  break L1;
                } else {
                  ra.field_hb.a(272, -64 + (-var8 + var2));
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              L2: {
                var8 = (int)((double)(300.0f * var6) * (Math.exp((double)((float)var7 * var5)) - 1.0));
                stackOut_6_0 = (double)(var6 * 300.0f);
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (var7 > 10) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = -10 + var7;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              L3: {
                var9_int = (int)(stackIn_9_0 * (Math.exp((double)((float)stackIn_9_1 * var5)) - 1.0));
                if (bl.field_r.field_C[0].field_R < 3) {
                  var14 = ha.field_o[bl.field_r.field_C[0].field_R];
                  if (null != var14.a(8192)) {
                    var14.field_b.a(336, var2 - (var8 - -64));
                    break L3;
                  } else {
                    ra.field_hb.a(352, var2 + (-var8 - 64));
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (3 <= bl.field_r.field_C[1].field_R) {
                break L1;
              } else {
                var15 = ha.field_o[bl.field_r.field_C[1].field_R];
                if (var15.a(8192) != null) {
                  var15.field_b.a(176, -var9_int + var2 + -64);
                  break L1;
                } else {
                  ra.field_hb.a(192, var2 + (-var9_int + -64));
                  break L1;
                }
              }
            }
          }
          L4: {
            var2 += 120;
            if (ek.field_x != 5) {
              break L4;
            } else {
              L5: {
                if (((ti) this).field_y <= 1) {
                  stackOut_26_0 = -sf.field_m + var4;
                  stackIn_27_0 = stackOut_26_0;
                  break L5;
                } else {
                  stackOut_25_0 = sf.field_m;
                  stackIn_27_0 = stackOut_25_0;
                  break L5;
                }
              }
              L6: {
                var7 = stackIn_27_0;
                var7 -= 75;
                if (var7 < 0) {
                  var7 = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              var8 = 320 - -(int)((double)(var6 * 500.0f) * (Math.exp((double)((float)var7 * var5)) - 1.0));
              nm.field_c.b("-", var8 + 2, var2, 0, -1);
              nm.field_c.c(vf.field_u, -8 + var8, var2, 0, -1);
              nm.field_c.a(bl.field_o, 12 + var8, var2, 0, -1);
              var2 += 30;
              break L4;
            }
          }
          var9_int = 0;
          L7: while (true) {
            if (var9_int >= 4) {
              L8: {
                if (ek.field_x == 5) {
                  break L8;
                } else {
                  var2 += 30;
                  break L8;
                }
              }
              L9: {
                if (sf.field_m % 50 >= 25) {
                  break L9;
                } else {
                  L10: {
                    if (ek.field_x != 2) {
                      break L10;
                    } else {
                      if (-1 == ce.field_r) {
                        break L10;
                      } else {
                        L11: {
                          var9 = sd.a(kj.field_n, new String[1], true);
                          if (!of.a(-969)) {
                            var9 = ub.field_E;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        nm.field_c.b(var9, 320, var2, 1, -1);
                        break L9;
                      }
                    }
                  }
                  if (ek.field_x == 1) {
                    L12: {
                      if (kk.field_l != 1) {
                        stackOut_76_0 = sd.a(sh.field_c, new String[1], true);
                        stackIn_77_0 = stackOut_76_0;
                        break L12;
                      } else {
                        stackOut_75_0 = va.field_f;
                        stackIn_77_0 = stackOut_75_0;
                        break L12;
                      }
                    }
                    var18 = stackIn_77_0;
                    var9 = var18;
                    nm.field_c.b(var18, 320, var2, 1, -1);
                    break L9;
                  } else {
                    if (6 != ek.field_x) {
                      break L9;
                    } else {
                      var17 = h.field_a;
                      nm.field_c.b(var17, 320, var2, 1, -1);
                      break L9;
                    }
                  }
                }
              }
              L13: {
                if (1 == ek.field_x) {
                  var9 = qj.field_J;
                  break L13;
                } else {
                  if (ek.field_x == 6) {
                    var9 = ka.field_e;
                    break L13;
                  } else {
                    var9 = hk.field_b;
                    break L13;
                  }
                }
              }
              L14: {
                stackOut_83_0 = 240;
                stackOut_83_1 = 0;
                stackOut_83_2 = -5;
                stackOut_83_3 = 430 + -(int)((ti) this).field_t;
                stackOut_83_4 = (String) var9;
                stackIn_85_0 = stackOut_83_0;
                stackIn_85_1 = stackOut_83_1;
                stackIn_85_2 = stackOut_83_2;
                stackIn_85_3 = stackOut_83_3;
                stackIn_85_4 = stackOut_83_4;
                stackIn_84_0 = stackOut_83_0;
                stackIn_84_1 = stackOut_83_1;
                stackIn_84_2 = stackOut_83_2;
                stackIn_84_3 = stackOut_83_3;
                stackIn_84_4 = stackOut_83_4;
                if (((ti) this).field_c != 1) {
                  stackOut_85_0 = stackIn_85_0;
                  stackOut_85_1 = stackIn_85_1;
                  stackOut_85_2 = stackIn_85_2;
                  stackOut_85_3 = stackIn_85_3;
                  stackOut_85_4 = (String) (Object) stackIn_85_4;
                  stackOut_85_5 = 0;
                  stackIn_86_0 = stackOut_85_0;
                  stackIn_86_1 = stackOut_85_1;
                  stackIn_86_2 = stackOut_85_2;
                  stackIn_86_3 = stackOut_85_3;
                  stackIn_86_4 = stackOut_85_4;
                  stackIn_86_5 = stackOut_85_5;
                  break L14;
                } else {
                  stackOut_84_0 = stackIn_84_0;
                  stackOut_84_1 = stackIn_84_1;
                  stackOut_84_2 = stackIn_84_2;
                  stackOut_84_3 = stackIn_84_3;
                  stackOut_84_4 = (String) (Object) stackIn_84_4;
                  stackOut_84_5 = 1;
                  stackIn_86_0 = stackOut_84_0;
                  stackIn_86_1 = stackOut_84_1;
                  stackIn_86_2 = stackOut_84_2;
                  stackIn_86_3 = stackOut_84_3;
                  stackIn_86_4 = stackOut_84_4;
                  stackIn_86_5 = stackOut_84_5;
                  break L14;
                }
              }
              te.a(stackIn_86_0, stackIn_86_1, stackIn_86_2, stackIn_86_3, stackIn_86_4, stackIn_86_5 != 0);
              return;
            } else {
              var10 = 0;
              L15: while (true) {
                if (bl.field_r.field_h <= var10) {
                  var9_int++;
                  continue L7;
                } else {
                  L16: {
                    if (((ti) this).field_y > 1) {
                      stackOut_37_0 = sf.field_m;
                      stackIn_38_0 = stackOut_37_0;
                      break L16;
                    } else {
                      stackOut_36_0 = var4 - sf.field_m;
                      stackIn_38_0 = stackOut_36_0;
                      break L16;
                    }
                  }
                  L17: {
                    var7 = stackIn_38_0;
                    var7 = var7 - (5 + -var3) * 10;
                    if (0 <= var7) {
                      break L17;
                    } else {
                      var7 = 0;
                      break L17;
                    }
                  }
                  L18: {
                    var8 = (int)((Math.exp((double)(var5 * (float)var7)) - 1.0) * (double)(var6 * 500.0f));
                    if (var3 % 2 == 0) {
                      var8 = -var8 + 320;
                      break L18;
                    } else {
                      var8 = 320 + var8;
                      break L18;
                    }
                  }
                  L19: {
                    if (~var9_int != ~bl.field_r.field_C[var10].field_R) {
                      break L19;
                    } else {
                      L20: {
                        if (ek.field_x == 4) {
                          nm.field_c.c(rf.field_Y[var9_int], -15 + var8, var2, var10 + 6, -1);
                          if (-1 == pe.field_g[var10]) {
                            nm.field_c.a(ln.field_m, var8 - -15, var2, 6 + var10, -1);
                            break L20;
                          } else {
                            nm.field_c.a(cb.a(47, pe.field_g[var10]), 15 + var8, var2, var10 + 6, -1);
                            break L20;
                          }
                        } else {
                          if (ek.field_x == 5) {
                            L21: {
                              nm.field_c.c(rf.field_Y[var9_int], var8 - 15, var2, var10 + 6, -1);
                              if (kb.a(16616, 0)) {
                                stackOut_54_0 = 3;
                                stackIn_55_0 = stackOut_54_0;
                                break L21;
                              } else {
                                stackOut_53_0 = 1;
                                stackIn_55_0 = stackOut_53_0;
                                break L21;
                              }
                            }
                            var11 = stackIn_55_0;
                            nm.field_c.a(Integer.toString(bl.field_r.field_C[var10].field_Sb), 15 + var8, var2, 6 + var10, -1);
                            nm.field_c.a("-", 16 + var8 + 14 * var11, var2, 6 + var10, -1);
                            nm.field_c.a(Integer.toString(bl.field_r.field_C[var10].field_oc), 31 + var8 - -(var11 * 14), var2, var10 + 6, -1);
                            break L20;
                          } else {
                            L22: {
                              var11 = ub.field_C[var9_int];
                              if (var11 == 1) {
                                stackOut_48_0 = la.field_h;
                                stackIn_49_0 = stackOut_48_0;
                                break L22;
                              } else {
                                stackOut_47_0 = var11 + ij.field_a;
                                stackIn_49_0 = stackOut_47_0;
                                break L22;
                              }
                            }
                            var12 = stackIn_49_0;
                            nm.field_c.a(var12, -55 + var8, var2, var10 + 6, -1);
                            nm.field_c.c(rf.field_Y[var9_int], -80 + var8, var2, 6 - -var10, -1);
                            if (pe.field_g[var10] != -1) {
                              nm.field_c.a(cb.a(48, pe.field_g[var10]), 40 + var8, var2, var10 + 6, -1);
                              break L20;
                            } else {
                              nm.field_c.a(ln.field_m, 40 + var8, var2, var10 + 6, -1);
                              break L20;
                            }
                          }
                        }
                      }
                      var3++;
                      var2 += 30;
                      break L19;
                    }
                  }
                  var10++;
                  continue L15;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final int a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HoldTheLine.field_D;
          if (param0 < 80) {
            break L0;
          } else {
            if (param0 > 140) {
              break L0;
            } else {
              var5 = 0;
              L1: while (true) {
                if (var5 >= 4) {
                  L2: {
                    if (param1 <= -87) {
                      break L2;
                    } else {
                      ((ti) this).field_r = 9;
                      break L2;
                    }
                  }
                  return -1;
                } else {
                  L3: {
                    if (88 + (128 * var5 + -param3) > param2) {
                      break L3;
                    } else {
                      if (~param2 >= ~(-param3 + (var5 * 128 + 168))) {
                        return var5;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
        return -1;
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          if (200 > nc.field_g) {
            break L0;
          } else {
            if (nc.field_g >= 440) {
              break L0;
            } else {
              if ((float)rf.field_X < 430.0f - ((ti) this).field_t) {
                break L0;
              } else {
                if (-((ti) this).field_t + 460.0f > (float)rf.field_X) {
                  ((ti) this).field_c = 1;
                  if (1 != gg.field_J) {
                    break L0;
                  } else {
                    this.a((byte) 117, 6, true);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        var2 = 0;
        L1: while (true) {
          L2: {
            if (2 <= var2) {
              break L2;
            } else {
              L3: {
                if (0 == var2) {
                  stackOut_11_0 = 240;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 400;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              var3 = stackIn_12_0;
              if (-69 + var3 <= nc.field_g) {
                if (var3 + 69 > nc.field_g) {
                  if ((float)rf.field_X >= 845.0f - ((ti) this).field_t) {
                    if ((float)rf.field_X < 949.0f - ((ti) this).field_t) {
                      t.field_l = go.field_g[kn.b((byte) -49).field_p][var2];
                      ci.a(0, (byte) 120, ((ti) this).field_o, var2);
                      ((ti) this).field_c = 1;
                      if (gg.field_J == 1) {
                        if (null == bl.field_r) {
                          break L2;
                        } else {
                          bl.field_r.field_C[0].a(20385, ge.field_c[t.field_l]);
                          wm.a(true, false, -1);
                          ui discarded$1 = qf.a(293, cf.field_r);
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      var2++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    continue L1;
                  }
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
          L4: {
            if (((ti) this).field_o != 10) {
              break L4;
            } else {
              if (((ti) this).field_t > 0.0f) {
                if (!na.field_k) {
                  break L4;
                } else {
                  if (nc.field_g <= ((ti) this).field_m) {
                    break L4;
                  } else {
                    if (((ti) this).field_f < nc.field_g) {
                      break L4;
                    } else {
                      if (rf.field_X < 35) {
                        break L4;
                      } else {
                        if (rf.field_X <= 65) {
                          ((ti) this).field_c = 0;
                          if (0 != gg.field_J) {
                            ((ti) this).c(((ti) this).field_c, -3565);
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              } else {
                break L4;
              }
            }
          }
          return;
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        var4 = 0;
        L0: while (true) {
          if (qe.field_a <= var4) {
            L1: {
              if (param0 == -21) {
                break L1;
              } else {
                ((ti) this).field_r = -80;
                break L1;
              }
            }
            return -1;
          } else {
            var5 = -param1 + dm.field_e[var4];
            var6 = -param2 + co.field_d[var4];
            var7 = kn.field_b[var4] >> 1;
            if (-var7 <= var5) {
              if (var5 <= var7) {
                if (-var7 <= var6) {
                  if (var6 <= var7) {
                    return nk.field_J[var4];
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void g(int param0, int param1) {
        ((ti) this).field_p = 0;
        ((ti) this).field_t = (float)param0;
        ha.field_p = param1;
        wa.field_j = param1;
        mg.field_g[param1] = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new ll();
    }
}
