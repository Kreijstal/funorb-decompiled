/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cj extends vc {
    private jg field_Z;
    private jg field_hb;
    private jg field_lb;
    private jg field_gb;
    static vh field_V;
    private jg field_kb;
    static String field_U;
    private jg field_db;
    private jg field_W;
    jg field_mb;
    jg field_rb;
    private jg field_ab;
    static boolean[] field_fb;
    private jg field_jb;
    private jg field_cb;
    private jg field_qb;
    private jg field_ib;
    static int field_eb;
    private jg field_Y;
    private jg field_R;
    private jg field_X;
    private jg field_T;
    static String[] field_ob;
    jg field_S;
    private jg field_pb;
    private jg field_sb;
    private jg field_nb;
    jg field_bb;
    private jg field_Q;

    final void c(boolean param0) {
        ((cj) this).field_l = sa.field_g;
        ((cj) this).field_G = 17;
        ((cj) this).field_H = 0;
        de.field_g = param0 ? true : false;
    }

    final static StringBuilder a(char param0, int param1, int param2, StringBuilder param3) {
        int var5 = 0;
        if (param2 != -2790) {
            return null;
        }
        int var4 = param3.length();
        param3.setLength(param1);
        for (var5 = var4; param1 > var5; var5++) {
            param3.setCharAt(var5, param0);
        }
        return param3;
    }

    final void b(int param0, di param1) {
        if (param0 != 5) {
            ((cj) this).field_gb = null;
        }
        ((cj) this).field_B = new dd(param1.a(false, "tiki-sky.jpg", ""), (java.awt.Component) (Object) pa.field_K);
    }

    final void a(int param0, uf param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Pool.field_O;
          super.a(param0, param1);
          if (-1 != (ln.field_t ^ -1)) {
            break L0;
          } else {
            tl.field_N.a(true, -1);
            break L0;
          }
        }
        L1: {
          if (500 > ln.field_t) {
            ((cj) this).a(128, 50, (byte) 71, new jg[4], mc.field_j);
            if (ga.a(400, true, ea.field_r) == 0) {
              this.c(-4577, 32);
              break L1;
            } else {
              break L1;
            }
          } else {
            if ((ln.field_t ^ -1) != -501) {
              if (ln.field_t < 2000) {
                L2: {
                  var3 = (128 * ln.field_t + -64000) / 1500;
                  ((cj) this).a(128 - var3 * 7 / 8, 50, (byte) 34, new jg[4], mc.field_j);
                  if (ga.a(800, true, ea.field_r) != 0) {
                    break L2;
                  } else {
                    this.c(-4577, 128 + -(7 * var3 / 8) >> -176862814);
                    break L2;
                  }
                }
                tl.field_N.a((byte) 77, -1, var3);
                break L1;
              } else {
                if (ln.field_t < 11200) {
                  ((cj) this).a(8, 50, (byte) -101, new jg[4], mc.field_j);
                  break L1;
                } else {
                  if (-12201 >= (ln.field_t ^ -1)) {
                    if (-12201 == (ln.field_t ^ -1)) {
                      tl.field_N.e(-1);
                      break L1;
                    } else {
                      ln.field_t = -1;
                      break L1;
                    }
                  } else {
                    L3: {
                      var3 = 128 * (12200 - ln.field_t) / 1000;
                      ((cj) this).a(128 + -(7 * var3 / 8), 50, (byte) -126, new jg[4], mc.field_j);
                      if (-1 != (ga.a(800, true, ea.field_r) ^ -1)) {
                        break L3;
                      } else {
                        this.c(-4577, 128 + -(var3 * 7 / 8) >> 201851170);
                        break L3;
                      }
                    }
                    tl.field_N.a((byte) 32, -1, var3);
                    break L1;
                  }
                }
              }
            } else {
              tl.field_N.a((byte) 88, -1, 1);
              ij.field_u = ((cj) this).field_b;
              tl.field_N.a(((cj) this).field_b, true, (byte) -14, true);
              break L1;
            }
          }
        }
        ln.field_t = ln.field_t + 1;
    }

    final void a(di param0, int param1) {
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
        eg[] var14 = null;
        int var15 = 0;
        eg[] var16 = null;
        eg var17 = null;
        eg[] var19 = null;
        int[] var20 = null;
        eg var21 = null;
        int var22 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        L0: {
          var22 = Pool.field_O;
          ((cj) this).field_O = new eg[22];
          var3 = 0;
          ml.field_j = var3;
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_extra_1");
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_extra_2");
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_extra_3");
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_extra_4");
          kp.field_f = var3;
          nf.field_T = var3;
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_totnew");
          hr.field_t = var3;
          mn.field_a = var3;
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_steps_extend");
          ec.field_c = var3;
          gk.field_ib = var3;
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_leg_a");
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_leg_b");
          qf.field_i = var3;
          im.field_Wb = var3;
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_block_a");
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_block_b");
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_block_c");
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_block_d");
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_block_e");
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_block_f");
          or.field_h = var3;
          vh.field_L = var3;
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_hole_a");
          sg.field_S = var3;
          mm.field_i = var3;
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_hole_b");
          nd.field_l = var3;
          nm.field_e = var3;
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_corner");
          var3++;
          ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_side_a");
          if (param1 <= -43) {
            break L0;
          } else {
            ((cj) this).field_Z = null;
            break L0;
          }
        }
        var3++;
        ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_side_b");
        var3++;
        ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_side_c");
        ka.field_q = var3;
        ca.field_h = var3;
        var3++;
        ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_top_a");
        var3++;
        ((cj) this).field_O[var3] = eg.a(param0, "", "tiki_table/tiki_top_b");
        om.field_x = var3;
        ((cj) this).field_A = new jk();
        ((cj) this).field_A.a(eg.a(param0, "", "cues/jungle_cue"), (byte) -115);
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((cj) this).field_O.length) {
            var5 = 2147483647;
            var6 = -2147483648;
            var7 = 2147483647;
            var8 = -2147483648;
            var9 = 2147483647;
            var10 = -2147483648;
            var4 = ka.field_q;
            L2: while (true) {
              if (om.field_x <= var4) {
                var7 = -var8 + var7 * 2;
                var5 = -var6 + var5 * 2;
                var11 = (var6 + var5) / 2;
                var12 = (var7 + var8) / 2;
                var13 = var10;
                var4 = 0;
                L3: while (true) {
                  if (((cj) this).field_O.length <= var4) {
                    ((cj) this).field_M = new int[((cj) this).field_O.length][3];
                    var4 = 0;
                    L4: while (true) {
                      if (((cj) this).field_O.length <= var4) {
                        var14 = new eg[4];
                        var4 = mn.field_a;
                        L5: while (true) {
                          if (gk.field_ib <= var4) {
                            return;
                          } else {
                            var15 = var4;
                            var16 = var14;
                            var17 = ((cj) this).field_O[var15];
                            var38 = ((cj) this).field_M[var15];
                            var19 = var16;
                            var21 = a.a(true, new eg(var17, false, false, false, false));
                            var39 = mj.a(-31121);
                            var34 = var39;
                            var29 = var34;
                            var24 = var29;
                            var20 = var24;
                            var20[1] = var38[1] + 0;
                            var20[0] = var38[0] - 0;
                            var20[2] = 0 + var38[2];
                            var19[0] = new eg(var17, false, false, false, false);
                            var19[0].a(var39);
                            var40 = mj.a(-31121);
                            var35 = var40;
                            var30 = var35;
                            var25 = var30;
                            var20 = var25;
                            var20[2] = var38[2] - 0;
                            var20[0] = 0 + var38[0];
                            var20[1] = -(var38[1] + 0);
                            var19[1] = new eg(var21, false, false, false, false);
                            var19[1].a(var40);
                            var41 = mj.a(-31121);
                            var36 = var41;
                            var31 = var36;
                            var26 = var31;
                            var20 = var26;
                            var20[0] = 0 + var38[0];
                            var20[2] = 0 + var38[2];
                            var20[1] = 0 + var38[1];
                            int[] discarded$3 = dq.a((byte) -121, var41);
                            var19[2] = new eg(var17, false, false, false, false);
                            var19[2].a(var41);
                            var42 = mj.a(-31121);
                            var37 = var42;
                            var32 = var37;
                            var27 = var32;
                            var20 = var27;
                            var20[0] = 0 + var38[0];
                            var20[2] = 0 + var38[2];
                            var20[1] = -(var38[1] - 0);
                            int[] discarded$4 = dq.a((byte) 50, var42);
                            var19[3] = new eg(var21, false, false, false, false);
                            var19[3].a(var42);
                            ((cj) this).field_O[var4] = new eg(var14, 4);
                            ((cj) this).field_O[var4].a(1, 1, 1, 2);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        if (((cj) this).field_O[var4] != null) {
                          ln.a(((cj) this).field_M[var4], 0, ((cj) this).field_O[var4]);
                          var4++;
                          continue L4;
                        } else {
                          var4++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    if (null != ((cj) this).field_O[var4]) {
                      eg discarded$5 = cq.a(var11, 90, var13, ((cj) this).field_O[var4], var12);
                      var4++;
                      continue L3;
                    } else {
                      var4++;
                      continue L3;
                    }
                  }
                }
              } else {
                L6: {
                  d.a(((cj) this).field_O[var4], -23109);
                  if (((cj) this).field_O[var4].field_S <= var8) {
                    break L6;
                  } else {
                    var8 = ((cj) this).field_O[var4].field_S;
                    break L6;
                  }
                }
                L7: {
                  if (((cj) this).field_O[var4].field_y < var7) {
                    var7 = ((cj) this).field_O[var4].field_y;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var9 <= ((cj) this).field_O[var4].field_V) {
                    break L8;
                  } else {
                    var9 = ((cj) this).field_O[var4].field_V;
                    break L8;
                  }
                }
                L9: {
                  if (((cj) this).field_O[var4].field_x <= var10) {
                    break L9;
                  } else {
                    var10 = ((cj) this).field_O[var4].field_x;
                    break L9;
                  }
                }
                L10: {
                  if (var6 < ((cj) this).field_O[var4].field_w) {
                    var6 = ((cj) this).field_O[var4].field_w;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (((cj) this).field_O[var4].field_D < var5) {
                  var5 = ((cj) this).field_O[var4].field_D;
                  var4++;
                  continue L2;
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            db.a(0, ((cj) this).field_O[var4]);
            var4++;
            continue L1;
          }
        }
    }

    private final void a(int[] param0, ko[] param1, eg param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        eg var8 = null;
        eg var9 = null;
        int var10 = 0;
        eg var11 = null;
        var11 = param2;
        var10 = Pool.field_O;
        var5 = param2.field_V + param0[2];
        var6 = param2.field_x + param0[2];
        var7 = 0;
        if (param3 <= -110) {
          L0: while (true) {
            L1: {
              if (jd.field_h.length <= var7) {
                break L1;
              } else {
                Runtime.getRuntime().gc();
                if (jd.field_h[var7] > var6) {
                  System.out.println("Model before the cloudline " + jd.field_h[var7]);
                  param1[var7].b((byte) -100, (ma) (Object) new pm(hc.a(var11, param0, (byte) 101)));
                  param2 = null;
                  break L1;
                } else {
                  if (jd.field_h[var7] < var6) {
                    if (jd.field_h[var7] > var5) {
                      L2: {
                        var8 = hq.b((byte) 125);
                        var9 = hq.b((byte) 127);
                        ej.a(0, var9, 0, false, jd.field_h[var7] - param0[2], 0, 0, 1, var8, var11);
                        if (-1 > (var9.field_K ^ -1)) {
                          var9.a();
                          var9.e();
                          param1[var7].b((byte) 106, (ma) (Object) new pm(hc.a(var9, param0, (byte) 101)));
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var8.a();
                      var11 = var8;
                      var8.e();
                      if (0 == var11.field_K) {
                        break L1;
                      } else {
                        var7++;
                        continue L0;
                      }
                    } else {
                      var7++;
                      continue L0;
                    }
                  } else {
                    var7++;
                    continue L0;
                  }
                }
              }
            }
            L3: {
              if (param2 == null) {
                break L3;
              } else {
                if (param2.field_K > 0) {
                  param1[param1.length + -1].b((byte) -95, (ma) (Object) new pm(hc.a(param2, param0, (byte) 101)));
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          var5 = 95 % ((param2 - -44) / 56);
          var6 = param0;
          if (5 != var6) {
            if (2 != var6) {
              if (-4 == (var6 ^ -1)) {
                kf discarded$9 = kp.a(100, ((cj) this).field_S, param3, param1);
                break L0;
              } else {
                if (0 == var6) {
                  kf discarded$10 = kp.a(100, ((cj) this).field_rb, param3, param1);
                  break L0;
                } else {
                  if ((var6 ^ -1) == -2) {
                    kf discarded$11 = kp.a(100, ((cj) this).field_mb, param3, param1);
                    break L0;
                  } else {
                    if ((var6 ^ -1) == -7) {
                      kf discarded$12 = kp.a(100, ((cj) this).field_W, param3, param1);
                      System.out.println("playing respot the white");
                      break L0;
                    } else {
                      if ((var6 ^ -1) != -5) {
                        if (var6 != 10) {
                          super.a(param0, param1, (byte) -102, param3);
                          break L0;
                        } else {
                          break L0;
                        }
                      } else {
                        kf discarded$13 = kp.a(100, ((cj) this).field_sb, param3, param1);
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              kf discarded$14 = kp.a(100, ((cj) this).field_bb, param3, param1);
              break L0;
            }
          } else {
            var6 = ga.a(3, true, ea.field_r);
            if (var6 != 0) {
              if (var6 != 1) {
                if ((var6 ^ -1) == -3) {
                  kf discarded$15 = kp.a(100, ((cj) this).field_jb, param3, param1);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                kf discarded$16 = kp.a(100, ((cj) this).field_ib, param3, param1);
                break L0;
              }
            } else {
              kf discarded$17 = kp.a(100, ((cj) this).field_Q, param3, param1);
              break L0;
            }
          }
        }
    }

    final void d(boolean param0) {
        super.d(param0);
        pr.c((byte) 90);
    }

    final void c(int param0, di param1) {
        if (param0 != -23569) {
            ((cj) this).field_pb = null;
        }
    }

    final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ko[] var7 = null;
        eg var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        L0: {
          var10 = Pool.field_O;
          if (-1 != (((cj) this).field_H ^ -1)) {
            break L0;
          } else {
            ln.field_u = null;
            var2 = 500;
            jd.field_h = new int[]{var2, var2 - -50, 100 + var2, 200 + var2};
            sg.field_K = 1 + jd.field_h.length;
            ck.field_Y = new ko[sg.field_K];
            var3 = 0;
            L1: while (true) {
              if (sg.field_K <= var3) {
                kj.field_m = 80;
                hf.field_a = 4000;
                break L0;
              } else {
                ck.field_Y[var3] = new ko();
                var3++;
                continue L1;
              }
            }
          }
        }
        L2: {
          var2 = ml.field_j;
          var3 = 1 + ml.field_j;
          var4 = ml.field_j - -2;
          var5 = ml.field_j - -3;
          var6 = nf.field_T;
          var9 = ((cj) this).field_H;
          if ((var9 ^ -1) != -2) {
            if (var9 == 2) {
              kj.field_m = kj.field_m - 150;
              this.a(ck.field_Y, kj.field_m - 150, (byte) 103, ((cj) this).field_O[var4], 0, hf.field_a);
              break L2;
            } else {
              if (3 == var9) {
                kj.field_m = kj.field_m - 170;
                this.a(ck.field_Y, kj.field_m - 170, (byte) 124, ((cj) this).field_O[var2], 0, hf.field_a);
                break L2;
              } else {
                if (4 != var9) {
                  if (var9 != -6) {
                    if (6 != var9) {
                      if (-8 != var9) {
                        if (8 == var9) {
                          kj.field_m = kj.field_m - 45;
                          this.a(ck.field_Y, kj.field_m - 45, (byte) 111, ((cj) this).field_O[var4], 800, hf.field_a + 600);
                          break L2;
                        } else {
                          if (var9 == -10) {
                            kj.field_m = kj.field_m - 130;
                            this.a(ck.field_Y, kj.field_m - 130, (byte) 110, ((cj) this).field_O[var3], 968, -700 + hf.field_a);
                            break L2;
                          } else {
                            if (-11 != var9) {
                              if (var9 == 11) {
                                kj.field_m = kj.field_m - 80;
                                this.a(ck.field_Y, kj.field_m - 80, (byte) 109, ((cj) this).field_O[var2], 0, hf.field_a);
                                break L2;
                              } else {
                                if (12 == var9) {
                                  var8 = ((cj) this).field_O[var5];
                                  var7 = ck.field_Y;
                                  kj.field_m = -1536;
                                  this.a(var7, -1536, (byte) 82, var8, 0, -400 + hf.field_a);
                                  break L2;
                                } else {
                                  if (var9 == 13) {
                                    kj.field_m = kj.field_m - 200;
                                    this.a(ck.field_Y, kj.field_m - 200, (byte) 125, ((cj) this).field_O[var4], 0, hf.field_a + -200);
                                    break L2;
                                  } else {
                                    if ((var9 ^ -1) == -15) {
                                      kj.field_m = kj.field_m - 125;
                                      this.a(ck.field_Y, kj.field_m - 125, (byte) 98, ((cj) this).field_O[var6], 0, hf.field_a);
                                      ((cj) this).field_l = mn.field_d;
                                      break L2;
                                    } else {
                                      if (15 == var9) {
                                        this.n(param0 + 6);
                                        break L2;
                                      } else {
                                        if ((var9 ^ -1) == -17) {
                                          this.o(-16);
                                          break L2;
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              kj.field_m = kj.field_m - 170;
                              this.a(ck.field_Y, kj.field_m - 170, (byte) 71, ((cj) this).field_O[var6], 0, hf.field_a + -700);
                              break L2;
                            }
                          }
                        }
                      } else {
                        kj.field_m = kj.field_m - 170;
                        this.a(ck.field_Y, kj.field_m - 170, (byte) 80, ((cj) this).field_O[var6], 0, hf.field_a);
                        break L2;
                      }
                    } else {
                      kj.field_m = kj.field_m - 170;
                      this.a(ck.field_Y, kj.field_m - 170, (byte) 107, ((cj) this).field_O[var5], 0, hf.field_a);
                      break L2;
                    }
                  } else {
                    kj.field_m = kj.field_m - 50;
                    this.a(ck.field_Y, kj.field_m - 50, (byte) 108, ((cj) this).field_O[var3], 0, hf.field_a + -50);
                    break L2;
                  }
                } else {
                  kj.field_m = kj.field_m - 100;
                  this.a(ck.field_Y, kj.field_m - 100, (byte) 109, ((cj) this).field_O[var6], 0, hf.field_a - -500);
                  break L2;
                }
              }
            }
          } else {
            this.a(ck.field_Y, 80, (byte) 80, ((cj) this).field_O[var3], 0, hf.field_a + -500);
            break L2;
          }
        }
        L3: {
          if (param0 == 2) {
            break L3;
          } else {
            var11 = null;
            StringBuilder discarded$1 = cj.a('', -105, -71, (StringBuilder) null);
            break L3;
          }
        }
        ((cj) this).field_H = ((cj) this).field_H + 1;
    }

    final static tc a(int param0, int param1, int param2) {
        tc var3 = w.a(false, param1);
        if (param2 != 0) {
            field_U = null;
        }
        var3.field_e = new int[param0];
        return var3;
    }

    final static boolean e(byte param0) {
        if (param0 != 85) {
            Object var2 = null;
            StringBuilder discarded$0 = cj.a('ￅ', -57, 7, (StringBuilder) null);
        }
        return (ve.field_m ^ -1L) == (em.field_L.field_Zb ^ -1L) ? true : false;
    }

    private final void a(ko[] param0, int param1, byte param2, eg param3, int param4, int param5) {
        param3 = new eg(param3, false, false, false, false);
        int var7 = param5 * hc.a(2047, param1) >> -1056869264;
        int var8 = param5 * ao.a(param1, true) >> -1320728048;
        param1 = param1 + param4;
        param3.a(new int[12]);
        param3.e();
        if (param2 < 68) {
            ((cj) this).d(false);
        }
        this.a(new int[3], param0, param3, -123);
    }

    public static void m(int param0) {
        field_U = null;
        field_fb = null;
        field_ob = null;
        field_V = null;
        if (param0 <= 90) {
            cj.a(88, 124, 23, -78, -57);
        }
    }

    final void a(byte param0, uf param1) {
        pq[] var3 = null;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        so var19 = null;
        pq[] var21 = null;
        so var22 = null;
        so var24 = null;
        so var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        Object stackIn_52_0 = null;
        int[] stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        pq[] stackIn_52_4 = null;
        Object stackIn_53_0 = null;
        int[] stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        pq[] stackIn_53_4 = null;
        Object stackIn_54_0 = null;
        int[] stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        pq[] stackIn_54_4 = null;
        int stackIn_54_5 = 0;
        Object stackOut_51_0 = null;
        int[] stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        pq[] stackOut_51_4 = null;
        Object stackOut_53_0 = null;
        int[] stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        pq[] stackOut_53_4 = null;
        int stackOut_53_5 = 0;
        Object stackOut_52_0 = null;
        int[] stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        pq[] stackOut_52_4 = null;
        int stackOut_52_5 = 0;
        L0: {
          var11 = Pool.field_O;
          var21 = param1.field_I.field_l;
          var3 = var21;
          var44 = f.a((byte) -119, param1.field_ab);
          var37 = var44;
          var30 = var37;
          var18 = var30;
          var4 = var18;
          var42 = var4;
          var35 = var42;
          var28 = var35;
          var16 = var28;
          var13 = var16;
          var5_ref_int__ = var13;
          oh.field_d[0] = var42[0] - sb.a(288.0f, true) >> 214782274;
          oh.field_d[1] = var42[1] + -sb.a(144.0f, true) >> 778474434;
          oh.field_d[2] = var42[2] >> 1709054754;
          if (var5_ref_int__ != oh.field_d) {
            oh.field_d[9] = var42[9];
            oh.field_d[5] = var42[5];
            oh.field_d[10] = var42[10];
            oh.field_d[6] = var42[6];
            oh.field_d[8] = var42[8];
            oh.field_d[7] = var42[7];
            oh.field_d[11] = var42[11];
            oh.field_d[3] = var42[3];
            oh.field_d[4] = var42[4];
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var43 = var4;
          var36 = var43;
          var29 = var36;
          var17 = var29;
          var14 = var17;
          var5_ref_int__ = var14;
          gr.field_w[0] = var43[0] - sb.a(288.0f, true) >> -1630635132;
          gr.field_w[1] = var43[1] - sb.a(144.0f, true) >> -1135636028;
          gr.field_w[2] = var43[2] >> 1585145732;
          if (gr.field_w != var5_ref_int__) {
            gr.field_w[7] = var43[7];
            gr.field_w[3] = var43[3];
            gr.field_w[10] = var43[10];
            gr.field_w[9] = var43[9];
            gr.field_w[8] = var43[8];
            gr.field_w[5] = var43[5];
            gr.field_w[4] = var43[4];
            gr.field_w[11] = var43[11];
            gr.field_w[6] = var43[6];
            break L1;
          } else {
            break L1;
          }
        }
        var4[1] = rb.b(var44[1], -4);
        var4[0] = rb.b(var44[0], -4);
        var4[2] = rb.b(var44[2], -4);
        ((cj) this).e(true);
        var5 = 0;
        L2: while (true) {
          if (ln.field_u.length <= var5) {
            ((cj) this).a(false, var44, var21);
            kf.a(ta.field_c, (byte) -104, pa.field_L, ph.field_g, cq.field_c);
            kf.a(am.field_h, (byte) -104, pa.field_L, ph.field_g, c.field_b);
            kf.a(gf.field_d, (byte) -104, pa.field_L, ph.field_g, hl.field_n);
            kf.a(cn.field_d, (byte) -104, pa.field_L, ph.field_g, oa.field_e);
            kf.a(wn.field_j, (byte) -104, pa.field_L, ph.field_g, ue.field_a);
            this.a(param1, 9291);
            pr.a(gr.field_w, false);
            this.a(256, 3, 256, (byte) -86);
            var6 = fb.field_b;
            var5 = ln.field_u.length + -1;
            L3: while (true) {
              if (1 >= var5) {
                L4: {
                  fb.field_b = dn.field_m[0];
                  if (param0 == -55) {
                    break L4;
                  } else {
                    var12 = null;
                    this.a((int[]) null, (ko[]) null, (eg) null, -92);
                    break L4;
                  }
                }
                L5: {
                  var24 = ln.field_u[1];
                  var47 = gr.field_w;
                  var24.a((byte) -115, 0, var24.field_j.length, var47);
                  if (-1L == (pd.field_i & 256L ^ -1L)) {
                    break L5;
                  } else {
                    ln.field_u[1].a(gr.field_w, 0);
                    break L5;
                  }
                }
                L6: {
                  fb.field_b = var6;
                  var26 = ln.field_u[0];
                  var48 = gr.field_w;
                  var26.a((byte) -98, 0, var26.field_j.length, var48);
                  if ((256L & pd.field_i) == 0L) {
                    break L6;
                  } else {
                    ln.field_u[0].a(gr.field_w, 0);
                    break L6;
                  }
                }
                if (-1L == (4194304L & pd.field_i ^ -1L)) {
                  var5 = -1 + ta.field_c;
                  L7: while (true) {
                    if (cq.field_c > var5) {
                      var5 = -1 + am.field_h;
                      L8: while (true) {
                        if (c.field_b > var5) {
                          var5 = gf.field_d + -1;
                          L9: while (true) {
                            if (var5 < hl.field_n) {
                              L10: {
                                if ((1073741824L & pd.field_i) != 0L) {
                                  break L10;
                                } else {
                                  ((cj) this).a(var44, (byte) 106, false, var21, false);
                                  break L10;
                                }
                              }
                              var5 = wn.field_j + -1;
                              L11: while (true) {
                                if (var5 < ue.field_a) {
                                  L12: {
                                    if ((pd.field_i & 1073741824L ^ -1L) == -1L) {
                                      var5 = 0;
                                      L13: while (true) {
                                        if (var21.length <= var5) {
                                          break L12;
                                        } else {
                                          if (var21[var5].field_s) {
                                            ((cj) this).a(var44, var21[var5]);
                                            var5++;
                                            continue L13;
                                          } else {
                                            var5++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                  var7 = oa.field_e;
                                  var8 = cn.field_d;
                                  var10 = var8 + -1;
                                  L14: while (true) {
                                    if (var7 > var10) {
                                      L15: {
                                        if (0L != (1073741824L & pd.field_i)) {
                                          break L15;
                                        } else {
                                          L16: {
                                            stackOut_51_0 = this;
                                            stackOut_51_1 = (int[]) var4;
                                            stackOut_51_2 = 102;
                                            stackOut_51_3 = 1;
                                            stackOut_51_4 = (pq[]) var3;
                                            stackIn_53_0 = stackOut_51_0;
                                            stackIn_53_1 = stackOut_51_1;
                                            stackIn_53_2 = stackOut_51_2;
                                            stackIn_53_3 = stackOut_51_3;
                                            stackIn_53_4 = stackOut_51_4;
                                            stackIn_52_0 = stackOut_51_0;
                                            stackIn_52_1 = stackOut_51_1;
                                            stackIn_52_2 = stackOut_51_2;
                                            stackIn_52_3 = stackOut_51_3;
                                            stackIn_52_4 = stackOut_51_4;
                                            if (param1.field_I.j(29).field_q != 0) {
                                              stackOut_53_0 = this;
                                              stackOut_53_1 = (int[]) (Object) stackIn_53_1;
                                              stackOut_53_2 = stackIn_53_2;
                                              stackOut_53_3 = stackIn_53_3;
                                              stackOut_53_4 = (pq[]) (Object) stackIn_53_4;
                                              stackOut_53_5 = 0;
                                              stackIn_54_0 = stackOut_53_0;
                                              stackIn_54_1 = stackOut_53_1;
                                              stackIn_54_2 = stackOut_53_2;
                                              stackIn_54_3 = stackOut_53_3;
                                              stackIn_54_4 = stackOut_53_4;
                                              stackIn_54_5 = stackOut_53_5;
                                              break L16;
                                            } else {
                                              stackOut_52_0 = this;
                                              stackOut_52_1 = (int[]) (Object) stackIn_52_1;
                                              stackOut_52_2 = stackIn_52_2;
                                              stackOut_52_3 = stackIn_52_3;
                                              stackOut_52_4 = (pq[]) (Object) stackIn_52_4;
                                              stackOut_52_5 = 1;
                                              stackIn_54_0 = stackOut_52_0;
                                              stackIn_54_1 = stackOut_52_1;
                                              stackIn_54_2 = stackOut_52_2;
                                              stackIn_54_3 = stackOut_52_3;
                                              stackIn_54_4 = stackOut_52_4;
                                              stackIn_54_5 = stackOut_52_5;
                                              break L16;
                                            }
                                          }
                                          ((cj) this).a(stackIn_54_1, (byte) stackIn_54_2, stackIn_54_3 != 0, stackIn_54_4, stackIn_54_5 != 0);
                                          break L15;
                                        }
                                      }
                                      var7 = oa.field_e;
                                      var8 = cn.field_d;
                                      var15 = -1 + var8;
                                      var10 = var15;
                                      L17: while (true) {
                                        if (var15 < var7) {
                                          L18: {
                                            if (-1L != (1073741824L & pd.field_i ^ -1L)) {
                                              break L18;
                                            } else {
                                              param1.q(-1);
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            if ((1073741824L & pd.field_i ^ -1L) == -1L) {
                                              param1.D(-125);
                                              break L19;
                                            } else {
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            if ((pd.field_i & 256L) != 0L) {
                                              var5 = 0;
                                              L21: while (true) {
                                                if (th.field_l.length <= var5) {
                                                  break L20;
                                                } else {
                                                  var5++;
                                                  continue L21;
                                                }
                                              }
                                            } else {
                                              break L20;
                                            }
                                          }
                                          return;
                                        } else {
                                          var9 = ph.field_g[var15];
                                          if (sh.field_Q[var9]) {
                                            th.field_l[var9].c(6710886, oh.field_d);
                                            var15--;
                                            continue L17;
                                          } else {
                                            var15--;
                                            continue L17;
                                          }
                                        }
                                      }
                                    } else {
                                      var9 = ph.field_g[var10];
                                      if (!sh.field_Q[var9]) {
                                        th.field_l[var9].c(param0 ^ -6710865, oh.field_d);
                                        var10--;
                                        continue L14;
                                      } else {
                                        var10--;
                                        continue L14;
                                      }
                                    }
                                  }
                                } else {
                                  th.field_l[ph.field_g[var5]].c(6710886, oh.field_d);
                                  var5--;
                                  continue L11;
                                }
                              }
                            } else {
                              th.field_l[ph.field_g[var5]].c(6710886, oh.field_d);
                              var5--;
                              continue L9;
                            }
                          }
                        } else {
                          th.field_l[ph.field_g[var5]].c(6710886, oh.field_d);
                          var5--;
                          continue L8;
                        }
                      }
                    } else {
                      th.field_l[ph.field_g[var5]].c(6710886, oh.field_d);
                      var5--;
                      continue L7;
                    }
                  }
                } else {
                  return;
                }
              } else {
                fb.field_b = dn.field_m[-1 + var5];
                var22 = ln.field_u[var5];
                var46 = gr.field_w;
                var22.a((byte) -122, 0, var22.field_j.length, var46);
                if (0L != (256L & pd.field_i)) {
                  ln.field_u[var5].a(gr.field_w, 0);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          } else {
            var19 = ln.field_u[var5];
            var45 = gr.field_w;
            var19.b((byte) 112, 0, var19.field_j.length, var45);
            var5++;
            continue L2;
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        if (fo.field_c[param1][0][0] != fo.field_c[param1][1][1]) {
            cj.a(fo.field_c[param1][0][1], fo.field_c[param1][1][1], 13421772, 0, param0);
        }
        int var5 = 64 % ((-24 - param3) / 59);
        if (fo.field_c[param1][1][0] != fo.field_c[param1][2][1]) {
            cj.a(fo.field_c[param1][1][1], fo.field_c[param1][2][1], 13421772, param0, param2);
        }
        if (fo.field_c[param1][3][1] != fo.field_c[param1][2][0]) {
            qh.c(0, fo.field_c[param1][2][1], qh.field_l, fo.field_c[param1][3][1] + -fo.field_c[param1][2][1], 13421772, param2);
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var5 = param4 - param3;
        int var6 = qh.field_j - qh.field_b;
        int var7 = param1 - param0;
        for (var8 = 0; var8 < var7; var8++) {
            qh.e(qh.field_b, param0 + var8, var6, param2, param3 + var8 * var5 / var7);
        }
    }

    final void a(int param0, di param1) {
        if (param0 != 1) {
            Object var4 = null;
            ((cj) this).a((al) null, 126);
        }
        ((cj) this).field_b = cg.a(param1, "", "pool_jungle");
        ((cj) this).field_i = cg.a(param1, "", "pool_jungle_win_jingle");
    }

    final void a(cf param0, int param1) {
        int var3 = 86 / ((param1 - 39) / 38);
        ((cj) this).field_bb = param0.a("jungle_ball_hard", true, "");
        jg discarded$0 = param0.a("jungle_ball_med", true, "");
        ((cj) this).field_S = param0.a("jungle_ball_soft", true, "");
        ((cj) this).field_rb = param0.a("jungle_cue_hard", true, "");
        ((cj) this).field_mb = param0.a("jungle_cue_soft", true, "");
        ((cj) this).field_sb = param0.a("jungle_pot", true, "");
        ((cj) this).field_W = param0.a("jungle_respot_the_white", true, "");
        ((cj) this).field_Q = param0.a("jungle_ball_cushion1", true, "");
        ((cj) this).field_ib = param0.a("jungle_ball_cushion2", true, "");
        ((cj) this).field_jb = param0.a("jungle_ball_cushion3", true, "");
        ((cj) this).field_db = param0.a("", "jungle_bg_bird1", (byte) 122);
        ((cj) this).field_nb = param0.a("", "jungle_bg_cricket1", (byte) 126);
        ((cj) this).field_kb = param0.a("", "jungle_bg_cricket2", (byte) 123);
        ((cj) this).field_pb = param0.a("", "jungle_bg_cricket3", (byte) 123);
        ((cj) this).field_T = param0.a("", "jungle_bg_frog1", (byte) 127);
        ((cj) this).field_Z = param0.a("", "jungle_bg_snake1", (byte) 125);
        ((cj) this).field_ab = param0.a("", "jungle_bg_snake2", (byte) 124);
        ((cj) this).field_X = param0.a("jungle_monkey1", true, "");
        ((cj) this).field_cb = param0.a("jungle_monkey2", true, "");
        ((cj) this).field_Y = param0.a("jungle_monkey3", true, "");
        ((cj) this).field_gb = param0.a("jungle_monkey4", true, "");
        ((cj) this).field_R = param0.a("", "jungle_bg_wind1", (byte) 122);
        ((cj) this).field_hb = param0.a("", "jungle_bg_wind2", (byte) 123);
        ((cj) this).field_lb = param0.a("", "jungle_bg_wind3", (byte) 121);
        ((cj) this).field_qb = param0.a("", "jungle_bg_wind4", (byte) 124);
    }

    private final void n(int param0) {
        int var2 = 0;
        ko[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var8 = Pool.field_O;
        var3 = new ko[sg.field_K];
        var4 = 0;
        L0: while (true) {
          if (var4 >= sg.field_K) {
            var4 = 0;
            var2 = ec.field_c;
            if (param0 == 8) {
              L1: while (true) {
                if (var2 >= im.field_Wb) {
                  var4 = var4 >> 2;
                  var9 = mn.field_a;
                  var2 = var9;
                  L2: while (true) {
                    if (var9 >= gk.field_ib) {
                      dn.field_m = new int[sg.field_K][];
                      ln.field_u = new so[sg.field_K];
                      ah.field_e = new so[sg.field_K];
                      var5 = 0;
                      L3: while (true) {
                        if (sg.field_K <= var5) {
                          return;
                        } else {
                          var6 = 63 - -(var5 * 192 / sg.field_K);
                          var7 = 128;
                          dn.field_m[var5] = tq.a(md.a(var7, md.a(var7 << -1862470384, var7 << -1749026104)), var6, false);
                          ah.field_e[var5] = new so();
                          ah.field_e[var5].a((byte) -112, var3[var5]);
                          ck.field_Y[var5].b((byte) -52, (ma) (Object) new pm(ah.field_e[var5]));
                          ln.field_u[var5] = new so();
                          ln.field_u[var5].a((byte) -121, ck.field_Y[var5]);
                          ln.field_u[var5].a(0);
                          ln.field_u[var5].a(((cj) this).field_q, ((cj) this).field_e, ((cj) this).field_F, (byte) -35, ((cj) this).field_u, ((cj) this).field_C);
                          ln.field_u[var5].d(105);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      ((cj) this).field_O[var9].e();
                      var5 = -((cj) this).field_O[var9].field_V + var4;
                      this.a(new int[3], var3, ((cj) this).field_O[var9], -116);
                      var4 = ((cj) this).field_O[var9].field_x + var5;
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  ((cj) this).field_O[var2].e();
                  var5 = ((cj) this).field_O[var2].field_x + ((cj) this).field_M[var2][2];
                  if (var5 > var4) {
                    var4 = var5;
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            var3[var4] = new ko();
            var4++;
            continue L0;
          }
        }
    }

    final void i(int param0) {
        super.i(param0);
        ((cj) this).field_v = 5609813;
    }

    private final void a(uf param0, int param1) {
        int var8 = 0;
        int var9 = Pool.field_O;
        int var3 = param0.field_eb.b(param1 + -9419);
        if (param1 != 9291) {
            return;
        }
        qh.d(0, var3, 640, -var3 + 480, ((cj) this).field_v, 16128);
        int var4 = ((cj) this).field_B.field_z << -451146655;
        int var5 = ((cj) this).field_B.field_A << 713868001;
        int var6 = (int)(-param0.field_eb.a(true) * (double)var4 / 2.0 / 3.141592653589793);
        int var7 = -200 + var3;
        if (!(0 >= var7)) {
            qh.f(0, 0, 640, var7, ((cj) this).field_B.field_D[0]);
        }
        ((cj) this).field_B.c(var6 + -var4, var7, var4, var5);
        for (var8 = ((cj) this).field_B.field_A + var7; var8 < qh.field_g; var8++) {
            ((cj) this).field_B.d(((cj) this).field_B.field_A - 1, -var4 + var6, var8);
        }
        if (-640 + ((cj) this).field_B.field_z > var6 >> 837987760) {
            ((cj) this).field_B.c(var6, var7, var4, var5);
        }
    }

    final int h(int param0) {
        if (param0 != 684) {
            ((cj) this).field_kb = null;
        }
        return 11184810;
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        jg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var7 = Pool.field_O;
          if (param0 == -4577) {
            break L0;
          } else {
            cj.a(-42, 63, -74, 109, -107);
            break L0;
          }
        }
        var3 = 2;
        L1: while (true) {
          if (var3 >= mc.field_j.length) {
            return;
          } else {
            L2: {
              L3: {
                if (null == mc.field_j[var3]) {
                  break L3;
                } else {
                  if (mc.field_j[var3].field_o.i()) {
                    break L3;
                  } else {
                    if (!mc.field_j[var3].field_o.b(param0 ^ 4492)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (mc.field_j[var3] == null) {
                  stackOut_10_0 = 11;
                  stackIn_11_0 = stackOut_10_0;
                  break L4;
                } else {
                  stackOut_9_0 = 22;
                  stackIn_11_0 = stackOut_9_0;
                  break L4;
                }
              }
              var4 = ga.a(stackIn_11_0, true, ea.field_r);
              var6 = var4;
              if (var6 == 0) {
                mc.field_j[var3] = mn.a(-24296, nb.a(((cj) this).field_db, 100, param1, ga.a(128, true, ea.field_r)));
                break L2;
              } else {
                if (var6 != 1) {
                  if (2 == var6) {
                    mc.field_j[var3] = mn.a(-24296, nb.a(((cj) this).field_kb, 100, param1, ga.a(128, true, ea.field_r)));
                    break L2;
                  } else {
                    if (var6 != 3) {
                      if (4 != var6) {
                        if (var6 == -6) {
                          mc.field_j[var3] = mn.a(-24296, nb.a(((cj) this).field_Z, 100, param1, ga.a(128, true, ea.field_r)));
                          break L2;
                        } else {
                          if (-7 != var6) {
                            if (var6 != 7) {
                              if (-9 != var6) {
                                if (-10 != var6) {
                                  if (-11 == (var6 ^ -1)) {
                                    mc.field_j[var3] = rq.a(126, nb.a(((cj) this).field_gb, 100, param1, ga.a(128, true, ea.field_r)));
                                    break L2;
                                  } else {
                                    L5: {
                                      var5 = (jg) (Object) mc.field_j[var3].field_o.field_n;
                                      if (var5 == ((cj) this).field_X) {
                                        break L5;
                                      } else {
                                        if (((cj) this).field_cb == var5) {
                                          break L5;
                                        } else {
                                          if (var5 == ((cj) this).field_Y) {
                                            break L5;
                                          } else {
                                            if (((cj) this).field_gb == var5) {
                                              break L5;
                                            } else {
                                              mc.field_j[var3] = mn.a(-24296, nb.a(var5, 100, param1, ga.a(128, true, ea.field_r)));
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    mc.field_j[var3] = rq.a(126, nb.a(var5, 100, param1, ga.a(128, true, ea.field_r)));
                                    break L2;
                                  }
                                } else {
                                  mc.field_j[var3] = rq.a(101, nb.a(((cj) this).field_Y, 100, param1, ga.a(128, true, ea.field_r)));
                                  break L2;
                                }
                              } else {
                                mc.field_j[var3] = rq.a(124, nb.a(((cj) this).field_cb, 100, param1, ga.a(128, true, ea.field_r)));
                                break L2;
                              }
                            } else {
                              mc.field_j[var3] = rq.a(126, nb.a(((cj) this).field_X, 100, param1, ga.a(128, true, ea.field_r)));
                              break L2;
                            }
                          } else {
                            mc.field_j[var3] = mn.a(param0 + -19719, nb.a(((cj) this).field_ab, 100, param1, ga.a(128, true, ea.field_r)));
                            break L2;
                          }
                        }
                      } else {
                        mc.field_j[var3] = mn.a(param0 + -19719, nb.a(((cj) this).field_T, 100, param1, ga.a(128, true, ea.field_r)));
                        break L2;
                      }
                    } else {
                      mc.field_j[var3] = mn.a(cq.a(param0, 20231), nb.a(((cj) this).field_pb, 100, param1, ga.a(128, true, ea.field_r)));
                      break L2;
                    }
                  }
                } else {
                  mc.field_j[var3] = mn.a(-24296, nb.a(((cj) this).field_nb, 100, param1, ga.a(128, true, ea.field_r)));
                  break L2;
                }
              }
            }
            var3++;
            continue L1;
          }
        }
    }

    final void a(boolean param0, mm param1) {
        int var7 = Pool.field_O;
        if (param1.field_m >= 0.0) {
            // ifge L49
            param1.field_m = 288.0;
        } else {
            param1.field_m = 0.0;
        }
        if (param1.field_f >= 0.0) {
            // ifge L93
            param1.field_f = 576.0;
        } else {
            param1.field_f = 0.0;
        }
        if (param0) {
            Object var8 = null;
            ((cj) this).a((al) null, 35);
        }
        double var3 = param1.d(8);
        double var5 = (4194304L & pd.field_i ^ -1L) == -1L ? 2048.0 : 12000.0;
        if (!(var3 <= var5)) {
            param1.field_d = param1.field_f + var5 * (param1.field_d - param1.field_f) / var3;
            param1.field_h = param1.field_k + var5 * (param1.field_h - param1.field_k) / var3;
            param1.field_a = param1.field_m + (param1.field_a - param1.field_m) * var5 / var3;
        }
    }

    final void a(al param0, int param1) {
        super.a(param0, param1);
        jo.a(0.8999999761581421f, 1.0f, 0.8999999761581421f, 0.0833333358168602f, -31792);
        ln.field_t = 0;
    }

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        p[] var9 = null;
        p[] var10 = null;
        p[] var11 = null;
        p[] var12 = null;
        p[] var13 = null;
        p[] var14 = null;
        L0: {
          var7 = Pool.field_O;
          th.field_l = new p[-sg.field_S - -nd.field_l + (mn.field_a + -gk.field_ib + (-hr.field_t + nf.field_T) + (((cj) this).field_O.length + -kp.field_f + (ml.field_j - ec.field_c))) - (-im.field_Wb - vh.field_L + (qf.field_i - 3 * (-ka.field_q + om.field_x)) + (-((-or.field_h + mm.field_i) * 3) + -(3 * (ca.field_h - nm.field_e))))];
          var3 = 0;
          cq.field_c = var3;
          var2 = ec.field_c;
          if (param0 <= -11) {
            break L0;
          } else {
            var8 = null;
            ((cj) this).a((byte) 7, (uf) null);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= im.field_Wb) {
            c.field_b = var3;
            ta.field_c = var3;
            var2 = qf.field_i;
            L2: while (true) {
              if (vh.field_L <= var2) {
                ue.field_a = var3;
                am.field_h = var3;
                var2 = ka.field_q;
                L3: while (true) {
                  if (var2 >= om.field_x) {
                    wn.field_j = var3;
                    oa.field_e = var3;
                    var2 = nm.field_e;
                    L4: while (true) {
                      if (ca.field_h <= var2) {
                        hl.field_n = var3;
                        cn.field_d = var3;
                        var2 = or.field_h;
                        L5: while (true) {
                          if (var2 >= mm.field_i) {
                            var2 = sg.field_S;
                            L6: while (true) {
                              if (nd.field_l <= var2) {
                                gf.field_d = var3;
                                ph.field_g = new int[th.field_l.length];
                                pa.field_L = new int[th.field_l.length];
                                var4 = 0;
                                L7: while (true) {
                                  if (ph.field_g.length <= var4) {
                                    return;
                                  } else {
                                    ph.field_g[var4] = var4;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var4 = var2;
                                var14 = th.field_l;
                                var6 = var3;
                                ((cj) this).a(0, var6, 0, 0, 0, var4, var14);
                                var3 += 2;
                                var2++;
                                continue L6;
                              }
                            }
                          } else {
                            var4 = var2;
                            var13 = th.field_l;
                            var6 = var3;
                            ((cj) this).a(var13, 0, 0, false, ((cj) this).field_O[var4], var6, ((cj) this).field_M[var4], 0);
                            var3 += 4;
                            var2++;
                            continue L5;
                          }
                        }
                      } else {
                        var4 = var2;
                        var12 = th.field_l;
                        var6 = var3;
                        ((cj) this).a(var12, 0, 0, false, ((cj) this).field_O[var4], var6, ((cj) this).field_M[var4], 0);
                        var3 += 4;
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var4 = var2;
                    var11 = th.field_l;
                    var6 = var3;
                    ((cj) this).a(var11, 0, 0, false, ((cj) this).field_O[var4], var6, ((cj) this).field_M[var4], 0);
                    var3 += 4;
                    var2++;
                    continue L3;
                  }
                }
              } else {
                var4 = var2;
                var10 = th.field_l;
                var6 = var3;
                ((cj) this).a(0, var6, 0, 0, 0, var4, var10);
                var3 += 2;
                var2++;
                continue L2;
              }
            }
          } else {
            var4 = var2;
            var9 = th.field_l;
            var6 = var3;
            ((cj) this).a(0, var6, 0, 0, 0, var4, var9);
            var3 += 2;
            var2++;
            continue L1;
          }
        }
    }

    cj() {
        ((cj) this).field_m = 96;
        ((cj) this).field_d = 32;
        ((cj) this).field_z = 0.8009999990463257f;
        ((cj) this).field_E = 16384.0;
        ((cj) this).field_C = 69;
        ((cj) this).field_j = 5.7246799465414;
        ((cj) this).field_x = 60;
        ((cj) this).field_p = 0.3316125578789226;
        ((cj) this).b(113);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "<%0> now has <%1> lives.";
        field_fb = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, true, false, true, false, false, false, false, false, false, true};
        field_ob = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
