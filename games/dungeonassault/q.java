/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends lo {
    byte[] field_j;
    int[] field_i;

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
          var5 = ((q) this).field_h;
          var6 = ((q) this).field_e;
          var7 = 0;
          var8 = 0;
          var9 = ((q) this).field_d;
          var10 = ((q) this).field_g;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (((q) this).field_b <= 0) {
            break L0;
          } else {
            var13 = ((((q) this).field_b << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (((q) this).field_b << 16));
            break L0;
          }
        }
        L1: {
          if (((q) this).field_a <= 0) {
            break L1;
          } else {
            var13 = ((((q) this).field_a << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (((q) this).field_a << 16));
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
          var13 = param0 + param1 * gf.field_i;
          var14 = gf.field_i - param2;
          if (param1 + param3 <= gf.field_e) {
            break L4;
          } else {
            param3 = param3 - (param1 + param3 - gf.field_e);
            break L4;
          }
        }
        L5: {
          if (param1 >= gf.field_f) {
            break L5;
          } else {
            var15 = gf.field_f - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * gf.field_i;
            var8 = var8 + var12 * var15;
            break L5;
          }
        }
        L6: {
          if (param0 + param2 <= gf.field_h) {
            break L6;
          } else {
            var15 = param0 + param2 - gf.field_h;
            param2 = param2 - var15;
            var14 = var14 + var15;
            break L6;
          }
        }
        L7: {
          if (param0 >= gf.field_j) {
            break L7;
          } else {
            var15 = gf.field_j - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
            break L7;
          }
        }
        q.a(gf.field_b, ((q) this).field_j, ((q) this).field_i, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + (((q) this).field_d - ((q) this).field_h - ((q) this).field_b);
          param1 = param1 + ((q) this).field_a;
          var3 = param0 + param1 * gf.field_i;
          var4 = ((q) this).field_h - 1;
          var5 = ((q) this).field_e;
          var6 = ((q) this).field_h;
          var7 = gf.field_i - var6;
          var8 = var6 + var6;
          if (param1 >= gf.field_f) {
            break L0;
          } else {
            var9 = gf.field_f - param1;
            var5 = var5 - var9;
            param1 = gf.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gf.field_i;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gf.field_e) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gf.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_j) {
            break L2;
          } else {
            var9 = gf.field_j - param0;
            var6 = var6 - var9;
            param0 = gf.field_j;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gf.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gf.field_h;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              q.a(gf.field_b, ((q) this).field_j, ((q) this).field_i, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
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
          param0 = param0 + ((q) this).field_b;
          param1 = param1 + ((q) this).field_a;
          var3 = param0 + param1 * gf.field_i;
          var4 = 0;
          var5 = ((q) this).field_e;
          var6 = ((q) this).field_h;
          var7 = gf.field_i - var6;
          var8 = 0;
          if (param1 >= gf.field_f) {
            break L0;
          } else {
            var9 = gf.field_f - param1;
            var5 = var5 - var9;
            param1 = gf.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gf.field_i;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gf.field_e) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gf.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_j) {
            break L2;
          } else {
            var9 = gf.field_j - param0;
            var6 = var6 - var9;
            param0 = gf.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gf.field_h) {
            break L3;
          } else {
            var9 = param0 + var6 - gf.field_h;
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
              q.c(gf.field_b, ((q) this).field_j, ((q) this).field_i, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void c(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((q) this).field_b;
          param1 = param1 + ((q) this).field_a;
          var4 = param0 + param1 * gf.field_i;
          var5 = 0;
          var6 = ((q) this).field_e;
          var7 = ((q) this).field_h;
          var8 = gf.field_i - var7;
          var9 = 0;
          if (param1 >= gf.field_f) {
            break L0;
          } else {
            var10 = gf.field_f - param1;
            var6 = var6 - var10;
            param1 = gf.field_f;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gf.field_i;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= gf.field_e) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - gf.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_j) {
            break L2;
          } else {
            var10 = gf.field_j - param0;
            var7 = var7 - var10;
            param0 = gf.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= gf.field_h) {
            break L3;
          } else {
            var10 = param0 + var7 - gf.field_h;
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
              q.b(gf.field_b, ((q) this).field_j, ((q) this).field_i, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final cn a() {
        int var3 = 0;
        int var1 = ((q) this).field_h * ((q) this).field_e;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
            var2[var3] = ((q) this).field_i[((q) this).field_j[var3] & 255];
        }
        return new cn(((q) this).field_d, ((q) this).field_g, ((q) this).field_b, ((q) this).field_a, ((q) this).field_h, ((q) this).field_e, var2);
    }

    final q c() {
        int var3 = 0;
        q var1 = new q(((q) this).field_h, ((q) this).field_e, ((q) this).field_i.length);
        var1.field_d = ((q) this).field_d;
        var1.field_g = ((q) this).field_g;
        var1.field_b = ((q) this).field_b;
        var1.field_a = ((q) this).field_a;
        int var2 = ((q) this).field_j.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_j[var3] = ((q) this).field_j[var3];
        }
        var2 = ((q) this).field_i.length;
        int var4 = 0;
        var3 = var4;
        while (var4 < var2) {
            var1.field_i[var4] = ((q) this).field_i[var4];
            var4++;
        }
        return var1;
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

    final q d() {
        int var3 = 0;
        int var4 = 0;
        q var1 = new q(((q) this).field_h, ((q) this).field_e, ((q) this).field_i.length);
        var1.field_d = ((q) this).field_d;
        var1.field_g = ((q) this).field_g;
        var1.field_b = ((q) this).field_d - ((q) this).field_h - ((q) this).field_b;
        var1.field_a = ((q) this).field_a;
        int var2 = ((q) this).field_i.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_i[var3] = ((q) this).field_i[var3];
        }
        for (var3 = 0; var3 < ((q) this).field_e; var3++) {
            for (var4 = 0; var4 < ((q) this).field_h; var4++) {
                var1.field_j[var3 * ((q) this).field_h + var4] = ((q) this).field_j[var3 * ((q) this).field_h + ((q) this).field_h - 1 - var4];
            }
        }
        return var1;
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
                    param4--;
                    param3 = param2[param1[param4] & 255];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      param5++;
                      param0[param5] = param3;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param4--;
                  param3 = param2[param1[param4] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    param5++;
                    param0[param5] = param3;
                    break L3;
                  }
                }
                L4: {
                  param4--;
                  param3 = param2[param1[param4] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    param5++;
                    param0[param5] = param3;
                    break L4;
                  }
                }
                L5: {
                  param4--;
                  param3 = param2[param1[param4] & 255];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    param5++;
                    param0[param5] = param3;
                    break L5;
                  }
                }
                param4--;
                param3 = param2[param1[param4] & 255];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  param5++;
                  param0[param5] = param3;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
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

    final void b() {
        int var1 = 0;
        int var2 = ((q) this).field_j.length - 7;
        while (var1 < var2) {
            var1++;
            ((q) this).field_j[var1] = (byte) 0;
            var1++;
            ((q) this).field_j[var1] = (byte) 0;
            var1++;
            ((q) this).field_j[var1] = (byte) 0;
            var1++;
            ((q) this).field_j[var1] = (byte) 0;
            var1++;
            ((q) this).field_j[var1] = (byte) 0;
            var1++;
            ((q) this).field_j[var1] = (byte) 0;
            var1++;
            ((q) this).field_j[var1] = (byte) 0;
            var1++;
            ((q) this).field_j[var1] = (byte) 0;
        }
        var2 += 7;
        while (var1 < var2) {
            var1++;
            ((q) this).field_j[var1] = (byte) 0;
        }
    }

    q(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((q) this).field_d = param0;
        ((q) this).field_g = param1;
        ((q) this).field_b = param2;
        ((q) this).field_a = param3;
        ((q) this).field_h = param4;
        ((q) this).field_e = param5;
        ((q) this).field_j = param6;
        ((q) this).field_i = param7;
    }

    q(int param0, int param1, int param2) {
        ((q) this).field_h = param0;
        ((q) this).field_d = param0;
        ((q) this).field_e = param1;
        ((q) this).field_g = param1;
        ((q) this).field_a = 0;
        ((q) this).field_b = 0;
        ((q) this).field_j = new byte[param0 * param1];
        ((q) this).field_i = new int[param2];
    }
}
