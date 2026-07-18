/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cv {
    static String field_v;
    private cq field_d;
    private iq field_p;
    private int field_a;
    static String field_r;
    private iq field_c;
    static String field_q;
    static Boolean field_s;
    static String field_n;
    private cq field_b;
    static String field_m;
    private bg field_i;
    private cq field_u;
    private iq field_f;
    static String field_k;
    private int field_l;
    private iq field_t;
    private iq field_j;
    private iq field_h;
    private iq field_o;
    private pr field_e;
    private bg field_g;

    final void e(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 13) {
                break L1;
              } else {
                ((cv) this).field_t = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((cv) this).field_a == 1) {
                  break L3;
                } else {
                  L4: {
                    if (((cv) this).field_a == 0) {
                      break L4;
                    } else {
                      L5: {
                        if (((cv) this).field_a != 2) {
                          break L5;
                        } else {
                          int discarded$8 = -25752;
                          this.e();
                          int discarded$9 = 88;
                          this.a();
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (((cv) this).field_a == 3) {
                        int discarded$10 = -25752;
                        this.e();
                        int discarded$11 = 26;
                        this.d();
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  int discarded$12 = 396;
                  this.h();
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              int discarded$13 = -25752;
              this.e();
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "cv.N(" + param0 + ')');
        }
    }

    private final void f() {
        RuntimeException runtimeException = null;
        sl var2 = null;
        om var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = ku.j(124);
              var3 = ar.a(var2.field_g, var2.field_e, 0);
              ts.a(var3, -1, var2);
              var4 = var3.field_w;
              var5 = rd.field_j.field_xb.field_mb[var4];
              if (var5 <= 1) {
                break L1;
              } else {
                vo.a(false, 1, var5, var3);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "cv.FA(" + -2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        cq var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = this.a(321, param0);
              if (param1 == 33) {
                break L1;
              } else {
                ((cv) this).field_i = null;
                break L1;
              }
            }
            L2: {
              if (null == var4) {
                break L2;
              } else {
                L3: {
                  if (var4.field_A <= param2) {
                    break L3;
                  } else {
                    if (1 == param2) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                var4.field_r = ir.a(10602, param2);
                var4.field_A = param2;
                break L0;
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "cv.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((cv) this).field_o = null;
                break L1;
              }
            }
            ((cv) this).field_g = new bg(32);
            this.a(0, (byte) 42);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "cv.CA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        String var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              ef.b(-1);
              if (rd.field_j != null) {
                rd.field_j.A(111);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == bc.field_a) {
                break L2;
              } else {
                bc.field_a.A(111);
                break L2;
              }
            }
            rd.field_j = null;
            bc.field_a = null;
            System.gc();
            int discarded$9 = 0;
            vk.field_e[0] = new wk(vc.field_m.a("campaign_1.jpg", -105, ""), (java.awt.Component) (Object) ll.p());
            int discarded$10 = 0;
            vk.field_e[1] = new wk(vc.field_m.a("campaign_2.jpg", 13, ""), (java.awt.Component) (Object) ll.p());
            int discarded$11 = 0;
            vk.field_e[2] = new wk(vc.field_m.a("campaign_3.jpg", -91, ""), (java.awt.Component) (Object) ll.p());
            mu.field_g = new ru[3][3];
            var2_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (3 <= var2_int) {
                    break L5;
                  } else {
                    var3 = "campaign_map" + (var2_int - -1);
                    int discarded$12 = 24914;
                    mu.field_g[var2_int][0] = pv.a("campaign", var3, iw.field_l);
                    int discarded$13 = 24914;
                    mu.field_g[var2_int][1] = pv.a("campaign", var3 + "_areas", iw.field_l);
                    int discarded$14 = 24914;
                    mu.field_g[var2_int][2] = pv.a("campaign", var3 + "_full", iw.field_l);
                    var2_int++;
                    if (var4 != 0) {
                      break L4;
                    } else {
                      if (var4 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (param0 <= -62) {
                    break L6;
                  } else {
                    cv.d((byte) -46);
                    break L6;
                  }
                }
                pl.field_D = new wk[3];
                int discarded$15 = 0;
                pl.field_D[0] = nh.a("takenicon_zamorak", "campaign", iw.field_l);
                int discarded$16 = 0;
                pl.field_D[1] = nh.a("takenicon_saradomin", "campaign", iw.field_l);
                int discarded$17 = 0;
                pl.field_D[2] = nh.a("takenicon_guthix", "campaign", iw.field_l);
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "cv.F(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 3) {
                    break L3;
                  } else {
                    vk.field_e[var2_int] = null;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 >= 119) {
                    break L4;
                  } else {
                    this.b(4, 127);
                    break L4;
                  }
                }
                mu.field_g = null;
                pl.field_D = null;
                System.gc();
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "cv.EA(" + param0 + ')');
        }
    }

    private final void a() {
        sl var2 = null;
        RuntimeException var2_ref = null;
        om var3 = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
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
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var2 = ku.j(111);
                var3 = ar.a(var2.field_g, var2.field_e, 0);
                int discarded$2 = 0;
                var4 = ha.a(var3.field_B.length, var2.field_c);
                var5 = fo.a(4800, wd.field_e, new String[2]);
                var6 = fo.a(4800, hi.field_h, new String[1]);
                if (((cv) this).field_h != null) {
                  break L2;
                } else {
                  L3: {
                    var7 = 164;
                    var8 = nr.field_e.a(qf.field_c) / 2 - -26;
                    if (~var7 <= ~var8) {
                      break L3;
                    } else {
                      var7 = var8;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = 26 + nr.field_e.a(lb.field_c) / 2;
                    if (~var7 <= ~var9) {
                      break L4;
                    } else {
                      var7 = var9;
                      break L4;
                    }
                  }
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var7 = ((cv) this).field_h.field_i;
              break L1;
            }
            var8 = 26 + var7;
            var9 = rs.field_n.a(var6, var8, 0);
            var10 = 60 + (30 + (var9 - -14) + 50);
            var11 = -(var8 / 2) + 320;
            var12 = -(var10 / 2) + 240;
            var13 = 13 + var11;
            fe.b(db.a(true, var11), u.a(var12, (byte) 94), var8, var10, io.field_m, ci.field_e, 0, 192);
            var14 = -26 + var8;
            var15 = var13;
            var16 = var12 + 30;
            L5: {
              fe.a(((cv) this).field_b.field_w, db.a(true, var8 / 2 + var11), u.a(var16, (byte) 94), var8 - 20, nd.field_b, true, 40, 1);
              var16 += 14;
              int discarded$3 = rs.field_n.a(var6, db.a(true, var15), u.a(var16, (byte) 94), var14, var10, 16777215, 1, 1, 0, 0);
              var16 = var16 + (var9 - -30);
              if (((cv) this).field_h == null) {
                ((cv) this).field_h = new iq(qf.field_c, var15, var16, var7);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              ((cv) this).field_h.a(0);
              var16 += 40;
              if (null == ((cv) this).field_f) {
                ((cv) this).field_f = new iq(lb.field_c, var15, var16, var7);
                break L6;
              } else {
                break L6;
              }
            }
            ((cv) this).field_f.a(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "cv.A(" + 88 + ')');
        }
    }

    private final void h() {
        Object var2 = null;
        cq var3 = null;
        String var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_8_0 = null;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        wk[] stackIn_9_4 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        wk[] stackIn_11_4 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        wk[] stackIn_12_4 = null;
        int[] stackIn_12_5 = null;
        boolean stackIn_31_0 = false;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_5_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        wk[] stackOut_8_4 = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        wk[] stackOut_11_4 = null;
        int[] stackOut_11_5 = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        wk[] stackOut_9_4 = null;
        int[] stackOut_9_5 = null;
        boolean stackOut_30_0 = false;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_52_0 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              fe.a(db.a(true, 32), u.a(71, (byte) 94), 305, 228, io.field_m, jh.field_k, 0, 128, ai.field_V, true, nd.field_b);
              fe.a(db.a(true, 32), u.a(321, (byte) 94), 305, 92, io.field_m, jh.field_k, 0, 128, be.field_A, true, nd.field_b);
              if (null == ((cv) this).field_d) {
                break L1;
              } else {
                L2: {
                  if (((cv) this).field_d.field_k == -1) {
                    stackOut_7_0 = be.field_A;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_5_0 = ((cv) this).field_d.field_w;
                    stackIn_8_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var2 = (Object) (Object) stackIn_8_0;
                  fe.a(db.a(true, 346), u.a(70, (byte) 94), 262, 343, io.field_m, jh.field_k, 0, 128, (String) var2, true, nd.field_b);
                  stackOut_8_0 = db.a(true, 354);
                  stackOut_8_1 = u.a(361, (byte) 94);
                  stackOut_8_2 = 246;
                  stackOut_8_3 = 41;
                  stackOut_8_4 = il.field_s;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  stackIn_11_3 = stackOut_8_3;
                  stackIn_11_4 = stackOut_8_4;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  if (!wg.a(-33, db.a(true, 354), db.a(true, 354) - -246, u.a(361, (byte) 94), u.a(361, (byte) 94) - -41)) {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = stackIn_11_2;
                    stackOut_11_3 = stackIn_11_3;
                    stackOut_11_4 = (wk[]) (Object) stackIn_11_4;
                    stackOut_11_5 = nd.field_b;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    stackIn_12_5 = stackOut_11_5;
                    break L3;
                  } else {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = stackIn_9_2;
                    stackOut_9_3 = stackIn_9_3;
                    stackOut_9_4 = (wk[]) (Object) stackIn_9_4;
                    stackOut_9_5 = ci.field_e;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_12_1 = stackOut_9_1;
                    stackIn_12_2 = stackOut_9_2;
                    stackIn_12_3 = stackOut_9_3;
                    stackIn_12_4 = stackOut_9_4;
                    stackIn_12_5 = stackOut_9_5;
                    break L3;
                  }
                }
                L4: {
                  fe.a(stackIn_12_0, stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_12_4, stackIn_12_5, 0, 0);
                  var3_ref = io.field_o;
                  if (((cv) this).field_d.field_k == -1) {
                    var3_ref = es.field_b;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    int discarded$4 = 1;
                    fe.c(var3_ref, db.a(true, 477), u.a(396, (byte) 94), 0);
                    var4 = db.a(true, 359);
                    var5 = u.a(85, (byte) 94);
                    id.a(var4, var4 + 236, var5 + 200, var5, (byte) 83);
                    if (((cv) this).field_d == null) {
                      break L6;
                    } else {
                      if (((cv) this).field_d.field_k != -1) {
                        break L6;
                      } else {
                        ((cv) this).field_d.field_m.f(-(((cv) this).field_d.field_m.field_y / 2) + (var4 + 118), var5);
                        if (var8 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  vk.field_e[((cv) this).field_d.field_k].g(var4, var5);
                  ((cv) this).field_d.field_m.f(var4, var5, Math.abs(g.a(-1, uk.field_n << 5) * 100 >> 16) + 80);
                  break L5;
                }
                rf.b(-18862);
                var6 = 5;
                var7 = 5 + rs.field_n.a(((cv) this).field_d.field_q, 232, 0);
                int discarded$5 = en.field_E.a(((cv) this).field_d.field_q, var4 + var6, 200 + var5, -(2 * var6) + 236, var7, 16777215, -1, 1, 0, 0);
                break L1;
              }
            }
            var2 = null;
            var3 = (cq) (Object) ((cv) this).field_g.b(1);
            L7: while (true) {
              L8: {
                L9: {
                  L10: {
                    if (null == var3) {
                      break L10;
                    } else {
                      stackOut_30_0 = var3.field_l;
                      stackIn_53_0 = stackOut_30_0 ? 1 : 0;
                      stackIn_31_0 = stackOut_30_0;
                      if (var8 != 0) {
                        break L9;
                      } else {
                        L11: {
                          L12: {
                            if (!stackIn_31_0) {
                              break L12;
                            } else {
                              L13: {
                                if (var3.a(sm.field_d, ko.field_b, 121)) {
                                  break L13;
                                } else {
                                  if (var3 != ((cv) this).field_d) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              stackOut_40_0 = 1;
                              stackIn_43_0 = stackOut_40_0;
                              break L11;
                            }
                          }
                          stackOut_42_0 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          break L11;
                        }
                        L14: {
                          var4 = stackIn_43_0;
                          this.a((byte) 13, false, var3, var4 != 0);
                          if (var4 == 0) {
                            break L14;
                          } else {
                            var2 = (Object) (Object) var3;
                            break L14;
                          }
                        }
                        var3 = (cq) (Object) ((cv) this).field_g.b((byte) 101);
                        if (var8 == 0) {
                          continue L7;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  if ((Object) (Object) ((cv) this).field_u == var2) {
                    break L8;
                  } else {
                    if (null != var2) {
                      stackOut_52_0 = 55;
                      stackIn_53_0 = stackOut_52_0;
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                te discarded$6 = ub.a((byte) stackIn_53_0, im.field_v[1]);
                break L8;
              }
              ((cv) this).field_u = (cq) var2;
              fe.a(og.field_u, db.a(true, 320), u.a(30, (byte) 94), nd.field_b, 1, false);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw ig.a((Throwable) var2, "cv.M(" + 396 + ')');
        }
    }

    public static void d(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_s = null;
              field_v = null;
              field_r = null;
              field_m = null;
              field_n = null;
              field_q = null;
              if (param0 == 44) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            field_k = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "cv.U(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1, cq param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        wk[] stackIn_15_4 = null;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        wk[] stackIn_17_4 = null;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        wk[] stackIn_18_4 = null;
        int[] stackIn_18_5 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        wk[] stackOut_14_4 = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        wk[] stackOut_17_4 = null;
        int[] stackOut_17_5 = null;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        wk[] stackOut_15_4 = null;
        int[] stackOut_15_5 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var5_int = db.a(true, -15 + param2.field_y);
                var6 = u.a(19 + param2.field_x, (byte) 94);
                id.a(db.a(true, param2.field_y), db.a(true, param2.field_B + param2.field_y), u.a(param2.field_x - -param2.field_o, (byte) 94), u.a(param2.field_x, (byte) 94), (byte) 125);
                var7 = 54;
                var8 = 128;
                var9 = -1;
                if (param2.field_l) {
                  break L2;
                } else {
                  L3: {
                    var8 = 48;
                    if (param2.field_k == 2) {
                      stackOut_4_0 = 2;
                      stackIn_5_0 = stackOut_4_0;
                      break L3;
                    } else {
                      stackOut_2_0 = 0;
                      stackIn_5_0 = stackOut_2_0;
                      break L3;
                    }
                  }
                  var9 = stackIn_5_0 - -1;
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (!param3) {
                  break L4;
                } else {
                  var8 = (int)(Math.sin((double)uk.field_n / 3.141592653589793 / 6.0) * 20.0 + 235.0);
                  break L4;
                }
              }
              var9 = 1 + param2.field_D;
              break L1;
            }
            hr.field_d[var9].g(var5_int, var6, var8);
            gt.field_c[var9].g(-12 + var5_int, var6 - 18, var8);
            L5: {
              rf.b(-18862);
              stackOut_14_0 = db.a(true, param2.field_y);
              stackOut_14_1 = u.a(param2.field_x, (byte) 94);
              stackOut_14_2 = param2.field_B;
              stackOut_14_3 = param2.field_o;
              stackOut_14_4 = tb.field_j;
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              stackIn_17_3 = stackOut_14_3;
              stackIn_17_4 = stackOut_14_4;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              stackIn_15_3 = stackOut_14_3;
              stackIn_15_4 = stackOut_14_4;
              if (param3) {
                stackOut_17_0 = stackIn_17_0;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = stackIn_17_2;
                stackOut_17_3 = stackIn_17_3;
                stackOut_17_4 = (wk[]) (Object) stackIn_17_4;
                stackOut_17_5 = nd.field_b;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                stackIn_18_4 = stackOut_17_4;
                stackIn_18_5 = stackOut_17_5;
                break L5;
              } else {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = stackIn_15_2;
                stackOut_15_3 = stackIn_15_3;
                stackOut_15_4 = (wk[]) (Object) stackIn_15_4;
                stackOut_15_5 = jh.field_k;
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                stackIn_18_2 = stackOut_15_2;
                stackIn_18_3 = stackOut_15_3;
                stackIn_18_4 = stackOut_15_4;
                stackIn_18_5 = stackOut_15_5;
                break L5;
              }
            }
            L6: {
              fe.b(stackIn_18_0, stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5, 0, 0);
              if (null != param2.field_w) {
                var10 = db.a(true, param2.field_y + var7);
                var11 = param2.field_o / 2 + param2.field_x + rs.field_n.field_v;
                fe.a(param2.field_w, var10, u.a(8 + (param2.field_x + param2.field_o / 2), (byte) 94), true);
                fe.a(param2.field_w, var10, u.a(param2.field_o / 2 + param2.field_x + 8, (byte) 94), nd.field_b, true);
                rs.field_n.b(param2.field_r, var10, u.a(var11, (byte) 94), 12303291, 1);
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("cv.Q(").append(13).append(',').append(false).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param3 + ')');
        }
    }

    final static void a(kl param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 12 % ((param2 - -16) / 40);
                if (0 != param1) {
                  break L2;
                } else {
                  cf discarded$11 = nu.a(23948, param0, 0);
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              cf discarded$12 = nu.a(23948, param0, 1);
              cf discarded$13 = nu.a(23948, param0, 2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("cv.G(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, boolean param1, boolean param2, cq param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        at var6_ref = null;
        a var7 = null;
        int var7_int = 0;
        Object var8 = null;
        wk var9 = null;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        int var13 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var6_int = -36;
                  if (((cv) this).field_b == param3) {
                    break L3;
                  } else {
                    if (!param4) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param3.field_t = param3.field_t + 20;
                if (var13 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              param3.field_t = param3.field_t - 14;
              break L1;
            }
            L4: {
              if (param3.field_m == null) {
                param3.field_m = ((cv) this).field_e.a(param3.field_k, 3355443, (byte) -73, 0);
                var6_ref = ((cv) this).field_e.a(param3.field_k, 1);
                if (null == var6_ref) {
                  break L4;
                } else {
                  var7 = (a) (Object) var6_ref.e((byte) 95);
                  if (null != var7) {
                    param3.field_y = var7.field_p;
                    param3.field_x = var7.field_l;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (param3.field_m != null) {
                L6: {
                  if (null == param3.field_r) {
                    break L6;
                  } else {
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            var6_int = 8421504;
                            var7_int = ((cv) this).field_l;
                            if (var7_int == 0) {
                              break L10;
                            } else {
                              if (var7_int == 1) {
                                break L9;
                              } else {
                                if (2 != var7_int) {
                                  break L7;
                                } else {
                                  if (var13 == 0) {
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                          var6_int = 8388608;
                          if (var13 == 0) {
                            break L7;
                          } else {
                            break L9;
                          }
                        }
                        var6_int = 10066380;
                        if (var13 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                      var6_int = 8573219;
                      break L7;
                    }
                    fe.c(param3.field_m, db.a(true, 0), u.a(3, (byte) 94), param3.field_m.field_y, var6_int);
                    break L6;
                  }
                }
                L11: {
                  if (param4) {
                    param3.field_m.f(db.a(true, 0), u.a(0, (byte) 94), 128);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  L13: {
                    if (!param2) {
                      break L13;
                    } else {
                      L14: {
                        if (null != param3.field_s) {
                          break L14;
                        } else {
                          param3.field_s = param3.field_m.g();
                          param3.field_s.c(228, 130, 4);
                          break L14;
                        }
                      }
                      param3.field_s.e(db.a(true, 0), u.a(0, (byte) 94), (ae.b(uk.field_n << 6, 100) >> 12) + 22);
                      if (var13 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  param3.field_s = null;
                  break L12;
                }
                if (param3.field_l) {
                  var6_ref = ((cv) this).field_e.a(param3.field_k, 1);
                  if (var6_ref == null) {
                    break L5;
                  } else {
                    var7 = (a) (Object) var6_ref.e((byte) 120);
                    if (null != var7) {
                      L15: {
                        var8 = null;
                        var10 = param3.field_p.field_E;
                        if (param3.field_r != null) {
                          var10 = 0;
                          var9 = pl.field_D[((cv) this).field_l];
                          break L15;
                        } else {
                          var8 = (Object) (Object) km.field_h[2];
                          var9 = param3.field_p.g(-1).field_h;
                          break L15;
                        }
                      }
                      L16: {
                        if (var8 != null) {
                          break L16;
                        } else {
                          if (null != var9) {
                            break L16;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L17: {
                        L18: {
                          var11 = 0;
                          var12 = 1.0f;
                          if (null == param3.field_r) {
                            break L18;
                          } else {
                            var12 = 0.8999999761581421f;
                            if (var13 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          L20: {
                            if (param3.field_t >= 256) {
                              break L20;
                            } else {
                              if (0 < param3.field_t) {
                                break L19;
                              } else {
                                param3.field_t = 0;
                                if (var13 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          param3.field_t = 256;
                          break L19;
                        }
                        L21: {
                          if (param3.field_t >= 164) {
                            break L21;
                          } else {
                            L22: {
                              if (param3.field_t <= 32) {
                                break L22;
                              } else {
                                var12 = 0.5f + 0.5f * (float)(-32 + param3.field_t) / 132.0f;
                                if (var13 == 0) {
                                  break L17;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            var12 = 0.5f;
                            if (var13 == 0) {
                              break L17;
                            } else {
                              break L21;
                            }
                          }
                        }
                        var12 = 1.0f;
                        break L17;
                      }
                      this.a((wk) var8, var11, var10, var7.field_l, var9, 1, var12, var7.field_p);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_87_0 = (RuntimeException) var6;
            stackOut_87_1 = new StringBuilder().append("cv.J(").append(-125).append(',').append(false).append(',').append(param2).append(',');
            stackIn_90_0 = stackOut_87_0;
            stackIn_90_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param3 == null) {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L23;
            } else {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "{...}";
              stackIn_91_0 = stackOut_88_0;
              stackIn_91_1 = stackOut_88_1;
              stackIn_91_2 = stackOut_88_2;
              break L23;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_91_0, stackIn_91_2 + ',' + param4 + ')');
        }
    }

    private final void d() {
        sl var2 = null;
        RuntimeException var2_ref = null;
        om var3 = null;
        int var4 = 0;
        String var5 = null;
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
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var2 = ku.j(97);
                var3 = ar.a(var2.field_g, var2.field_e, 0);
                int discarded$2 = 0;
                var4 = ha.a(var3.field_B.length, var2.field_c);
                var5 = fo.a(4800, sb.field_f, new String[1]);
                if (null == ((cv) this).field_c) {
                  break L2;
                } else {
                  var6 = ((cv) this).field_c.field_i;
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var6 = 164;
                var7 = nr.field_e.a(kd.field_Y) / 2 + 26;
                if (~var6 <= ~var7) {
                  break L3;
                } else {
                  var6 = var7;
                  break L3;
                }
              }
              L4: {
                var8 = 26 + nr.field_e.a(vh.field_r) / 2;
                if (var6 >= var8) {
                  break L4;
                } else {
                  var6 = var8;
                  break L4;
                }
              }
              var9 = 26 + nr.field_e.a(lb.field_c) / 2;
              if (~var9 >= ~var6) {
                break L1;
              } else {
                var6 = var9;
                break L1;
              }
            }
            L5: {
              var7 = 26 + var6;
              var8 = rs.field_n.a(var5, var7, 0);
              var9 = 154 + (var8 + 40);
              var10 = -(var7 / 2) + 320;
              var11 = 240 - var9 / 2;
              var12 = var10 - -13;
              fe.b(db.a(true, var10), u.a(var11, (byte) 94), var7, var9, io.field_m, ci.field_e, 0, 192);
              var13 = var7 - 26;
              var14 = var12;
              var15 = 30 + var11;
              fe.a(((cv) this).field_b.field_w, db.a(true, var10 - -(var7 / 2)), u.a(var15, (byte) 94), var7 + -20, nd.field_b, true, 40, 1);
              var15 += 14;
              int discarded$3 = rs.field_n.a(var5, db.a(true, var14), u.a(var15, (byte) 94), var13, var9, 16777215, 1, 1, 0, 0);
              var15 = var15 + (30 + var8);
              if (null != ((cv) this).field_c) {
                break L5;
              } else {
                ((cv) this).field_c = new iq(kd.field_Y, var14, var15, var6);
                break L5;
              }
            }
            L6: {
              ((cv) this).field_c.a(0);
              var15 += 40;
              if (null == ((cv) this).field_j) {
                ((cv) this).field_j = new iq(vh.field_r, var14, var15, var6);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var15 += 40;
              ((cv) this).field_j.a(0);
              if (((cv) this).field_o == null) {
                ((cv) this).field_o = new iq(lb.field_c, var14, var15, var6);
                break L7;
              } else {
                break L7;
              }
            }
            ((cv) this).field_o.a(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "cv.R(" + 26 + ')');
        }
    }

    final void b(int param0) {
        Object var2 = null;
        int var3 = 0;
        vk var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_32_0 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              hh.a(-16147, 50, qf.field_f, true);
              var2 = null;
              if (0 != ((cv) this).field_a) {
                L2: {
                  var3 = ((cv) this).field_l;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (var3 != 1) {
                        break L3;
                      } else {
                        if (var9 == 0) {
                          var2 = (Object) (Object) new int[]{1, 2, 4, 11, 12, 13};
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var3 != 2) {
                      break L1;
                    } else {
                      if (var9 == 0) {
                        var2 = (Object) (Object) new int[]{1, 14, 15, 16};
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var2 = (Object) (Object) new int[]{1, 2, 3, 9, 10};
                break L1;
              } else {
                var2 = (Object) (Object) new int[]{1, 2, 3, 5, 6, 7, 8};
                break L1;
              }
            }
            L4: {
              var3 = 113 % ((-3 - param0) / 56);
              if (null == var2) {
                break L4;
              } else {
                var4 = new vk();
                var5 = (int[]) var2;
                var6 = 0;
                L5: while (true) {
                  L6: {
                    if (var6 >= var5.length) {
                      break L6;
                    } else {
                      var7 = var5[var6];
                      var7--;
                      if (var9 != 0) {
                        break L4;
                      } else {
                        L7: {
                          L8: {
                            if (2 != ((cv) this).field_l) {
                              break L8;
                            } else {
                              if (var7 != 0) {
                                break L8;
                              } else {
                                stackOut_29_0 = 20 + gi.field_b;
                                stackIn_32_0 = stackOut_29_0;
                                break L7;
                              }
                            }
                          }
                          stackOut_31_0 = gi.field_b;
                          stackIn_32_0 = stackOut_31_0;
                          break L7;
                        }
                        L9: {
                          L10: {
                            var8 = stackIn_32_0;
                            stackOut_32_0 = var4.field_a;
                            stackOut_32_1 = var7;
                            stackIn_38_0 = stackOut_32_0;
                            stackIn_38_1 = stackOut_32_1;
                            stackIn_33_0 = stackOut_32_0;
                            stackIn_33_1 = stackOut_32_1;
                            if (((cv) this).field_a == 0) {
                              break L10;
                            } else {
                              stackOut_33_0 = (int[]) (Object) stackIn_33_0;
                              stackOut_33_1 = stackIn_33_1;
                              stackIn_38_0 = stackOut_33_0;
                              stackIn_38_1 = stackOut_33_1;
                              stackIn_34_0 = stackOut_33_0;
                              stackIn_34_1 = stackOut_33_1;
                              if (3 < var7) {
                                break L10;
                              } else {
                                stackOut_34_0 = (int[]) (Object) stackIn_34_0;
                                stackOut_34_1 = stackIn_34_1;
                                stackIn_36_0 = stackOut_34_0;
                                stackIn_36_1 = stackOut_34_1;
                                stackOut_36_0 = (int[]) (Object) stackIn_36_0;
                                stackOut_36_1 = stackIn_36_1;
                                stackOut_36_2 = var8;
                                stackIn_39_0 = stackOut_36_0;
                                stackIn_39_1 = stackOut_36_1;
                                stackIn_39_2 = stackOut_36_2;
                                break L9;
                              }
                            }
                          }
                          stackOut_38_0 = (int[]) (Object) stackIn_38_0;
                          stackOut_38_1 = stackIn_38_1;
                          stackOut_38_2 = 256;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          break L9;
                        }
                        stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                        var6++;
                        if (var9 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ((wn) (Object) lk.field_e.field_y).a((byte) 48, wf.field_v, var4);
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw ig.a((Throwable) var2, "cv.AA(" + param0 + ')');
        }
    }

    final static void a(byte param0, nr param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            b.field_k = param3;
            sg.field_c = param1;
            ov.field_b = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("cv.BA(").append(123).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c() {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        lo var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        om var15 = null;
        tc var16_ref_tc = null;
        int var16 = 0;
        int var17 = 0;
        String var17_ref_String = null;
        int var18 = 0;
        int var19_int = 0;
        Object var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        fu var23_ref = null;
        int var24_int = 0;
        wk var24 = null;
        int var25_int = 0;
        sl var25 = null;
        int var26 = 0;
        sd var26_ref_sd = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        cq stackIn_25_0 = null;
        cq stackIn_27_0 = null;
        int stackIn_30_0 = 0;
        String stackIn_30_1 = null;
        String[] stackIn_30_2 = null;
        String[] stackIn_30_3 = null;
        int stackIn_30_4 = 0;
        int stackIn_31_0 = 0;
        String stackIn_31_1 = null;
        String[] stackIn_31_2 = null;
        String[] stackIn_31_3 = null;
        int stackIn_31_4 = 0;
        int stackIn_32_0 = 0;
        String stackIn_32_1 = null;
        String[] stackIn_32_2 = null;
        String[] stackIn_32_3 = null;
        int stackIn_32_4 = 0;
        String stackIn_32_5 = null;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_77_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        cq stackOut_24_0 = null;
        cq stackOut_26_0 = null;
        int stackOut_29_0 = 0;
        String stackOut_29_1 = null;
        String[] stackOut_29_2 = null;
        String[] stackOut_29_3 = null;
        int stackOut_29_4 = 0;
        int stackOut_31_0 = 0;
        String stackOut_31_1 = null;
        String[] stackOut_31_2 = null;
        String[] stackOut_31_3 = null;
        int stackOut_31_4 = 0;
        String stackOut_31_5 = null;
        int stackOut_30_0 = 0;
        String stackOut_30_1 = null;
        String[] stackOut_30_2 = null;
        String[] stackOut_30_3 = null;
        int stackOut_30_4 = 0;
        String stackOut_30_5 = null;
        int stackOut_46_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_76_0 = 0;
        L0: {
          var29 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (((cv) this).field_b == null) {
            break L0;
          } else {
            if (!((cv) this).field_b.field_l) {
              break L0;
            } else {
              L1: {
                L2: {
                  if (null == ((cv) this).field_t) {
                    break L2;
                  } else {
                    var2_int = ((cv) this).field_t.field_i;
                    if (var29 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var2_int = 184;
                  var3 = 26 + nr.field_e.a(ul.field_j) / 2;
                  if (var3 <= var2_int) {
                    break L3;
                  } else {
                    var2_int = var3;
                    break L3;
                  }
                }
                var4 = nr.field_e.a(pn.field_k) / 2 + 26;
                if (~var2_int <= ~var4) {
                  break L1;
                } else {
                  var2_int = var4;
                  break L1;
                }
              }
              var3 = var2_int - -26;
              var4 = -26 + var3;
              fe.b(db.a(true, 5), u.a(4, (byte) 94), var3, 472, io.field_m, ci.field_e, 0, 112);
              var5 = 18;
              var6 = 34;
              var6 = 34;
              fe.a(((cv) this).field_b.field_w, db.a(true, var3 / 2 + 5), u.a(var6, (byte) 94), -20 + var3, nd.field_b, true, 40, 1);
              var6 += 14;
              var7 = ((cv) this).field_b.field_p.a(-127);
              var8 = 0;
              var9 = 6;
              var10 = 5;
              var11 = var4;
              var12 = 2 * var11 / 3;
              var9 = var11 / var7.field_l;
              var8 = (-(var9 * var7.field_l) + var11) / 2;
              var10 = var12 / var7.field_n;
              var13 = var7.e(28554);
              var14 = var13[0].length + -1;
              var15_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var15_int >= var13.length) {
                      break L6;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_22_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var29 != 0) {
                        break L5;
                      } else {
                        var16 = stackIn_14_0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (~var16 <= ~var13[0].length) {
                                break L9;
                              } else {
                                var17 = var13[var15_int][-var16 + var13[0].length - 1];
                                var18 = mc.field_d[var7.field_p].field_i[var17];
                                var19_int = db.a(true, var8 + var9 * (var14 - var16) - -var5);
                                var20 = u.a(var6 + var10 * var15_int, (byte) 94);
                                qn.f(var19_int, var20, var9, var10, var18);
                                qn.e(var19_int, var20, var19_int - -var9, var20, 16777215, 16);
                                qn.e(var19_int, 1 + var20, var19_int, var20 + var10, 16777215, 16);
                                qn.d(1 + var19_int, var10 + (var20 + -1), var9 + var19_int, -1 + (var10 + var20), 0, 16);
                                qn.e(var9 + (var19_int + -1), var20 + 1, var19_int - -var9 + -1, var20 + var10 + -1, 0, 16);
                                var16++;
                                if (var29 != 0) {
                                  break L8;
                                } else {
                                  if (var29 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var15_int++;
                            break L8;
                          }
                          if (var29 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  fe.b(db.a(true, var5 - -var8), u.a(var6, (byte) 94), var9 * var7.field_l, var7.field_n * var10, io.field_m, ci.field_e, 0, 0);
                  var6 = var6 + (124 - -ro.field_rb[0].field_f);
                  stackOut_21_0 = 18;
                  stackIn_22_0 = stackOut_21_0;
                  break L5;
                }
                var15_int = stackIn_22_0;
                var16_ref_tc = ((cv) this).field_b.field_n.b(1);
                L10: while (true) {
                  L11: {
                    L12: {
                      if (var16_ref_tc == null) {
                        break L12;
                      } else {
                        var17 = (int)var16_ref_tc.field_i;
                        ro.field_rb[var17].a(db.a(true, var15_int), u.a(var6 + -ro.field_rb[var17].field_f, (byte) 94));
                        var15_int = var15_int + ro.field_rb[var17].field_g;
                        stackOut_24_0 = ((cv) this).field_b;
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var29 != 0) {
                          break L11;
                        } else {
                          var16_ref_tc = ((bg) (Object) stackIn_25_0.field_n).b((byte) 77);
                          if (var29 == 0) {
                            continue L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    stackOut_26_0 = ((cv) this).field_b;
                    stackIn_27_0 = stackOut_26_0;
                    break L11;
                  }
                  L13: {
                    var15 = stackIn_27_0.field_p;
                    int discarded$6 = rs.field_n.a(k.field_b + var15.field_E, db.a(true, var5), u.a(var6, (byte) 94), var4, 472, 16776960, 1, 0, 0, 0);
                    var6 = var6 + rs.field_n.field_v;
                    var16 = 1;
                    if (((cv) this).field_b.field_r != null) {
                      L14: {
                        stackOut_29_0 = 4800;
                        stackOut_29_1 = uh.field_c;
                        stackOut_29_2 = new String[1];
                        stackOut_29_3 = new String[1];
                        stackOut_29_4 = 0;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        stackIn_31_3 = stackOut_29_3;
                        stackIn_31_4 = stackOut_29_4;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        stackIn_30_2 = stackOut_29_2;
                        stackIn_30_3 = stackOut_29_3;
                        stackIn_30_4 = stackOut_29_4;
                        if (null == ((cv) this).field_b.field_r) {
                          stackOut_31_0 = stackIn_31_0;
                          stackOut_31_1 = (String) (Object) stackIn_31_1;
                          stackOut_31_2 = (String[]) (Object) stackIn_31_2;
                          stackOut_31_3 = (String[]) (Object) stackIn_31_3;
                          stackOut_31_4 = stackIn_31_4;
                          stackOut_31_5 = dv.field_g;
                          stackIn_32_0 = stackOut_31_0;
                          stackIn_32_1 = stackOut_31_1;
                          stackIn_32_2 = stackOut_31_2;
                          stackIn_32_3 = stackOut_31_3;
                          stackIn_32_4 = stackOut_31_4;
                          stackIn_32_5 = stackOut_31_5;
                          break L14;
                        } else {
                          stackOut_30_0 = stackIn_30_0;
                          stackOut_30_1 = (String) (Object) stackIn_30_1;
                          stackOut_30_2 = (String[]) (Object) stackIn_30_2;
                          stackOut_30_3 = (String[]) (Object) stackIn_30_3;
                          stackOut_30_4 = stackIn_30_4;
                          stackOut_30_5 = ((cv) this).field_b.field_r;
                          stackIn_32_0 = stackOut_30_0;
                          stackIn_32_1 = stackOut_30_1;
                          stackIn_32_2 = stackOut_30_2;
                          stackIn_32_3 = stackOut_30_3;
                          stackIn_32_4 = stackOut_30_4;
                          stackIn_32_5 = stackOut_30_5;
                          break L14;
                        }
                      }
                      L15: {
                        stackIn_32_3[stackIn_32_4] = stackIn_32_5;
                        var17_ref_String = fo.a(stackIn_32_0, stackIn_32_1, stackIn_32_2);
                        var16 = rs.field_n.a(var17_ref_String, db.a(true, var5), u.a(var6, (byte) 94), var4, 472, 16776960, 1, 0, 0, 0);
                        var18 = rs.field_n.a(var17_ref_String, var4);
                        var19_int = ((cv) this).field_b.field_A;
                        if (1000 < var19_int) {
                          break L15;
                        } else {
                          L16: {
                            if (var19_int <= 500) {
                              break L16;
                            } else {
                              am.field_C[1].g(db.a(true, 5 + var18 + var5), u.a(var6 - -rs.field_n.field_H + -rs.field_n.field_z, (byte) 94));
                              if (var29 == 0) {
                                break L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (10 < var19_int) {
                            am.field_C[2].g(db.a(true, var5 + var18 - -5), u.a(-rs.field_n.field_z + rs.field_n.field_H + var6, (byte) 94));
                            if (var29 == 0) {
                              break L13;
                            } else {
                              break L15;
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                      am.field_C[0].g(db.a(true, var5 - (-var18 - 5)), u.a(-rs.field_n.field_z + rs.field_n.field_H + var6, (byte) 94));
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L17: {
                    var6 = var6 + rs.field_n.field_v * (-1 + var16);
                    var17 = 276;
                    var5 = 18;
                    var18 = var5;
                    var17 += 30;
                    var17 += 17;
                    var19 = null;
                    var18 = var18 + 20;
                    var20 = var15.field_B.length + -1;
                    var21 = 50;
                    var22 = 15;
                    if (var20 <= 2) {
                      break L17;
                    } else {
                      var21 = 25;
                      var22 = 0;
                      var17 += 30;
                      break L17;
                    }
                  }
                  var17 = var17 + (var20 * var21 / 2 - 50);
                  var23 = var15.field_B;
                  var24_int = 0;
                  L18: while (true) {
                    L19: {
                      L20: {
                        if (var24_int >= var23.length) {
                          break L20;
                        } else {
                          var25_int = var23[var24_int];
                          stackOut_46_0 = 0;
                          stackIn_56_0 = stackOut_46_0;
                          stackIn_47_0 = stackOut_46_0;
                          if (var29 != 0) {
                            break L19;
                          } else {
                            L21: {
                              if (stackIn_47_0 > var25_int) {
                                break L21;
                              } else {
                                L22: {
                                  L23: {
                                    var26_ref_sd = var15.field_G.field_q[var25_int];
                                    if (var20 <= 2) {
                                      break L23;
                                    } else {
                                      var26_ref_sd.field_q.a(false, false, (byte) 68, false, false, false, u.a(var17, (byte) 94), var26_ref_sd.field_u, db.a(true, -5 + var18));
                                      if (var29 == 0) {
                                        break L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  var26_ref_sd.field_q.a(false, 0, u.a(var17, (byte) 94), false, db.a(true, var18 + -5), var26_ref_sd.field_u, false, false, false, -19744);
                                  break L22;
                                }
                                var27 = var18 - -60;
                                var28 = 5 + var4 - var27;
                                int discarded$7 = rs.field_n.a(var26_ref_sd.field_u, db.a(true, var27), u.a(var17 - -var22, (byte) 94), var28, 20, 16777215, 1, 0, 2, 0);
                                var17 = var17 - var21;
                                break L21;
                              }
                            }
                            var24_int++;
                            if (var29 == 0) {
                              continue L18;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      var5 = 18;
                      var6 += 16;
                      int discarded$8 = en.field_E.a(var15.field_n, db.a(true, var5), u.a(var6, (byte) 94), var4, 472, 16777215, 1, 0, 0, 12);
                      stackOut_55_0 = 391;
                      stackIn_56_0 = stackOut_55_0;
                      break L19;
                    }
                    L24: {
                      var6 = stackIn_56_0;
                      var23_ref = var15.g(-1);
                      var24 = km.field_h[2];
                      this.a(var24, 0, 0, 10 + var6, var23_ref.field_h, 1, 1.0f, 18 + var23_ref.field_h.field_A / 2);
                      if (var23_ref.field_i != null) {
                        if (ml.a(u.a(var6 + 10, (byte) 94), db.a(true, var23_ref.field_h.field_A / 2 + 18), 25, false)) {
                          L25: {
                            var25_int = var4 * 2;
                            var26 = var3 - -5;
                            if (so.field_b.field_a >= var26 + var25_int) {
                              break L25;
                            } else {
                              var25_int = so.field_b.field_a - var26;
                              break L25;
                            }
                          }
                          var27 = rs.field_n.a(var23_ref.field_i, var25_int, 0);
                          var28 = var6 + -(var27 / 2);
                          qn.b(db.a(true, var26), u.a(var28, (byte) 94), var25_int, var27 - -2, 0, 128);
                          int discarded$9 = rs.field_n.a(var23_ref.field_i, db.a(true, var26), u.a(var28, (byte) 94), var25_int, 472, 16777215, 1, 1, 0, 0);
                          break L24;
                        } else {
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    L26: {
                      int discarded$10 = rs.field_n.a(ft.field_l + var23_ref.field_c, db.a(true, var23_ref.field_h.field_A + 31), u.a(-10 + var6, (byte) 94), -13 + (-var23_ref.field_h.field_A + var4), var23_ref.field_h.field_x, 16776960, 0, 0, 1, 0);
                      if (null == var19) {
                        break L26;
                      } else {
                        var25_int = 100;
                        var26 = sm.field_d;
                        var27 = rs.field_n.a(((sd) var19).field_u, var25_int, 0);
                        var28 = -(var27 / 2) + (25 + ko.field_b);
                        qn.b(db.a(true, var26), u.a(var28, (byte) 94), var25_int, var27 - -2, 0, 255);
                        int discarded$11 = rs.field_n.a(((sd) var19).field_u, db.a(true, var26), u.a(var28, (byte) 94), var25_int, 472, 16777215, 1, 1, 0, 0);
                        break L26;
                      }
                    }
                    L27: {
                      var6 = 436;
                      if (((cv) this).field_t != null) {
                        break L27;
                      } else {
                        ((cv) this).field_t = new iq(ul.field_j, var5, var6, var2_int);
                        break L27;
                      }
                    }
                    L28: {
                      if (null == ((cv) this).field_p) {
                        ((cv) this).field_p = new iq(pn.field_k, var5, var6, var2_int);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      L30: {
                        var25 = ku.j(121);
                        if (null == var25) {
                          break L30;
                        } else {
                          if (~((cv) this).field_l != ~var25.field_g) {
                            break L30;
                          } else {
                            if (~var25.field_e != ~((cv) this).field_b.field_k) {
                              break L30;
                            } else {
                              stackOut_75_0 = 1;
                              stackIn_77_0 = stackOut_75_0;
                              break L29;
                            }
                          }
                        }
                      }
                      stackOut_76_0 = 0;
                      stackIn_77_0 = stackOut_76_0;
                      break L29;
                    }
                    L31: {
                      var26 = stackIn_77_0;
                      if (((cv) this).field_a != 1) {
                        break L31;
                      } else {
                        L32: {
                          if (((cv) this).field_b.field_r == null) {
                            break L32;
                          } else {
                            if (var26 != 0) {
                              break L32;
                            } else {
                              ((cv) this).field_p.a(0);
                              if (var29 == 0) {
                                break L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                        }
                        ((cv) this).field_t.a(0);
                        break L31;
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

    private final void a(wk param0, int param1, int param2, int param3, wk param4, int param5, float param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var9_int = param4.field_y;
                param7 = db.a(true, param7);
                param3 = u.a(param3, (byte) 94);
                var10 = (13 * param3 + fe.field_b + param7 * 57) % 100;
                if (param6 != (float)1) {
                  break L2;
                } else {
                  L3: {
                    if (param0 == null) {
                      break L3;
                    } else {
                      lw.field_ob.g(1 + (param7 - var9_int / 2), -(var9_int / 2) + (param3 + 1));
                      break L3;
                    }
                  }
                  L4: {
                    if (null != param4) {
                      param4.g(-(var9_int / 2) + param7 + 1, 1 + -(var9_int / 2) + param3);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (param0 != null) {
                      param0.g(-22 + param7, param3 + -22);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (param2 <= 0) {
                    break L1;
                  } else {
                    fe.a(param7, param3, 0, param2, var10, 40, 96);
                    if (var15 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L6: {
                if (0.5f == param6) {
                  break L6;
                } else {
                  L7: {
                    var11 = (int)((float)var9_int * param6);
                    var12 = (int)(46.0f * param6);
                    var13 = (int)(param6 * 40.0f);
                    var14 = (int)(96.0f * param6);
                    if (param0 == null) {
                      break L7;
                    } else {
                      lw.field_ob.c(param7 - var11 / 2, -(var11 / 2) + param3, var11, var11);
                      break L7;
                    }
                  }
                  L8: {
                    if (null == param4) {
                      break L8;
                    } else {
                      param4.c(-(var11 / 2) + param7, -(var11 / 2) + param3, var11, var11);
                      break L8;
                    }
                  }
                  L9: {
                    if (param0 != null) {
                      param0.c(param7 - var12 / 2, param3 - var12 / 2, var12, var12);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (param2 > 0) {
                      fe.a(param7, param3, 0, param2, var10, var13, var14);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (var15 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
              }
              L11: {
                if (param0 != null) {
                  lw.field_ob.h(-(var9_int / 4) + (param7 + 1), param3 - var9_int / 4 - -1);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (null != param4) {
                  param4.h(-(var9_int / 4) + param7 + 1, 1 + (-(var9_int / 4) + param3));
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (param0 == null) {
                  break L13;
                } else {
                  param0.h(-11 + param7, -11 + param3);
                  break L13;
                }
              }
              if (param2 > 0) {
                fe.a(param7, param3, 0, param2, var10, 20, 48);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var9;
            stackOut_55_1 = new StringBuilder().append("cv.DA(");
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L14;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L14;
            }
          }
          L15: {
            stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',').append(0).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param4 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L15;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L15;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + 1 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final wk a(om param0, sl param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        wk var6_ref = null;
        lo var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        String[] var13 = null;
        int var14_int = 0;
        Object var14 = null;
        ha var14_ref = null;
        RuntimeException var15_ref_RuntimeException = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        ne var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        jd var21_ref_jd = null;
        int var22 = 0;
        int var23 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        wk stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        wk stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var23 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_ref = new wk(param4, param2);
            var7 = param0.a(-98);
            var8 = var6_ref.field_v / var7.field_n;
            var9 = var6_ref.field_y / var7.field_l;
            var10 = (var6_ref.field_y + -(var9 * var7.field_l)) / 2;
            var11 = (-(var9 * var7.field_n) + var6_ref.field_v) / 2;
            var12 = new int[][]{kb.field_o};
            var13 = new String[param0.field_B.length];
            var14_int = 0;
            L1: while (true) {
              L2: {
                if (~var13.length >= ~var14_int) {
                  break L2;
                } else {
                  var13[var14_int] = "-";
                  var14_int++;
                  if (var23 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var14_ref = new ha(0, var13, -1, var12, 0, true, false, param0.field_o, 1, var7.field_p, false, (int[][]) null, 4, 0, 0, param0);
              var14_ref.field_sb = 0;
              try {
                L3: {
                  ml.a(param0, (byte) -26);
                  var14_ref.b(param3 ^ param3, new vh(param1.field_c));
                  break L3;
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var15_ref_RuntimeException = decompiledCaughtException;
                  var15_ref_RuntimeException.printStackTrace();
                  break L4;
                }
              }
              int discarded$1 = 3;
              vn.a(var6_ref);
              qn.f(0, 0, var6_ref.field_y, var6_ref.field_v, 4473924);
              var15 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var15 >= var14_ref.field_Eb.length) {
                      break L7;
                    } else {
                      var16 = var15 / var14_ref.field_v;
                      var17 = var15 % var14_ref.field_v;
                      var18 = var14_ref.field_Eb[var15];
                      var19 = var18.field_h;
                      stackOut_10_0 = -17;
                      stackOut_10_1 = ~var19;
                      stackIn_20_0 = stackOut_10_0;
                      stackIn_20_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (var23 != 0) {
                        break L6;
                      } else {
                        L8: {
                          if (stackIn_11_0 >= stackIn_11_1) {
                            var19 = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          var20 = mc.field_d[var7.field_p].field_i[var19];
                          if (null == var18.field_c) {
                            break L9;
                          } else {
                            var21_ref_jd = var18.field_c;
                            var20 = op.field_c[0][var21_ref_jd.field_O];
                            break L9;
                          }
                        }
                        var21 = var9 * var17 + var10;
                        var22 = var11 + var8 * var16;
                        qn.f(var21, var22, var9, var8, var20);
                        qn.e(var21, var22, var21 + var9, var22, 16777215, 16);
                        qn.e(var21, var22 + 1, var21, var8 + var22, 16777215, 16);
                        qn.d(1 + var21, -1 + (var8 + var22), var21 - -var9, -1 + var22 - -var8, 0, 16);
                        qn.e(var21 + var9 + -1, var22 - -1, var21 + (var9 - 1), var8 + (var22 - 1), 0, 16);
                        var15++;
                        if (var23 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  stackOut_19_0 = param3;
                  stackOut_19_1 = -18863;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L6;
                }
                rf.b(stackIn_20_0 + stackIn_20_1);
                stackOut_20_0 = (wk) var6_ref;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6;
            stackOut_22_1 = new StringBuilder().append("cv.V(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L10;
            }
          }
          L11: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L11;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_21_0;
    }

    private final void a(int param0, om param1) {
        RuntimeException runtimeException = null;
        cq var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3 = new cq(param1);
              var4 = mh.a(((cv) this).field_l, param0 + -119, var3.field_k);
              if (~var4 >= param0) {
                break L1;
              } else {
                var3.field_r = ir.a(10602, var4);
                var3.field_A = var4;
                break L1;
              }
            }
            ((cv) this).field_i.a((tc) (Object) var3, (long)var3.field_k, 122);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("cv.L(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final cq a(int param0, int param1) {
        RuntimeException var3 = null;
        cq var3_ref = null;
        cq stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        cq stackOut_3_0 = null;
        try {
          L0: {
            var3_ref = (cq) (Object) ((cv) this).field_i.a(-128, (long)param1);
            stackOut_3_0 = (cq) var3_ref;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "cv.W(" + 321 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void g() {
        sl var2 = null;
        RuntimeException var2_ref = null;
        om var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                ((cv) this).field_b = null;
                if (((cv) this).field_d.field_k != -1) {
                  break L2;
                } else {
                  L3: {
                    var2 = ku.j(86);
                    if (ei.a(var2.field_g, 11906)) {
                      break L3;
                    } else {
                      if (rf.a(27875)) {
                        pr.field_i = bn.field_g;
                        bv.a(false, 11, 1, jt.field_a);
                        return;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.b(var2.field_g, 53);
                  var3 = ar.a(var2.field_g, var2.field_e, 0);
                  l.field_c = var3;
                  bv.a(true, -11, 1, 0);
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((cv) this).a(((cv) this).field_d.field_k, true);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2_ref, "cv.D(" + 0 + ')');
        }
    }

    final void f(byte param0) {
        Object var2 = null;
        int var2_int = 0;
        int var3_int = 0;
        Object var3 = null;
        Object var4 = null;
        cq var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_188_0 = 0;
        int stackOut_188_1 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            fe.field_b = fe.field_b + 1;
            fe.field_b = fe.field_b % 100;
            if (param0 >= 114) {
              L1: {
                if (2 > hi.field_j) {
                  break L1;
                } else {
                  if (!br.field_f[5]) {
                    break L1;
                  } else {
                    if (br.field_f[81]) {
                      kw.field_R = 2297;
                      cg.field_j = 72584621;
                      wr.field_L = 224;
                      ii.field_b = 4452;
                      var2 = (Object) (Object) br.a(((cv) this).field_l, (byte) -125).field_n;
                      var3_int = 0;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if (~((Object[]) var2).length >= ~var3_int) {
                              break L4;
                            } else {
                              var4 = ((Object[]) var2)[var3_int];
                              ra.a(4, -1, (om) var4, true, 1, -1);
                              var3_int++;
                              if (var7 != 0) {
                                break L3;
                              } else {
                                if (var7 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          pg.field_d.field_g = new cm();
                          break L3;
                        }
                        ((cv) this).a(((cv) this).field_l, true);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L5: {
                if (1 == ((cv) this).field_a) {
                  L6: {
                    if (null == ((cv) this).field_b) {
                      break L6;
                    } else {
                      ((cv) this).field_b.field_v = ((cv) this).field_b.field_v + 1;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (tr.field_A != 1) {
                        break L8;
                      } else {
                        if (null != ((cv) this).field_e) {
                          L9: {
                            if (null == ((cv) this).field_b) {
                              break L9;
                            } else {
                              if (!((cv) this).field_b.field_l) {
                                break L9;
                              } else {
                                if (((cv) this).field_t == null) {
                                  break L9;
                                } else {
                                  if (!((cv) this).field_t.a((byte) -27)) {
                                    break L9;
                                  } else {
                                    this.b((byte) 107);
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          var2_int = ((cv) this).field_e.a(sm.field_d - db.a(true, 0), (byte) -79, ko.field_b - u.a(0, (byte) 94));
                          if (-1 < var2_int) {
                            var3 = null;
                            var4_ref = (cq) (Object) ((cv) this).field_i.b(1);
                            L10: while (true) {
                              L11: {
                                if (var4_ref == null) {
                                  break L11;
                                } else {
                                  stackOut_122_0 = var4_ref.field_k;
                                  stackOut_122_1 = var2_int;
                                  stackIn_189_0 = stackOut_122_0;
                                  stackIn_189_1 = stackOut_122_1;
                                  stackIn_123_0 = stackOut_122_0;
                                  stackIn_123_1 = stackOut_122_1;
                                  if (var7 != 0) {
                                    break L7;
                                  } else {
                                    stackOut_123_0 = stackIn_123_0;
                                    stackOut_123_1 = stackIn_123_1;
                                    stackIn_125_0 = stackOut_123_0;
                                    stackIn_125_1 = stackOut_123_1;
                                    if (stackIn_125_0 != stackIn_125_1) {
                                      var4_ref = (cq) (Object) ((cv) this).field_i.b((byte) 60);
                                      continue L10;
                                    } else {
                                      var3 = (Object) (Object) var4_ref;
                                      break L11;
                                    }
                                  }
                                }
                              }
                              if (var3 == null) {
                                break L8;
                              } else {
                                if (!((cq) var3).field_l) {
                                  break L8;
                                } else {
                                  L12: {
                                    var4_int = 0;
                                    if (hi.field_j < 2) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (!br.field_f[81]) {
                                          break L13;
                                        } else {
                                          L14: {
                                            L15: {
                                              L16: {
                                                L17: {
                                                  L18: {
                                                    cg.field_j = 72584621;
                                                    ii.field_b = 4452;
                                                    wr.field_L = 224;
                                                    kw.field_R = 2297;
                                                    hc.field_b = hc.field_b + 1;
                                                    hc.field_b = hc.field_b + (ko.field_b ^ sm.field_d);
                                                    hc.field_b = Math.abs(hc.field_b);
                                                    var5 = hc.field_b % 4;
                                                    var6 = var5;
                                                    if (var6 == 0) {
                                                      ii.field_b = ii.field_b - 12;
                                                      kw.field_R = kw.field_R - 3;
                                                      if (var7 == 0) {
                                                        break L14;
                                                      } else {
                                                        break L18;
                                                      }
                                                    } else {
                                                      L19: {
                                                        if (var6 != 1) {
                                                          break L19;
                                                        } else {
                                                          if (var7 == 0) {
                                                            break L18;
                                                          } else {
                                                            break L19;
                                                          }
                                                        }
                                                      }
                                                      L20: {
                                                        if (var6 != 2) {
                                                          break L20;
                                                        } else {
                                                          if (var7 == 0) {
                                                            break L17;
                                                          } else {
                                                            break L20;
                                                          }
                                                        }
                                                      }
                                                      if (var6 == 3) {
                                                        break L16;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  ii.field_b = ii.field_b + 3;
                                                  kw.field_R = kw.field_R + 12;
                                                  if (var7 == 0) {
                                                    break L14;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                                kw.field_R = kw.field_R + 9;
                                                if (var7 == 0) {
                                                  break L14;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                              ii.field_b = ii.field_b - 9;
                                              if (var7 == 0) {
                                                break L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                            throw new IllegalStateException("");
                                          }
                                          var5 = b.a(2, 10, 12, (byte) 25, 3);
                                          ra.a(4, 12, ((cq) var3).field_p, true, var5, 3);
                                          ((cv) this).a(((cq) var3).field_p.field_G.field_r, true);
                                          System.out.println("m  id " + ((cq) var3).field_k + " " + ((cq) var3).field_w);
                                          var4_int = 1;
                                          if (var7 == 0) {
                                            break L12;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      if (br.field_f[82]) {
                                        var4_int = 1;
                                        ra.a(4, -1, ((cq) var3).field_p, true, 1, -1);
                                        ((cv) this).a(((cq) var3).field_p.field_G.field_r, true);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var4_int != 0) {
                                    break L8;
                                  } else {
                                    L21: {
                                      L22: {
                                        if ((Object) (Object) ((cv) this).field_b != var3) {
                                          break L22;
                                        } else {
                                          if (((cv) this).field_b.field_v >= 20) {
                                            break L21;
                                          } else {
                                            this.b((byte) 72);
                                            if (var7 == 0) {
                                              break L21;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                      }
                                      te discarded$6 = ub.a((byte) 80, im.field_v[11]);
                                      break L21;
                                    }
                                    ((cv) this).field_b = (cq) var3;
                                    ((cv) this).field_b.field_v = 0;
                                    break L8;
                                  }
                                }
                              }
                            }
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    stackOut_188_0 = -3;
                    stackOut_188_1 = ~tr.field_A;
                    stackIn_189_0 = stackOut_188_0;
                    stackIn_189_1 = stackOut_188_1;
                    break L7;
                  }
                  if (stackIn_189_0 == stackIn_189_1) {
                    ((cv) this).field_b = null;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  if (((cv) this).field_a != 0) {
                    if (((cv) this).field_a == 3) {
                      L23: {
                        if (tr.field_A != 1) {
                          break L23;
                        } else {
                          if (((cv) this).field_c == null) {
                            break L23;
                          } else {
                            if (!((cv) this).field_c.a((byte) -49)) {
                              break L23;
                            } else {
                              var2 = (Object) (Object) ku.j(86);
                              var3 = (Object) (Object) ar.a(((sl) var2).field_g, ((sl) var2).field_e, 0);
                              l.field_c = (om) var3;
                              bv.a(true, -11, 1, 0);
                              break L23;
                            }
                          }
                        }
                      }
                      L24: {
                        if (tr.field_A != 1) {
                          break L24;
                        } else {
                          if (null == ((cv) this).field_j) {
                            break L24;
                          } else {
                            if (((cv) this).field_j.a((byte) 121)) {
                              int discarded$7 = -2;
                              this.f();
                              l.field_c = ((cv) this).field_b.field_p;
                              bv.a(true, -10, 1, 0);
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      L25: {
                        if (tr.field_A != 1) {
                          break L25;
                        } else {
                          if (((cv) this).field_o == null) {
                            break L25;
                          } else {
                            if (((cv) this).field_o.a((byte) -52)) {
                              ((cv) this).field_a = 1;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      if (((cv) this).field_a != 2) {
                        break L5;
                      } else {
                        L26: {
                          if (tr.field_A != 1) {
                            break L26;
                          } else {
                            if (null == ((cv) this).field_h) {
                              break L26;
                            } else {
                              if (((cv) this).field_h.a((byte) 86)) {
                                int discarded$8 = -2;
                                this.f();
                                l.field_c = ((cv) this).field_b.field_p;
                                bv.a(true, -10, 1, 0);
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        L27: {
                          if (tr.field_A != 1) {
                            break L27;
                          } else {
                            if (((cv) this).field_f == null) {
                              break L27;
                            } else {
                              if (((cv) this).field_f.a((byte) -69)) {
                                ((cv) this).field_a = 1;
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    L28: {
                      if (((cv) this).field_d == null) {
                        break L28;
                      } else {
                        ((cv) this).field_d.field_v = ((cv) this).field_d.field_v + 1;
                        break L28;
                      }
                    }
                    if (null == ((cv) this).field_d) {
                      break L5;
                    } else {
                      if (tr.field_A != 1) {
                        break L5;
                      } else {
                        if (wg.a(-33, db.a(true, 354), db.a(true, 600), u.a(361, (byte) 94), u.a(402, (byte) 94))) {
                          int discarded$9 = 0;
                          this.g();
                          return;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              L29: {
                if (2 != tr.field_A) {
                  break L29;
                } else {
                  ((cv) this).field_b = null;
                  ((cv) this).field_d = null;
                  break L29;
                }
              }
              L30: {
                if (tr.field_A == 1) {
                  L31: {
                    var2 = null;
                    var3 = null;
                    var4_int = ((cv) this).field_a;
                    if (0 == var4_int) {
                      var3 = (Object) (Object) ((cv) this).field_g;
                      break L31;
                    } else {
                      if (1 == var4_int) {
                        var3 = (Object) (Object) ((cv) this).field_i;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                  }
                  if (null == var3) {
                    break L30;
                  } else {
                    var4_ref = (cq) (Object) ((bg) var3).b(1);
                    L32: while (true) {
                      L33: {
                        if (null == var4_ref) {
                          break L33;
                        } else {
                          if (var7 != 0) {
                            break L30;
                          } else {
                            L34: {
                              if (!var4_ref.field_l) {
                                break L34;
                              } else {
                                if (!var4_ref.a(sm.field_d, ko.field_b, 122)) {
                                  break L34;
                                } else {
                                  var2 = (Object) (Object) var4_ref;
                                  break L33;
                                }
                              }
                            }
                            var4_ref = (cq) (Object) ((bg) var3).b((byte) 80);
                            continue L32;
                          }
                        }
                      }
                      if (null == var2) {
                        break L30;
                      } else {
                        L35: {
                          if (((cv) this).field_a != 1) {
                            break L35;
                          } else {
                            if (hi.field_j < 2) {
                              break L30;
                            } else {
                              if (br.field_f[81]) {
                                pg.field_d.field_g.a(65535, ((cq) var2).field_k, uk.field_n % 10 + ((cq) var2).field_k * 10, ((cv) this).field_l, ((cq) var2).field_k * 200 - -(uk.field_n % 200));
                                ((cv) this).a(((cv) this).field_l, true);
                                if (var7 == 0) {
                                  break L30;
                                } else {
                                  break L35;
                                }
                              } else {
                                break L30;
                              }
                            }
                          }
                        }
                        if (((cv) this).field_a == 0) {
                          L36: {
                            if ((Object) (Object) ((cv) this).field_d != var2) {
                              te discarded$10 = ub.a((byte) 98, im.field_v[11]);
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            ((cv) this).field_d = (cq) var2;
                            if (((cv) this).field_d.field_v >= 20) {
                              break L37;
                            } else {
                              int discarded$11 = 0;
                              this.g();
                              break L37;
                            }
                          }
                          ((cv) this).field_d.field_v = 0;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                    }
                  }
                } else {
                  break L30;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw ig.a((Throwable) var2, "cv.H(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2 = ku.j(91);
                if (null != var2) {
                  break L2;
                } else {
                  l.field_c = ((cv) this).field_b.field_p;
                  bv.a(true, -10, 1, 0);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (((cv) this).field_b.field_k != var2.field_e) {
                  break L3;
                } else {
                  if (var2.field_g != ((cv) this).field_l) {
                    break L3;
                  } else {
                    this.a(3, (byte) 42);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.a(2, (byte) 42);
              break L1;
            }
            var3 = -127 % ((param0 - 10) / 55);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "cv.S(" + param0 + ')');
        }
    }

    private final cq a(boolean param0, cf param1) {
        Object var4_ref = null;
        RuntimeException var3 = null;
        cq var3_ref = null;
        int var4_int = 0;
        tc var4 = null;
        int var5 = 0;
        int var6_int = 0;
        wk var6 = null;
        wk var7 = null;
        int var8 = 0;
        int var9 = 0;
        cq stackIn_5_0 = null;
        cq stackIn_6_0 = null;
        cq stackIn_8_0 = null;
        cq stackIn_9_0 = null;
        cq stackIn_11_0 = null;
        cq stackIn_13_0 = null;
        cq stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        cf stackIn_18_0 = null;
        Object stackIn_34_0 = null;
        cq stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        cq stackOut_4_0 = null;
        cq stackOut_5_0 = null;
        cq stackOut_6_0 = null;
        cq stackOut_8_0 = null;
        cq stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        cq stackOut_9_0 = null;
        cq stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        cf stackOut_17_0 = null;
        tc stackOut_33_0 = null;
        cq stackOut_38_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var4_ref = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_ref = new cq(param1.field_r, param1.field_k);
                var3_ref.field_D = param1.field_s;
                var3_ref.field_q = param1.field_o;
                stackOut_4_0 = (cq) var3_ref;
                stackIn_11_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param1.c((byte) -45)) {
                  break L2;
                } else {
                  stackOut_5_0 = (cq) (Object) stackIn_5_0;
                  stackIn_11_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (0 < df.field_M) {
                    break L2;
                  } else {
                    stackOut_6_0 = (cq) (Object) stackIn_6_0;
                    stackIn_8_0 = stackOut_6_0;
                    stackOut_8_0 = (cq) (Object) stackIn_8_0;
                    stackIn_13_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (hi.field_j < 2) {
                      stackOut_13_0 = (cq) (Object) stackIn_13_0;
                      stackOut_13_1 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L1;
                    } else {
                      stackOut_9_0 = (cq) (Object) stackIn_9_0;
                      stackIn_11_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_11_0 = (cq) (Object) stackIn_11_0;
              stackOut_11_1 = 1;
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              break L1;
            }
            L3: {
              L4: {
                L5: {
                  stackIn_14_0.field_l = stackIn_14_1 != 0;
                  if (!var3_ref.field_l) {
                    break L5;
                  } else {
                    var4_int = 0;
                    var5 = param1.field_n.length;
                    var6_int = 0;
                    L6: while (true) {
                      L7: {
                        if (var5 <= var6_int) {
                          break L7;
                        } else {
                          stackOut_17_0 = (cf) param1;
                          stackIn_34_0 = (Object) (Object) stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (var9 != 0) {
                            break L3;
                          } else {
                            L8: {
                              if (mh.a(stackIn_18_0.field_r, -120, var6_int) <= 0) {
                                break L8;
                              } else {
                                var4_int++;
                                break L8;
                              }
                            }
                            var6_int++;
                            if (var9 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      L9: {
                        L10: {
                          var3_ref.field_r = fo.a(4800, og.field_l, new String[2]);
                          var6 = ps.field_w[var3_ref.field_k];
                          var7 = new wk(var6.field_A, var6.field_x);
                          int discarded$1 = 3;
                          vn.a(var7);
                          var6.f(0, 0);
                          var8 = 18;
                          if (var3_ref.field_k == 1) {
                            break L10;
                          } else {
                            qn.c(var8, var8, 0, 0, var6.field_A, var6.field_x);
                            if (var9 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        qn.c(var8, var8, 0, var8, var6.field_A, -var8 + var6.field_x);
                        break L9;
                      }
                      rf.b(-18862);
                      var3_ref.field_m = var7;
                      if (var9 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var3_ref.field_r = bn.field_g;
                break L4;
              }
              stackOut_33_0 = ((cv) this).field_g.a(-64, (long)var3_ref.field_k);
              stackIn_34_0 = (Object) (Object) stackOut_33_0;
              break L3;
            }
            L11: {
              var4_ref = stackIn_34_0;
              if (null != var4_ref) {
                ((tc) var4_ref).d(-100);
                break L11;
              } else {
                break L11;
              }
            }
            ((cv) this).field_g.a((tc) (Object) var3_ref, (long)var3_ref.field_k, 97);
            stackOut_38_0 = (cq) var3_ref;
            stackIn_39_0 = stackOut_38_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var3;
            stackOut_40_1 = new StringBuilder().append("cv.I(").append(true).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L12;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L12;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ')');
        }
        return stackIn_39_0;
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        cf var3_ref = null;
        int var4 = 0;
        om[] var4_ref_om__ = null;
        int var5 = 0;
        int var6 = 0;
        om var6_ref_om = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cq var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        cq stackIn_20_0 = null;
        int stackIn_26_0 = 0;
        cq stackIn_42_0 = null;
        RuntimeException decompiledCaughtException = null;
        cq stackOut_19_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        cq stackOut_41_0 = null;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              ((cv) this).field_e = new pr(mu.field_g[param0][1], 1, 16777215);
              ((cv) this).field_i = new bg(32);
              var3_ref = br.a(param0, (byte) -118);
              if (var3_ref == null) {
                break L1;
              } else {
                var4_ref_om__ = var3_ref.field_n;
                var5 = 0;
                L2: while (true) {
                  if (~var4_ref_om__.length >= ~var5) {
                    break L1;
                  } else {
                    L3: {
                      var6_ref_om = var4_ref_om__[var5];
                      if (var6_ref_om == null) {
                        break L3;
                      } else {
                        this.a(-1, var6_ref_om);
                        break L3;
                      }
                    }
                    var5++;
                    if (var20 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var4 = 90;
            var5 = 80;
            var6 = var4;
            var7 = var5;
            var8 = 400;
            var9 = 150;
            var10 = 38;
            var11 = var10 / 2;
            var12 = 10;
            var13 = (cq) (Object) ((cv) this).field_i.b(1);
            L4: while (true) {
              L5: {
                L6: {
                  if (null == var13) {
                    break L6;
                  } else {
                    if (var20 != 0) {
                      break L5;
                    } else {
                      L7: {
                        L8: {
                          if (null == var13.field_p.field_y) {
                            break L8;
                          } else {
                            if (null != var13.field_r) {
                              break L8;
                            } else {
                              var14 = var13.field_p.e((byte) 68) ? 1 : 0;
                              var15 = var14;
                              var16 = var13.field_p.field_y;
                              var17 = 0;
                              L9: while (true) {
                                L10: {
                                  L11: {
                                    if (var16.length <= var17) {
                                      break L11;
                                    } else {
                                      var18 = var16[var17];
                                      stackOut_19_0 = this.a(321, var18);
                                      stackIn_42_0 = stackOut_19_0;
                                      stackIn_20_0 = stackOut_19_0;
                                      if (var20 != 0) {
                                        break L10;
                                      } else {
                                        L12: {
                                          if (stackIn_20_0.field_r == null) {
                                            stackOut_25_0 = 0;
                                            stackIn_26_0 = stackOut_25_0;
                                            break L12;
                                          } else {
                                            stackOut_23_0 = 1;
                                            stackIn_26_0 = stackOut_23_0;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var19 = stackIn_26_0;
                                          if (var19 == 0) {
                                            break L13;
                                          } else {
                                            if (var14 != 0) {
                                              break L13;
                                            } else {
                                              var15 = 1;
                                              if (var20 == 0) {
                                                break L11;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                        }
                                        L14: {
                                          if (var19 != 0) {
                                            break L14;
                                          } else {
                                            if (var14 == 0) {
                                              break L14;
                                            } else {
                                              var15 = 0;
                                              if (var20 == 0) {
                                                break L11;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                        }
                                        var17++;
                                        if (var20 == 0) {
                                          continue L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_41_0 = (cq) var13;
                                  stackIn_42_0 = stackOut_41_0;
                                  break L10;
                                }
                                stackIn_42_0.field_l = var15 != 0;
                                if (var20 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        var13.field_l = true;
                        break L7;
                      }
                      L15: {
                        var13.field_B = var9;
                        var13.field_o = var10;
                        var13.field_x = var7;
                        var13.field_y = var6;
                        var6 = var6 + (var12 + var13.field_B);
                        if (var13.field_y > var8) {
                          var6 = var4;
                          var7 = var7 + (var13.field_o - -var11);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var13 = (cq) (Object) ((cv) this).field_i.b((byte) 64);
                      if (var20 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (param1 >= 15) {
                  break L5;
                } else {
                  this.a(45, (om) null);
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "cv.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ei.a(param0, 11906)) {
                break L1;
              } else {
                if (rf.a(27875)) {
                  pr.field_i = bn.field_g;
                  bv.a(false, 11, 1, jt.field_a);
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null == mu.field_g) {
                ((cv) this).c((byte) -122);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((cv) this).field_l = param0;
              this.b(param0, 98);
              if (param1) {
                break L3;
              } else {
                wk discarded$2 = this.a((om) null, (sl) null, -116, 21, 100);
                break L3;
              }
            }
            this.a(1, (byte) 42);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "cv.P(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != 13) {
                break L1;
              } else {
                L2: {
                  if (((cv) this).field_a == 1) {
                    break L2;
                  } else {
                    L3: {
                      if (((cv) this).field_a == 0) {
                        break L3;
                      } else {
                        L4: {
                          if (((cv) this).field_a == 2) {
                            break L4;
                          } else {
                            if (((cv) this).field_a == 3) {
                              break L4;
                            } else {
                              break L1;
                            }
                          }
                        }
                        ((cv) this).field_a = 1;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    bv.a(false, 0, 1, jt.field_a);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(0, (byte) 42);
                break L1;
              }
            }
            L5: {
              if (param2 <= hi.field_j) {
                L6: {
                  L7: {
                    L8: {
                      var4_int = -2;
                      var5 = 256;
                      if (param0 < 16) {
                        break L8;
                      } else {
                        if (param0 <= 25) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (26 == param0) {
                        break L9;
                      } else {
                        L10: {
                          if (param0 == 27) {
                            break L10;
                          } else {
                            if (param0 != 85) {
                              break L6;
                            } else {
                              var4_int = -1;
                              if (var6 == 0) {
                                break L6;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        var4_int = 11;
                        if (var6 == 0) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var4_int = 10;
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                  var4_int = param0 + -16;
                  break L6;
                }
                L11: {
                  if (!br.field_f[81]) {
                    stackOut_45_0 = 256;
                    stackIn_46_0 = stackOut_45_0;
                    break L11;
                  } else {
                    stackOut_43_0 = 0;
                    stackIn_46_0 = stackOut_43_0;
                    break L11;
                  }
                }
                var5 = stackIn_46_0;
                if (var4_int == -2) {
                  break L5;
                } else {
                  lk.field_e.field_w.a(var5, var4_int, (byte) -52);
                  lk.field_e.field_D.a(var5, var4_int, (byte) -116);
                  break L5;
                }
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "cv.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e() {
        RuntimeException var2 = null;
        ru var2_ref = null;
        Object var3 = null;
        cq var4 = null;
        sl var4_ref = null;
        cq var5_ref_cq = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_61_0 = 0;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        cq stackIn_62_4 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        cq stackIn_63_4 = null;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        cq stackIn_65_4 = null;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        cq stackIn_66_4 = null;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        cq stackIn_68_4 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        cq stackIn_70_4 = null;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        cq stackIn_71_4 = null;
        int stackIn_71_5 = 0;
        int stackIn_89_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        cq stackOut_61_4 = null;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        cq stackOut_62_4 = null;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        cq stackOut_63_4 = null;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        cq stackOut_65_4 = null;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        cq stackOut_66_4 = null;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        cq stackOut_70_4 = null;
        int stackOut_70_5 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        cq stackOut_68_4 = null;
        int stackOut_68_5 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_ref = mu.field_g[((cv) this).field_l][0];
              var2_ref.b(db.a(true, 0), u.a(0, (byte) 94));
              if (null == ((cv) this).field_e) {
                break L1;
              } else {
                try {
                  L2: {
                    var3 = (Object) (Object) new boolean[((cv) this).field_i.a((byte) 117)];
                    var4 = (cq) (Object) ((cv) this).field_i.b(1);
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var4 == null) {
                            break L5;
                          } else {
                            ((byte[]) var3)[var4.field_k] = (byte) (var4.field_l ? 1 : 0);
                            var4 = (cq) (Object) ((cv) this).field_i.b((byte) 109);
                            if (var8 != 0) {
                              break L4;
                            } else {
                              if (var8 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        ((cv) this).field_e.a((byte) 93, db.a(true, 0), (boolean[]) var3, u.a(0, (byte) 94), mu.field_g[((cv) this).field_l][2]);
                        break L4;
                      }
                      break L2;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Object) (Object) decompiledCaughtException;
                    ((RuntimeException) var3).printStackTrace();
                    ((cv) this).field_e = null;
                    break L6;
                  }
                }
                break L1;
              }
            }
            var3 = null;
            var4_ref = ku.j(85);
            var5_ref_cq = (cq) (Object) ((cv) this).field_i.b(1);
            L7: while (true) {
              L8: {
                L9: {
                  if (var5_ref_cq == null) {
                    break L9;
                  } else {
                    var6 = 0;
                    stackOut_16_0 = ((cv) this).field_a;
                    stackOut_16_1 = 1;
                    stackIn_96_0 = stackOut_16_0;
                    stackIn_96_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (var8 != 0) {
                      break L8;
                    } else {
                      L10: {
                        if (stackIn_17_0 != stackIn_17_1) {
                          break L10;
                        } else {
                          L11: {
                            L12: {
                              if (!var5_ref_cq.field_l) {
                                break L12;
                              } else {
                                if (~sm.field_d > ~db.a(true, var5_ref_cq.field_y)) {
                                  break L12;
                                } else {
                                  if (sm.field_d > db.a(true, var5_ref_cq.field_y - -var5_ref_cq.field_B)) {
                                    break L12;
                                  } else {
                                    if (ko.field_b < u.a(var5_ref_cq.field_x, (byte) 94)) {
                                      break L12;
                                    } else {
                                      if (~ko.field_b < ~u.a(var5_ref_cq.field_o + var5_ref_cq.field_x, (byte) 94)) {
                                        break L12;
                                      } else {
                                        stackOut_35_0 = 1;
                                        stackIn_38_0 = stackOut_35_0;
                                        break L11;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            break L11;
                          }
                          var6 = stackIn_38_0;
                          if (((cv) this).field_e != null) {
                            L13: {
                              L14: {
                                if (!var5_ref_cq.field_l) {
                                  break L14;
                                } else {
                                  if (((cv) this).field_e.a(sm.field_d + -db.a(true, 0), (byte) -128, ko.field_b + -u.a(0, (byte) 94)) != var5_ref_cq.field_k) {
                                    break L14;
                                  } else {
                                    stackOut_45_0 = 1;
                                    stackIn_48_0 = stackOut_45_0;
                                    break L13;
                                  }
                                }
                              }
                              stackOut_47_0 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              break L13;
                            }
                            var6 = stackIn_48_0;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L15: {
                        if (var6 == 0) {
                          break L15;
                        } else {
                          var3 = (Object) (Object) var5_ref_cq;
                          break L15;
                        }
                      }
                      L16: {
                        L17: {
                          if (var4_ref == null) {
                            break L17;
                          } else {
                            if (((cv) this).field_l != var4_ref.field_g) {
                              break L17;
                            } else {
                              if (var5_ref_cq.field_k != var4_ref.field_e) {
                                break L17;
                              } else {
                                stackOut_58_0 = 1;
                                stackIn_61_0 = stackOut_58_0;
                                break L16;
                              }
                            }
                          }
                        }
                        stackOut_60_0 = 0;
                        stackIn_61_0 = stackOut_60_0;
                        break L16;
                      }
                      L18: {
                        L19: {
                          var7 = stackIn_61_0;
                          stackOut_61_0 = this;
                          stackOut_61_1 = -125;
                          stackOut_61_2 = 0;
                          stackOut_61_3 = var7;
                          stackOut_61_4 = (cq) var5_ref_cq;
                          stackIn_68_0 = stackOut_61_0;
                          stackIn_68_1 = stackOut_61_1;
                          stackIn_68_2 = stackOut_61_2;
                          stackIn_68_3 = stackOut_61_3;
                          stackIn_68_4 = stackOut_61_4;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          stackIn_62_2 = stackOut_61_2;
                          stackIn_62_3 = stackOut_61_3;
                          stackIn_62_4 = stackOut_61_4;
                          if (var6 != 0) {
                            break L19;
                          } else {
                            L20: {
                              stackOut_62_0 = this;
                              stackOut_62_1 = stackIn_62_1;
                              stackOut_62_2 = stackIn_62_2;
                              stackOut_62_3 = stackIn_62_3;
                              stackOut_62_4 = (cq) (Object) stackIn_62_4;
                              stackIn_70_0 = stackOut_62_0;
                              stackIn_70_1 = stackOut_62_1;
                              stackIn_70_2 = stackOut_62_2;
                              stackIn_70_3 = stackOut_62_3;
                              stackIn_70_4 = stackOut_62_4;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              stackIn_63_2 = stackOut_62_2;
                              stackIn_63_3 = stackOut_62_3;
                              stackIn_63_4 = stackOut_62_4;
                              if (null == ((cv) this).field_b) {
                                break L20;
                              } else {
                                stackOut_63_0 = this;
                                stackOut_63_1 = stackIn_63_1;
                                stackOut_63_2 = stackIn_63_2;
                                stackOut_63_3 = stackIn_63_3;
                                stackOut_63_4 = (cq) (Object) stackIn_63_4;
                                stackIn_65_0 = stackOut_63_0;
                                stackIn_65_1 = stackOut_63_1;
                                stackIn_65_2 = stackOut_63_2;
                                stackIn_65_3 = stackOut_63_3;
                                stackIn_65_4 = stackOut_63_4;
                                stackOut_65_0 = this;
                                stackOut_65_1 = stackIn_65_1;
                                stackOut_65_2 = stackIn_65_2;
                                stackOut_65_3 = stackIn_65_3;
                                stackOut_65_4 = (cq) (Object) stackIn_65_4;
                                stackIn_70_0 = stackOut_65_0;
                                stackIn_70_1 = stackOut_65_1;
                                stackIn_70_2 = stackOut_65_2;
                                stackIn_70_3 = stackOut_65_3;
                                stackIn_70_4 = stackOut_65_4;
                                stackIn_66_0 = stackOut_65_0;
                                stackIn_66_1 = stackOut_65_1;
                                stackIn_66_2 = stackOut_65_2;
                                stackIn_66_3 = stackOut_65_3;
                                stackIn_66_4 = stackOut_65_4;
                                if (var5_ref_cq != ((cv) this).field_b) {
                                  break L20;
                                } else {
                                  stackOut_66_0 = this;
                                  stackOut_66_1 = stackIn_66_1;
                                  stackOut_66_2 = stackIn_66_2;
                                  stackOut_66_3 = stackIn_66_3;
                                  stackOut_66_4 = (cq) (Object) stackIn_66_4;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_68_1 = stackOut_66_1;
                                  stackIn_68_2 = stackOut_66_2;
                                  stackIn_68_3 = stackOut_66_3;
                                  stackIn_68_4 = stackOut_66_4;
                                  break L19;
                                }
                              }
                            }
                            stackOut_70_0 = this;
                            stackOut_70_1 = stackIn_70_1;
                            stackOut_70_2 = stackIn_70_2;
                            stackOut_70_3 = stackIn_70_3;
                            stackOut_70_4 = (cq) (Object) stackIn_70_4;
                            stackOut_70_5 = 0;
                            stackIn_71_0 = stackOut_70_0;
                            stackIn_71_1 = stackOut_70_1;
                            stackIn_71_2 = stackOut_70_2;
                            stackIn_71_3 = stackOut_70_3;
                            stackIn_71_4 = stackOut_70_4;
                            stackIn_71_5 = stackOut_70_5;
                            break L18;
                          }
                        }
                        stackOut_68_0 = this;
                        stackOut_68_1 = stackIn_68_1;
                        stackOut_68_2 = stackIn_68_2;
                        stackOut_68_3 = stackIn_68_3;
                        stackOut_68_4 = (cq) (Object) stackIn_68_4;
                        stackOut_68_5 = 1;
                        stackIn_71_0 = stackOut_68_0;
                        stackIn_71_1 = stackOut_68_1;
                        stackIn_71_2 = stackOut_68_2;
                        stackIn_71_3 = stackOut_68_3;
                        stackIn_71_4 = stackOut_68_4;
                        stackIn_71_5 = stackOut_68_5;
                        break L18;
                      }
                      this.a(stackIn_71_1, stackIn_71_2 != 0, stackIn_71_3 != 0, stackIn_71_4, stackIn_71_5 != 0);
                      var5_ref_cq = (cq) (Object) ((cv) this).field_i.b((byte) 110);
                      if (var8 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                L21: {
                  if (null == var3) {
                    break L21;
                  } else {
                    L22: {
                      var5 = nr.field_e.a(((cq) var3).field_w) >> 2;
                      var6 = ((cq) var3).field_y;
                      if (var5 + var6 <= 630) {
                        break L22;
                      } else {
                        var6 = -var5 + 630;
                        break L22;
                      }
                    }
                    L23: {
                      if (-var5 + var6 < 225) {
                        var6 = 225 - -var5;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      L25: {
                        fe.b(((cq) var3).field_w, db.a(true, var6), u.a(((cq) var3).field_x - 12, (byte) 94), true);
                        fe.c(((cq) var3).field_w, db.a(true, var6), u.a(((cq) var3).field_x + -12, (byte) 94), nd.field_b, true);
                        if (null == var4_ref) {
                          break L25;
                        } else {
                          if (~((cv) this).field_l != ~var4_ref.field_g) {
                            break L25;
                          } else {
                            if (var4_ref.field_e != ((cq) var3).field_k) {
                              break L25;
                            } else {
                              stackOut_86_0 = 1;
                              stackIn_89_0 = stackOut_86_0;
                              break L24;
                            }
                          }
                        }
                      }
                      stackOut_88_0 = 0;
                      stackIn_89_0 = stackOut_88_0;
                      break L24;
                    }
                    L26: {
                      var7 = stackIn_89_0;
                      if (var7 == 0) {
                        break L26;
                      } else {
                        fe.b(qf.field_a, db.a(true, ((cq) var3).field_y), u.a(10 + ((cq) var3).field_x, (byte) 94), true);
                        fe.c(qf.field_a, db.a(true, ((cq) var3).field_y), u.a(((cq) var3).field_x - -10, (byte) 94), nd.field_b, true);
                        break L26;
                      }
                    }
                    if ((Object) (Object) ((cv) this).field_u == var3) {
                      break L21;
                    } else {
                      te discarded$2 = ub.a((byte) 127, im.field_v[1]);
                      break L21;
                    }
                  }
                }
                ((cv) this).field_u = (cq) var3;
                stackOut_95_0 = -2;
                stackOut_95_1 = ~((cv) this).field_a;
                stackIn_96_0 = stackOut_95_0;
                stackIn_96_1 = stackOut_95_1;
                break L8;
              }
              L27: {
                if (stackIn_96_0 != stackIn_96_1) {
                  break L27;
                } else {
                  if (((cv) this).field_b != null) {
                    int discarded$3 = 20;
                    this.c();
                    break L27;
                  } else {
                    break L27;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "cv.O(" + -25752 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException var10_ref_RuntimeException = null;
        int var10 = 0;
        sl var10_ref_sl = null;
        cf var11 = null;
        cq var11_ref = null;
        cq var12 = null;
        om var12_ref = null;
        tc var13 = null;
        int var13_int = 0;
        String var14 = null;
        wk var15 = null;
        int var16 = 0;
        RuntimeException decompiledCaughtException = null;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    ((cv) this).field_a = param0;
                    var10 = ((cv) this).field_a;
                    if (0 != var10) {
                      break L4;
                    } else {
                      if (var16 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var10 != 1) {
                    break L1;
                  } else {
                    if (var16 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  var4 = 50;
                  var3_int = 200;
                  var6 = 150;
                  var5 = -(var3_int / 2) + so.field_b.field_a / 2;
                  var6 = 90;
                  var4 = 56;
                  var3_int = 278;
                  var5 = 45;
                  var7 = var5;
                  if (((cv) this).field_g != null) {
                    break L5;
                  } else {
                    ((cv) this).a(false);
                    break L5;
                  }
                }
                var8 = var6;
                var9 = 10;
                ((cv) this).field_g.c((byte) -124);
                try {
                  L6: {
                    L7: {
                      var10_ref_sl = ku.j(84);
                      if (var10_ref_sl != null) {
                        L8: {
                          var11_ref = new cq(-1, be.field_A);
                          var11_ref.field_B = 278;
                          var11_ref.field_x = 341;
                          var11_ref.field_o = 57;
                          var11_ref.field_y = 45;
                          var12_ref = ar.a(var10_ref_sl.field_g, var10_ref_sl.field_e, 0);
                          int discarded$2 = 0;
                          var13_int = ha.a(var12_ref.field_B.length, var10_ref_sl.field_c);
                          var14 = fo.a(4800, wd.field_e, new String[2]);
                          var11_ref.field_w = var12_ref.field_G.field_k;
                          var11_ref.field_l = true;
                          var11_ref.field_p = var12_ref;
                          var11_ref.field_D = var12_ref.field_G.field_s;
                          var11_ref.field_r = var14;
                          var11_ref.field_q = var12_ref.field_n;
                          if (var12_ref.field_G.c((byte) -45)) {
                            break L8;
                          } else {
                            if (!rf.a(27875)) {
                              break L8;
                            } else {
                              var11_ref.field_l = false;
                              var11_ref.field_r = bn.field_g + " (" + var11_ref.field_r + ")";
                              break L8;
                            }
                          }
                        }
                        var15 = this.a(var12_ref, var10_ref_sl, 200, 1, 200);
                        var11_ref.field_m = var15;
                        ((cv) this).field_g.a((tc) (Object) var11_ref, (long)var11_ref.field_k, 82);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    break L6;
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L9: {
                    var10_ref_RuntimeException = decompiledCaughtException;
                    af.a((Throwable) (Object) var10_ref_RuntimeException, 93, "Error reading quicksave map.");
                    int discarded$3 = 27;
                    qh.b();
                    break L9;
                  }
                }
                var10 = 0;
                L10: while (true) {
                  L11: {
                    L12: {
                      L13: {
                        if (var10 >= 3) {
                          break L13;
                        } else {
                          var11 = br.a(var10, (byte) -12);
                          if (var16 != 0) {
                            break L12;
                          } else {
                            L14: {
                              L15: {
                                if (var11 == null) {
                                  break L15;
                                } else {
                                  var12 = this.a(true, var11);
                                  if (var16 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                var12 = new cq(var10, (String) null);
                                var12.field_l = false;
                                var13 = ((cv) this).field_g.a(-89, (long)var12.field_k);
                                if (null == var13) {
                                  break L16;
                                } else {
                                  var13.d(56);
                                  break L16;
                                }
                              }
                              ((cv) this).field_g.a((tc) (Object) var12, (long)var12.field_k, 105);
                              break L14;
                            }
                            var12.field_o = var4;
                            var12.field_B = var3_int;
                            var12.field_y = var7;
                            var12.field_x = var8;
                            var8 = var8 + (var4 - -var9);
                            var10++;
                            if (var16 == 0) {
                              continue L10;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      if (((cv) this).field_d != null) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                    ((cv) this).field_d = (cq) (Object) ((cv) this).field_g.a(-19, (long)((cv) this).field_d.field_k);
                    break L11;
                  }
                  bv.a(true, 21, 1, 0);
                  if (var16 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              bv.a(true, 22, 1, 21);
              break L1;
            }
            ((cv) this).b(78);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "cv.T(" + param0 + ',' + 42 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "This password contains repeated characters, and would be easy to guess";
        field_m = "<%0>'s game";
        field_q = "Message game";
        field_n = "Report abuse";
        field_k = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_r = "Please enter a year between <%0> and <%1>";
    }
}
