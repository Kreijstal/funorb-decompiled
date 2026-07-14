/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends iaa {
    private short[] field_k;
    byte[] field_e;
    sr[] field_D;
    private byte[] field_r;
    short[] field_x;
    private int[][] field_n;
    short[] field_I;
    private int[] field_o;
    short[] field_z;
    int[] field_v;
    private byte[] field_y;
    private short[] field_g;
    sr[] field_m;
    private byte[] field_f;
    int[] field_p;
    private int[][] field_G;
    byte[] field_s;
    int field_u;
    private byte[] field_c;
    jea[] field_B;
    short[] field_w;
    private byte[] field_h;
    byte[] field_q;
    int[] field_l;
    int[] field_J;
    private int[] field_t;
    int[] field_H;
    int field_F;
    int[] field_L;
    int field_i;
    int field_d;
    byte[] field_C;
    byte[] field_A;
    short[] field_E;
    private short[] field_j;

    private final void a(byte[] param0) {
        lu var2 = null;
        lu var3 = null;
        lu var4 = null;
        lu var5 = null;
        lu var6 = null;
        lu var7 = null;
        lu var8 = null;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var2 = new lu(param0);
          var3 = new lu(param0);
          var4 = new lu(param0);
          var5 = new lu(param0);
          var6 = new lu(param0);
          var7 = new lu(param0);
          var8 = new lu(param0);
          var2.field_g = param0.length - 23;
          var9 = var2.e((byte) 56);
          var10 = var2.e((byte) 55);
          var11 = var2.b(16711935);
          var12 = var2.b(16711935);
          if ((var12 & 1) != 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var13 = stackIn_3_0;
          if ((var12 & 2) != 2) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var14 = stackIn_6_0;
          var15 = var2.b(16711935);
          var16 = var2.b(16711935);
          var17 = var2.b(16711935);
          var18 = var2.b(16711935);
          var19 = var2.b(16711935);
          var20 = var2.e((byte) 53);
          var21 = var2.e((byte) 110);
          var22 = var2.e((byte) 75);
          var23 = var2.e((byte) 49);
          var24 = var2.e((byte) 113);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (var11 <= 0) {
            break L2;
          } else {
            ((le) this).field_e = new byte[var11];
            var2.field_g = 0;
            var28 = 0;
            L3: while (true) {
              if (var28 >= var11) {
                break L2;
              } else {
                L4: {
                  ((le) this).field_e[var28] = var2.b(true);
                  var29 = var2.b(true);
                  if (var29 != 0) {
                    break L4;
                  } else {
                    var25++;
                    break L4;
                  }
                }
                L5: {
                  if (var29 < 1) {
                    break L5;
                  } else {
                    if (var29 > 3) {
                      break L5;
                    } else {
                      var26++;
                      break L5;
                    }
                  }
                }
                if (var29 == 2) {
                  var27++;
                  var28++;
                  continue L3;
                } else {
                  var28++;
                  continue L3;
                }
              }
            }
          }
        }
        L6: {
          var28 = var11;
          var29 = var28;
          var28 = var28 + var9;
          var30 = var28;
          if (var13 == 0) {
            break L6;
          } else {
            var28 = var28 + var10;
            break L6;
          }
        }
        L7: {
          var31 = var28;
          var28 = var28 + var10;
          var32 = var28;
          if (var15 != 255) {
            break L7;
          } else {
            var28 = var28 + var10;
            break L7;
          }
        }
        L8: {
          var33 = var28;
          if (var17 != 1) {
            break L8;
          } else {
            var28 = var28 + var10;
            break L8;
          }
        }
        L9: {
          var34 = var28;
          if (var19 != 1) {
            break L9;
          } else {
            var28 = var28 + var9;
            break L9;
          }
        }
        L10: {
          var35 = var28;
          if (var16 != 1) {
            break L10;
          } else {
            var28 = var28 + var10;
            break L10;
          }
        }
        L11: {
          var36 = var28;
          var28 = var28 + var23;
          var37 = var28;
          if (var18 != 1) {
            break L11;
          } else {
            var28 = var28 + var10 * 2;
            break L11;
          }
        }
        L12: {
          var38 = var28;
          var28 = var28 + var24;
          var39 = var28;
          var28 = var28 + var10 * 2;
          var40 = var28;
          var28 = var28 + var20;
          var41 = var28;
          var28 = var28 + var21;
          var42 = var28;
          var28 = var28 + var22;
          var43 = var28;
          var28 = var28 + var25 * 6;
          var44 = var28;
          var28 = var28 + var26 * 6;
          var45 = var28;
          var28 = var28 + var26 * 6;
          var46 = var28;
          var28 = var28 + var26;
          var47 = var28;
          var28 = var28 + var26;
          var48 = var28;
          var28 = var28 + (var26 + var27 * 2);
          var49 = var28;
          ((le) this).field_d = var9;
          ((le) this).field_i = var10;
          ((le) this).field_u = var11;
          ((le) this).field_l = new int[var9];
          ((le) this).field_L = new int[var9];
          ((le) this).field_H = new int[var9];
          ((le) this).field_p = new int[var10];
          ((le) this).field_v = new int[var10];
          ((le) this).field_J = new int[var10];
          if (var19 != 1) {
            break L12;
          } else {
            ((le) this).field_o = new int[var9];
            break L12;
          }
        }
        L13: {
          if (var13 == 0) {
            break L13;
          } else {
            ((le) this).field_C = new byte[var10];
            break L13;
          }
        }
        L14: {
          if (var15 != 255) {
            break L14;
          } else {
            ((le) this).field_A = new byte[var10];
            break L14;
          }
        }
        L15: {
          if (var16 != 1) {
            break L15;
          } else {
            ((le) this).field_q = new byte[var10];
            break L15;
          }
        }
        L16: {
          if (var17 != 1) {
            break L16;
          } else {
            ((le) this).field_t = new int[var10];
            break L16;
          }
        }
        L17: {
          if (var18 != 1) {
            break L17;
          } else {
            ((le) this).field_x = new short[var10];
            break L17;
          }
        }
        L18: {
          if (var18 != 1) {
            break L18;
          } else {
            if (var11 <= 0) {
              break L18;
            } else {
              ((le) this).field_s = new byte[var10];
              break L18;
            }
          }
        }
        L19: {
          ((le) this).field_z = new short[var10];
          if (var11 <= 0) {
            break L19;
          } else {
            L20: {
              ((le) this).field_I = new short[var11];
              ((le) this).field_w = new short[var11];
              ((le) this).field_E = new short[var11];
              if (var26 <= 0) {
                break L20;
              } else {
                ((le) this).field_k = new short[var26];
                ((le) this).field_g = new short[var26];
                ((le) this).field_j = new short[var26];
                ((le) this).field_c = new byte[var26];
                ((le) this).field_r = new byte[var26];
                ((le) this).field_h = new byte[var26];
                break L20;
              }
            }
            if (var27 <= 0) {
              break L19;
            } else {
              ((le) this).field_f = new byte[var27];
              ((le) this).field_y = new byte[var27];
              break L19;
            }
          }
        }
        var2.field_g = var29;
        var3.field_g = var40;
        var4.field_g = var41;
        var5.field_g = var42;
        var6.field_g = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        L21: while (true) {
          if (var53 >= var9) {
            var2.field_g = var39;
            var3.field_g = var30;
            var4.field_g = var32;
            var5.field_g = var35;
            var6.field_g = var33;
            var7.field_g = var37;
            var8.field_g = var38;
            var53 = 0;
            L22: while (true) {
              if (var53 >= var10) {
                ((le) this).field_F = -1;
                var2.field_g = var36;
                var3.field_g = var31;
                var53 = 0;
                var54 = 0;
                var55 = 0;
                var56 = 0;
                var57 = 0;
                L23: while (true) {
                  if (var57 >= var10) {
                    ((le) this).field_F = ((le) this).field_F + 1;
                    var2.field_g = var43;
                    var3.field_g = var44;
                    var4.field_g = var45;
                    var5.field_g = var46;
                    var6.field_g = var47;
                    var7.field_g = var48;
                    var57 = 0;
                    L24: while (true) {
                      if (var57 >= var11) {
                        L25: {
                          if (var14 == 0) {
                            break L25;
                          } else {
                            L26: {
                              var2.field_g = var49;
                              var57 = var2.b(16711935);
                              if (var57 <= 0) {
                                break L26;
                              } else {
                                var2.field_g = var2.field_g + 4 * var57;
                                break L26;
                              }
                            }
                            var58 = var2.b(16711935);
                            if (var58 <= 0) {
                              break L25;
                            } else {
                              var2.field_g = var2.field_g + 4 * var58;
                              break L25;
                            }
                          }
                        }
                        return;
                      } else {
                        L27: {
                          var58 = ((le) this).field_e[var57] & 255;
                          if (var58 != 0) {
                            break L27;
                          } else {
                            ((le) this).field_I[var57] = (short)var2.e((byte) 47);
                            ((le) this).field_w[var57] = (short)var2.e((byte) 59);
                            ((le) this).field_E[var57] = (short)var2.e((byte) 89);
                            break L27;
                          }
                        }
                        L28: {
                          if (var58 != 1) {
                            break L28;
                          } else {
                            ((le) this).field_I[var57] = (short)var3.e((byte) 121);
                            ((le) this).field_w[var57] = (short)var3.e((byte) 66);
                            ((le) this).field_E[var57] = (short)var3.e((byte) 96);
                            ((le) this).field_k[var57] = (short)var4.e((byte) 94);
                            ((le) this).field_g[var57] = (short)var4.e((byte) 111);
                            ((le) this).field_j[var57] = (short)var4.e((byte) 121);
                            ((le) this).field_c[var57] = var5.b(true);
                            ((le) this).field_r[var57] = var6.b(true);
                            ((le) this).field_h[var57] = var7.b(true);
                            break L28;
                          }
                        }
                        L29: {
                          if (var58 != 2) {
                            break L29;
                          } else {
                            ((le) this).field_I[var57] = (short)var3.e((byte) 96);
                            ((le) this).field_w[var57] = (short)var3.e((byte) 66);
                            ((le) this).field_E[var57] = (short)var3.e((byte) 78);
                            ((le) this).field_k[var57] = (short)var4.e((byte) 124);
                            ((le) this).field_g[var57] = (short)var4.e((byte) 86);
                            ((le) this).field_j[var57] = (short)var4.e((byte) 113);
                            ((le) this).field_c[var57] = var5.b(true);
                            ((le) this).field_r[var57] = var6.b(true);
                            ((le) this).field_h[var57] = var7.b(true);
                            ((le) this).field_f[var57] = var7.b(true);
                            ((le) this).field_y[var57] = var7.b(true);
                            break L29;
                          }
                        }
                        if (var58 == 3) {
                          ((le) this).field_I[var57] = (short)var3.e((byte) 125);
                          ((le) this).field_w[var57] = (short)var3.e((byte) 119);
                          ((le) this).field_E[var57] = (short)var3.e((byte) 124);
                          ((le) this).field_k[var57] = (short)var4.e((byte) 50);
                          ((le) this).field_g[var57] = (short)var4.e((byte) 62);
                          ((le) this).field_j[var57] = (short)var4.e((byte) 95);
                          ((le) this).field_c[var57] = var5.b(true);
                          ((le) this).field_r[var57] = var6.b(true);
                          ((le) this).field_h[var57] = var7.b(true);
                          var57++;
                          continue L24;
                        } else {
                          var57++;
                          continue L24;
                        }
                      }
                    }
                  } else {
                    L30: {
                      var58 = var3.b(16711935);
                      if (var58 != 1) {
                        break L30;
                      } else {
                        L31: {
                          var53 = var2.e(-4095) + var56;
                          var56 = var53;
                          var54 = var2.e(-4095) + var56;
                          var56 = var54;
                          var55 = var2.e(-4095) + var56;
                          var56 = var55;
                          ((le) this).field_p[var57] = var53;
                          ((le) this).field_v[var57] = var54;
                          ((le) this).field_J[var57] = var55;
                          if (var53 <= ((le) this).field_F) {
                            break L31;
                          } else {
                            ((le) this).field_F = var53;
                            break L31;
                          }
                        }
                        L32: {
                          if (var54 <= ((le) this).field_F) {
                            break L32;
                          } else {
                            ((le) this).field_F = var54;
                            break L32;
                          }
                        }
                        if (var55 <= ((le) this).field_F) {
                          break L30;
                        } else {
                          ((le) this).field_F = var55;
                          break L30;
                        }
                      }
                    }
                    L33: {
                      if (var58 != 2) {
                        break L33;
                      } else {
                        var54 = var55;
                        var55 = var2.e(-4095) + var56;
                        var56 = var55;
                        ((le) this).field_p[var57] = var53;
                        ((le) this).field_v[var57] = var54;
                        ((le) this).field_J[var57] = var55;
                        if (var55 <= ((le) this).field_F) {
                          break L33;
                        } else {
                          ((le) this).field_F = var55;
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (var58 != 3) {
                        break L34;
                      } else {
                        var53 = var55;
                        var55 = var2.e(-4095) + var56;
                        var56 = var55;
                        ((le) this).field_p[var57] = var53;
                        ((le) this).field_v[var57] = var54;
                        ((le) this).field_J[var57] = var55;
                        if (var55 <= ((le) this).field_F) {
                          break L34;
                        } else {
                          ((le) this).field_F = var55;
                          break L34;
                        }
                      }
                    }
                    if (var58 == 4) {
                      var59 = var53;
                      var53 = var54;
                      var54 = var59;
                      var55 = var2.e(-4095) + var56;
                      var56 = var55;
                      ((le) this).field_p[var57] = var53;
                      ((le) this).field_v[var57] = var54;
                      ((le) this).field_J[var57] = var55;
                      if (var55 > ((le) this).field_F) {
                        ((le) this).field_F = var55;
                        var57++;
                        continue L23;
                      } else {
                        var57++;
                        continue L23;
                      }
                    } else {
                      var57++;
                      continue L23;
                    }
                  }
                }
              } else {
                L35: {
                  ((le) this).field_z[var53] = (short)var2.e((byte) 105);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    ((le) this).field_C[var53] = var3.b(true);
                    break L35;
                  }
                }
                L36: {
                  if (var15 != 255) {
                    break L36;
                  } else {
                    ((le) this).field_A[var53] = var4.b(true);
                    break L36;
                  }
                }
                L37: {
                  if (var16 != 1) {
                    break L37;
                  } else {
                    ((le) this).field_q[var53] = var5.b(true);
                    break L37;
                  }
                }
                L38: {
                  if (var17 != 1) {
                    break L38;
                  } else {
                    ((le) this).field_t[var53] = var6.b(16711935);
                    break L38;
                  }
                }
                L39: {
                  if (var18 != 1) {
                    break L39;
                  } else {
                    ((le) this).field_x[var53] = (short)(var7.e((byte) 121) - 1);
                    break L39;
                  }
                }
                if (((le) this).field_s != null) {
                  if (((le) this).field_x[var53] == -1) {
                    ((le) this).field_s[var53] = (byte)-1;
                    var53++;
                    continue L22;
                  } else {
                    ((le) this).field_s[var53] = (byte)(var8.b(16711935) - 1);
                    var53++;
                    continue L22;
                  }
                } else {
                  var53++;
                  continue L22;
                }
              }
            }
          } else {
            L40: {
              var54 = var2.b(16711935);
              var55 = 0;
              if ((var54 & 1) == 0) {
                break L40;
              } else {
                var55 = var3.e(-4095);
                break L40;
              }
            }
            L41: {
              var56 = 0;
              if ((var54 & 2) == 0) {
                break L41;
              } else {
                var56 = var4.e(-4095);
                break L41;
              }
            }
            L42: {
              var57 = 0;
              if ((var54 & 4) == 0) {
                break L42;
              } else {
                var57 = var5.e(-4095);
                break L42;
              }
            }
            ((le) this).field_l[var53] = var50 + var55;
            ((le) this).field_L[var53] = var51 + var56;
            ((le) this).field_H[var53] = var52 + var57;
            var50 = ((le) this).field_l[var53];
            var51 = ((le) this).field_L[var53];
            var52 = ((le) this).field_H[var53];
            if (var19 == 1) {
              ((le) this).field_o[var53] = var6.b(16711935);
              var53++;
              continue L21;
            } else {
              var53++;
              continue L21;
            }
          }
        }
    }

    final void b() {
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
        int var15 = 0;
        jea var16 = null;
        sr var17 = null;
        sr var18 = null;
        sr var19 = null;
        if (((le) this).field_D == null) {
          ((le) this).field_D = new sr[((le) this).field_F];
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((le) this).field_F) {
              var1 = 0;
              L1: while (true) {
                if (var1 >= ((le) this).field_i) {
                  return;
                } else {
                  var2 = ((le) this).field_p[var1];
                  var3 = ((le) this).field_v[var1];
                  var4 = ((le) this).field_J[var1];
                  var5 = ((le) this).field_l[var3] - ((le) this).field_l[var2];
                  var6 = ((le) this).field_L[var3] - ((le) this).field_L[var2];
                  var7 = ((le) this).field_H[var3] - ((le) this).field_H[var2];
                  var8 = ((le) this).field_l[var4] - ((le) this).field_l[var2];
                  var9 = ((le) this).field_L[var4] - ((le) this).field_L[var2];
                  var10 = ((le) this).field_H[var4] - ((le) this).field_H[var2];
                  var11 = var6 * var10 - var9 * var7;
                  var12 = var7 * var8 - var10 * var5;
                  var13 = var5 * var9 - var8 * var6;
                  L2: while (true) {
                    L3: {
                      if (var11 > 8192) {
                        break L3;
                      } else {
                        if (var12 > 8192) {
                          break L3;
                        } else {
                          if (var13 > 8192) {
                            break L3;
                          } else {
                            if (var11 < -8192) {
                              break L3;
                            } else {
                              if (var12 < -8192) {
                                break L3;
                              } else {
                                if (var13 >= -8192) {
                                  L4: {
                                    var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
                                    if (var14 > 0) {
                                      break L4;
                                    } else {
                                      var14 = 1;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    var11 = var11 * 256 / var14;
                                    var12 = var12 * 256 / var14;
                                    var13 = var13 * 256 / var14;
                                    if (((le) this).field_C != null) {
                                      var15 = ((le) this).field_C[var1];
                                      break L5;
                                    } else {
                                      var15 = 0;
                                      break L5;
                                    }
                                  }
                                  if (var15 != 0) {
                                    if (var15 == 1) {
                                      L6: {
                                        if (((le) this).field_B != null) {
                                          break L6;
                                        } else {
                                          ((le) this).field_B = new jea[((le) this).field_i];
                                          break L6;
                                        }
                                      }
                                      ((le) this).field_B[var1] = new jea();
                                      var16 = new jea();
                                      var16.field_b = var11;
                                      var16.field_e = var12;
                                      var16.field_a = var13;
                                      var1++;
                                      continue L1;
                                    } else {
                                      var1++;
                                      continue L1;
                                    }
                                  } else {
                                    var17 = ((le) this).field_D[var2];
                                    var17.field_f = var17.field_f + var11;
                                    var17.field_h = var17.field_h + var12;
                                    var17.field_e = var17.field_e + var13;
                                    var17.field_g = var17.field_g + 1;
                                    var18 = ((le) this).field_D[var3];
                                    var18.field_f = var18.field_f + var11;
                                    var18.field_h = var18.field_h + var12;
                                    var18.field_e = var18.field_e + var13;
                                    var18.field_g = var18.field_g + 1;
                                    var19 = ((le) this).field_D[var4];
                                    var19.field_f = var19.field_f + var11;
                                    var19.field_h = var19.field_h + var12;
                                    var19.field_e = var19.field_e + var13;
                                    var19.field_g = var19.field_g + 1;
                                    var1++;
                                    continue L1;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var11 = var11 >> 1;
                    var12 = var12 >> 1;
                    var13 = var13 >> 1;
                    continue L2;
                  }
                }
              }
            } else {
              ((le) this).field_D[var1] = new sr();
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final gga a(int param0, int param1, int param2, int param3, int param4) {
        return (gga) (Object) new ss((le) this, param0, param1, param2, param3, param4);
    }

    final static le a(vr param0, String param1, String param2) {
        byte[] var3 = param0.a((byte) 123, param2, param1);
        if (var3 == null) {
            return null;
        }
        return new le(var3);
    }

    private final void b(byte[] param0) {
        int var2 = 0;
        int var3 = 0;
        lu var4 = null;
        lu var5 = null;
        lu var6 = null;
        lu var7 = null;
        lu var8 = null;
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
        L0: {
          var2 = 0;
          var3 = 0;
          var4 = new lu(param0);
          var5 = new lu(param0);
          var6 = new lu(param0);
          var7 = new lu(param0);
          var8 = new lu(param0);
          var4.field_g = param0.length - 18;
          var9 = var4.e((byte) 120);
          var10 = var4.e((byte) 74);
          var11 = var4.b(16711935);
          var12 = var4.b(16711935);
          var13 = var4.b(16711935);
          var14 = var4.b(16711935);
          var15 = var4.b(16711935);
          var16 = var4.b(16711935);
          var17 = var4.e((byte) 121);
          var18 = var4.e((byte) 62);
          var19 = var4.e((byte) 95);
          var20 = var4.e((byte) 112);
          var21 = 0;
          var22 = var21;
          var21 = var21 + var9;
          var23 = var21;
          var21 = var21 + var10;
          var24 = var21;
          if (var13 != 255) {
            break L0;
          } else {
            var21 = var21 + var10;
            break L0;
          }
        }
        L1: {
          var25 = var21;
          if (var15 != 1) {
            break L1;
          } else {
            var21 = var21 + var10;
            break L1;
          }
        }
        L2: {
          var26 = var21;
          if (var12 != 1) {
            break L2;
          } else {
            var21 = var21 + var10;
            break L2;
          }
        }
        L3: {
          var27 = var21;
          if (var16 != 1) {
            break L3;
          } else {
            var21 = var21 + var9;
            break L3;
          }
        }
        L4: {
          var28 = var21;
          if (var14 != 1) {
            break L4;
          } else {
            var21 = var21 + var10;
            break L4;
          }
        }
        L5: {
          var29 = var21;
          var21 = var21 + var20;
          var30 = var21;
          var21 = var21 + var10 * 2;
          var31 = var21;
          var21 = var21 + var11 * 6;
          var32 = var21;
          var21 = var21 + var17;
          var33 = var21;
          var21 = var21 + var18;
          var34 = var21;
          var21 = var21 + var19;
          ((le) this).field_d = var9;
          ((le) this).field_i = var10;
          ((le) this).field_u = var11;
          ((le) this).field_l = new int[var9];
          ((le) this).field_L = new int[var9];
          ((le) this).field_H = new int[var9];
          ((le) this).field_p = new int[var10];
          ((le) this).field_v = new int[var10];
          ((le) this).field_J = new int[var10];
          if (var11 <= 0) {
            break L5;
          } else {
            ((le) this).field_e = new byte[var11];
            ((le) this).field_I = new short[var11];
            ((le) this).field_w = new short[var11];
            ((le) this).field_E = new short[var11];
            break L5;
          }
        }
        L6: {
          if (var16 != 1) {
            break L6;
          } else {
            ((le) this).field_o = new int[var9];
            break L6;
          }
        }
        L7: {
          if (var12 != 1) {
            break L7;
          } else {
            ((le) this).field_C = new byte[var10];
            ((le) this).field_s = new byte[var10];
            ((le) this).field_x = new short[var10];
            break L7;
          }
        }
        L8: {
          if (var13 != 255) {
            break L8;
          } else {
            ((le) this).field_A = new byte[var10];
            break L8;
          }
        }
        L9: {
          if (var14 != 1) {
            break L9;
          } else {
            ((le) this).field_q = new byte[var10];
            break L9;
          }
        }
        L10: {
          if (var15 != 1) {
            break L10;
          } else {
            ((le) this).field_t = new int[var10];
            break L10;
          }
        }
        ((le) this).field_z = new short[var10];
        var4.field_g = var22;
        var5.field_g = var32;
        var6.field_g = var33;
        var7.field_g = var34;
        var8.field_g = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        var38 = 0;
        L11: while (true) {
          if (var38 >= var9) {
            var4.field_g = var30;
            var5.field_g = var26;
            var6.field_g = var24;
            var7.field_g = var28;
            var8.field_g = var25;
            var38 = 0;
            L12: while (true) {
              if (var38 >= var10) {
                ((le) this).field_F = -1;
                var4.field_g = var29;
                var5.field_g = var23;
                var38 = 0;
                var39 = 0;
                var40 = 0;
                var41 = 0;
                var42 = 0;
                L13: while (true) {
                  if (var42 >= var10) {
                    ((le) this).field_F = ((le) this).field_F + 1;
                    var4.field_g = var31;
                    var42 = 0;
                    L14: while (true) {
                      if (var42 >= var11) {
                        L15: {
                          if (((le) this).field_s == null) {
                            break L15;
                          } else {
                            var42 = 0;
                            var45 = 0;
                            var43 = var45;
                            L16: while (true) {
                              if (var45 >= var10) {
                                if (var42 != 0) {
                                  break L15;
                                } else {
                                  ((le) this).field_s = null;
                                  break L15;
                                }
                              } else {
                                var44 = ((le) this).field_s[var45] & 255;
                                if (var44 != 255) {
                                  L17: {
                                    if ((((le) this).field_I[var44] & 65535) != ((le) this).field_p[var45]) {
                                      break L17;
                                    } else {
                                      if ((((le) this).field_w[var44] & 65535) != ((le) this).field_v[var45]) {
                                        break L17;
                                      } else {
                                        if ((((le) this).field_E[var44] & 65535) != ((le) this).field_J[var45]) {
                                          break L17;
                                        } else {
                                          ((le) this).field_s[var45] = (byte)-1;
                                          var45++;
                                          continue L16;
                                        }
                                      }
                                    }
                                  }
                                  var42 = 1;
                                  var45++;
                                  continue L16;
                                } else {
                                  var45++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                        L18: {
                          if (var3 != 0) {
                            break L18;
                          } else {
                            ((le) this).field_x = null;
                            break L18;
                          }
                        }
                        L19: {
                          if (var2 != 0) {
                            break L19;
                          } else {
                            ((le) this).field_C = null;
                            break L19;
                          }
                        }
                        return;
                      } else {
                        ((le) this).field_e[var42] = (byte) 0;
                        ((le) this).field_I[var42] = (short)var4.e((byte) 52);
                        ((le) this).field_w[var42] = (short)var4.e((byte) 98);
                        ((le) this).field_E[var42] = (short)var4.e((byte) 98);
                        var42++;
                        continue L14;
                      }
                    }
                  } else {
                    L20: {
                      var43 = var5.b(16711935);
                      if (var43 != 1) {
                        break L20;
                      } else {
                        L21: {
                          var38 = var4.e(-4095) + var41;
                          var41 = var38;
                          var39 = var4.e(-4095) + var41;
                          var41 = var39;
                          var40 = var4.e(-4095) + var41;
                          var41 = var40;
                          ((le) this).field_p[var42] = var38;
                          ((le) this).field_v[var42] = var39;
                          ((le) this).field_J[var42] = var40;
                          if (var38 <= ((le) this).field_F) {
                            break L21;
                          } else {
                            ((le) this).field_F = var38;
                            break L21;
                          }
                        }
                        L22: {
                          if (var39 <= ((le) this).field_F) {
                            break L22;
                          } else {
                            ((le) this).field_F = var39;
                            break L22;
                          }
                        }
                        if (var40 <= ((le) this).field_F) {
                          break L20;
                        } else {
                          ((le) this).field_F = var40;
                          break L20;
                        }
                      }
                    }
                    L23: {
                      if (var43 != 2) {
                        break L23;
                      } else {
                        var39 = var40;
                        var40 = var4.e(-4095) + var41;
                        var41 = var40;
                        ((le) this).field_p[var42] = var38;
                        ((le) this).field_v[var42] = var39;
                        ((le) this).field_J[var42] = var40;
                        if (var40 <= ((le) this).field_F) {
                          break L23;
                        } else {
                          ((le) this).field_F = var40;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var43 != 3) {
                        break L24;
                      } else {
                        var38 = var40;
                        var40 = var4.e(-4095) + var41;
                        var41 = var40;
                        ((le) this).field_p[var42] = var38;
                        ((le) this).field_v[var42] = var39;
                        ((le) this).field_J[var42] = var40;
                        if (var40 <= ((le) this).field_F) {
                          break L24;
                        } else {
                          ((le) this).field_F = var40;
                          break L24;
                        }
                      }
                    }
                    if (var43 == 4) {
                      var44 = var38;
                      var38 = var39;
                      var39 = var44;
                      var40 = var4.e(-4095) + var41;
                      var41 = var40;
                      ((le) this).field_p[var42] = var38;
                      ((le) this).field_v[var42] = var39;
                      ((le) this).field_J[var42] = var40;
                      if (var40 > ((le) this).field_F) {
                        ((le) this).field_F = var40;
                        var42++;
                        continue L13;
                      } else {
                        var42++;
                        continue L13;
                      }
                    } else {
                      var42++;
                      continue L13;
                    }
                  }
                }
              } else {
                L25: {
                  ((le) this).field_z[var38] = (short)var4.e((byte) 79);
                  if (var12 != 1) {
                    break L25;
                  } else {
                    L26: {
                      var39 = var5.b(16711935);
                      if ((var39 & 1) != 1) {
                        ((le) this).field_C[var38] = (byte) 0;
                        break L26;
                      } else {
                        ((le) this).field_C[var38] = (byte) 1;
                        var2 = 1;
                        break L26;
                      }
                    }
                    if ((var39 & 2) != 2) {
                      ((le) this).field_s[var38] = (byte)-1;
                      ((le) this).field_x[var38] = (short)-1;
                      break L25;
                    } else {
                      ((le) this).field_s[var38] = (byte)(var39 >> 2);
                      ((le) this).field_x[var38] = ((le) this).field_z[var38];
                      ((le) this).field_z[var38] = (short)127;
                      if (((le) this).field_x[var38] == -1) {
                        break L25;
                      } else {
                        var3 = 1;
                        break L25;
                      }
                    }
                  }
                }
                L27: {
                  if (var13 != 255) {
                    break L27;
                  } else {
                    ((le) this).field_A[var38] = var6.b(true);
                    break L27;
                  }
                }
                L28: {
                  if (var14 != 1) {
                    break L28;
                  } else {
                    ((le) this).field_q[var38] = var7.b(true);
                    break L28;
                  }
                }
                if (var15 == 1) {
                  ((le) this).field_t[var38] = var8.b(16711935);
                  var38++;
                  continue L12;
                } else {
                  var38++;
                  continue L12;
                }
              }
            }
          } else {
            L29: {
              var39 = var4.b(16711935);
              var40 = 0;
              if ((var39 & 1) == 0) {
                break L29;
              } else {
                var40 = var5.e(-4095);
                break L29;
              }
            }
            L30: {
              var41 = 0;
              if ((var39 & 2) == 0) {
                break L30;
              } else {
                var41 = var6.e(-4095);
                break L30;
              }
            }
            L31: {
              var42 = 0;
              if ((var39 & 4) == 0) {
                break L31;
              } else {
                var42 = var7.e(-4095);
                break L31;
              }
            }
            ((le) this).field_l[var38] = var35 + var40;
            ((le) this).field_L[var38] = var36 + var41;
            ((le) this).field_H[var38] = var37 + var42;
            var35 = ((le) this).field_l[var38];
            var36 = ((le) this).field_L[var38];
            var37 = ((le) this).field_H[var38];
            if (var16 == 1) {
              ((le) this).field_o[var38] = var8.b(16711935);
              var38++;
              continue L11;
            } else {
              var38++;
              continue L11;
            }
          }
        }
    }

    final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        L0: {
          if (((le) this).field_o == null) {
            break L0;
          } else {
            var9 = new int[256];
            var7 = var9;
            var5 = var7;
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((le) this).field_d) {
                ((le) this).field_G = new int[var2 + 1][];
                var3 = 0;
                L2: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ((le) this).field_d) {
                        ((le) this).field_o = null;
                        break L0;
                      } else {
                        var4 = ((le) this).field_o[var3];
                        var5[var4] = var5[var4] + 1;
                        ((le) this).field_G[var4][var5[var4]] = var3;
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    ((le) this).field_G[var3] = new int[var9[var3]];
                    var9[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = ((le) this).field_o[var3];
                var5[var4] = var5[var4] + 1;
                if (var4 > var2) {
                  var2 = var4;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
        L4: {
          if (((le) this).field_t == null) {
            break L4;
          } else {
            var10 = new int[256];
            var8 = var10;
            var6 = var8;
            var2 = 0;
            var3 = 0;
            L5: while (true) {
              if (var3 >= ((le) this).field_i) {
                ((le) this).field_n = new int[var2 + 1][];
                var3 = 0;
                L6: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= ((le) this).field_i) {
                        ((le) this).field_t = null;
                        break L4;
                      } else {
                        var4 = ((le) this).field_t[var3];
                        var6[var4] = var6[var4] + 1;
                        ((le) this).field_n[var4][var6[var4]] = var3;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    ((le) this).field_n[var3] = new int[var10[var3]];
                    var10[var3] = 0;
                    var3++;
                    continue L6;
                  }
                }
              } else {
                var4 = ((le) this).field_t[var3];
                var6[var4] = var6[var4] + 1;
                if (var4 > var2) {
                  var2 = var4;
                  var3++;
                  continue L5;
                } else {
                  var3++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    private le(byte[] param0) {
        ((le) this).field_d = 0;
        ((le) this).field_F = 0;
        ((le) this).field_i = 0;
        if (param0[param0.length - 1] == -1) {
            // if_icmpne L47
            this.a(param0);
        } else {
            this.b(param0);
        }
    }
}
