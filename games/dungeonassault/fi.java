/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends qe {
    static String field_t;
    static en[] field_r;
    private tf[] field_w;
    private cn field_v;
    private kl field_z;
    private tf field_A;
    private cn field_C;
    static nh field_u;
    private rh field_s;
    private int field_B;
    private int field_y;
    static String field_x;
    private rh field_D;

    private final int a(int param0) {
        int var3 = 120;
        int var4 = nk.field_Fb[param0];
        if (var4 == 27) {
            var3 = of.field_j.field_y;
        }
        return var3 + this.a((byte) -4, param0);
    }

    final static java.awt.Canvas d(boolean param0) {
        return cm.field_R == null ? c.field_h : (java.awt.Canvas) (Object) cm.field_R;
    }

    private final int a(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          var3 = nk.field_Fb[param1];
          if (25 == var3) {
            break L0;
          } else {
            if (var3 == 24) {
              break L0;
            } else {
              if (var3 == 26) {
                break L0;
              } else {
                if (var3 != 27) {
                  return 439;
                } else {
                  return 340;
                }
              }
            }
          }
        }
        return 260;
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        var4 = 0;
        L0: while (true) {
          if (var4 >= nk.field_Fb.length) {
            return -1;
          } else {
            var5 = this.a(false, var4);
            if (nl.a(var4, (byte) -124)) {
              if (param2 >= this.a((byte) -4, var4)) {
                int discarded$1 = -93;
                if (param2 < this.a(var4)) {
                  if (param0 >= var5) {
                    if (param0 < this.c(30, var4) + var5) {
                      return var4;
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
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] stackIn_3_0 = null;
        int[] stackOut_2_0 = null;
        int[] stackOut_1_0 = null;
        L0: {
          var4 = nk.field_Fb[param1];
          var5 = this.a(-13, var4);
          var6 = ne.field_c.b(var5);
          var7 = this.a((byte) -4, param1);
          int discarded$1 = -93;
          var8 = this.a(param1);
          var9 = this.a(false, param1);
          var10 = var8 - (-var7 + var6) >> 1;
          if (!param0) {
            stackOut_2_0 = cm.field_M;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ml.field_b;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            var16 = stackIn_3_0;
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var11 = var13;
            if (null == ((fi) this).field_w[param1]) {
              break L2;
            } else {
              if (var5 != ((fi) this).field_w[param1].field_f) {
                break L2;
              } else {
                if (((fi) this).field_w[param1].field_h == var11) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          ((fi) this).field_w[param1] = new tf((se) (Object) ne.field_c, var5, var16);
          break L1;
        }
        L3: {
          of.field_j.h(640 - of.field_j.field_y >> 1, var9 + -4);
          ((fi) this).field_w[param1].b(var9, 32, var10);
          if (param0) {
            L4: {
              if (param1 == ((fi) this).field_y) {
                break L4;
              } else {
                this.b(param1, -118);
                break L4;
              }
            }
            L5: {
              ((fi) this).field_v.b(var10, var9, 64);
              var12 = (int)((1.0 + te.a(mo.field_a)) * 128.0);
              if (0 <= var12) {
                break L5;
              } else {
                var12 = 0;
                break L5;
              }
            }
            L6: {
              if (256 < var12) {
                var12 = 256;
                break L6;
              } else {
                break L6;
              }
            }
            ((fi) this).field_C.b(var10, var9, var12);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final void c(boolean param0) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = DungeonAssault.field_K;
            super.c(param0);
            if (!kh.field_s) {
              break L1;
            } else {
              if (param0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: while (true) {
            int discarded$7 = 47;
            if (!ha.b()) {
              nk.field_Jb.a(-7734, this.a(hm.field_k, (byte) 116, lc.field_c), this.a(eh.field_h, (byte) 116, hj.field_S));
              if (-1 == nk.field_Jb.field_b) {
                break L0;
              } else {
                this.b(true, 240, nk.field_Jb.field_b);
                break L0;
              }
            } else {
              if (mm.field_t != 13) {
                ((fi) this).f();
                if (nk.field_Jb.field_b != -1) {
                  this.b(false, 240, nk.field_Jb.field_b);
                  continue L2;
                } else {
                  continue L2;
                }
              } else {
                gd.a(hl.field_f, 0, hl.field_f, false);
                continue L2;
              }
            }
          }
        }
    }

    final void c() {
        super.c();
    }

    final void b(boolean param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          super.b(param0);
          if (nk.field_Jb.field_i > 0) {
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (nk.field_Jb.field_b == -1) {
            break L1;
          } else {
            var2 = nk.field_Jb.field_b;
            break L1;
          }
        }
        nk.field_Jb.a(false, param0, var2, this.a(eh.field_h, (byte) 116, hj.field_S));
        ((fi) this).field_D = new rh(58, 394, 80, 160, 255, 197376, 240);
        ((fi) this).field_s = new rh(580, 394, 80, 160, 255, 197376, 240);
        ((fi) this).field_w = new tf[nk.field_Jb.field_i];
        ((fi) this).field_z = new kl();
        jh.a(((fi) this).field_e);
        int discarded$2 = -128;
        bf.a(false);
        kn.field_e = false;
        c.a(0, 640, 0, (byte) 44);
        c.a(0, 640, 40, (byte) 44);
        vf.a(432, true, 33, 125, 48);
        vf.a(432, true, 599, 117, 48);
        vf.a(32, true, 164, -110, 8);
        vf.a(32, true, 468, -2, 8);
        int discarded$3 = 1;
        un.a(41, (byte) -98, 558, 416);
        ad.field_e.h(41, 48);
        ad.field_e.j(-ad.field_e.field_d + 599, 48);
        ad.field_e.f(164 - ad.field_e.field_d, -ad.field_e.field_b + 40);
        ad.field_e.i(172, 40 - ad.field_e.field_b);
        ad.field_e.f(468 - ad.field_e.field_d, 40 + -ad.field_e.field_b);
        ad.field_e.i(476, -ad.field_e.field_b + 40);
        jh.b();
    }

    private final int c(int param0, int param1) {
        return 30;
    }

    final void a(boolean param0) {
        int var2 = 0;
        Object var3 = null;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        var10 = DungeonAssault.field_K;
        super.a(param0);
        ((fi) this).field_e.b(0, 0);
        am.field_a.h(320 + -(am.field_a.field_E / 2), 48);
        var2 = 0;
        L0: while (true) {
          if (var2 >= -1 + nk.field_Jb.field_i) {
            L1: {
              oe.field_m.h(24, 383);
              oe.field_m.j(560, 383);
              if (!kn.field_e) {
                fi.e();
                break L1;
              } else {
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= -1 + nk.field_Jb.field_i) {
                L3: {
                  L4: {
                    na.field_w.a(320, 25, 1699);
                    if (((fi) this).field_A == null) {
                      break L4;
                    } else {
                      if (((fi) this).field_A.field_f != ie.field_j[mo.field_e]) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((fi) this).field_A = new tf((se) (Object) ne.field_c, ie.field_j[mo.field_e], ag.field_c);
                  break L3;
                }
                L5: {
                  ((fi) this).field_A.b(90, 32, 87);
                  int discarded$4 = 125;
                  int discarded$5 = 446;
                  this.a(87, 3740, 200, en.field_a[mo.field_e]);
                  int discarded$6 = 31139;
                  wk.a(552, bj.a(mo.field_e, 77), (se) (Object) ne.field_c, 366, ag.field_c);
                  if (!kn.field_e) {
                    break L5;
                  } else {
                    L6: {
                      ((fi) this).field_z.a((byte) -64);
                      var2 = nk.field_Jb.field_i + -1;
                      fi.e();
                      ((fi) this).field_z.b(106);
                      stackOut_26_0 = this;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (nk.field_Jb.field_b != var2) {
                        stackOut_28_0 = this;
                        stackOut_28_1 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        break L6;
                      } else {
                        stackOut_27_0 = this;
                        stackOut_27_1 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        break L6;
                      }
                    }
                    L7: {
                      this.a(stackIn_29_1 != 0, var2, 0);
                      var3 = null;
                      var4 = null;
                      if (((fi) this).field_B == 2) {
                        var4 = (Object) (Object) tn.a((byte) -65, this.a(-13, 26));
                        var3 = (Object) (Object) sg.field_a;
                        break L7;
                      } else {
                        if (1 != ((fi) this).field_B) {
                          if (((fi) this).field_B == 0) {
                            var4 = (Object) (Object) tn.a((byte) -76, this.a(-13, 24));
                            var3 = (Object) (Object) uj.field_b;
                            break L7;
                          } else {
                            break L7;
                          }
                        } else {
                          var4 = (Object) (Object) tn.a((byte) -99, this.a(-13, 25));
                          var3 = (Object) (Object) an.field_D;
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var5 = ne.field_c.field_E + ne.field_c.field_H;
                      if (((fi) this).field_B != 0) {
                        var9 = 204;
                        var7 = 169;
                        var8 = 306;
                        var6 = 167;
                        break L8;
                      } else {
                        var7 = 119;
                        var9 = 254;
                        var6 = 77;
                        var8 = 486;
                        break L8;
                      }
                    }
                    pi.a(0, (String) var4, cm.field_M, 30 + var6, (se) (Object) ne.field_c, var5 + var7);
                    var7 = var7 + (5 + var5);
                    int discarded$7 = la.field_b.a((String) var3, 30 + var6, var7, var8 - 60, -30 + var9, 16777215, -1, 0, 0, la.field_b.field_H + la.field_b.field_E);
                    break L5;
                  }
                }
                oh.a((byte) 36);
                ((fi) this).field_D.d();
                ((fi) this).field_s.d();
                return;
              } else {
                if (nl.a(var2, (byte) -124)) {
                  L9: {
                    L10: {
                      stackOut_16_0 = this;
                      stackOut_16_1 = 1;
                      stackOut_16_2 = var2;
                      stackIn_19_0 = stackOut_16_0;
                      stackIn_19_1 = stackOut_16_1;
                      stackIn_19_2 = stackOut_16_2;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      if (nk.field_Jb.field_b != var2) {
                        break L10;
                      } else {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = stackIn_17_2;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        if (kn.field_e) {
                          break L10;
                        } else {
                          stackOut_18_0 = this;
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = stackIn_18_2;
                          stackOut_18_3 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          stackIn_20_2 = stackOut_18_2;
                          stackIn_20_3 = stackOut_18_3;
                          break L9;
                        }
                      }
                    }
                    stackOut_19_0 = this;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    stackIn_20_3 = stackOut_19_3;
                    break L9;
                  }
                  this.a(stackIn_20_1, stackIn_20_2, stackIn_20_3 != 0);
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            if (nl.a(var2, (byte) -124)) {
              L11: {
                L12: {
                  stackOut_4_0 = this;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var2 != nk.field_Jb.field_b) {
                    break L12;
                  } else {
                    stackOut_5_0 = this;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (kn.field_e) {
                      break L12;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L11;
                    }
                  }
                }
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L11;
              }
              this.c(stackIn_8_1 != 0, -33, var2);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void c(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var4 = this.a((byte) -4, param2);
          int discarded$2 = -93;
          var5 = this.a(param2);
          var6 = this.a(false, param2);
          var7 = this.c(30, param2);
          gf.e(-4 + var4, -6 + var6, 8 + (var5 + -var4), 8 + var7, 0);
          fi.b(var4, var6 + -2, -var4 + var5, var7, 8421504, 128, 128);
          var9 = 0;
          var8 = nk.field_Fb[param2];
          if (var8 != -26) {
            if (var8 != 24) {
              if (-27 == var8) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_8_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = stackIn_8_0;
          if (var10 != 0) {
            rp.a(4, -var4 + var5, (byte) 108, var4, var7, kc.field_V, -2 + var6);
            break L1;
          } else {
            rp.a(4, var5 - var4, (byte) 108, var4, var7, kc.field_S, var6 + -2);
            break L1;
          }
        }
        fi.a(var4, var6 + -2, var5 - var4, var7, 224, 64, 3, 128);
    }

    final static void a(int param0, int param1, String param2, int param3) {
        int var5 = 99 % ((3 - param1) / 34);
        ac var4 = gh.field_i[param3];
        if (var4 == null) {
            return;
        }
        try {
            cf dupTemp$0 = hd.a(false, param0, "da_guardian_room_" + param2);
            var4.field_a = dupTemp$0;
            var4.field_x = dupTemp$0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "fi.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    private final void b(int param0, int param1) {
        int var3 = nk.field_Fb[param0];
        String var4 = this.a(-13, var3);
        int var5 = ne.field_c.b(var4);
        int var6 = ne.field_c.field_E + ne.field_c.field_H;
        if (param1 > -85) {
            return;
        }
        cn var7 = new cn(var5, var6);
        jh.a(var7);
        ne.field_c.b(var4, 0, ne.field_c.field_H, 16760960, -1);
        jh.b();
        ((fi) this).field_v = rb.a(8, var7, 16760960, (byte) 77);
        ((fi) this).field_C = rb.a(16, var7, 6307840, (byte) -105);
        ((fi) this).field_y = param0;
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        var3 = nk.field_Fb[param1];
        if (var3 != 27) {
          L0: {
            L1: {
              if (var3 == 25) {
                break L1;
              } else {
                if (24 == var3) {
                  break L1;
                } else {
                  if (var3 != 26) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            param1 -= 3;
            break L0;
          }
          return 140 * param1 + 120;
        } else {
          return 640 - of.field_j.field_y >> 1;
        }
    }

    final void f() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = DungeonAssault.field_K;
          if (!nk.field_Jb.b((byte) -84)) {
            if (!kn.field_e) {
              L1: {
                if (96 != mm.field_t) {
                  break L1;
                } else {
                  var1 = nk.field_Jb.field_b;
                  L2: while (true) {
                    L3: {
                      var1--;
                      if (var1 >= 0) {
                        break L3;
                      } else {
                        var1 = nk.field_Jb.field_i - 1;
                        break L3;
                      }
                    }
                    if (!nl.a(var1, (byte) -124)) {
                      continue L2;
                    } else {
                      nk.field_Jb.b(var1, 3);
                      break L1;
                    }
                  }
                }
              }
              L4: {
                if (mm.field_t == 97) {
                  var1 = nk.field_Jb.field_b;
                  L5: while (true) {
                    L6: {
                      var1++;
                      if (nk.field_Jb.field_i <= var1) {
                        var1 = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (!nl.a(var1, (byte) -124)) {
                      continue L5;
                    } else {
                      nk.field_Jb.b(var1, 3);
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
              L7: {
                if (6 != mo.field_e) {
                  break L7;
                } else {
                  L8: {
                    if (98 == mm.field_t) {
                      var1 = nk.field_Jb.field_b;
                      L9: while (true) {
                        L10: {
                          var1 -= 3;
                          if (var1 >= 0) {
                            break L10;
                          } else {
                            var1 = -1 + nk.field_Jb.field_i - -var1;
                            break L10;
                          }
                        }
                        if (!nl.a(var1, (byte) -124)) {
                          continue L9;
                        } else {
                          nk.field_Jb.b(var1, 3);
                          break L8;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  if (mm.field_t != 99) {
                    break L7;
                  } else {
                    var1 = nk.field_Jb.field_b;
                    L11: while (true) {
                      L12: {
                        var1 += 3;
                        if (var1 == 6) {
                          var1 = 0;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (var1 < nk.field_Jb.field_i) {
                          break L13;
                        } else {
                          var1 = var1 - (-1 + nk.field_Jb.field_i);
                          break L13;
                        }
                      }
                      if (!nl.a(var1, (byte) -124)) {
                        continue L11;
                      } else {
                        nk.field_Jb.b(var1, 3);
                        break L7;
                      }
                    }
                  }
                }
              }
              nk.field_Jb.e(107);
              super.f();
              break L0;
            } else {
              nk.field_Jb.e(107);
              super.f();
              break L0;
            }
          } else {
            nk.field_Jb.e(107);
            super.f();
            break L0;
          }
        }
    }

    public static void a(byte param0) {
        field_x = null;
        if (param0 > -99) {
            fi.a((byte) 2);
        }
        field_r = null;
        field_t = null;
        field_u = null;
    }

    private final void a(int param0, int param1, int param2, String param3) {
        String[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        String[] var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
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
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            var7 = jn.a(param3, new int[1], -107, (se) (Object) la.field_b);
            var8 = la.field_b.field_H + 125;
            var9 = var7;
            var10 = 0;
            L1: while (true) {
              if (var9.length <= var10) {
                break L0;
              } else {
                L2: {
                  var11 = var9[var10];
                  if (334 <= la.field_b.b(var11)) {
                    la.field_b.b(var11, 87, var8, 16777215, -1);
                    break L2;
                  } else {
                    la.field_b.b(var11, 87, var8, 16777215, -1);
                    break L2;
                  }
                }
                var8 = var8 + (la.field_b.field_E + la.field_b.field_H);
                var10++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var7_ref;
            stackOut_10_1 = new StringBuilder().append("fi.Q(").append(87).append(44).append(3740).append(44).append(200).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 446 + 44 + 125 + 41);
        }
    }

    private final void b(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = DungeonAssault.field_K;
          var4 = nk.field_Fb[param2];
          if (!nk.field_Jb.c(64)) {
            break L0;
          } else {
            if (nl.a(param2, (byte) -124)) {
              L1: {
                if (var4 == 27) {
                  kn.field_e = false;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (kn.field_e) {
                  break L2;
                } else {
                  L3: {
                    if (var4 == 25) {
                      break L3;
                    } else {
                      if (var4 == 24) {
                        break L3;
                      } else {
                        if (26 == var4) {
                          break L3;
                        } else {
                          hm.a(var4, param2, param0, -45);
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    if (var4 != 26) {
                      if (var4 == 25) {
                        ((fi) this).field_B = 1;
                        break L4;
                      } else {
                        if (24 == var4) {
                          ((fi) this).field_B = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      ((fi) this).field_B = 2;
                      break L4;
                    }
                  }
                  L5: {
                    kn.field_e = true;
                    if (!param0) {
                      nk.field_Jb.field_b = 6;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (((fi) this).field_B != 0) {
                      var5 = 167;
                      var6 = 154;
                      var7 = 306;
                      var8 = 204;
                      break L6;
                    } else {
                      var6 = 104;
                      var7 = 486;
                      var8 = 254;
                      var5 = 77;
                      break L6;
                    }
                  }
                  ((fi) this).field_z.a(var6, var7, var5, -23241, var8);
                  break L2;
                }
              }
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] stackIn_3_0 = null;
        int[] stackOut_2_0 = null;
        int[] stackOut_1_0 = null;
        L0: {
          var4 = nk.field_Fb[param1];
          var5 = this.a(-13, var4);
          var6 = ne.field_c.b(var5);
          var7 = this.a((byte) -4, param1);
          int discarded$1 = -93;
          var8 = this.a(param1);
          var9 = this.a(false, param1);
          var10 = -var6 + (var8 - -var7) >> 1;
          if (param2) {
            stackOut_2_0 = ml.field_b;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = cm.field_M;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            var16 = stackIn_3_0;
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var11 = var13;
            if (null == ((fi) this).field_w[param1]) {
              break L2;
            } else {
              if (var5 != ((fi) this).field_w[param1].field_f) {
                break L2;
              } else {
                if (((fi) this).field_w[param1].field_h != var11) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
          }
          ((fi) this).field_w[param1] = new tf((se) (Object) ne.field_c, var5, var16);
          break L1;
        }
        L3: {
          ((fi) this).field_w[param1].b(var9, 32, var10);
          if (param2) {
            L4: {
              if (((fi) this).field_y == param1) {
                break L4;
              } else {
                this.b(param1, -114);
                break L4;
              }
            }
            L5: {
              ((fi) this).field_v.b(var10, var9, 64);
              var12 = (int)(128.0 * (1.0 + te.a(mo.field_a)));
              if (var12 >= 0) {
                break L5;
              } else {
                var12 = 0;
                break L5;
              }
            }
            L6: {
              if (var12 > 256) {
                var12 = 256;
                break L6;
              } else {
                break L6;
              }
            }
            ((fi) this).field_C.b(var10, var9, var12);
            break L3;
          } else {
            break L3;
          }
        }
    }

    fi() {
        ((fi) this).field_y = -1;
    }

    private final String a(int param0, int param1) {
        String var3 = null;
        L0: {
          var3 = ll.field_m[param1];
          if (param1 != 10) {
            break L0;
          } else {
            L1: {
              L2: {
                if (hl.field_f == 0) {
                  break L2;
                } else {
                  if (0 == dc.field_z) {
                    break L2;
                  } else {
                    if (hl.field_f == 12) {
                      break L2;
                    } else {
                      if (dc.field_z == 12) {
                        break L2;
                      } else {
                        if (hl.field_f == 1) {
                          break L2;
                        } else {
                          if (dc.field_z != 1) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var3 = ll.field_m[9];
              break L1;
            }
            break L0;
          }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Disarmed";
        field_r = null;
        field_x = "Not yet achieved";
    }
}
