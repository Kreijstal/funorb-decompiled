/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class roa extends ka {
    private int field_Q;
    private int[][] field_a;
    private short[] field_i;
    private glb field_C;
    private int[] field_l;
    private float[] field_D;
    private int field_v;
    private int field_B;
    private int field_L;
    private int[] field_j;
    private int[] field_g;
    private boolean field_m;
    private glb field_h;
    private int field_z;
    private short[] field_r;
    private int[] field_K;
    private short[] field_e;
    private short[] field_d;
    private int field_I;
    private int field_M;
    private int field_u;
    private float[] field_y;
    private int[] field_t;
    private short[] field_c;
    private short[] field_x;
    private glb field_o;
    private int[] field_p;
    private int field_P;
    private byte[] field_b;
    private int field_G;
    private short[] field_O;
    private short[] field_A;
    private short[] field_f;
    private short[] field_J;
    private gib[] field_E;
    private short[] field_N;
    private rv field_H;
    private int[] field_w;
    private glb field_q;
    private short[] field_F;
    private byte[] field_n;
    private lga[] field_k;
    private int field_s;

    final int HA() {
        if (!((roa) this).field_m) {
            this.b(-27337);
        }
        return ((roa) this).field_z;
    }

    final void H(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((roa) this).field_P) {
            this.a((byte) -53);
            ((roa) this).field_m = false;
            return;
          } else {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ((roa) this).field_K[var4] = ((roa) this).field_K[var4] + param0;
                break L1;
              }
            }
            L2: {
              if (-1 != param1) {
                ((roa) this).field_j[var4] = ((roa) this).field_j[var4] + param1;
                break L2;
              } else {
                break L2;
              }
            }
            if (0 != param2) {
              ((roa) this).field_p[var4] = ((roa) this).field_p[var4] + param2;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(byte param0) {
        if (((roa) this).field_o != null) {
        }
        if (param0 > -42) {
            short discarded$0 = this.a(73, 73, 17, 37, 0.2685146629810333f, (cbb) null, -53, 101, -66L, 29, 0.045781638473272324f);
        }
    }

    roa(pf param0, cbb param1, int param2, int param3, int param4, int param5) {
        this(param0, param2, param5, true, false);
        int[] var8 = null;
        int var9_int = 0;
        long[] var9 = null;
        int var10 = 0;
        opa var10_ref = null;
        int var11_int = 0;
        hu[] var11 = null;
        int var12 = 0;
        Object var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        vib[] var15 = null;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        bqa var20_ref_bqa = null;
        int var20 = 0;
        sr var21_ref = null;
        int var21 = 0;
        int var22 = 0;
        float var22_float = 0.0f;
        int var23_int = 0;
        float var23 = 0.0f;
        int var24_int = 0;
        float var24 = 0.0f;
        int var25_int = 0;
        float var25 = 0.0f;
        int var26_int = 0;
        float var26 = 0.0f;
        int var27_int = 0;
        float var27 = 0.0f;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        vib var31_ref = null;
        int var32_int = 0;
        long var32 = 0L;
        vib var32_ref_vib = null;
        int var33_int = 0;
        long var33 = 0L;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        float var39 = 0.0f;
        int var39_int = 0;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        float var43 = 0.0f;
        int var43_int = 0;
        float var44 = 0.0f;
        int var44_int = 0;
        float var45 = 0.0f;
        int var45_int = 0;
        float var46 = 0.0f;
        int var46_int = 0;
        float var47 = 0.0f;
        int var47_int = 0;
        float var48 = 0.0f;
        int var48_int = 0;
        float var49 = 0.0f;
        int var49_int = 0;
        float var50 = 0.0f;
        int var50_int = 0;
        float var51 = 0.0f;
        int var51_int = 0;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        d var64 = null;
        int[] var65 = null;
        opa var66 = null;
        opa var67 = null;
        long[] var68 = null;
        bqa var69 = null;
        sr var70 = null;
        hu var71 = null;
        hu var72 = null;
        hu var73 = null;
        opa var74 = null;
        kua var75 = null;
        hu var77 = null;
        hu var78 = null;
        hu var79 = null;
        int[] var80 = null;
        int[] var81 = null;
        long[] var82 = null;
        int[] var84 = null;
        int[] var85 = null;
        long[] var86 = null;
        int[] var88 = null;
        int[] var89 = null;
        long[] var90 = null;
        float[] var91 = null;
        int[] var92 = null;
        int stackIn_15_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_63_0 = 0;
        byte stackOut_63_1 = 0;
        int stackOut_101_0 = 0;
        short stackOut_100_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_156_1 = 0;
        int stackOut_155_0 = 0;
        int stackOut_155_1 = 0;
        int stackOut_85_0 = 0;
        byte stackOut_84_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        var64 = param0.field_a;
        var89 = new int[param1.field_j];
        var85 = var89;
        var81 = var85;
        var65 = var81;
        var8 = var65;
        ((roa) this).field_l = new int[param1.field_D - -1];
        var9_int = 0;
        L0: while (true) {
          if (param1.field_j <= var9_int) {
            L1: {
              ((roa) this).field_Q = ((roa) this).field_v;
              var90 = new long[((roa) this).field_v];
              var86 = var90;
              var82 = var86;
              var68 = var82;
              var9 = var68;
              if (-1 == (((roa) this).field_I & 256 ^ -1)) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            var10 = stackIn_15_0;
            var11_int = 0;
            L2: while (true) {
              if (((roa) this).field_v <= var11_int) {
                L3: {
                  kn.a((byte) -24, var89, var90);
                  ((roa) this).field_P = param1.field_D;
                  ((roa) this).field_j = param1.field_G;
                  ((roa) this).field_p = param1.field_x;
                  ((roa) this).field_K = param1.field_v;
                  var11 = new hu[((roa) this).field_P];
                  if (null == param1.field_g) {
                    break L3;
                  } else {
                    ((roa) this).field_u = param1.field_g.length;
                    ((roa) this).field_k = new lga[((roa) this).field_u];
                    ((roa) this).field_E = new gib[((roa) this).field_u];
                    var12 = 0;
                    L4: while (true) {
                      if (((roa) this).field_u <= var12) {
                        break L3;
                      } else {
                        var69 = param1.field_g[var12];
                        var70 = jm.a(var69.field_e, 0);
                        var15_int = -1;
                        var16 = 0;
                        L5: while (true) {
                          L6: {
                            if (var16 >= ((roa) this).field_v) {
                              break L6;
                            } else {
                              if (var89[var16] != var69.field_b) {
                                var16++;
                                continue L5;
                              } else {
                                var15_int = var16;
                                break L6;
                              }
                            }
                          }
                          if ((var15_int ^ -1) != 0) {
                            L7: {
                              var16 = 16777215 & klb.field_o[param1.field_b[var69.field_b] & 65535];
                              stackOut_62_0 = var16;
                              stackIn_64_0 = stackOut_62_0;
                              stackIn_63_0 = stackOut_62_0;
                              if (param1.field_r == null) {
                                stackOut_64_0 = stackIn_64_0;
                                stackOut_64_1 = 0;
                                stackIn_65_0 = stackOut_64_0;
                                stackIn_65_1 = stackOut_64_1;
                                break L7;
                              } else {
                                stackOut_63_0 = stackIn_63_0;
                                stackOut_63_1 = param1.field_r[var69.field_b];
                                stackIn_65_0 = stackOut_63_0;
                                stackIn_65_1 = stackOut_63_1;
                                break L7;
                              }
                            }
                            var16 = stackIn_65_0 | -stackIn_65_1 + 255 << -194885032;
                            ((roa) this).field_k[var12] = new lga(var15_int, (int) param1.field_k[var69.field_b], (int) param1.field_o[var69.field_b], (int) param1.field_K[var69.field_b], var70.field_g, var70.field_b, var70.field_e, var70.field_d, var70.field_f, var70.field_a, var70.field_c, var69.field_c);
                            ((roa) this).field_E[var12] = new gib(var16);
                            var12++;
                            continue L4;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                  }
                }
                L8: {
                  var12 = 3 * ((roa) this).field_v;
                  ((roa) this).field_e = new short[((roa) this).field_v];
                  ((roa) this).field_A = new short[var12];
                  bsb.field_b = new long[var12];
                  ((roa) this).field_x = new short[var12];
                  ((roa) this).field_y = new float[var12];
                  ((roa) this).field_F = new short[var12];
                  ((roa) this).field_r = new short[var12];
                  ((roa) this).field_i = new short[((roa) this).field_v];
                  ((roa) this).field_n = new byte[((roa) this).field_v];
                  ((roa) this).field_J = new short[var12];
                  ((roa) this).field_f = new short[var12];
                  ((roa) this).field_O = new short[((roa) this).field_v];
                  ((roa) this).field_N = new short[((roa) this).field_v];
                  ((roa) this).field_b = new byte[var12];
                  ((roa) this).field_D = new float[var12];
                  ((roa) this).field_c = new short[((roa) this).field_v];
                  if (param1.field_w == null) {
                    break L8;
                  } else {
                    ((roa) this).field_d = new short[((roa) this).field_v];
                    break L8;
                  }
                }
                var13 = 0;
                var14 = 0;
                L9: while (true) {
                  if (var14 >= param1.field_D) {
                    ((roa) this).field_l[param1.field_D] = var13;
                    var75 = ao.a(param1, var89, ((roa) this).field_v, -3);
                    var15 = new vib[param1.field_j];
                    var16 = 0;
                    L10: while (true) {
                      if (var16 >= param1.field_j) {
                        var16 = 0;
                        L11: while (true) {
                          if (((roa) this).field_v <= var16) {
                            L12: {
                              if (-1 <= (((roa) this).field_Q ^ -1)) {
                                break L12;
                              } else {
                                var16 = 1;
                                var17_int = ((roa) this).field_O[0];
                                var18 = 0;
                                L13: while (true) {
                                  if (((roa) this).field_Q <= var18) {
                                    ((roa) this).field_w = new int[var16];
                                    ((roa) this).field_g = new int[1 + var16];
                                    ((roa) this).field_t = new int[var16];
                                    ((roa) this).field_g[0] = 0;
                                    var18 = ((roa) this).field_L;
                                    var16 = 0;
                                    var19 = 0;
                                    var17_int = ((roa) this).field_O[0];
                                    var20 = 0;
                                    L14: while (true) {
                                      if (var20 >= ((roa) this).field_Q) {
                                        ((roa) this).field_t[var16] = var18;
                                        ((roa) this).field_w[var16] = var19 + -var18 + 1;
                                        var16++;
                                        ((roa) this).field_g[var16] = ((roa) this).field_Q;
                                        break L12;
                                      } else {
                                        L15: {
                                          var21 = ((roa) this).field_O[var20];
                                          if (var21 == var17_int) {
                                            break L15;
                                          } else {
                                            ((roa) this).field_t[var16] = var18;
                                            ((roa) this).field_w[var16] = var19 + -var18 + 1;
                                            var16++;
                                            ((roa) this).field_g[var16] = var20;
                                            var18 = ((roa) this).field_L;
                                            var19 = 0;
                                            var17_int = var21;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          var22 = ((roa) this).field_N[var20];
                                          if (var22 <= var19) {
                                            break L16;
                                          } else {
                                            var19 = var22;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (var18 <= var22) {
                                            break L17;
                                          } else {
                                            var18 = var22;
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          var22 = ((roa) this).field_e[var20];
                                          if (var18 <= var22) {
                                            break L18;
                                          } else {
                                            var18 = var22;
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          if (var22 <= var19) {
                                            break L19;
                                          } else {
                                            var19 = var22;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          var22 = ((roa) this).field_i[var20];
                                          if (var18 <= var22) {
                                            break L20;
                                          } else {
                                            var18 = var22;
                                            break L20;
                                          }
                                        }
                                        if (var22 > var19) {
                                          var19 = var22;
                                          var20++;
                                          continue L14;
                                        } else {
                                          var20++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  } else {
                                    var19 = ((roa) this).field_O[var18];
                                    if (var19 != var17_int) {
                                      var17_int = var19;
                                      var16++;
                                      var18++;
                                      continue L13;
                                    } else {
                                      var18++;
                                      continue L13;
                                    }
                                  }
                                }
                              }
                            }
                            L21: {
                              bsb.field_b = null;
                              ((roa) this).field_A = rh.a(((roa) this).field_L, ((roa) this).field_A, (byte) 53);
                              ((roa) this).field_J = rh.a(((roa) this).field_L, ((roa) this).field_J, (byte) 108);
                              ((roa) this).field_F = rh.a(((roa) this).field_L, ((roa) this).field_F, (byte) 69);
                              ((roa) this).field_r = rh.a(((roa) this).field_L, ((roa) this).field_r, (byte) 50);
                              ((roa) this).field_x = rh.a(((roa) this).field_L, ((roa) this).field_x, (byte) 59);
                              ((roa) this).field_b = aba.a(((roa) this).field_b, ((roa) this).field_L, -28321);
                              ((roa) this).field_D = jp.a(((roa) this).field_D, ((roa) this).field_L, 7353);
                              ((roa) this).field_y = jp.a(((roa) this).field_y, ((roa) this).field_L, 7353);
                              if (null == param1.field_p) {
                                break L21;
                              } else {
                                if (!kg.a((byte) 11, ((roa) this).field_s, param2)) {
                                  break L21;
                                } else {
                                  int[][] discarded$2 = param1.a((byte) -37, false);
                                  break L21;
                                }
                              }
                            }
                            L22: {
                              if (null == param1.field_g) {
                                break L22;
                              } else {
                                if (!lnb.a(param2, ((roa) this).field_s, false)) {
                                  break L22;
                                } else {
                                  int[][] discarded$3 = param1.a(-126);
                                  break L22;
                                }
                              }
                            }
                            L23: {
                              if (null == param1.field_y) {
                                break L23;
                              } else {
                                if (!mhb.a(((roa) this).field_s, param2, -2679)) {
                                  break L23;
                                } else {
                                  var16 = 0;
                                  var92 = new int[256];
                                  var88 = var92;
                                  var84 = var88;
                                  var80 = var84;
                                  var17 = var80;
                                  var18 = 0;
                                  L24: while (true) {
                                    if (((roa) this).field_v <= var18) {
                                      ((roa) this).field_a = new int[1 + var16][];
                                      var18 = 0;
                                      L25: while (true) {
                                        if (var16 < var18) {
                                          var18 = 0;
                                          L26: while (true) {
                                            if (var18 >= ((roa) this).field_v) {
                                              break L23;
                                            } else {
                                              var19 = param1.field_y[var89[var18]];
                                              if (-1 >= (var19 ^ -1)) {
                                                var17[var19] = var17[var19] + 1;
                                                ((roa) this).field_a[var19][var17[var19]] = var18;
                                                var18++;
                                                continue L26;
                                              } else {
                                                var18++;
                                                continue L26;
                                              }
                                            }
                                          }
                                        } else {
                                          ((roa) this).field_a[var18] = new int[var92[var18]];
                                          var92[var18] = 0;
                                          var18++;
                                          continue L25;
                                        }
                                      }
                                    } else {
                                      var19 = param1.field_y[var89[var18]];
                                      if (0 <= var19) {
                                        L27: {
                                          if (var19 <= var16) {
                                            break L27;
                                          } else {
                                            var16 = var19;
                                            break L27;
                                          }
                                        }
                                        var17[var19] = var17[var19] + 1;
                                        var18++;
                                        continue L24;
                                      } else {
                                        var18++;
                                        continue L24;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L28: {
                              var17_int = var89[var16];
                              var18 = 65535 & param1.field_b[var17_int];
                              if (param1.field_M == null) {
                                var19 = -1;
                                break L28;
                              } else {
                                var19 = param1.field_M[var17_int];
                                break L28;
                              }
                            }
                            L29: {
                              if (param1.field_r != null) {
                                var20 = param1.field_r[var17_int] & 255;
                                break L29;
                              } else {
                                var20 = 0;
                                break L29;
                              }
                            }
                            L30: {
                              if (null == param1.field_u) {
                                stackOut_101_0 = -1;
                                stackIn_102_0 = stackOut_101_0;
                                break L30;
                              } else {
                                stackOut_100_0 = param1.field_u[var17_int];
                                stackIn_102_0 = stackOut_100_0;
                                break L30;
                              }
                            }
                            L31: {
                              var21 = stackIn_102_0;
                              if (-1 == var21) {
                                break L31;
                              } else {
                                if ((64 & ((roa) this).field_s) == 0) {
                                  break L31;
                                } else {
                                  var74 = var64.a(-20292, var21 & 65535);
                                  if (!var74.field_r) {
                                    break L31;
                                  } else {
                                    var21 = -1;
                                    break L31;
                                  }
                                }
                              }
                            }
                            L32: {
                              var22_float = 0.0f;
                              var23 = 0.0f;
                              var24 = 0.0f;
                              var25 = 0.0f;
                              var26 = 0.0f;
                              var27 = 0.0f;
                              var28 = 0;
                              var29 = 0;
                              var30 = 0;
                              if (0 == (var21 ^ -1)) {
                                break L32;
                              } else {
                                if (var19 == -1) {
                                  var24 = 1.0f;
                                  var29 = 2;
                                  var22_float = 0.0f;
                                  var25 = 1.0f;
                                  var28 = 1;
                                  var27 = 0.0f;
                                  var26 = 0.0f;
                                  var23 = 1.0f;
                                  break L32;
                                } else {
                                  var19 = var19 & 255;
                                  var31 = param1.field_e[var19];
                                  if (var31 == 0) {
                                    var32_int = param1.field_k[var17_int];
                                    var33_int = param1.field_o[var17_int];
                                    var34 = param1.field_K[var17_int];
                                    var35 = param1.field_t[var19];
                                    var36 = param1.field_i[var19];
                                    var37 = param1.field_H[var19];
                                    var38 = (float)param1.field_v[var35];
                                    var39 = (float)param1.field_G[var35];
                                    var40 = (float)param1.field_x[var35];
                                    var41 = (float)param1.field_v[var36] - var38;
                                    var42 = (float)param1.field_G[var36] - var39;
                                    var43 = -var40 + (float)param1.field_x[var36];
                                    var44 = -var38 + (float)param1.field_v[var37];
                                    var45 = (float)param1.field_G[var37] - var39;
                                    var46 = (float)param1.field_x[var37] - var40;
                                    var47 = (float)param1.field_v[var32_int] - var38;
                                    var48 = (float)param1.field_G[var32_int] - var39;
                                    var49 = (float)param1.field_x[var32_int] - var40;
                                    var50 = -var38 + (float)param1.field_v[var33_int];
                                    var51 = -var39 + (float)param1.field_G[var33_int];
                                    var52 = (float)param1.field_x[var33_int] - var40;
                                    var53 = -var38 + (float)param1.field_v[var34];
                                    var54 = -var39 + (float)param1.field_G[var34];
                                    var55 = -var40 + (float)param1.field_x[var34];
                                    var56 = -(var43 * var45) + var42 * var46;
                                    var57 = -(var41 * var46) + var44 * var43;
                                    var58 = var45 * var41 - var42 * var44;
                                    var59 = var45 * var58 - var57 * var46;
                                    var60 = -(var58 * var44) + var56 * var46;
                                    var61 = var57 * var44 - var45 * var56;
                                    var62 = 1.0f / (var42 * var60 + var41 * var59 + var43 * var61);
                                    var24 = (var52 * var61 + (var51 * var60 + var50 * var59)) * var62;
                                    var26 = var62 * (var55 * var61 + (var54 * var60 + var59 * var53));
                                    var22_float = var62 * (var49 * var61 + (var60 * var48 + var47 * var59));
                                    var60 = var56 * var43 - var41 * var58;
                                    var59 = -(var43 * var57) + var58 * var42;
                                    var61 = var57 * var41 - var56 * var42;
                                    var62 = 1.0f / (var46 * var61 + (var44 * var59 + var60 * var45));
                                    var25 = var62 * (var59 * var50 + var60 * var51 + var52 * var61);
                                    var23 = var62 * (var48 * var60 + var47 * var59 + var49 * var61);
                                    var27 = (var55 * var61 + (var54 * var60 + var59 * var53)) * var62;
                                    break L32;
                                  } else {
                                    var32_int = param1.field_k[var17_int];
                                    var33_int = param1.field_o[var17_int];
                                    var34 = param1.field_K[var17_int];
                                    var35 = var75.field_d[var19];
                                    var36 = var75.field_b[var19];
                                    var37 = var75.field_f[var19];
                                    var91 = var75.field_c[var19];
                                    var39_int = param1.field_n[var19];
                                    var40 = (float)param1.field_L[var19] / 256.0f;
                                    if (1 != var31) {
                                      if (2 == var31) {
                                        var41 = (float)param1.field_f[var19] / 256.0f;
                                        var42 = (float)param1.field_I[var19] / 256.0f;
                                        var43_int = param1.field_v[var33_int] - param1.field_v[var32_int];
                                        var44_int = -param1.field_G[var32_int] + param1.field_G[var33_int];
                                        var45_int = -param1.field_x[var32_int] + param1.field_x[var33_int];
                                        var46_int = -param1.field_v[var32_int] + param1.field_v[var34];
                                        var47_int = param1.field_G[var34] + -param1.field_G[var32_int];
                                        var48_int = param1.field_x[var34] + -param1.field_x[var32_int];
                                        var49_int = var48_int * var44_int + -(var47_int * var45_int);
                                        var50_int = var45_int * var46_int - var48_int * var43_int;
                                        var51_int = -(var44_int * var46_int) + var43_int * var47_int;
                                        var52 = 64.0f / (float)param1.field_F[var19];
                                        var53 = 64.0f / (float)param1.field_a[var19];
                                        var54 = 64.0f / (float)param1.field_C[var19];
                                        var55 = ((float)var51_int * var91[2] + ((float)var49_int * var91[0] + (float)var50_int * var91[1])) / var52;
                                        var56 = (var91[5] * (float)var51_int + ((float)var50_int * var91[4] + (float)var49_int * var91[3])) / var53;
                                        var57 = (var91[7] * (float)var50_int + (float)var49_int * var91[6] + (float)var51_int * var91[8]) / var54;
                                        var30 = mpa.a(-74, var56, var55, var57);
                                        dhb.a(var42, param1.field_x[var32_int], var41, (byte) 47, param1.field_v[var32_int], var37, param1.field_G[var32_int], var30, jqb.field_o, var35, var39_int, var91, var36, var40);
                                        var23 = jqb.field_o[1];
                                        var22_float = jqb.field_o[0];
                                        dhb.a(var42, param1.field_x[var33_int], var41, (byte) 81, param1.field_v[var33_int], var37, param1.field_G[var33_int], var30, jqb.field_o, var35, var39_int, var91, var36, var40);
                                        var24 = jqb.field_o[0];
                                        var25 = jqb.field_o[1];
                                        dhb.a(var42, param1.field_x[var34], var41, (byte) 39, param1.field_v[var34], var37, param1.field_G[var34], var30, jqb.field_o, var35, var39_int, var91, var36, var40);
                                        var26 = jqb.field_o[0];
                                        var27 = jqb.field_o[1];
                                        break L32;
                                      } else {
                                        if (var31 != 3) {
                                          break L32;
                                        } else {
                                          oma.a(var91, param1.field_x[var32_int], var40, jqb.field_o, var37, param1.field_v[var32_int], (byte) -82, var36, param1.field_G[var32_int], var39_int, var35);
                                          var23 = jqb.field_o[1];
                                          var22_float = jqb.field_o[0];
                                          oma.a(var91, param1.field_x[var33_int], var40, jqb.field_o, var37, param1.field_v[var33_int], (byte) -82, var36, param1.field_G[var33_int], var39_int, var35);
                                          var25 = jqb.field_o[1];
                                          var24 = jqb.field_o[0];
                                          oma.a(var91, param1.field_x[var34], var40, jqb.field_o, var37, param1.field_v[var34], (byte) -82, var36, param1.field_G[var34], var39_int, var35);
                                          var26 = jqb.field_o[0];
                                          var27 = jqb.field_o[1];
                                          if (-1 != (1 & var39_int ^ -1)) {
                                            L33: {
                                              if (var25 - var23 <= 0.5f) {
                                                if (var23 - var25 <= 0.5f) {
                                                  break L33;
                                                } else {
                                                  var28 = 2;
                                                  var25 = var25 + 1.0f;
                                                  break L33;
                                                }
                                              } else {
                                                var25 = var25 - 1.0f;
                                                var28 = 1;
                                                break L33;
                                              }
                                            }
                                            if (0.5f >= -var23 + var27) {
                                              if (0.5f >= -var27 + var23) {
                                                break L32;
                                              } else {
                                                var27 = var27 + 1.0f;
                                                var29 = 2;
                                                break L32;
                                              }
                                            } else {
                                              var29 = 1;
                                              var27 = var27 - 1.0f;
                                              break L32;
                                            }
                                          } else {
                                            L34: {
                                              if (0.5f < var24 - var22_float) {
                                                var24 = var24 - 1.0f;
                                                var28 = 1;
                                                break L34;
                                              } else {
                                                if (-var24 + var22_float <= 0.5f) {
                                                  break L34;
                                                } else {
                                                  var24 = var24 + 1.0f;
                                                  var28 = 2;
                                                  break L34;
                                                }
                                              }
                                            }
                                            if (0.5f < -var22_float + var26) {
                                              var26 = var26 - 1.0f;
                                              var29 = 1;
                                              break L32;
                                            } else {
                                              if (0.5f >= var22_float - var26) {
                                                break L32;
                                              } else {
                                                var29 = 2;
                                                var26 = var26 + 1.0f;
                                                break L32;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var41 = (float)param1.field_C[var19] / 1024.0f;
                                      ac.a(var91, var36, var39_int, var40, param1.field_v[var32_int], param1.field_G[var32_int], (byte) -52, var41, var37, jqb.field_o, var35, param1.field_x[var32_int]);
                                      var22_float = jqb.field_o[0];
                                      var23 = jqb.field_o[1];
                                      ac.a(var91, var36, var39_int, var40, param1.field_v[var33_int], param1.field_G[var33_int], (byte) -52, var41, var37, jqb.field_o, var35, param1.field_x[var33_int]);
                                      var25 = jqb.field_o[1];
                                      var24 = jqb.field_o[0];
                                      ac.a(var91, var36, var39_int, var40, param1.field_v[var34], param1.field_G[var34], (byte) -52, var41, var37, jqb.field_o, var35, param1.field_x[var34]);
                                      var27 = jqb.field_o[1];
                                      var26 = jqb.field_o[0];
                                      var42 = var41 / 2.0f;
                                      if ((var39_int & 1) == 0) {
                                        L35: {
                                          if (var42 >= var24 - var22_float) {
                                            if (var42 >= -var24 + var22_float) {
                                              break L35;
                                            } else {
                                              var28 = 2;
                                              var24 = var24 + var41;
                                              break L35;
                                            }
                                          } else {
                                            var28 = 1;
                                            var24 = var24 - var41;
                                            break L35;
                                          }
                                        }
                                        if (var26 - var22_float <= var42) {
                                          if (var42 >= -var26 + var22_float) {
                                            break L32;
                                          } else {
                                            var29 = 2;
                                            var26 = var26 + var41;
                                            break L32;
                                          }
                                        } else {
                                          var29 = 1;
                                          var26 = var26 - var41;
                                          break L32;
                                        }
                                      } else {
                                        L36: {
                                          if (var42 < -var23 + var25) {
                                            var28 = 1;
                                            var25 = var25 - var41;
                                            break L36;
                                          } else {
                                            if (var42 >= var23 - var25) {
                                              break L36;
                                            } else {
                                              var28 = 2;
                                              var25 = var25 + var41;
                                              break L36;
                                            }
                                          }
                                        }
                                        if (var42 >= -var23 + var27) {
                                          if (var23 - var27 <= var42) {
                                            break L32;
                                          } else {
                                            var27 = var27 + var41;
                                            var29 = 2;
                                            break L32;
                                          }
                                        } else {
                                          var29 = 1;
                                          var27 = var27 - var41;
                                          break L32;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L37: {
                              if (null != param1.field_E) {
                                var31 = param1.field_E[var17_int];
                                break L37;
                              } else {
                                var31 = 0;
                                break L37;
                              }
                            }
                            L38: {
                              if (var31 == 0) {
                                var32 = ((long)var20 + (long)(var30 << -1712201608) - -(long)(var18 << 1645891944) << -837908064) + (long)(var19 << 888740898);
                                var34 = param1.field_k[var17_int];
                                var35 = param1.field_o[var17_int];
                                var36 = param1.field_K[var17_int];
                                var77 = var11[var34];
                                ((roa) this).field_N[var16] = this.a(var77.field_d, var16, var34, 31809, var22_float, param1, var77.field_e, var77.field_c, var32, var77.field_a, var23);
                                var78 = var11[var35];
                                ((roa) this).field_e[var16] = this.a(var78.field_d, var16, var35, 31809, var24, param1, var78.field_e, var78.field_c, var32 + (long)var28, var78.field_a, var25);
                                var79 = var11[var36];
                                ((roa) this).field_i[var16] = this.a(var79.field_d, var16, var36, 31809, var26, param1, var79.field_e, var79.field_c, var32 + (long)var29, var79.field_a, var27);
                                break L38;
                              } else {
                                if ((var31 ^ -1) != -2) {
                                  break L38;
                                } else {
                                  L39: {
                                    var32_ref_vib = var15[var17_int];
                                    stackOut_154_0 = (256 + var32_ref_vib.field_c << -494158538) + (var19 << -2138106782);
                                    stackIn_156_0 = stackOut_154_0;
                                    stackIn_155_0 = stackOut_154_0;
                                    if ((var32_ref_vib.field_a ^ -1) < -1) {
                                      stackOut_156_0 = stackIn_156_0;
                                      stackOut_156_1 = 1024;
                                      stackIn_157_0 = stackOut_156_0;
                                      stackIn_157_1 = stackOut_156_1;
                                      break L39;
                                    } else {
                                      stackOut_155_0 = stackIn_155_0;
                                      stackOut_155_1 = 2048;
                                      stackIn_157_0 = stackOut_155_0;
                                      stackIn_157_1 = stackOut_155_1;
                                      break L39;
                                    }
                                  }
                                  var33 = (long)(stackIn_157_0 + (stackIn_157_1 + (var32_ref_vib.field_d - -256 << -1615583284))) + ((long)(var30 << -1958235016) - -(long)(var18 << 1692459624) + (long)var20 << -1711456160);
                                  ((roa) this).field_N[var16] = this.a(var32_ref_vib.field_d, var16, (int) param1.field_k[var17_int], 31809, var22_float, param1, 0, var32_ref_vib.field_c, var33, var32_ref_vib.field_a, var23);
                                  ((roa) this).field_e[var16] = this.a(var32_ref_vib.field_d, var16, (int) param1.field_o[var17_int], 31809, var24, param1, 0, var32_ref_vib.field_c, var33 + (long)var28, var32_ref_vib.field_a, var25);
                                  ((roa) this).field_i[var16] = this.a(var32_ref_vib.field_d, var16, (int) param1.field_K[var17_int], 31809, var26, param1, 0, var32_ref_vib.field_c, var33 + (long)var29, var32_ref_vib.field_a, var27);
                                  break L38;
                                }
                              }
                            }
                            L40: {
                              if (param1.field_r == null) {
                                break L40;
                              } else {
                                ((roa) this).field_n[var16] = param1.field_r[var17_int];
                                break L40;
                              }
                            }
                            L41: {
                              if (null == param1.field_w) {
                                break L41;
                              } else {
                                ((roa) this).field_d[var16] = param1.field_w[var17_int];
                                break L41;
                              }
                            }
                            ((roa) this).field_c[var16] = param1.field_b[var17_int];
                            ((roa) this).field_O[var16] = (short)var21;
                            var16++;
                            continue L11;
                          }
                        }
                      } else {
                        var17_int = param1.field_k[var16];
                        var18 = param1.field_o[var16];
                        var19 = param1.field_K[var16];
                        var20 = ((roa) this).field_K[var18] - ((roa) this).field_K[var17_int];
                        var21 = -((roa) this).field_j[var17_int] + ((roa) this).field_j[var18];
                        var22 = -((roa) this).field_p[var17_int] + ((roa) this).field_p[var18];
                        var23_int = -((roa) this).field_K[var17_int] + ((roa) this).field_K[var19];
                        var24_int = -((roa) this).field_j[var17_int] + ((roa) this).field_j[var19];
                        var25_int = ((roa) this).field_p[var19] - ((roa) this).field_p[var17_int];
                        var26_int = -(var22 * var24_int) + var25_int * var21;
                        var27_int = -(var20 * var25_int) + var22 * var23_int;
                        var28 = -(var23_int * var21) + var20 * var24_int;
                        L42: while (true) {
                          L43: {
                            if (8192 < var26_int) {
                              break L43;
                            } else {
                              if (-8193 > (var27_int ^ -1)) {
                                break L43;
                              } else {
                                if (var28 > 8192) {
                                  break L43;
                                } else {
                                  if (var26_int < -8192) {
                                    break L43;
                                  } else {
                                    if (var27_int < -8192) {
                                      break L43;
                                    } else {
                                      if (var28 >= -8192) {
                                        L44: {
                                          var29 = (int)Math.sqrt((double)(var26_int * var26_int - -(var27_int * var27_int) + var28 * var28));
                                          if (-1 > (var29 ^ -1)) {
                                            break L44;
                                          } else {
                                            var29 = 1;
                                            break L44;
                                          }
                                        }
                                        L45: {
                                          var26_int = var26_int * 256 / var29;
                                          var27_int = var27_int * 256 / var29;
                                          var28 = 256 * var28 / var29;
                                          if (param1.field_E == null) {
                                            stackOut_85_0 = 0;
                                            stackIn_86_0 = stackOut_85_0;
                                            break L45;
                                          } else {
                                            stackOut_84_0 = param1.field_E[var16];
                                            stackIn_86_0 = stackOut_84_0;
                                            break L45;
                                          }
                                        }
                                        var30 = stackIn_86_0;
                                        if (var30 == 0) {
                                          var71 = var11[var17_int];
                                          var71.field_a = var71.field_a + var26_int;
                                          var71.field_c = var71.field_c + var28;
                                          var71.field_e = var71.field_e + 1;
                                          var71.field_d = var71.field_d + var27_int;
                                          var72 = var11[var18];
                                          var72.field_a = var72.field_a + var26_int;
                                          var72.field_e = var72.field_e + 1;
                                          var72.field_d = var72.field_d + var27_int;
                                          var72.field_c = var72.field_c + var28;
                                          var73 = var11[var19];
                                          var73.field_a = var73.field_a + var26_int;
                                          var73.field_d = var73.field_d + var27_int;
                                          var73.field_c = var73.field_c + var28;
                                          var73.field_e = var73.field_e + 1;
                                          var16++;
                                          continue L10;
                                        } else {
                                          if (1 == var30) {
                                            var15[var16] = new vib();
                                            var31_ref = new vib();
                                            var31_ref.field_d = var27_int;
                                            var31_ref.field_a = var26_int;
                                            var31_ref.field_c = var28;
                                            var16++;
                                            continue L10;
                                          } else {
                                            var16++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var28 = var28 >> 1;
                          var26_int = var26_int >> 1;
                          var27_int = var27_int >> 1;
                          continue L42;
                        }
                      }
                    }
                  } else {
                    var15_int = ((roa) this).field_l[var14];
                    ((roa) this).field_l[var14] = var13;
                    var11[var14] = new hu();
                    var13 = var13 + var15_int;
                    var14++;
                    continue L9;
                  }
                }
              } else {
                L46: {
                  var12 = var89[var11_int];
                  var13_ref = null;
                  var14 = 0;
                  var15_int = 0;
                  var16 = 0;
                  var17_int = 0;
                  if (param1.field_g == null) {
                    break L46;
                  } else {
                    var18 = 0;
                    var19 = 0;
                    L47: while (true) {
                      if (param1.field_g.length <= var19) {
                        if (var18 == 0) {
                          break L46;
                        } else {
                          var9[var11_int] = 9223372036854775807L;
                          ((roa) this).field_Q = ((roa) this).field_Q - 1;
                          var11_int++;
                          continue L2;
                        }
                      } else {
                        var20_ref_bqa = param1.field_g[var19];
                        if (var12 == var20_ref_bqa.field_b) {
                          L48: {
                            var21_ref = jm.a(var20_ref_bqa.field_e, 0);
                            if (!var21_ref.field_a) {
                              break L48;
                            } else {
                              var18 = 1;
                              break L48;
                            }
                          }
                          if (0 != (var21_ref.field_e ^ -1)) {
                            L49: {
                              var66 = var64.a(-20292, var21_ref.field_e);
                              if (2 != var66.field_q) {
                                break L49;
                              } else {
                                break L49;
                              }
                            }
                            var19++;
                            continue L47;
                          } else {
                            var19++;
                            continue L47;
                          }
                        } else {
                          var19++;
                          continue L47;
                        }
                      }
                    }
                  }
                }
                L50: {
                  var18 = -1;
                  if (param1.field_u == null) {
                    break L50;
                  } else {
                    var18 = param1.field_u[var12];
                    if (-1 == var18) {
                      break L50;
                    } else {
                      L51: {
                        var67 = var64.a(-20292, var18 & 65535);
                        if (-1 == (64 & ((roa) this).field_s ^ -1)) {
                          break L51;
                        } else {
                          if (!var67.field_r) {
                            break L51;
                          } else {
                            var13_ref = null;
                            var18 = -1;
                            break L50;
                          }
                        }
                      }
                      var16 = var67.field_c;
                      var17_int = var67.field_n;
                      break L50;
                    }
                  }
                }
                L52: {
                  L53: {
                    if (null == param1.field_r) {
                      break L53;
                    } else {
                      if (param1.field_r[var12] == 0) {
                        break L53;
                      } else {
                        stackOut_38_0 = 1;
                        stackIn_45_0 = stackOut_38_0;
                        break L52;
                      }
                    }
                  }
                  if (var13_ref != null) {
                    if (((opa) var13_ref).field_q != 0) {
                      stackOut_43_0 = 1;
                      stackIn_45_0 = stackOut_43_0;
                      break L52;
                    } else {
                      stackOut_42_0 = 0;
                      stackIn_45_0 = stackOut_42_0;
                      break L52;
                    }
                  } else {
                    stackOut_40_0 = 0;
                    stackIn_45_0 = stackOut_40_0;
                    break L52;
                  }
                }
                L54: {
                  L55: {
                    var19 = stackIn_45_0;
                    if (var10 != 0) {
                      break L55;
                    } else {
                      if (var19 == 0) {
                        break L54;
                      } else {
                        break L55;
                      }
                    }
                  }
                  if (param1.field_m == null) {
                    break L54;
                  } else {
                    var14 = var14 + (param1.field_m[var12] << 1722994001);
                    break L54;
                  }
                }
                L56: {
                  if (var19 == 0) {
                    break L56;
                  } else {
                    var14 = var14 + 65536;
                    break L56;
                  }
                }
                var14 = var14 + (var16 << 1294821256 & 65280);
                var14 = var14 + (var17_int & 255);
                var15_int = var15_int + (-65536 & var18 << 1062597424);
                var15_int = var15_int + (var11_int & 65535);
                var9[var11_int] = (long)var15_int + ((long)var14 << 843010336);
                var11_int++;
                continue L2;
              }
            }
          } else {
            L57: {
              if (null == param1.field_E) {
                break L57;
              } else {
                if (2 != param1.field_E[var9_int]) {
                  break L57;
                } else {
                  var9_int++;
                  continue L0;
                }
              }
            }
            L58: {
              if (null == param1.field_u) {
                break L58;
              } else {
                if (param1.field_u[var9_int] == -1) {
                  break L58;
                } else {
                  L59: {
                    var10_ref = var64.a(-20292, 65535 & param1.field_u[var9_int]);
                    if ((((roa) this).field_s & 64) == 0) {
                      break L59;
                    } else {
                      if (var10_ref.field_r) {
                        break L58;
                      } else {
                        break L59;
                      }
                    }
                  }
                  if (!var10_ref.field_m) {
                    break L58;
                  } else {
                    var9_int++;
                    continue L0;
                  }
                }
              }
            }
            ((roa) this).field_v = ((roa) this).field_v + 1;
            var8[((roa) this).field_v] = var9_int;
            ((roa) this).field_l[param1.field_k[var9_int]] = ((roa) this).field_l[param1.field_k[var9_int]] + 1;
            ((roa) this).field_l[param1.field_o[var9_int]] = ((roa) this).field_l[param1.field_o[var9_int]] + 1;
            ((roa) this).field_l[param1.field_K[var9_int]] = ((roa) this).field_l[param1.field_K[var9_int]] + 1;
            var9_int++;
            continue L0;
          }
        }
    }

    final int V() {
        if (!(((roa) this).field_m)) {
            this.b(-27337);
        }
        return ((roa) this).field_B;
    }

    private final short a(int param0, int param1, int param2, int param3, float param4, cbb param5, int param6, int param7, long param8, int param9, float param10) {
        int var17 = 0;
        int var18 = VoidHunters.field_G;
        int var13 = ((roa) this).field_l[param2];
        int var14 = ((roa) this).field_l[param2 + 1];
        int var15 = 0;
        int var16 = var13;
        if (param3 != 31809) {
            return (short) 108;
        }
        while (var16 < var14) {
            var17 = ((roa) this).field_f[var16];
            if (!(var17 != 0)) {
                var15 = var16;
                break;
            }
            if (!(param8 != bsb.field_b[var16])) {
                return (short)(-1 + var17);
            }
            var16++;
        }
        ((roa) this).field_f[var15] = (short)(((roa) this).field_L + 1);
        bsb.field_b[var15] = param8;
        ((roa) this).field_J[((roa) this).field_L] = (short)param1;
        ((roa) this).field_A[((roa) this).field_L] = (short)param2;
        ((roa) this).field_F[((roa) this).field_L] = (short)param9;
        ((roa) this).field_r[((roa) this).field_L] = (short)param0;
        ((roa) this).field_x[((roa) this).field_L] = (short)param7;
        ((roa) this).field_b[((roa) this).field_L] = (byte)param6;
        ((roa) this).field_D[((roa) this).field_L] = param4;
        ((roa) this).field_y[((roa) this).field_L] = param10;
        ((roa) this).field_L = ((roa) this).field_L + 1;
        return (short)((roa) this).field_L;
    }

    final void O(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((roa) this).field_P) {
            this.a((byte) -111);
            ((roa) this).field_m = false;
            return;
          } else {
            L1: {
              if (-129 == (param0 ^ -1)) {
                break L1;
              } else {
                ((roa) this).field_K[var4] = param0 * ((roa) this).field_K[var4] >> -1677483993;
                break L1;
              }
            }
            L2: {
              if (param1 != 128) {
                ((roa) this).field_j[var4] = ((roa) this).field_j[var4] * param1 >> -2010093561;
                break L2;
              } else {
                break L2;
              }
            }
            if (param2 != 128) {
              ((roa) this).field_p[var4] = param2 * ((roa) this).field_p[var4] >> 248987111;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
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
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = VoidHunters.field_G;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        var8 = 0;
        var9 = 0;
        var10 = 0;
        L0: while (true) {
          if (var10 >= ((roa) this).field_P) {
            ((roa) this).field_z = var4;
            ((roa) this).field_M = var7;
            if (param0 == -27337) {
              ((roa) this).field_B = var2;
              ((roa) this).field_G = var5;
              ((roa) this).field_m = true;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              var11 = ((roa) this).field_K[var10];
              var12 = ((roa) this).field_j[var10];
              if (var3 <= var12) {
                break L1;
              } else {
                var3 = var12;
                break L1;
              }
            }
            L2: {
              if (var6 >= var12) {
                break L2;
              } else {
                var6 = var12;
                break L2;
              }
            }
            L3: {
              if (var11 <= var5) {
                break L3;
              } else {
                var5 = var11;
                break L3;
              }
            }
            L4: {
              var13 = ((roa) this).field_p[var10];
              if (var11 < var2) {
                var2 = var11;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var13 > var7) {
                var7 = var13;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var13 >= var4) {
                break L6;
              } else {
                var4 = var13;
                break L6;
              }
            }
            L7: {
              var14 = var11 * var11 + var13 * var13;
              if (var14 <= var8) {
                break L7;
              } else {
                var8 = var14;
                break L7;
              }
            }
            var14 = var12 * var12 + (var13 * var13 + var11 * var11);
            if (var9 < var14) {
              var9 = var14;
              var10++;
              continue L0;
            } else {
              var10++;
              continue L0;
            }
          }
        }
    }

    final int G() {
        if (!((roa) this).field_m) {
            this.b(-27337);
        }
        return ((roa) this).field_M;
    }

    final void a(int param0) {
        if (param0 != 26385) {
            ((roa) this).field_x = null;
        }
        if (!(((roa) this).field_o == null)) {
            ((roa) this).field_o.a(26363);
        }
        if (!(null == ((roa) this).field_q)) {
            ((roa) this).field_q.a(26363);
        }
        if (null != ((roa) this).field_C) {
            ((roa) this).field_C.a(param0 ^ 490);
        }
        if (!(((roa) this).field_h == null)) {
            ((roa) this).field_h.a(26363);
        }
        if (null != ((roa) this).field_H) {
            ((roa) this).field_H.a((byte) -35);
        }
    }

    final int RA() {
        if (!((roa) this).field_m) {
            this.b(-27337);
        }
        return ((roa) this).field_G;
    }

    roa(pf param0, int param1, int param2, boolean param3, boolean param4) {
        ((roa) this).field_Q = 0;
        ((roa) this).field_v = 0;
        ((roa) this).field_P = 0;
        ((roa) this).field_m = false;
        ((roa) this).field_L = 0;
        ((roa) this).field_I = param1;
        ((roa) this).field_s = param2;
        if (!param3) {
            // ifeq L85
        }
        ((roa) this).field_o = new glb(lga.a(14216, ((roa) this).field_s, ((roa) this).field_I));
        if (!param3) {
            // ifeq L130
        }
        ((roa) this).field_q = new glb(cma.a(((roa) this).field_s, ((roa) this).field_I, -22785));
        if (!param3) {
            // ifeq L174
        }
        ((roa) this).field_C = new glb(pf.a(0, ((roa) this).field_I, ((roa) this).field_s));
        if (!param3) {
            // ifeq L219
        }
        ((roa) this).field_h = new glb(lbb.a(((roa) this).field_s, ((roa) this).field_I, (byte) 30));
        if (!param3) {
            // ifeq L265
        }
        ((roa) this).field_H = new rv(iea.a(((roa) this).field_I, ((roa) this).field_s, (byte) -106));
    }

    static {
    }
}
