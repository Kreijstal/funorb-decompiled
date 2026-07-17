/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends qe {
    private cn field_I;
    private cn field_z;
    private tf field_B;
    private boolean field_E;
    private cn field_A;
    private cn field_u;
    static int[] field_r;
    static String field_s;
    private int field_C;
    static int[] field_J;
    private int field_t;
    static qh[] field_w;
    private int field_G;
    static tf field_x;
    private rh field_D;
    static String field_v;
    private wd field_F;
    private rh field_y;

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= 2) {
            if (param0 == -1) {
              return -1;
            } else {
              return 95;
            }
          } else {
            var6 = 0;
            L1: while (true) {
              if (var6 < 4) {
                L2: {
                  var7 = var6 * 102 + 195;
                  var8 = 104 * var5 + 60;
                  if (var5 != 2) {
                    break L2;
                  } else {
                    var7 += 51;
                    break L2;
                  }
                }
                L3: {
                  if (var7 > param2) {
                    break L3;
                  } else {
                    if (param1 < var8) {
                      break L3;
                    } else {
                      if (param2 >= 96 + var7) {
                        break L3;
                      } else {
                        if (var8 + 96 > param1) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (var4 != 7) {
                  var6++;
                  var4++;
                  continue L1;
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
    }

    final void c() {
        ((ih) this).field_A = null;
        ((ih) this).field_u = null;
        j.field_Q = null;
        ld.field_e = null;
        ((ih) this).field_z = null;
        ((ih) this).field_I = null;
        System.gc();
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var3 = DungeonAssault.field_K;
          if (gm.field_d.field_s >= ac.field_s) {
            L1: {
              if (ed.c(true)) {
                break L1;
              } else {
                ac.field_B.d((byte) -112, 56);
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 8) {
                    break L1;
                  } else {
                    if (um.field_i[var2] == gm.field_d.field_a[var2]) {
                      ac.field_B.a(6, -1);
                      var2++;
                      continue L2;
                    } else {
                      if (um.field_i[var2] == null) {
                        ac.field_B.a(6, 0);
                        var2++;
                        continue L2;
                      } else {
                        ac.field_B.a(6, um.field_i[var2].field_c);
                        var2++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            var4 = 0;
            var2 = var4;
            L3: while (true) {
              if (8 <= var4) {
                gm.field_d.field_s = gm.field_d.field_s - ac.field_s;
                this.d(1793);
                break L0;
              } else {
                gm.field_d.field_a[var4] = um.field_i[var4];
                var4++;
                continue L3;
              }
            }
          } else {
            break L0;
          }
        }
        ho.b((byte) -36);
    }

    final void a(boolean param0) {
        Object var2 = null;
        Object var3 = null;
        rj var4 = null;
        int var5_int = 0;
        h var5 = null;
        int var6 = 0;
        int var7 = 0;
        cn var8 = null;
        int var9 = 0;
        cn stackIn_36_0 = null;
        cn stackOut_35_0 = null;
        Object stackOut_34_0 = null;
        L0: {
          L1: {
            var9 = DungeonAssault.field_K;
            super.a(param0);
            ((ih) this).field_e.b(0, 0);
            this.b(-123);
            var2 = null;
            if (((ih) this).field_t == -1) {
              break L1;
            } else {
              if (null == um.field_i[((ih) this).field_t]) {
                break L1;
              } else {
                var2 = (Object) (Object) um.field_i[((ih) this).field_t];
                break L0;
              }
            }
          }
          if (((ih) this).field_C == -1) {
            break L0;
          } else {
            if (um.field_i[((ih) this).field_C] == null) {
              break L0;
            } else {
              var2 = (Object) (Object) um.field_i[((ih) this).field_C];
              break L0;
            }
          }
        }
        L2: {
          var3 = null;
          if (var2 == null) {
            if (op.field_d.field_l == null) {
              break L2;
            } else {
              var3 = (Object) (Object) ((u) (Object) op.field_d.field_l).field_Q;
              break L2;
            }
          } else {
            var3 = (Object) (Object) ((hb) var2).field_n;
            break L2;
          }
        }
        L3: {
          if (var2 != null) {
            ih.a(216, 275, (hb) var2);
            break L3;
          } else {
            ih.a(216, 275, ((ih) this).field_F, kc.field_S);
            break L3;
          }
        }
        L4: {
          if (var2 == null) {
            ih.a(339, 289, (h) var3);
            break L4;
          } else {
            ih.a(339, 289, (hb) var2, 0);
            break L4;
          }
        }
        this.b(286, 144, 476);
        var4 = (rj) (Object) ((ih) this).field_p.e(-24172);
        L5: while (true) {
          if (var4 == null) {
            L6: {
              ad.field_e.h(188, 48);
              ad.field_e.i(188, -ad.field_e.field_b + 40);
              ad.field_e.i(460, -ad.field_e.field_b + 40);
              ad.field_e.f(-ad.field_e.field_d + -be.field_o.field_d + 460, -ad.field_e.field_b + 40);
              oe.field_m.h(171, 360);
              oe.field_m.j(-oe.field_m.field_d + 620, 360);
              if (null == ((ih) this).field_b) {
                break L6;
              } else {
                ((ih) this).field_b.a((byte) -101);
                break L6;
              }
            }
            ih.e();
            ((ih) this).field_q.a((byte) -40);
            var4 = (rj) (Object) ((ih) this).field_p.e(-24172);
            L7: while (true) {
              if (var4 == null) {
                L8: {
                  this.g(0);
                  ((ih) this).field_y.d();
                  ((ih) this).field_D.d();
                  if (((ih) this).field_b == null) {
                    break L8;
                  } else {
                    var5_int = 0;
                    L9: while (true) {
                      if (gf.field_b.length <= var5_int) {
                        ((ih) this).field_b.b(108);
                        break L8;
                      } else {
                        gf.field_b[var5_int] = nb.a(-50529028, gf.field_b[var5_int]) >>> 2;
                        var5_int++;
                        continue L9;
                      }
                    }
                  }
                }
                L10: {
                  if (!kn.field_g) {
                    break L10;
                  } else {
                    ab.a(0);
                    break L10;
                  }
                }
                L11: {
                  if (null != op.field_d.field_l) {
                    L12: {
                      var5 = ((u) (Object) op.field_d.field_l).field_Q;
                      var6 = hj.field_S;
                      var7 = eh.field_h + -40;
                      rp.a(8, 40, (byte) 108, var6, 40, kc.field_S, var7);
                      if (null != var5.field_e) {
                        stackOut_35_0 = var5.field_e.a(40, 0, 40, 0);
                        stackIn_36_0 = stackOut_35_0;
                        break L12;
                      } else {
                        stackOut_34_0 = null;
                        stackIn_36_0 = (cn) (Object) stackOut_34_0;
                        break L12;
                      }
                    }
                    var8 = stackIn_36_0;
                    if (var8 == null) {
                      gf.b(var6, var7, 40, 40, 0, 128);
                      break L11;
                    } else {
                      var8.d(var6, var7, 128);
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                oh.a((byte) 99);
                return;
              } else {
                var4.d(0);
                var4 = (rj) (Object) ((ih) this).field_p.a(4);
                continue L7;
              }
            }
          } else {
            var4.a(93);
            var4 = (rj) (Object) ((ih) this).field_p.a(4);
            continue L5;
          }
        }
    }

    final static String[] a(int param0, char param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        Object stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            var10 = (CharSequence) (Object) param2;
            var3_int = rm.a((byte) 105, var10, param1);
            var4 = new String[1 + var3_int];
            var5 = 0;
            var6 = 0;
            if (param0 >= 18) {
              var7 = 0;
              L1: while (true) {
                if (var7 >= var3_int) {
                  var4[var3_int] = param2.substring(var6);
                  stackOut_10_0 = (String[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  var8 = var6;
                  L2: while (true) {
                    if (param1 == param2.charAt(var8)) {
                      int incrementValue$2 = var5;
                      var5++;
                      var4[incrementValue$2] = param2.substring(var6, var8);
                      var6 = var8 - -1;
                      var7++;
                      continue L1;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ih.J(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    private final void f(int param0) {
        hb var2_ref_hb = null;
        int var2 = 0;
        wb[] var3 = null;
        hb var3_ref = null;
        en var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wb var13 = null;
        int var14 = 0;
        hb var15 = null;
        wb[] var16 = null;
        hb var17 = null;
        h var18 = null;
        h var19 = null;
        hb var20 = null;
        h var21 = null;
        hb stackIn_28_0 = null;
        Object stackOut_27_0 = null;
        hb stackOut_26_0 = null;
        L0: {
          var14 = DungeonAssault.field_K;
          ((ih) this).field_t = -1;
          if (kn.field_g) {
            if (!od.a((byte) -52)) {
              break L0;
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        if (super.d()) {
          return;
        } else {
          L1: {
            ((ih) this).field_t = this.a(-1, eh.field_h, hj.field_S);
            if (((ih) this).field_t == -1) {
              break L1;
            } else {
              if (null == um.field_i[((ih) this).field_t]) {
                break L1;
              } else {
                L2: {
                  var15 = um.field_i[((ih) this).field_t];
                  if (ld.field_e != var15) {
                    j.field_Q = (en) (Object) new fc((pj) null, var15);
                    ld.field_e = var15;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var16 = var15.field_i;
                  var3 = var16;
                  var4 = j.field_Q;
                  if (var3 == null) {
                    break L3;
                  } else {
                    var5 = ((ih) this).field_t / 4;
                    var6 = 3 & ((ih) this).field_t;
                    var7 = 102 * var6 + 195;
                    var8 = 60 + var5 * 104;
                    var8 += 78;
                    var9 = 7;
                    var7 += 78;
                    var10 = var7;
                    var11 = var8;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= var16.length) {
                        break L3;
                      } else {
                        L5: {
                          var13 = var16[var12];
                          if (!jg.a(false, var10, 12, 12, var11)) {
                            break L5;
                          } else {
                            var4 = var13.a();
                            break L5;
                          }
                        }
                        var10 -= 16;
                        var12++;
                        if (var12 % var9 == 0) {
                          var11 -= 16;
                          var10 = var7;
                          continue L4;
                        } else {
                          continue L4;
                        }
                      }
                    }
                  }
                }
                uj.a(var4, 95);
                break L1;
              }
            }
          }
          L6: {
            if ((Object) (Object) hh.field_s != (Object) (Object) sn.field_b) {
              if ((Object) (Object) hh.field_s == (Object) (Object) nl.field_a) {
                this.d(1793);
                this.a((byte) -125, true);
                break L6;
              } else {
                if ((Object) (Object) in.field_y != (Object) (Object) hh.field_s) {
                  L7: {
                    if (hh.field_s == null) {
                      break L7;
                    } else {
                      if (!(hh.field_s instanceof u)) {
                        break L7;
                      } else {
                        L8: {
                          var18 = ((u) (Object) hh.field_s).field_Q;
                          this.a((byte) -112, -1);
                          if (null == ((ih) this).field_F) {
                            break L8;
                          } else {
                            if (var18.field_t == ((ih) this).field_F.field_n) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ((ih) this).field_F = new wd(var18.field_e, var18.field_t, rf.field_M);
                        if (null != var18.field_p) {
                          o discarded$2 = gd.a(64, var18.field_p);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if ((Object) (Object) hh.field_s == (Object) (Object) hl.field_b) {
                    this.a(0, 0);
                    break L6;
                  } else {
                    if ((Object) (Object) hh.field_s == (Object) (Object) hi.field_a) {
                      this.a(1, 0);
                      break L6;
                    } else {
                      if ((Object) (Object) hh.field_s != (Object) (Object) kl.field_h) {
                        if ((Object) (Object) cd.field_d == (Object) (Object) hh.field_s) {
                          this.a(5, 0);
                          break L6;
                        } else {
                          if ((Object) (Object) hh.field_s == (Object) (Object) am.field_f) {
                            this.a(6, 0);
                            break L6;
                          } else {
                            if (no.field_d != 1) {
                              if (2 != no.field_d) {
                                break L6;
                              } else {
                                L9: {
                                  var2 = this.a(-1, hm.field_k, lc.field_c);
                                  if (var2 != -1) {
                                    L10: {
                                      um.field_i[var2] = gm.field_d.field_a[var2];
                                      if (null == um.field_i[var2]) {
                                        break L10;
                                      } else {
                                        if (um.field_i[var2].field_b != null) {
                                          break L10;
                                        } else {
                                          um.field_i[var2].field_b = new wd(um.field_i[var2].field_n.field_e);
                                          break L10;
                                        }
                                      }
                                    }
                                    ho.b((byte) -36);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                ((ih) this).field_F = null;
                                this.a((byte) -112, -1);
                                op.field_d.a((byte) 80);
                                break L6;
                              }
                            } else {
                              var2 = this.a(-1, hm.field_k, lc.field_c);
                              if (-1 != var2) {
                                if (op.field_d.field_l == null) {
                                  if (um.field_i[var2] != null) {
                                    op.field_d.a((byte) 80);
                                    ((ih) this).field_F = null;
                                    this.a((byte) -112, var2);
                                    var20 = um.field_i[((ih) this).field_C];
                                    var3_ref = var20;
                                    var21 = var20.field_n;
                                    if (var3_ref != null) {
                                      if (var20.field_p != 255) {
                                        if (var21.field_u != var20.field_b.field_n) {
                                          var20.field_b.a(124, var21.field_u);
                                          if (var20.field_n.field_p != null) {
                                            o discarded$3 = gd.a(64, var21.field_p);
                                            break L6;
                                          } else {
                                            break L6;
                                          }
                                        } else {
                                          break L6;
                                        }
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  var19 = ((u) (Object) op.field_d.field_l).field_Q;
                                  um.field_i[var2] = new hb(var2, var19.field_w);
                                  um.field_i[var2].field_b = new wd(var19.field_e);
                                  ho.b((byte) -36);
                                  op.field_d.a((byte) 80);
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      } else {
                        this.a(2, 0);
                        break L6;
                      }
                    }
                  }
                } else {
                  L11: {
                    if (-1 == ((ih) this).field_C) {
                      stackOut_27_0 = null;
                      stackIn_28_0 = (hb) (Object) stackOut_27_0;
                      break L11;
                    } else {
                      stackOut_26_0 = um.field_i[((ih) this).field_C];
                      stackIn_28_0 = stackOut_26_0;
                      break L11;
                    }
                  }
                  var17 = stackIn_28_0;
                  var2_ref_hb = var17;
                  if (var2_ref_hb != null) {
                    um.field_i[((ih) this).field_C] = new hb(((ih) this).field_C, var17.field_c);
                    um.field_i[((ih) this).field_C].field_b = new wd(var17.field_n.field_e);
                    ho.b((byte) -36);
                    this.a((byte) -112, -1);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            } else {
              this.d(true);
              this.a((byte) -92, true);
              break L6;
            }
          }
          return;
        }
    }

    final void b(boolean param0) {
        super.b(param0);
        fk.a((byte) 121, lf.field_w);
        bl.a((byte) 123);
        ih.b(((ih) this).field_e, 188, 48, 605, 279);
        ih.b(((ih) this).field_e, 188, 364, 605, 378);
        ih.b(((ih) this).field_e, 188, 401, 605, 407);
        jh.a(((ih) this).field_e);
        te.a(188, 280, 423, kc.field_M);
        te.a(188, 362, 423, kc.field_M);
        te.a(188, 378, 423, kc.field_M);
        te.a(188, 399, 423, kc.field_M);
        te.a(188, 408, 423, kc.field_M);
        ih.a(188, 281, 433, 80, 256, 32, 8, 128);
        ih.a(188, 379, 433, 20, 256, 32, 8, 128);
        ih.a(8, 8, 172, 32, 256, 64, 4, 128);
        ih.a(188, 8, 264, 32, 256, 64, 4, 128);
        ih.a(460, 8, 172, 32, 256, 64, 4, 128);
        ((ih) this).field_B.b(12, 32, 640 + -((ih) this).field_B.field_i >> 1);
        h.a(false, 425, 618, true, bk.field_e.field_b + 40);
        ke.a(55, 180, 480, 0);
        ke.a(51, 605, 480, bk.field_e.field_b + 40);
        ke.a(106, 640 + -be.field_o.field_d, 480, 0);
        ke.a(66, 0, 480, 0);
        c.a(0, 640, 0, (byte) 30);
        c.a(0, 640, 40, (byte) 55);
        jc.a(32, 460 - be.field_o.field_d, 8, 1, 2, 1);
        c.a(0, 640, 480 - bk.field_e.field_b, (byte) 110);
        ih.b(be.field_o.field_d, 40 - -bk.field_e.field_b, 170, 425, 16777215, 32, 128);
        h.a(false, 425, 20, true, bk.field_e.field_b + 40);
        ih.a(8, 47, 172, 425, 256, 32, 8, 128);
        ih.a(14, 55, 161, 36);
        jh.b();
        this.c(65);
        Object var3 = null;
        u.a(1, (lb) null);
        ((ih) this).field_F = null;
        ((ih) this).field_A = mf.a(10449103, 96, 6, 96, (byte) 72);
        ((ih) this).field_u = mf.a(255, 96, 12, 96, (byte) 85);
        ((ih) this).field_z = mf.a(16711680, 96, 12, 96, (byte) -87);
        ((ih) this).field_I = mf.a(8454143, 96, 12, 96, (byte) -43);
        ((ih) this).field_y = new rh(205, 371, 80, 160, 16711680, 768, 249);
        ((ih) this).field_D = new rh(-oe.field_m.field_d + 640, 371, 80, 160, 16711680, 768, 249);
        qh.a(-13716, (rj) (Object) lf.field_y[1], 20);
    }

    final static void a(byte param0) {
        tc.field_u = ra.field_c.d(-97);
        CharSequence var2 = (CharSequence) (Object) tc.field_u;
        nn.field_k = jm.a((byte) 59, var2);
    }

    private final void b(int param0, int param1, int param2) {
        ih.a(param2, param0, param1, 30);
        ih.a(param2, 40 + param0, 144, 30);
        int var4 = 8 + param0 + la.field_b.field_H;
        db.field_v.b(pb.field_I, param2 - -7, var4, 16777215, -1);
        db.field_v.a(Integer.toString(gm.field_d.field_s / 10), 133 + param2, var4, 16777215, -1);
        var4 += 40;
        int var5 = ac.field_s > gm.field_d.field_s ? 16711680 : 16777215;
        db.field_v.b(ef.field_f, 7 + param2, var4, var5, -1);
        int var6 = ac.field_s / 10;
        if (ac.field_s % 10 != 0) {
            var6++;
        }
        db.field_v.a(Integer.toString(var6), param2 + 133, var4, var5, -1);
    }

    private final void c(int param0) {
        ((ih) this).b();
        op.field_d = new nn(true);
        wd.field_f = new nn(false);
        ud.field_t = new ed(8, 90, 180, 382);
        sn.field_b = tn.a(16, 12, (se) (Object) ne.field_c, jm.field_i, -107, lk.field_P);
        nl.field_a = tn.a(472, 12, (se) (Object) ne.field_c, jm.field_i, -76, be.field_r.toUpperCase());
        in.field_y = tn.a((164 - jm.field_i.field_y >> 1) + 340, 376, (se) (Object) ne.field_c, jm.field_i, -100, sa.field_e);
        hl.field_b = sj.a(22, 103, 65, uj.field_c, wd.field_f);
        hi.field_a = sj.a(55, 109, 65, gd.field_E, wd.field_f);
        kl.field_h = sj.a(86, 104, 65, jj.field_b, wd.field_f);
        cd.field_d = sj.a(117, 87, 65, wl.field_d, wd.field_f);
        am.field_f = sj.a(148, 119, 65, pk.field_o, wd.field_f);
        ((ih) this).field_p.a((ne) (Object) ud.field_t, false);
        ((ih) this).field_p.a((ne) (Object) sn.field_b, false);
        ((ih) this).field_p.a((ne) (Object) nl.field_a, false);
        ((ih) this).field_p.a((ne) (Object) in.field_y, false);
        ((ih) this).field_p.a((ne) (Object) hl.field_b, false);
        ((ih) this).field_p.a((ne) (Object) hi.field_a, false);
        ((ih) this).field_p.a((ne) (Object) kl.field_h, false);
        ((ih) this).field_p.a((ne) (Object) cd.field_d, false);
        ((ih) this).field_p.a((ne) (Object) am.field_f, false);
        this.a(-122);
        ((ih) this).field_G = 0;
        ((ih) this).field_E = false;
        wd.field_f.a(hl.field_b, -256);
        this.a(0, 0);
        ((ih) this).field_q = new sa(262, 412, 280, 56);
        ((ih) this).field_q.a(true, lg.field_h, (byte) 91, a.field_m, 16777215);
        hl.field_b.field_n = (en) (Object) new e(jk.a(new String[1], ib.field_c, 30496));
        hi.field_a.field_n = (en) (Object) new e(jk.a(new String[1], ib.field_c, 30496));
        kl.field_h.field_n = (en) (Object) new e(jk.a(new String[1], ib.field_c, 30496));
        cd.field_d.field_n = (en) (Object) new e(jk.a(new String[1], ib.field_c, 30496));
        am.field_f.field_n = (en) (Object) new e(jk.a(new String[1], ib.field_c, 30496));
        nl.field_a.field_n = (en) (Object) new e((String) null, pm.field_o, nk.field_Lb);
        sn.field_b.field_n = (en) (Object) new e((String) null, ud.field_u, oi.field_M);
        this.a((byte) -112, -1);
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (2 <= var3) {
            return;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 < 4) {
                L2: {
                  var5 = 195 + 102 * var4;
                  var6 = 104 * var3 + 60;
                  if (null != um.field_i[var2]) {
                    um.field_i[var2].field_b.a(86, var6 - -5, (byte) 102, 5 + var5, 86);
                    ih.a(var5 - -96, 96 + var6, 3, um.field_i[var2], 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = (int)((te.c(mo.field_a, var2 * 10273, 0.015625) + 2.0) * 64.0);
                  if (var7 < 0) {
                    var7 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (((ih) this).field_C != var2) {
                    if (var2 != ((ih) this).field_t) {
                      if (um.field_i[var2] == gm.field_d.field_a[var2]) {
                        break L4;
                      } else {
                        var8 = (int)((1.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 64.0) + 128;
                        ((ih) this).field_I.b(var5, var6, var8);
                        break L4;
                      }
                    } else {
                      ((ih) this).field_A.b(var5, var6, 64);
                      ((ih) this).field_u.b(var5, var6, var7);
                      break L4;
                    }
                  } else {
                    ((ih) this).field_z.b(var5, var6, var7);
                    break L4;
                  }
                }
                if (var2 != 7) {
                  var2++;
                  var4++;
                  continue L1;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var5 = DungeonAssault.field_K;
        for (var3 = 0; var3 < 8; var3++) {
            if (um.field_i[var3] != gm.field_d.field_a[var3]) {
                break;
            }
        }
        if (!(var3 == 8)) {
            ((ih) this).field_b = (kl) (Object) new lf(oa.field_h, pb.field_F);
            return;
        }
        if (kn.field_g) {
            if (gm.field_d.field_K == 0) {
                for (var3 = 0; var3 < 8; var3++) {
                    if (null != gm.field_d.field_a[var3]) {
                        break;
                    }
                }
                if (!(var3 != 8)) {
                    fm.a(80, 21);
                    return;
                }
                gd.a(g.field_Hb, 0, 2, param1);
                return;
            }
        }
        int var4 = -29 / ((3 - param0) / 59);
        gd.a(g.field_Hb, 0, g.field_Hb, param1);
    }

    public static void e(int param0) {
        field_s = null;
        field_x = null;
        field_J = null;
        field_v = null;
        field_r = null;
        field_w = null;
    }

    private final void a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        u[] var5 = null;
        int var6 = 0;
        u var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          var17 = new int[hp.field_b.length];
          var15 = var17;
          var13 = var15;
          var11 = var13;
          var9 = var11;
          var16 = var9;
          var14 = var16;
          var12 = var14;
          var10 = var12;
          var3 = var10;
          var4 = param0;
          if (var4 == 0) {
            var9 = var16;
            var16 = var14;
            var17 = var15;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var16.length) {
                break L0;
              } else {
                L2: {
                  if (null == hp.field_b[var4]) {
                    break L2;
                  } else {
                    var3[var4] = hp.field_b[var4].field_B;
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          } else {
            if (var4 != 1) {
              if (2 == var4) {
                var9 = var16;
                var16 = var14;
                var17 = var15;
                var4 = 0;
                L3: while (true) {
                  if (var16.length <= var4) {
                    break L0;
                  } else {
                    L4: {
                      if (hp.field_b[var4] != null) {
                        var3[var4] = hp.field_b[var4].field_r;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4++;
                    continue L3;
                  }
                }
              } else {
                if (var4 != 5) {
                  if (var4 != 6) {
                    break L0;
                  } else {
                    var9 = var16;
                    var16 = var14;
                    var17 = var15;
                    var4 = 0;
                    L5: while (true) {
                      if (~var16.length >= ~var4) {
                        break L0;
                      } else {
                        L6: {
                          if (null != hp.field_b[var4]) {
                            var3[var4] = hp.field_b[var4].field_o;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var4++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  var9 = var16;
                  var16 = var14;
                  var17 = var15;
                  var4 = 0;
                  L7: while (true) {
                    if (var4 >= var16.length) {
                      break L0;
                    } else {
                      L8: {
                        if (hp.field_b[var4] == null) {
                          break L8;
                        } else {
                          var3[var4] = hp.field_b[var4].field_b;
                          break L8;
                        }
                      }
                      var4++;
                      continue L7;
                    }
                  }
                }
              }
            } else {
              var9 = var16;
              var16 = var14;
              var17 = var15;
              var4 = 0;
              L9: while (true) {
                if (~var17.length >= ~var4) {
                  break L0;
                } else {
                  L10: {
                    if (hp.field_b[var4] != null) {
                      var9[var4] = hp.field_b[var4].field_m;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var4++;
                  continue L9;
                }
              }
            }
          }
        }
        L11: {
          if (((ih) this).field_G != param0) {
            ((ih) this).field_E = false;
            break L11;
          } else {
            L12: {
              stackOut_37_0 = this;
              stackIn_39_0 = stackOut_37_0;
              stackIn_38_0 = stackOut_37_0;
              if (((ih) this).field_E) {
                stackOut_39_0 = this;
                stackOut_39_1 = 0;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                break L12;
              } else {
                stackOut_38_0 = this;
                stackOut_38_1 = 1;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                break L12;
              }
            }
            ((ih) this).field_E = stackIn_40_1 != 0;
            break L11;
          }
        }
        L13: {
          ((ih) this).field_G = param0;
          if (((ih) this).field_E) {
            break L13;
          } else {
            var4 = 0;
            L14: while (true) {
              if (~var16.length >= ~var4) {
                break L13;
              } else {
                var3[var4] = -var16[var4];
                var4++;
                continue L14;
              }
            }
          }
        }
        L15: {
          if (lf.field_y != null) {
            qm.field_r = (u[]) lf.field_y.clone();
            ik.a((Object[]) (Object) qm.field_r, -88, var16);
            break L15;
          } else {
            break L15;
          }
        }
        ud.field_t.field_J = null;
        ud.field_t.e(true);
        var4 = param1;
        var5 = qm.field_r;
        var6 = 0;
        L16: while (true) {
          if (var5.length <= var6) {
            return;
          } else {
            L17: {
              var7 = var5[var6];
              if (var7 == null) {
                break L17;
              } else {
                var7.b(10, var4, (byte) 4);
                var4 = var4 + (8 + var7.field_x);
                ud.field_t.a((rj) (Object) var7, (byte) -78);
                break L17;
              }
            }
            var6++;
            continue L16;
          }
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        eh var3 = null;
        int var4 = 0;
        eh stackIn_9_0 = null;
        eh stackOut_8_0 = null;
        eh stackOut_7_0 = null;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param0 == 1793) {
            break L0;
          } else {
            ((ih) this).field_t = 120;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 8) {
            ho.b((byte) -36);
            return;
          } else {
            um.field_i[var2] = gm.field_d.field_a[var2];
            if (null != um.field_i[var2]) {
              L2: {
                if (um.field_i[var2].field_p == 255) {
                  stackOut_8_0 = k.field_c;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = um.field_i[var2].field_n.field_e;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              var3 = stackIn_9_0;
              um.field_i[var2].field_b = new wd(var3);
              var2++;
              continue L1;
            } else {
              var2++;
              continue L1;
            }
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
        var8 = DungeonAssault.field_K;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= 2) {
            return;
          } else {
            var4 = 0;
            L1: while (true) {
              if (4 > var4) {
                var5 = 195 + 102 * var4;
                var6 = 60 + 104 * var3;
                gf.e(var5, var6, 96, 96, 0);
                var7 = 0;
                gf.b(var5 - -4, 4 + var6, 88, 88, var7);
                rp.a(4, 88, (byte) 108, var5 - -4, 88, kc.field_S, 4 + var6);
                if (7 != var2) {
                  var4++;
                  var2++;
                  continue L1;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        Object var3 = null;
        h var4 = null;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        ((ih) this).field_C = param1;
        if (param0 == -112) {
          L0: {
            var3 = null;
            if (((ih) this).field_C == -1) {
              break L0;
            } else {
              var3 = (Object) (Object) um.field_i[((ih) this).field_C];
              break L0;
            }
          }
          L1: {
            if (var3 == null) {
              mi.a(in.field_y, sa.field_e, (se) (Object) ne.field_c, 13195, jm.field_i);
              in.field_y.field_w = false;
              break L1;
            } else {
              var4 = ((hb) var3).field_n;
              if (255 != ((hb) var3).field_p) {
                L2: {
                  if (var4.field_m > ((hb) var3).field_e) {
                    break L2;
                  } else {
                    if (((hb) var3).field_g < var4.field_r) {
                      break L2;
                    } else {
                      if (((hb) var3).field_f < var4.field_b) {
                        break L2;
                      } else {
                        if (((hb) var3).field_k >= var4.field_o) {
                          mi.a(in.field_y, sa.field_e, (se) (Object) ne.field_c, 13195, jm.field_i);
                          in.field_y.field_w = false;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                mi.a(in.field_y, ae.field_e, (se) (Object) ne.field_c, 13195, jm.field_i);
                in.field_y.field_n = (en) (Object) new e((String) null, jk.a(new String[2], t.field_c, 30496), (String) null);
                in.field_y.field_w = true;
                break L1;
              } else {
                mi.a(in.field_y, sa.field_e, (se) (Object) ne.field_c, 13195, jm.field_i);
                in.field_y.field_n = (en) (Object) new e((String) null, jk.a(new String[2], e.field_g, 30496), (String) null);
                in.field_y.field_w = true;
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        h var4 = null;
        u var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        lf.field_y = new u[hp.field_b.length];
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (hp.field_b.length <= var3) {
            return;
          } else {
            var4 = hp.field_b[var3];
            if (var4 != null) {
              if (var4.field_x != -1) {
                if (null != var4.field_F) {
                  if (var4.field_c <= gm.field_d.field_m) {
                    var5 = new u(10, var2, var4);
                    var2 = var2 + (10 + var5.field_x);
                    lf.field_y[var3] = var5;
                    var5.field_n = (en) (Object) new fc(var4);
                    op.field_d.a((gd) (Object) var5, (byte) -20);
                    var3++;
                    continue L0;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final void c(boolean param0) {
        hb[] var2 = null;
        int var3 = 0;
        hb var4 = null;
        int var5 = 0;
        hb[] var6 = null;
        lf var7 = null;
        var5 = DungeonAssault.field_K;
        super.c(param0);
        if (kh.field_s) {
          return;
        } else {
          if (!param0) {
            return;
          } else {
            L0: while (true) {
              if (!ha.b((byte) 47)) {
                L1: {
                  this.f(-24900);
                  if (((ih) this).field_b == null) {
                    break L1;
                  } else {
                    if (!((ih) this).field_b.field_d) {
                      break L1;
                    } else {
                      L2: {
                        var7 = (lf) (Object) ((ih) this).field_b;
                        if (var7.field_u) {
                          this.d(true);
                          break L2;
                        } else {
                          this.d(1793);
                          break L2;
                        }
                      }
                      ((ih) this).field_b.c(-127);
                      ((ih) this).field_b = null;
                      gd.a(g.field_Hb, 0, g.field_Hb, false);
                      break L1;
                    }
                  }
                }
                L3: {
                  if (!kn.field_g) {
                    break L3;
                  } else {
                    bl.a(0);
                    break L3;
                  }
                }
                var6 = um.field_i;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    L5: {
                      if (((ih) this).field_F != null) {
                        ((ih) this).field_F.a((byte) 109, 20);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    return;
                  } else {
                    var4 = var6[var3];
                    if (var4 != null) {
                      var4.field_b.a((byte) 109, 20);
                      var3++;
                      continue L4;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              } else {
                if (13 == mm.field_t) {
                  this.a((byte) -61, false);
                  continue L0;
                } else {
                  super.f();
                  continue L0;
                }
              }
            }
          }
        }
    }

    ih() {
        ((ih) this).field_B = new tf((se) (Object) ne.field_c, lg.field_h, cm.field_M);
        tf discarded$0 = new tf((se) (Object) db.field_v, ak.field_m.toUpperCase(), cm.field_M);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_J = new int[256];
        field_r = new int[128];
        field_s = "Spectre";
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            field_v = "Chaos Champion";
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_J[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1) == 1) {
                  var0 = -306674912 ^ var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
