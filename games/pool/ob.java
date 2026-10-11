/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ob extends jh {
    int field_s;
    gi field_G;
    ia field_B;
    dd field_z;
    boolean field_p;
    private int field_A;
    static int field_u;
    private int field_k;
    boolean field_n;
    static long field_v;
    private static int field_j;
    int[] field_h;
    boolean field_q;
    int field_w;
    int field_x;
    static int field_i;
    int field_t;
    static int[] field_y;
    private int field_r;
    private int field_o;
    static int[] field_m;
    boolean field_l;
    int field_C;
    int field_E;
    private static int field_D;
    static int field_F;

    int b(byte param0, int param1) {
        if (param0 != 6) {
          return 57;
        }
        return this.field_x + param1 * this.field_s;
    }

    final void a(boolean param0) {
        int var2 = 0;
        if (param0) {
          this.field_s = -3;
        }
        if (this.field_l) {
          if (this.field_p) {
            pn.field_l.a(0, 0);
          } else {
            uk.field_b[ie.field_h].a(0, 0);
            ti.field_g = ti.field_g + 1;
            if (!(0 >= ti.field_g)) {
              var2 = (ie.field_h + 1) % uk.field_b.length;
              uk.field_b[var2].a(0, 0, ti.field_g);
              if (ti.field_g > 255) {
                ie.field_h = var2;
                ti.field_g = -750;
              }
            }
          }
        }
        if (this.field_p) {
          ja.a(this.field_k, this.field_A, true, this.field_r, this.field_o);
        }
        if (null != this.field_z) {
          this.field_z.c(qh.field_l - this.field_z.field_z >> 1, 10);
        }
    }

    final void b(boolean param0, int param1) {
        int stackIn_39_0 = 0;
        int var3;
        String var4;
        int var5;
        int var6;
        int var7;
        Object var8;
        int var9;
        int var10;
        dd var10_ref_dd;
        int var11;
        int var12;
        int var14;
        int var15;
        dd[] var16;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var14Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var15 = Pool.field_O;
        var3 = this.field_h[param1];
        var4 = nk.field_f[var3];
        if (var3 == 8) {
          if (this.field_w != 0 &&
            this.field_w != 21) {
            if (7 == this.field_w) {
              var4 = nk.field_f[37];
            } else {
              if (this.field_w == 6) {
                var4 = nk.field_f[38];
              } else {
                if (8 != this.field_w &&
                  this.field_w != 3 &&
                  this.field_w != 24) {
                  if ((this.field_w == 10 ||
                    11 == this.field_w ||
                    this.field_w == 12 ||
                    this.field_w == 9)) {
                    var4 = vc.field_N;
                  }
                } else {
                  var4 = ld.field_f;
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var4 = nk.field_f[7];
          }
        }
        var5 = this.d(0, param1);
        var6 = this.a(false, param1);
        var7 = this.b((byte) 6, param1);
        if (!param0) {
          return;
        }
        var8 = null;
        if (this.f(-13676, param1)) {
          var9 = -var5 + var6;
          var10 = this.a((byte) 69, param1);
          var16 = this.b(param1, -34);
          nj.a(var16, (byte) 6, var9, var5, var7, var10);
        }
        var9Lifetime1 = this.c(param1, -4);
        if (jq.field_e[param1] != var4 ||
          var9Lifetime1 != mc.field_h[param1]) {
          var10_ref_dd = this.a(var4, var9Lifetime1, 0, param1);
          fm.field_G[param1] = var10_ref_dd;
          jq.field_e[param1] = var4;
          mc.field_h[param1] = var9Lifetime1;
        }
        var10Lifetime1 = fm.field_G[param1].field_z;
        if (20 == var3 ||
          var3 == 21) {
          var10Lifetime1 = pq.field_H + 120;
        }
        var11 = -var10Lifetime1 + (var6 + var5) >> 1;
        var12 = this.a((byte) 69, param1);
        fm.field_G[param1].c(var11, var7 + this.a(param1, 6402));
        this.a(param1, var6, var5, var12, -24267, var7);
        if (var3 != 20 &&
          var3 != 21) {
          return;
        }
        var11 = var11 + pq.field_H;
        var20 = al.field_B[0].b(0, 0);
        for (var14 = var11; var14 <= 120 + var11; var14 += 20) {
          qh.a(var14 << 4, -2 + var12 / 2 + var7 << 4, 16 - var11 + var14, var20.length - 1, var20);
        }
        if (20 == var3) {
          stackIn_39_0 = ec.field_b * 120 / 256;
        } else {
          stackIn_39_0 = 120 * nk.field_h / 256;
        }
        var14Lifetime1 = stackIn_39_0;
        wp.field_a.c(-(wp.field_a.field_z >> 1) + (var14Lifetime1 + var11), -4 + ((wp.field_a.field_A >> 1) + var7));
        return;
    }

    dd a(String param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        dd stackIn_2_0 = null;
        dd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0) {
            stackIn_4_0 = dq.a(param1, 0, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (dd) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ob.PA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    int a(int param0, int param1) {
        if (param1 != 6402) {
          field_F = 22;
        }
        return -2;
    }

    dd[] b(int param0, int param1) {
        int var3;
        if (param0 == this.field_B.field_h) {
          return ln.field_s;
        }
        if (param1 != -34) {
          this.a((byte) -13, 83);
        }
        var3 = this.field_h[param0];
        if ((var3 != 17 ||
          eo.field_Lb != 0) && (var3 != 18 ||
          1 != eo.field_Lb)) {
          return rm.field_g;
        }
        return ln.field_s;
    }

    void d(int param0) {
        int var3;
        var3 = Pool.field_O;
        if (!ub.field_p &&
          !br.field_H) {
          while (n.h(param0 + 128)) {
            if (qi.field_a == 13) {
              this.a((byte) -30);
              continue;
            }
            this.e(-34);
            if (this.field_B.field_h == -1) {
              continue;
            }
            this.b(-16470, false, this.field_B.field_h);
          }
          this.field_B.a(this.b(-6564, ua.field_o, lq.field_W), this.b(-6564, gg.field_f, wn.field_i), param0 ^ -109);
          if (-1 != this.field_B.field_h) {
            this.b(-16470, true, this.field_B.field_h);
          }
        }
        if (param0 != -1) {
          this.b(-44, true);
        }
    }

    public static void d(byte param0) {
        field_y = null;
        if (param0 <= 101) {
          im var2 = (im) null;
          ob.a(114, (of) null, 91, 19, -106, 18, (im) null);
        }
        field_m = null;
    }

    final void c(int param0, boolean param1) {
        if (param0 != 12) {
          return;
        }
        if (1 == er.field_W) {
          this.a(0, param1, 0);
        } else {
          fq.a(-3405, 7, 0, param1);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int discarded$0 = 0;
        this.field_k = param0;
        this.field_r = param2;
        this.field_o = param1;
        this.field_A = param3;
        if (param4 != 0) {
          discarded$0 = this.b(-68, -48, -6);
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param2 != 0) {
          return;
        }
        sq.field_b = -3;
        re.field_f = param0;
    }

    private final int b(int param0, int param1, int param2) {
        int var7 = 0;
        int var4;
        int var5;
        int stackIn_23_0 = 0;
        int stackIn_24_1 = 0;
        int var6;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var6Lifetime1;
        var4 = -1;
        if (param0 != -6564) {
          return -23;
        }
        var5 = -1;
        for (var7 = 0; var7 < this.field_h.length; var7++) {
          if (this.a(var7, true)) {
            var8 = this.b((byte) 6, var7);
            var9 = this.d(param0 ^ -6564, var7);
            var10 = this.a(false, var7);
            var11 = this.a((byte) 69, var7) + var8;
            if (param2 >= var9 &&
              var10 > param2 &&
              param1 >= var8 &&
              var11 > param1) {
              var6 = param2 - (var10 + var9 >> 1);
              if (var6 < 0) {
                var6 = -var6;
              }
              var12 = -(var8 + var11 >> 1) + param1;
              stackIn_23_0 = var6;
              if (var12 >= 0) {
                stackIn_24_1 = var12;
              } else {
                stackIn_24_1 = -var12;
              }
              var6Lifetime1 = stackIn_23_0 + stackIn_24_1;
              if (var5 < 0 ||
                var6Lifetime1 < var5) {
                var5 = var6Lifetime1;
                var4 = var7;
              }
            }
          }
        }
        return var4;
    }

    void b(int param0, boolean param1, int param2) {
        boolean stackIn_82_0 = false;
        String[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        String stackIn_85_2 = null;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_130_2 = 0;
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        ob[] stackIn_151_2 = null;
        int stackIn_152_3;
        int stackIn_212_0 = 0;
        int stackIn_212_1 = 0;
        int stackIn_213_2 = 0;
        int stackIn_218_0 = 0;
        int stackIn_218_1 = 0;
        int stackIn_219_2 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_225_2 = 0;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        int stackIn_233_2 = 0;
        int stackIn_236_0 = 0;
        int stackIn_236_1 = 0;
        int stackIn_237_2 = 0;
        int stackIn_240_0 = 0;
        int stackIn_240_1 = 0;
        int stackIn_241_2 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Pool.field_O;
        if (param0 != -16470) {
          return;
        }
        if (this.field_B.field_a) {
          vj.a((byte) -27, il.field_c[0]);
        }
        L1: {
          L2: {
            var4 = this.field_h[param2];
            var6 = var4;
            if (var6 != 0 &&
              var6 != 38) {
              if (37 == var6) {
                if (!(!this.field_B.b((byte) 72))) {
                  fq.a(-3405, 7, 0, param1);
                }
              } else {
                if (39 == var6) {
                  if (!(!this.field_B.b((byte) 74))) {
                    fq.a(-3405, 1, 0, param1);
                  }
                } else {
                  if (var6 == 49) {
                    if (!this.field_B.b((byte) 78)) {
                      break L2;
                    }
                    stackIn_82_0 = !(th.field_h);
                    th.field_h = stackIn_82_0;
                    stackIn_84_0 = nk.field_f;
                    stackIn_84_1 = 49;
                    if (th.field_h) {
                      stackIn_85_2 = hb.field_q;
                    } else {
                      stackIn_85_2 = uf.field_K;
                    }
                    stackIn_84_0[stackIn_84_1] = stackIn_85_2;
                  } else {
                    if (var6 == 29) {
                      if (!this.field_B.b((byte) 58)) {
                        break L2;
                      }
                      this.a(0, param1, 0);
                    } else {
                      if (var6 == 30) {
                        if (!this.field_B.b((byte) 63)) {
                          break L2;
                        }
                        this.a(1, param1, param0 ^ -16470);
                      } else {
                        if (var6 == 31) {
                          if (!(!this.field_B.b((byte) 82))) {
                            this.a(2, param1, 0);
                          }
                        } else {
                          if (32 == var6) {
                            if (!(!this.field_B.b((byte) 61))) {
                              this.a(3, param1, 0);
                            }
                          } else {
                            if (var6 == 33) {
                              if (!this.field_B.b((byte) 73)) {
                                break L2;
                              }
                              this.a(4, param1, 0);
                            } else {
                              if (var6 == 34) {
                                if (!this.field_B.b((byte) 86)) {
                                  break L2;
                                }
                                this.a(5, param1, param0 + 16470);
                              } else {
                                if (var6 == 35) {
                                  if (!this.field_B.b((byte) 125)) {
                                    break L2;
                                  }
                                  this.a(6, param1, 0);
                                } else {
                                  if (var6 == 36) {
                                    if (!(!this.field_B.b((byte) 108))) {
                                      this.a(7, param1, 0);
                                    }
                                  } else {
                                    if (var6 == 40) {
                                      if (!(!this.field_B.b((byte) 99))) {
                                        vh.field_Ab = so.field_g[0];
                                        er.field_W = 3;
                                        sq.field_b = -6;
                                      }
                                    } else {
                                      if (var6 == 41) {
                                        if (!(!this.field_B.b((byte) 101))) {
                                          er.field_W = 3;
                                          vh.field_Ab = so.field_g[1];
                                          sq.field_b = -6;
                                        }
                                      } else {
                                        if (var6 == 42) {
                                          if (!this.field_B.b((byte) 84)) {
                                            break L2;
                                          }
                                          sq.field_b = -6;
                                          vh.field_Ab = so.field_g[2];
                                          er.field_W = 3;
                                        } else {
                                          if (43 == var6) {
                                            if (!(!this.field_B.b((byte) 81))) {
                                              var6 = param1 ? 1 : 0;
                                              fq.a(param0 ^ 19737, 2, sq.field_b, var6 != 0);
                                            }
                                          } else {
                                            if (var6 == 50) {
                                              if (!this.field_B.b((byte) 90)) {
                                                break L2;
                                              }
                                              un.field_e = 0;
                                              sq.field_b = -8;
                                            } else {
                                              if (var6 == 51) {
                                                if (!(!this.field_B.b((byte) 83))) {
                                                  un.field_e = 1;
                                                  sq.field_b = -8;
                                                }
                                              } else {
                                                if (1 == var6) {
                                                  if (!this.field_B.b((byte) 76)) {
                                                    break L2;
                                                  }
                                                  if (hk.b(107)) {
                                                    bl.field_x = true;
                                                    nk.a(pl.field_d, -4, (byte) 82);
                                                  } else {
                                                    var6 = param1 ? 1 : 0;
                                                    fq.a(-3405, -4, sq.field_b, var6 != 0);
                                                  }
                                                } else {
                                                  if (var6 != 62 &&
                                                    var6 != 2) {
                                                    if (var6 == 7) {
                                                      if (!(!this.field_B.b((byte) 50))) {
                                                        var6 = param1 ? 1 : 0;
                                                        fq.a(-3405, 0, sq.field_b, var6 != 0);
                                                        jc.field_c = false;
                                                      }
                                                    } else {
                                                      if (var6 == 24) {
                                                        if (!(!this.field_B.b((byte) 95))) {
                                                          var6 = param1 ? 1 : 0;
                                                          fq.a(-3405, 21, sq.field_b, var6 != 0);
                                                          lo.field_a = true;
                                                        }
                                                      } else {
                                                        if (var6 == 22) {
                                                          if (!(!this.field_B.b((byte) 109))) {
                                                            var6 = param1 ? 1 : 0;
                                                            fq.a(-3405, 17, sq.field_b, var6 != 0);
                                                          }
                                                        } else {
                                                          if (var6 == 5) {
                                                            if (!(!this.field_B.b((byte) 67))) {
                                                              var6 = param1 ? 1 : 0;
                                                              fq.a(-3405, 13, sq.field_b, var6 != 0);
                                                            }
                                                          } else {
                                                            if (47 == var6) {
                                                              if (!(!this.field_B.b((byte) 81))) {
                                                                var6 = param1 ? 1 : 0;
                                                                fq.a(-3405, 14, sq.field_b, var6 != 0);
                                                              }
                                                            } else {
                                                              if (8 == var6) {
                                                                if (!this.field_B.b((byte) 89)) {
                                                                  break L2;
                                                                }
                                                                if ((sq.field_b != this.field_w)) {
                                                                  stackIn_151_0 = -3405;
                                                                  stackIn_151_1 = this.field_w;
                                                                  stackIn_151_2 = s.field_c;
                                                                  if (0 <= this.field_w) {
                                                                    stackIn_152_3 = this.field_w;
                                                                  } else {
                                                                    stackIn_152_3 = 0;
                                                                  }
                                                                  fq.a(stackIn_151_0, stackIn_151_1, stackIn_151_2[stackIn_152_3].field_w, param1);
                                                                }
                                                              } else {
                                                                if (var6 == 4) {
                                                                  if (!(!this.field_B.b((byte) 52))) {
                                                                    var6 = param1 ? 1 : 0;
                                                                    fq.a(-3405, 15, sq.field_b, var6 != 0);
                                                                  }
                                                                } else {
                                                                  if (var6 == 48) {
                                                                    if (!this.field_B.b((byte) 89)) {
                                                                      break L2;
                                                                    }
                                                                    var6 = param1 ? 1 : 0;
                                                                    fq.a(-3405, 16, sq.field_b, var6 != 0);
                                                                  } else {
                                                                    if (var6 == 20) {
                                                                      var5 = 0;
                                                                      if (this.field_B.d(123) &&
                                                                        ec.field_b > 0) {
                                                                        ka.a(true, 0);
                                                                        var5 = 1;
                                                                      }
                                                                      if (this.field_B.a(103) &&
                                                                        256 > ec.field_b) {
                                                                        var5 = 1;
                                                                        ka.a(true, 256);
                                                                      }
                                                                      if (this.field_B.c((byte) 111)) {
                                                                        var6 = this.d(0, param2) + (this.a(false, param2) + pq.field_H) - 120 >> 1;
                                                                        var7 = -var6 + wn.field_i;
                                                                        var8 = 256 * var7 / 120;
                                                                        if (0 >= var8) {
                                                                          ka.a(true, 0);
                                                                        } else {
                                                                          if (var8 < 256) {
                                                                            ka.a(true, var8);
                                                                          } else {
                                                                            ka.a(true, 256);
                                                                          }
                                                                        }
                                                                        var5 = 1;
                                                                      }
                                                                      if (this.field_B.f(-20421) &&
                                                                        ec.field_b > 0) {
                                                                        var5 = 1;
                                                                        ve.b((byte) -14);
                                                                      }
                                                                      if (this.field_B.c(-1) &&
                                                                        ec.field_b < 256) {
                                                                        ud.f(param0 + 16245);
                                                                        var5 = 1;
                                                                      }
                                                                      if ((var5 != 0)) {
                                                                        if (this.field_B.c((byte) 103) &&
                                                                          eo.field_Tb <= field_D) {
                                                                          break L2;
                                                                        }
                                                                        vj.a((byte) -27, il.field_c[2]);
                                                                        field_D = eo.field_Tb + 20;
                                                                      }
                                                                    } else {
                                                                      if (var6 == 21) {
                                                                        if (this.field_B.d(121)) {
                                                                          ap.a(0, 3815994);
                                                                        }
                                                                        if (this.field_B.a(103)) {
                                                                          ap.a(256, 3815994);
                                                                        }
                                                                        if (this.field_B.c((byte) 105)) {
                                                                          var6 = this.d(0, param2) + this.a(false, param2) + pq.field_H - 120 >> 1;
                                                                          var7 = wn.field_i - var6;
                                                                          var8 = 256 * var7 / 120;
                                                                          if (var8 > 0) {
                                                                            if (var8 >= 256) {
                                                                              ap.a(256, param0 + 3832464);
                                                                            } else {
                                                                              ap.a(var8, 3815994);
                                                                            }
                                                                          } else {
                                                                            ap.a(0, 3815994);
                                                                          }
                                                                        }
                                                                        if (this.field_B.f(-20421)) {
                                                                          pd.a(param0 ^ -16470);
                                                                        }
                                                                        if (!(!this.field_B.c(-1))) {
                                                                          oq.n(param0 + 4941);
                                                                        }
                                                                      } else {
                                                                        if (var6 == 6) {
                                                                          if (!this.field_B.b((byte) 112)) {
                                                                            break L2;
                                                                          }
                                                                          if (ne.field_u != null) {
                                                                            tq.d((byte) -124);
                                                                          } else {
                                                                            var6 = param1 ? 1 : 0;
                                                                            nm.field_c = false;
                                                                            qr.a(-28038, var6 != 0);
                                                                          }
                                                                        } else {
                                                                          if (var6 != 61 &&
                                                                            var6 != 9) {
                                                                            if (10 == var6) {
                                                                              if (!(!this.field_B.b((byte) 104))) {
                                                                                ba.field_ub.k((byte) -97);
                                                                                var6 = param1 ? 1 : 0;
                                                                                stackIn_212_0 = -3405;
                                                                                stackIn_212_1 = -1;
                                                                                if (mg.a(true)) {
                                                                                  stackIn_213_2 = 21;
                                                                                } else {
                                                                                  stackIn_213_2 = 0;
                                                                                }
                                                                                fq.a(stackIn_212_0, stackIn_212_1, stackIn_213_2, var6 != 0);
                                                                              }
                                                                            } else {
                                                                              if (var6 == 11) {
                                                                                if (!(!this.field_B.b((byte) 113))) {
                                                                                  ba.field_ub.F(1791);
                                                                                  var6 = param1 ? 1 : 0;
                                                                                  stackIn_218_0 = -3405;
                                                                                  stackIn_218_1 = -1;
                                                                                  if (mg.a(true)) {
                                                                                    stackIn_219_2 = 21;
                                                                                  } else {
                                                                                    stackIn_219_2 = 0;
                                                                                  }
                                                                                  fq.a(stackIn_218_0, stackIn_218_1, stackIn_219_2, var6 != 0);
                                                                                }
                                                                              } else {
                                                                                if (12 == var6) {
                                                                                  if (!this.field_B.b((byte) 120)) {
                                                                                    break L2;
                                                                                  }
                                                                                  if ((ba.field_ub.field_L & hq.field_c) != 0) {
                                                                                    ba.field_ub.o((byte) -17);
                                                                                  } else {
                                                                                    var6 = param1 ? 1 : 0;
                                                                                    stackIn_224_0 = -3405;
                                                                                    stackIn_224_1 = -7;
                                                                                    if (!mg.a(true)) {
                                                                                      stackIn_225_2 = 0;
                                                                                    } else {
                                                                                      stackIn_225_2 = 21;
                                                                                    }
                                                                                    fq.a(stackIn_224_0, stackIn_224_1, stackIn_225_2, var6 != 0);
                                                                                  }
                                                                                } else {
                                                                                  if (var6 != 3) {
                                                                                    if (var6 == 13) {
                                                                                      if (!(!this.field_B.b((byte) 122))) {
                                                                                        if (ib.field_v) {
                                                                                          ba.field_ub.F(1791);
                                                                                          var6 = param1 ? 1 : 0;
                                                                                          fq.a(param0 ^ 19737, -5, sq.field_b, var6 != 0);
                                                                                        }
                                                                                        if (!(!mj.field_e)) {
                                                                                          ef.a(0, 3, 11);
                                                                                        }
                                                                                      }
                                                                                      break L1;
                                                                                    }
                                                                                    switch (var6) {
                                                                                      case 17:
                                                                                        if (!this.field_B.b((byte) 94)) {
                                                                                          break L2;
                                                                                        }
                                                                                        eo.field_Lb = 0;
                                                                                        break L1;
                                                                                      case 18:
                                                                                        if (!this.field_B.b((byte) 86)) {
                                                                                          break L2;
                                                                                        }
                                                                                        eo.field_Lb = 1;
                                                                                        break L1;
                                                                                      default:
                                                                                        break L1;
                                                                                      case 19:
                                                                                        if (!this.field_B.b((byte) 83)) {
                                                                                          break L2;
                                                                                        }
                                                                                        tk.a(-1, hk.d(99));
                                                                                        break L1;
                                                                                    }
                                                                                  }
                                                                                  if (!this.field_B.b((byte) 78)) {
                                                                                    break L2;
                                                                                  }
                                                                                  if ((ba.field_ub.field_L & f.field_f) != 0) {
                                                                                    var6 = param1 ? 1 : 0;
                                                                                    stackIn_240_0 = -3405;
                                                                                    stackIn_240_1 = -8;
                                                                                    if (mg.a(true)) {
                                                                                      stackIn_241_2 = 21;
                                                                                    } else {
                                                                                      stackIn_241_2 = 0;
                                                                                    }
                                                                                    fq.a(stackIn_240_0, stackIn_240_1, stackIn_241_2, var6 != 0);
                                                                                  } else {
                                                                                    if ((ba.field_ub.field_L & sk.field_d) != 0) {
                                                                                      var6 = param1 ? 1 : 0;
                                                                                      stackIn_236_0 = -3405;
                                                                                      stackIn_236_1 = -6;
                                                                                      if (!mg.a(true)) {
                                                                                        stackIn_237_2 = 0;
                                                                                      } else {
                                                                                        stackIn_237_2 = 21;
                                                                                      }
                                                                                      fq.a(stackIn_236_0, stackIn_236_1, stackIn_237_2, var6 != 0);
                                                                                    } else {
                                                                                      var6 = param1 ? 1 : 0;
                                                                                      stackIn_232_0 = -3405;
                                                                                      stackIn_232_1 = -7;
                                                                                      if (!mg.a(true)) {
                                                                                        stackIn_233_2 = 0;
                                                                                      } else {
                                                                                        stackIn_233_2 = 21;
                                                                                      }
                                                                                      fq.a(stackIn_232_0, stackIn_232_1, stackIn_233_2, var6 != 0);
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (!this.field_B.b((byte) 75)) {
                                                                              break L2;
                                                                            }
                                                                            ba.field_ub.c(256, param1);
                                                                            vq.field_Sb = true;
                                                                            jc.field_c = false;
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
                                                      }
                                                    }
                                                  } else {
                                                    if (!(!this.field_B.b((byte) 51))) {
                                                      var6 = param1 ? 1 : 0;
                                                      stackIn_129_0 = -3405;
                                                      stackIn_129_1 = -1;
                                                      if (mg.a(true)) {
                                                        stackIn_130_2 = 21;
                                                      } else {
                                                        stackIn_130_2 = 0;
                                                      }
                                                      fq.a(stackIn_129_0, stackIn_129_1, stackIn_130_2, var6 != 0);
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
              break L1;
            }
            if (this.field_B.b((byte) 97)) {
              fq.a(-3405, 6, 0, param1);
            }
          }
        }
    }

    final void c(byte param0) {
        if (param0 > -15) {
          this.a((byte) 12, -69);
        }
    }

    final void a(lr param0, int[] param1, int param2, int param3, String param4, int param5, int param6) {
        int var11 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String[] var18 = null;
        int[] var25 = null;
        int[] var26 = null;
        var17 = Pool.field_O;
        try {
          if (param3 != -16097) {
            this.c(38);
          }
          if (param4 != hq.field_m) {
            if (param4.equals(hq.field_m)) {
              return;
            }
            var18 = new String[32];
            var9 = param0.a(param4, new int[]{param5}, var18);
            var10 = 0;
            for (var11 = 0; var9 > var11; var11++) {
              var10 = var10 + param1[var11 % param1.length];
            }
            uh.field_p = new dd(param5, var10 + param0.field_w);
            var25 = new int[4];
            var26 = qh.field_d;
            var13 = qh.field_l;
            var14 = qh.field_f;
            qh.a(var25);
            uh.field_p.e();
            var15 = 0;
            var16 = param0.field_C;
            while (var15 < var9) {
              param0.d(var18[var15], 0, var16, param6, -1);
              var15++;
              var16 = var16 + param1[var15 % param1.length];
            }
            sh.field_P.b(15100);
            qh.a(var26, var13, var14);
            qh.b(var25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("ob.WB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(byte param0) {
        fq.a(-3405, this.field_w, this.field_w, false);
        if (param0 > -11) {
          this.a(11, false, -44);
        }
    }

    int a(byte param0, int param1) {
        if (param0 != 69) {
          this.a(true, 77);
        }
        return 36;
    }

    void b(byte param0) {
        qh.g(0, 0, qh.field_l, qh.field_f);
        if (param0 != 108) {
          field_y = (int[]) null;
        }
    }

    final void a(int[] param0, boolean param1) {
        try {
          this.field_h = param0;
          this.field_B = new ia(this.field_h.length);
          if (!param1) {
            this.b(5, true);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ob.SB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, int param1, boolean param2) {
        if (param0 != ~this.field_B.field_h) {
          param1 = this.field_B.field_h;
        }
        this.field_B.a(param2, param1, this.b(-6564, gg.field_f, wn.field_i), true);
        field_D = eo.field_Tb;
    }

    final void b(int param0, boolean param1) {
        uh.field_p.c(qh.field_l - uh.field_p.field_z >> 1, param0);
        if (param1) {
          this.a(-32, 52, true);
        }
    }

    int d(int param0, int param1) {
        if (param0 != 0) {
          return 80;
        }
        return this.field_t;
    }

    boolean f(int param0, int param1) {
        if (param0 != -13676) {
          this.field_n = false;
        }
        return this.field_q;
    }

    boolean e(int param0, int param1) {
        int var3 = -92 / ((-42 - param1) / 49);
        return true;
    }

    final void b(int param0) {
        qh.f(param0, 0, qh.field_l, qh.field_f, 0);
    }

    void e(byte param0) {
        if (param0 != -6) {
          field_F = 50;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param4 != -24267) {
          this.field_p = true;
        }
    }

    private final int c(int param0, int param1) {
        if (param1 != -4) {
          this.field_n = false;
        }
        if (!this.a(param0, true)) {
          return this.field_B.field_h != param0 ? 1 : 2;
        }
        return this.field_B.field_h == param0 ? 3 : 4;
    }

    void c(int param0) {
        int var2 = 0;
        int var3;
        var3 = Pool.field_O;
        this.a(false);
        if (fm.field_G == null ||
          !(fm.field_G.length >= this.field_B.field_e)) {
          fm.field_G = new dd[this.field_B.field_e];
          mc.field_h = new int[this.field_B.field_e];
          jq.field_e = new String[this.field_B.field_e];
        }
        if (param0 < 36) {
          return;
        }
        for (var2 = 0; var2 < this.field_B.field_e; var2++) {
          if (this.e(var2, -126)) {
            this.b(true, var2);
          }
        }
        if (0 == this.field_E) {
          cl.field_k.c(0, qh.field_f - cl.field_k.field_y);
          od.field_a.c(qh.field_l - od.field_a.field_w, qh.field_f - od.field_a.field_y);
        }
    }

    final static void a(int param0, of param1, int param2, int param3, int param4, int param5, im param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        kn var13 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          dr.a(param6.field_jc, -1, param6.field_Sb, -1, param1, param6.field_dc, 32540, param6, (int[]) null);
          vl.field_m.a((byte) 124, true);
          vl.field_m.a(0, (int[]) null, (byte) 75);
          vl.field_m.a((byte) 65);
          var13 = vl.field_m;
          var8 = param5;
          var9 = param4;
          var10 = param2;
          var11 = param0;
          var13.field_n.c(var10, var11, var8, 0, var9);
          if (param3 != 9851) {
            ob.d((byte) -122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("ob.AC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    int a(boolean param0, int param1) {
        if (param0) {
          this.e((byte) 8);
        }
        return this.field_C;
    }

    final static void a(int[] param0, int[] param1, int[] param2, int[] param3, float[] param4, int[] param5, float[] param6, int param7, int[] param8) {
        float var9_float = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        float var24Lifetime1;
        float var24Lifetime2;
        float var24Lifetime3;
        try {
          var9_float = param4[0];
          var10 = param6[param7];
          var11 = param4[1];
          var12 = param6[1];
          var13 = param4[2];
          var14 = param6[2];
          var15 = -(var12 * var13) + var11 * var14;
          var16 = -(1.0f * var14) + 1.0f * var12;
          var17 = var13 * 1.0f - 1.0f * var11;
          var18 = -(var14 * var9_float) + var13 * var10;
          var19 = var14 * 1.0f - var10 * 1.0f;
          var20 = -(var13 * 1.0f) + var9_float * 1.0f;
          var21 = -(var10 * var11) + var9_float * var12;
          var22 = -(var12 * 1.0f) + 1.0f * var10;
          var23 = 1.0f * var11 - var9_float * 1.0f;
          var24 = 1.0f / (var9_float * var16 + 1.0f * var15 + var17 * var10);
          var20 = var20 * var24;
          var17 = var24 * var17;
          var22 = var22 * var24;
          var23 = var24 * var23;
          var21 = var21 * var24;
          var16 = var24 * var16;
          var15 = var15 * var24;
          var18 = var18 * var24;
          var19 = var24 * var19;
          var25 = param5[0];
          var26 = param3[0];
          var27 = param2[0];
          var28 = param5[1];
          var29 = param3[1];
          var30 = param2[1];
          var31 = param5[2];
          var32 = param3[2];
          var33 = param2[2];
          var24Lifetime1 = 0.5f + (var15 * (float)var25 + var18 * (float)var28 + var21 * (float)var31);
          param8[0] = (int)var24Lifetime1;
          param8[1] = (int)(var22 * (float)var31 + (var16 * (float)var25 + var24Lifetime1 + (float)var28 * var19) + 0.5f);
          param8[2] = (int)((float)var31 * var23 + ((float)var28 * var20 + (var24Lifetime1 + var17 * (float)var25)) + 0.5f);
          var24Lifetime2 = 0.5f + ((float)var32 * var21 + (var18 * (float)var29 + var15 * (float)var26));
          param1[0] = (int)var24Lifetime2;
          param1[1] = (int)(var24Lifetime2 + var16 * (float)var26 + (float)var29 * var19 + (float)var32 * var22 + 0.5f);
          param1[2] = (int)(var20 * (float)var29 + (var24Lifetime2 + var17 * (float)var26) + (float)var32 * var23 + 0.5f);
          var24Lifetime3 = (float)var33 * var21 + ((float)var30 * var18 + var15 * (float)var27) + 0.5f;
          param0[0] = (int)var24Lifetime3;
          param0[2] = (int)(var20 * (float)var30 + (var24Lifetime3 + (float)var27 * var17) + (float)var33 * var23 + 0.5f);
          param0[1] = (int)((float)var33 * var22 + ((float)var30 * var19 + (var16 * (float)var27 + var24Lifetime3)) + 0.5f);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ob.VB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_p = true;
        int var4 = null != this.field_z ? this.field_z.field_y : 0;
        if (param2 != -10) {
          return;
        }
        this.a(qh.field_l - 2 * param0, param1, param0, -param1 + var4 + (qh.field_f - param1), 0);
    }

    boolean a(int param0, boolean param1) {
        if (!param1) {
          return false;
        }
        return this.e(param0, -126);
    }

    ob(dd param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        this.field_q = false;
        this.field_n = true;
        this.field_z = null;
        this.field_p = false;
        this.field_l = true;
        try {
          this.field_t = param2;
          this.field_z = param0;
          this.field_s = param5;
          this.field_C = param3;
          this.field_x = param4;
          s.field_c[param1] = this;
          this.field_E = param1;
          this.a(param6, true);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    void e(int param0) {
        this.field_B.e(-15525);
        if (param0 != -34) {
          ob.d((byte) 126);
        }
    }

    static {
        field_j = 11;
        field_i = 9;
        field_m = new int[]{2, 20, 21, 49, 5, 13};
        field_D = 0;
        field_F = 1 << field_j;
    }
}
