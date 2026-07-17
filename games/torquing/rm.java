/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rm extends pa {
    private byte[] field_L;
    private short[] field_H;
    private int[] field_i;
    short[] field_A;
    bl[] field_J;
    int[] field_E;
    int[] field_q;
    private byte[] field_t;
    short[] field_x;
    byte[] field_D;
    short[] field_u;
    dd[] field_l;
    private int[] field_p;
    int field_g;
    int[] field_y;
    byte field_I;
    private short[] field_z;
    byte[] field_j;
    int[] field_M;
    int field_F;
    private byte[] field_Q;
    short[] field_m;
    private byte[] field_v;
    dd[] field_h;
    byte[] field_s;
    private int[][] field_R;
    private short[] field_N;
    private short[] field_K;
    byte[] field_r;
    private short[] field_P;
    private byte[] field_C;
    byte[] field_G;
    int[] field_B;
    int field_k;
    int[] field_o;
    short[] field_n;
    private int[][] field_w;
    int field_f;

    final int a(int param0, int param1, int param2, byte param3, byte param4, short param5, short param6) {
        ((rm) this).field_o[((rm) this).field_g] = param0;
        ((rm) this).field_y[((rm) this).field_g] = param1;
        ((rm) this).field_q[((rm) this).field_g] = param2;
        ((rm) this).field_j[((rm) this).field_g] = (byte)param3;
        ((rm) this).field_D[((rm) this).field_g] = (byte)param4;
        ((rm) this).field_m[((rm) this).field_g] = (short)param5;
        ((rm) this).field_A[((rm) this).field_g] = (short)param6;
        int fieldTemp$0 = ((rm) this).field_g;
        ((rm) this).field_g = ((rm) this).field_g + 1;
        return fieldTemp$0;
    }

    final static rm a(la param0, String param1, String param2) {
        byte[] var3 = param0.a(-106, param2, param1);
        if (var3 == null) {
            return null;
        }
        return new rm(var3);
    }

    final void b() {
        ((rm) this).field_i = null;
        ((rm) this).field_p = null;
        ((rm) this).field_w = null;
        ((rm) this).field_R = null;
    }

    private final void b(byte[] param0) {
        int var2 = 0;
        int var3 = 0;
        fj var4 = null;
        fj var5 = null;
        fj var6 = null;
        fj var7 = null;
        fj var8 = null;
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
          var4 = new fj(param0);
          var5 = new fj(param0);
          var6 = new fj(param0);
          var7 = new fj(param0);
          var8 = new fj(param0);
          var4.field_n = param0.length - 18;
          var9 = var4.i(7088);
          var10 = var4.i(7088);
          var11 = var4.i((byte) -101);
          var12 = var4.i((byte) -101);
          var13 = var4.i((byte) -101);
          var14 = var4.i((byte) -101);
          var15 = var4.i((byte) -101);
          var16 = var4.i((byte) -101);
          var17 = var4.i(7088);
          var18 = var4.i(7088);
          var19 = var4.i(7088);
          var20 = var4.i(7088);
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
          ((rm) this).field_f = var9;
          ((rm) this).field_g = var10;
          ((rm) this).field_k = var11;
          ((rm) this).field_M = new int[var9];
          ((rm) this).field_B = new int[var9];
          ((rm) this).field_E = new int[var9];
          ((rm) this).field_o = new int[var10];
          ((rm) this).field_y = new int[var10];
          ((rm) this).field_q = new int[var10];
          if (var11 <= 0) {
            break L5;
          } else {
            ((rm) this).field_s = new byte[var11];
            ((rm) this).field_u = new short[var11];
            ((rm) this).field_n = new short[var11];
            ((rm) this).field_x = new short[var11];
            break L5;
          }
        }
        L6: {
          if (var16 != 1) {
            break L6;
          } else {
            ((rm) this).field_i = new int[var9];
            break L6;
          }
        }
        L7: {
          if (var12 != 1) {
            break L7;
          } else {
            ((rm) this).field_j = new byte[var10];
            ((rm) this).field_D = new byte[var10];
            ((rm) this).field_A = new short[var10];
            break L7;
          }
        }
        L8: {
          if (var13 != 255) {
            ((rm) this).field_I = (byte)var13;
            break L8;
          } else {
            ((rm) this).field_G = new byte[var10];
            break L8;
          }
        }
        L9: {
          if (var14 != 1) {
            break L9;
          } else {
            ((rm) this).field_r = new byte[var10];
            break L9;
          }
        }
        L10: {
          if (var15 != 1) {
            break L10;
          } else {
            ((rm) this).field_p = new int[var10];
            break L10;
          }
        }
        ((rm) this).field_m = new short[var10];
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
                ((rm) this).field_F = -1;
                var4.field_n = var29;
                var5.field_n = var23;
                var38 = 0;
                var39 = 0;
                var40 = 0;
                var41 = 0;
                var42 = 0;
                L13: while (true) {
                  if (var42 >= var10) {
                    ((rm) this).field_F = ((rm) this).field_F + 1;
                    var4.field_n = var31;
                    var42 = 0;
                    L14: while (true) {
                      if (var42 >= var11) {
                        L15: {
                          if (((rm) this).field_D == null) {
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
                                  ((rm) this).field_D = null;
                                  break L15;
                                }
                              } else {
                                var44 = ((rm) this).field_D[var45] & 255;
                                if (var44 != 255) {
                                  L17: {
                                    if ((((rm) this).field_u[var44] & 65535) != ((rm) this).field_o[var45]) {
                                      break L17;
                                    } else {
                                      if ((((rm) this).field_n[var44] & 65535) != ((rm) this).field_y[var45]) {
                                        break L17;
                                      } else {
                                        if ((((rm) this).field_x[var44] & 65535) != ((rm) this).field_q[var45]) {
                                          break L17;
                                        } else {
                                          ((rm) this).field_D[var45] = (byte) -1;
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
                            ((rm) this).field_A = null;
                            break L18;
                          }
                        }
                        L19: {
                          if (var2 != 0) {
                            break L19;
                          } else {
                            ((rm) this).field_j = null;
                            break L19;
                          }
                        }
                        return;
                      } else {
                        ((rm) this).field_s[var42] = (byte) 0;
                        ((rm) this).field_u[var42] = (short)var4.i(7088);
                        ((rm) this).field_n[var42] = (short)var4.i(7088);
                        ((rm) this).field_x[var42] = (short)var4.i(7088);
                        var42++;
                        continue L14;
                      }
                    }
                  } else {
                    L20: {
                      var43 = var5.i((byte) -101);
                      if (var43 != 1) {
                        break L20;
                      } else {
                        L21: {
                          var38 = var4.g((byte) -118) + var41;
                          var41 = var38;
                          var39 = var4.g((byte) -120) + var41;
                          var41 = var39;
                          var40 = var4.g((byte) -121) + var41;
                          var41 = var40;
                          ((rm) this).field_o[var42] = var38;
                          ((rm) this).field_y[var42] = var39;
                          ((rm) this).field_q[var42] = var40;
                          if (var38 <= ((rm) this).field_F) {
                            break L21;
                          } else {
                            ((rm) this).field_F = var38;
                            break L21;
                          }
                        }
                        L22: {
                          if (var39 <= ((rm) this).field_F) {
                            break L22;
                          } else {
                            ((rm) this).field_F = var39;
                            break L22;
                          }
                        }
                        if (var40 <= ((rm) this).field_F) {
                          break L20;
                        } else {
                          ((rm) this).field_F = var40;
                          break L20;
                        }
                      }
                    }
                    L23: {
                      if (var43 != 2) {
                        break L23;
                      } else {
                        var39 = var40;
                        var40 = var4.g((byte) -118) + var41;
                        var41 = var40;
                        ((rm) this).field_o[var42] = var38;
                        ((rm) this).field_y[var42] = var39;
                        ((rm) this).field_q[var42] = var40;
                        if (var40 <= ((rm) this).field_F) {
                          break L23;
                        } else {
                          ((rm) this).field_F = var40;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var43 != 3) {
                        break L24;
                      } else {
                        var38 = var40;
                        var40 = var4.g((byte) -122) + var41;
                        var41 = var40;
                        ((rm) this).field_o[var42] = var38;
                        ((rm) this).field_y[var42] = var39;
                        ((rm) this).field_q[var42] = var40;
                        if (var40 <= ((rm) this).field_F) {
                          break L24;
                        } else {
                          ((rm) this).field_F = var40;
                          break L24;
                        }
                      }
                    }
                    if (var43 == 4) {
                      var44 = var38;
                      var38 = var39;
                      var39 = var44;
                      var40 = var4.g((byte) -117) + var41;
                      var41 = var40;
                      ((rm) this).field_o[var42] = var38;
                      ((rm) this).field_y[var42] = var39;
                      ((rm) this).field_q[var42] = var40;
                      if (var40 > ((rm) this).field_F) {
                        ((rm) this).field_F = var40;
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
                  ((rm) this).field_m[var38] = (short)var4.i(7088);
                  if (var12 != 1) {
                    break L25;
                  } else {
                    L26: {
                      var39 = var5.i((byte) -101);
                      if ((var39 & 1) != 1) {
                        ((rm) this).field_j[var38] = (byte) 0;
                        break L26;
                      } else {
                        ((rm) this).field_j[var38] = (byte) 1;
                        var2 = 1;
                        break L26;
                      }
                    }
                    if ((var39 & 2) != 2) {
                      ((rm) this).field_D[var38] = (byte) -1;
                      ((rm) this).field_A[var38] = (short) -1;
                      break L25;
                    } else {
                      ((rm) this).field_D[var38] = (byte)(var39 >> 2);
                      ((rm) this).field_A[var38] = ((rm) this).field_m[var38];
                      ((rm) this).field_m[var38] = (short) 127;
                      if (((rm) this).field_A[var38] == -1) {
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
                    ((rm) this).field_G[var38] = var6.f((byte) 69);
                    break L27;
                  }
                }
                L28: {
                  if (var14 != 1) {
                    break L28;
                  } else {
                    ((rm) this).field_r[var38] = var7.f((byte) 76);
                    break L28;
                  }
                }
                if (var15 == 1) {
                  ((rm) this).field_p[var38] = var8.i((byte) -101);
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
              var39 = var4.i((byte) -101);
              var40 = 0;
              if ((var39 & 1) == 0) {
                break L29;
              } else {
                var40 = var5.g((byte) -121);
                break L29;
              }
            }
            L30: {
              var41 = 0;
              if ((var39 & 2) == 0) {
                break L30;
              } else {
                var41 = var6.g((byte) -123);
                break L30;
              }
            }
            L31: {
              var42 = 0;
              if ((var39 & 4) == 0) {
                break L31;
              } else {
                var42 = var7.g((byte) -116);
                break L31;
              }
            }
            ((rm) this).field_M[var38] = var35 + var40;
            ((rm) this).field_B[var38] = var36 + var41;
            ((rm) this).field_E[var38] = var37 + var42;
            var35 = ((rm) this).field_M[var38];
            var36 = ((rm) this).field_B[var38];
            var37 = ((rm) this).field_E[var38];
            if (var16 == 1) {
              ((rm) this).field_i[var38] = var8.i((byte) -101);
              var38++;
              continue L11;
            } else {
              var38++;
              continue L11;
            }
          }
        }
    }

    final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((rm) this).field_f) {
            var2 = (int)(Math.sqrt((double)var2) + 0.99);
            this.a(param0, param0, param0, var2);
            return var2;
          } else {
            var4 = ((rm) this).field_M[var3];
            var5 = ((rm) this).field_B[var3];
            var6 = ((rm) this).field_E[var3];
            var7 = var4 * var4 + var6 * var6 + var5 * var5;
            if (var7 > var2) {
              var2 = var7;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = 0; var5 < ((rm) this).field_f; var5++) {
            ((rm) this).field_M[var5] = ((rm) this).field_M[var5] * param0 / param3;
            ((rm) this).field_B[var5] = ((rm) this).field_B[var5] * param1 / param3;
            ((rm) this).field_E[var5] = ((rm) this).field_E[var5] * param2 / param3;
        }
        this.d();
    }

    final bk a(int param0, int param1, int param2, int param3, int param4) {
        return (bk) (Object) new pj((rm) this, param0, param1, param2, param3, param4);
    }

    final void a() {
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
        bl var16 = null;
        dd var17 = null;
        dd var18 = null;
        dd var19 = null;
        if (((rm) this).field_l == null) {
          ((rm) this).field_l = new dd[((rm) this).field_F];
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((rm) this).field_F) {
              var1 = 0;
              L1: while (true) {
                if (var1 >= ((rm) this).field_g) {
                  return;
                } else {
                  var2 = ((rm) this).field_o[var1];
                  var3 = ((rm) this).field_y[var1];
                  var4 = ((rm) this).field_q[var1];
                  var5 = ((rm) this).field_M[var3] - ((rm) this).field_M[var2];
                  var6 = ((rm) this).field_B[var3] - ((rm) this).field_B[var2];
                  var7 = ((rm) this).field_E[var3] - ((rm) this).field_E[var2];
                  var8 = ((rm) this).field_M[var4] - ((rm) this).field_M[var2];
                  var9 = ((rm) this).field_B[var4] - ((rm) this).field_B[var2];
                  var10 = ((rm) this).field_E[var4] - ((rm) this).field_E[var2];
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
                                    if (((rm) this).field_j != null) {
                                      var15 = ((rm) this).field_j[var1];
                                      break L5;
                                    } else {
                                      var15 = 0;
                                      break L5;
                                    }
                                  }
                                  if (var15 != 0) {
                                    if (var15 == 1) {
                                      L6: {
                                        if (((rm) this).field_J != null) {
                                          break L6;
                                        } else {
                                          ((rm) this).field_J = new bl[((rm) this).field_g];
                                          break L6;
                                        }
                                      }
                                      bl dupTemp$1 = new bl();
                                      ((rm) this).field_J[var1] = dupTemp$1;
                                      var16 = dupTemp$1;
                                      var16.field_c = var11;
                                      var16.field_f = var12;
                                      var16.field_a = var13;
                                      var1++;
                                      continue L1;
                                    } else {
                                      var1++;
                                      continue L1;
                                    }
                                  } else {
                                    var17 = ((rm) this).field_l[var2];
                                    var17.field_g = var17.field_g + var11;
                                    var17.field_a = var17.field_a + var12;
                                    var17.field_h = var17.field_h + var13;
                                    var17.field_f = var17.field_f + 1;
                                    var18 = ((rm) this).field_l[var3];
                                    var18.field_g = var18.field_g + var11;
                                    var18.field_a = var18.field_a + var12;
                                    var18.field_h = var18.field_h + var13;
                                    var18.field_f = var18.field_f + 1;
                                    var19 = ((rm) this).field_l[var4];
                                    var19.field_g = var19.field_g + var11;
                                    var19.field_a = var19.field_a + var12;
                                    var19.field_h = var19.field_h + var13;
                                    var19.field_f = var19.field_f + 1;
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
              ((rm) this).field_l[var1] = new dd();
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void a(byte[] param0) {
        fj var2 = null;
        fj var3 = null;
        fj var4 = null;
        fj var5 = null;
        fj var6 = null;
        fj var7 = null;
        fj var8 = null;
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
          var2 = new fj(param0);
          var3 = new fj(param0);
          var4 = new fj(param0);
          var5 = new fj(param0);
          var6 = new fj(param0);
          var7 = new fj(param0);
          var8 = new fj(param0);
          var2.field_n = param0.length - 23;
          var9 = var2.i(7088);
          var10 = var2.i(7088);
          var11 = var2.i((byte) -101);
          var12 = var2.i((byte) -101);
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
          var15 = var2.i((byte) -101);
          var16 = var2.i((byte) -101);
          var17 = var2.i((byte) -101);
          var18 = var2.i((byte) -101);
          var19 = var2.i((byte) -101);
          var20 = var2.i(7088);
          var21 = var2.i(7088);
          var22 = var2.i(7088);
          var23 = var2.i(7088);
          var24 = var2.i(7088);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (var11 <= 0) {
            break L2;
          } else {
            ((rm) this).field_s = new byte[var11];
            var2.field_n = 0;
            var28 = 0;
            L3: while (true) {
              if (var28 >= var11) {
                break L2;
              } else {
                L4: {
                  byte dupTemp$1 = var2.f((byte) 64);
                  ((rm) this).field_s[var28] = dupTemp$1;
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
          ((rm) this).field_f = var9;
          ((rm) this).field_g = var10;
          ((rm) this).field_k = var11;
          ((rm) this).field_M = new int[var9];
          ((rm) this).field_B = new int[var9];
          ((rm) this).field_E = new int[var9];
          ((rm) this).field_o = new int[var10];
          ((rm) this).field_y = new int[var10];
          ((rm) this).field_q = new int[var10];
          if (var19 != 1) {
            break L12;
          } else {
            ((rm) this).field_i = new int[var9];
            break L12;
          }
        }
        L13: {
          if (var13 == 0) {
            break L13;
          } else {
            ((rm) this).field_j = new byte[var10];
            break L13;
          }
        }
        L14: {
          if (var15 != 255) {
            ((rm) this).field_I = (byte)var15;
            break L14;
          } else {
            ((rm) this).field_G = new byte[var10];
            break L14;
          }
        }
        L15: {
          if (var16 != 1) {
            break L15;
          } else {
            ((rm) this).field_r = new byte[var10];
            break L15;
          }
        }
        L16: {
          if (var17 != 1) {
            break L16;
          } else {
            ((rm) this).field_p = new int[var10];
            break L16;
          }
        }
        L17: {
          if (var18 != 1) {
            break L17;
          } else {
            ((rm) this).field_A = new short[var10];
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
              ((rm) this).field_D = new byte[var10];
              break L18;
            }
          }
        }
        L19: {
          ((rm) this).field_m = new short[var10];
          if (var11 <= 0) {
            break L19;
          } else {
            L20: {
              ((rm) this).field_u = new short[var11];
              ((rm) this).field_n = new short[var11];
              ((rm) this).field_x = new short[var11];
              if (var26 <= 0) {
                break L20;
              } else {
                ((rm) this).field_N = new short[var26];
                ((rm) this).field_z = new short[var26];
                ((rm) this).field_K = new short[var26];
                ((rm) this).field_C = new byte[var26];
                ((rm) this).field_v = new byte[var26];
                ((rm) this).field_L = new byte[var26];
                break L20;
              }
            }
            if (var27 <= 0) {
              break L19;
            } else {
              ((rm) this).field_Q = new byte[var27];
              ((rm) this).field_t = new byte[var27];
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
                ((rm) this).field_F = -1;
                var2.field_n = var36;
                var3.field_n = var31;
                var53 = 0;
                var54 = 0;
                var55 = 0;
                var56 = 0;
                var57 = 0;
                L23: while (true) {
                  if (var57 >= var10) {
                    ((rm) this).field_F = ((rm) this).field_F + 1;
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
                              var57 = var2.i((byte) -101);
                              if (var57 <= 0) {
                                break L26;
                              } else {
                                var2.field_n = var2.field_n + 4 * var57;
                                break L26;
                              }
                            }
                            var58 = var2.i((byte) -101);
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
                          var58 = ((rm) this).field_s[var57] & 255;
                          if (var58 != 0) {
                            break L27;
                          } else {
                            ((rm) this).field_u[var57] = (short)var2.i(7088);
                            ((rm) this).field_n[var57] = (short)var2.i(7088);
                            ((rm) this).field_x[var57] = (short)var2.i(7088);
                            break L27;
                          }
                        }
                        L28: {
                          if (var58 != 1) {
                            break L28;
                          } else {
                            ((rm) this).field_u[var57] = (short)var3.i(7088);
                            ((rm) this).field_n[var57] = (short)var3.i(7088);
                            ((rm) this).field_x[var57] = (short)var3.i(7088);
                            ((rm) this).field_N[var57] = (short)var4.i(7088);
                            ((rm) this).field_z[var57] = (short)var4.i(7088);
                            ((rm) this).field_K[var57] = (short)var4.i(7088);
                            ((rm) this).field_C[var57] = var5.f((byte) 100);
                            ((rm) this).field_v[var57] = var6.f((byte) 114);
                            ((rm) this).field_L[var57] = var7.f((byte) 52);
                            break L28;
                          }
                        }
                        L29: {
                          if (var58 != 2) {
                            break L29;
                          } else {
                            ((rm) this).field_u[var57] = (short)var3.i(7088);
                            ((rm) this).field_n[var57] = (short)var3.i(7088);
                            ((rm) this).field_x[var57] = (short)var3.i(7088);
                            ((rm) this).field_N[var57] = (short)var4.i(7088);
                            ((rm) this).field_z[var57] = (short)var4.i(7088);
                            ((rm) this).field_K[var57] = (short)var4.i(7088);
                            ((rm) this).field_C[var57] = var5.f((byte) 51);
                            ((rm) this).field_v[var57] = var6.f((byte) 74);
                            ((rm) this).field_L[var57] = var7.f((byte) 86);
                            ((rm) this).field_Q[var57] = var7.f((byte) 22);
                            ((rm) this).field_t[var57] = var7.f((byte) 37);
                            break L29;
                          }
                        }
                        if (var58 == 3) {
                          ((rm) this).field_u[var57] = (short)var3.i(7088);
                          ((rm) this).field_n[var57] = (short)var3.i(7088);
                          ((rm) this).field_x[var57] = (short)var3.i(7088);
                          ((rm) this).field_N[var57] = (short)var4.i(7088);
                          ((rm) this).field_z[var57] = (short)var4.i(7088);
                          ((rm) this).field_K[var57] = (short)var4.i(7088);
                          ((rm) this).field_C[var57] = var5.f((byte) 118);
                          ((rm) this).field_v[var57] = var6.f((byte) 119);
                          ((rm) this).field_L[var57] = var7.f((byte) 35);
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
                      var58 = var3.i((byte) -101);
                      if (var58 != 1) {
                        break L30;
                      } else {
                        L31: {
                          var53 = var2.g((byte) -123) + var56;
                          var56 = var53;
                          var54 = var2.g((byte) -127) + var56;
                          var56 = var54;
                          var55 = var2.g((byte) -116) + var56;
                          var56 = var55;
                          ((rm) this).field_o[var57] = var53;
                          ((rm) this).field_y[var57] = var54;
                          ((rm) this).field_q[var57] = var55;
                          if (var53 <= ((rm) this).field_F) {
                            break L31;
                          } else {
                            ((rm) this).field_F = var53;
                            break L31;
                          }
                        }
                        L32: {
                          if (var54 <= ((rm) this).field_F) {
                            break L32;
                          } else {
                            ((rm) this).field_F = var54;
                            break L32;
                          }
                        }
                        if (var55 <= ((rm) this).field_F) {
                          break L30;
                        } else {
                          ((rm) this).field_F = var55;
                          break L30;
                        }
                      }
                    }
                    L33: {
                      if (var58 != 2) {
                        break L33;
                      } else {
                        var54 = var55;
                        var55 = var2.g((byte) -127) + var56;
                        var56 = var55;
                        ((rm) this).field_o[var57] = var53;
                        ((rm) this).field_y[var57] = var54;
                        ((rm) this).field_q[var57] = var55;
                        if (var55 <= ((rm) this).field_F) {
                          break L33;
                        } else {
                          ((rm) this).field_F = var55;
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (var58 != 3) {
                        break L34;
                      } else {
                        var53 = var55;
                        var55 = var2.g((byte) -118) + var56;
                        var56 = var55;
                        ((rm) this).field_o[var57] = var53;
                        ((rm) this).field_y[var57] = var54;
                        ((rm) this).field_q[var57] = var55;
                        if (var55 <= ((rm) this).field_F) {
                          break L34;
                        } else {
                          ((rm) this).field_F = var55;
                          break L34;
                        }
                      }
                    }
                    if (var58 == 4) {
                      var59 = var53;
                      var53 = var54;
                      var54 = var59;
                      var55 = var2.g((byte) -121) + var56;
                      var56 = var55;
                      ((rm) this).field_o[var57] = var53;
                      ((rm) this).field_y[var57] = var54;
                      ((rm) this).field_q[var57] = var55;
                      if (var55 > ((rm) this).field_F) {
                        ((rm) this).field_F = var55;
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
                  ((rm) this).field_m[var53] = (short)var2.i(7088);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    ((rm) this).field_j[var53] = var3.f((byte) 78);
                    break L35;
                  }
                }
                L36: {
                  if (var15 != 255) {
                    break L36;
                  } else {
                    ((rm) this).field_G[var53] = var4.f((byte) 54);
                    break L36;
                  }
                }
                L37: {
                  if (var16 != 1) {
                    break L37;
                  } else {
                    ((rm) this).field_r[var53] = var5.f((byte) 54);
                    break L37;
                  }
                }
                L38: {
                  if (var17 != 1) {
                    break L38;
                  } else {
                    ((rm) this).field_p[var53] = var6.i((byte) -101);
                    break L38;
                  }
                }
                L39: {
                  if (var18 != 1) {
                    break L39;
                  } else {
                    ((rm) this).field_A[var53] = (short)(var7.i(7088) - 1);
                    break L39;
                  }
                }
                if (((rm) this).field_D != null) {
                  if (((rm) this).field_A[var53] == -1) {
                    ((rm) this).field_D[var53] = (byte) -1;
                    var53++;
                    continue L22;
                  } else {
                    ((rm) this).field_D[var53] = (byte)(var8.i((byte) -101) - 1);
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
              var54 = var2.i((byte) -101);
              var55 = 0;
              if ((var54 & 1) == 0) {
                break L40;
              } else {
                var55 = var3.g((byte) -124);
                break L40;
              }
            }
            L41: {
              var56 = 0;
              if ((var54 & 2) == 0) {
                break L41;
              } else {
                var56 = var4.g((byte) -128);
                break L41;
              }
            }
            L42: {
              var57 = 0;
              if ((var54 & 4) == 0) {
                break L42;
              } else {
                var57 = var5.g((byte) -125);
                break L42;
              }
            }
            ((rm) this).field_M[var53] = var50 + var55;
            ((rm) this).field_B[var53] = var51 + var56;
            ((rm) this).field_E[var53] = var52 + var57;
            var50 = ((rm) this).field_M[var53];
            var51 = ((rm) this).field_B[var53];
            var52 = ((rm) this).field_E[var53];
            if (var19 == 1) {
              ((rm) this).field_i[var53] = var6.i((byte) -101);
              var53++;
              continue L21;
            } else {
              var53++;
              continue L21;
            }
          }
        }
    }

    private final void d() {
        ((rm) this).field_l = null;
        ((rm) this).field_h = null;
        ((rm) this).field_J = null;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((rm) this).field_f) {
            ((rm) this).field_M[((rm) this).field_f] = param0;
            ((rm) this).field_B[((rm) this).field_f] = param1;
            ((rm) this).field_E[((rm) this).field_f] = param2;
            int fieldTemp$1 = ((rm) this).field_f + 1;
            ((rm) this).field_f = ((rm) this).field_f + 1;
            ((rm) this).field_F = fieldTemp$1;
            return ((rm) this).field_f - 1;
          } else {
            if (((rm) this).field_M[var4] == param0) {
              if (((rm) this).field_B[var4] == param1) {
                if (((rm) this).field_E[var4] == param2) {
                  return var4;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final int a(rm param0, int param1, short param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param0.field_M[param1];
        var5 = param0.field_B[param1];
        var6 = param0.field_E[param1];
        var7 = 0;
        L0: while (true) {
          if (var7 >= ((rm) this).field_f) {
            L1: {
              ((rm) this).field_M[((rm) this).field_f] = var4;
              ((rm) this).field_B[((rm) this).field_f] = var5;
              ((rm) this).field_E[((rm) this).field_f] = var6;
              ((rm) this).field_H[((rm) this).field_f] = (short)param2;
              if (param0.field_i == null) {
                break L1;
              } else {
                ((rm) this).field_i[((rm) this).field_f] = param0.field_i[param1];
                break L1;
              }
            }
            int fieldTemp$1 = ((rm) this).field_f;
            ((rm) this).field_f = ((rm) this).field_f + 1;
            return fieldTemp$1;
          } else {
            if (var4 == ((rm) this).field_M[var7]) {
              if (var5 == ((rm) this).field_B[var7]) {
                if (var6 == ((rm) this).field_E[var7]) {
                  ((rm) this).field_H[var7] = (short)(((rm) this).field_H[var7] | param2);
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

    final void c() {
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
          if (((rm) this).field_i == null) {
            break L0;
          } else {
            var9 = new int[256];
            var7 = var9;
            var5 = var7;
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((rm) this).field_f) {
                ((rm) this).field_w = new int[var2 + 1][];
                var3 = 0;
                L2: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ((rm) this).field_f) {
                        ((rm) this).field_i = null;
                        break L0;
                      } else {
                        var4 = ((rm) this).field_i[var3];
                        var5[var4] = var5[var4] + 1;
                        ((rm) this).field_w[var4][var5[var4]] = var3;
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    ((rm) this).field_w[var3] = new int[var9[var3]];
                    var9[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = ((rm) this).field_i[var3];
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
          if (((rm) this).field_p == null) {
            break L4;
          } else {
            var10 = new int[256];
            var8 = var10;
            var6 = var8;
            var2 = 0;
            var3 = 0;
            L5: while (true) {
              if (var3 >= ((rm) this).field_g) {
                ((rm) this).field_R = new int[var2 + 1][];
                var3 = 0;
                L6: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= ((rm) this).field_g) {
                        ((rm) this).field_p = null;
                        break L4;
                      } else {
                        var4 = ((rm) this).field_p[var3];
                        var6[var4] = var6[var4] + 1;
                        ((rm) this).field_R[var4][var6[var4]] = var3;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    ((rm) this).field_R[var3] = new int[var10[var3]];
                    var10[var3] = 0;
                    var3++;
                    continue L6;
                  }
                }
              } else {
                var4 = ((rm) this).field_p[var3];
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

    private rm(byte[] param0) {
        L0: {
          L1: {
            ((rm) this).field_I = (byte) 0;
            ((rm) this).field_F = 0;
            ((rm) this).field_g = 0;
            ((rm) this).field_f = 0;
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

    rm(int param0, int param1, int param2) {
        ((rm) this).field_I = (byte) 0;
        ((rm) this).field_F = 0;
        ((rm) this).field_g = 0;
        ((rm) this).field_f = 0;
        ((rm) this).field_M = new int[param0];
        ((rm) this).field_B = new int[param0];
        ((rm) this).field_E = new int[param0];
        ((rm) this).field_i = new int[param0];
        ((rm) this).field_o = new int[param1];
        ((rm) this).field_y = new int[param1];
        ((rm) this).field_q = new int[param1];
        ((rm) this).field_j = new byte[param1];
        ((rm) this).field_G = new byte[param1];
        ((rm) this).field_r = new byte[param1];
        ((rm) this).field_m = new short[param1];
        ((rm) this).field_A = new short[param1];
        ((rm) this).field_D = new byte[param1];
        ((rm) this).field_p = new int[param1];
        if (param2 > 0) {
            ((rm) this).field_s = new byte[param2];
            ((rm) this).field_u = new short[param2];
            ((rm) this).field_n = new short[param2];
            ((rm) this).field_x = new short[param2];
            ((rm) this).field_N = new short[param2];
            ((rm) this).field_z = new short[param2];
            ((rm) this).field_K = new short[param2];
            ((rm) this).field_C = new byte[param2];
            ((rm) this).field_v = new byte[param2];
            ((rm) this).field_L = new byte[param2];
            ((rm) this).field_Q = new byte[param2];
            ((rm) this).field_t = new byte[param2];
        }
    }

    rm(rm[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        rm var10_ref_rm = null;
        int var10 = 0;
        rm var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        rm var15 = null;
        rm var16 = null;
        int var17 = 0;
        rm var18 = null;
        rm var19 = null;
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
        ((rm) this).field_I = (byte) 0;
        ((rm) this).field_F = 0;
        ((rm) this).field_g = 0;
        ((rm) this).field_f = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        ((rm) this).field_f = 0;
        ((rm) this).field_g = 0;
        ((rm) this).field_k = 0;
        ((rm) this).field_I = (byte) -1;
        var9 = 0;
        L0: while (true) {
          if (var9 >= param1) {
            L1: {
              ((rm) this).field_M = new int[((rm) this).field_f];
              ((rm) this).field_B = new int[((rm) this).field_f];
              ((rm) this).field_E = new int[((rm) this).field_f];
              ((rm) this).field_i = new int[((rm) this).field_f];
              ((rm) this).field_H = new short[((rm) this).field_f];
              ((rm) this).field_o = new int[((rm) this).field_g];
              ((rm) this).field_y = new int[((rm) this).field_g];
              ((rm) this).field_q = new int[((rm) this).field_g];
              if (var3 == 0) {
                break L1;
              } else {
                ((rm) this).field_j = new byte[((rm) this).field_g];
                break L1;
              }
            }
            L2: {
              if (var4 == 0) {
                break L2;
              } else {
                ((rm) this).field_G = new byte[((rm) this).field_g];
                break L2;
              }
            }
            L3: {
              if (var5 == 0) {
                break L3;
              } else {
                ((rm) this).field_r = new byte[((rm) this).field_g];
                break L3;
              }
            }
            L4: {
              if (var6 == 0) {
                break L4;
              } else {
                ((rm) this).field_p = new int[((rm) this).field_g];
                break L4;
              }
            }
            L5: {
              if (var7 == 0) {
                break L5;
              } else {
                ((rm) this).field_A = new short[((rm) this).field_g];
                break L5;
              }
            }
            L6: {
              if (var8 == 0) {
                break L6;
              } else {
                ((rm) this).field_D = new byte[((rm) this).field_g];
                break L6;
              }
            }
            L7: {
              ((rm) this).field_m = new short[((rm) this).field_g];
              ((rm) this).field_P = new short[((rm) this).field_g];
              if (((rm) this).field_k <= 0) {
                break L7;
              } else {
                ((rm) this).field_s = new byte[((rm) this).field_k];
                ((rm) this).field_u = new short[((rm) this).field_k];
                ((rm) this).field_n = new short[((rm) this).field_k];
                ((rm) this).field_x = new short[((rm) this).field_k];
                ((rm) this).field_N = new short[((rm) this).field_k];
                ((rm) this).field_z = new short[((rm) this).field_k];
                ((rm) this).field_K = new short[((rm) this).field_k];
                ((rm) this).field_C = new byte[((rm) this).field_k];
                ((rm) this).field_v = new byte[((rm) this).field_k];
                ((rm) this).field_L = new byte[((rm) this).field_k];
                ((rm) this).field_Q = new byte[((rm) this).field_k];
                ((rm) this).field_t = new byte[((rm) this).field_k];
                break L7;
              }
            }
            ((rm) this).field_f = 0;
            ((rm) this).field_g = 0;
            ((rm) this).field_k = 0;
            var9 = 0;
            L8: while (true) {
              if (var9 >= param1) {
                var9 = 0;
                ((rm) this).field_F = ((rm) this).field_f;
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
                        if (var13 >= var19.field_g) {
                          var17 = 0;
                          var13 = var17;
                          L11: while (true) {
                            if (var17 < var19.field_k) {
                              L12: {
                                ((rm) this).field_s[((rm) this).field_k] = var16.field_s[var17];
                                var14 = var16.field_s[var17];
                                if (var14 != 0) {
                                  break L12;
                                } else {
                                  ((rm) this).field_u[((rm) this).field_k] = (short)this.a(var16, (int) var16.field_u[var17], (short) var12);
                                  ((rm) this).field_n[((rm) this).field_k] = (short)this.a(var16, (int) var16.field_n[var17], (short) var12);
                                  ((rm) this).field_x[((rm) this).field_k] = (short)this.a(var16, (int) var16.field_x[var17], (short) var12);
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
                                    ((rm) this).field_u[((rm) this).field_k] = var16.field_u[var17];
                                    ((rm) this).field_n[((rm) this).field_k] = var16.field_n[var17];
                                    ((rm) this).field_x[((rm) this).field_k] = var16.field_x[var17];
                                    ((rm) this).field_N[((rm) this).field_k] = var16.field_N[var17];
                                    ((rm) this).field_z[((rm) this).field_k] = var16.field_z[var17];
                                    ((rm) this).field_K[((rm) this).field_k] = var16.field_K[var17];
                                    ((rm) this).field_C[((rm) this).field_k] = var16.field_C[var17];
                                    ((rm) this).field_v[((rm) this).field_k] = var16.field_v[var17];
                                    ((rm) this).field_L[((rm) this).field_k] = var16.field_L[var17];
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                if (var14 != 2) {
                                  break L14;
                                } else {
                                  ((rm) this).field_Q[((rm) this).field_k] = var16.field_Q[var17];
                                  ((rm) this).field_t[((rm) this).field_k] = var16.field_t[var17];
                                  break L14;
                                }
                              }
                              ((rm) this).field_k = ((rm) this).field_k + 1;
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
                                stackOut_74_0 = ((rm) this).field_D;
                                stackOut_74_1 = incrementValue$1;
                                stackIn_77_0 = stackOut_74_0;
                                stackIn_77_1 = stackOut_74_1;
                                stackIn_75_0 = stackOut_74_0;
                                stackIn_75_1 = stackOut_74_1;
                                if (var19.field_D == null) {
                                  break L16;
                                } else {
                                  stackOut_75_0 = (byte[]) (Object) stackIn_75_0;
                                  stackOut_75_1 = stackIn_75_1;
                                  stackIn_77_0 = stackOut_75_0;
                                  stackIn_77_1 = stackOut_75_1;
                                  stackIn_76_0 = stackOut_75_0;
                                  stackIn_76_1 = stackOut_75_1;
                                  if (var16.field_D[var13] == -1) {
                                    break L16;
                                  } else {
                                    stackOut_76_0 = (byte[]) (Object) stackIn_76_0;
                                    stackOut_76_1 = stackIn_76_1;
                                    stackOut_76_2 = var16.field_D[var13] + ((rm) this).field_k;
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
                    if (var12 < var18.field_g) {
                      L18: {
                        if (var3 == 0) {
                          break L18;
                        } else {
                          if (var18.field_j == null) {
                            break L18;
                          } else {
                            ((rm) this).field_j[((rm) this).field_g] = var15.field_j[var12];
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (var4 == 0) {
                          break L19;
                        } else {
                          if (var18.field_G == null) {
                            ((rm) this).field_G[((rm) this).field_g] = var15.field_I;
                            break L19;
                          } else {
                            ((rm) this).field_G[((rm) this).field_g] = var15.field_G[var12];
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (var5 == 0) {
                          break L20;
                        } else {
                          if (var18.field_r == null) {
                            break L20;
                          } else {
                            ((rm) this).field_r[((rm) this).field_g] = var15.field_r[var12];
                            break L20;
                          }
                        }
                      }
                      L21: {
                        if (var6 == 0) {
                          break L21;
                        } else {
                          if (var18.field_p == null) {
                            break L21;
                          } else {
                            ((rm) this).field_p[((rm) this).field_g] = var15.field_p[var12];
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (var7 == 0) {
                          break L22;
                        } else {
                          if (var18.field_A == null) {
                            ((rm) this).field_A[((rm) this).field_g] = (short) -1;
                            break L22;
                          } else {
                            ((rm) this).field_A[((rm) this).field_g] = var15.field_A[var12];
                            break L22;
                          }
                        }
                      }
                      ((rm) this).field_m[((rm) this).field_g] = var15.field_m[var12];
                      ((rm) this).field_P[((rm) this).field_g] = (short)var10;
                      ((rm) this).field_o[((rm) this).field_g] = this.a(var15, var15.field_o[var12], (short) var10);
                      ((rm) this).field_y[((rm) this).field_g] = this.a(var15, var15.field_y[var12], (short) var10);
                      ((rm) this).field_q[((rm) this).field_g] = this.a(var15, var15.field_q[var12], (short) var10);
                      ((rm) this).field_g = ((rm) this).field_g + 1;
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
            var10_ref_rm = param0[var9];
            if (var10_ref_rm != null) {
              L23: {
                ((rm) this).field_f = ((rm) this).field_f + var10_ref_rm.field_f;
                ((rm) this).field_g = ((rm) this).field_g + var10_ref_rm.field_g;
                ((rm) this).field_k = ((rm) this).field_k + var10_ref_rm.field_k;
                if (var10_ref_rm.field_G == null) {
                  L24: {
                    if (((rm) this).field_I != -1) {
                      break L24;
                    } else {
                      ((rm) this).field_I = var10_ref_rm.field_I;
                      break L24;
                    }
                  }
                  if (((rm) this).field_I == var10_ref_rm.field_I) {
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
                if (var10_ref_rm.field_j == null) {
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
                if (var10_ref_rm.field_r == null) {
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
                if (var10_ref_rm.field_p == null) {
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
                if (var10_ref_rm.field_A == null) {
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
                if (var10_ref_rm.field_D == null) {
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

    rm(rm param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6 = 0;
        L0: {
          ((rm) this).field_I = (byte) 0;
          ((rm) this).field_F = 0;
          ((rm) this).field_g = 0;
          ((rm) this).field_f = 0;
          ((rm) this).field_f = param0.field_f;
          ((rm) this).field_F = param0.field_F;
          ((rm) this).field_g = param0.field_g;
          ((rm) this).field_k = param0.field_k;
          if (!param1) {
            ((rm) this).field_M = new int[((rm) this).field_f];
            ((rm) this).field_B = new int[((rm) this).field_f];
            ((rm) this).field_E = new int[((rm) this).field_f];
            var6 = 0;
            L1: while (true) {
              if (var6 >= ((rm) this).field_f) {
                break L0;
              } else {
                ((rm) this).field_M[var6] = param0.field_M[var6];
                ((rm) this).field_B[var6] = param0.field_B[var6];
                ((rm) this).field_E[var6] = param0.field_E[var6];
                var6++;
                continue L1;
              }
            }
          } else {
            ((rm) this).field_M = param0.field_M;
            ((rm) this).field_B = param0.field_B;
            ((rm) this).field_E = param0.field_E;
            break L0;
          }
        }
        L2: {
          if (!param2) {
            ((rm) this).field_m = new short[((rm) this).field_g];
            var6 = 0;
            L3: while (true) {
              if (var6 >= ((rm) this).field_g) {
                break L2;
              } else {
                ((rm) this).field_m[var6] = param0.field_m[var6];
                var6++;
                continue L3;
              }
            }
          } else {
            ((rm) this).field_m = param0.field_m;
            break L2;
          }
        }
        L4: {
          L5: {
            if (param3) {
              break L5;
            } else {
              if (param0.field_A != null) {
                ((rm) this).field_A = new short[((rm) this).field_g];
                var6 = 0;
                L6: while (true) {
                  if (var6 >= ((rm) this).field_g) {
                    break L4;
                  } else {
                    ((rm) this).field_A[var6] = param0.field_A[var6];
                    var6++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          ((rm) this).field_A = param0.field_A;
          break L4;
        }
        L7: {
          if (!param4) {
            ((rm) this).field_r = new byte[((rm) this).field_g];
            if (param0.field_r != null) {
              var6 = 0;
              L8: while (true) {
                if (var6 >= ((rm) this).field_g) {
                  break L7;
                } else {
                  ((rm) this).field_r[var6] = param0.field_r[var6];
                  var6++;
                  continue L8;
                }
              }
            } else {
              var6 = 0;
              L9: while (true) {
                if (var6 >= ((rm) this).field_g) {
                  break L7;
                } else {
                  ((rm) this).field_r[var6] = (byte) 0;
                  var6++;
                  continue L9;
                }
              }
            }
          } else {
            ((rm) this).field_r = param0.field_r;
            break L7;
          }
        }
        ((rm) this).field_o = param0.field_o;
        ((rm) this).field_y = param0.field_y;
        ((rm) this).field_q = param0.field_q;
        ((rm) this).field_j = param0.field_j;
        ((rm) this).field_G = param0.field_G;
        ((rm) this).field_D = param0.field_D;
        ((rm) this).field_I = param0.field_I;
        ((rm) this).field_s = param0.field_s;
        ((rm) this).field_u = param0.field_u;
        ((rm) this).field_n = param0.field_n;
        ((rm) this).field_x = param0.field_x;
        ((rm) this).field_N = param0.field_N;
        ((rm) this).field_z = param0.field_z;
        ((rm) this).field_K = param0.field_K;
        ((rm) this).field_C = param0.field_C;
        ((rm) this).field_v = param0.field_v;
        ((rm) this).field_L = param0.field_L;
        ((rm) this).field_Q = param0.field_Q;
        ((rm) this).field_t = param0.field_t;
        ((rm) this).field_i = param0.field_i;
        ((rm) this).field_p = param0.field_p;
        ((rm) this).field_w = param0.field_w;
        ((rm) this).field_R = param0.field_R;
        ((rm) this).field_l = param0.field_l;
        ((rm) this).field_J = param0.field_J;
        ((rm) this).field_h = param0.field_h;
    }
}
