/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class oo {
    static int[] field_w;
    static int field_I;
    cg field_n;
    int field_F;
    int field_q;
    static int field_k;
    int field_u;
    int field_G;
    String field_l;
    double field_p;
    boolean field_h;
    private nb field_r;
    int field_d;
    private p[] field_y;
    private int[][] field_a;
    int field_v;
    jk field_A;
    int field_m;
    double field_j;
    float field_z;
    int field_e;
    int field_x;
    int field_C;
    private eg[][] field_f;
    static String field_c;
    cg field_i;
    static dd field_D;
    double field_E;
    private int[][] field_g;
    int field_H;
    cg field_b;
    private p[][] field_o;
    dd field_B;
    private int field_t;
    private eg field_s;

    void d(boolean param0) {
        if (!param0) {
            oo.l(-87);
        }
        ((oo) this).field_s = null;
        ((oo) this).field_g = null;
        ((oo) this).field_a = null;
        ((oo) this).field_o = null;
        ((oo) this).field_f = null;
        ((oo) this).field_y = null;
    }

    void d(int param0) {
        if (param0 != 16) {
            ((oo) this).b(3, 108);
        }
    }

    final fa b(int[] param0, eg param1, int param2) {
        if (param2 != -25431) {
            Object var5 = null;
            ((oo) this).a(-49, (di) null);
        }
        return param1.a(((oo) this).field_d, ((oo) this).field_t, ((oo) this).field_q, ((oo) this).field_e, ((oo) this).field_u, param0);
    }

    void a(byte param0, int[] param1) {
        int var3 = -56 % ((-64 - param0) / 52);
    }

    private final int e(int param0) {
        if (param0 != 31761) {
            return 92;
        }
        return ((oo) this).h(param0 ^ 32445);
    }

    final void a(int[] param0, int param1, int param2, int[] param3) {
        ma.a(2, param3, param0);
        if (param2 > -74) {
            return;
        }
        ((oo) this).a(param1, mn.field_g, (byte) -118, br.field_I);
    }

    private final void a(dl param0, int param1, uf param2, int param3) {
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        int var12 = 0;
        pq var13 = null;
        var13 = param2.field_I.field_l[param3];
        var6 = (long)(-param0.field_g + var13.field_g);
        var8 = (long)(var13.field_k - param0.field_f);
        var10 = bm.a(param1 ^ -24621, od.a(var6, var6, false) - -od.a(var8, var8, false));
        var13.b(true);
        if (var13.field_j >= -4194305) {
          L0: {
            if (-1 > var13.field_j) {
              var12 = 1179648 + -rf.a(4194304 + -(var13.field_j * var13.field_j >> -1796827312), param1 ^ -24622);
              break L0;
            } else {
              var12 = 655360;
              break L0;
            }
          }
          L1: {
            if (param1 == 24657) {
              break L1;
            } else {
              field_I = -86;
              break L1;
            }
          }
          L2: {
            if (var10 <= (long)var12) {
              break L2;
            } else {
              var8 = (long)var12 * var8 / var10;
              var6 = var6 * (long)var12 / var10;
              break L2;
            }
          }
          L3: {
            var13.field_k = (int)var8 + param0.field_f;
            var13.field_p = true;
            var13.field_I = var13.field_I * 63 >> -454132666;
            var13.field_g = (int)var6 + param0.field_g;
            var13.field_t = 63 * var13.field_t >> 777324614;
            if (var13.field_j > 2359296) {
              var13.field_j = 2359296;
              break L3;
            } else {
              break L3;
            }
          }
          var13.field_n = 15 * var13.field_n / 16;
          var13.field_b = 15 * var13.field_b / 16;
          var13.field_K = 15 * var13.field_K / 16;
          var13.field_e = var13.field_e + 131072;
          return;
        } else {
          param2.a(0, param3);
          return;
        }
    }

    void b(boolean param0) {
        if (param0) {
            ((oo) this).field_g = null;
        }
        ((oo) this).a(10, 256, (byte) 62, 128);
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var16 = 0;
        int var17 = 0;
        eg var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var7 = -param0 + param3;
        var7 = var7 * var7;
        if (param4 > -24) {
            ((oo) this).field_t = 18;
        }
        int var8 = -param2 + param1;
        var8 = var8 * var8;
        double var9 = Math.sqrt((double)(var8 + (var7 + 256)));
        int var11 = (int)Math.ceil(var9 / (double)nc.field_Y.length);
        eg[] var12 = new eg[var11];
        p[] var13 = new p[var11];
        int var14 = param3 + -param0;
        int var15 = -param2 + param1;
        for (var16 = 0; var12.length > var16; var16++) {
            var17 = 1 + var16;
            var18 = new eg(4, 4, 1);
            var19 = var14 * var16 / var11 + param0;
            var20 = var17 * var14 / var11 + param0;
            var21 = param2 + var16 * var15 / var11;
            var22 = param2 - -(var17 * var15 / var11);
            var23 = (var20 + var19) / 2;
            var24 = (var22 + var21) / 2;
            var25 = var18.a(var19 + -var23, var21 - var24, 0);
            var26 = var18.a(-var23 + var20, -var24 + var22, 0);
            var27 = var18.a(var19 - var23, var21 + -var24, sb.a(-16.0f, true));
            var28 = var18.a(var20 - var23, var22 - var24, sb.a(-16.0f, true));
            int discarded$0 = var18.a(var25, var27, var26, (byte) 1, hh.a((byte) -123, this.e(31761)), this.c(99));
            int discarded$1 = var18.a(var28, var26, var27, (byte) 1, hh.a((byte) 94, this.e(31761)), this.c(97));
            int discarded$2 = var18.a(var25, var26, var27, (byte) 1, hh.a((byte) 93, this.e(31761)), this.c(100));
            int discarded$3 = var18.a(var28, var27, var26, (byte) 1, hh.a((byte) 42, this.e(31761)), this.c(95));
            var12[var16] = var18;
            var13[var16] = new p((nc) (Object) var12[var16].a(((oo) this).field_C, ((oo) this).field_x, ((oo) this).field_q, ((oo) this).field_e, ((oo) this).field_u), new int[3]);
        }
        ((oo) this).field_f[param5] = var12;
        ((oo) this).field_o[param5] = var13;
    }

    private final void k(int param0) {
        hh.field_c = true;
        if (param0 != 0) {
            int discarded$0 = ((oo) this).h(-49);
        }
        id.field_c.field_g = true;
        if (null != ba.field_ub) {
            ba.field_ub.K(0);
        }
        if (null != am.field_e) {
            am.field_e.K(0);
        }
    }

    final void a(int[] param0, pq param1) {
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
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        if (param1.field_j <= -524288) {
          L0: {
            if (dq.field_a.field_g) {
              var3 = ((oo) this).field_q + (param1.field_g >> 13);
              var4 = ((oo) this).field_e + (param1.field_k >> 13);
              var5 = ((oo) this).field_u + (param1.field_j >> 13);
              break L0;
            } else {
              var3 = ((oo) this).field_q + 2304;
              var4 = ((oo) this).field_e + 1152;
              var5 = ((oo) this).field_u;
              break L0;
            }
          }
          L1: {
            var6 = (param1.field_g >> 13) - var3;
            var7 = (param1.field_k >> 13) - var4;
            var8 = (param1.field_j >> 13) - var5;
            var9 = var7;
            var10 = -var6;
            var11 = var9 * var9 + var10 * var10;
            if (var11 <= 0) {
              break L1;
            } else {
              var11 = rf.a(var11, -121) >> 8;
              var9 = (var9 << 8) / var11;
              var10 = (var10 << 8) / var11;
              break L1;
            }
          }
          L2: {
            var11 = -var8 * var10 >> 8;
            var12 = var8 * var9 >> 8;
            var13 = var6 * var10 - var7 * var9 >> 8;
            var14 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var14 <= 0) {
              break L2;
            } else {
              var14 = rf.a(var14, -125) >> 8;
              var11 = (var11 << 8) / var14;
              var12 = (var12 << 8) / var14;
              var13 = (var13 << 8) / var14;
              break L2;
            }
          }
          var14 = (param1.field_g >> 8) + 8 * var9;
          var15 = (param1.field_k >> 8) + 8 * var10;
          var16 = (param1.field_g >> 8) - 8 * var9;
          var17 = (param1.field_k >> 8) - 8 * var10;
          var18 = (param1.field_g >> 8) + 8 * var11;
          var19 = (param1.field_k >> 8) + 8 * var12;
          var20 = (param1.field_j >> 8) + 8 * var13;
          var21 = (param1.field_g >> 8) - 8 * var11;
          var22 = (param1.field_k >> 8) - 8 * var12;
          var23 = (param1.field_j >> 8) - 8 * var13;
          var24 = -2048 - (var5 << 5);
          if (var24 != 0) {
            var14 = var14 + (param1.field_j >> 8) * -(var14 - (var3 << 5)) / var24;
            var15 = var15 + (param1.field_j >> 8) * -(var15 - (var4 << 5)) / var24;
            var24 = -2048 - (var5 << 5);
            if (var24 != 0) {
              var16 = var16 + (param1.field_j >> 8) * -(var16 - (var3 << 5)) / var24;
              var17 = var17 + (param1.field_j >> 8) * -(var17 - (var4 << 5)) / var24;
              var24 = var23 - (var5 << 5);
              if (var24 != 0) {
                var21 = var21 + var23 * -(var21 - (var3 << 5)) / var24;
                var22 = var22 + var23 * -(var22 - (var4 << 5)) / var24;
                var24 = var20 - (var5 << 5);
                if (var24 != 0) {
                  L3: {
                    var18 = var18 + var20 * -(var18 - (var3 << 5)) / var24;
                    var19 = var19 + var20 * -(var19 - (var4 << 5)) / var24;
                    var24 = -param0[2];
                    var25 = 0;
                    var14 = (var14 >> 5) - param0[0];
                    var15 = (var15 >> 5) - param0[1];
                    var26 = param0[3] * var14 + param0[4] * var15 + param0[5] * var24 >> 3;
                    var27 = param0[6] * var14 + param0[7] * var15 + param0[8] * var24 >> 3;
                    var28 = param0[9] * var14 + param0[10] * var15 + param0[11] * var24 >> 16;
                    if (var28 != 0) {
                      break L3;
                    } else {
                      var28 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (var28 >= 0) {
                      break L4;
                    } else {
                      var25++;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = 5120 + var26 / var28;
                    var15 = 3840 + var27 / var28;
                    var16 = (var16 >> 5) - param0[0];
                    var17 = (var17 >> 5) - param0[1];
                    var26 = param0[3] * var16 + param0[4] * var17 + param0[5] * var24 >> 3;
                    var27 = param0[6] * var16 + param0[7] * var17 + param0[8] * var24 >> 3;
                    var28 = param0[9] * var16 + param0[10] * var17 + param0[11] * var24 >> 16;
                    if (var28 != 0) {
                      break L5;
                    } else {
                      var28 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    if (var28 >= 0) {
                      break L6;
                    } else {
                      var25++;
                      break L6;
                    }
                  }
                  L7: {
                    var16 = 5120 + var26 / var28;
                    var17 = 3840 + var27 / var28;
                    var21 = (var21 >> 5) - param0[0];
                    var22 = (var22 >> 5) - param0[1];
                    var26 = param0[3] * var21 + param0[4] * var22 + param0[5] * var24 >> 3;
                    var27 = param0[6] * var21 + param0[7] * var22 + param0[8] * var24 >> 3;
                    var28 = param0[9] * var21 + param0[10] * var22 + param0[11] * var24 >> 16;
                    if (var28 != 0) {
                      break L7;
                    } else {
                      var28 = 1;
                      break L7;
                    }
                  }
                  L8: {
                    if (var28 >= 0) {
                      break L8;
                    } else {
                      var25++;
                      break L8;
                    }
                  }
                  L9: {
                    var21 = 5120 + var26 / var28;
                    var22 = 3840 + var27 / var28;
                    var18 = (var18 >> 5) - param0[0];
                    var19 = (var19 >> 5) - param0[1];
                    var26 = param0[3] * var18 + param0[4] * var19 + param0[5] * var24 >> 3;
                    var27 = param0[6] * var18 + param0[7] * var19 + param0[8] * var24 >> 3;
                    var28 = param0[9] * var18 + param0[10] * var19 + param0[11] * var24 >> 16;
                    if (var28 != 0) {
                      break L9;
                    } else {
                      var28 = 1;
                      break L9;
                    }
                  }
                  L10: {
                    if (var28 >= 0) {
                      break L10;
                    } else {
                      var25++;
                      break L10;
                    }
                  }
                  var18 = 5120 + var26 / var28;
                  var19 = 3840 + var27 / var28;
                  if (var25 <= 1) {
                    L11: {
                      if (var18 >> 4 >= qh.field_b) {
                        break L11;
                      } else {
                        if (var21 >> 4 >= qh.field_b) {
                          break L11;
                        } else {
                          if (var16 >> 4 >= qh.field_b) {
                            break L11;
                          } else {
                            if (var14 >> 4 >= qh.field_b) {
                              break L11;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    L12: {
                      if (var19 >> 4 >= qh.field_c) {
                        break L12;
                      } else {
                        if (var22 >> 4 >= qh.field_c) {
                          break L12;
                        } else {
                          if (var17 >> 4 >= qh.field_c) {
                            break L12;
                          } else {
                            if (var15 >> 4 >= qh.field_c) {
                              break L12;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      if (var18 >> 4 < qh.field_j) {
                        break L13;
                      } else {
                        if (var21 >> 4 < qh.field_j) {
                          break L13;
                        } else {
                          if (var16 >> 4 < qh.field_j) {
                            break L13;
                          } else {
                            if (var14 >> 4 < qh.field_j) {
                              break L13;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (var19 >> 4 < qh.field_g) {
                        break L14;
                      } else {
                        if (var22 >> 4 < qh.field_g) {
                          break L14;
                        } else {
                          if (var17 >> 4 < qh.field_g) {
                            break L14;
                          } else {
                            if (var15 >> 4 < qh.field_g) {
                              break L14;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      L16: {
                        L17: {
                          if (var18 > 16384) {
                            break L17;
                          } else {
                            if (var18 >= -16384) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (var21 > 16384) {
                            break L18;
                          } else {
                            if (var21 >= -16384) {
                              break L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          if (var14 > 16384) {
                            break L19;
                          } else {
                            if (var14 >= -16384) {
                              break L16;
                            } else {
                              break L19;
                            }
                          }
                        }
                        if (var16 > 16384) {
                          return;
                        } else {
                          if (var16 < -16384) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L20: {
                        L21: {
                          if (var19 > 16384) {
                            break L21;
                          } else {
                            if (var19 >= -16384) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L22: {
                          if (var22 > 16384) {
                            break L22;
                          } else {
                            if (var22 >= -16384) {
                              break L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                        L23: {
                          if (var15 > 16384) {
                            break L23;
                          } else {
                            if (var15 >= -16384) {
                              break L20;
                            } else {
                              break L23;
                            }
                          }
                        }
                        if (var17 > 16384) {
                          break L15;
                        } else {
                          if (var17 >= -16384) {
                            break L20;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var26 = var18 + var21 + var16 + var14 >> 2;
                      var27 = var19 + var22 + var17 + var15 >> 2;
                      var28 = var14 - var16;
                      var29 = var15 - var17;
                      var30 = var18 - var21;
                      var31 = var19 - var22;
                      var32 = var29;
                      var33 = -var28;
                      var34 = var31;
                      var35 = -var30;
                      var36 = var30 * var30 + var31 * var31;
                      var37 = ke.a(false, var36) << 2;
                      var38 = var28 * var28 + var29 * var29;
                      if (var38 != 0) {
                        L24: {
                          var39 = ke.a(false, var38) << 2;
                          var32 = (var32 << 12) / var39;
                          var33 = (var33 << 12) / var39;
                          var34 = (var34 << 12) / var37;
                          var35 = (var35 << 12) / var37;
                          var40 = var30 * var32 + var31 * var33;
                          var41 = var28 * var34 + var29 * var35;
                          var42 = var26 >> 4;
                          var43 = var26 >> 4;
                          var44 = var27 >> 4;
                          var45 = var27 >> 4;
                          var46 = var18 + var28 / 2 >> 4;
                          if (var46 >= var42) {
                            if (var46 <= var43) {
                              break L24;
                            } else {
                              var43 = var46;
                              break L24;
                            }
                          } else {
                            var42 = var46;
                            break L24;
                          }
                        }
                        L25: {
                          var47 = var19 + var29 / 2 >> 4;
                          if (var47 >= var44) {
                            if (var47 <= var45) {
                              break L25;
                            } else {
                              var45 = var47;
                              break L25;
                            }
                          } else {
                            var44 = var47;
                            break L25;
                          }
                        }
                        L26: {
                          var46 = var18 - var28 / 2 >> 4;
                          if (var46 >= var42) {
                            if (var46 <= var43) {
                              break L26;
                            } else {
                              var43 = var46;
                              break L26;
                            }
                          } else {
                            var42 = var46;
                            break L26;
                          }
                        }
                        L27: {
                          var47 = var19 - var29 / 2 >> 4;
                          if (var47 >= var44) {
                            if (var47 <= var45) {
                              break L27;
                            } else {
                              var45 = var47;
                              break L27;
                            }
                          } else {
                            var44 = var47;
                            break L27;
                          }
                        }
                        L28: {
                          var46 = var21 + var28 / 2 >> 4;
                          if (var46 >= var42) {
                            if (var46 <= var43) {
                              break L28;
                            } else {
                              var43 = var46;
                              break L28;
                            }
                          } else {
                            var42 = var46;
                            break L28;
                          }
                        }
                        L29: {
                          var47 = var22 + var29 / 2 >> 4;
                          if (var47 >= var44) {
                            if (var47 <= var45) {
                              break L29;
                            } else {
                              var45 = var47;
                              break L29;
                            }
                          } else {
                            var44 = var47;
                            break L29;
                          }
                        }
                        L30: {
                          var46 = var21 - var28 / 2 >> 4;
                          if (var46 >= var42) {
                            if (var46 <= var43) {
                              break L30;
                            } else {
                              var43 = var46;
                              break L30;
                            }
                          } else {
                            var42 = var46;
                            break L30;
                          }
                        }
                        L31: {
                          var47 = var22 - var29 / 2 >> 4;
                          if (var47 >= var44) {
                            if (var47 <= var45) {
                              break L31;
                            } else {
                              var45 = var47;
                              break L31;
                            }
                          } else {
                            var44 = var47;
                            break L31;
                          }
                        }
                        L32: {
                          if (var42 >= qh.field_b) {
                            break L32;
                          } else {
                            var42 = qh.field_b;
                            break L32;
                          }
                        }
                        L33: {
                          if (var43 <= qh.field_j) {
                            break L33;
                          } else {
                            var43 = qh.field_j;
                            break L33;
                          }
                        }
                        L34: {
                          if (var44 >= qh.field_c) {
                            break L34;
                          } else {
                            var44 = qh.field_c;
                            break L34;
                          }
                        }
                        L35: {
                          if (var45 <= qh.field_g) {
                            break L35;
                          } else {
                            var45 = qh.field_g;
                            break L35;
                          }
                        }
                        var46 = var44;
                        L36: while (true) {
                          if (var46 >= var45) {
                            return;
                          } else {
                            var47 = (var46 << 4) - var22;
                            var48 = (var46 << 4) - var17;
                            var49 = var47 * var33;
                            var50 = var48 * var35;
                            var51 = var46 * 640;
                            var52 = var42;
                            L37: while (true) {
                              if (var52 >= var43) {
                                var46++;
                                continue L36;
                              } else {
                                var53 = (var52 << 4) - var21;
                                var54 = (var52 << 4) - var16;
                                var55 = (var53 * var32 + var49 << 8) / var40 - 128;
                                var56 = (var54 * var34 + var50 << 8) / var41 - 128;
                                var57 = var55 * var55 + var56 * var56;
                                if (var57 < 16384) {
                                  L38: {
                                    if (var55 >= 0) {
                                      break L38;
                                    } else {
                                      var55 = var55 >> 1;
                                      var57 = var55 * var55 + var56 * var56;
                                      break L38;
                                    }
                                  }
                                  L39: {
                                    var58 = (((oo) this).field_C << 1) + (var57 * ((oo) this).field_x >> 13);
                                    if (var58 >= 0) {
                                      break L39;
                                    } else {
                                      var58 = 0;
                                      break L39;
                                    }
                                  }
                                  if (var58 < 256) {
                                    var59 = qh.field_d[var51 + var52];
                                    var60 = (var59 & 65280) * var58 >> 8 & 65280;
                                    var59 = (var59 & 16711935) * var58 >> 8 & 16711935;
                                    qh.field_d[var51 + var52] = var59 | var60;
                                    var52++;
                                    continue L37;
                                  } else {
                                    var52++;
                                    continue L37;
                                  }
                                } else {
                                  var52++;
                                  continue L37;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final fa a(int[] param0, byte param1, eg param2) {
        if (param1 != 103) {
            return null;
        }
        return param2.a(((oo) this).field_d, ((oo) this).field_t, -param0[0] + (2304 + ((oo) this).field_q), 1152 + (((oo) this).field_e + -param0[1]), ((oo) this).field_u - param0[2], param0);
    }

    final void a(int param0, cf param1, di param2) {
        if (param0 != 3) {
            Object var5 = null;
            ((oo) this).a(-23, -100, (byte) -87, (jg[]) null, (kf[]) null);
        }
        if (!(((oo) this).field_b == null)) {
            boolean discarded$0 = tl.field_N.a(param1, param2, ((oo) this).field_b, param0 ^ 79, 0);
        }
    }

    public static void l(int param0) {
        if (param0 != -15631) {
            return;
        }
        field_c = null;
        field_w = null;
        field_D = null;
    }

    void a(int param0, di param1) {
        if (param0 != 1) {
            byte discarded$0 = ((oo) this).g(67);
        }
    }

    private final byte c(int param0) {
        if (param0 <= 94) {
            return (byte) -18;
        }
        return ((oo) this).g(-112);
    }

    final String c(byte param0) {
        if (param0 != 32) {
            Object var3 = null;
            ((oo) this).a(-106, (int[]) null, 4, (int[]) null, 62);
        }
        return "lighting amb=" + ((oo) this).field_d + ", cont=" + ((oo) this).field_m;
    }

    final fa a(int[] param0, eg param1, int param2) {
        if (param2 > -52) {
            Object var5 = null;
            ((oo) this).a(true, (int[]) null, (pq[]) null);
        }
        return param1.a(((oo) this).field_C, ((oo) this).field_F, ((oo) this).field_q, ((oo) this).field_e, ((oo) this).field_u, param0);
    }

    void i(int param0) {
        if (param0 != 25879) {
            ((oo) this).field_G = -36;
        }
    }

    void c(boolean param0) {
        if (!param0) {
            ((oo) this).field_z = -0.5056021213531494f;
        }
    }

    final boolean a(int param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 31 % ((-8 - param0) / 41);
            if (null == ((oo) this).field_r) {
              break L1;
            } else {
              if (((oo) this).field_r.i()) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    private final void a(dl[] param0, int param1) {
        int var3_int = 0;
        double var4_double = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var4 = 0;
        d.field_b = new eg(17, 16, 1);
        for (var3_int = 0; -17 < (var3_int ^ -1); var3_int++) {
            var4_double = Math.sin(2.0 * (3.141592653589793 * (double)var3_int) / 16.0);
            var6 = Math.cos(3.141592653589793 * (double)var3_int * 2.0 / 16.0);
            var8 = Math.sin(2.0 * (3.141592653589793 * (double)(var3_int + 1)) / 16.0);
            var10 = Math.cos(3.141592653589793 * (double)(var3_int - -1) * 2.0 / 16.0);
            int discarded$0 = d.field_b.a(d.field_b.a(0, 0, 0), d.field_b.a(cr.a(4885, 18.0 * var10), cr.a(4885, var8 * 18.0), 0), d.field_b.a(cr.a(4885, 18.0 * var6), cr.a(4885, 18.0 * var4_double), 0), (byte) 1, (short) 127, (byte) 127);
        }
        nc var12 = (nc) (Object) ((oo) this).a(-113, d.field_b);
        nc var3 = var12;
        v.field_g = new p[param0.length];
        if (param1 >= -16) {
            return;
        }
        for (var4 = 0; v.field_g.length > var4; var4++) {
            v.field_g[var4] = new p(var12, new int[3]);
        }
    }

    private final void a(byte param0, bf[] param1) {
        int var3 = 0;
        ((oo) this).field_f = new eg[param1.length][];
        ((oo) this).field_o = new p[param1.length][];
        if (param0 != -92) {
            return;
        }
        for (var3 = 0; var3 < ((oo) this).field_f.length; var3++) {
            this.a(param1[var3].field_a >> -1370415795, param1[var3].field_l >> 2102003661, param1[var3].field_j >> -1443369875, param1[var3].field_f >> 805761805, (byte) -57, var3);
        }
    }

    void a(di param0, int param1) {
        if (param1 >= -43) {
            ((oo) this).field_e = 4;
        }
    }

    void a(cf param0, int param1) {
        int var3 = 55 % ((39 - param1) / 38);
    }

    byte g(int param0) {
        int var2 = -110 / ((param0 - 9) / 63);
        return (byte) 0;
    }

    final void a(int param0, int param1) {
        if (param0 < 52) {
            return;
        }
        ((oo) this).a((byte) 120);
        ap.field_D = new kf[param1];
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        if (param0 >= 87) {
          L0: {
            if (ap.field_D == null) {
              break L0;
            } else {
              var2 = 0;
              L1: while (true) {
                if (var2 >= ap.field_D.length) {
                  break L0;
                } else {
                  if (null != ap.field_D[var2]) {
                    if (!ap.field_D[var2].field_o.i()) {
                      ap.field_D[var2].field_o.c(441);
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
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, jg[] param3, kf[] param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Pool.field_O;
        var6 = 6114 * param0 >> -1033188473;
        var7 = 0;
        L0: while (true) {
          if (var7 >= 2) {
            var7 = -14 % ((-11 - param2) / 44);
            return;
          } else {
            L1: {
              if (null == param4[var7]) {
                break L1;
              } else {
                if (param4[var7].field_o.i()) {
                  break L1;
                } else {
                  L2: {
                    var8 = param4[var7].field_n;
                    var9 = -32;
                    if (var8 > var6) {
                      var9 = var6 - var8;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  param4[var7].a(var9 + ga.a(64, true, ea.field_r) + var8, 441, 128);
                  var7++;
                  continue L0;
                }
              }
            }
            L3: {
              if (param4[var7] == null) {
                break L3;
              } else {
                if (param4[var7].field_o.i()) {
                  break L3;
                } else {
                  var7++;
                  continue L0;
                }
              }
            }
            if (-1 == (ga.a(param1, true, ea.field_r) ^ -1)) {
              param4[var7] = mn.a(-24296, nb.c(param3[ga.a(param3.length, true, ea.field_r)], 100, var6, 8192 * var7 + 4096));
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    void a(al param0, int param1) {
        this.f(2);
        this.a(param0.field_w, -33);
        this.a((byte) -92, param0.field_c);
        this.a(param0.field_c, 16);
        this.k(0);
        if (param1 != 21894) {
            Object var4 = null;
            this.a((byte) 111, (bf[]) null);
        }
        ((oo) this).b(120);
    }

    final fa a(int param0, eg param1) {
        int var3 = -19 / ((param0 - 57) / 45);
        return param1.a(((oo) this).field_C, ((oo) this).field_F, ((oo) this).field_q, ((oo) this).field_e, ((oo) this).field_u);
    }

    abstract void a(byte param0, uf param1);

    void j(int param0) {
        if (param0 != 2) {
            ((oo) this).field_g = null;
        }
    }

    final void a(int param0, int[] param1) {
        int var4 = Pool.field_O;
        int var3 = 0;
        if (param0 <= 26) {
            ((oo) this).field_b = null;
        }
        while (var3 < ((oo) this).field_y.length) {
            ((oo) this).field_y[var3].c(6710886, param1);
            var3++;
        }
    }

    final void a(int param0, int[] param1, int param2, int[] param3, int param4) {
        ma.a(param0 + -1336449638, param3, param1);
        ((oo) this).a(param4, mn.field_g * param2 >> 1336449640, (byte) -111, br.field_I);
        if (param0 != 1336449640) {
            ((oo) this).field_j = 1.1224327362689441;
        }
    }

    final void a(int[] param0, byte param1, boolean param2, pq[] param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        pq var8 = null;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param1 >= 63) {
            break L0;
          } else {
            ((oo) this).field_t = 44;
            break L0;
          }
        }
        var6 = wh.field_g + (param3.length - 1);
        L1: while (true) {
          if ((var6 ^ -1) > -1) {
            return;
          } else {
            L2: {
              var7 = pd.field_f[var6];
              if (var7 >= param3.length) {
                if (param4) {
                  break L2;
                } else {
                  var6--;
                  continue L1;
                }
              } else {
                L3: {
                  L4: {
                    var8 = param3[var7];
                    if (var8.field_s) {
                      break L4;
                    } else {
                      if ((var8.field_j ^ -1) > -1) {
                        break L4;
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        break L3;
                      }
                    }
                  }
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                }
                if (stackIn_9_0 != (param2 ? 1 : 0)) {
                  if (!var8.field_o) {
                    break L2;
                  } else {
                    var6--;
                    continue L1;
                  }
                } else {
                  var6--;
                  continue L1;
                }
              }
            }
            w.field_a[var7].a(param0, -32215);
            var6--;
            continue L1;
          }
        }
    }

    final void a(boolean param0, int[] param1, pq[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Pool.field_O;
        if (param0) {
            ((oo) this).field_C = 46;
        }
        for (var4 = 0; var4 < param2.length; var4++) {
            if (param2[var4].field_p) {
                param2[var4].i(2);
                dq.field_a.a(false, param2[var4].field_G, var4);
            }
            w.field_a[var4] = (eb) (Object) k.field_O[var4];
            pd.field_f[var4] = var4;
            tc.field_d[var4] = w.field_a[var4].b(param1, -111);
        }
        for (var5 = 0; var5 < wh.field_g; var5++) {
            w.field_a[var4] = (eb) (Object) rb.field_e[var5];
            pd.field_f[var4] = var4;
            tc.field_d[var4] = w.field_a[var4].b(param1, -114);
            var4++;
        }
        th.a(0, -30916, tc.field_d, pd.field_f, param2.length - (-wh.field_g + 1));
    }

    final String b(byte param0) {
        if (param0 != 123) {
            return null;
        }
        return "lighting amb=" + ((oo) this).field_C + ", cont=" + ((oo) this).field_x + ", ang=[" + (int)(((oo) this).field_j * 180.0 / 3.141592653589793) + ", " + (int)(((oo) this).field_p * 180.0 / 3.141592653589793) + "], dist=" + (int)((oo) this).field_E + " => pos=[" + ((oo) this).field_q + "," + ((oo) this).field_e + "," + ((oo) this).field_u + "], gamma=" + ((oo) this).field_z;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          var5 = -95 % ((-44 - param2) / 56);
          var6 = param0;
          if ((var6 ^ -1) != -16) {
            if ((var6 ^ -1) != -17) {
              if (var6 != 10) {
                if (var6 != -18) {
                  if (-19 != var6) {
                    break L0;
                  } else {
                    if (null != ((oo) this).field_n) {
                      ac.a(256, false, false, ((oo) this).field_n);
                      break L0;
                    } else {
                      if (null == ((oo) this).field_i) {
                        break L0;
                      } else {
                        ac.a(256, false, false, ((oo) this).field_i);
                        break L0;
                      }
                    }
                  }
                } else {
                  if (((oo) this).field_i == null) {
                    break L0;
                  } else {
                    ac.a(256, false, false, ((oo) this).field_i);
                    break L0;
                  }
                }
              } else {
                ac.a(256, true, true, ((oo) this).field_b);
                break L0;
              }
            } else {
              ((oo) this).a(3, param1, (byte) -117, param3);
              break L0;
            }
          } else {
            ((oo) this).a(2, param1, (byte) -105, param3);
            break L0;
          }
        }
    }

    void a(boolean param0) {
        if (param0) {
            Object var3 = null;
            this.a((dl[]) null, 70);
        }
    }

    void c(int param0, di param1) {
        if (param0 != -23569) {
            oo.l(-78);
        }
    }

    final void b(al param0, int param1) {
        k.field_O = new ec[param0.field_l.length];
        w.field_a = new eb[rb.field_e.length + param0.field_l.length];
        int var3 = param1;
        for (var3 = 0; var3 < param0.field_l.length; var3++) {
            k.field_O[var3] = new ec(var3, param0);
        }
        tc.field_d = new int[w.field_a.length];
        pd.field_f = new int[w.field_a.length];
    }

    void b(int param0, int param1) {
        int var3 = -12 / ((11 - param0) / 52);
    }

    final void b(int param0) {
        L0: while (true) {
          if (((oo) this).field_j >= 0.0) {
            L1: {
              if (16.0 > ((oo) this).field_E) {
                ((oo) this).field_E = 16.0;
                break L1;
              } else {
                if (16384.0 >= ((oo) this).field_E) {
                  break L1;
                } else {
                  ((oo) this).field_E = 16384.0;
                  break L1;
                }
              }
            }
            L2: while (true) {
              if (((oo) this).field_j < 6.283185307179586) {
                L3: {
                  if (0.0 <= ((oo) this).field_p) {
                    if (1.5707963267948966 >= ((oo) this).field_p) {
                      break L3;
                    } else {
                      ((oo) this).field_p = 1.5707963267948966;
                      break L3;
                    }
                  } else {
                    ((oo) this).field_p = 0.0;
                    break L3;
                  }
                }
                ((oo) this).field_q = (int)(((oo) this).field_E * Math.cos(((oo) this).field_j) * Math.cos(((oo) this).field_p));
                if (param0 >= 109) {
                  L4: {
                    ((oo) this).field_e = (int)(((oo) this).field_E * Math.sin(((oo) this).field_j) * Math.cos(((oo) this).field_p));
                    ((oo) this).field_u = -(int)(((oo) this).field_E * Math.sin(((oo) this).field_p));
                    if (-1 > ((oo) this).field_x) {
                      break L4;
                    } else {
                      ((oo) this).field_x = 1;
                      break L4;
                    }
                  }
                  L5: {
                    ((oo) this).field_F = 132072 / (((oo) this).field_x * 3);
                    if (-1 < ((oo) this).field_m) {
                      break L5;
                    } else {
                      ((oo) this).field_m = 1;
                      break L5;
                    }
                  }
                  fb.field_p = ((oo) this).field_z;
                  ((oo) this).field_t = 132072 / (3 * ((oo) this).field_m);
                  fb.b(((oo) this).field_z);
                  return;
                } else {
                  return;
                }
              } else {
                ((oo) this).field_j = ((oo) this).field_j - 6.283185307179586;
                continue L2;
              }
            }
          } else {
            ((oo) this).field_j = ((oo) this).field_j + 6.283185307179586;
            continue L0;
          }
        }
    }

    private final void a(bf[] param0, int param1) {
        long var3 = 0L;
        int[][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9_long = 0L;
        int var9 = 0;
        long var10 = 0L;
        long var11 = 0L;
        long var13 = 0L;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        var3 = -1L;
        var19 = new int[param1][];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var5 = var16;
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (param0.length <= var7) {
            ((oo) this).field_a = new int[var6][2];
            ((oo) this).field_g = new int[var6][2];
            var15 = 0;
            var7 = var15;
            L1: while (true) {
              if (var15 >= ((oo) this).field_a.length) {
                return;
              } else {
                L2: {
                  var8 = param0[var19[var15][1]].a(123) + -param0[var19[var15][0]].a(109);
                  var9 = param0[var19[var15][1]].a((byte) -127) - param0[var19[var15][0]].a((byte) -127);
                  ((oo) this).field_a[var15][0] = -var9 >> -1419726515;
                  ((oo) this).field_a[var15][1] = var8 >> -772657139;
                  var10 = bm.a(-111, od.a((long)var8, (long)var8, false) - -od.a((long)var9, (long)var9, false));
                  if ((var10 ^ -1L) < -2147483648L) {
                    break L2;
                  } else {
                    if ((var10 ^ -1L) <= 2147483647L) {
                      ((oo) this).field_a[var15][0] = lh.a((int)var10, (byte) -74, (long)((oo) this).field_a[var15][0]);
                      ((oo) this).field_a[var15][1] = lh.a((int)var10, (byte) -95, (long)((oo) this).field_a[var15][1]);
                      ((oo) this).field_g[var15][0] = var19[var15][0];
                      ((oo) this).field_g[var15][1] = var19[var15][1];
                      var15++;
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                throw new IllegalStateException("norm out of range: " + var10);
              }
            }
          } else {
            var8 = 1 + var7;
            L3: while (true) {
              if (param0.length <= var8) {
                var7++;
                continue L0;
              } else {
                var9_long = (long)(param0[var7].a(param1 + 83) + -param0[var8].a(param1 ^ 101));
                var11 = (long)(param0[var7].a((byte) -127) - param0[var8].a((byte) -127));
                var13 = od.a(var9_long, var9_long, false) + od.a(var11, var11, false);
                if (var3 < var13) {
                  var3 = var13;
                  var6 = 0;
                  var6++;
                  var5[var6] = new int[2];
                  var8++;
                  continue L3;
                } else {
                  if ((var3 ^ -1L) == (var13 ^ -1L)) {
                    var6++;
                    var5[var6] = new int[2];
                    var8++;
                    continue L3;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    void a(boolean param0, mm param1) {
        if (param1.field_m < 0.0) {
            param1.field_m = 0.0;
        } else {
            if (!(param1.field_m <= 288.0)) {
                param1.field_m = 288.0;
            }
        }
        if (param1.field_f >= 0.0) {
            // ifle L85
            param1.field_f = 576.0;
        } else {
            param1.field_f = 0.0;
        }
        if (param0) {
            Object var5 = null;
            ((oo) this).a((int[]) null, (byte) -29, true, (pq[]) null, false);
        }
        double var3 = param1.d(8);
        if (!(var3 <= 768.0)) {
            param1.field_a = 768.0 * (-param1.field_m + param1.field_a) / var3 + param1.field_m;
            param1.field_h = (param1.field_h - param1.field_k) * 768.0 / var3 + param1.field_k;
            param1.field_d = param1.field_f + (param1.field_d - param1.field_f) * 768.0 / var3;
        }
    }

    private final void f(int param0) {
        int var16 = 0;
        int var19 = 0;
        float var2 = (float)cr.a(4885, Math.sqrt(414720.0));
        int var3 = (int)Math.ceil((double)(var2 / (float)nc.field_Y.length));
        int var4 = (int)Math.ceil((double)(var2 / (float)nc.field_Y.length));
        ((oo) this).field_y = new p[var3 * var4];
        double var5 = 576.0 / (double)var3;
        double var7 = 288.0 / (double)var4;
        int var9 = (cr.a(4885, var5) >> -1708813023) * 16 / 16;
        int var10 = (cr.a(param0 + 4883, var7) >> 391098529) * 16 / 16;
        ((oo) this).field_s = new eg(4, param0, 1);
        int var11 = ((oo) this).field_s.a(-var9, -var10, 0);
        int var12 = ((oo) this).field_s.a(var9, -var10, 0);
        int var13 = ((oo) this).field_s.a(-var9, var10, 0);
        int var14 = ((oo) this).field_s.a(var9, var10, 0);
        int discarded$0 = ((oo) this).field_s.a(var11, var13, var12, (byte) 1, hh.a((byte) -105, ((oo) this).h(684)), ((oo) this).g(-56));
        int discarded$1 = ((oo) this).field_s.a(var14, var12, var13, (byte) 1, hh.a((byte) -127, ((oo) this).h(684)), ((oo) this).g(91));
        nc var15 = (nc) (Object) ((oo) this).a(103, ((oo) this).field_s);
        for (var16 = 0; var16 < var4; var16++) {
            double var17 = var7 * (double)(1 + 2 * var16) / 2.0;
            for (var19 = 0; var3 > var19; var19++) {
                double var20 = var5 * (double)(1 + var19 * 2) / 2.0;
                ((oo) this).field_y[var16 * var3 - -var19] = new p(var15, ib.a(new double[3], -30100));
            }
        }
    }

    void b(int param0, di param1) {
        if (param0 != 5) {
            ((oo) this).field_b = null;
        }
    }

    void a(byte param0, boolean param1, int param2) {
        int var4 = 30 / ((param0 - -47) / 45);
    }

    int h(int param0) {
        if (param0 != 684) {
            ((oo) this).field_g = null;
        }
        return 6723942;
    }

    oo() {
        ((oo) this).field_q = -1024;
        ((oo) this).field_u = -10240;
        ((oo) this).field_p = 0.7853981633974483;
        ((oo) this).field_z = 1.0f;
        ((oo) this).field_G = 0;
        ((oo) this).field_x = 32;
        ((oo) this).field_F = 1031;
        ((oo) this).field_C = 96;
        ((oo) this).field_d = 96;
        ((oo) this).field_m = 32;
        ((oo) this).field_E = 1024.0;
        ((oo) this).field_H = 0;
        ((oo) this).field_h = false;
        ((oo) this).field_e = -1024;
        ((oo) this).field_j = 0.7853981633974483;
        ((oo) this).field_t = 1031;
        ((oo) this).b(115);
    }

    void a(int param0, uf param1) {
        dl[] var3 = null;
        int var4 = 0;
        tc var5 = null;
        int var6 = 0;
        int var7 = 0;
        pq var8 = null;
        int var9 = 0;
        dl[] var10 = null;
        L0: {
          var9 = Pool.field_O;
          if (param0 == 10) {
            break L0;
          } else {
            ((oo) this).field_f = null;
            break L0;
          }
        }
        L1: {
          if (null == ((oo) this).field_r) {
            break L1;
          } else {
            if (((oo) this).field_r.i()) {
              ((oo) this).field_r = null;
              break L1;
            } else {
              break L1;
            }
          }
        }
        var10 = param1.field_I.field_w;
        var3 = var10;
        var4 = 0;
        L2: while (true) {
          if (var4 >= var10.length) {
            return;
          } else {
            var5 = var10[var4].field_c;
            if (var5 != null) {
              var6 = 0;
              L3: while (true) {
                if (var6 < var5.a((byte) 127)) {
                  var7 = var5.a(var6, 2229);
                  var8 = param1.field_I.field_l[var7];
                  if (var8.field_s) {
                    throw new IllegalStateException("Ball in play cannot be potted!");
                  } else {
                    if (!var8.field_o) {
                      kh.field_gc.a(var10[var4], 24657, param1, var7);
                      var6++;
                      continue L3;
                    } else {
                      var6++;
                      continue L3;
                    }
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            } else {
              var4++;
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Time trial";
    }
}
