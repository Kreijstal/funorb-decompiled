/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 13) {
                break L1;
              } else {
                this.field_t = (iq) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (-2 == (this.field_a ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if ((this.field_a ^ -1) == -1) {
                      break L4;
                    } else {
                      L5: {
                        if ((this.field_a ^ -1) != -3) {
                          break L5;
                        } else {
                          this.e(-25752);
                          this.a((byte) 88);
                          if (var3 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (-4 == (this.field_a ^ -1)) {
                        this.e(-25752);
                        this.d(26);
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
                  this.h(396);
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.e(-25752);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "cv.N(" + param0 + ')');
        }
    }

    private final void f(int param0) {
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
              if ((var5 ^ -1) >= param0) {
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
          throw ig.a((Throwable) ((Object) runtimeException), "cv.FA(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        cq var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = this.a(321, param0);
              if (param1 == 33) {
                break L1;
              } else {
                this.field_i = (bg) null;
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
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "cv.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.field_o = (iq) null;
                break L1;
              }
            }
            this.field_g = new bg(32);
            this.a(0, (byte) 42);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "cv.CA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ef.b(-1);
                        if (rd.field_j != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        rd.field_j.A(111);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null == bc.field_a) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        bc.field_a.A(111);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        rd.field_j = null;
                        bc.field_a = null;
                        System.gc();
                        vk.field_e[0] = new wk(vc.field_m.a("campaign_1.jpg", -105, ""), (java.awt.Component) ((Object) ll.p(0)));
                        vk.field_e[1] = new wk(vc.field_m.a("campaign_2.jpg", 13, ""), (java.awt.Component) ((Object) ll.p(0)));
                        vk.field_e[2] = new wk(vc.field_m.a("campaign_3.jpg", -91, ""), (java.awt.Component) ((Object) ll.p(0)));
                        mu.field_g = new ru[3][3];
                        var2_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (3 <= var2_int) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3 = "campaign_map" + (var2_int - -1);
                        mu.field_g[var2_int][0] = pv.a("campaign", var3, iw.field_l, 24914);
                        mu.field_g[var2_int][1] = pv.a("campaign", var3 + "_areas", iw.field_l, 24914);
                        mu.field_g[var2_int][2] = pv.a("campaign", var3 + "_full", iw.field_l, 24914);
                        var2_int++;
                        if (var4 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0 <= -62) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        cv.d((byte) -46);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        pl.field_D = new wk[3];
                        pl.field_D[0] = nh.a("takenicon_zamorak", "campaign", iw.field_l, false);
                        pl.field_D[1] = nh.a("takenicon_saradomin", "campaign", iw.field_l, false);
                        pl.field_D[2] = nh.a("takenicon_guthix", "campaign", iw.field_l, false);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) var2), "cv.F(" + param0 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var2_int ^ -1) <= -4) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vk.field_e[var2_int] = null;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 >= 119) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.b(4, 127);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        mu.field_g = (ru[][]) null;
                        pl.field_D = null;
                        System.gc();
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) runtimeException), "cv.EA(" + param0 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
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
                var4 = ha.a(var3.field_B.length, var2.field_c, false);
                var5 = fo.a(4800, wd.field_e, new String[]{var3.field_J, Integer.toString(var4)});
                var6 = fo.a(4800, hi.field_h, new String[]{var5});
                if (this.field_h != null) {
                  break L2;
                } else {
                  L3: {
                    var7 = 164;
                    var8 = nr.field_e.a(qf.field_c) / 2 - -26;
                    if ((var7 ^ -1) <= (var8 ^ -1)) {
                      break L3;
                    } else {
                      var7 = var8;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = 26 + nr.field_e.a(lb.field_c) / 2;
                    if ((var7 ^ -1) <= (var9 ^ -1)) {
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
              var7 = this.field_h.field_i;
              break L1;
            }
            L5: {
              var8 = 26 + var7;
              var9 = rs.field_n.a(var6, var8, 0);
              var10 = 60 + (30 + (var9 - -14) - -40 + 10);
              var11 = -(var8 / 2) + 320;
              var12 = -(var10 / 2) + 240;
              var13 = 13 + var11;
              fe.b(db.a(true, var11), u.a(var12, (byte) 94), var8, var10, io.field_m, ci.field_e, 0, 192);
              var14 = -26 + var8;
              var15 = var13;
              var16 = var12 + 30;
              if (param0 >= 9) {
                break L5;
              } else {
                field_s = (Boolean) null;
                break L5;
              }
            }
            L6: {
              fe.a(this.field_b.field_w, db.a(true, var8 / 2 + var11), u.a(var16, (byte) 94), var8 - 20, nd.field_b, true, 40, 1);
              var16 += 14;
              rs.field_n.a(var6, db.a(true, var15), u.a(var16, (byte) 94), var14, var10, 16777215, 1, 1, 0, 0);
              var16 = var16 + (var9 - -30);
              if (this.field_h == null) {
                this.field_h = new iq(qf.field_c, var15, var16, var7);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              this.field_h.a(0);
              var16 += 40;
              if (null == this.field_f) {
                this.field_f = new iq(lb.field_c, var15, var16, var7);
                break L7;
              } else {
                break L7;
              }
            }
            this.field_f.a(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "cv.A(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        String stackIn_8_0 = null;
        int stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        wk[] stackIn_11_4;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        wk[] stackIn_12_4 = null;
        int[] stackIn_12_5 = null;
        boolean stackIn_31_0 = false;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_30_0;
        Object var2 = null;
        String var3 = null;
        cq var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              fe.a(db.a(true, 32), u.a(71, (byte) 94), 305, 228, io.field_m, jh.field_k, 0, 128, ai.field_V, true, nd.field_b);
              fe.a(db.a(true, 32), u.a(321, (byte) 94), 305, 92, io.field_m, jh.field_k, 0, 128, be.field_A, true, nd.field_b);
              if (null == this.field_d) {
                break L1;
              } else {
                L2: {
                  if (this.field_d.field_k == -1) {
                    stackIn_8_0 = be.field_A;
                    break L2;
                  } else {
                    stackIn_8_0 = this.field_d.field_w;
                    break L2;
                  }
                }
                L3: {
                  var2 = stackIn_8_0;
                  fe.a(db.a(true, 346), u.a(70, (byte) 94), 262, 343, io.field_m, jh.field_k, 0, 128, (String) (var2), true, nd.field_b);
                  stackIn_11_0 = db.a(true, 354);

                  stackIn_11_1 = u.a(361, (byte) 94);

                  stackIn_11_2 = 246;

                  stackIn_11_3 = 41;

                  stackIn_11_4 = il.field_s;

                  if (!wg.a(-33, db.a(true, 354), db.a(true, 354) - -246, u.a(361, (byte) 94), u.a(361, (byte) 94) - -41)) {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = stackIn_11_1;
                    stackIn_12_2 = stackIn_11_2;
                    stackIn_12_3 = stackIn_11_3;
                    stackIn_12_4 = (wk[]) ((Object) stackIn_11_4);
                    stackIn_12_5 = nd.field_b;
                    break L3;
                  } else {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = stackIn_11_1;
                    stackIn_12_2 = stackIn_11_2;
                    stackIn_12_3 = stackIn_11_3;
                    stackIn_12_4 = (wk[]) ((Object) stackIn_11_4);
                    stackIn_12_5 = ci.field_e;
                    break L3;
                  }
                }
                L4: {
                  fe.a(stackIn_12_0, stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_12_4, stackIn_12_5, 0, 0);
                  var3 = io.field_o;
                  if ((this.field_d.field_k ^ -1) == 0) {
                    var3 = es.field_b;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    fe.c(var3, db.a(true, 477), u.a(396, (byte) 94), 0, true);
                    var4 = db.a(true, 359);
                    var5 = u.a(85, (byte) 94);
                    id.a(var4, var4 + 236, var5 + 200, var5, (byte) 83);
                    if (this.field_d == null) {
                      break L6;
                    } else {
                      if (this.field_d.field_k != -1) {
                        break L6;
                      } else {
                        this.field_d.field_m.f(-(this.field_d.field_m.field_y / 2) + (var4 + 118), var5);
                        if (var8 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  vk.field_e[this.field_d.field_k].g(var4, var5);
                  this.field_d.field_m.f(var4, var5, Math.abs(g.a(param0 ^ -397, uk.field_n << -1684237723) * 100 >> -1095027952) + 80);
                  break L5;
                }
                rf.b(param0 ^ -18466);
                var6 = 5;
                var7 = 5 + rs.field_n.a(this.field_d.field_q, 232, 0);
                en.field_E.a(this.field_d.field_q, var4 + var6, 200 + var5, -(2 * var6) + 236, var7, 16777215, -1, 1, 0, 0);
                break L1;
              }
            }
            if (param0 == 396) {
              var2 = null;
              var3_ref = (cq) ((Object) this.field_g.b(param0 ^ 397));
              L7: while (true) {
                L8: {
                  L9: {
                    L10: {
                      if (null == var3_ref) {
                        break L10;
                      } else {
                        stackOut_30_0 = var3_ref.field_l;
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
                                  if (var3_ref.a(sm.field_d, ko.field_b, param0 + -275)) {
                                    break L13;
                                  } else {
                                    if (var3_ref != this.field_d) {
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                stackIn_43_0 = 1;
                                break L11;
                              }
                            }
                            stackIn_43_0 = 0;
                            break L11;
                          }
                          L14: {
                            var4 = stackIn_43_0;
                            this.a((byte) 13, false, var3_ref, var4 != 0);
                            if (var4 == 0) {
                              break L14;
                            } else {
                              var2 = var3_ref;
                              break L14;
                            }
                          }
                          var3_ref = (cq) ((Object) this.field_g.b((byte) 101));
                          if (var8 == 0) {
                            continue L7;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (this.field_u == var2) {
                      break L8;
                    } else {
                      if (null != var2) {
                        stackIn_53_0 = 55;
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  ub.a((byte) stackIn_53_0, im.field_v[1]);
                  break L8;
                }
                this.field_u = (cq) (var2);
                fe.a(og.field_u, db.a(true, 320), u.a(30, (byte) 94), nd.field_b, 1, false);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (var2), "cv.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
                field_q = (String) null;
                break L1;
              }
            }
            field_k = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "cv.U(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1, cq param2, boolean param3) {
        int stackIn_5_0 = 0;
        int stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        wk[] stackIn_17_4;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        wk[] stackIn_18_4 = null;
        int[] stackIn_18_5 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
                    if ((param2.field_k ^ -1) == -3) {
                      stackIn_5_0 = 2;
                      break L3;
                    } else {
                      stackIn_5_0 = 0;
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
            L5: {
              hr.field_d[var9].g(var5_int, var6, var8);
              gt.field_c[var9].g(-12 + var5_int, var6 - 18, var8);
              if (param0 == 13) {
                break L5;
              } else {
                field_n = (String) null;
                break L5;
              }
            }
            L6: {
              rf.b(param0 + -18875);
              stackIn_17_0 = db.a(true, param2.field_y);

              stackIn_17_1 = u.a(param2.field_x, (byte) 94);

              stackIn_17_2 = param2.field_B;

              stackIn_17_3 = param2.field_o;

              stackIn_17_4 = tb.field_j;

              if (param3) {
                stackIn_18_0 = stackIn_17_0;
                stackIn_18_1 = stackIn_17_1;
                stackIn_18_2 = stackIn_17_2;
                stackIn_18_3 = stackIn_17_3;
                stackIn_18_4 = (wk[]) ((Object) stackIn_17_4);
                stackIn_18_5 = nd.field_b;
                break L6;
              } else {
                stackIn_18_0 = stackIn_17_0;
                stackIn_18_1 = stackIn_17_1;
                stackIn_18_2 = stackIn_17_2;
                stackIn_18_3 = stackIn_17_3;
                stackIn_18_4 = (wk[]) ((Object) stackIn_17_4);
                stackIn_18_5 = jh.field_k;
                break L6;
              }
            }
            L7: {
              fe.b(stackIn_18_0, stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5, 0, 0);
              if (null != param2.field_w) {
                var10 = db.a(true, param2.field_y + var7);
                var11 = param2.field_o / 2 + param2.field_x + rs.field_n.field_v;
                fe.a(param2.field_w, var10, u.a(8 + (param2.field_x + param2.field_o / 2), (byte) 94), true);
                fe.a(param2.field_w, var10, u.a(param2.field_o / 2 + param2.field_x + 8, (byte) 94), nd.field_b, true);
                rs.field_n.b(param2.field_r, var10, u.a(var11, (byte) 94), 12303291, 1);
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("cv.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ')');
        }
    }

    final static void a(kl param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 12 % ((param2 - -16) / 40);
                if (0 != param1) {
                  break L2;
                } else {
                  nu.a(23948, param0, 0);
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              nu.a(23948, param0, 1);
              nu.a(23948, param0, 2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("cv.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, boolean param1, boolean param2, cq param3, boolean param4) {
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        at var6 = null;
        RuntimeException var6_ref = null;
        a var7 = null;
        int var7_int = 0;
        Object var8 = null;
        wk var9 = null;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        int var13 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var6_int = 36 / ((param0 - -78) / 43);
                  if (this.field_b == param3) {
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
                param3.field_m = this.field_e.a(param3.field_k, 3355443, (byte) -73, 0);
                var6 = this.field_e.a(param3.field_k, 1);
                if (null == var6) {
                  break L4;
                } else {
                  var7 = (a) ((Object) var6.e((byte) 95));
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
                            var7_int = this.field_l;
                            if (var7_int == 0) {
                              break L10;
                            } else {
                              if (-2 == (var7_int ^ -1)) {
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
                      param3.field_s.e(db.a(true, 0), u.a(0, (byte) 94), (ae.b(uk.field_n << -505185882, 100) >> 720543564) + 22);
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
                  var6 = this.field_e.a(param3.field_k, 1);
                  if (var6 == null) {
                    break L5;
                  } else {
                    var7 = (a) ((Object) var6.e((byte) 120));
                    if (null != var7) {
                      L15: {
                        var8 = null;
                        var10 = param3.field_p.field_E;
                        if (param3.field_r != null) {
                          var10 = 0;
                          var9 = pl.field_D[this.field_l];
                          break L15;
                        } else {
                          var8 = km.field_h[2];
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
                          if (-165 >= (param3.field_t ^ -1)) {
                            break L21;
                          } else {
                            L22: {
                              if (-33 <= (param3.field_t ^ -1)) {
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
                      this.a((wk) (var8), var11, var10, var7.field_l, var9, 1, var12, var7.field_p);
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
            var6_ref = decompiledCaughtException;
            stackIn_90_0 = (RuntimeException) (var6_ref);

            stackIn_90_1 = new StringBuilder().append("cv.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_91_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackIn_91_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackIn_91_2 = "null";
              break L23;
            } else {
              stackIn_91_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackIn_91_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackIn_91_2 = "{...}";
              break L23;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_91_0), stackIn_91_2 + ',' + param4 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
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
                var3 = ar.a(var2.field_g, var2.field_e, param0 + -26);
                var4 = ha.a(var3.field_B.length, var2.field_c, false);
                var5 = fo.a(4800, sb.field_f, new String[]{Integer.toString(var4)});
                if (null == this.field_c) {
                  break L2;
                } else {
                  var6 = this.field_c.field_i;
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
                if ((var6 ^ -1) <= (var7 ^ -1)) {
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
              if ((var9 ^ -1) >= (var6 ^ -1)) {
                break L1;
              } else {
                var6 = var9;
                break L1;
              }
            }
            L5: {
              var7 = param0 + var6;
              var8 = rs.field_n.a(var5, var7, 0);
              var9 = 154 + (var8 + 40);
              var10 = -(var7 / 2) + 320;
              var11 = 240 - var9 / 2;
              var12 = var10 - -13;
              fe.b(db.a(true, var10), u.a(var11, (byte) 94), var7, var9, io.field_m, ci.field_e, 0, 192);
              var13 = var7 - 26;
              var14 = var12;
              var15 = 30 + var11;
              fe.a(this.field_b.field_w, db.a(true, var10 - -(var7 / 2)), u.a(var15, (byte) 94), var7 + -20, nd.field_b, true, 40, 1);
              var15 += 14;
              rs.field_n.a(var5, db.a(true, var14), u.a(var15, (byte) 94), var13, var9, 16777215, 1, 1, 0, 0);
              var15 = var15 + (30 + var8);
              if (null != this.field_c) {
                break L5;
              } else {
                this.field_c = new iq(kd.field_Y, var14, var15, var6);
                break L5;
              }
            }
            L6: {
              this.field_c.a(param0 + -26);
              var15 += 40;
              if (null == this.field_j) {
                this.field_j = new iq(vh.field_r, var14, var15, var6);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var15 += 40;
              this.field_j.a(0);
              if (this.field_o == null) {
                this.field_o = new iq(lb.field_c, var14, var15, var6);
                break L7;
              } else {
                break L7;
              }
            }
            this.field_o.a(param0 ^ 26);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "cv.R(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int stackIn_32_0 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var3 = 0;
        vk var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              hh.a(-16147, 50, qf.field_f, true);
              var2 = null;
              if (0 != this.field_a) {
                L2: {
                  var3 = this.field_l;
                  if (-1 == (var3 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if ((var3 ^ -1) != -2) {
                        break L3;
                      } else {
                        if (var9 == 0) {
                          var2 = new int[]{1, 2, 4, 11, 12, 13};
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (-3 != (var3 ^ -1)) {
                      break L1;
                    } else {
                      if (var9 == 0) {
                        var2 = new int[]{1, 14, 15, 16};
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var2 = new int[]{1, 2, 3, 9, 10};
                break L1;
              } else {
                var2 = new int[]{1, 2, 3, 5, 6, 7, 8};
                break L1;
              }
            }
            L4: {
              var3 = 113 % ((-3 - param0) / 56);
              if (null == var2) {
                break L4;
              } else {
                var4 = new vk();
                var5 = (int[]) (Object) (var2);
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
                            if (2 != this.field_l) {
                              break L8;
                            } else {
                              if (var7 != 0) {
                                break L8;
                              } else {
                                stackIn_32_0 = 20 + gi.field_b;
                                break L7;
                              }
                            }
                          }
                          stackIn_32_0 = gi.field_b;
                          break L7;
                        }
                        L9: {
                          L10: {
                            var8 = stackIn_32_0;
                            stackIn_38_0 = var4.field_a;

                            stackIn_38_1 = var7;

                            if ((this.field_a ^ -1) == -1) {
                              break L10;
                            } else {
                              stackIn_38_0 = (int[]) ((Object) stackIn_38_0);

                              if (3 < var7) {
                                break L10;
                              } else {


                                stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
                                stackIn_39_1 = stackIn_38_1;
                                stackIn_39_2 = var8;
                                break L9;
                              }
                            }
                          }
                          stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
                          stackIn_39_1 = stackIn_38_1;
                          stackIn_39_2 = 256;
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
                  ((wn) ((Object) lk.field_e.field_y)).a((byte) 48, wf.field_v, var4);
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (var2), "cv.AA(" + param0 + ')');
        }
    }

    final static void a(byte param0, nr param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 == 123) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            b.field_k = param3;
            sg.field_c = param1;
            ov.field_b = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("cv.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0) {
        String[] array$0 = null;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        cq stackIn_29_0 = null;
        cq stackIn_31_0 = null;
        int stackIn_35_0 = 0;
        String stackIn_35_1 = null;
        String[] stackIn_35_2 = null;
        String[] stackIn_35_3 = null;
        int stackIn_35_4 = 0;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        String[] stackIn_37_2 = null;
        String[] stackIn_37_3 = null;
        int stackIn_37_4 = 0;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        String[] stackIn_38_2 = null;
        String[] stackIn_38_3 = null;
        int stackIn_38_4 = 0;
        String stackIn_38_5 = null;
        int stackIn_58_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_98_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        int var16 = 0;
        tc var16_ref_tc = null;
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
        sd var26_ref_sd = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var29 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_b == null) {
                        statePc = 7;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!this.field_b.field_l) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (null == this.field_t) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var2_int = this.field_t.field_i;
                    if (var29 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var2_int = 184;
                    var3 = 26 + nr.field_e.a(ul.field_j) / 2;
                    if (var3 <= var2_int) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2_int = var3;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var4 = nr.field_e.a(pn.field_k) / 2 + 26;
                    if ((var2_int ^ -1) <= (var4 ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2_int = var4;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var3 = var2_int - -26;
                    var4 = -26 + var3;
                    fe.b(db.a(true, 5), u.a(4, (byte) 94), var3, 472, io.field_m, ci.field_e, 0, 112);
                    var5 = 18;
                    var6 = 34;
                    var6 = 34;
                    fe.a(this.field_b.field_w, db.a(true, var3 / 2 + 5), u.a(var6, (byte) 94), -20 + var3, nd.field_b, true, 40, 1);
                    var6 += 14;
                    var7 = this.field_b.field_p.a(-127);
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
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var15_int >= var13.length) {
                        statePc = 25;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_26_0 = 0;
                    stackIn_17_0 = stackIn_26_0;
                    if (var29 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var16 = stackIn_17_0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if ((var16 ^ -1) <= (var13[0].length ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
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
                        statePc = 24;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var29 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var15_int++;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var29 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    fe.b(db.a(true, var5 - -var8), u.a(var6, (byte) 94), var9 * var7.field_l, var7.field_n * var10, io.field_m, ci.field_e, 0, 0);
                    var6 = var6 + (124 - -ro.field_rb[0].field_f);
                    stackIn_26_0 = 18;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var15_int = stackIn_26_0;
                    var16_ref_tc = this.field_b.field_n.b(param0 ^ 21);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var16_ref_tc == null) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var17 = (int)var16_ref_tc.field_i;
                    ro.field_rb[var17].a(db.a(true, var15_int), u.a(var6 + -ro.field_rb[var17].field_f, (byte) 94));
                    var15_int = var15_int + ro.field_rb[var17].field_g;
                    stackIn_31_0 = this.field_b;
                    stackIn_29_0 = stackIn_31_0;
                    if (var29 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var16_ref_tc = ((bg) (Object) stackIn_29_0.field_n).b((byte) 77);
                    if (var29 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = this.field_b;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var15 = stackIn_31_0.field_p;
                    rs.field_n.a(k.field_b + var15.field_E, db.a(true, var5), u.a(var6, (byte) 94), var4, 472, 16776960, 1, 0, 0, 0);
                    var6 = var6 + rs.field_n.field_v;
                    var16 = 1;
                    if (this.field_b.field_r != null) {
                        statePc = 34;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 34: {
                    array$0 = new String[1];
                    stackIn_37_0 = 4800;
                    stackIn_35_0 = stackIn_37_0;
                    stackIn_37_1 = uh.field_c;
                    stackIn_35_1 = stackIn_37_1;
                    stackIn_37_2 = (String[]) (array$0);
                    stackIn_35_2 = stackIn_37_2;
                    stackIn_37_3 = (String[]) (array$0);
                    stackIn_35_3 = stackIn_37_3;
                    stackIn_37_4 = 0;
                    stackIn_35_4 = stackIn_37_4;
                    if (null == this.field_b.field_r) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_38_0 = stackIn_35_0;
                    stackIn_38_1 = (String) ((Object) stackIn_35_1);
                    stackIn_38_2 = (String[]) ((Object) stackIn_35_2);
                    stackIn_38_3 = (String[]) ((Object) stackIn_35_3);
                    stackIn_38_4 = stackIn_35_4;
                    stackIn_38_5 = this.field_b.field_r;
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = stackIn_37_0;
                    stackIn_38_1 = (String) ((Object) stackIn_37_1);
                    stackIn_38_2 = (String[]) ((Object) stackIn_37_2);
                    stackIn_38_3 = (String[]) ((Object) stackIn_37_3);
                    stackIn_38_4 = stackIn_37_4;
                    stackIn_38_5 = dv.field_g;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_38_3[stackIn_38_4] = stackIn_38_5;
                    var17_ref_String = fo.a(stackIn_38_0, stackIn_38_1, stackIn_38_2);
                    var16 = rs.field_n.a(var17_ref_String, db.a(true, var5), u.a(var6, (byte) 94), var4, 472, 16776960, 1, 0, 0, 0);
                    var18 = rs.field_n.a(var17_ref_String, var4);
                    var19_int = this.field_b.field_A;
                    if (1000 < var19_int) {
                        statePc = 51;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if ((var19_int ^ -1) >= -501) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    am.field_C[1].g(db.a(true, 5 + var18 + var5), u.a(var6 - -rs.field_n.field_H + -rs.field_n.field_z, (byte) 94));
                    if (var29 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (10 < var19_int) {
                        statePc = 50;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 50: {
                    am.field_C[2].g(db.a(true, var5 + var18 - -5), u.a(-rs.field_n.field_z + rs.field_n.field_H + var6, (byte) 94));
                    if (var29 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    am.field_C[0].g(db.a(true, var5 - (-var18 - 5)), u.a(-rs.field_n.field_z + rs.field_n.field_H + var6, (byte) 94));
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var6 = var6 + rs.field_n.field_v * (-1 + var16);
                    var17 = 276;
                    var5 = 18;
                    var18 = var5;
                    var17 += 30;
                    var17 += 17;
                    var19 = null;
                    var18 = var18 + param0;
                    var20 = var15.field_B.length + -1;
                    var21 = 50;
                    var22 = 15;
                    if ((var20 ^ -1) >= -3) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var21 = 25;
                    var22 = 0;
                    var17 += 30;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var17 = var17 + (var20 * var21 / 2 - 50);
                    var23 = var15.field_B;
                    var24_int = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (var24_int >= var23.length) {
                        statePc = 69;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var25_int = var23[var24_int];
                    stackIn_70_0 = 0;
                    stackIn_58_0 = stackIn_70_0;
                    if (var29 != 0) {
                        statePc = 70;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 > var25_int) {
                        statePc = 68;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var26_ref_sd = var15.field_G.field_q[var25_int];
                    if (-3 <= (var20 ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var26_ref_sd.field_q.a(false, false, (byte) 68, false, false, false, u.a(var17, (byte) 94), var26_ref_sd.field_u, db.a(true, -5 + var18));
                    if (var29 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var26_ref_sd.field_q.a(false, 0, u.a(var17, (byte) 94), false, db.a(true, var18 + -5), var26_ref_sd.field_u, false, false, false, param0 + -19764);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    var27 = var18 - -60;
                    var28 = 5 + var4 - var27;
                    rs.field_n.a(var26_ref_sd.field_u, db.a(true, var27), u.a(var17 - -var22, (byte) 94), var28, 20, 16777215, 1, 0, 2, 0);
                    var17 = var17 - var21;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var24_int++;
                    if (var29 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var5 = 18;
                    var6 += 16;
                    en.field_E.a(var15.field_n, db.a(true, var5), u.a(var6, (byte) 94), var4, 472, 16777215, 1, 0, 0, 12);
                    stackIn_70_0 = 391;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    var6 = stackIn_70_0;
                    var23_ref = var15.g(-1);
                    var24 = km.field_h[2];
                    this.a(var24, 0, 0, 10 + var6, var23_ref.field_h, param0 + -19, 1.0f, 18 + var23_ref.field_h.field_A / 2);
                    if (var23_ref.field_i != null) {
                        statePc = 73;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (ml.a(u.a(var6 + 10, (byte) 94), db.a(true, var23_ref.field_h.field_A / 2 + 18), 25, false)) {
                        statePc = 76;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var25_int = var4 * 2;
                    var26 = var3 - -5;
                    if (so.field_b.field_a >= var26 + var25_int) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var25_int = so.field_b.field_a - var26;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var27 = rs.field_n.a(var23_ref.field_i, var25_int, 0);
                    var28 = var6 + -(var27 / 2);
                    qn.b(db.a(true, var26), u.a(var28, (byte) 94), var25_int, var27 - -2, 0, 128);
                    rs.field_n.a(var23_ref.field_i, db.a(true, var26), u.a(var28, (byte) 94), var25_int, 472, 16777215, 1, 1, 0, 0);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    rs.field_n.a(ft.field_l + var23_ref.field_c, db.a(true, var23_ref.field_h.field_A + 31), u.a(-10 + var6, (byte) 94), -13 + (-var23_ref.field_h.field_A + var4), var23_ref.field_h.field_x, 16776960, 0, 0, 1, 0);
                    if (null == var19) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var25_int = 100;
                    var26 = sm.field_d;
                    var27 = rs.field_n.a(((sd) (var19)).field_u, var25_int, 0);
                    var28 = -(var27 / 2) + (25 + ko.field_b);
                    qn.b(db.a(true, var26), u.a(var28, (byte) 94), var25_int, var27 - -2, 0, 255);
                    rs.field_n.a(((sd) (var19)).field_u, db.a(true, var26), u.a(var28, (byte) 94), var25_int, 472, 16777215, 1, 1, 0, 0);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var6 = 436;
                    if (this.field_t != null) {
                        statePc = 84;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    this.field_t = new iq(ul.field_j, var5, var6, var2_int);
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (null == this.field_p) {
                        statePc = 87;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 87: {
                    this.field_p = new iq(pn.field_k, var5, var6, var2_int);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var25 = ku.j(121);
                    if (null == var25) {
                        statePc = 97;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if ((this.field_l ^ -1) != (var25.field_g ^ -1)) {
                        statePc = 97;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if ((var25.field_e ^ -1) != (this.field_b.field_k ^ -1)) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackIn_98_0 = 1;
                    statePc = 98;
                    continue stateLoop;
                }
                case 97: {
                    stackIn_98_0 = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    var26 = stackIn_98_0;
                    if ((this.field_a ^ -1) != -2) {
                        statePc = 112;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (this.field_b.field_r == null) {
                        statePc = 108;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var26 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    this.field_p.a(0);
                    if (var29 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    this.field_t.a(0);
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(wk param0, int param1, int param2, int param3, wk param4, int param5, float param6, int param7) {
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var9_int = param4.field_y;
                param7 = db.a(true, param7);
                param3 = u.a(param3, (byte) 94);
                var10 = (13 * param3 + fe.field_b + param7 * 57) % 100;
                if (param6 != (float)param5) {
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
                    fe.a(param7, param3, param1, param2, var10, 40, 96);
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
                    if ((param2 ^ -1) < -1) {
                      fe.a(param7, param3, param1, param2, var10, var13, var14);
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
              if ((param2 ^ -1) < -1) {
                fe.a(param7, param3, param1, param2, var10, 20, 48);
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
            stackIn_58_0 = (RuntimeException) (var9);

            stackIn_58_1 = new StringBuilder().append("cv.DA(");

            if (param0 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L14;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L15;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L15;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_59_0), stackIn_63_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final wk a(om param0, sl param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        wk var6 = null;
        lo var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        String[] var13 = null;
        int var14_int = 0;
        ha var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        ne var18 = null;
        int var19 = 0;
        int var23 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        wk stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var20 = 0;
        jd var21_ref_jd = null;
        int var21 = 0;
        int var22 = 0;
        var23 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6 = new wk(param4, param2);
            var7 = param0.a(-98);
            var8 = var6.field_v / var7.field_n;
            var9 = var6.field_y / var7.field_l;
            var10 = (var6.field_y + -(var9 * var7.field_l)) / 2;
            var11 = (-(var9 * var7.field_n) + var6.field_v) / 2;
            var12 = new int[][]{kb.field_o};
            var13 = new String[param0.field_B.length];
            var14_int = 0;
            L1: while (true) {
              L2: {
                if ((var13.length ^ -1) >= (var14_int ^ -1)) {
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
              var14 = new ha(0, var13, -1, var12, 0, true, false, param0.field_o, 1, var7.field_p, false, (int[][]) null, 4, 0, 0, param0);
              var14.field_sb = 0;
              try {
                L3: {
                  ml.a(param0, (byte) -26);
                  var14.b(param3 ^ param3, new vh(param1.field_c));
                  break L3;
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  runtimeException = decompiledCaughtException;
                  runtimeException.printStackTrace();
                  break L4;
                }
              }
              vn.a(var6, 3);
              qn.f(0, 0, var6.field_y, var6.field_v, 4473924);
              var15 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var15 >= var14.field_Eb.length) {
                      break L7;
                    } else {
                      var16 = var15 / var14.field_v;
                      var17 = var15 % var14.field_v;
                      var18 = var14.field_Eb[var15];
                      var19 = var18.field_h;
                      stackIn_20_0 = -17;

                      stackIn_20_1 = var19 ^ -1;

                      if (var23 != 0) {
                        break L6;
                      } else {
                        L8: {
                          if (stackIn_20_0 >= stackIn_20_1) {
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
                  stackIn_20_0 = param3;
                  stackIn_20_1 = -18863;
                  break L6;
                }
                rf.b(stackIn_20_0 + stackIn_20_1);
                stackIn_21_0 = (wk) (var6);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var6_ref);

            stackIn_25_1 = new StringBuilder().append("cv.V(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_30_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_21_0;
    }

    private final void a(int param0, om param1) {
        RuntimeException runtimeException = null;
        cq var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new cq(param1);
              var4 = mh.a(this.field_l, param0 + -119, var3.field_k);
              if ((var4 ^ -1) >= param0) {
                break L1;
              } else {
                var3.field_r = ir.a(10602, var4);
                var3.field_A = var4;
                break L1;
              }
            }
            this.field_i.a(var3, (long)var3.field_k, 122);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("cv.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final cq a(int param0, int param1) {
        cq var3 = null;
        RuntimeException var3_ref = null;
        cq stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 321) {
                break L1;
              } else {
                this.a((byte) -52, true, (cq) null, true);
                break L1;
              }
            }
            var3 = (cq) ((Object) this.field_i.a(-128, (long)param1));
            stackIn_4_0 = (cq) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "cv.W(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void g(int param0) {
        sl var2 = null;
        om var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                this.field_b = null;
                if (this.field_d.field_k != -1) {
                  break L2;
                } else {
                  L3: {
                    var2 = ku.j(param0 + 86);
                    if (ei.a(var2.field_g, param0 + 11906)) {
                      break L3;
                    } else {
                      if (rf.a(27875)) {
                        pr.field_i = bn.field_g;
                        bv.a(false, 11, param0 ^ 1, jt.field_a);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.b(var2.field_g, 53);
                  var3 = ar.a(var2.field_g, var2.field_e, 0);
                  l.field_c = var3;
                  bv.a(true, -11, param0 + 1, 0);
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.a(this.field_d.field_k, true);
              break L1;
            }
            L4: {
              if (param0 == 0) {
                break L4;
              } else {
                this.field_p = (iq) null;
                break L4;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "cv.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void f(byte param0) {
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        fe.field_b = fe.field_b + 1;
                        fe.field_b = fe.field_b % 100;
                        if (param0 >= 114) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (2 > hi.field_j) {
                            statePc = 20;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!br.field_f[5]) {
                            statePc = 20;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (br.field_f[81]) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        kw.field_R = 2297;
                        cg.field_j = 72584621;
                        wr.field_L = 224;
                        ii.field_b = 4452;
                        var2 = br.a(this.field_l, (byte) -125).field_n;
                        var3_int = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((((Object[]) (var2)).length ^ -1) >= (var3_int ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4 = ((Object[]) (var2))[var3_int];
                        ra.a(4, -1, (om) (var4), true, 1, -1);
                        var3_int++;
                        if (var7 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var7 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        pg.field_d.field_g = new cm();
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.a(this.field_l, true);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (1 == this.field_a) {
                            statePc = 96;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (this.field_a != 0) {
                            statePc = 40;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (this.field_d == null) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_d.field_v = this.field_d.field_v + 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null == this.field_d) {
                            statePc = 192;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (tr.field_A != 1) {
                            statePc = 192;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (wg.a(-33, db.a(true, 354), db.a(true, 600), u.a(361, (byte) 94), u.a(402, (byte) 94))) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.g(0);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return;
                }
                case 40: {
                    try {
                        if ((this.field_a ^ -1) == -4) {
                            statePc = 67;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((this.field_a ^ -1) != -3) {
                            statePc = 192;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (-2 != (tr.field_A ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (null == this.field_h) {
                            statePc = 56;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (this.field_h.a((byte) 86)) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        this.f(-2);
                        l.field_c = this.field_b.field_p;
                        bv.a(true, -10, 1, 0);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (-2 != (tr.field_A ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (this.field_f == null) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (this.field_f.a((byte) -69)) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.field_a = 1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 66: {
                    return;
                }
                case 67: {
                    try {
                        if ((tr.field_A ^ -1) != -2) {
                            statePc = 75;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (this.field_c == null) {
                            statePc = 75;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (!this.field_c.a((byte) -49)) {
                            statePc = 75;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var2 = ku.j(86);
                        var3 = ar.a(((sl) (var2)).field_g, ((sl) (var2)).field_e, 0);
                        l.field_c = (om) (var3);
                        bv.a(true, -11, 1, 0);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (-2 != (tr.field_A ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (null == this.field_j) {
                            statePc = 85;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (this.field_j.a((byte) 121)) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        this.f(-2);
                        l.field_c = this.field_b.field_p;
                        bv.a(true, -10, 1, 0);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if ((tr.field_A ^ -1) != -2) {
                            statePc = 95;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (this.field_o == null) {
                            statePc = 95;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (this.field_o.a((byte) -52)) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        this.field_a = 1;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 95: {
                    return;
                }
                case 96: {
                    try {
                        if (null == this.field_b) {
                            statePc = 99;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        this.field_b.field_v = this.field_b.field_v + 1;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (-2 != (tr.field_A ^ -1)) {
                            statePc = 188;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (null != this.field_e) {
                            statePc = 105;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (null == this.field_b) {
                            statePc = 117;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (!this.field_b.field_l) {
                            statePc = 117;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (this.field_t == null) {
                            statePc = 117;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (!this.field_t.a((byte) -27)) {
                            statePc = 117;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        this.b((byte) 107);
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 116: {
                    return;
                }
                case 117: {
                    try {
                        var2_int = this.field_e.a(sm.field_d - db.a(true, 0), (byte) -79, ko.field_b - u.a(0, (byte) 94));
                        if (-1 < var2_int) {
                            statePc = 120;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var3 = null;
                        var4_ref = (cq) ((Object) this.field_i.b(1));
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (var4_ref == null) {
                            statePc = 130;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        stackIn_189_0 = var4_ref.field_k;
                        stackIn_123_0 = stackIn_189_0;
                        stackIn_189_1 = var2_int;
                        stackIn_123_1 = stackIn_189_1;
                        if (var7 != 0) {
                            statePc = 189;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackIn_125_0 = stackIn_123_0;
                        stackIn_125_1 = stackIn_123_1;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (stackIn_125_0 != stackIn_125_1) {
                            statePc = 129;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var3 = var4_ref;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var4_ref = (cq) ((Object) this.field_i.b((byte) 60));
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (var3 == null) {
                            statePc = 188;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (!((cq) (var3)).field_l) {
                            statePc = 188;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        var4_int = 0;
                        if (-3 < (hi.field_j ^ -1)) {
                            statePc = 175;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (!br.field_f[81]) {
                            statePc = 169;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        cg.field_j = 72584621;
                        ii.field_b = 4452;
                        wr.field_L = 224;
                        kw.field_R = 2297;
                        hc.field_b = hc.field_b + 1;
                        hc.field_b = hc.field_b + (ko.field_b ^ sm.field_d);
                        hc.field_b = Math.abs(hc.field_b);
                        var5 = hc.field_b % 4;
                        var6 = var5;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 156;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if ((var6 ^ -1) != -2) {
                            statePc = 145;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (var7 == 0) {
                            statePc = 157;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (var6 != 2) {
                            statePc = 151;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (var7 == 0) {
                            statePc = 160;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if ((var6 ^ -1) == -4) {
                            statePc = 163;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        ii.field_b = ii.field_b - 12;
                        kw.field_R = kw.field_R - 3;
                        if (var7 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        ii.field_b = ii.field_b + 3;
                        kw.field_R = kw.field_R + 12;
                        if (var7 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        kw.field_R = kw.field_R + 9;
                        if (var7 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        ii.field_b = ii.field_b - 9;
                        if (var7 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw new IllegalStateException("");
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        var5 = b.a(2, 10, 12, (byte) 25, 3);
                        ra.a(4, 12, ((cq) (var3)).field_p, true, var5, 3);
                        this.a(((cq) (var3)).field_p.field_G.field_r, true);
                        System.out.println("m  id " + ((cq) (var3)).field_k + " " + ((cq) (var3)).field_w);
                        var4_int = 1;
                        if (var7 == 0) {
                            statePc = 175;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (br.field_f[82]) {
                            statePc = 174;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        var4_int = 1;
                        ra.a(4, -1, ((cq) (var3)).field_p, true, 1, -1);
                        this.a(((cq) (var3)).field_p.field_G.field_r, true);
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        if (var4_int != 0) {
                            statePc = 188;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        if (this.field_b != var3) {
                            statePc = 185;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (this.field_b.field_v >= 20) {
                            statePc = 187;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        this.b((byte) 72);
                        if (var7 == 0) {
                            statePc = 187;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        ub.a((byte) 80, im.field_v[11]);
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        this.field_b = (cq) (var3);
                        this.field_b.field_v = 0;
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        stackIn_189_0 = -3;
                        stackIn_189_1 = tr.field_A ^ -1;
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if (stackIn_189_0 == stackIn_189_1) {
                            statePc = 191;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        this.field_b = null;
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if (2 != tr.field_A) {
                            statePc = 195;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        this.field_b = null;
                        this.field_d = null;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        if ((tr.field_A ^ -1) == -2) {
                            statePc = 198;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        statePc = 248;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        var2 = null;
                        var3 = null;
                        var4_int = this.field_a;
                        if (0 == var4_int) {
                            statePc = 204;
                        } else {
                            statePc = 199;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        if (1 == var4_int) {
                            statePc = 205;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        var3 = this.field_g;
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        var3 = this.field_i;
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        if (null == var3) {
                            statePc = 248;
                        } else {
                            statePc = 207;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        var4_ref = (cq) ((Object) ((bg) (var3)).b(1));
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        if (null == var4_ref) {
                            statePc = 220;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        if (var7 != 0) {
                            statePc = 248;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        if (!var4_ref.field_l) {
                            statePc = 219;
                        } else {
                            statePc = 213;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        if (!var4_ref.a(sm.field_d, ko.field_b, 122)) {
                            statePc = 219;
                        } else {
                            statePc = 216;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        var2 = var4_ref;
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        var4_ref = (cq) ((Object) ((bg) (var3)).b((byte) 80));
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        if (null == var2) {
                            statePc = 248;
                        } else {
                            statePc = 221;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        if ((this.field_a ^ -1) != -2) {
                            statePc = 233;
                        } else {
                            statePc = 222;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        if (-3 < (hi.field_j ^ -1)) {
                            statePc = 248;
                        } else {
                            statePc = 225;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        statePc = 227;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        if (br.field_f[81]) {
                            statePc = 232;
                        } else {
                            statePc = 228;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        statePc = 230;
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        statePc = 248;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        pg.field_d.field_g.a(65535, ((cq) (var2)).field_k, uk.field_n % 10 + ((cq) (var2)).field_k * 10, this.field_l, ((cq) (var2)).field_k * 200 - -(uk.field_n % 200));
                        this.a(this.field_l, true);
                        if (var7 == 0) {
                            statePc = 248;
                        } else {
                            statePc = 233;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        if ((this.field_a ^ -1) == -1) {
                            statePc = 238;
                        } else {
                            statePc = 234;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        statePc = 248;
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        if (this.field_d != var2) {
                            statePc = 241;
                        } else {
                            statePc = 239;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        statePc = 242;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        ub.a((byte) 98, im.field_v[11]);
                        statePc = 242;
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        this.field_d = (cq) (var2);
                        if (-21 >= (this.field_d.field_v ^ -1)) {
                            statePc = 245;
                        } else {
                            statePc = 243;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        this.g(0);
                        statePc = 245;
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        this.field_d.field_v = 0;
                        statePc = 248;
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 247: {
                    var2 = caughtException;
                    throw ig.a((Throwable) (var2), "cv.H(" + param0 + ')');
                }
                case 248: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
                  l.field_c = this.field_b.field_p;
                  bv.a(true, -10, 1, 0);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (this.field_b.field_k != var2.field_e) {
                  break L3;
                } else {
                  if (var2.field_g != this.field_l) {
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
          throw ig.a((Throwable) ((Object) runtimeException), "cv.S(" + param0 + ')');
        }
    }

    private final cq a(boolean param0, cf param1) {
        cq stackIn_3_0 = null;
        cq stackIn_11_0 = null;
        cq stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        cf stackIn_18_0 = null;
        Object stackIn_34_0 = null;
        cq stackIn_39_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cf stackOut_17_0;
        cq var3 = null;
        RuntimeException var3_ref = null;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
        int var6_int = 0;
        wk var6 = null;
        wk var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0) {
              L1: {
                L2: {
                  var3 = new cq(param1.field_r, param1.field_k);
                  var3.field_D = param1.field_s;
                  var3.field_q = param1.field_o;
                  stackIn_11_0 = (cq) (var3);

                  if (param1.c((byte) -45)) {
                    break L2;
                  } else {
                    stackIn_11_0 = (cq) ((Object) stackIn_11_0);

                    if (0 < df.field_M) {
                      break L2;
                    } else {



                      if (-3 < (hi.field_j ^ -1)) {
                        stackIn_14_0 = (cq) ((Object) stackIn_11_0);
                        stackIn_14_1 = 0;
                        break L1;
                      } else {
                        stackIn_11_0 = (cq) ((Object) stackIn_11_0);
                        break L2;
                      }
                    }
                  }
                }
                stackIn_14_0 = (cq) ((Object) stackIn_11_0);
                stackIn_14_1 = 1;
                break L1;
              }
              L3: {
                L4: {
                  L5: {
                    stackIn_14_0.field_l = stackIn_14_1 != 0;
                    if (!var3.field_l) {
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
                            stackOut_17_0 = (cf) (param1);
                            stackIn_34_0 = stackOut_17_0;
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
                            var3.field_r = fo.a(4800, og.field_l, new String[]{Integer.toString(var4_int), Integer.toString(var5)});
                            var6 = ps.field_w[var3.field_k];
                            var7 = new wk(var6.field_A, var6.field_x);
                            vn.a(var7, 3);
                            var6.f(0, 0);
                            var8 = 18;
                            if (-2 == (var3.field_k ^ -1)) {
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
                        var3.field_m = var7;
                        if (var9 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3.field_r = bn.field_g;
                  break L4;
                }
                stackIn_34_0 = this.field_g.a(-64, (long)var3.field_k);
                break L3;
              }
              L11: {
                var4 = stackIn_34_0;
                if (null != var4) {
                  ((tc) (var4)).d(-100);
                  break L11;
                } else {
                  break L11;
                }
              }
              this.field_g.a(var3, (long)var3.field_k, 97);
              stackIn_39_0 = (cq) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = (cq) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3_ref = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var3_ref);

            stackIn_43_1 = new StringBuilder().append("cv.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L12;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_39_0;
        }
    }

    private final void b(int param0, int param1) {
        cq stackIn_20_0 = null;
        int stackIn_26_0 = 0;
        cq stackIn_42_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        cf var3 = null;
        RuntimeException var3_ref = null;
        om[] var4_ref_om__ = null;
        int var4 = 0;
        int var5 = 0;
        om var6_ref_om = null;
        int var6 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_e = new pr(mu.field_g[param0][1], 1, 16777215);
                        this.field_i = new bg(32);
                        var3 = br.a(param0, (byte) -118);
                        if (var3 == null) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4_ref_om__ = var3.field_n;
                        var5 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((var4_ref_om__.length ^ -1) >= (var5 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6_ref_om = var4_ref_om__[var5];
                        if (var6_ref_om == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a(-1, var6_ref_om);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5++;
                        if (var20 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = 90;
                        var5 = 80;
                        var6 = var4;
                        var7 = var5;
                        var8 = 400;
                        var9 = 150;
                        var10 = 38;
                        var11 = var10 / 2;
                        var12 = 10;
                        var13 = (cq) ((Object) this.field_i.b(1));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null == var13) {
                            statePc = 50;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var20 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (null == var13.field_p.field_y) {
                            statePc = 43;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (null != var13.field_r) {
                            statePc = 43;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var14 = var13.field_p.e((byte) 68) ? 1 : 0;
                        var15 = var14;
                        var16 = var13.field_p.field_y;
                        var17 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var16.length <= var17) {
                            statePc = 41;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var18 = var16[var17];
                        stackIn_42_0 = this.a(321, var18);
                        stackIn_20_0 = stackIn_42_0;
                        if (var20 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0.field_r == null) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_26_0 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var19 = stackIn_26_0;
                        if (var19 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var14 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var15 = 1;
                        if (var20 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var19 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var14 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var15 = 0;
                        if (var20 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var17++;
                        if (var20 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = (cq) (var13);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_42_0.field_l = var15 != 0;
                        if (var20 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var13.field_l = true;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var13.field_B = var9;
                        var13.field_o = var10;
                        var13.field_x = var7;
                        var13.field_y = var6;
                        var6 = var6 + (var12 + var13.field_B);
                        if (var13.field_y > var8) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var6 = var4;
                        var7 = var7 + (var13.field_o - -var11);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var13 = (cq) ((Object) this.field_i.b((byte) 64));
                        if (var20 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (param1 >= 15) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.a(45, (om) null);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) var3_ref), "cv.C(" + param0 + ',' + param1 + ')');
                }
                case 55: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1) {
        wk discarded$1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (ei.a(param0, 11906)) {
                break L1;
              } else {
                if (rf.a(27875)) {
                  pr.field_i = bn.field_g;
                  bv.a(false, 11, 1, jt.field_a);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null == mu.field_g) {
                this.c((byte) -122);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.field_l = param0;
              this.b(param0, 98);
              if (param1) {
                break L3;
              } else {
                discarded$1 = this.a((om) null, (sl) null, -116, 21, 100);
                break L3;
              }
            }
            this.a(1, (byte) 42);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "cv.P(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) != -14) {
                break L1;
              } else {
                L2: {
                  if (-2 == (this.field_a ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if (this.field_a == 0) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_a == 2) {
                            break L4;
                          } else {
                            if (-4 == (this.field_a ^ -1)) {
                              break L4;
                            } else {
                              break L1;
                            }
                          }
                        }
                        this.field_a = 1;
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
                            if (-86 != (param0 ^ -1)) {
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
                    stackIn_46_0 = 256;
                    break L11;
                  } else {
                    stackIn_46_0 = 0;
                    break L11;
                  }
                }
                var5 = stackIn_46_0;
                if ((var4_int ^ -1) == 1) {
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
          throw ig.a((Throwable) ((Object) var4), "cv.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
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
        int statePc = 0;
        Throwable caughtException = null;
        ru var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        cq var4 = null;
        sl var4_ref = null;
        cq var5_ref_cq = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = mu.field_g[this.field_l][0];
                        var2.b(db.a(true, 0), u.a(0, (byte) 94));
                        if (null == this.field_e) {
                            statePc = 11;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var3 = new boolean[this.field_i.a((byte) 117)];
                        var4 = (cq) ((Object) this.field_i.b(param0 ^ -25751));
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 == null) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((byte[]) (var3))[var4.field_k] = (byte) (var4.field_l ? 1 : 0);
                        var4 = (cq) ((Object) this.field_i.b((byte) 109));
                        if (var8 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_e.a((byte) 93, db.a(true, 0), (boolean[]) (var3), u.a(0, (byte) 94), mu.field_g[this.field_l][2]);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3 = caughtException;
                        ((RuntimeException) (var3)).printStackTrace();
                        this.field_e = null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0 == -25752) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.a(85, (byte) -25);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = null;
                        var4_ref = ku.j(85);
                        var5_ref_cq = (cq) ((Object) this.field_i.b(1));
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var5_ref_cq == null) {
                            statePc = 72;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = 0;
                        stackIn_96_0 = this.field_a;
                        stackIn_17_0 = stackIn_96_0;
                        stackIn_96_1 = 1;
                        stackIn_17_1 = stackIn_96_1;
                        if (var8 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 != stackIn_17_1) {
                            statePc = 49;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!var5_ref_cq.field_l) {
                            statePc = 37;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((sm.field_d ^ -1) > (db.a(true, var5_ref_cq.field_y) ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (sm.field_d > db.a(true, var5_ref_cq.field_y - -var5_ref_cq.field_B)) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (ko.field_b < u.a(var5_ref_cq.field_x, (byte) 94)) {
                            statePc = 37;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((ko.field_b ^ -1) < (u.a(var5_ref_cq.field_o + var5_ref_cq.field_x, (byte) 94) ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_38_0 = 1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var6 = stackIn_38_0;
                        if (this.field_e != null) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!var5_ref_cq.field_l) {
                            statePc = 47;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (this.field_e.a(sm.field_d + -db.a(true, 0), (byte) -128, ko.field_b + -u.a(0, (byte) 94)) != var5_ref_cq.field_k) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_48_0 = 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var6 = stackIn_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var6 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var3 = var5_ref_cq;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var4_ref == null) {
                            statePc = 60;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (this.field_l != var4_ref.field_g) {
                            statePc = 60;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var5_ref_cq.field_k != var4_ref.field_e) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackIn_61_0 = 1;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_61_0 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var7 = stackIn_61_0;
                        stackIn_68_0 = this;
                        stackIn_62_0 = stackIn_68_0;
                        stackIn_68_1 = -125;
                        stackIn_62_1 = stackIn_68_1;
                        stackIn_68_2 = 0;
                        stackIn_62_2 = stackIn_68_2;
                        stackIn_68_3 = var7;
                        stackIn_62_3 = stackIn_68_3;
                        stackIn_68_4 = (cq) (var5_ref_cq);
                        stackIn_62_4 = stackIn_68_4;
                        if (var6 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_70_0 = this;
                        stackIn_63_0 = stackIn_70_0;
                        stackIn_70_1 = stackIn_62_1;
                        stackIn_63_1 = stackIn_70_1;
                        stackIn_70_2 = stackIn_62_2;
                        stackIn_63_2 = stackIn_70_2;
                        stackIn_70_3 = stackIn_62_3;
                        stackIn_63_3 = stackIn_70_3;
                        stackIn_70_4 = (cq) ((Object) stackIn_62_4);
                        stackIn_63_4 = stackIn_70_4;
                        if (null == this.field_b) {
                            statePc = 70;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_65_0 = this;
                        stackIn_65_1 = stackIn_63_1;
                        stackIn_65_2 = stackIn_63_2;
                        stackIn_65_3 = stackIn_63_3;
                        stackIn_65_4 = (cq) ((Object) stackIn_63_4);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_70_0 = this;
                        stackIn_66_0 = stackIn_70_0;
                        stackIn_70_1 = stackIn_65_1;
                        stackIn_66_1 = stackIn_70_1;
                        stackIn_70_2 = stackIn_65_2;
                        stackIn_66_2 = stackIn_70_2;
                        stackIn_70_3 = stackIn_65_3;
                        stackIn_66_3 = stackIn_70_3;
                        stackIn_70_4 = (cq) ((Object) stackIn_65_4);
                        stackIn_66_4 = stackIn_70_4;
                        if (var5_ref_cq != this.field_b) {
                            statePc = 70;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_68_0 = this;
                        stackIn_68_1 = stackIn_66_1;
                        stackIn_68_2 = stackIn_66_2;
                        stackIn_68_3 = stackIn_66_3;
                        stackIn_68_4 = (cq) ((Object) stackIn_66_4);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_71_0 = this;
                        stackIn_71_1 = stackIn_68_1;
                        stackIn_71_2 = stackIn_68_2;
                        stackIn_71_3 = stackIn_68_3;
                        stackIn_71_4 = (cq) ((Object) stackIn_68_4);
                        stackIn_71_5 = 1;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_71_0 = this;
                        stackIn_71_1 = stackIn_70_1;
                        stackIn_71_2 = stackIn_70_2;
                        stackIn_71_3 = stackIn_70_3;
                        stackIn_71_4 = (cq) ((Object) stackIn_70_4);
                        stackIn_71_5 = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        this.a(stackIn_71_1, stackIn_71_2 != 0, stackIn_71_3 != 0, stackIn_71_4, stackIn_71_5 != 0);
                        var5_ref_cq = (cq) ((Object) this.field_i.b((byte) 110));
                        if (var8 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (null == var3) {
                            statePc = 95;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var5 = nr.field_e.a(((cq) (var3)).field_w) >> -1164514174;
                        var6 = ((cq) (var3)).field_y;
                        if (-631 <= (var5 + var6 ^ -1)) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var6 = -var5 + 630;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (-var5 + var6 < 225) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var6 = 225 - -var5;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        fe.b(((cq) (var3)).field_w, db.a(true, var6), u.a(((cq) (var3)).field_x - 12, (byte) 94), true);
                        fe.c(((cq) (var3)).field_w, db.a(true, var6), u.a(((cq) (var3)).field_x + -12, (byte) 94), nd.field_b, true);
                        if (null == var4_ref) {
                            statePc = 88;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if ((this.field_l ^ -1) != (var4_ref.field_g ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var4_ref.field_e != ((cq) (var3)).field_k) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_89_0 = 1;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_89_0 = 0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var7 = stackIn_89_0;
                        if (var7 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        fe.b(qf.field_a, db.a(true, ((cq) (var3)).field_y), u.a(10 + ((cq) (var3)).field_x, (byte) 94), true);
                        fe.c(qf.field_a, db.a(true, ((cq) (var3)).field_y), u.a(((cq) (var3)).field_x - -10, (byte) 94), nd.field_b, true);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (this.field_u == var3) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        ub.a((byte) 127, im.field_v[1]);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        this.field_u = (cq) (var3);
                        stackIn_96_0 = -2;
                        stackIn_96_1 = this.field_a ^ -1;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (stackIn_96_0 != stackIn_96_1) {
                            statePc = 105;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (this.field_b != null) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        this.c(param0 + 25772);
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 104: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) var2_ref), "cv.O(" + param0 + ')');
                }
                case 105: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, byte param1) {
        cq discarded$0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sl var10_ref_sl = null;
        RuntimeException var10_ref_RuntimeException = null;
        cq var11 = null;
        cf var11_ref = null;
        om var12 = null;
        cq var12_ref = null;
        int var13_int = 0;
        tc var13 = null;
        String var14 = null;
        wk var15 = null;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = ArmiesOfGielinor.field_M ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_a = param0;
                        var10 = this.field_a;
                        if (0 != var10) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var16 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var10 != 1) {
                            statePc = 46;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var16 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4 = 50;
                        var3_int = 200;
                        var6 = 150;
                        var5 = -(var3_int / 2) + so.field_b.field_a / 2;
                        var6 = 90;
                        var4 = 56;
                        var3_int = 278;
                        var5 = 45;
                        var7 = var5;
                        if (this.field_g != null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.a(false);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8 = var6;
                        var9 = 10;
                        this.field_g.c((byte) -124);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10_ref_sl = ku.j(84);
                        if (var10_ref_sl != null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var11 = new cq(-1, be.field_A);
                        var11.field_B = 278;
                        var11.field_x = 341;
                        var11.field_o = 57;
                        var11.field_y = 45;
                        var12 = ar.a(var10_ref_sl.field_g, var10_ref_sl.field_e, 0);
                        var13_int = ha.a(var12.field_B.length, var10_ref_sl.field_c, false);
                        var14 = fo.a(4800, wd.field_e, new String[]{var12.field_J, Integer.toString(var13_int)});
                        var11.field_w = var12.field_G.field_k;
                        var11.field_l = true;
                        var11.field_p = var12;
                        var11.field_D = var12.field_G.field_s;
                        var11.field_r = var14;
                        var11.field_q = var12.field_n;
                        if (var12.field_G.c((byte) -45)) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!rf.a(27875)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11.field_l = false;
                        var11.field_r = bn.field_g + " (" + var11.field_r + ")";
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var15 = this.a(var12, var10_ref_sl, 200, 1, 200);
                        var11.field_m = var15;
                        this.field_g.a(var11, (long)var11.field_k, 82);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var10_ref_RuntimeException = (RuntimeException) ((Object) caughtException);
                        af.a((Throwable) ((Object) var10_ref_RuntimeException), 93, "Error reading quicksave map.");
                        qh.b((byte) 27);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var10 >= 3) {
                            statePc = 39;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var11_ref = br.a(var10, (byte) -12);
                        if (var16 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var11_ref == null) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var12_ref = this.a(true, var11_ref);
                        if (var16 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var12_ref = new cq(var10, (String) null);
                        var12_ref.field_l = false;
                        var13 = this.field_g.a(-89, (long)var12_ref.field_k);
                        if (null == var13) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var13.d(param1 + 14);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_g.a(var12_ref, (long)var12_ref.field_k, 105);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var12_ref.field_o = var4;
                        var12_ref.field_B = var3_int;
                        var12_ref.field_y = var7;
                        var12_ref.field_x = var8;
                        var8 = var8 + (var4 - -var9);
                        var10++;
                        if (var16 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (this.field_d != null) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_d = (cq) ((Object) this.field_g.a(-19, (long)this.field_d.field_k));
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        bv.a(true, 21, 1, 0);
                        if (var16 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        bv.a(true, 22, 1, 21);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (param1 == 42) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        discarded$0 = this.a(122, 13);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.b(78);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ig.a((Throwable) ((Object) var3), "cv.T(" + param0 + ',' + param1 + ')');
                }
                case 52: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_v = "This password contains repeated characters, and would be easy to guess";
        field_m = "<%0>'s game";
        field_q = "Message game";
        field_n = "Report abuse";
        field_k = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_r = "Please enter a year between <%0> and <%1>";
    }
}
