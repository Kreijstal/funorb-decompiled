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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 == -2790) {
              var4_int = param3.length();
              param3.setLength(param1);
              var5 = var4_int;
              L1: while (true) {
                if (param1 <= var5) {
                  stackOut_6_0 = (StringBuilder) param3;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  param3.setCharAt(var5, param0);
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("cj.NA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final void b(int param0, di param1) {
        try {
            if (param0 != 5) {
                ((cj) this).field_gb = null;
            }
            ((cj) this).field_B = new dd(param1.a(false, "tiki-sky.jpg", ""), (java.awt.Component) (Object) pa.field_K);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "cj.JA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, uf param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (ln.field_t != 0) {
                break L1;
              } else {
                tl.field_N.a(true, -1);
                break L1;
              }
            }
            L2: {
              if (500 > ln.field_t) {
                ((cj) this).a(128, 50, (byte) 71, new jg[4], mc.field_j);
                if (ga.a(400, true, ea.field_r) == 0) {
                  this.c(-4577, 32);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                if (ln.field_t != 500) {
                  if (ln.field_t < 2000) {
                    L3: {
                      var3_int = (128 * ln.field_t + -64000) / 1500;
                      ((cj) this).a(128 - var3_int * 7 / 8, 50, (byte) 34, new jg[4], mc.field_j);
                      if (ga.a(800, true, ea.field_r) != 0) {
                        break L3;
                      } else {
                        this.c(-4577, 128 + -(7 * var3_int / 8) >> 2);
                        break L3;
                      }
                    }
                    tl.field_N.a((byte) 77, -1, var3_int);
                    break L2;
                  } else {
                    if (ln.field_t < 11200) {
                      ((cj) this).a(8, 50, (byte) -101, new jg[4], mc.field_j);
                      break L2;
                    } else {
                      if (ln.field_t >= 12200) {
                        if (ln.field_t == 12200) {
                          tl.field_N.e(-1);
                          break L2;
                        } else {
                          ln.field_t = -1;
                          break L2;
                        }
                      } else {
                        L4: {
                          var3_int = 128 * (12200 - ln.field_t) / 1000;
                          ((cj) this).a(128 + -(7 * var3_int / 8), 50, (byte) -126, new jg[4], mc.field_j);
                          if (ga.a(800, true, ea.field_r) != 0) {
                            break L4;
                          } else {
                            this.c(-4577, 128 + -(var3_int * 7 / 8) >> 2);
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
                  ij.field_u = ((cj) this).field_b;
                  tl.field_N.a(((cj) this).field_b, true, (byte) -14, true);
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
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("cj.T(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final void a(di param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var22 = Pool.field_O;
        try {
          L0: {
            L1: {
              ((cj) this).field_O = new eg[22];
              var3_int = 0;
              ml.field_j = var3_int;
              int incrementValue$25 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$25] = eg.a(param0, "", "tiki_table/tiki_extra_1");
              int incrementValue$26 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$26] = eg.a(param0, "", "tiki_table/tiki_extra_2");
              int incrementValue$27 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$27] = eg.a(param0, "", "tiki_table/tiki_extra_3");
              int incrementValue$28 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$28] = eg.a(param0, "", "tiki_table/tiki_extra_4");
              kp.field_f = var3_int;
              nf.field_T = var3_int;
              int incrementValue$29 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$29] = eg.a(param0, "", "tiki_table/tiki_totnew");
              hr.field_t = var3_int;
              mn.field_a = var3_int;
              int incrementValue$30 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$30] = eg.a(param0, "", "tiki_table/tiki_steps_extend");
              ec.field_c = var3_int;
              gk.field_ib = var3_int;
              int incrementValue$31 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$31] = eg.a(param0, "", "tiki_table/tiki_leg_a");
              int incrementValue$32 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$32] = eg.a(param0, "", "tiki_table/tiki_leg_b");
              qf.field_i = var3_int;
              im.field_Wb = var3_int;
              int incrementValue$33 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$33] = eg.a(param0, "", "tiki_table/tiki_block_a");
              int incrementValue$34 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$34] = eg.a(param0, "", "tiki_table/tiki_block_b");
              int incrementValue$35 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$35] = eg.a(param0, "", "tiki_table/tiki_block_c");
              int incrementValue$36 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$36] = eg.a(param0, "", "tiki_table/tiki_block_d");
              int incrementValue$37 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$37] = eg.a(param0, "", "tiki_table/tiki_block_e");
              int incrementValue$38 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$38] = eg.a(param0, "", "tiki_table/tiki_block_f");
              or.field_h = var3_int;
              vh.field_L = var3_int;
              int incrementValue$39 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$39] = eg.a(param0, "", "tiki_table/tiki_hole_a");
              sg.field_S = var3_int;
              mm.field_i = var3_int;
              int incrementValue$40 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$40] = eg.a(param0, "", "tiki_table/tiki_hole_b");
              nd.field_l = var3_int;
              nm.field_e = var3_int;
              int incrementValue$41 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$41] = eg.a(param0, "", "tiki_table/tiki_corner");
              int incrementValue$42 = var3_int;
              var3_int++;
              ((cj) this).field_O[incrementValue$42] = eg.a(param0, "", "tiki_table/tiki_side_a");
              if (param1 <= -43) {
                break L1;
              } else {
                ((cj) this).field_Z = null;
                break L1;
              }
            }
            int incrementValue$43 = var3_int;
            var3_int++;
            ((cj) this).field_O[incrementValue$43] = eg.a(param0, "", "tiki_table/tiki_side_b");
            int incrementValue$44 = var3_int;
            var3_int++;
            ((cj) this).field_O[incrementValue$44] = eg.a(param0, "", "tiki_table/tiki_side_c");
            ka.field_q = var3_int;
            ca.field_h = var3_int;
            int incrementValue$45 = var3_int;
            var3_int++;
            ((cj) this).field_O[incrementValue$45] = eg.a(param0, "", "tiki_table/tiki_top_a");
            int incrementValue$46 = var3_int;
            var3_int++;
            ((cj) this).field_O[incrementValue$46] = eg.a(param0, "", "tiki_table/tiki_top_b");
            om.field_x = var3_int;
            ((cj) this).field_A = new jk();
            ((cj) this).field_A.a(eg.a(param0, "", "cues/jungle_cue"), (byte) -115);
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((cj) this).field_O.length) {
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
                      if (((cj) this).field_O.length <= var4) {
                        ((cj) this).field_M = new int[((cj) this).field_O.length][3];
                        var4 = 0;
                        L5: while (true) {
                          if (((cj) this).field_O.length <= var4) {
                            var14 = new eg[4];
                            var4 = mn.field_a;
                            L6: while (true) {
                              if (gk.field_ib <= var4) {
                                break L0;
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
                                var20[1] = var38[1];
                                var20[0] = var38[0];
                                var20[2] = var38[2];
                                var19[0] = new eg(var17, false, false, false, false);
                                var19[0].a(var39);
                                var40 = mj.a(-31121);
                                var35 = var40;
                                var30 = var35;
                                var25 = var30;
                                var20 = var25;
                                var20[2] = var38[2];
                                var20[0] = var38[0];
                                var20[1] = -var38[1];
                                var19[1] = new eg(var21, false, false, false, false);
                                var19[1].a(var40);
                                var41 = mj.a(-31121);
                                var36 = var41;
                                var31 = var36;
                                var26 = var31;
                                var20 = var26;
                                var20[0] = var38[0];
                                var20[2] = var38[2];
                                var20[1] = var38[1];
                                int[] discarded$47 = dq.a((byte) -121, var41);
                                var19[2] = new eg(var17, false, false, false, false);
                                var19[2].a(var41);
                                var42 = mj.a(-31121);
                                var37 = var42;
                                var32 = var37;
                                var27 = var32;
                                var20 = var27;
                                var20[0] = var38[0];
                                var20[2] = var38[2];
                                var20[1] = -var38[1];
                                int[] discarded$48 = dq.a((byte) 50, var42);
                                var19[3] = new eg(var21, false, false, false, false);
                                var19[3].a(var42);
                                ((cj) this).field_O[var4] = new eg(var14, 4);
                                ((cj) this).field_O[var4].a(1, 1, 1, 2);
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            L7: {
                              if (((cj) this).field_O[var4] == null) {
                                break L7;
                              } else {
                                ln.a(((cj) this).field_M[var4], 0, ((cj) this).field_O[var4]);
                                break L7;
                              }
                            }
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        L8: {
                          if (null != ((cj) this).field_O[var4]) {
                            eg discarded$49 = cq.a(var11, 90, var13, ((cj) this).field_O[var4], var12);
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
                      d.a(((cj) this).field_O[var4], -23109);
                      if (((cj) this).field_O[var4].field_S <= var8) {
                        break L9;
                      } else {
                        var8 = ((cj) this).field_O[var4].field_S;
                        break L9;
                      }
                    }
                    L10: {
                      if (((cj) this).field_O[var4].field_y < var7) {
                        var7 = ((cj) this).field_O[var4].field_y;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var9 <= ((cj) this).field_O[var4].field_V) {
                        break L11;
                      } else {
                        var9 = ((cj) this).field_O[var4].field_V;
                        break L11;
                      }
                    }
                    L12: {
                      if (((cj) this).field_O[var4].field_x <= var10) {
                        break L12;
                      } else {
                        var10 = ((cj) this).field_O[var4].field_x;
                        break L12;
                      }
                    }
                    L13: {
                      if (var6 < ((cj) this).field_O[var4].field_w) {
                        var6 = ((cj) this).field_O[var4].field_w;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (((cj) this).field_O[var4].field_D >= var5) {
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var4++;
                    continue L3;
                  }
                }
              } else {
                db.a(0, ((cj) this).field_O[var4]);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("cj.KA(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L15;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L15;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param1 + 41);
        }
    }

    private final void a(int[] param0, ko[] param1, eg param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        eg var8 = null;
        eg var9 = null;
        int var10 = 0;
        eg var11 = null;
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
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        int[] stackOut_4_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = param2;
        var10 = Pool.field_O;
        try {
          L0: {
            var5_int = param2.field_V + param0[2];
            var6 = param2.field_x + param0[2];
            var7 = 0;
            if (param3 <= -110) {
              stackOut_3_0 = jd.field_h;
              stackIn_5_0 = stackOut_3_0;
              L1: while (true) {
                L2: {
                  if (stackIn_5_0.length <= var7) {
                    break L2;
                  } else {
                    Runtime.getRuntime().gc();
                    if (jd.field_h[var7] > var6) {
                      System.out.println("Model before the cloudline " + jd.field_h[var7]);
                      param1[var7].b((byte) -100, (ma) (Object) new pm(hc.a(var11, param0, (byte) 101)));
                      param2 = null;
                      break L2;
                    } else {
                      L3: {
                        if (jd.field_h[var7] >= var6) {
                          break L3;
                        } else {
                          if (jd.field_h[var7] <= var5_int) {
                            break L3;
                          } else {
                            L4: {
                              var8 = hq.b((byte) 125);
                              var9 = hq.b((byte) 127);
                              ej.a(0, var9, 0, false, jd.field_h[var7] - param0[2], 0, 0, 1, var8, var11);
                              if (var9.field_K > 0) {
                                var9.a();
                                var9.e();
                                param1[var7].b((byte) 106, (ma) (Object) new pm(hc.a(var9, param0, (byte) 101)));
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var8.a();
                            var11 = var8;
                            var8.e();
                            if (0 == var11.field_K) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var7++;
                      stackOut_4_0 = jd.field_h;
                      stackIn_5_0 = stackOut_4_0;
                      continue L1;
                    }
                  }
                }
                L5: {
                  if (param2 == null) {
                    break L5;
                  } else {
                    if (param2.field_K > 0) {
                      param1[param1.length + -1].b((byte) -95, (ma) (Object) new pm(hc.a(param2, param0, (byte) 101)));
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("cj.K(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 41);
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
              if (var6 == 3) {
                kf discarded$9 = kp.a(100, ((cj) this).field_S, param3, param1);
                break L0;
              } else {
                if (0 == var6) {
                  kf discarded$10 = kp.a(100, ((cj) this).field_rb, param3, param1);
                  break L0;
                } else {
                  if (var6 == 1) {
                    kf discarded$11 = kp.a(100, ((cj) this).field_mb, param3, param1);
                    break L0;
                  } else {
                    if (var6 == 6) {
                      kf discarded$12 = kp.a(100, ((cj) this).field_W, param3, param1);
                      System.out.println("playing respot the white");
                      break L0;
                    } else {
                      if (var6 != 4) {
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
                if (var6 == 2) {
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
        int discarded$0 = 90;
        pr.c();
    }

    final void c(int param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -23569) {
                break L1;
              } else {
                ((cj) this).field_pb = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cj.OA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
          if (((cj) this).field_H != 0) {
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
          if (var9 != 1) {
            if (var9 == 2) {
              int fieldTemp$14 = kj.field_m - 150;
              kj.field_m = kj.field_m - 150;
              this.a(ck.field_Y, fieldTemp$14, (byte) 103, ((cj) this).field_O[var4], 0, hf.field_a);
              break L2;
            } else {
              if (3 == var9) {
                int fieldTemp$15 = kj.field_m - 170;
                kj.field_m = kj.field_m - 170;
                this.a(ck.field_Y, fieldTemp$15, (byte) 124, ((cj) this).field_O[var2], 0, hf.field_a);
                break L2;
              } else {
                if (4 != var9) {
                  if (var9 != 5) {
                    if (6 != var9) {
                      if (var9 != 7) {
                        if (8 == var9) {
                          int fieldTemp$16 = kj.field_m - 45;
                          kj.field_m = kj.field_m - 45;
                          this.a(ck.field_Y, fieldTemp$16, (byte) 111, ((cj) this).field_O[var4], 800, hf.field_a + 600);
                          break L2;
                        } else {
                          if (var9 == 9) {
                            int fieldTemp$17 = kj.field_m - 130;
                            kj.field_m = kj.field_m - 130;
                            this.a(ck.field_Y, fieldTemp$17, (byte) 110, ((cj) this).field_O[var3], 968, -700 + hf.field_a);
                            break L2;
                          } else {
                            if (var9 != 10) {
                              if (var9 == 11) {
                                int fieldTemp$18 = kj.field_m - 80;
                                kj.field_m = kj.field_m - 80;
                                this.a(ck.field_Y, fieldTemp$18, (byte) 109, ((cj) this).field_O[var2], 0, hf.field_a);
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
                                    int fieldTemp$19 = kj.field_m - 200;
                                    kj.field_m = kj.field_m - 200;
                                    this.a(ck.field_Y, fieldTemp$19, (byte) 125, ((cj) this).field_O[var4], 0, hf.field_a + -200);
                                    break L2;
                                  } else {
                                    if (var9 == 14) {
                                      int fieldTemp$20 = kj.field_m - 125;
                                      kj.field_m = kj.field_m - 125;
                                      this.a(ck.field_Y, fieldTemp$20, (byte) 98, ((cj) this).field_O[var6], 0, hf.field_a);
                                      ((cj) this).field_l = mn.field_d;
                                      break L2;
                                    } else {
                                      if (15 == var9) {
                                        this.n(param0 + 6);
                                        break L2;
                                      } else {
                                        if (var9 == 16) {
                                          int discarded$21 = -16;
                                          this.o();
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
                              int fieldTemp$22 = kj.field_m - 170;
                              kj.field_m = kj.field_m - 170;
                              this.a(ck.field_Y, fieldTemp$22, (byte) 71, ((cj) this).field_O[var6], 0, hf.field_a + -700);
                              break L2;
                            }
                          }
                        }
                      } else {
                        int fieldTemp$23 = kj.field_m - 170;
                        kj.field_m = kj.field_m - 170;
                        this.a(ck.field_Y, fieldTemp$23, (byte) 80, ((cj) this).field_O[var6], 0, hf.field_a);
                        break L2;
                      }
                    } else {
                      int fieldTemp$24 = kj.field_m - 170;
                      kj.field_m = kj.field_m - 170;
                      this.a(ck.field_Y, fieldTemp$24, (byte) 107, ((cj) this).field_O[var5], 0, hf.field_a);
                      break L2;
                    }
                  } else {
                    int fieldTemp$25 = kj.field_m - 50;
                    kj.field_m = kj.field_m - 50;
                    this.a(ck.field_Y, fieldTemp$25, (byte) 108, ((cj) this).field_O[var3], 0, hf.field_a + -50);
                    break L2;
                  }
                } else {
                  int fieldTemp$26 = kj.field_m - 100;
                  kj.field_m = kj.field_m - 100;
                  this.a(ck.field_Y, fieldTemp$26, (byte) 109, ((cj) this).field_O[var6], 0, hf.field_a - -500);
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
            StringBuilder discarded$27 = cj.a('', -105, -71, (StringBuilder) null);
            break L3;
          }
        }
        ((cj) this).field_H = ((cj) this).field_H + 1;
    }

    final static tc a(int param0, int param1, int param2) {
        tc var3 = w.a(false, 1);
        var3.field_e = new int[param0];
        return var3;
    }

    final static boolean e() {
        return ~ve.field_m == ~em.field_L.field_Zb;
    }

    private final void a(ko[] param0, int param1, byte param2, eg param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              param3 = new eg(param3, false, false, false, false);
              var7_int = param5 * hc.a(2047, param1) >> 16;
              var8 = param5 * ao.a(param1, true) >> 16;
              param1 = param1 + param4;
              param3.a(new int[12]);
              param3.e();
              if (param2 >= 68) {
                break L1;
              } else {
                ((cj) this).d(false);
                break L1;
              }
            }
            this.a(new int[3], param0, param3, -123);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("cj.HA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void m() {
        field_U = null;
        field_fb = null;
        field_ob = null;
        field_V = null;
    }

    final void a(byte param0, uf param1) {
        RuntimeException var3 = null;
        pq[] var3_array = null;
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
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            L1: {
              var21 = param1.field_I.field_l;
              var3_array = var21;
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
              int discarded$10 = 1;
              oh.field_d[0] = var42[0] - sb.a(288.0f) >> 2;
              int discarded$11 = 1;
              oh.field_d[1] = var42[1] + -sb.a(144.0f) >> 2;
              oh.field_d[2] = var42[2] >> 2;
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
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var43 = var4;
              var36 = var43;
              var29 = var36;
              var17 = var29;
              var14 = var17;
              var5_ref_int__ = var14;
              int discarded$12 = 1;
              gr.field_w[0] = var43[0] - sb.a(288.0f) >> 4;
              int discarded$13 = 1;
              gr.field_w[1] = var43[1] - sb.a(144.0f) >> 4;
              gr.field_w[2] = var43[2] >> 4;
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
                break L2;
              } else {
                break L2;
              }
            }
            var4[1] = rb.b(var44[1], -4);
            var4[0] = rb.b(var44[0], -4);
            var4[2] = rb.b(var44[2], -4);
            ((cj) this).e(true);
            var5 = 0;
            L3: while (true) {
              if (ln.field_u.length <= var5) {
                ((cj) this).a(false, var44, var21);
                kf.a(ta.field_c, (byte) -104, pa.field_L, ph.field_g, cq.field_c);
                kf.a(am.field_h, (byte) -104, pa.field_L, ph.field_g, c.field_b);
                kf.a(gf.field_d, (byte) -104, pa.field_L, ph.field_g, hl.field_n);
                kf.a(cn.field_d, (byte) -104, pa.field_L, ph.field_g, oa.field_e);
                kf.a(wn.field_j, (byte) -104, pa.field_L, ph.field_g, ue.field_a);
                int discarded$14 = 9291;
                this.a(param1);
                int discarded$15 = 0;
                pr.a(gr.field_w);
                int discarded$16 = -86;
                int discarded$17 = 256;
                int discarded$18 = 3;
                int discarded$19 = 256;
                this.a();
                var6 = fb.field_b;
                var5 = ln.field_u.length + -1;
                L4: while (true) {
                  if (1 >= var5) {
                    L5: {
                      fb.field_b = dn.field_m[0];
                      if (param0 == -55) {
                        break L5;
                      } else {
                        var12 = null;
                        this.a((int[]) null, (ko[]) null, (eg) null, -92);
                        break L5;
                      }
                    }
                    L6: {
                      var24 = ln.field_u[1];
                      var47 = gr.field_w;
                      var24.a((byte) -115, 0, var24.field_j.length, var47);
                      if ((pd.field_i & 256L) == 0L) {
                        break L6;
                      } else {
                        ln.field_u[1].a(gr.field_w, 0);
                        break L6;
                      }
                    }
                    L7: {
                      fb.field_b = var6;
                      var26 = ln.field_u[0];
                      var48 = gr.field_w;
                      var26.a((byte) -98, 0, var26.field_j.length, var48);
                      if ((256L & pd.field_i) == 0L) {
                        break L7;
                      } else {
                        ln.field_u[0].a(gr.field_w, 0);
                        break L7;
                      }
                    }
                    if ((4194304L & pd.field_i) == 0L) {
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
                                      ((cj) this).a(var44, (byte) 106, false, var21, false);
                                      break L11;
                                    }
                                  }
                                  var5 = wn.field_j + -1;
                                  L12: while (true) {
                                    if (var5 < ue.field_a) {
                                      L13: {
                                        if ((pd.field_i & 1073741824L) == 0L) {
                                          var5 = 0;
                                          L14: while (true) {
                                            if (var21.length <= var5) {
                                              break L13;
                                            } else {
                                              L15: {
                                                if (!var21[var5].field_s) {
                                                  break L15;
                                                } else {
                                                  ((cj) this).a(var44, var21[var5]);
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
                                                stackOut_51_0 = this;
                                                stackOut_51_1 = (int[]) var4;
                                                stackOut_51_2 = 102;
                                                stackOut_51_3 = 1;
                                                stackOut_51_4 = (pq[]) var3_array;
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
                                                  break L18;
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
                                                  break L18;
                                                }
                                              }
                                              ((cj) this).a(stackIn_54_1, (byte) stackIn_54_2, stackIn_54_3 != 0, stackIn_54_4, stackIn_54_5 != 0);
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
                                                if ((1073741824L & pd.field_i) != 0L) {
                                                  break L20;
                                                } else {
                                                  param1.q(-1);
                                                  break L20;
                                                }
                                              }
                                              L21: {
                                                if ((1073741824L & pd.field_i) == 0L) {
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
                      return;
                    }
                  } else {
                    L26: {
                      fb.field_b = dn.field_m[-1 + var5];
                      var22 = ln.field_u[var5];
                      var46 = gr.field_w;
                      var22.a((byte) -122, 0, var22.field_j.length, var46);
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
                var45 = gr.field_w;
                var19.b((byte) 112, 0, var19.field_j.length, var45);
                var5++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var3 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var3;
            stackOut_71_1 = new StringBuilder().append("cj.W(").append(param0).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L27;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L27;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 41);
        }
    }

    private final void a() {
        if (fo.field_c[3][0][0] != fo.field_c[3][1][1]) {
            int discarded$0 = 256;
            cj.a(fo.field_c[3][0][1], fo.field_c[3][1][1], 13421772, 0);
        }
        int var5 = 0;
        if (fo.field_c[3][1][0] != fo.field_c[3][2][1]) {
            int discarded$1 = 256;
            cj.a(fo.field_c[3][1][1], fo.field_c[3][2][1], 13421772, 256);
        }
        if (fo.field_c[3][3][1] != fo.field_c[3][2][0]) {
            qh.c(0, fo.field_c[3][2][1], qh.field_l, fo.field_c[3][3][1] + -fo.field_c[3][2][1], 13421772, 256);
        }
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        int var5 = 256 - param3;
        int var6 = qh.field_j - qh.field_b;
        int var7 = param1 - param0;
        for (var8 = 0; var8 < var7; var8++) {
            qh.e(qh.field_b, param0 + var8, var6, 13421772, param3 + var8 * var5 / var7);
        }
    }

    final void a(int param0, di param1) {
        try {
            if (param0 != 1) {
                Object var4 = null;
                ((cj) this).a((al) null, 126);
            }
            ((cj) this).field_b = cg.a(param1, "", "pool_jungle");
            ((cj) this).field_i = cg.a(param1, "", "pool_jungle_win_jingle");
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "cj.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(cf param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 86 / ((param1 - 39) / 38);
            ((cj) this).field_bb = param0.a("jungle_ball_hard", true, "");
            jg discarded$1 = param0.a("jungle_ball_med", true, "");
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("cj.M(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
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
                          int discarded$1 = 0;
                          dn.field_m[var5] = tq.a(md.a(var7, md.a(var7 << 16, var7 << 8)), var6);
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

    private final void a(uf param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            var3_int = param0.field_eb.b(-128);
            L1: {
              qh.d(0, var3_int, 640, -var3_int + 480, ((cj) this).field_v, 16128);
              var4 = ((cj) this).field_B.field_z << 1;
              var5 = ((cj) this).field_B.field_A << 1;
              var6 = (int)(-param0.field_eb.a(true) * (double)var4 / 2.0 / 3.141592653589793);
              var7 = -200 + var3_int;
              if (0 < var7) {
                qh.f(0, 0, 640, var7, ((cj) this).field_B.field_D[0]);
                break L1;
              } else {
                break L1;
              }
            }
            ((cj) this).field_B.c(var6 + -var4, var7, var4, var5);
            var8 = ((cj) this).field_B.field_A + var7;
            L2: while (true) {
              if (var8 >= qh.field_g) {
                L3: {
                  if (-640 + ((cj) this).field_B.field_z <= var6 >> 16) {
                    break L3;
                  } else {
                    ((cj) this).field_B.c(var6, var7, var4, var5);
                    break L3;
                  }
                }
                break L0;
              } else {
                ((cj) this).field_B.d(((cj) this).field_B.field_A - 1, -var4 + var6, var8);
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("cj.R(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 9291 + 41);
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
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var7 = Pool.field_O;
        var3 = 2;
        L0: while (true) {
          if (~var3 <= ~mc.field_j.length) {
            return;
          } else {
            L1: {
              L2: {
                if (null == mc.field_j[var3]) {
                  break L2;
                } else {
                  if (mc.field_j[var3].field_o.i()) {
                    break L2;
                  } else {
                    if (!mc.field_j[var3].field_o.b(-109)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                if (mc.field_j[var3] == null) {
                  stackOut_8_0 = 11;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = 22;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              var4 = ga.a(stackIn_9_0, true, ea.field_r);
              var6 = var4;
              if (var6 == 0) {
                mc.field_j[var3] = mn.a(-24296, nb.a(((cj) this).field_db, 100, param1, ga.a(128, true, ea.field_r)));
                break L1;
              } else {
                if (var6 != 1) {
                  if (2 == var6) {
                    mc.field_j[var3] = mn.a(-24296, nb.a(((cj) this).field_kb, 100, param1, ga.a(128, true, ea.field_r)));
                    break L1;
                  } else {
                    if (var6 != 3) {
                      if (4 != var6) {
                        if (var6 == 5) {
                          mc.field_j[var3] = mn.a(-24296, nb.a(((cj) this).field_Z, 100, param1, ga.a(128, true, ea.field_r)));
                          break L1;
                        } else {
                          if (var6 != 6) {
                            if (var6 != 7) {
                              if (var6 != 8) {
                                if (var6 != 9) {
                                  if (var6 == 10) {
                                    mc.field_j[var3] = rq.a(126, nb.a(((cj) this).field_gb, 100, param1, ga.a(128, true, ea.field_r)));
                                    break L1;
                                  } else {
                                    L4: {
                                      var5 = (jg) (Object) mc.field_j[var3].field_o.field_n;
                                      if (var5 == ((cj) this).field_X) {
                                        break L4;
                                      } else {
                                        if (((cj) this).field_cb == var5) {
                                          break L4;
                                        } else {
                                          if (var5 == ((cj) this).field_Y) {
                                            break L4;
                                          } else {
                                            if (((cj) this).field_gb == var5) {
                                              break L4;
                                            } else {
                                              mc.field_j[var3] = mn.a(-24296, nb.a(var5, 100, param1, ga.a(128, true, ea.field_r)));
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    mc.field_j[var3] = rq.a(126, nb.a(var5, 100, param1, ga.a(128, true, ea.field_r)));
                                    break L1;
                                  }
                                } else {
                                  mc.field_j[var3] = rq.a(101, nb.a(((cj) this).field_Y, 100, param1, ga.a(128, true, ea.field_r)));
                                  break L1;
                                }
                              } else {
                                mc.field_j[var3] = rq.a(124, nb.a(((cj) this).field_cb, 100, param1, ga.a(128, true, ea.field_r)));
                                break L1;
                              }
                            } else {
                              mc.field_j[var3] = rq.a(126, nb.a(((cj) this).field_X, 100, param1, ga.a(128, true, ea.field_r)));
                              break L1;
                            }
                          } else {
                            mc.field_j[var3] = mn.a(-24296, nb.a(((cj) this).field_ab, 100, param1, ga.a(128, true, ea.field_r)));
                            break L1;
                          }
                        }
                      } else {
                        mc.field_j[var3] = mn.a(-24296, nb.a(((cj) this).field_T, 100, param1, ga.a(128, true, ea.field_r)));
                        break L1;
                      }
                    } else {
                      mc.field_j[var3] = mn.a(cq.a(-4577, 20231), nb.a(((cj) this).field_pb, 100, param1, ga.a(128, true, ea.field_r)));
                      break L1;
                    }
                  }
                } else {
                  mc.field_j[var3] = mn.a(-24296, nb.a(((cj) this).field_nb, 100, param1, ga.a(128, true, ea.field_r)));
                  break L1;
                }
              }
            }
            var3++;
            continue L0;
          }
        }
    }

    final void a(boolean param0, mm param1) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        int var7 = 0;
        Object var8 = null;
        double stackIn_14_0 = 0.0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_13_0 = 0.0;
        double stackOut_12_0 = 0.0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
                var8 = null;
                ((cj) this).a((al) null, 35);
                break L3;
              }
            }
            L4: {
              var3_double = param1.d(8);
              if ((4194304L & pd.field_i) != 0L) {
                stackOut_13_0 = 12000.0;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              } else {
                stackOut_12_0 = 2048.0;
                stackIn_14_0 = stackOut_12_0;
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
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("cj.VA(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final void a(al param0, int param1) {
        try {
            super.a(param0, param1);
            jo.a(0.8999999761581421f, 1.0f, 0.8999999761581421f, 0.0833333358168602f, -31792);
            ln.field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "cj.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void o() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        p[] var8 = null;
        p[] var9 = null;
        p[] var10 = null;
        p[] var11 = null;
        p[] var12 = null;
        p[] var13 = null;
        var7 = Pool.field_O;
        th.field_l = new p[-sg.field_S - -nd.field_l + (mn.field_a + -gk.field_ib + (-hr.field_t + nf.field_T) + (((cj) this).field_O.length + -kp.field_f + (ml.field_j - ec.field_c))) - (-im.field_Wb - vh.field_L + (qf.field_i - 3 * (-ka.field_q + om.field_x)) + (-((-or.field_h + mm.field_i) * 3) + -(3 * (ca.field_h - nm.field_e))))];
        var3 = 0;
        cq.field_c = var3;
        var2 = ec.field_c;
        L0: while (true) {
          if (var2 >= im.field_Wb) {
            c.field_b = var3;
            ta.field_c = var3;
            var2 = qf.field_i;
            L1: while (true) {
              if (vh.field_L <= var2) {
                ue.field_a = var3;
                am.field_h = var3;
                var2 = ka.field_q;
                L2: while (true) {
                  if (var2 >= om.field_x) {
                    wn.field_j = var3;
                    oa.field_e = var3;
                    var2 = nm.field_e;
                    L3: while (true) {
                      if (ca.field_h <= var2) {
                        hl.field_n = var3;
                        cn.field_d = var3;
                        var2 = or.field_h;
                        L4: while (true) {
                          if (var2 >= mm.field_i) {
                            var2 = sg.field_S;
                            L5: while (true) {
                              if (nd.field_l <= var2) {
                                gf.field_d = var3;
                                ph.field_g = new int[th.field_l.length];
                                pa.field_L = new int[th.field_l.length];
                                var4 = 0;
                                L6: while (true) {
                                  if (ph.field_g.length <= var4) {
                                    return;
                                  } else {
                                    ph.field_g[var4] = var4;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var4 = var2;
                                var13 = th.field_l;
                                var6 = var3;
                                ((cj) this).a(0, var6, 0, 0, 0, var4, var13);
                                var3 += 2;
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
                    ((cj) this).a(var10, 0, 0, false, ((cj) this).field_O[var4], var6, ((cj) this).field_M[var4], 0);
                    var3 += 4;
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
          } else {
            var4 = var2;
            var8 = th.field_l;
            var6 = var3;
            ((cj) this).a(0, var6, 0, 0, 0, var4, var8);
            var3 += 2;
            var2++;
            continue L0;
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
