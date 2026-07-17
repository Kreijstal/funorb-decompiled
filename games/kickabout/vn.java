/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends cv {
    private byte[] field_N;
    rn[] field_q;
    short[] field_u;
    ia[] field_J;
    byte[] field_I;
    int[] field_L;
    short[] field_h;
    byte[] field_o;
    int[] field_r;
    private byte[] field_G;
    int[] field_l;
    int[][] field_s;
    private byte[] field_x;
    int[] field_A;
    short[] field_K;
    int[][] field_v;
    int[] field_H;
    private short[] field_S;
    int field_R;
    int field_m;
    rn[] field_i;
    short[] field_p;
    private byte[] field_E;
    int[] field_w;
    short[] field_B;
    short[] field_n;
    byte[] field_z;
    int field_D;
    private short[] field_P;
    private byte[] field_Q;
    private short[] field_j;
    short[] field_y;
    byte[] field_k;
    private int[] field_O;
    int field_t;
    byte[] field_T;
    private int[] field_C;
    private byte field_F;

    private final int a(vn param0, int param1, short param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param0.field_H[param1];
        var5 = param0.field_l[param1];
        var6 = param0.field_A[param1];
        var7 = 0;
        L0: while (true) {
          if (var7 >= ((vn) this).field_m) {
            L1: {
              ((vn) this).field_H[((vn) this).field_m] = var4;
              ((vn) this).field_l[((vn) this).field_m] = var5;
              ((vn) this).field_A[((vn) this).field_m] = var6;
              ((vn) this).field_n[((vn) this).field_m] = (short)param2;
              if (param0.field_C == null) {
                break L1;
              } else {
                ((vn) this).field_C[((vn) this).field_m] = param0.field_C[param1];
                break L1;
              }
            }
            int fieldTemp$1 = ((vn) this).field_m;
            ((vn) this).field_m = ((vn) this).field_m + 1;
            return fieldTemp$1;
          } else {
            if (var4 == ((vn) this).field_H[var7]) {
              if (var5 == ((vn) this).field_l[var7]) {
                if (var6 == ((vn) this).field_A[var7]) {
                  ((vn) this).field_n[var7] = (short)(((vn) this).field_n[var7] | param2);
                  return var7;
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

    final static vn a(sj param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, param1, 28);
        if (var3 == null) {
            return null;
        }
        return new vn(var3);
    }

    private final void b(byte[] param0) {
        int var2 = 0;
        int var3 = 0;
        iw var4 = null;
        iw var5 = null;
        iw var6 = null;
        iw var7 = null;
        iw var8 = null;
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
          var4 = new iw(param0);
          var5 = new iw(param0);
          var6 = new iw(param0);
          var7 = new iw(param0);
          var8 = new iw(param0);
          var4.field_n = param0.length - 18;
          var9 = var4.a((byte) 81);
          var10 = var4.a((byte) 81);
          var11 = var4.h((byte) -123);
          var12 = var4.h((byte) -118);
          var13 = var4.h((byte) -122);
          var14 = var4.h((byte) -126);
          var15 = var4.h((byte) -110);
          var16 = var4.h((byte) -124);
          var17 = var4.a((byte) 81);
          var18 = var4.a((byte) 81);
          var19 = var4.a((byte) 81);
          var20 = var4.a((byte) 81);
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
          ((vn) this).field_m = var9;
          ((vn) this).field_D = var10;
          ((vn) this).field_R = var11;
          ((vn) this).field_H = new int[var9];
          ((vn) this).field_l = new int[var9];
          ((vn) this).field_A = new int[var9];
          ((vn) this).field_r = new int[var10];
          ((vn) this).field_L = new int[var10];
          ((vn) this).field_w = new int[var10];
          if (var11 <= 0) {
            break L5;
          } else {
            ((vn) this).field_T = new byte[var11];
            ((vn) this).field_h = new short[var11];
            ((vn) this).field_B = new short[var11];
            ((vn) this).field_y = new short[var11];
            break L5;
          }
        }
        L6: {
          if (var16 != 1) {
            break L6;
          } else {
            ((vn) this).field_C = new int[var9];
            break L6;
          }
        }
        L7: {
          if (var12 != 1) {
            break L7;
          } else {
            ((vn) this).field_o = new byte[var10];
            ((vn) this).field_I = new byte[var10];
            ((vn) this).field_u = new short[var10];
            break L7;
          }
        }
        L8: {
          if (var13 != 255) {
            ((vn) this).field_F = (byte)var13;
            break L8;
          } else {
            ((vn) this).field_z = new byte[var10];
            break L8;
          }
        }
        L9: {
          if (var14 != 1) {
            break L9;
          } else {
            ((vn) this).field_k = new byte[var10];
            break L9;
          }
        }
        L10: {
          if (var15 != 1) {
            break L10;
          } else {
            ((vn) this).field_O = new int[var10];
            break L10;
          }
        }
        ((vn) this).field_p = new short[var10];
        var4.field_n = var22;
        var5.field_n = var32;
        var6.field_n = var33;
        var7.field_n = var34;
        var8.field_n = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        var38 = 0;
        L11: while (true) {
          if (var38 >= var9) {
            var4.field_n = var30;
            var5.field_n = var26;
            var6.field_n = var24;
            var7.field_n = var28;
            var8.field_n = var25;
            var38 = 0;
            L12: while (true) {
              if (var38 >= var10) {
                ((vn) this).field_t = -1;
                var4.field_n = var29;
                var5.field_n = var23;
                var38 = 0;
                var39 = 0;
                var40 = 0;
                var41 = 0;
                var42 = 0;
                L13: while (true) {
                  if (var42 >= var10) {
                    ((vn) this).field_t = ((vn) this).field_t + 1;
                    var4.field_n = var31;
                    var42 = 0;
                    L14: while (true) {
                      if (var42 >= var11) {
                        L15: {
                          if (((vn) this).field_I == null) {
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
                                  ((vn) this).field_I = null;
                                  break L15;
                                }
                              } else {
                                var44 = ((vn) this).field_I[var45] & 255;
                                if (var44 != 255) {
                                  L17: {
                                    if ((((vn) this).field_h[var44] & 65535) != ((vn) this).field_r[var45]) {
                                      break L17;
                                    } else {
                                      if ((((vn) this).field_B[var44] & 65535) != ((vn) this).field_L[var45]) {
                                        break L17;
                                      } else {
                                        if ((((vn) this).field_y[var44] & 65535) != ((vn) this).field_w[var45]) {
                                          break L17;
                                        } else {
                                          ((vn) this).field_I[var45] = (byte) -1;
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
                            ((vn) this).field_u = null;
                            break L18;
                          }
                        }
                        L19: {
                          if (var2 != 0) {
                            break L19;
                          } else {
                            ((vn) this).field_o = null;
                            break L19;
                          }
                        }
                        return;
                      } else {
                        ((vn) this).field_T[var42] = (byte) 0;
                        ((vn) this).field_h[var42] = (short)var4.a((byte) 81);
                        ((vn) this).field_B[var42] = (short)var4.a((byte) 81);
                        ((vn) this).field_y[var42] = (short)var4.a((byte) 81);
                        var42++;
                        continue L14;
                      }
                    }
                  } else {
                    L20: {
                      var43 = var5.h((byte) -112);
                      if (var43 != 1) {
                        break L20;
                      } else {
                        L21: {
                          var38 = var4.e(29) + var41;
                          var41 = var38;
                          var39 = var4.e(1) + var41;
                          var41 = var39;
                          var40 = var4.e(-124) + var41;
                          var41 = var40;
                          ((vn) this).field_r[var42] = var38;
                          ((vn) this).field_L[var42] = var39;
                          ((vn) this).field_w[var42] = var40;
                          if (var38 <= ((vn) this).field_t) {
                            break L21;
                          } else {
                            ((vn) this).field_t = var38;
                            break L21;
                          }
                        }
                        L22: {
                          if (var39 <= ((vn) this).field_t) {
                            break L22;
                          } else {
                            ((vn) this).field_t = var39;
                            break L22;
                          }
                        }
                        if (var40 <= ((vn) this).field_t) {
                          break L20;
                        } else {
                          ((vn) this).field_t = var40;
                          break L20;
                        }
                      }
                    }
                    L23: {
                      if (var43 != 2) {
                        break L23;
                      } else {
                        var39 = var40;
                        var40 = var4.e(-110) + var41;
                        var41 = var40;
                        ((vn) this).field_r[var42] = var38;
                        ((vn) this).field_L[var42] = var39;
                        ((vn) this).field_w[var42] = var40;
                        if (var40 <= ((vn) this).field_t) {
                          break L23;
                        } else {
                          ((vn) this).field_t = var40;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var43 != 3) {
                        break L24;
                      } else {
                        var38 = var40;
                        var40 = var4.e(15) + var41;
                        var41 = var40;
                        ((vn) this).field_r[var42] = var38;
                        ((vn) this).field_L[var42] = var39;
                        ((vn) this).field_w[var42] = var40;
                        if (var40 <= ((vn) this).field_t) {
                          break L24;
                        } else {
                          ((vn) this).field_t = var40;
                          break L24;
                        }
                      }
                    }
                    if (var43 == 4) {
                      var44 = var38;
                      var38 = var39;
                      var39 = var44;
                      var40 = var4.e(-113) + var41;
                      var41 = var40;
                      ((vn) this).field_r[var42] = var38;
                      ((vn) this).field_L[var42] = var39;
                      ((vn) this).field_w[var42] = var40;
                      if (var40 > ((vn) this).field_t) {
                        ((vn) this).field_t = var40;
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
                  ((vn) this).field_p[var38] = (short)var4.a((byte) 81);
                  if (var12 != 1) {
                    break L25;
                  } else {
                    L26: {
                      var39 = var5.h((byte) -108);
                      if ((var39 & 1) != 1) {
                        ((vn) this).field_o[var38] = (byte) 0;
                        break L26;
                      } else {
                        ((vn) this).field_o[var38] = (byte) 1;
                        var2 = 1;
                        break L26;
                      }
                    }
                    if ((var39 & 2) != 2) {
                      ((vn) this).field_I[var38] = (byte) -1;
                      ((vn) this).field_u[var38] = (short) -1;
                      break L25;
                    } else {
                      ((vn) this).field_I[var38] = (byte)(var39 >> 2);
                      ((vn) this).field_u[var38] = ((vn) this).field_p[var38];
                      ((vn) this).field_p[var38] = (short) 127;
                      if (((vn) this).field_u[var38] == -1) {
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
                    ((vn) this).field_z[var38] = var6.j((byte) -81);
                    break L27;
                  }
                }
                L28: {
                  if (var14 != 1) {
                    break L28;
                  } else {
                    ((vn) this).field_k[var38] = var7.j((byte) -70);
                    break L28;
                  }
                }
                if (var15 == 1) {
                  ((vn) this).field_O[var38] = var8.h((byte) -106);
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
              var39 = var4.h((byte) -126);
              var40 = 0;
              if ((var39 & 1) == 0) {
                break L29;
              } else {
                var40 = var5.e(1);
                break L29;
              }
            }
            L30: {
              var41 = 0;
              if ((var39 & 2) == 0) {
                break L30;
              } else {
                var41 = var6.e(-10);
                break L30;
              }
            }
            L31: {
              var42 = 0;
              if ((var39 & 4) == 0) {
                break L31;
              } else {
                var42 = var7.e(29);
                break L31;
              }
            }
            ((vn) this).field_H[var38] = var35 + var40;
            ((vn) this).field_l[var38] = var36 + var41;
            ((vn) this).field_A[var38] = var37 + var42;
            var35 = ((vn) this).field_H[var38];
            var36 = ((vn) this).field_l[var38];
            var37 = ((vn) this).field_A[var38];
            if (var16 == 1) {
              ((vn) this).field_C[var38] = var8.h((byte) -122);
              var38++;
              continue L11;
            } else {
              var38++;
              continue L11;
            }
          }
        }
    }

    final eg b(int param0, int param1, int param2, int param3, int param4) {
        return new eg((vn) this, param0, param1, param2, param3, param4);
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
        ia var16 = null;
        rn var17 = null;
        rn var18 = null;
        rn var19 = null;
        if (((vn) this).field_i == null) {
          ((vn) this).field_i = new rn[((vn) this).field_t];
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((vn) this).field_t) {
              var1 = 0;
              L1: while (true) {
                if (var1 >= ((vn) this).field_D) {
                  return;
                } else {
                  var2 = ((vn) this).field_r[var1];
                  var3 = ((vn) this).field_L[var1];
                  var4 = ((vn) this).field_w[var1];
                  var5 = ((vn) this).field_H[var3] - ((vn) this).field_H[var2];
                  var6 = ((vn) this).field_l[var3] - ((vn) this).field_l[var2];
                  var7 = ((vn) this).field_A[var3] - ((vn) this).field_A[var2];
                  var8 = ((vn) this).field_H[var4] - ((vn) this).field_H[var2];
                  var9 = ((vn) this).field_l[var4] - ((vn) this).field_l[var2];
                  var10 = ((vn) this).field_A[var4] - ((vn) this).field_A[var2];
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
                                    if (((vn) this).field_o != null) {
                                      var15 = ((vn) this).field_o[var1];
                                      break L5;
                                    } else {
                                      var15 = 0;
                                      break L5;
                                    }
                                  }
                                  if (var15 != 0) {
                                    if (var15 == 1) {
                                      L6: {
                                        if (((vn) this).field_J != null) {
                                          break L6;
                                        } else {
                                          ((vn) this).field_J = new ia[((vn) this).field_D];
                                          break L6;
                                        }
                                      }
                                      ia dupTemp$1 = new ia();
                                      ((vn) this).field_J[var1] = dupTemp$1;
                                      var16 = dupTemp$1;
                                      var16.field_f = var11;
                                      var16.field_a = var12;
                                      var16.field_g = var13;
                                      var1++;
                                      continue L1;
                                    } else {
                                      var1++;
                                      continue L1;
                                    }
                                  } else {
                                    var17 = ((vn) this).field_i[var2];
                                    var17.field_a = var17.field_a + var11;
                                    var17.field_b = var17.field_b + var12;
                                    var17.field_f = var17.field_f + var13;
                                    var17.field_g = var17.field_g + 1;
                                    var18 = ((vn) this).field_i[var3];
                                    var18.field_a = var18.field_a + var11;
                                    var18.field_b = var18.field_b + var12;
                                    var18.field_f = var18.field_f + var13;
                                    var18.field_g = var18.field_g + 1;
                                    var19 = ((vn) this).field_i[var4];
                                    var19.field_a = var19.field_a + var11;
                                    var19.field_b = var19.field_b + var12;
                                    var19.field_f = var19.field_f + var13;
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
              ((vn) this).field_i[var1] = new rn();
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void a(byte[] param0) {
        iw var2 = null;
        iw var3 = null;
        iw var4 = null;
        iw var5 = null;
        iw var6 = null;
        iw var7 = null;
        iw var8 = null;
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
          var2 = new iw(param0);
          var3 = new iw(param0);
          var4 = new iw(param0);
          var5 = new iw(param0);
          var6 = new iw(param0);
          var7 = new iw(param0);
          var8 = new iw(param0);
          var2.field_n = param0.length - 23;
          var9 = var2.a((byte) 81);
          var10 = var2.a((byte) 81);
          var11 = var2.h((byte) -118);
          var12 = var2.h((byte) -120);
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
          var15 = var2.h((byte) -121);
          var16 = var2.h((byte) -126);
          var17 = var2.h((byte) -112);
          var18 = var2.h((byte) -114);
          var19 = var2.h((byte) -128);
          var20 = var2.a((byte) 81);
          var21 = var2.a((byte) 81);
          var22 = var2.a((byte) 81);
          var23 = var2.a((byte) 81);
          var24 = var2.a((byte) 81);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (var11 <= 0) {
            break L2;
          } else {
            ((vn) this).field_T = new byte[var11];
            var2.field_n = 0;
            var28 = 0;
            L3: while (true) {
              if (var28 >= var11) {
                break L2;
              } else {
                L4: {
                  byte dupTemp$1 = var2.j((byte) -114);
                  ((vn) this).field_T[var28] = dupTemp$1;
                  var29 = dupTemp$1;
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
          ((vn) this).field_m = var9;
          ((vn) this).field_D = var10;
          ((vn) this).field_R = var11;
          ((vn) this).field_H = new int[var9];
          ((vn) this).field_l = new int[var9];
          ((vn) this).field_A = new int[var9];
          ((vn) this).field_r = new int[var10];
          ((vn) this).field_L = new int[var10];
          ((vn) this).field_w = new int[var10];
          if (var19 != 1) {
            break L12;
          } else {
            ((vn) this).field_C = new int[var9];
            break L12;
          }
        }
        L13: {
          if (var13 == 0) {
            break L13;
          } else {
            ((vn) this).field_o = new byte[var10];
            break L13;
          }
        }
        L14: {
          if (var15 != 255) {
            ((vn) this).field_F = (byte)var15;
            break L14;
          } else {
            ((vn) this).field_z = new byte[var10];
            break L14;
          }
        }
        L15: {
          if (var16 != 1) {
            break L15;
          } else {
            ((vn) this).field_k = new byte[var10];
            break L15;
          }
        }
        L16: {
          if (var17 != 1) {
            break L16;
          } else {
            ((vn) this).field_O = new int[var10];
            break L16;
          }
        }
        L17: {
          if (var18 != 1) {
            break L17;
          } else {
            ((vn) this).field_u = new short[var10];
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
              ((vn) this).field_I = new byte[var10];
              break L18;
            }
          }
        }
        L19: {
          ((vn) this).field_p = new short[var10];
          if (var11 <= 0) {
            break L19;
          } else {
            L20: {
              ((vn) this).field_h = new short[var11];
              ((vn) this).field_B = new short[var11];
              ((vn) this).field_y = new short[var11];
              if (var26 <= 0) {
                break L20;
              } else {
                ((vn) this).field_S = new short[var26];
                ((vn) this).field_P = new short[var26];
                ((vn) this).field_j = new short[var26];
                ((vn) this).field_x = new byte[var26];
                ((vn) this).field_E = new byte[var26];
                ((vn) this).field_Q = new byte[var26];
                break L20;
              }
            }
            if (var27 <= 0) {
              break L19;
            } else {
              ((vn) this).field_N = new byte[var27];
              ((vn) this).field_G = new byte[var27];
              break L19;
            }
          }
        }
        var2.field_n = var29;
        var3.field_n = var40;
        var4.field_n = var41;
        var5.field_n = var42;
        var6.field_n = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        L21: while (true) {
          if (var53 >= var9) {
            var2.field_n = var39;
            var3.field_n = var30;
            var4.field_n = var32;
            var5.field_n = var35;
            var6.field_n = var33;
            var7.field_n = var37;
            var8.field_n = var38;
            var53 = 0;
            L22: while (true) {
              if (var53 >= var10) {
                ((vn) this).field_t = -1;
                var2.field_n = var36;
                var3.field_n = var31;
                var53 = 0;
                var54 = 0;
                var55 = 0;
                var56 = 0;
                var57 = 0;
                L23: while (true) {
                  if (var57 >= var10) {
                    ((vn) this).field_t = ((vn) this).field_t + 1;
                    var2.field_n = var43;
                    var3.field_n = var44;
                    var4.field_n = var45;
                    var5.field_n = var46;
                    var6.field_n = var47;
                    var7.field_n = var48;
                    var57 = 0;
                    L24: while (true) {
                      if (var57 >= var11) {
                        L25: {
                          if (var14 == 0) {
                            break L25;
                          } else {
                            L26: {
                              var2.field_n = var49;
                              var57 = var2.h((byte) -111);
                              if (var57 <= 0) {
                                break L26;
                              } else {
                                var2.field_n = var2.field_n + 4 * var57;
                                break L26;
                              }
                            }
                            var58 = var2.h((byte) -121);
                            if (var58 <= 0) {
                              break L25;
                            } else {
                              var2.field_n = var2.field_n + 4 * var58;
                              break L25;
                            }
                          }
                        }
                        return;
                      } else {
                        L27: {
                          var58 = ((vn) this).field_T[var57] & 255;
                          if (var58 != 0) {
                            break L27;
                          } else {
                            ((vn) this).field_h[var57] = (short)var2.a((byte) 81);
                            ((vn) this).field_B[var57] = (short)var2.a((byte) 81);
                            ((vn) this).field_y[var57] = (short)var2.a((byte) 81);
                            break L27;
                          }
                        }
                        L28: {
                          if (var58 != 1) {
                            break L28;
                          } else {
                            ((vn) this).field_h[var57] = (short)var3.a((byte) 81);
                            ((vn) this).field_B[var57] = (short)var3.a((byte) 81);
                            ((vn) this).field_y[var57] = (short)var3.a((byte) 81);
                            ((vn) this).field_S[var57] = (short)var4.a((byte) 81);
                            ((vn) this).field_P[var57] = (short)var4.a((byte) 81);
                            ((vn) this).field_j[var57] = (short)var4.a((byte) 81);
                            ((vn) this).field_x[var57] = var5.j((byte) -100);
                            ((vn) this).field_E[var57] = var6.j((byte) -58);
                            ((vn) this).field_Q[var57] = var7.j((byte) -48);
                            break L28;
                          }
                        }
                        L29: {
                          if (var58 != 2) {
                            break L29;
                          } else {
                            ((vn) this).field_h[var57] = (short)var3.a((byte) 81);
                            ((vn) this).field_B[var57] = (short)var3.a((byte) 81);
                            ((vn) this).field_y[var57] = (short)var3.a((byte) 81);
                            ((vn) this).field_S[var57] = (short)var4.a((byte) 81);
                            ((vn) this).field_P[var57] = (short)var4.a((byte) 81);
                            ((vn) this).field_j[var57] = (short)var4.a((byte) 81);
                            ((vn) this).field_x[var57] = var5.j((byte) -109);
                            ((vn) this).field_E[var57] = var6.j((byte) -113);
                            ((vn) this).field_Q[var57] = var7.j((byte) -111);
                            ((vn) this).field_N[var57] = var7.j((byte) -92);
                            ((vn) this).field_G[var57] = var7.j((byte) -111);
                            break L29;
                          }
                        }
                        if (var58 == 3) {
                          ((vn) this).field_h[var57] = (short)var3.a((byte) 81);
                          ((vn) this).field_B[var57] = (short)var3.a((byte) 81);
                          ((vn) this).field_y[var57] = (short)var3.a((byte) 81);
                          ((vn) this).field_S[var57] = (short)var4.a((byte) 81);
                          ((vn) this).field_P[var57] = (short)var4.a((byte) 81);
                          ((vn) this).field_j[var57] = (short)var4.a((byte) 81);
                          ((vn) this).field_x[var57] = var5.j((byte) -102);
                          ((vn) this).field_E[var57] = var6.j((byte) -102);
                          ((vn) this).field_Q[var57] = var7.j((byte) -76);
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
                      var58 = var3.h((byte) -124);
                      if (var58 != 1) {
                        break L30;
                      } else {
                        L31: {
                          var53 = var2.e(-117) + var56;
                          var56 = var53;
                          var54 = var2.e(60) + var56;
                          var56 = var54;
                          var55 = var2.e(-116) + var56;
                          var56 = var55;
                          ((vn) this).field_r[var57] = var53;
                          ((vn) this).field_L[var57] = var54;
                          ((vn) this).field_w[var57] = var55;
                          if (var53 <= ((vn) this).field_t) {
                            break L31;
                          } else {
                            ((vn) this).field_t = var53;
                            break L31;
                          }
                        }
                        L32: {
                          if (var54 <= ((vn) this).field_t) {
                            break L32;
                          } else {
                            ((vn) this).field_t = var54;
                            break L32;
                          }
                        }
                        if (var55 <= ((vn) this).field_t) {
                          break L30;
                        } else {
                          ((vn) this).field_t = var55;
                          break L30;
                        }
                      }
                    }
                    L33: {
                      if (var58 != 2) {
                        break L33;
                      } else {
                        var54 = var55;
                        var55 = var2.e(-127) + var56;
                        var56 = var55;
                        ((vn) this).field_r[var57] = var53;
                        ((vn) this).field_L[var57] = var54;
                        ((vn) this).field_w[var57] = var55;
                        if (var55 <= ((vn) this).field_t) {
                          break L33;
                        } else {
                          ((vn) this).field_t = var55;
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (var58 != 3) {
                        break L34;
                      } else {
                        var53 = var55;
                        var55 = var2.e(-115) + var56;
                        var56 = var55;
                        ((vn) this).field_r[var57] = var53;
                        ((vn) this).field_L[var57] = var54;
                        ((vn) this).field_w[var57] = var55;
                        if (var55 <= ((vn) this).field_t) {
                          break L34;
                        } else {
                          ((vn) this).field_t = var55;
                          break L34;
                        }
                      }
                    }
                    if (var58 == 4) {
                      var59 = var53;
                      var53 = var54;
                      var54 = var59;
                      var55 = var2.e(-123) + var56;
                      var56 = var55;
                      ((vn) this).field_r[var57] = var53;
                      ((vn) this).field_L[var57] = var54;
                      ((vn) this).field_w[var57] = var55;
                      if (var55 > ((vn) this).field_t) {
                        ((vn) this).field_t = var55;
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
                  ((vn) this).field_p[var53] = (short)var2.a((byte) 81);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    ((vn) this).field_o[var53] = var3.j((byte) -125);
                    break L35;
                  }
                }
                L36: {
                  if (var15 != 255) {
                    break L36;
                  } else {
                    ((vn) this).field_z[var53] = var4.j((byte) -120);
                    break L36;
                  }
                }
                L37: {
                  if (var16 != 1) {
                    break L37;
                  } else {
                    ((vn) this).field_k[var53] = var5.j((byte) -96);
                    break L37;
                  }
                }
                L38: {
                  if (var17 != 1) {
                    break L38;
                  } else {
                    ((vn) this).field_O[var53] = var6.h((byte) -125);
                    break L38;
                  }
                }
                L39: {
                  if (var18 != 1) {
                    break L39;
                  } else {
                    ((vn) this).field_u[var53] = (short)(var7.a((byte) 81) - 1);
                    break L39;
                  }
                }
                if (((vn) this).field_I != null) {
                  if (((vn) this).field_u[var53] == -1) {
                    ((vn) this).field_I[var53] = (byte) -1;
                    var53++;
                    continue L22;
                  } else {
                    ((vn) this).field_I[var53] = (byte)(var8.h((byte) -108) - 1);
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
              var54 = var2.h((byte) -111);
              var55 = 0;
              if ((var54 & 1) == 0) {
                break L40;
              } else {
                var55 = var3.e(-115);
                break L40;
              }
            }
            L41: {
              var56 = 0;
              if ((var54 & 2) == 0) {
                break L41;
              } else {
                var56 = var4.e(-124);
                break L41;
              }
            }
            L42: {
              var57 = 0;
              if ((var54 & 4) == 0) {
                break L42;
              } else {
                var57 = var5.e(57);
                break L42;
              }
            }
            ((vn) this).field_H[var53] = var50 + var55;
            ((vn) this).field_l[var53] = var51 + var56;
            ((vn) this).field_A[var53] = var52 + var57;
            var50 = ((vn) this).field_H[var53];
            var51 = ((vn) this).field_l[var53];
            var52 = ((vn) this).field_A[var53];
            if (var19 == 1) {
              ((vn) this).field_C[var53] = var6.h((byte) -112);
              var53++;
              continue L21;
            } else {
              var53++;
              continue L21;
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
          if (((vn) this).field_C == null) {
            break L0;
          } else {
            var9 = new int[256];
            var7 = var9;
            var5 = var7;
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((vn) this).field_m) {
                ((vn) this).field_s = new int[var2 + 1][];
                var3 = 0;
                L2: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ((vn) this).field_m) {
                        ((vn) this).field_C = null;
                        break L0;
                      } else {
                        var4 = ((vn) this).field_C[var3];
                        var5[var4] = var5[var4] + 1;
                        ((vn) this).field_s[var4][var5[var4]] = var3;
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    ((vn) this).field_s[var3] = new int[var9[var3]];
                    var9[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = ((vn) this).field_C[var3];
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
          if (((vn) this).field_O == null) {
            break L4;
          } else {
            var10 = new int[256];
            var8 = var10;
            var6 = var8;
            var2 = 0;
            var3 = 0;
            L5: while (true) {
              if (var3 >= ((vn) this).field_D) {
                ((vn) this).field_v = new int[var2 + 1][];
                var3 = 0;
                L6: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= ((vn) this).field_D) {
                        ((vn) this).field_O = null;
                        break L4;
                      } else {
                        var4 = ((vn) this).field_O[var3];
                        var6[var4] = var6[var4] + 1;
                        ((vn) this).field_v[var4][var6[var4]] = var3;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    ((vn) this).field_v[var3] = new int[var10[var3]];
                    var10[var3] = 0;
                    var3++;
                    continue L6;
                  }
                }
              } else {
                var4 = ((vn) this).field_O[var3];
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

    final qc a(int param0, int param1, int param2, int param3, int param4) {
        return (qc) (Object) new eg((vn) this, param0, param1, param2, param3, param4);
    }

    private vn(byte[] param0) {
        L0: {
          L1: {
            ((vn) this).field_D = 0;
            ((vn) this).field_m = 0;
            ((vn) this).field_t = 0;
            ((vn) this).field_F = (byte) 0;
            if (param0[param0.length - 1] != -1) {
              break L1;
            } else {
              if (param0[param0.length - 2] != -1) {
                break L1;
              } else {
                this.a(param0);
                break L0;
              }
            }
          }
          this.b(param0);
          break L0;
        }
    }

    vn(vn[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vn var10_ref_vn = null;
        int var10 = 0;
        vn var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        vn var15 = null;
        vn var16 = null;
        int var17 = 0;
        vn var18 = null;
        vn var19 = null;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        byte[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        byte[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        byte[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        byte[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        byte[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        byte[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        byte[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        byte[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        ((vn) this).field_D = 0;
        ((vn) this).field_m = 0;
        ((vn) this).field_t = 0;
        ((vn) this).field_F = (byte) 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        ((vn) this).field_m = 0;
        ((vn) this).field_D = 0;
        ((vn) this).field_R = 0;
        ((vn) this).field_F = (byte) -1;
        var9 = 0;
        L0: while (true) {
          if (var9 >= param1) {
            L1: {
              ((vn) this).field_H = new int[((vn) this).field_m];
              ((vn) this).field_l = new int[((vn) this).field_m];
              ((vn) this).field_A = new int[((vn) this).field_m];
              ((vn) this).field_C = new int[((vn) this).field_m];
              ((vn) this).field_n = new short[((vn) this).field_m];
              ((vn) this).field_r = new int[((vn) this).field_D];
              ((vn) this).field_L = new int[((vn) this).field_D];
              ((vn) this).field_w = new int[((vn) this).field_D];
              if (var3 == 0) {
                break L1;
              } else {
                ((vn) this).field_o = new byte[((vn) this).field_D];
                break L1;
              }
            }
            L2: {
              if (var4 == 0) {
                break L2;
              } else {
                ((vn) this).field_z = new byte[((vn) this).field_D];
                break L2;
              }
            }
            L3: {
              if (var5 == 0) {
                break L3;
              } else {
                ((vn) this).field_k = new byte[((vn) this).field_D];
                break L3;
              }
            }
            L4: {
              if (var6 == 0) {
                break L4;
              } else {
                ((vn) this).field_O = new int[((vn) this).field_D];
                break L4;
              }
            }
            L5: {
              if (var7 == 0) {
                break L5;
              } else {
                ((vn) this).field_u = new short[((vn) this).field_D];
                break L5;
              }
            }
            L6: {
              if (var8 == 0) {
                break L6;
              } else {
                ((vn) this).field_I = new byte[((vn) this).field_D];
                break L6;
              }
            }
            L7: {
              ((vn) this).field_p = new short[((vn) this).field_D];
              ((vn) this).field_K = new short[((vn) this).field_D];
              if (((vn) this).field_R <= 0) {
                break L7;
              } else {
                ((vn) this).field_T = new byte[((vn) this).field_R];
                ((vn) this).field_h = new short[((vn) this).field_R];
                ((vn) this).field_B = new short[((vn) this).field_R];
                ((vn) this).field_y = new short[((vn) this).field_R];
                ((vn) this).field_S = new short[((vn) this).field_R];
                ((vn) this).field_P = new short[((vn) this).field_R];
                ((vn) this).field_j = new short[((vn) this).field_R];
                ((vn) this).field_x = new byte[((vn) this).field_R];
                ((vn) this).field_E = new byte[((vn) this).field_R];
                ((vn) this).field_Q = new byte[((vn) this).field_R];
                ((vn) this).field_N = new byte[((vn) this).field_R];
                ((vn) this).field_G = new byte[((vn) this).field_R];
                break L7;
              }
            }
            ((vn) this).field_m = 0;
            ((vn) this).field_D = 0;
            ((vn) this).field_R = 0;
            var9 = 0;
            L8: while (true) {
              if (var9 >= param1) {
                var9 = 0;
                ((vn) this).field_t = ((vn) this).field_m;
                var10 = 0;
                L9: while (true) {
                  if (var10 >= param1) {
                    return;
                  } else {
                    var16 = param0[var10];
                    var19 = var16;
                    var11 = var19;
                    var12 = (short)(1 << var10);
                    if (var11 != null) {
                      var13 = 0;
                      L10: while (true) {
                        if (var13 >= var19.field_D) {
                          var17 = 0;
                          var13 = var17;
                          L11: while (true) {
                            if (var17 < var19.field_R) {
                              L12: {
                                ((vn) this).field_T[((vn) this).field_R] = var16.field_T[var17];
                                var14 = var16.field_T[var17];
                                if (var14 != 0) {
                                  break L12;
                                } else {
                                  ((vn) this).field_h[((vn) this).field_R] = (short)this.a(var16, (int) var16.field_h[var17], (short) var12);
                                  ((vn) this).field_B[((vn) this).field_R] = (short)this.a(var16, (int) var16.field_B[var17], (short) var12);
                                  ((vn) this).field_y[((vn) this).field_R] = (short)this.a(var16, (int) var16.field_y[var17], (short) var12);
                                  break L12;
                                }
                              }
                              L13: {
                                if (var14 < 1) {
                                  break L13;
                                } else {
                                  if (var14 > 3) {
                                    break L13;
                                  } else {
                                    ((vn) this).field_h[((vn) this).field_R] = var16.field_h[var17];
                                    ((vn) this).field_B[((vn) this).field_R] = var16.field_B[var17];
                                    ((vn) this).field_y[((vn) this).field_R] = var16.field_y[var17];
                                    ((vn) this).field_S[((vn) this).field_R] = var16.field_S[var17];
                                    ((vn) this).field_P[((vn) this).field_R] = var16.field_P[var17];
                                    ((vn) this).field_j[((vn) this).field_R] = var16.field_j[var17];
                                    ((vn) this).field_x[((vn) this).field_R] = var16.field_x[var17];
                                    ((vn) this).field_E[((vn) this).field_R] = var16.field_E[var17];
                                    ((vn) this).field_Q[((vn) this).field_R] = var16.field_Q[var17];
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                if (var14 != 2) {
                                  break L14;
                                } else {
                                  ((vn) this).field_N[((vn) this).field_R] = var16.field_N[var17];
                                  ((vn) this).field_G[((vn) this).field_R] = var16.field_G[var17];
                                  break L14;
                                }
                              }
                              ((vn) this).field_R = ((vn) this).field_R + 1;
                              var17++;
                              continue L11;
                            } else {
                              var10++;
                              continue L9;
                            }
                          }
                        } else {
                          if (var8 != 0) {
                            L15: {
                              L16: {
                                int incrementValue$1 = var9;
                                var9++;
                                stackOut_74_0 = ((vn) this).field_I;
                                stackOut_74_1 = incrementValue$1;
                                stackIn_77_0 = stackOut_74_0;
                                stackIn_77_1 = stackOut_74_1;
                                stackIn_75_0 = stackOut_74_0;
                                stackIn_75_1 = stackOut_74_1;
                                if (var19.field_I == null) {
                                  break L16;
                                } else {
                                  stackOut_75_0 = (byte[]) (Object) stackIn_75_0;
                                  stackOut_75_1 = stackIn_75_1;
                                  stackIn_77_0 = stackOut_75_0;
                                  stackIn_77_1 = stackOut_75_1;
                                  stackIn_76_0 = stackOut_75_0;
                                  stackIn_76_1 = stackOut_75_1;
                                  if (var16.field_I[var13] == -1) {
                                    break L16;
                                  } else {
                                    stackOut_76_0 = (byte[]) (Object) stackIn_76_0;
                                    stackOut_76_1 = stackIn_76_1;
                                    stackOut_76_2 = var16.field_I[var13] + ((vn) this).field_R;
                                    stackIn_78_0 = stackOut_76_0;
                                    stackIn_78_1 = stackOut_76_1;
                                    stackIn_78_2 = stackOut_76_2;
                                    break L15;
                                  }
                                }
                              }
                              stackOut_77_0 = (byte[]) (Object) stackIn_77_0;
                              stackOut_77_1 = stackIn_77_1;
                              stackOut_77_2 = -1;
                              stackIn_78_0 = stackOut_77_0;
                              stackIn_78_1 = stackOut_77_1;
                              stackIn_78_2 = stackOut_77_2;
                              break L15;
                            }
                            stackIn_78_0[stackIn_78_1] = (byte)stackIn_78_2;
                            var13++;
                            continue L10;
                          } else {
                            var13++;
                            continue L10;
                          }
                        }
                      }
                    } else {
                      var10++;
                      continue L9;
                    }
                  }
                }
              } else {
                var10 = (short)(1 << var9);
                var15 = param0[var9];
                var18 = var15;
                var11 = var18;
                if (var11 != null) {
                  var12 = 0;
                  L17: while (true) {
                    if (var12 < var18.field_D) {
                      L18: {
                        if (var3 == 0) {
                          break L18;
                        } else {
                          if (var18.field_o == null) {
                            break L18;
                          } else {
                            ((vn) this).field_o[((vn) this).field_D] = var15.field_o[var12];
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (var4 == 0) {
                          break L19;
                        } else {
                          if (var18.field_z == null) {
                            ((vn) this).field_z[((vn) this).field_D] = var15.field_F;
                            break L19;
                          } else {
                            ((vn) this).field_z[((vn) this).field_D] = var15.field_z[var12];
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (var5 == 0) {
                          break L20;
                        } else {
                          if (var18.field_k == null) {
                            break L20;
                          } else {
                            ((vn) this).field_k[((vn) this).field_D] = var15.field_k[var12];
                            break L20;
                          }
                        }
                      }
                      L21: {
                        if (var6 == 0) {
                          break L21;
                        } else {
                          if (var18.field_O == null) {
                            break L21;
                          } else {
                            ((vn) this).field_O[((vn) this).field_D] = var15.field_O[var12];
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (var7 == 0) {
                          break L22;
                        } else {
                          if (var18.field_u == null) {
                            ((vn) this).field_u[((vn) this).field_D] = (short) -1;
                            break L22;
                          } else {
                            ((vn) this).field_u[((vn) this).field_D] = var15.field_u[var12];
                            break L22;
                          }
                        }
                      }
                      ((vn) this).field_p[((vn) this).field_D] = var15.field_p[var12];
                      ((vn) this).field_K[((vn) this).field_D] = (short)var10;
                      ((vn) this).field_r[((vn) this).field_D] = this.a(var15, var15.field_r[var12], (short) var10);
                      ((vn) this).field_L[((vn) this).field_D] = this.a(var15, var15.field_L[var12], (short) var10);
                      ((vn) this).field_w[((vn) this).field_D] = this.a(var15, var15.field_w[var12], (short) var10);
                      ((vn) this).field_D = ((vn) this).field_D + 1;
                      var12++;
                      continue L17;
                    } else {
                      var9++;
                      continue L8;
                    }
                  }
                } else {
                  var9++;
                  continue L8;
                }
              }
            }
          } else {
            var10_ref_vn = param0[var9];
            if (var10_ref_vn != null) {
              L23: {
                ((vn) this).field_m = ((vn) this).field_m + var10_ref_vn.field_m;
                ((vn) this).field_D = ((vn) this).field_D + var10_ref_vn.field_D;
                ((vn) this).field_R = ((vn) this).field_R + var10_ref_vn.field_R;
                if (var10_ref_vn.field_z == null) {
                  L24: {
                    if (((vn) this).field_F != -1) {
                      break L24;
                    } else {
                      ((vn) this).field_F = var10_ref_vn.field_F;
                      break L24;
                    }
                  }
                  if (((vn) this).field_F == var10_ref_vn.field_F) {
                    break L23;
                  } else {
                    var4 = 1;
                    break L23;
                  }
                } else {
                  var4 = 1;
                  break L23;
                }
              }
              L25: {
                stackOut_10_0 = var3;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (var10_ref_vn.field_o == null) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L25;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L25;
                }
              }
              L26: {
                var3 = stackIn_13_0 | stackIn_13_1;
                stackOut_13_0 = var5;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var10_ref_vn.field_k == null) {
                  stackOut_15_0 = stackIn_15_0;
                  stackOut_15_1 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L26;
                } else {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L26;
                }
              }
              L27: {
                var5 = stackIn_16_0 | stackIn_16_1;
                stackOut_16_0 = var6;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (var10_ref_vn.field_O == null) {
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L27;
                } else {
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L27;
                }
              }
              L28: {
                var6 = stackIn_19_0 | stackIn_19_1;
                stackOut_19_0 = var7;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (var10_ref_vn.field_u == null) {
                  stackOut_21_0 = stackIn_21_0;
                  stackOut_21_1 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  break L28;
                } else {
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L28;
                }
              }
              L29: {
                var7 = stackIn_22_0 | stackIn_22_1;
                stackOut_22_0 = var8;
                stackIn_24_0 = stackOut_22_0;
                stackIn_23_0 = stackOut_22_0;
                if (var10_ref_vn.field_I == null) {
                  stackOut_24_0 = stackIn_24_0;
                  stackOut_24_1 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  break L29;
                } else {
                  stackOut_23_0 = stackIn_23_0;
                  stackOut_23_1 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  break L29;
                }
              }
              var8 = stackIn_25_0 | stackIn_25_1;
              var9++;
              continue L0;
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    vn(vn param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6 = 0;
        L0: {
          ((vn) this).field_D = 0;
          ((vn) this).field_m = 0;
          ((vn) this).field_t = 0;
          ((vn) this).field_F = (byte) 0;
          ((vn) this).field_m = param0.field_m;
          ((vn) this).field_t = param0.field_t;
          ((vn) this).field_D = param0.field_D;
          ((vn) this).field_R = param0.field_R;
          if (!param1) {
            ((vn) this).field_H = new int[((vn) this).field_m];
            ((vn) this).field_l = new int[((vn) this).field_m];
            ((vn) this).field_A = new int[((vn) this).field_m];
            var6 = 0;
            L1: while (true) {
              if (var6 >= ((vn) this).field_m) {
                break L0;
              } else {
                ((vn) this).field_H[var6] = param0.field_H[var6];
                ((vn) this).field_l[var6] = param0.field_l[var6];
                ((vn) this).field_A[var6] = param0.field_A[var6];
                var6++;
                continue L1;
              }
            }
          } else {
            ((vn) this).field_H = param0.field_H;
            ((vn) this).field_l = param0.field_l;
            ((vn) this).field_A = param0.field_A;
            break L0;
          }
        }
        L2: {
          if (!param2) {
            ((vn) this).field_p = new short[((vn) this).field_D];
            var6 = 0;
            L3: while (true) {
              if (var6 >= ((vn) this).field_D) {
                break L2;
              } else {
                ((vn) this).field_p[var6] = param0.field_p[var6];
                var6++;
                continue L3;
              }
            }
          } else {
            ((vn) this).field_p = param0.field_p;
            break L2;
          }
        }
        L4: {
          L5: {
            if (param3) {
              break L5;
            } else {
              if (param0.field_u != null) {
                ((vn) this).field_u = new short[((vn) this).field_D];
                var6 = 0;
                L6: while (true) {
                  if (var6 >= ((vn) this).field_D) {
                    break L4;
                  } else {
                    ((vn) this).field_u[var6] = param0.field_u[var6];
                    var6++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          ((vn) this).field_u = param0.field_u;
          break L4;
        }
        L7: {
          if (!param4) {
            ((vn) this).field_k = new byte[((vn) this).field_D];
            if (param0.field_k != null) {
              var6 = 0;
              L8: while (true) {
                if (var6 >= ((vn) this).field_D) {
                  break L7;
                } else {
                  ((vn) this).field_k[var6] = param0.field_k[var6];
                  var6++;
                  continue L8;
                }
              }
            } else {
              var6 = 0;
              L9: while (true) {
                if (var6 >= ((vn) this).field_D) {
                  break L7;
                } else {
                  ((vn) this).field_k[var6] = (byte) 0;
                  var6++;
                  continue L9;
                }
              }
            }
          } else {
            ((vn) this).field_k = param0.field_k;
            break L7;
          }
        }
        ((vn) this).field_r = param0.field_r;
        ((vn) this).field_L = param0.field_L;
        ((vn) this).field_w = param0.field_w;
        ((vn) this).field_o = param0.field_o;
        ((vn) this).field_z = param0.field_z;
        ((vn) this).field_I = param0.field_I;
        ((vn) this).field_F = param0.field_F;
        ((vn) this).field_T = param0.field_T;
        ((vn) this).field_h = param0.field_h;
        ((vn) this).field_B = param0.field_B;
        ((vn) this).field_y = param0.field_y;
        ((vn) this).field_S = param0.field_S;
        ((vn) this).field_P = param0.field_P;
        ((vn) this).field_j = param0.field_j;
        ((vn) this).field_x = param0.field_x;
        ((vn) this).field_E = param0.field_E;
        ((vn) this).field_Q = param0.field_Q;
        ((vn) this).field_N = param0.field_N;
        ((vn) this).field_G = param0.field_G;
        ((vn) this).field_C = param0.field_C;
        ((vn) this).field_O = param0.field_O;
        ((vn) this).field_s = param0.field_s;
        ((vn) this).field_v = param0.field_v;
        ((vn) this).field_i = param0.field_i;
        ((vn) this).field_J = param0.field_J;
        ((vn) this).field_q = param0.field_q;
    }
}
