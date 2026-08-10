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
        this.field_l = sa.field_g;
        this.field_G = 17;
        this.field_H = 0;
        de.field_g = param0 ? true : false;
    }

    final static StringBuilder a(char param0, int param1, int param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -2790) {
              var4_int = param3.length();
              param3.setLength(param1);
              var5 = var4_int;
              L1: while (true) {
                if (param1 <= var5) {
                  stackIn_7_0 = (StringBuilder) (param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param3.setCharAt(var5, param0);
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("cj.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void b(int param0, di param1) {
        try {
            if (param0 != 5) {
                this.field_gb = (jg) null;
            }
            this.field_B = new dd(param1.a(false, "tiki-sky.jpg", ""), (java.awt.Component) ((Object) pa.field_K));
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "cj.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, uf param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (-1 != (ln.field_t ^ -1)) {
                break L1;
              } else {
                tl.field_N.a(true, -1);
                break L1;
              }
            }
            L2: {
              if (500 > ln.field_t) {
                this.a(128, 50, (byte) 71, new jg[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, mc.field_j);
                if (ga.a(400, true, ea.field_r) == 0) {
                  this.c(-4577, 32);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                if ((ln.field_t ^ -1) != -501) {
                  if (ln.field_t < 2000) {
                    L3: {
                      var3_int = (128 * ln.field_t + -64000) / 1500;
                      this.a(128 - var3_int * 7 / 8, 50, (byte) 34, new jg[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, mc.field_j);
                      if (ga.a(800, true, ea.field_r) != 0) {
                        break L3;
                      } else {
                        this.c(-4577, 128 + -(7 * var3_int / 8) >> -176862814);
                        break L3;
                      }
                    }
                    tl.field_N.a((byte) 77, -1, var3_int);
                    break L2;
                  } else {
                    if (ln.field_t < 11200) {
                      this.a(8, 50, (byte) -101, new jg[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, mc.field_j);
                      break L2;
                    } else {
                      if (-12201 >= (ln.field_t ^ -1)) {
                        if (-12201 == (ln.field_t ^ -1)) {
                          tl.field_N.e(-1);
                          break L2;
                        } else {
                          ln.field_t = -1;
                          break L2;
                        }
                      } else {
                        L4: {
                          var3_int = 128 * (12200 - ln.field_t) / 1000;
                          this.a(128 + -(7 * var3_int / 8), 50, (byte) -126, new jg[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, mc.field_j);
                          if (-1 != (ga.a(800, true, ea.field_r) ^ -1)) {
                            break L4;
                          } else {
                            this.c(-4577, 128 + -(var3_int * 7 / 8) >> 201851170);
                            break L4;
                          }
                        }
                        tl.field_N.a((byte) 32, -1, var3_int);
                        break L2;
                      }
                    }
                  }
                } else {
                  tl.field_N.a((byte) 88, -1, 1);
                  ij.field_u = this.field_b;
                  tl.field_N.a(this.field_b, true, (byte) -14, true);
                  break L2;
                }
              }
            }
            ln.field_t = ln.field_t + 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("cj.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    final void a(di param0, int param1) {
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int incrementValue$36 = 0;
        int incrementValue$37 = 0;
        int incrementValue$38 = 0;
        int incrementValue$39 = 0;
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var22 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var34 = null;
        var22 = Pool.field_O;
        try {
          L0: {
            L1: {
              this.field_O = new eg[22];
              var3_int = 0;
              ml.field_j = var3_int;
              incrementValue$22 = var3_int;
              var3_int++;
              this.field_O[incrementValue$22] = eg.a(param0, "", "tiki_table/tiki_extra_1");
              incrementValue$23 = var3_int;
              var3_int++;
              this.field_O[incrementValue$23] = eg.a(param0, "", "tiki_table/tiki_extra_2");
              incrementValue$24 = var3_int;
              var3_int++;
              this.field_O[incrementValue$24] = eg.a(param0, "", "tiki_table/tiki_extra_3");
              incrementValue$25 = var3_int;
              var3_int++;
              this.field_O[incrementValue$25] = eg.a(param0, "", "tiki_table/tiki_extra_4");
              kp.field_f = var3_int;
              nf.field_T = var3_int;
              incrementValue$26 = var3_int;
              var3_int++;
              this.field_O[incrementValue$26] = eg.a(param0, "", "tiki_table/tiki_totnew");
              hr.field_t = var3_int;
              mn.field_a = var3_int;
              incrementValue$27 = var3_int;
              var3_int++;
              this.field_O[incrementValue$27] = eg.a(param0, "", "tiki_table/tiki_steps_extend");
              ec.field_c = var3_int;
              gk.field_ib = var3_int;
              incrementValue$28 = var3_int;
              var3_int++;
              this.field_O[incrementValue$28] = eg.a(param0, "", "tiki_table/tiki_leg_a");
              incrementValue$29 = var3_int;
              var3_int++;
              this.field_O[incrementValue$29] = eg.a(param0, "", "tiki_table/tiki_leg_b");
              qf.field_i = var3_int;
              im.field_Wb = var3_int;
              incrementValue$30 = var3_int;
              var3_int++;
              this.field_O[incrementValue$30] = eg.a(param0, "", "tiki_table/tiki_block_a");
              incrementValue$31 = var3_int;
              var3_int++;
              this.field_O[incrementValue$31] = eg.a(param0, "", "tiki_table/tiki_block_b");
              incrementValue$32 = var3_int;
              var3_int++;
              this.field_O[incrementValue$32] = eg.a(param0, "", "tiki_table/tiki_block_c");
              incrementValue$33 = var3_int;
              var3_int++;
              this.field_O[incrementValue$33] = eg.a(param0, "", "tiki_table/tiki_block_d");
              incrementValue$34 = var3_int;
              var3_int++;
              this.field_O[incrementValue$34] = eg.a(param0, "", "tiki_table/tiki_block_e");
              incrementValue$35 = var3_int;
              var3_int++;
              this.field_O[incrementValue$35] = eg.a(param0, "", "tiki_table/tiki_block_f");
              or.field_h = var3_int;
              vh.field_L = var3_int;
              incrementValue$36 = var3_int;
              var3_int++;
              this.field_O[incrementValue$36] = eg.a(param0, "", "tiki_table/tiki_hole_a");
              sg.field_S = var3_int;
              mm.field_i = var3_int;
              incrementValue$37 = var3_int;
              var3_int++;
              this.field_O[incrementValue$37] = eg.a(param0, "", "tiki_table/tiki_hole_b");
              nd.field_l = var3_int;
              nm.field_e = var3_int;
              incrementValue$38 = var3_int;
              var3_int++;
              this.field_O[incrementValue$38] = eg.a(param0, "", "tiki_table/tiki_corner");
              incrementValue$39 = var3_int;
              var3_int++;
              this.field_O[incrementValue$39] = eg.a(param0, "", "tiki_table/tiki_side_a");
              if (param1 <= -43) {
                break L1;
              } else {
                this.field_Z = (jg) null;
                break L1;
              }
            }
            incrementValue$40 = var3_int;
            var3_int++;
            this.field_O[incrementValue$40] = eg.a(param0, "", "tiki_table/tiki_side_b");
            incrementValue$41 = var3_int;
            var3_int++;
            this.field_O[incrementValue$41] = eg.a(param0, "", "tiki_table/tiki_side_c");
            ka.field_q = var3_int;
            ca.field_h = var3_int;
            incrementValue$42 = var3_int;
            var3_int++;
            this.field_O[incrementValue$42] = eg.a(param0, "", "tiki_table/tiki_top_a");
            incrementValue$43 = var3_int;
            var3_int++;
            this.field_O[incrementValue$43] = eg.a(param0, "", "tiki_table/tiki_top_b");
            om.field_x = var3_int;
            this.field_A = new jk();
            this.field_A.a(eg.a(param0, "", "cues/jungle_cue"), (byte) -115);
            var4 = 0;
            L2: while (true) {
              if (var4 >= this.field_O.length) {
                var5 = 2147483647;
                var6 = -2147483648;
                var7 = 2147483647;
                var8 = -2147483648;
                var9 = 2147483647;
                var10 = -2147483648;
                var4 = ka.field_q;
                L3: while (true) {
                  if (om.field_x <= var4) {
                    var7 = -var8 + var7 * 2;
                    var5 = -var6 + var5 * 2;
                    var11 = (var6 + var5) / 2;
                    var12 = (var7 + var8) / 2;
                    var13 = var10;
                    var4 = 0;
                    L4: while (true) {
                      if (this.field_O.length <= var4) {
                        this.field_M = new int[this.field_O.length][3];
                        var4 = 0;
                        L5: while (true) {
                          if (this.field_O.length <= var4) {
                            var14 = new eg[4];
                            var4 = mn.field_a;
                            L6: while (true) {
                              if (gk.field_ib <= var4) {
                                break L0;
                              } else {
                                var15 = var4;
                                var16 = var14;
                                var17 = this.field_O[var15];
                                var34 = this.field_M[var15];
                                var19 = var16;
                                var21 = a.a(true, new eg(var17, false, false, false, false));
                                var29 = mj.a(-31121);
                                var24 = var29;
                                var20 = var24;
                                var20[1] = var34[1] + 0;
                                var20[0] = var34[0] - 0;
                                var20[2] = 0 + var34[2];
                                var19[0] = new eg(var17, false, false, false, false);
                                var19[0].a(var29);
                                var30 = mj.a(-31121);
                                var25 = var30;
                                var20 = var25;
                                var20[2] = var34[2] - 0;
                                var20[0] = 0 + var34[0];
                                var20[1] = -(var34[1] + 0);
                                var19[1] = new eg(var21, false, false, false, false);
                                var19[1].a(var30);
                                var31 = mj.a(-31121);
                                var26 = var31;
                                var20 = var26;
                                var20[0] = 0 + var34[0];
                                var20[2] = 0 + var34[2];
                                var20[1] = 0 + var34[1];
                                dq.a((byte) -121, var31);
                                var19[2] = new eg(var17, false, false, false, false);
                                var19[2].a(var31);
                                var32 = mj.a(-31121);
                                var27 = var32;
                                var20 = var27;
                                var20[0] = 0 + var34[0];
                                var20[2] = 0 + var34[2];
                                var20[1] = -(var34[1] - 0);
                                dq.a((byte) 50, var32);
                                var19[3] = new eg(var21, false, false, false, false);
                                var19[3].a(var32);
                                this.field_O[var4] = new eg(var14, 4);
                                this.field_O[var4].a(1, 1, 1, 2);
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            L7: {
                              if (this.field_O[var4] == null) {
                                break L7;
                              } else {
                                ln.a(this.field_M[var4], 0, this.field_O[var4]);
                                break L7;
                              }
                            }
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        L8: {
                          if (null != this.field_O[var4]) {
                            cq.a(var11, 90, var13, this.field_O[var4], var12);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    L9: {
                      d.a(this.field_O[var4], -23109);
                      if (this.field_O[var4].field_S <= var8) {
                        break L9;
                      } else {
                        var8 = this.field_O[var4].field_S;
                        break L9;
                      }
                    }
                    L10: {
                      if (this.field_O[var4].field_y < var7) {
                        var7 = this.field_O[var4].field_y;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var9 <= this.field_O[var4].field_V) {
                        break L11;
                      } else {
                        var9 = this.field_O[var4].field_V;
                        break L11;
                      }
                    }
                    L12: {
                      if (this.field_O[var4].field_x <= var10) {
                        break L12;
                      } else {
                        var10 = this.field_O[var4].field_x;
                        break L12;
                      }
                    }
                    L13: {
                      if (var6 < this.field_O[var4].field_w) {
                        var6 = this.field_O[var4].field_w;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    if (this.field_O[var4].field_D < var5) {
                      var5 = this.field_O[var4].field_D;
                      var4++;
                      continue L3;
                    } else {
                      var4++;
                      continue L3;
                    }
                  }
                }
              } else {
                db.a(0, this.field_O[var4]);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("cj.KA(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L14;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L14;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ')');
        }
    }

    private final void a(int[] param0, ko[] param1, eg param2, int param3) {
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        eg var8 = null;
        eg var9 = null;
        int var10 = 0;
        eg var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = param2;
                    var10 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param2.field_V + param0[2];
                        var6 = param2.field_x + param0[2];
                        var7 = 0;
                        if (param3 <= -110) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    stackIn_5_0 = jd.field_h;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackIn_5_0 = jd.field_h;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0.length <= var7) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        Runtime.getRuntime().gc();
                        if (jd.field_h[var7] > var6) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (jd.field_h[var7] >= var6) {
                            statePc = 15;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (jd.field_h[var7] <= var5_int) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = hq.b((byte) 125);
                        var9 = hq.b((byte) 127);
                        ej.a(0, var9, 0, false, jd.field_h[var7] - param0[2], 0, 0, 1, var8, var11);
                        if (-1 > (var9.field_K ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9.a();
                        var9.e();
                        param1[var7].b((byte) 106, new pm(hc.a(var9, param0, (byte) 101)));
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8.a();
                        var11 = var8;
                        param2 = var11;
                        var8.e();
                        if (0 == var11.field_K) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        System.out.println("Model before the cloudline " + jd.field_h[var7]);
                        param1[var7].b((byte) -100, new pm(hc.a(var11, param0, (byte) 101)));
                        param2 = null;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param2 == null) {
                            statePc = 31;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param2.field_K > 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param1[param1.length + -1].b((byte) -95, new pm(hc.a(param2, param0, (byte) 101)));
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (var5);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("cj.K(");
                    stackIn_22_1 = stackIn_23_1;
                    if (param0 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param1 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param2 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw wm.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        L0: {
          var7 = Pool.field_O;
          var5 = 95 % ((param2 - -44) / 56);
          var6 = param0;
          if (5 != var6) {
            if (2 != var6) {
              if (-4 == (var6 ^ -1)) {
                kp.a(100, this.field_S, param3, param1);
                break L0;
              } else {
                if (0 == var6) {
                  kp.a(100, this.field_rb, param3, param1);
                  break L0;
                } else {
                  if ((var6 ^ -1) == -2) {
                    kp.a(100, this.field_mb, param3, param1);
                    break L0;
                  } else {
                    if ((var6 ^ -1) == -7) {
                      kp.a(100, this.field_W, param3, param1);
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
                        kp.a(100, this.field_sb, param3, param1);
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              kp.a(100, this.field_bb, param3, param1);
              break L0;
            }
          } else {
            var6 = ga.a(3, true, ea.field_r);
            if (var6 != 0) {
              if (var6 != 1) {
                if ((var6 ^ -1) == -3) {
                  kp.a(100, this.field_jb, param3, param1);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                kp.a(100, this.field_ib, param3, param1);
                break L0;
              }
            } else {
              kp.a(100, this.field_Q, param3, param1);
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
        try {
            if (param0 != -23569) {
                this.field_pb = (jg) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "cj.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void j(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        ko[] var7;
        eg var8;
        int var9;
        int var10;
        StringBuilder var11;
        L0: {
          var10 = Pool.field_O;
          if (-1 != (this.field_H ^ -1)) {
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
          var9 = this.field_H;
          if ((var9 ^ -1) != -2) {
            if (var9 == 2) {
              fieldTemp$0 = kj.field_m - 150;
              kj.field_m = kj.field_m - 150;
              this.a(ck.field_Y, fieldTemp$0, (byte) 103, this.field_O[var4], 0, hf.field_a);
              break L2;
            } else {
              if (3 == var9) {
                fieldTemp$1 = kj.field_m - 170;
                kj.field_m = kj.field_m - 170;
                this.a(ck.field_Y, fieldTemp$1, (byte) 124, this.field_O[var2], 0, hf.field_a);
                break L2;
              } else {
                if (4 != var9) {
                  if ((var9 ^ -1) != -6) {
                    if (6 != var9) {
                      if (-8 != (var9 ^ -1)) {
                        if (8 == var9) {
                          fieldTemp$2 = kj.field_m - 45;
                          kj.field_m = kj.field_m - 45;
                          this.a(ck.field_Y, fieldTemp$2, (byte) 111, this.field_O[var4], 800, hf.field_a + 600);
                          break L2;
                        } else {
                          if ((var9 ^ -1) == -10) {
                            fieldTemp$3 = kj.field_m - 130;
                            kj.field_m = kj.field_m - 130;
                            this.a(ck.field_Y, fieldTemp$3, (byte) 110, this.field_O[var3], 968, -700 + hf.field_a);
                            break L2;
                          } else {
                            if (-11 != (var9 ^ -1)) {
                              if (var9 == 11) {
                                fieldTemp$4 = kj.field_m - 80;
                                kj.field_m = kj.field_m - 80;
                                this.a(ck.field_Y, fieldTemp$4, (byte) 109, this.field_O[var2], 0, hf.field_a);
                                break L2;
                              } else {
                                if (12 == var9) {
                                  var8 = this.field_O[var5];
                                  var7 = ck.field_Y;
                                  kj.field_m = -1536;
                                  this.a(var7, -1536, (byte) 82, var8, 0, -400 + hf.field_a);
                                  break L2;
                                } else {
                                  if (var9 == 13) {
                                    fieldTemp$5 = kj.field_m - 200;
                                    kj.field_m = kj.field_m - 200;
                                    this.a(ck.field_Y, fieldTemp$5, (byte) 125, this.field_O[var4], 0, hf.field_a + -200);
                                    break L2;
                                  } else {
                                    if ((var9 ^ -1) == -15) {
                                      fieldTemp$6 = kj.field_m - 125;
                                      kj.field_m = kj.field_m - 125;
                                      this.a(ck.field_Y, fieldTemp$6, (byte) 98, this.field_O[var6], 0, hf.field_a);
                                      this.field_l = mn.field_d;
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
                              fieldTemp$7 = kj.field_m - 170;
                              kj.field_m = kj.field_m - 170;
                              this.a(ck.field_Y, fieldTemp$7, (byte) 71, this.field_O[var6], 0, hf.field_a + -700);
                              break L2;
                            }
                          }
                        }
                      } else {
                        fieldTemp$8 = kj.field_m - 170;
                        kj.field_m = kj.field_m - 170;
                        this.a(ck.field_Y, fieldTemp$8, (byte) 80, this.field_O[var6], 0, hf.field_a);
                        break L2;
                      }
                    } else {
                      fieldTemp$9 = kj.field_m - 170;
                      kj.field_m = kj.field_m - 170;
                      this.a(ck.field_Y, fieldTemp$9, (byte) 107, this.field_O[var5], 0, hf.field_a);
                      break L2;
                    }
                  } else {
                    fieldTemp$10 = kj.field_m - 50;
                    kj.field_m = kj.field_m - 50;
                    this.a(ck.field_Y, fieldTemp$10, (byte) 108, this.field_O[var3], 0, hf.field_a + -50);
                    break L2;
                  }
                } else {
                  fieldTemp$11 = kj.field_m - 100;
                  kj.field_m = kj.field_m - 100;
                  this.a(ck.field_Y, fieldTemp$11, (byte) 109, this.field_O[var6], 0, hf.field_a - -500);
                  break L2;
                }
              }
            }
          } else {
            this.a(ck.field_Y, 80, (byte) 80, this.field_O[var3], 0, hf.field_a + -500);
            break L2;
          }
        }
        L3: {
          if (param0 == 2) {
            break L3;
          } else {
            var11 = (StringBuilder) null;
            cj.a('', -105, -71, (StringBuilder) null);
            break L3;
          }
        }
        this.field_H = this.field_H + 1;
    }

    final static tc a(int param0, int param1, int param2) {
        tc var3 = w.a(false, param1);
        if (param2 != 0) {
            field_U = (String) null;
        }
        var3.field_e = new int[param0];
        return var3;
    }

    final static boolean e(byte param0) {
        if (param0 != 85) {
            StringBuilder var2 = (StringBuilder) null;
            cj.a('ￅ', -57, 7, (StringBuilder) null);
        }
        return (ve.field_m ^ -1L) == (em.field_L.field_Zb ^ -1L) ? true : false;
    }

    private final void a(ko[] param0, int param1, byte param2, eg param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        try {
            param3 = new eg(param3, false, false, false, false);
            var7_int = param5 * hc.a(2047, param1) >> -1056869264;
            var8 = param5 * ao.a(param1, true) >> -1320728048;
            param1 = param1 + param4;
            param3.a(new int[]{0, 0, 0, hc.a(2047, 1536 + param1), ao.a(1536 + param1, true), 0, -ao.a(param1 + 1536, true), hc.a(2047, param1 - -1536), 0, 0, 0, 65536});
            param3.e();
            if (param2 < 68) {
                this.d(false);
            }
            this.a(new int[]{var7_int, var8, kh.field_vc}, param0, param3, -123);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "cj.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
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
        Object stackIn_53_0;
        int[] stackIn_53_1;
        int stackIn_53_2;
        int stackIn_53_3;
        pq[] stackIn_53_4;
        Object stackIn_54_0;
        int[] stackIn_54_1;
        int stackIn_54_2;
        int stackIn_54_3;
        pq[] stackIn_54_4;
        int stackIn_54_5;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pq[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        eg var12 = null;
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
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            L1: {
              var21 = param1.field_I.field_l;
              var3 = var21;
              var30 = f.a((byte) -119, param1.field_ab);
              var18 = var30;
              var4 = var18;
              var28 = var4;
              var16 = var28;
              var13 = var16;
              var5_ref_int__ = var13;
              oh.field_d[0] = var28[0] - sb.a(288.0f, true) >> 214782274;
              oh.field_d[1] = var28[1] + -sb.a(144.0f, true) >> 778474434;
              oh.field_d[2] = var28[2] >> 1709054754;
              if (var5_ref_int__ != oh.field_d) {
                oh.field_d[9] = var28[9];
                oh.field_d[5] = var28[5];
                oh.field_d[10] = var28[10];
                oh.field_d[6] = var28[6];
                oh.field_d[8] = var28[8];
                oh.field_d[7] = var28[7];
                oh.field_d[11] = var28[11];
                oh.field_d[3] = var28[3];
                oh.field_d[4] = var28[4];
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var29 = var4;
              var17 = var29;
              var14 = var17;
              var5_ref_int__ = var14;
              gr.field_w[0] = var29[0] - sb.a(288.0f, true) >> -1630635132;
              gr.field_w[1] = var29[1] - sb.a(144.0f, true) >> -1135636028;
              gr.field_w[2] = var29[2] >> 1585145732;
              if (gr.field_w != var5_ref_int__) {
                gr.field_w[7] = var29[7];
                gr.field_w[3] = var29[3];
                gr.field_w[10] = var29[10];
                gr.field_w[9] = var29[9];
                gr.field_w[8] = var29[8];
                gr.field_w[5] = var29[5];
                gr.field_w[4] = var29[4];
                gr.field_w[11] = var29[11];
                gr.field_w[6] = var29[6];
                break L2;
              } else {
                break L2;
              }
            }
            var4[1] = rb.b(var30[1], -4);
            var4[0] = rb.b(var30[0], -4);
            var4[2] = rb.b(var30[2], -4);
            this.e(true);
            var5 = 0;
            L3: while (true) {
              if (ln.field_u.length <= var5) {
                this.a(false, var30, var21);
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
                L4: while (true) {
                  if (1 >= var5) {
                    L5: {
                      fb.field_b = dn.field_m[0];
                      if (param0 == -55) {
                        break L5;
                      } else {
                        var12 = (eg) null;
                        this.a((int[]) null, (ko[]) null, (eg) null, -92);
                        break L5;
                      }
                    }
                    L6: {
                      var24 = ln.field_u[1];
                      var41 = gr.field_w;
                      var24.a((byte) -115, 0, var24.field_j.length, var41);
                      if (-1L == (pd.field_i & 256L ^ -1L)) {
                        break L6;
                      } else {
                        ln.field_u[1].a(gr.field_w, 0);
                        break L6;
                      }
                    }
                    L7: {
                      fb.field_b = var6;
                      var26 = ln.field_u[0];
                      var42 = gr.field_w;
                      var26.a((byte) -98, 0, var26.field_j.length, var42);
                      if ((256L & pd.field_i) == 0L) {
                        break L7;
                      } else {
                        ln.field_u[0].a(gr.field_w, 0);
                        break L7;
                      }
                    }
                    if (-1L == (4194304L & pd.field_i ^ -1L)) {
                      var5 = -1 + ta.field_c;
                      L8: while (true) {
                        if (cq.field_c > var5) {
                          var5 = -1 + am.field_h;
                          L9: while (true) {
                            if (c.field_b > var5) {
                              var5 = gf.field_d + -1;
                              L10: while (true) {
                                if (var5 < hl.field_n) {
                                  L11: {
                                    if ((1073741824L & pd.field_i) != 0L) {
                                      break L11;
                                    } else {
                                      this.a(var30, (byte) 106, false, var21, false);
                                      break L11;
                                    }
                                  }
                                  var5 = wn.field_j + -1;
                                  L12: while (true) {
                                    if (var5 < ue.field_a) {
                                      L13: {
                                        if ((pd.field_i & 1073741824L ^ -1L) == -1L) {
                                          var5 = 0;
                                          L14: while (true) {
                                            if (var21.length <= var5) {
                                              break L13;
                                            } else {
                                              L15: {
                                                if (!var21[var5].field_s) {
                                                  break L15;
                                                } else {
                                                  this.a(var30, var21[var5]);
                                                  break L15;
                                                }
                                              }
                                              var5++;
                                              continue L14;
                                            }
                                          }
                                        } else {
                                          break L13;
                                        }
                                      }
                                      var7 = oa.field_e;
                                      var8 = cn.field_d;
                                      var10 = var8 + -1;
                                      L16: while (true) {
                                        if (var7 > var10) {
                                          L17: {
                                            if (0L != (1073741824L & pd.field_i)) {
                                              break L17;
                                            } else {
                                              L18: {
                                                stackIn_53_0 = this;

                                                stackIn_53_1 = (int[]) (var4);

                                                stackIn_53_2 = 102;

                                                stackIn_53_3 = 1;

                                                stackIn_53_4 = (pq[]) (var3);

                                                if (param1.field_I.j(29).field_q != 0) {
                                                  stackIn_54_0 = this;
                                                  stackIn_54_1 = (int[]) ((Object) stackIn_53_1);
                                                  stackIn_54_2 = stackIn_53_2;
                                                  stackIn_54_3 = stackIn_53_3;
                                                  stackIn_54_4 = (pq[]) ((Object) stackIn_53_4);
                                                  stackIn_54_5 = 0;
                                                  break L18;
                                                } else {
                                                  stackIn_54_0 = this;
                                                  stackIn_54_1 = (int[]) ((Object) stackIn_53_1);
                                                  stackIn_54_2 = stackIn_53_2;
                                                  stackIn_54_3 = stackIn_53_3;
                                                  stackIn_54_4 = (pq[]) ((Object) stackIn_53_4);
                                                  stackIn_54_5 = 1;
                                                  break L18;
                                                }
                                              }
                                              this.a(stackIn_54_1, (byte) stackIn_54_2, stackIn_54_3 != 0, stackIn_54_4, stackIn_54_5 != 0);
                                              break L17;
                                            }
                                          }
                                          var7 = oa.field_e;
                                          var8 = cn.field_d;
                                          var15 = -1 + var8;
                                          var10 = var15;
                                          L19: while (true) {
                                            if (var15 < var7) {
                                              L20: {
                                                if (-1L != (1073741824L & pd.field_i ^ -1L)) {
                                                  break L20;
                                                } else {
                                                  param1.q(-1);
                                                  break L20;
                                                }
                                              }
                                              L21: {
                                                if ((1073741824L & pd.field_i ^ -1L) == -1L) {
                                                  param1.D(-125);
                                                  break L21;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                              L22: {
                                                if ((pd.field_i & 256L) != 0L) {
                                                  var5 = 0;
                                                  L23: while (true) {
                                                    if (th.field_l.length <= var5) {
                                                      break L22;
                                                    } else {
                                                      var5++;
                                                      continue L23;
                                                    }
                                                  }
                                                } else {
                                                  break L22;
                                                }
                                              }
                                              decompiledRegionSelector0 = 1;
                                              break L0;
                                            } else {
                                              L24: {
                                                var9 = ph.field_g[var15];
                                                if (!sh.field_Q[var9]) {
                                                  break L24;
                                                } else {
                                                  th.field_l[var9].c(6710886, oh.field_d);
                                                  break L24;
                                                }
                                              }
                                              var15--;
                                              continue L19;
                                            }
                                          }
                                        } else {
                                          L25: {
                                            var9 = ph.field_g[var10];
                                            if (!sh.field_Q[var9]) {
                                              th.field_l[var9].c(param0 ^ -6710865, oh.field_d);
                                              break L25;
                                            } else {
                                              break L25;
                                            }
                                          }
                                          var10--;
                                          continue L16;
                                        }
                                      }
                                    } else {
                                      th.field_l[ph.field_g[var5]].c(6710886, oh.field_d);
                                      var5--;
                                      continue L12;
                                    }
                                  }
                                } else {
                                  th.field_l[ph.field_g[var5]].c(6710886, oh.field_d);
                                  var5--;
                                  continue L10;
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
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    L26: {
                      fb.field_b = dn.field_m[-1 + var5];
                      var22 = ln.field_u[var5];
                      var40 = gr.field_w;
                      var22.a((byte) -122, 0, var22.field_j.length, var40);
                      if (0L == (256L & pd.field_i)) {
                        break L26;
                      } else {
                        ln.field_u[var5].a(gr.field_w, 0);
                        break L26;
                      }
                    }
                    var5--;
                    continue L4;
                  }
                }
              } else {
                var19 = ln.field_u[var5];
                var39 = gr.field_w;
                var19.b((byte) 112, 0, var19.field_j.length, var39);
                var5++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var3_ref = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var3_ref);

            stackIn_73_1 = new StringBuilder().append("cj.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L27;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L27;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        try {
            if (param0 != 1) {
                al var4 = (al) null;
                this.a((al) null, 126);
            }
            this.field_b = cg.a(param1, "", "pool_jungle");
            this.field_i = cg.a(param1, "", "pool_jungle_win_jingle");
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "cj.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(cf param0, int param1) {
        try {
            int var3_int = 86 / ((param1 - 39) / 38);
            this.field_bb = param0.a("jungle_ball_hard", true, "");
            param0.a("jungle_ball_med", true, "");
            this.field_S = param0.a("jungle_ball_soft", true, "");
            this.field_rb = param0.a("jungle_cue_hard", true, "");
            this.field_mb = param0.a("jungle_cue_soft", true, "");
            this.field_sb = param0.a("jungle_pot", true, "");
            this.field_W = param0.a("jungle_respot_the_white", true, "");
            this.field_Q = param0.a("jungle_ball_cushion1", true, "");
            this.field_ib = param0.a("jungle_ball_cushion2", true, "");
            this.field_jb = param0.a("jungle_ball_cushion3", true, "");
            this.field_db = param0.a("", "jungle_bg_bird1", (byte) 122);
            this.field_nb = param0.a("", "jungle_bg_cricket1", (byte) 126);
            this.field_kb = param0.a("", "jungle_bg_cricket2", (byte) 123);
            this.field_pb = param0.a("", "jungle_bg_cricket3", (byte) 123);
            this.field_T = param0.a("", "jungle_bg_frog1", (byte) 127);
            this.field_Z = param0.a("", "jungle_bg_snake1", (byte) 125);
            this.field_ab = param0.a("", "jungle_bg_snake2", (byte) 124);
            this.field_X = param0.a("jungle_monkey1", true, "");
            this.field_cb = param0.a("jungle_monkey2", true, "");
            this.field_Y = param0.a("jungle_monkey3", true, "");
            this.field_gb = param0.a("jungle_monkey4", true, "");
            this.field_R = param0.a("", "jungle_bg_wind1", (byte) 122);
            this.field_hb = param0.a("", "jungle_bg_wind2", (byte) 123);
            this.field_lb = param0.a("", "jungle_bg_wind3", (byte) 121);
            this.field_qb = param0.a("", "jungle_bg_wind4", (byte) 124);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "cj.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void n(int param0) {
        int var2;
        ko[] var3;
        int var4;
        int var5;
        int var8;
        int var6;
        int var7;
        int var9;
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
                          ck.field_Y[var5].b((byte) -52, new pm(ah.field_e[var5]));
                          ln.field_u[var5] = new so();
                          ln.field_u[var5].a((byte) -121, ck.field_Y[var5]);
                          ln.field_u[var5].a(0);
                          ln.field_u[var5].a(this.field_q, this.field_e, this.field_F, (byte) -35, this.field_u, this.field_C);
                          ln.field_u[var5].d(105);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_O[var9].e();
                      var5 = -this.field_O[var9].field_V + var4;
                      this.a(new int[]{0, 0, var5}, var3, this.field_O[var9], -116);
                      var4 = this.field_O[var9].field_x + var5;
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  this.field_O[var2].e();
                  var5 = this.field_O[var2].field_x + this.field_M[var2][2];
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
        this.field_v = 5609813;
    }

    private final void a(uf param0, int param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          L0: {
            var3_int = param0.field_eb.b(param1 + -9419);
            if (param1 == 9291) {
              L1: {
                qh.d(0, var3_int, 640, -var3_int + 480, this.field_v, 16128);
                var4 = this.field_B.field_z << -451146655;
                var5 = this.field_B.field_A << 713868001;
                var6 = (int)(-param0.field_eb.a(true) * (double)var4 / 2.0 / 3.141592653589793);
                var7 = -200 + var3_int;
                if (0 < var7) {
                  qh.f(0, 0, 640, var7, this.field_B.field_D[0]);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_B.c(var6 + -var4, var7, var4, var5);
              var8 = this.field_B.field_A + var7;
              L2: while (true) {
                if (var8 >= qh.field_g) {
                  L3: {
                    if (-640 + this.field_B.field_z <= var6 >> 837987760) {
                      break L3;
                    } else {
                      this.field_B.c(var6, var7, var4, var5);
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_B.d(this.field_B.field_A - 1, -var4 + var6, var8);
                  var8++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("cj.R(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int h(int param0) {
        if (param0 != 684) {
            this.field_kb = (jg) null;
        }
        return 11184810;
    }

    private final void c(int param0, int param1) {
        int stackIn_11_0 = 0;
        int var3;
        int var4;
        jg var5;
        int var6;
        int var7;
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
                  stackIn_11_0 = 11;
                  break L4;
                } else {
                  stackIn_11_0 = 22;
                  break L4;
                }
              }
              var4 = ga.a(stackIn_11_0, true, ea.field_r);
              var6 = var4;
              if (var6 == 0) {
                mc.field_j[var3] = mn.a(-24296, nb.a(this.field_db, 100, param1, ga.a(128, true, ea.field_r)));
                break L2;
              } else {
                if (var6 != 1) {
                  if (2 == var6) {
                    mc.field_j[var3] = mn.a(-24296, nb.a(this.field_kb, 100, param1, ga.a(128, true, ea.field_r)));
                    break L2;
                  } else {
                    if (var6 != 3) {
                      if (4 != var6) {
                        if ((var6 ^ -1) == -6) {
                          mc.field_j[var3] = mn.a(-24296, nb.a(this.field_Z, 100, param1, ga.a(128, true, ea.field_r)));
                          break L2;
                        } else {
                          if (-7 != (var6 ^ -1)) {
                            if (var6 != 7) {
                              if (-9 != (var6 ^ -1)) {
                                if (-10 != (var6 ^ -1)) {
                                  if (-11 == (var6 ^ -1)) {
                                    mc.field_j[var3] = rq.a(126, nb.a(this.field_gb, 100, param1, ga.a(128, true, ea.field_r)));
                                    break L2;
                                  } else {
                                    L5: {
                                      var5 = (jg) ((Object) mc.field_j[var3].field_o.field_n);
                                      if (var5 == this.field_X) {
                                        break L5;
                                      } else {
                                        if (this.field_cb == var5) {
                                          break L5;
                                        } else {
                                          if (var5 == this.field_Y) {
                                            break L5;
                                          } else {
                                            if (this.field_gb == var5) {
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
                                  mc.field_j[var3] = rq.a(101, nb.a(this.field_Y, 100, param1, ga.a(128, true, ea.field_r)));
                                  break L2;
                                }
                              } else {
                                mc.field_j[var3] = rq.a(124, nb.a(this.field_cb, 100, param1, ga.a(128, true, ea.field_r)));
                                break L2;
                              }
                            } else {
                              mc.field_j[var3] = rq.a(126, nb.a(this.field_X, 100, param1, ga.a(128, true, ea.field_r)));
                              break L2;
                            }
                          } else {
                            mc.field_j[var3] = mn.a(param0 + -19719, nb.a(this.field_ab, 100, param1, ga.a(128, true, ea.field_r)));
                            break L2;
                          }
                        }
                      } else {
                        mc.field_j[var3] = mn.a(param0 + -19719, nb.a(this.field_T, 100, param1, ga.a(128, true, ea.field_r)));
                        break L2;
                      }
                    } else {
                      mc.field_j[var3] = mn.a(cq.a(param0, 20231), nb.a(this.field_pb, 100, param1, ga.a(128, true, ea.field_r)));
                      break L2;
                    }
                  }
                } else {
                  mc.field_j[var3] = mn.a(-24296, nb.a(this.field_nb, 100, param1, ga.a(128, true, ea.field_r)));
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
        double stackIn_14_0 = 0.0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        int var7 = 0;
        al var8 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param1.field_m < 0.0) {
                param1.field_m = 0.0;
                break L1;
              } else {
                if (288.0 >= param1.field_m) {
                  break L1;
                } else {
                  param1.field_m = 288.0;
                  break L1;
                }
              }
            }
            L2: {
              if (param1.field_f < 0.0) {
                param1.field_f = 0.0;
                break L2;
              } else {
                if (576.0 >= param1.field_f) {
                  break L2;
                } else {
                  param1.field_f = 576.0;
                  break L2;
                }
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                var8 = (al) null;
                this.a((al) null, 35);
                break L3;
              }
            }
            L4: {
              var3_double = param1.d(8);
              if ((4194304L & pd.field_i ^ -1L) != -1L) {
                stackIn_14_0 = 12000.0;
                break L4;
              } else {
                stackIn_14_0 = 2048.0;
                break L4;
              }
            }
            L5: {
              var5 = stackIn_14_0;
              if (var3_double > var5) {
                param1.field_d = param1.field_f + var5 * (param1.field_d - param1.field_f) / var3_double;
                param1.field_h = param1.field_k + var5 * (param1.field_h - param1.field_k) / var3_double;
                param1.field_a = param1.field_m + (param1.field_a - param1.field_m) * var5 / var3_double;
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("cj.VA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final void a(al param0, int param1) {
        try {
            super.a(param0, param1);
            jo.a(0.8999999761581421f, 1.0f, 0.8999999761581421f, 0.0833333358168602f, -31792);
            ln.field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "cj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void o(int param0) {
        int var2;
        int var3;
        int var4;
        int var6;
        int var7;
        uf var8;
        p[] var9;
        p[] var10;
        p[] var11;
        p[] var12;
        p[] var13;
        p[] var14;
        L0: {
          var7 = Pool.field_O;
          th.field_l = new p[-sg.field_S - -nd.field_l + (mn.field_a + -gk.field_ib + (-hr.field_t + nf.field_T) + (this.field_O.length + -kp.field_f + (ml.field_j - ec.field_c))) - (-im.field_Wb - vh.field_L + (qf.field_i - 3 * (-ka.field_q + om.field_x)) + (-((-or.field_h + mm.field_i) * 3) + -(3 * (ca.field_h - nm.field_e))))];
          var3 = 0;
          cq.field_c = var3;
          var2 = ec.field_c;
          if (param0 <= -11) {
            break L0;
          } else {
            var8 = (uf) null;
            this.a((byte) 7, (uf) null);
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
                                this.a(0, var6, 0, 0, 0, var4, var14);
                                var3 += 2;
                                var2++;
                                continue L6;
                              }
                            }
                          } else {
                            var4 = var2;
                            var13 = th.field_l;
                            var6 = var3;
                            this.a(var13, 0, 0, false, this.field_O[var4], var6, this.field_M[var4], 0);
                            var3 += 4;
                            var2++;
                            continue L5;
                          }
                        }
                      } else {
                        var4 = var2;
                        var12 = th.field_l;
                        var6 = var3;
                        this.a(var12, 0, 0, false, this.field_O[var4], var6, this.field_M[var4], 0);
                        var3 += 4;
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var4 = var2;
                    var11 = th.field_l;
                    var6 = var3;
                    this.a(var11, 0, 0, false, this.field_O[var4], var6, this.field_M[var4], 0);
                    var3 += 4;
                    var2++;
                    continue L3;
                  }
                }
              } else {
                var4 = var2;
                var10 = th.field_l;
                var6 = var3;
                this.a(0, var6, 0, 0, 0, var4, var10);
                var3 += 2;
                var2++;
                continue L2;
              }
            }
          } else {
            var4 = var2;
            var9 = th.field_l;
            var6 = var3;
            this.a(0, var6, 0, 0, 0, var4, var9);
            var3 += 2;
            var2++;
            continue L1;
          }
        }
    }

    cj() {
        this.field_m = 96;
        this.field_d = 32;
        this.field_z = 0.8009999990463257f;
        this.field_E = 16384.0;
        this.field_C = 69;
        this.field_j = 5.7246799465414;
        this.field_x = 60;
        this.field_p = 0.3316125578789226;
        this.b(113);
    }

    static {
        field_U = "<%0> now has <%1> lives.";
        field_fb = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, true, false, true, false, false, false, false, false, false, true};
        field_ob = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
