/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends bn {
    int[] field_k;
    byte[] field_l;

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((sm) this).field_a;
          param1 = param1 + ((sm) this).field_g;
          var3 = param0 + param1 * ph.field_j;
          var4 = 0;
          var5 = ((sm) this).field_d;
          var6 = ((sm) this).field_c;
          var7 = ph.field_j - var6;
          var8 = 0;
          if (param1 >= ph.field_c) {
            break L0;
          } else {
            var9 = ph.field_c - param1;
            var5 = var5 - var9;
            param1 = ph.field_c;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * ph.field_j;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= ph.field_h) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - ph.field_h);
            break L1;
          }
        }
        L2: {
          if (param0 >= ph.field_k) {
            break L2;
          } else {
            var9 = ph.field_k - param0;
            var6 = var6 - var9;
            param0 = ph.field_k;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= ph.field_a) {
            break L3;
          } else {
            var9 = param0 + var6 - ph.field_a;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              sm.a(ph.field_e, ((sm) this).field_l, ((sm) this).field_k, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final t a() {
        int var3 = 0;
        int var1 = ((sm) this).field_c * ((sm) this).field_d;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
            var2[var3] = ((sm) this).field_k[((sm) this).field_l[var3] & 255];
        }
        return new t(((sm) this).field_j, ((sm) this).field_e, ((sm) this).field_a, ((sm) this).field_g, ((sm) this).field_c, ((sm) this).field_d, var2);
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((sm) this).field_a;
          param1 = param1 + ((sm) this).field_g;
          var3 = param0 + param1 * ph.field_j;
          var4 = 0;
          var5 = ((sm) this).field_d;
          var6 = ((sm) this).field_c;
          var7 = ph.field_j - var6;
          var8 = 0;
          if (param1 >= ph.field_c) {
            break L0;
          } else {
            var9 = ph.field_c - param1;
            var5 = var5 - var9;
            param1 = ph.field_c;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * ph.field_j;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= ph.field_h) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - ph.field_h);
            break L1;
          }
        }
        L2: {
          if (param0 >= ph.field_k) {
            break L2;
          } else {
            var9 = ph.field_k - param0;
            var6 = var6 - var9;
            param0 = ph.field_k;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= ph.field_a) {
            break L3;
          } else {
            var9 = param0 + var6 - ph.field_a;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              sm.a(ph.field_e, ((sm) this).field_l, ((sm) this).field_k, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                var16 = param1[(param3 >> 16) + var14];
                if (var16 != 0) {
                    param5++;
                    param0[param5] = param2[var16 & 255];
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var12;
            param5 = param5 + param6;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((sm) this).field_a;
          param1 = param1 + ((sm) this).field_g;
          var4 = param0 + param1 * ph.field_j;
          var5 = 0;
          var6 = ((sm) this).field_d;
          var7 = ((sm) this).field_c;
          var8 = ph.field_j - var7;
          var9 = 0;
          if (param1 >= ph.field_c) {
            break L0;
          } else {
            var10 = ph.field_c - param1;
            var6 = var6 - var10;
            param1 = ph.field_c;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * ph.field_j;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= ph.field_h) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - ph.field_h);
            break L1;
          }
        }
        L2: {
          if (param0 >= ph.field_k) {
            break L2;
          } else {
            var10 = ph.field_k - param0;
            var7 = var7 - var10;
            param0 = ph.field_k;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= ph.field_a) {
            break L3;
          } else {
            var10 = param0 + var7 - ph.field_a;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              sm.b(ph.field_e, ((sm) this).field_l, ((sm) this).field_k, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
            for (var11 = var9; var11 < 0; var11++) {
                param4++;
                param3++;
                param0[param4] = param2[param1[param3] & 255];
                param4++;
                param3++;
                param0[param4] = param2[param1[param3] & 255];
                param4++;
                param3++;
                param0[param4] = param2[param1[param3] & 255];
                param4++;
                param3++;
                param0[param4] = param2[param1[param3] & 255];
            }
            for (var11 = param5; var11 < 0; var11++) {
                param4++;
                param3++;
                param0[param4] = param2[param1[param3] & 255];
            }
            param4 = param4 + param7;
            param3 = param3 + param8;
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        var11 = -param7;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = var10;
            L1: while (true) {
              if (var12 >= 0) {
                var12 = param6;
                L2: while (true) {
                  if (var12 >= 0) {
                    param5 = param5 + param8;
                    param4 = param4 + param9;
                    var11++;
                    continue L0;
                  } else {
                    param4++;
                    param3 = param1[param4];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      param5++;
                      param0[param5] = param2[param3 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param4++;
                  param3 = param1[param4];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    param5++;
                    param0[param5] = param2[param3 & 255];
                    break L3;
                  }
                }
                L4: {
                  param4++;
                  param3 = param1[param4];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    param5++;
                    param0[param5] = param2[param3 & 255];
                    break L4;
                  }
                }
                L5: {
                  param4++;
                  param3 = param1[param4];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    param5++;
                    param0[param5] = param2[param3 & 255];
                    break L5;
                  }
                }
                param4++;
                param3 = param1[param4];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  param5++;
                  param0[param5] = param2[param3 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
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
        L0: {
          var5 = ((sm) this).field_c;
          var6 = ((sm) this).field_d;
          var7 = 0;
          var8 = 0;
          var9 = ((sm) this).field_j;
          var10 = ((sm) this).field_e;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (((sm) this).field_a <= 0) {
            break L0;
          } else {
            var13 = ((((sm) this).field_a << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (((sm) this).field_a << 16));
            break L0;
          }
        }
        L1: {
          if (((sm) this).field_g <= 0) {
            break L1;
          } else {
            var13 = ((((sm) this).field_g << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (((sm) this).field_g << 16));
            break L1;
          }
        }
        L2: {
          if (var5 >= var9) {
            break L2;
          } else {
            param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
            break L2;
          }
        }
        L3: {
          if (var6 >= var10) {
            break L3;
          } else {
            param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            break L3;
          }
        }
        L4: {
          var13 = param0 + param1 * ph.field_j;
          var14 = ph.field_j - param2;
          if (param1 + param3 <= ph.field_h) {
            break L4;
          } else {
            param3 = param3 - (param1 + param3 - ph.field_h);
            break L4;
          }
        }
        L5: {
          if (param1 >= ph.field_c) {
            break L5;
          } else {
            var15 = ph.field_c - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * ph.field_j;
            var8 = var8 + var12 * var15;
            break L5;
          }
        }
        L6: {
          if (param0 + param2 <= ph.field_a) {
            break L6;
          } else {
            var15 = param0 + param2 - ph.field_a;
            param2 = param2 - var15;
            var14 = var14 + var15;
            break L6;
          }
        }
        L7: {
          if (param0 >= ph.field_k) {
            break L7;
          } else {
            var15 = ph.field_k - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
            break L7;
          }
        }
        sm.a(ph.field_e, ((sm) this).field_l, ((sm) this).field_k, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    sm(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((sm) this).field_j = param0;
        ((sm) this).field_e = param1;
        ((sm) this).field_a = param2;
        ((sm) this).field_g = param3;
        ((sm) this).field_c = param4;
        ((sm) this).field_d = param5;
        ((sm) this).field_l = param6;
        ((sm) this).field_k = param7;
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var10 = 256 - param9;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = -param5;
            L1: while (true) {
              if (var12 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var11++;
                continue L0;
              } else {
                param3++;
                var13 = param1[param3];
                if (var13 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param2[var13 & 255];
                  var14 = param0[param4];
                  param4++;
                  param0[param4] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    sm(int param0, int param1, int param2) {
        ((sm) this).field_c = param0;
        ((sm) this).field_j = param0;
        ((sm) this).field_d = param1;
        ((sm) this).field_e = param1;
        ((sm) this).field_g = 0;
        ((sm) this).field_a = 0;
        ((sm) this).field_l = new byte[param0 * param1];
        ((sm) this).field_k = new int[param2];
    }
}
