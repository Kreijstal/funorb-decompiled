/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends sb {
    int[] field_q;
    int[] field_e;
    byte[] field_J;
    short[] field_b;
    byte[] field_x;
    byte[] field_h;
    short[] field_K;
    short[] field_c;
    int[] field_i;
    private static int[] field_C;
    int[] field_D;
    byte field_A;
    int[] field_H;
    int[] field_p;
    int[][] field_n;
    int[][] field_w;
    byte[] field_o;
    private static int field_u;
    short[] field_N;
    int field_O;
    sg[] field_B;
    byte[] field_I;
    int field_L;
    int[] field_r;
    short[] field_m;
    int field_G;
    sg[] field_Q;
    byte[] field_g;
    int field_z;
    short[] field_F;
    int[] field_d;
    byte[] field_k;
    private static int field_l;
    private static int[] field_s;
    short[] field_P;
    byte[] field_a;
    byte[] field_E;
    byte[] field_y;
    short[] field_M;
    short[] field_f;
    private static int field_v;
    g[] field_j;
    short[] field_t;

    private final void a(int param0, int[] param1, int param2, int param3, int param4) {
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
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        var6 = param1.length;
        if (param0 != 0) {
          if (param0 != 1) {
            if (param0 != 2) {
              if (param0 != 3) {
                if (param0 != 5) {
                  if (param0 != 7) {
                    return;
                  } else {
                    L0: {
                      if (((lg) this).field_w == null) {
                        break L0;
                      } else {
                        var7 = 0;
                        L1: while (true) {
                          if (var7 >= var6) {
                            break L0;
                          } else {
                            var8 = param1[var7];
                            if (var8 < ((lg) this).field_w.length) {
                              var39 = ((lg) this).field_w[var8];
                              var10 = 0;
                              L2: while (true) {
                                if (var10 < var39.length) {
                                  L3: {
                                    var11 = var39[var10];
                                    var12 = ((lg) this).field_c[var11] & 65535;
                                    var13 = var12 >> 10 & 63;
                                    var14 = var12 >> 7 & 7;
                                    var15 = var12 & 127;
                                    var13 = var13 + param2 & 63;
                                    var14 = var14 + param3;
                                    if (var14 >= 0) {
                                      if (var14 <= 7) {
                                        break L3;
                                      } else {
                                        var14 = 7;
                                        break L3;
                                      }
                                    } else {
                                      var14 = 0;
                                      break L3;
                                    }
                                  }
                                  L4: {
                                    var15 = var15 + param4;
                                    if (var15 >= 0) {
                                      if (var15 <= 127) {
                                        break L4;
                                      } else {
                                        var15 = 127;
                                        break L4;
                                      }
                                    } else {
                                      var15 = 0;
                                      break L4;
                                    }
                                  }
                                  ((lg) this).field_c[var11] = (short)(var13 << 10 | var14 << 7 | var15);
                                  var10++;
                                  continue L2;
                                } else {
                                  var7++;
                                  continue L1;
                                }
                              }
                            } else {
                              var7++;
                              continue L1;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L5: {
                    if (((lg) this).field_w == null) {
                      break L5;
                    } else {
                      if (((lg) this).field_o == null) {
                        break L5;
                      } else {
                        var7 = 0;
                        L6: while (true) {
                          if (var7 >= var6) {
                            break L5;
                          } else {
                            var8 = param1[var7];
                            if (var8 < ((lg) this).field_w.length) {
                              var38 = ((lg) this).field_w[var8];
                              var10 = 0;
                              L7: while (true) {
                                if (var10 < var38.length) {
                                  L8: {
                                    var11 = var38[var10];
                                    var12 = (((lg) this).field_o[var11] & 255) + param2 * 8;
                                    if (var12 >= 0) {
                                      if (var12 <= 255) {
                                        break L8;
                                      } else {
                                        var12 = 255;
                                        break L8;
                                      }
                                    } else {
                                      var12 = 0;
                                      break L8;
                                    }
                                  }
                                  ((lg) this).field_o[var11] = (byte)var12;
                                  var10++;
                                  continue L7;
                                } else {
                                  var7++;
                                  continue L6;
                                }
                              }
                            } else {
                              var7++;
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                var7 = 0;
                L9: while (true) {
                  if (var7 >= var6) {
                    return;
                  } else {
                    var8 = param1[var7];
                    if (var8 < ((lg) this).field_n.length) {
                      var37 = ((lg) this).field_n[var8];
                      var10 = 0;
                      L10: while (true) {
                        if (var10 < var37.length) {
                          var11 = var37[var10];
                          ((lg) this).field_p[var11] = ((lg) this).field_p[var11] - field_v;
                          ((lg) this).field_D[var11] = ((lg) this).field_D[var11] - field_u;
                          ((lg) this).field_i[var11] = ((lg) this).field_i[var11] - field_l;
                          ((lg) this).field_p[var11] = ((lg) this).field_p[var11] * param2 / 128;
                          ((lg) this).field_D[var11] = ((lg) this).field_D[var11] * param3 / 128;
                          ((lg) this).field_i[var11] = ((lg) this).field_i[var11] * param4 / 128;
                          ((lg) this).field_p[var11] = ((lg) this).field_p[var11] + field_v;
                          ((lg) this).field_D[var11] = ((lg) this).field_D[var11] + field_u;
                          ((lg) this).field_i[var11] = ((lg) this).field_i[var11] + field_l;
                          var10++;
                          continue L10;
                        } else {
                          var7++;
                          continue L9;
                        }
                      }
                    } else {
                      var7++;
                      continue L9;
                    }
                  }
                }
              }
            } else {
              var7 = 0;
              L11: while (true) {
                if (var7 >= var6) {
                  return;
                } else {
                  var8 = param1[var7];
                  if (var8 < ((lg) this).field_n.length) {
                    var36 = ((lg) this).field_n[var8];
                    var10 = 0;
                    L12: while (true) {
                      if (var10 < var36.length) {
                        L13: {
                          var11 = var36[var10];
                          ((lg) this).field_p[var11] = ((lg) this).field_p[var11] - field_v;
                          ((lg) this).field_D[var11] = ((lg) this).field_D[var11] - field_u;
                          ((lg) this).field_i[var11] = ((lg) this).field_i[var11] - field_l;
                          if (param4 == 0) {
                            break L13;
                          } else {
                            var12 = field_C[param4];
                            var13 = field_s[param4];
                            var14 = ((lg) this).field_D[var11] * var12 + ((lg) this).field_p[var11] * var13 >> 16;
                            ((lg) this).field_D[var11] = ((lg) this).field_D[var11] * var13 - ((lg) this).field_p[var11] * var12 >> 16;
                            ((lg) this).field_p[var11] = var14;
                            break L13;
                          }
                        }
                        L14: {
                          if (param2 == 0) {
                            break L14;
                          } else {
                            var12 = field_C[param2];
                            var13 = field_s[param2];
                            var14 = ((lg) this).field_D[var11] * var13 - ((lg) this).field_i[var11] * var12 >> 16;
                            ((lg) this).field_i[var11] = ((lg) this).field_D[var11] * var12 + ((lg) this).field_i[var11] * var13 >> 16;
                            ((lg) this).field_D[var11] = var14;
                            break L14;
                          }
                        }
                        L15: {
                          if (param3 == 0) {
                            break L15;
                          } else {
                            var12 = field_C[param3];
                            var13 = field_s[param3];
                            var14 = ((lg) this).field_i[var11] * var12 + ((lg) this).field_p[var11] * var13 >> 16;
                            ((lg) this).field_i[var11] = ((lg) this).field_i[var11] * var13 - ((lg) this).field_p[var11] * var12 >> 16;
                            ((lg) this).field_p[var11] = var14;
                            break L15;
                          }
                        }
                        ((lg) this).field_p[var11] = ((lg) this).field_p[var11] + field_v;
                        ((lg) this).field_D[var11] = ((lg) this).field_D[var11] + field_u;
                        ((lg) this).field_i[var11] = ((lg) this).field_i[var11] + field_l;
                        var10++;
                        continue L12;
                      } else {
                        var7++;
                        continue L11;
                      }
                    }
                  } else {
                    var7++;
                    continue L11;
                  }
                }
              }
            }
          } else {
            var7 = 0;
            L16: while (true) {
              if (var7 >= var6) {
                return;
              } else {
                var8 = param1[var7];
                if (var8 < ((lg) this).field_n.length) {
                  var35 = ((lg) this).field_n[var8];
                  var10 = 0;
                  L17: while (true) {
                    if (var10 < var35.length) {
                      var11 = var35[var10];
                      ((lg) this).field_p[var11] = ((lg) this).field_p[var11] + param2;
                      ((lg) this).field_D[var11] = ((lg) this).field_D[var11] + param3;
                      ((lg) this).field_i[var11] = ((lg) this).field_i[var11] + param4;
                      var10++;
                      continue L17;
                    } else {
                      var7++;
                      continue L16;
                    }
                  }
                } else {
                  var7++;
                  continue L16;
                }
              }
            }
          }
        } else {
          var7 = 0;
          field_v = 0;
          field_u = 0;
          field_l = 0;
          var8 = 0;
          L18: while (true) {
            if (var8 >= var6) {
              L19: {
                if (var7 <= 0) {
                  field_v = param2;
                  field_u = param3;
                  field_l = param4;
                  break L19;
                } else {
                  field_v = field_v / var7 + param2;
                  field_u = field_u / var7 + param3;
                  field_l = field_l / var7 + param4;
                  break L19;
                }
              }
              return;
            } else {
              var9 = param1[var8];
              if (var9 < ((lg) this).field_n.length) {
                var34 = ((lg) this).field_n[var9];
                var11 = 0;
                L20: while (true) {
                  if (var11 < var34.length) {
                    var12 = var34[var11];
                    field_v = field_v + ((lg) this).field_p[var12];
                    field_u = field_u + ((lg) this).field_D[var12];
                    field_l = field_l + ((lg) this).field_i[var12];
                    var7++;
                    var11++;
                    continue L20;
                  } else {
                    var8++;
                    continue L18;
                  }
                }
              } else {
                var8++;
                continue L18;
              }
            }
          }
        }
    }

    final fc b(int param0, int param1, int param2, int param3, int param4) {
        return new fc((lg) this, param0, param1, param2, param3, param4);
    }

    final void b() {
        ((lg) this).field_B = null;
        ((lg) this).field_Q = null;
        ((lg) this).field_j = null;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        for (var4 = 0; var4 < ((lg) this).field_G; var4++) {
            ((lg) this).field_p[var4] = ((lg) this).field_p[var4] * param0 / 128;
            ((lg) this).field_D[var4] = ((lg) this).field_D[var4] * param1 / 128;
            ((lg) this).field_i[var4] = ((lg) this).field_i[var4] * param2 / 128;
        }
        ((lg) this).b();
    }

    final void a(lg param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6 = 0;
        L0: {
          ((lg) this).field_G = param0.field_G;
          ((lg) this).field_O = param0.field_O;
          ((lg) this).field_z = param0.field_z;
          ((lg) this).field_L = param0.field_L;
          if (!param1) {
            var6 = 0;
            L1: while (true) {
              if (var6 >= ((lg) this).field_G) {
                break L0;
              } else {
                ((lg) this).field_p[var6] = param0.field_p[var6];
                ((lg) this).field_D[var6] = param0.field_D[var6];
                ((lg) this).field_i[var6] = param0.field_i[var6];
                var6++;
                continue L1;
              }
            }
          } else {
            ((lg) this).field_p = param0.field_p;
            ((lg) this).field_D = param0.field_D;
            ((lg) this).field_i = param0.field_i;
            break L0;
          }
        }
        L2: {
          if (!param2) {
            qq.a(param0.field_c, 0, ((lg) this).field_c, 0, ((lg) this).field_z);
            break L2;
          } else {
            ((lg) this).field_c = param0.field_c;
            break L2;
          }
        }
        L3: {
          L4: {
            if (param3) {
              break L4;
            } else {
              if (param0.field_N != null) {
                var6 = 0;
                L5: while (true) {
                  if (var6 >= ((lg) this).field_z) {
                    break L3;
                  } else {
                    ((lg) this).field_N[var6] = param0.field_N[var6];
                    var6++;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          ((lg) this).field_N = param0.field_N;
          break L3;
        }
        L6: {
          if (!param4) {
            if (param0.field_o != null) {
              qq.a(param0.field_o, 0, ((lg) this).field_o, 0, ((lg) this).field_z);
              break L6;
            } else {
              var6 = 0;
              L7: while (true) {
                if (var6 >= ((lg) this).field_z) {
                  break L6;
                } else {
                  ((lg) this).field_o[var6] = (byte) 0;
                  var6++;
                  continue L7;
                }
              }
            }
          } else {
            ((lg) this).field_o = param0.field_o;
            break L6;
          }
        }
        ((lg) this).field_e = param0.field_e;
        ((lg) this).field_H = param0.field_H;
        ((lg) this).field_r = param0.field_r;
        ((lg) this).field_g = param0.field_g;
        ((lg) this).field_k = param0.field_k;
        ((lg) this).field_x = param0.field_x;
        ((lg) this).field_A = param0.field_A;
        ((lg) this).field_E = param0.field_E;
        ((lg) this).field_M = param0.field_M;
        ((lg) this).field_P = param0.field_P;
        ((lg) this).field_F = param0.field_F;
        ((lg) this).field_m = param0.field_m;
        ((lg) this).field_b = param0.field_b;
        ((lg) this).field_t = param0.field_t;
        ((lg) this).field_y = param0.field_y;
        ((lg) this).field_a = param0.field_a;
        ((lg) this).field_h = param0.field_h;
        ((lg) this).field_J = param0.field_J;
        ((lg) this).field_I = param0.field_I;
        ((lg) this).field_d = param0.field_d;
        ((lg) this).field_q = param0.field_q;
        ((lg) this).field_n = param0.field_n;
        ((lg) this).field_w = param0.field_w;
        ((lg) this).field_B = param0.field_B;
        ((lg) this).field_j = param0.field_j;
        ((lg) this).field_Q = param0.field_Q;
        ((lg) this).field_f = param0.field_f;
        ((lg) this).field_K = param0.field_K;
    }

    final void a(ei param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        ((lg) this).d();
        if (((lg) this).field_n == null) {
            return;
        }
        if (param1 == -1) {
            return;
        }
        ul var3 = param0.field_t[param1];
        mb var4 = var3.field_a;
        field_v = 0;
        field_u = 0;
        field_l = 0;
        for (var5 = 0; var5 < var3.field_l; var5++) {
            var6 = var3.field_f[var5];
            if (var3.field_e[var5] != -1) {
                this.a(0, var4.field_p[var3.field_e[var5]], 0, 0, 0);
            }
            this.a(var4.field_r[var6], var4.field_p[var6], (int) var3.field_d[var5], (int) var3.field_n[var5], (int) var3.field_k[var5]);
        }
        ((lg) this).b();
    }

    final static lg a(r param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, param2, 0);
        if (var3 == null) {
            return null;
        }
        return new lg(var3);
    }

    private final int a(lg param0, int param1, short param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param0.field_p[param1];
        var5 = param0.field_D[param1];
        var6 = param0.field_i[param1];
        var7 = 0;
        L0: while (true) {
          if (var7 >= ((lg) this).field_G) {
            L1: {
              ((lg) this).field_p[((lg) this).field_G] = var4;
              ((lg) this).field_D[((lg) this).field_G] = var5;
              ((lg) this).field_i[((lg) this).field_G] = var6;
              ((lg) this).field_f[((lg) this).field_G] = (short)param2;
              if (param0.field_d == null) {
                break L1;
              } else {
                ((lg) this).field_d[((lg) this).field_G] = param0.field_d[param1];
                break L1;
              }
            }
            ((lg) this).field_G = ((lg) this).field_G + 1;
            return ((lg) this).field_G;
          } else {
            if (var4 == ((lg) this).field_p[var7]) {
              if (var5 == ((lg) this).field_D[var7]) {
                if (var6 == ((lg) this).field_i[var7]) {
                  ((lg) this).field_f[var7] = (short)(((lg) this).field_f[var7] | param2);
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

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((lg) this).field_G) {
            ((lg) this).field_p[((lg) this).field_G] = param0;
            ((lg) this).field_D[((lg) this).field_G] = param1;
            ((lg) this).field_i[((lg) this).field_G] = param2;
            ((lg) this).field_G = ((lg) this).field_G + 1;
            ((lg) this).field_O = ((lg) this).field_G + 1;
            return ((lg) this).field_G - 1;
          } else {
            if (((lg) this).field_p[var4] == param0) {
              if (((lg) this).field_D[var4] == param1) {
                if (((lg) this).field_i[var4] == param2) {
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

    final bn a(int param0, int param1, int param2, int param3, int param4) {
        return (bn) (Object) new fc((lg) this, param0, param1, param2, param3, param4);
    }

    final byte a(short param0, short param1, short param2) {
        if (((lg) this).field_L >= 255) {
            throw new IllegalStateException();
        }
        ((lg) this).field_E[((lg) this).field_L] = (byte) 0;
        ((lg) this).field_M[((lg) this).field_L] = (short)param0;
        ((lg) this).field_P[((lg) this).field_L] = (short)param1;
        ((lg) this).field_F[((lg) this).field_L] = (short)param2;
        ((lg) this).field_L = ((lg) this).field_L + 1;
        return (byte)((lg) this).field_L;
    }

    final void c() {
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
        g var16 = null;
        sg var17 = null;
        sg var18 = null;
        sg var19 = null;
        if (((lg) this).field_B == null) {
          ((lg) this).field_B = new sg[((lg) this).field_O];
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((lg) this).field_O) {
              var1 = 0;
              L1: while (true) {
                if (var1 >= ((lg) this).field_z) {
                  return;
                } else {
                  var2 = ((lg) this).field_e[var1];
                  var3 = ((lg) this).field_H[var1];
                  var4 = ((lg) this).field_r[var1];
                  var5 = ((lg) this).field_p[var3] - ((lg) this).field_p[var2];
                  var6 = ((lg) this).field_D[var3] - ((lg) this).field_D[var2];
                  var7 = ((lg) this).field_i[var3] - ((lg) this).field_i[var2];
                  var8 = ((lg) this).field_p[var4] - ((lg) this).field_p[var2];
                  var9 = ((lg) this).field_D[var4] - ((lg) this).field_D[var2];
                  var10 = ((lg) this).field_i[var4] - ((lg) this).field_i[var2];
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
                                    if (((lg) this).field_g != null) {
                                      var15 = ((lg) this).field_g[var1];
                                      break L5;
                                    } else {
                                      var15 = 0;
                                      break L5;
                                    }
                                  }
                                  if (var15 != 0) {
                                    if (var15 == 1) {
                                      L6: {
                                        if (((lg) this).field_j != null) {
                                          break L6;
                                        } else {
                                          ((lg) this).field_j = new g[((lg) this).field_z];
                                          break L6;
                                        }
                                      }
                                      ((lg) this).field_j[var1] = new g();
                                      var16 = new g();
                                      var16.field_a = var11;
                                      var16.field_c = var12;
                                      var16.field_d = var13;
                                      var1++;
                                      continue L1;
                                    } else {
                                      var1++;
                                      continue L1;
                                    }
                                  } else {
                                    var17 = ((lg) this).field_B[var2];
                                    var17.field_b = var17.field_b + var11;
                                    var17.field_h = var17.field_h + var12;
                                    var17.field_f = var17.field_f + var13;
                                    var17.field_g = var17.field_g + 1;
                                    var18 = ((lg) this).field_B[var3];
                                    var18.field_b = var18.field_b + var11;
                                    var18.field_h = var18.field_h + var12;
                                    var18.field_f = var18.field_f + var13;
                                    var18.field_g = var18.field_g + 1;
                                    var19 = ((lg) this).field_B[var4];
                                    var19.field_b = var19.field_b + var11;
                                    var19.field_h = var19.field_h + var12;
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
              ((lg) this).field_B[var1] = new sg();
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void b(byte[] param0) {
        ed var2 = null;
        ed var3 = null;
        ed var4 = null;
        ed var5 = null;
        ed var6 = null;
        ed var7 = null;
        ed var8 = null;
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
          var2 = new ed(param0);
          var3 = new ed(param0);
          var4 = new ed(param0);
          var5 = new ed(param0);
          var6 = new ed(param0);
          var7 = new ed(param0);
          var8 = new ed(param0);
          var2.field_u = param0.length - 23;
          var9 = var2.a((byte) -11);
          var10 = var2.a((byte) -11);
          var11 = var2.h(-11);
          var12 = var2.h(-11);
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
          var15 = var2.h(-11);
          var16 = var2.h(-11);
          var17 = var2.h(-11);
          var18 = var2.h(-11);
          var19 = var2.h(-11);
          var20 = var2.a((byte) -11);
          var21 = var2.a((byte) -11);
          var22 = var2.a((byte) -11);
          var23 = var2.a((byte) -11);
          var24 = var2.a((byte) -11);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (var11 <= 0) {
            break L2;
          } else {
            ((lg) this).field_E = new byte[var11];
            var2.field_u = 0;
            var28 = 0;
            L3: while (true) {
              if (var28 >= var11) {
                break L2;
              } else {
                L4: {
                  ((lg) this).field_E[var28] = var2.g(85);
                  var29 = var2.g(85);
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
          ((lg) this).field_G = var9;
          ((lg) this).field_z = var10;
          ((lg) this).field_L = var11;
          ((lg) this).field_p = new int[var9];
          ((lg) this).field_D = new int[var9];
          ((lg) this).field_i = new int[var9];
          ((lg) this).field_e = new int[var10];
          ((lg) this).field_H = new int[var10];
          ((lg) this).field_r = new int[var10];
          if (var19 != 1) {
            break L12;
          } else {
            ((lg) this).field_d = new int[var9];
            break L12;
          }
        }
        L13: {
          if (var13 == 0) {
            break L13;
          } else {
            ((lg) this).field_g = new byte[var10];
            break L13;
          }
        }
        L14: {
          if (var15 != 255) {
            ((lg) this).field_A = (byte)var15;
            break L14;
          } else {
            ((lg) this).field_k = new byte[var10];
            break L14;
          }
        }
        L15: {
          if (var16 != 1) {
            break L15;
          } else {
            ((lg) this).field_o = new byte[var10];
            break L15;
          }
        }
        L16: {
          if (var17 != 1) {
            break L16;
          } else {
            ((lg) this).field_q = new int[var10];
            break L16;
          }
        }
        L17: {
          if (var18 != 1) {
            break L17;
          } else {
            ((lg) this).field_N = new short[var10];
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
              ((lg) this).field_x = new byte[var10];
              break L18;
            }
          }
        }
        L19: {
          ((lg) this).field_c = new short[var10];
          if (var11 <= 0) {
            break L19;
          } else {
            L20: {
              ((lg) this).field_M = new short[var11];
              ((lg) this).field_P = new short[var11];
              ((lg) this).field_F = new short[var11];
              if (var26 <= 0) {
                break L20;
              } else {
                ((lg) this).field_m = new short[var26];
                ((lg) this).field_b = new short[var26];
                ((lg) this).field_t = new short[var26];
                ((lg) this).field_y = new byte[var26];
                ((lg) this).field_a = new byte[var26];
                ((lg) this).field_h = new byte[var26];
                break L20;
              }
            }
            if (var27 <= 0) {
              break L19;
            } else {
              ((lg) this).field_J = new byte[var27];
              ((lg) this).field_I = new byte[var27];
              break L19;
            }
          }
        }
        var2.field_u = var29;
        var3.field_u = var40;
        var4.field_u = var41;
        var5.field_u = var42;
        var6.field_u = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        L21: while (true) {
          if (var53 >= var9) {
            var2.field_u = var39;
            var3.field_u = var30;
            var4.field_u = var32;
            var5.field_u = var35;
            var6.field_u = var33;
            var7.field_u = var37;
            var8.field_u = var38;
            var53 = 0;
            L22: while (true) {
              if (var53 >= var10) {
                ((lg) this).field_O = -1;
                var2.field_u = var36;
                var3.field_u = var31;
                var53 = 0;
                var54 = 0;
                var55 = 0;
                var56 = 0;
                var57 = 0;
                L23: while (true) {
                  if (var57 >= var10) {
                    ((lg) this).field_O = ((lg) this).field_O + 1;
                    var2.field_u = var43;
                    var3.field_u = var44;
                    var4.field_u = var45;
                    var5.field_u = var46;
                    var6.field_u = var47;
                    var7.field_u = var48;
                    var57 = 0;
                    L24: while (true) {
                      if (var57 >= var11) {
                        L25: {
                          if (var14 == 0) {
                            break L25;
                          } else {
                            L26: {
                              var2.field_u = var49;
                              var57 = var2.h(-11);
                              if (var57 <= 0) {
                                break L26;
                              } else {
                                var2.field_u = var2.field_u + 4 * var57;
                                break L26;
                              }
                            }
                            var58 = var2.h(-11);
                            if (var58 <= 0) {
                              break L25;
                            } else {
                              var2.field_u = var2.field_u + 4 * var58;
                              break L25;
                            }
                          }
                        }
                        return;
                      } else {
                        L27: {
                          var58 = ((lg) this).field_E[var57] & 255;
                          if (var58 != 0) {
                            break L27;
                          } else {
                            ((lg) this).field_M[var57] = (short)var2.a((byte) -11);
                            ((lg) this).field_P[var57] = (short)var2.a((byte) -11);
                            ((lg) this).field_F[var57] = (short)var2.a((byte) -11);
                            break L27;
                          }
                        }
                        L28: {
                          if (var58 != 1) {
                            break L28;
                          } else {
                            ((lg) this).field_M[var57] = (short)var3.a((byte) -11);
                            ((lg) this).field_P[var57] = (short)var3.a((byte) -11);
                            ((lg) this).field_F[var57] = (short)var3.a((byte) -11);
                            ((lg) this).field_m[var57] = (short)var4.a((byte) -11);
                            ((lg) this).field_b[var57] = (short)var4.a((byte) -11);
                            ((lg) this).field_t[var57] = (short)var4.a((byte) -11);
                            ((lg) this).field_y[var57] = var5.g(90);
                            ((lg) this).field_a[var57] = var6.g(105);
                            ((lg) this).field_h[var57] = var7.g(88);
                            break L28;
                          }
                        }
                        L29: {
                          if (var58 != 2) {
                            break L29;
                          } else {
                            ((lg) this).field_M[var57] = (short)var3.a((byte) -11);
                            ((lg) this).field_P[var57] = (short)var3.a((byte) -11);
                            ((lg) this).field_F[var57] = (short)var3.a((byte) -11);
                            ((lg) this).field_m[var57] = (short)var4.a((byte) -11);
                            ((lg) this).field_b[var57] = (short)var4.a((byte) -11);
                            ((lg) this).field_t[var57] = (short)var4.a((byte) -11);
                            ((lg) this).field_y[var57] = var5.g(120);
                            ((lg) this).field_a[var57] = var6.g(97);
                            ((lg) this).field_h[var57] = var7.g(94);
                            ((lg) this).field_J[var57] = var7.g(119);
                            ((lg) this).field_I[var57] = var7.g(110);
                            break L29;
                          }
                        }
                        if (var58 == 3) {
                          ((lg) this).field_M[var57] = (short)var3.a((byte) -11);
                          ((lg) this).field_P[var57] = (short)var3.a((byte) -11);
                          ((lg) this).field_F[var57] = (short)var3.a((byte) -11);
                          ((lg) this).field_m[var57] = (short)var4.a((byte) -11);
                          ((lg) this).field_b[var57] = (short)var4.a((byte) -11);
                          ((lg) this).field_t[var57] = (short)var4.a((byte) -11);
                          ((lg) this).field_y[var57] = var5.g(118);
                          ((lg) this).field_a[var57] = var6.g(119);
                          ((lg) this).field_h[var57] = var7.g(79);
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
                      var58 = var3.h(-11);
                      if (var58 != 1) {
                        break L30;
                      } else {
                        L31: {
                          var53 = var2.j(-3084) + var56;
                          var56 = var53;
                          var54 = var2.j(-3084) + var56;
                          var56 = var54;
                          var55 = var2.j(-3084) + var56;
                          var56 = var55;
                          ((lg) this).field_e[var57] = var53;
                          ((lg) this).field_H[var57] = var54;
                          ((lg) this).field_r[var57] = var55;
                          if (var53 <= ((lg) this).field_O) {
                            break L31;
                          } else {
                            ((lg) this).field_O = var53;
                            break L31;
                          }
                        }
                        L32: {
                          if (var54 <= ((lg) this).field_O) {
                            break L32;
                          } else {
                            ((lg) this).field_O = var54;
                            break L32;
                          }
                        }
                        if (var55 <= ((lg) this).field_O) {
                          break L30;
                        } else {
                          ((lg) this).field_O = var55;
                          break L30;
                        }
                      }
                    }
                    L33: {
                      if (var58 != 2) {
                        break L33;
                      } else {
                        var54 = var55;
                        var55 = var2.j(-3084) + var56;
                        var56 = var55;
                        ((lg) this).field_e[var57] = var53;
                        ((lg) this).field_H[var57] = var54;
                        ((lg) this).field_r[var57] = var55;
                        if (var55 <= ((lg) this).field_O) {
                          break L33;
                        } else {
                          ((lg) this).field_O = var55;
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if (var58 != 3) {
                        break L34;
                      } else {
                        var53 = var55;
                        var55 = var2.j(-3084) + var56;
                        var56 = var55;
                        ((lg) this).field_e[var57] = var53;
                        ((lg) this).field_H[var57] = var54;
                        ((lg) this).field_r[var57] = var55;
                        if (var55 <= ((lg) this).field_O) {
                          break L34;
                        } else {
                          ((lg) this).field_O = var55;
                          break L34;
                        }
                      }
                    }
                    if (var58 == 4) {
                      var59 = var53;
                      var53 = var54;
                      var54 = var59;
                      var55 = var2.j(-3084) + var56;
                      var56 = var55;
                      ((lg) this).field_e[var57] = var53;
                      ((lg) this).field_H[var57] = var54;
                      ((lg) this).field_r[var57] = var55;
                      if (var55 > ((lg) this).field_O) {
                        ((lg) this).field_O = var55;
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
                  ((lg) this).field_c[var53] = (short)var2.a((byte) -11);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    ((lg) this).field_g[var53] = var3.g(112);
                    break L35;
                  }
                }
                L36: {
                  if (var15 != 255) {
                    break L36;
                  } else {
                    ((lg) this).field_k[var53] = var4.g(113);
                    break L36;
                  }
                }
                L37: {
                  if (var16 != 1) {
                    break L37;
                  } else {
                    ((lg) this).field_o[var53] = var5.g(96);
                    break L37;
                  }
                }
                L38: {
                  if (var17 != 1) {
                    break L38;
                  } else {
                    ((lg) this).field_q[var53] = var6.h(-11);
                    break L38;
                  }
                }
                L39: {
                  if (var18 != 1) {
                    break L39;
                  } else {
                    ((lg) this).field_N[var53] = (short)(var7.a((byte) -11) - 1);
                    break L39;
                  }
                }
                if (((lg) this).field_x != null) {
                  if (((lg) this).field_N[var53] == -1) {
                    ((lg) this).field_x[var53] = (byte)-1;
                    var53++;
                    continue L22;
                  } else {
                    ((lg) this).field_x[var53] = (byte)(var8.h(-11) - 1);
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
              var54 = var2.h(-11);
              var55 = 0;
              if ((var54 & 1) == 0) {
                break L40;
              } else {
                var55 = var3.j(-3084);
                break L40;
              }
            }
            L41: {
              var56 = 0;
              if ((var54 & 2) == 0) {
                break L41;
              } else {
                var56 = var4.j(-3084);
                break L41;
              }
            }
            L42: {
              var57 = 0;
              if ((var54 & 4) == 0) {
                break L42;
              } else {
                var57 = var5.j(-3084);
                break L42;
              }
            }
            ((lg) this).field_p[var53] = var50 + var55;
            ((lg) this).field_D[var53] = var51 + var56;
            ((lg) this).field_i[var53] = var52 + var57;
            var50 = ((lg) this).field_p[var53];
            var51 = ((lg) this).field_D[var53];
            var52 = ((lg) this).field_i[var53];
            if (var19 == 1) {
              ((lg) this).field_d[var53] = var6.h(-11);
              var53++;
              continue L21;
            } else {
              var53++;
              continue L21;
            }
          }
        }
    }

    final int a(int param0, int param1, int param2, byte param3, byte param4, short param5, short param6) {
        ((lg) this).field_e[((lg) this).field_z] = param0;
        ((lg) this).field_H[((lg) this).field_z] = param1;
        ((lg) this).field_r[((lg) this).field_z] = param2;
        ((lg) this).field_g[((lg) this).field_z] = (byte)param3;
        ((lg) this).field_x[((lg) this).field_z] = (byte)param4;
        ((lg) this).field_c[((lg) this).field_z] = (short)param5;
        ((lg) this).field_N[((lg) this).field_z] = (short)param6;
        ((lg) this).field_z = ((lg) this).field_z + 1;
        return ((lg) this).field_z;
    }

    final void a(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        for (var2 = 0; var2 < ((lg) this).field_G; var2++) {
            var3 = ((lg) this).field_p[var2];
            var4 = ((lg) this).field_D[var2];
            var5 = ((lg) this).field_i[var2];
            ((lg) this).field_p[var2] = param0[0] + (var3 * param0[3] + var4 * param0[6] + var5 * param0[9] >> 16);
            ((lg) this).field_D[var2] = param0[1] + (var3 * param0[4] + var4 * param0[7] + var5 * param0[10] >> 16);
            ((lg) this).field_i[var2] = param0[2] + (var3 * param0[5] + var4 * param0[8] + var5 * param0[11] >> 16);
        }
        ((lg) this).b();
    }

    public static void a() {
        field_C = null;
        field_s = null;
    }

    final void d() {
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
          if (((lg) this).field_d == null) {
            break L0;
          } else {
            var9 = new int[256];
            var7 = var9;
            var5 = var7;
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((lg) this).field_G) {
                ((lg) this).field_n = new int[var2 + 1][];
                var3 = 0;
                L2: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ((lg) this).field_G) {
                        ((lg) this).field_d = null;
                        break L0;
                      } else {
                        var4 = ((lg) this).field_d[var3];
                        var5[var4] = var5[var4] + 1;
                        ((lg) this).field_n[var4][var5[var4]] = var3;
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    ((lg) this).field_n[var3] = new int[var9[var3]];
                    var9[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = ((lg) this).field_d[var3];
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
          if (((lg) this).field_q == null) {
            break L4;
          } else {
            var10 = new int[256];
            var8 = var10;
            var6 = var8;
            var2 = 0;
            var3 = 0;
            L5: while (true) {
              if (var3 >= ((lg) this).field_z) {
                ((lg) this).field_w = new int[var2 + 1][];
                var3 = 0;
                L6: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= ((lg) this).field_z) {
                        ((lg) this).field_q = null;
                        break L4;
                      } else {
                        var4 = ((lg) this).field_q[var3];
                        var6[var4] = var6[var4] + 1;
                        ((lg) this).field_w[var4][var6[var4]] = var3;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    ((lg) this).field_w[var3] = new int[var10[var3]];
                    var10[var3] = 0;
                    var3++;
                    continue L6;
                  }
                }
              } else {
                var4 = ((lg) this).field_q[var3];
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
        int var2 = 0;
        int var3 = 0;
        ed var4 = null;
        ed var5 = null;
        ed var6 = null;
        ed var7 = null;
        ed var8 = null;
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
          var4 = new ed(param0);
          var5 = new ed(param0);
          var6 = new ed(param0);
          var7 = new ed(param0);
          var8 = new ed(param0);
          var4.field_u = param0.length - 18;
          var9 = var4.a((byte) -11);
          var10 = var4.a((byte) -11);
          var11 = var4.h(-11);
          var12 = var4.h(-11);
          var13 = var4.h(-11);
          var14 = var4.h(-11);
          var15 = var4.h(-11);
          var16 = var4.h(-11);
          var17 = var4.a((byte) -11);
          var18 = var4.a((byte) -11);
          var19 = var4.a((byte) -11);
          var20 = var4.a((byte) -11);
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
          ((lg) this).field_G = var9;
          ((lg) this).field_z = var10;
          ((lg) this).field_L = var11;
          ((lg) this).field_p = new int[var9];
          ((lg) this).field_D = new int[var9];
          ((lg) this).field_i = new int[var9];
          ((lg) this).field_e = new int[var10];
          ((lg) this).field_H = new int[var10];
          ((lg) this).field_r = new int[var10];
          if (var11 <= 0) {
            break L5;
          } else {
            ((lg) this).field_E = new byte[var11];
            ((lg) this).field_M = new short[var11];
            ((lg) this).field_P = new short[var11];
            ((lg) this).field_F = new short[var11];
            break L5;
          }
        }
        L6: {
          if (var16 != 1) {
            break L6;
          } else {
            ((lg) this).field_d = new int[var9];
            break L6;
          }
        }
        L7: {
          if (var12 != 1) {
            break L7;
          } else {
            ((lg) this).field_g = new byte[var10];
            ((lg) this).field_x = new byte[var10];
            ((lg) this).field_N = new short[var10];
            break L7;
          }
        }
        L8: {
          if (var13 != 255) {
            ((lg) this).field_A = (byte)var13;
            break L8;
          } else {
            ((lg) this).field_k = new byte[var10];
            break L8;
          }
        }
        L9: {
          if (var14 != 1) {
            break L9;
          } else {
            ((lg) this).field_o = new byte[var10];
            break L9;
          }
        }
        L10: {
          if (var15 != 1) {
            break L10;
          } else {
            ((lg) this).field_q = new int[var10];
            break L10;
          }
        }
        ((lg) this).field_c = new short[var10];
        var4.field_u = var22;
        var5.field_u = var32;
        var6.field_u = var33;
        var7.field_u = var34;
        var8.field_u = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        var38 = 0;
        L11: while (true) {
          if (var38 >= var9) {
            var4.field_u = var30;
            var5.field_u = var26;
            var6.field_u = var24;
            var7.field_u = var28;
            var8.field_u = var25;
            var38 = 0;
            L12: while (true) {
              if (var38 >= var10) {
                ((lg) this).field_O = -1;
                var4.field_u = var29;
                var5.field_u = var23;
                var38 = 0;
                var39 = 0;
                var40 = 0;
                var41 = 0;
                var42 = 0;
                L13: while (true) {
                  if (var42 >= var10) {
                    ((lg) this).field_O = ((lg) this).field_O + 1;
                    var4.field_u = var31;
                    var42 = 0;
                    L14: while (true) {
                      if (var42 >= var11) {
                        L15: {
                          if (((lg) this).field_x == null) {
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
                                  ((lg) this).field_x = null;
                                  break L15;
                                }
                              } else {
                                var44 = ((lg) this).field_x[var45] & 255;
                                if (var44 != 255) {
                                  L17: {
                                    if ((((lg) this).field_M[var44] & 65535) != ((lg) this).field_e[var45]) {
                                      break L17;
                                    } else {
                                      if ((((lg) this).field_P[var44] & 65535) != ((lg) this).field_H[var45]) {
                                        break L17;
                                      } else {
                                        if ((((lg) this).field_F[var44] & 65535) != ((lg) this).field_r[var45]) {
                                          break L17;
                                        } else {
                                          ((lg) this).field_x[var45] = (byte)-1;
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
                            ((lg) this).field_N = null;
                            break L18;
                          }
                        }
                        L19: {
                          if (var2 != 0) {
                            break L19;
                          } else {
                            ((lg) this).field_g = null;
                            break L19;
                          }
                        }
                        return;
                      } else {
                        ((lg) this).field_E[var42] = (byte) 0;
                        ((lg) this).field_M[var42] = (short)var4.a((byte) -11);
                        ((lg) this).field_P[var42] = (short)var4.a((byte) -11);
                        ((lg) this).field_F[var42] = (short)var4.a((byte) -11);
                        var42++;
                        continue L14;
                      }
                    }
                  } else {
                    L20: {
                      var43 = var5.h(-11);
                      if (var43 != 1) {
                        break L20;
                      } else {
                        L21: {
                          var38 = var4.j(-3084) + var41;
                          var41 = var38;
                          var39 = var4.j(-3084) + var41;
                          var41 = var39;
                          var40 = var4.j(-3084) + var41;
                          var41 = var40;
                          ((lg) this).field_e[var42] = var38;
                          ((lg) this).field_H[var42] = var39;
                          ((lg) this).field_r[var42] = var40;
                          if (var38 <= ((lg) this).field_O) {
                            break L21;
                          } else {
                            ((lg) this).field_O = var38;
                            break L21;
                          }
                        }
                        L22: {
                          if (var39 <= ((lg) this).field_O) {
                            break L22;
                          } else {
                            ((lg) this).field_O = var39;
                            break L22;
                          }
                        }
                        if (var40 <= ((lg) this).field_O) {
                          break L20;
                        } else {
                          ((lg) this).field_O = var40;
                          break L20;
                        }
                      }
                    }
                    L23: {
                      if (var43 != 2) {
                        break L23;
                      } else {
                        var39 = var40;
                        var40 = var4.j(-3084) + var41;
                        var41 = var40;
                        ((lg) this).field_e[var42] = var38;
                        ((lg) this).field_H[var42] = var39;
                        ((lg) this).field_r[var42] = var40;
                        if (var40 <= ((lg) this).field_O) {
                          break L23;
                        } else {
                          ((lg) this).field_O = var40;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (var43 != 3) {
                        break L24;
                      } else {
                        var38 = var40;
                        var40 = var4.j(-3084) + var41;
                        var41 = var40;
                        ((lg) this).field_e[var42] = var38;
                        ((lg) this).field_H[var42] = var39;
                        ((lg) this).field_r[var42] = var40;
                        if (var40 <= ((lg) this).field_O) {
                          break L24;
                        } else {
                          ((lg) this).field_O = var40;
                          break L24;
                        }
                      }
                    }
                    if (var43 == 4) {
                      var44 = var38;
                      var38 = var39;
                      var39 = var44;
                      var40 = var4.j(-3084) + var41;
                      var41 = var40;
                      ((lg) this).field_e[var42] = var38;
                      ((lg) this).field_H[var42] = var39;
                      ((lg) this).field_r[var42] = var40;
                      if (var40 > ((lg) this).field_O) {
                        ((lg) this).field_O = var40;
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
                  ((lg) this).field_c[var38] = (short)var4.a((byte) -11);
                  if (var12 != 1) {
                    break L25;
                  } else {
                    L26: {
                      var39 = var5.h(-11);
                      if ((var39 & 1) != 1) {
                        ((lg) this).field_g[var38] = (byte) 0;
                        break L26;
                      } else {
                        ((lg) this).field_g[var38] = (byte) 1;
                        var2 = 1;
                        break L26;
                      }
                    }
                    if ((var39 & 2) != 2) {
                      ((lg) this).field_x[var38] = (byte)-1;
                      ((lg) this).field_N[var38] = (short)-1;
                      break L25;
                    } else {
                      ((lg) this).field_x[var38] = (byte)(var39 >> 2);
                      ((lg) this).field_N[var38] = ((lg) this).field_c[var38];
                      ((lg) this).field_c[var38] = (short)127;
                      if (((lg) this).field_N[var38] == -1) {
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
                    ((lg) this).field_k[var38] = var6.g(84);
                    break L27;
                  }
                }
                L28: {
                  if (var14 != 1) {
                    break L28;
                  } else {
                    ((lg) this).field_o[var38] = var7.g(82);
                    break L28;
                  }
                }
                if (var15 == 1) {
                  ((lg) this).field_q[var38] = var8.h(-11);
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
              var39 = var4.h(-11);
              var40 = 0;
              if ((var39 & 1) == 0) {
                break L29;
              } else {
                var40 = var5.j(-3084);
                break L29;
              }
            }
            L30: {
              var41 = 0;
              if ((var39 & 2) == 0) {
                break L30;
              } else {
                var41 = var6.j(-3084);
                break L30;
              }
            }
            L31: {
              var42 = 0;
              if ((var39 & 4) == 0) {
                break L31;
              } else {
                var42 = var7.j(-3084);
                break L31;
              }
            }
            ((lg) this).field_p[var38] = var35 + var40;
            ((lg) this).field_D[var38] = var36 + var41;
            ((lg) this).field_i[var38] = var37 + var42;
            var35 = ((lg) this).field_p[var38];
            var36 = ((lg) this).field_D[var38];
            var37 = ((lg) this).field_i[var38];
            if (var16 == 1) {
              ((lg) this).field_d[var38] = var8.h(-11);
              var38++;
              continue L11;
            } else {
              var38++;
              continue L11;
            }
          }
        }
    }

    private lg(byte[] param0) {
        ((lg) this).field_G = 0;
        ((lg) this).field_O = 0;
        ((lg) this).field_A = (byte) 0;
        ((lg) this).field_z = 0;
        if (param0[param0.length - 1] == -1) {
            // if_icmpne L52
            this.b(param0);
        } else {
            this.a(param0);
        }
    }

    lg(int param0, int param1, int param2) {
        ((lg) this).field_G = 0;
        ((lg) this).field_O = 0;
        ((lg) this).field_A = (byte) 0;
        ((lg) this).field_z = 0;
        ((lg) this).field_p = new int[param0];
        ((lg) this).field_D = new int[param0];
        ((lg) this).field_i = new int[param0];
        ((lg) this).field_d = new int[param0];
        ((lg) this).field_e = new int[param1];
        ((lg) this).field_H = new int[param1];
        ((lg) this).field_r = new int[param1];
        ((lg) this).field_g = new byte[param1];
        ((lg) this).field_k = new byte[param1];
        ((lg) this).field_o = new byte[param1];
        ((lg) this).field_c = new short[param1];
        ((lg) this).field_N = new short[param1];
        ((lg) this).field_x = new byte[param1];
        ((lg) this).field_q = new int[param1];
        if (param2 > 0) {
            ((lg) this).field_E = new byte[param2];
            ((lg) this).field_M = new short[param2];
            ((lg) this).field_P = new short[param2];
            ((lg) this).field_F = new short[param2];
            ((lg) this).field_m = new short[param2];
            ((lg) this).field_b = new short[param2];
            ((lg) this).field_t = new short[param2];
            ((lg) this).field_y = new byte[param2];
            ((lg) this).field_a = new byte[param2];
            ((lg) this).field_h = new byte[param2];
            ((lg) this).field_J = new byte[param2];
            ((lg) this).field_I = new byte[param2];
        }
    }

    lg(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7) {
        int var9 = 0;
        L0: {
          ((lg) this).field_G = 0;
          ((lg) this).field_O = 0;
          ((lg) this).field_A = (byte) 0;
          ((lg) this).field_z = 0;
          var9 = 0;
          ((lg) this).field_A = (byte) -1;
          ((lg) this).field_p = new int[param0];
          ((lg) this).field_D = new int[param0];
          ((lg) this).field_i = new int[param0];
          ((lg) this).field_d = new int[param0];
          ((lg) this).field_f = new short[param0];
          ((lg) this).field_e = new int[param1];
          ((lg) this).field_H = new int[param1];
          ((lg) this).field_r = new int[param1];
          if (var9 == 0) {
            break L0;
          } else {
            ((lg) this).field_g = new byte[param1];
            break L0;
          }
        }
        L1: {
          if (!param3) {
            break L1;
          } else {
            ((lg) this).field_k = new byte[param1];
            break L1;
          }
        }
        L2: {
          if (!param4) {
            break L2;
          } else {
            ((lg) this).field_o = new byte[param1];
            break L2;
          }
        }
        L3: {
          if (!param5) {
            break L3;
          } else {
            ((lg) this).field_q = new int[param1];
            break L3;
          }
        }
        L4: {
          if (!param6) {
            break L4;
          } else {
            ((lg) this).field_N = new short[param1];
            break L4;
          }
        }
        L5: {
          if (!param7) {
            break L5;
          } else {
            ((lg) this).field_x = new byte[param1];
            break L5;
          }
        }
        L6: {
          ((lg) this).field_c = new short[param1];
          ((lg) this).field_K = new short[param1];
          if (param2 <= 0) {
            break L6;
          } else {
            ((lg) this).field_E = new byte[param2];
            ((lg) this).field_M = new short[param2];
            ((lg) this).field_P = new short[param2];
            ((lg) this).field_F = new short[param2];
            ((lg) this).field_m = new short[param2];
            ((lg) this).field_b = new short[param2];
            ((lg) this).field_t = new short[param2];
            ((lg) this).field_y = new byte[param2];
            ((lg) this).field_a = new byte[param2];
            ((lg) this).field_h = new byte[param2];
            ((lg) this).field_J = new byte[param2];
            ((lg) this).field_I = new byte[param2];
            break L6;
          }
        }
    }

    lg(lg[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        lg var10_ref_lg = null;
        int var10 = 0;
        lg var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        lg var15 = null;
        lg var16 = null;
        int var17 = 0;
        lg var18 = null;
        lg var19 = null;
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
        ((lg) this).field_G = 0;
        ((lg) this).field_O = 0;
        ((lg) this).field_A = (byte) 0;
        ((lg) this).field_z = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        ((lg) this).field_G = 0;
        ((lg) this).field_z = 0;
        ((lg) this).field_L = 0;
        ((lg) this).field_A = (byte) -1;
        var9 = 0;
        L0: while (true) {
          if (var9 >= param1) {
            L1: {
              ((lg) this).field_p = new int[((lg) this).field_G];
              ((lg) this).field_D = new int[((lg) this).field_G];
              ((lg) this).field_i = new int[((lg) this).field_G];
              ((lg) this).field_d = new int[((lg) this).field_G];
              ((lg) this).field_f = new short[((lg) this).field_G];
              ((lg) this).field_e = new int[((lg) this).field_z];
              ((lg) this).field_H = new int[((lg) this).field_z];
              ((lg) this).field_r = new int[((lg) this).field_z];
              if (var3 == 0) {
                break L1;
              } else {
                ((lg) this).field_g = new byte[((lg) this).field_z];
                break L1;
              }
            }
            L2: {
              if (var4 == 0) {
                break L2;
              } else {
                ((lg) this).field_k = new byte[((lg) this).field_z];
                break L2;
              }
            }
            L3: {
              if (var5 == 0) {
                break L3;
              } else {
                ((lg) this).field_o = new byte[((lg) this).field_z];
                break L3;
              }
            }
            L4: {
              if (var6 == 0) {
                break L4;
              } else {
                ((lg) this).field_q = new int[((lg) this).field_z];
                break L4;
              }
            }
            L5: {
              if (var7 == 0) {
                break L5;
              } else {
                ((lg) this).field_N = new short[((lg) this).field_z];
                break L5;
              }
            }
            L6: {
              if (var8 == 0) {
                break L6;
              } else {
                ((lg) this).field_x = new byte[((lg) this).field_z];
                break L6;
              }
            }
            L7: {
              ((lg) this).field_c = new short[((lg) this).field_z];
              ((lg) this).field_K = new short[((lg) this).field_z];
              if (((lg) this).field_L <= 0) {
                break L7;
              } else {
                ((lg) this).field_E = new byte[((lg) this).field_L];
                ((lg) this).field_M = new short[((lg) this).field_L];
                ((lg) this).field_P = new short[((lg) this).field_L];
                ((lg) this).field_F = new short[((lg) this).field_L];
                ((lg) this).field_m = new short[((lg) this).field_L];
                ((lg) this).field_b = new short[((lg) this).field_L];
                ((lg) this).field_t = new short[((lg) this).field_L];
                ((lg) this).field_y = new byte[((lg) this).field_L];
                ((lg) this).field_a = new byte[((lg) this).field_L];
                ((lg) this).field_h = new byte[((lg) this).field_L];
                ((lg) this).field_J = new byte[((lg) this).field_L];
                ((lg) this).field_I = new byte[((lg) this).field_L];
                break L7;
              }
            }
            ((lg) this).field_G = 0;
            ((lg) this).field_z = 0;
            ((lg) this).field_L = 0;
            var9 = 0;
            L8: while (true) {
              if (var9 >= param1) {
                var9 = 0;
                ((lg) this).field_O = ((lg) this).field_G;
                var10 = 0;
                L9: while (true) {
                  if (var10 >= param1) {
                  } else {
                    var16 = param0[var10];
                    var19 = var16;
                    var11 = var19;
                    var12 = (short)(1 << var10);
                    if (var11 != null) {
                      var13 = 0;
                      L10: while (true) {
                        if (var13 >= var19.field_z) {
                          var17 = 0;
                          var13 = var17;
                          L11: while (true) {
                            if (var17 < var19.field_L) {
                              L12: {
                                ((lg) this).field_E[((lg) this).field_L] = var16.field_E[var17];
                                var14 = var16.field_E[var17];
                                if (var14 != 0) {
                                  break L12;
                                } else {
                                  ((lg) this).field_M[((lg) this).field_L] = (short)this.a(var16, (int) var16.field_M[var17], (short) var12);
                                  ((lg) this).field_P[((lg) this).field_L] = (short)this.a(var16, (int) var16.field_P[var17], (short) var12);
                                  ((lg) this).field_F[((lg) this).field_L] = (short)this.a(var16, (int) var16.field_F[var17], (short) var12);
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
                                    ((lg) this).field_M[((lg) this).field_L] = var16.field_M[var17];
                                    ((lg) this).field_P[((lg) this).field_L] = var16.field_P[var17];
                                    ((lg) this).field_F[((lg) this).field_L] = var16.field_F[var17];
                                    ((lg) this).field_m[((lg) this).field_L] = var16.field_m[var17];
                                    ((lg) this).field_b[((lg) this).field_L] = var16.field_b[var17];
                                    ((lg) this).field_t[((lg) this).field_L] = var16.field_t[var17];
                                    ((lg) this).field_y[((lg) this).field_L] = var16.field_y[var17];
                                    ((lg) this).field_a[((lg) this).field_L] = var16.field_a[var17];
                                    ((lg) this).field_h[((lg) this).field_L] = var16.field_h[var17];
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                if (var14 != 2) {
                                  break L14;
                                } else {
                                  ((lg) this).field_J[((lg) this).field_L] = var16.field_J[var17];
                                  ((lg) this).field_I[((lg) this).field_L] = var16.field_I[var17];
                                  break L14;
                                }
                              }
                              ((lg) this).field_L = ((lg) this).field_L + 1;
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
                                var9++;
                                stackOut_74_0 = ((lg) this).field_x;
                                stackOut_74_1 = var9;
                                stackIn_77_0 = stackOut_74_0;
                                stackIn_77_1 = stackOut_74_1;
                                stackIn_75_0 = stackOut_74_0;
                                stackIn_75_1 = stackOut_74_1;
                                if (var19.field_x == null) {
                                  break L16;
                                } else {
                                  stackOut_75_0 = (byte[]) (Object) stackIn_75_0;
                                  stackOut_75_1 = stackIn_75_1;
                                  stackIn_77_0 = stackOut_75_0;
                                  stackIn_77_1 = stackOut_75_1;
                                  stackIn_76_0 = stackOut_75_0;
                                  stackIn_76_1 = stackOut_75_1;
                                  if (var16.field_x[var13] == -1) {
                                    break L16;
                                  } else {
                                    stackOut_76_0 = (byte[]) (Object) stackIn_76_0;
                                    stackOut_76_1 = stackIn_76_1;
                                    stackOut_76_2 = var16.field_x[var13] + ((lg) this).field_L;
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
                    if (var12 < var18.field_z) {
                      L18: {
                        if (var3 == 0) {
                          break L18;
                        } else {
                          if (var18.field_g == null) {
                            break L18;
                          } else {
                            ((lg) this).field_g[((lg) this).field_z] = var15.field_g[var12];
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (var4 == 0) {
                          break L19;
                        } else {
                          if (var18.field_k == null) {
                            ((lg) this).field_k[((lg) this).field_z] = var15.field_A;
                            break L19;
                          } else {
                            ((lg) this).field_k[((lg) this).field_z] = var15.field_k[var12];
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (var5 == 0) {
                          break L20;
                        } else {
                          if (var18.field_o == null) {
                            break L20;
                          } else {
                            ((lg) this).field_o[((lg) this).field_z] = var15.field_o[var12];
                            break L20;
                          }
                        }
                      }
                      L21: {
                        if (var6 == 0) {
                          break L21;
                        } else {
                          if (var18.field_q == null) {
                            break L21;
                          } else {
                            ((lg) this).field_q[((lg) this).field_z] = var15.field_q[var12];
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (var7 == 0) {
                          break L22;
                        } else {
                          if (var18.field_N == null) {
                            ((lg) this).field_N[((lg) this).field_z] = (short)-1;
                            break L22;
                          } else {
                            ((lg) this).field_N[((lg) this).field_z] = var15.field_N[var12];
                            break L22;
                          }
                        }
                      }
                      ((lg) this).field_c[((lg) this).field_z] = var15.field_c[var12];
                      ((lg) this).field_K[((lg) this).field_z] = (short)var10;
                      ((lg) this).field_e[((lg) this).field_z] = this.a(var15, var15.field_e[var12], (short) var10);
                      ((lg) this).field_H[((lg) this).field_z] = this.a(var15, var15.field_H[var12], (short) var10);
                      ((lg) this).field_r[((lg) this).field_z] = this.a(var15, var15.field_r[var12], (short) var10);
                      ((lg) this).field_z = ((lg) this).field_z + 1;
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
            var10_ref_lg = param0[var9];
            if (var10_ref_lg != null) {
              L23: {
                ((lg) this).field_G = ((lg) this).field_G + var10_ref_lg.field_G;
                ((lg) this).field_z = ((lg) this).field_z + var10_ref_lg.field_z;
                ((lg) this).field_L = ((lg) this).field_L + var10_ref_lg.field_L;
                if (var10_ref_lg.field_k == null) {
                  L24: {
                    if (((lg) this).field_A != -1) {
                      break L24;
                    } else {
                      ((lg) this).field_A = var10_ref_lg.field_A;
                      break L24;
                    }
                  }
                  if (((lg) this).field_A == var10_ref_lg.field_A) {
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
                if (var10_ref_lg.field_g == null) {
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
                if (var10_ref_lg.field_o == null) {
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
                if (var10_ref_lg.field_q == null) {
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
                if (var10_ref_lg.field_N == null) {
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
                if (var10_ref_lg.field_x == null) {
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

    lg(lg param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6 = 0;
        L0: {
          ((lg) this).field_G = 0;
          ((lg) this).field_O = 0;
          ((lg) this).field_A = (byte) 0;
          ((lg) this).field_z = 0;
          ((lg) this).field_G = param0.field_G;
          ((lg) this).field_O = param0.field_O;
          ((lg) this).field_z = param0.field_z;
          ((lg) this).field_L = param0.field_L;
          if (!param1) {
            ((lg) this).field_p = new int[((lg) this).field_G];
            ((lg) this).field_D = new int[((lg) this).field_G];
            ((lg) this).field_i = new int[((lg) this).field_G];
            var6 = 0;
            L1: while (true) {
              if (var6 >= ((lg) this).field_G) {
                break L0;
              } else {
                ((lg) this).field_p[var6] = param0.field_p[var6];
                ((lg) this).field_D[var6] = param0.field_D[var6];
                ((lg) this).field_i[var6] = param0.field_i[var6];
                var6++;
                continue L1;
              }
            }
          } else {
            ((lg) this).field_p = param0.field_p;
            ((lg) this).field_D = param0.field_D;
            ((lg) this).field_i = param0.field_i;
            break L0;
          }
        }
        L2: {
          if (!param2) {
            ((lg) this).field_c = new short[((lg) this).field_z];
            var6 = 0;
            L3: while (true) {
              if (var6 >= ((lg) this).field_z) {
                break L2;
              } else {
                ((lg) this).field_c[var6] = param0.field_c[var6];
                var6++;
                continue L3;
              }
            }
          } else {
            ((lg) this).field_c = param0.field_c;
            break L2;
          }
        }
        L4: {
          L5: {
            if (param3) {
              break L5;
            } else {
              if (param0.field_N != null) {
                ((lg) this).field_N = new short[((lg) this).field_z];
                var6 = 0;
                L6: while (true) {
                  if (var6 >= ((lg) this).field_z) {
                    break L4;
                  } else {
                    ((lg) this).field_N[var6] = param0.field_N[var6];
                    var6++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          ((lg) this).field_N = param0.field_N;
          break L4;
        }
        L7: {
          if (!param4) {
            ((lg) this).field_o = new byte[((lg) this).field_z];
            if (param0.field_o != null) {
              var6 = 0;
              L8: while (true) {
                if (var6 >= ((lg) this).field_z) {
                  break L7;
                } else {
                  ((lg) this).field_o[var6] = param0.field_o[var6];
                  var6++;
                  continue L8;
                }
              }
            } else {
              var6 = 0;
              L9: while (true) {
                if (var6 >= ((lg) this).field_z) {
                  break L7;
                } else {
                  ((lg) this).field_o[var6] = (byte) 0;
                  var6++;
                  continue L9;
                }
              }
            }
          } else {
            ((lg) this).field_o = param0.field_o;
            break L7;
          }
        }
        ((lg) this).field_e = param0.field_e;
        ((lg) this).field_H = param0.field_H;
        ((lg) this).field_r = param0.field_r;
        ((lg) this).field_g = param0.field_g;
        ((lg) this).field_k = param0.field_k;
        ((lg) this).field_x = param0.field_x;
        ((lg) this).field_A = param0.field_A;
        ((lg) this).field_E = param0.field_E;
        ((lg) this).field_M = param0.field_M;
        ((lg) this).field_P = param0.field_P;
        ((lg) this).field_F = param0.field_F;
        ((lg) this).field_m = param0.field_m;
        ((lg) this).field_b = param0.field_b;
        ((lg) this).field_t = param0.field_t;
        ((lg) this).field_y = param0.field_y;
        ((lg) this).field_a = param0.field_a;
        ((lg) this).field_h = param0.field_h;
        ((lg) this).field_J = param0.field_J;
        ((lg) this).field_I = param0.field_I;
        ((lg) this).field_d = param0.field_d;
        ((lg) this).field_q = param0.field_q;
        ((lg) this).field_n = param0.field_n;
        ((lg) this).field_w = param0.field_w;
        ((lg) this).field_B = param0.field_B;
        ((lg) this).field_j = param0.field_j;
        ((lg) this).field_Q = param0.field_Q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = oo.field_j;
        field_s = oo.field_h;
    }
}
