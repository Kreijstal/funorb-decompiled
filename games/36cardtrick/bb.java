/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends pj {
    int[] field_e;
    int[] field_q;
    int field_b;
    int field_f;
    short[] field_l;
    private int[][] field_A;
    private int[] field_s;
    byte[] field_c;
    short[] field_z;
    byte[] field_x;
    int[] field_h;
    int field_r;
    short[] field_d;
    byte[] field_o;
    short[] field_B;
    byte[] field_k;
    int field_y;
    dj[] field_t;
    int[] field_v;
    int[] field_u;
    int[] field_w;
    private int[] field_g;
    private int[][] field_m;
    dj[] field_j;
    byte[] field_p;
    e[] field_n;
    short[] field_i;

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
        e var16 = null;
        dj var17 = null;
        dj var18 = null;
        dj var19 = null;
        if (((bb) this).field_j == null) {
          ((bb) this).field_j = new dj[((bb) this).field_b];
          var1 = 0;
          L0: while (true) {
            if (var1 >= ((bb) this).field_b) {
              var1 = 0;
              L1: while (true) {
                if (var1 >= ((bb) this).field_y) {
                  return;
                } else {
                  var2 = ((bb) this).field_h[var1];
                  var3 = ((bb) this).field_v[var1];
                  var4 = ((bb) this).field_q[var1];
                  var5 = ((bb) this).field_w[var3] - ((bb) this).field_w[var2];
                  var6 = ((bb) this).field_e[var3] - ((bb) this).field_e[var2];
                  var7 = ((bb) this).field_u[var3] - ((bb) this).field_u[var2];
                  var8 = ((bb) this).field_w[var4] - ((bb) this).field_w[var2];
                  var9 = ((bb) this).field_e[var4] - ((bb) this).field_e[var2];
                  var10 = ((bb) this).field_u[var4] - ((bb) this).field_u[var2];
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
                                    if (((bb) this).field_o != null) {
                                      var15 = ((bb) this).field_o[var1];
                                      break L5;
                                    } else {
                                      var15 = 0;
                                      break L5;
                                    }
                                  }
                                  if (var15 != 0) {
                                    if (var15 == 1) {
                                      L6: {
                                        if (((bb) this).field_n != null) {
                                          break L6;
                                        } else {
                                          ((bb) this).field_n = new e[((bb) this).field_y];
                                          break L6;
                                        }
                                      }
                                      ((bb) this).field_n[var1] = new e();
                                      var16 = new e();
                                      var16.field_g = var11;
                                      var16.field_h = var12;
                                      var16.field_d = var13;
                                      var1++;
                                      continue L1;
                                    } else {
                                      var1++;
                                      continue L1;
                                    }
                                  } else {
                                    var17 = ((bb) this).field_j[var2];
                                    ((dj) var17).field_g = ((dj) var17).field_g + var11;
                                    ((dj) var17).field_b = ((dj) var17).field_b + var12;
                                    ((dj) var17).field_c = ((dj) var17).field_c + var13;
                                    ((dj) var17).field_d = ((dj) var17).field_d + 1;
                                    var18 = ((bb) this).field_j[var3];
                                    ((dj) var18).field_g = ((dj) var18).field_g + var11;
                                    ((dj) var18).field_b = ((dj) var18).field_b + var12;
                                    ((dj) var18).field_c = ((dj) var18).field_c + var13;
                                    ((dj) var18).field_d = ((dj) var18).field_d + 1;
                                    var19 = ((bb) this).field_j[var4];
                                    ((dj) var19).field_g = ((dj) var19).field_g + var11;
                                    ((dj) var19).field_b = ((dj) var19).field_b + var12;
                                    ((dj) var19).field_c = ((dj) var19).field_c + var13;
                                    ((dj) var19).field_d = ((dj) var19).field_d + 1;
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
              ((bb) this).field_j[var1] = new dj();
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final m a(int param0, int param1, int param2, int param3, int param4) {
        return (m) (Object) new ik((bb) this, param0, param1, param2, param3, param4);
    }

    final byte a(short param0, short param1, short param2) {
        if (((bb) this).field_f >= 255) {
            throw new IllegalStateException();
        }
        ((bb) this).field_x[((bb) this).field_f] = (byte) 0;
        ((bb) this).field_d[((bb) this).field_f] = (short)param0;
        ((bb) this).field_B[((bb) this).field_f] = (short)param1;
        ((bb) this).field_z[((bb) this).field_f] = (short)param2;
        ((bb) this).field_f = ((bb) this).field_f + 1;
        return (byte)((bb) this).field_f;
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
          if (((bb) this).field_g == null) {
            break L0;
          } else {
            var9 = new int[256];
            var7 = var9;
            var5 = var7;
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((bb) this).field_r) {
                ((bb) this).field_m = new int[var2 + 1][];
                var3 = 0;
                L2: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= ((bb) this).field_r) {
                        ((bb) this).field_g = null;
                        break L0;
                      } else {
                        var4 = ((bb) this).field_g[var3];
                        var5[var4] = var5[var4] + 1;
                        ((bb) this).field_m[var4][var5[var4]] = var3;
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    ((bb) this).field_m[var3] = new int[var9[var3]];
                    var9[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var4 = ((bb) this).field_g[var3];
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
          if (((bb) this).field_s == null) {
            break L4;
          } else {
            var10 = new int[256];
            var8 = var10;
            var6 = var8;
            var2 = 0;
            var3 = 0;
            L5: while (true) {
              if (var3 >= ((bb) this).field_y) {
                ((bb) this).field_A = new int[var2 + 1][];
                var3 = 0;
                L6: while (true) {
                  if (var3 > var2) {
                    var3 = 0;
                    L7: while (true) {
                      if (var3 >= ((bb) this).field_y) {
                        ((bb) this).field_s = null;
                        break L4;
                      } else {
                        var4 = ((bb) this).field_s[var3];
                        var6[var4] = var6[var4] + 1;
                        ((bb) this).field_A[var4][var6[var4]] = var3;
                        var3++;
                        continue L7;
                      }
                    }
                  } else {
                    ((bb) this).field_A[var3] = new int[var10[var3]];
                    var10[var3] = 0;
                    var3++;
                    continue L6;
                  }
                }
              } else {
                var4 = ((bb) this).field_s[var3];
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

    final int a(int param0, int param1, int param2, byte param3, byte param4, short param5, short param6) {
        ((bb) this).field_h[((bb) this).field_y] = param0;
        ((bb) this).field_v[((bb) this).field_y] = param1;
        ((bb) this).field_q[((bb) this).field_y] = param2;
        ((bb) this).field_o[((bb) this).field_y] = (byte)param3;
        ((bb) this).field_c[((bb) this).field_y] = (byte)param4;
        ((bb) this).field_l[((bb) this).field_y] = (short)param5;
        ((bb) this).field_i[((bb) this).field_y] = (short)param6;
        ((bb) this).field_y = ((bb) this).field_y + 1;
        return ((bb) this).field_y;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((bb) this).field_r) {
            ((bb) this).field_w[((bb) this).field_r] = param0;
            ((bb) this).field_e[((bb) this).field_r] = param1;
            ((bb) this).field_u[((bb) this).field_r] = param2;
            ((bb) this).field_r = ((bb) this).field_r + 1;
            ((bb) this).field_b = ((bb) this).field_r + 1;
            return ((bb) this).field_r - 1;
          } else {
            if (((bb) this).field_w[var4] == param0) {
              if (((bb) this).field_e[var4] == param1) {
                if (((bb) this).field_u[var4] == param2) {
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

    bb(int param0, int param1, int param2) {
        ((bb) this).field_y = 0;
        ((bb) this).field_b = 0;
        ((bb) this).field_r = 0;
        ((bb) this).field_w = new int[param0];
        ((bb) this).field_e = new int[param0];
        ((bb) this).field_u = new int[param0];
        ((bb) this).field_g = new int[param0];
        ((bb) this).field_h = new int[param1];
        ((bb) this).field_v = new int[param1];
        ((bb) this).field_q = new int[param1];
        ((bb) this).field_o = new byte[param1];
        ((bb) this).field_p = new byte[param1];
        ((bb) this).field_k = new byte[param1];
        ((bb) this).field_l = new short[param1];
        ((bb) this).field_i = new short[param1];
        ((bb) this).field_c = new byte[param1];
        ((bb) this).field_s = new int[param1];
        if (param2 > 0) {
            ((bb) this).field_x = new byte[param2];
            ((bb) this).field_d = new short[param2];
            ((bb) this).field_B = new short[param2];
            ((bb) this).field_z = new short[param2];
        }
    }
}
