/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends jc {
    int[] field_l;
    byte[] field_k;

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
          param0 = param0 + ((ge) this).field_f;
          param1 = param1 + ((ge) this).field_g;
          var4 = param0 + param1 * qg.field_g;
          var5 = 0;
          var6 = ((ge) this).field_a;
          var7 = ((ge) this).field_b;
          var8 = qg.field_g - var7;
          var9 = 0;
          if (param1 >= qg.field_k) {
            break L0;
          } else {
            var10 = qg.field_k - param1;
            var6 = var6 - var10;
            param1 = qg.field_k;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qg.field_g;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= qg.field_l) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - qg.field_l);
            break L1;
          }
        }
        L2: {
          if (param0 >= qg.field_a) {
            break L2;
          } else {
            var10 = qg.field_a - param0;
            var7 = var7 - var10;
            param0 = qg.field_a;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= qg.field_c) {
            break L3;
          } else {
            var10 = param0 + var7 - qg.field_c;
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
              ge.a(qg.field_i, ((ge) this).field_k, ((ge) this).field_l, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var12 = 256 - param10;
        var13 = (param11 & 16711935) * var12 & -16711936;
        var14 = (param11 & 65280) * var12 & 16711680;
        param11 = (var13 | var14) >>> 8;
        var15 = -param7;
        L0: while (true) {
          if (var15 >= 0) {
            return;
          } else {
            var16 = -param6;
            L1: while (true) {
              if (var16 >= 0) {
                param5 = param5 + param8;
                param4 = param4 + param9;
                var15++;
                continue L0;
              } else {
                param4++;
                param3 = param2[param1[param4] & 255];
                if (param3 == 0) {
                  param5++;
                  var16++;
                  continue L1;
                } else {
                  var13 = (param3 & 16711935) * param10 & -16711936;
                  var14 = (param3 & 65280) * param10 & 16711680;
                  param5++;
                  param0[param5] = ((var13 | var14) >>> 8) + param11;
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param2 != 256) {
          L0: {
            param0 = param0 + ((ge) this).field_f;
            param1 = param1 + ((ge) this).field_g;
            var5 = param0 + param1 * qg.field_g;
            var6 = 0;
            var7 = ((ge) this).field_a;
            var8 = ((ge) this).field_b;
            var9 = qg.field_g - var8;
            var10 = 0;
            if (param1 >= qg.field_k) {
              break L0;
            } else {
              var11 = qg.field_k - param1;
              var7 = var7 - var11;
              param1 = qg.field_k;
              var6 = var6 + var11 * var8;
              var5 = var5 + var11 * qg.field_g;
              break L0;
            }
          }
          L1: {
            if (param1 + var7 <= qg.field_l) {
              break L1;
            } else {
              var7 = var7 - (param1 + var7 - qg.field_l);
              break L1;
            }
          }
          L2: {
            if (param0 >= qg.field_a) {
              break L2;
            } else {
              var11 = qg.field_a - param0;
              var8 = var8 - var11;
              param0 = qg.field_a;
              var6 = var6 + var11;
              var5 = var5 + var11;
              var10 = var10 + var11;
              var9 = var9 + var11;
              break L2;
            }
          }
          L3: {
            if (param0 + var8 <= qg.field_c) {
              break L3;
            } else {
              var11 = param0 + var8 - qg.field_c;
              var8 = var8 - var11;
              var10 = var10 + var11;
              var9 = var9 + var11;
              break L3;
            }
          }
          L4: {
            if (var8 <= 0) {
              break L4;
            } else {
              if (var7 > 0) {
                ge.a(qg.field_i, ((ge) this).field_k, ((ge) this).field_l, 0, var6, var5, var8, var7, var9, var10, param2, param3);
                return;
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          ((ge) this).a(param0, param1);
          return;
        }
    }

    ge(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((ge) this).field_e = param0;
        ((ge) this).field_d = param1;
        ((ge) this).field_f = param2;
        ((ge) this).field_g = param3;
        ((ge) this).field_b = param4;
        ((ge) this).field_a = param5;
        ((ge) this).field_k = param6;
        ((ge) this).field_l = param7;
    }

    ge(int param0, int param1, int param2) {
        ((ge) this).field_b = param0;
        ((ge) this).field_e = param0;
        ((ge) this).field_a = param1;
        ((ge) this).field_d = param1;
        ((ge) this).field_g = 0;
        ((ge) this).field_f = 0;
        ((ge) this).field_k = new byte[param0 * param1];
        ((ge) this).field_l = new int[param2];
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
          param0 = param0 + ((ge) this).field_f;
          param1 = param1 + ((ge) this).field_g;
          var3 = param0 + param1 * qg.field_g;
          var4 = 0;
          var5 = ((ge) this).field_a;
          var6 = ((ge) this).field_b;
          var7 = qg.field_g - var6;
          var8 = 0;
          if (param1 >= qg.field_k) {
            break L0;
          } else {
            var9 = qg.field_k - param1;
            var5 = var5 - var9;
            param1 = qg.field_k;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * qg.field_g;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= qg.field_l) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - qg.field_l);
            break L1;
          }
        }
        L2: {
          if (param0 >= qg.field_a) {
            break L2;
          } else {
            var9 = qg.field_a - param0;
            var6 = var6 - var9;
            param0 = qg.field_a;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= qg.field_c) {
            break L3;
          } else {
            var9 = param0 + var6 - qg.field_c;
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
              ge.b(qg.field_i, ((ge) this).field_k, ((ge) this).field_l, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final ge b() {
        int var3 = 0;
        ge var1 = new ge(((ge) this).field_b, ((ge) this).field_a, ((ge) this).field_l.length);
        var1.field_e = ((ge) this).field_e;
        var1.field_d = ((ge) this).field_d;
        var1.field_f = ((ge) this).field_f;
        var1.field_g = ((ge) this).field_g;
        int var2 = ((ge) this).field_k.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_k[var3] = ((ge) this).field_k[var3];
        }
        var2 = ((ge) this).field_l.length;
        int var4 = 0;
        var3 = var4;
        while (var4 < var2) {
            var1.field_l[var4] = ((ge) this).field_l[var4];
            var4++;
        }
        return var1;
    }

    final ka a() {
        int var3 = 0;
        int var1 = ((ge) this).field_b * ((ge) this).field_a;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
            var2[var3] = ((ge) this).field_l[((ge) this).field_k[var3] & 255];
        }
        return new ka(((ge) this).field_e, ((ge) this).field_d, ((ge) this).field_f, ((ge) this).field_g, ((ge) this).field_b, ((ge) this).field_a, var2);
    }
}
