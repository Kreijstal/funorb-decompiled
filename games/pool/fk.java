/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fk extends oo {
    private jg field_db;
    static int field_Z;
    private jg field_W;
    private byte field_S;
    private int[] field_L;
    private nb field_bb;
    private jg field_O;
    private jg field_hb;
    private jg field_fb;
    private jg field_J;
    static lq field_cb;
    private jg field_Y;
    static int field_ab;
    private ji[] field_K;
    private jg field_Q;
    static int field_V;
    private jg field_N;
    private int[] field_R;
    static String field_eb;
    private int[] field_X;
    private int[] field_M;
    static hr field_gb;
    private jg field_T;
    private jg field_U;
    private jg field_P;

    final void a(al param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        int var5_int = 0;
        int var8 = Pool.field_O;
        super.a(param0, param1);
        t.field_a = new int[3][17][33];
        ro.field_v = new int[3][17][33];
        fm.field_K = new jd[16][32];
        cn.field_a = new jd[16][32];
        for (var3 = 0; -17 <= var3; var3++) {
            var4_int = var3 * 2304 / 16;
            for (var5_int = 0; -33 >= var5_int; var5_int++) {
                t.field_a[0][var3][var5_int] = 4608 * var5_int / 32;
                t.field_a[1][var3][var5_int] = var4_int;
                t.field_a[2][var3][var5_int] = 0;
            }
        }
        for (var3 = 0; -17 < (var3 ^ -1); var3++) {
            for (var4_int = 0; (var4_int ^ -1) > -33; var4_int++) {
                fm.field_K[var3][var4_int] = new jd();
                cn.field_a[var3][var4_int] = new jd();
            }
        }
        v.field_i = ta.a(new int[4], param1 + -22022);
        this.o(10);
        ((fk) this).field_K = new ji[12];
        for (var3 = 0; -7 < (var3 ^ -1); var3++) {
            bf var4 = param0.field_c[(var3 * 4 - -3) % param0.field_c.length];
            bf var5 = param0.field_c[(var3 * 4 - -4) % param0.field_c.length];
            bf var6 = param0.field_c[(5 + 4 * var3) % param0.field_c.length];
            bf var7 = param0.field_c[(6 + 4 * var3) % param0.field_c.length];
            ((fk) this).field_K[2 * var3] = new ji(new int[6]);
            ((fk) this).field_K[1 + var3 * 2] = new ji(new int[6]);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          var5 = 119 / ((param2 - -44) / 56);
          super.a(param0, param1, (byte) -104, param3);
          var6 = param0;
          if ((var6 ^ -1) == -6) {
            var6 = ga.a(4, true, ea.field_r);
            if (0 == var6) {
              kf discarded$12 = kp.a(100, ((fk) this).field_hb, param3, param1);
              break L0;
            } else {
              if (var6 != 1) {
                if (-3 == (var6 ^ -1)) {
                  kf discarded$13 = kp.a(100, ((fk) this).field_db, param3, param1);
                  break L0;
                } else {
                  if (var6 == 3) {
                    kf discarded$14 = kp.a(100, ((fk) this).field_T, param3, param1);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                kf discarded$15 = kp.a(100, ((fk) this).field_N, param3, param1);
                break L0;
              }
            }
          } else {
            if (2 != var6) {
              if (3 != var6) {
                if ((var6 ^ -1) == -8) {
                  kf discarded$16 = kp.a(100, ((fk) this).field_W, param3, param1);
                  break L0;
                } else {
                  if (var6 == -9) {
                    kf discarded$17 = kp.a(100, ((fk) this).field_Q, param3, param1);
                    break L0;
                  } else {
                    if (-7 != var6) {
                      if ((var6 ^ -1) == -5) {
                        kf discarded$18 = kp.a(100, ((fk) this).field_J, param3, param1);
                        break L0;
                      } else {
                        if ((var6 ^ -1) != -10) {
                          if (var6 == 10) {
                            kf discarded$19 = kp.a(100, ((fk) this).field_fb, param3, param1 * 64 >> -1998278968);
                            break L0;
                          } else {
                            break L0;
                          }
                        } else {
                          L1: {
                            if (null == ((fk) this).field_bb) {
                              break L1;
                            } else {
                              ((fk) this).a((byte) 73, true, param0);
                              break L1;
                            }
                          }
                          ((fk) this).field_bb = nb.a(((fk) this).field_U, 256, 0);
                          ((fk) this).field_bb.e(-1);
                          kf discarded$20 = mn.a(-24296, ((fk) this).field_bb);
                          ((fk) this).field_bb.d(4096, 16 * param1 >> 1289461288);
                          break L0;
                        }
                      }
                    } else {
                      kf discarded$21 = kp.a(100, ((fk) this).field_O, param3, param1);
                      System.out.println("playing respot the white");
                      break L0;
                    }
                  }
                }
              } else {
                kf discarded$22 = kp.a(100, ((fk) this).field_Y, param3, param1);
                break L0;
              }
            } else {
              kf discarded$23 = kp.a(100, ((fk) this).field_P, param3, param1);
              break L0;
            }
          }
        }
    }

    private final static void a(int[] param0) {
        int var1 = 0;
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
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] stackIn_1_0 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackOut_0_0 = null;
        int[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int[] stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var18 = f.a((byte) 100, param0);
          var17 = var18;
          var16 = var17;
          var15 = var16;
          param0 = var15;
          param0[0] = param0[0] - 2304;
          param0[1] = param0[1] - 1152;
          param0[0] = param0[0] >> 8;
          param0[1] = param0[1] >> 8;
          param0[2] = param0[2] >> 8;
          var1 = 65536 / qh.field_l;
          mf.field_l = mf.field_l & 127;
          me.field_x = -64 + mf.field_l;
          gn.field_b = 0 + mf.field_l;
          stackOut_0_0 = v.field_i;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (mf.field_l >= 16) {
            stackOut_2_0 = (int[]) (Object) stackIn_2_0;
            stackOut_2_1 = mf.field_l >> 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (int[]) (Object) stackIn_1_0;
            stackOut_1_1 = (16 - mf.field_l) * (v.field_i.length - 1) >> 4;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ba.field_tb = stackIn_3_0[stackIn_3_1];
          bm.field_h = 64 + mf.field_l;
          rb.field_g = 128 + mf.field_l;
          cl.field_g = v.field_i[64 + (mf.field_l >> 1)];
          eq.field_Y = 192 + mf.field_l;
          gn.field_d = 256 + mf.field_l;
          pn.field_s = v.field_i[128 + (mf.field_l >> 1)];
          mp.field_O = 320 + mf.field_l;
          ll.field_c = 384 + mf.field_l;
          nm.field_f = v.field_i[192 + (mf.field_l >> 1)];
          jp.field_V = ll.field_c * ll.field_c;
          var2 = qh.field_c;
          var3 = 256 - var18[2];
          var4 = var18[8] * var3;
          var5 = var18[11] * var3;
          var6 = ll.field_c - var18[0];
          var7 = ll.field_c - var18[1];
          var8 = var18[9] * var6 + var18[10] * var7 + var5 >> 16;
          if (var8 <= 0) {
            break L1;
          } else {
            var9 = qh.field_c + fb.field_d + (var18[6] * var6 + var18[7] * var7 + var4) >> 7 / var8;
            if (var9 <= 0) {
              break L1;
            } else {
              if (var9 >= var2) {
                break L1;
              } else {
                var2 = var9;
                break L1;
              }
            }
          }
        }
        L2: {
          var6 = -ll.field_c - var18[0];
          var7 = ll.field_c - var18[1];
          var8 = var18[9] * var6 + var18[10] * var7 + var5 >> 16;
          if (var8 <= 0) {
            break L2;
          } else {
            var9 = qh.field_c + fb.field_d + (var18[6] * var6 + var18[7] * var7 + var4) >> 7 / var8;
            if (var9 <= 0) {
              break L2;
            } else {
              if (var9 >= var2) {
                break L2;
              } else {
                var2 = var9;
                break L2;
              }
            }
          }
        }
        L3: {
          var6 = ll.field_c - var18[0];
          var7 = -ll.field_c - var18[1];
          var8 = var18[9] * var6 + var18[10] * var7 + var5 >> 16;
          if (var8 <= 0) {
            break L3;
          } else {
            var9 = qh.field_c + fb.field_d + (var18[6] * var6 + var18[7] * var7 + var4) >> 7 / var8;
            if (var9 <= 0) {
              break L3;
            } else {
              if (var9 >= var2) {
                break L3;
              } else {
                var2 = var9;
                break L3;
              }
            }
          }
        }
        L4: {
          var6 = -ll.field_c - var18[0];
          var7 = -ll.field_c - var18[1];
          var8 = var18[9] * var6 + var18[10] * var7 + var5 >> 16;
          if (var8 <= 0) {
            break L4;
          } else {
            var9 = qh.field_c + fb.field_d + (var18[6] * var6 + var18[7] * var7 + var4) >> 7 / var8;
            if (var9 <= 0) {
              break L4;
            } else {
              if (var9 >= var2) {
                break L4;
              } else {
                var2 = var9;
                break L4;
              }
            }
          }
        }
        var3 = var2 * qh.field_l;
        var4 = var2;
        L5: while (true) {
          if (var4 >= qh.field_g) {
            return;
          } else {
            var5 = var4 - 240;
            var10 = var18[9] + (var18[3] * (qh.field_b - 320) + var18[6] * var5 >> 9) >> 1;
            var11 = var18[10] + (var18[4] * (qh.field_b - 320) + var18[7] * var5 >> 9) >> 1;
            var12 = var18[11] + (var18[5] * (qh.field_b - 320) + var18[8] * var5 >> 9) >> 1;
            var13 = var10 * var10 + var11 * var11 + var12 * var12 >> 16;
            if (var13 > 0) {
              var13 = rf.a(var13, -126);
              var10 = lh.a(var13, (byte) -82, (long)var10);
              var11 = lh.a(var13, (byte) -125, (long)var11);
              var12 = lh.a(var13, (byte) -109, (long)var12);
              if (var12 != 0) {
                var14 = lh.a(var12, (byte) -62, (long)(256 - var18[2]));
                var6 = var18[0] + (var14 * var10 >> 16);
                var8 = var18[1] + (var14 * var11 >> 16);
                var10 = var18[9] + (var18[3] * (qh.field_j - 320) + var18[6] * var5 >> 9) >> 1;
                var11 = var18[10] + (var18[4] * (qh.field_j - 320) + var18[7] * var5 >> 9) >> 1;
                var12 = var18[11] + (var18[5] * (qh.field_j - 320) + var18[8] * var5 >> 9) >> 1;
                var13 = var10 * var10 + var11 * var11 + var12 * var12 >> 16;
                if (var13 > 0) {
                  var13 = rf.a(var13, -126);
                  var10 = lh.a(var13, (byte) -115, (long)var10);
                  var11 = lh.a(var13, (byte) -115, (long)var11);
                  var12 = lh.a(var13, (byte) -97, (long)var12);
                  if (var12 != 0) {
                    var14 = lh.a(var12, (byte) -100, (long)(256 - var18[2]));
                    var7 = var18[0] + (var14 * var10 >> 16);
                    var9 = var18[1] + (var14 * var11 >> 16);
                    var10 = (var9 - var8) * var1;
                    var11 = (var7 - var6) * var1;
                    var12 = (var8 << 16) + qh.field_b * var10;
                    var13 = (var6 << 16) + qh.field_b * var11;
                    fk.a(0, 0, 0, 0, var12, var13, var10, var11, var3);
                    var3 = var3 + qh.field_l;
                    var4++;
                    continue L5;
                  } else {
                    var4++;
                    continue L5;
                  }
                } else {
                  var4++;
                  continue L5;
                }
              } else {
                var4++;
                continue L5;
              }
            } else {
              var4++;
              continue L5;
            }
          }
        }
    }

    final void d(boolean param0) {
        super.d(param0);
        v.field_i = null;
        t.field_a = null;
        fm.field_K = null;
        ro.field_v = null;
        ma.field_b = null;
        cn.field_a = null;
        ((fk) this).field_K = null;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var9 = qh.field_b;
        L0: while (true) {
          if (var9 >= qh.field_j) {
            return;
          } else {
            L1: {
              var10 = param4 >> 16;
              var11 = param5 >> 16;
              if (var11 <= ll.field_c) {
                if (var10 <= ll.field_c) {
                  if (var11 >= -ll.field_c) {
                    if (var10 >= -ll.field_c) {
                      var12 = var11 * var11 + var10 * var10;
                      if (var12 < 0) {
                        break L1;
                      } else {
                        if (var12 <= jp.field_V) {
                          L2: {
                            param1 = ke.a(false, var12);
                            if (param1 <= me.field_x) {
                              break L2;
                            } else {
                              if (param1 >= gn.field_b) {
                                break L2;
                              } else {
                                L3: {
                                  param1 = (param1 - me.field_x - 32) * 255 >> 5;
                                  if (param1 >= 0) {
                                    break L3;
                                  } else {
                                    param1 = -param1;
                                    break L3;
                                  }
                                }
                                param0 = ba.field_tb;
                                param1 = 255 - param1 >> 1;
                                param2 = (param0 & 16711935) * param1;
                                param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                                param2 = qh.field_d[param8];
                                param3 = param0 + param2;
                                param0 = (param0 & 16711935) + (param2 & 16711935);
                                param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                                qh.field_d[param8] = param3 - param2 | param2 - (param2 >>> 8);
                                break L1;
                              }
                            }
                          }
                          L4: {
                            if (param1 <= bm.field_h) {
                              break L4;
                            } else {
                              if (param1 >= rb.field_g) {
                                break L4;
                              } else {
                                L5: {
                                  param1 = (param1 - bm.field_h - 32) * 255 >> 5;
                                  if (param1 >= 0) {
                                    break L5;
                                  } else {
                                    param1 = -param1;
                                    break L5;
                                  }
                                }
                                param0 = cl.field_g;
                                param1 = 255 - param1 >> 1;
                                param2 = (param0 & 16711935) * param1;
                                param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                                param2 = qh.field_d[param8];
                                param3 = param0 + param2;
                                param0 = (param0 & 16711935) + (param2 & 16711935);
                                param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                                qh.field_d[param8] = param3 - param2 | param2 - (param2 >>> 8);
                                break L1;
                              }
                            }
                          }
                          L6: {
                            if (param1 <= eq.field_Y) {
                              break L6;
                            } else {
                              if (param1 >= gn.field_d) {
                                break L6;
                              } else {
                                L7: {
                                  param1 = (param1 - eq.field_Y - 32) * 255 >> 5;
                                  if (param1 >= 0) {
                                    break L7;
                                  } else {
                                    param1 = -param1;
                                    break L7;
                                  }
                                }
                                param0 = pn.field_s;
                                param1 = 255 - param1 >> 1;
                                param2 = (param0 & 16711935) * param1;
                                param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                                param2 = qh.field_d[param8];
                                param3 = param0 + param2;
                                param0 = (param0 & 16711935) + (param2 & 16711935);
                                param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                                qh.field_d[param8] = param3 - param2 | param2 - (param2 >>> 8);
                                break L1;
                              }
                            }
                          }
                          if (param1 <= mp.field_O) {
                            break L1;
                          } else {
                            if (param1 >= ll.field_c) {
                              break L1;
                            } else {
                              L8: {
                                param1 = (param1 - mp.field_O - 32) * 255 >> 5;
                                if (param1 >= 0) {
                                  break L8;
                                } else {
                                  param1 = -param1;
                                  break L8;
                                }
                              }
                              param0 = nm.field_f;
                              param1 = 255 - param1 >> 1;
                              param2 = (param0 & 16711935) * param1;
                              param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                              param2 = qh.field_d[param8];
                              param3 = param0 + param2;
                              param0 = (param0 & 16711935) + (param2 & 16711935);
                              param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                              qh.field_d[param8] = param3 - param2 | param2 - (param2 >>> 8);
                              break L1;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            param4 = param4 + param6;
            param5 = param5 + param7;
            param8++;
            var9++;
            continue L0;
          }
        }
    }

    final int h(int param0) {
        if (param0 != 684) {
            this.n(16);
        }
        return 0;
    }

    final void a(cf param0, int param1) {
        ((fk) this).field_P = param0.a("", "plasma_ball_hard", (byte) 121);
        ((fk) this).field_Y = param0.a("", "plasma_ball_soft", (byte) 126);
        ((fk) this).field_W = param0.a("", "plasma_cue_hard", (byte) 126);
        int var3 = -128 % ((39 - param1) / 38);
        ((fk) this).field_Q = param0.a("", "plasma_cue_soft", (byte) 127);
        ((fk) this).field_J = param0.a("", "plasma_pot", (byte) 123);
        ((fk) this).field_O = param0.a("", "plasma_respot_the_white", (byte) 125);
        ((fk) this).field_hb = param0.a("", "plasma_cushion1", (byte) 127);
        ((fk) this).field_N = param0.a("", "plasma_cushion2", (byte) 124);
        ((fk) this).field_db = param0.a("", "plasma_cushion3", (byte) 124);
        ((fk) this).field_T = param0.a("", "plasma_cushion4", (byte) 122);
        ((fk) this).field_fb = param0.a("", "plasma_loop", (byte) 125);
        ((fk) this).field_U = param0.a("", "plasma_shot_mode_loop", (byte) 123);
    }

    final byte g(int param0) {
        int var2 = 83 % ((9 - param0) / 63);
        return (byte) -128;
    }

    private final void a(pq[] param0, byte param1) {
        int var3_int = 0;
        jd[] var3 = null;
        jd[] var4 = null;
        int var4_int = 0;
        jd[] var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        jd[][] var6 = null;
        pq var7 = null;
        pq var7_ref = null;
        pq var8 = null;
        pq var9 = null;
        jd var9_ref = null;
        pq var10 = null;
        pq var10_ref = null;
        pq var11 = null;
        pq var12 = null;
        jd var12_ref = null;
        pq var13 = null;
        pq var13_ref = null;
        pq var14 = null;
        pq var15 = null;
        jd var15_ref = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = Pool.field_O;
        var3_int = 0;
        L0: while (true) {
          if (param0.length <= var3_int) {
            var3 = fm.field_K[0];
            var4 = var3;
            var5 = var4;
            var6_int = 0;
            if (param1 == -122) {
              L1: while (true) {
                if (fm.field_K.length <= var6_int) {
                  var6 = fm.field_K;
                  fm.field_K = cn.field_a;
                  cn.field_a = var6;
                  return;
                } else {
                  L2: {
                    if (var6_int + 1 >= fm.field_K.length) {
                      break L2;
                    } else {
                      var5 = fm.field_K[1 + var6_int];
                      break L2;
                    }
                  }
                  var7 = param0[0];
                  var8 = var7;
                  var9 = var8;
                  var10 = param0[0];
                  var11 = var10;
                  var12 = var11;
                  var13 = param0[0];
                  var14 = var13;
                  var15 = var14;
                  var16 = 0;
                  L3: while (true) {
                    if (var16 >= param0.length) {
                      var3 = var4;
                      var4 = var5;
                      var6_int++;
                      continue L1;
                    } else {
                      L4: {
                        if (1 + var16 < param0.length) {
                          var12_ref = var4[1 + var16];
                          var15_ref = var5[1 + var16];
                          var9_ref = var3[var16 + 1];
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var17 = (10 * ((jd) (Object) var14).field_g >> -1093222840) + ((var12_ref.field_g * 10 >> 486663240) + (((jd) (Object) var10).field_g * 10 >> -1412194712) + ((5 * var9_ref.field_g >> 1788707528) + ((5 * ((jd) (Object) var7).field_g >> -865602264) - -(10 * ((jd) (Object) var8).field_g >> 1730619720) - -(((jd) (Object) var11).field_g * 180 >> 1495002312)))) + ((5 * ((jd) (Object) var13).field_g >> -1945874744) - -(5 * var15_ref.field_g >> 35663080));
                        if (-4097 > (var17 ^ -1)) {
                          var17 = 4096;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if ((var17 ^ -1) > -1) {
                          var17 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      cn.field_a[var6_int][var16].field_g = var17;
                      var7_ref = var8;
                      var10_ref = var11;
                      var8 = (pq) (Object) var9_ref;
                      var13_ref = var14;
                      var11 = (pq) (Object) var12_ref;
                      var14 = (pq) (Object) var15_ref;
                      var16++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            if (param0[var3_int].field_s) {
              L7: {
                var4_int = (param0[var3_int].field_g >> -1113032755) * 32 / 4608;
                var5_int = 16 * (param0[var3_int].field_k >> -17402643) / 2304;
                if (var4_int <= -1) {
                  if (-33 > var4_int) {
                    break L7;
                  } else {
                    var4_int = 31;
                    break L7;
                  }
                } else {
                  var4_int = 0;
                  break L7;
                }
              }
              L8: {
                if ((var5_int ^ -1) <= -1) {
                  if (16 <= var5_int) {
                    var5_int = 15;
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  var5_int = 0;
                  break L8;
                }
              }
              fm.field_K[var5_int][var4_int].field_g = fm.field_K[var5_int][var4_int].field_g + (1024 - -ga.a(256, true, ea.field_r));
              var3_int++;
              continue L0;
            } else {
              var3_int++;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, int[] param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Pool.field_O;
        int[] var9 = f.a((byte) 96, param1);
        int[] var13 = var9;
        var9[0] = var9[0] - 2304;
        var9[1] = var9[1] - 1152;
        var9[2] = var9[2] >> 0;
        var9[1] = var9[1] >> 0;
        var9[0] = var9[0] >> 0;
        var9[1] = var9[1] >> 8;
        var9[0] = var9[0] >> 8;
        int var4 = -81 / ((param0 - -64) / 52);
        var9[2] = var9[2] >> 8;
        for (var5 = 0; ma.field_b.length > var5; var5++) {
            for (var6 = 0; var6 < ma.field_b[var5].length; var6++) {
                for (var7 = 0; var7 < ma.field_b[var5][var6].length; var7++) {
                    ma.field_b[var5][var6][var7].a(-56, var13);
                }
            }
        }
    }

    final void b(int param0, int param1) {
        if (!(((fk) this).field_bb == null)) {
            ((fk) this).field_bb.f(64 * param1 / 4096 + 256);
        }
        int var3 = -113 % ((param0 - 11) / 52);
    }

    public static void m(int param0) {
        field_eb = null;
        field_cb = null;
        field_gb = null;
        int var1 = -122 / ((param0 - -65) / 38);
    }

    private final void a(boolean param0, int[] param1, uf param2) {
        int var4 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int[] var5 = null;
        int var9 = Pool.field_O;
        if (param0) {
            byte discarded$0 = ((fk) this).g(2);
        }
        if (!(!param2.k(-38))) {
            if (id.field_c.field_g) {
                param2.field_I.a(id.field_c.field_l, param2.field_G.field_k, (byte) 47, param2.field_G.field_h, param2.field_G.field_e, param2.field_G.field_d);
                id.field_c.field_g = false;
            }
            var4 = param2.field_f;
            ((fk) this).field_R[0] = (id.field_c.field_l[0] >> 855981741) + (var4 * id.field_c.field_l[9] >> 1256540685);
            ((fk) this).field_X[0] = (id.field_c.field_l[10] * var4 >> -90699795) + (id.field_c.field_l[1] >> 558844909);
            ((fk) this).field_L[0] = (id.field_c.field_l[11] * var4 >> 85220429) + (id.field_c.field_l[2] >> 483161549);
            ((fk) this).field_M[0] = 1;
            ((fk) this).field_R[1] = ((var4 + 456) * id.field_c.field_l[9] >> -92631571) + (id.field_c.field_l[0] >> 1542128109);
            ((fk) this).field_X[1] = ((456 - -var4) * id.field_c.field_l[10] >> 779812205) + (id.field_c.field_l[1] >> -487783603);
            ((fk) this).field_L[1] = (id.field_c.field_l[11] * (456 - -var4) >> 1562723661) + (id.field_c.field_l[2] >> 240674253);
            ((fk) this).field_M[1] = 3;
            for (var5_int = 0; ((fk) this).field_R.length > var5_int; var5_int++) {
                var6 = ((fk) this).field_R[var5_int] + -param1[0];
                var7 = -param1[1] + ((fk) this).field_X[var5_int];
                var8 = -param1[2] + ((fk) this).field_L[var5_int];
                ((fk) this).field_R[var5_int] = param1[3] * var6 + var7 * param1[4] - -(param1[5] * var8) >> 283284880;
                ((fk) this).field_X[var5_int] = param1[8] * var8 + (var7 * param1[7] + param1[6] * var6) >> 362764336;
                ((fk) this).field_L[var5_int] = var8 * param1[11] + (param1[9] * var6 - -(var7 * param1[10])) >> -1329703024;
            }
            if (((fk) this).field_L[0] <= 0) {
                // ifle L827
            }
            if (!(hk.a(113, ((fk) this).field_R[1], ((fk) this).field_R[0], ((fk) this).field_X[1], ((fk) this).field_L[1], ((fk) this).field_L[0], ((fk) this).field_X[0]))) {
                ((fk) this).field_S = ic.a(((fk) this).field_X, 0, ((fk) this).field_R, ((fk) this).field_M, ((fk) this).field_L, 4);
                var10 = 0;
                var5_int = var10;
                while (((fk) this).field_R.length > var10) {
                    ((fk) this).field_R[var10] = 1280 - -((((fk) this).field_R[var10] << 1192030443) / ((fk) this).field_L[var10]);
                    ((fk) this).field_X[var10] = 960 - -((((fk) this).field_X[var10] << -576204469) / ((fk) this).field_L[var10]);
                    ((fk) this).field_M[var10] = (((fk) this).field_M[var10] << 1349214896) / ((fk) this).field_L[var10];
                    var10++;
                }
                var5 = bc.field_c;
                if (!(!(param2.field_I.field_f instanceof af))) {
                    var6 = ((af) (Object) param2.field_I.field_f).a(-1);
                    if (-1 != var6) {
                        var5 = hf.a(var6, (byte) 73);
                    }
                }
                wn.a((byte) (0 == (1 & ((fk) this).field_S) ? 1 : 2), (byte) ((((fk) this).field_S & 2) == 0 ? 1 : 2), var5, ((fk) this).field_X, 127, 0, ((fk) this).field_R, ((fk) this).field_M);
            }
            param2.D(-125);
        }
    }

    final void a(int param0, uf param1) {
        int var3 = 0;
        int var4 = Pool.field_O;
        super.a(param0, param1);
        for (var3 = 0; var3 < ((fk) this).field_K.length; var3++) {
            ((fk) this).field_K[var3].a((byte) -43);
        }
        this.n(2);
        this.a(param1.field_I.field_l, (byte) -122);
        mf.field_l = mf.field_l - 1;
    }

    final void a(int param0, di param1) {
        ((fk) this).field_b = cg.a(param1, "", "pool_plasma");
        ((fk) this).field_i = cg.a(param1, "", "pool_plasma_win_jingle");
        ((fk) this).field_n = cg.a(param1, "", "pool_plasma_lose_jingle");
        if (param0 != 1) {
            field_gb = null;
        }
    }

    private final void n(int param0) {
        int var2 = 0;
        bl[][] var3 = null;
        int var4_int = 0;
        bl[] var4 = null;
        bl[] var5 = null;
        bl[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        bl var7_ref_bl = null;
        bl var8 = null;
        bl var8_ref = null;
        bl var9 = null;
        bl var10 = null;
        bl var11 = null;
        bl var11_ref = null;
        bl var12 = null;
        bl var13 = null;
        bl var13_ref = null;
        bl var14 = null;
        bl var14_ref = null;
        bl var15 = null;
        bl var16 = null;
        bl var16_ref = null;
        int var17 = 0;
        int var18 = 0;
        bl[] var19 = null;
        var18 = Pool.field_O;
        if (param0 == 2) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ma.field_b.length) {
              return;
            } else {
              var3 = ma.field_b[var2];
              var4_int = 0;
              L1: while (true) {
                if (-17 >= var4_int) {
                  var4 = var3[0];
                  var5 = var4;
                  var6 = var5;
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= 16) {
                      var2++;
                      continue L0;
                    } else {
                      L3: {
                        if (var7 >= 15) {
                          break L3;
                        } else {
                          var6 = var3[1 + var7];
                          break L3;
                        }
                      }
                      var8 = var4[0];
                      var9 = var8;
                      var10 = var9;
                      var11 = var5[0];
                      var12 = var11;
                      var13 = var12;
                      var14 = var6[0];
                      var15 = var14;
                      var16 = var15;
                      var17 = 0;
                      L4: while (true) {
                        if (var17 >= 16) {
                          var4 = var5;
                          var5 = var6;
                          var7++;
                          continue L2;
                        } else {
                          L5: {
                            if (15 > var17) {
                              var16_ref = var6[var17 - -1];
                              var13_ref = var5[var17 + 1];
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (128 >= var12.field_E) {
                              break L6;
                            } else {
                              L7: {
                                if (-1 != (var11.field_E ^ -1)) {
                                  if (var13_ref.field_E != 0) {
                                    break L7;
                                  } else {
                                    if (ga.a(250, true, ea.field_r) != 0) {
                                      break L7;
                                    } else {
                                      var13_ref.field_E = var13_ref.field_E + 1;
                                      break L7;
                                    }
                                  }
                                } else {
                                  if (var13_ref.field_E != 0) {
                                    break L7;
                                  } else {
                                    if (ga.a(250, true, ea.field_r) != 0) {
                                      break L7;
                                    } else {
                                      var13_ref.field_E = var13_ref.field_E + 1;
                                      break L7;
                                    }
                                  }
                                }
                              }
                              if (var9.field_E == 0) {
                                if (ga.a(250, true, ea.field_r) == 0) {
                                  var9.field_E = var9.field_E + 1;
                                  if (var15.field_E != 0) {
                                    break L6;
                                  } else {
                                    if (0 != ga.a(250, true, ea.field_r)) {
                                      break L6;
                                    } else {
                                      var15.field_E = var15.field_E + 1;
                                      break L6;
                                    }
                                  }
                                } else {
                                  if (var15.field_E != 0) {
                                    break L6;
                                  } else {
                                    if (0 != ga.a(250, true, ea.field_r)) {
                                      break L6;
                                    } else {
                                      var15.field_E = var15.field_E + 1;
                                      break L6;
                                    }
                                  }
                                }
                              } else {
                                if (var15.field_E != 0) {
                                  break L6;
                                } else {
                                  if (0 != ga.a(250, true, ea.field_r)) {
                                    break L6;
                                  } else {
                                    var15.field_E = var15.field_E + 1;
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          L8: {
                            if (-1 > (var12.field_y ^ -1)) {
                              L9: {
                                if (var8.field_c) {
                                  if (var10.field_c) {
                                    break L9;
                                  } else {
                                    if (-1 == var10.field_E) {
                                      var10.field_c = true;
                                      break L9;
                                    } else {
                                      if (var10.field_c) {
                                        break L9;
                                      } else {
                                        if (-1 != var10.field_E) {
                                          break L9;
                                        } else {
                                          var10.field_c = true;
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (var10.field_c) {
                                    break L9;
                                  } else {
                                    if (-1 != var10.field_E) {
                                      break L9;
                                    } else {
                                      var10.field_c = true;
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (var14.field_c) {
                                  break L10;
                                } else {
                                  if (0 != var14.field_E) {
                                    break L10;
                                  } else {
                                    var14.field_c = true;
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (var16_ref.field_c) {
                                  break L11;
                                } else {
                                  if (-1 == (var16_ref.field_E ^ -1)) {
                                    var16_ref.field_c = true;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var8.field_E = var8.field_E + 1;
                              var14.field_E = var14.field_E + 1;
                              var10.field_E = var10.field_E + 1;
                              var16_ref.field_E = var16_ref.field_E + 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var8_ref = var9;
                          var9 = var10;
                          var11_ref = var12;
                          var12 = var13_ref;
                          var14_ref = var15;
                          var15 = var16_ref;
                          var17++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  var19 = var3[var4_int];
                  var6_int = 0;
                  L12: while (true) {
                    if (-17 <= var6_int) {
                      var4_int++;
                      continue L1;
                    } else {
                      L13: {
                        var7_ref_bl = var19[var6_int];
                        if ((var7_ref_bl.field_E ^ -1) < -1) {
                          if (!var7_ref_bl.field_c) {
                            var7_ref_bl.field_E = var7_ref_bl.field_E - 2;
                            if (var7_ref_bl.field_E > 0) {
                              break L13;
                            } else {
                              var7_ref_bl.field_E = 0;
                              break L13;
                            }
                          } else {
                            var7_ref_bl.field_E = var7_ref_bl.field_E + 2;
                            if (-257 >= (var7_ref_bl.field_E ^ -1)) {
                              L14: {
                                if (0 != ga.a(10, true, ea.field_r)) {
                                  break L14;
                                } else {
                                  var7_ref_bl.field_y = var7_ref_bl.field_y + 1;
                                  break L14;
                                }
                              }
                              var7_ref_bl.field_c = false;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        } else {
                          if (ga.a(2500, true, ea.field_r) == 0) {
                            var7_ref_bl.field_E = 1;
                            var7_ref_bl.field_c = true;
                            break L13;
                          } else {
                            var7_ref_bl.field_E = 0;
                            break L13;
                          }
                        }
                      }
                      if (-1 > (var7_ref_bl.field_y ^ -1)) {
                        var7_ref_bl.field_y = var7_ref_bl.field_y + 1;
                        if (var7_ref_bl.field_y >= 256) {
                          var7_ref_bl.field_y = 0;
                          var6_int++;
                          continue L12;
                        } else {
                          var6_int++;
                          continue L12;
                        }
                      } else {
                        var6_int++;
                        continue L12;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, uf param1) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int[] var6 = null;
        int var5 = 0;
        int var10 = Pool.field_O;
        pq[] var14 = param1.field_I.field_l;
        pq[] var3 = var14;
        int[] var20 = param1.field_ab;
        int[] var18 = var20;
        int[] var16 = var18;
        int[] var13 = var16;
        int[] var4 = var13;
        ((fk) this).a(false, var20, var14);
        en.b(0);
        fk.a(var20);
        int[] var21 = f.a((byte) 77, var20);
        int[] var19 = var21;
        int[] var17 = var19;
        int[] var15 = var17;
        int[] var5_ref_int__ = var15;
        var5_ref_int__[0] = var5_ref_int__[0] - 2304;
        var5_ref_int__[1] = var5_ref_int__[1] - 1152;
        var5_ref_int__[2] = var5_ref_int__[2] >> 2;
        var5_ref_int__[1] = var5_ref_int__[1] >> 2;
        var5_ref_int__[0] = var5_ref_int__[0] >> 2;
        ((fk) this).field_R[0] = 0;
        ((fk) this).field_X[0] = 0;
        ((fk) this).field_L[0] = 16384;
        ((fk) this).field_R[1] = 0;
        ((fk) this).field_M[0] = 4;
        ((fk) this).field_X[1] = 0;
        ((fk) this).field_L[1] = 1;
        ((fk) this).field_M[1] = 4;
        for (var6_int = 0; var6_int < ((fk) this).field_R.length; var6_int++) {
            var7 = ((fk) this).field_R[var6_int] + -var21[0];
            var8 = ((fk) this).field_X[var6_int] - var21[1];
            var9 = ((fk) this).field_L[var6_int] + -var21[2];
            ((fk) this).field_R[var6_int] = var9 * var21[5] + var21[3] * var7 + var21[4] * var8 >> 1826206160;
            ((fk) this).field_X[var6_int] = var21[7] * var8 + (var21[6] * var7 + var9 * var21[8]) >> -1888273488;
            ((fk) this).field_L[var6_int] = var21[11] * var9 + (var21[9] * var7 - -(var8 * var21[10])) >> -625361968;
        }
        if (((fk) this).field_L[0] >= -1) {
            // if_icmpge L674
        }
        if (!(hk.a(59, ((fk) this).field_R[1], ((fk) this).field_R[0], ((fk) this).field_X[1], ((fk) this).field_L[1], ((fk) this).field_L[0], ((fk) this).field_X[0]))) {
            ((fk) this).field_S = ic.a(((fk) this).field_X, 0, ((fk) this).field_R, ((fk) this).field_M, ((fk) this).field_L, 4);
            var12 = 0;
            var6_int = var12;
            while (((fk) this).field_R.length > var12) {
                ((fk) this).field_R[var12] = 1280 - -((((fk) this).field_R[var12] << 1521114923) / ((fk) this).field_L[var12]);
                ((fk) this).field_X[var12] = (((fk) this).field_X[var12] << -19690805) / ((fk) this).field_L[var12] + 960;
                ((fk) this).field_M[var12] = (((fk) this).field_M[var12] << 2053933520) / ((fk) this).field_L[var12];
                var12++;
            }
            var6 = bc.field_c;
            if (param1.field_I.field_f instanceof af) {
                var7 = ((af) (Object) param1.field_I.field_f).a(-1);
                if ((var7 ^ -1) != 0) {
                    var6 = hf.a(var7, (byte) 96);
                }
            }
            wn.a((byte) ((1 & ((fk) this).field_S) != 0 ? 2 : 1), (byte) (-1 != (2 & ((fk) this).field_S ^ -1) ? 2 : 1), var6, ((fk) this).field_X, 127, 0, ((fk) this).field_R, ((fk) this).field_M);
        }
        this.b((byte) 44, var20);
        ((fk) this).a(var20, (byte) 79, false, var14, false);
        ((fk) this).a(77, var20);
        this.c((byte) -25, var20);
        for (var5 = 0; ((fk) this).field_K.length > var5; var5++) {
            ((fk) this).field_K[var5].a(false, (byte) 98, var20);
        }
        if (0L == (pd.field_i & 1073741824L)) {
            ((fk) this).a(var4, (byte) 122, true, var3, -1 == (param1.field_I.j(20).field_q ^ -1) ? true : false);
        }
        if (param0 != -55) {
            Object var11 = null;
            this.c((byte) 102, (int[]) null);
        }
        if (!(-1L != (1073741824L & pd.field_i ^ -1L))) {
            this.a(false, var20, param1);
        }
    }

    private final void c(byte param0, int[] param1) {
        int[] var46 = null;
        int[] var41 = null;
        int[] var36 = null;
        int[] var31 = null;
        int[] var7 = null;
        int[] var48 = null;
        int[] var43 = null;
        int[] var38 = null;
        int[] var33 = null;
        int[] var8 = null;
        int[] var47 = null;
        int[] var42 = null;
        int[] var37 = null;
        int[] var32 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jd[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        jd var24 = null;
        int var25 = 0;
        int var26 = Pool.field_O;
        int var3 = 0;
        int[] var44 = ro.field_v[0][var3];
        int[] var39 = var44;
        int[] var34 = var39;
        int[] var29 = var34;
        int[] var27 = var29;
        int[] var4 = var27;
        int[] var5 = ro.field_v[1][var3];
        if (param0 != -25) {
            ((fk) this).field_Y = null;
        }
        int[] var45 = ro.field_v[2][var3];
        int[] var40 = var45;
        int[] var35 = var40;
        int[] var30 = var35;
        int[] var28 = var30;
        int[] var6 = var28;
        pl.a(var5, var44.length, 0, param1, 0, var27, t.field_a[1][var3], t.field_a[2][var3], t.field_a[0][var3].length, var45, -26182, t.field_a[0][var3]);
        for (var3 = 1; 16 >= var3; var3++) {
            var46 = ro.field_v[0][var3];
            var41 = var46;
            var36 = var41;
            var31 = var36;
            var7 = var31;
            var48 = ro.field_v[1][var3];
            var43 = var48;
            var38 = var43;
            var33 = var38;
            var8 = var33;
            var47 = ro.field_v[2][var3];
            var42 = var47;
            var37 = var42;
            var32 = var37;
            var9 = var32;
            pl.a(var8, var46.length, 0, param1, 0, var7, t.field_a[1][var3], t.field_a[2][var3], t.field_a[0][var3].length, var47, -26182, t.field_a[0][var3]);
            var10 = param1[0];
            var11 = param1[0];
            var12 = param1[0];
            var13 = var46[0];
            var14 = var48[0];
            var15 = var47[0];
            var16 = fm.field_K[-1 + var3];
            for (var17 = 1; 32 >= var17; var17++) {
                var18 = param1[var17];
                var19 = param1[var17];
                var20 = param1[var17];
                var21 = var46[var17];
                var22 = var48[var17];
                var23 = var47[var17];
                if (0 < var12) {
                    if (0 < var20) {
                        if (var15 < -1) {
                            if (!(-1 >= var23)) {
                                var24 = var16[-1 + var17];
                                var25 = 48 - -(var24.field_g * 208 / 4096);
                                qh.b(var10, var11, var18, var19, 1140241, var25);
                                qh.b(var10, var11, var13, var14, 1140241, var25);
                                qh.b(var18, var19, var21, var22, 1140241, var25);
                                qh.b(var13, var14, var21, var22, 1140241, var25);
                            }
                        }
                    }
                }
                var10 = var18;
                var13 = var21;
                var11 = var19;
                var12 = var20;
                var15 = var23;
                var14 = var22;
            }
            var5 = var8;
            var4 = var7;
            var6 = var9;
        }
    }

    private final void b(byte param0, int[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = Pool.field_O;
        if (param0 != 44) {
            field_eb = null;
        }
        for (var3 = 0; ma.field_b.length > var3; var3++) {
            for (var4 = 0; ma.field_b[var3].length > var4; var4++) {
                for (var5 = 0; ma.field_b[var3][var4].length > var5; var5++) {
                    ma.field_b[var3][var4][var5].a((byte) 67);
                }
            }
        }
    }

    fk() {
        ((fk) this).field_L = new int[2];
        ((fk) this).field_R = new int[2];
        ((fk) this).field_X = new int[2];
        ((fk) this).field_M = new int[2];
    }

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        if (param0 == 10) {
          ma.field_b = new bl[4][16][16];
          var2 = 0;
          L0: while (true) {
            if (-17 >= (var2 ^ -1)) {
              return;
            } else {
              var3 = -128 + (var2 * 2048 - -256) / 128;
              var4 = ((1 + var2) * 2048 - 256) / 128 - 128;
              var5 = 0;
              L1: while (true) {
                if ((var5 ^ -1) <= -17) {
                  var2++;
                  continue L0;
                } else {
                  var6 = (256 + 2048 * var5) / 128 + -128;
                  var7 = -128 + (-256 + (var5 + 1) * 2048) / 128;
                  ma.field_b[0][var2][var5] = new bl(128, -var6, var3, 128, -var7, var3, 128, -var6, var4, 128, -var7, var4);
                  ma.field_b[1][var2][var5] = new bl(-var6, -128, var3, -var7, -128, var3, -var6, -128, var4, -var7, -128, var4);
                  ma.field_b[2][var2][var5] = new bl(-128, var6, var3, -128, var7, var3, -128, var6, var4, -128, var7, var4);
                  ma.field_b[3][var2][var5] = new bl(var6, 128, var3, var7, 128, var3, var6, 128, var4, var7, 128, var4);
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        if (!(null == ((fk) this).field_bb)) {
            kb.a((byte) -110, ((fk) this).field_bb);
            ((fk) this).field_bb = null;
        }
        if (param0) {
            ((fk) this).field_T = null;
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        int var4 = 81 / ((param0 - -47) / 45);
        if (9 == param2) {
            if (((fk) this).field_bb == null) {
            } else {
                if (param1) {
                    ((fk) this).field_bb.c(64);
                } else {
                    ((fk) this).field_bb.c(4096);
                }
                ((fk) this).field_bb = null;
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = "Members' Benefits";
        field_gb = null;
        field_V = 2;
    }
}
