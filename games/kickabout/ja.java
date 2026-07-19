/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends ta {
    static boolean[] field_Z;
    private hd field_K;
    static String field_L;
    private int field_V;
    static ut field_S;
    private hd field_ab;
    private int field_U;
    private hd field_X;
    private dd field_cb;
    private int field_Q;
    private hd field_G;
    private hd field_Y;
    private String field_T;
    private hd field_F;
    private vn field_db;
    private int field_R;
    private hd[] field_J;
    private hd field_H;
    static String field_W;
    private int field_bb;
    static String field_M;
    private hd field_eb;
    private hd field_P;
    static boolean field_O;
    private int field_N;
    static String field_I;

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        nt var4_ref_nt = null;
        int var4 = 0;
        tf var5 = null;
        gi var6 = null;
        int var7 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        var7 = Kickabout.field_G;
        super.a((byte) -40, param1);
        this.field_P.field_s = this.field_j + 16;
        this.field_P.b(0, param1);
        this.field_ab.field_s = this.field_j;
        this.field_ab.b(0, param1);
        var3 = 44 / ((38 - param0) / 60);
        this.g(0);
        var4_ref_nt = (nt) ((Object) this.field_F.field_jb.g(24009));
        L0: while (true) {
          if (var4_ref_nt == null) {
            var4 = 0;
            L1: while (true) {
              if (2 <= var4) {
                L2: {
                  var4 = 0;
                  if ((this.field_Y.field_sb ^ -1) != -2) {
                    break L2;
                  } else {
                    var4--;
                    kj.a((byte) -99);
                    break L2;
                  }
                }
                L3: {
                  if ((this.field_K.field_sb ^ -1) != -2) {
                    break L3;
                  } else {
                    var4++;
                    kj.a((byte) -116);
                    break L3;
                  }
                }
                L4: {
                  if (wr.field_f >= wt.field_x) {
                    break L4;
                  } else {
                    if (-1 != (id.field_v ^ -1)) {
                      L5: {
                        stackOut_26_0 = var4;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if ((id.field_v ^ -1) <= -1) {
                          stackOut_28_0 = stackIn_28_0;
                          stackOut_28_1 = 1;
                          stackIn_29_0 = stackOut_28_0;
                          stackIn_29_1 = stackOut_28_1;
                          break L5;
                        } else {
                          stackOut_27_0 = stackIn_27_0;
                          stackOut_27_1 = -1;
                          stackIn_29_0 = stackOut_27_0;
                          stackIn_29_1 = stackOut_27_1;
                          break L5;
                        }
                      }
                      var4 = stackIn_29_0 + stackIn_29_1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (var4 == 0) {
                    break L6;
                  } else {
                    this.c(-75, var4);
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    if (this.field_bb != ic.field_h.field_w) {
                      break L8;
                    } else {
                      if (this.field_N != ic.field_h.field_k) {
                        break L8;
                      } else {
                        if (ic.field_h.field_R != this.field_Q) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  this.f(-3);
                  break L7;
                }
                return;
              } else {
                var5 = this.field_J[var4].field_jb;
                var6 = (gi) ((Object) var5.g(24009));
                L9: while (true) {
                  if (var6 == null) {
                    var4++;
                    continue L1;
                  } else {
                    L10: {
                      if (0 == var6.field_sb) {
                        break L10;
                      } else {
                        L11: {
                          if (var4 != 0) {
                            mr.a((byte) 74, var6.field_yb);
                            break L11;
                          } else {
                            kw.a(123, var6.field_yb);
                            break L11;
                          }
                        }
                        kj.a((byte) -117);
                        break L10;
                      }
                    }
                    var6 = (gi) ((Object) var5.c(33));
                    continue L9;
                  }
                }
              }
            }
          } else {
            var4_ref_nt.c(-1, param1);
            if (-1 != (var4_ref_nt.field_Jb.field_sb ^ -1)) {
              L12: {
                if (var4_ref_nt.field_Ib) {
                  break L12;
                } else {
                  if (var4_ref_nt.field_Kb) {
                    break L12;
                  } else {
                    ub.a(var4_ref_nt.field_Cb.field_m, (byte) -38);
                    break L12;
                  }
                }
              }
              var4_ref_nt = (nt) ((Object) this.field_F.field_jb.c(33));
              continue L0;
            } else {
              var4_ref_nt = (nt) ((Object) this.field_F.field_jb.c(33));
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, boolean param2) {
        rd[] var5_ref_rd__ = null;
        int var5 = 0;
        int var6_int = 0;
        hd var6 = null;
        up[] var6_array = null;
        rd var7_ref_rd = null;
        int var7 = 0;
        up var8 = null;
        int var9 = 0;
        up[] var10 = null;
        tf var11 = null;
        var9 = Kickabout.field_G;
        super.a(0, param1, param2);
        this.field_P.field_s = 656;
        this.field_P.b(0, false);
        this.field_ab.field_s = 640;
        this.field_ab.b(param0 ^ 0, false);
        var11 = new tf();
        var5_ref_rd__ = je.field_f;
        var6_int = 0;
        L0: while (true) {
          if (var5_ref_rd__.length <= var6_int) {
            this.field_F.field_jb = var11;
            var5 = 5;
            var6 = (hd) ((Object) this.field_F.field_jb.g(24009));
            L1: while (true) {
              if (var6 == null) {
                this.field_F.field_s = 0;
                this.field_V = param0;
                this.field_F.field_q = var5 - 12 - -10;
                var10 = ic.field_h.field_i;
                var6_array = ic.field_h.field_i;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var10.length) {
                    this.field_U = 0;
                    this.f(-3);
                    return;
                  } else {
                    var8 = var10[var7];
                    if (!var8.c(-2)) {
                      this.field_V = this.field_V + 1;
                      var7++;
                      continue L2;
                    } else {
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                var6.field_mb = this.field_F.field_mb;
                var6.field_s = var5;
                var6.field_J = 0;
                var5 = var5 + (12 + var6.field_q);
                var6 = (hd) ((Object) this.field_F.field_jb.c(33));
                continue L1;
              }
            }
          } else {
            var7_ref_rd = var5_ref_rd__[var6_int];
            if (var7_ref_rd.a(ic.field_h.field_e, param0 + 109, tk.field_Ib)) {
              var11.a(new nt(ic.field_h, var7_ref_rd), 3);
              var6_int++;
              continue L0;
            } else {
              var6_int++;
              continue L0;
            }
          }
        }
    }

    private final void g(int param0) {
        wh discarded$3 = null;
        wh discarded$4 = null;
        wh discarded$5 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        hd stackIn_33_0 = null;
        hd stackIn_34_0 = null;
        hd stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        hd stackIn_40_0 = null;
        hd stackIn_41_0 = null;
        hd stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        hd stackOut_32_0 = null;
        hd stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        hd stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        hd stackOut_39_0 = null;
        hd stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        hd stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        L0: {
          if (-1 > (cg.field_D ^ -1)) {
            cg.field_D = cg.field_D - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = 0;
          if (1 == this.field_eb.field_qb) {
            L2: {
              if (0 != this.field_R % 2) {
                break L2;
              } else {
                this.field_F.field_fb = this.field_F.field_fb + 16;
                var2 = 1;
                break L2;
              }
            }
            L3: {
              if (cg.field_D != 0) {
                break L3;
              } else {
                discarded$3 = sp.c(59, 119);
                cg.field_D = 8;
                break L3;
              }
            }
            this.field_R = this.field_R + 1;
            break L1;
          } else {
            break L1;
          }
        }
        L4: {
          if ((this.field_H.field_qb ^ -1) == -2) {
            L5: {
              if (this.field_R % 2 == 0) {
                this.field_F.field_fb = this.field_F.field_fb - 16;
                var2 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 != (cg.field_D ^ -1)) {
                break L6;
              } else {
                discarded$4 = sp.c(60, 33);
                cg.field_D = 8;
                break L6;
              }
            }
            this.field_R = this.field_R + 1;
            break L4;
          } else {
            break L4;
          }
        }
        L7: {
          var3 = id.field_v;
          if (0 == var3) {
            break L7;
          } else {
            if (!this.field_X.field_gb) {
              break L7;
            } else {
              this.field_F.field_fb = this.field_F.field_fb - 16 * var3;
              var2 = 1;
              if (0 == cg.field_D) {
                L8: {
                  if ((var3 ^ -1) < -1) {
                    stackOut_24_0 = 60;
                    stackIn_25_0 = stackOut_24_0;
                    break L8;
                  } else {
                    stackOut_23_0 = 59;
                    stackIn_25_0 = stackOut_23_0;
                    break L8;
                  }
                }
                discarded$5 = sp.c(stackIn_25_0, -125);
                cg.field_D = 8;
                break L7;
              } else {
                break L7;
              }
            }
          }
        }
        L9: {
          if (-(this.field_F.field_fb + this.field_F.field_s) > 0) {
            stackOut_28_0 = 0;
            stackIn_29_0 = stackOut_28_0;
            break L9;
          } else {
            stackOut_27_0 = 1;
            stackIn_29_0 = stackOut_27_0;
            break L9;
          }
        }
        L10: {
          var4 = stackIn_29_0;
          if (this.field_F.field_G + (this.field_F.field_q + -this.field_G.field_q) > -(this.field_F.field_s - -this.field_F.field_fb)) {
            stackOut_31_0 = 0;
            stackIn_32_0 = stackOut_31_0;
            break L10;
          } else {
            stackOut_30_0 = 1;
            stackIn_32_0 = stackOut_30_0;
            break L10;
          }
        }
        L11: {
          var5 = stackIn_32_0;
          stackOut_32_0 = this.field_eb;
          stackIn_34_0 = stackOut_32_0;
          stackIn_33_0 = stackOut_32_0;
          if (var4 != 0) {
            stackOut_34_0 = (hd) ((Object) stackIn_34_0);
            stackOut_34_1 = 0;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            break L11;
          } else {
            stackOut_33_0 = (hd) ((Object) stackIn_33_0);
            stackOut_33_1 = 1;
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            break L11;
          }
        }
        L12: {
          stackIn_35_0.field_lb = stackIn_35_1 != 0;
          if (this.field_eb.field_qb != param0) {
            break L12;
          } else {
            if (0 == this.field_H.field_qb) {
              this.field_R = 0;
              break L12;
            } else {
              break L12;
            }
          }
        }
        L13: {
          stackOut_39_0 = this.field_H;
          stackIn_41_0 = stackOut_39_0;
          stackIn_40_0 = stackOut_39_0;
          if (var5 != 0) {
            stackOut_41_0 = (hd) ((Object) stackIn_41_0);
            stackOut_41_1 = 0;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            break L13;
          } else {
            stackOut_40_0 = (hd) ((Object) stackIn_40_0);
            stackOut_40_1 = 1;
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            break L13;
          }
        }
        L14: {
          stackIn_42_0.field_lb = stackIn_42_1 != 0;
          if (var2 != 0) {
            L15: {
              if (var4 == 0) {
                break L15;
              } else {
                this.field_F.field_fb = -this.field_F.field_s;
                break L15;
              }
            }
            if (var5 != 0) {
              this.field_F.field_fb = -this.field_F.field_s + -(-this.field_G.field_q + (this.field_F.field_G + this.field_F.field_q));
              break L14;
            } else {
              break L14;
            }
          } else {
            break L14;
          }
        }
    }

    private final void c(int param0, int param1) {
        int var3 = this.field_U;
        this.field_U = this.field_U + param1;
        if (param0 >= -7) {
            this.field_X = (hd) null;
        }
        if (!((this.field_U ^ -1) <= -1)) {
            this.field_U = this.field_V - 1;
        }
        if (!(this.field_V > this.field_U)) {
            this.field_U = 0;
        }
        if (!(this.field_U == var3)) {
            this.f(-3);
        }
    }

    final boolean a(int param0, int param1, char param2) {
        if ((param0 ^ -1) == -97) {
            this.c(-22, -1);
        }
        if (param0 == 97) {
            this.c(-87, 1);
        }
        if (param1 > -5) {
            this.a(78, true);
        }
        return super.a(param0, -100, param2);
    }

    final void a(int param0, boolean param1) {
        hd var3_ref_hd = null;
        int var3 = 0;
        Object var4 = null;
        gi var5 = null;
        int var6 = 0;
        nt var7 = null;
        var6 = Kickabout.field_G;
        super.a(param0, param1);
        on.a(this.field_P.field_F - 8, -8 + this.field_P.field_T, this.field_P.field_q - -16, this.field_P.field_mb + 16, 65793, 96);
        var3_ref_hd = (hd) ((Object) this.field_P.field_jb.g(param0 + 24014));
        L0: while (true) {
          if (var3_ref_hd == null) {
            un.field_d.a(le.field_c, -26 + this.field_G.field_F, this.field_G.field_T + -16, 16777215, -1);
            var3 = 0;
            L1: while (true) {
              if (-3 >= (var3 ^ -1)) {
                this.field_P.a(114, false);
                pt.a(this.field_G.field_F + this.field_G.field_q, -22914, this.field_G.field_F, this.field_G.field_mb + this.field_G.field_T, this.field_G.field_T);
                var7 = (nt) ((Object) this.field_F.field_jb.g(24009));
                L2: while (true) {
                  if (var7 == null) {
                    ta.e(124);
                    var3 = 0;
                    L3: while (true) {
                      if ((var3 ^ -1) <= -3) {
                        return;
                      } else {
                        var4 = null;
                        var5 = (gi) ((Object) this.field_J[var3].field_jb.g(24009));
                        L4: while (true) {
                          if (var5 == null) {
                            if (var4 != null) {
                              ((gi) (var4)).a(param0 + 8);
                              var3++;
                              continue L3;
                            } else {
                              var3++;
                              continue L3;
                            }
                          } else {
                            L5: {
                              if (!var5.c(false)) {
                                var5.a(param0 ^ -8);
                                break L5;
                              } else {
                                var4 = var5;
                                break L5;
                              }
                            }
                            var5 = (gi) ((Object) this.field_J[var3].field_jb.c(33));
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var7.h(-24508);
                    var7 = (nt) ((Object) this.field_F.field_jb.c(33));
                    continue L2;
                  }
                }
              } else {
                un.field_d.a(dh.field_j[var3], 6 + this.field_J[var3].field_F, -8 + this.field_J[var3].field_T, 16777215, -1);
                var3++;
                continue L1;
              }
            }
          } else {
            on.a(var3_ref_hd.field_F, var3_ref_hd.field_T, var3_ref_hd.field_q, var3_ref_hd.field_mb, 10, 65793, 96);
            var3_ref_hd = (hd) ((Object) this.field_P.field_jb.c(33));
            continue L0;
          }
        }
    }

    final void b(int param0) {
        int var3 = 0;
        hd var4 = null;
        int var4_int = 0;
        gi var5 = null;
        int var6 = 0;
        hd var7 = null;
        var6 = Kickabout.field_G;
        this.field_P = new hd();
        this.field_X = new hd();
        var7 = new hd();
        this.field_P.a(true, 370, 16, 80, 330);
        this.field_X.a(true, 370, 0, 0, 130);
        var7.a(true, 370, 0, 140, 190);
        this.field_P.a((byte) -115, this.field_X);
        this.field_P.a((byte) -113, var7);
        this.field_F = new hd();
        this.field_G = new hd();
        this.field_eb = eo.a(false);
        this.field_H = eo.a(true);
        this.field_eb.field_s = 5;
        this.field_H.field_s = this.field_X.field_q - (this.field_H.field_q + 5);
        this.field_H.field_J = -this.field_eb.field_mb + this.field_X.field_mb >> 394547009;
        this.field_eb.field_J = -this.field_eb.field_mb + this.field_X.field_mb >> 394547009;
        this.field_G.a((byte) -114, this.field_F);
        this.field_G.a(true, 290, 40, 38, 84);
        this.field_F.field_mb = this.field_G.field_mb;
        this.field_X.a((byte) -105, this.field_G);
        this.field_X.a((byte) -115, this.field_eb);
        this.field_X.a((byte) -122, this.field_H);
        this.field_J = new hd[2];
        var3 = 0;
        L0: while (true) {
          if (var3 >= 2) {
            L1: {
              this.field_J[1].field_J = this.field_J[1].field_J + ((var7.field_mb >> 1477213697) - 6);
              this.field_Y = eo.a(false);
              this.field_K = eo.a(true);
              var3 = 5;
              this.field_Y.field_s = -this.field_Y.field_q + (-var3 + 532);
              this.field_K.field_s = 532 - -var3;
              var4 = this.field_Y;
              this.field_K.field_J = 436;
              var4.field_J = 436;
              this.field_ab = new hd();
              this.field_ab.a((byte) -106, this.field_Y);
              this.field_ab.a((byte) -105, this.field_K);
              this.field_ab.a(true, 640, 0, 0, 480);
              if (param0 == -38) {
                break L1;
              } else {
                this.field_R = -25;
                break L1;
              }
            }
            this.field_cb = new dd(1);
            return;
          } else {
            this.field_J[var3] = new hd();
            var4_int = 0;
            L2: while (true) {
              if (-33 >= (var4_int ^ -1)) {
                this.field_J[var3].a(true, 354, 8, 40, 58);
                var7.a((byte) -123, this.field_J[var3]);
                var3++;
                continue L0;
              } else {
                var5 = new gi(ic.field_h, var3, var4_int);
                var5.a(true, 22, 22 * (var4_int % 16), var4_int / 16 * 22, 22);
                this.field_J[var3].a((byte) -110, (hd) (var5));
                var4_int++;
                continue L2;
              }
            }
          }
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        Object var3 = null;
        int var4 = 0;
        up var5 = null;
        int var6 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        Object stackIn_12_4 = null;
        int stackIn_12_5 = 0;
        Object stackIn_12_6 = null;
        int stackIn_12_7 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        Object stackIn_13_4 = null;
        int stackIn_13_5 = 0;
        Object stackIn_13_6 = null;
        int stackIn_13_7 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        Object stackIn_14_4 = null;
        int stackIn_14_5 = 0;
        Object stackIn_14_6 = null;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        Object stackIn_15_4 = null;
        int stackIn_15_5 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        Object stackIn_16_4 = null;
        int stackIn_16_5 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        Object stackIn_17_4 = null;
        int stackIn_17_5 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        Object stackIn_18_4 = null;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        Object stackOut_11_4 = null;
        int stackOut_11_5 = 0;
        Object stackOut_11_6 = null;
        int stackOut_11_7 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        Object stackOut_13_4 = null;
        int stackOut_13_5 = 0;
        Object stackOut_13_6 = null;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        Object stackOut_12_4 = null;
        int stackOut_12_5 = 0;
        Object stackOut_12_6 = null;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        Object stackOut_14_4 = null;
        int stackOut_14_5 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        Object stackOut_15_4 = null;
        int stackOut_15_5 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        Object stackOut_16_4 = null;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        Object stackOut_17_4 = null;
        int stackOut_17_5 = 0;
        int stackOut_17_6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          if (param0 == -3) {
            break L0;
          } else {
            field_Z = (boolean[]) null;
            break L0;
          }
        }
        var2 = this.field_U;
        var3 = null;
        var4 = 0;
        L1: while (true) {
          L2: {
            if ((var4 ^ -1) <= -10) {
              break L2;
            } else {
              var5 = ic.field_h.field_i[ic.field_h.field_q[var4]];
              if (!var5.c(param0 ^ 3)) {
                if (var2 == 0) {
                  var3 = var5;
                  break L2;
                } else {
                  var2--;
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            }
          }
          L3: {
            if (var3 == null) {
              this.field_db = null;
              break L3;
            } else {
              L4: {
                stackOut_11_0 = this;
                stackOut_11_1 = 109;
                stackOut_11_2 = ic.field_h.field_R;
                stackOut_11_3 = ic.field_h.field_k;
                stackOut_11_4 = var3;
                stackOut_11_5 = ic.field_h.field_w;
                stackOut_11_6 = var3;
                stackOut_11_7 = -107;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                stackIn_13_4 = stackOut_11_4;
                stackIn_13_5 = stackOut_11_5;
                stackIn_13_6 = stackOut_11_6;
                stackIn_13_7 = stackOut_11_7;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                stackIn_12_4 = stackOut_11_4;
                stackIn_12_5 = stackOut_11_5;
                stackIn_12_6 = stackOut_11_6;
                stackIn_12_7 = stackOut_11_7;
                if (jd.f(-1)) {
                  stackOut_13_0 = this;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = stackIn_13_3;
                  stackOut_13_4 = stackIn_13_4;
                  stackOut_13_5 = stackIn_13_5;
                  stackOut_13_6 = stackIn_13_6;
                  stackOut_13_7 = stackIn_13_7;
                  stackOut_13_8 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  stackIn_14_4 = stackOut_13_4;
                  stackIn_14_5 = stackOut_13_5;
                  stackIn_14_6 = stackOut_13_6;
                  stackIn_14_7 = stackOut_13_7;
                  stackIn_14_8 = stackOut_13_8;
                  break L4;
                } else {
                  stackOut_12_0 = this;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = stackIn_12_3;
                  stackOut_12_4 = stackIn_12_4;
                  stackOut_12_5 = stackIn_12_5;
                  stackOut_12_6 = stackIn_12_6;
                  stackOut_12_7 = stackIn_12_7;
                  stackOut_12_8 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  stackIn_14_4 = stackOut_12_4;
                  stackIn_14_5 = stackOut_12_5;
                  stackIn_14_6 = stackOut_12_6;
                  stackIn_14_7 = stackOut_12_7;
                  stackIn_14_8 = stackOut_12_8;
                  break L4;
                }
              }
              L5: {
                L6: {
                  stackOut_14_0 = this;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = stackIn_14_3;
                  stackOut_14_4 = stackIn_14_4;
                  stackOut_14_5 = stackIn_14_5;
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  stackIn_17_3 = stackOut_14_3;
                  stackIn_17_4 = stackOut_14_4;
                  stackIn_17_5 = stackOut_14_5;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  stackIn_15_4 = stackOut_14_4;
                  stackIn_15_5 = stackOut_14_5;
                  if (((up) (Object) stackIn_14_6).c((byte) stackIn_14_7, stackIn_14_8 == 0)) {
                    break L6;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = stackIn_15_3;
                    stackOut_15_4 = stackIn_15_4;
                    stackOut_15_5 = stackIn_15_5;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_17_3 = stackOut_15_3;
                    stackIn_17_4 = stackOut_15_4;
                    stackIn_17_5 = stackOut_15_5;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    stackIn_16_4 = stackOut_15_4;
                    stackIn_16_5 = stackOut_15_5;
                    if (!wn.a((byte) 110)) {
                      break L6;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = stackIn_16_2;
                      stackOut_16_3 = stackIn_16_3;
                      stackOut_16_4 = stackIn_16_4;
                      stackOut_16_5 = stackIn_16_5;
                      stackOut_16_6 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      stackIn_18_3 = stackOut_16_3;
                      stackIn_18_4 = stackOut_16_4;
                      stackIn_18_5 = stackOut_16_5;
                      stackIn_18_6 = stackOut_16_6;
                      break L5;
                    }
                  }
                }
                stackOut_17_0 = this;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = stackIn_17_2;
                stackOut_17_3 = stackIn_17_3;
                stackOut_17_4 = stackIn_17_4;
                stackOut_17_5 = stackIn_17_5;
                stackOut_17_6 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                stackIn_18_4 = stackOut_17_4;
                stackIn_18_5 = stackOut_17_5;
                stackIn_18_6 = stackOut_17_6;
                break L5;
              }
              ((ja) (this)).field_db = pi.a(stackIn_18_1, stackIn_18_2, stackIn_18_3, (up) ((Object) stackIn_18_4), stackIn_18_5, stackIn_18_6 != 0);
              this.field_T = 1 + this.field_U + ": " + ((up) (var3)).d(100);
              this.field_N = ic.field_h.field_k;
              this.field_bb = ic.field_h.field_w;
              this.field_Q = ic.field_h.field_R;
              this.field_cb.a(pv.field_I[((up) (var3)).field_q][3], (byte) -107);
              this.field_cb.a(30, -81);
              if ((((up) (var3)).field_q ^ -1) != -3) {
                break L3;
              } else {
                this.field_cb.a(10, param0 + -36);
                break L3;
              }
            }
          }
          return;
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int[] var12 = null;
        int var5 = 0;
        int var6 = 0;
        eg var7 = null;
        int var8 = 0;
        if (param1 < 99) {
            this.field_U = -111;
        }
        if (!(this.field_db == null)) {
            var3 = ((int)(nj.a(75) % 5000L) << -1191274389) / 5000;
            t.c();
            t.b(532 - -this.field_j, 410);
            var12 = dt.field_f;
            var5 = t.field_o[var3] * var12[0] >> 198750480;
            var6 = var12[0] * t.field_f[var3] >> 1515349328;
            var7 = (eg) ((Object) this.field_cb.a(this.field_db.b(var12[2], var12[3], var5, var12[1], var6), false, true, true));
            var7.a(0, var3, 0, 0, 0, 0, 0, 540);
            var8 = Math.max(120, pb.field_C.a(this.field_T) + 30);
            on.a(this.field_j + (532 + -(var8 >> -2069859167)), 412, var8, 56, 12, 65793, 128);
            pb.field_C.d(this.field_T, 532 + this.field_j, 430, 16777215, -1);
            this.field_ab.a(123, false);
        }
    }

    public static void h(int param0) {
        if (param0 != 8) {
            field_S = (ut) null;
        }
        field_W = null;
        field_I = null;
        field_S = null;
        field_Z = null;
        field_M = null;
        field_L = null;
    }

    final static boolean d(int param0, int param1) {
        boolean discarded$0 = false;
        if (!(!rj.field_a[param1])) {
            return true;
        }
        if (param0 <= 100) {
            discarded$0 = ja.d(98, 120);
        }
        if (!sk.field_d.field_k[0].a(1, 176400, vp.field_j, bq.field_a, ad.field_d[param1])) {
            dd.a((byte) 113);
            return false;
        }
        rj.field_a[param1] = true;
        return true;
    }

    ja() {
        this.field_R = 0;
    }

    static {
        field_Z = new boolean[]{false, true, true, true};
        field_L = "The rating threshold for the <%0> is <%1>.<br>Your rating is<nbsp><%2>; league points won are reduced.";
        field_W = "You must have unlocked a Hidden Achievement to wear this kit.";
        field_M = "Sell";
        field_I = "my current pitch";
    }
}
