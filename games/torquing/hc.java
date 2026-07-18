/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc {
    String field_l;
    int field_s;
    hc field_m;
    private String field_i;
    private int field_b;
    private int field_j;
    private byte[][] field_o;
    tl[] field_q;
    private double[] field_p;
    private int field_w;
    private kh field_y;
    private int field_f;
    static String[] field_d;
    private ei field_a;
    private sg field_g;
    uf field_e;
    private int field_r;
    private int[][] field_x;
    private int field_n;
    private boolean[][] field_h;
    static fj field_c;
    private kh field_t;
    static String field_u;
    ti[] field_k;
    private int field_v;

    final int a(int param0) {
        if (param0 != -31648) {
            return 84;
        }
        return ((hc) this).field_j;
    }

    final void a(double param0, double[] param1, byte param2, double param3) {
        double var7_double = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21_int = 0;
        tl[] var21 = null;
        int var22 = 0;
        int var23 = 0;
        double[] var23_ref_double__ = null;
        int var24 = 0;
        double[] var24_ref_double__ = null;
        double var25 = 0.0;
        double[] var25_ref_double__ = null;
        double[] var26 = null;
        double var27 = 0.0;
        double var29 = 0.0;
        int var31 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41_int = 0;
        int[] var41 = null;
        double var42 = 0.0;
        int var42_int = 0;
        int var43 = 0;
        int var44_int = 0;
        double[] var44 = null;
        double[] var45 = null;
        double var46 = 0.0;
        int var48 = 0;
        double[] var49 = null;
        double[] var50 = null;
        double[] var51 = null;
        double[] var52 = null;
        double[] var53 = null;
        double[] var54 = null;
        double[] var55 = null;
        double[] var56 = null;
        tl var57 = null;
        pj var58 = null;
        double[] var65 = null;
        double[] var66 = null;
        double[] var67 = null;
        double[] var68 = null;
        double[] var69 = null;
        double[] var70 = null;
        double[] var71 = null;
        double[] var72 = null;
        double[] var73 = null;
        double[] var74 = null;
        double[] var81 = null;
        double[] var82 = null;
        double[] var83 = null;
        double[] var84 = null;
        double[] var85 = null;
        double[] var86 = null;
        double[] var87 = null;
        double[] var88 = null;
        double[] var89 = null;
        double[] var90 = null;
        double[] var97 = null;
        double[] var98 = null;
        double[] var99 = null;
        double[] var100 = null;
        double[] var101 = null;
        double[] var102 = null;
        double[] var103 = null;
        double[] var104 = null;
        double[] var105 = null;
        double[] var106 = null;
        int[] var107 = null;
        int[] var108 = null;
        int[] var109 = null;
        int[] var110 = null;
        int[] var111 = null;
        int[] var112 = null;
        double[] var113 = null;
        double[] var114 = null;
        var48 = Torquing.field_u;
        var7_double = 1.1 * param0;
        var9 = -var7_double + param1[0];
        var11 = param1[0] + var7_double;
        if (param2 == 37) {
          var13 = -var7_double + param1[2];
          var15 = param1[2] + var7_double;
          var17 = Math.max(0, (int)(var9 / 100.0));
          var18 = Math.max(0, (int)(var13 / 100.0));
          var19 = Math.min(-1 + ((hc) this).field_r, -(int)(-var11 / 100.0));
          var20 = Math.min(((hc) this).field_v - 1, -(int)(-var15 / 100.0));
          var21_int = var17;
          L0: while (true) {
            if (var21_int > var19) {
              var21 = ((hc) this).field_q;
              var22 = 0;
              L1: while (true) {
                if (var21.length <= var22) {
                  return;
                } else {
                  L2: {
                    var57 = var21[var22];
                    if (var57 != null) {
                      L3: {
                        if (3 == var57.field_r) {
                          break L3;
                        } else {
                          if (25 > var57.field_r) {
                            break L2;
                          } else {
                            if (31 < var57.field_r) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var58 = vb.field_c[var57.field_r];
                      var25 = -var57.field_g[0] + param1[0];
                      var27 = param1[1] - var57.field_g[1];
                      var29 = -var57.field_g[2] + param1[2];
                      var31 = var58.a();
                      if (var29 * var29 + (var27 * var27 + var25 * var25) < (double)(var31 * var31)) {
                        var110 = var58.field_j;
                        var111 = var58.field_y;
                        var112 = var58.field_v;
                        var107 = var58.field_p;
                        var108 = var58.field_u;
                        var109 = var58.field_t;
                        var38 = (int)(0.5 + var57.field_g[0]);
                        var39 = (int)(0.5 + var57.field_g[1]);
                        var40 = (int)(var57.field_g[2] + 0.5);
                        var41_int = 0;
                        L4: while (true) {
                          if (var58.field_x <= var41_int) {
                            var41 = ka.field_n[var57.field_r];
                            var42 = (double)var41[2];
                            if (var42 <= 0.0) {
                              break L2;
                            } else {
                              if (param1[1] < (double)(var39 - -var41[3])) {
                                break L2;
                              } else {
                                if (param1[1] <= (double)(var41[4] + var39)) {
                                  var114 = new double[12];
                                  var98 = var114;
                                  var82 = var98;
                                  var66 = var82;
                                  var44 = var66;
                                  var44[9] = param1[0] - (double)(var41[0] + var38);
                                  var45 = var44;
                                  var44[10] = 0.0;
                                  var44[11] = (double)(-var40 - var41[1]) + param1[2];
                                  var45[7] = 0.0;
                                  var46 = Math.sqrt(ap.a(var114, 9, var114, 9));
                                  if (0.0 != var46) {
                                    if (1.0 + param0 >= var46 - var42) {
                                      var44[11] = var114[11] / var46;
                                      var44[8] = var114[11] / var46;
                                      var44[9] = var114[9] / var46;
                                      var44[6] = var114[9] / var46;
                                      var44[0] = (double)(var41[0] + var38) + var114[9] * var42;
                                      var44[3] = -var42 + var46;
                                      var44[4] = 0.1;
                                      var44[1] = param1[1];
                                      var114[5] = param3;
                                      var44[2] = var42 * var114[11] + (double)(var41[1] + var40);
                                      ol.a(var114, (byte) 103);
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                            }
                          } else {
                            L5: {
                              var42_int = var107[var41_int];
                              var43 = var108[var41_int];
                              var44_int = var109[var41_int];
                              var113 = qa.a(var110[var42_int] - -var38, var111[var43] + var39, var40 + var112[var42_int], var40 + var112[var43], var112[var44_int] - -var40, var38 + var110[var44_int], (byte) -80, var111[var44_int] + var39, var111[var42_int] - -var39, param1, var110[var43] + var38);
                              var97 = var113;
                              var81 = var97;
                              var65 = var81;
                              var45 = var65;
                              var45[4] = 0.1;
                              var113[5] = param3;
                              if (var113[3] > 1.0 + param0) {
                                break L5;
                              } else {
                                ol.a(var113, (byte) 101);
                                break L5;
                              }
                            }
                            var41_int++;
                            continue L4;
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  var22++;
                  continue L1;
                }
              }
            } else {
              var22 = var18;
              L6: while (true) {
                if (var20 < var22) {
                  var21_int++;
                  continue L0;
                } else {
                  L7: {
                    if (((hc) this).field_o[var21_int][var22] != -1) {
                      L8: {
                        var23 = 1 + var21_int;
                        var24 = var22 - -1;
                        if (0 == (var21_int - -var22 & 1)) {
                          var25_ref_double__ = this.a(var21_int, var24, var21_int, var22, param1, 5, var23, var24);
                          var26 = this.a(var23, var22, var23, var24, param1, 5, var21_int, var22);
                          break L8;
                        } else {
                          var25_ref_double__ = this.a(var23, var22, var21_int, var22, param1, param2 + -32, var21_int, var24);
                          var26 = this.a(var21_int, var24, var23, var24, param1, 5, var23, var22);
                          break L8;
                        }
                      }
                      L9: {
                        var26[5] = param3 + mo.field_D[((hc) this).field_o[var21_int][var22]];
                        var25_ref_double__[5] = param3 + mo.field_D[((hc) this).field_o[var21_int][var22]];
                        var26[4] = mo.field_x[((hc) this).field_o[var21_int][var22]];
                        var25_ref_double__[4] = mo.field_x[((hc) this).field_o[var21_int][var22]];
                        if (param1[3] <= param0 + 1.0) {
                          ol.a(var25_ref_double__, (byte) 89);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      if (param1[3] > 1.0 + param0) {
                        break L7;
                      } else {
                        ol.a(var26, (byte) 95);
                        break L7;
                      }
                    } else {
                      if (-2147483648 == ((hc) this).field_w) {
                        break L7;
                      } else {
                        L10: {
                          if (0 >= var21_int) {
                            break L10;
                          } else {
                            if (-1 == ((hc) this).field_o[-1 + var21_int][var22]) {
                              break L10;
                            } else {
                              if (!((hc) this).field_h[var21_int - 1][var22]) {
                                L11: {
                                  var99 = ie.a(((hc) this).field_w, var22, 1 + var22, param1, ((hc) this).field_w, var21_int, var22, var21_int, ((hc) this).field_x[var21_int][var22], var21_int, (byte) 109);
                                  var83 = var99;
                                  var67 = var83;
                                  var49 = var67;
                                  var23_ref_double__ = var49;
                                  var100 = ie.a(((hc) this).field_x[var21_int][1 + var22], 1 + var22, var22, param1, ((hc) this).field_x[var21_int][var22], var21_int, 1 + var22, var21_int, ((hc) this).field_w, var21_int, (byte) -11);
                                  var84 = var100;
                                  var68 = var84;
                                  var50 = var68;
                                  var24_ref_double__ = var50;
                                  var24_ref_double__[5] = param3;
                                  var23_ref_double__[5] = param3;
                                  var24_ref_double__[4] = 0.1;
                                  var25_ref_double__ = var23_ref_double__;
                                  var25_ref_double__[4] = 0.1;
                                  if (param0 + 1.0 < var99[3]) {
                                    break L11;
                                  } else {
                                    ol.a(var99, (byte) 65);
                                    break L11;
                                  }
                                }
                                if (1.0 + param0 < var100[3]) {
                                  break L10;
                                } else {
                                  ol.a(var100, (byte) 37);
                                  break L10;
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        L12: {
                          if (var22 <= 0) {
                            break L12;
                          } else {
                            if (((hc) this).field_o[var21_int][var22 - 1] == -1) {
                              break L12;
                            } else {
                              if (((hc) this).field_h[var21_int][var22 - 1]) {
                                break L12;
                              } else {
                                L13: {
                                  var101 = ie.a(((hc) this).field_w, var22, var22, param1, ((hc) this).field_x[var21_int][var22], var21_int, var22, var21_int, ((hc) this).field_w, 1 + var21_int, (byte) -92);
                                  var85 = var101;
                                  var69 = var85;
                                  var51 = var69;
                                  var23_ref_double__ = var51;
                                  var102 = ie.a(((hc) this).field_x[var21_int + 1][var22], var22, var22, param1, ((hc) this).field_w, 1 + var21_int, var22, 1 + var21_int, ((hc) this).field_x[var21_int][var22], var21_int, (byte) -24);
                                  var86 = var102;
                                  var70 = var86;
                                  var52 = var70;
                                  var24_ref_double__ = var52;
                                  var24_ref_double__[5] = param3;
                                  var23_ref_double__[5] = param3;
                                  var24_ref_double__[4] = 0.1;
                                  var25_ref_double__ = var23_ref_double__;
                                  var25_ref_double__[4] = 0.1;
                                  if (1.0 + param0 >= var101[3]) {
                                    ol.a(var101, (byte) 51);
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                if (1.0 + param0 < var102[3]) {
                                  break L12;
                                } else {
                                  ol.a(var102, (byte) 108);
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        L14: {
                          if (var21_int >= ((hc) this).field_r - 1) {
                            break L14;
                          } else {
                            if (-1 == ((hc) this).field_o[1 + var21_int][var22]) {
                              break L14;
                            } else {
                              if (((hc) this).field_h[var21_int - -1][var22]) {
                                break L14;
                              } else {
                                L15: {
                                  var103 = ie.a(((hc) this).field_w, var22 + 1, var22, param1, ((hc) this).field_x[1 + var21_int][var22], var21_int + 1, var22, 1 + var21_int, ((hc) this).field_w, var21_int + 1, (byte) 110);
                                  var87 = var103;
                                  var71 = var87;
                                  var53 = var71;
                                  var23_ref_double__ = var53;
                                  var104 = ie.a(((hc) this).field_x[1 + var21_int][1 + var22], var22, 1 + var22, param1, ((hc) this).field_w, 1 + var21_int, 1 + var22, 1 + var21_int, ((hc) this).field_x[var21_int + 1][var22], var21_int - -1, (byte) 112);
                                  var88 = var104;
                                  var72 = var88;
                                  var54 = var72;
                                  var24_ref_double__ = var54;
                                  var24_ref_double__[5] = param3;
                                  var23_ref_double__[5] = param3;
                                  var24_ref_double__[4] = 0.1;
                                  var25_ref_double__ = var23_ref_double__;
                                  var25_ref_double__[4] = 0.1;
                                  if (var103[3] > 1.0 + param0) {
                                    break L15;
                                  } else {
                                    ol.a(var103, (byte) 82);
                                    break L15;
                                  }
                                }
                                if (var104[3] > 1.0 + param0) {
                                  break L14;
                                } else {
                                  ol.a(var104, (byte) 93);
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                        if (-1 + ((hc) this).field_v <= var22) {
                          break L7;
                        } else {
                          if (((hc) this).field_o[var21_int][1 + var22] == -1) {
                            break L7;
                          } else {
                            if (((hc) this).field_h[var21_int][1 + var22]) {
                              break L7;
                            } else {
                              L16: {
                                var105 = ie.a(((hc) this).field_w, var22 + 1, 1 + var22, param1, ((hc) this).field_w, var21_int + 1, 1 + var22, var21_int, ((hc) this).field_x[var21_int][1 + var22], var21_int, (byte) 119);
                                var89 = var105;
                                var73 = var89;
                                var55 = var73;
                                var23_ref_double__ = var55;
                                var106 = ie.a(((hc) this).field_x[1 + var21_int][1 + var22], var22 - -1, var22 + 1, param1, ((hc) this).field_x[var21_int][1 + var22], var21_int, var22 + 1, 1 + var21_int, ((hc) this).field_w, var21_int + 1, (byte) -98);
                                var90 = var106;
                                var74 = var90;
                                var56 = var74;
                                var24_ref_double__ = var56;
                                var24_ref_double__[5] = param3;
                                var23_ref_double__[5] = param3;
                                var25_ref_double__ = var23_ref_double__;
                                var24_ref_double__[4] = 0.1;
                                var25_ref_double__[4] = 0.1;
                                if (1.0 + param0 < var105[3]) {
                                  break L16;
                                } else {
                                  ol.a(var105, (byte) 92);
                                  break L16;
                                }
                              }
                              if (param0 + 1.0 >= var106[3]) {
                                ol.a(var106, (byte) 118);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var22++;
                  continue L6;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((hc) this).field_i = null;
        }
        return ((hc) this).field_f;
    }

    final double[] f(int param0) {
        int var2 = -45 % ((param0 - -39) / 46);
        return ((hc) this).field_p;
    }

    final boolean g(int param0) {
        long var2 = 0L;
        lm var4 = null;
        int var4_int = 0;
        ti var5 = null;
        int var6 = 0;
        L0: {
          var6 = Torquing.field_u;
          if (param0 == 1) {
            break L0;
          } else {
            ((hc) this).field_s = 77;
            break L0;
          }
        }
        if (((hc) this).field_a == null) {
          return true;
        } else {
          if (null == ((hc) this).field_g) {
            ((hc) this).field_g = new sg(1);
            ((hc) this).field_g.a(0, ((hc) this).a(-100, true));
            return false;
          } else {
            if (0 < ((hc) this).field_a.a(false)) {
              var2 = km.b(-1);
              var4 = (lm) (Object) ((hc) this).field_a.b(0);
              L1: while (true) {
                L2: {
                  if (var4 == null) {
                    break L2;
                  } else {
                    ((hc) this).field_g.a(var4);
                    ((q) (Object) var4).f(0);
                    if (50L < -var2 + km.b(-1)) {
                      break L2;
                    } else {
                      var4 = (lm) (Object) ((hc) this).field_a.f(-24059);
                      continue L1;
                    }
                  }
                }
                return false;
              }
            } else {
              L3: {
                var2 = km.b(-1);
                if (((hc) this).field_k == null) {
                  ((hc) this).field_k = ((hc) this).field_g.a(0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (((hc) this).field_k == null) {
                  break L4;
                } else {
                  var4_int = 0;
                  L5: while (true) {
                    if (((hc) this).field_n >= ((hc) this).field_k.length) {
                      break L4;
                    } else {
                      L6: {
                        var5 = ((hc) this).field_k[((hc) this).field_n];
                        if (var5 != null) {
                          if (var5.a((byte) 112) != 0) {
                            if (var5.a(-3)) {
                              var4_int++;
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            ((hc) this).field_k[((hc) this).field_n] = null;
                            var4_int++;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      ((hc) this).field_n = ((hc) this).field_n + 1;
                      if (5 > var4_int) {
                        continue L5;
                      } else {
                        if (50L >= km.b(param0 + -2) - var2) {
                          continue L5;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              ((hc) this).field_g = null;
              ((hc) this).field_a = null;
              return true;
            }
          }
        }
    }

    final boolean e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        int[] var8_ref_int__ = null;
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
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        var18 = Torquing.field_u;
        if (((hc) this).field_i != null) {
          if (null == ((hc) this).field_o) {
            L0: {
              var2 = 0;
              if (((hc) this).field_i.charAt(var2) != 34) {
                ((hc) this).field_l = "";
                break L0;
              } else {
                L1: while (true) {
                  var2++;
                  if (34 == ((hc) this).field_i.charAt(var2)) {
                    ((hc) this).field_l = ((hc) this).field_i.substring(1, var2);
                    var2++;
                    break L0;
                  } else {
                    continue L1;
                  }
                }
              }
            }
            int incrementValue$36 = var2;
            var2++;
            ((hc) this).field_r = 1 + lk.a(((hc) this).field_i.charAt(incrementValue$36), 97);
            int incrementValue$37 = var2;
            var2++;
            ((hc) this).field_v = lk.a(((hc) this).field_i.charAt(incrementValue$37), 97) + 1;
            ((hc) this).field_o = new byte[((hc) this).field_r][((hc) this).field_v];
            ((hc) this).field_h = new boolean[((hc) this).field_r][((hc) this).field_v];
            ((hc) this).field_x = new int[1 + ((hc) this).field_r][((hc) this).field_v - -1];
            var3 = 0;
            L2: while (true) {
              if (((hc) this).field_r <= var3) {
                var3 = 0;
                L3: while (true) {
                  if (var3 > ((hc) this).field_r) {
                    int incrementValue$38 = var2;
                    var2++;
                    ((hc) this).field_q = new tl[lk.a(((hc) this).field_i.charAt(incrementValue$38), 97)];
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= ((hc) this).field_q.length) {
                        L5: {
                          int incrementValue$39 = var2;
                          var2++;
                          int incrementValue$40 = var2;
                          var2++;
                          var3 = lk.a(((hc) this).field_i.charAt(incrementValue$39), 97) * 64 - -lk.a(((hc) this).field_i.charAt(incrementValue$40), 97);
                          if (var3 < 4095) {
                            ((hc) this).field_a = new ei();
                            var4 = 0;
                            L6: while (true) {
                              if (var4 >= var3) {
                                break L5;
                              } else {
                                int incrementValue$41 = var2;
                                var2++;
                                var5 = lk.a(((hc) this).field_i.charAt(incrementValue$41), 97);
                                var29 = new int[var5];
                                var26 = var29;
                                var23 = var26;
                                var20 = var23;
                                var6_ref_int__ = var20;
                                var28 = new int[var5];
                                var25 = var28;
                                var22 = var25;
                                var19 = var22;
                                var7_ref_int__ = var19;
                                var30 = new int[var5];
                                var27 = var30;
                                var24 = var27;
                                var21 = var24;
                                var8_ref_int__ = var21;
                                var9 = 0;
                                L7: while (true) {
                                  if (var5 <= var9) {
                                    ((hc) this).field_a.a((byte) 54, (q) (Object) new pf(var29, var28, var30));
                                    var4++;
                                    continue L6;
                                  } else {
                                    L8: {
                                      int incrementValue$42 = var2;
                                      var2++;
                                      var10 = lk.a(((hc) this).field_i.charAt(incrementValue$42), 97);
                                      int incrementValue$43 = var2;
                                      var2++;
                                      var11 = lk.a(((hc) this).field_i.charAt(incrementValue$43), 97);
                                      int incrementValue$44 = var2;
                                      var2++;
                                      var12 = lk.a(((hc) this).field_i.charAt(incrementValue$44), 97);
                                      int incrementValue$45 = var2;
                                      var2++;
                                      var13 = lk.a(((hc) this).field_i.charAt(incrementValue$45), 97);
                                      int incrementValue$46 = var2;
                                      var2++;
                                      var14 = lk.a(((hc) this).field_i.charAt(incrementValue$46), 97);
                                      int incrementValue$47 = var2;
                                      var2++;
                                      var15 = lk.a(((hc) this).field_i.charAt(incrementValue$47), 97);
                                      int incrementValue$48 = var2;
                                      var2++;
                                      var16 = lk.a(((hc) this).field_i.charAt(incrementValue$48), 97);
                                      var6_ref_int__[var9] = (var10 << 7) + ((var11 << 1) - -(var12 >> 5));
                                      var7_ref_int__[var9] = -((ie.a(31, var12) << 8) + ((var13 << 2) + (var14 >> 4)));
                                      if (-8172 == var28[var9]) {
                                        var28[var9] = 20;
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var8_ref_int__[var9] = (var16 >> 3) + (var15 << 3) + (ie.a(var14, 15) << 9);
                                    var9++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        int incrementValue$49 = var2;
                        var2++;
                        ((hc) this).field_j = 5000 * lk.a(((hc) this).field_i.charAt(incrementValue$49), 97);
                        int incrementValue$50 = var2;
                        var2++;
                        var4 = lk.a(((hc) this).field_i.charAt(incrementValue$50), 97);
                        int incrementValue$51 = var2;
                        var2++;
                        var5 = lk.a(((hc) this).field_i.charAt(incrementValue$51), 97);
                        int incrementValue$52 = var2;
                        var2++;
                        var6 = lk.a(((hc) this).field_i.charAt(incrementValue$52), 97);
                        int incrementValue$53 = var2;
                        var2++;
                        var7 = lk.a(((hc) this).field_i.charAt(incrementValue$53), 97);
                        int incrementValue$54 = var2;
                        var2++;
                        var8 = lk.a(((hc) this).field_i.charAt(incrementValue$54), 97);
                        int incrementValue$55 = var2;
                        var2++;
                        var9 = lk.a(((hc) this).field_i.charAt(incrementValue$55), 97);
                        int incrementValue$56 = var2;
                        var2++;
                        var10 = lk.a(((hc) this).field_i.charAt(incrementValue$56), 97);
                        var11 = (var6 >> 5) + (var5 << 1) + (var4 << 7);
                        var12 = -((var8 >> 4) + (var7 << 2) + (var6 << 8 & 7936));
                        var13 = (var9 << 3) + (var8 << 9 & 7680) + (var10 >> 3);
                        ((hc) this).field_p = new double[]{(double)var11, (double)var12, (double)var13, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
                        int incrementValue$57 = var2;
                        var2++;
                        ((hc) this).field_f = lk.a(((hc) this).field_i.charAt(incrementValue$57), 97);
                        int incrementValue$58 = var2;
                        var2++;
                        ((hc) this).field_b = lk.a(((hc) this).field_i.charAt(incrementValue$58), 97);
                        return false;
                      } else {
                        int incrementValue$59 = var2;
                        var2++;
                        var4 = lk.a(((hc) this).field_i.charAt(incrementValue$59), 97);
                        int incrementValue$60 = var2;
                        var2++;
                        var5 = lk.a(((hc) this).field_i.charAt(incrementValue$60), 97);
                        int incrementValue$61 = var2;
                        var2++;
                        var6 = lk.a(((hc) this).field_i.charAt(incrementValue$61), 97);
                        int incrementValue$62 = var2;
                        var2++;
                        var7 = lk.a(((hc) this).field_i.charAt(incrementValue$62), 97);
                        int incrementValue$63 = var2;
                        var2++;
                        var8 = lk.a(((hc) this).field_i.charAt(incrementValue$63), 97);
                        int incrementValue$64 = var2;
                        var2++;
                        var9 = lk.a(((hc) this).field_i.charAt(incrementValue$64), 97);
                        int incrementValue$65 = var2;
                        var2++;
                        var10 = lk.a(((hc) this).field_i.charAt(incrementValue$65), 97);
                        int incrementValue$66 = var2;
                        var2++;
                        var11 = lk.a(((hc) this).field_i.charAt(incrementValue$66), 97);
                        int incrementValue$67 = var2;
                        var2++;
                        var12 = lk.a(((hc) this).field_i.charAt(incrementValue$67), 97);
                        var13 = (var6 >> 5) + (var5 << 1) + (var4 << 7);
                        var14 = -((var8 >> 4) + (var7 << 2) + ((31 & var6) << 8));
                        var15 = (var10 >> 3) + ((15 & var8) << 9) + (var9 << 3);
                        var16 = (var11 >> 4) + (var10 << 2 & 28);
                        var17 = var12 + (960 & var11 << 6);
                        ((hc) this).field_q[var3] = l.a(var13, var16, var17, (byte) 83, var15, var14);
                        if (var16 != 7) {
                          if (var16 != 0) {
                            if (var16 != -4) {
                              L9: {
                                if (var16 < 25) {
                                  break L9;
                                } else {
                                  if (-32 < var16) {
                                    break L9;
                                  } else {
                                    var3++;
                                    continue L4;
                                  }
                                }
                              }
                              mh.field_k[((hc) this).field_s] = mh.field_k[((hc) this).field_s] + 1;
                              var3++;
                              continue L4;
                            } else {
                              var3++;
                              continue L4;
                            }
                          } else {
                            var3++;
                            continue L4;
                          }
                        } else {
                          var3++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    var4 = 0;
                    L10: while (true) {
                      if (var4 > ((hc) this).field_v) {
                        var3++;
                        continue L3;
                      } else {
                        int incrementValue$68 = var2;
                        var2++;
                        int incrementValue$69 = var2;
                        var2++;
                        ((hc) this).field_x[var3][var4] = -((lk.a(((hc) this).field_i.charAt(incrementValue$68), 97) << 6) + lk.a(((hc) this).field_i.charAt(incrementValue$69), 97));
                        var4++;
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                var4 = 0;
                L11: while (true) {
                  if (var4 >= ((hc) this).field_v) {
                    var3++;
                    continue L2;
                  } else {
                    int incrementValue$70 = var2;
                    var2++;
                    ((hc) this).field_o[var3][var4] = (byte)lk.a(((hc) this).field_i.charAt(incrementValue$70), 97);
                    if (-64 == ((hc) this).field_o[var3][var4]) {
                      ((hc) this).field_o[var3][var4] = (byte) -1;
                      var4++;
                      continue L11;
                    } else {
                      if (-1 != (((hc) this).field_o[var3][var4] & 32)) {
                        ((hc) this).field_h[var3][var4] = true;
                        ((hc) this).field_o[var3][var4] = (byte)(((hc) this).field_o[var3][var4] - 32);
                        var4++;
                        continue L11;
                      } else {
                        var4++;
                        continue L11;
                      }
                    }
                  }
                }
              }
            }
          } else {
            L12: {
              if (((hc) this).field_a != null) {
                break L12;
              } else {
                ((hc) this).field_a = new ei();
                break L12;
              }
            }
            if (param0 == 0) {
              kh discarded$71 = ((hc) this).a(param0 + -100, true);
              ((hc) this).field_i = null;
              return false;
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private final double[] a(int param0, int param1, int param2, int param3, double[] param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        double[] var9_array = null;
        double[] var10 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double[] var22 = null;
        double[] var23 = null;
        double[] var24 = null;
        double[] var25 = null;
        double[] var26 = null;
        double[] var27 = null;
        double[] var28 = null;
        double[] var29 = null;
        double[] var30 = null;
        double[] var31 = null;
        double[] var32 = null;
        double[] var33 = null;
        double[] var34 = null;
        double[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var21 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var33 = new double[12];
              var30 = var33;
              var27 = var30;
              var24 = var27;
              var22 = var24;
              var34 = var22;
              var31 = var34;
              var28 = var31;
              var25 = var28;
              var9_array = var25;
              var32 = new double[9];
              var29 = var32;
              var26 = var29;
              var23 = var26;
              var10 = var23;
              var10[0] = (double)(100 * (param6 - param2));
              var10[1] = (double)(-((hc) this).field_x[param2][param1] + ((hc) this).field_x[param6][param7]);
              var10[3] = (double)((-param2 + param0) * 100);
              var10[2] = (double)((-param1 + param7) * 100);
              var10[4] = (double)(((hc) this).field_x[param0][param3] + -((hc) this).field_x[param2][param1]);
              var10[5] = (double)(100 * (-param1 + param3));
              ap.a(var32, 0, var32, 3, var33, 9);
              ap.a(var33, 9);
              var10[0] = param4[0] - (double)(param2 * 100);
              var10[1] = param4[1] - (double)((hc) this).field_x[param2][param1];
              var10[2] = param4[2] - (double)(100 * param1);
              var11 = ap.a(var32, 0, var33, 9);
              var10[4] = -(var33[10] * var11) + param4[1];
              var10[3] = param4[0] - var11 * var33[9];
              var10[param5] = -(var11 * var33[11]) + param4[2];
              if (param6 == param2) {
                var17 = (double)(-param1 + param7);
                var13 = ((double)(-(param1 * 100)) + var32[5]) / (100.0 * var17);
                var19 = (double)(-param2 + param0);
                var15 = (var32[3] - (double)(100 * param2)) / (100.0 * var19);
                break L1;
              } else {
                var17 = (double)(param6 + -param2);
                var13 = (var32[3] - (double)(100 * param2)) / (100.0 * var17);
                var19 = (double)(-param1 + param3);
                var15 = ((double)(-(100 * param1)) + var32[5]) / (100.0 * var19);
                break L1;
              }
            }
            L2: {
              L3: {
                if (0.0 > var13) {
                  break L3;
                } else {
                  if (var15 < 0.0) {
                    break L3;
                  } else {
                    if (1.0 >= var15 + var13) {
                      var9_array[0] = var32[3];
                      var9_array[2] = var32[5];
                      var9_array[1] = var32[4];
                      var9_array[7] = var34[10];
                      var34[3] = var11;
                      var9_array[6] = var34[9];
                      var9_array[8] = var34[11];
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              ap.a(param4[0], param4[1], param4[2], (double)(param6 * 100), (double)((hc) this).field_x[param6][param7], (double)(100 * param7), (double)(param2 * 100), (double)((hc) this).field_x[param2][param1], (double)(100 * param1), (double)(100 * param0), (double)((hc) this).field_x[param0][param3], (double)(100 * param3), var33);
              var22[8] = -var33[2] + param4[2];
              var22[6] = -var33[0] + param4[0];
              var22[7] = param4[1] - var33[1];
              ap.a(var33, 6);
              break L2;
            }
            stackOut_10_0 = (double[]) var9_array;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var9;
            stackOut_12_1 = new StringBuilder().append("hc.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_11_0;
    }

    final kh c(int param0) {
        kh var3 = null;
        rm var4 = null;
        kh var5 = null;
        pj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10_int = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
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
        int[] var28 = null;
        rm var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[][] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        var27 = Torquing.field_u;
        if (param0 == -20561) {
          L0: {
            if (null == ((hc) this).field_t) {
              var29 = new rm(64, 64, 0);
              var3 = new kh(var29);
              var4 = var29;
              var29.field_r = null;
              var4.field_G = null;
              var29.b();
              var5 = ((hc) this).a(param0 ^ 20531, true);
              var6 = var5.field_k;
              var7 = var6.field_k;
              var8 = var6.field_x;
              var42 = new int[var7][32];
              var10_int = 0;
              L1: while (true) {
                if (var7 <= var10_int) {
                  var43 = new int[var7];
                  var39 = var43;
                  var35 = var39;
                  var31 = var35;
                  var10 = var31;
                  var11 = 0;
                  L2: while (true) {
                    if (~var8 >= ~var11) {
                      ((hc) this).field_w = ((hc) this).field_w + 20;
                      var11 = 0;
                      L3: while (true) {
                        if (var7 <= var11) {
                          L4: {
                            if (16384 < var29.field_g) {
                              var29.field_g = 3840;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          kh.a(var3, (byte) -126);
                          ((hc) this).field_t = new kh(var29);
                          ((hc) this).field_t.field_k = (pj) (Object) var29.a(80, 1365, -1, -12, 12);
                          ((hc) this).field_t.field_q = var3.field_q;
                          break L0;
                        } else {
                          dk.a(var43, 0, var7);
                          var44 = var42[var11];
                          var40 = var44;
                          var36 = var40;
                          var32 = var36;
                          var28 = var32;
                          var12 = var28;
                          var13 = 0;
                          L5: while (true) {
                            if (~var13 <= ~var44.length) {
                              var45 = var42[var11];
                              var13 = 0;
                              L6: while (true) {
                                if (~var13 <= ~var45.length) {
                                  var11++;
                                  continue L3;
                                } else {
                                  L7: {
                                    var14 = var45[var13];
                                    if (var14 == -1) {
                                      break L7;
                                    } else {
                                      if (var43[var14] != 1) {
                                        break L7;
                                      } else {
                                        var15 = var6.field_y[var11];
                                        var16 = var6.field_y[var14];
                                        var17 = var6.field_j[var11];
                                        var18 = var6.field_j[var14];
                                        var19 = var6.field_v[var11];
                                        var20 = var6.field_v[var14];
                                        if (var18 < var17) {
                                          break L7;
                                        } else {
                                          L8: {
                                            if (var17 != var18) {
                                              break L8;
                                            } else {
                                              if (var19 > var20) {
                                                break L7;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          L9: {
                                            if (var17 == var18) {
                                              L10: {
                                                if (var17 < 100) {
                                                  break L10;
                                                } else {
                                                  if (!((hc) this).field_h[var17 / 100 - 1][var19 / 100]) {
                                                    break L10;
                                                  } else {
                                                    break L7;
                                                  }
                                                }
                                              }
                                              if (var17 >= 100 * ((hc) this).field_r) {
                                                break L9;
                                              } else {
                                                if (!((hc) this).field_h[var17 / 100][var19 / 100]) {
                                                  break L9;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              L11: {
                                                if (100 > var19) {
                                                  break L11;
                                                } else {
                                                  if (((hc) this).field_h[var17 / 100][-1 + var19 / 100]) {
                                                    break L7;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              }
                                              if (var19 >= 100 * ((hc) this).field_v) {
                                                break L9;
                                              } else {
                                                if (((hc) this).field_h[var17 / 100][var19 / 100]) {
                                                  break L7;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                          }
                                          L12: {
                                            if (~var18 != ~var17) {
                                              if (~var19 == ~(((hc) this).field_v * 100)) {
                                                break L7;
                                              } else {
                                                if (((hc) this).field_o[var17 / 100][var19 / 100] == -1) {
                                                  break L7;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            } else {
                                              L13: {
                                                if (var17 < 100) {
                                                  break L13;
                                                } else {
                                                  if (((hc) this).field_o[var17 / 100 + -1][var19 / 100] != -1) {
                                                    break L12;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              var21 = var15;
                                              var15 = var16;
                                              var16 = var21;
                                              var21 = var17;
                                              var17 = var18;
                                              var18 = var21;
                                              var21 = var19;
                                              var19 = var20;
                                              var20 = var21;
                                              break L12;
                                            }
                                          }
                                          var21 = ((hc) this).field_w;
                                          var22 = ((hc) this).field_w;
                                          cd.a(var29, -19729, 2);
                                          var23 = var29.a(var17, var21, var19);
                                          var24 = var29.a(var18, var22, var20);
                                          L14: while (true) {
                                            L15: {
                                              if (var15 < var21) {
                                                break L15;
                                              } else {
                                                if (~var16 <= ~var22) {
                                                  break L7;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            L16: {
                                              if (var21 > var15) {
                                                L17: {
                                                  var21 -= 100;
                                                  if (~var15 < ~var21) {
                                                    var21 = var15;
                                                    break L17;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                                cd.a(var29, -19729, 1);
                                                var25 = var29.a(var17, var21, var19);
                                                break L16;
                                              } else {
                                                var25 = var23;
                                                break L16;
                                              }
                                            }
                                            L18: {
                                              if (~var16 > ~var22) {
                                                L19: {
                                                  var22 -= 100;
                                                  if (var22 >= var16) {
                                                    break L19;
                                                  } else {
                                                    var22 = var16;
                                                    break L19;
                                                  }
                                                }
                                                cd.a(var29, -19729, 1);
                                                var26 = var29.a(var18, var22, var20);
                                                break L18;
                                              } else {
                                                var26 = var24;
                                                break L18;
                                              }
                                            }
                                            L20: {
                                              L21: {
                                                if (var23 == var25) {
                                                  break L21;
                                                } else {
                                                  if (var24 != var26) {
                                                    pm.a(var3, -27226, 2);
                                                    int discarded$4 = var29.a(var25, var23, var24, (byte) 1, (byte) -1, (short) 17493, (short) -1);
                                                    int discarded$5 = var29.a(var24, var26, var25, (byte) 1, (byte) -1, (short) 17493, (short) -1);
                                                    break L20;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              if (~var25 != ~var23) {
                                                pm.a(var3, -27226, 1);
                                                int discarded$6 = var29.a(var25, var23, var24, (byte) 1, (byte) -1, (short) 17493, (short) -1);
                                                break L20;
                                              } else {
                                                if (var24 != var26) {
                                                  pm.a(var3, -27226, 1);
                                                  int discarded$7 = var29.a(var23, var24, var26, (byte) 1, (byte) -1, (short) 17493, (short) -1);
                                                  break L20;
                                                } else {
                                                  var24 = var26;
                                                  var23 = var25;
                                                  continue L14;
                                                }
                                              }
                                            }
                                            var24 = var26;
                                            var23 = var25;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var13++;
                                  continue L6;
                                }
                              }
                            } else {
                              L22: {
                                var14 = var44[var13];
                                if (var14 == -1) {
                                  break L22;
                                } else {
                                  var10[var14] = var10[var14] + 1;
                                  break L22;
                                }
                              }
                              var13++;
                              continue L5;
                            }
                          }
                        }
                      }
                    } else {
                      L23: {
                        var12_int = var6.field_p[var11];
                        var13 = var6.field_u[var11];
                        var14 = var6.field_t[var11];
                        var10[var12_int] = var10[var12_int] + 1;
                        var42[var12_int][var10[var12_int]] = var13;
                        var10[var12_int] = var10[var12_int] + 1;
                        var42[var12_int][var10[var12_int]] = var14;
                        var10[var13] = var10[var13] + 1;
                        var42[var13][var10[var13]] = var12_int;
                        var10[var13] = var10[var13] + 1;
                        var42[var13][var10[var13]] = var14;
                        var10[var14] = var10[var14] + 1;
                        var42[var14][var10[var14]] = var12_int;
                        var10[var14] = var10[var14] + 1;
                        var42[var14][var10[var14]] = var13;
                        if (~((hc) this).field_w > ~var6.field_y[var12_int]) {
                          ((hc) this).field_w = var6.field_y[var12_int];
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (~((hc) this).field_w > ~var6.field_y[var13]) {
                          ((hc) this).field_w = var6.field_y[var13];
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (~((hc) this).field_w > ~var6.field_y[var14]) {
                          ((hc) this).field_w = var6.field_y[var14];
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      var11++;
                      continue L2;
                    }
                  }
                } else {
                  dk.a(var42[var10_int], 0, 32, -1);
                  var10_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          return ((hc) this).field_t;
        } else {
          return null;
        }
    }

    final boolean b(int param0) {
        int var2 = ((hc) this).field_t != null ? 1 : 0;
        int var3 = 96 % (param0 / 61);
        kh discarded$0 = ((hc) this).c(-20561);
        return var2 != 0;
    }

    final void d(int param0) {
        sg.field_s = ((hc) this).field_b;
        if (param0 != -18916) {
            ((hc) this).field_m = null;
        }
    }

    final static la a(boolean param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            gl var8 = null;
            la stackIn_10_0 = null;
            Throwable decompiledCaughtException = null;
            la stackOut_9_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (hq.field_a.field_t != null) {
                    jd.field_F = new o(hq.field_a.field_t, 5200, 0);
                    hq.field_a.field_t = null;
                    var6 = (Object) (Object) new pb(255, jd.field_F, new o(hq.field_a.field_n, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  if (jd.field_F == null) {
                    break L2;
                  } else {
                    L3: {
                      if (uj.field_b != null) {
                        break L3;
                      } else {
                        uj.field_b = new o[hq.field_a.field_w.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (uj.field_b[param2] != null) {
                        break L4;
                      } else {
                        uj.field_b[param2] = new o(hq.field_a.field_w[param2], 12000, 0);
                        hq.field_a.field_w[param2] = null;
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new pb(param2, jd.field_F, uj.field_b[param2], 2097152);
                    break L2;
                  }
                }
                var8 = no.field_n.a((pb) var7, (byte) 101, param2, (pb) var6, false);
                stackOut_9_0 = new la((me) (Object) var8, true, 1);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_10_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_u = null;
        field_c = null;
        field_d = null;
    }

    final kh a(int param0, boolean param1) {
        kh var4 = null;
        mp var5 = null;
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
        rm var16 = null;
        L0: {
          var15 = Torquing.field_u;
          if (param0 == -100) {
            break L0;
          } else {
            ((hc) this).field_w = -33;
            break L0;
          }
        }
        L1: {
          if (((hc) this).field_y == null) {
            var16 = new rm((((hc) this).field_x[0].length + 1) * (((hc) this).field_x.length - -1), ((hc) this).field_v * 2 * ((hc) this).field_r, 0);
            var4 = new kh(var16);
            var16.b();
            var16.field_G = null;
            var16.field_r = null;
            var5 = new mp(2 * (((hc) this).field_r * ((hc) this).field_v));
            var4.field_q = var5;
            var6 = ((hc) this).field_v + -1;
            L2: while (true) {
              if (0 > var6) {
                kh.a(var4, (byte) -102);
                ((hc) this).field_y = var4;
                ((hc) this).field_y.field_k = (pj) (Object) var16.a(80, 1365, -1, -12, 12);
                ((hc) this).field_y.field_k.field_i = new int[var16.field_k];
                ((hc) this).field_y.field_k.field_g = new int[var16.field_k];
                ((hc) this).field_y.field_k.field_m = var16.field_k;
                ((hc) this).field_y.field_k.field_h = new int[var16.field_k];
                var6 = 0;
                L3: while (true) {
                  if (var16.field_k <= var6) {
                    ((hc) this).field_y.field_k.field_F = null;
                    ((hc) this).field_y.field_l.field_D = null;
                    break L1;
                  } else {
                    ((hc) this).field_y.field_k.field_h[var6] = ie.a(65535, (int) var16.field_u[var6]);
                    ((hc) this).field_y.field_k.field_g[var6] = ie.a((int) var16.field_n[var6], 65535);
                    ((hc) this).field_y.field_k.field_i[var6] = ie.a((int) var16.field_x[var6], 65535);
                    var6++;
                    continue L3;
                  }
                }
              } else {
                var7 = -1;
                var8 = -1;
                var9 = 0;
                L4: while (true) {
                  if (((hc) this).field_r <= var9) {
                    var6--;
                    continue L2;
                  } else {
                    if (-1 == ((hc) this).field_o[var9][var6]) {
                      var7 = -1;
                      var9++;
                      continue L4;
                    } else {
                      L5: {
                        if (var7 == -1) {
                          cd.a(var16, param0 ^ 19827, 2);
                          var7 = var16.a(var9 * 100, ((hc) this).field_x[var9][var6], var6 * 100);
                          var8 = var16.a(100 * var9, ((hc) this).field_x[var9][var6 - -1], var6 * 100 - -100);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          cd.a(var16, param0 + -19629, 2);
                          var10 = var16.a(100 * var9 - -100, ((hc) this).field_x[var9 + 1][var6], var6 * 100);
                          var11 = var16.a((1 + var9) * 100, ((hc) this).field_x[var9 - -1][1 + var6], 100 + var6 * 100);
                          var12 = 3;
                          var13 = (short)be.field_c.b((int) ((hc) this).field_o[var9][var6]);
                          var14 = (short)mo.field_C[((hc) this).field_o[var9][var6]];
                          if (!param1) {
                            break L7;
                          } else {
                            if (((hc) this).field_x[var9][1 + var6] - ((hc) this).field_x[var9 - -1][1 + var6] != ((hc) this).field_x[var9][var6] + -((hc) this).field_x[1 + var9][var6]) {
                              break L7;
                            } else {
                              if (-((hc) this).field_x[1 + var9][var6 - -1] + ((hc) this).field_x[var9 + 1][var6] == -((hc) this).field_x[var9][var6 + 1] + ((hc) this).field_x[var9][var6]) {
                                pc.a(var7, 5265, var10, var11, var8, var4, (short) var14, (short) var13, var12);
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (0 != (var6 + var9) % 2) {
                          oj.a(var12, (short) var13, 2, param1, true, var8, var7, (short) var14, var10, var4);
                          oj.a(var12, (short) var13, 1, param1, true, var10, var11, (short) var14, var8, var4);
                          break L6;
                        } else {
                          oj.a(var12, (short) var13, 0, param1, true, var11, var8, (short) var14, var7, var4);
                          oj.a(var12, (short) var13, 3, param1, true, var7, var10, (short) var14, var11, var4);
                          break L6;
                        }
                      }
                      var8 = var11;
                      var7 = var10;
                      var9++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        return ((hc) this).field_y;
    }

    hc(int param0, String param1) {
        ((hc) this).field_w = -2147483648;
        ((hc) this).field_n = 0;
        try {
            ((hc) this).field_i = param1;
            ((hc) this).field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "hc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
