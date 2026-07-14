/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    int field_b;
    boolean field_t;
    int field_c;
    bd[] field_h;
    boolean field_i;
    boolean field_m;
    boolean field_n;
    int field_k;
    private qn field_f;
    boolean field_a;
    int field_l;
    private int field_g;
    static String field_r;
    qi field_p;
    int field_s;
    int field_e;
    private int field_j;
    private qn field_d;
    private int field_q;
    static String field_o;

    final void a(boolean param0, int param1, int param2) {
        if (param1 != 26206) {
            ((jb) this).g((byte) 95);
        }
        ((jb) this).field_p.a(param0, 0, param2, this.a((byte) -118, ld.field_l, jh.field_R));
    }

    final void d(byte param0) {
        this.j(0);
        this.f(120);
        if (param0 > -47) {
            ((jb) this).a(108);
        }
    }

    final void g(byte param0) {
        int var3 = Confined.field_J ? 1 : 0;
        ec.a((jb) this, 0);
        if (nm.e((byte) -96)) {
            if (!(13 != gk.field_r)) {
                this.e((byte) -126);
                kc.field_o = false;
                ei.a(param0 + -238, false);
                return;
            }
            ((jb) this).field_p.c(param0 ^ -119);
            // ifeq L9
            return;
        }
        ((jb) this).field_p.a(true, this.a((byte) -118, wm.field_hb, m.field_a), this.a((byte) -118, ld.field_l, jh.field_R));
        int var2 = this.b(param0 ^ -22, true) ? 1 : 0;
        if (param0 != 118) {
            boolean discarded$0 = this.d(-22, true);
        }
        if (!(var2 == 0)) {
            return;
        }
        if (0 != rh.field_X) {
            int discarded$1 = this.a(true, (byte) 116);
        }
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = Confined.field_J ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            ((jb) this).a(104);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (-3 >= (var2 ^ -1)) {
            L2: {
              if (-1 != (((jb) this).field_e ^ -1)) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            return stackIn_13_0 != 0;
          } else {
            if (((jb) this).field_e != -1) {
              if (-15 <= ((jb) this).field_e) {
                ((jb) this).field_e = (((jb) this).field_e - -1) % 28;
                var2++;
                continue L1;
              } else {
                ((jb) this).field_e = ((jb) this).field_e - 1;
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

    final void b(byte param0) {
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        ec.a((jb) this, param0 ^ 68);
        L0: while (true) {
          if (!nm.e((byte) -96)) {
            L1: {
              if (param0 == 68) {
                break L1;
              } else {
                ((jb) this).field_q = -126;
                break L1;
              }
            }
            ((jb) this).field_p.a(true, this.a((byte) -118, wm.field_hb, m.field_a), this.a((byte) -118, ld.field_l, jh.field_R));
            if (!this.d(param0 + -150, true)) {
              return;
            } else {
              return;
            }
          } else {
            ((jb) this).field_p.c(-1);
            if (this.d(-98, false)) {
              return;
            } else {
              continue L0;
            }
          }
        }
    }

    private final void k(int param0) {
        if (((jb) this).field_q < param0) {
            ((jb) this).field_q = ((jb) this).field_q + 1;
            this.e((byte) -124);
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        bd var5 = null;
        int var6 = 0;
        L0: {
          var6 = Confined.field_J ? 1 : 0;
          if (param0 == -118) {
            break L0;
          } else {
            ((jb) this).g((byte) 99);
            break L0;
          }
        }
        param1 += 0;
        var4 = 0;
        L1: while (true) {
          if (((jb) this).field_p.field_k <= var4) {
            return -1;
          } else {
            var5 = ((jb) this).field_h[var4];
            if (param1 >= var5.field_j) {
              if (param1 < var5.field_f + var5.field_j) {
                if (var5.field_b <= param2) {
                  if (param2 < var5.field_b + var5.field_i) {
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
          }
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        bd var6 = null;
        String var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var8 = Confined.field_J ? 1 : 0;
        if (-15 == ((jb) this).field_e) {
          L0: {
            if (-1 < ((jb) this).field_q) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_5_0;
            if (8 <= ((jb) this).field_q) {
              stackOut_7_0 = ((jb) this).field_p.field_k + -1;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = ((jb) this).field_p.field_k;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var3 = stackIn_8_0;
            if (param0 == 0) {
              break L2;
            } else {
              ((jb) this).field_h = null;
              break L2;
            }
          }
          var4 = var2;
          L3: while (true) {
            if (var4 >= var3) {
              return;
            } else {
              L4: {
                var5 = 9805732;
                if (((jb) this).field_p.field_i != var4) {
                  dn.a(((jb) this).field_h[var4].field_f, 0 + ((jb) this).field_h[var4].field_j, ((jb) this).field_h[var4].field_b, ah.field_T, 208, -7992, ((jb) this).field_h[var4].field_i);
                  break L4;
                } else {
                  dn.a(((jb) this).field_h[var4].field_f, 0 + ((jb) this).field_h[var4].field_j, ((jb) this).field_h[var4].field_b, lh.field_c, 208, param0 ^ -7992, ((jb) this).field_h[var4].field_i);
                  var5 = 16777215;
                  break L4;
                }
              }
              var6 = ((jb) this).field_h[var4];
              var7 = var6.field_a;
              int discarded$1 = pn.field_a.a(var7, var6.field_j - 0, var6.field_b, var6.field_f, var6.field_i, var5, -1, 1, 1, 1);
              var4++;
              continue L3;
            }
          }
        } else {
          return;
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (((jb) this).field_e >= 14) {
          if (14 >= ((jb) this).field_e) {
            var2 = -5 / ((param0 - -48) / 34);
            fn.b(0 + (((jb) this).field_s - -4), ((jb) this).field_c - -4, ((jb) this).field_k + -8, -8 + ((jb) this).field_b, 0, 150);
            di.a(((jb) this).field_b, cj.field_a, (byte) -49, ((jb) this).field_s - 0, ((jb) this).field_k, ((jb) this).field_c);
            return;
          } else {
            var2 = 28 - ((jb) this).field_e;
            if (var2 <= 0) {
              return;
            } else {
              var3 = ((jb) this).field_b * 18 / (var2 + 4);
              var4 = (1 + var2) * (var2 - -1) * ((jb) this).field_k / 225;
              var5 = ((jb) this).field_s - -((-var4 + ((jb) this).field_k) / 2);
              var6 = (((jb) this).field_b + -var3) / 2 + ((jb) this).field_c;
              fn.b(var5 - -4, 4 + var6, var4 - 8, var3 + -8, 0, 150);
              di.a(var3, cj.field_a, (byte) -94, var5, var4, var6);
              return;
            }
          }
        } else {
          var2 = ((jb) this).field_e;
          if (var2 <= 0) {
            return;
          } else {
            var3 = (1 + var2) * ((jb) this).field_b * (var2 - -1) / 225;
            var4 = ((jb) this).field_k * 18 / (4 + var2);
            var5 = (-var4 + ((jb) this).field_k) / 2 + ((jb) this).field_s;
            var6 = (-var3 + ((jb) this).field_b) / 2 + ((jb) this).field_c;
            fn.b(var5 + 4, 4 + var6, -8 + var4, -8 + var3, 0, 150);
            di.a(var3, cj.field_a, (byte) -56, var5, var4, var6);
            return;
          }
        }
    }

    private final void f(int param0) {
        this.e(-5);
        if (((jb) this).field_e != 14) {
            return;
        }
        pn.field_a.a(1 + ((jb) this).field_q + "/" + 9, 560, 312, 16777215, -1);
        if (param0 < 76) {
            return;
        }
        fj.a(((jb) this).field_q, -126);
    }

    final void f(byte param0) {
        qn var2 = null;
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        String[] var6_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var17 = null;
        ce stackIn_31_0 = null;
        ce stackIn_32_0 = null;
        ce stackIn_33_0 = null;
        String stackIn_33_1 = null;
        ce stackIn_38_0 = null;
        ce stackIn_39_0 = null;
        ce stackIn_40_0 = null;
        String stackIn_40_1 = null;
        ce stackOut_30_0 = null;
        ce stackOut_32_0 = null;
        String stackOut_32_1 = null;
        ce stackOut_31_0 = null;
        String stackOut_31_1 = null;
        ce stackOut_37_0 = null;
        ce stackOut_39_0 = null;
        String stackOut_39_1 = null;
        ce stackOut_38_0 = null;
        String stackOut_38_1 = null;
        L0: {
          var13 = Confined.field_J ? 1 : 0;
          this.a((byte) -120);
          if (param0 == 62) {
            break L0;
          } else {
            this.b(20);
            break L0;
          }
        }
        if (((jb) this).field_e == 14) {
          L1: {
            if (al.field_d != 1) {
              L2: {
                if (null != ((jb) this).field_f) {
                  break L2;
                } else {
                  if (tj.a(true)) {
                    break L2;
                  } else {
                    ((jb) this).field_f = om.a(0, 1, 3, 10, (byte) -30);
                    break L2;
                  }
                }
              }
              var2 = ((jb) this).field_f;
              break L1;
            } else {
              L3: {
                if (null != ((jb) this).field_d) {
                  break L3;
                } else {
                  if (!tj.a(true)) {
                    ((jb) this).field_d = om.a(1, 1, 3, 10, (byte) -30);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = ((jb) this).field_d;
              break L1;
            }
          }
          var3 = pc.a(h.field_W, var2, 113, lc.field_J);
          pn.field_a.c(gh.field_b, 125, 29 + ((jb) this).field_c, 4243584, -1);
          pn.field_a.a(tk.field_d, 400, 29 - -((jb) this).field_c, 4243584, -1);
          pn.field_a.a(e.field_d, 545, ((jb) this).field_c + 29, 4243584, -1);
          var4_int = 0;
          L4: while (true) {
            if (var4_int >= 10) {
              L5: {
                var4 = km.field_b;
                var5 = 1;
                if (var2 != null) {
                  if (!var2.field_t) {
                    var4 = hm.field_W;
                    break L5;
                  } else {
                    L6: {
                      if (var2.field_u != null) {
                        var6_ref_String__ = var2.field_u[h.field_W];
                        var17 = var2.field_q[h.field_W];
                        var8 = 0;
                        L7: while (true) {
                          if ((var8 ^ -1) <= -11) {
                            break L6;
                          } else {
                            if (var6_ref_String__[var8] != null) {
                              L8: {
                                var4 = null;
                                var9 = 9805732;
                                var10 = var17[var8];
                                var11 = var10 / 25;
                                var12 = 1 + var10 % 25;
                                if (var8 != var3) {
                                  break L8;
                                } else {
                                  var9 = 16777215;
                                  break L8;
                                }
                              }
                              L9: {
                                pn.field_a.c(ok.a(var6_ref_String__[var8]), 125, 54 + (((jb) this).field_c - -(var8 * 20)), var9, -1);
                                stackOut_30_0 = pn.field_a;
                                stackIn_32_0 = stackOut_30_0;
                                stackIn_31_0 = stackOut_30_0;
                                if ((var12 ^ -1) != -26) {
                                  stackOut_32_0 = (ce) (Object) stackIn_32_0;
                                  stackOut_32_1 = Integer.toString(var12);
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  break L9;
                                } else {
                                  stackOut_31_0 = (ce) (Object) stackIn_31_0;
                                  stackOut_31_1 = kc.field_q;
                                  stackIn_33_0 = stackOut_31_0;
                                  stackIn_33_1 = stackOut_31_1;
                                  break L9;
                                }
                              }
                              ((ce) (Object) stackIn_33_0).a(stackIn_33_1, 400, ((jb) this).field_c + 54 - -(20 * var8), var9, -1);
                              pn.field_a.a(Integer.toString(var11), 545, 20 * var8 + ((jb) this).field_c + 54, var9, -1);
                              var8++;
                              continue L7;
                            } else {
                              var8++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        var4 = kl.field_H;
                        break L6;
                      }
                    }
                    if ((var3 ^ -1) <= -1) {
                      break L5;
                    } else {
                      if (null == lc.field_J) {
                        break L5;
                      } else {
                        if (var2.field_w != lc.field_J.field_r) {
                          break L5;
                        } else {
                          L10: {
                            pn.field_a.c(ok.a(qc.field_m), 125, 259 + ((jb) this).field_c, 16777215, -1);
                            var6 = lc.field_J.field_s[0];
                            var7 = var6 / 25;
                            var8 = var6 % 25 - -1;
                            stackOut_37_0 = pn.field_a;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            if (25 == var8) {
                              stackOut_39_0 = (ce) (Object) stackIn_39_0;
                              stackOut_39_1 = kc.field_q;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              break L10;
                            } else {
                              stackOut_38_0 = (ce) (Object) stackIn_38_0;
                              stackOut_38_1 = Integer.toString(var8);
                              stackIn_40_0 = stackOut_38_0;
                              stackIn_40_1 = stackOut_38_1;
                              break L10;
                            }
                          }
                          ((ce) (Object) stackIn_40_0).a(stackIn_40_1, 400, ((jb) this).field_c + 259, 16777215, -1);
                          pn.field_a.a(Integer.toString(var7), 545, ((jb) this).field_c + 259, 16777215, -1);
                          var5 = 0;
                          break L5;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
              L11: {
                if (var4 == null) {
                  break L11;
                } else {
                  pn.field_a.b(var4, 320, 144 + ((jb) this).field_c, 4243584, -1);
                  break L11;
                }
              }
              L12: {
                if (tj.a(true)) {
                  pn.field_a.b(oc.field_b, 320, ((jb) this).field_c + 259, 4243584, -1);
                  break L12;
                } else {
                  if (var5 == 0) {
                    break L12;
                  } else {
                    pn.field_a.b(sg.field_s, 320, 259 + ((jb) this).field_c, 4243584, -1);
                    break L12;
                  }
                }
              }
              return;
            } else {
              L13: {
                var5 = 4243584;
                if (var3 != var4_int) {
                  break L13;
                } else {
                  var5 = 16777215;
                  break L13;
                }
              }
              pn.field_a.a(var4_int - -1 + ".", 115, ((jb) this).field_c + var4_int * 20 + 54, var5, -1);
              var4_int++;
              continue L4;
            }
          }
        } else {
          return;
        }
    }

    final void i(int param0) {
        int var3 = Confined.field_J ? 1 : 0;
        ec.a((jb) this, param0 + 1);
        if (nm.e((byte) -96)) {
            if (gk.field_r == 13) {
                if (!(!((jb) this).field_a)) {
                    this.e((byte) -128);
                    ac.a(false);
                    return;
                }
            }
            ((jb) this).field_p.c(-1);
            // ifeq L11
            return;
        }
        if (param0 != -1) {
            int discarded$0 = this.a(true, (byte) -54);
        }
        ((jb) this).field_p.a(true, this.a((byte) -118, wm.field_hb, m.field_a), this.a((byte) -118, ld.field_l, jh.field_R));
        boolean discarded$1 = this.a(0, true);
    }

    final void b(boolean param0, byte param1) {
        if (param1 >= -114) {
            int discarded$0 = this.a(false, (byte) -46);
        }
        ((jb) this).field_p.a(this.a((byte) -118, ld.field_l, jh.field_R), param0, -110);
    }

    private final void b(int param0) {
        if (param0 != 320) {
            return;
        }
        if (!(-1 <= (((jb) this).field_q ^ -1))) {
            ((jb) this).field_q = ((jb) this).field_q - 1;
            this.e((byte) -124);
        }
    }

    final void h(int param0) {
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (param0 == 3678) {
          ec.a((jb) this, 0);
          L0: while (true) {
            if (!nm.e((byte) -96)) {
              ((jb) this).field_p.a(true, this.a((byte) -118, wm.field_hb, m.field_a), this.a((byte) -118, ld.field_l, jh.field_R));
              boolean discarded$1 = this.c(param0 + -3795, true);
              return;
            } else {
              if (gk.field_r == 13) {
                this.e((byte) -126);
                bj.field_m = false;
                ei.a(param0 ^ -3649, false);
                return;
              } else {
                L1: {
                  if (!tj.a(true)) {
                    L2: {
                      L3: {
                        ((jb) this).field_p.h((byte) -128);
                        if (((jb) this).field_p.field_i == 0) {
                          break L3;
                        } else {
                          if (1 != ((jb) this).field_p.field_i) {
                            L4: {
                              if (96 != gk.field_r) {
                                break L4;
                              } else {
                                h.field_W = (3 + (h.field_W - 1)) % 3;
                                ((jb) this).field_p.a(h.field_W + 2, -1);
                                this.e((byte) -123);
                                ((jb) this).field_p.field_b = false;
                                break L4;
                              }
                            }
                            if ((gk.field_r ^ -1) == -98) {
                              h.field_W = (1 + h.field_W) % 3;
                              ((jb) this).field_p.a(2 - -h.field_W, param0 + -3679);
                              this.e((byte) -125);
                              ((jb) this).field_p.field_b = false;
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (96 == gk.field_r) {
                          break L5;
                        } else {
                          if ((gk.field_r ^ -1) == -98) {
                            break L5;
                          } else {
                            break L2;
                          }
                        }
                      }
                      al.field_d = al.field_d ^ 1;
                      ((jb) this).field_p.a(al.field_d, param0 + -3679);
                      this.e((byte) -128);
                      ((jb) this).field_p.field_b = false;
                      break L2;
                    }
                    L6: {
                      if (-99 != (gk.field_r ^ -1)) {
                        break L6;
                      } else {
                        if (2 <= ((jb) this).field_p.field_i) {
                          if (-6 < (((jb) this).field_p.field_i ^ -1)) {
                            ((jb) this).field_p.a(al.field_d, -1);
                            break L6;
                          } else {
                            if ((((jb) this).field_p.field_i ^ -1) == -6) {
                              ((jb) this).field_p.a(h.field_W + 2, -1);
                              break L6;
                            } else {
                              ((jb) this).field_p.a(-1 + ((jb) this).field_p.field_i, -1);
                              break L6;
                            }
                          }
                        } else {
                          ((jb) this).field_p.a(((jb) this).field_p.field_k - 1, param0 + -3679);
                          break L6;
                        }
                      }
                    }
                    if (-100 != gk.field_r) {
                      break L1;
                    } else {
                      L7: {
                        if (-1 > ((jb) this).field_p.field_i) {
                          break L7;
                        } else {
                          if (((jb) this).field_p.field_k - 1 != ((jb) this).field_p.field_i) {
                            if ((((jb) this).field_p.field_i ^ -1) > -3) {
                              ((jb) this).field_p.a(2 + h.field_W, param0 + -3679);
                              break L1;
                            } else {
                              if (((jb) this).field_p.field_i >= 5) {
                                ((jb) this).field_p.a(1 + ((jb) this).field_p.field_i, -1);
                                break L1;
                              } else {
                                ((jb) this).field_p.a(5, param0 + -3679);
                                break L1;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      ((jb) this).field_p.a(al.field_d, param0 + -3679);
                      break L1;
                    }
                  } else {
                    ((jb) this).field_p.c(-1);
                    break L1;
                  }
                }
                if (!this.c(-117, false)) {
                  continue L0;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        this.e(-82);
        if (param0 >= -113) {
            boolean discarded$0 = this.a(19, false);
        }
        if (!(-15 == (((jb) this).field_e ^ -1))) {
            return;
        }
        this.d(36);
    }

    private final void c(byte param0) {
        int var2 = 0;
        if (param0 <= 124) {
            this.e((byte) -109);
        }
        if (!(!((jb) this).field_p.field_b)) {
            var2 = 128;
            if (!(-1 < (((jb) this).field_p.field_i ^ -1))) {
                var2 = 256 * (((jb) this).field_h[((jb) this).field_p.field_i].field_f / 2 + ((jb) this).field_h[((jb) this).field_p.field_i].field_j) / 640;
            }
            cj.a(12, 50, 2, ae.field_f, var2);
        }
    }

    private final boolean a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var3 = -1;
          if (0 > ((jb) this).field_p.field_i) {
            break L0;
          } else {
            var3 = ((jb) this).field_h[((jb) this).field_p.field_i].field_d;
            break L0;
          }
        }
        L1: {
          if (-1 > ((jb) this).field_q) {
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
          var4 = stackIn_5_0;
          if (-9 > ((jb) this).field_q) {
            stackOut_7_0 = ((jb) this).field_p.field_k;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = ((jb) this).field_p.field_k - 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_8_0;
          if (((jb) this).field_p.field_i < var4) {
            break L3;
          } else {
            if (var5 > ((jb) this).field_p.field_i) {
              this.c((byte) 126);
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          L5: {
            if ((var3 ^ -1) == -15) {
              break L5;
            } else {
              if (param0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          if (!((jb) this).field_p.d((byte) 55)) {
            break L4;
          } else {
            gh.field_k = false;
            da.field_e.b(param0, (byte) -123);
            this.e((byte) -120);
            return true;
          }
        }
        L6: {
          if (param1 > 17) {
            break L6;
          } else {
            ((jb) this).field_k = -19;
            break L6;
          }
        }
        L7: {
          if ((var3 ^ -1) != -21) {
            if (var3 != 21) {
              break L7;
            } else {
              if (!((jb) this).field_p.d((byte) 55)) {
                break L7;
              } else {
                this.k(8);
                break L7;
              }
            }
          } else {
            if (var3 != 21) {
              break L7;
            } else {
              if (!((jb) this).field_p.d((byte) 55)) {
                break L7;
              } else {
                this.k(8);
                break L7;
              }
            }
          }
        }
        return false;
    }

    private final boolean c(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          this.c((byte) 125);
          var3 = -1;
          if (0 <= ((jb) this).field_p.field_i) {
            var3 = ((jb) this).field_h[((jb) this).field_p.field_i].field_d;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var3 != 16) {
            break L1;
          } else {
            if (((jb) this).field_p.d((byte) 55)) {
              ol.a(4, (byte) 107, false);
              this.e((byte) -126);
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          L3: {
            if (-15 == (var3 ^ -1)) {
              break L3;
            } else {
              if (param1) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (((jb) this).field_p.d((byte) 55)) {
            bj.field_m = false;
            ei.a(-46, param1);
            this.e((byte) -120);
            return true;
          } else {
            break L2;
          }
        }
        L4: {
          if (!param1) {
            break L4;
          } else {
            if (0 == rh.field_X) {
              break L4;
            } else {
              if (0 != (((jb) this).field_p.field_i ^ -1)) {
                L5: {
                  if (((jb) this).field_p.field_i == -1) {
                    break L5;
                  } else {
                    if (-2 == ((jb) this).field_p.field_i) {
                      break L5;
                    } else {
                      if (2 > ((jb) this).field_p.field_i) {
                        break L4;
                      } else {
                        if (5 > ((jb) this).field_p.field_i) {
                          h.field_W = ((jb) this).field_p.field_i + -2;
                          ((jb) this).field_p.a(h.field_W + 2, -1);
                          this.e((byte) -122);
                          return true;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                al.field_d = ((jb) this).field_p.field_i;
                ((jb) this).field_p.a(al.field_d, -1);
                this.e((byte) -127);
                return true;
              } else {
                break L4;
              }
            }
          }
        }
        if (param0 < -114) {
          return false;
        } else {
          return false;
        }
    }

    final void h(byte param0) {
        this.a((byte) -117);
        if (param0 <= 79) {
            ((jb) this).field_d = null;
        }
        if (!(((jb) this).field_e == 14)) {
            return;
        }
        int var2 = this.a(false, (byte) 121);
        if (var2 >= 0) {
            tf.a((byte) 59, var2, ((jb) this).field_c, ((jb) this).field_l);
        } else {
            pn.field_a.b(rg.field_J, 320, ((jb) this).field_c + 36, 4243584, -1);
        }
        if (!(!tj.a(true))) {
            pn.field_a.b(oc.field_b, 320, 190 - -((jb) this).field_c, 4243584, -1);
        }
        if (var2 == 5) {
            if (0 != (32 & ((jb) this).field_l)) {
                pn.field_a.b(lk.field_a, 320, ((jb) this).field_c + 190, 4243584, -1);
            }
        }
    }

    final void i(byte param0) {
        this.a((byte) -124);
        if (param0 != 126) {
            ((jb) this).field_g = -27;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        bd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var11 = Confined.field_J ? 1 : 0;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((jb) this).field_p.field_k) {
            L1: {
              if (param2 > 27) {
                break L1;
              } else {
                jb.l(-8);
                break L1;
              }
            }
            var12 = 0;
            var6 = var12;
            L2: while (true) {
              if (((jb) this).field_p.field_k <= var12) {
                return;
              } else {
                ((jb) this).field_h[var12].field_f = var5;
                ((jb) this).field_h[var12].field_j = param3 - var5 / 2;
                var12++;
                continue L2;
              }
            }
          } else {
            L3: {
              L4: {
                var7 = ((jb) this).field_h[var6];
                var8 = var7.field_f;
                if ((var7.field_d ^ -1) == -8) {
                  break L4;
                } else {
                  if (var7.field_d == 8) {
                    break L4;
                  } else {
                    if (var7.field_d == -10) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              // wide iinc 8 133
              break L3;
            }
            L5: {
              if (-5 != var7.field_d) {
                break L5;
              } else {
                L6: {
                  var9 = pn.field_a.c(uc.field_Z);
                  var10 = pn.field_a.c(sj.field_pb);
                  if (var9 >= var10) {
                    break L6;
                  } else {
                    var9 = var10;
                    break L6;
                  }
                }
                var8 = var8 + var9;
                break L5;
              }
            }
            L7: {
              L8: {
                if (-6 == (var7.field_d ^ -1)) {
                  break L8;
                } else {
                  if (var7.field_d != 6) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                var9 = pn.field_a.c(pc.field_k);
                var10 = pn.field_a.c(ie.field_c);
                if (var10 > var9) {
                  var9 = var10;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                var10 = pn.field_a.c(al.field_a.toUpperCase());
                if (var9 < var10) {
                  var9 = var10;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                var10 = pn.field_a.c(di.field_c.toUpperCase());
                if (var9 < var10) {
                  var9 = var10;
                  break L11;
                } else {
                  break L11;
                }
              }
              var8 = var8 + var9;
              break L7;
            }
            var7.field_b = param0 + param1 * var6;
            if (var5 < var8) {
              var5 = var8;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    private final int a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var9 = Confined.field_J ? 1 : 0;
          var3 = -1;
          if (param1 > 108) {
            break L0;
          } else {
            ((jb) this).field_p = null;
            break L0;
          }
        }
        L1: {
          var4 = (((jb) this).field_l ^ -1) & 525312;
          var5 = 133;
          var6 = -76 - -((jb) this).field_c;
          if (((jb) this).field_m) {
            L2: {
              var7 = 1023 & ((jb) this).field_l;
              var5 = 304 - (-19 + vf.a(var7, -29047) * 19);
              if (0 == var7) {
                var6 -= 19;
                break L2;
              } else {
                break L2;
              }
            }
            if (var7 == ((jb) this).field_l) {
              var6 += 19;
              break L1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        var5 += 0;
        var10 = 0;
        var7 = var10;
        L3: while (true) {
          if ((var10 ^ -1) <= -21) {
            L4: {
              if (-1 < (((jb) this).field_j ^ -1)) {
                break L4;
              } else {
                var3 = ((jb) this).field_j;
                break L4;
              }
            }
            return var3;
          } else {
            L5: {
              if (10 == var10) {
                L6: {
                  var5 = 133;
                  var6 += 38;
                  if (((jb) this).field_m) {
                    var8 = ((jb) this).field_l & 1047552;
                    var5 = 304 - (vf.a(var8, -29047) * 19 + -19);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var5 += 0;
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (!((jb) this).field_m) {
                break L7;
              } else {
                if (0 != (((jb) this).field_l & 1 << var10)) {
                  break L7;
                } else {
                  var10++;
                  continue L3;
                }
              }
            }
            L8: {
              if ((var4 & 1 << var10) != 0) {
                break L8;
              } else {
                if (!param0) {
                  if (((jb) this).field_j == var10) {
                    if ((1 << var10 & ((jb) this).field_l) != 0) {
                      db.field_w[var10].c(var5 + -4, -4 + var6, 40, 40);
                      break L8;
                    } else {
                      kn.field_g.c(var5 - 4, -4 + var6, 40, 40);
                      break L8;
                    }
                  } else {
                    L9: {
                      if (ld.field_l < var5) {
                        break L9;
                      } else {
                        if (var5 + 32 <= ld.field_l) {
                          break L9;
                        } else {
                          if (var6 > jh.field_R) {
                            break L9;
                          } else {
                            if (jh.field_R >= var6 - -32) {
                              break L9;
                            } else {
                              var3 = var10;
                              if (-1 == (1 << var10 & ((jb) this).field_l ^ -1)) {
                                kn.field_g.c(var5 + -2, -2 + var6, 36, 36);
                                break L8;
                              } else {
                                db.field_w[var10].c(var5 - 2, -2 + var6, 36, 36);
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (0 != (((jb) this).field_l & 1 << var10)) {
                      db.field_w[var10].c(var5, var6, 32, 32);
                      break L8;
                    } else {
                      kn.field_g.c(var5, var6, 32, 32);
                      break L8;
                    }
                  }
                } else {
                  if (wm.field_hb < var5) {
                    break L8;
                  } else {
                    if (32 + var5 <= wm.field_hb) {
                      break L8;
                    } else {
                      if (var6 > m.field_a) {
                        break L8;
                      } else {
                        if (var6 + 32 <= m.field_a) {
                          break L8;
                        } else {
                          if (var10 != ((jb) this).field_j) {
                            ((jb) this).field_j = var10;
                            break L8;
                          } else {
                            ((jb) this).field_j = -1;
                            break L8;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var5 += 38;
            var10++;
            continue L3;
          }
        }
    }

    private final boolean b(int param0, boolean param1) {
        this.c((byte) 126);
        int var3 = -1;
        int var4 = 111 / ((param0 - -36) / 38);
        if (0 <= ((jb) this).field_p.field_i) {
            var3 = ((jb) this).field_h[((jb) this).field_p.field_i].field_d;
        }
        if ((var3 ^ -1) == -17) {
            if (!(!((jb) this).field_p.d((byte) 55))) {
                ol.a(3, (byte) 118, false);
                this.e((byte) -121);
                return true;
            }
        }
        if (-12 != var3) {
            if (14 != var3) {
                // ifne L147
            }
        }
        if (((jb) this).field_p.d((byte) 55)) {
            kc.field_o = false;
            if (!(-15 != var3)) {
                bj.field_m = false;
            }
            ei.a(-103, param1);
            this.e((byte) -122);
            return true;
        }
        return false;
    }

    final void a(byte param0, bd param1) {
        if (param0 >= -50) {
            return;
        }
        ((jb) this).field_p.field_k = ((jb) this).field_p.field_k + 1;
        ((jb) this).field_h[((jb) this).field_p.field_k] = param1;
    }

    public static void l(int param0) {
        field_r = null;
        field_o = null;
        if (param0 != 320) {
            Object var2 = null;
            jb.a((byte) 25, 2.354534812504287, (double[]) null);
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        bd var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var11_ref = null;
        int var12 = 0;
        String stackIn_36_0 = null;
        String stackIn_42_0 = null;
        String stackIn_47_0 = null;
        String stackOut_46_0 = null;
        String stackOut_45_0 = null;
        String stackOut_41_0 = null;
        String stackOut_40_0 = null;
        String stackOut_35_0 = null;
        String stackOut_34_0 = null;
        L0: {
          var12 = Confined.field_J ? 1 : 0;
          var2 = 0;
          if (param0 == 36) {
            break L0;
          } else {
            ((jb) this).f((byte) 95);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= ((jb) this).field_p.field_k) {
            fn.c();
            return;
          } else {
            L2: {
              var3 = ((jb) this).field_h[var2];
              var4 = var3.field_a;
              var5 = var3.field_b;
              var6 = var3.field_i;
              var7 = 9805732;
              if (var2 == ((jb) this).field_p.field_i) {
                var7 = 16777215;
                dn.a(var3.field_f, 0 + var3.field_j, var5, lh.field_c, 208, param0 + -8028, var6);
                break L2;
              } else {
                dn.a(var3.field_f, var3.field_j + 0, var5, ah.field_T, 208, -7992, var6);
                break L2;
              }
            }
            L3: {
              if (7 == var3.field_d) {
                break L3;
              } else {
                if (var3.field_d == 8) {
                  break L3;
                } else {
                  if (var3.field_d == 9) {
                    break L3;
                  } else {
                    L4: {
                      if (var3.field_d == -5) {
                        break L4;
                      } else {
                        if (-6 == var3.field_d) {
                          break L4;
                        } else {
                          if (var3.field_d == -7) {
                            break L4;
                          } else {
                            L5: {
                              if (var3.field_d != 18) {
                                break L5;
                              } else {
                                if (var2 != al.field_d) {
                                  break L5;
                                } else {
                                  var7 = 16777215;
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (-20 != var3.field_d) {
                                break L6;
                              } else {
                                if (h.field_W == -2 + var2) {
                                  var7 = 16777215;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            int discarded$4 = pn.field_a.a(var4, 0 + var3.field_j, var5, var3.field_f, var6, var7, -1, 1, 1, 20);
                            var2++;
                            continue L1;
                          }
                        }
                      }
                    }
                    L7: {
                      if (4 == var3.field_d) {
                        var8 = pn.field_a.c(ef.field_ub);
                        var9 = pn.field_a.c(uc.field_Z);
                        var10 = pn.field_a.c(sj.field_pb);
                        if (var10 <= var9) {
                          break L7;
                        } else {
                          var9 = var10;
                          break L7;
                        }
                      } else {
                        L8: {
                          var8 = pn.field_a.c(qa.field_e);
                          var10 = pn.field_a.c(cc.field_p);
                          var9 = pn.field_a.c(pc.field_k);
                          if (var10 <= var8) {
                            break L8;
                          } else {
                            var8 = var10;
                            break L8;
                          }
                        }
                        L9: {
                          var10 = pn.field_a.c(ie.field_c);
                          if (var9 >= var10) {
                            break L9;
                          } else {
                            var9 = var10;
                            break L9;
                          }
                        }
                        L10: {
                          var10 = pn.field_a.c(al.field_a.toUpperCase());
                          if (var10 > var9) {
                            var9 = var10;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var10 = pn.field_a.c(di.field_c.toUpperCase());
                        if (var10 <= var9) {
                          break L7;
                        } else {
                          var9 = var10;
                          break L7;
                        }
                      }
                    }
                    L11: {
                      var10 = (var8 + -var9 + var3.field_f) / 2;
                      int discarded$5 = pn.field_a.a(var4, 0 + var3.field_j, var5, var10, var6, var7, -1, 2, 1, 20);
                      if (var3.field_d != -5) {
                        if (-6 == var3.field_d) {
                          L12: {
                            if (qc.field_n) {
                              stackOut_46_0 = pc.field_k;
                              stackIn_47_0 = stackOut_46_0;
                              break L12;
                            } else {
                              stackOut_45_0 = ie.field_c;
                              stackIn_47_0 = stackOut_45_0;
                              break L12;
                            }
                          }
                          var11_ref = stackIn_47_0;
                          break L11;
                        } else {
                          if (6 != var3.field_d) {
                            throw new IllegalStateException();
                          } else {
                            L13: {
                              if (mk.field_l) {
                                stackOut_41_0 = al.field_a;
                                stackIn_42_0 = stackOut_41_0;
                                break L13;
                              } else {
                                stackOut_40_0 = di.field_c;
                                stackIn_42_0 = stackOut_40_0;
                                break L13;
                              }
                            }
                            var11_ref = ((String) (Object) stackIn_42_0).toUpperCase();
                            break L11;
                          }
                        }
                      } else {
                        L14: {
                          if (!pa.field_c) {
                            stackOut_35_0 = uc.field_Z;
                            stackIn_36_0 = stackOut_35_0;
                            break L14;
                          } else {
                            stackOut_34_0 = sj.field_pb;
                            stackIn_36_0 = stackOut_34_0;
                            break L14;
                          }
                        }
                        var11_ref = stackIn_36_0;
                        break L11;
                      }
                    }
                    int discarded$6 = pn.field_a.a(var11_ref, var10 + (var3.field_j - 0), var5, -var10 + var3.field_f, var6, var7, -1, 0, 1, 20);
                    var2++;
                    continue L1;
                  }
                }
              }
            }
            L15: {
              var8 = pn.field_a.c(rb.field_h);
              var9 = pn.field_a.c(mg.field_d);
              if (var8 < var9) {
                var8 = var9;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var9 = pn.field_a.c(pm.field_u);
              if (var8 >= var9) {
                break L16;
              } else {
                var8 = var9;
                break L16;
              }
            }
            L17: {
              var10 = var3.field_j - -((var8 + (var3.field_f + -128 - -5)) / 2);
              if (((jb) this).field_p.field_i == var2) {
                fn.d(-1 + var10, var5 - -14, 2, 12384);
                fn.d(128 + var10, var5 - -14, 2, 12384);
                fn.b(var10 + 0, 13 + var5, 128, 12384);
                fn.b(0 + var10, 16 + var5, 128, 12384);
                fn.e(0 + var10, var5 + 14, 128, 2, 3178608);
                break L17;
              } else {
                fn.e(0 + var10, 14 + var5, 128, 2, 2121792);
                break L17;
              }
            }
            L18: {
              if (7 != var3.field_d) {
                if (-9 != var3.field_d) {
                  if (-10 == var3.field_d) {
                    var11 = 128 * m.field_l / 128;
                    break L18;
                  } else {
                    throw new IllegalStateException();
                  }
                } else {
                  var11 = 128 * hd.field_f / 128;
                  break L18;
                }
              } else {
                var11 = fa.field_S * 128 / 128;
                break L18;
              }
            }
            int discarded$7 = pn.field_a.a(var4, var3.field_j + 0, var5, -5 + (var10 - var3.field_j), var6, var7, -1, 2, 1, 20);
            fn.e(var11 + -2 + var10 - 0, var5 - -7, 3, 8, var7);
            fn.e(-2 + (var10 + var11), 8 + (7 + var5), 4, 2, var7);
            fn.e(0 + var11 + (var10 + -2), var5 - -7 + 10, 5, 6, var7);
            var2++;
            continue L1;
          }
        }
    }

    final static void a(byte param0, double param1, double[] param2) {
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        for (var4 = 0; var4 < param2.length; var4++) {
            param2[var4] = param2[var4] * param1;
        }
        if (param0 >= -79) {
            Object var6 = null;
            jb.a((byte) 115, 0.45560042226598313, (double[]) null);
        }
    }

    final void g(int param0) {
        int var3 = Confined.field_J ? 1 : 0;
        ec.a((jb) this, param0);
        if (nm.e((byte) -96)) {
            ((jb) this).field_p.h((byte) -128);
            if (!((gk.field_r ^ -1) != -14)) {
                this.e((byte) -125);
                gh.field_k = false;
                da.field_e.b(false, (byte) -126);
                return;
            }
            if (gk.field_r != 96) {
                // if_icmpeq L80
            } else {
                if (!(((jb) this).field_q <= 0)) {
                    this.b(320);
                    ((jb) this).field_p.a(1, -1);
                    ((jb) this).field_p.field_b = false;
                }
            }
            if ((gk.field_r ^ -1) != -98) {
                // if_icmpeq L135
            } else {
                if ((((jb) this).field_q ^ -1) > -9) {
                    this.k(8);
                    ((jb) this).field_p.a(1, -1);
                    ((jb) this).field_p.field_b = false;
                }
            }
            // ifeq L9
            return;
        }
        ((jb) this).field_p.a(true, this.a((byte) -118, wm.field_hb, m.field_a), this.a((byte) -118, ld.field_l, jh.field_R));
        boolean discarded$0 = this.a(true, 34);
    }

    final void a(int param0) {
        this.a((byte) -116);
        if ((((jb) this).field_e ^ -1) != -15) {
            return;
        }
        pn.field_a.b(p.field_b, 320, 120, 4243584, -1);
        pn.field_a.b(fb.a(((jb) this).field_t, ((jb) this).field_n, 0, ((jb) this).field_i), 320, 140, 4243584, -1);
        pn.field_a.b(qc.a(((jb) this).field_n, ((jb) this).field_i, 2, ((jb) this).field_t), 320, 240, 4243584, -1);
        pn.field_a.b(ah.a(((jb) this).field_i, ((jb) this).field_n, -125, ((jb) this).field_t), 320, 300, param0, -1);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          if (param0 > 71) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        var2 = 2147483647;
        var3 = 2147483647;
        var4 = -2147483648;
        var5 = -2147483648;
        var6 = 0;
        L1: while (true) {
          if (((jb) this).field_p.field_k <= var6) {
            ((jb) this).field_s = -30 + var2;
            ((jb) this).field_c = -20 + var3;
            ((jb) this).field_b = var5 + (20 - ((jb) this).field_c);
            ((jb) this).field_k = var4 + (30 - ((jb) this).field_s);
            return;
          } else {
            L2: {
              if (((jb) this).field_h[var6].field_j < var2) {
                var2 = ((jb) this).field_h[var6].field_j;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((jb) this).field_h[var6].field_b >= var3) {
                break L3;
              } else {
                var3 = ((jb) this).field_h[var6].field_b;
                break L3;
              }
            }
            L4: {
              if (((jb) this).field_h[var6].field_j - -((jb) this).field_h[var6].field_f <= var4) {
                break L4;
              } else {
                var4 = ((jb) this).field_h[var6].field_j + ((jb) this).field_h[var6].field_f;
                break L4;
              }
            }
            if (var5 < ((jb) this).field_h[var6].field_b + ((jb) this).field_h[var6].field_i) {
              var5 = ((jb) this).field_h[var6].field_i + ((jb) this).field_h[var6].field_b;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    private final void e(byte param0) {
        if (param0 > -119) {
            return;
        }
        int var2 = 128;
        if (!(-1 < (((jb) this).field_p.field_i ^ -1))) {
            var2 = 256 * (((jb) this).field_h[((jb) this).field_p.field_i].field_j + ((jb) this).field_h[((jb) this).field_p.field_i].field_f / 2) / 640;
        }
        cj.a(16, 50, 4, da.field_j, var2);
    }

    private final boolean a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        L0: {
          var9 = Confined.field_J ? 1 : 0;
          this.c((byte) 126);
          var3 = -1;
          if (-1 < ((jb) this).field_p.field_i) {
            break L0;
          } else {
            var3 = ((jb) this).field_h[((jb) this).field_p.field_i].field_d;
            break L0;
          }
        }
        L1: {
          if (-2 != var3) {
            break L1;
          } else {
            if (((jb) this).field_p.d((byte) 55)) {
              this.e((byte) -125);
              h.a((byte) -6, param1);
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (2 != var3) {
            break L2;
          } else {
            if (((jb) this).field_p.d((byte) 55)) {
              gh.field_k = true;
              va.field_b = nj.a(param1, ((jb) this).field_a, (byte) -119);
              this.e((byte) -124);
              return true;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (3 != var3) {
            break L3;
          } else {
            if (!((jb) this).field_p.d((byte) 55)) {
              break L3;
            } else {
              md.d(-124);
              this.e((byte) -128);
              return true;
            }
          }
        }
        L4: {
          if (4 != var3) {
            break L4;
          } else {
            L5: {
              if (((jb) this).field_p.g((byte) -121)) {
                break L5;
              } else {
                if (((jb) this).field_p.b((byte) 36)) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              if (pa.field_c) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L6;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L6;
              }
            }
            pa.field_c = stackIn_20_0 != 0;
            this.e((byte) -127);
            break L4;
          }
        }
        L7: {
          if (var3 != 5) {
            break L7;
          } else {
            L8: {
              if (((jb) this).field_p.g((byte) 4)) {
                break L8;
              } else {
                if (!((jb) this).field_p.b((byte) 36)) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (qc.field_n) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L9;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L9;
              }
            }
            qc.field_n = stackIn_28_0 != 0;
            this.e((byte) -122);
            break L7;
          }
        }
        L10: {
          if (6 != var3) {
            break L10;
          } else {
            L11: {
              if (((jb) this).field_p.g((byte) 14)) {
                break L11;
              } else {
                if (!((jb) this).field_p.b((byte) 36)) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            L12: {
              if (mk.field_l) {
                stackOut_35_0 = 0;
                stackIn_36_0 = stackOut_35_0;
                break L12;
              } else {
                stackOut_34_0 = 1;
                stackIn_36_0 = stackOut_34_0;
                break L12;
              }
            }
            mk.field_l = stackIn_36_0 != 0;
            this.e((byte) -126);
            break L10;
          }
        }
        L13: {
          if (-8 == (var3 ^ -1)) {
            L14: {
              if (((jb) this).field_p.f((byte) -79)) {
                L15: {
                  var4 = pn.field_a.c(rb.field_h);
                  var5 = pn.field_a.c(mg.field_d);
                  if (var4 >= var5) {
                    break L15;
                  } else {
                    var4 = var5;
                    break L15;
                  }
                }
                L16: {
                  var5 = pn.field_a.c(pm.field_u);
                  if (var5 <= var4) {
                    break L16;
                  } else {
                    var4 = var5;
                    break L16;
                  }
                }
                var6 = ((jb) this).field_h[((jb) this).field_p.field_i].field_j + (var4 + (5 + (((jb) this).field_h[((jb) this).field_p.field_i].field_f - 128))) / 2;
                var7 = ld.field_l - var6;
                var8 = var7 * 128 / 128;
                if (-1 >= (var8 ^ -1)) {
                  if ((var8 ^ -1) >= -129) {
                    if (var8 == fa.field_S) {
                      break L14;
                    } else {
                      fa.field_S = var8;
                      if (5 > -((jb) this).field_g + qn.field_r) {
                        break L14;
                      } else {
                        ab.a(2026);
                        ((jb) this).field_g = qn.field_r;
                        break L14;
                      }
                    }
                  } else {
                    if (var8 == fa.field_S) {
                      break L14;
                    } else {
                      fa.field_S = var8;
                      if (5 > -((jb) this).field_g + qn.field_r) {
                        break L14;
                      } else {
                        ab.a(2026);
                        ((jb) this).field_g = qn.field_r;
                        break L14;
                      }
                    }
                  }
                } else {
                  var8 = 0;
                  if (var8 == fa.field_S) {
                    break L14;
                  } else {
                    fa.field_S = var8;
                    if (5 > -((jb) this).field_g + qn.field_r) {
                      break L14;
                    } else {
                      ab.a(2026);
                      ((jb) this).field_g = qn.field_r;
                      break L14;
                    }
                  }
                }
              } else {
                if (!((jb) this).field_p.d((byte) 55)) {
                  break L14;
                } else {
                  ab.a(2026);
                  break L14;
                }
              }
            }
            L17: {
              if (((jb) this).field_p.a(0)) {
                fa.field_S = 0;
                ab.a(param0 ^ 2026);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (((jb) this).field_p.c((byte) 61)) {
                fa.field_S = 128;
                ab.a(2026);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (!((jb) this).field_p.e((byte) 105)) {
                break L19;
              } else {
                L20: {
                  if ((fa.field_S ^ -1) < -1) {
                    fa.field_S = -1 + fa.field_S & -16;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                ab.a(2026);
                break L19;
              }
            }
            if (!((jb) this).field_p.b(-80)) {
              break L13;
            } else {
              L21: {
                if (-129 >= (fa.field_S ^ -1)) {
                  break L21;
                } else {
                  fa.field_S = fa.field_S + 16 & -16;
                  break L21;
                }
              }
              ab.a(param0 + 2026);
              break L13;
            }
          } else {
            break L13;
          }
        }
        L22: {
          if (var3 == 8) {
            L23: {
              if (((jb) this).field_p.f((byte) -57)) {
                L24: {
                  if (((jb) this).field_p.d((byte) 55)) {
                    this.e((byte) -128);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  var4 = pn.field_a.c(rb.field_h);
                  var5 = pn.field_a.c(mg.field_d);
                  if (var5 <= var4) {
                    break L25;
                  } else {
                    var4 = var5;
                    break L25;
                  }
                }
                L26: {
                  var5 = pn.field_a.c(pm.field_u);
                  if (var4 >= var5) {
                    break L26;
                  } else {
                    var4 = var5;
                    break L26;
                  }
                }
                L27: {
                  var6 = ((jb) this).field_h[((jb) this).field_p.field_i].field_j + (-128 + ((jb) this).field_h[((jb) this).field_p.field_i].field_f + (5 + var4)) / 2;
                  var7 = -var6 + ld.field_l;
                  var8 = var7 * 128 / 128;
                  if (0 <= var8) {
                    if (-129 > (var8 ^ -1)) {
                      hd.field_f = 128;
                      break L27;
                    } else {
                      hd.field_f = var8;
                      break L27;
                    }
                  } else {
                    hd.field_f = 0;
                    break L27;
                  }
                }
                h.field_R.b(hd.field_f * 64 >> -1082981529);
                break L23;
              } else {
                break L23;
              }
            }
            L28: {
              if (((jb) this).field_p.a(0)) {
                hd.field_f = 0;
                h.field_R.b(hd.field_f * 64 >> 997161255);
                this.e((byte) -126);
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (!((jb) this).field_p.c((byte) -128)) {
                break L29;
              } else {
                hd.field_f = 128;
                h.field_R.b(64 * hd.field_f >> 1217645255);
                this.e((byte) -128);
                break L29;
              }
            }
            L30: {
              if (((jb) this).field_p.e((byte) 105)) {
                L31: {
                  hd.field_f = -16 & -1 + hd.field_f;
                  if (0 > hd.field_f) {
                    hd.field_f = 0;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                h.field_R.b(64 * hd.field_f >> -298125977);
                this.e((byte) -124);
                break L30;
              } else {
                break L30;
              }
            }
            if (!((jb) this).field_p.b(114)) {
              break L22;
            } else {
              L32: {
                hd.field_f = 16 + hd.field_f & -16;
                if (128 < hd.field_f) {
                  hd.field_f = 128;
                  break L32;
                } else {
                  break L32;
                }
              }
              h.field_R.b(64 * hd.field_f >> -600165209);
              this.e((byte) -128);
              break L22;
            }
          } else {
            break L22;
          }
        }
        L33: {
          if ((var3 ^ -1) == -10) {
            L34: {
              if (!((jb) this).field_p.f((byte) -55)) {
                break L34;
              } else {
                L35: {
                  if (!((jb) this).field_p.d((byte) 55)) {
                    break L35;
                  } else {
                    this.e((byte) -122);
                    break L35;
                  }
                }
                L36: {
                  var4 = pn.field_a.c(rb.field_h);
                  var5 = pn.field_a.c(mg.field_d);
                  if (var5 <= var4) {
                    break L36;
                  } else {
                    var4 = var5;
                    break L36;
                  }
                }
                L37: {
                  var5 = pn.field_a.c(pm.field_u);
                  if (var5 <= var4) {
                    break L37;
                  } else {
                    var4 = var5;
                    break L37;
                  }
                }
                L38: {
                  var6 = (-128 + (((jb) this).field_h[((jb) this).field_p.field_i].field_f + 5) + var4) / 2 + ((jb) this).field_h[((jb) this).field_p.field_i].field_j;
                  var7 = ld.field_l + -var6;
                  var8 = 128 * var7 / 128;
                  if (-1 < (var8 ^ -1)) {
                    var8 = 0;
                    break L38;
                  } else {
                    if (var8 > 128) {
                      var8 = 128;
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                }
                if (var8 != m.field_l) {
                  m.field_l = var8;
                  o.b((byte) -106);
                  break L34;
                } else {
                  break L34;
                }
              }
            }
            L39: {
              if (!((jb) this).field_p.a(0)) {
                break L39;
              } else {
                L40: {
                  if (m.field_l == 0) {
                    break L40;
                  } else {
                    m.field_l = 0;
                    o.b((byte) -123);
                    break L40;
                  }
                }
                this.e((byte) -127);
                break L39;
              }
            }
            L41: {
              if (!((jb) this).field_p.c((byte) -120)) {
                break L41;
              } else {
                L42: {
                  if (m.field_l == 128) {
                    break L42;
                  } else {
                    m.field_l = 128;
                    o.b((byte) -125);
                    break L42;
                  }
                }
                this.e((byte) -122);
                break L41;
              }
            }
            L43: {
              if (!((jb) this).field_p.e((byte) 105)) {
                break L43;
              } else {
                L44: {
                  if (-1 <= (m.field_l ^ -1)) {
                    break L44;
                  } else {
                    m.field_l = -16 & m.field_l + -1;
                    o.b((byte) -117);
                    break L44;
                  }
                }
                this.e((byte) -127);
                break L43;
              }
            }
            if (!((jb) this).field_p.b(124)) {
              break L33;
            } else {
              L45: {
                if (m.field_l < 128) {
                  m.field_l = -16 & 16 + m.field_l;
                  o.b((byte) -127);
                  break L45;
                } else {
                  break L45;
                }
              }
              this.e((byte) -121);
              break L33;
            }
          } else {
            break L33;
          }
        }
        L46: {
          if (-11 != (var3 ^ -1)) {
            break L46;
          } else {
            if (!((jb) this).field_p.d((byte) 55)) {
              break L46;
            } else {
              L47: {
                if (null != dn.field_d) {
                  qh.c(param0 + 4);
                  break L47;
                } else {
                  tj.a(param1, 480);
                  break L47;
                }
              }
              this.e((byte) -128);
              return true;
            }
          }
        }
        L48: {
          if (-12 != (var3 ^ -1)) {
            break L48;
          } else {
            if (!((jb) this).field_p.d((byte) 55)) {
              break L48;
            } else {
              bj.field_m = true;
              ji.field_e = qh.a(param1, (byte) 104);
              this.e((byte) -127);
              return true;
            }
          }
        }
        L49: {
          if (var3 != 12) {
            break L49;
          } else {
            if (!((jb) this).field_p.d((byte) 55)) {
              break L49;
            } else {
              kc.field_o = true;
              bg.field_a = bk.a(320, false, param1, i.field_o);
              this.e((byte) -128);
              return true;
            }
          }
        }
        L50: {
          if (var3 != 13) {
            break L50;
          } else {
            if (((jb) this).field_p.d((byte) 55)) {
              this.e((byte) -125);
              qh.c(4);
              jn.a(false, ii.b(false));
              break L50;
            } else {
              break L50;
            }
          }
        }
        L51: {
          if (var3 != 14) {
            break L51;
          } else {
            if (((jb) this).field_p.d((byte) 55)) {
              this.e((byte) -127);
              ac.a(false);
              return true;
            } else {
              break L51;
            }
          }
        }
        L52: {
          if (param0 == 0) {
            break L52;
          } else {
            ((jb) this).a(99);
            break L52;
          }
        }
        if ((var3 ^ -1) != -16) {
          return false;
        } else {
          if (((jb) this).field_p.d((byte) 55)) {
            this.e((byte) -123);
            kg.c(false);
            return true;
          } else {
            return false;
          }
        }
    }

    private final boolean d(int param0, boolean param1) {
        this.c((byte) 127);
        if (param0 > -9) {
            return true;
        }
        int var3 = -1;
        if (!(-1 < (((jb) this).field_p.field_i ^ -1))) {
            var3 = ((jb) this).field_h[((jb) this).field_p.field_i].field_d;
        }
        if (var3 == 16) {
            if (!(!((jb) this).field_p.d((byte) 55))) {
                ol.a(2, (byte) 102, false);
                this.e((byte) -127);
                return true;
            }
        }
        if (17 == var3) {
            if (((jb) this).field_p.d((byte) 55)) {
                rk.d((byte) -61);
                qf.field_e = false;
                ei.a(-54, param1);
                this.e((byte) -121);
                return true;
            }
        }
        return false;
    }

    jb(int param0) {
        ((jb) this).field_j = -1;
        ((jb) this).field_h = new bd[param0];
        ((jb) this).field_p = new qi();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Unpacking sound effects";
    }
}
