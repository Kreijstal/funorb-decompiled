/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends js {
    private boolean field_z;
    private int[] field_J;
    private boolean field_K;
    private int[] field_H;
    private kp[] field_S;
    private int field_h;
    private int[][] field_Y;
    private int field_A;
    private int field_m;
    private int field_q;
    private String field_r;
    private tv field_g;
    private int field_v;
    private kp[] field_T;
    private int[][] field_D;
    private ko field_Z;
    private int[] field_P;
    private int[] field_t;
    private int field_L;
    private bl[] field_y;
    private int[] field_B;
    private int[] field_I;
    private boolean field_U;
    private String[] field_Q;
    private int[][] field_O;
    static an field_j;
    private int field_W;
    private io[] field_X;
    private int[] field_M;
    private int field_C;
    private int[] field_p;
    private int field_x;
    private int field_R;
    private int[] field_o;
    private boolean field_i;
    private int field_s;
    private int[] field_w;
    private int[] field_l;
    private int field_G;
    private int field_E;
    private int field_u;
    static int field_V;
    static r field_N;
    private int field_n;
    private int field_k;
    static ld field_F;

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Kickabout.field_G;
        if (null != this.field_X) {
          on.a(40, g.field_a.field_J + -42, 140 * this.field_X.length, 50, 8, 65793, 128);
          var2 = -9 / ((param0 - 35) / 36);
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_X.length) {
              return;
            } else {
              if (this.a(var3, -1)) {
                this.field_X[var3].a(this.b(8, var3), this.c(var3, 96), 13800);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static vl a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        vl[] var3 = null;
        int var4 = 0;
        vl var5 = null;
        int var6 = 0;
        vl stackIn_5_0 = null;
        vl stackIn_11_0 = null;
        vl stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -7465) {
                break L1;
              } else {
                field_N = (r) null;
                break L1;
              }
            }
            var2 = nj.a(0, "jagex-last-login-method", param0);
            if (var2 != null) {
              var3 = pb.a(true);
              var4 = 0;
              L2: while (true) {
                if (var3.length <= var4) {
                  stackIn_14_0 = rd.field_h;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, -97)) {
                    stackIn_11_0 = (vl) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_5_0 = rd.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("lm.R(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    private final void b(int param0, boolean param1) {
        if ((param0 ^ -1) == -55) {
            ph.field_a = 0;
        }
        if (-54 == (param0 ^ -1)) {
            ph.field_a = 1;
        }
        if (param1) {
            return;
        }
        if (!(param0 != 52)) {
            ph.field_a = 2;
        }
        ii.a((byte) -121);
    }

    final void a(ml param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        try {
            var3_int = param0.h((byte) -125);
            this.field_Q = new String[var3_int];
            this.field_H = new int[var3_int];
            if (param1) {
                field_F = (ld) null;
            }
            for (var4 = 0; this.field_Q.length > var4; var4++) {
                this.field_Q[var4] = param0.a(47);
                this.field_H[var4] = param0.h((byte) -120);
            }
            this.field_R = param0.h((byte) -112);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lm.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = Kickabout.field_G;
          var4 = 0;
          if (param1 >= 63) {
            break L0;
          } else {
            this.field_Z = (ko) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 >= this.field_Z.field_a) {
            return -1;
          } else {
            var5 = this.field_X[var4].field_d;
            var6 = this.field_X[var4].field_h;
            var7 = -(var5 >> -1940077023) + this.c(var4, 96);
            var8 = -(var6 >> -83762623) + this.b(8, var4);
            if (this.a(var4, -1)) {
              if (var7 <= param0) {
                if (param0 < var7 + var5) {
                  if (var8 <= param2) {
                    if (var8 - -var6 > param2) {
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

    final boolean c(int param0) {
        if (param0 != 0) {
            this.field_w = (int[]) null;
        }
        return this.field_R > 0 ? true : false;
    }

    private final int c(int param0, int param1) {
        if (param1 != 96) {
            return 37;
        }
        return 120 - -(param0 * 135);
    }

    private final void b(int param0) {
        int var2 = 20;
        on.a(-(this.field_A >> -1105867359) + 320, var2, this.field_A, this.field_n, 8, 0, 128);
        on.a(-(-20 + this.field_A >> -612876767) + 320, var2 - -10, this.field_A - 20, 30, 8, 65793, 128);
        un.field_d.d("<u=ffffff>" + jc.field_e[2].toUpperCase() + "</u> " + (null != this.field_r ? this.field_r : ""), 320, var2 - -30, 16777215, -1);
        var2 = var2 + ii.field_l;
        int var3 = 22;
        int var4 = 80;
        int var5 = 618;
        int var6 = this.field_n;
        var2 += 60;
        pt.a(var5, -22914, var3, var6, var4);
        on.a(-(-60 + this.field_A >> -833843263) + 320, 10 + var2, -60 + this.field_A, 30, 8, 65793, 128);
        un.field_d.d(lw.field_f.toUpperCase(), 320, var2 + 30, 16777215, -1);
        var2 += 120;
        eo.a(250, var2, qe.field_j, this.field_O, (String[]) null, 160, 21, this.field_Q.length, this.field_Q, -1);
        var2 = var2 + 32 * this.field_O.length;
        var2 += 20;
        on.a(320 + -(this.field_A + -60 >> 1491154305), var2 - -10, -60 + this.field_A, 30, 8, 65793, 128);
        un.field_d.d(ad.field_b.toUpperCase(), 320, 30 + var2, 16777215, -1);
        var2 += 120;
        eo.a(250, var2, d.field_c, this.field_D, (String[]) null, 160, 21, this.field_Q.length, this.field_Q, -1);
        var2 = var2 + this.field_D.length * param0;
        var2 += 20;
        on.a(320 + -(-60 + this.field_A >> -904286655), var2 + 10, this.field_A - 60, 30, 8, 65793, 128);
        un.field_d.d(oe.field_j.toUpperCase(), 320, var2 - -30, 16777215, -1);
        var2 += 120;
        eo.a(250, var2, sr.field_g, this.field_Y, new String[]{"", "%"}, 160, 21, this.field_Q.length, this.field_Q, -1);
        var2 = var2 + this.field_Y.length * 32;
        var2 += 20;
        ta.e(117);
        if (-1 != (this.field_k ^ -1) && this.field_h > this.field_k) {
            on.a(this.field_m, this.field_u, 570, 12, 3, this.field_i ? 11184810 : this.field_s, 128);
            un.field_d.d(qt.field_h, this.field_m - -285, -1 + this.field_u + 12, this.field_i ? 65793 : 11184810, -1);
        }
        if (!(this.field_h == 0)) {
            on.a(this.field_G, this.field_q, 570, 12, 3, this.field_U ? 11184810 : this.field_s, 128);
            un.field_d.d(gu.field_Ib, this.field_G - -285, 12 + (this.field_q - 1), !this.field_U ? 11184810 : 65793, -1);
        }
    }

    final void a(byte param0, boolean param1) {
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_25_0 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        Object stackIn_96_0 = null;
        Object stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int var4;
        int var5_int;
        double var5;
        int var6;
        double var7;
        int var7_int;
        int var8;
        double var9;
        int var9_int;
        int var11;
        int var12;
        int var13;
        tv var14;
        var12 = Kickabout.field_G;
        if (!param1) {
          return;
        } else {
          L0: {
            var14 = h.a(17475);
            var4 = -84 / ((param0 - 38) / 60);
            if (this.field_g != var14) {
              L1: {
                L2: {
                  stackIn_11_0 = this;

                  if (bt.field_e) {
                    break L2;
                  } else {
                    stackIn_11_0 = this;

                    if (this.field_g == var14) {
                      break L2;
                    } else {
                      stackIn_11_0 = this;

                      if (hm.a((byte) -66, var14.field_q)) {
                        break L2;
                      } else {
                        stackIn_12_0 = this;
                        stackIn_12_1 = 1;
                        break L1;
                      }
                    }
                  }
                }
                stackIn_12_0 = this;
                stackIn_12_1 = 0;
                break L1;
              }
              ((lm) (this)).field_K = stackIn_12_1 != 0;
              this.field_g = var14;
              break L0;
            } else {
              if (bt.field_e) {
                this.field_K = false;
                break L0;
              } else {
                this.field_r = null;
                break L0;
              }
            }
          }
          L3: {
            if (0 != this.field_x) {
              this.field_r = vo.a((byte) -18, ks.field_f, new String[]{"<col=FF0000>" + Integer.toString(this.field_x / 50 + 1) + "</col>"});
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (0 != ph.field_a) {
              break L4;
            } else {
              this.field_L = 400;
              this.field_C = 560;
              break L4;
            }
          }
          L5: {
            en.field_o = -1;
            dc.field_c = -1;
            if (ph.field_a == 1) {
              L6: {
                if (-1 == en.field_o) {
                  if (null != this.field_T) {
                    stackIn_25_0 = this.field_T.length;
                    break L6;
                  } else {
                    stackIn_25_0 = 0;
                    break L6;
                  }
                } else {
                  stackIn_25_0 = en.field_o;
                  break L6;
                }
              }
              L7: {
                var5_int = stackIn_25_0;
                this.field_L = 400;
                stackIn_27_0 = this;

                if (7 < var5_int) {
                  stackIn_28_0 = this;
                  stackIn_28_1 = 140;
                  break L7;
                } else {
                  stackIn_28_0 = this;
                  stackIn_28_1 = 0;
                  break L7;
                }
              }
              ((lm) (this)).field_C = stackIn_28_1 + 440;
              break L5;
            } else {
              break L5;
            }
          }
          L8: {
            if (-3 != (ph.field_a ^ -1)) {
              break L8;
            } else {
              this.field_C = 600;
              this.field_L = 400;
              break L8;
            }
          }
          L9: {
            if (this.field_A == this.field_C) {
              break L9;
            } else {
              var5_int = -this.field_A + this.field_C >> -691770685;
              if (0 == var5_int) {
                this.field_A = this.field_C;
                break L9;
              } else {
                this.field_A = this.field_A + var5_int;
                break L9;
              }
            }
          }
          L10: {
            if (this.field_n == this.field_L) {
              break L10;
            } else {
              var5_int = -this.field_n + this.field_L >> -479474653;
              if (0 != var5_int) {
                this.field_n = this.field_n + var5_int;
                break L10;
              } else {
                this.field_n = this.field_L;
                break L10;
              }
            }
          }
          L11: {
            if (!param1) {
              break L11;
            } else {
              this.field_Z.a(-21174, this.a(wt.field_x, 77, us.field_j), this.a(dn.field_yb, 88, kf.field_Eb));
              if (-1 < (this.field_Z.field_e ^ -1)) {
                break L11;
              } else {
                if (this.field_Z.c(-1)) {
                  this.b(this.field_X[this.field_Z.field_e].field_m, false);
                  break L11;
                } else {
                  break L11;
                }
              }
            }
          }
          var5_int = 0;
          L12: while (true) {
            if (var5_int >= this.field_X.length) {
              L13: {
                if (this.field_T != null) {
                  break L13;
                } else {
                  this.field_T = new kp[this.field_S.length];
                  break L13;
                }
              }
              var5_int = 0;
              L14: while (true) {
                if (var5_int >= this.field_T.length) {
                  L15: {
                    L16: {
                      if (ph.field_a == 0) {
                        if (null == this.field_y) {
                          break L16;
                        } else {
                          if (this.field_T == null) {
                            break L16;
                          } else {
                            L17: {
                              var5_int = this.field_T.length + -1;
                              if (this.field_W == 1) {
                                var5_int -= 2;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if (2 != this.field_W) {
                                break L18;
                              } else {
                                var5_int -= 6;
                                break L18;
                              }
                            }
                            L19: {
                              if (-4 == (this.field_W ^ -1)) {
                                var5_int -= 14;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if ((dc.field_c ^ -1) == 0) {
                                break L20;
                              } else {
                                var5_int = 0;
                                break L20;
                              }
                            }
                            var13 = 0;
                            var6 = var13;
                            L21: while (true) {
                              if (var13 >= this.field_y.length) {
                                break L16;
                              } else {
                                if ((this.field_T.length ^ -1) < (var5_int ^ -1)) {
                                  L22: {
                                    if (null == this.field_y[var13]) {
                                      break L22;
                                    } else {
                                      if (this.field_z) {
                                        this.field_y[var13].a(this.field_T[var5_int], param1, -109);
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                  if (-1 == dc.field_c) {
                                    var5_int++;
                                    var13++;
                                    continue L21;
                                  } else {
                                    var13++;
                                    continue L21;
                                  }
                                } else {
                                  var13++;
                                  continue L21;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if ((ph.field_a ^ -1) == -3) {
                          L23: {
                            L24: {
                              stackIn_83_0 = this;

                              if (!param1) {
                                break L24;
                              } else {
                                stackIn_83_0 = this;

                                if (el.field_A < this.field_m) {
                                  break L24;
                                } else {
                                  stackIn_83_0 = this;

                                  if (570 + this.field_m < el.field_A) {
                                    break L24;
                                  } else {
                                    stackIn_83_0 = this;

                                    if (n.field_m < this.field_u) {
                                      break L24;
                                    } else {
                                      stackIn_83_0 = this;

                                      if (12 + this.field_u < n.field_m) {
                                        break L24;
                                      } else {
                                        stackIn_84_0 = this;
                                        stackIn_84_1 = 1;
                                        break L23;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackIn_84_0 = this;
                            stackIn_84_1 = 0;
                            break L23;
                          }
                          L25: {
                            ((lm) (this)).field_i = stackIn_84_1 != 0;
                            if (this.field_h == ii.field_l) {
                              break L25;
                            } else {
                              var5_int = this.field_h - ii.field_l >> 983055523;
                              if (-1 != (var5_int ^ -1)) {
                                ii.field_l = ii.field_l + var5_int;
                                break L25;
                              } else {
                                if (ii.field_l >= this.field_h) {
                                  ii.field_l = ii.field_l - 1;
                                  break L25;
                                } else {
                                  ii.field_l = ii.field_l + 1;
                                  break L25;
                                }
                              }
                            }
                          }
                          L26: {
                            L27: {
                              stackIn_96_0 = this;

                              if (!param1) {
                                break L27;
                              } else {
                                stackIn_96_0 = this;

                                if (el.field_A < this.field_G) {
                                  break L27;
                                } else {
                                  stackIn_96_0 = this;

                                  if (570 + this.field_G < el.field_A) {
                                    break L27;
                                  } else {
                                    stackIn_96_0 = this;

                                    if (n.field_m < this.field_q) {
                                      break L27;
                                    } else {
                                      stackIn_96_0 = this;

                                      if (this.field_q + 12 < n.field_m) {
                                        break L27;
                                      } else {
                                        stackIn_97_0 = this;
                                        stackIn_97_1 = 1;
                                        break L26;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackIn_97_0 = this;
                            stackIn_97_1 = 0;
                            break L26;
                          }
                          L28: {
                            ((lm) (this)).field_U = stackIn_97_1 != 0;
                            if (this.field_i) {
                              if ((nl.field_p ^ -1) == -2) {
                                if (-1 != (this.field_k ^ -1)) {
                                  if (this.field_h > this.field_k) {
                                    this.field_h = this.field_h - 32;
                                    if (!this.field_U) {
                                      break L28;
                                    } else {
                                      if (1 != nl.field_p) {
                                        break L28;
                                      } else {
                                        if (this.field_h >= 0) {
                                          break L28;
                                        } else {
                                          this.field_h = this.field_h + 32;
                                          break L28;
                                        }
                                      }
                                    }
                                  } else {
                                    if (!this.field_U) {
                                      break L28;
                                    } else {
                                      if (1 != nl.field_p) {
                                        break L28;
                                      } else {
                                        if (this.field_h >= 0) {
                                          break L28;
                                        } else {
                                          this.field_h = this.field_h + 32;
                                          break L28;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (!this.field_U) {
                                    break L28;
                                  } else {
                                    if (1 != nl.field_p) {
                                      break L28;
                                    } else {
                                      if (this.field_h >= 0) {
                                        break L28;
                                      } else {
                                        this.field_h = this.field_h + 32;
                                        break L28;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (!this.field_U) {
                                  break L28;
                                } else {
                                  if (1 != nl.field_p) {
                                    break L28;
                                  } else {
                                    if (this.field_h >= 0) {
                                      break L28;
                                    } else {
                                      this.field_h = this.field_h + 32;
                                      break L28;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (!this.field_U) {
                                break L28;
                              } else {
                                if (1 != nl.field_p) {
                                  break L28;
                                } else {
                                  if (this.field_h >= 0) {
                                    break L28;
                                  } else {
                                    this.field_h = this.field_h + 32;
                                    break L28;
                                  }
                                }
                              }
                            }
                          }
                          L29: {
                            this.field_h = this.field_h - id.field_v * 32;
                            if (this.field_h > 0) {
                              this.field_h = 0;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          if (this.field_k > this.field_h) {
                            this.field_h = this.field_k;
                            break L16;
                          } else {
                            var5 = (double)(this.field_E % 151);
                            var7 = var5 / 2.0;
                            var9 = -37.5 + var7;
                            var11 = (int)Math.abs(var9) << 1406303650;
                            this.field_s = var11 << 1917014416 | (var11 << -1468415512 | (var11 | 65793));
                            this.field_E = this.field_E + 1;
                            break L15;
                          }
                        } else {
                          ii.field_l = 0;
                          this.field_h = 0;
                          break L16;
                        }
                      }
                    }
                    var5 = (double)(this.field_E % 151);
                    var7 = var5 / 2.0;
                    var9 = -37.5 + var7;
                    var11 = (int)Math.abs(var9) << 1406303650;
                    this.field_s = var11 << 1917014416 | (var11 << -1468415512 | (var11 | 65793));
                    this.field_E = this.field_E + 1;
                    break L15;
                  }
                  return;
                } else {
                  L30: {
                    if (null != this.field_T[var5_int]) {
                      break L30;
                    } else {
                      this.field_T[var5_int] = new kp();
                      this.field_T[var5_int].b(false, this.field_S[var5_int]);
                      break L30;
                    }
                  }
                  this.field_T[var5_int].a(false, this.field_S[var5_int]);
                  var5_int++;
                  continue L14;
                }
              }
            } else {
              L31: {
                if (param1) {
                  if (this.field_Z.field_e == var5_int) {
                    stackIn_52_0 = 1;
                    break L31;
                  } else {
                    stackIn_52_0 = 0;
                    break L31;
                  }
                } else {
                  stackIn_52_0 = 0;
                  break L31;
                }
              }
              L32: {
                var6 = stackIn_52_0;
                if (param1) {
                  if (var6 != 0) {
                    if (this.field_Z.c(-1)) {
                      stackIn_60_0 = 1;
                      break L32;
                    } else {
                      stackIn_60_0 = 0;
                      break L32;
                    }
                  } else {
                    stackIn_60_0 = 0;
                    break L32;
                  }
                } else {
                  stackIn_60_0 = 0;
                  break L32;
                }
              }
              L33: {
                var7_int = stackIn_60_0;
                if (var6 != 0) {
                  if (this.field_Z.a(0)) {
                    stackIn_66_0 = 1;
                    break L33;
                  } else {
                    stackIn_66_0 = 0;
                    break L33;
                  }
                } else {
                  stackIn_66_0 = 0;
                  break L33;
                }
              }
              var8 = stackIn_66_0;
              var9_int = wt.field_x - this.c(var5_int, 96);
              this.field_X[var5_int].a(var6 != 0, var7_int != 0, var8 != 0, 16, var9_int);
              var5_int++;
              continue L12;
            }
          }
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int var4_int;
        boolean[] var4;
        int var5;
        int var6;
        int var7;
        boolean[] var8;
        var7 = Kickabout.field_G;
        if ((param0 ^ -1) == -14) {
          L0: {
            if (this.field_R == 2) {
              stackIn_5_0 = 4;
              break L0;
            } else {
              stackIn_5_0 = 5;
              break L0;
            }
          }
          var4_int = stackIn_5_0;
          jm.a(var4_int, false, -2);
          return true;
        } else {
          L1: {
            if (param0 != il.field_h) {
              break L1;
            } else {
              L2: {
                if (bt.field_e) {
                  stackIn_10_0 = 0;
                  break L2;
                } else {
                  stackIn_10_0 = 1;
                  break L2;
                }
              }
              bt.field_e = stackIn_10_0 != 0;
              break L1;
            }
          }
          L3: {
            if (-3 != (ph.field_a ^ -1)) {
              break L3;
            } else {
              L4: {
                var8 = ne.field_G;
                var4 = var8;
                if (!var8[rb.field_Kb]) {
                  if (!var8[98]) {
                    if ((param0 ^ -1) == -99) {
                      stackIn_20_0 = 1;
                      break L4;
                    } else {
                      stackIn_20_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_20_0 = 1;
                    break L4;
                  }
                } else {
                  stackIn_20_0 = 1;
                  break L4;
                }
              }
              L5: {
                var5 = stackIn_20_0;
                if (!var8[oc.field_e]) {
                  if (!var8[99]) {
                    if (param0 == 99) {
                      stackIn_28_0 = 1;
                      break L5;
                    } else {
                      stackIn_28_0 = 0;
                      break L5;
                    }
                  } else {
                    stackIn_28_0 = 1;
                    break L5;
                  }
                } else {
                  stackIn_28_0 = 1;
                  break L5;
                }
              }
              L6: {
                var6 = stackIn_28_0;
                if (0 == this.field_k) {
                  break L6;
                } else {
                  if (this.field_h <= this.field_k) {
                    break L6;
                  } else {
                    if (var6 != 0) {
                      this.field_h = this.field_h - 32;
                      return true;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              if (0 <= this.field_h) {
                break L3;
              } else {
                if (var5 != 0) {
                  this.field_h = this.field_h + 32;
                  return true;
                } else {
                  break L3;
                }
              }
            }
          }
          L7: {
            if (param1 < -5) {
              break L7;
            } else {
              this.field_q = 93;
              break L7;
            }
          }
          if (null == this.field_Z) {
            return false;
          } else {
            L8: {
              L9: {
                this.field_Z.a(0, true);
                if (0 <= this.field_Z.field_e) {
                  L10: while (true) {
                    if (this.a(this.field_Z.field_e, -1)) {
                      break L9;
                    } else {
                      stackIn_47_0 = 96;

                      stackIn_47_1 = param0;

                      if (stackIn_47_0 != stackIn_47_1) {
                        this.field_Z.field_e = (this.field_Z.field_e - -1) % this.field_Z.field_a;
                        continue L10;
                      } else {
                        this.field_Z.field_e = (this.field_Z.field_a + (this.field_Z.field_e - 1)) % this.field_Z.field_a;
                        continue L10;
                      }
                    }
                  }
                } else {
                  break L9;
                }
              }
              if ((this.field_Z.field_e ^ -1) > -1) {
                break L8;
              } else {
                if (!this.field_Z.c(-1)) {
                  break L8;
                } else {
                  this.b(this.field_X[this.field_Z.field_e].field_m, false);
                  break L8;
                }
              }
            }
            return true;
          }
        }
    }

    private final boolean a(int param0, int param1) {
        if (param1 != -1) {
            this.field_Y = (int[][]) null;
            return true;
        }
        return true;
    }

    lm(ml param0) {
        super(-2);
        int[] var5 = null;
        int[] var2 = null;
        int var3 = 0;
        this.field_h = ii.field_l;
        this.field_C = 560;
        this.field_L = 400;
        this.field_m = 32;
        this.field_q = 63;
        this.field_E = 0;
        this.field_u = 403;
        this.field_n = 400;
        this.field_A = 560;
        this.field_G = 32;
        this.field_s = 0;
        try {
            bt.field_e = false;
            hr.b(22);
            op.a(-363021503);
            var5 = new int[]{54, 53, 52, 12};
            var2 = var5;
            if (var2 != null) {
                this.field_X = new io[var5.length];
                for (var3 = 0; var3 < var5.length; var3++) {
                    this.field_X[var3] = new io(120, 7126504, var5[var3]);
                }
                this.field_Z = new ko(this.field_X.length);
                this.field_Z.a(true, this.a(wt.field_x, 98, us.field_j), (byte) -127);
            }
            this.a(param0, false);
            this.a(-85, param0);
            this.a(param0, (byte) 116);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(int param0) {
        if (param0 <= 35) {
            return -3;
        }
        return this.field_W;
    }

    final void a(ml param0, byte param1) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        String stackIn_41_0 = null;
        String stackIn_44_0 = null;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        String stackIn_60_0 = null;
        String stackIn_63_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        String var14 = null;
        int var15 = 0;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            var3_int = param0.h((byte) -119);
            var4 = 17 % ((50 - param1) / 55);
            this.field_S = new kp[var3_int];
            var5 = 0;
            L1: while (true) {
              if (this.field_S.length <= var5) {
                L2: {
                  this.field_W = param0.h((byte) -108);
                  this.field_v = param0.a((byte) 81);
                  this.field_x = param0.a((byte) 81);
                  stackIn_6_0 = this;

                  if ((param0.h((byte) -128) ^ -1) != -2) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L2;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((lm) (this)).field_z = stackIn_7_1 != 0;
                  if (0 == (dc.field_c ^ -1)) {
                    stackIn_10_0 = (int)Math.pow(2.0, (double)this.field_W);
                    break L3;
                  } else {
                    stackIn_10_0 = dc.field_c;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var5 = stackIn_10_0;
                    if (this.field_y == null) {
                      break L5;
                    } else {
                      if (this.field_y.length != var5) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_y = new bl[var5];
                  break L4;
                }
                L6: {
                  var6 = 4;
                  if (4 < this.field_y.length) {
                    stackIn_17_0 = 20;
                    break L6;
                  } else {
                    stackIn_17_0 = 79;
                    break L6;
                  }
                }
                L7: {
                  var7 = stackIn_17_0;
                  if (this.field_T == null) {
                    break L7;
                  } else {
                    L8: {
                      var8 = this.field_T.length + -1;
                      if ((this.field_W ^ -1) == -2) {
                        var8 -= 2;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (this.field_W == 2) {
                        var8 -= 6;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if ((this.field_W ^ -1) == -4) {
                        var8 -= 14;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((dc.field_c ^ -1) == 0) {
                        break L11;
                      } else {
                        var8 = 0;
                        break L11;
                      }
                    }
                    var9 = 0;
                    L12: while (true) {
                      if (var9 >= var6) {
                        var9 = 0;
                        L13: while (true) {
                          if (var9 >= var6) {
                            break L7;
                          } else {
                            L14: {
                              if (var9 - -var6 < var5) {
                                L15: {
                                  if (-9 == (var5 ^ -1)) {
                                    stackIn_54_0 = var6;
                                    break L15;
                                  } else {
                                    stackIn_54_0 = -var6 + var5;
                                    break L15;
                                  }
                                }
                                L16: {
                                  var10 = stackIn_54_0;
                                  stackIn_56_0 = -(jt.field_yb >> -640433279);

                                  stackIn_56_1 = 410 + 90 * var9;

                                  stackIn_56_2 = 90 * (var10 >> 243243745);

                                  if (var10 % 2 != 0) {
                                    stackIn_57_0 = stackIn_56_0;
                                    stackIn_57_1 = stackIn_56_1;
                                    stackIn_57_2 = stackIn_56_2;
                                    stackIn_57_3 = 0;
                                    break L16;
                                  } else {
                                    stackIn_57_0 = stackIn_56_0;
                                    stackIn_57_1 = stackIn_56_1;
                                    stackIn_57_2 = stackIn_56_2;
                                    stackIn_57_3 = 45;
                                    break L16;
                                  }
                                }
                                L17: {
                                  var11 = stackIn_57_0 + (stackIn_57_1 - (stackIn_57_2 - stackIn_57_3));
                                  var12 = 268;
                                  if (-1 != this.field_T[var8].field_c[0]) {
                                    stackIn_60_0 = this.field_Q[this.field_T[var8].field_c[0]];
                                    break L17;
                                  } else {
                                    stackIn_60_0 = "";
                                    break L17;
                                  }
                                }
                                L18: {
                                  var18 = stackIn_60_0;
                                  var13 = var18;
                                  if (-1 != this.field_T[var8].field_c[1]) {
                                    stackIn_63_0 = this.field_Q[this.field_T[var8].field_c[1]];
                                    break L18;
                                  } else {
                                    stackIn_63_0 = "";
                                    break L18;
                                  }
                                }
                                var19 = stackIn_63_0;
                                var14 = var19;
                                this.field_y[var9 + var6] = new bl(this.field_T[var8], new String[]{var18, var19}, var11, var12 - 15, var8);
                                if (dc.field_c != -1) {
                                  break L14;
                                } else {
                                  var8++;
                                  break L14;
                                }
                              } else {
                                break L14;
                              }
                            }
                            var9++;
                            continue L13;
                          }
                        }
                      } else {
                        L19: {
                          if (var5 <= var9) {
                            break L19;
                          } else {
                            L20: {
                              if (var6 <= var5) {
                                stackIn_35_0 = var6;
                                break L20;
                              } else {
                                stackIn_35_0 = var5;
                                break L20;
                              }
                            }
                            L21: {
                              var10 = stackIn_35_0;
                              if (0 == var10 % 2) {
                                stackIn_38_0 = 45;
                                break L21;
                              } else {
                                stackIn_38_0 = 0;
                                break L21;
                              }
                            }
                            L22: {
                              var11 = stackIn_38_0 + (-(90 * (var10 >> 759757377)) + 90 * var9) + 410 - (jt.field_yb >> 53078785);
                              var12 = 90 + var7;
                              if (this.field_T[var8].field_c[0] != -1) {
                                stackIn_41_0 = this.field_Q[this.field_T[var8].field_c[0]];
                                break L22;
                              } else {
                                stackIn_41_0 = "";
                                break L22;
                              }
                            }
                            L23: {
                              var16 = stackIn_41_0;
                              var13 = var16;
                              if (-1 == this.field_T[var8].field_c[1]) {
                                stackIn_44_0 = "";
                                break L23;
                              } else {
                                stackIn_44_0 = this.field_Q[this.field_T[var8].field_c[1]];
                                break L23;
                              }
                            }
                            var17 = stackIn_44_0;
                            var14 = var17;
                            this.field_y[var9] = new bl(this.field_T[var8], new String[]{var16, var17}, var11, -15 + var12, var8);
                            if ((dc.field_c ^ -1) != 0) {
                              break L19;
                            } else {
                              var8++;
                              break L19;
                            }
                          }
                        }
                        var9++;
                        continue L12;
                      }
                    }
                  }
                }
                break L0;
              } else {
                this.field_S[var5] = new kp();
                this.field_S[var5].a((byte) -119, param0);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var3 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var3);

            stackIn_69_1 = new StringBuilder().append("lm.C(");

            if (param0 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L24;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L24;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param1 + ')');
        }
    }

    private final int b(int param0, int param1) {
        if (param0 != 8) {
            this.field_x = -76;
        }
        return -20 + g.field_a.field_J;
    }

    private final void e(int param0) {
        cn stackIn_2_0 = null;
        StringBuilder stackIn_2_1 = null;
        cn stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        String stackIn_3_2 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        double var10;
        int var12;
        int var13;
        String var14;
        L0: {
          var13 = Kickabout.field_G;
          on.a(-(this.field_A >> 1771985377) + 320, 20, this.field_A, this.field_n, 8, 0, 128);
          on.a(320 - (this.field_A - 20 >> 802893441), 30, -20 + this.field_A, 30, 8, 65793, 128);
          stackIn_2_0 = un.field_d;

          stackIn_2_1 = new StringBuilder().append("<u=ffffff>").append(jc.field_e[0].toUpperCase()).append("</u> ");

          if (this.field_r == null) {
            stackIn_3_0 = (cn) ((Object) stackIn_2_0);
            stackIn_3_1 = (StringBuilder) ((Object) stackIn_2_1);
            stackIn_3_2 = "";
            break L0;
          } else {
            stackIn_3_0 = (cn) ((Object) stackIn_2_0);
            stackIn_3_1 = (StringBuilder) ((Object) stackIn_2_1);
            stackIn_3_2 = this.field_r;
            break L0;
          }
        }
        ((cn) (Object) stackIn_3_0).d(stackIn_3_2, 320, 50, 16777215, -1);
        pt.a(640, -22914, 0, 88, 60);
        on.a(224, 66, 372, 50, 8, 65793, 196);
        un.field_d.d(vo.a((byte) -18, wk.field_e, new String[]{kp.field_g[this.field_W].toLowerCase()}), 410, 82, 16777215, -1);
        var2 = 46;
        on.a(var2, 66, 175, 50, 8, 65793, 196);
        un.field_d.d(nk.field_g, var2 - -87, 82, 16777215, -1);
        ta.e(120);
        var3 = 17;
        var4 = -var3 + 88;
        var5 = 175;
        var6 = 0;
        L1: while (true) {
          if (this.field_Q.length <= var6) {
            L2: {
              if (param0 == -21109) {
                break L2;
              } else {
                this.field_L = -119;
                break L2;
              }
            }
            var6 = 0;
            L3: while (true) {
              if (-17 >= (var6 ^ -1)) {
                L4: {
                  on.a(224, 90, 372, 320, 65793, 96);
                  if (this.field_z) {
                    if (null != this.field_y) {
                      var6 = 0;
                      L5: while (true) {
                        if (var6 >= this.field_y.length) {
                          break L4;
                        } else {
                          if (null == this.field_y[var6]) {
                            jr.a(410, -89, 250);
                            var6++;
                            continue L5;
                          } else {
                            this.field_y[var6].a(98);
                            var6++;
                            continue L5;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    un.field_d.a(vo.a((byte) -18, rv.field_a, new String[]{"<col=FF0000>" + Integer.toString(1 + this.field_x / 50) + "</col>"}), 224, 90, 372, 320, 16777215, -1, 1, 1, 0);
                    break L4;
                  }
                }
                return;
              } else {
                on.c(var2, 2 + var3 + var6 + var4, 175, 65793, -(var6 << -328636637) + 128);
                var6++;
                continue L3;
              }
            }
          } else {
            var4 = var4 + (var3 + 2);
            on.a(var2, var4, var5, var3, 65793, 96);
            if (this.field_Q.length > var6) {
              L6: {
                var14 = this.field_Q[var6].toLowerCase();
                var7 = var14;
                if ((this.field_v >> var6 & 1 ^ -1) != -2) {
                  stackIn_10_0 = 0;
                  break L6;
                } else {
                  stackIn_10_0 = 1;
                  break L6;
                }
              }
              L7: {
                var8 = stackIn_10_0;
                if (var8 != 0) {
                  var14 = var7;
                  var7 = vo.a((byte) -18, ig.field_e, new String[]{var14});
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (var8 != 0) {
                  stackIn_16_0 = 5592405;
                  break L8;
                } else {
                  stackIn_16_0 = 16777215;
                  break L8;
                }
              }
              L9: {
                var9 = stackIn_16_0;
                pt.a(var2 + var5, -22914, 20 + var2, var4 + 20, var4);
                if (-20 + var5 >= un.field_d.a(var7)) {
                  un.field_d.d(var7, var2 - -(var5 >> -2058710559), var4 - -13, var9, -1);
                  break L9;
                } else {
                  var10 = (double)(un.field_d.a(var7) + 20 + -var5);
                  var12 = -(int)(var10 * Math.sin((double)this.field_E / 50.0) - 5.0);
                  un.field_d.d(var7, var2 + (var5 >> 1038107361) - -var12, 13 + var4, var9, -1);
                  break L9;
                }
              }
              L10: {
                ta.e(param0 + 21236);
                if (var8 == 0) {
                  break L10;
                } else {
                  on.e(-(un.field_d.a(var7) >> 156987553) + (var5 >> -1417464511) + (var2 - 8), 8 + var4, 8 + ((var5 >> 1453749889) + var2) - -(un.field_d.a(var7) >> 46147297), var4 - -8, 11141377, 196);
                  on.e(-(un.field_d.a(var7) >> 1364950689) + ((var5 >> 1705456833) + var2 + -8), var4 - -9, (var5 >> 2064791841) + (var2 - -(un.field_d.a(var7) >> 535183073)) + 8, var4 + 9, 11141377, 196);
                  break L10;
                }
              }
              b.field_U[this.field_H[var6]].c(var2, var4 + -1);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    private final void b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        cn stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        cn stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        kp[] stackIn_49_0 = null;
        kp[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        kp[] stackIn_53_0 = null;
        kp[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        int[] stackIn_56_1 = null;
        int stackIn_57_0 = 0;
        int[] stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        String[] stackIn_60_0 = null;
        int[] stackIn_60_1 = null;
        String[] stackIn_61_0 = null;
        int[] stackIn_61_1 = null;
        int stackIn_61_2 = 0;
        String stackIn_63_0 = null;
        int[] stackIn_65_0 = null;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_69_0 = null;
        int[] stackIn_69_1 = null;
        String[] stackIn_70_0 = null;
        int[] stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        String stackIn_72_0 = null;
        int stackIn_76_0;
        int stackIn_76_1;
        int stackIn_76_2;
        int stackIn_76_3;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        int stackIn_77_4 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        int stackIn_82_0;
        int stackIn_82_1;
        int stackIn_82_2;
        int stackIn_82_3;
        int stackIn_82_4;
        int stackIn_83_0;
        int stackIn_83_1;
        int stackIn_83_2;
        int stackIn_83_3;
        int stackIn_83_4;
        int stackIn_83_5;
        int[] stackIn_101_0 = null;
        int[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        String stackIn_105_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14_int;
        kp var14;
        int var15;
        kp var15_ref_kp;
        int var16;
        String var16_ref_String;
        int var17;
        String var17_ref_String;
        String var18;
        int var19;
        L0: {
          var19 = Kickabout.field_G;
          if (en.field_o != -1) {
            stackIn_5_0 = en.field_o;
            break L0;
          } else {
            if (this.field_T == null) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = this.field_T.length;
              break L0;
            }
          }
        }
        L1: {
          var2 = stackIn_5_0;
          if (var2 <= 7) {
            stackIn_8_0 = 20;
            break L1;
          } else {
            stackIn_8_0 = 300;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_8_0;
          var4 = 48 % ((-30 - param0) / 45);
          on.a(-(this.field_A >> -1470047039) + 320, 20, this.field_A, this.field_n, 8, 0, 128);
          on.a(-(-var3 + this.field_A >> -638100831) + 320, 30, this.field_A + -var3, 30, 8, 65793, 128);
          stackIn_10_0 = un.field_d;

          stackIn_10_1 = new StringBuilder().append("<u=ffffff>").append(jc.field_e[1].toUpperCase()).append("</u> ");

          if (null != this.field_r) {
            stackIn_11_0 = (cn) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = this.field_r;
            break L2;
          } else {
            stackIn_11_0 = (cn) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "";
            break L2;
          }
        }
        L3: {
          ((cn) (Object) stackIn_11_0).d(stackIn_11_2, 320, 50, 16777215, -1);
          var5 = 110;
          var6 = 40;
          var7 = (var5 << -1807966399) / 3;
          stackIn_17_0 = var6;

          if (7 < var2) {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_1 = 5;
            break L3;
          } else {


            if ((var2 ^ -1) >= -4) {


              if (var2 > 1) {
                stackIn_18_0 = stackIn_17_0;
                stackIn_18_1 = 20;
                break L3;
              } else {
                stackIn_18_0 = stackIn_17_0;
                stackIn_18_1 = 0;
                break L3;
              }
            } else {
              stackIn_18_0 = stackIn_17_0;
              stackIn_18_1 = 10;
              break L3;
            }
          }
        }
        L4: {
          var8 = stackIn_18_0 - -stackIn_18_1;
          if (-8 <= (var2 ^ -1)) {
            stackIn_21_0 = 0;
            break L4;
          } else {
            stackIn_21_0 = var7;
            break L4;
          }
        }
        L5: {
          stackIn_23_0 = -stackIn_21_0;

          if ((var2 ^ -1) >= -4) {
            stackIn_24_0 = stackIn_23_0;
            stackIn_24_1 = 0;
            break L5;
          } else {
            stackIn_24_0 = stackIn_23_0;
            stackIn_24_1 = var7;
            break L5;
          }
        }
        L6: {
          stackIn_26_0 = stackIn_24_0 + -stackIn_24_1;

          if (1 < var2) {
            stackIn_27_0 = stackIn_26_0;
            stackIn_27_1 = var7;
            break L6;
          } else {
            stackIn_27_0 = stackIn_26_0;
            stackIn_27_1 = 0;
            break L6;
          }
        }
        L7: {
          var9 = stackIn_27_0 + (-stackIn_27_1 + 320);
          if (7 < var2) {
            stackIn_30_0 = var8;
            break L7;
          } else {
            stackIn_30_0 = 0;
            break L7;
          }
        }
        L8: {
          stackIn_32_0 = -stackIn_30_0;

          if (var2 > 1) {
            stackIn_33_0 = stackIn_32_0;
            stackIn_33_1 = var8;
            break L8;
          } else {
            stackIn_33_0 = stackIn_32_0;
            stackIn_33_1 = 0;
            break L8;
          }
        }
        L9: {
          stackIn_35_0 = stackIn_33_0 + -stackIn_33_1 + 210;

          if (-4 > (var2 ^ -1)) {
            stackIn_36_0 = stackIn_35_0;
            stackIn_36_1 = var8;
            break L9;
          } else {
            stackIn_36_0 = stackIn_35_0;
            stackIn_36_1 = 0;
            break L9;
          }
        }
        L10: {
          var10 = stackIn_36_0 - stackIn_36_1;
          var11 = var9;
          var12 = var10;
          var13 = 3;
          if (-8 <= (var2 ^ -1)) {
            var13--;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (-4 > (var2 ^ -1)) {
            break L11;
          } else {
            var13--;
            break L11;
          }
        }
        L12: {
          if (var2 <= 1) {
            var13--;
            break L12;
          } else {
            break L12;
          }
        }
        un.field_d.d(kp.field_g[var13].toLowerCase(), var11, var12 + (-(var6 >> -414046367) - 4), 16777215, -1);
        var14_int = 0;
        L13: while (true) {
          if (var2 <= var14_int) {
            L14: {
              var12 = var12 - var8;
              if (null == this.field_T) {
                break L14;
              } else {
                if (-6 >= (this.field_T[this.field_T.length - 1].field_f ^ -1)) {
                  L15: {
                    var14 = this.field_T[this.field_T.length - 1];
                    var15 = (var6 << 2100743873) + (var6 >> 892579553);
                    var12 = var12 + var15;
                    pt.a(var11 - -var5, -22914, var11 - var5, -(var6 >> 357589121) + var12, -var6 + var12);
                    on.a(-(un.field_d.a(eq.field_g) >> 741513249) + var11 - 10, var12 - var6, 20 + un.field_d.a(eq.field_g), var6, 8, 65793, 128);
                    un.field_d.d(eq.field_g, var11, var12 + (-(var6 >> -1678302943) - 4), -1, -1);
                    ta.e(126);
                    on.a(-(var5 >> 263949697) + var11, -(var6 >> -1725513567) + var12, var5, var6, 65793, 128);
                    kb.field_E[6].c(var11 + (var5 >> 1418340737) - (kb.field_E[6].field_o - 4), -(kb.field_E[6].field_v >> 771565985) + var12);
                    var16 = var14.field_o;
                    if ((var16 ^ -1) <= -1) {
                      break L15;
                    } else {
                      if (var14.field_f >= 5) {
                        var16 = var14.field_k;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    stackIn_101_0 = var14.field_c;

                    if (var14.field_d) {
                      stackIn_102_0 = (int[]) ((Object) stackIn_101_0);
                      stackIn_102_1 = 1 + -var16;
                      break L16;
                    } else {
                      stackIn_102_0 = (int[]) ((Object) stackIn_101_0);
                      stackIn_102_1 = var16;
                      break L16;
                    }
                  }
                  L17: {
                    var17 = stackIn_102_0[stackIn_102_1];
                    if (var17 > -1) {
                      stackIn_105_0 = this.field_Q[var17];
                      break L17;
                    } else {
                      stackIn_105_0 = hi.field_w;
                      break L17;
                    }
                  }
                  var18 = stackIn_105_0;
                  un.field_d.d(var18, 10 + -(kb.field_E[6].field_o >> 747273985) + var11, 4 + var12, 16777215, -1);
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            return;
          } else {
            L18: {
              if (null == this.field_T) {
                break L18;
              } else {
                L19: {
                  stackIn_49_0 = this.field_T;

                  if (en.field_o != -1) {
                    stackIn_50_0 = (kp[]) ((Object) stackIn_49_0);
                    stackIn_50_1 = 0;
                    break L19;
                  } else {
                    stackIn_50_0 = (kp[]) ((Object) stackIn_49_0);
                    stackIn_50_1 = var14_int;
                    break L19;
                  }
                }
                if (stackIn_50_0[stackIn_50_1] == null) {
                  break L18;
                } else {
                  L20: {
                    stackIn_53_0 = this.field_T;

                    if ((en.field_o ^ -1) == 0) {
                      stackIn_54_0 = (kp[]) ((Object) stackIn_53_0);
                      stackIn_54_1 = var14_int;
                      break L20;
                    } else {
                      stackIn_54_0 = (kp[]) ((Object) stackIn_53_0);
                      stackIn_54_1 = 0;
                      break L20;
                    }
                  }
                  L21: {
                    var15_ref_kp = stackIn_54_0[stackIn_54_1];
                    stackIn_56_0 = -1;

                    stackIn_56_1 = var15_ref_kp.field_c;

                    if (!var15_ref_kp.field_d) {
                      stackIn_57_0 = stackIn_56_0;
                      stackIn_57_1 = (int[]) ((Object) stackIn_56_1);
                      stackIn_57_2 = 0;
                      break L21;
                    } else {
                      stackIn_57_0 = stackIn_56_0;
                      stackIn_57_1 = (int[]) ((Object) stackIn_56_1);
                      stackIn_57_2 = 1;
                      break L21;
                    }
                  }
                  L22: {
                    if (stackIn_57_0 == stackIn_57_1[stackIn_57_2]) {
                      stackIn_63_0 = "";
                      break L22;
                    } else {
                      L23: {
                        stackIn_60_0 = this.field_Q;

                        stackIn_60_1 = var15_ref_kp.field_c;

                        if (var15_ref_kp.field_d) {
                          stackIn_61_0 = (String[]) ((Object) stackIn_60_0);
                          stackIn_61_1 = (int[]) ((Object) stackIn_60_1);
                          stackIn_61_2 = 1;
                          break L23;
                        } else {
                          stackIn_61_0 = (String[]) ((Object) stackIn_60_0);
                          stackIn_61_1 = (int[]) ((Object) stackIn_60_1);
                          stackIn_61_2 = 0;
                          break L23;
                        }
                      }
                      stackIn_63_0 = stackIn_61_0[stackIn_61_1[stackIn_61_2]];
                      break L22;
                    }
                  }
                  L24: {
                    var16_ref_String = stackIn_63_0;
                    stackIn_65_0 = var15_ref_kp.field_c;

                    if (!var15_ref_kp.field_d) {
                      stackIn_66_0 = (int[]) ((Object) stackIn_65_0);
                      stackIn_66_1 = 1;
                      break L24;
                    } else {
                      stackIn_66_0 = (int[]) ((Object) stackIn_65_0);
                      stackIn_66_1 = 0;
                      break L24;
                    }
                  }
                  L25: {
                    if ((stackIn_66_0[stackIn_66_1] ^ -1) == 0) {
                      stackIn_72_0 = "";
                      break L25;
                    } else {
                      L26: {
                        stackIn_69_0 = this.field_Q;

                        stackIn_69_1 = var15_ref_kp.field_c;

                        if (var15_ref_kp.field_d) {
                          stackIn_70_0 = (String[]) ((Object) stackIn_69_0);
                          stackIn_70_1 = (int[]) ((Object) stackIn_69_1);
                          stackIn_70_2 = 0;
                          break L26;
                        } else {
                          stackIn_70_0 = (String[]) ((Object) stackIn_69_0);
                          stackIn_70_1 = (int[]) ((Object) stackIn_69_1);
                          stackIn_70_2 = 1;
                          break L26;
                        }
                      }
                      stackIn_72_0 = stackIn_70_0[stackIn_70_1[stackIn_70_2]];
                      break L25;
                    }
                  }
                  var17_ref_String = stackIn_72_0;
                  eo.a(var15_ref_kp, var16_ref_String, var17_ref_String, var11 + -(var5 >> 1580710593), var12 + -(var6 >> -319295135), var5, var6);
                  break L18;
                }
              }
            }
            L27: {
              if (var2 + -1 == var14_int) {
                break L27;
              } else {
                L28: {
                  stackIn_76_0 = (var5 >> -1598991103) + var11;

                  stackIn_76_1 = -1 + var12;

                  stackIn_76_2 = -(var5 >> -1409716063) + ((var7 << -953348287) + var11);

                  stackIn_76_3 = var12 + -1;

                  if (var14_int % 2 != 0) {
                    stackIn_77_0 = stackIn_76_0;
                    stackIn_77_1 = stackIn_76_1;
                    stackIn_77_2 = stackIn_76_2;
                    stackIn_77_3 = stackIn_76_3;
                    stackIn_77_4 = -(var8 >> 1720246465);
                    break L28;
                  } else {
                    stackIn_77_0 = stackIn_76_0;
                    stackIn_77_1 = stackIn_76_1;
                    stackIn_77_2 = stackIn_76_2;
                    stackIn_77_3 = stackIn_76_3;
                    stackIn_77_4 = var8 >> 1194606913;
                    break L28;
                  }
                }
                L29: {
                  on.b(stackIn_77_0, stackIn_77_1, stackIn_77_2, stackIn_77_3 + stackIn_77_4, 65793);
                  stackIn_79_0 = (var5 >> -1007424639) + var11;

                  stackIn_79_1 = var12;

                  stackIn_79_2 = var11 + ((var7 << -1107002751) + -(var5 >> -403642047));

                  if (var14_int % 2 != 0) {
                    stackIn_80_0 = stackIn_79_0;
                    stackIn_80_1 = stackIn_79_1;
                    stackIn_80_2 = stackIn_79_2;
                    stackIn_80_3 = -(var8 >> -1431241855);
                    break L29;
                  } else {
                    stackIn_80_0 = stackIn_79_0;
                    stackIn_80_1 = stackIn_79_1;
                    stackIn_80_2 = stackIn_79_2;
                    stackIn_80_3 = var8 >> 1218115457;
                    break L29;
                  }
                }
                L30: {
                  on.b(stackIn_80_0, stackIn_80_1, stackIn_80_2, stackIn_80_3 + var12, 65793);
                  stackIn_82_0 = var11 + (var5 >> -984989951);

                  stackIn_82_1 = var12 + 1;

                  stackIn_82_2 = -(var5 >> -1082677759) + (var11 + (var7 << -504265791));

                  stackIn_82_3 = var12;

                  stackIn_82_4 = 1;

                  if (var14_int % 2 == 0) {
                    stackIn_83_0 = stackIn_82_0;
                    stackIn_83_1 = stackIn_82_1;
                    stackIn_83_2 = stackIn_82_2;
                    stackIn_83_3 = stackIn_82_3;
                    stackIn_83_4 = stackIn_82_4;
                    stackIn_83_5 = var8 >> -1542823231;
                    break L30;
                  } else {
                    stackIn_83_0 = stackIn_82_0;
                    stackIn_83_1 = stackIn_82_1;
                    stackIn_83_2 = stackIn_82_2;
                    stackIn_83_3 = stackIn_82_3;
                    stackIn_83_4 = stackIn_82_4;
                    stackIn_83_5 = -(var8 >> -514352895);
                    break L30;
                  }
                }
                on.b(stackIn_83_0, stackIn_83_1, stackIn_83_2, stackIn_83_3 + (stackIn_83_4 - -stackIn_83_5), 65793);
                break L27;
              }
            }
            L31: {
              var12 = var12 + var8;
              if (var14_int == -8 + var2) {
                break L31;
              } else {
                if (-4 + var2 == var14_int) {
                  break L31;
                } else {
                  if (var14_int == var2 + -2) {
                    break L31;
                  } else {
                    var14_int++;
                    continue L13;
                  }
                }
              }
            }
            var10 = var10 + (var8 >> -743481279);
            var9 = var9 + (var7 << 219625377);
            var8 = var8 << 1;
            var11 = var9;
            var12 = var10;
            var13--;
            if (-1 >= (var13 ^ -1)) {
              un.field_d.d(kp.field_g[var13].toLowerCase(), var11, -4 + var12 + -(var6 >> 35490689), 16777215, -1);
              var14_int++;
              continue L13;
            } else {
              var14_int++;
              continue L13;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        int discarded$0 = 0;
        try {
            if (param2 > -28) {
                discarded$0 = this.b(-108, -27);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lm.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        int var9;
        L0: {
          var9 = Kickabout.field_G;
          pt.a(-(this.field_A >> -996693215) + 320 + this.field_A, param0 + -22909, -(this.field_A >> -2016442015) + 320, this.field_n + 20, 20);
          if (0 != ph.field_a) {
            if (ph.field_a != 1) {
              if (ph.field_a == 2) {
                this.b(32);
                break L0;
              } else {
                break L0;
              }
            } else {
              this.b((byte) 111);
              break L0;
            }
          } else {
            this.e(-21109);
            break L0;
          }
        }
        ta.e(121);
        this.a(param0 ^ 28);
        var3 = 70;
        var4 = -42 + g.field_a.field_J;
        if (param0 == -5) {
          L1: {
            if (!this.field_K) {
              pt.a(du.field_n + var3 + -10, -22914, -10 + var3, var4, -18 + var4);
              cd.a((byte) -127, var4, var3);
              ta.e(123);
              break L1;
            } else {
              var5 = Math.abs(255 - (int)(nj.a(96) / 5L % 512L));
              var6 = 0;
              var7 = Math.abs(255 - var5) | Math.abs(-var5 + 255) << -778843832 | Math.abs(255 + -var5) << -1891312560;
              pt.a(40 + (du.field_n + var3), -22914, -2 + var3, var4, -16 + var4);
              on.a(var3, var4 - 11, 33 + du.field_n, 20, 6, var6, al.a(false, (byte) -96));
              np.a(var4, -123, 14 + var3);
              np.a(var4, param0 + 113, du.field_n + (30 + var3));
              var8 = vo.a((byte) -18, vi.field_o, new String[]{mk.field_b[il.field_h]});
              q.field_d.a(var8, var3 + 20, var4, var7, -1);
              ta.e(118);
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_F = null;
        field_N = null;
        if (!param0) {
            field_F = (ld) null;
        }
        field_j = null;
    }

    final void a(int param0, ml param1) {
        int var3_int = 0;
        int var4 = 0;
        int var6 = Kickabout.field_G;
        try {
            var3_int = param1.h((byte) -106);
            this.field_o = new int[var3_int];
            this.field_p = new int[var3_int];
            this.field_P = new int[var3_int];
            this.field_I = new int[var3_int];
            this.field_l = new int[var3_int];
            this.field_B = new int[var3_int];
            this.field_M = new int[var3_int];
            this.field_w = new int[var3_int];
            this.field_J = new int[var3_int];
            this.field_t = new int[var3_int];
            var4 = 0;
            int var5 = 37 % ((param0 - 72) / 36);
            while (var4 < var3_int) {
                this.field_M[var4] = param1.a((byte) 81);
                this.field_p[var4] = param1.a((byte) 81);
                this.field_w[var4] = param1.a((byte) 81);
                this.field_B[var4] = param1.a((byte) 81);
                this.field_l[var4] = param1.a((byte) 81);
                this.field_o[var4] = param1.a((byte) 81);
                this.field_t[var4] = param1.a((byte) 81);
                this.field_P[var4] = param1.a((byte) 81);
                this.field_J[var4] = param1.a((byte) 81);
                this.field_I[var4] = param1.h((byte) -127);
                var4++;
            }
            this.field_O = new int[this.field_M.length][4];
            for (var4 = 0; var4 < this.field_M.length; var4++) {
                this.field_O[var4][0] = this.field_M[var4];
                this.field_O[var4][1] = this.field_p[var4];
                this.field_O[var4][2] = this.field_w[var4];
                this.field_O[var4][3] = this.field_B[var4];
            }
            this.field_D = new int[this.field_l.length][4];
            for (var4 = 0; this.field_l.length > var4; var4++) {
                this.field_D[var4][0] = this.field_l[var4];
                this.field_D[var4][1] = this.field_o[var4];
                this.field_D[var4][2] = this.field_t[var4];
                this.field_D[var4][3] = this.field_P[var4];
            }
            this.field_Y = new int[this.field_J.length][2];
            for (var4 = 0; this.field_J.length > var4; var4++) {
                this.field_Y[var4][0] = this.field_J[var4];
                this.field_Y[var4][1] = this.field_I[var4];
            }
            this.field_k = -(100 + 96 * this.field_M.length);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lm.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        if (param0 != -1) {
            lm.a(false);
        }
    }

    static {
        field_N = new r();
        field_F = new ld();
    }
}
