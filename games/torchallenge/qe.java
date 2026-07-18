/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    private boolean field_q;
    private boolean field_S;
    private boolean field_mb;
    int field_a;
    int field_z;
    int field_h;
    private int field_b;
    private boolean field_O;
    private int field_W;
    int field_B;
    int field_H;
    private boolean field_Z;
    int field_db;
    int field_V;
    static int field_R;
    private int field_P;
    boolean field_s;
    private boolean field_jb;
    boolean field_nb;
    private boolean field_k;
    int field_p;
    private int field_M;
    static String field_J;
    int field_L;
    int field_F;
    int field_kb;
    boolean field_ab;
    int field_y;
    private boolean field_fb;
    int field_D;
    int field_d;
    int field_I;
    int field_Q;
    int field_f;
    int field_hb;
    int field_x;
    boolean field_j;
    private boolean field_m;
    private int field_K;
    boolean field_ib;
    static int[] field_A;
    int field_r;
    private boolean field_Y;
    static ka field_E;
    private boolean field_t;
    boolean field_c;
    int field_G;
    int field_o;
    private boolean field_cb;
    boolean field_n;
    private boolean field_v;
    private boolean field_X;
    private boolean field_i;
    private int field_l;
    private boolean field_T;
    boolean field_eb;
    private boolean field_gb;
    private int field_g;
    private int field_lb;
    static String field_bb;
    int field_e;
    boolean field_N;
    int field_w;
    private int field_C;
    int field_u;

    final void x(int param0) {
        L0: {
          if (param0 == 96) {
            break L0;
          } else {
            ((qe) this).field_o = 91;
            break L0;
          }
        }
        L1: {
          L2: {
            ((qe) this).field_N = false;
            ((qe) this).field_ab = false;
            ((qe) this).field_j = false;
            if (((qe) this).field_F != 3) {
              break L2;
            } else {
              if (!((qe) this).field_k) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          ((qe) this).field_k = false;
          break L1;
        }
        L3: {
          L4: {
            ((qe) this).field_c = false;
            ((qe) this).field_s = false;
            if (((qe) this).field_F != 0) {
              break L4;
            } else {
              if (cl.field_z) {
                cl.field_z = false;
                if (2 == vj.field_c) {
                  break L4;
                } else {
                  ((qe) this).field_w = 96;
                  break L4;
                }
              } else {
                ((qe) this).field_n = false;
                ((qe) this).field_ib = false;
                break L3;
              }
            }
          }
          ((qe) this).field_n = false;
          ((qe) this).field_ib = false;
          break L3;
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TorChallenge.field_F ? 1 : 0;
          var4 = (((qe) this).field_I >> 1) + ((qe) this).field_e;
          var5 = 2048;
          var6 = 0;
          if (var4 >= var5) {
            var4 = var4 - var5;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var7 = (param2 >> 1) + param1;
          if (var7 >= var5) {
            var7 = var7 - var5;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var4 < var7) {
            if (var7 <= var4) {
              break L2;
            } else {
              var6 = 1;
              break L2;
            }
          } else {
            var6 = -1;
            break L2;
          }
        }
        L3: {
          if (var6 <= 0) {
            if (var6 < 0) {
              var8 = var4 - var7;
              if (var5 >> 1 < var8) {
                var6 = -var6;
                break L3;
              } else {
                break L3;
              }
            } else {
              break L3;
            }
          } else {
            var8 = var7 - var4;
            if (var5 >> 1 >= var8) {
              break L3;
            } else {
              var6 = -var6;
              break L3;
            }
          }
        }
        return var6;
    }

    private final int b(int param0, int param1, int param2) {
        int var6 = 0;
        int var4 = 0;
        int var5 = 2048;
        if (param0 <= param2) {
            var4 = param0 + param2 >> 1;
        } else {
            if (!(param0 <= param2)) {
                var6 = var5 - -param2 - param0;
                var4 = param0 - -(var6 >> 1);
            }
        }
        if (var5 <= var4) {
            var4 = var4 - var5;
        }
        return var4;
    }

    private final void H(int param0) {
        uf.field_k = false;
        ah.field_i = false;
        ((qe) this).field_D = 0;
        if (!(param0 == ti.field_d)) {
            ((qe) this).field_kb = 0;
        }
        this.n(96);
        vk.field_b = false;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var2 = ma.field_k;
          var3 = 40;
          var4 = 6;
          var5 = 6;
          if (var3 >= ((qe) this).field_h * var2) {
            L1: {
              if (-(((qe) this).field_h * var2) + var3 < var5) {
                var5 = 2;
                break L1;
              } else {
                break L1;
              }
            }
            ((qe) this).field_h = ((qe) this).field_h + var5 * var2;
            break L0;
          } else {
            if (var2 * ((qe) this).field_h <= var3) {
              return;
            } else {
              L2: {
                if (var4 <= -var3 + ((qe) this).field_h * var2) {
                  break L2;
                } else {
                  var4 = 2;
                  break L2;
                }
              }
              ((qe) this).field_h = ((qe) this).field_h - var2 * var4;
              break L0;
            }
          }
        }
    }

    private final void o() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_63_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        L0: {
          var11 = TorChallenge.field_F ? 1 : 0;
          if (s.field_m) {
            L1: {
              if (0 >= ed.field_c) {
                break L1;
              } else {
                ed.field_c = ed.field_c - 1;
                break L1;
              }
            }
            if (ed.field_c != 0) {
              break L0;
            } else {
              s.field_m = false;
              break L0;
            }
          } else {
            break L0;
          }
        }
        this.g((byte) -85);
        if (13 == ((qe) this).field_L) {
          this.F(115);
          return;
        } else {
          L2: {
            if (((qe) this).field_G <= 0) {
              break L2;
            } else {
              ((qe) this).field_G = ((qe) this).field_G - 1;
              break L2;
            }
          }
          L3: {
            if (0 >= hb.field_f) {
              break L3;
            } else {
              hb.field_f = hb.field_f - 1;
              break L3;
            }
          }
          L4: {
            if (ol.field_g.a(2, wb.field_p.field_e, wb.field_p.field_w, wb.field_p.field_I, 1 + -wb.field_p.field_w + wb.field_p.field_z)) {
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L4;
            } else {
              stackOut_14_0 = 1;
              stackIn_16_0 = stackOut_14_0;
              break L4;
            }
          }
          L5: {
            var2 = stackIn_16_0;
            var3 = -1;
            var4 = -1;
            if (var2 != 0) {
              break L5;
            } else {
              var3 = oi.a((byte) -75, wb.field_p.field_H);
              break L5;
            }
          }
          L6: {
            if (var3 >= 0) {
              var4 = ub.a(var3, 48, wb.field_p.field_e, wb.field_p.field_I);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (ol.field_g.a(2, ((qe) this).field_e, ((qe) this).field_w, ((qe) this).field_I, 1 + -((qe) this).field_w + ((qe) this).field_z)) {
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
            var5 = stackIn_24_0;
            var6 = -1;
            if (var5 != 0) {
              break L8;
            } else {
              var6 = oi.a((byte) -58, ((qe) this).field_H);
              break L8;
            }
          }
          L9: {
            if (var6 >= 0) {
              int discarded$1 = ub.a(var6, 87, ((qe) this).field_e, ((qe) this).field_I);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            L11: {
              var7 = 8;
              if (var5 != 0) {
                break L11;
              } else {
                if (((qe) this).field_L == 1) {
                  break L11;
                } else {
                  if (var6 == 0) {
                    L12: {
                      if (var3 == 0) {
                        break L12;
                      } else {
                        if (var2 != 0) {
                          break L12;
                        } else {
                          L13: {
                            if (!this.f(8)) {
                              if (((qe) this).field_lb > 0) {
                                ((qe) this).field_lb = ((qe) this).field_lb - 1;
                                if (((qe) this).field_lb == 0) {
                                  ((qe) this).field_a = -((qe) this).field_a;
                                  ((qe) this).field_Q = 0;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              } else {
                                L14: {
                                  var8 = this.m(true);
                                  if (0 > var8) {
                                    break L14;
                                  } else {
                                    var9 = this.a(var4, -21293, var3, var8);
                                    ((qe) this).field_Q = var9 * ((qe) this).field_K;
                                    ((qe) this).field_L = 1;
                                    ((qe) this).field_h = ((qe) this).field_h - ((qe) this).field_M;
                                    break L14;
                                  }
                                }
                                break L13;
                              }
                            } else {
                              this.a(false, -120);
                              break L13;
                            }
                          }
                          L15: {
                            var8 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
                            if (0 >= ((qe) this).field_G) {
                              break L15;
                            } else {
                              var9 = -var8;
                              ((qe) this).field_lb = 0;
                              ((qe) this).field_Q = ((qe) this).field_K * var9;
                              ((qe) this).field_L = 1;
                              ((qe) this).field_h = -(((qe) this).field_M >> 2);
                              break L15;
                            }
                          }
                          this.a(true, ((qe) this).field_C, true, true, true);
                          this.j(-123);
                          break L10;
                        }
                      }
                    }
                    L16: {
                      if (!ii.field_e) {
                        break L16;
                      } else {
                        ((qe) this).field_Q = (5 * ((qe) this).field_K >> 2) * ((qe) this).field_a;
                        ii.field_e = false;
                        ed.field_c = 200;
                        s.field_m = true;
                        this.k((byte) -121);
                        ((qe) this).field_L = 9;
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        if (this.f(8)) {
                          break L18;
                        } else {
                          if (((qe) this).field_lb == 0) {
                            var8 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
                            if (var8 == 0) {
                              break L17;
                            } else {
                              if (~((qe) this).field_a != ~var8) {
                                ((qe) this).field_lb = 25;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      if (0 < ((qe) this).field_lb) {
                        ((qe) this).field_lb = ((qe) this).field_lb - 1;
                        if (0 == ((qe) this).field_lb) {
                          ((qe) this).field_a = -((qe) this).field_a;
                          ((qe) this).field_Q = 0;
                          break L17;
                        } else {
                          break L17;
                        }
                      } else {
                        if (((qe) this).field_lb >= 0) {
                          break L17;
                        } else {
                          ((qe) this).field_lb = 0;
                          break L17;
                        }
                      }
                    }
                    L19: {
                      var8 = this.a(wb.field_p.field_e, wb.field_p.field_I, true);
                      if (this.f(8)) {
                        break L19;
                      } else {
                        if (0 != ((qe) this).field_lb) {
                          break L19;
                        } else {
                          L20: {
                            var9 = 32 * rk.field_a[1];
                            if (var8 > var9) {
                              break L20;
                            } else {
                              ((qe) this).field_L = 3;
                              break L20;
                            }
                          }
                          if (this.f(8)) {
                            this.k((byte) -115);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    var9 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
                    if (ni.field_b) {
                      ni.field_b = false;
                      var10 = -var9;
                      ((qe) this).field_lb = 0;
                      ((qe) this).field_L = 1;
                      ((qe) this).field_Q = var10 * (((qe) this).field_K >> 1) * 3;
                      ((qe) this).field_h = -(((qe) this).field_M >> 2);
                      return;
                    } else {
                      this.a(false, ((qe) this).field_C, true, true, true);
                      if (this.f(8)) {
                        this.a(false, -118);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  } else {
                    if (var6 == 1) {
                      L21: {
                        L22: {
                          if (this.f(8)) {
                            break L22;
                          } else {
                            if (((qe) this).field_lb != 0) {
                              break L22;
                            } else {
                              if (((qe) this).field_ib) {
                                break L22;
                              } else {
                                L23: {
                                  var8 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
                                  if (var8 == 0) {
                                    break L23;
                                  } else {
                                    if (((qe) this).field_a == var8) {
                                      break L23;
                                    } else {
                                      ((qe) this).field_lb = 25;
                                      break L21;
                                    }
                                  }
                                }
                                break L21;
                              }
                            }
                          }
                        }
                        if (((qe) this).field_lb <= 0) {
                          if (((qe) this).field_lb >= 0) {
                            break L21;
                          } else {
                            ((qe) this).field_lb = 0;
                            break L21;
                          }
                        } else {
                          ((qe) this).field_lb = ((qe) this).field_lb - 1;
                          if (((qe) this).field_lb == 0) {
                            ((qe) this).field_Q = 0;
                            ((qe) this).field_a = -((qe) this).field_a;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                      }
                      L24: {
                        if (((qe) this).field_lb != 0) {
                          break L24;
                        } else {
                          if (((qe) this).field_ib) {
                            break L24;
                          } else {
                            if (hb.field_f != 0) {
                              break L24;
                            } else {
                              ((qe) this).field_ib = true;
                              hb.field_f = 200;
                              ((qe) this).field_L = 8;
                              ad.field_a = false;
                              this.k((byte) -126);
                              break L24;
                            }
                          }
                        }
                      }
                      L25: {
                        if (!this.f(8)) {
                          break L25;
                        } else {
                          this.a(false, 14);
                          break L25;
                        }
                      }
                      L26: {
                        if (this.f(8)) {
                          break L26;
                        } else {
                          if (!((qe) this).field_ib) {
                            break L26;
                          } else {
                            L27: {
                              this.a(false, ((qe) this).field_C, true, true, true);
                              if (ol.field_g.a(2, ((qe) this).field_e, ((qe) this).field_w, ((qe) this).field_I, ((qe) this).field_z + -((qe) this).field_w + 1)) {
                                stackOut_62_0 = 0;
                                stackIn_63_0 = stackOut_62_0;
                                break L27;
                              } else {
                                stackOut_61_0 = 1;
                                stackIn_63_0 = stackOut_61_0;
                                break L27;
                              }
                            }
                            var5 = stackIn_63_0;
                            if (var5 != 0) {
                              ((qe) this).field_ib = false;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                      var8 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
                      if (((qe) this).field_G > 0) {
                        var9 = -var8;
                        ((qe) this).field_Q = var9 * ((qe) this).field_K;
                        ((qe) this).field_lb = 0;
                        ((qe) this).field_L = 1;
                        ((qe) this).field_h = -(((qe) this).field_M >> 2);
                        this.j(-123);
                        break L10;
                      } else {
                        break L10;
                      }
                    } else {
                      if (var6 == 2) {
                        L28: {
                          var8 = this.a(64, wb.field_p.field_e, wb.field_p.field_I);
                          if (0 < ((qe) this).field_G) {
                            var9 = -var8;
                            ((qe) this).field_h = -(((qe) this).field_M >> 2);
                            ((qe) this).field_lb = 0;
                            ((qe) this).field_L = 1;
                            ((qe) this).field_Q = var9 * ((qe) this).field_K;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        this.a(false, ((qe) this).field_C, true, true, true);
                        return;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
              }
            }
            L29: {
              if (((qe) this).field_L == 2) {
                break L29;
              } else {
                if (((qe) this).field_L == 1) {
                  break L29;
                } else {
                  ((qe) this).field_L = 2;
                  break L29;
                }
              }
            }
            this.a(true, 0, false, true, false);
            this.j(-125);
            break L10;
          }
          return;
        }
    }

    private final void a(ka param0, int param1, int param2, int param3) {
        int var5_int = 0;
        if (1024 == ((qe) this).field_u) {
            if (!(((qe) this).field_H != -1 + ba.field_i.field_a)) {
                return;
            }
        }
        try {
            param2 = param2 << 4;
            if (param3 <= 33) {
                ((qe) this).field_t = true;
            }
            param1 = param1 << 4;
            var5_int = 65536 * ((qe) this).field_W / 200;
            param0.a(0, 0, param2, param1, var5_int, 4096);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "qe.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void p(int param0) {
        ((qe) this).field_Q = 0;
        if (param0 != -8) {
            ((qe) this).field_eb = false;
        }
        qe var2 = new qe(((qe) this).field_o, ((qe) this).field_H, 7, ((qe) this).field_V);
        ef.a(0, var2);
        var2.field_u = ((qe) this).field_u + -192;
        if (((qe) this).field_a > 0) {
            var2.field_B = ((qe) this).field_B + 256 * (((qe) this).field_I >> 1) / 32;
        } else {
            if (!(((qe) this).field_a >= 0)) {
                var2.field_B = ((qe) this).field_B;
            }
        }
        var2.field_a = ((qe) this).field_a;
        var2.field_D = 250;
        var2.field_z = var2.field_H * 64 - -(var2.field_u * 64 / 256);
        var2.field_m = true;
        var2.field_e = var2.field_o * 32 - -(32 * var2.field_B / 256);
        ((qe) this).field_S = true;
        hc.a(54, wb.field_p.field_H, ((qe) this).field_V, 6, wb.field_p.field_o, dg.field_T[((qe) this).field_F], ((qe) this).field_H, ((qe) this).field_o);
    }

    private final qe o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (sd.field_d <= 0) {
            if (0 < sd.field_d) {
              break L0;
            } else {
              return null;
            }
          } else {
            sd.field_d = sd.field_d - 1;
            break L0;
          }
        }
        L1: {
          var2 = wb.field_p.field_e - ((qe) this).field_e;
          var3 = wb.field_p.field_z + -((qe) this).field_z;
          var4 = var3 * var3 + var2 * var2;
          var4 = var4 << 8;
          var4 = de.a(107, var4);
          var4 = var4 >> 12;
          var5 = 96;
          var7 = 39 / ((-23 - param0) / 60);
          if (var5 > var4) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_7_0;
          var8 = wb.field_p.field_K * 3 / 4;
          if (var6 != 0) {
            ((qe) this).field_h = var8 * var3 / var4;
            ((qe) this).field_Q = var8 * var2 / var4;
            break L2;
          } else {
            break L2;
          }
        }
        ((qe) this).field_z = ((qe) this).field_z - -(64 * ((qe) this).field_h / 256);
        ((qe) this).field_e = ((qe) this).field_Q * 32 / 256 + ((qe) this).field_e;
        ((qe) this).field_u = 256 * (((qe) this).field_z % 64) / 64;
        ((qe) this).field_B = 256 * (((qe) this).field_e % 32) / 32;
        ((qe) this).field_o = ((qe) this).field_e / 32;
        ((qe) this).field_H = ((qe) this).field_z / 64;
        if (this.a((byte) -50, vc.field_b)) {
          int discarded$1 = 116;
          if (!this.i()) {
            return (qe) this;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void d(boolean param0) {
        field_J = null;
        field_bb = null;
        field_A = null;
        field_E = null;
    }

    private final void k(byte param0) {
        wb.field_p.field_Y = false;
        ((qe) this).field_kb = 0;
        lc.field_r = false;
        ((qe) this).field_D = 0;
        if (param0 > -111) {
            field_A = null;
        }
    }

    private final int a(int param0, int param1, int param2, int param3) {
        int[][] var5 = null;
        int[][] var6 = null;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][] var22 = null;
        L0: {
          var21 = TorChallenge.field_F ? 1 : 0;
          var22 = pa.field_v[1];
          var5 = var22;
          var6 = wf.field_c;
          var7 = 2048;
          var8 = 32 * var6[param3][0];
          if (var8 >= var7) {
            var8 = var8 - var7;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var9 = 32 * (1 + var6[param3][1]);
          if (var9 >= var7) {
            var9 = var9 - var7;
            break L1;
          } else {
            break L1;
          }
        }
        var10 = this.b(var8, 28, var9);
        var12 = s.field_i[1];
        var16 = 0;
        var17 = -1;
        var18 = -1;
        var19 = -1;
        var20 = 0;
        var11 = 0;
        L2: while (true) {
          if (var11 >= var12) {
            return var16;
          } else {
            L3: {
              var13 = 32 * var22[var11][0];
              if (var7 > var13) {
                break L3;
              } else {
                var13 = var13 - var7;
                break L3;
              }
            }
            L4: {
              var14 = 32 + 32 * var22[var11][1];
              if (var14 < var7) {
                break L4;
              } else {
                var14 = var14 - var7;
                break L4;
              }
            }
            L5: {
              var15 = this.b(var13, 28, var14);
              var19 = -var10 + var15;
              var20 = 1;
              if (var15 >= var10) {
                break L5;
              } else {
                var19 = -var19;
                var20 = -1;
                break L5;
              }
            }
            L6: {
              if (var7 / 2 < var19) {
                var19 = var7 + -var19;
                var20 = -var20;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (var17 < 0) {
                L8: {
                  if (1 != param2) {
                    break L8;
                  } else {
                    if (var11 != param0) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                var17 = var11;
                var18 = var19;
                var16 = var20;
                break L7;
              } else {
                break L7;
              }
            }
            if (var18 > var19) {
              L9: {
                if (param2 != 1) {
                  break L9;
                } else {
                  if (param0 != var11) {
                    break L9;
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
              var18 = var19;
              var16 = var20;
              var17 = var11;
              var11++;
              continue L2;
            } else {
              var11++;
              continue L2;
            }
          }
        }
    }

    private final void m() {
        int[][] var3 = null;
        int var3_int = 0;
        int[][] var4 = null;
        int var4_int = 0;
        int var5 = 0;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        var21 = TorChallenge.field_F ? 1 : 0;
        if (this.a((byte) -50, fk.field_s)) {
          L0: {
            var3 = ae.field_j;
            var4 = pg.field_n;
            var5 = (1 + var3[0][1]) * 32;
            var6 = var3[1][0] * 32;
            var9 = ((qe) this).field_e;
            var10 = ((qe) this).field_I + var9;
            var11 = ((qe) this).field_z;
            var12 = -((qe) this).field_w + var11;
            var13 = 16;
            var14 = -1;
            var15 = var12 + var11 >> 1;
            var16 = 40;
            var17 = 0;
            if (var9 < var5) {
              break L0;
            } else {
              if (var6 >= var10) {
                var17 = 1;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (var17 != 0) {
              var17 = 0;
              var18 = 0;
              L2: while (true) {
                L3: {
                  if (var18 >= 2) {
                    break L3;
                  } else {
                    L4: {
                      var7 = var4[1 + var18][0] * 64;
                      var8 = var7 + var13;
                      if (var7 < var12) {
                        break L4;
                      } else {
                        if (var11 >= var7) {
                          var17 = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      var14 = var8 + var7 >> 1;
                      if (var12 > var8) {
                        break L5;
                      } else {
                        if (var8 > var11) {
                          break L5;
                        } else {
                          var17 = 1;
                          break L5;
                        }
                      }
                    }
                    if (var17 != 0) {
                      break L3;
                    } else {
                      var18++;
                      continue L2;
                    }
                  }
                }
                if (var17 == 0) {
                  break L1;
                } else {
                  L6: {
                    if (var14 >= var15) {
                      ma.field_k = -1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    ((qe) this).field_Q = 0;
                    if (var15 > var14) {
                      ma.field_k = 1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((qe) this).field_h = ma.field_k * var16;
                  var18 = 1;
                  this.a(true, var18 != 0);
                  return;
                }
              }
            } else {
              break L1;
            }
          }
          var18 = this.b(false, -1);
          if (var18 < 0) {
            var19 = this.b((byte) 109, false);
            if (var19 >= 0) {
              L8: {
                kf.field_d = 0;
                if (!rk.field_e) {
                  L9: {
                    if (rk.field_e) {
                      stackOut_62_0 = 0;
                      stackIn_63_0 = stackOut_62_0;
                      break L9;
                    } else {
                      stackOut_61_0 = 1;
                      stackIn_63_0 = stackOut_61_0;
                      break L9;
                    }
                  }
                  rk.field_e = stackIn_63_0 != 0;
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            } else {
              ma.field_k = 1;
              ((qe) this).field_h = ma.field_k * var16;
              var20 = 1;
              this.a(true, var20 != 0);
              return;
            }
          } else {
            L10: {
              kf.field_d = 1;
              if (!rk.field_e) {
                L11: {
                  if (rk.field_e) {
                    stackOut_53_0 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    break L11;
                  } else {
                    stackOut_52_0 = 1;
                    stackIn_54_0 = stackOut_52_0;
                    break L11;
                  }
                }
                rk.field_e = stackIn_54_0 != 0;
                break L10;
              } else {
                break L10;
              }
            }
            return;
          }
        } else {
          L12: {
            var3_int = fk.field_s[0][0] * 32;
            var4_int = 32 * fk.field_s[0][1] - -32;
            var5 = fk.field_s[1][0] * 64;
            var6 = 64 * (fk.field_s[1][1] - -1);
            var7 = ((qe) this).field_e;
            var8 = ((qe) this).field_I + var7;
            var9 = ((qe) this).field_z;
            var10 = var9 - ((qe) this).field_w;
            var11 = 0;
            var12 = 0;
            var13 = 40;
            if (var3_int < var7) {
              break L12;
            } else {
              ((qe) this).field_a = 1;
              var11 = 1;
              break L12;
            }
          }
          L13: {
            if (var8 >= var4_int) {
              ((qe) this).field_a = -1;
              var11 = 1;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            if (var5 < var10) {
              break L14;
            } else {
              var12 = 1;
              ma.field_k = 1;
              break L14;
            }
          }
          L15: {
            if (var6 <= var9) {
              var12 = 1;
              ma.field_k = -1;
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (var11 != 0) {
              ((qe) this).field_Q = ((qe) this).field_K * ((qe) this).field_a;
              break L16;
            } else {
              ((qe) this).field_Q = 0;
              break L16;
            }
          }
          L17: {
            if (var12 != 0) {
              ((qe) this).field_h = ma.field_k * var13;
              break L17;
            } else {
              ((qe) this).field_h = 0;
              break L17;
            }
          }
          L18: {
            if (var11 == 0) {
              break L18;
            } else {
              var14 = 0;
              var15 = 0;
              boolean discarded$1 = this.a(var14 != 0, (byte) -127, var15 != 0);
              break L18;
            }
          }
          L19: {
            if (var12 != 0) {
              var14 = 1;
              this.a(true, var14 != 0);
              break L19;
            } else {
              break L19;
            }
          }
          return;
        }
    }

    final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (((qe) this).field_F == 23) {
            break L0;
          } else {
            if (((qe) this).field_F == 24) {
              return;
            } else {
              if (param0 == 0) {
                L1: {
                  L2: {
                    var2 = 1;
                    if (((qe) this).field_L == 13) {
                      break L2;
                    } else {
                      if (((qe) this).field_O) {
                        break L2;
                      } else {
                        if (((qe) this).field_db > 0) {
                          if (12 == ((qe) this).field_L) {
                            var2 = 1;
                            break L1;
                          } else {
                            L3: {
                              if (((qe) this).field_L == 2) {
                                break L3;
                              } else {
                                L4: {
                                  if (((qe) this).field_L != 0) {
                                    break L4;
                                  } else {
                                    if (!((qe) this).field_eb) {
                                      break L4;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                L5: {
                                  L6: {
                                    if (((qe) this).field_F == 7) {
                                      break L6;
                                    } else {
                                      if (((qe) this).field_D <= -ik.field_d[2][dg.field_T[((qe) this).field_F]][((qe) this).field_V] + 200) {
                                        break L6;
                                      } else {
                                        if (-1 == ((qe) this).field_L) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                  if (((qe) this).field_L == 1) {
                                    break L5;
                                  } else {
                                    if (-1 == ((qe) this).field_L) {
                                      var2 = 1;
                                      break L1;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                                var2 = 2;
                                break L1;
                              }
                            }
                            var2 = 3;
                            break L1;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var2 = 4;
                  break L1;
                }
                L7: {
                  if (var2 == 4) {
                    break L7;
                  } else {
                    L8: {
                      if (((qe) this).field_F != 2) {
                        break L8;
                      } else {
                        L9: {
                          if (112 < ((qe) this).field_D) {
                            break L9;
                          } else {
                            if (((qe) this).field_S) {
                              break L9;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var2 = 5;
                        break L8;
                      }
                    }
                    L10: {
                      if (3 != ((qe) this).field_F) {
                        break L10;
                      } else {
                        L11: {
                          L12: {
                            if (((qe) this).field_D <= 112) {
                              break L12;
                            } else {
                              if (((qe) this).field_H < wb.field_p.field_H) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if (!((qe) this).field_T) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                        var2 = 6;
                        break L7;
                      }
                    }
                    if (3 != ((qe) this).field_F) {
                      break L7;
                    } else {
                      if (2 != ((qe) this).field_V) {
                        break L7;
                      } else {
                        if (((qe) this).field_k) {
                          var2 = 7;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                L13: {
                  if (((qe) this).field_g != var2) {
                    ((qe) this).field_p = ef.field_k;
                    ((qe) this).field_g = var2;
                    if (7 == ((qe) this).field_g) {
                      var3 = 0;
                      L14: while (true) {
                        if (h.field_b[7][dg.field_T[3]][0] <= var3) {
                          break L13;
                        } else {
                          ak.field_j[var3][0] = -1;
                          var3++;
                          continue L14;
                        }
                      }
                    } else {
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L15: {
                  ((qe) this).field_P = (ef.field_k + -((qe) this).field_p) / ik.field_d[((qe) this).field_g][dg.field_T[((qe) this).field_F]][((qe) this).field_V];
                  if (!qh.field_O[((qe) this).field_g][dg.field_T[((qe) this).field_F]][((qe) this).field_V]) {
                    break L15;
                  } else {
                    ((qe) this).field_P = ((qe) this).field_P % h.field_b[((qe) this).field_g][dg.field_T[((qe) this).field_F]][((qe) this).field_V];
                    break L15;
                  }
                }
                L16: {
                  if (((qe) this).field_P >= h.field_b[((qe) this).field_g][dg.field_T[((qe) this).field_F]][((qe) this).field_V]) {
                    ((qe) this).field_P = -1 + h.field_b[((qe) this).field_g][dg.field_T[((qe) this).field_F]][((qe) this).field_V];
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    if (2 != ((qe) this).field_g) {
                      break L18;
                    } else {
                      if (((qe) this).field_L == 1) {
                        ((qe) this).field_P = 1;
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  if (((qe) this).field_g != 2) {
                    L19: {
                      if (((qe) this).field_g != 3) {
                        break L19;
                      } else {
                        if (2 == ((qe) this).field_L) {
                          ((qe) this).field_v = true;
                          ((qe) this).field_P = 0;
                          break L17;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (((qe) this).field_g == 3) {
                      L20: {
                        if (((qe) this).field_v) {
                          ((qe) this).field_p = ef.field_k;
                          ((qe) this).field_v = false;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        if (ef.field_k - ((qe) this).field_p <= ik.field_d[((qe) this).field_g][dg.field_T[((qe) this).field_F]][((qe) this).field_V]) {
                          break L21;
                        } else {
                          ((qe) this).field_eb = false;
                          break L21;
                        }
                      }
                      ((qe) this).field_P = 1;
                      break L17;
                    } else {
                      break L17;
                    }
                  } else {
                    ((qe) this).field_P = 0;
                    break L17;
                  }
                }
                if (((qe) this).field_P < h.field_b[((qe) this).field_g][dg.field_T[((qe) this).field_F]][((qe) this).field_V]) {
                  break L0;
                } else {
                  L22: {
                    if (h.field_b[((qe) this).field_g][dg.field_T[((qe) this).field_F]][((qe) this).field_V] <= 0) {
                      break L22;
                    } else {
                      ((qe) this).field_P = h.field_b[((qe) this).field_g][dg.field_T[((qe) this).field_F]][((qe) this).field_V] + -1;
                      break L22;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    private final void b() {
        int var2 = -5;
        ((qe) this).x(96);
    }

    private final boolean i() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_35_0 = 0;
        int stackIn_66_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        if (((qe) this).field_F != 0) {
          L0: {
            if (((qe) this).field_G <= 0) {
              break L0;
            } else {
              if (((qe) this).field_F != 6) {
                ((qe) this).field_jb = false;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (((qe) this).field_L == 13) {
              break L1;
            } else {
              if (!((qe) this).field_jb) {
                break L1;
              } else {
                if (null == wb.field_p) {
                  break L1;
                } else {
                  if (wb.field_p.field_db > 0) {
                    L2: {
                      var2 = ((qe) this).field_e;
                      var3 = -((qe) this).field_w + ((qe) this).field_z;
                      var4 = ((qe) this).field_I;
                      var5 = ((qe) this).field_w;
                      var6 = wb.field_p.field_e + 8;
                      if (-var2 + var6 <= 1024) {
                        break L2;
                      } else {
                        var6 -= 2048;
                        break L2;
                      }
                    }
                    L3: {
                      if (var6 - var2 < -1024) {
                        var6 += 2048;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      var7 = wb.field_p.field_z + -wb.field_p.field_w;
                      var8 = wb.field_p.field_I + -16;
                      var9 = wb.field_p.field_w;
                      if (wb.field_p.field_L == 19) {
                        break L4;
                      } else {
                        if (wb.field_p.field_L == 20) {
                          break L4;
                        } else {
                          if (wb.field_p.field_L != 18) {
                            if (ec.field_e) {
                              return false;
                            } else {
                              L5: {
                                if (((qe) this).field_F == 23) {
                                  var2 += 16;
                                  var3 += 16;
                                  var4 -= 32;
                                  var5 -= 32;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              L6: {
                                L7: {
                                  if (2 != vj.field_c) {
                                    break L7;
                                  } else {
                                    if (!cl.field_z) {
                                      break L7;
                                    } else {
                                      if (((qe) this).field_a == wb.field_p.field_a) {
                                        break L7;
                                      } else {
                                        L8: {
                                          if (((qe) this).field_F != 7) {
                                            break L8;
                                          } else {
                                            if (((qe) this).field_V == 2) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        stackOut_33_0 = 1;
                                        stackIn_35_0 = stackOut_33_0;
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                stackOut_34_0 = 0;
                                stackIn_35_0 = stackOut_34_0;
                                break L6;
                              }
                              var10 = stackIn_35_0;
                              if (!o.a(var9, var3, var8, var4, var5, var6, var2, (byte) 9, var7)) {
                                break L1;
                              } else {
                                L9: {
                                  L10: {
                                    ((qe) this).field_Q = 0;
                                    if (wb.field_p.field_G <= 0) {
                                      break L10;
                                    } else {
                                      if (wb.field_p.field_G > 50) {
                                        break L9;
                                      } else {
                                        if (((qe) this).field_F != 3) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var10 != 0) {
                                      break L11;
                                    } else {
                                      L12: {
                                        wb.field_p.field_G = wb.field_p.field_G + 50;
                                        if (mj.field_b) {
                                          L13: {
                                            if (kc.field_w == null) {
                                              break L13;
                                            } else {
                                              kc.field_w[0][0] = 0;
                                              break L13;
                                            }
                                          }
                                          lj.field_b = 0;
                                          hf.field_c = 0;
                                          fh.field_d = 0;
                                          vd.field_b = true;
                                          dk.field_a = 0;
                                          mj.field_b = false;
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      L14: {
                                        wb.field_p.field_db = wb.field_p.field_db - 1;
                                        if (wb.field_p.field_db > 0) {
                                          ei.a((byte) 66, wb.field_p.field_db % 3 + 11, vj.field_c);
                                          break L14;
                                        } else {
                                          if (wb.field_p.field_db > 0) {
                                            break L14;
                                          } else {
                                            wh.a(vj.field_c, 10, -125);
                                            break L14;
                                          }
                                        }
                                      }
                                      L15: {
                                        jj.field_d = false;
                                        wb.field_p.field_L = 12;
                                        if (wb.field_p.field_db <= 0) {
                                          break L15;
                                        } else {
                                          if (((qe) this).field_F == 3) {
                                            wb.field_p.field_G = wb.field_p.field_G + 50;
                                            wb.field_p.field_db = wb.field_p.field_db - 1;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      wb.field_p.field_D = 0;
                                      break L11;
                                    }
                                  }
                                  L16: {
                                    if (var3 > var7) {
                                      break L16;
                                    } else {
                                      wb.field_p.field_h = -20;
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    wb.field_p.field_Q = 64 * ((qe) this).field_a;
                                    if (var2 < var6) {
                                      ((qe) this).field_a = 1;
                                      break L17;
                                    } else {
                                      ((qe) this).field_a = -1;
                                      break L17;
                                    }
                                  }
                                  kl.field_a = true;
                                  if (((qe) this).field_F == 6) {
                                    ((qe) this).field_a = -((qe) this).field_a;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                L18: {
                                  if (((qe) this).field_cb) {
                                    stackOut_65_0 = 1;
                                    stackIn_66_0 = stackOut_65_0;
                                    break L18;
                                  } else {
                                    stackOut_64_0 = 0;
                                    stackIn_66_0 = stackOut_64_0;
                                    break L18;
                                  }
                                }
                                return stackIn_66_0 != 0;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (((qe) this).field_h < 64) {
            ((qe) this).field_h = ((qe) this).field_h + 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((qe) this).field_u = ((qe) this).field_u + ((qe) this).field_h;
          if (((qe) this).field_u >= 0) {
            if (((qe) this).field_u >= 256) {
              ((qe) this).field_H = ((qe) this).field_H + 1;
              ((qe) this).field_u = ((qe) this).field_u - 256;
              break L1;
            } else {
              break L1;
            }
          } else {
            ((qe) this).field_u = ((qe) this).field_u + 256;
            ((qe) this).field_H = ((qe) this).field_H - 1;
            break L1;
          }
        }
        var3 = ((qe) this).field_h;
        L2: while (true) {
          if (!ol.field_g.a(2, 32 * ((qe) this).field_o - -(((qe) this).field_B * 32 / 256), ((qe) this).field_w, ((qe) this).field_I, -((qe) this).field_w + (((qe) this).field_u * 64 / 256 + 64 * ((qe) this).field_H))) {
            ((qe) this).field_z = ((qe) this).field_u * 64 / 256 + ((qe) this).field_H * 64;
            return;
          } else {
            L3: {
              if (var3 <= 0) {
                if (var3 >= 0) {
                  break L3;
                } else {
                  ((qe) this).field_u = ((qe) this).field_u + 1;
                  break L3;
                }
              } else {
                ((qe) this).field_u = ((qe) this).field_u - 1;
                break L3;
              }
            }
            L4: {
              if (((qe) this).field_u < 0) {
                ((qe) this).field_H = ((qe) this).field_H - 1;
                ((qe) this).field_u = ((qe) this).field_u + 256;
                break L4;
              } else {
                if (((qe) this).field_u >= 256) {
                  ((qe) this).field_H = ((qe) this).field_H + 1;
                  ((qe) this).field_u = ((qe) this).field_u - 256;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (var3 <= 0) {
                if (((qe) this).field_h < 64) {
                  ((qe) this).field_h = ((qe) this).field_h + 1;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                L6: {
                  ((qe) this).field_h = 0;
                  if (((qe) this).field_F != 0) {
                    break L6;
                  } else {
                    ve.field_a.field_h = var3;
                    break L6;
                  }
                }
                if (!param1) {
                  L7: {
                    if (((qe) this).field_L == 2) {
                      ((qe) this).field_eb = true;
                      if (((qe) this).field_F != 0) {
                        if (28 == ((qe) this).field_F) {
                          jc.b(fh.field_e, 1, 1);
                          break L7;
                        } else {
                          if (!vg.a(((qe) this).field_F, -1)) {
                            break L7;
                          } else {
                            qa.a(((qe) this).field_o, wb.field_p.field_H, dg.field_T[((qe) this).field_F], (qe) this, ((qe) this).field_H, -1, 4, wb.field_p.field_o, 25, ((qe) this).field_V);
                            break L7;
                          }
                        }
                      } else {
                        wh.a(vj.field_c, 1, -113);
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  ((qe) this).field_L = 0;
                  kl.field_a = false;
                  if (((qe) this).field_F == 5) {
                    break L5;
                  } else {
                    ((qe) this).field_D = 0;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
            L8: {
              if (((qe) this).field_H < 0) {
                break L8;
              } else {
                if (~((qe) this).field_H <= ~ol.field_g.field_a) {
                  break L8;
                } else {
                  continue L2;
                }
              }
            }
            var3 = -var3;
            continue L2;
          }
        }
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        if (param0 <= -16) {
          L0: {
            var3 = ((qe) this).field_o;
            var3++;
            if (64 <= var3) {
              var3 -= 64;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var4 = var3;
            stackOut_5_0 = ic.field_E[var3];
            stackOut_5_1 = ((qe) this).field_H;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1) {
              stackOut_7_0 = (int[]) (Object) stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 31;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (int[]) (Object) stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 0;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackIn_8_0[stackIn_8_1] = stackIn_8_2;
            var3++;
            if (var3 >= 64) {
              var3 -= 64;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = ic.field_E[var3];
            stackOut_11_1 = ((qe) this).field_H;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1) {
              stackOut_13_0 = (int[]) (Object) stackIn_13_0;
              stackOut_13_1 = stackIn_13_1;
              stackOut_13_2 = 31;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (int[]) (Object) stackIn_12_0;
              stackOut_12_1 = stackIn_12_1;
              stackOut_12_2 = 0;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackIn_14_0[stackIn_14_1] = stackIn_14_2;
            var5 = var3;
            var3++;
            if (var3 < 64) {
              break L4;
            } else {
              var3 -= 64;
              break L4;
            }
          }
          if (!param1) {
            var10 = 0;
            L5: while (true) {
              if (w.field_m <= var10) {
                return;
              } else {
                L6: {
                  L7: {
                    L8: {
                      var6 = cb.field_c[var10][0];
                      var8 = cb.field_c[var10][1];
                      var9 = cb.field_c[var10][3];
                      var7 = cb.field_c[var10][2];
                      if (var4 != var6) {
                        break L8;
                      } else {
                        if (var8 == ((qe) this).field_H) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (var6 != var5) {
                      break L6;
                    } else {
                      if (((qe) this).field_H != var8) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  cb.field_c[var10][0] = -1;
                  cb.field_c[var10][1] = -1;
                  cb.field_c[var10][2] = -1;
                  cb.field_c[var10][3] = -1;
                  break L6;
                }
                L9: {
                  L10: {
                    if (var4 != var7) {
                      break L10;
                    } else {
                      if (var9 == ((qe) this).field_H) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (var5 == var7) {
                    if (((qe) this).field_H == var9) {
                      break L9;
                    } else {
                      var10++;
                      continue L5;
                    }
                  } else {
                    var10++;
                    continue L5;
                  }
                }
                cb.field_c[var10][0] = -1;
                cb.field_c[var10][1] = -1;
                cb.field_c[var10][2] = -1;
                cb.field_c[var10][3] = -1;
                var10++;
                continue L5;
              }
            }
          } else {
            var10 = 0;
            L11: while (true) {
              if (w.field_m <= var10) {
                var10 = 0;
                L12: while (true) {
                  if (w.field_m <= var10) {
                    if (w.field_m > 0) {
                      cb.field_c[0][1] = ((qe) this).field_H;
                      cb.field_c[0][2] = var5;
                      cb.field_c[0][0] = var4;
                      cb.field_c[0][3] = ((qe) this).field_H;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var6 = cb.field_c[var10][0];
                    if (var6 < 0) {
                      cb.field_c[var10][0] = var4;
                      cb.field_c[var10][1] = ((qe) this).field_H;
                      cb.field_c[var10][2] = var5;
                      cb.field_c[var10][3] = ((qe) this).field_H;
                      return;
                    } else {
                      var10++;
                      continue L12;
                    }
                  }
                }
              } else {
                L13: {
                  L14: {
                    var8 = cb.field_c[var10][1];
                    var9 = cb.field_c[var10][3];
                    var6 = cb.field_c[var10][0];
                    var7 = cb.field_c[var10][2];
                    if (var6 != var4) {
                      break L14;
                    } else {
                      if (((qe) this).field_H == var8) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var5 != var6) {
                      break L15;
                    } else {
                      if (var8 != ((qe) this).field_H) {
                        break L15;
                      } else {
                        return;
                      }
                    }
                  }
                  L16: {
                    if (var4 != var7) {
                      break L16;
                    } else {
                      if (((qe) this).field_H == var9) {
                        break L13;
                      } else {
                        break L16;
                      }
                    }
                  }
                  if (var7 == var5) {
                    if (((qe) this).field_H == var9) {
                      return;
                    } else {
                      var10++;
                      continue L11;
                    }
                  } else {
                    var10++;
                    continue L11;
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private final boolean D() {
        int var2 = ((qe) this).field_e - 32;
        int var3 = -((qe) this).field_w + ((qe) this).field_z;
        int var4 = 64 + ((qe) this).field_I;
        int var5 = ((qe) this).field_w - -128;
        int var6 = wb.field_p.field_e;
        if (!(-var2 + var6 <= 1024)) {
            var6 -= 2048;
        }
        if (-var2 + var6 < -1024) {
            var6 += 2048;
        }
        int var7 = wb.field_p.field_z + -((qe) this).field_w;
        int var8 = wb.field_p.field_I;
        int var9 = wb.field_p.field_w;
        if (o.a(var9, var3, var8, var4, var5, var6, var2, (byte) 9, var7)) {
            return true;
        }
        return false;
    }

    private final void r(int param0) {
        int var2 = ca.field_a.length;
        int[] var3 = ca.field_a[param0 + var2];
        int var4 = var3[0] << 3;
        int var5 = var3[1] << 3;
        int var6 = ki.field_e[dg.field_T[23]];
        qe var7 = new qe(((qe) this).field_o, ((qe) this).field_H, 23, 0);
        var7.field_e = ((qe) this).field_e;
        var7.field_z = var5 + (-((qe) this).field_w + ((qe) this).field_z);
        if (0 > ((qe) this).field_a) {
            var7.field_e = var7.field_e + (((qe) this).field_I - var4 - var6);
            var7.field_a = -1;
        } else {
            var7.field_e = var7.field_e + var4;
        }
        var7.field_cb = true;
        var7.field_B = 256 * (var7.field_e % 32) / 32;
        var7.field_u = 256 * (var7.field_z % 64) / 64;
        var7.field_H = var7.field_z / 64;
        var7.field_o = var7.field_e / 32;
        ef.a(0, var7);
        sd.field_d = 350;
    }

    private final void l() {
        int var4 = 0;
        int var2 = r.field_a[fh.field_e];
        int var3 = fc.field_o >= var2 ? 1 : 0;
        this.g((byte) -69);
        if (!(13 != ((qe) this).field_L)) {
            this.F(59);
            return;
        }
        if (!(((qe) this).field_G <= 0)) {
            ((qe) this).field_G = ((qe) this).field_G - 1;
            if (1 == kf.field_d) {
                ((qe) this).field_L = 0;
                ((qe) this).field_D = 0;
                ((qe) this).field_kb = 0;
                this.f(true);
                return;
            }
        }
        if (!(0 != kf.field_d)) {
            var4 = af.a(-4275, ((qe) this).field_L) ? 1 : 0;
            if (var3 == 0) {
                if (!(var4 == 0)) {
                    ((qe) this).field_D = 0;
                    ((qe) this).field_L = 0;
                    ((qe) this).field_kb = 0;
                    wb.field_p.field_Y = false;
                }
            }
            int discarded$0 = 127;
            this.B();
            int discarded$1 = 0;
            this.y();
            return;
        }
        if (!(kf.field_d != 1)) {
            if (ad.field_a) {
                this.i(29647);
            }
            int discarded$2 = 0;
            this.y();
            return;
        }
        if (!(kf.field_d != 2)) {
            int discarded$3 = 127;
            this.m();
            return;
        }
    }

    private final qe h(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          var3 = -((qe) this).field_w + (64 * ((qe) this).field_H + -param0 + 64 * ((qe) this).field_u / 256);
          var4 = -param0 + (((qe) this).field_f * 64 + -((qe) this).field_w);
          var5 = 0;
          if (var4 < 2 * -((qe) this).field_w) {
            var5 = 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (480 - -(((qe) this).field_w * 2) < var4) {
            var5 = 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (wb.field_p == null) {
            break L2;
          } else {
            L3: {
              var6 = Math.abs(((qe) this).field_r + -wb.field_p.field_o);
              if (32 >= var6) {
                break L3;
              } else {
                var6 = -var6 + 64;
                break L3;
              }
            }
            if (var6 <= 24) {
              break L2;
            } else {
              var5 = 1;
              break L2;
            }
          }
        }
        L4: {
          if (this == (Object) (Object) wb.field_p) {
            L5: {
              if (gl.field_k <= 0) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L5;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L5;
              }
            }
            var5 = stackIn_16_0;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (!((qe) this).field_Z) {
              break L7;
            } else {
              if (-15 != ((qe) this).field_L) {
                break L7;
              } else {
                if (-1 < wb.field_p.field_db) {
                  var5 = 0;
                  ((qe) this).field_l = 50;
                  break L6;
                } else {
                  break L7;
                }
              }
            }
          }
          L8: {
            L9: {
              if (-15 == ((qe) this).field_F) {
                break L9;
              } else {
                if (((qe) this).field_F != 18) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            if (14 != ((qe) this).field_L) {
              break L8;
            } else {
              if (-1 >= wb.field_p.field_db) {
                ((qe) this).field_l = 50;
                var5 = 1;
                break L6;
              } else {
                break L8;
              }
            }
          }
          if (!((qe) this).field_Z) {
            break L6;
          } else {
            if (((qe) this).field_L != 14) {
              break L6;
            } else {
              if (wb.field_p.field_db <= 0) {
                var5 = 0;
                ((qe) this).field_l = 50;
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
        L10: {
          if (null == wb.field_p) {
            ((qe) this).field_l = 50;
            var5 = 1;
            var3 = 481;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          L12: {
            if (var3 < -((qe) this).field_w * 2) {
              break L12;
            } else {
              if (480 < var3) {
                break L12;
              } else {
                if (-15 == ((qe) this).field_L) {
                  break L12;
                } else {
                  if (-1 != ((qe) this).field_F) {
                    break L11;
                  } else {
                    if (((qe) this).field_L != 13) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
              }
            }
          }
          if (var5 == 0) {
            break L11;
          } else {
            if (((qe) this).field_f != -1) {
              ((qe) this).field_l = ((qe) this).field_l + 1;
              if (50 >= ((qe) this).field_l) {
                break L11;
              } else {
                L13: {
                  if (((qe) this).field_F != 6) {
                    break L13;
                  } else {
                    if (13 != ((qe) this).field_L) {
                      this.a((byte) -19, false);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  int discarded$2 = aj.a((byte) -101, (qe) this, ((qe) this).field_y);
                  ((qe) this).field_H = ((qe) this).field_f;
                  ((qe) this).field_o = ((qe) this).field_r;
                  int discarded$3 = kf.a((qe) this, ((qe) this).field_y, 8);
                  ((qe) this).field_l = 0;
                  ((qe) this).field_db = ((qe) this).field_d;
                  ((qe) this).field_h = 0;
                  ((qe) this).field_L = 0;
                  ((qe) this).field_W = 0;
                  ((qe) this).field_Q = 0;
                  ((qe) this).field_B = 0;
                  ((qe) this).field_u = 0;
                  ((qe) this).field_D = 0;
                  if (((qe) this).field_F != 0) {
                    break L14;
                  } else {
                    kl.field_a = false;
                    if (((qe) this).field_L != 13) {
                      break L14;
                    } else {
                      ((qe) this).field_L = 0;
                      break L14;
                    }
                  }
                }
                ((qe) this).field_u = 256;
                ((qe) this).field_G = 0;
                ((qe) this).x(96);
                ((qe) this).field_b = 0;
                ((qe) this).field_a = 0;
                this.c(true);
                ((qe) this).field_z = 64 * ((qe) this).field_u / 256 + ((qe) this).field_H * 64;
                ((qe) this).field_e = 32 * ((qe) this).field_o - -(32 * ((qe) this).field_B / 256);
                break L11;
              }
            } else {
              return null;
            }
          }
        }
        return (qe) this;
    }

    private final void u() {
        L0: {
          ((qe) this).field_gb = true;
          ((qe) this).field_fb = true;
          if (((qe) this).field_a != 0) {
            break L0;
          } else {
            ((qe) this).field_a = 1;
            break L0;
          }
        }
        L1: {
          ((qe) this).field_jb = false;
          ((qe) this).field_mb = true;
          if (ja.a((byte) 121, ((qe) this).field_L)) {
            break L1;
          } else {
            L2: {
              if (!((qe) this).field_c) {
                break L2;
              } else {
                if (((qe) this).field_a <= 0) {
                  break L2;
                } else {
                  if (((qe) this).field_Q > 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (!((qe) this).field_N) {
                break L3;
              } else {
                if (((qe) this).field_a >= 0) {
                  break L3;
                } else {
                  if (((qe) this).field_Q >= 0) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (!((qe) this).field_c) {
              if (!((qe) this).field_N) {
                break L1;
              } else {
                ((qe) this).field_a = 1;
                break L1;
              }
            } else {
              ((qe) this).field_a = -1;
              break L1;
            }
          }
        }
        L4: {
          if (dk.field_a >= 4) {
            L5: {
              if (hf.field_c != 0) {
                break L5;
              } else {
                mj.field_b = true;
                vd.field_b = true;
                hf.field_c = 250;
                break L5;
              }
            }
            L6: {
              fh.field_d = 0;
              dk.field_a = 4;
              if (hf.field_c > 0) {
                hf.field_c = hf.field_c - 1;
                break L6;
              } else {
                break L6;
              }
            }
            if (hf.field_c != 0) {
              break L4;
            } else {
              L7: {
                mj.field_b = false;
                lj.field_b = 0;
                vd.field_b = true;
                if (kc.field_w != null) {
                  kc.field_w[0][0] = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
              fh.field_d = 0;
              dk.field_a = 0;
              break L4;
            }
          } else {
            break L4;
          }
        }
        L8: {
          if (((qe) this).field_L == 0) {
            break L8;
          } else {
            if (((qe) this).field_L == 9) {
              break L8;
            } else {
              gl.field_f = false;
              tk.field_P = false;
              break L8;
            }
          }
        }
    }

    private final boolean d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TorChallenge.field_F ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            if (param1 == 1) {
              break L0;
            } else {
              return false;
            }
          }
        }
        L1: {
          L2: {
            var3 = ((qe) this).field_H;
            ((qe) this).field_h = ((qe) this).field_h + param1;
            var4 = ((qe) this).field_u;
            ((qe) this).field_u = ((qe) this).field_u + ((qe) this).field_h;
            if (0 < ((qe) this).field_G) {
              break L2;
            } else {
              L3: {
                if (((qe) this).field_L == 14) {
                  break L3;
                } else {
                  if (((qe) this).field_L != 13) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((qe) this).field_G = ((qe) this).field_G + 10;
              break L1;
            }
          }
          break L1;
        }
        L4: while (true) {
          L5: {
            if (((qe) this).field_u * param1 <= 256) {
              break L5;
            } else {
              L6: {
                L7: {
                  if (param1 != -1) {
                    break L7;
                  } else {
                    if (((qe) this).field_H > 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (param1 != 1) {
                  break L5;
                } else {
                  if (((qe) this).field_H >= ba.field_i.field_a - 1) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              ((qe) this).field_u = ((qe) this).field_u + -param1 * 256;
              ((qe) this).field_H = ((qe) this).field_H + param1;
              continue L4;
            }
          }
          L8: {
            if (1024 * param1 >= ((qe) this).field_u) {
              break L8;
            } else {
              L9: {
                L10: {
                  if (param1 != -1) {
                    break L10;
                  } else {
                    if (0 >= ((qe) this).field_H) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                if (param1 != 1) {
                  break L8;
                } else {
                  if (~(ba.field_i.field_a - 1) >= ~((qe) this).field_H) {
                    break L9;
                  } else {
                    break L8;
                  }
                }
              }
              ((qe) this).field_u = 1024 * param1;
              break L8;
            }
          }
          L11: {
            if (22 == ((qe) this).field_F) {
              L12: {
                var5 = 64 * var3 + (var4 * 64 / 256 + ((qe) this).field_w);
                var6 = ((qe) this).field_w + (64 * ((qe) this).field_H - -(64 * ((qe) this).field_u / 256));
                var7 = 32 * ((qe) this).field_o - -(32 * ((qe) this).field_B / 256);
                if (var7 < 2048) {
                  break L12;
                } else {
                  var7 -= 2048;
                  break L12;
                }
              }
              var8 = var5;
              L13: while (true) {
                if (var6 <= var8) {
                  break L11;
                } else {
                  L14: {
                    if (ol.field_g.a(2, var7, ((qe) this).field_w, ((qe) this).field_I, var8 + -((qe) this).field_w)) {
                      L15: {
                        if (((qe) this).field_i) {
                          break L15;
                        } else {
                          ((qe) this).field_i = true;
                          break L15;
                        }
                      }
                      if (((qe) this).field_X) {
                        var8 = var8 + (((qe) this).field_w >> 1);
                        ((qe) this).field_u = var8 % 64 * 256 / 64;
                        ((qe) this).field_H = var8 / 64;
                        return true;
                      } else {
                        break L14;
                      }
                    } else {
                      if (((qe) this).field_i) {
                        ((qe) this).field_X = true;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var8 = var8 + ((qe) this).field_w;
                  continue L13;
                }
              }
            } else {
              break L11;
            }
          }
          L16: {
            if (((qe) this).field_F != 0) {
              break L16;
            } else {
              if (~((qe) this).field_H > ~ol.field_g.field_a) {
                break L16;
              } else {
                if (((qe) this).field_db <= 0) {
                  bd.field_l = true;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
          }
          ((qe) this).field_z = 64 * ((qe) this).field_u / 256 + ((qe) this).field_H * 64;
          var5 = 7 / ((-12 - param0) / 59);
          return false;
        }
    }

    final qe c(byte param0, int param1) {
        qe var3_ref_qe = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (((qe) this).field_x >= 0) {
            ((qe) this).field_x = ((qe) this).field_x - 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (((qe) this).field_F == 23) {
          var3_ref_qe = this.o(param0 ^ 39);
          return var3_ref_qe;
        } else {
          if (((qe) this).field_F != 24) {
            L1: {
              if (((qe) this).field_F != 28) {
                break L1;
              } else {
                if (0 == fh.field_e) {
                  int discarded$30 = 24888;
                  this.E();
                  this.k(-47);
                  return (qe) this;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((qe) this).field_F != 28) {
                break L2;
              } else {
                if (fh.field_e == 1) {
                  int discarded$31 = 122;
                  this.l();
                  this.k(123);
                  return (qe) this;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((qe) this).field_F != 28) {
                break L3;
              } else {
                if (fh.field_e != 2) {
                  break L3;
                } else {
                  int discarded$32 = 39;
                  this.o();
                  this.k(10);
                  return (qe) this;
                }
              }
            }
            this.K(param0 ^ -30);
            int discarded$33 = -70;
            this.e();
            this.g((byte) -113);
            if (this.h(param1, 0) != null) {
              L4: {
                if (param0 == 29) {
                  break L4;
                } else {
                  ((qe) this).field_fb = true;
                  break L4;
                }
              }
              L5: {
                if (0 != ((qe) this).field_F) {
                  break L5;
                } else {
                  int discarded$34 = -91;
                  this.u();
                  break L5;
                }
              }
              L6: {
                if (!vg.a(((qe) this).field_F, -1)) {
                  break L6;
                } else {
                  this.b((byte) -121, ((qe) this).field_F);
                  this.b(359, ((qe) this).field_F);
                  break L6;
                }
              }
              L7: {
                if (((qe) this).field_F != 28) {
                  break L7;
                } else {
                  int discarded$35 = -35;
                  this.a();
                  int discarded$36 = -66;
                  this.b();
                  break L7;
                }
              }
              L8: {
                int discarded$37 = -15777;
                this.d();
                if (28 != ((qe) this).field_F) {
                  break L8;
                } else {
                  L9: {
                    stackOut_29_0 = 0;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (((qe) this).field_jb) {
                      stackOut_31_0 = stackIn_31_0;
                      stackOut_31_1 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      break L9;
                    } else {
                      stackOut_30_0 = stackIn_30_0;
                      stackOut_30_1 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      break L9;
                    }
                  }
                  if (stackIn_32_0 != stackIn_32_1) {
                    ((qe) this).field_jb = true;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L10: {
                int discarded$38 = 116;
                ((qe) this).field_O = this.i();
                if (!((qe) this).field_O) {
                  break L10;
                } else {
                  this.j(false);
                  break L10;
                }
              }
              L11: {
                if (((qe) this).field_lb > 0) {
                  ((qe) this).field_lb = ((qe) this).field_lb - 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                var4 = ((qe) this).field_L;
                if (14 != var4) {
                  if (13 == var4) {
                    L13: {
                      if (!((qe) this).field_cb) {
                        break L13;
                      } else {
                        if (((qe) this).field_q) {
                          ((qe) this).field_D = ((qe) this).field_D + 1;
                          if (32 > ((qe) this).field_D) {
                            break L12;
                          } else {
                            return null;
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    int discarded$39 = aj.a((byte) -102, (qe) this, ((qe) this).field_y);
                    boolean discarded$40 = this.d(120, 1);
                    int discarded$41 = 0;
                    qe discarded$42 = this.k();
                    int discarded$43 = kf.a((qe) this, ((qe) this).field_y, 8);
                    break L12;
                  } else {
                    if (var4 != 0) {
                      if (var4 == 2) {
                        L14: {
                          int discarded$44 = aj.a((byte) -94, (qe) this, ((qe) this).field_y);
                          this.a(true, false);
                          if (0 != ((qe) this).field_F) {
                            int discarded$45 = 0;
                            ((qe) this).field_O = this.g();
                            break L14;
                          } else {
                            this.v(12);
                            break L14;
                          }
                        }
                        int discarded$46 = kf.a((qe) this, ((qe) this).field_y, param0 + -21);
                        if (((qe) this).field_O) {
                          this.j(false);
                          break L12;
                        } else {
                          L15: {
                            if (!((qe) this).field_ib) {
                              break L15;
                            } else {
                              if (((qe) this).field_F != 0) {
                                break L15;
                              } else {
                                if (!ch.field_a[vj.field_c][pl.field_e[10]]) {
                                  break L15;
                                } else {
                                  if (((qe) this).field_h <= 0) {
                                    break L15;
                                  } else {
                                    if (ol.field_g.a(param0 ^ 31, ((qe) this).field_e, (-((qe) this).field_w + 160) / 2, ((qe) this).field_I, ((qe) this).field_z)) {
                                      break L15;
                                    } else {
                                      ((qe) this).field_kb = 0;
                                      ((qe) this).field_L = 10;
                                      ti.field_d = 10;
                                      ((qe) this).field_D = 0;
                                      wk.field_F = 0;
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (!((qe) this).field_ib) {
                            break L12;
                          } else {
                            if (((qe) this).field_F != 0) {
                              break L12;
                            } else {
                              if (((qe) this).field_h > 0) {
                                ((qe) this).field_L = 3;
                                this.H(param0 ^ 20);
                                ((qe) this).field_kb = 0;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      } else {
                        if (1 != var4) {
                          L16: {
                            if (var4 == 3) {
                              break L16;
                            } else {
                              if (var4 != 4) {
                                if (var4 != 5) {
                                  if (var4 == 7) {
                                    break L16;
                                  } else {
                                    if (var4 != 6) {
                                      if (var4 == 8) {
                                        break L16;
                                      } else {
                                        if (var4 != 10) {
                                          if (var4 != 9) {
                                            if (12 == var4) {
                                              L17: {
                                                ((qe) this).field_D = ((qe) this).field_D + 1;
                                                if (((qe) this).field_D > 24) {
                                                  ((qe) this).field_L = 0;
                                                  if (((qe) this).field_F == 0) {
                                                    kl.field_a = false;
                                                    break L17;
                                                  } else {
                                                    break L17;
                                                  }
                                                } else {
                                                  break L17;
                                                }
                                              }
                                              L18: {
                                                if (!vg.a(((qe) this).field_F, -1)) {
                                                  break L18;
                                                } else {
                                                  int discarded$47 = aj.a((byte) -123, (qe) this, ((qe) this).field_y);
                                                  break L18;
                                                }
                                              }
                                              L19: {
                                                var3 = ((qe) this).field_D;
                                                this.a(true, false);
                                                ((qe) this).field_D = var3;
                                                if (((qe) this).field_L != 0) {
                                                  break L19;
                                                } else {
                                                  if (24 < ((qe) this).field_D) {
                                                    break L19;
                                                  } else {
                                                    ((qe) this).field_L = 12;
                                                    break L19;
                                                  }
                                                }
                                              }
                                              L20: {
                                                if (((qe) this).field_F != 0) {
                                                  if (((qe) this).field_F != 28) {
                                                    int discarded$48 = 0;
                                                    ((qe) this).field_O = this.g();
                                                    break L20;
                                                  } else {
                                                    this.e(false);
                                                    break L20;
                                                  }
                                                } else {
                                                  this.v(param0 ^ 17);
                                                  break L20;
                                                }
                                              }
                                              L21: {
                                                if (!vg.a(((qe) this).field_F, -1)) {
                                                  break L21;
                                                } else {
                                                  int discarded$49 = kf.a((qe) this, ((qe) this).field_y, 8);
                                                  if (((qe) this).field_O) {
                                                    this.j(false);
                                                    break L12;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              if (((qe) this).field_F != 0) {
                                                break L12;
                                              } else {
                                                if (ol.field_g.a(2, ((qe) this).field_e, ((qe) this).field_w, ((qe) this).field_I, 1 + (-((qe) this).field_w + ((qe) this).field_z))) {
                                                  L22: {
                                                    if (((qe) this).field_ib) {
                                                      break L22;
                                                    } else {
                                                      if (!((qe) this).field_ab) {
                                                        break L12;
                                                      } else {
                                                        if (!ol.field_g.a(2, ((qe) this).field_e, ((qe) this).field_w, ((qe) this).field_I, -((qe) this).field_w + (((qe) this).field_z - 16))) {
                                                          break L22;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  ((qe) this).field_L = 0;
                                                  kl.field_a = false;
                                                  this.H(param0 + -20);
                                                  break L12;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            } else {
                                              if (18 != var4) {
                                                if (var4 == 19) {
                                                  ((qe) this).field_D = ((qe) this).field_D + 1;
                                                  if (((qe) this).field_D > 50) {
                                                    L23: {
                                                      boolean discarded$50 = this.c((byte) 88, true);
                                                      ((qe) this).field_o = ((qe) this).field_o + 32;
                                                      if (((qe) this).field_o < 64) {
                                                        break L23;
                                                      } else {
                                                        ((qe) this).field_o = ((qe) this).field_o - 64;
                                                        break L23;
                                                      }
                                                    }
                                                    L24: {
                                                      ((qe) this).field_e = 32 * ((qe) this).field_o;
                                                      var4 = 2048;
                                                      ((qe) this).field_D = 0;
                                                      if (~var4 >= ~((qe) this).field_e) {
                                                        ((qe) this).field_e = ((qe) this).field_e % var4;
                                                        break L24;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                    ((qe) this).field_L = 20;
                                                    break L12;
                                                  } else {
                                                    break L12;
                                                  }
                                                } else {
                                                  if (var4 != 20) {
                                                    break L12;
                                                  } else {
                                                    ((qe) this).field_D = ((qe) this).field_D + 1;
                                                    if (50 < ((qe) this).field_D) {
                                                      ec.field_e = true;
                                                      ((qe) this).field_L = 0;
                                                      ((qe) this).field_D = 0;
                                                      we.field_f = 100;
                                                      break L12;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                              } else {
                                                ((qe) this).field_D = ((qe) this).field_D + 1;
                                                if (((qe) this).field_D > 50) {
                                                  hk.field_b = true;
                                                  break L12;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                          } else {
                                            break L16;
                                          }
                                        } else {
                                          break L16;
                                        }
                                      }
                                    } else {
                                      break L16;
                                    }
                                  }
                                } else {
                                  break L16;
                                }
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (((qe) this).field_F != 28) {
                            this.b(param0 ^ 31);
                            break L12;
                          } else {
                            this.a(true, -121);
                            break L12;
                          }
                        } else {
                          L25: {
                            ((qe) this).field_D = ((qe) this).field_D + 1;
                            int discarded$51 = aj.a((byte) -106, (qe) this, ((qe) this).field_y);
                            if (wb.field_p.field_ab) {
                              break L25;
                            } else {
                              if (((qe) this).field_h >= qf.field_f) {
                                break L25;
                              } else {
                                ((qe) this).field_h = ((qe) this).field_h + 1;
                                break L25;
                              }
                            }
                          }
                          L26: {
                            this.a(true, false);
                            if (0 >= ((qe) this).field_h) {
                              break L26;
                            } else {
                              ((qe) this).field_L = 2;
                              if (vg.a(((qe) this).field_F, -1)) {
                                qa.a(((qe) this).field_o, wb.field_p.field_H, dg.field_T[((qe) this).field_F], (qe) this, ((qe) this).field_H, param0 + -30, 5, wb.field_p.field_o, 20, ((qe) this).field_V);
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                          }
                          L27: {
                            if (((qe) this).field_F == 0) {
                              this.v(12);
                              break L27;
                            } else {
                              int discarded$52 = 0;
                              ((qe) this).field_O = this.g();
                              break L27;
                            }
                          }
                          int discarded$53 = kf.a((qe) this, ((qe) this).field_y, 8);
                          if (!((qe) this).field_O) {
                            if (!((qe) this).field_ib) {
                              break L12;
                            } else {
                              if (0 != ((qe) this).field_F) {
                                break L12;
                              } else {
                                if (ch.field_a[vj.field_c][pl.field_e[10]]) {
                                  L28: {
                                    ti.field_d = 10;
                                    ((qe) this).field_L = 10;
                                    wk.field_F = 0;
                                    if (cl.field_s[vj.field_c] <= ((qe) this).field_D) {
                                      break L28;
                                    } else {
                                      ((qe) this).field_h = ((qe) this).field_h - 7;
                                      ((qe) this).field_Q = ((qe) this).field_Q + 20 * ((qe) this).field_a;
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    if (((qe) this).field_F != 0) {
                                      ((qe) this).field_D = 0;
                                      break L29;
                                    } else {
                                      break L29;
                                    }
                                  }
                                  this.n(param0 + 67);
                                  ((qe) this).field_kb = 0;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          } else {
                            this.j(false);
                            break L12;
                          }
                        }
                      }
                    } else {
                      L30: {
                        if (!((qe) this).field_fb) {
                          break L30;
                        } else {
                          if (ol.field_g.a(2, ((qe) this).field_e, ((qe) this).field_w, ((qe) this).field_I, -((qe) this).field_w + ((qe) this).field_z - -1)) {
                            break L30;
                          } else {
                            if (22 != ((qe) this).field_F) {
                              ((qe) this).field_L = 2;
                              if (!vg.a(((qe) this).field_F, param0 ^ -30)) {
                                break L12;
                              } else {
                                qa.a(((qe) this).field_o, wb.field_p.field_H, dg.field_T[((qe) this).field_F], (qe) this, ((qe) this).field_H, -1, 5, wb.field_p.field_o, 25, ((qe) this).field_V);
                                break L12;
                              }
                            } else {
                              break L30;
                            }
                          }
                        }
                      }
                      L31: {
                        if (((qe) this).field_F == 0) {
                          L32: {
                            if (0 != ((qe) this).field_F) {
                              break L32;
                            } else {
                              if (vj.field_c != 2) {
                                break L32;
                              } else {
                                if (kl.field_a) {
                                  if (((qe) this).field_Q != 0) {
                                    ((qe) this).field_j = true;
                                    break L31;
                                  } else {
                                    kl.field_a = false;
                                    break L31;
                                  }
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                          L33: {
                            if (((qe) this).field_c) {
                              break L33;
                            } else {
                              if (((qe) this).field_N) {
                                break L33;
                              } else {
                                ((qe) this).field_j = true;
                                break L31;
                              }
                            }
                          }
                          L34: {
                            if (!((qe) this).field_c) {
                              break L34;
                            } else {
                              if (((qe) this).field_Q > 0) {
                                ((qe) this).field_j = true;
                                break L31;
                              } else {
                                break L34;
                              }
                            }
                          }
                          L35: {
                            if (!((qe) this).field_N) {
                              break L35;
                            } else {
                              if (((qe) this).field_Q >= 0) {
                                break L35;
                              } else {
                                ((qe) this).field_j = true;
                                break L31;
                              }
                            }
                          }
                          L36: {
                            if (0 <= ((qe) this).field_a) {
                              break L36;
                            } else {
                              if (~((qe) this).field_Q <= ~-((qe) this).field_K) {
                                break L36;
                              } else {
                                ((qe) this).field_j = true;
                                break L31;
                              }
                            }
                          }
                          if (((qe) this).field_a <= 0) {
                            break L31;
                          } else {
                            if (((qe) this).field_Q <= ((qe) this).field_K) {
                              break L31;
                            } else {
                              ((qe) this).field_j = true;
                              break L31;
                            }
                          }
                        } else {
                          break L31;
                        }
                      }
                      L37: {
                        if (!((qe) this).field_j) {
                          break L37;
                        } else {
                          L38: {
                            if (((qe) this).field_K >= ((qe) this).field_a * ((qe) this).field_Q) {
                              break L38;
                            } else {
                              ((qe) this).field_j = false;
                              break L38;
                            }
                          }
                          ((qe) this).field_Q = 7 * ((qe) this).field_Q >> 3;
                          if (((qe) this).field_Q < 0) {
                            ((qe) this).field_Q = ((qe) this).field_Q + 1;
                            break L37;
                          } else {
                            if (((qe) this).field_Q <= 0) {
                              break L37;
                            } else {
                              ((qe) this).field_Q = ((qe) this).field_Q - 1;
                              break L37;
                            }
                          }
                        }
                      }
                      L39: {
                        int discarded$54 = aj.a((byte) -94, (qe) this, ((qe) this).field_y);
                        if (((qe) this).field_F != 0) {
                          if (((qe) this).field_F == 22) {
                            ((qe) this).field_O = this.d(-119, 1);
                            int discarded$55 = 0;
                            if (this.k() != null) {
                              break L39;
                            } else {
                              return null;
                            }
                          } else {
                            if (((qe) this).field_F != 0) {
                              int discarded$56 = 0;
                              ((qe) this).field_O = this.g();
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                        } else {
                          this.v(12);
                          break L39;
                        }
                      }
                      int discarded$57 = kf.a((qe) this, ((qe) this).field_y, param0 + -21);
                      if (!((qe) this).field_O) {
                        L40: {
                          if (((qe) this).field_F != 7) {
                            break L40;
                          } else {
                            if (0 < ((qe) this).field_D) {
                              break L40;
                            } else {
                              ((qe) this).field_O = true;
                              this.j(false);
                              break L12;
                            }
                          }
                        }
                        L41: {
                          if (!((qe) this).field_ab) {
                            break L41;
                          } else {
                            if (((qe) this).field_L == 2) {
                              break L41;
                            } else {
                              if (!ol.field_g.a(param0 + -27, ((qe) this).field_e, ((qe) this).field_w, ((qe) this).field_I, -16 + (((qe) this).field_z - ((qe) this).field_w))) {
                                L42: {
                                  ((qe) this).field_h = -((qe) this).field_M;
                                  ((qe) this).field_L = 1;
                                  if (((qe) this).field_F == 0) {
                                    wh.a(vj.field_c, 0, param0 + -82);
                                    break L42;
                                  } else {
                                    if (((qe) this).field_F == 28) {
                                      jc.b(fh.field_e, 1, 0);
                                      break L42;
                                    } else {
                                      if (vg.a(((qe) this).field_F, -1)) {
                                        qa.a(((qe) this).field_o, wb.field_p.field_H, dg.field_T[((qe) this).field_F], (qe) this, ((qe) this).field_H, param0 ^ -30, 3, wb.field_p.field_o, 25, ((qe) this).field_V);
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                }
                                ((qe) this).field_D = 0;
                                break L41;
                              } else {
                                break L41;
                              }
                            }
                          }
                        }
                        L43: {
                          if (!((qe) this).field_ib) {
                            break L43;
                          } else {
                            if (((qe) this).field_F != 2) {
                              break L43;
                            } else {
                              this.p(param0 + -37);
                              break L43;
                            }
                          }
                        }
                        L44: {
                          if (!((qe) this).field_ib) {
                            break L44;
                          } else {
                            if (((qe) this).field_F == 3) {
                              int discarded$58 = -126;
                              this.C();
                              break L44;
                            } else {
                              break L44;
                            }
                          }
                        }
                        if (0 == ((qe) this).field_F) {
                          this.l(false);
                          break L12;
                        } else {
                          break L12;
                        }
                      } else {
                        this.j(false);
                        break L12;
                      }
                    }
                  }
                } else {
                  boolean discarded$59 = this.d(param0 + -102, -1);
                  break L12;
                }
              }
              L45: {
                if (((qe) this).field_F != 6) {
                  break L45;
                } else {
                  if (wb.field_p == null) {
                    break L45;
                  } else {
                    if (((qe) this).field_db > 0) {
                      if (~wb.field_p.field_z >= ~(-((qe) this).field_w + ((qe) this).field_z)) {
                        this.a((byte) -74, true);
                        break L45;
                      } else {
                        break L45;
                      }
                    } else {
                      break L45;
                    }
                  }
                }
              }
              return (qe) this;
            } else {
              return null;
            }
          } else {
            var3_ref_qe = this.g(param0 + 11198);
            return var3_ref_qe;
          }
        }
    }

    private final void y() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        L0: {
          var2 = r.field_a[fh.field_e];
          if (var2 > fc.field_o) {
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
          var3 = stackIn_3_0;
          var4 = af.a(-4275, ((qe) this).field_L) ? 1 : 0;
          if (((qe) this).field_L == 8) {
            break L1;
          } else {
            ad.field_a = true;
            break L1;
          }
        }
        L2: {
          if (kf.field_d != 0) {
            break L2;
          } else {
            L3: {
              var5 = this.b((byte) 109, false);
              int discarded$1 = -74;
              var6 = this.c();
              if (!re.a(-1, var6, var5, -1)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            var7 = stackIn_9_0;
            if (var3 != 0) {
              break L2;
            } else {
              if (var7 == 0) {
                return;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          var5 = this.b(false, -1);
          var6 = wb.field_p.b(false, -1);
          if (var3 != 0) {
            break L4;
          } else {
            if (var4 != 0) {
              break L4;
            } else {
              if (var5 == var6) {
                break L4;
              } else {
                return;
              }
            }
          }
        }
        L5: {
          var7 = (((qe) this).field_I >> 1) + ((qe) this).field_e;
          var8 = (wb.field_p.field_I >> 1) + wb.field_p.field_e;
          if (var3 != 0) {
            break L5;
          } else {
            if (var4 != 0) {
              break L5;
            } else {
              if (((qe) this).field_a < 0) {
                break L5;
              } else {
                if (~var8 <= ~var7) {
                  break L5;
                } else {
                  return;
                }
              }
            }
          }
        }
        L6: {
          if (var3 != 0) {
            break L6;
          } else {
            if (var4 != 0) {
              break L6;
            } else {
              if (((qe) this).field_a >= 0) {
                break L6;
              } else {
                if (var7 < var8) {
                  return;
                } else {
                  break L6;
                }
              }
            }
          }
        }
        L7: {
          if (var4 == 0) {
            ((qe) this).field_D = 0;
            ((qe) this).field_kb = 0;
            wb.field_p.field_Y = false;
            ((qe) this).field_L = 3;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (~wb.field_p.field_z >= ~((qe) this).field_z) {
            stackOut_33_0 = 0;
            stackIn_34_0 = stackOut_33_0;
            break L8;
          } else {
            stackOut_32_0 = 1;
            stackIn_34_0 = stackOut_32_0;
            break L8;
          }
        }
        L9: {
          var9 = stackIn_34_0;
          if (var3 == 0) {
            break L9;
          } else {
            if (var9 == 0) {
              break L9;
            } else {
              if (kf.field_d != 1) {
                break L9;
              } else {
                if (0 >= hb.field_f) {
                  ad.field_a = false;
                  ((qe) this).field_kb = 0;
                  hb.field_f = 500;
                  ((qe) this).field_L = 8;
                  ((qe) this).field_D = 0;
                  wb.field_p.field_Y = false;
                  var10 = fk.field_s[0][0] * 32;
                  var11 = 32 * fk.field_s[0][1] - -32;
                  var12 = var11 + var10 >> 1;
                  if (var7 > var12) {
                    if (var7 <= var12) {
                      break L9;
                    } else {
                      L10: {
                        ((qe) this).field_a = -1;
                        if (ql.field_j) {
                          stackOut_47_0 = 0;
                          stackIn_48_0 = stackOut_47_0;
                          break L10;
                        } else {
                          stackOut_46_0 = 1;
                          stackIn_48_0 = stackOut_46_0;
                          break L10;
                        }
                      }
                      ql.field_j = stackIn_48_0 != 0;
                      break L9;
                    }
                  } else {
                    L11: {
                      ((qe) this).field_a = 1;
                      if (ql.field_j) {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        break L11;
                      } else {
                        stackOut_41_0 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        break L11;
                      }
                    }
                    ql.field_j = stackIn_43_0 != 0;
                    break L9;
                  }
                } else {
                  this.a(false, -124);
                  return;
                }
              }
            }
          }
        }
        this.a(false, -124);
    }

    private final void v(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_24_0 = 0;
        boolean stackOut_23_0 = false;
        boolean stackOut_30_0 = false;
        int stackOut_29_0 = 0;
        L0: {
          if (param0 == 12) {
            break L0;
          } else {
            boolean discarded$1 = this.d(-114, -51);
            break L0;
          }
        }
        L1: {
          var2 = vj.field_c;
          if (((qe) this).field_n) {
            if (!((qe) this).field_c) {
              if (!((qe) this).field_N) {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = 0;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
            } else {
              stackOut_5_0 = 0;
              stackIn_10_0 = stackOut_5_0;
              break L1;
            }
          } else {
            stackOut_3_0 = 0;
            stackIn_10_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_10_0;
          if (((qe) this).field_L != 0) {
            break L2;
          } else {
            if (var3 == 0) {
              break L2;
            } else {
              if (2 != var2) {
                return;
              } else {
                if (((qe) this).field_F == 28) {
                  return;
                } else {
                  break L2;
                }
              }
            }
          }
        }
        L3: {
          if (((qe) this).field_L != 0) {
            break L3;
          } else {
            if (var3 == 0) {
              break L3;
            } else {
              if (var2 != 2) {
                break L3;
              } else {
                if (kl.field_a) {
                  break L3;
                } else {
                  return;
                }
              }
            }
          }
        }
        L4: {
          if (((qe) this).field_Q == 0) {
            break L4;
          } else {
            L5: {
              if (0 != ((qe) this).field_L) {
                stackOut_24_0 = 1;
                stackIn_25_0 = stackOut_24_0;
                break L5;
              } else {
                stackOut_23_0 = ((qe) this).field_mb;
                stackIn_25_0 = stackOut_23_0 ? 1 : 0;
                break L5;
              }
            }
            L6: {
              var4 = stackIn_25_0;
              if (((qe) this).field_L != 0) {
                break L6;
              } else {
                if (((qe) this).field_K >= ((qe) this).field_Q * ((qe) this).field_a) {
                  break L6;
                } else {
                  var4 = 0;
                  break L6;
                }
              }
            }
            L7: {
              if (((qe) this).field_L == 0) {
                stackOut_30_0 = ((qe) this).field_gb;
                stackIn_31_0 = stackOut_30_0 ? 1 : 0;
                break L7;
              } else {
                stackOut_29_0 = 0;
                stackIn_31_0 = stackOut_29_0;
                break L7;
              }
            }
            var5 = stackIn_31_0;
            if (this.a(var4 != 0, (byte) -127, var5 == 0)) {
              break L4;
            } else {
              ((qe) this).field_Q = 0;
              break L4;
            }
          }
        }
        L8: {
          L9: {
            if (!((qe) this).field_c) {
              break L9;
            } else {
              if (-((qe) this).field_K >= ((qe) this).field_Q) {
                break L9;
              } else {
                if (((qe) this).field_j) {
                  break L9;
                } else {
                  ((qe) this).field_Q = ((qe) this).field_Q - ((qe) this).field_C;
                  break L8;
                }
              }
            }
          }
          if (!((qe) this).field_N) {
            break L8;
          } else {
            if (((qe) this).field_Q >= ((qe) this).field_K) {
              break L8;
            } else {
              if (!((qe) this).field_j) {
                ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_C;
                break L8;
              } else {
                break L8;
              }
            }
          }
        }
    }

    private final boolean a(byte param0, qe param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                param1.field_b = 0;
                var3_int = df.field_R / 32;
                if (param1.field_o >= var3_int) {
                  break L1;
                } else {
                  if (((qe) this).field_a > 0) {
                    param1.field_b = 64;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param0 <= -18) {
                  break L2;
                } else {
                  this.r(-61);
                  break L2;
                }
              }
              L3: {
                if (var3_int >= param1.field_o) {
                  break L3;
                } else {
                  if (((qe) this).field_a < 0) {
                    param1.field_b = -64;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              param1.field_b = param1.field_o + -var3_int;
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("qe.RC(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    private final void g(byte param0) {
        int var2 = 0;
        qe var2_ref_qe = null;
        L0: {
          if (((qe) this).field_db > 0) {
            break L0;
          } else {
            if (((qe) this).field_Z) {
              break L0;
            } else {
              L1: {
                if (6 != ((qe) this).field_F) {
                  break L1;
                } else {
                  if (((qe) this).field_V == 0) {
                    break L0;
                  } else {
                    if (2 != ((qe) this).field_V) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              if (((qe) this).field_L != 13) {
                L2: {
                  if ((Object) (Object) wb.field_p == this) {
                    L3: {
                      if (mj.field_b) {
                        L4: {
                          vd.field_b = true;
                          if (kc.field_w != null) {
                            kc.field_w[0][0] = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        fh.field_d = 0;
                        mj.field_b = false;
                        dk.field_a = 0;
                        hf.field_c = 0;
                        lj.field_b = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (gl.field_k <= 0) {
                      break L2;
                    } else {
                      gl.field_k = gl.field_k - 1;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L5: {
                  ((qe) this).field_D = 0;
                  ((qe) this).field_L = 13;
                  if (((qe) this).field_nb) {
                    ((qe) this).field_nb = false;
                    wj.field_a = wj.field_a + 1;
                    var2_ref_qe = new qe(((qe) this).field_o, ((qe) this).field_H, 8 - -((qe) this).field_V, 0);
                    ef.a(0, var2_ref_qe);
                    var2_ref_qe.field_B = ((qe) this).field_B;
                    var2_ref_qe.field_u = ((qe) this).field_u;
                    var2_ref_qe.field_L = 1;
                    ((qe) this).field_z = ((qe) this).field_H * 64 - -(((qe) this).field_u * 64 / 256);
                    var2_ref_qe.field_h = -10;
                    ((qe) this).field_e = 32 * ((qe) this).field_B / 256 + ((qe) this).field_o * 32;
                    var2_ref_qe.field_Q = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (6 != ((qe) this).field_F) {
                  break L0;
                } else {
                  if (((qe) this).field_V != 1) {
                    break L0;
                  } else {
                    this.a((byte) -117, false);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        L6: {
          L7: {
            if (((qe) this).field_L == 13) {
              break L7;
            } else {
              if (((qe) this).field_O) {
                break L7;
              } else {
                if (((qe) this).field_db > 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
          }
          ((qe) this).field_W = ((qe) this).field_W + 1;
          break L6;
        }
        L8: {
          if (((qe) this).field_W >= 200) {
            ((qe) this).field_W = 0;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = 87 % ((param0 - 43) / 50);
          if (0 > ((qe) this).field_W) {
            ((qe) this).field_W = 0;
            break L9;
          } else {
            break L9;
          }
        }
    }

    private final int b(boolean param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        var13 = pg.field_n;
        var3 = var13;
        var6 = ((qe) this).field_z;
        var7 = var6 + -((qe) this).field_w;
        var8 = 16;
        var11 = 0;
        L0: while (true) {
          if (3 <= var11) {
            return -1;
          } else {
            L1: {
              var4 = var13[var11][0] * 64;
              var4 = var4 + var8;
              var5 = 64 * (1 + var13[var11][1]);
              var9 = -var4 + var5;
              var10 = -((qe) this).field_w + (var9 + -8);
              if (!param0) {
                var10 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            if (var4 - -var10 <= var7) {
              if (var5 >= var6) {
                return var11;
              } else {
                var11++;
                continue L0;
              }
            } else {
              var11++;
              continue L0;
            }
          }
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var4 = 0;
        if (this.a((byte) -50, fk.field_s)) {
          var6 = this.b(false, -1);
          if (var6 < 0) {
            L0: {
              kf.field_d = 2;
              ((qe) this).field_Q = 0;
              ((qe) this).field_h = 0;
              if (!rk.field_e) {
                L1: {
                  if (rk.field_e) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L1;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L1;
                  }
                }
                rk.field_e = stackIn_15_0 != 0;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L2: {
              ((qe) this).field_a = this.c(var6, -21);
              if (((qe) this).field_a <= 0) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_20_0;
              int discarded$3 = -74;
              var8 = this.c();
              if (!re.a(-1, var8, var7, var6)) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L3;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L3;
              }
            }
            L4: {
              var4 = stackIn_23_0;
              if (var4 != 0) {
                this.d((byte) 120, var6);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!sl.a(var6, var7, var8, -22981)) {
                break L5;
              } else {
                L6: {
                  if (ql.field_j) {
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    break L6;
                  } else {
                    stackOut_28_0 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    break L6;
                  }
                }
                L7: {
                  ql.field_j = stackIn_30_0 != 0;
                  ((qe) this).field_a = -((qe) this).field_a;
                  if (0 >= ((qe) this).field_a) {
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    break L7;
                  } else {
                    stackOut_31_0 = 1;
                    stackIn_33_0 = stackOut_31_0;
                    break L7;
                  }
                }
                var7 = stackIn_33_0;
                break L5;
              }
            }
            int discarded$4 = -31487;
            this.I();
            var2 = 0;
            var3 = 0;
            boolean discarded$5 = this.a(var2 != 0, (byte) -127, var3 != 0);
            var9 = this.b((byte) 109, var4 != 0);
            if (var7 != var9) {
              return;
            } else {
              L8: {
                ((qe) this).field_Q = 0;
                kf.field_d = 0;
                if (rk.field_e) {
                  break L8;
                } else {
                  L9: {
                    if (rk.field_e) {
                      stackOut_38_0 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      break L9;
                    } else {
                      stackOut_37_0 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      break L9;
                    }
                  }
                  rk.field_e = stackIn_39_0 != 0;
                  break L8;
                }
              }
              return;
            }
          }
        } else {
          L10: {
            if (!rk.field_e) {
              L11: {
                if (rk.field_e) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L11;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L11;
                }
              }
              rk.field_e = stackIn_6_0 != 0;
              break L10;
            } else {
              break L10;
            }
          }
          ((qe) this).field_Q = 0;
          kf.field_d = 2;
          ((qe) this).field_h = 0;
          return;
        }
    }

    final void b(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (!param1) {
          L0: {
            L1: {
              if (((qe) this).field_L == 2) {
                break L1;
              } else {
                L2: {
                  if (((qe) this).field_L != 0) {
                    break L2;
                  } else {
                    if (((qe) this).field_eb) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((qe) this).field_L == 1) {
                  i.field_r = 2;
                  break L0;
                } else {
                  L3: {
                    if (((qe) this).field_L != 0) {
                      break L3;
                    } else {
                      if (cl.field_z) {
                        i.field_r = 19;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (((qe) this).field_L == 18) {
                    i.field_r = 9;
                    break L0;
                  } else {
                    if (((qe) this).field_L == 19) {
                      i.field_r = 9;
                      break L0;
                    } else {
                      if (((qe) this).field_L != 20) {
                        L4: {
                          if (((qe) this).field_L != 12) {
                            break L4;
                          } else {
                            L5: {
                              if (((qe) this).field_Q > 0) {
                                break L5;
                              } else {
                                if (((qe) this).field_g == 5) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            i.field_r = 5;
                            break L0;
                          }
                        }
                        L6: {
                          if (12 != ((qe) this).field_L) {
                            break L6;
                          } else {
                            L7: {
                              if (((qe) this).field_Q < 0) {
                                break L7;
                              } else {
                                if (((qe) this).field_g != 6) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            i.field_r = 6;
                            break L0;
                          }
                        }
                        L8: {
                          if (((qe) this).field_L != 0) {
                            break L8;
                          } else {
                            L9: {
                              if (5 == ((qe) this).field_g) {
                                break L9;
                              } else {
                                if (((qe) this).field_g == 6) {
                                  break L9;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            i.field_r = 7;
                            break L0;
                          }
                        }
                        L10: {
                          if (((qe) this).field_L == 9) {
                            break L10;
                          } else {
                            L11: {
                              if (((qe) this).field_L != 0) {
                                break L11;
                              } else {
                                if (tk.field_P) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (((qe) this).field_L != 0) {
                                break L12;
                              } else {
                                if (!((qe) this).field_j) {
                                  break L12;
                                } else {
                                  if (((qe) this).field_Q != 0) {
                                    i.field_r = 4;
                                    break L0;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            L13: {
                              if (((qe) this).field_L != 0) {
                                break L13;
                              } else {
                                if (0 != ((qe) this).field_Q) {
                                  break L13;
                                } else {
                                  i.field_r = 0;
                                  break L0;
                                }
                              }
                            }
                            L14: {
                              if (((qe) this).field_L != 0) {
                                break L14;
                              } else {
                                if (0 != ((qe) this).field_Q) {
                                  i.field_r = 1;
                                  break L0;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (((qe) this).field_L == 3) {
                              i.field_r = 11;
                              break L0;
                            } else {
                              if (((qe) this).field_L != 4) {
                                if (((qe) this).field_L != 5) {
                                  if (((qe) this).field_L == 6) {
                                    i.field_r = 15;
                                    break L0;
                                  } else {
                                    if (((qe) this).field_L == 7) {
                                      i.field_r = 16;
                                      break L0;
                                    } else {
                                      if (((qe) this).field_L != 10) {
                                        if (((qe) this).field_L != 13) {
                                          break L0;
                                        } else {
                                          i.field_r = 8;
                                          break L0;
                                        }
                                      } else {
                                        i.field_r = 14;
                                        break L0;
                                      }
                                    }
                                  }
                                } else {
                                  i.field_r = 13;
                                  break L0;
                                }
                              } else {
                                i.field_r = 12;
                                break L0;
                              }
                            }
                          }
                        }
                        i.field_r = 17;
                        break L0;
                      } else {
                        i.field_r = 10;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            i.field_r = 3;
            break L0;
          }
          L15: {
            var3 = vj.field_c;
            if (((qe) this).field_g != i.field_r) {
              ((qe) this).field_g = i.field_r;
              ((qe) this).field_p = ef.field_k;
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (i.field_r != 3) {
              if (i.field_r == 2) {
                if (ef.field_k + (-((qe) this).field_p - bb.field_k[i.field_r][var3]) > 0) {
                  n.field_jb = 1;
                  break L16;
                } else {
                  n.field_jb = 0;
                  break L16;
                }
              } else {
                L17: {
                  if (ja.a((byte) 104, ((qe) this).field_L)) {
                    break L17;
                  } else {
                    L18: {
                      if (((qe) this).field_L != 0) {
                        break L18;
                      } else {
                        if (i.field_r == 17) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      L20: {
                        n.field_jb = (-((qe) this).field_p + ef.field_k) / bb.field_k[i.field_r][var3];
                        if (n.field_jb < -1 + db.field_x[i.field_r][var3]) {
                          break L20;
                        } else {
                          if (ue.field_i[i.field_r][var3]) {
                            break L20;
                          } else {
                            n.field_jb = db.field_x[i.field_r][var3] - 1;
                            break L19;
                          }
                        }
                      }
                      n.field_jb = n.field_jb % db.field_x[i.field_r][var3];
                      break L19;
                    }
                    if (i.field_r != 1) {
                      break L16;
                    } else {
                      if ((ef.field_k - ((qe) this).field_p) % bb.field_k[i.field_r][var3] != 0) {
                        break L16;
                      } else {
                        if (!ja.field_e[var3][n.field_jb]) {
                          break L16;
                        } else {
                          wh.a(vj.field_c, 3, -103);
                          break L16;
                        }
                      }
                    }
                  }
                }
                L21: {
                  n.field_jb = ((qe) this).field_kb;
                  if (~n.field_jb > ~(-1 + db.field_x[i.field_r][var3])) {
                    break L21;
                  } else {
                    n.field_jb = -1 + db.field_x[i.field_r][var3];
                    break L21;
                  }
                }
                if (i.field_r != 17) {
                  break L16;
                } else {
                  if (0 != ((qe) this).field_D) {
                    break L16;
                  } else {
                    if (!cg.field_h[var3][n.field_jb]) {
                      break L16;
                    } else {
                      wh.a(vj.field_c, 4, -114);
                      break L16;
                    }
                  }
                }
              }
            } else {
              if (((qe) this).field_L == 2) {
                n.field_jb = 0;
                ((qe) this).field_v = true;
                break L16;
              } else {
                L22: {
                  if (((qe) this).field_v) {
                    ((qe) this).field_v = false;
                    ((qe) this).field_p = ef.field_k;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (~(ef.field_k - ((qe) this).field_p) >= ~bb.field_k[i.field_r][var3]) {
                    break L23;
                  } else {
                    ((qe) this).field_eb = false;
                    break L23;
                  }
                }
                n.field_jb = 1;
                break L16;
              }
            }
          }
          if (!vd.field_b) {
            return;
          } else {
            L24: {
              vd.field_b = false;
              var4 = 4;
              if (null != id.field_d) {
                var5 = 0;
                L25: while (true) {
                  if (var5 >= var4) {
                    break L24;
                  } else {
                    var6 = 0;
                    L26: while (true) {
                      if (var6 >= 4) {
                        var5++;
                        continue L25;
                      } else {
                        id.field_d[var5][var6] = 0;
                        var6++;
                        continue L26;
                      }
                    }
                  }
                }
              } else {
                break L24;
              }
            }
            L27: {
              if (kc.field_w != null) {
                var5 = 0;
                L28: while (true) {
                  if (~var4 >= ~var5) {
                    break L27;
                  } else {
                    var8 = 0;
                    var6 = var8;
                    L29: while (true) {
                      if (var8 >= 3) {
                        var5++;
                        continue L28;
                      } else {
                        kc.field_w[var5][var8] = 0;
                        var8++;
                        continue L29;
                      }
                    }
                  }
                }
              } else {
                break L27;
              }
            }
            fa.field_t = -1;
            ul.field_m = 0;
            ec.field_b = -1;
            return;
          }
        } else {
          return;
        }
    }

    private final void h() {
        lc.field_r = false;
        ni.field_b = false;
        ((qe) this).field_D = 0;
        ql.field_n = 0;
        wb.field_p.field_Y = false;
        ra.field_q = false;
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        L0: {
          L1: {
            var4 = TorChallenge.field_F ? 1 : 0;
            if (param1 != 1) {
              if (2 != param1) {
                if (param1 == 7) {
                  L2: {
                    ((qe) this).x(96);
                    if (((qe) this).field_D <= 0) {
                      break L2;
                    } else {
                      if (((qe) this).field_L == 13) {
                        break L2;
                      } else {
                        ((qe) this).field_D = ((qe) this).field_D - 1;
                        break L2;
                      }
                    }
                  }
                  ((qe) this).field_Q = 64 * ((qe) this).field_a;
                  break L1;
                } else {
                  if (22 != param1) {
                    if (param1 != 3) {
                      if (param1 == 4) {
                        L3: {
                          ((qe) this).x(96);
                          if (((qe) this).field_V <= 0) {
                            break L3;
                          } else {
                            if (((qe) this).field_L != 2) {
                              break L3;
                            } else {
                              this.b(true);
                              ((qe) this).field_k = true;
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if (((qe) this).field_V > 1) {
                            ((qe) this).field_D = ((qe) this).field_D + 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (((qe) this).field_D > 200) {
                            ((qe) this).field_D = 0;
                            ((qe) this).field_ab = true;
                            this.b(true);
                            ((qe) this).field_k = true;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        if (((qe) this).field_a <= 0) {
                          ((qe) this).field_c = true;
                          break L0;
                        } else {
                          ((qe) this).field_N = true;
                          break L0;
                        }
                      } else {
                        if (param1 == 5) {
                          L6: {
                            if (0 == ((qe) this).field_V) {
                              ((qe) this).field_Q = 0;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          if (((qe) this).field_D > 0) {
                            L7: {
                              if (2 == ((qe) this).field_V) {
                                this.b(true);
                                ((qe) this).field_k = true;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            ((qe) this).field_fb = true;
                            ((qe) this).x(96);
                            if (0 < ((qe) this).field_a) {
                              ((qe) this).field_N = true;
                              break L0;
                            } else {
                              ((qe) this).field_c = true;
                              break L0;
                            }
                          } else {
                            L8: {
                              if (wb.field_p == null) {
                                break L8;
                              } else {
                                int discarded$1 = 1023;
                                if (!this.D()) {
                                  break L8;
                                } else {
                                  ((qe) this).field_D = 1;
                                  break L8;
                                }
                              }
                            }
                            if (0 >= ((qe) this).field_G) {
                              break L1;
                            } else {
                              ((qe) this).field_D = 1;
                              break L0;
                            }
                          }
                        } else {
                          if (param1 == 6) {
                            L9: {
                              if (((qe) this).field_db <= 0) {
                                break L9;
                              } else {
                                this.a((byte) -30, false);
                                break L9;
                              }
                            }
                            L10: {
                              ((qe) this).x(96);
                              if (((qe) this).field_a > 0) {
                                ((qe) this).field_N = true;
                                break L10;
                              } else {
                                ((qe) this).field_c = true;
                                break L10;
                              }
                            }
                            if (2 == ((qe) this).field_V) {
                              ((qe) this).field_G = 0;
                              break L0;
                            } else {
                              break L0;
                            }
                          } else {
                            break L0;
                          }
                        }
                      }
                    } else {
                      L11: {
                        ((qe) this).x(96);
                        if (((qe) this).field_a <= 0) {
                          ((qe) this).field_c = true;
                          break L11;
                        } else {
                          ((qe) this).field_N = true;
                          break L11;
                        }
                      }
                      L12: {
                        if (((qe) this).field_T) {
                          ((qe) this).field_j = true;
                          ((qe) this).field_N = false;
                          ((qe) this).field_c = false;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (((qe) this).field_T) {
                          break L13;
                        } else {
                          if (2 != ((qe) this).field_V) {
                            break L13;
                          } else {
                            L14: {
                              if (this.a((byte) -25, ((qe) this).field_a)) {
                                break L14;
                              } else {
                                if (((qe) this).field_k) {
                                  break L14;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            this.b(true);
                            ((qe) this).field_k = true;
                            ((qe) this).field_D = 0;
                            break L0;
                          }
                        }
                      }
                      L15: {
                        if (((qe) this).field_V > 0) {
                          L16: {
                            ((qe) this).field_D = ((qe) this).field_D + 1;
                            if (((qe) this).field_D > 37) {
                              ((qe) this).field_T = false;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          if (((qe) this).field_D <= 112) {
                            break L15;
                          } else {
                            if (wb.field_p.field_H > ((qe) this).field_H) {
                              L17: {
                                if (((qe) this).field_V > 1) {
                                  this.b(true);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((qe) this).field_t = true;
                              ((qe) this).field_j = true;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      L18: {
                        if (((qe) this).field_D <= 150) {
                          break L18;
                        } else {
                          if (!((qe) this).field_t) {
                            break L18;
                          } else {
                            ((qe) this).field_D = 0;
                            ((qe) this).field_t = false;
                            ((qe) this).field_ib = true;
                            break L0;
                          }
                        }
                      }
                      if (((qe) this).field_D > 150) {
                        ((qe) this).field_D = 0;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    ((qe) this).x(96);
                    break L0;
                  }
                }
              } else {
                L19: {
                  ((qe) this).x(96);
                  if (((qe) this).field_a > 0) {
                    ((qe) this).field_N = true;
                    break L19;
                  } else {
                    ((qe) this).field_c = true;
                    break L19;
                  }
                }
                L20: {
                  ((qe) this).field_D = ((qe) this).field_D + 1;
                  if (0 == ((qe) this).field_a) {
                    ((qe) this).field_a = 1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (((qe) this).field_S) {
                    ((qe) this).field_j = true;
                    ((qe) this).field_c = false;
                    ((qe) this).field_N = false;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (((qe) this).field_D <= 37) {
                    break L22;
                  } else {
                    ((qe) this).field_S = false;
                    break L22;
                  }
                }
                L23: {
                  if (((qe) this).field_D <= 150) {
                    break L23;
                  } else {
                    if (((qe) this).field_L == 0) {
                      ((qe) this).field_N = false;
                      ((qe) this).field_D = 0;
                      ((qe) this).field_c = false;
                      ((qe) this).field_ib = true;
                      ((qe) this).field_j = true;
                      if (((qe) this).field_V <= 1) {
                        break L1;
                      } else {
                        this.b(true);
                        ((qe) this).field_k = true;
                        break L0;
                      }
                    } else {
                      break L23;
                    }
                  }
                }
                if (112 >= ((qe) this).field_D) {
                  break L1;
                } else {
                  if (((qe) this).field_L == 0) {
                    ((qe) this).field_N = false;
                    ((qe) this).field_j = true;
                    ((qe) this).field_c = false;
                    if (((qe) this).field_V > 1) {
                      this.b(true);
                      ((qe) this).field_k = true;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              L24: {
                ((qe) this).x(96);
                if (((qe) this).field_V > 0) {
                  ((qe) this).field_D = ((qe) this).field_D + 1;
                  break L24;
                } else {
                  break L24;
                }
              }
              L25: {
                if (((qe) this).field_a <= 0) {
                  ((qe) this).field_c = true;
                  break L25;
                } else {
                  ((qe) this).field_N = true;
                  break L25;
                }
              }
              if (((qe) this).field_D <= 200) {
                break L0;
              } else {
                ((qe) this).field_D = 0;
                ((qe) this).field_ab = true;
                if (((qe) this).field_V <= 1) {
                  break L1;
                } else {
                  this.b(true);
                  ((qe) this).field_k = true;
                  break L0;
                }
              }
            }
          }
          break L0;
        }
    }

    final void a(ka param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          var27 = TorChallenge.field_F ? 1 : 0;
          var9_int = vj.field_c;
          if (((qe) this).field_a >= 0) {
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
          L2: {
            var10 = stackIn_3_0;
            if (1 == param7) {
              break L2;
            } else {
              if (param7 == 2) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (param3[0] >= 0) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L3;
            } else {
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L3;
            }
          }
          var10 = stackIn_9_0;
          break L1;
        }
        L4: {
          var11 = 0;
          var12 = 0;
          var13 = 0;
          var14 = i.field_r;
          var15 = n.field_jb;
          var16 = 7;
          if (param5 == -20861) {
            break L4;
          } else {
            ((qe) this).field_N = true;
            break L4;
          }
        }
        var17 = 0;
        var18 = 1;
        if (bd.field_l) {
          return;
        } else {
          L5: {
            if (param3 == null) {
              break L5;
            } else {
              L6: {
                if (2 == param7) {
                  break L6;
                } else {
                  if (param7 != 1) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (param3.length >= 2) {
                  var14 = param3[1];
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (4 <= param3.length) {
                  var16 = param3[3];
                  break L8;
                } else {
                  break L8;
                }
              }
              if (param3.length < 3) {
                break L5;
              } else {
                var15 = param3[2];
                break L5;
              }
            }
          }
          L9: {
            if (2 != var9_int) {
              if (~uf.field_o[var14][var9_int].length >= ~var15) {
                break L9;
              } else {
                if (null != uf.field_o[var14][var9_int][var15]) {
                  L10: {
                    L11: {
                      if (uf.field_o[var14][var9_int][var15].field_u > 0) {
                        break L11;
                      } else {
                        if (uf.field_o[var14][var9_int][var15].field_x <= 0) {
                          stackOut_36_0 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    stackOut_35_0 = 1;
                    stackIn_37_0 = stackOut_35_0;
                    break L10;
                  }
                  var17 = stackIn_37_0;
                  break L9;
                } else {
                  break L9;
                }
              }
            } else {
              break L9;
            }
          }
          if (null != c.field_c) {
            L12: {
              L13: {
                if (0 > var14) {
                  break L13;
                } else {
                  if (c.field_c.length <= var14) {
                    break L13;
                  } else {
                    break L12;
                  }
                }
              }
              var14 = 0;
              break L12;
            }
            L14: {
              if (c.field_c.length == 0) {
                break L14;
              } else {
                if (null == c.field_c[var14]) {
                  break L14;
                } else {
                  L15: {
                    L16: {
                      if (var9_int < 0) {
                        break L16;
                      } else {
                        if (c.field_c[var14].length <= var9_int) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var9_int = 0;
                    break L15;
                  }
                  L17: {
                    if (c.field_c[var14].length == 0) {
                      break L17;
                    } else {
                      if (null != c.field_c[var14][var9_int]) {
                        L18: {
                          L19: {
                            if (var15 < 0) {
                              break L19;
                            } else {
                              if (~var15 > ~c.field_c[var14][var9_int].length) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var15 = 0;
                          break L18;
                        }
                        L20: {
                          if (c.field_c[var14][var9_int].length == 0) {
                            break L20;
                          } else {
                            if (null == c.field_c[var14][var9_int]) {
                              break L20;
                            } else {
                              L21: {
                                if (var10 == 0) {
                                  break L21;
                                } else {
                                  if (9 == var14) {
                                    break L21;
                                  } else {
                                    if (10 == var14) {
                                      break L21;
                                    } else {
                                      L22: {
                                        oa.field_e.d();
                                        qg.b();
                                        c.field_c[var14][var9_int][var15].d(0, 0);
                                        if (var17 == 0) {
                                          break L22;
                                        } else {
                                          of.field_b.d();
                                          qg.b();
                                          uf.field_o[var14][var9_int][var15].d(0, 0);
                                          if (param7 != 2) {
                                            break L22;
                                          } else {
                                            oa.field_e.d();
                                            od.a(0, 0, 0, var16, 0, of.field_b);
                                            break L22;
                                          }
                                        }
                                      }
                                      la.field_f.a(param5 ^ 20762);
                                      break L21;
                                    }
                                  }
                                }
                              }
                              L23: {
                                L24: {
                                  param1 -= 32;
                                  var19 = 160;
                                  var20 = 160;
                                  if (param7 == 1) {
                                    break L24;
                                  } else {
                                    if (2 == param7) {
                                      break L24;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                var13 = dl.field_n[2];
                                var11 = dl.field_n[0];
                                break L23;
                              }
                              L25: {
                                L26: {
                                  L27: {
                                    param4 = -(-((qe) this).field_I + var20 >> 1);
                                    if (var14 == 9) {
                                      break L27;
                                    } else {
                                      if (var14 == 10) {
                                        break L27;
                                      } else {
                                        L28: {
                                          L29: {
                                            if (0 < ((qe) this).field_G) {
                                              break L29;
                                            } else {
                                              if (!ec.field_e) {
                                                break L28;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                          if (2 == param7) {
                                            break L28;
                                          } else {
                                            if (param7 != 1) {
                                              L30: {
                                                var21 = ((qe) this).field_G;
                                                if (ec.field_e) {
                                                  var21 = we.field_f;
                                                  break L30;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                              L31: {
                                                var22 = 50;
                                                if (ec.field_e) {
                                                  var22 = 200;
                                                  break L31;
                                                } else {
                                                  break L31;
                                                }
                                              }
                                              L32: {
                                                var23 = var22 >> 1;
                                                var24 = 0;
                                                var25 = 96;
                                                if (!ec.field_e) {
                                                  break L32;
                                                } else {
                                                  var25 = 32;
                                                  break L32;
                                                }
                                              }
                                              L33: {
                                                if (var22 >= var21) {
                                                  break L33;
                                                } else {
                                                  var21 = var22;
                                                  break L33;
                                                }
                                              }
                                              L34: {
                                                if (ec.field_e) {
                                                  var24 = var25 - -((-var21 + var22) * (256 + -var25) / var22);
                                                  break L34;
                                                } else {
                                                  if (var21 > var23) {
                                                    var24 = (var21 + -var22) * (256 - var25) / var23 + 256;
                                                    break L34;
                                                  } else {
                                                    var24 = var25 + (-var21 + var23) * (256 + -var25) / var23;
                                                    break L34;
                                                  }
                                                }
                                              }
                                              L35: {
                                                var26 = 16711680;
                                                if (ec.field_e) {
                                                  var26 = 16777215;
                                                  break L35;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                              L36: {
                                                qg.a(bf.field_l);
                                                lk.field_e.d();
                                                qg.b();
                                                if (var10 != 0) {
                                                  oa.field_e.d(0, 0, var20, var19);
                                                  break L36;
                                                } else {
                                                  c.field_c[var14][var9_int][var15].d(0, 0, var20, var19);
                                                  break L36;
                                                }
                                              }
                                              L37: {
                                                L38: {
                                                  la.field_f.a(-72);
                                                  var11 = param6 - -param4;
                                                  qg.b(bf.field_l);
                                                  var12 = var11 - -var20;
                                                  if (((qe) this).field_l > 0) {
                                                    break L38;
                                                  } else {
                                                    if (gl.field_k <= 0) {
                                                      break L38;
                                                    } else {
                                                      break L37;
                                                    }
                                                  }
                                                }
                                                L39: {
                                                  if (((qe) this).field_l > 0) {
                                                    break L39;
                                                  } else {
                                                    if (gl.field_k <= 0) {
                                                      break L39;
                                                    } else {
                                                      break L37;
                                                    }
                                                  }
                                                }
                                                L40: {
                                                  if (var11 <= 320) {
                                                    break L40;
                                                  } else {
                                                    if (~si.field_L[0] <= ~var11) {
                                                      var18 = 0;
                                                      break L40;
                                                    } else {
                                                      break L40;
                                                    }
                                                  }
                                                }
                                                if (var12 >= 320) {
                                                  break L37;
                                                } else {
                                                  if (~si.field_L[1] >= ~var12) {
                                                    var18 = 0;
                                                    break L37;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                              }
                                              L41: {
                                                if (var18 == 0) {
                                                  break L41;
                                                } else {
                                                  lk.field_e.a(param6 - -param4, param1, var24, var26);
                                                  break L41;
                                                }
                                              }
                                              L42: {
                                                if (((qe) this).field_l > 0) {
                                                  break L42;
                                                } else {
                                                  if (gl.field_k <= 0) {
                                                    break L42;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                              si.field_L[1] = var12;
                                              si.field_L[0] = var11;
                                              break L25;
                                            } else {
                                              break L28;
                                            }
                                          }
                                        }
                                        L43: {
                                          if (param0 != null) {
                                            break L43;
                                          } else {
                                            if (param7 != 2) {
                                              break L43;
                                            } else {
                                              if (var10 != 0) {
                                                od.a(var11, var13, 0, var16, 0, oa.field_e);
                                                break L25;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                        }
                                        L44: {
                                          if (param0 != null) {
                                            break L44;
                                          } else {
                                            if (2 != param7) {
                                              break L44;
                                            } else {
                                              L45: {
                                                od.a(var11, var13, 0, var16, 0, c.field_c[var14][var9_int][var15]);
                                                if (var17 != 0) {
                                                  od.a(var11, var13, 0, var16, 0, uf.field_o[var14][var9_int][var15]);
                                                  break L45;
                                                } else {
                                                  break L45;
                                                }
                                              }
                                              if (var9_int == 2) {
                                                this.a(var13, aa.field_g, -72, false, var11, df.field_R);
                                                break L25;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                        }
                                        L46: {
                                          if (param0 == null) {
                                            break L46;
                                          } else {
                                            if (1 != param7) {
                                              break L46;
                                            } else {
                                              if (var10 != 0) {
                                                param0.d();
                                                qg.b();
                                                oa.field_e.a(var11, var13, param3[3]);
                                                break L25;
                                              } else {
                                                break L46;
                                              }
                                            }
                                          }
                                        }
                                        L47: {
                                          if (param0 == null) {
                                            break L47;
                                          } else {
                                            if (1 == param7) {
                                              param0.d();
                                              qg.b();
                                              c.field_c[var14][var9_int][var15].a(var11, var13, var16);
                                              break L25;
                                            } else {
                                              break L47;
                                            }
                                          }
                                        }
                                        L48: {
                                          if (param0 == null) {
                                            break L48;
                                          } else {
                                            if (var10 == 0) {
                                              break L48;
                                            } else {
                                              L49: {
                                                param0.d();
                                                qg.b();
                                                oa.field_e.d(var11, param1, var20, var19);
                                                if (var17 != 0) {
                                                  od.a(param6 + param4, param1, 0, var16, 0, of.field_b);
                                                  break L49;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                              if (var9_int != 2) {
                                                break L26;
                                              } else {
                                                this.a(param1, aa.field_g, -118, true, param6 - -param4, df.field_R);
                                                break L25;
                                              }
                                            }
                                          }
                                        }
                                        if (var10 == 0) {
                                          if (param0 != null) {
                                            L50: {
                                              param0.d();
                                              qg.b();
                                              c.field_c[var14][var9_int][var15].d(param4 + param6, param1, var20, var19);
                                              if (var17 != 0) {
                                                od.a(param4 + param6, param1, 0, var16, 0, uf.field_o[var14][var9_int][var15]);
                                                break L50;
                                              } else {
                                                break L50;
                                              }
                                            }
                                            if (var9_int == 2) {
                                              this.a(param1, aa.field_g, param5 ^ 20793, true, param4 + param6, df.field_R);
                                              break L25;
                                            } else {
                                              break L25;
                                            }
                                          } else {
                                            L51: {
                                              L52: {
                                                var11 = param4 + param6;
                                                var12 = var11 + var20;
                                                if (((qe) this).field_l > 0) {
                                                  break L52;
                                                } else {
                                                  if (gl.field_k > 0) {
                                                    break L51;
                                                  } else {
                                                    break L52;
                                                  }
                                                }
                                              }
                                              if (bc.field_o == 3) {
                                                break L51;
                                              } else {
                                                L53: {
                                                  if (var11 <= 320) {
                                                    break L53;
                                                  } else {
                                                    if (~si.field_L[0] <= ~var11) {
                                                      var18 = 0;
                                                      break L53;
                                                    } else {
                                                      break L53;
                                                    }
                                                  }
                                                }
                                                if (var12 >= 320) {
                                                  break L51;
                                                } else {
                                                  if (~var12 > ~si.field_L[1]) {
                                                    break L51;
                                                  } else {
                                                    var18 = 0;
                                                    break L51;
                                                  }
                                                }
                                              }
                                            }
                                            L54: {
                                              if (var18 == 0) {
                                                break L54;
                                              } else {
                                                c.field_c[var14][var9_int][var15].d(param6 - -param4, param1, var20, var19);
                                                break L54;
                                              }
                                            }
                                            L55: {
                                              L56: {
                                                if (0 < ((qe) this).field_l) {
                                                  break L56;
                                                } else {
                                                  if (gl.field_k > 0) {
                                                    break L55;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                              }
                                              si.field_L[1] = var12;
                                              si.field_L[0] = var11;
                                              break L55;
                                            }
                                            L57: {
                                              if (var17 == 0) {
                                                break L57;
                                              } else {
                                                od.a(param4 + param6, param1, 0, var16, 0, uf.field_o[var14][var9_int][var15]);
                                                break L57;
                                              }
                                            }
                                            if (var9_int != 2) {
                                              break L26;
                                            } else {
                                              this.a(param1, aa.field_g, -85, true, param4 + param6, df.field_R);
                                              break L25;
                                            }
                                          }
                                        } else {
                                          L58: {
                                            L59: {
                                              var11 = param6 - -param4;
                                              var12 = var11 + var20;
                                              if (((qe) this).field_l > 0) {
                                                break L59;
                                              } else {
                                                if (0 < gl.field_k) {
                                                  break L58;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                            }
                                            if (bc.field_o != 3) {
                                              L60: {
                                                if (var11 <= 320) {
                                                  break L60;
                                                } else {
                                                  if (~si.field_L[0] > ~var11) {
                                                    break L60;
                                                  } else {
                                                    var18 = 0;
                                                    break L60;
                                                  }
                                                }
                                              }
                                              if (var12 >= 320) {
                                                break L58;
                                              } else {
                                                if (si.field_L[1] <= var12) {
                                                  var18 = 0;
                                                  break L58;
                                                } else {
                                                  break L58;
                                                }
                                              }
                                            } else {
                                              break L58;
                                            }
                                          }
                                          L61: {
                                            if (var18 != 0) {
                                              oa.field_e.d(param4 + param6, param1, var20, var19);
                                              break L61;
                                            } else {
                                              break L61;
                                            }
                                          }
                                          L62: {
                                            L63: {
                                              if (((qe) this).field_l > 0) {
                                                break L63;
                                              } else {
                                                if (gl.field_k <= 0) {
                                                  break L63;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                            }
                                            si.field_L[0] = var11;
                                            si.field_L[1] = var12;
                                            break L62;
                                          }
                                          L64: {
                                            if (var17 == 0) {
                                              break L64;
                                            } else {
                                              od.a(param4 + param6, param1, 0, var16, 0, of.field_b);
                                              break L64;
                                            }
                                          }
                                          if (var9_int != 2) {
                                            break L26;
                                          } else {
                                            this.a(param1, aa.field_g, -126, true, param6 - -param4, df.field_R);
                                            break L25;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L65: {
                                    if (50 > ((qe) this).field_D) {
                                      if (((qe) this).field_D >= 0) {
                                        var16 = (12750 - 255 * ((qe) this).field_D) / 50;
                                        break L65;
                                      } else {
                                        var16 = 255;
                                        break L65;
                                      }
                                    } else {
                                      var16 = 0;
                                      break L65;
                                    }
                                  }
                                  L66: {
                                    if (var14 == 10) {
                                      var16 = 255 - var16;
                                      break L66;
                                    } else {
                                      break L66;
                                    }
                                  }
                                  c.field_c[var14][var9_int][var15].d(param4 + param6, param1, var16);
                                  break L26;
                                }
                                break L25;
                              }
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        break L17;
                      }
                    }
                  }
                  return;
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final void a(boolean param0) {
        ((qe) this).field_fb = true;
        ((qe) this).field_gb = true;
        ((qe) this).field_jb = false;
        ((qe) this).field_mb = true;
    }

    private final int b(byte param0, boolean param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        var11 = gl.field_c;
        var3 = var11;
        var7 = ((qe) this).field_e;
        var8 = var7 + ((qe) this).field_I;
        var9 = 0;
        L0: while (true) {
          if (var9 >= 2) {
            return -1;
          } else {
            L1: {
              var4 = 32 * var11[var9][0];
              var5 = 32 * var11[var9][1] - -32;
              if (param1) {
                L2: {
                  var6 = -var4 + var5;
                  if (0 == var9) {
                    var5 = var5 - (-8 + -((qe) this).field_I + var6);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (var9 != 1) {
                  break L1;
                } else {
                  var4 = var4 + (var6 + (-((qe) this).field_I + -8));
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (var4 <= var7) {
              if (var8 <= var5) {
                return var9;
              } else {
                var9++;
                continue L0;
              }
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    private final void E() {
        int[] var2 = null;
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
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
        int var18 = 0;
        int[] var19 = null;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_125_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_123_0 = 0;
        L0: {
          var18 = TorChallenge.field_F ? 1 : 0;
          var19 = bj.field_d;
          var2 = var19;
          var3 = dd.field_q;
          var8 = v.field_S[fh.field_e];
          var9 = r.field_a[fh.field_e];
          if (var9 > fc.field_o) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var10 = stackIn_3_0;
        this.g((byte) 104);
        if (((qe) this).field_L == 13) {
          this.F(87);
          return;
        } else {
          L1: {
            if (((qe) this).field_G > 0) {
              ((qe) this).field_G = ((qe) this).field_G - 1;
              if (this.w(-89)) {
                break L1;
              } else {
                if (!wh.field_b) {
                  L2: {
                    ((qe) this).field_ib = false;
                    ((qe) this).field_L = 0;
                    var11 = -((qe) this).field_e + wb.field_p.field_e;
                    if (var11 < 0) {
                      stackOut_13_0 = -1;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  L3: {
                    var12 = stackIn_14_0;
                    if (var12 * var11 <= 1024) {
                      break L3;
                    } else {
                      var11 = -(var11 * var12) + 2048;
                      var12 = -var12;
                      break L3;
                    }
                  }
                  ((qe) this).field_h = -((qe) this).field_M;
                  wh.field_b = true;
                  ((qe) this).field_Q = ((qe) this).field_K * -var12;
                  kf.field_d = 3;
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          if (kf.field_d == 0) {
            L4: {
              ((qe) this).field_ib = false;
              this.a(true);
              if (this.j((byte) 58)) {
                this.m(-30719);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (((qe) this).field_a != 0) {
                break L5;
              } else {
                ((qe) this).field_a = 1;
                break L5;
              }
            }
            L6: {
              var4 = 1;
              var5 = 0;
              this.g(((qe) this).field_a, 85);
              if (this.a(var4 != 0, (byte) -127, var5 != 0)) {
                ((qe) this).field_a = -((qe) this).field_a;
                ((qe) this).field_Q = 0;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (this.w(-119)) {
                kf.field_d = 1;
                break L7;
              } else {
                break L7;
              }
            }
            return;
          } else {
            L8: {
              if (kf.field_d == 1) {
                this.a(true);
                ((qe) this).field_L = 2;
                ((qe) this).field_ib = false;
                var7 = 0;
                this.a(true, var7 != 0);
                if (((qe) this).field_L != 0) {
                  break L8;
                } else {
                  L9: {
                    ((qe) this).field_ib = false;
                    kf.field_d = 2;
                    kf.field_d = lg.b((byte) 84, ((qe) this).field_H);
                    if (kf.field_d < 0) {
                      kf.field_d = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                if (kf.field_d != 2) {
                  L10: {
                    if (3 == kf.field_d) {
                      L11: {
                        this.a(true);
                        ((qe) this).field_ib = false;
                        if (wh.field_b) {
                          break L11;
                        } else {
                          this.g(((qe) this).field_a, 113);
                          break L11;
                        }
                      }
                      L12: {
                        var7 = 0;
                        ((qe) this).field_L = 2;
                        this.a(true, var7 != 0);
                        if (0 == ((qe) this).field_L) {
                          wh.field_b = false;
                          ((qe) this).field_ib = false;
                          kf.field_d = 4;
                          kf.field_d = lg.b((byte) 84, ((qe) this).field_H);
                          if (0 <= kf.field_d) {
                            break L12;
                          } else {
                            kf.field_d = 0;
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                      var4 = 1;
                      var5 = 0;
                      if (this.a(var4 != 0, (byte) -127, var5 == 0)) {
                        break L10;
                      } else {
                        L13: {
                          if (!wh.field_b) {
                            ((qe) this).field_Q = 0;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        return;
                      }
                    } else {
                      L14: {
                        if (kf.field_d != 4) {
                          L15: {
                            if (kf.field_d == 5) {
                              L16: {
                                this.a(true);
                                var5 = 0;
                                var4 = 1;
                                this.g(((qe) this).field_a, 79);
                                if (this.a(var4 != 0, (byte) -127, var5 == 0)) {
                                  break L16;
                                } else {
                                  if (var10 != 0) {
                                    break L16;
                                  } else {
                                    kf.field_d = 1;
                                    ((qe) this).field_Q = 0;
                                    td.field_e = 0;
                                    int discarded$16 = -1;
                                    this.h();
                                    return;
                                  }
                                }
                              }
                              ((qe) this).field_L = 2;
                              var7 = 0;
                              this.a(true, var7 != 0);
                              if (((qe) this).field_L != 0) {
                                ((qe) this).field_L = 10;
                                this.a(false, 83);
                                break L15;
                              } else {
                                var11 = this.h(-26698);
                                if (var11 < 0) {
                                  L17: {
                                    kf.field_d = lg.b((byte) 84, ((qe) this).field_H);
                                    if (kf.field_d >= 0) {
                                      break L17;
                                    } else {
                                      kf.field_d = 0;
                                      break L17;
                                    }
                                  }
                                  int discarded$17 = -1;
                                  this.h();
                                  ((qe) this).field_ib = false;
                                  return;
                                } else {
                                  kf.field_d = 4;
                                  ((qe) this).field_ib = false;
                                  if (var10 == 0) {
                                    break L14;
                                  } else {
                                    L18: {
                                      int discarded$18 = -16517;
                                      if (!this.J()) {
                                        break L18;
                                      } else {
                                        int discarded$19 = 32;
                                        if (this.t()) {
                                          ((qe) this).field_h = -((qe) this).field_M;
                                          kf.field_d = 5;
                                          ((qe) this).field_Q = ((qe) this).field_K * ((qe) this).field_a;
                                          int discarded$20 = -1;
                                          this.h();
                                          ((qe) this).field_kb = 0;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                            } else {
                              break L15;
                            }
                          }
                          return;
                        } else {
                          this.a(true);
                          ((qe) this).field_mb = false;
                          if (this.w(39)) {
                            kf.field_d = 1;
                            int discarded$21 = -1;
                            this.h();
                            td.field_e = 0;
                            return;
                          } else {
                            L19: {
                              kf.field_d = lg.b((byte) 84, ((qe) this).field_H);
                              if (kf.field_d >= 0) {
                                break L19;
                              } else {
                                kf.field_d = 0;
                                break L19;
                              }
                            }
                            if (kf.field_d != 4) {
                              td.field_e = 0;
                              int discarded$22 = -1;
                              this.h();
                              return;
                            } else {
                              L20: {
                                this.g(((qe) this).field_a, 98);
                                var5 = 0;
                                var4 = 0;
                                if (this.a(var4 != 0, (byte) -127, var5 != 0)) {
                                  L21: {
                                    var11 = this.h(-26698);
                                    if (var11 < 0) {
                                      if (this.w(17)) {
                                        td.field_e = 0;
                                        kf.field_d = 1;
                                        if (kf.field_d == 4) {
                                          break L10;
                                        } else {
                                          int discarded$23 = -1;
                                          this.h();
                                          return;
                                        }
                                      } else {
                                        L22: {
                                          kf.field_d = lg.b((byte) 84, ((qe) this).field_H);
                                          if (0 <= kf.field_d) {
                                            break L22;
                                          } else {
                                            kf.field_d = 0;
                                            break L22;
                                          }
                                        }
                                        if (kf.field_d == 4) {
                                          break L21;
                                        } else {
                                          int discarded$24 = -1;
                                          this.h();
                                          return;
                                        }
                                      }
                                    } else {
                                      L23: {
                                        L24: {
                                          var12 = 32 * var3[var11][0];
                                          var13 = var3[var11][1] * 32;
                                          var14 = var13 + var12 >> 1;
                                          var15 = (((qe) this).field_I >> 1) + ((qe) this).field_e;
                                          if (var11 != 0) {
                                            break L24;
                                          } else {
                                            if (var15 <= var14) {
                                              break L23;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                        L25: {
                                          if (var11 != 1) {
                                            break L25;
                                          } else {
                                            if (~var15 > ~var14) {
                                              break L25;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        L26: {
                                          L27: {
                                            if (var11 != 0) {
                                              break L27;
                                            } else {
                                              if (~var14 >= ~var15) {
                                                break L26;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                          if (var11 != 1) {
                                            break L20;
                                          } else {
                                            if (~var15 < ~var14) {
                                              break L20;
                                            } else {
                                              break L26;
                                            }
                                          }
                                        }
                                        L28: {
                                          if (2 <= td.field_e) {
                                            stackOut_111_0 = 0;
                                            stackIn_112_0 = stackOut_111_0;
                                            break L28;
                                          } else {
                                            stackOut_110_0 = 1;
                                            stackIn_112_0 = stackOut_110_0;
                                            break L28;
                                          }
                                        }
                                        L29: {
                                          var16 = stackIn_112_0;
                                          if (var16 != 0) {
                                            break L29;
                                          } else {
                                            if (var10 != 0) {
                                              L30: {
                                                L31: {
                                                  var17 = var19[0];
                                                  if (wb.field_p.field_H != var17) {
                                                    break L31;
                                                  } else {
                                                    if (var8 <= wb.field_p.field_o) {
                                                      break L31;
                                                    } else {
                                                      if (var11 == 0) {
                                                        break L30;
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (~wb.field_p.field_o >= ~var8) {
                                                  break L29;
                                                } else {
                                                  if (1 == var11) {
                                                    break L30;
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                              }
                                              L32: {
                                                if (var16 != 0) {
                                                  stackOut_124_0 = 0;
                                                  stackIn_125_0 = stackOut_124_0;
                                                  break L32;
                                                } else {
                                                  stackOut_123_0 = 1;
                                                  stackIn_125_0 = stackOut_123_0;
                                                  break L32;
                                                }
                                              }
                                              var16 = stackIn_125_0;
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                        }
                                        L33: {
                                          if (var16 != 0) {
                                            ((qe) this).field_h = ((qe) this).field_h - ((qe) this).field_M;
                                            kf.field_d = 5;
                                            ((qe) this).field_Q = ((qe) this).field_a * ((qe) this).field_K;
                                            td.field_e = td.field_e + 1;
                                            ((qe) this).field_kb = 0;
                                            break L33;
                                          } else {
                                            break L33;
                                          }
                                        }
                                        L34: {
                                          if (kf.field_d != 4) {
                                            int discarded$25 = -1;
                                            this.h();
                                            break L34;
                                          } else {
                                            break L34;
                                          }
                                        }
                                        return;
                                      }
                                      L35: {
                                        if (var10 != 0) {
                                          L36: {
                                            L37: {
                                              int discarded$26 = -16517;
                                              if (!this.J()) {
                                                break L37;
                                              } else {
                                                int discarded$27 = 32;
                                                if (this.t()) {
                                                  ((qe) this).field_Q = ((qe) this).field_a * ((qe) this).field_K;
                                                  kf.field_d = 5;
                                                  ((qe) this).field_kb = 0;
                                                  break L36;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                            }
                                            kf.field_d = 3;
                                            break L36;
                                          }
                                          ((qe) this).field_h = ((qe) this).field_h - ((qe) this).field_M;
                                          break L35;
                                        } else {
                                          ((qe) this).field_a = -((qe) this).field_a;
                                          ((qe) this).field_Q = 0;
                                          break L35;
                                        }
                                      }
                                      if (kf.field_d == 4) {
                                        break L21;
                                      } else {
                                        int discarded$28 = -1;
                                        this.h();
                                        return;
                                      }
                                    }
                                  }
                                  return;
                                } else {
                                  break L20;
                                }
                              }
                              L38: {
                                int discarded$29 = -16517;
                                if (!this.J()) {
                                  break L38;
                                } else {
                                  this.m(-30719);
                                  break L38;
                                }
                              }
                              if (kf.field_d == 4) {
                                break L14;
                              } else {
                                int discarded$30 = -1;
                                this.h();
                                return;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                  return;
                } else {
                  L39: {
                    this.a(true);
                    ((qe) this).field_mb = false;
                    kf.field_d = lg.b((byte) 84, ((qe) this).field_H);
                    if (kf.field_d < 0) {
                      kf.field_d = 0;
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                  L40: {
                    if (!this.w(80)) {
                      break L40;
                    } else {
                      kf.field_d = 1;
                      break L40;
                    }
                  }
                  L41: {
                    var4 = 0;
                    this.g(((qe) this).field_a, 76);
                    var5 = 0;
                    if (this.a(var4 != 0, (byte) -127, var5 == 0)) {
                      break L41;
                    } else {
                      kf.field_d = 3;
                      ((qe) this).field_h = -((qe) this).field_M;
                      ((qe) this).field_Q = 0;
                      break L41;
                    }
                  }
                  L42: {
                    L43: {
                      var11 = lg.b((byte) 84, wb.field_p.field_H);
                      if (this.j((byte) 112)) {
                        break L43;
                      } else {
                        if (var11 < 0) {
                          break L43;
                        } else {
                          if (var11 == 2) {
                            break L43;
                          } else {
                            break L42;
                          }
                        }
                      }
                    }
                    this.m(-30719);
                    break L42;
                  }
                  if (2 == kf.field_d) {
                    break L8;
                  } else {
                    int discarded$31 = -1;
                    this.h();
                    return;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void f(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        L0: {
          var6 = TorChallenge.field_F ? 1 : 0;
          if (1 != fh.field_e) {
            break L0;
          } else {
            L1: {
              var2 = this.b((byte) 109, false);
              int discarded$1 = this.b(false, -1);
              var3 = -1;
              var4 = this.c(1) ? 1 : 0;
              var5 = 0;
              if (var2 < 0) {
                break L1;
              } else {
                var3 = this.c(false, var2);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((qe) this).field_Q < 0) {
                  break L3;
                } else {
                  if (-((qe) this).field_C + ((qe) this).field_K <= ((qe) this).field_Q) {
                    break L3;
                  } else {
                    ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_C;
                    break L2;
                  }
                }
              }
              L4: {
                if (((qe) this).field_Q < 0) {
                  break L4;
                } else {
                  if (((qe) this).field_K - ((qe) this).field_C >= ((qe) this).field_Q) {
                    break L4;
                  } else {
                    if (((qe) this).field_Q < ((qe) this).field_K) {
                      ((qe) this).field_Q = ((qe) this).field_Q + 1;
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (((qe) this).field_Q < 0) {
                if (-((qe) this).field_Q < -((qe) this).field_C + ((qe) this).field_K) {
                  ((qe) this).field_Q = ((qe) this).field_Q - ((qe) this).field_C;
                  break L2;
                } else {
                  if (((qe) this).field_Q >= 0) {
                    break L2;
                  } else {
                    if (-((qe) this).field_C + ((qe) this).field_K >= -((qe) this).field_Q) {
                      break L2;
                    } else {
                      if (-((qe) this).field_Q >= ((qe) this).field_K) {
                        break L2;
                      } else {
                        ((qe) this).field_Q = ((qe) this).field_Q - 1;
                        break L2;
                      }
                    }
                  }
                }
              } else {
                if (((qe) this).field_Q >= 0) {
                  break L2;
                } else {
                  if (-((qe) this).field_C + ((qe) this).field_K >= -((qe) this).field_Q) {
                    break L2;
                  } else {
                    if (-((qe) this).field_Q >= ((qe) this).field_K) {
                      break L2;
                    } else {
                      ((qe) this).field_Q = ((qe) this).field_Q - 1;
                      break L2;
                    }
                  }
                }
              }
            }
            L5: {
              if (var3 < 0) {
                break L5;
              } else {
                L6: {
                  if (var4 == 0) {
                    var5 = -1;
                    break L6;
                  } else {
                    var5 = 1;
                    break L6;
                  }
                }
                L7: {
                  if (0 >= var5) {
                    break L7;
                  } else {
                    if (2 == var3) {
                      break L7;
                    } else {
                      L8: {
                        if (ql.field_j) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          break L8;
                        } else {
                          stackOut_30_0 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          break L8;
                        }
                      }
                      ql.field_j = stackIn_32_0 != 0;
                      break L7;
                    }
                  }
                }
                if (var5 >= 0) {
                  break L5;
                } else {
                  if (var3 == 0) {
                    break L5;
                  } else {
                    L9: {
                      if (ql.field_j) {
                        stackOut_37_0 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        break L9;
                      } else {
                        stackOut_36_0 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        break L9;
                      }
                    }
                    ql.field_j = stackIn_38_0 != 0;
                    break L5;
                  }
                }
              }
            }
            if (var5 * ((qe) this).field_h >= -((qe) this).field_C + ((qe) this).field_M) {
              if (((qe) this).field_M - ((qe) this).field_C >= var5 * ((qe) this).field_h) {
                break L0;
              } else {
                if (((qe) this).field_M <= var5 * ((qe) this).field_h) {
                  break L0;
                } else {
                  ((qe) this).field_h = ((qe) this).field_h + var5 * 2;
                  break L0;
                }
              }
            } else {
              ((qe) this).field_h = ((qe) this).field_h + var5 * ((qe) this).field_C;
              break L0;
            }
          }
        }
        L10: {
          var2 = 0;
          var3 = 0;
          if (fh.field_e == 2) {
            ((qe) this).field_mb = true;
            var3 = 1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (this.a(var2 != 0, (byte) -127, var3 == 0)) {
            break L11;
          } else {
            ((qe) this).field_Q = 0;
            break L11;
          }
        }
        var5 = 1;
        this.a(true, var5 != 0);
    }

    private final int f(int param0, int param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[][] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_12_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var3 = 1;
        var4 = fk.field_s[1];
        var5 = 16;
        var6 = var4[0] * 64 - -var5;
        var7 = 64 + 64 * var4[1];
        var8 = var6 - -var7 >> 1;
        var10 = pg.field_n;
        var12 = ((qe) this).field_z;
        var13 = var10[0][1] * 64 + 64;
        var14 = wb.field_p.field_z;
        var15 = -((qe) this).field_w + var14;
        var16 = var15 + var14 >> 1;
        if (param1 != 0) {
          if (1 != param1) {
            return 1;
          } else {
            if (var12 <= var13) {
              var3 = 1;
              return var3;
            } else {
              if (ql.field_j) {
                L0: {
                  if (var8 < var16) {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  } else {
                    stackOut_27_0 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    break L0;
                  }
                }
                var9 = stackIn_29_0;
                if (var9 != 0) {
                  var3 = -1;
                  return var3;
                } else {
                  var3 = 1;
                  return var3;
                }
              } else {
                var11 = 64 * (1 + var10[1][1]);
                if (var11 > var12) {
                  L1: {
                    var3 = 1;
                    if (ql.field_j) {
                      var3 = -var3;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return var3;
                } else {
                  L2: {
                    var3 = -1;
                    if (!ql.field_j) {
                      break L2;
                    } else {
                      var3 = -var3;
                      break L2;
                    }
                  }
                  return var3;
                }
              }
            }
          }
        } else {
          if (var13 > var12) {
            var3 = 1;
            return var3;
          } else {
            if (ql.field_j) {
              var11 = 64 * (var10[1][1] + 1);
              if (var12 >= var11) {
                var3 = -1;
                return var3;
              } else {
                var3 = 1;
                return var3;
              }
            } else {
              L3: {
                if (var16 > var8) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              var9 = stackIn_12_0;
              if (var9 != 0) {
                L4: {
                  var3 = -1;
                  if (ql.field_j) {
                    var3 = -var3;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return var3;
              } else {
                L5: {
                  var3 = 1;
                  if (!ql.field_j) {
                    break L5;
                  } else {
                    var3 = -var3;
                    break L5;
                  }
                }
                return var3;
              }
            }
          }
        }
    }

    private final void e(int param0) {
        L0: {
          if (((qe) this).field_B < 256) {
            if (((qe) this).field_B < 0) {
              ((qe) this).field_o = ((qe) this).field_o - 1;
              ((qe) this).field_B = ((qe) this).field_B + 256;
              if (((qe) this).field_o < 0) {
                ((qe) this).field_o = ((qe) this).field_o + 64;
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          } else {
            ((qe) this).field_B = ((qe) this).field_B - 256;
            ((qe) this).field_o = ((qe) this).field_o + 1;
            if (64 <= ((qe) this).field_o) {
              ((qe) this).field_o = ((qe) this).field_o - 64;
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    private final boolean s() {
        Object var2 = null;
        qe var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
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
        var17 = TorChallenge.field_F ? 1 : 0;
        var2 = this;
        var3 = wb.field_p;
        if (var2 != null) {
          if (var3 != null) {
            var4 = ((qe) this).field_e + ((qe) var2).field_I / 2;
            var5 = -(((qe) var2).field_w / 2) + ((qe) this).field_z;
            var6 = ef.field_i[((qe) this).field_L][fh.field_e];
            var8 = 0;
            L0: while (true) {
              if (var8 > 1) {
                return false;
              } else {
                L1: {
                  var7 = lh.field_r[fh.field_e][var6][((qe) this).field_kb][var8];
                  var9 = var7[0] + var4;
                  var10 = var5 - -var7[1];
                  var11 = var7[2];
                  var12 = var7[3];
                  if (0 <= ((qe) var2).field_a) {
                    break L1;
                  } else {
                    var9 = -var11 + (-var9 + var4 * 2);
                    break L1;
                  }
                }
                L2: {
                  var13 = var3.field_e;
                  if (var13 + -var9 <= 1024) {
                    break L2;
                  } else {
                    var13 -= 2048;
                    break L2;
                  }
                }
                L3: {
                  if (-var9 + var13 < -1024) {
                    var13 += 2048;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var14 = var3.field_z + -var3.field_w;
                var15 = var3.field_I;
                var16 = var3.field_w;
                if (!o.a(var16, var10, var15, var11, var12, var13, var9, (byte) 9, var14)) {
                  var8++;
                  continue L0;
                } else {
                  return true;
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void d() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_95_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          var2 = 5;
          if (8 > ((qe) this).field_F) {
            break L0;
          } else {
            if (((qe) this).field_F < 21) {
              L1: {
                ((qe) this).field_gb = false;
                if (((qe) this).field_f != -1) {
                  ((qe) this).field_fb = false;
                  break L1;
                } else {
                  ((qe) this).field_fb = true;
                  break L1;
                }
              }
              L2: {
                ((qe) this).field_mb = true;
                ((qe) this).field_Q = ((qe) this).field_Q / 2;
                ((qe) this).x(96);
                ((qe) this).field_jb = false;
                if (((qe) this).field_F != 12) {
                  break L2;
                } else {
                  if (o.field_l != 0) {
                    break L2;
                  } else {
                    if (((qe) this).field_f != -1) {
                      this.i(false);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (((qe) this).field_F != 13) {
                break L0;
              } else {
                if (o.field_l == 0) {
                  this.i(false);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
        }
        L3: {
          if (((qe) this).field_L == 14) {
            break L3;
          } else {
            if (!((qe) this).field_Z) {
              break L3;
            } else {
              if (null == wb.field_p) {
                break L3;
              } else {
                if (0 >= wb.field_p.field_db) {
                  break L3;
                } else {
                  if (0 > ((qe) this).field_h) {
                    break L3;
                  } else {
                    L4: {
                      if (13 != ((qe) this).field_F) {
                        break L4;
                      } else {
                        if (db.field_B >= 10) {
                          return;
                        } else {
                          break L4;
                        }
                      }
                    }
                    int discarded$2 = -16;
                    if (!this.A()) {
                      break L3;
                    } else {
                      L5: {
                        ((qe) this).field_L = 14;
                        int discarded$3 = -17;
                        this.f();
                        if (18 != ((qe) this).field_F) {
                          if (((qe) this).field_F != 14) {
                            if (12 == ((qe) this).field_F) {
                              if (o.field_l > 0) {
                                ((qe) this).field_L = 0;
                                break L5;
                              } else {
                                df.field_O = true;
                                ii.field_k = (qe) this;
                                ug.field_o = 2;
                                db.field_B = 0;
                                o.field_l = 500;
                                break L5;
                              }
                            } else {
                              if (((qe) this).field_F == 13) {
                                if (o.field_l > 0) {
                                  db.field_B = db.field_B + 1;
                                  if (db.field_B >= 10) {
                                    L6: {
                                      if (gl.field_k < 9) {
                                        gl.field_k = gl.field_k + 1;
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    o.field_l = 0;
                                    ii.field_k.field_f = -1;
                                    if (ab.field_d < 6) {
                                      ab.field_d = ab.field_d + 1;
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  ((qe) this).field_L = 0;
                                  break L5;
                                }
                              } else {
                                if (15 != ((qe) this).field_F) {
                                  if (((qe) this).field_F != 20) {
                                    if (((qe) this).field_F == 19) {
                                      ((qe) this).field_L = 0;
                                      rj.field_d = vb.a(ea.field_e, (byte) 109, ((qe) this).field_hb);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    ij.field_z = true;
                                    ((qe) this).field_L = 0;
                                    var3 = 0;
                                    var4 = 0;
                                    L7: while (true) {
                                      if (var4 >= var2) {
                                        L8: {
                                          if (var3 >= 3) {
                                            rj.field_d = lj.field_k;
                                            eb.field_n = true;
                                            break L8;
                                          } else {
                                            rj.field_d = uf.field_p;
                                            break L8;
                                          }
                                        }
                                        L9: {
                                          if (wb.field_p == null) {
                                            break L9;
                                          } else {
                                            if (!wb.field_p.field_n) {
                                              break L9;
                                            } else {
                                              if (!eb.field_n) {
                                                break L9;
                                              } else {
                                                if (wb.field_p.field_L != 0) {
                                                  break L9;
                                                } else {
                                                  L10: {
                                                    if (!cl.field_z) {
                                                      break L10;
                                                    } else {
                                                      L11: {
                                                        if (2 != vj.field_c) {
                                                          wb.field_p.field_w = 96;
                                                          break L11;
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                      cl.field_z = false;
                                                      break L10;
                                                    }
                                                  }
                                                  wb.field_p.field_L = 18;
                                                  wb.field_p.field_D = 0;
                                                  break L9;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        break L5;
                                      } else {
                                        L12: {
                                          if (0 < (vi.field_a & 1 << var4)) {
                                            var3++;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        var4++;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (((qe) this).field_nb) {
                                      var3 = -1;
                                      var4 = 0;
                                      L14: while (true) {
                                        if (var4 >= 5) {
                                          L15: {
                                            if (var3 < 0) {
                                              break L15;
                                            } else {
                                              vi.field_a = vi.field_a | 1 << var3;
                                              mh.field_d[var3] = ((qe) this).field_y;
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            ((qe) this).field_nb = false;
                                            hd.field_d = hd.field_d + 1;
                                            var4 = jj.a(255);
                                            wb.field_p.field_d = 3 + var4 / var2;
                                            if (!jj.field_d) {
                                              jj.field_d = true;
                                              break L16;
                                            } else {
                                              gh.field_m = true;
                                              break L16;
                                            }
                                          }
                                          ((qe) this).field_D = 0;
                                          break L13;
                                        } else {
                                          L17: {
                                            if (bl.field_O[1][var4] != ((qe) this).field_y) {
                                              break L17;
                                            } else {
                                              var3 = var4;
                                              break L17;
                                            }
                                          }
                                          var4++;
                                          continue L14;
                                        }
                                      }
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L18: {
                                    ((qe) this).field_L = 0;
                                    if (wb.field_p.field_db >= wb.field_p.field_d) {
                                      break L18;
                                    } else {
                                      ii.field_i = 50;
                                      be.field_d = wb.field_p.field_db;
                                      break L18;
                                    }
                                  }
                                  wb.field_p.field_r = ((qe) this).field_o;
                                  wb.field_p.field_f = ((qe) this).field_H;
                                  wb.field_p.field_db = wb.field_p.field_d;
                                  break L5;
                                }
                              }
                            }
                          } else {
                            if (~wb.field_p.field_d < ~wb.field_p.field_db) {
                              ii.field_i = 50;
                              be.field_d = wb.field_p.field_db;
                              wb.field_p.field_db = wb.field_p.field_db + 1;
                              break L5;
                            } else {
                              ((qe) this).field_L = 0;
                              if (ea.field_e == 0) {
                                rj.field_d = df.field_P;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        } else {
                          if (gl.field_k >= 9) {
                            break L5;
                          } else {
                            gl.field_k = gl.field_k + 1;
                            break L5;
                          }
                        }
                      }
                      this.e(((qe) this).field_F, -1);
                      break L3;
                    }
                  }
                }
              }
            }
          }
        }
        L19: {
          if (((qe) this).field_F != 15) {
            break L19;
          } else {
            L20: {
              if (((qe) this).field_nb) {
                stackOut_94_0 = 0;
                stackIn_95_0 = stackOut_94_0;
                break L20;
              } else {
                stackOut_93_0 = 1;
                stackIn_95_0 = stackOut_93_0;
                break L20;
              }
            }
            L21: {
              if (stackIn_95_0 == 0) {
                break L21;
              } else {
                if (!wa.field_pb[-(ea.field_e * 5) + ((qe) this).field_V]) {
                  ((qe) this).field_D = ((qe) this).field_D + 1;
                  if (((qe) this).field_D >= 51) {
                    wa.field_pb[((qe) this).field_V + -(5 * ea.field_e)] = true;
                    break L21;
                  } else {
                    break L19;
                  }
                } else {
                  break L19;
                }
              }
            }
            break L19;
          }
        }
    }

    private final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (((qe) this).field_Q != 0) {
            var2 = ((qe) this).field_L != 0 ? 1 : ((qe) this).field_mb ? 1 : 0;
            var3 = ((qe) this).field_L != 0 ? 0 : ((qe) this).field_gb ? 1 : 0;
            if (((qe) this).field_L == 0) {
                if (!(((qe) this).field_K >= ((qe) this).field_a * ((qe) this).field_Q)) {
                    var2 = 0;
                }
            }
            if (!(this.a(var2 != 0, (byte) -127, var3 == 0))) {
                ((qe) this).field_Q = 0;
            }
        }
    }

    private final int a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (0 != ((qe) this).field_a) {
          L0: {
            var4 = ((qe) this).field_e - -(((qe) this).field_I >> 1);
            var5 = 2048;
            if (var5 <= var4) {
              var4 = var4 - var5;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var6 = (param1 >> 1) + param0;
            if (var5 <= var6) {
              var6 = var6 - var5;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var7 = 0;
            var7 = var6 + -var4;
            if (var7 >= 0) {
              break L2;
            } else {
              var7 = -var7;
              break L2;
            }
          }
          L3: {
            L4: {
              if (0 >= ((qe) this).field_a) {
                break L4;
              } else {
                if (var6 >= var4) {
                  var7 = var7;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (0 >= ((qe) this).field_a) {
                break L5;
              } else {
                if (var6 < var4) {
                  var7 = -var7 + var5;
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (((qe) this).field_a >= 0) {
                break L6;
              } else {
                if (var4 > var6) {
                  break L6;
                } else {
                  var7 = -var7 + var5;
                  break L3;
                }
              }
            }
            if (((qe) this).field_a >= 0) {
              break L3;
            } else {
              if (var4 > var6) {
                var7 = var7;
                break L3;
              } else {
                break L3;
              }
            }
          }
          return var7;
        } else {
          return 0;
        }
    }

    private final void d(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        L0: {
          var11 = pg.field_n[param1];
          var3 = var11;
          var4 = var11[0] * 64;
          var5 = 16;
          var4 = var4 + var5;
          var4 += 8;
          var6 = -1;
          var7 = 40;
          var8 = 6;
          var9 = -((qe) this).field_w + ((qe) this).field_z;
          if (var4 >= var9) {
            ((qe) this).field_h = 0;
            break L0;
          } else {
            if (((qe) this).field_h * var6 < var7) {
              ((qe) this).field_h = ((qe) this).field_h + var6 * var8;
              break L0;
            } else {
              break L0;
            }
          }
        }
        var10 = 1;
        this.a(true, var10 != 0);
    }

    private final boolean f(int param0) {
        if (3 != ((qe) this).field_L) {
            if (9 != ((qe) this).field_L) {
                if (((qe) this).field_L != 8) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void G() {
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (3 != ((qe) this).field_L) {
          if (((qe) this).field_L != 13) {
            L0: {
              var2 = kf.field_d;
              if (var2 != 0) {
                if (var2 != 1) {
                  if (var2 == 2) {
                    ((qe) this).field_L = 0;
                    break L0;
                  } else {
                    L1: {
                      if (3 != var2) {
                        if (var2 == 4) {
                          ((qe) this).field_L = 0;
                          break L0;
                        } else {
                          if (var2 == 5) {
                            ((qe) this).field_L = 10;
                            break L0;
                          } else {
                            if (var2 != 6) {
                              L2: {
                                if (var2 != 7) {
                                  break L2;
                                } else {
                                  ((qe) this).field_L = 0;
                                  wh.field_b = true;
                                  break L2;
                                }
                              }
                              ((qe) this).field_L = 0;
                              break L1;
                            } else {
                              ((qe) this).field_L = 3;
                              break L0;
                            }
                          }
                        }
                      } else {
                        L3: {
                          ((qe) this).field_L = 1;
                          if (((qe) this).field_h > 0) {
                            ((qe) this).field_L = 2;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if (!wh.field_b) {
                          break L1;
                        } else {
                          ((qe) this).field_L = 0;
                          break L0;
                        }
                      }
                    }
                    break L0;
                  }
                } else {
                  ((qe) this).field_L = 2;
                  break L0;
                }
              } else {
                ((qe) this).field_L = 0;
                break L0;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final int c(int param0, int param1) {
        int var3 = 1;
        if (!(param0 != 0)) {
            var3 = 1;
        }
        if (param0 == 1) {
            var3 = -1;
        }
        if (!(2 != param0)) {
            var3 = 1;
        }
        if (ql.field_j) {
            var3 = -var3;
        }
        return var3;
    }

    private final void a() {
        ((qe) this).field_mb = true;
        ((qe) this).field_jb = false;
        ((qe) this).field_gb = true;
        ((qe) this).field_fb = true;
    }

    private final void m(int param0) {
        if (!(((qe) this).field_ib)) {
            ((qe) this).field_kb = 0;
            ((qe) this).field_L = 3;
            wb.field_p.field_Y = false;
            ((qe) this).field_D = 0;
            ((qe) this).field_ib = true;
        }
        if (!(((qe) this).field_L != 3)) {
            this.a(false, -119);
        }
    }

    private final boolean t() {
        int var2 = wb.field_p.field_z;
        int var3 = ((qe) this).field_z;
        return ~var2 >= ~var3 ? true : false;
    }

    private final void h(boolean param0) {
        ((qe) this).field_I = lh.field_B[fh.field_e];
        ((qe) this).field_w = lh.field_p[fh.field_e];
        ((qe) this).field_db = ah.field_f[fh.field_e];
        ((qe) this).field_K = rj.field_e[fh.field_e];
        if (fh.field_e == 2) {
            if (null != wb.field_p) {
                ((qe) this).field_K = wb.field_p.field_K;
            }
        }
        ((qe) this).field_M = jf.field_pb[fh.field_e];
        ((qe) this).field_C = jd.field_g[fh.field_e];
        ((qe) this).field_jb = true;
    }

    private final boolean w(int param0) {
        int var2 = 102 / ((-38 - param0) / 36);
        if (((qe) this).field_fb) {
            if (ol.field_g.a(2, ((qe) this).field_e, ((qe) this).field_w, ((qe) this).field_I, 1 + ((qe) this).field_z + -((qe) this).field_w)) {
                return false;
            }
            return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        L0: {
          var21 = TorChallenge.field_F ? 1 : 0;
          var9 = 0;
          var10 = 0;
          var11 = 0;
          var12 = 0;
          var13 = param1 % 32 + -(param2 * 32 / 256);
          var14 = param4 + -(param1 / 32);
          var15 = ((qe) this).field_I;
          if (vg.a(param5, -1)) {
            var15 = ki.field_e[dg.field_T[param5]];
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            var16 = 32 * var14 + -var13 + -(var15 - ((qe) this).field_I >> 1);
            var17 = var16 + var15;
            if (param5 != 4) {
              break L2;
            } else {
              if (((qe) this).field_a <= 0) {
                break L2;
              } else {
                var16 = var16 + -96;
                break L1;
              }
            }
          }
          if (param5 != 4) {
            break L1;
          } else {
            if (((qe) this).field_a < 0) {
              var17 = 96 + var17;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          if (0 > var16) {
            var18 = -1;
            break L3;
          } else {
            var18 = 1;
            break L3;
          }
        }
        L4: {
          var16 = var16 * var18;
          if (var16 <= 1024) {
            break L4;
          } else {
            if (var16 < 2048) {
              var18 = -var18;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (var16 < 2048) {
            break L5;
          } else {
            var16 -= 2048;
            if (var16 > 1024) {
              var18 = -var18;
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          if (param6 == 2657) {
            break L6;
          } else {
            this.j(false);
            break L6;
          }
        }
        L7: {
          if (0 <= var17) {
            var19 = 1;
            break L7;
          } else {
            var19 = -1;
            break L7;
          }
        }
        L8: {
          var17 = var17 * var19;
          if (1024 >= var17) {
            break L8;
          } else {
            if (var17 < 2048) {
              var19 = -var19;
              break L8;
            } else {
              break L8;
            }
          }
        }
        L9: {
          if (var17 >= 2048) {
            var17 -= 2048;
            if (var17 > 1024) {
              var19 = -var19;
              break L9;
            } else {
              break L9;
            }
          } else {
            break L9;
          }
        }
        L10: {
          L11: {
            var20 = ((qe) this).field_w;
            if (0 != param5) {
              break L11;
            } else {
              if (((qe) this).field_L != 0) {
                break L11;
              } else {
                if (cl.field_z) {
                  var20 = 96;
                  break L10;
                } else {
                  break L11;
                }
              }
            }
          }
          if (param5 == 28) {
            var20 = lh.field_q[fh.field_e];
            break L10;
          } else {
            if (vg.a(param5, param6 ^ -2658)) {
              var20 = ae.field_s[dg.field_T[param5]];
              break L10;
            } else {
              break L10;
            }
          }
        }
        L12: {
          L13: {
            if (param5 == 0) {
              break L13;
            } else {
              if (((qe) this).field_I <= 64) {
                break L13;
              } else {
                var12 = 296 - -(((qe) this).field_I / 2);
                break L12;
              }
            }
          }
          var12 = 328;
          break L12;
        }
        L14: {
          L15: {
            if (param5 != 0) {
              break L15;
            } else {
              if (((qe) this).field_L != 0) {
                break L15;
              } else {
                if (cl.field_z) {
                  var11 = -var20 + (64 * param7 / 256 + (-param0 + param3 * 64));
                  break L14;
                } else {
                  break L15;
                }
              }
            }
          }
          L16: {
            if (param5 != 22) {
              break L16;
            } else {
              if (!((qe) this).field_q) {
                break L16;
              } else {
                var11 = -var20 + (64 * param3 - param0) + 64 * param7 / 256;
                break L14;
              }
            }
          }
          if (22 == param5) {
            var11 = 16 + param7 * 64 / 256 + (param3 * 64 + -param0 + (-((qe) this).field_w + -(-((qe) this).field_w + var20 >> 1)));
            break L14;
          } else {
            var11 = -(-((qe) this).field_w + var20 >> 1) + -param0 + (param3 * 64 + (64 * param7 / 256 - ((qe) this).field_w));
            break L14;
          }
        }
        L17: {
          var9 = var18 * (fj.a(1870096848, wi.field_a[var16], var12 << 16) >> 16) - -320;
          var10 = 320 + var19 * (fj.a(1870096848, wi.field_a[var17], var12 << 16) >> 16);
          if (vg.a(param5, param6 ^ -2658)) {
            if (ki.field_e[dg.field_T[param5]] <= var10 + -var9) {
              break L17;
            } else {
              var9 = (-ki.field_e[dg.field_T[param5]] + (var10 + var9)) / 2;
              var10 = ki.field_e[dg.field_T[param5]] + var9;
              break L17;
            }
          } else {
            if (((qe) this).field_I > -var9 + var10) {
              var9 = (-((qe) this).field_I + (var9 + var10)) / 2;
              var10 = ((qe) this).field_I + var9;
              break L17;
            } else {
              if (var10 - var9 >= 64) {
                break L17;
              } else {
                var9 = (var9 + var10) / 2 - 32;
                var10 = var9 + 64;
                break L17;
              }
            }
          }
        }
        dl.field_n[2] = var11;
        dl.field_n[1] = var10;
        dl.field_n[0] = var9;
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (wb.field_p != null) {
            L1: {
              var2 = 2048;
              var3 = (wb.field_p.field_I >> 1) + wb.field_p.field_e;
              var4 = ((qe) this).field_e + (((qe) this).field_I >> 1);
              if (var2 > var3) {
                break L1;
              } else {
                var3 = var3 - var2;
                break L1;
              }
            }
            L2: {
              if (var2 > var4) {
                break L2;
              } else {
                var4 = var4 - var2;
                break L2;
              }
            }
            L3: {
              var5 = -var4 + var3;
              if (var5 >= 0) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = -1;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var6 = stackIn_9_0;
              var5 = var6 * var5;
              if (var2 >> 1 < var5) {
                var6 = -var6;
                var5 = var2 - var5;
                break L4;
              } else {
                break L4;
              }
            }
            if (var6 == 1) {
              ((qe) this).field_c = false;
              ((qe) this).field_N = true;
              ((qe) this).field_a = 1;
              break L0;
            } else {
              ((qe) this).field_N = false;
              ((qe) this).field_a = -1;
              ((qe) this).field_c = true;
              return;
            }
          } else {
            break L0;
          }
        }
    }

    private final void b(byte param0, int param1) {
        int var3 = dg.field_T[param1];
        ((qe) this).field_fb = lb.field_q[var3];
        ((qe) this).field_mb = ja.field_j[var3][((qe) this).field_V];
        ((qe) this).field_gb = be.field_c[var3];
        ((qe) this).field_jb = dl.field_r[var3][((qe) this).field_V];
        if (0 == ((qe) this).field_a) {
            ((qe) this).field_a = -1;
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
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
        int var18 = 0;
        int var19_int = 0;
        ka var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        var27 = TorChallenge.field_F ? 1 : 0;
        var7 = vj.field_c;
        if (var7 != 2) {
          return;
        } else {
          L0: {
            var8 = pl.field_e[((qe) this).field_L];
            if (var8 < 0) {
              break L0;
            } else {
              if (~var8 <= ~cg.field_f.length) {
                return;
              } else {
                if (0 > cg.field_f[var8][0]) {
                  return;
                } else {
                  var9 = cg.field_f[var8][2];
                  if (((qe) this).field_kb < 0) {
                    break L0;
                  } else {
                    if (~af.field_e[var8].length < ~((qe) this).field_kb) {
                      L1: {
                        var10 = af.field_e[var8][((qe) this).field_kb][0];
                        if (var9 != 0) {
                          break L1;
                        } else {
                          if (var10 < 0) {
                            return;
                          } else {
                            break L1;
                          }
                        }
                      }
                      L2: {
                        if (((qe) this).field_kb < 0) {
                          break L2;
                        } else {
                          if (((qe) this).field_kb < tc.field_m[var8].length) {
                            L3: {
                              var11 = tc.field_m[var8][((qe) this).field_kb];
                              if (var11 >= 0) {
                                break L3;
                              } else {
                                if (!param3) {
                                  return;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            L4: {
                              if (((qe) this).field_a >= 0) {
                                stackOut_26_0 = 0;
                                stackIn_27_0 = stackOut_26_0;
                                break L4;
                              } else {
                                stackOut_25_0 = 1;
                                stackIn_27_0 = stackOut_25_0;
                                break L4;
                              }
                            }
                            L5: {
                              var12 = stackIn_27_0;
                              if (((qe) this).field_L != 6) {
                                break L5;
                              } else {
                                L6: {
                                  if (var12 != 0) {
                                    stackOut_30_0 = 0;
                                    stackIn_31_0 = stackOut_30_0;
                                    break L6;
                                  } else {
                                    stackOut_29_0 = 1;
                                    stackIn_31_0 = stackOut_29_0;
                                    break L6;
                                  }
                                }
                                var12 = stackIn_31_0;
                                break L5;
                              }
                            }
                            L7: {
                              var13 = 128;
                              var14 = -1;
                              var15 = -1;
                              var16 = -1;
                              var17 = var13;
                              var18 = 0;
                              if (var9 == 1) {
                                var19_int = cg.field_f[var8][0];
                                var20 = cg.field_f[var8][1];
                                if (var19_int > ((qe) this).field_kb) {
                                  break L2;
                                } else {
                                  if (~((qe) this).field_kb < ~var20) {
                                    return;
                                  } else {
                                    var21 = 0;
                                    var22 = var19_int;
                                    L8: while (true) {
                                      if (~var20 > ~var22) {
                                        var22 = 0;
                                        var23 = var19_int;
                                        L9: while (true) {
                                          if (~((qe) this).field_kb >= ~var23) {
                                            L10: {
                                              var23 = -1;
                                              if (var9 != 1) {
                                                break L10;
                                              } else {
                                                if (~(var21 / 2) < ~(((qe) this).field_D + var22)) {
                                                  break L10;
                                                } else {
                                                  if (((qe) this).field_L == 10) {
                                                    if (~var21 >= ~(((qe) this).field_D + var22)) {
                                                      var23 = (var22 + ((qe) this).field_D) % (2 * var21);
                                                      if (var21 <= var23) {
                                                        var17 = (-var23 + var21 * 2) * (-32 + var13) / var21;
                                                        var18 = var13 - 32;
                                                        break L10;
                                                      } else {
                                                        var18 = (var13 + -32) * (-var23 + var21) / var21;
                                                        var17 = var13 - 32;
                                                        break L10;
                                                      }
                                                    } else {
                                                      break L10;
                                                    }
                                                  } else {
                                                    if (((qe) this).field_D + var22 <= var21) {
                                                      var17 = var13 * (2 * (var21 - (((qe) this).field_D + var22))) / var21;
                                                      break L10;
                                                    } else {
                                                      var17 = 0;
                                                      break L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L11: {
                                              var24 = ae.field_u[var7][var8][((qe) this).field_kb];
                                              if (~((qe) this).field_D < ~var24) {
                                                var22 = var22 + var24;
                                                break L11;
                                              } else {
                                                var22 = var22 + ((qe) this).field_D;
                                                break L11;
                                              }
                                            }
                                            L12: {
                                              var25 = cg.field_f[var8][3];
                                              if (var9 != 1) {
                                                break L12;
                                              } else {
                                                if (((qe) this).field_L == 10) {
                                                  var14 = var25;
                                                  break L12;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            L13: {
                                              var26 = cg.field_f[var8][4];
                                              if (1 != var9) {
                                                break L13;
                                              } else {
                                                if (((qe) this).field_L != 10) {
                                                  break L13;
                                                } else {
                                                  if (var23 >= 0) {
                                                    L14: {
                                                      if (~var23 > ~var21) {
                                                        var15 = (-var25 + var26) * (var23 + var21) / (2 * var21) + var25;
                                                        break L14;
                                                      } else {
                                                        var15 = (-var25 + var26) * (var23 + -var21) / (var21 * 2) + var25;
                                                        break L14;
                                                      }
                                                    }
                                                    var14 = (var26 - var25) * var23 / (2 * var21) + var25;
                                                    break L13;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                            }
                                            var16 = cg.field_f[var8][5];
                                            break L7;
                                          } else {
                                            var22 = var22 + ae.field_u[var7][var8][var23];
                                            var23++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var21 = var21 + ae.field_u[var7][var8][var22];
                                        var22++;
                                        continue L8;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            L15: {
                              if (var9 == 0) {
                                var14 = var10;
                                var19_int = af.field_e[var8][((qe) this).field_kb][1];
                                var16 = var19_int;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L16: {
                              L17: {
                                L18: {
                                  var19 = ra.field_b[0][0];
                                  var20 = var19.field_q / 2;
                                  var21 = var19.field_v / 4;
                                  var22 = param4;
                                  var23 = param4;
                                  var24 = param0;
                                  if (var12 == 0) {
                                    break L18;
                                  } else {
                                    if (((qe) this).field_L != 6) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                L19: {
                                  if (var12 != 0) {
                                    break L19;
                                  } else {
                                    if (((qe) this).field_L != 6) {
                                      break L19;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                var23 = var15 + var23;
                                var22 = var22 - -var14;
                                break L16;
                              }
                              var22 = var22 - -160 - var14;
                              var23 = -var15 + 160 + var23;
                              break L16;
                            }
                            L20: {
                              var24 = var16 + var24;
                              if (var9 == 0) {
                                L21: {
                                  if (var12 == 0) {
                                    var19 = ra.field_b[var11][1];
                                    break L21;
                                  } else {
                                    var19 = ra.field_b[var11][0];
                                    break L21;
                                  }
                                }
                                var24 = var24 - var21 / 2;
                                var22 = var22 + -(var20 / 2);
                                var19.d(var22, var24, var20, var21, var17);
                                break L20;
                              } else {
                                if (var9 != 1) {
                                  break L20;
                                } else {
                                  L22: {
                                    if (var12 == 0) {
                                      var19 = ra.field_b[0][1];
                                      if (((qe) this).field_L != 10) {
                                        if (((qe) this).field_L != 9) {
                                          break L22;
                                        } else {
                                          var23 = var23 + (var19.field_q >> 1);
                                          var22 = var22 + (var19.field_q >> 1);
                                          break L22;
                                        }
                                      } else {
                                        var23 = var23 - var19.field_q;
                                        var22 = var22 - var19.field_q;
                                        break L22;
                                      }
                                    } else {
                                      var19 = ra.field_b[0][0];
                                      if (((qe) this).field_L != 9) {
                                        break L22;
                                      } else {
                                        var22 = var22 - (var19.field_q >> 1) * 3;
                                        var23 = var23 - (var19.field_q >> 1) * 3;
                                        break L22;
                                      }
                                    }
                                  }
                                  L23: {
                                    if (0 >= var17) {
                                      break L23;
                                    } else {
                                      var19.b(var22, var24, var17);
                                      break L23;
                                    }
                                  }
                                  if (0 < var18) {
                                    var19.b(var23, var24, var18);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            if (param2 <= -64) {
                              return;
                            } else {
                              return;
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
                }
              }
            }
          }
          return;
        }
    }

    private final qe g(int param0) {
        int var2 = 0;
        L0: {
          if (((qe) this).field_D > 0) {
            ((qe) this).field_D = ((qe) this).field_D - 1;
            break L0;
          } else {
            if (0 < ((qe) this).field_D) {
              break L0;
            } else {
              return null;
            }
          }
        }
        L1: {
          ((qe) this).field_Q = ((qe) this).field_a * 120;
          ((qe) this).field_e = ((qe) this).field_Q * 32 / 256 + ((qe) this).field_e;
          var2 = 2048;
          if (0 <= ((qe) this).field_e) {
            break L1;
          } else {
            ((qe) this).field_e = ((qe) this).field_e + var2;
            break L1;
          }
        }
        L2: {
          if (var2 > ((qe) this).field_e) {
            break L2;
          } else {
            ((qe) this).field_e = -var2 + ((qe) this).field_e;
            break L2;
          }
        }
        ((qe) this).field_B = ((qe) this).field_e % 32 * 256 / 32;
        ((qe) this).field_o = ((qe) this).field_e / 32;
        if (param0 == 11227) {
          int discarded$2 = 116;
          if (!this.i()) {
            return (qe) this;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final int c(boolean param0, int param1) {
        int var3 = this.c(1) ? 1 : 0;
        int var4 = 1;
        if (param1 == 0) {
            if (!(var3 == 0)) {
                var4 = 0;
                if (ql.field_j) {
                    var4 = 1;
                }
            }
        }
        if (param1 == 0) {
            if (!(var3 != 0)) {
                var4 = 2;
                if (!(!ql.field_j)) {
                    var4 = 1;
                }
            }
        }
        if (param1 == 1) {
            if (var3 != 0) {
                var4 = 1;
                if (ql.field_j) {
                    var4 = 0;
                }
            }
        }
        if (1 == param1) {
            if (var3 == 0) {
                var4 = 1;
                if (!(!ql.field_j)) {
                    var4 = 2;
                }
            }
        }
        return var4;
    }

    private final int m(boolean param0) {
        int var5 = 0;
        int var6 = 0;
        int var4 = 0;
        int var7 = TorChallenge.field_F ? 1 : 0;
        int[][] var8 = wf.field_c;
        int[][] var2 = var8;
        int var3 = s.field_i[0];
        for (var5 = 0; var5 < var3; var5++) {
            for (var6 = 0; var6 <= 1; var6++) {
                var4 = var8[var5][var6];
                if (!(var4 != ((qe) this).field_o)) {
                    return var5;
                }
            }
        }
        return -1;
    }

    private final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        L0: {
          var9 = TorChallenge.field_F ? 1 : 0;
          if (((qe) this).field_Q <= 0) {
            stackOut_2_0 = -1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (((qe) this).field_Q != 0) {
            break L1;
          } else {
            var6 = ((qe) this).field_a;
            break L1;
          }
        }
        L2: {
          if (s.field_m) {
            param1 = 5 * param1 >> 2;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var7 = var6 * ((qe) this).field_Q;
          if (0 >= param1) {
            break L3;
          } else {
            L4: {
              L5: {
                if (var6 != ((qe) this).field_a) {
                  break L5;
                } else {
                  if (((qe) this).field_K >= var7 - -param1) {
                    var7 = var7 + param1;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (((qe) this).field_a != var6) {
                  break L6;
                } else {
                  if (((qe) this).field_K > var7) {
                    var7++;
                    break L4;
                  } else {
                    break L6;
                  }
                }
              }
              if (((qe) this).field_a == var6) {
                break L4;
              } else {
                var7 = var7 - param1;
                break L4;
              }
            }
            ((qe) this).field_Q = var7 * var6;
            break L3;
          }
        }
        L7: {
          ((qe) this).field_Q = var6 * var7;
          if (((qe) this).field_Q <= 0) {
            stackOut_22_0 = -1;
            stackIn_23_0 = stackOut_22_0;
            break L7;
          } else {
            stackOut_21_0 = 1;
            stackIn_23_0 = stackOut_21_0;
            break L7;
          }
        }
        L8: {
          var6 = stackIn_23_0;
          if (((qe) this).field_Q != 0) {
            break L8;
          } else {
            var6 = ((qe) this).field_a;
            break L8;
          }
        }
        var7 = ((qe) this).field_Q * var6;
        if (var7 <= 0) {
          return;
        } else {
          L9: {
            if (((qe) this).field_K >= var7) {
              break L9;
            } else {
              var7--;
              ((qe) this).field_Q = var7 * var6;
              break L9;
            }
          }
          L10: {
            if (!this.a(param2, (byte) -127, param4)) {
              break L10;
            } else {
              if (!param0) {
                ((qe) this).field_Q = 0;
                break L10;
              } else {
                break L10;
              }
            }
          }
          return;
        }
    }

    private final boolean q(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var2 = 0;
        var3 = ef.field_i[((qe) this).field_L][fh.field_e];
        var4 = dd.field_l[fh.field_e][var3][((qe) this).field_kb] ? 1 : 0;
        var5 = cb.field_b[fh.field_e][var3][((qe) this).field_kb] ? 1 : 0;
        var6 = bi.field_e[fh.field_e][var3][((qe) this).field_kb];
        if (wb.field_p == null) {
          return false;
        } else {
          L0: {
            int discarded$2 = 2;
            if (this.s()) {
              if (wb.field_p.field_db > 0) {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_9_0 = stackOut_6_0;
                break L0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_9_0 = stackOut_4_0;
              break L0;
            }
          }
          var2 = stackIn_9_0;
          var8 = -71 % ((param0 - -67) / 33);
          if (var2 == 0) {
            return false;
          } else {
            L1: {
              if (var5 != 0) {
                break L1;
              } else {
                if (var4 != 0) {
                  break L1;
                } else {
                  return false;
                }
              }
            }
            L2: {
              if (wb.field_p.field_Y) {
                break L2;
              } else {
                if (var4 == 0) {
                  break L2;
                } else {
                  wb.field_p.field_Y = true;
                  wb.field_p.field_G = wb.field_p.field_G + 10;
                  wb.field_p.field_db = wb.field_p.field_db - var6;
                  if (wb.field_p.field_db <= 0) {
                    if (wb.field_p.field_db > 0) {
                      break L2;
                    } else {
                      wh.a(vj.field_c, 10, -81);
                      break L2;
                    }
                  } else {
                    ei.a((byte) 66, 11 - -(wb.field_p.field_db % 3), vj.field_c);
                    break L2;
                  }
                }
              }
            }
            L3: {
              wb.field_p.field_Q = ((qe) this).field_Q + ((qe) this).field_a * 64;
              if (wb.field_p.field_Q >= 0) {
                stackOut_21_0 = 1;
                stackIn_22_0 = stackOut_21_0;
                break L3;
              } else {
                stackOut_20_0 = -1;
                stackIn_22_0 = stackOut_20_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_22_0;
              if (wb.field_p.field_Q * var7 > 128) {
                wb.field_p.field_Q = var7 * 128;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (wb.field_p.field_db > 0) {
                break L5;
              } else {
                boolean discarded$3 = this.a((byte) -34, wb.field_p);
                break L5;
              }
            }
            L6: {
              if (((qe) this).field_L == 9) {
                break L6;
              } else {
                ((qe) this).field_Q = ((qe) this).field_Q * 8 / 10;
                break L6;
              }
            }
            return true;
          }
        }
    }

    private final void a(int param0, int param1) {
        int var3 = dg.field_T[param0];
        ((qe) this).field_I = pl.field_b[var3];
        ((qe) this).field_w = ae.field_A[var3];
        if (!(((qe) this).field_V <= 2)) {
            return;
        }
        ((qe) this).field_db = dl.field_C[var3][((qe) this).field_V];
        ((qe) this).field_nb = de.field_c[var3][((qe) this).field_V];
        ((qe) this).field_K = mh.field_c[var3][((qe) this).field_V];
        ((qe) this).field_M = ck.field_a[var3];
        ((qe) this).field_cb = bc.field_l[var3];
        ((qe) this).field_C = ll.field_k[var3][((qe) this).field_V];
        ((qe) this).field_L = 0;
    }

    private final void g(int param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (param0 <= 0) {
            if (param0 >= 0) {
              break L0;
            } else {
              ((qe) this).field_N = false;
              ((qe) this).field_c = true;
              break L0;
            }
          } else {
            ((qe) this).field_c = false;
            ((qe) this).field_N = true;
            break L0;
          }
        }
        L1: {
          if (param1 > 71) {
            break L1;
          } else {
            ((qe) this).field_hb = 5;
            break L1;
          }
        }
        L2: {
          L3: {
            ((qe) this).field_a = param0;
            if (!((qe) this).field_c) {
              break L3;
            } else {
              if (param0 * ((qe) this).field_K >= ((qe) this).field_Q) {
                break L3;
              } else {
                ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_C * param0;
                break L2;
              }
            }
          }
          if (!((qe) this).field_N) {
            break L2;
          } else {
            if (((qe) this).field_Q < param0 * ((qe) this).field_K) {
              ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_C * param0;
              break L2;
            } else {
              break L2;
            }
          }
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          var2 = -5 / ((param0 - 71) / 49);
          oa.field_g = 0;
          we.field_j = 0;
          if (fh.field_e == 0) {
            int discarded$2 = 0;
            this.G();
            break L0;
          } else {
            if (1 == fh.field_e) {
              int discarded$3 = 64;
              this.L();
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if (2 == ((qe) this).field_L) {
              break L2;
            } else {
              L3: {
                if (0 != ((qe) this).field_L) {
                  break L3;
                } else {
                  if (!((qe) this).field_eb) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              if (((qe) this).field_L == 1) {
                we.field_j = 2;
                break L1;
              } else {
                L4: {
                  if (((qe) this).field_L != 0) {
                    break L4;
                  } else {
                    if (!wh.field_b) {
                      break L4;
                    } else {
                      if (fh.field_e == 0) {
                        we.field_j = 13;
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (((qe) this).field_L != 12) {
                    break L5;
                  } else {
                    L6: {
                      if (((qe) this).field_Q > 0) {
                        break L6;
                      } else {
                        if (((qe) this).field_g != 4) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    we.field_j = 4;
                    break L1;
                  }
                }
                L7: {
                  if (12 != ((qe) this).field_L) {
                    break L7;
                  } else {
                    L8: {
                      if (0 > ((qe) this).field_Q) {
                        break L8;
                      } else {
                        if (5 == ((qe) this).field_g) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    we.field_j = 5;
                    break L1;
                  }
                }
                L9: {
                  if (0 != ((qe) this).field_L) {
                    break L9;
                  } else {
                    L10: {
                      if (4 == ((qe) this).field_g) {
                        break L10;
                      } else {
                        if (((qe) this).field_g != 5) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (kk.field_h[6][fh.field_e] > 0) {
                      we.field_j = 6;
                      break L1;
                    } else {
                      break L9;
                    }
                  }
                }
                L11: {
                  if (((qe) this).field_L == 9) {
                    break L11;
                  } else {
                    L12: {
                      if (((qe) this).field_L != 0) {
                        break L12;
                      } else {
                        if (bk.field_w) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (((qe) this).field_L != 0) {
                        break L13;
                      } else {
                        if (0 == ((qe) this).field_Q) {
                          we.field_j = 0;
                          break L1;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (((qe) this).field_L != 0) {
                        break L14;
                      } else {
                        if (((qe) this).field_Q == 0) {
                          break L14;
                        } else {
                          we.field_j = 1;
                          break L1;
                        }
                      }
                    }
                    if (((qe) this).field_L != 3) {
                      if (4 != ((qe) this).field_L) {
                        if (((qe) this).field_L == 5) {
                          we.field_j = 10;
                          break L1;
                        } else {
                          if (((qe) this).field_L != 10) {
                            if (((qe) this).field_L != 8) {
                              if (((qe) this).field_L == 13) {
                                we.field_j = 7;
                                break L1;
                              } else {
                                break L1;
                              }
                            } else {
                              if (fh.field_e == 1) {
                                we.field_j = 14;
                                break L1;
                              } else {
                                if (2 != fh.field_e) {
                                  break L1;
                                } else {
                                  we.field_j = 15;
                                  break L1;
                                }
                              }
                            }
                          } else {
                            we.field_j = 11;
                            break L1;
                          }
                        }
                      } else {
                        we.field_j = 9;
                        break L1;
                      }
                    } else {
                      we.field_j = 8;
                      break L1;
                    }
                  }
                }
                we.field_j = 12;
                if (((qe) this).field_L != 0) {
                  break L1;
                } else {
                  L15: {
                    if (!((qe) this).field_j) {
                      break L15;
                    } else {
                      if (((qe) this).field_Q == 0) {
                        break L15;
                      } else {
                        break L1;
                      }
                    }
                  }
                  bk.field_w = false;
                  break L1;
                }
              }
            }
          }
          we.field_j = 3;
          break L1;
        }
        L16: {
          if (we.field_j != ((qe) this).field_g) {
            ((qe) this).field_g = we.field_j;
            ((qe) this).field_p = ef.field_k;
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          if (we.field_j == 3) {
            if (((qe) this).field_L != 2) {
              L18: {
                if (((qe) this).field_v) {
                  ((qe) this).field_v = false;
                  ((qe) this).field_p = ef.field_k;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (~(ef.field_k - ((qe) this).field_p) < ~qi.field_f[we.field_j][fh.field_e]) {
                  ((qe) this).field_eb = false;
                  break L19;
                } else {
                  break L19;
                }
              }
              oa.field_g = 1;
              break L17;
            } else {
              ((qe) this).field_v = true;
              oa.field_g = 0;
              break L17;
            }
          } else {
            if (we.field_j != 2) {
              L20: {
                if (ja.a((byte) 101, ((qe) this).field_L)) {
                  break L20;
                } else {
                  L21: {
                    if (0 != ((qe) this).field_L) {
                      break L21;
                    } else {
                      if (we.field_j != 12) {
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L22: {
                    oa.field_g = (ef.field_k - ((qe) this).field_p) / qi.field_f[we.field_j][fh.field_e];
                    if (~(-1 + kk.field_h[we.field_j][fh.field_e]) < ~oa.field_g) {
                      break L22;
                    } else {
                      if (jh.field_b[we.field_j][fh.field_e]) {
                        break L22;
                      } else {
                        oa.field_g = kk.field_h[we.field_j][fh.field_e] + -1;
                        break L17;
                      }
                    }
                  }
                  oa.field_g = oa.field_g % kk.field_h[we.field_j][fh.field_e];
                  break L17;
                }
              }
              oa.field_g = ((qe) this).field_kb;
              break L17;
            } else {
              if (ef.field_k + -((qe) this).field_p - qi.field_f[we.field_j][fh.field_e] > 0) {
                oa.field_g = 1;
                break L17;
              } else {
                oa.field_g = 0;
                break L17;
              }
            }
          }
        }
        L23: {
          if (we.field_j != 1) {
            break L23;
          } else {
            L24: {
              var3 = pi.field_g[fh.field_e][oa.field_g] ? 1 : 0;
              if (var3 == 0) {
                break L24;
              } else {
                if (0 == (-((qe) this).field_p + ef.field_k) % qi.field_f[we.field_j][fh.field_e]) {
                  jc.b(fh.field_e, 1, 3);
                  break L24;
                } else {
                  break L23;
                }
              }
            }
            break L23;
          }
        }
    }

    private final boolean c(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
        int var18 = 0;
        L0: {
          var17 = TorChallenge.field_F ? 1 : 0;
          var3 = ((qe) this).field_o;
          var4 = 32 * var3;
          var6 = var4 + ((qe) this).field_B * 32 / 256 + ((qe) this).field_I;
          var7 = 2048;
          var8 = 0;
          if (var6 < var7) {
            break L0;
          } else {
            var6 = var6 % var7;
            var8 = 1;
            break L0;
          }
        }
        L1: {
          var5 = var6 / 32;
          var9 = var3;
          var10 = var5;
          if (var8 != 0) {
            var10 = 63;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var11 = ((qe) this).field_H;
          var12 = 64 * ((qe) this).field_u / 256 + ((qe) this).field_H * 64;
          var14 = -((qe) this).field_w + var12;
          if (var11 >= 0) {
            break L2;
          } else {
            var11 = 0;
            break L2;
          }
        }
        L3: {
          var13 = var14 / 64;
          if (var13 >= 0) {
            break L3;
          } else {
            var13 = 0;
            break L3;
          }
        }
        L4: {
          if (ol.field_g.field_a <= var11) {
            var11 = -1 + ol.field_g.field_a;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (var13 < ol.field_g.field_a) {
            break L5;
          } else {
            var13 = -1 + ol.field_g.field_a;
            break L5;
          }
        }
        var15 = var9;
        L6: while (true) {
          if (var15 > var10) {
            L7: {
              if (var8 == 0) {
                break L7;
              } else {
                var10 = var5;
                var9 = 0;
                var15 = var9;
                L8: while (true) {
                  if (var15 > var10) {
                    break L7;
                  } else {
                    var18 = var13;
                    var16 = var18;
                    L9: while (true) {
                      if (var11 < var18) {
                        var15++;
                        continue L8;
                      } else {
                        if (0 < (ic.field_E[var15][var18] & 32)) {
                          if (param1) {
                            L10: {
                              ((qe) this).field_B = 0;
                              ((qe) this).field_H = 1 + var18;
                              ((qe) this).field_o = var15;
                              ((qe) this).field_u = 0;
                              if (((qe) this).field_H < ol.field_g.field_a) {
                                break L10;
                              } else {
                                ((qe) this).field_H = -1 + ol.field_g.field_a;
                                break L10;
                              }
                            }
                            return true;
                          } else {
                            return true;
                          }
                        } else {
                          var18++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
              }
            }
            return false;
          } else {
            var16 = var13;
            L11: while (true) {
              if (var11 < var16) {
                var15++;
                continue L6;
              } else {
                if ((ic.field_E[var15][var16] & 32) <= 0) {
                  var16++;
                  continue L11;
                } else {
                  L12: {
                    if (!param1) {
                      break L12;
                    } else {
                      L13: {
                        ((qe) this).field_B = 0;
                        ((qe) this).field_o = var15;
                        ((qe) this).field_H = 1 + var16;
                        if (((qe) this).field_H < ol.field_g.field_a) {
                          break L13;
                        } else {
                          ((qe) this).field_H = ol.field_g.field_a - 1;
                          break L13;
                        }
                      }
                      ((qe) this).field_u = 0;
                      break L12;
                    }
                  }
                  return true;
                }
              }
            }
          }
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = param0 + -8;
        if (var4 >= 0) {
            if (var4 < 4) {
                var3 = ab.field_d * cd.field_d[var4];
                qk.field_lb = qk.field_lb + 1;
                if (!(param0 != 11)) {
                    hd.field_c[vj.field_c] = p.a(hd.field_c[vj.field_c], 1 << -1 + ea.field_e);
                }
            }
        }
        if (param0 == 13) {
            if (db.field_B >= 10) {
                var3 = ab.field_d * 500;
            }
        }
        tf.field_o = tf.field_o + var3;
        pd.field_c = pd.field_c - var3;
        ub.field_j = ub.field_j - 1;
        pi.field_f = pi.field_f - al.field_z;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var15 = TorChallenge.field_F ? 1 : 0;
          var7 = 0;
          var8 = 0;
          if (0 <= ((qe) this).field_a) {
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
          var9 = stackIn_3_0;
          var10 = ae.field_s[dg.field_T[((qe) this).field_F]];
          if (0 >= ((qe) this).field_G) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var11 = stackIn_6_0;
        var12 = bc.field_l[dg.field_T[((qe) this).field_F]] ? 1 : 0;
        if (((qe) this).field_F == 23) {
          nd.a(-996593372, param2, param3);
          return;
        } else {
          L2: {
            if (((qe) this).field_F != 24) {
              if (0 > dg.field_T[((qe) this).field_F]) {
                break L2;
              } else {
                if (dg.field_T[((qe) this).field_F] >= ah.field_d.length) {
                  return;
                } else {
                  L3: {
                    if (((qe) this).field_g < 0) {
                      break L3;
                    } else {
                      if (~((qe) this).field_g <= ~ah.field_d[dg.field_T[((qe) this).field_F]].length) {
                        return;
                      } else {
                        if (((qe) this).field_V < 0) {
                          break L3;
                        } else {
                          if (ah.field_d[dg.field_T[((qe) this).field_F]][((qe) this).field_g].length <= ((qe) this).field_V) {
                            return;
                          } else {
                            if (0 > ((qe) this).field_P) {
                              return;
                            } else {
                              if (((qe) this).field_P >= ah.field_d[dg.field_T[((qe) this).field_F]][((qe) this).field_g][((qe) this).field_V].length) {
                                return;
                              } else {
                                L4: {
                                  if (((qe) this).field_F != 5) {
                                    break L4;
                                  } else {
                                    if (((qe) this).field_D == 0) {
                                      qg.a(bf.field_l);
                                      mb.field_e.d();
                                      qg.b();
                                      ah.field_d[dg.field_T[((qe) this).field_F]][((qe) this).field_g][((qe) this).field_V][((qe) this).field_P].d(0, 0, param5 + -param2, var10);
                                      jc.field_i.d();
                                      qg.b();
                                      mb.field_e.b(0, var10 + -((qe) this).field_w >> 1);
                                      la.field_f.a(126);
                                      qg.b(bf.field_l);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L5: {
                                  if (var9 != 0) {
                                    L6: {
                                      L7: {
                                        qg.a(bf.field_l);
                                        mb.field_e.d();
                                        qg.b();
                                        ah.field_d[dg.field_T[((qe) this).field_F]][((qe) this).field_g][((qe) this).field_V][((qe) this).field_P].d(0, 0, param5 - param2, var10);
                                        jj.field_e.d();
                                        qg.b();
                                        if (5 != ((qe) this).field_F) {
                                          break L7;
                                        } else {
                                          if (((qe) this).field_D == 0) {
                                            jc.field_i.d(0, 0);
                                            break L6;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      mb.field_e.d(0, 0);
                                      break L6;
                                    }
                                    la.field_f.a(112);
                                    qg.b(bf.field_l);
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                L8: {
                                  if (6 == ((qe) this).field_g) {
                                    L9: {
                                      if (0 != ((qe) this).field_P) {
                                        break L9;
                                      } else {
                                        if (((qe) this).field_T) {
                                          break L9;
                                        } else {
                                          L10: {
                                            if (var9 != 0) {
                                              ((qe) this).a(param1, param0, 256 * (16 + (((qe) this).field_I + -pl.field_b[dg.field_T[22]])) / 32 + ((qe) this).field_B, ((qe) this).field_H, ((qe) this).field_o, 22, 2657, -128 + ((qe) this).field_u);
                                              break L10;
                                            } else {
                                              ((qe) this).a(param1, param0, -128 + ((qe) this).field_B, ((qe) this).field_H, ((qe) this).field_o, 22, 2657, -128 + ((qe) this).field_u);
                                              break L10;
                                            }
                                          }
                                          ah.field_d[dg.field_T[22]][1][((qe) this).field_V][0].d(dl.field_n[0], dl.field_n[2], dl.field_n[1] - dl.field_n[0], ae.field_s[dg.field_T[22]]);
                                          break L8;
                                        }
                                      }
                                    }
                                    if (((qe) this).field_P != 1) {
                                      break L8;
                                    } else {
                                      if (((qe) this).field_T) {
                                        break L8;
                                      } else {
                                        L11: {
                                          if (var9 == 0) {
                                            ((qe) this).a(param1, param0, 256 + ((qe) this).field_B, ((qe) this).field_H, ((qe) this).field_o, 22, 2657, ((qe) this).field_u + -256);
                                            break L11;
                                          } else {
                                            ((qe) this).a(param1, param0, ((qe) this).field_B - -((-32 + (-pl.field_b[dg.field_T[22]] + ((qe) this).field_I)) * 256 / 32), ((qe) this).field_H, ((qe) this).field_o, 22, 2657, -256 + ((qe) this).field_u);
                                            break L11;
                                          }
                                        }
                                        ah.field_d[dg.field_T[22]][1][((qe) this).field_V][0].d(dl.field_n[0], dl.field_n[2], -dl.field_n[0] + dl.field_n[1], ae.field_s[dg.field_T[22]]);
                                        break L8;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                                L12: {
                                  L13: {
                                    if (((qe) this).field_F != 4) {
                                      break L13;
                                    } else {
                                      if (((qe) this).field_g != 4) {
                                        this.a(param3, param5, (byte) 87, param2, ah.field_d[dg.field_T[((qe) this).field_F]][((qe) this).field_g][((qe) this).field_V][((qe) this).field_P], ((qe) this).field_P);
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (7 != ((qe) this).field_F) {
                                      break L14;
                                    } else {
                                      if (!((qe) this).field_m) {
                                        break L14;
                                      } else {
                                        if (0 == ((qe) this).field_P) {
                                          var13 = (ef.field_k + -((qe) this).field_p << 7) / ik.field_d[((qe) this).field_g][dg.field_T[((qe) this).field_F]][((qe) this).field_V] + 128;
                                          if (var9 != 0) {
                                            jj.field_e.d(-96 + (-param2 + param5 + param2), param3, var13);
                                            break L12;
                                          } else {
                                            ah.field_d[dg.field_T[((qe) this).field_F]][((qe) this).field_g][((qe) this).field_V][((qe) this).field_P].b(param2, param3, -param2 + param5, var10, var13);
                                            break L12;
                                          }
                                        } else {
                                          ((qe) this).field_m = false;
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (var11 == 0) {
                                        break L16;
                                      } else {
                                        if (((qe) this).field_g != 4) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      if (!ol.field_a) {
                                        break L17;
                                      } else {
                                        if (~((qe) this).field_o != ~ol.field_g.field_l) {
                                          break L17;
                                        } else {
                                          if (~ol.field_g.field_i == ~((qe) this).field_H) {
                                            break L15;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    if (var9 != 0) {
                                      L18: {
                                        if (((qe) this).field_F != 5) {
                                          break L18;
                                        } else {
                                          if (((qe) this).field_D == 0) {
                                            L19: {
                                              var8 = param3 - 96 - -var10;
                                              var7 = param5 + (-param2 + -96) + param2;
                                              if (4 != ((qe) this).field_g) {
                                                break L19;
                                              } else {
                                                if (var12 != 0) {
                                                  break L19;
                                                } else {
                                                  this.a(jj.field_e, var8, var7, 74);
                                                  break L12;
                                                }
                                              }
                                            }
                                            jj.field_e.g(var7, var8);
                                            break L12;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      L20: {
                                        if (((qe) this).field_F != 22) {
                                          break L20;
                                        } else {
                                          if (((qe) this).field_q) {
                                            jj.field_e.g(param2 + (-param2 + param5) + -96, param3);
                                            break L12;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      L21: {
                                        var8 = param3 - (var10 + -((qe) this).field_w >> 1);
                                        var7 = -96 + param5 + (-param2 + param2);
                                        if (4 != ((qe) this).field_g) {
                                          break L21;
                                        } else {
                                          if (var12 != 0) {
                                            break L21;
                                          } else {
                                            this.a(jj.field_e, var8, var7, 103);
                                            break L12;
                                          }
                                        }
                                      }
                                      jj.field_e.g(var7, var8);
                                      break L12;
                                    } else {
                                      L22: {
                                        if (((qe) this).field_F != 5) {
                                          break L22;
                                        } else {
                                          if (((qe) this).field_D != 0) {
                                            break L22;
                                          } else {
                                            L23: {
                                              var8 = param3 - -var10 - 96;
                                              var7 = param2;
                                              if (4 != ((qe) this).field_g) {
                                                break L23;
                                              } else {
                                                if (var12 != 0) {
                                                  break L23;
                                                } else {
                                                  this.a(jc.field_i, var8, var7, 102);
                                                  break L12;
                                                }
                                              }
                                            }
                                            jc.field_i.g(var7, var8);
                                            break L12;
                                          }
                                        }
                                      }
                                      L24: {
                                        var7 = param2;
                                        if (5 == ((qe) this).field_F) {
                                          var8 = param3 - (var10 + -((qe) this).field_w >> 1);
                                          break L24;
                                        } else {
                                          var8 = param3;
                                          break L24;
                                        }
                                      }
                                      L25: {
                                        if (((qe) this).field_g != 4) {
                                          break L25;
                                        } else {
                                          if (var12 == 0) {
                                            qg.a(bf.field_l);
                                            mb.field_e.d();
                                            qg.b();
                                            ah.field_d[dg.field_T[((qe) this).field_F]][((qe) this).field_g][((qe) this).field_V][((qe) this).field_P].d(0, 0, -param2 + param5, var10);
                                            la.field_f.a(100);
                                            qg.b(bf.field_l);
                                            this.a(mb.field_e, var8, var7, 34);
                                            break L12;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      ah.field_d[dg.field_T[((qe) this).field_F]][((qe) this).field_g][((qe) this).field_V][((qe) this).field_P].d(var7, var8, -param2 + param5, var10);
                                      break L12;
                                    }
                                  }
                                  L26: {
                                    var13 = 0;
                                    var14 = ((qe) this).field_G;
                                    if (var14 >= 0) {
                                      break L26;
                                    } else {
                                      var14 = 0;
                                      break L26;
                                    }
                                  }
                                  L27: {
                                    if (10 >= var14) {
                                      break L27;
                                    } else {
                                      var14 = 10;
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if (var14 > 5) {
                                      var13 = (255 * var14 + -1275) / 5;
                                      break L28;
                                    } else {
                                      var13 = (1275 + -(var14 * 255)) / 5;
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    if (!ol.field_a) {
                                      break L29;
                                    } else {
                                      if (((qe) this).field_o != ol.field_g.field_l) {
                                        break L29;
                                      } else {
                                        if (~ol.field_g.field_i != ~((qe) this).field_H) {
                                          break L29;
                                        } else {
                                          var13 = 1;
                                          break L29;
                                        }
                                      }
                                    }
                                  }
                                  L30: {
                                    if (var13 > 0) {
                                      break L30;
                                    } else {
                                      var13 = 1;
                                      break L30;
                                    }
                                  }
                                  if (var9 != 0) {
                                    L31: {
                                      if (((qe) this).field_F != 5) {
                                        break L31;
                                      } else {
                                        if (((qe) this).field_D == 0) {
                                          var8 = param3 - 96 - -var10;
                                          var7 = -param2 - -param5 - 96 + param2;
                                          jj.field_e.a(var7, var8, var13, 16711680);
                                          break L12;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                    L32: {
                                      var8 = param3;
                                      var7 = param2 + (-96 - (-param5 + param2));
                                      if (((qe) this).field_F != 5) {
                                        break L32;
                                      } else {
                                        var8 = -(-((qe) this).field_w + var10 >> 1) + var8;
                                        break L32;
                                      }
                                    }
                                    jj.field_e.a(var7, var8, var13, 16711680);
                                    break L12;
                                  } else {
                                    L33: {
                                      if (5 != ((qe) this).field_F) {
                                        break L33;
                                      } else {
                                        if (((qe) this).field_D != 0) {
                                          break L33;
                                        } else {
                                          var7 = param2;
                                          var8 = var10 - 96 + param3;
                                          jc.field_i.a(var7, var8, var13, 16711680);
                                          break L12;
                                        }
                                      }
                                    }
                                    L34: {
                                      var8 = param3;
                                      var7 = param2;
                                      if (5 != ((qe) this).field_F) {
                                        break L34;
                                      } else {
                                        var8 = -(var10 + -((qe) this).field_w >> 1) + var8;
                                        break L34;
                                      }
                                    }
                                    ah.field_d[dg.field_T[((qe) this).field_F]][((qe) this).field_g][((qe) this).field_V][((qe) this).field_P].a(var7, var8, var13, 16711680);
                                    break L12;
                                  }
                                }
                                L35: {
                                  if (((qe) this).field_g == 7) {
                                    this.a(param0, ((qe) this).field_P, param1, (byte) 100);
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              if (((qe) this).field_a >= 0) {
                dj.field_O.d(param2, param3, -param2 + param5, ae.field_s[dg.field_T[24]]);
                return;
              } else {
                L36: {
                  if (cb.field_f == null) {
                    cb.field_f = new ka(ki.field_e[dg.field_T[24]], ae.field_s[dg.field_T[24]]);
                    break L36;
                  } else {
                    break L36;
                  }
                }
                cb.field_f.d();
                qg.b();
                dj.field_O.d(0, 0);
                la.field_f.a(110);
                cb.field_f.d(param2, param3, param5 - param2, ae.field_s[dg.field_T[24]]);
                break L2;
              }
            }
          }
          return;
        }
    }

    private final void L() {
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (af.a(-4275, ((qe) this).field_L)) {
          return;
        } else {
          if (13 == ((qe) this).field_L) {
            return;
          } else {
            var3 = kf.field_d;
            if (var3 != 1) {
              L0: {
                if (0 == var3) {
                  ((qe) this).field_L = 0;
                  break L0;
                } else {
                  ((qe) this).field_L = 0;
                  break L0;
                }
              }
              return;
            } else {
              ((qe) this).field_L = 0;
              return;
            }
          }
        }
    }

    private final void j(boolean param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((qe) this).field_q = true;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          L2: {
            ((qe) this).field_jb = stackIn_3_1 != 0;
            ((qe) this).field_D = 0;
            ((qe) this).field_h = 0;
            ((qe) this).field_Q = 0;
            ((qe) this).field_L = 13;
            if (((qe) this).field_F == 22) {
              break L2;
            } else {
              if (((qe) this).field_F != 7) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          hc.a(35, wb.field_p.field_H, ((qe) this).field_V, 4, wb.field_p.field_o, dg.field_T[((qe) this).field_F], ((qe) this).field_H, ((qe) this).field_o);
          break L1;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        int[][] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_69_3 = 0;
        int[][] stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        int stackIn_70_4 = 0;
        int[][] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        int[][] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        int[][] stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        int stackIn_85_4 = 0;
        int[][] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        int[][] stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        int[][] stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        int stackIn_89_4 = 0;
        int[][] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        int stackOut_67_3 = 0;
        int[][] stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        int stackOut_69_3 = 0;
        int stackOut_69_4 = 0;
        int[][] stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        int stackOut_68_4 = 0;
        int[][] stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int[][] stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        int stackOut_88_4 = 0;
        int[][] stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        int stackOut_87_4 = 0;
        int[][] stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        int[][] stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        int stackOut_84_4 = 0;
        int[][] stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        int stackOut_83_4 = 0;
        L0: {
          var19 = TorChallenge.field_F ? 1 : 0;
          if (19 != ((qe) this).field_F) {
            break L0;
          } else {
            if (!ui.field_b) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var4 = dl.field_n[0];
          var5 = dl.field_n[1];
          var6 = dl.field_n[2];
          var7 = -112 / ((-25 - param0) / 49);
          var10 = 0;
          if (var5 > var4) {
            L2: {
              var11 = null;
              if (!vg.a(((qe) this).field_F, -1)) {
                break L2;
              } else {
                this.a(param1, param2, var4, var6, 47, var5);
                break L2;
              }
            }
            L3: {
              var13 = 0;
              if (((qe) this).field_F < 8) {
                break L3;
              } else {
                if (11 < ((qe) this).field_F) {
                  break L3;
                } else {
                  L4: {
                    if (100 > ad.field_c) {
                      break L4;
                    } else {
                      ad.field_c = ad.field_c % 100;
                      break L4;
                    }
                  }
                  L5: {
                    var8 = 16;
                    var9 = ad.field_c * var8 / 100;
                    if (var9 >= 9) {
                      var9 = var8 - var9;
                      var10 = 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var11 = (Object) (Object) dk.field_c[-8 + ((qe) this).field_F][var9];
                  var13 = 1;
                  break L3;
                }
              }
            }
            L6: {
              if (((qe) this).field_F != 15) {
                break L6;
              } else {
                var11 = (Object) (Object) ec.field_a[3];
                var13 = 1;
                break L6;
              }
            }
            L7: {
              if (((qe) this).field_F != 18) {
                break L7;
              } else {
                L8: {
                  var9 = 7;
                  if (vj.field_c != 0) {
                    if (vj.field_c != 1) {
                      if (vj.field_c != 2) {
                        break L8;
                      } else {
                        var9 = 9;
                        break L8;
                      }
                    } else {
                      var9 = 8;
                      break L8;
                    }
                  } else {
                    var9 = 7;
                    break L8;
                  }
                }
                var11 = (Object) (Object) ec.field_a[var9];
                var13 = 1;
                break L7;
              }
            }
            L9: {
              if (((qe) this).field_F == 19) {
                var13 = 1;
                var11 = (Object) (Object) ec.field_a[5];
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (((qe) this).field_F != 12) {
                break L10;
              } else {
                if (0 >= o.field_l) {
                  var13 = 1;
                  var11 = (Object) (Object) ec.field_a[0];
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              if (((qe) this).field_F != 13) {
                break L11;
              } else {
                L12: {
                  if (o.field_l > 0) {
                    break L12;
                  } else {
                    if (!ol.field_a) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                var13 = 1;
                var6 += 16;
                var11 = (Object) (Object) ec.field_a[1];
                break L11;
              }
            }
            L13: {
              if (((qe) this).field_F == 14) {
                var11 = (Object) (Object) ec.field_a[6];
                var13 = 1;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (var13 == 0) {
                break L14;
              } else {
                L15: {
                  if (var10 == 0) {
                    break L15;
                  } else {
                    L16: {
                      if (pd.field_i != null) {
                        break L16;
                      } else {
                        pd.field_i = new ka(dk.field_c[0][0].field_q, dk.field_c[0][0].field_v);
                        break L16;
                      }
                    }
                    qg.a(bf.field_l);
                    pd.field_i.d();
                    qg.b();
                    ((ka) var11).d(0, 0);
                    la.field_f.a(-117);
                    qg.b(bf.field_l);
                    var11 = (Object) (Object) pd.field_i;
                    break L15;
                  }
                }
                L17: {
                  L18: {
                    qg.a(bf.field_l);
                    qg.a(var4, var6, var4 + ((ka) var11).field_q, ((ka) var11).field_v + var6);
                    if (!ol.field_a) {
                      break L18;
                    } else {
                      if (~((qe) this).field_o != ~ol.field_g.field_l) {
                        break L18;
                      } else {
                        if (~((qe) this).field_H != ~ol.field_g.field_i) {
                          break L18;
                        } else {
                          ((ka) var11).a(var4, var6, 16711680);
                          break L17;
                        }
                      }
                    }
                  }
                  L19: {
                    if (((qe) this).field_F != 15) {
                      break L19;
                    } else {
                      if (wb.field_p == null) {
                        break L19;
                      } else {
                        L20: {
                          L21: {
                            if (~((qe) this).field_o != ~wb.field_p.field_r) {
                              break L21;
                            } else {
                              if (~((qe) this).field_H == ~wb.field_p.field_f) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          if (((qe) this).field_nb) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                        if (wa.field_pb[-(ea.field_e * 5) + ((qe) this).field_V]) {
                          ec.field_a[4].g(var4, var6);
                          break L17;
                        } else {
                          L22: {
                            if (te.field_e != null) {
                              break L22;
                            } else {
                              te.field_e = new ka(16 + ((ka) var11).field_q, ((ka) var11).field_v + 16);
                              break L22;
                            }
                          }
                          te.field_e.d();
                          qg.b(bf.field_l);
                          qg.b();
                          ((ka) var11).a(0, 0, -(((qe) this).field_D * 5) + 255, 16777215);
                          la.field_f.a(115);
                          te.field_e.g(var4, var6);
                          var11 = (Object) (Object) te.field_e;
                          break L17;
                        }
                      }
                    }
                  }
                  if (15 == ((qe) this).field_F) {
                    L23: {
                      ((ka) var11).g(var4, var6);
                      qg.b(bf.field_l);
                      stackOut_67_0 = ob.field_c;
                      stackOut_67_1 = var6;
                      stackOut_67_2 = ((ka) var11).field_v;
                      stackOut_67_3 = 4;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      stackIn_69_2 = stackOut_67_2;
                      stackIn_69_3 = stackOut_67_3;
                      stackIn_68_0 = stackOut_67_0;
                      stackIn_68_1 = stackOut_67_1;
                      stackIn_68_2 = stackOut_67_2;
                      stackIn_68_3 = stackOut_67_3;
                      if (de.field_d % 8 != 0) {
                        stackOut_69_0 = (int[][]) (Object) stackIn_69_0;
                        stackOut_69_1 = stackIn_69_1;
                        stackOut_69_2 = stackIn_69_2;
                        stackOut_69_3 = stackIn_69_3;
                        stackOut_69_4 = 0;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        stackIn_70_2 = stackOut_69_2;
                        stackIn_70_3 = stackOut_69_3;
                        stackIn_70_4 = stackOut_69_4;
                        break L23;
                      } else {
                        stackOut_68_0 = (int[][]) (Object) stackIn_68_0;
                        stackOut_68_1 = stackIn_68_1;
                        stackOut_68_2 = stackIn_68_2;
                        stackOut_68_3 = stackIn_68_3;
                        stackOut_68_4 = 1;
                        stackIn_70_0 = stackOut_68_0;
                        stackIn_70_1 = stackOut_68_1;
                        stackIn_70_2 = stackOut_68_2;
                        stackIn_70_3 = stackOut_68_3;
                        stackIn_70_4 = stackOut_68_4;
                        break L23;
                      }
                    }
                    rd.a(stackIn_70_0, stackIn_70_1, stackIn_70_2, stackIn_70_3, stackIn_70_4 != 0, 4, -1012815519, ((ka) var11).field_q, var4, 10);
                    break L17;
                  } else {
                    L24: {
                      if (0 >= ((qe) this).field_G) {
                        break L24;
                      } else {
                        if (((qe) this).field_G % 4 < 2) {
                          break L24;
                        } else {
                          ((ka) var11).a(var4, var6, 16777215);
                          break L17;
                        }
                      }
                    }
                    ((ka) var11).g(var4, var6);
                    break L17;
                  }
                }
                L25: {
                  if (((qe) this).field_L != 14) {
                    break L25;
                  } else {
                    var15 = -8 + ((qe) this).field_F;
                    if (0 > var15) {
                      break L25;
                    } else {
                      if (var15 >= cd.field_d.length) {
                        break L25;
                      } else {
                        var14_ref_String = Integer.toString(ab.field_d * cd.field_d[var15]);
                        var16 = var4 - -(((ka) var11).field_q >> 1);
                        var17 = 24;
                        var18 = var6 + (((ka) var11).field_v >> 1) - ((var17 >> 1) + -6);
                        tf.field_x.a(var14_ref_String, var16, var18, 0, -1);
                        break L25;
                      }
                    }
                  }
                }
                L26: {
                  if (((qe) this).field_F != 19) {
                    break L26;
                  } else {
                    if (ol.field_a) {
                      tf.field_x.c("X:" + ((qe) this).field_o + " Y:" + ((qe) this).field_H, var4, var6, 0, -1);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
                qg.b(bf.field_l);
                if (((qe) this).field_F == 13) {
                  L27: {
                    stackOut_86_0 = p.field_f[e.b((byte) 57, 10)];
                    stackOut_86_1 = var6 + (ec.field_a[5].field_q >> 2);
                    stackOut_86_2 = ec.field_a[5].field_v >> 1;
                    stackOut_86_3 = 4;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    stackIn_88_2 = stackOut_86_2;
                    stackIn_88_3 = stackOut_86_3;
                    stackIn_87_0 = stackOut_86_0;
                    stackIn_87_1 = stackOut_86_1;
                    stackIn_87_2 = stackOut_86_2;
                    stackIn_87_3 = stackOut_86_3;
                    if (0 != de.field_d % 8) {
                      stackOut_88_0 = (int[][]) (Object) stackIn_88_0;
                      stackOut_88_1 = stackIn_88_1;
                      stackOut_88_2 = stackIn_88_2;
                      stackOut_88_3 = stackIn_88_3;
                      stackOut_88_4 = 0;
                      stackIn_89_0 = stackOut_88_0;
                      stackIn_89_1 = stackOut_88_1;
                      stackIn_89_2 = stackOut_88_2;
                      stackIn_89_3 = stackOut_88_3;
                      stackIn_89_4 = stackOut_88_4;
                      break L27;
                    } else {
                      stackOut_87_0 = (int[][]) (Object) stackIn_87_0;
                      stackOut_87_1 = stackIn_87_1;
                      stackOut_87_2 = stackIn_87_2;
                      stackOut_87_3 = stackIn_87_3;
                      stackOut_87_4 = 1;
                      stackIn_89_0 = stackOut_87_0;
                      stackIn_89_1 = stackOut_87_1;
                      stackIn_89_2 = stackOut_87_2;
                      stackIn_89_3 = stackOut_87_3;
                      stackIn_89_4 = stackOut_87_4;
                      break L27;
                    }
                  }
                  rd.a(stackIn_89_0, stackIn_89_1, stackIn_89_2, stackIn_89_3, stackIn_89_4 != 0, 4, -1012815519, ec.field_a[5].field_q >> 1, (ec.field_a[5].field_q >> 2) + var4, 2);
                  break L14;
                } else {
                  if (((qe) this).field_F == 12) {
                    L28: {
                      stackOut_82_0 = ba.field_f;
                      stackOut_82_1 = var6;
                      stackOut_82_2 = ec.field_a[4].field_v;
                      stackOut_82_3 = 4;
                      stackIn_84_0 = stackOut_82_0;
                      stackIn_84_1 = stackOut_82_1;
                      stackIn_84_2 = stackOut_82_2;
                      stackIn_84_3 = stackOut_82_3;
                      stackIn_83_0 = stackOut_82_0;
                      stackIn_83_1 = stackOut_82_1;
                      stackIn_83_2 = stackOut_82_2;
                      stackIn_83_3 = stackOut_82_3;
                      if (0 != de.field_d % 8) {
                        stackOut_84_0 = (int[][]) (Object) stackIn_84_0;
                        stackOut_84_1 = stackIn_84_1;
                        stackOut_84_2 = stackIn_84_2;
                        stackOut_84_3 = stackIn_84_3;
                        stackOut_84_4 = 0;
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        stackIn_85_2 = stackOut_84_2;
                        stackIn_85_3 = stackOut_84_3;
                        stackIn_85_4 = stackOut_84_4;
                        break L28;
                      } else {
                        stackOut_83_0 = (int[][]) (Object) stackIn_83_0;
                        stackOut_83_1 = stackIn_83_1;
                        stackOut_83_2 = stackIn_83_2;
                        stackOut_83_3 = stackIn_83_3;
                        stackOut_83_4 = 1;
                        stackIn_85_0 = stackOut_83_0;
                        stackIn_85_1 = stackOut_83_1;
                        stackIn_85_2 = stackOut_83_2;
                        stackIn_85_3 = stackOut_83_3;
                        stackIn_85_4 = stackOut_83_4;
                        break L28;
                      }
                    }
                    rd.a(stackIn_85_0, stackIn_85_1, stackIn_85_2, stackIn_85_3, stackIn_85_4 != 0, 4, -1012815519, ec.field_a[4].field_q, var4, 2);
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
            }
            L29: {
              var12 = 0;
              if (((qe) this).field_F != 20) {
                break L29;
              } else {
                var13 = 5;
                var14 = 0;
                L30: while (true) {
                  if (var13 <= var14) {
                    L31: {
                      if (ol.field_a) {
                        qg.b(var4, var6, -var4 + var5, 128, 16777215);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    if (!ol.field_a) {
                      break L29;
                    } else {
                      if (((qe) this).field_o != ol.field_g.field_l) {
                        break L29;
                      } else {
                        if (ol.field_g.field_i != ((qe) this).field_H) {
                          break L29;
                        } else {
                          qg.f(var4, var6, var5 + -var4, 128, 16711680);
                          break L29;
                        }
                      }
                    }
                  } else {
                    L32: {
                      if ((1 << var14 & vi.field_a) <= 0) {
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    var14++;
                    continue L30;
                  }
                }
              }
            }
            L33: {
              if (((qe) this).field_F != 0) {
                break L33;
              } else {
                if (ol.field_a) {
                  break L33;
                } else {
                  L34: {
                    if (!mj.field_b) {
                      break L34;
                    } else {
                      if (wb.field_p.field_L == 19) {
                        break L34;
                      } else {
                        if (20 == wb.field_p.field_L) {
                          break L34;
                        } else {
                          if (18 == wb.field_p.field_L) {
                            break L34;
                          } else {
                            int discarded$1 = -119;
                            this.a(var12, param2, var6, var4, var5);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  ((qe) this).a((ka) null, var6, var5, (int[]) null, var12, -20861, var4, 0);
                  break L1;
                }
              }
            }
            L35: {
              L36: {
                if (0 != ((qe) this).field_F) {
                  break L36;
                } else {
                  if (ol.field_a) {
                    L37: {
                      var13 = param1 / 32;
                      var14 = 0;
                      if (wb.field_p.field_o < var13) {
                        if (wb.field_p.field_o < var13) {
                          var14 = var13 - wb.field_p.field_o;
                          if (32 <= var14) {
                            var14 -= 32;
                            break L37;
                          } else {
                            break L37;
                          }
                        } else {
                          break L37;
                        }
                      } else {
                        var14 = -var13 + wb.field_p.field_o;
                        if (var14 >= 32) {
                          var14 -= 32;
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                    }
                    if (var14 < 16) {
                      var11 = (Object) (Object) c.field_c[0][0][0];
                      var12 = -(var5 + -var4);
                      var6 -= 32;
                      ((ka) var11).g(var4 - -var12, var6);
                      if (~ol.field_g.field_l != ~((qe) this).field_o) {
                        break L35;
                      } else {
                        if (ol.field_g.field_i == ((qe) this).field_H) {
                          ((ka) var11).a(var12 + var4, var6, 16711680);
                          break L35;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L36;
                  }
                }
              }
              if (((qe) this).field_F != 28) {
                break L35;
              } else {
                this.a(var12, var6, var5, (byte) -66, var4);
                break L1;
              }
            }
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final void c(boolean param0) {
        if (((qe) this).field_o < 64) {
            if (!(ol.field_g.field_a > ((qe) this).field_H)) {
                return;
            }
            if (!(0 >= (8 & ic.field_E[((qe) this).field_o][((qe) this).field_H]))) {
                ((qe) this).field_u = 192;
            }
            if ((ic.field_E[((qe) this).field_o][((qe) this).field_H] & 4) > 0) {
                ((qe) this).field_u = 128;
            }
            if (!((ic.field_E[((qe) this).field_o][((qe) this).field_H] & 2) <= 0)) {
                ((qe) this).field_u = 64;
            }
            if ((ic.field_E[((qe) this).field_o][((qe) this).field_H] & 1) > 0) {
                ((qe) this).field_u = 0;
            }
            return;
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        var3 = ef.field_i[((qe) this).field_L][fh.field_e];
        if (var3 >= 0) {
          L0: {
            var6 = -122 / ((-75 - param1) / 39);
            var4 = 0;
            var5 = dd.field_l[fh.field_e][var3][((qe) this).field_kb] ? 1 : 0;
            var7 = cb.field_b[fh.field_e][var3][((qe) this).field_kb] ? 1 : 0;
            if (var5 == 0) {
              break L0;
            } else {
              var8 = u.field_b[fh.field_e][var3][((qe) this).field_kb];
              if (var8 < 0) {
                break L0;
              } else {
                jc.b(fh.field_e, 1, var8);
                break L0;
              }
            }
          }
          L1: {
            L2: {
              if (var5 != 0) {
                break L2;
              } else {
                if (var7 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (!wh.field_b) {
              if (!lc.field_r) {
                lc.field_r = this.q(-7);
                if (lc.field_r) {
                  jc.b(fh.field_e, 1, 5);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                boolean discarded$2 = this.q(-32);
                break L1;
              }
            } else {
              break L1;
            }
          }
          L3: {
            if (param0) {
              int discarded$3 = -42;
              this.n();
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            var8 = mc.field_g[fh.field_e][var3][((qe) this).field_kb] - 1;
            var9 = of.field_a[fh.field_e][var3][((qe) this).field_kb] ? 1 : 0;
            me.field_g = hk.field_a[fh.field_e][var3][((qe) this).field_kb][0];
            if (var8 > ((qe) this).field_D) {
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              break L4;
            } else {
              stackOut_19_0 = 1;
              stackIn_21_0 = stackOut_19_0;
              break L4;
            }
          }
          L5: {
            L6: {
              var10 = stackIn_21_0;
              var4 = hk.field_a[fh.field_e][var3][((qe) this).field_kb][1];
              if (((qe) this).field_L != 10) {
                break L6;
              } else {
                if (0 > ((qe) this).field_h) {
                  break L6;
                } else {
                  if (ol.field_g.a(2, ((qe) this).field_e, ((qe) this).field_w, ((qe) this).field_I, -((qe) this).field_w + ((qe) this).field_z)) {
                    lc.field_r = false;
                    ((qe) this).field_L = 2;
                    ((qe) this).field_D = 0;
                    wb.field_p.field_Y = false;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (!((qe) this).field_ib) {
                break L7;
              } else {
                if (var9 == 0) {
                  break L7;
                } else {
                  if (var10 == 0) {
                    break L7;
                  } else {
                    if (me.field_g != 17) {
                      L8: {
                        if (((qe) this).field_L == 10) {
                          break L8;
                        } else {
                          if (10 != me.field_g) {
                            break L8;
                          } else {
                            ((qe) this).field_h = -((qe) this).field_M;
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (2 != fh.field_e) {
                          break L9;
                        } else {
                          if (((qe) this).field_L != 8) {
                            break L9;
                          } else {
                            if (!ad.field_a) {
                              this.d((byte) -117);
                              ad.field_a = true;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      lc.field_r = false;
                      ni.field_b = false;
                      ((qe) this).field_L = me.field_g;
                      ((qe) this).field_kb = var4;
                      ((qe) this).field_D = 0;
                      wb.field_p.field_Y = false;
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
            L10: {
              if (var9 == 0) {
                break L10;
              } else {
                if (var10 == 0) {
                  break L10;
                } else {
                  if (17 != me.field_g) {
                    L11: {
                      if (fh.field_e == 1) {
                        if (2 != fh.field_e) {
                          break L11;
                        } else {
                          if (((qe) this).field_L != 8) {
                            break L11;
                          } else {
                            if (ad.field_a) {
                              break L11;
                            } else {
                              this.d((byte) 62);
                              ad.field_a = true;
                              break L11;
                            }
                          }
                        }
                      } else {
                        if (2 != fh.field_e) {
                          break L11;
                        } else {
                          if (((qe) this).field_L != 8) {
                            break L11;
                          } else {
                            if (ad.field_a) {
                              break L11;
                            } else {
                              this.d((byte) 62);
                              ad.field_a = true;
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    ((qe) this).field_L = 0;
                    wb.field_p.field_Y = false;
                    ni.field_b = false;
                    ((qe) this).field_D = 0;
                    lc.field_r = false;
                    break L5;
                  } else {
                    break L10;
                  }
                }
              }
            }
            L12: {
              if (var9 == 0) {
                break L12;
              } else {
                if (var10 == 0) {
                  break L12;
                } else {
                  if (me.field_g != 17) {
                    break L12;
                  } else {
                    L13: {
                      if (10 != ((qe) this).field_L) {
                        L14: {
                          if (((qe) this).field_L != 9) {
                            break L14;
                          } else {
                            bk.field_w = true;
                            break L14;
                          }
                        }
                        L15: {
                          ((qe) this).field_L = 0;
                          sf.field_c = sf.field_c + 1;
                          if (lb.field_p[fh.field_e] > sf.field_c) {
                            break L15;
                          } else {
                            sf.field_c = 0;
                            break L15;
                          }
                        }
                        lc.field_r = false;
                        ni.field_b = false;
                        wb.field_p.field_Y = false;
                        ((qe) this).field_D = 0;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (0 != fh.field_e) {
                      return;
                    } else {
                      if (10 != ((qe) this).field_L) {
                        break L5;
                      } else {
                        if (ra.field_q) {
                          break L5;
                        } else {
                          ra.field_q = true;
                          if (0 < ql.field_n) {
                            break L5;
                          } else {
                            ql.field_n = 25;
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            if (var10 != 0) {
              L16: {
                if (var5 == 0) {
                  break L16;
                } else {
                  if (lc.field_r) {
                    break L16;
                  } else {
                    jc.b(fh.field_e, 1, 2);
                    break L16;
                  }
                }
              }
              ((qe) this).field_D = 0;
              ((qe) this).field_kb = ((qe) this).field_kb + 1;
              break L5;
            } else {
              ((qe) this).field_D = ((qe) this).field_D + 1;
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean g() {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        boolean stackOut_6_3 = false;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        L0: {
          var3 = TorChallenge.field_F ? 1 : 0;
          if (0 == ((qe) this).field_Q) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((qe) this).field_L != 0) {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = ((qe) this).field_mb;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1 ? 1 : 0;
                break L1;
              }
            }
            L2: {
              stackOut_4_0 = this;
              stackOut_4_1 = stackIn_4_1;
              stackOut_4_2 = -127;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              if (0 == ((qe) this).field_L) {
                stackOut_6_0 = this;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = ((qe) this).field_gb;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3 ? 1 : 0;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = 0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                break L2;
              }
            }
            var2 = this.a(stackIn_7_1 != 0, (byte) stackIn_7_2, stackIn_7_3 != 0) ? 1 : 0;
            if (var2 != 0) {
              L3: {
                if (((qe) this).field_F != 6) {
                  break L3;
                } else {
                  if (var2 != 0) {
                    qa.a(((qe) this).field_o, wb.field_p.field_H, dg.field_T[((qe) this).field_F], (qe) this, ((qe) this).field_H, -1, 4, wb.field_p.field_o, 25, ((qe) this).field_V);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (((qe) this).field_cb) {
                return true;
              } else {
                L4: {
                  if (0 < ((qe) this).field_lb) {
                    break L4;
                  } else {
                    if (0 != ((qe) this).field_L) {
                      break L4;
                    } else {
                      if (112 >= ((qe) this).field_D) {
                        break L4;
                      } else {
                        if (((qe) this).field_F != 3) {
                          break L4;
                        } else {
                          ((qe) this).field_lb = 187 + -((qe) this).field_D;
                          break L4;
                        }
                      }
                    }
                  }
                }
                L5: {
                  L6: {
                    if (((qe) this).field_lb > 0) {
                      break L6;
                    } else {
                      if (((qe) this).field_L != 0) {
                        break L6;
                      } else {
                        if (112 >= ((qe) this).field_D) {
                          break L6;
                        } else {
                          if (((qe) this).field_F != 2) {
                            break L6;
                          } else {
                            ((qe) this).field_lb = 187 - ((qe) this).field_D;
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (0 < ((qe) this).field_lb) {
                      break L7;
                    } else {
                      if (((qe) this).field_L != 0) {
                        break L7;
                      } else {
                        if (!((qe) this).field_k) {
                          break L7;
                        } else {
                          if (((qe) this).field_F != 3) {
                            break L7;
                          } else {
                            L8: {
                              ((qe) this).field_lb = 50;
                              if (0 < ((qe) this).field_Q) {
                                ((qe) this).field_a = -1;
                                break L8;
                              } else {
                                ((qe) this).field_a = 1;
                                break L8;
                              }
                            }
                            ((qe) this).field_k = false;
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  if (0 < ((qe) this).field_lb) {
                    break L5;
                  } else {
                    if (((qe) this).field_L == 0) {
                      L9: {
                        if (((qe) this).field_Q <= 0) {
                          ((qe) this).field_a = 1;
                          break L9;
                        } else {
                          ((qe) this).field_a = -1;
                          break L9;
                        }
                      }
                      ((qe) this).field_lb = 50;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                ((qe) this).field_Q = 0;
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L10: {
          L11: {
            if (((qe) this).field_F != 3) {
              break L11;
            } else {
              if (!((qe) this).field_k) {
                break L11;
              } else {
                if (!((qe) this).field_c) {
                  break L11;
                } else {
                  ((qe) this).field_Q = ((qe) this).field_Q - 1;
                  break L10;
                }
              }
            }
          }
          L12: {
            if (((qe) this).field_F != 3) {
              break L12;
            } else {
              if (!((qe) this).field_k) {
                break L12;
              } else {
                if (((qe) this).field_N) {
                  ((qe) this).field_Q = ((qe) this).field_Q + 1;
                  break L10;
                } else {
                  break L12;
                }
              }
            }
          }
          L13: {
            if (!((qe) this).field_c) {
              break L13;
            } else {
              if (((qe) this).field_G > 0) {
                break L13;
              } else {
                if (((qe) this).field_L == 0) {
                  if (((qe) this).field_Q < -((qe) this).field_K) {
                    ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_C;
                    break L10;
                  } else {
                    ((qe) this).field_Q = ((qe) this).field_Q - ((qe) this).field_C;
                    break L10;
                  }
                } else {
                  break L13;
                }
              }
            }
          }
          L14: {
            if (!((qe) this).field_N) {
              break L14;
            } else {
              if (((qe) this).field_G > 0) {
                break L14;
              } else {
                if (((qe) this).field_L == 0) {
                  if (((qe) this).field_Q > ((qe) this).field_K) {
                    ((qe) this).field_Q = ((qe) this).field_Q - ((qe) this).field_C;
                    break L10;
                  } else {
                    ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_C;
                    break L10;
                  }
                } else {
                  break L14;
                }
              }
            }
          }
          L15: {
            if (!((qe) this).field_c) {
              break L15;
            } else {
              if (-((qe) this).field_K >= ((qe) this).field_Q) {
                break L15;
              } else {
                if (((qe) this).field_L == 12) {
                  break L15;
                } else {
                  ((qe) this).field_Q = ((qe) this).field_Q - ((qe) this).field_C;
                  break L10;
                }
              }
            }
          }
          if (!((qe) this).field_N) {
            break L10;
          } else {
            if (((qe) this).field_Q >= ((qe) this).field_K) {
              break L10;
            } else {
              if (((qe) this).field_L != 12) {
                ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_C;
                break L10;
              } else {
                break L10;
              }
            }
          }
        }
        L16: {
          L17: {
            if (((qe) this).field_F != 3) {
              break L17;
            } else {
              if (!((qe) this).field_k) {
                break L17;
              } else {
                qa.a(((qe) this).field_o, wb.field_p.field_H, dg.field_T[((qe) this).field_F], (qe) this, ((qe) this).field_H, -1, 7, wb.field_p.field_o, 25, ((qe) this).field_V);
                break L16;
              }
            }
          }
          if (((qe) this).field_F != 4) {
            break L16;
          } else {
            if (!hc.field_Q) {
              cb.a(25, wb.field_p.field_H, (byte) 125, wb.field_p.field_o);
              break L16;
            } else {
              return false;
            }
          }
        }
        return false;
    }

    private final int h(int param0) {
        int[][] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] var6 = null;
        L0: {
          L1: {
            var6 = dd.field_q;
            var2 = var6;
            var3 = 0;
            var4 = var6[var3][0];
            var4 = var4 * 32;
            var5 = var6[var3][1];
            var5 = var5 * 32;
            if (((qe) this).field_e + ((qe) this).field_I <= var4) {
              break L1;
            } else {
              if (((qe) this).field_e < var5) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var3 = 1;
          var4 = var6[var3][0];
          var5 = var6[var3][1];
          var4 = 32 * var4;
          var5 = var5 * 32;
          break L0;
        }
        L2: {
          if (((qe) this).field_e - -((qe) this).field_I <= var4) {
            break L2;
          } else {
            if (var5 > ((qe) this).field_e) {
              return var3;
            } else {
              break L2;
            }
          }
        }
        return -1;
    }

    private final void B() {
        if (!this.a((byte) -50, fk.field_s)) {
            kf.field_d = 2;
            ((qe) this).field_h = 0;
            if (!(rk.field_e)) {
                rk.field_e = !rk.field_e ? true : false;
            }
            ((qe) this).field_Q = 0;
            return;
        }
        int var3 = this.b((byte) 109, false);
        if (!(var3 >= 0)) {
            kf.field_d = 2;
            if (!rk.field_e) {
                rk.field_e = !rk.field_e ? true : false;
            }
            ((qe) this).field_h = 0;
            ((qe) this).field_Q = 0;
            return;
        }
    }

    private final boolean a(byte param0, int[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var3_int = 32 * param1[0][0];
            var4 = 32 * (1 + param1[0][1]);
            var5 = 64 * param1[1][0];
            var6 = 64 * (1 + param1[1][1]);
            var7 = ((qe) this).field_e;
            var8 = var7 - -((qe) this).field_I;
            var9 = ((qe) this).field_z;
            var10 = var9 + -((qe) this).field_w;
            if (var7 >= var3_int) {
              if (var4 >= var8) {
                if (var5 > var10) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                } else {
                  if (var6 < var9) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    return true;
                  }
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("qe.ED(").append(-50).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TorChallenge.field_F ? 1 : 0;
          if (ak.field_j[param1][0] >= 0) {
            break L0;
          } else {
            ak.field_j[param1][0] = ((qe) this).field_o;
            ak.field_j[param1][1] = ((qe) this).field_B;
            ak.field_j[param1][2] = ((qe) this).field_H;
            ak.field_j[param1][3] = ((qe) this).field_u;
            break L0;
          }
        }
        if (ak.field_j[h.field_b[7][dg.field_T[3]][0] + -1][0] >= 0) {
          return;
        } else {
          var6 = 0;
          L1: while (true) {
            if (var6 > param1) {
              var7 = 0;
              return;
            } else {
              var5 = 256 + -((param1 + -var6) * 256 / (h.field_b[7][dg.field_T[3]][0] * 2 - 2));
              ((qe) this).a(param2, param0, ak.field_j[var6][1], ak.field_j[var6][2], ak.field_j[var6][0], ((qe) this).field_F, 2657, ak.field_j[var6][3]);
              wh.field_f[var6].b(dl.field_n[0], dl.field_n[2], dl.field_n[1] + -dl.field_n[0], ((qe) this).field_w, var5);
              var6++;
              continue L1;
            }
          }
        }
    }

    private final boolean c(int param0) {
        int[] var11 = fk.field_s[1];
        int[] var2 = var11;
        int var3 = 16;
        int var4 = var3 + 64 * var11[0];
        int var5 = var11[1] * 64 + 64;
        int var6 = var4 - -var5 >> 1;
        int var7 = ((qe) this).field_z;
        int var8 = var7 + -((qe) this).field_w;
        int var9 = var8 - -var7 >> 1;
        int var10 = var9 <= var6 ? 1 : 0;
        return var10 != 0;
    }

    private final void e() {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TorChallenge.field_F ? 1 : 0;
          if (((qe) this).field_G > 0) {
            ((qe) this).field_G = ((qe) this).field_G - 1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 10) {
                break L0;
              } else {
                if (((qe) this).field_F == ba.field_g[var2]) {
                  int discarded$2 = 75;
                  int discarded$3 = la.a((qe) this);
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
    }

    private final void n() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        Object stackOut_60_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        L0: {
          var12 = TorChallenge.field_F ? 1 : 0;
          var2 = ef.field_i[((qe) this).field_L][fh.field_e];
          var3 = ie.field_b[fh.field_e][var2][((qe) this).field_kb];
          var4 = ah.field_j[fh.field_e][var2][((qe) this).field_kb];
          var5 = k.field_c[fh.field_e][var2][((qe) this).field_kb];
          if (0 >= var3) {
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
          L2: {
            var6 = stackIn_3_0;
            if (var5 >= 0) {
              break L2;
            } else {
              if (((qe) this).field_h != 0) {
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_13_0 = stackOut_5_0;
                break L1;
              }
            }
          }
          if (var5 > 0) {
            if (0 != ((qe) this).field_h) {
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L1;
            } else {
              stackOut_10_0 = 0;
              stackIn_13_0 = stackOut_10_0;
              break L1;
            }
          } else {
            stackOut_8_0 = 0;
            stackIn_13_0 = stackOut_8_0;
            break L1;
          }
        }
        L3: {
          L4: {
            var7 = stackIn_13_0;
            var8 = vl.field_d[fh.field_e][var2][((qe) this).field_kb] ? 1 : 0;
            if (!((qe) this).field_c) {
              break L4;
            } else {
              if (((qe) this).field_a >= 0) {
                break L4;
              } else {
                stackOut_15_0 = 1;
                stackIn_23_0 = stackOut_15_0;
                break L3;
              }
            }
          }
          if (((qe) this).field_N) {
            if (((qe) this).field_a > 0) {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L3;
            } else {
              stackOut_20_0 = 0;
              stackIn_23_0 = stackOut_20_0;
              break L3;
            }
          } else {
            stackOut_18_0 = 0;
            stackIn_23_0 = stackOut_18_0;
            break L3;
          }
        }
        L5: {
          var9 = stackIn_23_0;
          if (var4 <= ((qe) this).field_a * ((qe) this).field_Q) {
            stackOut_25_0 = 0;
            stackIn_26_0 = stackOut_25_0;
            break L5;
          } else {
            stackOut_24_0 = 1;
            stackIn_26_0 = stackOut_24_0;
            break L5;
          }
        }
        L6: {
          var10 = stackIn_26_0;
          if (var7 == 0) {
            break L6;
          } else {
            ((qe) this).field_h = ((qe) this).field_h + var5;
            break L6;
          }
        }
        L7: {
          if (((qe) this).field_L != 10) {
            L8: {
              if (var6 == 0) {
                break L8;
              } else {
                if (lc.field_r) {
                  break L8;
                } else {
                  if (var10 == 0) {
                    break L8;
                  } else {
                    L9: {
                      if (var9 != 0) {
                        break L9;
                      } else {
                        if (var8 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_a * var3;
                    break L7;
                  }
                }
              }
            }
            L10: {
              if (var6 == 0) {
                break L10;
              } else {
                if (lc.field_r) {
                  break L10;
                } else {
                  if (var10 == 0) {
                    break L10;
                  } else {
                    ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_a;
                    break L7;
                  }
                }
              }
            }
            if (var6 == 0) {
              ((qe) this).field_Q = (-var3 * (((qe) this).field_Q * ((qe) this).field_a) >> 3) * ((qe) this).field_a;
              break L7;
            } else {
              if (!lc.field_r) {
                break L7;
              } else {
                if (((qe) this).field_L == 9) {
                  break L7;
                } else {
                  if (0 >= ((qe) this).field_a * ((qe) this).field_Q) {
                    break L7;
                  } else {
                    ((qe) this).field_Q = ((qe) this).field_Q - var3 * ((qe) this).field_a;
                    break L7;
                  }
                }
              }
            }
          } else {
            var9 = 1;
            if (((qe) this).field_a < 0) {
              if (-var4 < ((qe) this).field_Q) {
                ((qe) this).field_Q = ((qe) this).field_Q - var3;
                break L7;
              } else {
                if (((qe) this).field_a < 0) {
                  break L7;
                } else {
                  if (var4 <= ((qe) this).field_Q) {
                    break L7;
                  } else {
                    ((qe) this).field_Q = ((qe) this).field_Q + var3;
                    break L7;
                  }
                }
              }
            } else {
              if (((qe) this).field_a < 0) {
                break L7;
              } else {
                if (var4 <= ((qe) this).field_Q) {
                  break L7;
                } else {
                  ((qe) this).field_Q = ((qe) this).field_Q + var3;
                  break L7;
                }
              }
            }
          }
        }
        L11: {
          stackOut_56_0 = this;
          stackOut_56_1 = 1;
          stackIn_58_0 = stackOut_56_0;
          stackIn_58_1 = stackOut_56_1;
          stackIn_57_0 = stackOut_56_0;
          stackIn_57_1 = stackOut_56_1;
          if (((qe) this).field_L != 10) {
            stackOut_58_0 = this;
            stackOut_58_1 = stackIn_58_1;
            stackOut_58_2 = 1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            stackIn_59_2 = stackOut_58_2;
            break L11;
          } else {
            stackOut_57_0 = this;
            stackOut_57_1 = stackIn_57_1;
            stackOut_57_2 = 0;
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_59_2 = stackOut_57_2;
            break L11;
          }
        }
        L12: {
          this.a(stackIn_59_1 != 0, stackIn_59_2 != 0);
          if (((qe) this).field_Q == 0) {
            break L12;
          } else {
            L13: {
              stackOut_60_0 = this;
              stackIn_62_0 = stackOut_60_0;
              stackIn_61_0 = stackOut_60_0;
              if (9 == ((qe) this).field_L) {
                stackOut_62_0 = this;
                stackOut_62_1 = 0;
                stackIn_63_0 = stackOut_62_0;
                stackIn_63_1 = stackOut_62_1;
                break L13;
              } else {
                stackOut_61_0 = this;
                stackOut_61_1 = 1;
                stackIn_63_0 = stackOut_61_0;
                stackIn_63_1 = stackOut_61_1;
                break L13;
              }
            }
            L14: {
              stackOut_63_0 = this;
              stackOut_63_1 = stackIn_63_1;
              stackOut_63_2 = -127;
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              if (((qe) this).field_L == 10) {
                stackOut_65_0 = this;
                stackOut_65_1 = stackIn_65_1;
                stackOut_65_2 = stackIn_65_2;
                stackOut_65_3 = 0;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                stackIn_66_2 = stackOut_65_2;
                stackIn_66_3 = stackOut_65_3;
                break L14;
              } else {
                stackOut_64_0 = this;
                stackOut_64_1 = stackIn_64_1;
                stackOut_64_2 = stackIn_64_2;
                stackOut_64_3 = 1;
                stackIn_66_0 = stackOut_64_0;
                stackIn_66_1 = stackOut_64_1;
                stackIn_66_2 = stackOut_64_2;
                stackIn_66_3 = stackOut_64_3;
                break L14;
              }
            }
            if (this.a(stackIn_66_1 != 0, (byte) stackIn_66_2, stackIn_66_3 == 0)) {
              break L12;
            } else {
              ((qe) this).field_Q = 0;
              break L12;
            }
          }
        }
    }

    private final void C() {
        ((qe) this).field_Q = 0;
        qe var2 = new qe(((qe) this).field_o, ((qe) this).field_H, 22, ((qe) this).field_V);
        ef.a(0, var2);
        if (((qe) this).field_a > 0) {
            var2.field_B = ((qe) this).field_B - -(384 * ((qe) this).field_a);
        } else {
            if (((qe) this).field_a < 0) {
                var2.field_B = 192 * ((qe) this).field_a + ((qe) this).field_B;
            }
        }
        var2.field_u = -192 + ((qe) this).field_u;
        var2.field_Q = ((qe) this).field_a * 10;
        ((qe) this).field_T = true;
        var2.field_a = ((qe) this).field_a;
        var2.field_X = false;
        var2.field_i = false;
        var2.field_e = 32 * var2.field_o - -(var2.field_B * 32 / 256);
        var2.field_z = 64 * var2.field_u / 256 + var2.field_H * 64;
        hc.a(44, wb.field_p.field_H, ((qe) this).field_V, 6, wb.field_p.field_o, dg.field_T[((qe) this).field_F], ((qe) this).field_H, ((qe) this).field_o);
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qe var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var2 = tj.field_c[0] << 3;
          var3 = tj.field_c[1] << 3;
          var4 = ki.field_e[dg.field_T[24]];
          var5 = new qe(((qe) this).field_o, ((qe) this).field_H, 24, 0);
          var5.field_e = ((qe) this).field_e;
          if (((qe) this).field_a < 0) {
            var5.field_a = -1;
            var5.field_e = var5.field_e + (((qe) this).field_I + -var2 - var4);
            break L0;
          } else {
            var5.field_e = var5.field_e + var2;
            break L0;
          }
        }
        L1: {
          var5.field_z = var3 + ((qe) this).field_z - ((qe) this).field_w;
          var6 = -125 / ((param0 - -30) / 46);
          var7 = 2048;
          var8 = 64 * ol.field_g.field_a;
          if (var5.field_e < var7) {
            break L1;
          } else {
            var5.field_e = -var7 + var5.field_e;
            break L1;
          }
        }
        L2: {
          if (var8 > var5.field_z) {
            break L2;
          } else {
            var5.field_z = -1 + var8;
            break L2;
          }
        }
        L3: {
          if (var5.field_e >= 0) {
            break L3;
          } else {
            var5.field_e = var7 + -var5.field_e;
            break L3;
          }
        }
        L4: {
          if (0 <= var5.field_z) {
            break L4;
          } else {
            var5.field_z = 0;
            break L4;
          }
        }
        var5.field_o = var5.field_e / 32;
        var5.field_u = var5.field_z % 64 * 256 / 64;
        var5.field_H = var5.field_z / 64;
        var5.field_B = var5.field_e % 32 * 256 / 32;
        var5.field_cb = true;
        ef.a(0, var5);
        var5.field_D = 125;
    }

    private final boolean J() {
        int var2 = v.field_S[fh.field_e];
        int var3 = wb.field_p.field_e + (wb.field_p.field_I >> 1);
        int var4 = (((qe) this).field_I >> 1) + ((qe) this).field_e;
        int var5 = -var2 + var3;
        int var6 = var4 + -var2;
        var5 = 0 > var5 ? -1 : 1;
        var6 = var6 >= 0 ? 1 : -1;
        return var6 == var5 ? true : false;
    }

    private final boolean a(qe param0, int param1, boolean param2) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              var4 = this;
              if (var4 == null) {
                break L1;
              } else {
                if (((qe) var4).field_F != 0) {
                  break L1;
                } else {
                  if (param0 == null) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  } else {
                    L2: {
                      var5 = ((qe) var4).field_I / 2 + ((qe) this).field_e;
                      var6 = ((qe) this).field_z - ((qe) var4).field_w / 2;
                      var7 = vj.field_c;
                      var8 = pl.field_e[((qe) this).field_L];
                      var9 = tg.field_w[var7][var8][((qe) this).field_kb];
                      if (param2) {
                        var9 = ab.field_e;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      var10 = var5 - -var9[0];
                      var11 = var9[1] + var6;
                      var12 = var9[2];
                      if (((qe) var4).field_a >= 0) {
                        break L3;
                      } else {
                        var10 = 2 * var5 + (-var10 + -var12);
                        break L3;
                      }
                    }
                    L4: {
                      var13 = var9[3];
                      var14 = param0.field_e;
                      if (-var10 + var14 <= 1024) {
                        break L4;
                      } else {
                        var14 -= 2048;
                        break L4;
                      }
                    }
                    L5: {
                      if (-var10 + var14 >= -1024) {
                        break L5;
                      } else {
                        var14 += 2048;
                        break L5;
                      }
                    }
                    var15 = -param0.field_w + param0.field_z;
                    var16 = param0.field_I;
                    var17 = param0.field_w;
                    if (o.a(var17, var11, var16, var12, var13, var14, var10, (byte) 9, var15)) {
                      stackOut_21_0 = 1;
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    } else {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0 != 0;
                    }
                  }
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4_ref;
            stackOut_23_1 = new StringBuilder().append("qe.K(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + 2 + ',' + param2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    private final boolean a(boolean param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ra stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        ra stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        ra stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        ra stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        ra stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        ra stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        ra stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        ra stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        ra stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        ra stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        ra stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        ra stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          var4 = ((qe) this).field_B;
          ((qe) this).field_B = ((qe) this).field_B + ((qe) this).field_Q;
          if (((qe) this).field_Q < 0) {
            var5 = -1;
            break L0;
          } else {
            var5 = 1;
            break L0;
          }
        }
        L1: {
          L2: {
            this.e(-126);
            if (!param2) {
              break L2;
            } else {
              if (!ol.field_g.a(2, ((qe) this).field_o * 32 - -(32 * ((qe) this).field_B / 256), ((qe) this).field_w, ((qe) this).field_I, -((qe) this).field_w + ((qe) this).field_H * 64 - -(((qe) this).field_u * 64 / 256))) {
                break L2;
              } else {
                if (var4 == ((qe) this).field_B) {
                  break L2;
                } else {
                  if (ol.field_g.a(2, 32 * ((qe) this).field_o - -(((qe) this).field_B * 32 / 256), ((qe) this).field_w, ((qe) this).field_I, 64 * ((qe) this).field_u / 256 + 64 * ((qe) this).field_H + -((qe) this).field_w - 16)) {
                    break L2;
                  } else {
                    ((qe) this).field_u = ((qe) this).field_u - 64;
                    if (((qe) this).field_u >= 0) {
                      break L1;
                    } else {
                      ((qe) this).field_u = ((qe) this).field_u + 256;
                      ((qe) this).field_H = ((qe) this).field_H - 1;
                      if (0 > ((qe) this).field_H) {
                        ((qe) this).field_H = ((qe) this).field_H + ol.field_g.field_a;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          if (!param2) {
            break L1;
          } else {
            if (!ol.field_g.a(2, ((qe) this).field_o * 32 - -(32 * (-(var5 * 256) + ((qe) this).field_B) / 256), ((qe) this).field_w, ((qe) this).field_I, 16 + ((qe) this).field_u * 64 / 256 + (((qe) this).field_H * 64 - ((qe) this).field_w))) {
              break L1;
            } else {
              if (ol.field_g.a(2, ((qe) this).field_B * 32 / 256 + ((qe) this).field_o * 32, ((qe) this).field_w, ((qe) this).field_I, 16 + (((qe) this).field_H * 64 + (((qe) this).field_u * 64 / 256 - ((qe) this).field_w)))) {
                break L1;
              } else {
                if (((qe) this).field_B == var4) {
                  break L1;
                } else {
                  if (ol.field_g.a(2, ((qe) this).field_B * 32 / 256 + 32 * ((qe) this).field_o, ((qe) this).field_w, ((qe) this).field_I, 32 + 64 * ((qe) this).field_u / 256 + ((qe) this).field_H * 64 + -((qe) this).field_w)) {
                    ((qe) this).field_u = ((qe) this).field_u + 64;
                    if (((qe) this).field_u < 256) {
                      break L1;
                    } else {
                      ((qe) this).field_H = ((qe) this).field_H + 1;
                      ((qe) this).field_u = ((qe) this).field_u - 256;
                      if (ba.field_i.field_a > ((qe) this).field_H) {
                        break L1;
                      } else {
                        ((qe) this).field_H = ((qe) this).field_H - ba.field_i.field_a;
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
        }
        var6 = 0;
        L3: while (true) {
          L4: {
            if (!ol.field_g.a(2, 32 * ((qe) this).field_B / 256 + 32 * ((qe) this).field_o, ((qe) this).field_w, ((qe) this).field_I, 64 * ((qe) this).field_u / 256 + (((qe) this).field_H * 64 + -((qe) this).field_w))) {
              break L4;
            } else {
              if (var4 == ((qe) this).field_B) {
                break L4;
              } else {
                L5: {
                  if (0 >= ((qe) this).field_Q) {
                    ((qe) this).field_B = ((qe) this).field_B + 1;
                    break L5;
                  } else {
                    ((qe) this).field_B = ((qe) this).field_B - 1;
                    break L5;
                  }
                }
                this.e(-126);
                var6 = 1;
                continue L3;
              }
            }
          }
          L6: {
            if (param0) {
              break L6;
            } else {
              L7: {
                stackOut_28_0 = ol.field_g;
                stackOut_28_1 = 2;
                stackOut_28_2 = ((qe) this).field_o * 32;
                stackOut_28_3 = -(32 * ((qe) this).field_B / 256);
                stackIn_30_0 = stackOut_28_0;
                stackIn_30_1 = stackOut_28_1;
                stackIn_30_2 = stackOut_28_2;
                stackIn_30_3 = stackOut_28_3;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                stackIn_29_2 = stackOut_28_2;
                stackIn_29_3 = stackOut_28_3;
                if (((qe) this).field_a > 0) {
                  stackOut_30_0 = (ra) (Object) stackIn_30_0;
                  stackOut_30_1 = stackIn_30_1;
                  stackOut_30_2 = stackIn_30_2;
                  stackOut_30_3 = stackIn_30_3;
                  stackOut_30_4 = ((qe) this).field_I;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  stackIn_31_2 = stackOut_30_2;
                  stackIn_31_3 = stackOut_30_3;
                  stackIn_31_4 = stackOut_30_4;
                  break L7;
                } else {
                  stackOut_29_0 = (ra) (Object) stackIn_29_0;
                  stackOut_29_1 = stackIn_29_1;
                  stackOut_29_2 = stackIn_29_2;
                  stackOut_29_3 = stackIn_29_3;
                  stackOut_29_4 = -((qe) this).field_I;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_31_1 = stackOut_29_1;
                  stackIn_31_2 = stackOut_29_2;
                  stackIn_31_3 = stackOut_29_3;
                  stackIn_31_4 = stackOut_29_4;
                  break L7;
                }
              }
              L8: {
                stackOut_31_0 = (ra) (Object) stackIn_31_0;
                stackOut_31_1 = stackIn_31_1;
                stackOut_31_2 = stackIn_31_2 - (stackIn_31_3 + -stackIn_31_4);
                stackIn_33_0 = stackOut_31_0;
                stackIn_33_1 = stackOut_31_1;
                stackIn_33_2 = stackOut_31_2;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                stackIn_32_2 = stackOut_31_2;
                if (param2) {
                  stackOut_33_0 = (ra) (Object) stackIn_33_0;
                  stackOut_33_1 = stackIn_33_1;
                  stackOut_33_2 = stackIn_33_2;
                  stackOut_33_3 = 56;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  stackIn_34_3 = stackOut_33_3;
                  break L8;
                } else {
                  stackOut_32_0 = (ra) (Object) stackIn_32_0;
                  stackOut_32_1 = stackIn_32_1;
                  stackOut_32_2 = stackIn_32_2;
                  stackOut_32_3 = 8;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  stackIn_34_3 = stackOut_32_3;
                  break L8;
                }
              }
              if (!((ra) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_34_3 + ((qe) this).field_w, ((qe) this).field_I, -((qe) this).field_w + (64 * ((qe) this).field_u / 256 + ((qe) this).field_H * 64))) {
                var6 = 1;
                break L6;
              } else {
                break L6;
              }
            }
          }
          ((qe) this).field_z = 64 * ((qe) this).field_u / 256 + 64 * ((qe) this).field_H;
          ((qe) this).field_e = 32 * ((qe) this).field_o + 32 * ((qe) this).field_B / 256;
          return var6 != 0;
        }
    }

    private final boolean a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        var3 = ((qe) this).field_e;
        var4 = ((qe) this).field_z - ((qe) this).field_w;
        var7 = ((qe) this).field_o;
        var8 = ((qe) this).field_H;
        var5 = var3;
        var6 = var4;
        var10 = ((qe) this).field_u;
        var9 = 0;
        L0: while (true) {
          if (var9 >= 8) {
            return false;
          } else {
            L1: {
              var5 = var3 + 32 * (param1 * var9);
              var7 = ((qe) this).field_o + var9 * param1;
              if (var5 > 2048) {
                var5 -= 2048;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var7 < 64) {
                break L2;
              } else {
                var7 -= 64;
                break L2;
              }
            }
            L3: {
              if (var5 >= 0) {
                break L3;
              } else {
                var5 += 2048;
                break L3;
              }
            }
            L4: {
              if (var7 < 0) {
                var7 += 64;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              L6: {
                if (!ol.field_g.a(2, var5, ((qe) this).field_w, ((qe) this).field_I, var6)) {
                  break L6;
                } else {
                  if (!ol.field_g.a(2, var5, ((qe) this).field_w, ((qe) this).field_I, -16 + var6)) {
                    var10 -= 64;
                    var6 -= 16;
                    if (var10 >= 0) {
                      break L5;
                    } else {
                      var10 += 256;
                      var8--;
                      break L5;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (ol.field_g.a(2, var5, ((qe) this).field_w, ((qe) this).field_I, var6)) {
                  break L7;
                } else {
                  if (ol.field_g.a(2, var5, ((qe) this).field_w, ((qe) this).field_I, 16 + var6)) {
                    break L7;
                  } else {
                    if (ol.field_g.a(2, var5, ((qe) this).field_w, ((qe) this).field_I, 32 + var6)) {
                      var6 += 16;
                      var10 += 64;
                      if (var10 <= 256) {
                        break L5;
                      } else {
                        var8++;
                        var10 -= 256;
                        break L5;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                if (!ol.field_g.a(2, var5, ((qe) this).field_w, ((qe) this).field_I, var6)) {
                  break L8;
                } else {
                  if (!ol.field_g.a(2, var5, ((qe) this).field_w, ((qe) this).field_I, var6 + -16)) {
                    break L8;
                  } else {
                    return false;
                  }
                }
              }
              if (ol.field_g.a(2, var5, ((qe) this).field_w, ((qe) this).field_I, var6)) {
                break L5;
              } else {
                if (ol.field_g.a(2, var5, ((qe) this).field_w, ((qe) this).field_I, 16 + var6)) {
                  break L5;
                } else {
                  if (!ol.field_g.a(2, var5, ((qe) this).field_w, ((qe) this).field_I, var6 + 32)) {
                    return false;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L9: {
              if (~wb.field_p.field_o != ~var7) {
                break L9;
              } else {
                if (wb.field_p.field_H != var8) {
                  break L9;
                } else {
                  return true;
                }
              }
            }
            L10: {
              if (~var7 != ~wb.field_p.field_o) {
                break L10;
              } else {
                if (wb.field_p.field_H == -1 + var8) {
                  return true;
                } else {
                  break L10;
                }
              }
            }
            var9++;
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var19 = TorChallenge.field_F ? 1 : 0;
          var15 = 0;
          var16 = 4;
          var14 = 160;
          var13 = 160;
          var15 = var16;
          if (null != ea.field_h) {
            break L0;
          } else {
            ea.field_h = new ka(var13, var14);
            id.field_d = new int[var16][4];
            kc.field_w = new int[var16][3];
            var17 = 0;
            L1: while (true) {
              if (var17 >= var16) {
                ul.field_m = 0;
                ec.field_b = -1;
                fa.field_t = -1;
                break L0;
              } else {
                kc.field_w[var17][0] = 0;
                var17++;
                continue L1;
              }
            }
          }
        }
        var17 = 0;
        L2: while (true) {
          L3: {
            if (var16 <= var17) {
              break L3;
            } else {
              if (kc.field_w[var17][0] != 0) {
                var17++;
                continue L2;
              } else {
                var15 = var17;
                break L3;
              }
            }
          }
          L4: {
            L5: {
              if (i.field_r != ec.field_b) {
                break L5;
              } else {
                if (n.field_jb != fa.field_t) {
                  break L5;
                } else {
                  if (ul.field_m != ((qe) this).field_a) {
                    break L5;
                  } else {
                    if (ul.field_m != 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
            }
            dl.field_n[2] = 0;
            dl.field_n[0] = 0;
            ((qe) this).a(ea.field_h, param2, param4, new int[4], 0, -20861, param3, 1);
            ea.field_h.d();
            qg.d(2, 2, 0, 0, ea.field_h.field_u, ea.field_h.field_x);
            la.field_f.a(124);
            ul.field_m = ((qe) this).field_a;
            ec.field_b = i.field_r;
            fa.field_t = n.field_jb;
            break L4;
          }
          L6: {
            od.a(param3 - (var13 - ((qe) this).field_I >> 1), -32 + param2, -1, 8, 4, ea.field_h);
            if (ef.field_k % 4 == 0) {
              if (var15 < var16) {
                kc.field_w[var15][0] = ((qe) this).field_a;
                kc.field_w[var15][1] = i.field_r;
                kc.field_w[var15][2] = n.field_jb;
                id.field_d[var15][0] = ((qe) this).field_o;
                id.field_d[var15][1] = ((qe) this).field_B;
                id.field_d[var15][2] = ((qe) this).field_H;
                id.field_d[var15][3] = ((qe) this).field_u;
                break L6;
              } else {
                var17 = 1;
                L7: while (true) {
                  if (var17 >= var16) {
                    kc.field_w[var16 + -1][0] = ((qe) this).field_a;
                    kc.field_w[-1 + var16][1] = i.field_r;
                    kc.field_w[var16 + -1][2] = n.field_jb;
                    id.field_d[var16 + -1][0] = ((qe) this).field_o;
                    id.field_d[var16 - 1][1] = ((qe) this).field_B;
                    id.field_d[var16 + -1][2] = ((qe) this).field_H;
                    id.field_d[-1 + var16][3] = ((qe) this).field_u;
                    break L6;
                  } else {
                    var18 = 0;
                    L8: while (true) {
                      if (var18 >= 4) {
                        var20 = 0;
                        var18 = var20;
                        L9: while (true) {
                          if (var20 >= 3) {
                            var17++;
                            continue L7;
                          } else {
                            kc.field_w[-1 + var17][var20] = kc.field_w[var17][var20];
                            var20++;
                            continue L9;
                          }
                        }
                      } else {
                        id.field_d[-1 + var17][var18] = id.field_d[var17][var18];
                        var18++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            } else {
              break L6;
            }
          }
          var17 = 0;
          L10: while (true) {
            if (var16 <= var17) {
              ((qe) this).a((ka) null, param2, param4, (int[]) null, 0, -20861, param3, 0);
              return;
            } else {
              ((qe) this).a(param1, df.field_R, id.field_d[var17][1], id.field_d[var17][2], id.field_d[var17][0], ((qe) this).field_F, 2657, id.field_d[var17][3]);
              var9 = dl.field_n[2];
              var7 = dl.field_n[0];
              var8 = dl.field_n[1];
              dl.field_n[2] = -32 + var9;
              dl.field_n[0] = -(-((qe) this).field_I + var13 >> 1) + var7;
              var11 = kc.field_w[var17][1];
              var10 = kc.field_w[var17][0];
              var12 = kc.field_w[var17][2];
              if (var8 >= var7) {
                ((qe) this).a((ka) null, param2, param4, new int[4], 0, -20861, param3, 2);
                var17++;
                continue L10;
              } else {
                var17++;
                continue L10;
              }
            }
          }
        }
    }

    private final int c() {
        int[][] var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        var13 = bf.field_o;
        var2 = var13;
        var3 = ae.field_m;
        var7 = wb.field_p.field_e;
        var8 = var7 + wb.field_p.field_I;
        var9 = wb.field_p.field_H;
        var10 = 0;
        L0: while (true) {
          if (1 < var10) {
            return -1;
          } else {
            var11 = 0;
            L1: while (true) {
              if (3 <= var11) {
                var10++;
                continue L0;
              } else {
                L2: {
                  L3: {
                    var4 = var13[var10][0] * 32;
                    var6 = var3[var11];
                    var5 = 32 + var13[var10][1] * 32;
                    if (var7 < var4) {
                      break L3;
                    } else {
                      if (var5 >= var7) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4 <= var8) {
                    if (var8 <= var5) {
                      break L2;
                    } else {
                      var11++;
                      continue L1;
                    }
                  } else {
                    var11++;
                    continue L1;
                  }
                }
                if (var9 == var6) {
                  return (var10 << 16) + var11;
                } else {
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void F(int param0) {
        if (!(((qe) this).field_L == 13)) {
            return;
        }
        if (param0 <= 34) {
            ((qe) this).field_o = 93;
        }
        ((qe) this).field_D = ((qe) this).field_D + 1;
        if (((qe) this).field_D <= 100) {
            bi.field_f = false;
        } else {
            bi.field_f = true;
        }
        int discarded$0 = aj.a((byte) -105, (qe) this, ((qe) this).field_y);
        boolean discarded$2 = this.d(-125, 1);
        if (((qe) this).field_a == 0) {
            ((qe) this).field_a = 1;
        }
        ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_a;
        int discarded$3 = 0;
        qe discarded$4 = this.k();
        int discarded$5 = kf.a((qe) this, ((qe) this).field_y, 8);
    }

    private final void I() {
        int var3 = TorChallenge.field_F ? 1 : 0;
        if (((qe) this).field_K > ((qe) this).field_Q * ((qe) this).field_a) {
            ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_a * ((qe) this).field_C;
        } else {
            if (((qe) this).field_K < ((qe) this).field_Q * ((qe) this).field_a) {
                if (((qe) this).field_C <= ((qe) this).field_a * ((qe) this).field_Q) {
                    ((qe) this).field_Q = ((qe) this).field_Q - ((qe) this).field_C * ((qe) this).field_a;
                } else {
                    ((qe) this).field_Q = ((qe) this).field_Q - ((qe) this).field_a;
                }
            }
            return;
        }
    }

    private final void f() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = TorChallenge.field_F ? 1 : 0;
            var2 = -1;
            var3 = 0;
            var4 = 5;
            var5 = ((qe) this).field_F;
            if (var5 == 8) {
              break L1;
            } else {
              if (var5 != 9) {
                if (var5 == 13) {
                  if (o.field_l <= 0) {
                    break L0;
                  } else {
                    var2 = 0;
                    break L0;
                  }
                } else {
                  if (var5 != 10) {
                    if (11 != var5) {
                      if (var5 != 12) {
                        if (var5 == 15) {
                          L2: {
                            if (((qe) this).field_nb) {
                              var2 = 8;
                              break L2;
                            } else {
                              if (wb.field_p.field_d <= wb.field_p.field_db) {
                                break L2;
                              } else {
                                var2 = 5;
                                break L2;
                              }
                            }
                          }
                          L3: {
                            if (!((qe) this).field_nb) {
                              break L3;
                            } else {
                              if (hd.field_d % 5 == 4) {
                                var2 = 3;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var5 = 0;
                          L4: while (true) {
                            if (var5 >= var4) {
                              if (!((qe) this).field_nb) {
                                break L0;
                              } else {
                                if (var3 == 2) {
                                  var2 = 8;
                                  break L0;
                                } else {
                                  break L0;
                                }
                              }
                            } else {
                              L5: {
                                if (0 < (1 << var5 & vi.field_a)) {
                                  var3++;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var5++;
                              continue L4;
                            }
                          }
                        } else {
                          if (var5 != 14) {
                            if (var5 == 19) {
                              if (!ui.field_b) {
                                break L0;
                              } else {
                                if (ng.field_I > 0) {
                                  break L0;
                                } else {
                                  var2 = 6;
                                  break L0;
                                }
                              }
                            } else {
                              if (var5 != 20) {
                                if (var5 == 18) {
                                  var2 = 4;
                                  break L0;
                                } else {
                                  var2 = -1;
                                  break L0;
                                }
                              } else {
                                var5 = 0;
                                L6: while (true) {
                                  if (~var4 >= ~var5) {
                                    if (var3 < 2) {
                                      break L0;
                                    } else {
                                      if (wb.field_p == null) {
                                        break L0;
                                      } else {
                                        if (wb.field_p.field_n) {
                                          var2 = 2;
                                          break L0;
                                        } else {
                                          break L0;
                                        }
                                      }
                                    }
                                  } else {
                                    L7: {
                                      if ((vi.field_a & 1 << var5) <= 0) {
                                        break L7;
                                      } else {
                                        var3++;
                                        break L7;
                                      }
                                    }
                                    var5++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          } else {
                            if (~wb.field_p.field_d < ~wb.field_p.field_db) {
                              var2 = 5;
                              break L0;
                            } else {
                              break L0;
                            }
                          }
                        }
                      } else {
                        if (o.field_l > 0) {
                          break L0;
                        } else {
                          var2 = 1;
                          break L0;
                        }
                      }
                    } else {
                      var2 = 1;
                      break L0;
                    }
                  } else {
                    var2 = 1;
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          var2 = 0;
          break L0;
        }
        if (var2 < 0) {
          return;
        } else {
          if (var2 < 13) {
            u.a(12604, var2);
            return;
          } else {
            return;
          }
        }
    }

    private final qe k() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          var2 = 0;
          if (((qe) this).field_Q >= 0) {
            if (((qe) this).field_Q <= 0) {
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          } else {
            var2 = -1;
            break L0;
          }
        }
        L1: {
          if (var2 * ((qe) this).field_Q > 128) {
            ((qe) this).field_Q = var2 * 128;
            break L1;
          } else {
            break L1;
          }
        }
        ((qe) this).field_B = ((qe) this).field_B + ((qe) this).field_Q;
        L2: while (true) {
          if (var2 * ((qe) this).field_B <= 256) {
            L3: {
              if (64 <= ((qe) this).field_o) {
                ((qe) this).field_o = ((qe) this).field_o - 64;
                break L3;
              } else {
                if (0 > ((qe) this).field_o) {
                  ((qe) this).field_o = ((qe) this).field_o + 64;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (0 < ((qe) this).field_Q) {
                  break L5;
                } else {
                  if (((qe) this).field_Q >= 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                L7: {
                  var3 = 24;
                  var4 = -var3;
                  if (~var3 <= ~((qe) this).field_b) {
                    break L7;
                  } else {
                    if (var2 > 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (~var4 >= ~((qe) this).field_b) {
                  break L4;
                } else {
                  if (var2 >= 0) {
                    break L4;
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                ((qe) this).field_H = ba.field_i.field_a - 1;
                if (((qe) this).field_F != 0) {
                  break L8;
                } else {
                  bd.field_l = true;
                  break L8;
                }
              }
              ((qe) this).field_u = 1024;
              ((qe) this).field_Q = 0;
              if (((qe) this).field_F == 22) {
                ((qe) this).field_z = ((qe) this).field_u * 64 / 256 + ((qe) this).field_H * 64;
                ((qe) this).field_e = ((qe) this).field_o * 32 + 32 * ((qe) this).field_B / 256;
                return null;
              } else {
                break L4;
              }
            }
            ((qe) this).field_z = 64 * ((qe) this).field_H - -(((qe) this).field_u * 64 / 256);
            ((qe) this).field_e = 32 * ((qe) this).field_B / 256 + 32 * ((qe) this).field_o;
            return (qe) this;
          } else {
            ((qe) this).field_o = ((qe) this).field_o + var2;
            ((qe) this).field_B = ((qe) this).field_B + -256 * var2;
            ((qe) this).field_b = ((qe) this).field_b + var2;
            continue L2;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
        int stackIn_8_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        L0: {
          L1: {
            L2: {
              var15 = TorChallenge.field_F ? 1 : 0;
              var2 = vj.field_c;
              var3 = pl.field_e[((qe) this).field_L];
              var4 = 0;
              var5 = bc.field_h[var2][var3][((qe) this).field_kb] ? 1 : 0;
              var6 = ba.field_e[var2][var3][((qe) this).field_kb] ? 1 : 0;
              var7 = 0;
              var8 = vc.field_d[var2][var3][((qe) this).field_kb] ? 1 : 0;
              if (!((qe) this).field_c) {
                break L2;
              } else {
                if (((qe) this).field_a < 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (!((qe) this).field_N) {
                break L3;
              } else {
                if (0 >= ((qe) this).field_a) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        L4: {
          var9 = stackIn_8_0;
          if (var5 != 0) {
            var10 = r.field_i[var2][var3][((qe) this).field_kb] ? 1 : 0;
            if (var10 == 0) {
              break L4;
            } else {
              L5: {
                var11 = 6 - -e.b((byte) 57, 3);
                if (!mj.field_b) {
                  break L5;
                } else {
                  var11 = 6 + e.b((byte) 57, 4);
                  break L5;
                }
              }
              if (var11 < 0) {
                break L4;
              } else {
                if (var11 < 14) {
                  ei.a((byte) 66, var11, var2);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          } else {
            break L4;
          }
        }
        L6: {
          if (param0 != var2) {
            break L6;
          } else {
            if (((qe) this).field_L != 9) {
              break L6;
            } else {
              if (~(-1 + ah.field_a[var2][var3]) != ~((qe) this).field_kb) {
                break L6;
              } else {
                var7 = 1;
                break L6;
              }
            }
          }
        }
        L7: {
          L8: {
            if (var5 != 0) {
              break L8;
            } else {
              if (var6 != 0) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var10 = 0;
          L9: while (true) {
            if (var10 >= ea.field_g.length) {
              break L7;
            } else {
              L10: {
                if (!uf.field_k) {
                  uf.field_k = this.a(ea.field_g[var10], false, false);
                  if (!uf.field_k) {
                    break L10;
                  } else {
                    ei.a((byte) 66, 5, var2);
                    break L10;
                  }
                } else {
                  boolean discarded$3 = this.a(ea.field_g[var10], false, false);
                  break L10;
                }
              }
              L11: {
                if (var7 != 0) {
                  boolean discarded$4 = this.a(ea.field_g[var10], false, var7 != 0);
                  break L11;
                } else {
                  break L11;
                }
              }
              var10++;
              continue L9;
            }
          }
        }
        L12: {
          int discarded$5 = 3;
          this.z();
          if (-1 + ah.field_a[var2][var3] != ((qe) this).field_kb) {
            stackOut_36_0 = 0;
            stackIn_37_0 = stackOut_36_0;
            break L12;
          } else {
            stackOut_35_0 = 1;
            stackIn_37_0 = stackOut_35_0;
            break L12;
          }
        }
        L13: {
          var10 = stackIn_37_0;
          var11 = -1 + ae.field_u[var2][var3][((qe) this).field_kb];
          var12 = ll.field_j[var2][var3][((qe) this).field_kb] ? 1 : 0;
          if (((qe) this).field_D < var11) {
            stackOut_39_0 = 0;
            stackIn_40_0 = stackOut_39_0;
            break L13;
          } else {
            stackOut_38_0 = 1;
            stackIn_40_0 = stackOut_38_0;
            break L13;
          }
        }
        L14: {
          var13 = stackIn_40_0;
          if (!ah.field_i) {
            L15: {
              L16: {
                L17: {
                  if (!((qe) this).field_ab) {
                    break L17;
                  } else {
                    if (((qe) this).field_s) {
                      break L17;
                    } else {
                      if (ch.field_a[var2][pl.field_e[7]]) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                L18: {
                  if (!((qe) this).field_ab) {
                    break L18;
                  } else {
                    if (ch.field_a[var2][pl.field_e[7]]) {
                      break L18;
                    } else {
                      break L16;
                    }
                  }
                }
                stackOut_50_0 = 0;
                stackIn_51_0 = stackOut_50_0;
                break L15;
              }
              stackOut_49_0 = 1;
              stackIn_51_0 = stackOut_49_0;
              break L15;
            }
            ah.field_i = stackIn_51_0 != 0;
            break L14;
          } else {
            break L14;
          }
        }
        L19: {
          L20: {
            L21: {
              if (!((qe) this).field_c) {
                break L21;
              } else {
                if (((qe) this).field_a > 0) {
                  break L20;
                } else {
                  break L21;
                }
              }
            }
            L22: {
              if (!((qe) this).field_N) {
                break L22;
              } else {
                if (((qe) this).field_a >= 0) {
                  break L22;
                } else {
                  break L20;
                }
              }
            }
            stackOut_59_0 = 0;
            stackIn_60_0 = stackOut_59_0;
            break L19;
          }
          stackOut_58_0 = 1;
          stackIn_60_0 = stackOut_58_0;
          break L19;
        }
        L23: {
          L24: {
            var14 = stackIn_60_0;
            if (((qe) this).field_L == 10) {
              break L24;
            } else {
              if (6 == ((qe) this).field_L) {
                break L24;
              } else {
                if (((qe) this).field_L == 7) {
                  break L24;
                } else {
                  if (wk.field_F == 6) {
                    break L23;
                  } else {
                    if (wk.field_F == 7) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
              }
            }
          }
          wk.field_F = a.field_d[var2][var3][((qe) this).field_kb][0];
          var4 = a.field_d[var2][var3][((qe) this).field_kb][1];
          break L23;
        }
        L25: {
          L26: {
            if (10 == ((qe) this).field_L) {
              break L26;
            } else {
              if (((qe) this).field_L == 6) {
                break L26;
              } else {
                if (((qe) this).field_L == 9) {
                  break L26;
                } else {
                  if (!((qe) this).field_ib) {
                    break L26;
                  } else {
                    if (var14 == 0) {
                      break L26;
                    } else {
                      if (ch.field_a[var2][pl.field_e[6]]) {
                        wk.field_F = 6;
                        var4 = 0;
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
              }
            }
          }
          L27: {
            if (((qe) this).field_L == 10) {
              break L27;
            } else {
              if (((qe) this).field_L == 7) {
                break L27;
              } else {
                if (!((qe) this).field_ib) {
                  break L27;
                } else {
                  if (!((qe) this).field_s) {
                    break L27;
                  } else {
                    if (ch.field_a[var2][pl.field_e[7]]) {
                      wk.field_F = 7;
                      var4 = 0;
                      break L25;
                    } else {
                      break L27;
                    }
                  }
                }
              }
            }
          }
          L28: {
            if (((qe) this).field_L == 10) {
              break L28;
            } else {
              if (((qe) this).field_L == 7) {
                break L28;
              } else {
                if (!((qe) this).field_ib) {
                  break L28;
                } else {
                  if (ah.field_i) {
                    wk.field_F = 10;
                    var4 = 0;
                    break L25;
                  } else {
                    break L28;
                  }
                }
              }
            }
          }
          if (((qe) this).field_L == 10) {
            break L25;
          } else {
            if (((qe) this).field_L == 7) {
              break L25;
            } else {
              if (((qe) this).field_ib) {
                break L25;
              } else {
                if (!ah.field_i) {
                  break L25;
                } else {
                  var4 = 0;
                  wk.field_F = 1;
                  break L25;
                }
              }
            }
          }
        }
        L29: {
          L30: {
            if (((qe) this).field_L == 10) {
              break L30;
            } else {
              if (!((qe) this).field_ib) {
                break L30;
              } else {
                if (ol.field_g.a(param0, ((qe) this).field_e, ((qe) this).field_w, ((qe) this).field_I, ((qe) this).field_z)) {
                  break L30;
                } else {
                  if (ol.field_g.a(2, ((qe) this).field_e, (160 + -((qe) this).field_w) / 2, ((qe) this).field_I, ((qe) this).field_z)) {
                    break L30;
                  } else {
                    ((qe) this).field_kb = 0;
                    ((qe) this).field_L = 10;
                    this.H(9);
                    break L29;
                  }
                }
              }
            }
          }
          L31: {
            if (((qe) this).field_L == 10) {
              break L31;
            } else {
              if (ol.field_g.a(2, ((qe) this).field_e, ((qe) this).field_w, ((qe) this).field_I, ((qe) this).field_z)) {
                break L31;
              } else {
                ((qe) this).field_L = 2;
                ((qe) this).field_kb = 0;
                this.H(9);
                break L29;
              }
            }
          }
          L32: {
            if (((qe) this).field_L != 10) {
              break L32;
            } else {
              if (((qe) this).field_h < 0) {
                break L32;
              } else {
                if (!ol.field_g.a(param0, ((qe) this).field_e, (160 + -((qe) this).field_w) / 2, ((qe) this).field_I, ((qe) this).field_z)) {
                  break L32;
                } else {
                  ((qe) this).field_L = 2;
                  this.H(param0 ^ 11);
                  break L29;
                }
              }
            }
          }
          L33: {
            if (!((qe) this).field_ib) {
              break L33;
            } else {
              if (var12 == 0) {
                break L33;
              } else {
                if (var13 == 0) {
                  break L33;
                } else {
                  if (wk.field_F == 17) {
                    break L33;
                  } else {
                    if (9 != ((qe) this).field_L) {
                      L34: {
                        if (((qe) this).field_L == 6) {
                          ((qe) this).field_a = -((qe) this).field_a;
                          break L34;
                        } else {
                          L35: {
                            if (((qe) this).field_L == 10) {
                              break L35;
                            } else {
                              L36: {
                                if (1 != var2) {
                                  break L36;
                                } else {
                                  if (((qe) this).field_L == 7) {
                                    break L35;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              if (wk.field_F != 10) {
                                break L35;
                              } else {
                                ((qe) this).field_h = -((qe) this).field_M;
                                break L34;
                              }
                            }
                          }
                          if (!ch.field_a[var2][pl.field_e[9]]) {
                            break L34;
                          } else {
                            if (((qe) this).field_ab) {
                              break L34;
                            } else {
                              if (!((qe) this).field_n) {
                                break L34;
                              } else {
                                if (var9 != 0) {
                                  wk.field_F = 9;
                                  var4 = 0;
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                        }
                      }
                      kl.field_a = false;
                      ((qe) this).field_L = wk.field_F;
                      this.H(param0 ^ 11);
                      ((qe) this).field_kb = var4;
                      break L29;
                    } else {
                      break L33;
                    }
                  }
                }
              }
            }
          }
          L37: {
            if (var12 == 0) {
              break L37;
            } else {
              if (var13 == 0) {
                break L37;
              } else {
                if (wk.field_F == 17) {
                  break L37;
                } else {
                  L38: {
                    if (((qe) this).field_L != 9) {
                      break L38;
                    } else {
                      if (((qe) this).field_ab) {
                        break L38;
                      } else {
                        ((qe) this).field_D = 0;
                        if (var10 == 0) {
                          ((qe) this).field_kb = ((qe) this).field_kb + 1;
                          break L29;
                        } else {
                          ((qe) this).field_kb = 0;
                          ((qe) this).field_L = 0;
                          break L29;
                        }
                      }
                    }
                  }
                  if (wk.field_F == 1) {
                    ((qe) this).field_L = 1;
                    wh.a(vj.field_c, 0, -75);
                    ((qe) this).field_h = -((qe) this).field_M;
                    this.H(9);
                    break L29;
                  } else {
                    ((qe) this).field_L = 0;
                    kl.field_a = false;
                    this.H(9);
                    break L29;
                  }
                }
              }
            }
          }
          L39: {
            if (var12 == 0) {
              break L39;
            } else {
              if (var13 == 0) {
                break L39;
              } else {
                if (wk.field_F != 17) {
                  break L39;
                } else {
                  if (10 != ((qe) this).field_L) {
                    L40: {
                      ti.field_d = ((qe) this).field_L;
                      if (9 != ((qe) this).field_L) {
                        break L40;
                      } else {
                        tk.field_P = true;
                        gl.field_f = true;
                        break L40;
                      }
                    }
                    kl.field_a = false;
                    ((qe) this).field_L = 0;
                    this.H(9);
                    break L29;
                  } else {
                    ((qe) this).field_L = 10;
                    break L29;
                  }
                }
              }
            }
          }
          if (var13 != 0) {
            L41: {
              ((qe) this).field_D = 0;
              if (var10 != 0) {
                break L41;
              } else {
                ((qe) this).field_kb = ((qe) this).field_kb + 1;
                break L41;
              }
            }
            uf.field_k = false;
            if (var8 != 0) {
              this.n(param0 + 94);
              break L29;
            } else {
              break L29;
            }
          } else {
            ((qe) this).field_D = ((qe) this).field_D + 1;
            break L29;
          }
        }
        L42: {
          if (var2 != 2) {
            break L42;
          } else {
            L43: {
              if (((qe) this).field_L != 9) {
                break L43;
              } else {
                if (((qe) this).field_kb != -1 + ah.field_a[var2][var3]) {
                  break L43;
                } else {
                  ((qe) this).field_eb = true;
                  ve.field_a.field_h = 64;
                  break L42;
                }
              }
            }
            break L42;
          }
        }
    }

    private final void j(int param0) {
        int var2 = -124 / ((-86 - param0) / 35);
        int var3 = 0;
        this.a(true, var3 != 0);
    }

    private final boolean j(byte param0) {
        if (param0 < 31) {
            this.g((byte) 80);
        }
        int var2 = r.field_a[fh.field_e];
        int var3 = fc.field_o >= var2 ? 1 : 0;
        return var3 != 0;
    }

    private final boolean A() {
        int var2 = ((qe) this).field_e;
        int var3 = ((qe) this).field_z + -((qe) this).field_w;
        int var4 = ((qe) this).field_I - 16;
        int var5 = ((qe) this).field_w;
        int var6 = -16 + wb.field_p.field_e;
        if (!(20 != ((qe) this).field_F)) {
            var4 = 32;
            var2 = ((qe) this).field_e + 48;
            var6 = wb.field_p.field_e - -16;
        }
        if (!(var6 - var2 >= -1025)) {
            var6 -= 2048;
        }
        if (!(1023 <= -var2 + var6)) {
            var6 += 2048;
        }
        int var7 = wb.field_p.field_z - ((qe) this).field_w;
        int var8 = wb.field_p.field_I;
        if (((qe) this).field_F == 20) {
            var8 = 32;
        }
        int var9 = wb.field_p.field_w;
        if (o.a(var9, var3, var8, var4, var5, var6, var2, (byte) 9, var7)) {
            return true;
        }
        return false;
    }

    private final void K(int param0) {
        ((qe) this).field_fb = false;
        if (param0 != -1) {
            ((qe) this).field_s = true;
        }
        ((qe) this).field_gb = false;
        ((qe) this).field_jb = true;
        ((qe) this).field_mb = false;
    }

    private final boolean a(qe param0, boolean param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_138_0 = 0;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        String stackIn_142_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        String stackOut_141_2 = null;
        RuntimeException stackOut_140_0 = null;
        StringBuilder stackOut_140_1 = null;
        String stackOut_140_2 = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              var7 = vj.field_c;
              var8 = pl.field_e[((qe) this).field_L];
              var9 = bc.field_h[var7][var8][((qe) this).field_kb] ? 1 : 0;
              var10 = ba.field_e[var7][var8][((qe) this).field_kb] ? 1 : 0;
              var11 = p.field_e[var7][var8][((qe) this).field_kb];
              if (!param2) {
                break L1;
              } else {
                var11 = 0;
                var10 = 1;
                var9 = 0;
                break L1;
              }
            }
            if (param0 != null) {
              L2: {
                L3: {
                  if (vg.a(param0.field_F, -1)) {
                    break L3;
                  } else {
                    if (28 != param0.field_F) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L2;
              }
              var4_int = stackIn_11_0;
              if (var4_int == 0) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0 != 0;
              } else {
                L4: {
                  if (param0.field_F != 6) {
                    break L4;
                  } else {
                    if (param0.field_V == 0) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0 != 0;
                    } else {
                      if (param0.field_V != 2) {
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                }
                L5: {
                  if (7 != param0.field_F) {
                    break L5;
                  } else {
                    if (param0.field_V != 2) {
                      break L5;
                    } else {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0 != 0;
                    }
                  }
                }
                if (param0.field_F != 23) {
                  if (param0.field_F != 24) {
                    L6: {
                      if (28 != param0.field_F) {
                        break L6;
                      } else {
                        if (!wh.field_b) {
                          break L6;
                        } else {
                          if (param0.field_a != ((qe) this).field_a) {
                            var9 = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      if (param0.field_F != 28) {
                        break L7;
                      } else {
                        if (!wh.field_b) {
                          break L7;
                        } else {
                          var9 = 0;
                          var10 = 0;
                          break L7;
                        }
                      }
                    }
                    L8: {
                      L9: {
                        if (var10 != 0) {
                          break L9;
                        } else {
                          if (var9 != 0) {
                            break L9;
                          } else {
                            var5 = 0;
                            break L8;
                          }
                        }
                      }
                      L10: {
                        L11: {
                          if (!this.a(param0, 2, param2)) {
                            break L11;
                          } else {
                            if (param0.field_db <= 0) {
                              break L11;
                            } else {
                              stackOut_44_0 = 1;
                              stackIn_46_0 = stackOut_44_0;
                              break L10;
                            }
                          }
                        }
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        break L10;
                      }
                      var5 = stackIn_46_0;
                      break L8;
                    }
                    if (var5 != 0) {
                      L12: {
                        if (param0.field_Y) {
                          break L12;
                        } else {
                          if (var9 == 0) {
                            break L12;
                          } else {
                            if (param0.field_G > 0) {
                              break L12;
                            } else {
                              L13: {
                                L14: {
                                  param0.field_db = param0.field_db - ((dk.field_a >> 1) + var11);
                                  rc.a(param0.field_z, param0.field_I, true, ((qe) this).field_I, ((qe) this).field_w, ((qe) this).field_e, param0.field_w, ((qe) this).field_z, param0.field_e);
                                  if (param0.field_F != 28) {
                                    break L14;
                                  } else {
                                    if (fh.field_e != 2) {
                                      break L14;
                                    } else {
                                      L15: {
                                        if (!s.field_m) {
                                          ha.field_d = ha.field_d + 1;
                                          if (ha.field_d < 4) {
                                            break L15;
                                          } else {
                                            ha.field_d = 0;
                                            ii.field_e = true;
                                            break L15;
                                          }
                                        } else {
                                          break L15;
                                        }
                                      }
                                      ni.field_b = true;
                                      break L13;
                                    }
                                  }
                                }
                                L16: {
                                  if (param0.field_F != 28) {
                                    break L16;
                                  } else {
                                    if (fh.field_e != 1) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (rk.field_e) {
                                          L18: {
                                            if (rk.field_e) {
                                              stackOut_65_0 = 0;
                                              stackIn_66_0 = stackOut_65_0;
                                              break L18;
                                            } else {
                                              stackOut_64_0 = 1;
                                              stackIn_66_0 = stackOut_64_0;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            rk.field_e = stackIn_66_0 != 0;
                                            if (ql.field_j) {
                                              stackOut_68_0 = 0;
                                              stackIn_69_0 = stackOut_68_0;
                                              break L19;
                                            } else {
                                              stackOut_67_0 = 1;
                                              stackIn_69_0 = stackOut_67_0;
                                              break L19;
                                            }
                                          }
                                          ql.field_j = stackIn_69_0 != 0;
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      fc.field_o = -param0.field_db + param0.field_d;
                                      break L13;
                                    }
                                  }
                                }
                                if (param0.field_F != 28) {
                                  break L13;
                                } else {
                                  if (fh.field_e == 0) {
                                    fc.field_o = param0.field_d + -param0.field_db;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              L20: {
                                L21: {
                                  if (param0.field_db > 0) {
                                    break L21;
                                  } else {
                                    if (param0.field_F == 28) {
                                      break L21;
                                    } else {
                                      if (param0.field_F == 24) {
                                        break L21;
                                      } else {
                                        if (param0.field_F != 23) {
                                          hc.a(91, wb.field_p.field_H, param0.field_V, 0, wb.field_p.field_o, dg.field_T[param0.field_F], param0.field_H, param0.field_o);
                                          break L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (param0.field_db > 0) {
                                  break L20;
                                } else {
                                  if (param0.field_F == 28) {
                                    jc.b(fh.field_e, 1, 7);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              L22: {
                                param0.field_G = param0.field_G + 10;
                                if (mj.field_b) {
                                  param0.field_db = param0.field_db - (-(dk.field_a >> 1) + dk.field_a);
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              L23: {
                                param0.field_Y = true;
                                if (param0.field_F != 28) {
                                  break L23;
                                } else {
                                  L24: {
                                    if (fh.field_e == 1) {
                                      break L24;
                                    } else {
                                      if (fh.field_e != 2) {
                                        break L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  param0.field_G = param0.field_G + 14;
                                  break L23;
                                }
                              }
                              if (param0.field_F == 28) {
                                L25: {
                                  if (param0.field_db > 0) {
                                    jc.b(fh.field_e, 1, 8);
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                param0.field_D = 0;
                                param0.field_L = 12;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      L26: {
                        if (((qe) this).field_Q >= 0) {
                          stackOut_101_0 = 1;
                          stackIn_102_0 = stackOut_101_0;
                          break L26;
                        } else {
                          stackOut_100_0 = -1;
                          stackIn_102_0 = stackOut_100_0;
                          break L26;
                        }
                      }
                      L27: {
                        L28: {
                          var6 = stackIn_102_0;
                          if (28 != param0.field_F) {
                            break L28;
                          } else {
                            if (2 != fh.field_e) {
                              break L28;
                            } else {
                              param0.field_Q = param0.field_Q;
                              break L27;
                            }
                          }
                        }
                        param0.field_Q = (1 + (dk.field_a >> 1)) * (((qe) this).field_a * 10) + ((qe) this).field_Q * var6 * ((qe) this).field_a;
                        break L27;
                      }
                      L29: {
                        if (param0.field_Q >= 0) {
                          stackOut_108_0 = 1;
                          stackIn_109_0 = stackOut_108_0;
                          break L29;
                        } else {
                          stackOut_107_0 = -1;
                          stackIn_109_0 = stackOut_107_0;
                          break L29;
                        }
                      }
                      L30: {
                        var6 = stackIn_109_0;
                        if (var6 * param0.field_Q <= 128) {
                          break L30;
                        } else {
                          param0.field_Q = 128 * var6;
                          break L30;
                        }
                      }
                      L31: {
                        if (mj.field_b) {
                          param0.field_Q = param0.field_Q + (-(dk.field_a >> 1) + dk.field_a) * ((qe) this).field_a * 10;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      L32: {
                        if (!param2) {
                          break L32;
                        } else {
                          if (param0.field_Y) {
                            break L32;
                          } else {
                            L33: {
                              L34: {
                                if (28 == param0.field_F) {
                                  break L34;
                                } else {
                                  if (0 < h.field_b[3][dg.field_T[param0.field_F]][((qe) this).field_V]) {
                                    break L33;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              if (param0.field_F == 28) {
                                break L33;
                              } else {
                                break L32;
                              }
                            }
                            L35: {
                              if (5 == param0.field_F) {
                                ((qe) this).field_D = 1;
                                break L35;
                              } else {
                                param0.field_h = -8;
                                param0.field_L = 2;
                                if (!vg.a(((qe) this).field_F, -1)) {
                                  break L35;
                                } else {
                                  qa.a(((qe) this).field_o, wb.field_p.field_H, ((qe) this).field_F, (qe) this, ((qe) this).field_H, -1, 5, wb.field_p.field_o, 20, ((qe) this).field_V);
                                  break L35;
                                }
                              }
                            }
                            param0.field_Y = true;
                            break L32;
                          }
                        }
                      }
                      L36: {
                        if (param0.field_db <= 0) {
                          L37: {
                            int discarded$2 = 0;
                            kk.a(param0);
                            if (4 > dk.field_a) {
                              lj.field_b = lj.field_b + 25;
                              dk.field_a = dk.field_a + 1;
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          boolean discarded$3 = this.a((byte) -31, param0);
                          if (param0.field_cb) {
                            param0.field_O = true;
                            param0.j(false);
                            break L36;
                          } else {
                            break L36;
                          }
                        } else {
                          break L36;
                        }
                      }
                      L38: {
                        if (((qe) this).field_L != 9) {
                          ((qe) this).field_Q = ((qe) this).field_Q * 8 / 10;
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      stackOut_137_0 = 1;
                      stackIn_138_0 = stackOut_137_0;
                      break L0;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    return stackIn_30_0 != 0;
                  }
                } else {
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  return stackIn_27_0 != 0;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var4 = decompiledCaughtException;
            stackOut_139_0 = (RuntimeException) var4;
            stackOut_139_1 = new StringBuilder().append("qe.MA(");
            stackIn_141_0 = stackOut_139_0;
            stackIn_141_1 = stackOut_139_1;
            stackIn_140_0 = stackOut_139_0;
            stackIn_140_1 = stackOut_139_1;
            if (param0 == null) {
              stackOut_141_0 = (RuntimeException) (Object) stackIn_141_0;
              stackOut_141_1 = (StringBuilder) (Object) stackIn_141_1;
              stackOut_141_2 = "null";
              stackIn_142_0 = stackOut_141_0;
              stackIn_142_1 = stackOut_141_1;
              stackIn_142_2 = stackOut_141_2;
              break L39;
            } else {
              stackOut_140_0 = (RuntimeException) (Object) stackIn_140_0;
              stackOut_140_1 = (StringBuilder) (Object) stackIn_140_1;
              stackOut_140_2 = "{...}";
              stackIn_142_0 = stackOut_140_0;
              stackIn_142_1 = stackOut_140_1;
              stackIn_142_2 = stackOut_140_2;
              break L39;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_142_0, stackIn_142_2 + ',' + false + ',' + param2 + ')');
        }
        return stackIn_138_0 != 0;
    }

    private final void a(int param0, int param1, byte param2, int param3, ka param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != oj.field_b) {
                break L1;
              } else {
                oj.field_b = new ka(dd.field_m[0].field_q * 3 - -param4.field_q, ((qe) this).field_w);
                break L1;
              }
            }
            qg.a(bf.field_l);
            oj.field_b.d();
            qg.b();
            param4.a(oj.field_b.field_q >> 1, 0);
            var9 = 0;
            L2: while (true) {
              if (var9 >= 3) {
                L3: {
                  la.field_f.a(-91);
                  qg.b(bf.field_l);
                  if (((qe) this).field_a < 0) {
                    oj.field_b.a();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-param3 + param1 < 128) {
                    param3 = (param3 + param1 >> 1) - 64;
                    param1 = 128 + param3;
                    break L4;
                  } else {
                    if (oj.field_b.field_q >= param1 + -param3) {
                      break L4;
                    } else {
                      param3 = -(oj.field_b.field_q >> 1) + (param3 + param1 >> 1);
                      param1 = param3 - -oj.field_b.field_q;
                      break L4;
                    }
                  }
                }
                oj.field_b.d(param3, param0, param1 + -param3, ((qe) this).field_w);
                break L0;
              } else {
                var7_int = 192 * var9 / 2 + 64;
                var8 = (var9 + param5) % 4;
                dd.field_m[var8].d(dd.field_m[0].field_q * var9, -dd.field_m[0].field_v + ((qe) this).field_w >> 1, var7_int);
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var7;
            stackOut_17_1 = new StringBuilder().append("qe.GA(").append(param0).append(',').append(param1).append(',').append(87).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param5 + ')');
        }
    }

    private final void p() {
        ((qe) this).field_w = 96;
        ((qe) this).field_I = 64;
        int var2 = jj.a(255);
        int var3 = 5;
        ((qe) this).field_db = 3 + var2 / var3;
        ((qe) this).field_K = bf.field_f[vj.field_c];
        ((qe) this).field_M = eb.field_s[vj.field_c];
        qf.field_f = db.field_E[vj.field_c];
        int discarded$0 = 73;
        int discarded$1 = we.a(qf.field_f, ((qe) this).field_M);
        ((qe) this).field_C = ee.field_n[vj.field_c];
    }

    private final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TorChallenge.field_F ? 1 : 0;
          if (param0 == 96) {
            break L0;
          } else {
            ((qe) this).field_lb = 15;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= ea.field_g.length) {
            return;
          } else {
            if (null != ea.field_g[var2]) {
              if (ea.field_g[var2].field_Y) {
                if (ea.field_g[var2].field_F != 0) {
                  ea.field_g[var2].field_Y = false;
                  var2++;
                  continue L1;
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
    }

    private final void z() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        Object stackOut_80_0 = null;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        Object stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        L0: {
          var13 = TorChallenge.field_F ? 1 : 0;
          var2 = vj.field_c;
          var3 = pl.field_e[((qe) this).field_L];
          var4 = n.field_db[var2][var3][((qe) this).field_kb];
          var5 = ga.field_x[var2][var3][((qe) this).field_kb];
          var6 = lc.field_k[var2][var3][((qe) this).field_kb];
          if (0 >= var4) {
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
          L2: {
            var7 = stackIn_3_0;
            if (var6 >= 0) {
              break L2;
            } else {
              if (((qe) this).field_h != 0) {
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_13_0 = stackOut_5_0;
                break L1;
              }
            }
          }
          if (0 < var6) {
            if (((qe) this).field_h != 0) {
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L1;
            } else {
              stackOut_10_0 = 0;
              stackIn_13_0 = stackOut_10_0;
              break L1;
            }
          } else {
            stackOut_8_0 = 0;
            stackIn_13_0 = stackOut_8_0;
            break L1;
          }
        }
        L3: {
          L4: {
            var8 = stackIn_13_0;
            if (!((qe) this).field_c) {
              break L4;
            } else {
              if (0 <= ((qe) this).field_a) {
                break L4;
              } else {
                stackOut_15_0 = 1;
                stackIn_23_0 = stackOut_15_0;
                break L3;
              }
            }
          }
          if (((qe) this).field_N) {
            if (((qe) this).field_a > 0) {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L3;
            } else {
              stackOut_20_0 = 0;
              stackIn_23_0 = stackOut_20_0;
              break L3;
            }
          } else {
            stackOut_18_0 = 0;
            stackIn_23_0 = stackOut_18_0;
            break L3;
          }
        }
        L5: {
          var9 = stackIn_23_0;
          if (fj.field_z[var2][var3][((qe) this).field_kb]) {
            if (var9 == 0) {
              stackOut_27_0 = 0;
              stackIn_28_0 = stackOut_27_0;
              break L5;
            } else {
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              break L5;
            }
          } else {
            stackOut_24_0 = 0;
            stackIn_28_0 = stackOut_24_0;
            break L5;
          }
        }
        L6: {
          var10 = stackIn_28_0;
          if (((qe) this).field_Q * ((qe) this).field_a >= var5) {
            stackOut_30_0 = 0;
            stackIn_31_0 = stackOut_30_0;
            break L6;
          } else {
            stackOut_29_0 = 1;
            stackIn_31_0 = stackOut_29_0;
            break L6;
          }
        }
        L7: {
          var11 = stackIn_31_0;
          if (((qe) this).field_L == 10) {
            if (((qe) this).field_c) {
              if (((qe) this).field_Q > -var5) {
                ((qe) this).field_Q = ((qe) this).field_Q - var4;
                break L7;
              } else {
                if (!((qe) this).field_N) {
                  break L7;
                } else {
                  if (((qe) this).field_Q >= var5) {
                    break L7;
                  } else {
                    ((qe) this).field_Q = ((qe) this).field_Q + var4;
                    break L7;
                  }
                }
              }
            } else {
              if (!((qe) this).field_N) {
                break L7;
              } else {
                if (((qe) this).field_Q >= var5) {
                  break L7;
                } else {
                  ((qe) this).field_Q = ((qe) this).field_Q + var4;
                  break L7;
                }
              }
            }
          } else {
            L8: {
              if (var7 == 0) {
                break L8;
              } else {
                if (uf.field_k) {
                  break L8;
                } else {
                  if (var11 == 0) {
                    break L8;
                  } else {
                    L9: {
                      if (var9 != 0) {
                        break L9;
                      } else {
                        if (var10 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ((qe) this).field_Q = ((qe) this).field_Q + var4 * ((qe) this).field_a;
                    break L7;
                  }
                }
              }
            }
            L10: {
              if (var7 == 0) {
                break L10;
              } else {
                if (uf.field_k) {
                  break L10;
                } else {
                  if (var11 == 0) {
                    break L10;
                  } else {
                    ((qe) this).field_Q = ((qe) this).field_Q + ((qe) this).field_a;
                    break L7;
                  }
                }
              }
            }
            if (var7 != 0) {
              if (!uf.field_k) {
                break L7;
              } else {
                if (9 == ((qe) this).field_L) {
                  break L7;
                } else {
                  if (((qe) this).field_Q * ((qe) this).field_a > 0) {
                    ((qe) this).field_Q = ((qe) this).field_Q - ((qe) this).field_a * var4;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            } else {
              ((qe) this).field_Q = ((qe) this).field_a * (((qe) this).field_a * ((qe) this).field_Q * -var4 >> 3);
              break L7;
            }
          }
        }
        L11: {
          if (var8 == 0) {
            break L11;
          } else {
            ((qe) this).field_h = ((qe) this).field_h + var6;
            break L11;
          }
        }
        L12: {
          if (wb.field_p.field_ab) {
            if (((qe) this).field_L != 10) {
              break L12;
            } else {
              if (var2 != 2) {
                break L12;
              } else {
                if (!wb.field_p.field_ab) {
                  break L12;
                } else {
                  if (((qe) this).field_h != 1) {
                    break L12;
                  } else {
                    if (vk.field_b) {
                      break L12;
                    } else {
                      ((qe) this).field_h = ((qe) this).field_h - 23;
                      vk.field_b = true;
                      break L12;
                    }
                  }
                }
              }
            }
          } else {
            if (((qe) this).field_L != 10) {
              break L12;
            } else {
              if (var2 != 2) {
                break L12;
              } else {
                if (!wb.field_p.field_ab) {
                  break L12;
                } else {
                  if (((qe) this).field_h != 1) {
                    break L12;
                  } else {
                    if (vk.field_b) {
                      break L12;
                    } else {
                      ((qe) this).field_h = ((qe) this).field_h - 23;
                      vk.field_b = true;
                      break L12;
                    }
                  }
                }
              }
            }
          }
        }
        L13: {
          stackOut_76_0 = this;
          stackOut_76_1 = 1;
          stackIn_78_0 = stackOut_76_0;
          stackIn_78_1 = stackOut_76_1;
          stackIn_77_0 = stackOut_76_0;
          stackIn_77_1 = stackOut_76_1;
          if (10 != ((qe) this).field_L) {
            stackOut_78_0 = this;
            stackOut_78_1 = stackIn_78_1;
            stackOut_78_2 = 1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            stackIn_79_2 = stackOut_78_2;
            break L13;
          } else {
            stackOut_77_0 = this;
            stackOut_77_1 = stackIn_77_1;
            stackOut_77_2 = 0;
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_79_2 = stackOut_77_2;
            break L13;
          }
        }
        this.a(stackIn_79_1 != 0, stackIn_79_2 != 0);
        if (((qe) this).field_Q == 0) {
          return;
        } else {
          L14: {
            stackOut_80_0 = this;
            stackIn_82_0 = stackOut_80_0;
            stackIn_81_0 = stackOut_80_0;
            if (-10 != ((qe) this).field_L) {
              stackOut_82_0 = this;
              stackOut_82_1 = 1;
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              break L14;
            } else {
              stackOut_81_0 = this;
              stackOut_81_1 = 0;
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              break L14;
            }
          }
          L15: {
            stackOut_83_0 = this;
            stackOut_83_1 = stackIn_83_1;
            stackOut_83_2 = -127;
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_85_2 = stackOut_83_2;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            stackIn_84_2 = stackOut_83_2;
            if (-11 != ((qe) this).field_L) {
              stackOut_85_0 = this;
              stackOut_85_1 = stackIn_85_1;
              stackOut_85_2 = stackIn_85_2;
              stackOut_85_3 = 1;
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              stackIn_86_3 = stackOut_85_3;
              break L15;
            } else {
              stackOut_84_0 = this;
              stackOut_84_1 = stackIn_84_1;
              stackOut_84_2 = stackIn_84_2;
              stackOut_84_3 = 0;
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              stackIn_86_3 = stackOut_84_3;
              break L15;
            }
          }
          L16: {
            if (this.a(stackIn_86_1 != 0, (byte) stackIn_86_2, stackIn_86_3 == 0)) {
              break L16;
            } else {
              ((qe) this).field_Q = 0;
              break L16;
            }
          }
          return;
        }
    }

    private final void l(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          var2 = vj.field_c;
          if (!((qe) this).field_ib) {
            gl.field_f = false;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (!((qe) this).field_c) {
                break L3;
              } else {
                if (((qe) this).field_a < 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (!((qe) this).field_N) {
                break L4;
              } else {
                if (((qe) this).field_a <= 0) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L1;
        }
        L5: {
          var3 = stackIn_11_0;
          if (wk.field_F != 17) {
            break L5;
          } else {
            if (ti.field_d != 9) {
              break L5;
            } else {
              if (!((qe) this).field_j) {
                break L5;
              } else {
                tk.field_P = true;
                break L5;
              }
            }
          }
        }
        L6: {
          if (!tk.field_P) {
            break L6;
          } else {
            L7: {
              if (!((qe) this).field_j) {
                break L7;
              } else {
                if (0 == ((qe) this).field_Q) {
                  break L7;
                } else {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
            }
            tk.field_P = false;
            ti.field_d = 0;
            break L6;
          }
        }
        L8: {
          if (bd.field_l) {
            bd.field_l = false;
            break L8;
          } else {
            break L8;
          }
        }
        if (!tk.field_P) {
          L9: {
            L10: {
              if (((qe) this).field_ib) {
                L11: {
                  if (var3 == 0) {
                    break L11;
                  } else {
                    if (!((qe) this).field_n) {
                      break L11;
                    } else {
                      if (!ch.field_a[var2][pl.field_e[9]]) {
                        break L11;
                      } else {
                        if (gl.field_f) {
                          break L11;
                        } else {
                          ((qe) this).field_L = 9;
                          ti.field_d = 9;
                          this.H(9);
                          ((qe) this).field_kb = 0;
                          break L9;
                        }
                      }
                    }
                  }
                }
                if (((qe) this).field_L != 0) {
                  break L10;
                } else {
                  ((qe) this).field_L = 3;
                  ti.field_d = 3;
                  this.H(9);
                  ((qe) this).field_kb = 0;
                  break L9;
                }
              } else {
                L12: {
                  if (((qe) this).field_lb > 0) {
                    break L12;
                  } else {
                    if (!this.c((byte) 88, false)) {
                      break L12;
                    } else {
                      if (((qe) this).field_L != 0) {
                        break L12;
                      } else {
                        if (!((qe) this).field_n) {
                          ij.field_z = true;
                          rj.field_d = k.field_h;
                          break L9;
                        } else {
                          ((qe) this).field_Q = 0;
                          ((qe) this).field_lb = 10;
                          ((qe) this).field_D = 0;
                          ((qe) this).field_L = 19;
                          ((qe) this).field_h = 0;
                          break L9;
                        }
                      }
                    }
                  }
                }
                if (!((qe) this).field_n) {
                  break L10;
                } else {
                  if (((qe) this).field_c) {
                    break L10;
                  } else {
                    if (((qe) this).field_N) {
                      break L10;
                    } else {
                      if (cl.field_z) {
                        break L10;
                      } else {
                        if (0 == ((qe) this).field_L) {
                          L13: {
                            if (2 != var2) {
                              ((qe) this).field_w = 32;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          cl.field_z = true;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L9;
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        L0: {
          var17 = TorChallenge.field_F ? 1 : 0;
          if (((qe) this).field_a >= 0) {
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
          var6 = stackIn_3_0;
          var7 = lh.field_q[fh.field_e];
          var8 = lh.field_C[fh.field_e];
          if (we.field_j < 0) {
            we.field_j = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (oa.field_g >= 0) {
            break L2;
          } else {
            oa.field_g = 0;
            break L2;
          }
        }
        L3: {
          param0 = -(var8 - ((qe) this).field_I >> 1);
          var9 = ok.field_c[we.field_j][fh.field_e];
          if (we.field_j == 15) {
            var11 = ef.field_i[((qe) this).field_L][fh.field_e];
            var12_int = ga.field_s[fh.field_e][var11];
            if (((qe) this).field_kb != var12_int - 1) {
              break L3;
            } else {
              L4: {
                var13 = tj.field_c[0] << 3;
                var14 = tj.field_c[1] << 3;
                var15 = param4 + param0;
                var16 = ki.field_e[dg.field_T[24]];
                if (var6 != 0) {
                  var15 = var15 + (-var16 + -var13 + ((qe) this).field_I);
                  break L4;
                } else {
                  var15 = var15 + var13;
                  break L4;
                }
              }
              if (var6 == 0) {
                dj.field_O.d(var15, param1 + var14, var16 * var8 / ((qe) this).field_I, ae.field_s[dg.field_T[24]]);
                break L3;
              } else {
                L5: {
                  if (cb.field_f == null) {
                    cb.field_f = new ka(ki.field_e[dg.field_T[24]], ae.field_s[dg.field_T[24]]);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                cb.field_f.d();
                qg.b();
                dj.field_O.d(0, 0);
                la.field_f.a(126);
                cb.field_f.d(var15, param1 - -var14, var8 * var16 / ((qe) this).field_I, ae.field_s[dg.field_T[24]]);
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L6: {
          if (0 > var9) {
            stackOut_22_0 = 0;
            stackIn_23_0 = stackOut_22_0;
            break L6;
          } else {
            stackOut_21_0 = 1;
            stackIn_23_0 = stackOut_21_0;
            break L6;
          }
        }
        L7: {
          var10 = stackIn_23_0;
          if (var6 == 0) {
            break L7;
          } else {
            qg.a(bf.field_l);
            vd.field_d[fh.field_e].d();
            qg.b();
            g.field_i[we.field_j][fh.field_e][oa.field_g].d(0, 0);
            la.field_f.a(123);
            qg.b(bf.field_l);
            break L7;
          }
        }
        L8: {
          L9: {
            if (((qe) this).field_G <= 0) {
              break L9;
            } else {
              if (we.field_j != 7) {
                L10: {
                  L11: {
                    var11 = ((qe) this).field_G;
                    var12_int = 10;
                    if (fh.field_e == 1) {
                      break L11;
                    } else {
                      if (fh.field_e == 2) {
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var12_int = 24;
                  break L10;
                }
                L12: {
                  var13 = var12_int >> 1;
                  var14 = 0;
                  var15 = 64;
                  if (~var12_int <= ~var11) {
                    break L12;
                  } else {
                    var11 = var12_int;
                    break L12;
                  }
                }
                L13: {
                  if (var13 >= var11) {
                    var14 = var15 + (-var11 + var13) * (256 + -var15) / var13;
                    break L13;
                  } else {
                    var14 = (var11 - var12_int) * (-var15 + 256) / var13 + 256;
                    break L13;
                  }
                }
                L14: {
                  var16 = 16711680;
                  qg.a(bf.field_l);
                  jl.field_a[fh.field_e].d();
                  qg.b();
                  if (var6 != 0) {
                    vd.field_d[fh.field_e].d(0, 0, var8, var7);
                    break L14;
                  } else {
                    g.field_i[we.field_j][fh.field_e][oa.field_g].d(0, 0, var8, var7);
                    break L14;
                  }
                }
                la.field_f.a(106);
                qg.b(bf.field_l);
                jl.field_a[fh.field_e].a(param0 + param4, param1, var14, var16);
                break L8;
              } else {
                break L9;
              }
            }
          }
          if (we.field_j != 7) {
            if (var6 == 0) {
              g.field_i[we.field_j][fh.field_e][oa.field_g].d(param0 + param4, param1, var8, var7);
              break L8;
            } else {
              vd.field_d[fh.field_e].d(param0 + param4, param1, var8, var7);
              break L8;
            }
          } else {
            L15: {
              jl.field_a[fh.field_e].d();
              qg.b();
              if (var6 == 0) {
                g.field_i[we.field_j][fh.field_e][oa.field_g].d(0, 0, var8, var7);
                break L15;
              } else {
                vd.field_d[fh.field_e].d(0, 0, var8, var7);
                break L15;
              }
            }
            la.field_f.a(124);
            this.a(jl.field_a[fh.field_e], param1, param0 + param4, 89);
            break L8;
          }
        }
        L16: {
          if (var10 != 0) {
            L17: {
              var11 = 192;
              if (fh.field_e != 0) {
                break L17;
              } else {
                if (!ra.field_q) {
                  break L17;
                } else {
                  if (ql.field_n > 0) {
                    var11 = ql.field_n * 192 / 25;
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
            }
            L18: {
              if (fh.field_e != 0) {
                break L18;
              } else {
                if (!ra.field_q) {
                  break L18;
                } else {
                  if (ql.field_n != 0) {
                    break L18;
                  } else {
                    break L16;
                  }
                }
              }
            }
            if (var6 == 0) {
              si.field_I[fh.field_e][var9][oa.field_g].d(param4 - -param0, param1, var8, var7, var11);
              break L16;
            } else {
              L19: {
                L20: {
                  var12_int = ol.field_e[fh.field_e][0];
                  var13 = ol.field_e[fh.field_e][0];
                  if (gj.field_b == null) {
                    break L20;
                  } else {
                    if (~var12_int != ~gj.field_b.field_q) {
                      break L20;
                    } else {
                      if (~var13 != ~gj.field_b.field_v) {
                        break L20;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                gj.field_b = new ka(var12_int, var13);
                break L19;
              }
              qg.a(bf.field_l);
              gj.field_b.d();
              qg.b();
              si.field_I[fh.field_e][var9][oa.field_g].d(0, 0);
              la.field_f.a(-67);
              qg.b(bf.field_l);
              gj.field_b.d(param0 + param4, param1, var8, var7, var11);
              break L16;
            }
          } else {
            break L16;
          }
        }
        L21: {
          var11 = 1;
          if (we.field_j == 14) {
            var12 = ca.field_a[oa.field_g];
            if (var12 == null) {
              return;
            } else {
              L22: {
                var13 = var12[0] << 3;
                var14 = var12[1] << 3;
                var15 = param4 - -param0;
                var16 = ki.field_e[dg.field_T[23]];
                if (((qe) this).field_a >= 0) {
                  var15 = var15 + var13;
                  break L22;
                } else {
                  var15 = var15 + (-var16 + (-var13 + ((qe) this).field_I));
                  break L22;
                }
              }
              nd.a(-996593372, var15, param1 - -var14);
              break L21;
            }
          } else {
            break L21;
          }
        }
    }

    private final void i(boolean param0) {
        ((qe) this).field_u = 256;
        ((qe) this).field_B = 0;
        ((qe) this).field_o = ((qe) this).field_r;
        ((qe) this).field_H = ((qe) this).field_f;
        ((qe) this).field_L = 0;
        ((qe) this).field_h = 0;
        ((qe) this).field_Q = 0;
        ((qe) this).field_e = ((qe) this).field_o * 32 - -(32 * ((qe) this).field_B / 256);
        ((qe) this).field_z = ((qe) this).field_u * 64 / 256 + 64 * ((qe) this).field_H;
    }

    qe(int param0, int param1, int param2, int param3) {
        L0: {
          ((qe) this).field_q = false;
          ((qe) this).field_O = false;
          ((qe) this).field_S = false;
          ((qe) this).field_jb = true;
          ((qe) this).field_k = false;
          ((qe) this).field_P = 0;
          ((qe) this).field_mb = false;
          ((qe) this).field_fb = false;
          ((qe) this).field_hb = 0;
          ((qe) this).field_K = 0;
          ((qe) this).field_t = false;
          ((qe) this).field_x = -1;
          ((qe) this).field_v = false;
          ((qe) this).field_M = 0;
          ((qe) this).field_T = false;
          ((qe) this).field_cb = false;
          ((qe) this).field_g = 0;
          ((qe) this).field_m = false;
          ((qe) this).field_eb = false;
          ((qe) this).field_gb = false;
          ((qe) this).field_C = 1;
          if (-1 == param0) {
            break L0;
          } else {
            if (-1 != param1) {
              L1: {
                ((qe) this).field_o = param0;
                ((qe) this).field_B = 0;
                ((qe) this).field_H = param1;
                ((qe) this).field_f = param1;
                ((qe) this).field_Q = 0;
                ((qe) this).field_F = param2;
                ((qe) this).field_h = 0;
                ((qe) this).field_r = param0;
                ((qe) this).field_u = 0;
                ((qe) this).field_V = param3;
                ((qe) this).field_u = 256;
                this.c(true);
                ((qe) this).field_z = param1 * 64 - -(((qe) this).field_u * 64 / 256);
                ((qe) this).field_e = ((qe) this).field_B * 32 / 256 + param0 * 32;
                if (param2 == 0) {
                  int discarded$1 = 25;
                  this.p();
                  break L1;
                } else {
                  if (param2 != 28) {
                    if (!vg.a(param2, -1)) {
                      if (param2 < 8) {
                        break L1;
                      } else {
                        if (param2 >= 21) {
                          break L1;
                        } else {
                          ((qe) this).field_w = 64;
                          ((qe) this).field_Z = true;
                          ((qe) this).field_I = 64;
                          if (param2 != 15) {
                            if (param2 != 20) {
                              break L1;
                            } else {
                              vk.field_i = (qe) this;
                              ((qe) this).field_Z = true;
                              ((qe) this).field_I = 128;
                              ((qe) this).field_w = 128;
                              break L1;
                            }
                          } else {
                            ((qe) this).field_nb = true;
                            break L1;
                          }
                        }
                      }
                    } else {
                      L2: {
                        this.a(param2, 93);
                        if (7 == param2) {
                          break L2;
                        } else {
                          if (param2 != 22) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      ((qe) this).field_f = -1;
                      break L1;
                    }
                  } else {
                    this.h(true);
                    break L1;
                  }
                }
              }
              ((qe) this).field_b = 0;
              ((qe) this).field_a = 1;
              ((qe) this).field_Y = false;
              ((qe) this).field_d = ((qe) this).field_db;
              return;
            } else {
              break L0;
            }
          }
        }
        ((qe) this).field_f = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[256];
    }
}
