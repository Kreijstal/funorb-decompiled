/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends um {
    private short[] field_W;
    byte[] field_F;
    int field_K;
    private static int[] field_O;
    short[] field_n;
    short field_D;
    byte[] field_o;
    short field_S;
    int[] field_g;
    int field_M;
    int[] field_X;
    ef[] field_J;
    byte[] field_k;
    short[] field_E;
    int[] field_N;
    byte[] field_j;
    int[] field_v;
    int field_B;
    ah[] field_Z;
    private int[][] field_U;
    private int[] field_ab;
    byte[] field_i;
    private static int field_G;
    ah[] field_m;
    short[] field_H;
    byte[] field_R;
    private static int[] field_I;
    int[] field_Y;
    byte[] field_f;
    private short[] field_u;
    byte[] field_P;
    private boolean field_r;
    short[] field_p;
    private int[][] field_s;
    int field_l;
    byte[] field_z;
    short[] field_C;
    short field_x;
    byte field_t;
    byte[] field_Q;
    short[] field_T;
    short[] field_h;
    short[] field_L;
    short field_V;
    short field_y;
    private int[] field_A;
    int[] field_q;
    short field_w;

    final int a(int param0, int param1, int param2, byte param3, short param4, byte param5) {
        ((eg) this).field_N[((eg) this).field_K] = param0;
        ((eg) this).field_v[((eg) this).field_K] = param1;
        ((eg) this).field_X[((eg) this).field_K] = param2;
        ((eg) this).field_Q[((eg) this).field_K] = (byte)param3;
        ((eg) this).field_k[((eg) this).field_K] = (byte)-1;
        ((eg) this).field_n[((eg) this).field_K] = (short)param4;
        ((eg) this).field_L[((eg) this).field_K] = (short)-1;
        ((eg) this).field_f[((eg) this).field_K] = (byte)param5;
        int fieldTemp$0 = ((eg) this).field_K;
        ((eg) this).field_K = ((eg) this).field_K + 1;
        return fieldTemp$0;
    }

    final void a(um param0, int param1, int param2, int param3, boolean param4) {
        eg var6 = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        ah var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ah var16 = null;
        ah var17 = null;
        ah var18 = null;
        int[] var22 = null;
        var6 = (eg) (Object) param0;
        var6.e();
        var6.d();
        field_G = field_G + 1;
        var7 = 0;
        var22 = var6.field_g;
        var9 = var6.field_M;
        var10 = 0;
        L0: while (true) {
          if (var10 >= ((eg) this).field_M) {
            L1: {
              if (var7 < 3) {
                break L1;
              } else {
                if (param4) {
                  var10 = 0;
                  L2: while (true) {
                    if (var10 >= ((eg) this).field_K) {
                      var10 = 0;
                      L3: while (true) {
                        if (var10 >= var6.field_K) {
                          return;
                        } else {
                          if (field_O[var6.field_N[var10]] == field_G) {
                            if (field_O[var6.field_v[var10]] == field_G) {
                              if (field_O[var6.field_X[var10]] == field_G) {
                                L4: {
                                  if (var6.field_Q != null) {
                                    break L4;
                                  } else {
                                    var6.field_Q = new byte[var6.field_K];
                                    break L4;
                                  }
                                }
                                var6.field_Q[var10] = (byte)2;
                                var10++;
                                continue L3;
                              } else {
                                var10++;
                                continue L3;
                              }
                            } else {
                              var10++;
                              continue L3;
                            }
                          } else {
                            var10++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      if (field_I[((eg) this).field_N[var10]] == field_G) {
                        if (field_I[((eg) this).field_v[var10]] == field_G) {
                          if (field_I[((eg) this).field_X[var10]] == field_G) {
                            L5: {
                              if (((eg) this).field_Q != null) {
                                break L5;
                              } else {
                                ((eg) this).field_Q = new byte[((eg) this).field_K];
                                break L5;
                              }
                            }
                            ((eg) this).field_Q[var10] = (byte)2;
                            var10++;
                            continue L2;
                          } else {
                            var10++;
                            continue L2;
                          }
                        } else {
                          var10++;
                          continue L2;
                        }
                      } else {
                        var10++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          } else {
            var11 = ((eg) this).field_Z[var10];
            var16 = var11;
            var16 = var11;
            if (var11.field_a != 0) {
              var12 = ((eg) this).field_Y[var10] - param2;
              if (var12 >= var6.field_y) {
                if (var12 <= var6.field_S) {
                  var13 = ((eg) this).field_g[var10] - param1;
                  if (var13 >= var6.field_D) {
                    if (var13 <= var6.field_w) {
                      var14 = ((eg) this).field_q[var10] - param3;
                      if (var14 >= var6.field_V) {
                        if (var14 <= var6.field_x) {
                          var15 = 0;
                          L6: while (true) {
                            if (var15 < var9) {
                              var16 = var6.field_Z[var15];
                              if (var13 == var22[var15]) {
                                if (var14 == var6.field_q[var15]) {
                                  if (var12 == var6.field_Y[var15]) {
                                    if (var16.field_a != 0) {
                                      L7: {
                                        if (((eg) this).field_m != null) {
                                          break L7;
                                        } else {
                                          ((eg) this).field_m = new ah[((eg) this).field_M];
                                          break L7;
                                        }
                                      }
                                      L8: {
                                        if (var6.field_m != null) {
                                          break L8;
                                        } else {
                                          var6.field_m = new ah[var9];
                                          break L8;
                                        }
                                      }
                                      L9: {
                                        var17 = ((eg) this).field_m[var10];
                                        if (var17 != null) {
                                          break L9;
                                        } else {
                                          ah dupTemp$2 = new ah(var11);
                                          ((eg) this).field_m[var10] = dupTemp$2;
                                          var17 = dupTemp$2;
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        var18 = var6.field_m[var15];
                                        if (var18 != null) {
                                          break L10;
                                        } else {
                                          ah dupTemp$3 = new ah(var16);
                                          var6.field_m[var15] = dupTemp$3;
                                          var18 = dupTemp$3;
                                          break L10;
                                        }
                                      }
                                      var17.field_f = var17.field_f + var16.field_f;
                                      var17.field_j = var17.field_j + var16.field_j;
                                      var17.field_d = var17.field_d + var16.field_d;
                                      var17.field_a = var17.field_a + var16.field_a;
                                      var18.field_f = var18.field_f + var11.field_f;
                                      var18.field_j = var18.field_j + var11.field_j;
                                      var18.field_d = var18.field_d + var11.field_d;
                                      var18.field_a = var18.field_a + var11.field_a;
                                      var7++;
                                      field_I[var10] = field_G;
                                      field_O[var15] = field_G;
                                      var15++;
                                      continue L6;
                                    } else {
                                      var15++;
                                      continue L6;
                                    }
                                  } else {
                                    var15++;
                                    continue L6;
                                  }
                                } else {
                                  var15++;
                                  continue L6;
                                }
                              } else {
                                var15++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              continue L0;
                            }
                          }
                        } else {
                          var10++;
                          continue L0;
                        }
                      } else {
                        var10++;
                        continue L0;
                      }
                    } else {
                      var10++;
                      continue L0;
                    }
                  } else {
                    var10++;
                    continue L0;
                  }
                } else {
                  var10++;
                  continue L0;
                }
              } else {
                var10++;
                continue L0;
              }
            } else {
              var10++;
              continue L0;
            }
          }
        }
    }

    final fa a(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        return ((eg) this).a(param0, param1, param2 * param5[3] + param3 * param5[4] + param4 * param5[5] >> 16, param2 * param5[6] + param3 * param5[7] + param4 * param5[8] >> 16, param2 * param5[9] + param3 * param5[10] + param4 * param5[11] >> 16);
    }

    final static eg a(di param0, String param1, String param2) {
        byte[] var3 = param0.a(false, param2, param1);
        if (var3 == null) {
            return null;
        }
        return new eg(var3);
    }

    final fa a(int param0, int param1, int param2, int param3, int param4) {
        return (fa) (Object) new nc((eg) this, param0, param1, param2, param3, param4);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = 0; var5 < ((eg) this).field_B; var5++) {
            ((eg) this).field_g[var5] = ((eg) this).field_g[var5] * param0 / param3;
            ((eg) this).field_Y[var5] = ((eg) this).field_Y[var5] * param1 / param3;
            ((eg) this).field_q[var5] = ((eg) this).field_q[var5] * param2 / param3;
        }
        ((eg) this).a();
    }

    final void a() {
        ((eg) this).field_Z = null;
        ((eg) this).field_m = null;
        ((eg) this).field_J = null;
        ((eg) this).field_r = false;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((eg) this).field_B) {
            ((eg) this).field_g[((eg) this).field_B] = param0;
            ((eg) this).field_Y[((eg) this).field_B] = param1;
            ((eg) this).field_q[((eg) this).field_B] = param2;
            int fieldTemp$1 = ((eg) this).field_B + 1;
            ((eg) this).field_B = ((eg) this).field_B + 1;
            ((eg) this).field_M = fieldTemp$1;
            return ((eg) this).field_B - 1;
          } else {
            if (((eg) this).field_g[var4] == param0) {
              if (((eg) this).field_Y[var4] == param1) {
                if (((eg) this).field_q[var4] == param2) {
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

    final void e() {
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
        if (!((eg) this).field_r) {
          ((eg) this).field_r = true;
          var1 = 32767;
          var2 = 32767;
          var3 = 32767;
          var4 = -32768;
          var5 = -32768;
          var6 = -32768;
          var7 = 0;
          L0: while (true) {
            if (var7 >= ((eg) this).field_M) {
              ((eg) this).field_D = (short)var1;
              ((eg) this).field_w = (short)var4;
              ((eg) this).field_y = (short)var2;
              ((eg) this).field_S = (short)var5;
              ((eg) this).field_V = (short)var3;
              ((eg) this).field_x = (short)var6;
              return;
            } else {
              L1: {
                var8 = ((eg) this).field_g[var7];
                var9 = ((eg) this).field_Y[var7];
                var10 = ((eg) this).field_q[var7];
                if (var8 >= var1) {
                  break L1;
                } else {
                  var1 = var8;
                  break L1;
                }
              }
              L2: {
                if (var8 <= var4) {
                  break L2;
                } else {
                  var4 = var8;
                  break L2;
                }
              }
              L3: {
                if (var9 >= var2) {
                  break L3;
                } else {
                  var2 = var9;
                  break L3;
                }
              }
              L4: {
                if (var9 <= var5) {
                  break L4;
                } else {
                  var5 = var9;
                  break L4;
                }
              }
              L5: {
                if (var10 >= var3) {
                  break L5;
                } else {
                  var3 = var10;
                  break L5;
                }
              }
              if (var10 > var6) {
                var6 = var10;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void c() {
        ((eg) this).field_A = null;
        ((eg) this).field_ab = null;
        ((eg) this).field_U = null;
        ((eg) this).field_s = null;
    }

    private final int a(eg param0, int param1, short param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param0.field_g[param1];
        var5 = param0.field_Y[param1];
        var6 = param0.field_q[param1];
        var7 = 0;
        L0: while (true) {
          if (var7 >= ((eg) this).field_B) {
            L1: {
              ((eg) this).field_g[((eg) this).field_B] = var4;
              ((eg) this).field_Y[((eg) this).field_B] = var5;
              ((eg) this).field_q[((eg) this).field_B] = var6;
              ((eg) this).field_u[((eg) this).field_B] = (short)param2;
              if (param0.field_A == null) {
                break L1;
              } else {
                ((eg) this).field_A[((eg) this).field_B] = param0.field_A[param1];
                break L1;
              }
            }
            int fieldTemp$1 = ((eg) this).field_B;
            ((eg) this).field_B = ((eg) this).field_B + 1;
            return fieldTemp$1;
          } else {
            if (var4 == ((eg) this).field_g[var7]) {
              if (var5 == ((eg) this).field_Y[var7]) {
                if (var6 == ((eg) this).field_q[var7]) {
                  ((eg) this).field_u[var7] = (short)(((eg) this).field_u[var7] | param2);
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

    final void a(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = 0; var2 < ((eg) this).field_B; var2++) {
            var3 = ((eg) this).field_g[var2];
            var4 = ((eg) this).field_Y[var2];
            var5 = ((eg) this).field_q[var2];
            ((eg) this).field_g[var2] = param0[0] + (var3 * param0[3] + var4 * param0[6] + var5 * param0[9] >> 16);
            ((eg) this).field_Y[var2] = param0[1] + (var3 * param0[4] + var4 * param0[7] + var5 * param0[10] >> 16);
            ((eg) this).field_q[var2] = param0[2] + (var3 * param0[5] + var4 * param0[8] + var5 * param0[11] >> 16);
        }
        ((eg) this).a();
    }

    public static void f() {
        field_I = null;
        field_O = null;
    }

    final void d() {
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
        ef var16 = null;
        ah var17 = null;
        ah var18 = null;
        ah var19 = null;
        if (((eg) this).field_Z == null) {
          ((eg) this).field_Z = new ah[((eg) this).field_M];
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((eg) this).field_M) {
              var1 = 0;
              L1: while (true) {
                if (var1 >= ((eg) this).field_K) {
                  return;
                } else {
                  var2 = ((eg) this).field_N[var1];
                  var3 = ((eg) this).field_v[var1];
                  var4 = ((eg) this).field_X[var1];
                  var5 = ((eg) this).field_g[var3] - ((eg) this).field_g[var2];
                  var6 = ((eg) this).field_Y[var3] - ((eg) this).field_Y[var2];
                  var7 = ((eg) this).field_q[var3] - ((eg) this).field_q[var2];
                  var8 = ((eg) this).field_g[var4] - ((eg) this).field_g[var2];
                  var9 = ((eg) this).field_Y[var4] - ((eg) this).field_Y[var2];
                  var10 = ((eg) this).field_q[var4] - ((eg) this).field_q[var2];
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
                                    if (((eg) this).field_Q != null) {
                                      var15 = ((eg) this).field_Q[var1];
                                      break L5;
                                    } else {
                                      var15 = 0;
                                      break L5;
                                    }
                                  }
                                  if (var15 != 0) {
                                    if (var15 == 1) {
                                      L6: {
                                        if (((eg) this).field_J != null) {
                                          break L6;
                                        } else {
                                          ((eg) this).field_J = new ef[((eg) this).field_K];
                                          break L6;
                                        }
                                      }
                                      ef dupTemp$1 = new ef();
                                      ((eg) this).field_J[var1] = dupTemp$1;
                                      var16 = dupTemp$1;
                                      var16.field_b = var11;
                                      var16.field_a = var12;
                                      var16.field_d = var13;
                                      var1++;
                                      continue L1;
                                    } else {
                                      var1++;
                                      continue L1;
                                    }
                                  } else {
                                    var17 = ((eg) this).field_Z[var2];
                                    var17.field_f = var17.field_f + var11;
                                    var17.field_j = var17.field_j + var12;
                                    var17.field_d = var17.field_d + var13;
                                    var17.field_a = var17.field_a + 1;
                                    var18 = ((eg) this).field_Z[var3];
                                    var18.field_f = var18.field_f + var11;
                                    var18.field_j = var18.field_j + var12;
                                    var18.field_d = var18.field_d + var13;
                                    var18.field_a = var18.field_a + 1;
                                    var19 = ((eg) this).field_Z[var4];
                                    var19.field_f = var19.field_f + var11;
                                    var19.field_j = var19.field_j + var12;
                                    var19.field_d = var19.field_d + var13;
                                    var19.field_a = var19.field_a + 1;
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
              ((eg) this).field_Z[var1] = new ah();
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void b(byte[] param0) {
        int var2 = 0;
        int var3 = 0;
        ge var4 = null;
        ge var5 = null;
        ge var6 = null;
        ge var7 = null;
        ge var8 = null;
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
          var4 = new ge(param0);
          var5 = new ge(param0);
          var6 = new ge(param0);
          var7 = new ge(param0);
          var8 = new ge(param0);
          var4.field_v = param0.length - 18;
          var9 = var4.d(-1034);
          var10 = var4.d(-1034);
          var11 = var4.g(-121);
          var12 = var4.g(-102);
          var13 = var4.g(-120);
          var14 = var4.g(-69);
          var15 = var4.g(-113);
          var16 = var4.g(-119);
          var17 = var4.d(-1034);
          var18 = var4.d(-1034);
          var19 = var4.d(-1034);
          var20 = var4.d(-1034);
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
          ((eg) this).field_B = var9;
          ((eg) this).field_K = var10;
          ((eg) this).field_l = var11;
          ((eg) this).field_g = new int[var9];
          ((eg) this).field_Y = new int[var9];
          ((eg) this).field_q = new int[var9];
          ((eg) this).field_N = new int[var10];
          ((eg) this).field_v = new int[var10];
          ((eg) this).field_X = new int[var10];
          if (var11 <= 0) {
            break L5;
          } else {
            ((eg) this).field_o = new byte[var11];
            ((eg) this).field_p = new short[var11];
            ((eg) this).field_H = new short[var11];
            ((eg) this).field_C = new short[var11];
            break L5;
          }
        }
        L6: {
          if (var16 != 1) {
            break L6;
          } else {
            ((eg) this).field_A = new int[var9];
            break L6;
          }
        }
        L7: {
          if (var12 != 1) {
            break L7;
          } else {
            ((eg) this).field_Q = new byte[var10];
            ((eg) this).field_k = new byte[var10];
            ((eg) this).field_L = new short[var10];
            break L7;
          }
        }
        L8: {
          if (var13 != 255) {
            ((eg) this).field_t = (byte)var13;
            break L8;
          } else {
            ((eg) this).field_P = new byte[var10];
            break L8;
          }
        }
        L9: {
          if (var14 != 1) {
            break L9;
          } else {
            ((eg) this).field_f = new byte[var10];
            break L9;
          }
        }
        L10: {
          if (var15 != 1) {
            break L10;
          } else {
            ((eg) this).field_ab = new int[var10];
            break L10;
          }
        }
        ((eg) this).field_n = new short[var10];
        var4.field_v = var22;
        var5.field_v = var32;
        var6.field_v = var33;
        var7.field_v = var34;
        var8.field_v = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        var38 = 0;
        L11: while (true) {
          if (var38 >= var9) {
            var4.field_v = var30;
            var5.field_v = var26;
            var6.field_v = var24;
            var7.field_v = var28;
            var8.field_v = var25;
            var38 = 0;
            L12: while (true) {
              if (var38 >= var10) {
                ((eg) this).field_M = -1;
                var4.field_v = var29;
                var5.field_v = var23;
                var38 = 0;
                var39 = 0;
                var40 = 0;
                var41 = 0;
                var42 = 0;
                L13: while (true) {
                  if (var42 >= var10) {
                    ((eg) this).field_M = ((eg) this).field_M + 1;
                    var4.field_v = var31;
                    var42 = 0;
                    L14: while (true) {
                      if (var42 >= var11) {
                        L15: {
                          if (((eg) this).field_k == null) {
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
                                  ((eg) this).field_k = null;
                                  break L15;
                                }
                              } else {
                                var44 = ((eg) this).field_k[var45] & 255;
                                if (var44 != 255) {
                                  L17: {
                                    if ((((eg) this).field_p[var44] & 65535) != ((eg) this).field_N[var45]) {
                                      break L17;
                                    } else {
                                      if ((((eg) this).field_H[var44] & 65535) != ((eg) this).field_v[var45]) {
                                        break L17;
                                      } else {
                                        if ((((eg) this).field_C[var44] & 65535) != ((eg) this).field_X[var45]) {
                                          break L17;
                                        } else {
                                          ((eg) this).field_k[var45] = (byte)-1;
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
                            ((eg) this).field_L = null;
                            break L18;
                          }
                        }
                        L19: {
                          if (var2 != 0) {
                            break L19;
                          } else {
                            ((eg) this).field_Q = null;
                            break L19;
                          }
                        }
                        return;
                      } else {
                        ((eg) this).field_o[var42] = (byte) 0;
                        ((eg) this).field_p[var42] = (short)var4.d(-1034);
                        ((eg) this).field_H[var42] = (short)var4.d(-1034);
                        ((eg) this).field_C[var42] = (short)var4.d(-1034);
                        var42++;
                        continue L14;
                      }
                    }
                  } else {
                    L20: {
                      var43 = var5.g(-110);
                      if (var43 != 1) {
                        break L20;
                      } else {
                        L21: {
                          var38 = var4.i(-33) + var41;
                          var41 = var38;
                          var39 = var4.i(-57) + var41;
                          var41 = var39;
                          var40 = var4.i(-91) + var41;
                          var41 = var40;
                          ((eg) this).field_N[var42] = var38;
                          ((eg) this).field_v[var42] = var39;
                          ((eg) this).field_X[var42] = var40;
                          if (var38 <= ((eg) this).field_M) {
                            break L21;
                          } else {
                            ((eg) this).field_M = var38;
                            break L21;
                          }
                        }
                        L22: {
                          if (var39 <= ((eg) this).field_M) {
                            break L22;
                          } else {
                            ((eg) this).field_M = var39;
                            break L22;
                          }
                        }
                        if (var40 <= ((eg) this).field_M) {
                          break L20;
                        } else {
                          ((eg) this).field_M = var40;
                          break L20;
                        }
                      }
                    }
                    L23: {
                      if (var43 != 2) {
                        break L23;
                      } else {
                        var39 = var40;
                        var40 = var4.i(-29) + var41;
                        var41 = var40;
                        ((eg) this).field_N[var42] = var38;
                        ((eg) this).field_v[var42] = var39;
                        ((eg) this).field_X[var42] = var40;
                        if (var40 <= ((eg) this).field_M) {
                          break L23;
                        } else {
                          ((eg) this).field_M = var40;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var43 != 3) {
                        break L24;
                      } else {
                        var38 = var40;
                        var40 = var4.i(-82) + var41;
                        var41 = var40;
                        ((eg) this).field_N[var42] = var38;
                        ((eg) this).field_v[var42] = var39;
                        ((eg) this).field_X[var42] = var40;
                        if (var40 <= ((eg) this).field_M) {
                          break L24;
                        } else {
                          ((eg) this).field_M = var40;
                          break L24;
                        }
                      }
                    }
                    if (var43 == 4) {
                      var44 = var38;
                      var38 = var39;
                      var39 = var44;
                      var40 = var4.i(-27) + var41;
                      var41 = var40;
                      ((eg) this).field_N[var42] = var38;
                      ((eg) this).field_v[var42] = var39;
                      ((eg) this).field_X[var42] = var40;
                      if (var40 > ((eg) this).field_M) {
                        ((eg) this).field_M = var40;
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
                  ((eg) this).field_n[var38] = (short)var4.d(-1034);
                  if (var12 != 1) {
                    break L25;
                  } else {
                    L26: {
                      var39 = var5.g(-108);
                      if ((var39 & 1) != 1) {
                        ((eg) this).field_Q[var38] = (byte) 0;
                        break L26;
                      } else {
                        ((eg) this).field_Q[var38] = (byte) 1;
                        var2 = 1;
                        break L26;
                      }
                    }
                    if ((var39 & 2) != 2) {
                      ((eg) this).field_k[var38] = (byte)-1;
                      ((eg) this).field_L[var38] = (short)-1;
                      break L25;
                    } else {
                      ((eg) this).field_k[var38] = (byte)(var39 >> 2);
                      ((eg) this).field_L[var38] = ((eg) this).field_n[var38];
                      ((eg) this).field_n[var38] = (short)127;
                      if (((eg) this).field_L[var38] == -1) {
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
                    ((eg) this).field_P[var38] = var6.e((byte) 105);
                    break L27;
                  }
                }
                L28: {
                  if (var14 != 1) {
                    break L28;
                  } else {
                    ((eg) this).field_f[var38] = var7.e((byte) 105);
                    break L28;
                  }
                }
                if (var15 == 1) {
                  ((eg) this).field_ab[var38] = var8.g(-80);
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
              var39 = var4.g(-109);
              var40 = 0;
              if ((var39 & 1) == 0) {
                break L29;
              } else {
                var40 = var5.i(-78);
                break L29;
              }
            }
            L30: {
              var41 = 0;
              if ((var39 & 2) == 0) {
                break L30;
              } else {
                var41 = var6.i(-73);
                break L30;
              }
            }
            L31: {
              var42 = 0;
              if ((var39 & 4) == 0) {
                break L31;
              } else {
                var42 = var7.i(-123);
                break L31;
              }
            }
            ((eg) this).field_g[var38] = var35 + var40;
            ((eg) this).field_Y[var38] = var36 + var41;
            ((eg) this).field_q[var38] = var37 + var42;
            var35 = ((eg) this).field_g[var38];
            var36 = ((eg) this).field_Y[var38];
            var37 = ((eg) this).field_q[var38];
            if (var16 == 1) {
              ((eg) this).field_A[var38] = var8.g(-105);
              var38++;
              continue L11;
            } else {
              var38++;
              continue L11;
            }
          }
        }
    }

    final void b() {
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
          if (((eg) this).field_A == null) {
            break L0;
          } else {
            var9 = new int[256];
            var7 = var9;
            var5 = var7;
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((eg) this).field_B) {
                ((eg) this).field_U = new int[var2 + 1][];
                var3 = 0;
                L2: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ((eg) this).field_B) {
                        ((eg) this).field_A = null;
                        break L0;
                      } else {
                        var4 = ((eg) this).field_A[var3];
                        var5[var4] = var5[var4] + 1;
                        ((eg) this).field_U[var4][var5[var4]] = var3;
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    ((eg) this).field_U[var3] = new int[var9[var3]];
                    var9[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = ((eg) this).field_A[var3];
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
          if (((eg) this).field_ab == null) {
            break L4;
          } else {
            var10 = new int[256];
            var8 = var10;
            var6 = var8;
            var2 = 0;
            var3 = 0;
            L5: while (true) {
              if (var3 >= ((eg) this).field_K) {
                ((eg) this).field_s = new int[var2 + 1][];
                var3 = 0;
                L6: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= ((eg) this).field_K) {
                        ((eg) this).field_ab = null;
                        break L4;
                      } else {
                        var4 = ((eg) this).field_ab[var3];
                        var6[var4] = var6[var4] + 1;
                        ((eg) this).field_s[var4][var6[var4]] = var3;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    ((eg) this).field_s[var3] = new int[var10[var3]];
                    var10[var3] = 0;
                    var3++;
                    continue L6;
                  }
                }
              } else {
                var4 = ((eg) this).field_ab[var3];
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

    private final void a(byte[] param0) {
        ge var2 = null;
        ge var3 = null;
        ge var4 = null;
        ge var5 = null;
        ge var6 = null;
        ge var7 = null;
        ge var8 = null;
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
          var2 = new ge(param0);
          var3 = new ge(param0);
          var4 = new ge(param0);
          var5 = new ge(param0);
          var6 = new ge(param0);
          var7 = new ge(param0);
          var8 = new ge(param0);
          var2.field_v = param0.length - 23;
          var9 = var2.d(-1034);
          var10 = var2.d(-1034);
          var11 = var2.g(-110);
          var12 = var2.g(-87);
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
          var15 = var2.g(-96);
          var16 = var2.g(-82);
          var17 = var2.g(-75);
          var18 = var2.g(-118);
          var19 = var2.g(-83);
          var20 = var2.d(-1034);
          var21 = var2.d(-1034);
          var22 = var2.d(-1034);
          var23 = var2.d(-1034);
          var24 = var2.d(-1034);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (var11 <= 0) {
            break L2;
          } else {
            ((eg) this).field_o = new byte[var11];
            var2.field_v = 0;
            var28 = 0;
            L3: while (true) {
              if (var28 >= var11) {
                break L2;
              } else {
                L4: {
                  byte dupTemp$1 = var2.e((byte) 105);
                  ((eg) this).field_o[var28] = dupTemp$1;
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
          ((eg) this).field_B = var9;
          ((eg) this).field_K = var10;
          ((eg) this).field_l = var11;
          ((eg) this).field_g = new int[var9];
          ((eg) this).field_Y = new int[var9];
          ((eg) this).field_q = new int[var9];
          ((eg) this).field_N = new int[var10];
          ((eg) this).field_v = new int[var10];
          ((eg) this).field_X = new int[var10];
          if (var19 != 1) {
            break L12;
          } else {
            ((eg) this).field_A = new int[var9];
            break L12;
          }
        }
        L13: {
          if (var13 == 0) {
            break L13;
          } else {
            ((eg) this).field_Q = new byte[var10];
            break L13;
          }
        }
        L14: {
          if (var15 != 255) {
            ((eg) this).field_t = (byte)var15;
            break L14;
          } else {
            ((eg) this).field_P = new byte[var10];
            break L14;
          }
        }
        L15: {
          if (var16 != 1) {
            break L15;
          } else {
            ((eg) this).field_f = new byte[var10];
            break L15;
          }
        }
        L16: {
          if (var17 != 1) {
            break L16;
          } else {
            ((eg) this).field_ab = new int[var10];
            break L16;
          }
        }
        L17: {
          if (var18 != 1) {
            break L17;
          } else {
            ((eg) this).field_L = new short[var10];
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
              ((eg) this).field_k = new byte[var10];
              break L18;
            }
          }
        }
        L19: {
          ((eg) this).field_n = new short[var10];
          if (var11 <= 0) {
            break L19;
          } else {
            L20: {
              ((eg) this).field_p = new short[var11];
              ((eg) this).field_H = new short[var11];
              ((eg) this).field_C = new short[var11];
              if (var26 <= 0) {
                break L20;
              } else {
                ((eg) this).field_T = new short[var26];
                ((eg) this).field_E = new short[var26];
                ((eg) this).field_h = new short[var26];
                ((eg) this).field_z = new byte[var26];
                ((eg) this).field_F = new byte[var26];
                ((eg) this).field_R = new byte[var26];
                break L20;
              }
            }
            if (var27 <= 0) {
              break L19;
            } else {
              ((eg) this).field_j = new byte[var27];
              ((eg) this).field_i = new byte[var27];
              break L19;
            }
          }
        }
        var2.field_v = var29;
        var3.field_v = var40;
        var4.field_v = var41;
        var5.field_v = var42;
        var6.field_v = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        L21: while (true) {
          if (var53 >= var9) {
            var2.field_v = var39;
            var3.field_v = var30;
            var4.field_v = var32;
            var5.field_v = var35;
            var6.field_v = var33;
            var7.field_v = var37;
            var8.field_v = var38;
            var53 = 0;
            L22: while (true) {
              if (var53 >= var10) {
                ((eg) this).field_M = -1;
                var2.field_v = var36;
                var3.field_v = var31;
                var53 = 0;
                var54 = 0;
                var55 = 0;
                var56 = 0;
                var57 = 0;
                L23: while (true) {
                  if (var57 >= var10) {
                    ((eg) this).field_M = ((eg) this).field_M + 1;
                    var2.field_v = var43;
                    var3.field_v = var44;
                    var4.field_v = var45;
                    var5.field_v = var46;
                    var6.field_v = var47;
                    var7.field_v = var48;
                    var57 = 0;
                    L24: while (true) {
                      if (var57 >= var11) {
                        L25: {
                          if (var14 == 0) {
                            break L25;
                          } else {
                            L26: {
                              var2.field_v = var49;
                              var57 = var2.g(-70);
                              if (var57 <= 0) {
                                break L26;
                              } else {
                                var2.field_v = var2.field_v + 4 * var57;
                                break L26;
                              }
                            }
                            var58 = var2.g(-106);
                            if (var58 <= 0) {
                              break L25;
                            } else {
                              var2.field_v = var2.field_v + 4 * var58;
                              break L25;
                            }
                          }
                        }
                        return;
                      } else {
                        L27: {
                          var58 = ((eg) this).field_o[var57] & 255;
                          if (var58 != 0) {
                            break L27;
                          } else {
                            ((eg) this).field_p[var57] = (short)var2.d(-1034);
                            ((eg) this).field_H[var57] = (short)var2.d(-1034);
                            ((eg) this).field_C[var57] = (short)var2.d(-1034);
                            break L27;
                          }
                        }
                        L28: {
                          if (var58 != 1) {
                            break L28;
                          } else {
                            ((eg) this).field_p[var57] = (short)var3.d(-1034);
                            ((eg) this).field_H[var57] = (short)var3.d(-1034);
                            ((eg) this).field_C[var57] = (short)var3.d(-1034);
                            ((eg) this).field_T[var57] = (short)var4.d(-1034);
                            ((eg) this).field_E[var57] = (short)var4.d(-1034);
                            ((eg) this).field_h[var57] = (short)var4.d(-1034);
                            ((eg) this).field_z[var57] = var5.e((byte) 105);
                            ((eg) this).field_F[var57] = var6.e((byte) 105);
                            ((eg) this).field_R[var57] = var7.e((byte) 105);
                            break L28;
                          }
                        }
                        L29: {
                          if (var58 != 2) {
                            break L29;
                          } else {
                            ((eg) this).field_p[var57] = (short)var3.d(-1034);
                            ((eg) this).field_H[var57] = (short)var3.d(-1034);
                            ((eg) this).field_C[var57] = (short)var3.d(-1034);
                            ((eg) this).field_T[var57] = (short)var4.d(-1034);
                            ((eg) this).field_E[var57] = (short)var4.d(-1034);
                            ((eg) this).field_h[var57] = (short)var4.d(-1034);
                            ((eg) this).field_z[var57] = var5.e((byte) 105);
                            ((eg) this).field_F[var57] = var6.e((byte) 105);
                            ((eg) this).field_R[var57] = var7.e((byte) 105);
                            ((eg) this).field_j[var57] = var7.e((byte) 105);
                            ((eg) this).field_i[var57] = var7.e((byte) 105);
                            break L29;
                          }
                        }
                        if (var58 == 3) {
                          ((eg) this).field_p[var57] = (short)var3.d(-1034);
                          ((eg) this).field_H[var57] = (short)var3.d(-1034);
                          ((eg) this).field_C[var57] = (short)var3.d(-1034);
                          ((eg) this).field_T[var57] = (short)var4.d(-1034);
                          ((eg) this).field_E[var57] = (short)var4.d(-1034);
                          ((eg) this).field_h[var57] = (short)var4.d(-1034);
                          ((eg) this).field_z[var57] = var5.e((byte) 105);
                          ((eg) this).field_F[var57] = var6.e((byte) 105);
                          ((eg) this).field_R[var57] = var7.e((byte) 105);
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
                      var58 = var3.g(-79);
                      if (var58 != 1) {
                        break L30;
                      } else {
                        L31: {
                          var53 = var2.i(-126) + var56;
                          var56 = var53;
                          var54 = var2.i(-118) + var56;
                          var56 = var54;
                          var55 = var2.i(-7) + var56;
                          var56 = var55;
                          ((eg) this).field_N[var57] = var53;
                          ((eg) this).field_v[var57] = var54;
                          ((eg) this).field_X[var57] = var55;
                          if (var53 <= ((eg) this).field_M) {
                            break L31;
                          } else {
                            ((eg) this).field_M = var53;
                            break L31;
                          }
                        }
                        L32: {
                          if (var54 <= ((eg) this).field_M) {
                            break L32;
                          } else {
                            ((eg) this).field_M = var54;
                            break L32;
                          }
                        }
                        if (var55 <= ((eg) this).field_M) {
                          break L30;
                        } else {
                          ((eg) this).field_M = var55;
                          break L30;
                        }
                      }
                    }
                    L33: {
                      if (var58 != 2) {
                        break L33;
                      } else {
                        var54 = var55;
                        var55 = var2.i(-47) + var56;
                        var56 = var55;
                        ((eg) this).field_N[var57] = var53;
                        ((eg) this).field_v[var57] = var54;
                        ((eg) this).field_X[var57] = var55;
                        if (var55 <= ((eg) this).field_M) {
                          break L33;
                        } else {
                          ((eg) this).field_M = var55;
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (var58 != 3) {
                        break L34;
                      } else {
                        var53 = var55;
                        var55 = var2.i(-111) + var56;
                        var56 = var55;
                        ((eg) this).field_N[var57] = var53;
                        ((eg) this).field_v[var57] = var54;
                        ((eg) this).field_X[var57] = var55;
                        if (var55 <= ((eg) this).field_M) {
                          break L34;
                        } else {
                          ((eg) this).field_M = var55;
                          break L34;
                        }
                      }
                    }
                    if (var58 == 4) {
                      var59 = var53;
                      var53 = var54;
                      var54 = var59;
                      var55 = var2.i(-37) + var56;
                      var56 = var55;
                      ((eg) this).field_N[var57] = var53;
                      ((eg) this).field_v[var57] = var54;
                      ((eg) this).field_X[var57] = var55;
                      if (var55 > ((eg) this).field_M) {
                        ((eg) this).field_M = var55;
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
                  ((eg) this).field_n[var53] = (short)var2.d(-1034);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    ((eg) this).field_Q[var53] = var3.e((byte) 105);
                    break L35;
                  }
                }
                L36: {
                  if (var15 != 255) {
                    break L36;
                  } else {
                    ((eg) this).field_P[var53] = var4.e((byte) 105);
                    break L36;
                  }
                }
                L37: {
                  if (var16 != 1) {
                    break L37;
                  } else {
                    ((eg) this).field_f[var53] = var5.e((byte) 105);
                    break L37;
                  }
                }
                L38: {
                  if (var17 != 1) {
                    break L38;
                  } else {
                    ((eg) this).field_ab[var53] = var6.g(-115);
                    break L38;
                  }
                }
                L39: {
                  if (var18 != 1) {
                    break L39;
                  } else {
                    ((eg) this).field_L[var53] = (short)(var7.d(-1034) - 1);
                    break L39;
                  }
                }
                if (((eg) this).field_k != null) {
                  if (((eg) this).field_L[var53] == -1) {
                    ((eg) this).field_k[var53] = (byte)-1;
                    var53++;
                    continue L22;
                  } else {
                    ((eg) this).field_k[var53] = (byte)(var8.g(-86) - 1);
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
              var54 = var2.g(-84);
              var55 = 0;
              if ((var54 & 1) == 0) {
                break L40;
              } else {
                var55 = var3.i(-4);
                break L40;
              }
            }
            L41: {
              var56 = 0;
              if ((var54 & 2) == 0) {
                break L41;
              } else {
                var56 = var4.i(-28);
                break L41;
              }
            }
            L42: {
              var57 = 0;
              if ((var54 & 4) == 0) {
                break L42;
              } else {
                var57 = var5.i(-88);
                break L42;
              }
            }
            ((eg) this).field_g[var53] = var50 + var55;
            ((eg) this).field_Y[var53] = var51 + var56;
            ((eg) this).field_q[var53] = var52 + var57;
            var50 = ((eg) this).field_g[var53];
            var51 = ((eg) this).field_Y[var53];
            var52 = ((eg) this).field_q[var53];
            if (var19 == 1) {
              ((eg) this).field_A[var53] = var6.g(-107);
              var53++;
              continue L21;
            } else {
              var53++;
              continue L21;
            }
          }
        }
    }

    final byte a(short param0, short param1, short param2) {
        if (((eg) this).field_l >= 255) {
            throw new IllegalStateException();
        }
        ((eg) this).field_o[((eg) this).field_l] = (byte) 0;
        ((eg) this).field_p[((eg) this).field_l] = (short)param0;
        ((eg) this).field_H[((eg) this).field_l] = (short)param1;
        ((eg) this).field_C[((eg) this).field_l] = (short)param2;
        int fieldTemp$0 = ((eg) this).field_l;
        ((eg) this).field_l = ((eg) this).field_l + 1;
        return (byte)fieldTemp$0;
    }

    private eg(byte[] param0) {
        L0: {
          L1: {
            ((eg) this).field_M = 0;
            ((eg) this).field_B = 0;
            ((eg) this).field_r = false;
            ((eg) this).field_t = (byte) 0;
            ((eg) this).field_K = 0;
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

    eg(int param0, int param1, int param2) {
        ((eg) this).field_M = 0;
        ((eg) this).field_B = 0;
        ((eg) this).field_r = false;
        ((eg) this).field_t = (byte) 0;
        ((eg) this).field_K = 0;
        ((eg) this).field_g = new int[param0];
        ((eg) this).field_Y = new int[param0];
        ((eg) this).field_q = new int[param0];
        ((eg) this).field_A = new int[param0];
        ((eg) this).field_N = new int[param1];
        ((eg) this).field_v = new int[param1];
        ((eg) this).field_X = new int[param1];
        ((eg) this).field_Q = new byte[param1];
        ((eg) this).field_P = new byte[param1];
        ((eg) this).field_f = new byte[param1];
        ((eg) this).field_n = new short[param1];
        ((eg) this).field_L = new short[param1];
        ((eg) this).field_k = new byte[param1];
        ((eg) this).field_ab = new int[param1];
        if (param2 > 0) {
            ((eg) this).field_o = new byte[param2];
            ((eg) this).field_p = new short[param2];
            ((eg) this).field_H = new short[param2];
            ((eg) this).field_C = new short[param2];
            ((eg) this).field_T = new short[param2];
            ((eg) this).field_E = new short[param2];
            ((eg) this).field_h = new short[param2];
            ((eg) this).field_z = new byte[param2];
            ((eg) this).field_F = new byte[param2];
            ((eg) this).field_R = new byte[param2];
            ((eg) this).field_j = new byte[param2];
            ((eg) this).field_i = new byte[param2];
        }
    }

    eg(eg[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        eg var10_ref_eg = null;
        int var10 = 0;
        eg var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        eg var15 = null;
        eg var16 = null;
        int var17 = 0;
        eg var18 = null;
        eg var19 = null;
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
        ((eg) this).field_M = 0;
        ((eg) this).field_B = 0;
        ((eg) this).field_r = false;
        ((eg) this).field_t = (byte) 0;
        ((eg) this).field_K = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        ((eg) this).field_B = 0;
        ((eg) this).field_K = 0;
        ((eg) this).field_l = 0;
        ((eg) this).field_t = (byte) -1;
        var9 = 0;
        L0: while (true) {
          if (var9 >= param1) {
            L1: {
              ((eg) this).field_g = new int[((eg) this).field_B];
              ((eg) this).field_Y = new int[((eg) this).field_B];
              ((eg) this).field_q = new int[((eg) this).field_B];
              ((eg) this).field_A = new int[((eg) this).field_B];
              ((eg) this).field_u = new short[((eg) this).field_B];
              ((eg) this).field_N = new int[((eg) this).field_K];
              ((eg) this).field_v = new int[((eg) this).field_K];
              ((eg) this).field_X = new int[((eg) this).field_K];
              if (var3 == 0) {
                break L1;
              } else {
                ((eg) this).field_Q = new byte[((eg) this).field_K];
                break L1;
              }
            }
            L2: {
              if (var4 == 0) {
                break L2;
              } else {
                ((eg) this).field_P = new byte[((eg) this).field_K];
                break L2;
              }
            }
            L3: {
              if (var5 == 0) {
                break L3;
              } else {
                ((eg) this).field_f = new byte[((eg) this).field_K];
                break L3;
              }
            }
            L4: {
              if (var6 == 0) {
                break L4;
              } else {
                ((eg) this).field_ab = new int[((eg) this).field_K];
                break L4;
              }
            }
            L5: {
              if (var7 == 0) {
                break L5;
              } else {
                ((eg) this).field_L = new short[((eg) this).field_K];
                break L5;
              }
            }
            L6: {
              if (var8 == 0) {
                break L6;
              } else {
                ((eg) this).field_k = new byte[((eg) this).field_K];
                break L6;
              }
            }
            L7: {
              ((eg) this).field_n = new short[((eg) this).field_K];
              ((eg) this).field_W = new short[((eg) this).field_K];
              if (((eg) this).field_l <= 0) {
                break L7;
              } else {
                ((eg) this).field_o = new byte[((eg) this).field_l];
                ((eg) this).field_p = new short[((eg) this).field_l];
                ((eg) this).field_H = new short[((eg) this).field_l];
                ((eg) this).field_C = new short[((eg) this).field_l];
                ((eg) this).field_T = new short[((eg) this).field_l];
                ((eg) this).field_E = new short[((eg) this).field_l];
                ((eg) this).field_h = new short[((eg) this).field_l];
                ((eg) this).field_z = new byte[((eg) this).field_l];
                ((eg) this).field_F = new byte[((eg) this).field_l];
                ((eg) this).field_R = new byte[((eg) this).field_l];
                ((eg) this).field_j = new byte[((eg) this).field_l];
                ((eg) this).field_i = new byte[((eg) this).field_l];
                break L7;
              }
            }
            ((eg) this).field_B = 0;
            ((eg) this).field_K = 0;
            ((eg) this).field_l = 0;
            var9 = 0;
            L8: while (true) {
              if (var9 >= param1) {
                var9 = 0;
                ((eg) this).field_M = ((eg) this).field_B;
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
                        if (var13 >= var19.field_K) {
                          var17 = 0;
                          var13 = var17;
                          L11: while (true) {
                            if (var17 < var19.field_l) {
                              L12: {
                                ((eg) this).field_o[((eg) this).field_l] = var16.field_o[var17];
                                var14 = var16.field_o[var17];
                                if (var14 != 0) {
                                  break L12;
                                } else {
                                  ((eg) this).field_p[((eg) this).field_l] = (short)this.a(var16, (int) var16.field_p[var17], (short) var12);
                                  ((eg) this).field_H[((eg) this).field_l] = (short)this.a(var16, (int) var16.field_H[var17], (short) var12);
                                  ((eg) this).field_C[((eg) this).field_l] = (short)this.a(var16, (int) var16.field_C[var17], (short) var12);
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
                                    ((eg) this).field_p[((eg) this).field_l] = var16.field_p[var17];
                                    ((eg) this).field_H[((eg) this).field_l] = var16.field_H[var17];
                                    ((eg) this).field_C[((eg) this).field_l] = var16.field_C[var17];
                                    ((eg) this).field_T[((eg) this).field_l] = var16.field_T[var17];
                                    ((eg) this).field_E[((eg) this).field_l] = var16.field_E[var17];
                                    ((eg) this).field_h[((eg) this).field_l] = var16.field_h[var17];
                                    ((eg) this).field_z[((eg) this).field_l] = var16.field_z[var17];
                                    ((eg) this).field_F[((eg) this).field_l] = var16.field_F[var17];
                                    ((eg) this).field_R[((eg) this).field_l] = var16.field_R[var17];
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                if (var14 != 2) {
                                  break L14;
                                } else {
                                  ((eg) this).field_j[((eg) this).field_l] = var16.field_j[var17];
                                  ((eg) this).field_i[((eg) this).field_l] = var16.field_i[var17];
                                  break L14;
                                }
                              }
                              ((eg) this).field_l = ((eg) this).field_l + 1;
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
                                stackOut_74_0 = ((eg) this).field_k;
                                stackOut_74_1 = incrementValue$1;
                                stackIn_77_0 = stackOut_74_0;
                                stackIn_77_1 = stackOut_74_1;
                                stackIn_75_0 = stackOut_74_0;
                                stackIn_75_1 = stackOut_74_1;
                                if (var19.field_k == null) {
                                  break L16;
                                } else {
                                  stackOut_75_0 = (byte[]) (Object) stackIn_75_0;
                                  stackOut_75_1 = stackIn_75_1;
                                  stackIn_77_0 = stackOut_75_0;
                                  stackIn_77_1 = stackOut_75_1;
                                  stackIn_76_0 = stackOut_75_0;
                                  stackIn_76_1 = stackOut_75_1;
                                  if (var16.field_k[var13] == -1) {
                                    break L16;
                                  } else {
                                    stackOut_76_0 = (byte[]) (Object) stackIn_76_0;
                                    stackOut_76_1 = stackIn_76_1;
                                    stackOut_76_2 = var16.field_k[var13] + ((eg) this).field_l;
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
                    if (var12 < var18.field_K) {
                      L18: {
                        if (var3 == 0) {
                          break L18;
                        } else {
                          if (var18.field_Q == null) {
                            break L18;
                          } else {
                            ((eg) this).field_Q[((eg) this).field_K] = var15.field_Q[var12];
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (var4 == 0) {
                          break L19;
                        } else {
                          if (var18.field_P == null) {
                            ((eg) this).field_P[((eg) this).field_K] = var15.field_t;
                            break L19;
                          } else {
                            ((eg) this).field_P[((eg) this).field_K] = var15.field_P[var12];
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (var5 == 0) {
                          break L20;
                        } else {
                          if (var18.field_f == null) {
                            break L20;
                          } else {
                            ((eg) this).field_f[((eg) this).field_K] = var15.field_f[var12];
                            break L20;
                          }
                        }
                      }
                      L21: {
                        if (var6 == 0) {
                          break L21;
                        } else {
                          if (var18.field_ab == null) {
                            break L21;
                          } else {
                            ((eg) this).field_ab[((eg) this).field_K] = var15.field_ab[var12];
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (var7 == 0) {
                          break L22;
                        } else {
                          if (var18.field_L == null) {
                            ((eg) this).field_L[((eg) this).field_K] = (short)-1;
                            break L22;
                          } else {
                            ((eg) this).field_L[((eg) this).field_K] = var15.field_L[var12];
                            break L22;
                          }
                        }
                      }
                      ((eg) this).field_n[((eg) this).field_K] = var15.field_n[var12];
                      ((eg) this).field_W[((eg) this).field_K] = (short)var10;
                      ((eg) this).field_N[((eg) this).field_K] = this.a(var15, var15.field_N[var12], (short) var10);
                      ((eg) this).field_v[((eg) this).field_K] = this.a(var15, var15.field_v[var12], (short) var10);
                      ((eg) this).field_X[((eg) this).field_K] = this.a(var15, var15.field_X[var12], (short) var10);
                      ((eg) this).field_K = ((eg) this).field_K + 1;
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
            var10_ref_eg = param0[var9];
            if (var10_ref_eg != null) {
              L23: {
                ((eg) this).field_B = ((eg) this).field_B + var10_ref_eg.field_B;
                ((eg) this).field_K = ((eg) this).field_K + var10_ref_eg.field_K;
                ((eg) this).field_l = ((eg) this).field_l + var10_ref_eg.field_l;
                if (var10_ref_eg.field_P == null) {
                  L24: {
                    if (((eg) this).field_t != -1) {
                      break L24;
                    } else {
                      ((eg) this).field_t = var10_ref_eg.field_t;
                      break L24;
                    }
                  }
                  if (((eg) this).field_t == var10_ref_eg.field_t) {
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
                if (var10_ref_eg.field_Q == null) {
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
                if (var10_ref_eg.field_f == null) {
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
                if (var10_ref_eg.field_ab == null) {
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
                if (var10_ref_eg.field_L == null) {
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
                if (var10_ref_eg.field_k == null) {
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

    eg(eg param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6 = 0;
        L0: {
          ((eg) this).field_M = 0;
          ((eg) this).field_B = 0;
          ((eg) this).field_r = false;
          ((eg) this).field_t = (byte) 0;
          ((eg) this).field_K = 0;
          ((eg) this).field_B = param0.field_B;
          ((eg) this).field_M = param0.field_M;
          ((eg) this).field_K = param0.field_K;
          ((eg) this).field_l = param0.field_l;
          if (!param1) {
            ((eg) this).field_g = new int[((eg) this).field_B];
            ((eg) this).field_Y = new int[((eg) this).field_B];
            ((eg) this).field_q = new int[((eg) this).field_B];
            var6 = 0;
            L1: while (true) {
              if (var6 >= ((eg) this).field_B) {
                break L0;
              } else {
                ((eg) this).field_g[var6] = param0.field_g[var6];
                ((eg) this).field_Y[var6] = param0.field_Y[var6];
                ((eg) this).field_q[var6] = param0.field_q[var6];
                var6++;
                continue L1;
              }
            }
          } else {
            ((eg) this).field_g = param0.field_g;
            ((eg) this).field_Y = param0.field_Y;
            ((eg) this).field_q = param0.field_q;
            break L0;
          }
        }
        L2: {
          if (!param2) {
            ((eg) this).field_n = new short[((eg) this).field_K];
            var6 = 0;
            L3: while (true) {
              if (var6 >= ((eg) this).field_K) {
                break L2;
              } else {
                ((eg) this).field_n[var6] = param0.field_n[var6];
                var6++;
                continue L3;
              }
            }
          } else {
            ((eg) this).field_n = param0.field_n;
            break L2;
          }
        }
        L4: {
          L5: {
            if (param3) {
              break L5;
            } else {
              if (param0.field_L != null) {
                ((eg) this).field_L = new short[((eg) this).field_K];
                var6 = 0;
                L6: while (true) {
                  if (var6 >= ((eg) this).field_K) {
                    break L4;
                  } else {
                    ((eg) this).field_L[var6] = param0.field_L[var6];
                    var6++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          ((eg) this).field_L = param0.field_L;
          break L4;
        }
        L7: {
          if (!param4) {
            ((eg) this).field_f = new byte[((eg) this).field_K];
            if (param0.field_f != null) {
              var6 = 0;
              L8: while (true) {
                if (var6 >= ((eg) this).field_K) {
                  break L7;
                } else {
                  ((eg) this).field_f[var6] = param0.field_f[var6];
                  var6++;
                  continue L8;
                }
              }
            } else {
              var6 = 0;
              L9: while (true) {
                if (var6 >= ((eg) this).field_K) {
                  break L7;
                } else {
                  ((eg) this).field_f[var6] = (byte) 0;
                  var6++;
                  continue L9;
                }
              }
            }
          } else {
            ((eg) this).field_f = param0.field_f;
            break L7;
          }
        }
        ((eg) this).field_N = param0.field_N;
        ((eg) this).field_v = param0.field_v;
        ((eg) this).field_X = param0.field_X;
        ((eg) this).field_Q = param0.field_Q;
        ((eg) this).field_P = param0.field_P;
        ((eg) this).field_k = param0.field_k;
        ((eg) this).field_t = param0.field_t;
        ((eg) this).field_o = param0.field_o;
        ((eg) this).field_p = param0.field_p;
        ((eg) this).field_H = param0.field_H;
        ((eg) this).field_C = param0.field_C;
        ((eg) this).field_T = param0.field_T;
        ((eg) this).field_E = param0.field_E;
        ((eg) this).field_h = param0.field_h;
        ((eg) this).field_z = param0.field_z;
        ((eg) this).field_F = param0.field_F;
        ((eg) this).field_R = param0.field_R;
        ((eg) this).field_j = param0.field_j;
        ((eg) this).field_i = param0.field_i;
        ((eg) this).field_A = param0.field_A;
        ((eg) this).field_ab = param0.field_ab;
        ((eg) this).field_U = param0.field_U;
        ((eg) this).field_s = param0.field_s;
        ((eg) this).field_Z = param0.field_Z;
        ((eg) this).field_J = param0.field_J;
        ((eg) this).field_m = param0.field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new int[10000];
        field_I = new int[10000];
        field_G = 0;
    }
}
