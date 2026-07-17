/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ja extends nq {
    int[] field_B;

    final ja f() {
        int var2 = 0;
        int var3 = 0;
        ja var1 = new ja(((ja) this).field_x, ((ja) this).field_w);
        var1.field_z = ((ja) this).field_z;
        var1.field_u = ((ja) this).field_u;
        var1.field_r = ((ja) this).field_z - ((ja) this).field_x - ((ja) this).field_r;
        var1.field_y = ((ja) this).field_y;
        for (var2 = 0; var2 < ((ja) this).field_w; var2++) {
            for (var3 = 0; var3 < ((ja) this).field_x; var3++) {
                var1.field_B[var2 * ((ja) this).field_x + var3] = ((ja) this).field_B[var2 * ((ja) this).field_x + ((ja) this).field_x - 1 - var3];
            }
        }
        return var1;
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
                int incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
                if (param2 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param0[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((param2 & 16711935) * param9 + (var13 & 16711935) * var10 & -16711936) + ((param2 & 65280) * param9 + (var13 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void f(int param0, int param1) {
        param0 = param0 + (((ja) this).field_r >> 1);
        param1 = param1 + (((ja) this).field_y >> 1);
        int var3 = param0 < oo.field_f ? oo.field_f - param0 << 1 : 0;
        int var4 = param0 + (((ja) this).field_x >> 1) > oo.field_g ? oo.field_g - param0 << 1 : ((ja) this).field_x;
        int var5 = param1 < oo.field_e ? oo.field_e - param1 << 1 : 0;
        int var6 = param1 + (((ja) this).field_w >> 1) > oo.field_d ? oo.field_d - param1 << 1 : ((ja) this).field_w;
        ja.a(((ja) this).field_B, var5 * ((ja) this).field_x + var3, (param1 + (var5 >> 1)) * oo.field_b + (param0 + (var3 >> 1)), (((ja) this).field_x << 1) - (var4 - var3) + (((ja) this).field_x & 1), oo.field_b - (var4 - var3 >> 1), ((ja) this).field_x, var4 - var3 >> 1, var6 - var5 >> 1);
    }

    final void f(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((ja) this).field_r;
          param1 = param1 + ((ja) this).field_y;
          var4 = param0 + param1 * oo.field_b;
          var5 = 0;
          var6 = ((ja) this).field_w;
          var7 = ((ja) this).field_x;
          var8 = oo.field_b - var7;
          var9 = 0;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var10 = oo.field_e - param1;
            var6 = var6 - var10;
            param1 = oo.field_e;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= oo.field_d) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var10 = oo.field_f - param0;
            var7 = var7 - var10;
            param0 = oo.field_f;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= oo.field_g) {
            break L3;
          } else {
            var10 = param0 + var7 - oo.field_g;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            ja.b(oo.field_i, ((ja) this).field_B, param2, var5, var4, var7, var6, var8, var9);
            return;
          } else {
            return;
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          } else {
            param6 = -param9;
            L1: while (true) {
              if (param6 >= 0) {
                param7 = param7 + param11;
                param5 = param5 + param12;
                param8++;
                continue L0;
              } else {
                int incrementValue$66 = param5;
                param5++;
                param0 = param4[incrementValue$66];
                if (param0 == 0) {
                  param7++;
                  param6++;
                  continue L1;
                } else {
                  param1 = param3[param7];
                  param2 = param0 + param1;
                  param0 = (param0 & 16711935) + (param1 & 16711935);
                  param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                  int incrementValue$67 = param7;
                  param7++;
                  param3[incrementValue$67] = param2 - param1 | param1 - (param1 >>> 8);
                  param6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void h(int param0, int param1, int param2) {
        int var4 = oo.field_g;
        if (param0 + param2 < oo.field_g) {
            oo.field_g = param0 + param2;
        }
        while (param0 < oo.field_g) {
            ((ja) this).g(param0, param1);
            param0 = param0 + ((ja) this).field_z;
        }
        oo.field_g = var4;
    }

    final void j() {
        int var2 = 0;
        int var3 = 0;
        if (((ja) this).field_x == ((ja) this).field_z) {
            if (((ja) this).field_w == ((ja) this).field_u) {
                return;
            }
        }
        int[] var1 = new int[((ja) this).field_z * ((ja) this).field_u];
        for (var2 = 0; var2 < ((ja) this).field_w; var2++) {
            for (var3 = 0; var3 < ((ja) this).field_x; var3++) {
                var1[(var2 + ((ja) this).field_y) * ((ja) this).field_z + (var3 + ((ja) this).field_r)] = ((ja) this).field_B[var2 * ((ja) this).field_x + var3];
            }
        }
        ((ja) this).field_B = var1;
        ((ja) this).field_x = ((ja) this).field_z;
        ((ja) this).field_w = ((ja) this).field_u;
        ((ja) this).field_r = 0;
        ((ja) this).field_y = 0;
    }

    final void d(int param0, int param1, int param2, int param3) {
        int var5 = ((ja) this).field_z << 3;
        int var6 = ((ja) this).field_u << 3;
        param0 = (param0 << 4) + (var5 & 15);
        param1 = (param1 << 4) + (var6 & 15);
        ((ja) this).a(var5, var6, param0, param1, param2, param3);
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        param2 = param2 - (param0 + ((ja) this).field_r);
        if (param2 < 0) {
          return false;
        } else {
          if (param2 < ((ja) this).field_x) {
            L0: {
              param3 = param3 - (param1 + ((ja) this).field_y);
              if (param3 < 0) {
                break L0;
              } else {
                if (param3 < ((ja) this).field_w) {
                  L1: {
                    if (((ja) this).field_B[param3 * ((ja) this).field_x + param2] == 0) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L1;
                    }
                  }
                  return stackIn_11_0 != 0;
                } else {
                  break L0;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = oo.field_d;
        if (param1 + param2 < oo.field_d) {
            oo.field_d = param1 + param2;
        }
        while (param1 < oo.field_d) {
            ((ja) this).g(param0, param1);
            param1 = param1 + ((ja) this).field_u;
        }
        oo.field_d = var4;
    }

    final ja c() {
        int var3 = 0;
        ja var1 = new ja(((ja) this).field_x, ((ja) this).field_w);
        var1.field_z = ((ja) this).field_z;
        var1.field_u = ((ja) this).field_u;
        var1.field_r = ((ja) this).field_r;
        var1.field_y = ((ja) this).field_y;
        int var2 = ((ja) this).field_B.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_B[var3] = ((ja) this).field_B[var3];
        }
        return var1;
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    int incrementValue$218 = param3;
                    param3++;
                    if (param1[incrementValue$218] == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      int incrementValue$219 = param4;
                      param4++;
                      param0[incrementValue$219] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$220 = param3;
                  param3++;
                  if (param1[incrementValue$220] == 0) {
                    param4++;
                    break L3;
                  } else {
                    int incrementValue$221 = param4;
                    param4++;
                    param0[incrementValue$221] = param2;
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$222 = param3;
                  param3++;
                  if (param1[incrementValue$222] == 0) {
                    param4++;
                    break L4;
                  } else {
                    int incrementValue$223 = param4;
                    param4++;
                    param0[incrementValue$223] = param2;
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$224 = param3;
                  param3++;
                  if (param1[incrementValue$224] == 0) {
                    param4++;
                    break L5;
                  } else {
                    int incrementValue$225 = param4;
                    param4++;
                    param0[incrementValue$225] = param2;
                    break L5;
                  }
                }
                int incrementValue$226 = param3;
                param3++;
                if (param1[incrementValue$226] == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  int incrementValue$227 = param4;
                  param4++;
                  param0[incrementValue$227] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                param2 = param1[(param3 >> 16) + var14];
                if (param2 != 0) {
                    int incrementValue$1 = param5;
                    param5++;
                    param0[incrementValue$1] = param2;
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

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var11 = 256 - param9;
        var12 = (param10 & 16711935) * var11 & -16711936;
        var13 = (param10 & 65280) * var11 & 16711680;
        param10 = (var12 | var13) >>> 8;
        var14 = -param6;
        L0: while (true) {
          if (var14 >= 0) {
            return;
          } else {
            var15 = -param5;
            L1: while (true) {
              if (var15 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var14++;
                continue L0;
              } else {
                int incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
                if (param2 == 0) {
                  param4++;
                  var15++;
                  continue L1;
                } else {
                  var12 = (param2 & 16711935) * param9 & -16711936;
                  var13 = (param2 & 65280) * param9 & 16711680;
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((var12 | var13) >>> 8) + param10;
                  var15++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((ja) this).field_r;
          param1 = param1 + ((ja) this).field_y;
          var4 = param0 + param1 * oo.field_b;
          var5 = 0;
          var6 = ((ja) this).field_w;
          var7 = ((ja) this).field_x;
          var8 = oo.field_b - var7;
          var9 = 0;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var10 = oo.field_e - param1;
            var6 = var6 - var10;
            param1 = oo.field_e;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= oo.field_d) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var10 = oo.field_f - param0;
            var7 = var7 - var10;
            param0 = oo.field_f;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= oo.field_g) {
            break L3;
          } else {
            var10 = param0 + var7 - oo.field_g;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            L4: {
              if (param2 != 256) {
                ja.a(0, 0, 0, oo.field_i, ((ja) this).field_B, var5, 0, var4, 0, var7, var6, var8, var9, param2);
                break L4;
              } else {
                ja.a(0, 0, 0, oo.field_i, ((ja) this).field_B, var5, 0, var4, 0, var7, var6, var8, var9);
                break L4;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    void g(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((ja) this).field_r;
          param1 = param1 + ((ja) this).field_y;
          var4 = param0 + param1 * oo.field_b;
          var5 = 0;
          var6 = ((ja) this).field_w;
          var7 = ((ja) this).field_x;
          var8 = oo.field_b - var7;
          var9 = 0;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var10 = oo.field_e - param1;
            var6 = var6 - var10;
            param1 = oo.field_e;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= oo.field_d) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var10 = oo.field_f - param0;
            var7 = var7 - var10;
            param0 = oo.field_f;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= oo.field_g) {
            break L3;
          } else {
            var10 = param0 + var7 - oo.field_g;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            ja.c(oo.field_i, ((ja) this).field_B, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((ja) this).field_r;
          param1 = param1 + ((ja) this).field_y;
          var3 = param0 + param1 * oo.field_b;
          var4 = 0;
          var5 = ((ja) this).field_w;
          var6 = ((ja) this).field_x;
          var7 = oo.field_b - var6;
          var8 = 0;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var9 = oo.field_e - param1;
            var5 = var5 - var9;
            param1 = oo.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= oo.field_d) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var9 = oo.field_f - param0;
            var6 = var6 - var9;
            param0 = oo.field_f;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= oo.field_g) {
            break L3;
          } else {
            var9 = param0 + var6 - oo.field_g;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            ja.a(0, oo.field_i, ((ja) this).field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        double var7 = 0.0;
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
        double var25 = 0.0;
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
        if (param5 != 0) {
          L0: {
            param0 = param0 - (((ja) this).field_r << 4);
            param1 = param1 - (((ja) this).field_y << 4);
            var7 = (double)(param4 & 65535) * 0.00009587379924285257;
            var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
            var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
            var11 = -param0 * var10 + -param1 * var9;
            var12 = --param0 * var9 + -param1 * var10;
            var13 = ((((ja) this).field_x << 4) - param0) * var10 + -param1 * var9;
            var14 = -((((ja) this).field_x << 4) - param0) * var9 + -param1 * var10;
            var15 = -param0 * var10 + ((((ja) this).field_w << 4) - param1) * var9;
            var16 = --param0 * var9 + ((((ja) this).field_w << 4) - param1) * var10;
            var17 = ((((ja) this).field_x << 4) - param0) * var10 + ((((ja) this).field_w << 4) - param1) * var9;
            var18 = -((((ja) this).field_x << 4) - param0) * var9 + ((((ja) this).field_w << 4) - param1) * var10;
            if (var11 >= var13) {
              var19 = var13;
              var20 = var11;
              break L0;
            } else {
              var19 = var11;
              var20 = var13;
              break L0;
            }
          }
          L1: {
            if (var15 >= var19) {
              break L1;
            } else {
              var19 = var15;
              break L1;
            }
          }
          L2: {
            if (var17 >= var19) {
              break L2;
            } else {
              var19 = var17;
              break L2;
            }
          }
          L3: {
            if (var15 <= var20) {
              break L3;
            } else {
              var20 = var15;
              break L3;
            }
          }
          L4: {
            if (var17 <= var20) {
              break L4;
            } else {
              var20 = var17;
              break L4;
            }
          }
          L5: {
            if (var12 >= var14) {
              var21 = var14;
              var22 = var12;
              break L5;
            } else {
              var21 = var12;
              var22 = var14;
              break L5;
            }
          }
          L6: {
            if (var16 >= var21) {
              break L6;
            } else {
              var21 = var16;
              break L6;
            }
          }
          L7: {
            if (var18 >= var21) {
              break L7;
            } else {
              var21 = var18;
              break L7;
            }
          }
          L8: {
            if (var16 <= var22) {
              break L8;
            } else {
              var22 = var16;
              break L8;
            }
          }
          L9: {
            if (var18 <= var22) {
              break L9;
            } else {
              var22 = var18;
              break L9;
            }
          }
          L10: {
            var19 = var19 >> 12;
            var20 = var20 + 4095 >> 12;
            var21 = var21 >> 12;
            var22 = var22 + 4095 >> 12;
            var19 = var19 + param2;
            var20 = var20 + param2;
            var21 = var21 + param3;
            var22 = var22 + param3;
            var19 = var19 >> 4;
            var20 = var20 + 15 >> 4;
            var21 = var21 >> 4;
            var22 = var22 + 15 >> 4;
            if (var19 >= oo.field_f) {
              break L10;
            } else {
              var19 = oo.field_f;
              break L10;
            }
          }
          L11: {
            if (var20 <= oo.field_g) {
              break L11;
            } else {
              var20 = oo.field_g;
              break L11;
            }
          }
          L12: {
            if (var21 >= oo.field_e) {
              break L12;
            } else {
              var21 = oo.field_e;
              break L12;
            }
          }
          L13: {
            if (var22 <= oo.field_d) {
              break L13;
            } else {
              var22 = oo.field_d;
              break L13;
            }
          }
          var20 = var19 - var20;
          if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
              L14: {
                var23 = var21 * oo.field_b + var19;
                var24 = oo.field_b + var20;
                var25 = 16777216.0 / (double)param5;
                var27 = (int)Math.floor(Math.sin(var7) * var25 + 0.5);
                var28 = (int)Math.floor(Math.cos(var7) * var25 + 0.5);
                var29 = (var19 << 4) + 8 - param2;
                var30 = (var21 << 4) + 8 - param3;
                var31 = (param0 << 8) - 2048 - (var30 * var27 >> 4);
                var32 = (param1 << 8) - 2048 + (var30 * var28 >> 4);
                if (var28 >= 0) {
                  if (var27 >= 0) {
                    var36 = var22;
                    L15: while (true) {
                      if (var36 >= 0) {
                        break L14;
                      } else {
                        L16: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 + 4096;
                          if (var35 < 0) {
                            if (var28 != 0) {
                              var35 = (var28 - 1 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L16;
                            } else {
                              var23 = var23 - var39;
                              break L16;
                            }
                          } else {
                            var40 = 1;
                            break L16;
                          }
                        }
                        L17: {
                          if (var40 == 0) {
                            break L17;
                          } else {
                            L18: {
                              var40 = 0;
                              var35 = var38 + 4096;
                              if (var35 < 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - 1 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L18;
                                } else {
                                  var23 = var23 - var39;
                                  break L18;
                                }
                              } else {
                                var40 = 1;
                                break L18;
                              }
                            }
                            if (var40 == 0) {
                              break L17;
                            } else {
                              L19: while (true) {
                                L20: {
                                  if (var39 >= 0) {
                                    break L20;
                                  } else {
                                    var33 = var37 >> 12;
                                    if (var37 >> 12 >= ((ja) this).field_x) {
                                      break L20;
                                    } else {
                                      var34 = var38 >> 12;
                                      if (var38 >> 12 < ((ja) this).field_w) {
                                        this.b(var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L19;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L17;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L15;
                      }
                    }
                  } else {
                    var36 = var22;
                    L21: while (true) {
                      if (var36 >= 0) {
                        break L14;
                      } else {
                        L22: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 + 4096;
                          if (var35 < 0) {
                            if (var28 != 0) {
                              var35 = (var28 - 1 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L22;
                            } else {
                              var23 = var23 - var39;
                              break L22;
                            }
                          } else {
                            var40 = 1;
                            break L22;
                          }
                        }
                        L23: {
                          if (var40 == 0) {
                            break L23;
                          } else {
                            L24: {
                              var40 = 0;
                              var35 = var38 - (((ja) this).field_w << 12);
                              if (var35 >= 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L24;
                                } else {
                                  var23 = var23 - var39;
                                  break L24;
                                }
                              } else {
                                var40 = 1;
                                break L24;
                              }
                            }
                            if (var40 == 0) {
                              break L23;
                            } else {
                              L25: while (true) {
                                L26: {
                                  if (var39 >= 0) {
                                    break L26;
                                  } else {
                                    if (var38 < -4096) {
                                      break L26;
                                    } else {
                                      var33 = var37 >> 12;
                                      if (var37 >> 12 < ((ja) this).field_x) {
                                        var34 = var38 >> 12;
                                        this.b(var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L23;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L21;
                      }
                    }
                  }
                } else {
                  if (var27 >= 0) {
                    var36 = var22;
                    L27: while (true) {
                      if (var36 >= 0) {
                        break L14;
                      } else {
                        L28: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 - (((ja) this).field_x << 12);
                          if (var35 >= 0) {
                            if (var28 != 0) {
                              var35 = (var28 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L28;
                            } else {
                              var23 = var23 - var39;
                              break L28;
                            }
                          } else {
                            var40 = 1;
                            break L28;
                          }
                        }
                        L29: {
                          if (var40 == 0) {
                            break L29;
                          } else {
                            L30: {
                              var40 = 0;
                              var35 = var38 + 4096;
                              if (var35 < 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - 1 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L30;
                                } else {
                                  var23 = var23 - var39;
                                  break L30;
                                }
                              } else {
                                var40 = 1;
                                break L30;
                              }
                            }
                            if (var40 == 0) {
                              break L29;
                            } else {
                              L31: while (true) {
                                L32: {
                                  if (var39 >= 0) {
                                    break L32;
                                  } else {
                                    if (var37 < -4096) {
                                      break L32;
                                    } else {
                                      var34 = var38 >> 12;
                                      if (var38 >> 12 < ((ja) this).field_w) {
                                        var33 = var37 >> 12;
                                        this.b(var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L29;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L27;
                      }
                    }
                  } else {
                    var36 = var22;
                    L33: while (true) {
                      if (var36 >= 0) {
                        return;
                      } else {
                        L34: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 - (((ja) this).field_x << 12);
                          if (var35 >= 0) {
                            if (var28 != 0) {
                              var35 = (var28 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L34;
                            } else {
                              var23 = var23 - var39;
                              break L34;
                            }
                          } else {
                            var40 = 1;
                            break L34;
                          }
                        }
                        L35: {
                          if (var40 == 0) {
                            break L35;
                          } else {
                            L36: {
                              var40 = 0;
                              var35 = var38 - (((ja) this).field_w << 12);
                              if (var35 >= 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L36;
                                } else {
                                  var23 = var23 - var39;
                                  break L36;
                                }
                              } else {
                                var40 = 1;
                                break L36;
                              }
                            }
                            if (var40 == 0) {
                              break L35;
                            } else {
                              L37: while (true) {
                                L38: {
                                  if (var39 >= 0) {
                                    break L38;
                                  } else {
                                    if (var37 < -4096) {
                                      break L38;
                                    } else {
                                      if (var38 >= -4096) {
                                        var33 = var37 >> 12;
                                        var34 = var38 >> 12;
                                        this.b(var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L37;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L35;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L33;
                      }
                    }
                  }
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
    }

    final void d() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        var1 = ((ja) this).field_w - 1;
        L0: while (true) {
          L1: {
            if (var1 < 0) {
              break L1;
            } else {
              var2 = var1 * ((ja) this).field_x;
              var3 = 0;
              L2: while (true) {
                if (var3 >= ((ja) this).field_x) {
                  var1--;
                  continue L0;
                } else {
                  if (((ja) this).field_B[var2 + var3] == 0) {
                    var3++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          var2 = 0;
          L3: while (true) {
            L4: {
              if (var2 >= var1) {
                break L4;
              } else {
                var3 = var2 * ((ja) this).field_x;
                var4 = 0;
                L5: while (true) {
                  if (var4 >= ((ja) this).field_x) {
                    var2++;
                    continue L3;
                  } else {
                    if (((ja) this).field_B[var3 + var4] == 0) {
                      var4++;
                      continue L5;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            var3 = ((ja) this).field_x - 1;
            L6: while (true) {
              L7: {
                if (var3 < 0) {
                  break L7;
                } else {
                  var4 = var2;
                  L8: while (true) {
                    if (var4 > var1) {
                      var3--;
                      continue L6;
                    } else {
                      if (((ja) this).field_B[var4 * ((ja) this).field_x + var3] == 0) {
                        var4++;
                        continue L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              }
              var4 = 0;
              L9: while (true) {
                L10: {
                  if (var4 >= var3) {
                    break L10;
                  } else {
                    var5 = var2;
                    L11: while (true) {
                      if (var5 > var1) {
                        var4++;
                        continue L9;
                      } else {
                        if (((ja) this).field_B[var5 * ((ja) this).field_x + var4] == 0) {
                          var5++;
                          continue L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (var4 != 0) {
                    break L12;
                  } else {
                    if (var3 != ((ja) this).field_x - 1) {
                      break L12;
                    } else {
                      if (var2 != 0) {
                        break L12;
                      } else {
                        if (var1 != ((ja) this).field_w - 1) {
                          break L12;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                var5 = var3 + 1 - var4;
                var6 = var1 + 1 - var2;
                var7 = new int[var5 * var6];
                var8 = 0;
                L13: while (true) {
                  if (var8 >= var6) {
                    ((ja) this).field_B = var7;
                    ((ja) this).field_x = var5;
                    ((ja) this).field_w = var6;
                    ((ja) this).field_r = ((ja) this).field_r + var4;
                    ((ja) this).field_y = ((ja) this).field_y + var2;
                    return;
                  } else {
                    var9 = 0;
                    L14: while (true) {
                      if (var9 >= var5) {
                        var8++;
                        continue L13;
                      } else {
                        var7[var8 * var5 + var9] = ((ja) this).field_B[(var8 + var2) * ((ja) this).field_x + (var9 + var4)];
                        var9++;
                        continue L14;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void b() {
        int var3 = 0;
        int var4 = 0;
        int[] var1 = new int[((ja) this).field_x * ((ja) this).field_w];
        int var2 = 0;
        for (var3 = 0; var3 < ((ja) this).field_x; var3++) {
            for (var4 = ((ja) this).field_w - 1; var4 >= 0; var4--) {
                int incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = ((ja) this).field_B[var3 + var4 * ((ja) this).field_x];
            }
        }
        ((ja) this).field_B = var1;
        var3 = ((ja) this).field_y;
        ((ja) this).field_y = ((ja) this).field_r;
        ((ja) this).field_r = ((ja) this).field_u - ((ja) this).field_w - var3;
        var3 = ((ja) this).field_w;
        ((ja) this).field_w = ((ja) this).field_x;
        ((ja) this).field_x = var3;
        var3 = ((ja) this).field_u;
        ((ja) this).field_u = ((ja) this).field_z;
        ((ja) this).field_z = var3;
    }

    final void e(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param2 != 256) {
          L0: {
            param0 = param0 + ((ja) this).field_r;
            param1 = param1 + ((ja) this).field_y;
            var5 = param0 + param1 * oo.field_b;
            var6 = 0;
            var7 = ((ja) this).field_w;
            var8 = ((ja) this).field_x;
            var9 = oo.field_b - var8;
            var10 = 0;
            if (param1 >= oo.field_e) {
              break L0;
            } else {
              var11 = oo.field_e - param1;
              var7 = var7 - var11;
              param1 = oo.field_e;
              var6 = var6 + var11 * var8;
              var5 = var5 + var11 * oo.field_b;
              break L0;
            }
          }
          L1: {
            if (param1 + var7 <= oo.field_d) {
              break L1;
            } else {
              var7 = var7 - (param1 + var7 - oo.field_d);
              break L1;
            }
          }
          L2: {
            if (param0 >= oo.field_f) {
              break L2;
            } else {
              var11 = oo.field_f - param0;
              var8 = var8 - var11;
              param0 = oo.field_f;
              var6 = var6 + var11;
              var5 = var5 + var11;
              var10 = var10 + var11;
              var9 = var9 + var11;
              break L2;
            }
          }
          L3: {
            if (param0 + var8 <= oo.field_g) {
              break L3;
            } else {
              var11 = param0 + var8 - oo.field_g;
              var8 = var8 - var11;
              var10 = var10 + var11;
              var9 = var9 + var11;
              break L3;
            }
          }
          if (var8 <= 0) {
            return;
          } else {
            if (var7 > 0) {
              ja.a(oo.field_i, ((ja) this).field_B, 0, var6, var5, var8, var7, var9, var10, param2, param3);
              return;
            } else {
              return;
            }
          }
        } else {
          ((ja) this).g(param0, param1);
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    int incrementValue$218 = param3;
                    param3--;
                    param2 = param1[incrementValue$218];
                    if (param2 == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      int incrementValue$219 = param4;
                      param4++;
                      param0[incrementValue$219] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$220 = param3;
                  param3--;
                  param2 = param1[incrementValue$220];
                  if (param2 == 0) {
                    param4++;
                    break L3;
                  } else {
                    int incrementValue$221 = param4;
                    param4++;
                    param0[incrementValue$221] = param2;
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$222 = param3;
                  param3--;
                  param2 = param1[incrementValue$222];
                  if (param2 == 0) {
                    param4++;
                    break L4;
                  } else {
                    int incrementValue$223 = param4;
                    param4++;
                    param0[incrementValue$223] = param2;
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$224 = param3;
                  param3--;
                  param2 = param1[incrementValue$224];
                  if (param2 == 0) {
                    param4++;
                    break L5;
                  } else {
                    int incrementValue$225 = param4;
                    param4++;
                    param0[incrementValue$225] = param2;
                    break L5;
                  }
                }
                int incrementValue$226 = param3;
                param3--;
                param2 = param1[incrementValue$226];
                if (param2 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  int incrementValue$227 = param4;
                  param4++;
                  param0[incrementValue$227] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void g() {
        int var3 = 0;
        int var4 = 0;
        int[] var1 = new int[((ja) this).field_x * ((ja) this).field_w];
        int var2 = 0;
        for (var3 = ((ja) this).field_x - 1; var3 >= 0; var3--) {
            for (var4 = 0; var4 < ((ja) this).field_w; var4++) {
                int incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = ((ja) this).field_B[var3 + var4 * ((ja) this).field_x];
            }
        }
        ((ja) this).field_B = var1;
        var3 = ((ja) this).field_r;
        ((ja) this).field_r = ((ja) this).field_y;
        ((ja) this).field_y = ((ja) this).field_z - ((ja) this).field_x - var3;
        var3 = ((ja) this).field_w;
        ((ja) this).field_w = ((ja) this).field_x;
        ((ja) this).field_x = var3;
        var3 = ((ja) this).field_u;
        ((ja) this).field_u = ((ja) this).field_z;
        ((ja) this).field_z = var3;
    }

    void i(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((ja) this).field_r;
          param1 = param1 + ((ja) this).field_y;
          var4 = param0 + param1 * oo.field_b;
          var5 = 0;
          var6 = ((ja) this).field_w;
          var7 = ((ja) this).field_x;
          var8 = oo.field_b - var7;
          var9 = 0;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var10 = oo.field_e - param1;
            var6 = var6 - var10;
            param1 = oo.field_e;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= oo.field_d) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var10 = oo.field_f - param0;
            var7 = var7 - var10;
            param0 = oo.field_f;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= oo.field_g) {
            break L3;
          } else {
            var10 = param0 + var7 - oo.field_g;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            ja.b(oo.field_i, ((ja) this).field_B, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    final void h() {
        int var1 = 0;
        int var2 = 0;
        var1 = -1;
        var2 = ((ja) this).field_x * ((ja) this).field_w - 4;
        L0: while (true) {
          if (var1 >= var2) {
            var2 += 3;
            L1: while (true) {
              if (var1 >= var2) {
                return;
              } else {
                var1++;
                if (((ja) this).field_B[var1] != 0) {
                  continue L1;
                } else {
                  ((ja) this).field_B[var1] = 1;
                  continue L1;
                }
              }
            }
          } else {
            L2: {
              var1++;
              if (((ja) this).field_B[var1] != 0) {
                break L2;
              } else {
                ((ja) this).field_B[var1] = 1;
                break L2;
              }
            }
            L3: {
              var1++;
              if (((ja) this).field_B[var1] != 0) {
                break L3;
              } else {
                ((ja) this).field_B[var1] = 1;
                break L3;
              }
            }
            L4: {
              var1++;
              if (((ja) this).field_B[var1] != 0) {
                break L4;
              } else {
                ((ja) this).field_B[var1] = 1;
                break L4;
              }
            }
            var1++;
            if (((ja) this).field_B[var1] != 0) {
              continue L0;
            } else {
              ((ja) this).field_B[var1] = 1;
              continue L0;
            }
          }
        }
    }

    void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + (((ja) this).field_z - ((ja) this).field_x - ((ja) this).field_r);
          param1 = param1 + ((ja) this).field_y;
          var3 = param0 + param1 * oo.field_b;
          var4 = ((ja) this).field_x - 1;
          var5 = ((ja) this).field_w;
          var6 = ((ja) this).field_x;
          var7 = oo.field_b - var6;
          var8 = var6 + var6;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var9 = oo.field_e - param1;
            var5 = var5 - var9;
            param1 = oo.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= oo.field_d) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var9 = oo.field_f - param0;
            var6 = var6 - var9;
            param0 = oo.field_f;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= oo.field_g) {
            break L3;
          } else {
            var9 = param0 + var6 - oo.field_g;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            ja.a(oo.field_i, ((ja) this).field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((ja) this).field_r;
          param1 = param1 + ((ja) this).field_y;
          var4 = param0 + param1 * oo.field_b;
          var5 = 0;
          var6 = ((ja) this).field_w;
          var7 = ((ja) this).field_x;
          var8 = oo.field_b - var7;
          var9 = 0;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var10 = oo.field_e - param1;
            var6 = var6 - var10;
            param1 = oo.field_e;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= oo.field_d) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var10 = oo.field_f - param0;
            var7 = var7 - var10;
            param0 = oo.field_f;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= oo.field_g) {
            break L3;
          } else {
            var10 = param0 + var7 - oo.field_g;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            ja.b(oo.field_i, ((ja) this).field_B, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    final void i() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var1 = ((ja) this).field_B;
        for (var2 = (((ja) this).field_w >> 1) - 1; var2 >= 0; var2--) {
            var3 = var2 * ((ja) this).field_x;
            var4 = (((ja) this).field_w - var2 - 1) * ((ja) this).field_x;
            for (var5 = -((ja) this).field_x; var5 < 0; var5++) {
                var6 = var1[var3];
                var1[var3] = var1[var4];
                var1[var4] = var6;
                var3++;
                var4++;
            }
        }
        ((ja) this).field_y = ((ja) this).field_u - ((ja) this).field_w - ((ja) this).field_y;
    }

    final void g(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var2 = new int[((ja) this).field_x * ((ja) this).field_w];
        var3 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((ja) this).field_w) {
            ((ja) this).field_B = var2;
            return;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((ja) this).field_x) {
                var4++;
                continue L0;
              } else {
                L2: {
                  var6 = ((ja) this).field_B[var3];
                  if (var6 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (var5 <= 0) {
                        break L3;
                      } else {
                        if (((ja) this).field_B[var3 - 1] == 0) {
                          break L3;
                        } else {
                          var6 = param0;
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var4 <= 0) {
                        break L4;
                      } else {
                        if (((ja) this).field_B[var3 - ((ja) this).field_x] == 0) {
                          break L4;
                        } else {
                          var6 = param0;
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (var5 >= ((ja) this).field_x - 1) {
                        break L5;
                      } else {
                        if (((ja) this).field_B[var3 + 1] == 0) {
                          break L5;
                        } else {
                          var6 = param0;
                          break L2;
                        }
                      }
                    }
                    if (var4 >= ((ja) this).field_w - 1) {
                      break L2;
                    } else {
                      if (((ja) this).field_B[var3 + ((ja) this).field_x] == 0) {
                        break L2;
                      } else {
                        var6 = param0;
                        break L2;
                      }
                    }
                  }
                }
                int incrementValue$2 = var3;
                var3++;
                var2[incrementValue$2] = var6;
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    void f(int param0, int param1, int param2, int param3) {
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
        if (param2 <= 0) {
          return;
        } else {
          if (param3 > 0) {
            L0: {
              var5 = ((ja) this).field_x;
              var6 = ((ja) this).field_w;
              var7 = 0;
              var8 = 0;
              var9 = ((ja) this).field_z;
              var10 = ((ja) this).field_u;
              var11 = (var9 << 16) / param2;
              var12 = (var10 << 16) / param3;
              if (((ja) this).field_r <= 0) {
                break L0;
              } else {
                var13 = ((((ja) this).field_r << 16) + var11 - 1) / var11;
                param0 = param0 + var13;
                var7 = var7 + (var13 * var11 - (((ja) this).field_r << 16));
                break L0;
              }
            }
            L1: {
              if (((ja) this).field_y <= 0) {
                break L1;
              } else {
                var13 = ((((ja) this).field_y << 16) + var12 - 1) / var12;
                param1 = param1 + var13;
                var8 = var8 + (var13 * var12 - (((ja) this).field_y << 16));
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
              var13 = param0 + param1 * oo.field_b;
              var14 = oo.field_b - param2;
              if (param1 + param3 <= oo.field_d) {
                break L4;
              } else {
                param3 = param3 - (param1 + param3 - oo.field_d);
                break L4;
              }
            }
            L5: {
              if (param1 >= oo.field_e) {
                break L5;
              } else {
                var15 = oo.field_e - param1;
                param3 = param3 - var15;
                var13 = var13 + var15 * oo.field_b;
                var8 = var8 + var12 * var15;
                break L5;
              }
            }
            L6: {
              if (param0 + param2 <= oo.field_g) {
                break L6;
              } else {
                var15 = param0 + param2 - oo.field_g;
                param2 = param2 - var15;
                var14 = var14 + var15;
                break L6;
              }
            }
            L7: {
              if (param0 >= oo.field_f) {
                break L7;
              } else {
                var15 = oo.field_f - param0;
                param2 = param2 - var15;
                var13 = var13 + var15;
                var7 = var7 + var11 * var15;
                var14 = var14 + var15;
                break L7;
              }
            }
            ja.a(oo.field_i, ((ja) this).field_B, 0, var7, var8, var13, var14, param2, param3, var11, var12, var5);
            return;
          } else {
            return;
          }
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        var15 = -param6;
        L0: while (true) {
          if (var15 >= 0) {
            return;
          } else {
            var16 = var14;
            L1: while (true) {
              if (var16 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var15++;
                continue L0;
              } else {
                int incrementValue$4 = param3;
                param3++;
                param2 = param1[incrementValue$4];
                if (param2 == 0) {
                  param4++;
                  var16++;
                  continue L1;
                } else {
                  L2: {
                    var17 = param2 >> 16 & 255;
                    var18 = param2 >> 8 & 255;
                    var19 = param2 & 255;
                    if (var17 != var18) {
                      break L2;
                    } else {
                      if (var18 != var19) {
                        break L2;
                      } else {
                        if (var17 > 128) {
                          int incrementValue$5 = param4;
                          param4++;
                          param0[incrementValue$5] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                          var16++;
                          continue L1;
                        } else {
                          int incrementValue$6 = param4;
                          param4++;
                          param0[incrementValue$6] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
                          var16++;
                          continue L1;
                        }
                      }
                    }
                  }
                  int incrementValue$7 = param4;
                  param4++;
                  param0[incrementValue$7] = param2;
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (param2 != 256) {
          L0: {
            param0 = param0 + ((ja) this).field_r;
            param1 = param1 + ((ja) this).field_y;
            var4 = param0 + param1 * oo.field_b;
            var5 = 0;
            var6 = ((ja) this).field_w;
            var7 = ((ja) this).field_x;
            var8 = oo.field_b - var7;
            var9 = 0;
            if (param1 >= oo.field_e) {
              break L0;
            } else {
              var10 = oo.field_e - param1;
              var6 = var6 - var10;
              param1 = oo.field_e;
              var5 = var5 + var10 * var7;
              var4 = var4 + var10 * oo.field_b;
              break L0;
            }
          }
          L1: {
            if (param1 + var6 <= oo.field_d) {
              break L1;
            } else {
              var6 = var6 - (param1 + var6 - oo.field_d);
              break L1;
            }
          }
          L2: {
            if (param0 >= oo.field_f) {
              break L2;
            } else {
              var10 = oo.field_f - param0;
              var7 = var7 - var10;
              param0 = oo.field_f;
              var5 = var5 + var10;
              var4 = var4 + var10;
              var9 = var9 + var10;
              var8 = var8 + var10;
              break L2;
            }
          }
          L3: {
            if (param0 + var7 <= oo.field_g) {
              break L3;
            } else {
              var10 = param0 + var7 - oo.field_g;
              var7 = var7 - var10;
              var9 = var9 + var10;
              var8 = var8 + var10;
              break L3;
            }
          }
          if (var7 <= 0) {
            return;
          } else {
            if (var6 > 0) {
              ja.a(oo.field_i, ((ja) this).field_B, 0, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              return;
            }
          }
        } else {
          ((ja) this).g(param0, param1);
          return;
        }
    }

    final void e() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var1 = ((ja) this).field_B;
        for (var2 = ((ja) this).field_w - 1; var2 >= 0; var2--) {
            var3 = var2 * ((ja) this).field_x;
            var4 = (var2 + 1) * ((ja) this).field_x;
            while (var3 < var4) {
                var4--;
                var5 = var1[var3];
                var1[var3] = var1[var4];
                var1[var4] = var5;
                var3++;
            }
        }
        ((ja) this).field_r = ((ja) this).field_z - ((ja) this).field_x - ((ja) this).field_r;
    }

    void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + (((ja) this).field_z - ((ja) this).field_x - ((ja) this).field_r);
          param1 = param1 + (((ja) this).field_u - ((ja) this).field_w - ((ja) this).field_y);
          var3 = param0 + (param1 + ((ja) this).field_w - 1) * oo.field_b;
          var4 = ((ja) this).field_x - 1;
          var5 = ((ja) this).field_w;
          var6 = ((ja) this).field_x;
          var7 = -oo.field_b - var6;
          var8 = var6 + var6;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var5 = var5 - (oo.field_e - param1);
            param1 = oo.field_e;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= oo.field_d) {
            break L1;
          } else {
            var9 = param1 + var5 - oo.field_d;
            var5 = var5 - var9;
            var3 = var3 - var9 * oo.field_b;
            var4 = var4 + var9 * var6;
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var9 = oo.field_f - param0;
            var6 = var6 - var9;
            param0 = oo.field_f;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= oo.field_g) {
            break L3;
          } else {
            var9 = param0 + var6 - oo.field_g;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            ja.a(oo.field_i, ((ja) this).field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    final void a() {
        oo.a(((ja) this).field_B, ((ja) this).field_x, ((ja) this).field_w);
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    int incrementValue$218 = param3;
                    param3++;
                    param2 = param1[incrementValue$218];
                    if (param2 == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      int incrementValue$219 = param4;
                      param4++;
                      param0[incrementValue$219] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$220 = param3;
                  param3++;
                  param2 = param1[incrementValue$220];
                  if (param2 == 0) {
                    param4++;
                    break L3;
                  } else {
                    int incrementValue$221 = param4;
                    param4++;
                    param0[incrementValue$221] = param2;
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$222 = param3;
                  param3++;
                  param2 = param1[incrementValue$222];
                  if (param2 == 0) {
                    param4++;
                    break L4;
                  } else {
                    int incrementValue$223 = param4;
                    param4++;
                    param0[incrementValue$223] = param2;
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$224 = param3;
                  param3++;
                  param2 = param1[incrementValue$224];
                  if (param2 == 0) {
                    param4++;
                    break L5;
                  } else {
                    int incrementValue$225 = param4;
                    param4++;
                    param0[incrementValue$225] = param2;
                    break L5;
                  }
                }
                int incrementValue$226 = param3;
                param3++;
                param2 = param1[incrementValue$226];
                if (param2 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  int incrementValue$227 = param4;
                  param4++;
                  param0[incrementValue$227] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var8 = 0;
        L0: while (true) {
          if (var8 >= param7) {
            return;
          } else {
            var9 = 0;
            L1: while (true) {
              if (var9 >= param6) {
                var8++;
                param1 = param1 + param3;
                param2 = param2 + param4;
                continue L0;
              } else {
                L2: {
                  var11 = oo.field_i[param2] & 16711935;
                  var12 = oo.field_i[param2] & 65280;
                  var13 = 0;
                  var14 = 0;
                  var10 = param0[param1];
                  if (param0[param1] != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L2;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L2;
                  }
                }
                L3: {
                  var10 = param0[param1 + 1];
                  if (param0[param1 + 1] != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L3;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L3;
                  }
                }
                L4: {
                  var10 = param0[param1 + param5];
                  if (param0[param1 + param5] != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L4;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L4;
                  }
                }
                L5: {
                  var10 = param0[param1 + param5 + 1];
                  if (param0[param1 + param5 + 1] != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L5;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L5;
                  }
                }
                int incrementValue$1 = param2;
                param2++;
                oo.field_i[incrementValue$1] = (var13 & 66847740 | var14 & 261120) >> 2;
                var9++;
                param1 += 2;
                continue L1;
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        for (var8 = -param5; var8 < 0; var8++) {
            var9 = param3 + param4 - 3;
            while (param3 < var9) {
                int incrementValue$0 = param3;
                param3++;
                int incrementValue$1 = param2;
                param2++;
                param0[incrementValue$0] = param1[incrementValue$1];
                int incrementValue$2 = param3;
                param3++;
                int incrementValue$3 = param2;
                param2++;
                param0[incrementValue$2] = param1[incrementValue$3];
                int incrementValue$4 = param3;
                param3++;
                int incrementValue$5 = param2;
                param2++;
                param0[incrementValue$4] = param1[incrementValue$5];
                int incrementValue$6 = param3;
                param3++;
                int incrementValue$7 = param2;
                param2++;
                param0[incrementValue$6] = param1[incrementValue$7];
            }
            var9 += 3;
            while (param3 < var9) {
                int incrementValue$8 = param3;
                param3++;
                int incrementValue$9 = param2;
                param2++;
                param0[incrementValue$8] = param1[incrementValue$9];
            }
            param3 = param3 + param6;
            param2 = param2 + param7;
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((ja) this).field_B.length) {
            return;
          } else {
            var5 = ((ja) this).field_B[var4];
            if (var5 != 0) {
              L1: {
                var6 = var5 >> 16 & 255;
                var6 = var6 + param0;
                if (var6 >= 1) {
                  if (var6 <= 255) {
                    break L1;
                  } else {
                    var6 = 255;
                    break L1;
                  }
                } else {
                  var6 = 1;
                  break L1;
                }
              }
              L2: {
                var7 = var5 >> 8 & 255;
                var7 = var7 + param1;
                if (var7 >= 1) {
                  if (var7 <= 255) {
                    break L2;
                  } else {
                    var7 = 255;
                    break L2;
                  }
                } else {
                  var7 = 1;
                  break L2;
                }
              }
              L3: {
                var8 = var5 & 255;
                var8 = var8 + param2;
                if (var8 >= 1) {
                  if (var8 <= 255) {
                    break L3;
                  } else {
                    var8 = 255;
                    break L3;
                  }
                } else {
                  var8 = 1;
                  break L3;
                }
              }
              ((ja) this).field_B[var4] = (var6 << 16) + (var7 << 8) + var8;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
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
        if (((ja) this).field_w != 0) {
          L0: {
            param0 = param0 + ((ja) this).field_r;
            param1 = param1 + ((ja) this).field_y;
            var5 = ((ja) this).field_w;
            var6 = ((ja) this).field_x;
            var7 = param2 << 8;
            var8 = (param3 - param2 << 8) / var5;
            var9 = 0;
            if (param0 >= oo.field_f) {
              break L0;
            } else {
              var6 = var6 - (oo.field_f - param0);
              var9 = var9 + (oo.field_f - param0);
              param0 = oo.field_f;
              break L0;
            }
          }
          L1: {
            if (param1 >= oo.field_e) {
              break L1;
            } else {
              var7 = var7 + (oo.field_e - param1) * var8;
              var5 = var5 - (oo.field_e - param1);
              var9 = var9 + (oo.field_e - param1) * ((ja) this).field_x;
              param1 = oo.field_e;
              break L1;
            }
          }
          L2: {
            if (param0 + var6 <= oo.field_g) {
              break L2;
            } else {
              var6 = oo.field_g - param0;
              break L2;
            }
          }
          L3: {
            if (param1 + var5 <= oo.field_d) {
              break L3;
            } else {
              var5 = oo.field_d - param1;
              break L3;
            }
          }
          var10 = oo.field_b - var6;
          var11 = ((ja) this).field_x - var6;
          var12 = param0 + param1 * oo.field_b;
          param1 = -var5;
          L4: while (true) {
            if (param1 >= 0) {
              return;
            } else {
              var13 = var7 >> 8;
              var14 = 256 - var13;
              if (var13 >= 0) {
                L5: {
                  if (var13 <= 255) {
                    param0 = -var6;
                    L6: while (true) {
                      if (param0 >= 0) {
                        break L5;
                      } else {
                        int incrementValue$4 = var9;
                        var9++;
                        var15 = ((ja) this).field_B[incrementValue$4];
                        if (var15 == 0) {
                          var12++;
                          param0++;
                          continue L6;
                        } else {
                          var16 = oo.field_i[var12];
                          var17 = (var16 & 16711935) * var14 + (var15 & 16711935) * var13 >> 8 & 16711935;
                          int incrementValue$5 = var12;
                          var12++;
                          oo.field_i[incrementValue$5] = var17 + ((var16 & 65280) * var14 + (var15 & 65280) * var13 >> 8 & 65280);
                          param0++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    param0 = -var6;
                    L7: while (true) {
                      if (param0 >= 0) {
                        break L5;
                      } else {
                        int incrementValue$6 = var9;
                        var9++;
                        var15 = ((ja) this).field_B[incrementValue$6];
                        if (var15 == 0) {
                          var12++;
                          param0++;
                          continue L7;
                        } else {
                          int incrementValue$7 = var12;
                          var12++;
                          oo.field_i[incrementValue$7] = var15;
                          param0++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                var12 = var12 + var10;
                var9 = var9 + var11;
                var7 = var7 + var8;
                param1++;
                continue L4;
              } else {
                param1++;
                continue L4;
              }
            }
          }
        } else {
          return;
        }
    }

    void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((ja) this).field_r;
          param1 = param1 + (((ja) this).field_u - ((ja) this).field_w - ((ja) this).field_y);
          var3 = param0 + (param1 + ((ja) this).field_w - 1) * oo.field_b;
          var4 = 0;
          var5 = ((ja) this).field_w;
          var6 = ((ja) this).field_x;
          var7 = -oo.field_b - var6;
          var8 = 0;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var5 = var5 - (oo.field_e - param1);
            param1 = oo.field_e;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= oo.field_d) {
            break L1;
          } else {
            var9 = param1 + var5 - oo.field_d;
            var5 = var5 - var9;
            var3 = var3 - var9 * oo.field_b;
            var4 = var4 + var9 * var6;
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var9 = oo.field_f - param0;
            var6 = var6 - var9;
            param0 = oo.field_f;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= oo.field_g) {
            break L3;
          } else {
            var9 = param0 + var6 - oo.field_g;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            ja.c(oo.field_i, ((ja) this).field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    ja(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((ja) this).field_z = param0;
        ((ja) this).field_u = param1;
        ((ja) this).field_r = param2;
        ((ja) this).field_y = param3;
        ((ja) this).field_x = param4;
        ((ja) this).field_w = param5;
        ((ja) this).field_B = param6;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param5;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                int incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
                if (param2 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var12 = (param2 & 16711935) * param9 & -16711936;
                  var13 = (param2 & 65280) * param9 & 16711680;
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = (var12 | var13) >>> 8;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((ja) this).field_r;
          param1 = param1 + ((ja) this).field_y;
          var3 = param0 + param1 * oo.field_b;
          var4 = 0;
          var5 = ((ja) this).field_w;
          var6 = ((ja) this).field_x;
          var7 = oo.field_b - var6;
          var8 = 0;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var9 = oo.field_e - param1;
            var5 = var5 - var9;
            param1 = oo.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= oo.field_d) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var9 = oo.field_f - param0;
            var6 = var6 - var9;
            param0 = oo.field_f;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= oo.field_g) {
            break L3;
          } else {
            var9 = param0 + var6 - oo.field_g;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            ja.a(oo.field_i, ((ja) this).field_B, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
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
        if (param2 <= 0) {
          return;
        } else {
          if (param3 > 0) {
            L0: {
              var6 = ((ja) this).field_x;
              var7 = ((ja) this).field_w;
              var8 = 0;
              var9 = 0;
              var10 = ((ja) this).field_z;
              var11 = ((ja) this).field_u;
              var12 = (var10 << 16) / param2;
              var13 = (var11 << 16) / param3;
              if (((ja) this).field_r <= 0) {
                break L0;
              } else {
                var14 = ((((ja) this).field_r << 16) + var12 - 1) / var12;
                param0 = param0 + var14;
                var8 = var8 + (var14 * var12 - (((ja) this).field_r << 16));
                break L0;
              }
            }
            L1: {
              if (((ja) this).field_y <= 0) {
                break L1;
              } else {
                var14 = ((((ja) this).field_y << 16) + var13 - 1) / var13;
                param1 = param1 + var14;
                var9 = var9 + (var14 * var13 - (((ja) this).field_y << 16));
                break L1;
              }
            }
            L2: {
              if (var6 >= var10) {
                break L2;
              } else {
                param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
                break L2;
              }
            }
            L3: {
              if (var7 >= var11) {
                break L3;
              } else {
                param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
                break L3;
              }
            }
            L4: {
              var14 = param0 + param1 * oo.field_b;
              var15 = oo.field_b - param2;
              if (param1 + param3 <= oo.field_d) {
                break L4;
              } else {
                param3 = param3 - (param1 + param3 - oo.field_d);
                break L4;
              }
            }
            L5: {
              if (param1 >= oo.field_e) {
                break L5;
              } else {
                var16 = oo.field_e - param1;
                param3 = param3 - var16;
                var14 = var14 + var16 * oo.field_b;
                var9 = var9 + var13 * var16;
                break L5;
              }
            }
            L6: {
              if (param0 + param2 <= oo.field_g) {
                break L6;
              } else {
                var16 = param0 + param2 - oo.field_g;
                param2 = param2 - var16;
                var15 = var15 + var16;
                break L6;
              }
            }
            L7: {
              if (param0 >= oo.field_f) {
                break L7;
              } else {
                var16 = oo.field_f - param0;
                param2 = param2 - var16;
                var14 = var14 + var16;
                var8 = var8 + var12 * var16;
                var15 = var15 + var16;
                break L7;
              }
            }
            ja.a(oo.field_i, ((ja) this).field_B, 0, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
            return;
          } else {
            return;
          }
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        var12 = param11 & 16711935;
        var13 = param11 >> 8 & 255;
        param6 = -param8;
        L0: while (true) {
          if (param6 >= 0) {
            return;
          } else {
            param5 = -param7;
            L1: while (true) {
              if (param5 >= 0) {
                param4 = param4 + param9;
                param3 = param3 + param10;
                param6++;
                continue L0;
              } else {
                int incrementValue$403 = param3;
                param3++;
                param2 = param1[incrementValue$403];
                if (param2 == 0) {
                  param4++;
                  param5++;
                  continue L1;
                } else {
                  if (param2 >> 8 != (param2 & 65535)) {
                    int incrementValue$404 = param4;
                    param4++;
                    param0[incrementValue$404] = param2;
                    param5++;
                    continue L1;
                  } else {
                    param2 = param2 & 255;
                    int incrementValue$405 = param4;
                    param4++;
                    param0[incrementValue$405] = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
                    param5++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    void g(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((ja) this).field_r;
          param1 = param1 + ((ja) this).field_y;
          var3 = param0 + param1 * oo.field_b;
          var4 = 0;
          var5 = ((ja) this).field_w;
          var6 = ((ja) this).field_x;
          var7 = oo.field_b - var6;
          var8 = 0;
          if (param1 >= oo.field_e) {
            break L0;
          } else {
            var9 = oo.field_e - param1;
            var5 = var5 - var9;
            param1 = oo.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= oo.field_d) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= oo.field_f) {
            break L2;
          } else {
            var9 = oo.field_f - param0;
            var6 = var6 - var9;
            param0 = oo.field_f;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= oo.field_g) {
            break L3;
          } else {
            var9 = param0 + var6 - oo.field_g;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            ja.c(oo.field_i, ((ja) this).field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
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
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var6 = param2 * ((ja) this).field_x + param1;
          param3 = param3 & 4095;
          param4 = param4 & 4095;
          if (param2 < 0) {
            var12 = 0;
            var11 = 0;
            var8 = 0;
            var7 = 0;
            break L0;
          } else {
            L1: {
              if (param1 < 0) {
                var11 = 0;
                var7 = 0;
                break L1;
              } else {
                L2: {
                  var7 = ((ja) this).field_B[var6];
                  if (var7 == 0) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = (4096 - param3) * (4096 - param4);
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                var11 = stackIn_5_0;
                break L1;
              }
            }
            if (param1 >= ((ja) this).field_x - 1) {
              var12 = 0;
              var8 = 0;
              break L0;
            } else {
              L3: {
                var8 = ((ja) this).field_B[var6 + 1];
                if (var8 == 0) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = param3 * (4096 - param4);
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              var12 = stackIn_11_0;
              break L0;
            }
          }
        }
        L4: {
          if (param2 >= ((ja) this).field_w - 1) {
            var14 = 0;
            var13 = 0;
            var10 = 0;
            var9 = 0;
            break L4;
          } else {
            L5: {
              if (param1 < 0) {
                var13 = 0;
                var9 = 0;
                break L5;
              } else {
                L6: {
                  var9 = ((ja) this).field_B[var6 + ((ja) this).field_x];
                  if (var9 == 0) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L6;
                  } else {
                    stackOut_17_0 = (4096 - param3) * param4;
                    stackIn_19_0 = stackOut_17_0;
                    break L6;
                  }
                }
                var13 = stackIn_19_0;
                break L5;
              }
            }
            if (param1 >= ((ja) this).field_x - 1) {
              var14 = 0;
              var10 = 0;
              break L4;
            } else {
              L7: {
                var10 = ((ja) this).field_B[var6 + ((ja) this).field_x + 1];
                if (var10 == 0) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L7;
                } else {
                  stackOut_23_0 = param3 * param4;
                  stackIn_25_0 = stackOut_23_0;
                  break L7;
                }
              }
              var14 = stackIn_25_0;
              break L4;
            }
          }
        }
        L8: {
          var11 = var11 >> 16;
          var12 = var12 >> 16;
          var13 = var13 >> 16;
          var14 = var14 >> 16;
          var15 = var11 + var12 + var13 + var14;
          if (var15 < 256) {
            if (var15 < 128) {
              return;
            } else {
              L9: {
                var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
                var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
                var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
                var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
                var18 = ((var16 >>> 16) / var15 << 16) + (var17 / var15 & 65280) + (var16 & 65535) / var15;
                if (var18 != 0) {
                  break L9;
                } else {
                  var18 = 1;
                  break L9;
                }
              }
              oo.field_i[param0] = var18;
              break L8;
            }
          } else {
            L10: {
              var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
              var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
              var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
              var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
              var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
              if (var18 != 0) {
                break L10;
              } else {
                var18 = 1;
                break L10;
              }
            }
            oo.field_i[param0] = var18;
            break L8;
          }
        }
    }

    ja(int param0, int param1) {
        ((ja) this).field_B = new int[param0 * param1];
        ((ja) this).field_z = param0;
        ((ja) this).field_x = param0;
        ((ja) this).field_u = param1;
        ((ja) this).field_w = param1;
        ((ja) this).field_y = 0;
        ((ja) this).field_r = 0;
    }

    ja(byte[] param0, java.awt.Component param1) {
        InterruptedException var3 = null;
        java.awt.Image var3_ref = null;
        java.awt.MediaTracker var4 = null;
        java.awt.image.PixelGrabber var5 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3_ref = java.awt.Toolkit.getDefaultToolkit().createImage(param0);
            var4 = new java.awt.MediaTracker(param1);
            var4.addImage(var3_ref, 0);
            var4.waitForAll();
            ((ja) this).field_x = var3_ref.getWidth((java.awt.image.ImageObserver) (Object) param1);
            ((ja) this).field_w = var3_ref.getHeight((java.awt.image.ImageObserver) (Object) param1);
            ((ja) this).field_z = ((ja) this).field_x;
            ((ja) this).field_u = ((ja) this).field_w;
            ((ja) this).field_r = 0;
            ((ja) this).field_y = 0;
            ((ja) this).field_B = new int[((ja) this).field_x * ((ja) this).field_w];
            var5 = new java.awt.image.PixelGrabber(var3_ref, 0, 0, ((ja) this).field_x, ((ja) this).field_w, ((ja) this).field_B, 0, ((ja) this).field_x);
            boolean discarded$1 = var5.grabPixels();
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = (InterruptedException) (Object) decompiledCaughtException;
            break L1;
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          } else {
            param6 = -param9;
            L1: while (true) {
              if (param6 >= 0) {
                param7 = param7 + param11;
                param5 = param5 + param12;
                param8++;
                continue L0;
              } else {
                int incrementValue$66 = param5;
                param5++;
                param0 = param4[incrementValue$66];
                if (param0 == 0) {
                  param7++;
                  param6++;
                  continue L1;
                } else {
                  param1 = (param0 & 16711935) * param13;
                  param0 = (param1 & -16711936) + (param0 * param13 - param1 & 16711680) >>> 8;
                  param1 = param3[param7];
                  param2 = param0 + param1;
                  param0 = (param0 & 16711935) + (param1 & 16711935);
                  param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                  int incrementValue$67 = param7;
                  param7++;
                  param3[incrementValue$67] = param2 - param1 | param1 - (param1 >>> 8);
                  param6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var13 = 256 - param12;
        int var14 = param3;
        for (var15 = -param8; var15 < 0; var15++) {
            var16 = (param4 >> 16) * param11;
            for (var17 = -param7; var17 < 0; var17++) {
                param2 = param1[(param3 >> 16) + var16];
                if (param2 != 0) {
                    var18 = param0[param5];
                    int incrementValue$0 = param5;
                    param5++;
                    param0[incrementValue$0] = ((param2 & 16711935) * param12 + (var18 & 16711935) * var13 & -16711936) + ((param2 & 65280) * param12 + (var18 & 65280) * var13 & 16711680) >> 8;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var14;
            param5 = param5 + param6;
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
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
        L0: {
          if (param2 > ((ja) this).field_z) {
            break L0;
          } else {
            if (param3 <= ((ja) this).field_u) {
              L1: {
                var5 = param0 + ((ja) this).field_r * param2 / ((ja) this).field_z;
                var6 = param0 + ((((ja) this).field_r + ((ja) this).field_x) * param2 + ((ja) this).field_z - 1) / ((ja) this).field_z;
                var7 = param1 + ((ja) this).field_y * param3 / ((ja) this).field_u;
                var8 = param1 + ((((ja) this).field_y + ((ja) this).field_w) * param3 + ((ja) this).field_u - 1) / ((ja) this).field_u;
                if (var5 >= oo.field_f) {
                  break L1;
                } else {
                  var5 = oo.field_f;
                  break L1;
                }
              }
              L2: {
                if (var6 <= oo.field_g) {
                  break L2;
                } else {
                  var6 = oo.field_g;
                  break L2;
                }
              }
              L3: {
                if (var7 >= oo.field_e) {
                  break L3;
                } else {
                  var7 = oo.field_e;
                  break L3;
                }
              }
              L4: {
                if (var8 <= oo.field_d) {
                  break L4;
                } else {
                  var8 = oo.field_d;
                  break L4;
                }
              }
              if (var5 >= var6) {
                return;
              } else {
                if (var7 < var8) {
                  var9 = var7 * oo.field_b + var5;
                  var10 = oo.field_b - (var6 - var5);
                  var11 = var7;
                  L5: while (true) {
                    if (var11 >= var8) {
                      return;
                    } else {
                      var12 = var5;
                      L6: while (true) {
                        if (var12 >= var6) {
                          var9 = var9 + var10;
                          var11++;
                          continue L5;
                        } else {
                          var13 = var12 - param0 << 4;
                          var14 = var11 - param1 << 4;
                          var15 = var13 * ((ja) this).field_z / param2 - (((ja) this).field_r << 4);
                          var16 = (var13 + 16) * ((ja) this).field_z / param2 - (((ja) this).field_r << 4);
                          var17 = var14 * ((ja) this).field_u / param3 - (((ja) this).field_y << 4);
                          var18 = (var14 + 16) * ((ja) this).field_u / param3 - (((ja) this).field_y << 4);
                          var19 = (var16 - var15) * (var18 - var17) >> 1;
                          if (var19 != 0) {
                            L7: {
                              if (var15 >= 0) {
                                break L7;
                              } else {
                                var15 = 0;
                                break L7;
                              }
                            }
                            L8: {
                              if (var16 <= ((ja) this).field_x << 4) {
                                break L8;
                              } else {
                                var16 = ((ja) this).field_x << 4;
                                break L8;
                              }
                            }
                            L9: {
                              if (var17 >= 0) {
                                break L9;
                              } else {
                                var17 = 0;
                                break L9;
                              }
                            }
                            L10: {
                              if (var18 <= ((ja) this).field_w << 4) {
                                break L10;
                              } else {
                                var18 = ((ja) this).field_w << 4;
                                break L10;
                              }
                            }
                            var16--;
                            var18--;
                            var20 = 16 - (var15 & 15);
                            var21 = (var16 & 15) + 1;
                            var22 = 16 - (var17 & 15);
                            var23 = (var18 & 15) + 1;
                            var15 = var15 >> 4;
                            var16 = var16 >> 4;
                            var17 = var17 >> 4;
                            var18 = var18 >> 4;
                            var24 = 0;
                            var25 = 0;
                            var26 = 0;
                            var27 = 0;
                            var28 = var17;
                            L11: while (true) {
                              if (var28 > var18) {
                                if (var27 >= var19) {
                                  L12: {
                                    var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                                    if (var28 != 0) {
                                      break L12;
                                    } else {
                                      var28 = 1;
                                      break L12;
                                    }
                                  }
                                  oo.field_i[var9] = var28;
                                  var9++;
                                  var12++;
                                  continue L6;
                                } else {
                                  var9++;
                                  var12++;
                                  continue L6;
                                }
                              } else {
                                L13: {
                                  var29 = 16;
                                  if (var28 != var17) {
                                    break L13;
                                  } else {
                                    var29 = var22;
                                    break L13;
                                  }
                                }
                                L14: {
                                  if (var28 != var18) {
                                    break L14;
                                  } else {
                                    var29 = var23;
                                    break L14;
                                  }
                                }
                                var30 = var15;
                                L15: while (true) {
                                  if (var30 > var16) {
                                    var28++;
                                    continue L11;
                                  } else {
                                    var31 = ((ja) this).field_B[var28 * ((ja) this).field_x + var30];
                                    if (var31 != 0) {
                                      L16: {
                                        var32 = var29;
                                        if (var30 != var15) {
                                          if (var30 != var16) {
                                            var32 = var32 << 4;
                                            break L16;
                                          } else {
                                            var32 = var32 * var21;
                                            break L16;
                                          }
                                        } else {
                                          var32 = var32 * var20;
                                          break L16;
                                        }
                                      }
                                      var27 = var27 + var32;
                                      var24 = var24 + (var31 >> 16 & 255) * var32;
                                      var25 = var25 + (var31 >> 8 & 255) * var32;
                                      var26 = var26 + (var31 & 255) * var32;
                                      var30++;
                                      continue L15;
                                    } else {
                                      var30++;
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var10 = -param7;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param6;
            L1: while (true) {
              if (var11 >= 0) {
                param5 = param5 + param8;
                param4 = param4 + param9;
                var10++;
                continue L0;
              } else {
                int incrementValue$14 = param4;
                param4++;
                param3 = param2[incrementValue$14];
                if (param3 != 0) {
                  param0 = param1[param5];
                  if (param0 != 0) {
                    var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                    var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
                    var14 = (param3 & 255) * (param0 & 255) >>> 8;
                    int incrementValue$15 = param5;
                    param5++;
                    param1[incrementValue$15] = (var12 << 16) + (var13 << 8) + var14;
                    var11++;
                    continue L1;
                  } else {
                    param5++;
                    var11++;
                    continue L1;
                  }
                } else {
                  param5++;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
