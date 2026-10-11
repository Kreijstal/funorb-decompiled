/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        boolean stackIn_16_3 = false;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_98_0 = 0;
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
        int var8Lifetime1;
        var9 = HoldTheLine.field_D;
        if (param0 != -55) {
          return;
        }
        var2 = 50 - this.field_s;
        if (this.field_y == 2) {
          var2 = -(this.field_a * 5) + (this.field_r + 25);
        }
        if (var2 < 0) {
          var2 = 0;
        }
        var3 = (int)((double)we.field_n * (-Math.exp((double)((float)var2 * 0.20000000298023224f)) + 1.0));
        if (this.field_y > 2) {
          var3 = 640;
        }
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameCompleted0 = true;
        if (this.field_o != 12) {
          var4 = 0;
          while (this.field_a > var4) {
            stackIn_51_1 = this.e(var4, -125);
            stackIn_51_2 = var4;
            if (var9 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            stackIn_16_3 = (~this.field_c == ~var4);
            this.a(stackIn_51_1, stackIn_51_2, stackIn_16_3, (byte) -116);
            var4++;
          }
          if ((decompiledFrameCompleted0) &&
            (var9 != 0)) {
            this.c(var3, false);
          }
        } else {
          this.c(var3, false);
        }
        if (decompiledFrameCompleted0) {
          if (this.field_o != 2) {
            if (this.field_o == 3) {
              this.a(true, var3);
              decompiledFrameRemainder0 = (var9 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_o == 4) {
                this.i(var3, -11468);
                decompiledFrameRemainder0 = (var9 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (this.field_o != 5) {
                  if (6 == this.field_o) {
                    this.f(45, var3);
                    decompiledFrameRemainder0 = (var9 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (this.field_o == 9) {
                      this.l(29280);
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (this.field_o == 7) {
                        this.c((byte) -18);
                        decompiledFrameRemainder0 = (var9 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (8 != this.field_o) {
                          if (this.field_o == 10) {
                            if (480.0f != this.field_t) {
                              this.h(12);
                            }
                            decompiledFrameRemainder0 = (0.0f != this.field_t);
                            if (decompiledFrameRemainder0) {
                              this.n(param0 - 10912);
                              decompiledFrameRemainder0 = (var9 != 0);
                            }
                          }
                          if ((decompiledFrameRemainder0) &&
                            (decompiledFrameRemainder0 = (this.field_o == 11))) {
                            this.h(12);
                            decompiledFrameRemainder0 = (var9 != 0);
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          this.c((byte) -18);
                          decompiledFrameRemainder0 = (var9 != 0);
                        }
                      }
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.i(var3, -11468);
                  decompiledFrameRemainder0 = (var9 != 0);
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_51_1 = 1;
            stackIn_51_2 = var3;
          }
        }
        if (decompiledFrameRemainder0) {
          this.a(stackIn_51_1 != 0, stackIn_51_2);
        }
        if (this.field_o != 0 &&
          this.field_o != 12 &&
          this.field_y <= 2) {
          var4 = 0;
          var5_int = 8;
          if (10 == this.field_o) {
            var5_int = var5_int - (int)this.field_t;
          }
          if (this.field_y == 2) {
            var6 = -(this.field_a * 5) - 5 + (25 + this.field_r);
            var4 = (int)((double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)var6))));
          }
          fl.a(qe.field_g[this.field_o].toUpperCase(), var4, 5, param0 - 1698, var5_int);
        }
        if (this.field_o == 0) {
          var4 = -140 + this.field_j;
          if (this.field_y == 0) {
            var5_int = -this.field_s + 50;
            var4 = var4 - (int)((double)this.field_j * Math.exp((double)(0.20000000298023224f * (float)var5_int)));
          }
          if (this.field_y == 3) {
            var4 = (int)((double)this.field_j * (Math.exp((double)(0.20000000298023224f * (float)(40 - this.field_w))) - 1.0) / (-1.0 + Math.exp(8.0))) - 140;
          }
          tc.c(0, var4 + 100, 640, 5, 0, 128);
          var5 = fd.field_e.a(8192);
          if (var5 != null) {
            var13 = new int[4];
            tc.b(var13);
            tc.e(0, var4, 640, var4 + 100);
            var7 = 0;
            do {
              if (var7 >= 11) {
                tc.a(var13);
                tc.b(0, -1 + var4, 640, 0);
                break;
              }
              fd.field_e.a(8192).b(60 * var7, var4);
              fd.field_e.a(param0 ^ -8247).b(60 * var7, 60 + var4);
              var7++;
            } while (var9 == 0);
            var7 = 0;
            L31: while (true) {
              if (var7 < 11) {
                tc.b(-16 + 64 * var7, var4, 32, 16777215);
                tc.b(16 + 64 * var7, var4, 32, 16711680);
                stackIn_87_0 = 0;
                if (var9 != 0) {
                  break L31;
                }
                var8 = stackIn_87_0;
                while (var8 < 6) {
                  tc.b(-17 + 64 * var7, var8 + var4 + 1, 32, 14737632);
                  tc.b(15 + var7 * 64, 1 + var4 + var8, 32, 14680064);
                  var8++;
                }
                tc.b(64 * var7 - 16, 7 + var4, 32, 8421504);
                tc.b(16 + 64 * var7, 7 + var4, 32, 8388608);
                var7++;
                continue;
              }
              tc.b(0, var4 + 8, 640, 0);
              tc.b(0, 90 + var4, 640, 0);
              stackIn_87_0 = 0;
              break;
            }
            var7 = stackIn_87_0;
            L37: while (true) {
              if (var7 < 11) {
                tc.b(var7 * 64, 91 + var4, 32, 16777215);
                tc.b(var7 * 64 + 32, var4 + 91, 32, 16711680);
                stackIn_98_0 = 0;
                if (var9 != 0) {
                  break L37;
                }
                var8Lifetime1 = stackIn_98_0;
                while (var8Lifetime1 < 6) {
                  tc.b(var7 * 64 - 1, 92 + (var4 + var8Lifetime1), 32, 14737632);
                  tc.b(31 + var7 * 64, 92 + var4 + var8Lifetime1, 32, 14680064);
                  var8Lifetime1++;
                }
                tc.b(var7 * 64, 98 + var4, 32, 8421504);
                tc.b(var7 * 64 + 32, 98 + var4, 32, 8388608);
                var7++;
                continue;
              }
              stackIn_98_0 = 0;
              break;
            }
            tc.b(stackIn_98_0, var4 + 99, 640, 0);
          }
          uk.field_a.d(207, -15 + var4, 128);
          im.field_b.a(202, -20 + var4);
        }
        oi.a(param0 ^ -56, this.field_o);
        return;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_37_0 = 0;
        var8 = HoldTheLine.field_D;
        cg.a(-param2 + 40, 102, 560, (byte) 41, 312);
        if (param1 != 0) {
          this.a(-4);
        }
        L1: {
          L2: {
            L3: {
              L4: {
                var4 = 132;
                q.a(od.field_i[param0], HoldTheLine.field_F, 2, -param2 + 320, (byte) -127, var4);
                var4 += 40;
                var5 = sf.field_m % 180 / 5;
                var6 = param0;
                L5: switch ((var8 == 0
                  || var6 == 0
                  || var6 == 2
                  || var6 == 3
                  || var6 == 6
                  ) ? var6 : -1) {
                  case 0:
                    wb.a(20, sk.field_f, 0, 0, 560, var4 - 20, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                    var4 += 120;
                    q.a(am.field_c, HoldTheLine.field_F, 2, -param2 + 320, (byte) -127, var4);
                    var4 += 30;
                    am.a(310 - param2, qm.field_a, true, HoldTheLine.field_F, var4, 1);
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
                    ei.a(320 - param2, 1, gi.field_H, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(320 - param2, 1, cf.field_t, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(320 - param2, param1 + 1, kc.field_c, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    if (var8 == 0) {
                      break L1;
                    }
                  case 1:
                    wb.a(20, vg.field_L, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, -1, 1, HoldTheLine.field_F);
                    if (var8 == 0) {
                      break L2;
                    }
                  case 2:
                    wb.a(20, sf.field_k, 0, 0, 560, -20 + var4, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                    var4 += 185;
                    var6 = 0;
                    {
                      while (true) {
                        if (var6 < 3) {
                          oi.field_a.b(-(20 * var6) + 168 - param2, -20 + var4 + 5);
                          oi.field_a.b(-(var6 * 20) + 408 - param2, -20 + (var4 + 5));
                          oi.field_a.b(-param2 + (168 - var6 * 20), 10 + (var4 + 5));
                          oi.field_a.b(408 - (param2 + 20 * var6), var4 + 10 + 5);
                          ha.field_k.a(16, var5, 9, 16).a(-(var6 * 20) + (-param2 + 170), -20 + (var4 + 7));
                          pk.field_O.a(16, var5, param1 ^ 9, 16).a(-param2 + 410 - var6 * 20, 7 + var4 - 20);
                          na.field_q.a(16, var5, 9, 16).a(-(var6 * 20) - param2 + 170, 10 + (var4 + 7));
                          cf.field_u.a(16, var5, param1 + 9, 16).a(-param2 + 410 - var6 * 20, 10 + (var4 + 7));
                          var6++;
                          if (var8 == 0) {
                            continue;
                          }
                        } else {
                          ei.a(200 - param2, param1 + 1, wn.field_k, 0, var4, HoldTheLine.field_F);
                          ei.a(-param2 + 440, 1, gn.field_h, 0, var4, HoldTheLine.field_F);
                          var4 += 30;
                          ei.a(200 - param2, 1, bf.field_a, 0, var4, HoldTheLine.field_F);
                          ei.a(440 - param2, 1, HoldTheLine.field_B, 0, var4, HoldTheLine.field_F);
                          var4 += 30;
                        }
                        break;
                      }
                      if (var8 == 0) {
                        break L2;
                      }
                    }
                  case 3:
                    wb.a(20, ik.field_k, 0, 0, 560, var4 - 20, -param2 + 40, -var4 + 414, -1, 1, HoldTheLine.field_F);
                    var4 += 25;
                    var6 = 1;
                    {
                      L15: while (true) {
                        if (4 > var6) {
                          stackIn_37_0 = 0;
                          if (var8 != 0) {
                            break L15;
                          }
                          var7 = stackIn_37_0;
                          while (var6 > var7) {
                            oi.field_a.b(-param2 + 93 - var7 * 20, var4 + (-20 - (-5 - 20 * var6)));
                            oi.field_a.b(-param2 + (383 - var7 * 20), -20 + var4 - (-5 - 20 * var6));
                            oi.field_a.b(288 - param2 - var7 * 20, 20 * var6 + (60 + var4 + 5));
                            ha.field_k.a(16, var5, 9, 16).a(-(20 * var7) + (95 - param2), 20 * var6 + (var4 - 20 + 7));
                            pk.field_O.a(16, var5, 9, 16).a(-param2 + (385 - 20 * var7), 7 + (-20 + var4) + 20 * var6);
                            na.field_q.a(16, var5, param1 ^ 9, 16).a(290 - param2 - 20 * var7, var6 * 20 + var4 + 60 + 7);
                            var7++;
                          }
                          var6++;
                          continue L15;
                        }
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
                        ei.a(320 - param2, 1, gj.field_v, 0, var4, HoldTheLine.field_F);
                        var4 += 40;
                        stackIn_37_0 = 20;
                        break;
                      }
                      wb.a(stackIn_37_0, mk.field_o, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, param1 - 1, 1, HoldTheLine.field_F);
                      if (var8 == 0) {
                        break L2;
                      }
                      break L5;
                    }
                  case 4:
                    break;
                  default:
                    break L1;
                  case 5:
                    break L4;
                  case 6:
                    break L3;
                }
                wb.a(20, aa.field_p, 0, 0, 560, -20 + var4, -param2 + 40, 414 - var4, -1, 1, HoldTheLine.field_F);
                var4 += 40;
                wb.a(20, hl.field_e, 0, 0, 560, -20 + var4, -param2 + 40, 414 - var4, -1, 1, HoldTheLine.field_F);
                var4 += 80;
                wb.a(20, wb.field_b, 0, 0, 560, var4 - 20, 40 - param2, -var4 + 414, -1, 1, HoldTheLine.field_F);
                var4 += 60;
                wb.a(20, ub.field_D, 0, 0, 560, -20 + var4, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                var4 += 60;
                if (var8 == 0) {
                  break L2;
                }
              }
              wb.a(20, ji.field_n, 0, 0, 560, var4 - 20, -param2 + 40, -var4 + 414, ~param1, 1, HoldTheLine.field_F);
              var4 += 80;
              q.a(hc.field_a, HoldTheLine.field_F, 2, 160 - param2, (byte) -127, var4);
              q.a(o.field_a, HoldTheLine.field_F, 2, 480 - param2, (byte) -128, var4);
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
              am.a(200 - param2, cc.field_A, true, HoldTheLine.field_F, var4, 1);
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
              q.a(pa.field_i, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
              var4 += 20;
              q.a(gi.field_H, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
              var4 += 20;
              q.a(cf.field_t, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
              var4 += 20;
              q.a(kc.field_c, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
              var4 += 20;
              if (var8 == 0) {
                break L2;
              }
            }
            wb.a(20, io.field_f, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, param1 - 1, 1, HoldTheLine.field_F);
          }
        }
    }

    final void b(int param0, int param1) {
        int var3;
        int var4;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        var4 = HoldTheLine.field_D;
        var3 = em.field_i[this.field_o][param0];
        if (18 == var3) {
          if (aa.field_n == 102) {
            ol.field_d = 0;
            decompiledFrameRemainder1 = (var4 != 0);
          }
          if (decompiledFrameRemainder1) {
            if ((aa.field_n == 103) &&
              (decompiledFrameRemainder1 = !(256 <= ol.field_d))) {
              ol.field_d = 256;
              qf.a(293, cf.field_r);
              decompiledFrameRemainder1 = (var4 != 0);
            }
            if (decompiledFrameRemainder1) {
              super.b(param0, -24489);
              decompiledFrameRemainder1 = (var4 != 0);
            }
          }
        } else {
          decompiledFrameRemainder0 = (var3 == 19);
        }
        if ((decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          if (aa.field_n == 102) {
            ll.a(-118, 0);
            decompiledFrameRemainder1 = (var4 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (aa.field_n == 103) {
              ll.a(param1 + 24365, 160);
              decompiledFrameRemainder1 = (var4 != 0);
            }
            if (decompiledFrameRemainder1) {
              super.b(param0, -24489);
              decompiledFrameRemainder1 = (var4 != 0);
            }
          }
        }
        if (decompiledFrameRemainder1) {
          super.b(param0, -24489);
        }
        if (param1 != -24489) {
          this.field_r = 66;
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          field_z = -119;
        }
        return this.field_y == 4 ? true : false;
    }

    private final void e(byte param0) {
        this.field_y = 1;
        if (param0 >= -95) {
          return;
        }
        this.field_s = 50 + 5 * this.field_a;
    }

    private final void l(int param0) {
        int var2 = 0;
        if (this.field_y > 2) {
          return;
        }
        cg.a(-var2 + 40, 140, 560, (byte) 41, 200);
        int var3 = 170;
        nm.field_c.b(nc.field_b, 320 - var2, var3, 2, -1);
        var3 += 40;
        wb.a(20, ko.field_a, 0, 0, 560, -20 + var3, 40 - var2, -var3 + 414, -1, 1, HoldTheLine.field_F);
        if (param0 != 29280) {
          this.field_t = 0.7895873785018921f;
        }
    }

    private final void j(int param0) {
        int var2 = -this.field_s + 50;
        if (this.field_y == 2) {
          var2 = -(this.field_a * 5) + this.field_r + 25;
        }
        if (var2 < 0) {
          var2 = 0;
        }
        int var3 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var2)) + 1.0));
        if (param0 != -5302) {
          return;
        }
        if (this.field_y > 2) {
          var3 = 640;
        }
        tn.field_a = this.a(rf.field_X, (byte) -128, nc.field_g, var3);
        if (tn.field_a != -1) {
          ci.a(0, (byte) 118, this.field_o, tn.field_a);
        }
        ci.field_j = this.a(rf.field_X, param0 + 5465, nc.field_g, var3);
        if (gg.field_J == 1) {
          qf.a(293, cf.field_r);
          if (tn.field_a != -1 &&
            ~tn.field_a != ~ha.field_p) {
            if (pj.field_m != en.field_b ||
              ha.field_p != wa.field_j) {
              this.field_t = this.field_t - 640.0f;
              wa.field_j = ha.field_p;
              en.field_b = pj.field_m;
            }
            this.field_p = 640;
            ha.field_p = tn.field_a;
          }
        }
    }

    final void i(int param0) {
        this.field_y = 2;
        int var2 = 44 / ((param0 + 25) / 61);
        sf.field_m = 0;
    }

    private final void m(int param0) {
        int discarded$0 = 0;
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = HoldTheLine.field_D;
        if (0.0f < this.field_t) {
          if (aa.field_n != 84) {
            if (aa.field_n == 98) {
              this.field_c = 0;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (99 == aa.field_n) {
                this.field_c = 1;
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (96 != aa.field_n ||
                  this.field_c != 1) {
                  if ((aa.field_n != 97 ||
                    this.field_c != 1) &&
                    (decompiledFrameRemainder0 = (this.field_c == 0))) {
                    this.a(true);
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    t.field_l = go.field_g[kn.b((byte) -49).field_p][1];
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  t.field_l = go.field_g[kn.b((byte) -49).field_p][0];
                  decompiledFrameRemainder0 = (var3 != 0);
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if ((this.field_c != 0) &&
              (decompiledFrameRemainder0 = (bl.field_r != null))) {
              if (t.field_l != -1) {
                bl.field_r.field_C[0].a(20385, ge.field_c[t.field_l]);
              }
              wm.a(false, false, -1);
              qf.a(293, cf.field_r);
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.c(this.field_c, param0 ^ 3564);
              decompiledFrameRemainder0 = (var3 != 0);
            }
          }
        }
        if (decompiledFrameRemainder0) {
          if (aa.field_n != 84 ||
            this.field_c != 1) {
            if (aa.field_n != 98 ||
              this.field_o != 10) {
              if (aa.field_n != 99) {
                if (this.field_c == 0) {
                  this.a(true);
                  if (var3 != 0) {
                    this.field_c = 1;
                    this.field_c = 0;
                    this.a((byte) 117, 6, false);
                  }
                }
              } else {
                this.field_c = 1;
                if (var3 != 0) {
                  this.field_c = 0;
                  this.a((byte) 117, 6, false);
                }
              }
            } else {
              this.field_c = 0;
              if (var3 != 0) {
                this.a((byte) 117, 6, false);
              }
            }
          } else {
            this.a((byte) 117, 6, false);
          }
        }
        if (param0 != -1) {
          discarded$0 = this.a(65, -46, 28, -26);
        }
    }

    private final void b(int param0, byte param1, int param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_12_3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_35_3;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = HoldTheLine.field_D;
        var5 = -7 + param3 + param2;
        if (param1 >= -45) {
          return;
        }
        var6 = 0;
        while (true) {
          stackIn_4_0 = -9;
          stackIn_4_1 = ~var6;
          if (stackIn_4_0 < stackIn_4_1) {
            var7 = param2 + 256 * var6 / 16;
            var8 = var7 + 8;
            var9 = var6 * 30 / 16;
            var10 = 22 + param0;
            var11 = var10 - var9;
            tc.b(var7 + var9 / 2, -1 + var11, 10, 0);
            stackIn_39_0 = 1;
            if (var13 == 0) {
              var12 = stackIn_39_0;
              while (var12 <= var9) {
                tc.b(var7 + (var12 / 2 - 1), -var12 + var10, 1, 0);
                stackIn_47_0 = var12 / 2 + var7;
                stackIn_47_1 = var10 - var12;
                stackIn_47_2 = 2;
                stackIn_47_3 = var7;
                stackIn_47_4 = var5;
                if (stackIn_47_3 > stackIn_47_4) {
                  stackIn_12_3 = 4210752;
                } else {
                  stackIn_12_3 = 8421504;
                }
                tc.b(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_12_3);
                stackIn_16_0 = 2 + (var7 + var12 / 2);
                stackIn_16_1 = var10 - var12;
                stackIn_16_2 = 6;
                if (~var9 == ~var12) {
                  if (var5 < var7) {
                    stackIn_19_3 = 4210752;
                  } else {
                    stackIn_19_3 = 8421504;
                  }
                } else {
                  if (var5 >= var7) {
                    stackIn_19_3 = 16777215;
                  } else {
                    stackIn_19_3 = 8421504;
                  }
                }
                tc.b(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_19_3);
                tc.b(8 + (var12 / 2 + var7), -var12 + var10, 1, 0);
                var12++;
              }
              tc.b(-1 + var7, var10, 10, 0);
              if (var7 <= var5 &&
                var5 < var8) {
                var12Lifetime1 = 1;
                while (var12Lifetime1 <= var9) {
                  stackIn_4_0 = var5;
                  stackIn_4_1 = 2 + var7;
                  if (stackIn_4_0 < stackIn_4_1) {
                    tc.b(var5 + var12Lifetime1 / 2, var10 - var12Lifetime1, var7 + (2 - var5), 4210752);
                    stackIn_30_0 = var12Lifetime1 / 2 + (var7 + 2);
                    stackIn_30_1 = var10 - var12Lifetime1;
                    stackIn_30_2 = 6;
                    if (~var9 != ~var12Lifetime1) {
                      stackIn_31_3 = 8421504;
                    } else {
                      stackIn_31_3 = 4210752;
                    }
                    tc.b(stackIn_30_0, stackIn_30_1, stackIn_30_2, stackIn_31_3);
                  } else {
                    stackIn_34_0 = var5 + var12Lifetime1 / 2;
                    stackIn_34_1 = -var12Lifetime1 + var10;
                    stackIn_34_2 = var7 - (-8 + var5);
                    if (var12Lifetime1 == var9) {
                      stackIn_35_3 = 4210752;
                    } else {
                      stackIn_35_3 = 8421504;
                    }
                    tc.b(stackIn_34_0, stackIn_34_1, stackIn_34_2, stackIn_35_3);
                  }
                  var12Lifetime1++;
                }
              }
              var6++;
              continue;
            }
          } else {
            stackIn_39_0 = 0;
          }
          var6 = stackIn_39_0;
          while (true) {
            if (var6 >= 4) {
              return;
            }
            tc.b(-var6 + (param3 + param2) - 7, param0 + (var6 + 22), 1 + var6 * 2, 16711680);
            var6++;
            if (var13 != 0) {
              return;
            }
          }
        }
    }

    private final void c(byte param0) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
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
        int var5Lifetime1;
        var12 = HoldTheLine.field_D;
        cg.a(60, 101, 520, (byte) 41, 320);
        qe.field_a = 0;
        var2 = 160;
        var3 = 125;
        var4 = 0;
        if (param0 != -18) {
          return;
        }
        var5 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var5 >= 16))) {
          var6_int = e.field_d[var5];
          stackIn_10_0 = 0;
          stackIn_10_1 = 1 << var6_int & ii.field_c;
          if (var12 == 0) {
            if (stackIn_10_0 != stackIn_10_1) {
              this.a(true, var6_int, vl.field_h[var6_int], var3, 12, var2);
              var2 += 40;
              var4++;
              if (9 == var4) {
                var3 += 40;
                var2 = 180;
              }
            }
            var5++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = -1;
          stackIn_10_1 = ok.field_e;
        }
        if (stackIn_10_0 != stackIn_10_1) {
          stackIn_13_0 = ok.field_e;
        } else {
          stackIn_13_0 = v.field_E;
        }
        var5Lifetime1 = stackIn_13_0;
        if (-1 != var5Lifetime1) {
          this.a(false, var5Lifetime1, 128, 291, param0 + 30, 320);
          am.a(200, pf.field_b, true, HoldTheLine.field_F, 252, 0);
          ei.a(440, 1, vj.field_o, 0, 252, HoldTheLine.field_F);
          q.a(Integer.toString(le.field_o[var5Lifetime1][0]), HoldTheLine.field_F, 0, 140, (byte) -128, 282);
          var6 = pf.a((byte) -123);
          var7 = le.field_o[var5Lifetime1][1];
          var8 = sf.field_m / 15 % (var7 + 2);
          var9 = sf.field_m / 5 % 3;
          var10 = 0;
          while (true) {
            if (var10 < var7) {
              var11 = 0;
              stackIn_25_0 = var8;
              if (var12 == 0) {
                if (stackIn_25_0 != var10) {
                  if (~var10 == ~(var8 - 1)) {
                    var11 = -var9 + 3;
                  }
                } else {
                  var11 = var9;
                }
                var6.d(-var11 + 460 + 16 * var10, -var11 + 262, 32 + 2 * var11, 32 + var11 * 2);
                var10++;
                continue;
              }
            } else {
              nm.field_c.b(ae.field_c[var5Lifetime1], 320, 217, 0, -1);
              stackIn_25_0 = 20;
            }
            break;
          }
          wb.a(stackIn_25_0, lf.field_j[var5Lifetime1], 0, 0, 400, 362, 120, 80, param0 + 17, 1, HoldTheLine.field_F);
        }
        fl.a(p.field_b, 0, 0, -1753, 448);
        return;
    }

    final static void k(int param0) {
        if (param0 >= -77) {
          ti.a(56, 62, (byte) 72);
        }
        ce.field_n.field_c = 0;
        ce.field_n.field_f = 0;
    }

    private final void i(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (this.field_y > 2) {
          return;
        }
        if (param1 != -11468) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_y != 1) {
          this.a(ih.field_p, 0, param0);
          decompiledFrameRemainder0 = (var4 != 0);
        }
        if (decompiledFrameRemainder0) {
          var3 = 0;
          while (var3 < 7) {
            this.a(var3, 0, (int)this.field_t + param0 - 640 * var3);
            var3++;
            if (var4 != 0) {
              break;
            }
          }
        }

    }

    private final void f(int param0, int param1) {
        boolean stackIn_7_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        boolean stackOut_6_0;
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
        int var6Lifetime1;
        var13 = HoldTheLine.field_D;
        if (this.field_y > 2) {
          return;
        }
        if (param0 <= 4) {
          this.f((byte) -103);
        }
        cg.a(60 - param1, 101, 520, (byte) 41, 320);
        qe.field_a = 0;
        var3 = 156;
        var4 = 125;
        var5 = 0;
        var6 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (16 <= var6))) {
          stackOut_6_0 = this.h(var6, 176);
          stackIn_15_0 = stackOut_6_0 ? 1 : 0;
          stackIn_7_0 = stackOut_6_0;
          if (var13 == 0) {
            if (stackIn_7_0) {
              var7_int = e.field_d[var6];
              this.a(true, var7_int, vl.field_h[var7_int], var4, 12, -param1 + var3);
              var3 += 46;
              var5++;
              if (var5 == 8) {
                var4 += 40;
                var3 = 179;
                if (this.h(15, 176)) {
                  var3 -= 23;
                }
              }
            }
            var6++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_15_0 = 0;
        }
        if (stackIn_15_0 != ~ok.field_e) {
          stackIn_18_0 = ok.field_e;
        } else {
          stackIn_18_0 = v.field_E;
        }
        var6Lifetime1 = stackIn_18_0;
        if (var6Lifetime1 != -1) {
          this.a(false, var6Lifetime1, 128, 276, 12, -param1 + 320);
          am.a(200 - param1, pf.field_b, true, HoldTheLine.field_F, 252, 0);
          ei.a(-param1 + 440, 1, vj.field_o, 0, 252, HoldTheLine.field_F);
          q.a(Integer.toString(le.field_o[var6Lifetime1][0]), HoldTheLine.field_F, 0, -param1 + 160, (byte) -127, 282);
          var7 = pf.a((byte) -123);
          var8 = le.field_o[var6Lifetime1][1];
          var9 = sf.field_m / 15 % (2 + var8);
          var10 = sf.field_m / 5 % 3;
          var11 = 0;
          while (true) {
            if (var11 < var8) {
              var12 = 0;
              stackIn_29_0 = var11;
              stackIn_29_1 = var9;
              if (var13 == 0) {
                if (stackIn_29_0 != stackIn_29_1) {
                  if (~var11 == ~(var9 - 1)) {
                    var12 = 3 - var10;
                  }
                } else {
                  var12 = var10;
                }
                var7.d(-var12 + (460 + (-param1 + 16 * var11)), 262 - var12, 32 + 2 * var12, 32 + 2 * var12);
                var11++;
                continue;
              }
            } else {
              stackIn_29_0 = 0;
              stackIn_29_1 = field_z & 1 << var6Lifetime1;
            }
            break;
          }
          if (stackIn_29_0 != stackIn_29_1) {
            q.a(ln.field_j, HoldTheLine.field_F, 1, 320 - param1, (byte) -127, 357);
          }
          if ((stackIn_29_0 == stackIn_29_1 ||
            var13 != 0) &&
            sf.field_m % 80 < 40) {
            q.a(fc.field_b, HoldTheLine.field_F, 2, 320 - param1, (byte) -127, 352);
          }
          nm.field_c.b(ae.field_c[var6Lifetime1], 320 - param1, 207, 0, -1);
          wb.a(20, lf.field_j[var6Lifetime1], 0, 0, 400, 357, 120 - param1, 80, -1, 1, HoldTheLine.field_F);
        }
        if ((var6Lifetime1 == -1 ||
          var13 != 0) &&
          pj.b((byte) 104)) {
          q.a(nk.field_M, HoldTheLine.field_F, 0, 320 - param1, (byte) -127, 270);
          q.a(ue.field_b, HoldTheLine.field_F, 0, 320 - param1, (byte) -128, 290);
        }
        fl.a(p.field_b, param1, 0, -1753, 448);
        return;
    }

    private final void b(int param0, boolean param1) {
        int discarded$1 = 0;
        int var3;
        int var4;
        int stackIn_5_0 = 0;
        boolean stackIn_6_1 = false;
        var4 = HoldTheLine.field_D;
        if (param0 != 0) {
          discarded$1 = this.b(123, -77, -90);
        }
        boolean decompiledFrameRemainder0 = true;
        if (hn.field_T) {
          stackIn_5_0 = -86;
          stackIn_6_1 = !(param1);
          var3 = pd.$cfr$intArgs$a$b925f3f4834c(stackIn_5_0, stackIn_6_1);
          switch (var3) {
            default:
              break;
            case 2:
              this.a((byte) 117, 0, true);
              if (var4 == 0) {
                break;
              }
            case 1:
              this.a((byte) 117, 0, false);
              if (var4 == 0) {
                break;
              }
            case 3:
              ch.a(en.a(99), (byte) 65);
              break;
          }
          decompiledFrameRemainder0 = (var4 != 0);
        }
        if (decompiledFrameRemainder0) {
          kc.field_a.a(180);
          rm.field_A.a(param0 + 8192);
          jf.field_a.a(8192);
          bo.field_d.a(8192);
          if (kc.field_a.a((byte) 127) &&
            rm.field_A.b((byte) 10) &&
            jf.field_a.b((byte) 10) && bo.field_d.b((byte) 10)) {
            gd.a(di.field_w, rm.field_A.field_b, 0);
            wj.a(0, 19189, 80, 20, 50, 0, -1500, jf.field_a.field_b, 80);
            te.a(param0 - 4, kc.field_a.field_i);
            nm.a(bo.field_d.field_b, 22210);
            oh.a(true, true);
            hn.field_T = true;
          }
        }

    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        hj stackIn_18_0 = null;
        int var7;
        int var8;
        int var9;
        hj var10;
        int var11;
        var11 = HoldTheLine.field_D;
        stackIn_3_0 = (0 == (1 << param1 & field_z)) ? 0 : 1;
        var7 = stackIn_3_0;
        stackIn_6_0 = ((1 << param1 & 65284) == 0) ? 0 : 1;
        var8 = stackIn_6_0;
        stackIn_9_0 = (param2 != 32) ? 0 : 1;
        L3: {
          var9 = stackIn_9_0;
          if (var7 != 0) {
            var10 = ak.a(param4 - 48, var9 != 0, param1);
            if (var11 == 0) {
              break L3;
            }
          }
          if (var8 != 0 ||
            of.a(param4 - 981)) {
            var10 = ak.a(param4 ^ -108, var9 != 0, -1);
            if (var11 != 0) {
              if (var9 == 0) {
                stackIn_18_0 = kj.field_q;
              } else {
                stackIn_18_0 = ka.field_f;
              }
              var10 = stackIn_18_0;
            }
          } else {
            if (var9 == 0) {
              stackIn_18_0 = kj.field_q;
            } else {
              stackIn_18_0 = ka.field_f;
            }
            var10 = stackIn_18_0;
          }
        }
        if (var9 == 0) {
          if (param2 != 128) {
            var10.d(-(param2 >> 1) + param5, -(param2 >> 1) + param3, param2, param2);
            if (var11 != 0) {
              var10.a(-64 + param5, param3 - 64);
              var10.a(-16 + param5, -16 + param3);
            }
          } else {
            var10.a(-64 + param5, param3 - 64);
            if (var11 != 0) {
              var10.a(-16 + param5, -16 + param3);
            }
          }
        } else {
          var10.a(-16 + param5, -16 + param3);
        }
        if (param4 == param1 &&
          var7 != 0) {
          pe.a(param2, 4209, param5, param3);
        }
        if (param0) {
          dm.field_e[qe.field_a] = param5;
          co.field_d[qe.field_a] = param3;
          kn.field_b[qe.field_a] = param2;
          nk.field_J[qe.field_a] = param1;
          qe.field_a = qe.field_a + 1;
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        if (param0 != 117) {
          return;
        }
        qf.a(293, cf.field_r);
        this.a(param1, param2, param0 ^ -95);
    }

    final void f(int param0) {
        this.field_y = 2;
        ie.field_n = -ie.field_n + 80;
        this.field_r = -this.field_s + (this.field_a * 5 + 25);
        if (param0 != 0) {
          this.field_w = 0;
        }
    }

    private final void f(byte param0) {
        v.field_E = this.b(-21, nc.field_g, rf.field_X);
        if (gg.field_J == 1) {
          qf.a(293, cf.field_r);
          if (~ok.field_e != ~v.field_E) {
            if (v.field_E != -1) {
              ok.field_e = v.field_E;
              if (HoldTheLine.field_D != 0) {
                ok.field_e = -1;
              }
            }
          } else {
            ok.field_e = -1;
          }
        }
        if (param0 <= 82) {
          this.a(49, false);
        }
    }

    final void b(boolean param0, int param1) {
        String[][] array$0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_26_1 = 0;
        String[][] stackIn_31_0 = null;
        String[][] stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        String[] stackIn_36_3 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        this.field_y = 0;
        this.field_w = 0;
        this.field_r = 0;
        this.field_s = 0;
        var3 = 0;
        do {
          if (var3 >= this.field_q.length) {
            bd.field_S = -20;
            sf.field_m = 0;
            break;
          }
          this.field_q[var3] = 0;
          var3++;
        } while (var5 == 0);
        if (this.field_o == 4 ||
          this.field_o == 5) {
          ih.field_p = 0;
        }
        boolean decompiledFrameCompleted0 = true;
        if (this.field_o == 2 ||
          this.field_o == 3) {
          var3 = 0;
          while (var3 < 4) {
            mg.field_g[var3] = null;
            var3++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_21_1 = !(param0);
          this.field_g = stackIn_21_1;
          v.field_E = -1;
          this.field_t = 0.0f;
          ca.field_s = 0;
          qd.field_h = 2;
          this.field_p = 0;
          ci.field_j = -1;
        }
        if (10 != this.field_o &&
          this.field_o != 11) {
          stackIn_26_1 = 0;
        } else {
          stackIn_26_1 = 1;
        }
        this.field_c = stackIn_26_1;
        qe.field_a = 0;
        ok.field_e = -1;
        g.field_o = 0;
        this.field_v = -1;
        if (this.field_o == 0 &&
          cf.field_v != -1) {
          this.field_c = cf.field_v;
        }
        this.a((byte) 117);
        var3 = cf.field_w;
        array$0 = new String[1][];
        stackIn_31_0 = array$0;
        stackIn_31_1 = array$0;
        stackIn_31_2 = 0;
        if (10 != this.field_o) {
          if (2 == this.field_o) {
            stackIn_36_3 = ga.field_k;
          } else {
            if (this.field_o != 3) {
              stackIn_36_3 = null;
            } else {
              stackIn_36_3 = ga.field_k;
            }
          }
        } else {
          stackIn_36_3 = v.field_A[var3];
        }
        stackIn_31_1[stackIn_31_2] = stackIn_36_3;
        om.a(stackIn_31_0, 79, this.field_o);
        if (param1 >= -81) {
          this.field_q = (int[]) null;
        }
        var4 = 0;
        do {
          if (var4 >= 16) {
            if (!hn.field_T) {
              return;
            }
            break;
          }
          vl.field_h[var4] = 32;
          var4++;
        } while (var5 == 0);
        oh.a(param0, true);
        return;
    }

    private final void b(byte param0) {
        boolean discarded$0 = false;
        if (param0 >= -56) {
          discarded$0 = this.h(45, -17);
        }
        this.field_y = 4;
        this.field_w = 40;
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_45_0 = false;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        var3 = em.field_i[this.field_o][param1];
        switch ((var4 == 0
          || var3 == 10
          || var3 == 19
          || var3 == 21
          ) ? var3 : -1) {
          case 10:
          case 5:
            fieldTemp$0 = g.field_o + 1;
            g.field_o = g.field_o + 1;
            if (fieldTemp$0 <= 1) {
              break;
            }
            g.field_o = 0;
            if (var4 == 0) {
              break;
            }
          case 24:
            fieldTemp$1 = ca.field_s + 1;
            ca.field_s = ca.field_s + 1;
            if (fieldTemp$1 <= 3) {
              break;
            }
            ca.field_s = 0;
            if (var4 == 0) {
              break;
            }
          case 25:
            fieldTemp$2 = qd.field_h + 1;
            qd.field_h = qd.field_h + 1;
            stackIn_24_0 = ~fieldTemp$2;
            if (ih.field_p != -1 + od.field_i.length) {
              stackIn_25_1 = 2;
            } else {
              stackIn_25_1 = 1;
            }
            if (stackIn_24_0 >= ~stackIn_25_1) {
              break;
            }
            stackIn_30_0 = (ih.field_p == 0) ? 1 : 0;
            qd.field_h = stackIn_30_0;
            if (var4 == 0) {
              break;
            }
          case 18:
            if (ol.field_d >= 224) {
              if (ol.field_d >= 256) {
                break;
              }
              ol.field_d = 256;
              qf.a(293, cf.field_r);
              if (var4 == 0) {
                break;
              }
            }
            ol.field_d = 32 * (1 + ol.field_d * 8 / 256);
            qf.a(293, cf.field_r);
            if (var4 == 0) {
              break;
            }
          case 19:
            if (mk.field_e < 140) {
              ll.a(-108, 20 * (8 * mk.field_e / 160) + 20);
              if (var4 == 0) {
                break;
              }
            }
            ll.a(-125, 160);
            if (var4 == 0) {
              break;
            }
          case 21:
            qf.a(293, cf.field_r);
            stackIn_45_0 = !(em.field_o);
            em.field_o = stackIn_45_0;
            this.field_q[param1] = 50;
          default:
            break;
        }
        if (param0 <= 97) {
          this.field_v = -111;
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_86_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_108_1 = 0;
        boolean stackIn_160_0 = false;
        boolean stackIn_160_1 = false;
        int stackIn_161_2 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          L17: {
                                            L18: {
                                              L19: {
                                                L20: {
                                                  L21: {
                                                    var7 = HoldTheLine.field_D;
                                                    var4 = -78 % ((param2 - 36) / 41);
                                                    var6 = param0;
                                                    if (var6 != 2) {
                                                      if (var6 == 13 &&
                                                        var7 == 0) {
                                                        break L21;
                                                      }
                                                      if (var6 == 14 &&
                                                        var7 == 0) {
                                                        break L20;
                                                      }
                                                      if (var6 == 15) {
                                                        break L19;
                                                      }
                                                      if (var6 == 16 &&
                                                        var7 == 0) {
                                                        break L18;
                                                      }
                                                      if (var6 == 17 &&
                                                        var7 == 0) {
                                                        break L17;
                                                      }
                                                      if (var6 == 0 &&
                                                        var7 == 0) {
                                                        break L16;
                                                      }
                                                      if (var6 == 3) {
                                                        break L15;
                                                      }
                                                      if (var6 == 7 &&
                                                        var7 == 0) {
                                                        break L14;
                                                      }
                                                      if (var6 == 8 &&
                                                        var7 == 0) {
                                                        break L13;
                                                      }
                                                      if (var6 == 4 &&
                                                        var7 == 0) {
                                                        break L12;
                                                      }
                                                      if (5 == var6 &&
                                                        var7 == 0) {
                                                        break L11;
                                                      }
                                                      if (var6 == 9) {
                                                        break L10;
                                                      }
                                                      if (var6 == 10 &&
                                                        var7 == 0) {
                                                        break L9;
                                                      }
                                                      if (var6 == 11 &&
                                                        var7 == 0) {
                                                        break L8;
                                                      }
                                                      switch (var6) {
                                                        case 24:
                                                          break L7;
                                                        case 25:
                                                          break L6;
                                                        case 12:
                                                          break L5;
                                                        case 6:
                                                          break L4;
                                                        case 26:
                                                          break L3;
                                                        default:
                                                          break L0;
                                                        case 1:
                                                          if (var7 == 0) {
                                                            break L2;
                                                          }
                                                          break;
                                                      }
                                                    }
                                                    wm.a(param1, false, -1);
                                                    if (var7 == 0) {
                                                      break L1;
                                                    }
                                                  }
                                                  wm.a(param1, false, 2);
                                                  this.field_v = param0;
                                                  if (var7 == 0) {
                                                    break L1;
                                                  }
                                                }
                                                wm.a(param1, false, 6);
                                                this.field_v = param0;
                                                if (var7 == 0) {
                                                  break L1;
                                                }
                                              }
                                              wm.a(param1, false, 4);
                                              this.field_v = param0;
                                              if (var7 == 0) {
                                                break L1;
                                              }
                                            }
                                            wm.a(param1, false, 5);
                                            this.field_v = param0;
                                            if (var7 == 0) {
                                              break L1;
                                            }
                                          }
                                          if (null == kf.field_U) {
                                            oe.b((byte) 108);
                                            if (var7 == 0) {
                                              break L1;
                                            }
                                          }
                                          em.a(-29486, false);
                                          if (var7 == 0) {
                                            break L1;
                                          }
                                        }
                                        if (of.a(-969) ||
                                          this.field_o != 9 &&
                                          7 != this.field_o &&
                                          8 != this.field_o &&
                                          this.field_o != 3) {
                                          wm.a(param1, false, 0);
                                          if (var7 == 0) {
                                            break L1;
                                          }
                                        }
                                        wm.a(param1, false, 12);
                                        if (var7 == 0) {
                                          break L1;
                                        }
                                      }
                                      wm.a(param1, false, lm.field_a);
                                      if (var7 == 0) {
                                        break L1;
                                      }
                                    }
                                    bl.field_r.field_mb = -1;
                                    qn.a(7, param1, true);
                                    if (var7 == 0) {
                                      break L1;
                                    }
                                  }
                                  if (this.field_o == 10 &&
                                    0.0f < this.field_t &&
                                    3 == ek.field_x) {
                                    wm.a(param1, false, 13);
                                    if (var7 == 0) {
                                      break L1;
                                    }
                                  }
                                  this.a(7, param1, -12);
                                  if (var7 == 0) {
                                    break L1;
                                  }
                                }
                                wm.a(param1, false, 3);
                                if (var7 == 0) {
                                  break L1;
                                }
                              }
                              if (g.field_o != 0) {
                                stackIn_86_1 = 0;
                              } else {
                                stackIn_86_1 = 4;
                              }
                              this.a(stackIn_86_1, param1, -24);
                              if (var7 == 0) {
                                break L1;
                              }
                            }
                            if (this.field_o == 2 ||
                              this.field_o == 6) {
                              i.a((byte) 71, true);
                              if (var7 == 0) {
                                break L1;
                              }
                            }
                            if (this.field_o == 9) {
                              if (mi.field_d == 7) {
                                stackIn_97_0 = (ii.field_c == 0) ? 3 : 7;
                                var6 = stackIn_97_0;
                                if (var7 != 0) {
                                  stackIn_101_0 = (0 != ii.field_c) ? 8 : 12;
                                  var6 = stackIn_101_0;
                                }
                              } else {
                                stackIn_101_0 = (0 != ii.field_c) ? 8 : 12;
                                var6 = stackIn_101_0;
                              }
                              qf.a(var6, true, 3865, param1);
                              if (var7 == 0) {
                                break L1;
                              }
                            }
                            ch.a(en.a(98), (byte) 47);
                            if (var7 == 0) {
                              break L1;
                            }
                          }
                          if (g.field_o == 0) {
                            stackIn_108_1 = 9;
                          } else {
                            stackIn_108_1 = 0;
                          }
                          this.a(stackIn_108_1, param1, -35);
                          if (var7 == 0) {
                            break L1;
                          }
                        }
                        eb.field_o = null;
                        field_z = 0;
                        ii.field_c = 0;
                        wm.a(param1, false, 12);
                        if (var7 == 0) {
                          break L1;
                        }
                      }
                      if (-1 == ca.field_s &&
                        var7 == 0) {
                        break L1;
                      }
                      if (ca.field_s == 0) {
                        this.a(0, param1, -125);
                        if (var7 == 0) {
                          break L1;
                        }
                      }
                      var5 = -1 + ca.field_s;
                      if (~var5 == ~pj.field_m) {
                        break L1;
                      }
                      if (~en.field_b != ~pj.field_m ||
                        ~ha.field_p != ~wa.field_j) {
                        this.field_t = this.field_t - 640.0f;
                        en.field_b = pj.field_m;
                        wa.field_j = ha.field_p;
                      }
                      pj.field_m = var5;
                      this.field_p = 640;
                      if (var7 == 0) {
                        break L1;
                      }
                    }
                    if (qd.field_h != 0) {
                      if (2 == qd.field_h) {
                        if (ih.field_p >= 6) {
                          break L0;
                        }
                        fieldTemp$0 = ih.field_p + 1;
                        ih.field_p = ih.field_p + 1;
                        if (fieldTemp$0 == 6) {
                          qd.field_h = 1;
                        }
                        this.field_p = 640 * ih.field_p;
                        if (var7 == 0) {
                          break L1;
                        }
                      }
                      if (qd.field_h != 1) {
                        break L0;
                      }
                      wm.a(param1, false, lm.field_a);
                      if (var7 == 0) {
                        break L1;
                      }
                    }
                    if (0 >= ih.field_p) {
                      break L0;
                    }
                    fieldTemp$1 = ih.field_p - 1;
                    ih.field_p = ih.field_p - 1;
                    if (0 == fieldTemp$1) {
                      qd.field_h = 2;
                    }
                    this.field_p = ih.field_p * 640;
                    if (var7 == 0) {
                      break L1;
                    }
                  }
                  if (!nd.field_e) {
                    wm.a(param1, false, 13);
                    this.field_v = param0;
                    if (var7 == 0) {
                      break L1;
                    }
                  }
                  hf.c(0);
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if (ek.field_x != 2 &&
                  ek.field_x != 6) {
                  if (ek.field_x != 4 &&
                    ek.field_x != 5) {
                    ij.a(param1, -81);
                    if (var7 == 0) {
                      break L1;
                    }
                  }
                  if (pj.b((byte) 108)) {
                    if (0 != ii.field_c ||
                      ad.field_a) {
                      wm.a(param1, false, 9);
                      if (var7 == 0) {
                        break L1;
                      }
                    }
                    wm.a(param1, false, 12);
                    if (var7 == 0) {
                      break L1;
                    }
                  }
                  if (ii.field_c == 0) {
                    stackIn_160_0 = param1;
                    stackIn_160_1 = false;
                    if (of.a(-969)) {
                      stackIn_161_2 = 0;
                    } else {
                      stackIn_161_2 = 12;
                    }
                    wm.a(stackIn_160_0, stackIn_160_1, stackIn_161_2);
                    if (var7 == 0) {
                      break L1;
                    }
                  }
                  wm.a(param1, false, 8);
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if (pj.b((byte) 102)) {
                  wm.a(param1, false, 9);
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if (ii.field_c == 0) {
                  wm.a(param1, false, 3);
                  if (var7 == 0) {
                    break L1;
                  }
                }
                wm.a(param1, false, 7);
                if (var7 == 0) {
                  break L1;
                }
              }
              hf.c(0);
              if (var7 == 0) {
                break L1;
              }
            }
            te.a(true);
          }
        }
    }

    final static void c(boolean param0) {
        if (null != mc.field_a) {
          return;
        }
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
        if (param0) {
          return;
        }
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
    }

    public static void g(int param0) {
        field_u = null;
        if (param0 != -21006) {
          ti.k(-12);
        }
        field_x = null;
    }

    private final void a(boolean param0, int param1) {
        int stackIn_8_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (!param0) {
          this.j(35);
        }
        var3 = 0;
        L2: while (true) {
          if (var3 < 4) {
            stackIn_18_1 = ~var3;
            stackIn_18_2 = ~tn.field_a;
            if (var4 == 0) {
              if (stackIn_18_1 == stackIn_18_2) {
                stackIn_8_1 = 4210752;
              } else {
                stackIn_8_1 = wd.field_l[var3];
              }
              stackIn_10_2 = 2;
              if (~tn.field_a == ~var3) {
                stackIn_11_3 = 16777215;
              } else {
                stackIn_11_3 = vk.field_q[var3];
              }
              this.a(stackIn_8_1, stackIn_10_2, stackIn_11_3, 2, var3 * 128 + 128 - param1, 110, 80, p.a(0, (byte) -83, var3), 60);
              var3++;
              continue;
            }
          } else {
            bn.a(ha.field_p + 4, -107);
            if (pj.b((byte) 118)) {
              cg.a(30 - param1, 170, 580, (byte) 41, 260);
              var3 = 280;
              q.a(nk.field_M, nm.field_c, 0, -param1 + 320, (byte) -128, var3 - nm.field_c.field_G);
              q.a(ue.field_b, nm.field_c, 0, -param1 + 320, (byte) -127, var3);
              if (var4 == 0) {
                break L2;
              }
            }
            if (1 == this.field_y) {
              this.a(en.field_b, -(int)this.field_t + param1, wa.field_j, (byte) 116);
              this.a(pj.field_m, -(int)this.field_t + (param1 + 640), ha.field_p, (byte) -108);
              if (var4 == 0) {
                break L2;
              }
            }
            stackIn_18_1 = en.field_b;
            stackIn_18_2 = param1;
          }
          this.a(stackIn_18_1, stackIn_18_2, ha.field_p, (byte) 83);
          break;
        }
        ni.field_a.b(e.field_b, 320 + param1, 474, 0, -1);
        return;
    }

    private final void c(int param0, boolean param1) {
        bn.a(7, -119);
        b.field_c.a(param1);
        if (hn.field_T) {
          en.a((byte) 49);
        }
    }

    private final boolean h(int param0, int param1) {
        int var3;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        if (param1 != 176) {
          this.field_t = 0.4921543300151825f;
        }
        stackIn_5_0 = ((1 << param0 & field_z) == 0) ? 0 : 1;
        var3 = stackIn_5_0;
        stackIn_11_0 = (var3 != 0) || (15 != param0) || (kb.a(16616, 0));
        return stackIn_11_0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, hj param7, int param8) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = HoldTheLine.field_D;
        try {
          var10_int = param4 - param6 / 2;
          var11 = param5 - param8 / param1;
          var12 = var10_int + param6;
          var13 = var11 + param8;
          var14 = 0;
          L2: while (true) {
            if (var14 < param3) {
              tc.b(var10_int + (-1 - var14), -var14 + (var11 - 1), var14 * 2 + (2 + param6), param2);
              tc.b(-var14 - 1 + var10_int, var13 + var14, param6 + 2 + var14 * 2, param0);
              tc.h(var10_int - (1 + var14), var11 - var14, 2 * var14 + param8, param2);
              tc.h(var12 + var14, var11 - var14, 2 * var14 + param8, param0);
              var14++;
              if (var15 == 0) {
                continue;
              }
            } else {
              if (param6 == param7.field_s &&
                param8 == param7.field_y) {
                break L2;
              }
              param7.a(var10_int, var11, param6, param8);
            }
            if (var15 == 0) {
              return;
            }
            break;
          }
          param7.b(var10_int, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("ti.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param8).append(')').toString());
        }
    }

    final void e(int param0) {
        this.field_a = em.field_i[this.field_o].length;
        int var2 = 76 % ((param0 - 25) / 35);
        this.field_q = new int[this.field_a];
    }

    final void a(int param0, boolean param1) {
        boolean stackIn_33_0 = false;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int var3 = 0;
        float var3_float = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        var5 = HoldTheLine.field_D;
        if (gg.field_J == 1) {
          if (0 == this.field_y) {
            gg.field_J = 0;
            this.e((byte) -116);
          }
          if (this.field_y == 2 ||
            this.field_y == 3) {
            gg.field_J = 0;
            this.b((byte) -100);
          }
        }
        boolean decompiledFrameCompleted0 = true;
        if (this.field_o != 12 &&
          this.field_y <= 1) {
          while (qh.c(-47)) {
            stackIn_107_0 = aa.field_n;
            stackIn_107_1 = 13;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_107_0 == stackIn_107_1 &&
              0 != this.field_o &&
              em.field_i[this.field_o].length > 0 && (2 == em.field_i[this.field_o][0] ||
              0 == em.field_i[this.field_o][0] ||
              em.field_i[this.field_o][0] == 4 ||
              em.field_i[this.field_o][0] == 3)) {
              this.c(0, -3565);
            }
            if (mg.field_c) {
              if (aa.field_n == 28) {
                hn.field_T = false;
                wm.a(false, false, 12);
              }
              if (aa.field_n == 1) {
                stackIn_33_0 = !(kb.field_c);
                kb.field_c = stackIn_33_0;
              }
            }
            if (mg.field_c &&
              aa.field_n == 1 &&
              mg.field_c &&
              lk.field_g[82]) {
              ao.field_b = 3;
              l.field_b = true;
              hk.field_d = -1 + pc.field_l[3];
            }
            if (2 != this.field_o &&
              3 != this.field_o) {
              if (this.field_o == 10 ||
                11 == this.field_o) {
                this.m(-1);
                continue;
              }
              if (this.field_o != 4 &&
                this.field_o != 5) {
                this.a(true);
                continue;
              }
              this.a(true);
              if (-1 == this.field_c) {
                continue;
              }
              if (em.field_i[this.field_o][this.field_c] != 25) {
                continue;
              }
              if (!(2 <= qd.field_h) ||
                ih.field_p != -1 + od.field_i.length) {
                if (qd.field_h > 0) {
                  continue;
                }
                if (0 != ih.field_p) {
                  continue;
                }
              }
              qd.field_h = 1;
              continue;
            }
            this.o(-1);
          }
          if ((decompiledFrameCompleted0) &&
            (na.field_k)) {
            this.b(12515);
            if (this.field_o == 2 ||
              this.field_o == 3) {
              this.j(-5302);
            }
            if (10 == this.field_o ||
              this.field_o == 11) {
              this.d((byte) -88);
            }
            if (this.field_o == 6 ||
              this.field_o == 7 ||
              this.field_o == 8 ||
              this.field_o == 9) {
              this.f((byte) 98);
            }
          }
        }
        if (decompiledFrameCompleted0) {
          var3 = 0;
          L25: while (true) {
            if (this.field_q.length > var3) {
              stackIn_90_0 = ~this.field_q[var3];
              stackIn_90_1 = -1;
              if (var5 == 0) {
                if (stackIn_90_0 < stackIn_90_1) {
                  this.field_q[var3] = this.field_q[var3] - 1;
                }
                var3++;
                continue;
              }
            } else {
              if (this.field_y == 0) {
                if (this.field_s == 0) {
                  bd.a(17405, 64, 0, j.field_c.field_f);
                  bd.a(17405, 64, 256, j.field_c.field_h);
                }
                this.field_s = this.field_s + 1;
                if (~(this.field_a * 5 + 25) != ~this.field_s) {
                  break L25;
                }
                this.field_y = 1;
                if (var5 == 0) {
                  break L25;
                }
              }
              stackIn_90_0 = 2;
              stackIn_90_1 = this.field_y;
            }
            if (stackIn_90_0 != stackIn_90_1) {
              if (this.field_y != 3) {
                break L25;
              }
              this.field_w = this.field_w + 1;
              if (40 > this.field_w) {
                break L25;
              }
              this.field_y = 4;
              if (var5 == 0) {
                break L25;
              }
            }
            this.field_r = this.field_r + 1;
            var3 = this.field_r + 25 - 5 * (1 + this.field_a);
            var4 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var3)) + 1.0));
            if (var4 < -260) {
              this.field_y = 3;
            }
            break;
          }
          sf.field_m = sf.field_m + 1;
          if ((float)this.field_p != this.field_t) {
            var3_float = (float)this.field_p - this.field_t;
            this.field_t = this.field_t + var3_float * 0.20000000298023224f;
            if (1.0f > var3_float && (this.field_o == 2 ||
              this.field_o == 3)) {
              this.field_p = 0;
              this.field_t = 0.0f;
              en.field_b = pj.field_m;
              wa.field_j = ha.field_p;
            }
          }
          stackIn_107_0 = -125;
          stackIn_107_1 = (-30 - param0) / 62;
        }
        var3Lifetime1 = stackIn_107_0 % stackIn_107_1;
        if (this.field_o == 6 ||
          7 == this.field_o ||
          this.field_o == 8) {
          this.d(1);
        }
        if (this.field_o == 12) {
          this.b(0, param1);
        }
    }

    final int a(boolean param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = HoldTheLine.field_D;
        if (param0) {
          this.a(true, -31, -22, -74, -57, -16);
        }
        var4 = -1;
        var5 = 0;
        while (true) {
          if (!(this.field_a > var5)) {
            stackIn_10_0 = var4;
            stackIn_10_1 = -1;
            break;
          }
          var6 = param1 - this.e(var5, 6);
          stackIn_10_0 = -1;
          stackIn_10_1 = ~var6;
          if (var7 == 0) {
            if (stackIn_10_0 >= stackIn_10_1 &&
              var6 <= 30) {
              var4 = var5;
            }
            var5++;
            continue;
          }
          break;
        }
        if (stackIn_10_0 == stackIn_10_1) {
          return -1;
        }
        if (em.field_i[this.field_o][var4] == 5) {
          g.field_o = fj.a(va.field_c, (byte) -119, param2);
          return var4;
        }
        if (em.field_i[this.field_o][var4] == 10) {
          g.field_o = fj.a(qd.field_l, (byte) -119, param2);
          return var4;
        }
        if (em.field_i[this.field_o][var4] == 24) {
          ca.field_s = fj.a(qb.field_a, (byte) -119, param2);
          return var4;
        }
        if (em.field_i[this.field_o][var4] == 25) {
          qd.field_h = fj.a(mo.field_v, (byte) -119, param2);
          return var4;
        }
        if (param2 >= this.field_m &&
          this.field_f > param2) {
          return var4;
        }
        return -1;
    }

    private final int e(int param0, int param1) {
        int var4 = -87 % ((param1 + 65) / 43);
        int var3 = 10 != this.field_o ? 0 : (int)this.field_t;
        if (this.field_o == 1) {
          return param0 == 0 ? 43 : 35 * (param0 - 1) + 165 - var3;
        }
        if (em.field_i[this.field_o][param0] == 26) {
          return 445;
        }
        return -var3 + ((this.field_o != 0 ? 43 : 165) + 35 * param0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = HoldTheLine.field_D;
        var7 = 50 - this.field_s + 5 * param1;
        if (0 > var7) {
          var7 = 0;
        }
        var7 = var7 + this.field_q[param1];
        if (this.field_y == 4) {
          param0 = 0;
          if ((var12 != 0) &&
            (3 == this.field_y)) {
            param0 = (int)((double)param0 * ((-1.0 + Math.exp((double)((float)(-this.field_w + 40) * 0.20000000298023224f))) / (-1.0 + Math.exp(8.0))));
          }
        } else {
          if (3 == this.field_y) {
            param0 = (int)((double)param0 * ((-1.0 + Math.exp((double)((float)(-this.field_w + 40) * 0.20000000298023224f))) / (-1.0 + Math.exp(8.0))));
          }
        }
        var8 = 123 % ((-51 - param3) / 46);
        if (this.field_y == 2 &&
          param1 != this.field_v) {
          var7 = -(5 * (-param1 + this.field_a)) + (25 + this.field_r);
          if (var7 < 0) {
            var7 = 0;
          }
        }
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        var9 = (int)((double)we.field_n * (-Math.exp((double)((float)var7 * 0.20000000298023224f)) + 1.0));
        var10 = em.field_i[this.field_o][param1];
        var11 = var10;
        decompiledFrameRemainder0 = ((var11 == 18 &&
          var12 == 0) || var11 == 19);
        if (decompiledFrameRemainder0) {
          if (var11 == 18 &&
            var12 == 0 || var12 != 0) {
            param4 = param4 - (var9 + 165);
            if (0 < param4) {
              if (128 <= param4) {
                ol.field_d = 256;
                if (var12 != 0) {
                  ol.field_d = 256 * param4 / 128;
                  ol.field_d = 0;
                }
              } else {
                ol.field_d = 256 * param4 / 128;
                if (var12 != 0) {
                  ol.field_d = 0;
                }
              }
            } else {
              ol.field_d = 0;
            }
            decompiledFrameRemainder1 = !(-bd.field_S + sf.field_m <= 20);
            if (decompiledFrameRemainder1) {
              qf.a(293, cf.field_r);
              bd.field_S = sf.field_m;
            }
          }
          if (decompiledFrameRemainder1) {
            if ((var11 != 18 ||
              var12 != 0) && var12 == 0 || var12 != 0) {
              param4 = param4 - (-7 + (172 + var9));
              if (param4 <= 0) {
                ll.a(-111, 0);
              }
              if (!(param4 <= 0) ||
                var12 != 0) {
                if (param4 >= 128) {
                  ll.a(93, 160);
                }
                if (!(param4 >= 128) ||
                  var12 != 0) {
                  ll.a(-128, param4 * 160 / 128);
                  decompiledFrameRemainder0 = (var12 == 0);
                }}}
            decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
          }
        }
        if (decompiledFrameRemainder1) {
          super.a(param0, param1, param2, 81, param4, param5);
        }

    }

    final void c(int param0, int param1) {
        if (param1 != -3565) {
          this.field_q = (int[]) null;
        }
        if (0 == this.field_o) {
          cf.field_v = param0;
        }
        qf.a(293, cf.field_r);
        this.a(em.field_i[this.field_o][param0], !this.field_g ? true : false, 103);
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        var4 = HoldTheLine.field_D;
        var2 = 0;
        if (param0 != 1) {
          return;
        }
        while (var2 < 16) {
          if (var4 == 0) {
            if (ok.field_e == var2) {
              stackIn_9_0 = 48;
            } else {
              stackIn_9_0 = (~v.field_E != ~var2) ? 32 : 40;
            }
            var3 = stackIn_9_0;
            if (vl.field_h[var2] <= var3) {
              if (!(vl.field_h[var2] >= var3)) {
                vl.field_h[var2] = vl.field_h[var2] + 1;
              }
            } else {
              vl.field_h[var2] = vl.field_h[var2] - 1;
            }
            var2++;
            continue;
          }
          break;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        long[] dupTemp$0 = null;
        int stackIn_23_1 = 0;
        hj stackIn_23_2 = null;
        int stackIn_24_3 = 0;
        Object stackIn_26_0;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        Object stackIn_27_0;
        int stackIn_27_7;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_78_0 = 0;
        String stackIn_102_0 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int var8 = 0;
        String[] var9 = null;
        String var9_ref = null;
        hj var10_ref_hj = null;
        long[] var10_ref_long__ = null;
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
        String[] var21 = null;
        long[] var22 = null;
        vk var23 = null;
        String var24 = null;
        var20 = HoldTheLine.field_D;
        var6 = 6 / ((23 - param3) / 55);
        var7_int = param2;
        switch ((var20 == 0
          || var7_int == 0
          || var7_int == 3
          ) ? var7_int : -1) {
          case 0:
            var5 = 32;
            if (var20 == 0) {
              break;
            }
          case 1:
            var5 = 34;
            if (var20 == 0) {
              break;
            }
          case 2:
            var5 = 33;
            if (var20 == 0) {
              break;
            }
          case 3:
            var5 = 35;
            if (var20 == 0) {
              break;
            }
          default:
            throw new RuntimeException();
        }
        cg.a(30 - param1, 170, 580, (byte) 41, 260);
        if (null == mg.field_g[param2] &&
          -1 != var5) {
          mg.field_g[param2] = il.a(5, 3, var5, 10, (byte) -66);
        }
        var7 = mg.field_g[param2].field_m;
        var8 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var8 >= 4))) {
          var23 = tk.field_c[param2][var8];
          var23.b(3);
          var10_ref_hj = var23.a(9392, 0, 60);
          if (var20 == 0) {
            if (var10_ref_hj != null) {
              stackIn_23_1 = -141;
              stackIn_23_2 = var10_ref_hj;
              if (~var8 != ~ci.field_j) {
                stackIn_24_3 = vk.field_q[param2];
              } else {
                stackIn_24_3 = 16777215;
              }
              stackIn_26_0 = this;
              stackIn_26_4 = -param1 + (32 + cj.field_K[var8]);
              stackIn_26_5 = 190;
              stackIn_26_6 = 2;
              if (ci.field_j != var8) {
                stackIn_27_0 = this;
                stackIn_27_7 = wd.field_l[param2];
              } else {
                stackIn_27_0 = this;
                stackIn_27_7 = 0;
              }
              this.a(stackIn_23_1, stackIn_23_2, stackIn_24_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_27_7);
            }
            var8++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          q.a(gl.field_a, HoldTheLine.field_F, 0, 280 - param1, (byte) -127, 204);
          var8 = 0;
        }
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        if (var7 != null) {
          var21 = var7[param0];
          var9 = var21;
          dupTemp$0 = mg.field_g[param2].field_k[param0];
          var22 = dupTemp$0;
          var10_ref_long__ = dupTemp$0;
          var11 = mg.field_g[param2].field_p[param0];
          var12 = -1;
          var13 = -1;
          var14 = 0;
          var15 = 0;
          while (var15 < 10) {
            stackIn_102_0 = var21[var15];
            if (var20 != 0) {
              decompiledFrameCompleted1 = false;
              break;
            }
            if (stackIn_102_0 != null ||
              var20 != 0) {
              if (eb.field_o != null &&
                ra.a(var21[var15], false) &&
                eb.field_o.field_m == var22[var15]) {
                var16_int = 1;
                var17 = 0;
                while (true) {
                  if (var17 < 4) {
                    stackIn_52_0 = ~eb.field_o.field_r[var17];
                    stackIn_52_1 = ~var11[5 * var15 + var17];
                    if (stackIn_52_0 != stackIn_52_1) {
                      var16_int = 0;
                    } else {
                      var17++;
                      continue;
                    }
                  }
                  if (var16_int == 0) {
                    break;
                  }
                  var12 = var15;
                  break;
                }
              }
              stackIn_52_0 = 0;
              stackIn_52_1 = ~ci.field_j;
              if (stackIn_52_0 != stackIn_52_1 && (var13 == -1 ||
                var14 > var11[var15 * 5 + 1 + ci.field_j])) {
                var13 = var15;
                var14 = var11[1 + 5 * var15 + ci.field_j];
              }
            }
            var15++;
          }
          if (decompiledFrameCompleted1) {
            var15 = 220 + nm.field_c.field_G - 6;
            var16_int = 0;
            while (10 > var16_int) {
              stackIn_102_0 = var21[var16_int];
              if (var20 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_102_0 != null) {
                if (~var12 != ~var16_int) {
                  stackIn_68_0 = (~var13 != ~var16_int) ? 0 : 3;
                } else {
                  stackIn_68_0 = 5;
                }
                var17 = stackIn_68_0;
                var18 = var21[var16_int];
                am.a(-param1 + 54, 1 + var16_int + ". ", true, HoldTheLine.field_F, var15, var17);
                ei.a(54 - param1, 1, var18, var17, var15, HoldTheLine.field_F);
                if (var12 != var16_int) {
                  stackIn_73_0 = (var13 != var16_int) ? 1 : 2;
                } else {
                  stackIn_73_0 = 5;
                }
                var17 = stackIn_73_0;
                ei.a(-param1 + 235, 1, cb.a(42, -var11[5 * var16_int]), var17, var15, HoldTheLine.field_F);
                if (~var16_int != ~var13) {
                  stackIn_78_0 = (var12 != var16_int) ? 0 : 5;
                } else {
                  stackIn_78_0 = 3;
                }
                var17 = stackIn_78_0;
                var19 = 0;
                while (var19 < 4) {
                  q.a(io.a(var11[5 * var16_int - (-1 - var19)], (byte) -61), HoldTheLine.field_F, var17, 32 + cj.field_K[var19] - param1, (byte) -127, var15);
                  var19++;
                }
                var8 = 1;
              }
              var16_int++;
              var15 += 20;
            }
            if ((decompiledFrameCompleted0) && (-1 == var12 &&
              eb.field_o != null &&
              var5 == eb.field_o.field_j)) {
              var16 = ng.field_e;
              ei.a(-param1 + 54, 1, var16, 5, var15, HoldTheLine.field_F);
              ei.a(240 - param1, 1, cb.a(48, -eb.field_o.field_r[0]), 5, var15, HoldTheLine.field_F);
              var17 = 0;
              while (var17 < 4) {
                q.a(io.a(eb.field_o.field_r[1 + var17], (byte) -61), HoldTheLine.field_F, 5, cj.field_K[var17] + (32 - param1), (byte) -127, var15);
                var17++;
                if (var20 != 0) {
                  return;
                }
              }
            }
          }
        }
        if ((decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          if (var8 != 0) {
            return;
          }
          if (40 <= sf.field_m % 80) {
            return;
          }
          if (var7 == null) {
            stackIn_102_0 = fm.field_b;
          } else {
            if (!mg.field_g[param2].field_j) {
              stackIn_102_0 = ri.field_d;
            } else {
              stackIn_102_0 = an.field_d;
            }
          }
        }
        var24 = stackIn_102_0;
        var9_ref = var24;
        var10 = 90 + (220 + nm.field_c.field_G);
        nm.field_c.b(var24, 337 - param1, var10, 0, -1);
        return;
    }

    private final void o(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_6_1 = 0;
        if (99 != aa.field_n &&
          aa.field_n != 98) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_c != 0) {
            if (this.field_c == 1) {
              if (aa.field_n == 84) {
                qf.a(293, cf.field_r);
                if (tn.field_a != -1 &&
                  tn.field_a != ha.field_p) {
                  if (~pj.field_m != ~en.field_b ||
                    ~wa.field_j != ~ha.field_p) {
                    wa.field_j = ha.field_p;
                    this.field_t = this.field_t - 640.0f;
                    en.field_b = pj.field_m;
                  }
                  this.field_p = 640;
                  ha.field_p = tn.field_a;
                }
              }
              if (aa.field_n == 96) {
                fieldTemp$0 = tn.field_a - 1;
                tn.field_a = tn.field_a - 1;
                if (fieldTemp$0 < 0) {
                  tn.field_a = 3;
                }
              }
              if (97 == aa.field_n) {
                fieldTemp$1 = tn.field_a + 1;
                tn.field_a = tn.field_a + 1;
                if (fieldTemp$1 >= 4) {
                  tn.field_a = 0;
                  decompiledFrameRemainder0 = (HoldTheLine.field_D == 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 != -1) {
                field_u = (j) null;
              }
              return;
            }
          }
          this.b(this.field_c, -24489);
          return;
        }
        if (0 != this.field_c) {
          stackIn_6_1 = 0;
        } else {
          stackIn_6_1 = 1;
        }
        this.field_c = stackIn_6_1;
        if (this.field_c != 1) {
          return;
        }
        if (tn.field_a == -1) {
          tn.field_a = 0;
        }
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_30_0 = 0;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (param0 != 1) {
          this.i(-61);
        }
        var3 = em.field_i[this.field_o][param1];
        switch ((var4 == 0
          || var3 == 19
          || var3 == 25
          ) ? var3 : -1) {
          case 10:
          case 5:
            fieldTemp$0 = g.field_o - 1;
            g.field_o = g.field_o - 1;
            if (fieldTemp$0 >= 0) {
              break;
            }
            g.field_o = 1;
            if (var4 == 0) {
              break;
            }
          case 24:
            fieldTemp$1 = ca.field_s - 1;
            ca.field_s = ca.field_s - 1;
            if (fieldTemp$1 >= 0) {
              break;
            }
            ca.field_s = 3;
            if (var4 == 0) {
              break;
            }
          case 25:
            fieldTemp$2 = qd.field_h - 1;
            qd.field_h = qd.field_h - 1;
            stackIn_25_0 = ~fieldTemp$2;
            if (ih.field_p != 0) {
              stackIn_26_1 = 0;
            } else {
              stackIn_26_1 = 1;
            }
            if (stackIn_25_0 <= ~stackIn_26_1) {
              break;
            }
            stackIn_30_0 = (-1 + od.field_i.length != ih.field_p) ? 2 : 1;
            qd.field_h = stackIn_30_0;
            if (var4 == 0) {
              break;
            }
          case 18:
            if (ol.field_d > 32) {
              ol.field_d = -32 + 32 * ((ol.field_d * 8 + 256 - 1) / 256);
              qf.a(293, cf.field_r);
              if (var4 == 0) {
                break;
              }
            }
            if (0 >= ol.field_d) {
              break;
            }
            ol.field_d = 0;
            qf.a(293, cf.field_r);
            if (var4 == 0) {
              break;
            }
          case 19:
            if (mk.field_e > 20) {
              ll.a(param0 ^ -123, (-1 + (-1 + (8 * mk.field_e + 160)) / 160) * 20);
              if (var4 == 0) {
                break;
              }
            }
            ll.a(49, 0);
            break;
          default:
            break;
        }
    }

    ti(int param0) {
        super(em.field_i[param0].length, 15, 360, 165, 35);
        this.field_o = param0;
        this.field_q = new int[em.field_i[param0].length];
        nk.field_J = new int[16];
        vl.field_h = new int[16];
        dm.field_e = new int[16];
        kn.field_b = new int[16];
        co.field_d = new int[16];
        this.b(false, -116);
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        String[] array$0 = null;
        String stackIn_35_0 = null;
        int stackIn_56_0 = 0;
        int[] stackIn_72_0 = null;
        String[] stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        int stackIn_74_3 = 0;
        int[] stackIn_79_0 = null;
        String[] stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        int stackIn_80_3 = 0;
        int[] stackIn_85_0 = null;
        String[] stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        int stackIn_87_3 = 0;
        String[] stackIn_102_0 = null;
        String[] stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        String stackIn_103_3 = null;
        int stackIn_105_2 = 0;
        String stackIn_106_3 = null;
        int[] stackIn_109_0 = null;
        String[] stackIn_109_1 = null;
        int stackIn_109_2 = 0;
        int stackIn_111_3 = 0;
        int[] stackIn_115_0 = null;
        String[] stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int stackIn_117_3;
        int stackIn_124_0 = 0;
        int var5;
        int var6;
        float var7_float;
        int var7;
        String var8;
        int var9;
        int var10;
        String var10_ref_String;
        int var11;
        String[] var11_ref_String__;
        int var12;
        int var13;
        int var14;
        String var15;
        int var10Lifetime1;
        int var11Lifetime1;
        var14 = HoldTheLine.field_D;
        var5 = em.field_i[this.field_o][param1];
        if (this.field_y >= 3 &&
          var5 != this.field_v) {
          return;
        }
        if (param3 >= -75) {
          this.f(-38);
        }
        var6 = 50 - (this.field_s - 5 * param1);
        if (var6 < 0) {
          var6 = 0;
        }
        var6 = var6 + this.field_q[param1];
        if (this.field_y == 4) {
          param0 = 0;
          if ((var14 != 0) &&
            (this.field_y == 3)) {
            var7_float = (float)((Math.exp((double)((float)(40 - this.field_w) * 0.20000000298023224f)) - 1.0) / (Math.exp(8.0) - 1.0));
            param0 = (int)((float)param0 - (float)(param0 - 8) * (1.0f - var7_float));
          }
        } else {
          if (this.field_y == 3) {
            var7_float = (float)((Math.exp((double)((float)(40 - this.field_w) * 0.20000000298023224f)) - 1.0) / (Math.exp(8.0) - 1.0));
            param0 = (int)((float)param0 - (float)(param0 - 8) * (1.0f - var7_float));
          }
        }
        if (2 == this.field_y &&
          ~var5 != ~this.field_v) {
          var6 = 25 + (this.field_r - (-param1 + this.field_a) * 5);
          if (var6 < 0) {
            var6 = 0;
          }
        }
        var7 = (int)((double)we.field_n * (-Math.exp((double)((float)var6 * 0.20000000298023224f)) + 1.0));
        var15 = uk.field_c[var5];
        var8 = var15;
        var8 = var15;
        var8 = var15;
        if (var15 != null &&
          this.field_o == 0 ||
          this.field_o == 1) {
          var8 = var15.toUpperCase();
        }
        if (var5 == 3) {
          if (lm.field_a != 0 &&
            0 != ej.field_b) {
            if (lm.field_a == 1 ||
              ej.field_b == 1) {
              var8 = gb.field_J;
              if (var14 != 0) {
                var8 = uk.field_c[0];
              }
            }
          } else {
            var8 = uk.field_c[0];
          }
        }
        if (var5 == 6) {
          if (ek.field_x != 1) {
            stackIn_35_0 = hk.field_b;
          } else {
            stackIn_35_0 = qj.field_J;
          }
          var8 = stackIn_35_0;
        }
        if (12 == var5 &&
          nd.field_e) {
          var8 = eb.field_p.toUpperCase();
        }
        if (var5 == 7 &&
          bl.field_r != null &&
          3 == bl.field_r.field_J) {
          var8 = sa.field_c.toUpperCase();
        }
        if (var5 == 8) {
          if (this.field_o == 10 &&
            0.0f < this.field_t &&
            ek.field_x == 3) {
            var8 = hl.field_c.toUpperCase();
            if (var14 != 0) {
              var8 = ka.field_e.toUpperCase();
            }
          } else {
            var8 = ka.field_e.toUpperCase();
          }
        }
        if (var8 == null) {
          var8 = "ERROR: missing text";
        }
        if (param2 &&
          this.field_y == 1) {
          stackIn_56_0 = 2;
        } else {
          stackIn_56_0 = 1;
        }
        var9 = stackIn_56_0;
        if (this.field_v == var5 && (this.field_y == 3 ||
          this.field_y == 2)) {
          var9 = 5;
        }
        boolean decompiledFrameRemainder0 = true;
        if (var5 != 24) {
          if (var5 != 25) {
            if (26 == var5) {
              fl.a(var8, var7, var9, -1753, param0);
              decompiledFrameRemainder0 = (var14 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (var5 == 0 ||
                var5 == 3) {
                stackIn_72_0 = th.field_k;
                stackIn_72_1 = new String[]{var8};
                stackIn_72_2 = 82;
                if (param2 &&
                  this.field_y == 1) {
                  stackIn_74_3 = 0;
                } else {
                  stackIn_74_3 = -1;
                }
                fk.a(stackIn_72_0, stackIn_72_1, stackIn_72_2, stackIn_74_3, param0, -1, var7);
                decompiledFrameRemainder0 = (var14 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (var5 == 5) {
                  stackIn_79_0 = va.field_c;
                  stackIn_79_1 = th.field_n;
                  stackIn_79_2 = -120;
                  if (param2 &&
                    1 == this.field_y) {
                    stackIn_80_3 = g.field_o;
                  } else {
                    stackIn_80_3 = -1;
                  }
                  fk.a(stackIn_79_0, stackIn_79_1, stackIn_79_2, stackIn_80_3, param0, -1, var7);
                  decompiledFrameRemainder0 = (var14 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (var5 == 10) {
                    stackIn_85_0 = qd.field_l;
                    stackIn_85_1 = ki.field_i;
                    stackIn_85_2 = -127;
                    if (param2 &&
                      this.field_y == 1) {
                      stackIn_87_3 = g.field_o;
                    } else {
                      stackIn_87_3 = -1;
                    }
                    fk.a(stackIn_85_0, stackIn_85_1, stackIn_85_2, stackIn_87_3, param0, -1, var7);
                    decompiledFrameRemainder0 = (var14 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (var5 == this.field_v &&
                      this.field_y == 3) {
                      var10 = (-this.field_w + 80) * this.field_w;
                      var10 = (-var10 + 3200) * var10;
                      var11 = var10 * 381 / 2560000;
                      var12 = (-nm.field_c.a(var8) + 640) / 2;
                      var13 = 15 + var10 * (-15 + var12) / 2560000;
                      rd.a(var11, var9, (byte) -83, var13, param0, var8);
                      decompiledFrameRemainder0 = (var14 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      v.a((byte) -122, var8, var9, var7, param0);
                      decompiledFrameRemainder0 = (var14 != 0);
                    }
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            var10_ref_String = uk.field_c[3];
            if (0 != lm.field_a &&
              ej.field_b != 0) {
              if (lm.field_a == 1 ||
                ej.field_b == 1) {
                var10_ref_String = gb.field_J;
                if (var14 != 0) {
                  var10_ref_String = uk.field_c[0];
                }
              }
            } else {
              var10_ref_String = uk.field_c[0];
            }
            array$0 = new String[3];
            stackIn_102_0 = array$0;
            stackIn_102_1 = array$0;
            stackIn_102_2 = 0;
            if (0 >= ih.field_p) {
              stackIn_103_3 = "";
            } else {
              stackIn_103_3 = lg.field_r;
            }
            stackIn_102_1[stackIn_102_2] = stackIn_103_3;
            stackIn_102_0[1] = var10_ref_String;
            stackIn_105_2 = 2;
            if (ih.field_p >= 6) {
              stackIn_106_3 = "";
            } else {
              stackIn_106_3 = ej.field_d;
            }
            stackIn_102_0[stackIn_105_2] = stackIn_106_3;
            var11_ref_String__ = stackIn_102_0;
            stackIn_109_0 = mo.field_v;
            stackIn_109_1 = var11_ref_String__;
            stackIn_109_2 = -111;
            if (param2 &&
              this.field_y == 1) {
              stackIn_111_3 = qd.field_h;
            } else {
              stackIn_111_3 = -1;
            }
            fk.a(stackIn_109_0, stackIn_109_1, stackIn_109_2, stackIn_111_3, param0, -1, var7);
            if (var14 != 0) {
              stackIn_115_0 = qb.field_a;
              stackIn_115_1 = pg.field_L;
              stackIn_115_2 = -121;
              if (param2 &&
                1 == this.field_y) {
                stackIn_117_3 = ca.field_s;
              } else {
                stackIn_117_3 = -1;
              }
              fk.a(stackIn_115_0, stackIn_115_1, stackIn_115_2, stackIn_117_3, param0, 1 + pj.field_m, var7);
            }
          }
        } else {
          stackIn_115_0 = qb.field_a;
          stackIn_115_1 = pg.field_L;
          stackIn_115_2 = -121;
          if (param2 &&
            1 == this.field_y) {
            stackIn_117_3 = ca.field_s;
          } else {
            stackIn_117_3 = -1;
          }
          fk.a(stackIn_115_0, stackIn_115_1, stackIn_115_2, stackIn_117_3, param0, 1 + pj.field_m, var7);
        }
        if (18 == var5 ||
          var5 == 19) {
          if (var5 == 18) {
            stackIn_124_0 = ol.field_d * 128 / 256;
          } else {
            stackIn_124_0 = mk.field_e * 128 / 160;
          }
          var10Lifetime1 = stackIn_124_0;
          var11Lifetime1 = 172 + var7;
          this.b(param0, (byte) -52, var11Lifetime1, var10Lifetime1);
        }
    }

    private final void n(int param0) {
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean stackIn_9_3 = false;
        int stackIn_31_0;
        int stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        int stackIn_33_4 = 0;
        int stackIn_36_0;
        int stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        int stackIn_38_4;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        String stackIn_65_0 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        float var8_float = 0.0f;
        vk var8 = null;
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
        int var3Lifetime1;
        int var4Lifetime1;
        float var9_floatLifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime1Lifetime1;
        var18 = HoldTheLine.field_D;
        var2 = -(int)this.field_t + 570;
        if (this.field_y <= 2) {
          var3 = 0;
          if (this.field_y == 2) {
            var4 = this.field_r + 25 - (this.field_a + 1) * 5;
            var3 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var4)) + 1.0));
          }
          fl.a(ik.field_e, var3, 1, -1753, 488 - (int)this.field_t);
        }
        var3Lifetime1 = 0;
        if (param0 != -10967) {
          this.field_y = 8;
        }
        var4Lifetime1 = 298;
        var5 = 224;
        var6 = 331;
        var7 = 10 + var2;
        stackIn_8_1 = this.e(0, -110) + 480;
        stackIn_8_2 = 0;
        stackIn_9_3 = (this.field_c == 0);
        boolean decompiledFrameRemainder0 = true;
        this.a(stackIn_8_1, stackIn_8_2, stackIn_9_3, (byte) -94);
        if (this.field_y == 0) {
          var8_int = 80;
          var9_float = 0.10000000149011612f;
          var10_float = (float)Math.exp((double)(-var9_float * 80.0f));
          var11 = -sf.field_m + var8_int;
          var3Lifetime1 = (int)((Math.exp((double)(var9_float * (float)var11)) - 1.0) * (double)(300.0f * var10_float)) - 10;
          var6 = var6 + (-5 + (int)((Math.exp((double)(var9_float * (float)(-5 + var11))) - 1.0) * (double)(var10_float * 300.0f)));
          decompiledFrameRemainder0 = (var18 != 0);
        }
        if (decompiledFrameRemainder0) {
          if (this.field_y == 2 &&
            ej.field_b != -1) {
            var8_float = 0.10000000149011612f;
            var9_floatLifetime1 = (float)Math.exp((double)(-var8_float * 80.0f));
            var10 = this.field_r + 40;
            var3Lifetime1 = (int)((-1.0 + Math.exp((double)(var8_float * (float)var10))) * (double)(300.0f * var9_floatLifetime1));
            var6 = var6 + (int)((-1.0 + Math.exp((double)(var8_float * (float)(var10 + 5)))) * (double)(var9_floatLifetime1 * 300.0f));
          } else {
            if (2 < this.field_y &&
              ej.field_b != -1) {
              return;
            }
            if (1 < this.field_y &&
              ej.field_b == -1) {
              var8_float = 0.20000000298023224f;
              var9_floatLifetime1 = -(float)Math.exp((double)(-var8_float * (float)sf.field_m)) + 1.0f;
              var4Lifetime1 = (int)(var9_floatLifetime1 * 342.0f) + 298;
              var6 = (int)((1.0f - var9_floatLifetime1) * (float)var6);
              var5 = (int)(var9_floatLifetime1 * 256.0f) + 224;
              var3Lifetime1 = (int)(600.0f * var9_floatLifetime1);
              var7 = (int)((float)var7 * (-var9_floatLifetime1 + 1.0f));
              if (var18 != 0) {
                return;
              }
            }
          }
        }
        var8 = kn.b((byte) -49);
        nm.field_c.b(ue.field_c + var8.field_b, var3Lifetime1 + 320, var2, 0, -1);
        var2 += 15;
        if (we.field_o == null) {
          we.field_o = new hj(640, 480);
        }
        vb.a(-72, we.field_o);
        vl.a(0);
        ug.b(param0 + 10966);
        tc.c(var6 - 5, var7 - 5, 10 + var4Lifetime1, var5 + 10, 0, 128);
        if (bl.field_r != null &&
          bl.field_r.field_r == 3) {
          tc.f(var6, var7, var4Lifetime1, var5, 0);
        }
        we.field_o.a(var6, var7, var4Lifetime1, var5);
        var2 += 247;
        nm.field_c.b(jc.field_a, -var3Lifetime1 + 320, var2, 0, -1);
        var2 += 8;
        var9 = go.field_g[var8.field_p];
        stackIn_31_0 = 166 - var3Lifetime1;
        stackIn_31_1 = -5 + var2;
        stackIn_31_2 = 148;
        stackIn_31_3 = 114;
        if (var9[0] == t.field_l &&
          this.field_c == 1) {
          stackIn_33_4 = 16777215;
        } else {
          stackIn_33_4 = 0;
        }
        tc.c(stackIn_31_0, stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_33_4, 128);
        oe.field_i.a(104, var9[0], 9, 138).b(-var3Lifetime1 + 171, var2);
        stackIn_36_0 = var3Lifetime1 + 326;
        stackIn_36_1 = -5 + var2;
        stackIn_36_2 = 148;
        stackIn_36_3 = 114;
        if (~var9[1] == ~t.field_l &&
          this.field_c == 1) {
          stackIn_38_4 = 16777215;
        } else {
          stackIn_38_4 = 0;
        }
        tc.c(stackIn_36_0, stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_38_4, 128);
        oe.field_i.a(104, var9[1], 9, 138).b(var3Lifetime1 + 331, var2);
        var12 = 0;
        var20 = new int[4];
        var19 = var20;
        var13 = var19;
        var10Lifetime1 = 0;
        while (true) {
          stackIn_40_0 = -5;
          stackIn_40_1 = ~var10Lifetime1;
          if (stackIn_40_0 < stackIn_40_1) {
            stackIn_51_0 = 0;
            if (var18 == 0) {
              var11Lifetime1 = stackIn_51_0;
              while (var11Lifetime1 < 4) {
                stackIn_40_0 = t.field_j[var11Lifetime1];
                stackIn_40_1 = t.field_j[var10Lifetime1];
                if (stackIn_40_0 > stackIn_40_1) {
                  var13[var10Lifetime1] = var13[var10Lifetime1] + 1;
                }
                var11Lifetime1++;
              }
              var10Lifetime1++;
              continue;
            }
          } else {
            var2 = 640 - (int)this.field_t;
            nm.field_c.b(qh.field_e, 160 - var3Lifetime1, var2, 0, -1);
            var2 += 40;
            stackIn_51_0 = 0;
          }
          var10Lifetime1 = stackIn_51_0;
          L21: while (true) {
            stackIn_53_0 = 4;
            stackIn_53_1 = var10Lifetime1;
            if (stackIn_53_0 > stackIn_53_1 &&
              var18 == 0) {
              var11Lifetime1Lifetime1 = 0;
              while (4 > var11Lifetime1Lifetime1) {
                stackIn_53_0 = ~var10Lifetime1;
                stackIn_53_1 = ~var20[var11Lifetime1Lifetime1];
                if (stackIn_53_0 == stackIn_53_1) {
                  if (this.field_y == 0) {
                    var14_int = 60;
                    var15 = 0.10000000149011612f;
                    var16 = (float)Math.exp((double)(-var15 * 80.0f));
                    var17 = -sf.field_m + var14_int + 5 * var12;
                    var3Lifetime1 = (int)((-1.0 + Math.exp((double)(var15 * (float)var17))) * (double)(var16 * 300.0f));
                  }
                  if (t.field_j[var11Lifetime1Lifetime1] != 1) {
                    stackIn_65_0 = t.field_j[var11Lifetime1Lifetime1] + ij.field_a;
                  } else {
                    stackIn_65_0 = la.field_h;
                  }
                  var14 = stackIn_65_0;
                  nm.field_c.a(var14, -var3Lifetime1 + 170, var2, var11Lifetime1Lifetime1 + 6, -1);
                  nm.field_c.c(rf.field_Y[var10Lifetime1], 150 - var3Lifetime1, var2, var11Lifetime1Lifetime1 + 6, -1);
                  var12++;
                  var2 += 30;
                }
                var11Lifetime1Lifetime1++;
              }
              var10Lifetime1++;
              continue L21;
            }
            break;
          }
          return;
        }
    }

    final static int[] a(int param0, int param1, byte param2) {
        int var3 = tn.a(param1, 5255);
        if (param2 >= -42) {
          return (int[]) null;
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
        int var5;
        int var6;
        int stackIn_15_0 = 0;
        var6 = HoldTheLine.field_D;
        if (param0 >= 168 &&
          param0 <= 213) {
          if (param1 != 163) {
            return -42;
          }
          var5 = 0;
          while (var5 < 4) {
            stackIn_15_0 = ~param2;
            if (var6 != 0) {
              return stackIn_15_0;
            }
            if (stackIn_15_0 <= ~(-param3 + (2 + cj.field_K[var5])) &&
              param2 <= cj.field_K[var5] - (-62 + param3)) {
              return var5;
            }
            var5++;
          }
          return -1;
        }
        return -1;
    }

    private final void a(int param0, hj param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.a(param6, 2, param2, param5, param3, param4, param1.field_s, param1, param1.field_y);
          if (param0 != -141) {
            this.field_w = 23;
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ti.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void h(int param0) {
        int stackIn_7_0 = 0;
        double stackIn_10_0 = 0.0;
        int stackIn_11_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        String stackIn_58_0 = null;
        int stackIn_66_0 = 0;
        int stackIn_75_0 = 0;
        String stackIn_90_0 = null;
        int stackIn_98_0;
        int stackIn_98_1;
        int stackIn_98_2;
        int stackIn_98_3;
        String stackIn_98_4;
        boolean stackIn_99_5 = false;
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
        String var9Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9_intLifetime1;
        int var8Lifetime3;
        var13 = HoldTheLine.field_D;
        if (bl.field_r == null) {
          return;
        }
        var2 = 140 - (int)this.field_t;
        var3 = 0;
        var4 = 500;
        if (param0 != 12) {
          return;
        }
        var5 = 0.10000000149011612f;
        var6 = (float)Math.exp((double)(400.0f * -var5));
        if (this.field_y > 1) {
          stackIn_7_0 = sf.field_m;
        } else {
          stackIn_7_0 = -sf.field_m + var4;
        }
        boolean decompiledFrameRemainder0 = true;
        var7 = stackIn_7_0;
        if (bl.field_r.field_E) {
          var8 = (int)((double)(300.0f * var6) * (Math.exp((double)((float)var7 * var5)) - 1.0));
          stackIn_10_0 = (double)(var6 * 300.0f);
          if (var7 > 10) {
            stackIn_11_1 = -10 + var7;
          } else {
            stackIn_11_1 = 0;
          }
          var9_int = (int)(stackIn_10_0 * (Math.exp((double)((float)stackIn_11_1 * var5)) - 1.0));
          if (bl.field_r.field_C[0].field_R < 3) {
            var14 = ha.field_o[bl.field_r.field_C[0].field_R];
            if (null == var14.a(8192)) {
              ra.field_hb.a(352, var2 + (-var8 - 64));
              if (var13 != 0) {
                var14.field_b.a(336, var2 - (var8 + 64));
              }
            } else {
              var14.field_b.a(336, var2 - (var8 + 64));
            }
          }
          if (3 > bl.field_r.field_C[1].field_R) {
            var15 = ha.field_o[bl.field_r.field_C[1].field_R];
            if (var15.a(8192) == null) {
              ra.field_hb.a(192, var2 + (-var9_int - 64));
              if (var13 != 0) {
                var15.field_b.a(176, -var9_int + var2 - 64);
              }
            } else {
              var15.field_b.a(176, -var9_int + var2 - 64);
            }
          }
          decompiledFrameRemainder0 = (var13 != 0);
        }
        if (decompiledFrameRemainder0) {
          var8Lifetime3 = (int)((-1.0 + Math.exp((double)(var5 * (float)var7))) * (double)(300.0f * var6));
          if (bl.field_r.field_C[0].field_R < 3) {
            var16 = ha.field_o[bl.field_r.field_C[0].field_R];
            if (var16.a(param0 + 8180) == null) {
              ra.field_hb.a(272, -64 + (-var8Lifetime3 + var2));
              if (var13 != 0) {
                var16.field_b.a(256, -64 + var2 - var8Lifetime3);
              }
            } else {
              var16.field_b.a(256, -64 + var2 - var8Lifetime3);
            }
          }
        }
        var2 += 120;
        if (ek.field_x == 5) {
          if (this.field_y <= 1) {
            stackIn_33_0 = -sf.field_m + var4;
          } else {
            stackIn_33_0 = sf.field_m;
          }
          var7Lifetime1 = stackIn_33_0;
          var7Lifetime1 -= 75;
          if (var7Lifetime1 < 0) {
            var7Lifetime1 = 0;
          }
          var8Lifetime1 = 320 + (int)((double)(var6 * 500.0f) * (Math.exp((double)((float)var7Lifetime1 * var5)) - 1.0));
          nm.field_c.b("-", var8Lifetime1 + 2, var2, 0, -1);
          nm.field_c.c(vf.field_u, -8 + var8Lifetime1, var2, 0, -1);
          nm.field_c.a(bl.field_o, 12 + var8Lifetime1, var2, 0, -1);
          var2 += 30;
        }
        var9_intLifetime1 = 0;
        while (true) {
          stackIn_39_0 = var9_intLifetime1;
          stackIn_39_1 = 4;
          if (stackIn_39_0 < stackIn_39_1) {
            stackIn_75_0 = 0;
            if (var13 == 0) {
              var10 = stackIn_75_0;
              while (bl.field_r.field_h > var10) {
                stackIn_39_0 = this.field_y;
                stackIn_39_1 = 1;
                if (stackIn_39_0 > stackIn_39_1) {
                  stackIn_47_0 = sf.field_m;
                } else {
                  stackIn_47_0 = var4 - sf.field_m;
                }
                var7Lifetime2 = stackIn_47_0;
                var7Lifetime2 = var7Lifetime2 - (5 - var3) * 10;
                if (0 > var7Lifetime2) {
                  var7Lifetime2 = 0;
                }
                var8Lifetime2 = (int)((Math.exp((double)(var5 * (float)var7Lifetime2)) - 1.0) * (double)(var6 * 500.0f));
                if (var3 % 2 != 0) {
                  var8Lifetime2 = 320 + var8Lifetime2;
                } else {
                  var8Lifetime2 = -var8Lifetime2 + 320;
                }
                if (~var9_intLifetime1 == ~bl.field_r.field_C[var10].field_R) {
                  if (ek.field_x != 4) {
                    if (ek.field_x != 5) {
                      var11 = ub.field_C[var9_intLifetime1];
                      if (var11 == 1) {
                        stackIn_58_0 = la.field_h;
                      } else {
                        stackIn_58_0 = var11 + ij.field_a;
                      }
                      var12 = stackIn_58_0;
                      nm.field_c.a(var12, -55 + var8Lifetime2, var2, var10 + 6, -1);
                      nm.field_c.c(rf.field_Y[var9_intLifetime1], -80 + var8Lifetime2, var2, 6 + var10, -1);
                      if (pe.field_g[var10] == -1) {
                        nm.field_c.a(ln.field_m, 40 + var8Lifetime2, var2, var10 + 6, -1);
                      } else {
                        nm.field_c.a(cb.a(48, pe.field_g[var10]), 40 + var8Lifetime2, var2, var10 + 6, -1);
                      }
                    } else {
                      nm.field_c.c(rf.field_Y[var9_intLifetime1], var8Lifetime2 - 15, var2, var10 + 6, -1);
                      stackIn_66_0 = (kb.a(param0 + 16604, 0)) ? 3 : 1;
                      var11 = stackIn_66_0;
                      nm.field_c.a(Integer.toString(bl.field_r.field_C[var10].field_Sb), 15 + var8Lifetime2, var2, 6 + var10, -1);
                      nm.field_c.a("-", 16 + var8Lifetime2 + 14 * var11, var2, 6 + var10, -1);
                      nm.field_c.a(Integer.toString(bl.field_r.field_C[var10].field_oc), 31 + var8Lifetime2 + var11 * 14, var2, var10 + 6, -1);
                    }
                  } else {
                    nm.field_c.c(rf.field_Y[var9_intLifetime1], -15 + var8Lifetime2, var2, var10 + 6, -1);
                    if (-1 != pe.field_g[var10]) {
                      nm.field_c.a(cb.a(47, pe.field_g[var10]), 15 + var8Lifetime2, var2, var10 + 6, -1);
                    } else {
                      nm.field_c.a(ln.field_m, var8Lifetime2 + 15, var2, 6 + var10, -1);
                    }
                  }
                  var3++;
                  var2 += 30;
                }
                var10++;
              }
              var9_intLifetime1++;
              continue;
            }
          } else {
            stackIn_75_0 = ek.field_x;
          }
          if (stackIn_75_0 != 5) {
            var2 += 30;
          }
          if (sf.field_m % 50 < 25) {
            if (ek.field_x == 2 &&
              -1 != ce.field_r) {
              var9 = sd.a(kj.field_n, new String[]{gh.field_t[ce.field_r]}, true);
              if (!of.a(param0 - 981)) {
                var9 = ub.field_E;
              }
              nm.field_c.b(var9, 320, var2, 1, -1);
            } else {
              if (ek.field_x == 1) {
                if (kk.field_l != 1) {
                  stackIn_90_0 = sd.a(sh.field_c, new String[]{Integer.toString(kk.field_l)}, true);
                } else {
                  stackIn_90_0 = va.field_f;
                }
                var18 = stackIn_90_0;
                var9 = var18;
                nm.field_c.b(var18, 320, var2, 1, -1);
              } else {
                if (6 == ek.field_x) {
                  var17 = h.field_a;
                  nm.field_c.b(var17, 320, var2, 1, -1);
                }
              }
            }
          }
          if (1 == ek.field_x) {
            var9Lifetime1 = qj.field_J;
          } else {
            if (ek.field_x == 6) {
              var9Lifetime1 = ka.field_e;
            } else {
              var9Lifetime1 = hk.field_b;
            }
          }
          stackIn_98_0 = 240;
          stackIn_98_1 = 0;
          stackIn_98_2 = -5;
          stackIn_98_3 = 430 - (int)this.field_t;
          stackIn_98_4 = var9Lifetime1;
          stackIn_99_5 = (this.field_c == 1);
          te.a(stackIn_98_0, stackIn_98_1, stackIn_98_2, stackIn_98_3, stackIn_98_4, stackIn_99_5);
          return;
        }
    }

    private final int a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        var6 = HoldTheLine.field_D;
        if (param0 >= 80 &&
          param0 <= 140) {
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 >= 4))) {
            stackIn_13_0 = 88 + (128 * var5 - param3);
            stackIn_13_1 = param2;
            if (var6 == 0) {
              if (stackIn_13_0 <= stackIn_13_1 &&
                param2 <= (-param3 + (var5 * 128 + 168))) {
                return var5;
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = param1;
            stackIn_13_1 = -87;
          }
          if (stackIn_13_0 > stackIn_13_1) {
            this.field_r = 9;
          }
          return -1;
        }
        return -1;
    }

    private final void d(byte param0) {
        int stackIn_13_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (200 <= nc.field_g &&
          nc.field_g < 440 &&
          (float)rf.field_X >= 430.0f - this.field_t &&
          -this.field_t + 460.0f > (float)rf.field_X) {
          this.field_c = 1;
          if (1 == gg.field_J) {
            this.a((byte) 117, 6, true);
          }
        }
        var2 = 0;
        L2: while (true) {
          boolean decompiledFrameRemainder0 = true;
          if (2 > var2) {
            stackIn_26_0 = 0;
            stackIn_26_1 = var2;
            if (var4 != 0) {
              break L2;
            }
            stackIn_13_0 = (stackIn_26_0 == stackIn_26_1) ? 240 : 400;
            var3 = stackIn_13_0;
            if ((-69 + var3) <= nc.field_g &&
              var3 + 69 > nc.field_g &&
              (float)rf.field_X >= 845.0f - this.field_t &&
              (float)rf.field_X < 949.0f - this.field_t) {
              t.field_l = go.field_g[kn.b((byte) -49).field_p][var2];
              ci.a(0, (byte) 120, this.field_o, var2);
              this.field_c = 1;
              if (((gg.field_J == 1)) &&
                ((null != bl.field_r))) {
                bl.field_r.field_C[0].a(20385, ge.field_c[t.field_l]);
                wm.a(true, false, -1);
                qf.a(293, cf.field_r);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var2++;
              continue;
            }
          }
          stackIn_26_0 = this.field_o;
          stackIn_26_1 = 10;
          break;
        }
        if (stackIn_26_0 == stackIn_26_1 &&
          this.field_t > 0.0f &&
          na.field_k &&
          nc.field_g > this.field_m &&
          this.field_f >= nc.field_g &&
          rf.field_X >= 35 &&
          rf.field_X <= 65) {
          this.field_c = 0;
          if (0 != gg.field_J) {
            this.c(this.field_c, -3565);
          }
        }
        if (param0 != -88) {
          this.field_q = (int[]) null;
        }
        return;
    }

    private final int b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var8 = HoldTheLine.field_D;
        var4 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!(qe.field_a > var4)))) {
          var5 = -param1 + dm.field_e[var4];
          var6 = -param2 + co.field_d[var4];
          var7 = kn.field_b[var4] >> 1;
          stackIn_10_0 = -var7;
          stackIn_10_1 = var5;
          if (var8 == 0) {
            if (stackIn_10_0 <= stackIn_10_1 &&
              var5 <= var7 &&
              -var7 <= var6 &&
              var6 <= var7) {
              return nk.field_J[var4];
            }
            var4++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = param0;
          stackIn_10_1 = -21;
        }
        if (stackIn_10_0 != stackIn_10_1) {
          this.field_r = -80;
        }
        return -1;
    }

    final void g(int param0, int param1) {
        this.field_p = 0;
        this.field_t = (float)param0;
        ha.field_p = param1;
        wa.field_j = param1;
        mg.field_g[param1] = null;
    }

    static {
        field_x = new ll();
    }
}
