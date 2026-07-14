/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    final static void a(ru param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param1 = param1 + param0.field_i;
          param2 = param2 + param0.field_d;
          var4 = param1 + param2 * qn.field_l;
          var5 = 0;
          var6 = param0.field_h;
          var7 = param0.field_e;
          var8 = qn.field_l - var7;
          var9 = 0;
          if (param2 >= qn.field_a) {
            break L0;
          } else {
            var10 = qn.field_a - param2;
            var6 = var6 - var10;
            param2 = qn.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qn.field_l;
            break L0;
          }
        }
        L1: {
          if (param2 + var6 <= qn.field_f) {
            break L1;
          } else {
            var6 = var6 - (param2 + var6 - qn.field_f);
            break L1;
          }
        }
        L2: {
          if (param1 >= qn.field_j) {
            break L2;
          } else {
            var10 = qn.field_j - param1;
            var7 = var7 - var10;
            param1 = qn.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param1 + var7 <= qn.field_e) {
            break L3;
          } else {
            var10 = param1 + var7 - qn.field_e;
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
              gq.b(qn.field_d, param0.field_k, param0.field_j, param3, var5, var4, var7, var6, var8, var9);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var1 = param0 >>> 19 & 8191;
        var2 = param0 >>> 8 & 2047;
        var3 = param0 & 255;
        var4 = var1 % 1024;
        var5 = var3 * (2047 - var2) + 1024 >>> 11 & 255;
        var6 = var1 >> 10;
        var6--;
        if (var6 != 0) {
          var6--;
          if (var6 != 0) {
            var6--;
            if (var6 != 0) {
              var6--;
              if (var6 != 0) {
                var6--;
                if (var6 != 0) {
                  if (var6 != 0) {
                    return 16711935;
                  } else {
                    return var3 << 16 | var5 << 8 | var3 * (2097152 - var4 * var2) + 1048576 >>> 21 & 255;
                  }
                } else {
                  return (var3 * (2097152 - (1023 - var4) * var2) + 1048576 >>> 21 & 255) << 16 | var5 << 8 | var3;
                }
              } else {
                return var5 << 16 | (var3 * (2097152 - var4 * var2) + 1048576 >>> 21 & 255) << 8 | var3;
              }
            } else {
              return var5 << 16 | var3 << 8 | var3 * (2097152 - (1023 - var4) * var2) + 1048576 >>> 21 & 255;
            }
          } else {
            return (var3 * (2097152 - var4 * var2) + 1048576 >>> 21 & 255) << 16 | var3 << 8 | var5;
          }
        } else {
          return var3 << 16 | (var3 * (2097152 - (1023 - var4) * var2) + 1048576 >>> 21 & 255) << 8 | var5;
        }
    }

    final static void b(ru param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param1 = param1 + param0.field_i;
          param2 = param2 + param0.field_d;
          var4 = param1 + param2 * qn.field_l;
          var5 = 0;
          var6 = param0.field_h;
          var7 = param0.field_e;
          var8 = qn.field_l - var7;
          var9 = 0;
          if (param2 >= qn.field_a) {
            break L0;
          } else {
            var10 = qn.field_a - param2;
            var6 = var6 - var10;
            param2 = qn.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qn.field_l;
            break L0;
          }
        }
        L1: {
          if (param2 + var6 <= qn.field_f) {
            break L1;
          } else {
            var6 = var6 - (param2 + var6 - qn.field_f);
            break L1;
          }
        }
        L2: {
          if (param1 >= qn.field_j) {
            break L2;
          } else {
            var10 = qn.field_j - param1;
            var7 = var7 - var10;
            param1 = qn.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param1 + var7 <= qn.field_e) {
            break L3;
          } else {
            var10 = param1 + var7 - qn.field_e;
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
              gq.a(qn.field_d, param0.field_k, param0.field_j, var5, var4, var7, var6, var8, var9, param3);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = param0 >> 16 & 255;
        var2 = param0 >> 8 & 255;
        var3 = param0 & 255;
        if (var1 < var2) {
          if (var1 < var3) {
            if (var2 < var3) {
              var4 = var3 - var1;
              return (4096 + 1024 * (var1 - var2) / var4) % 6144 << 19 | var4 * 524032 / var3 & 524032 | var3;
            } else {
              var4 = var2 - var1;
              return (2048 + 1024 * (var3 - var1) / var4) % 6144 << 19 | var4 * 524032 / var2 & 524032 | var2;
            }
          } else {
            var4 = var2 - var3;
            return (2048 + 1024 * (var3 - var1) / var4) % 6144 << 19 | var4 * 524032 / var2 & 524032 | var2;
          }
        } else {
          if (var2 < var3) {
            if (var1 < var3) {
              var4 = var3 - var2;
              return (4096 + 1024 * (var1 - var2) / var4) % 6144 << 19 | var4 * 524032 / var3 & 524032 | var3;
            } else {
              var4 = var1 - var2;
              return (6144 + 1024 * (var2 - var3) / var4) % 6144 << 19 | var4 * 524032 / var1 & 524032 | var1;
            }
          } else {
            L0: {
              if (var3 != var2) {
                break L0;
              } else {
                if (var3 != var1) {
                  break L0;
                } else {
                  return var3;
                }
              }
            }
            var4 = var1 - var3;
            return (6144 + 1024 * (var2 - var3) / var4) % 6144 << 19 | var4 * 524032 / var1 & 524032 | var1;
          }
        }
    }

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
                    if (param2[param1[param4] & 255] == 0) {
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
                  param4++;
                  if (param2[param1[param4] & 255] == 0) {
                    param5++;
                    break L3;
                  } else {
                    param5++;
                    param0[param5] = param3;
                    break L3;
                  }
                }
                L4: {
                  param4++;
                  if (param2[param1[param4] & 255] == 0) {
                    param5++;
                    break L4;
                  } else {
                    param5++;
                    param0[param5] = param3;
                    break L4;
                  }
                }
                L5: {
                  param4++;
                  if (param2[param1[param4] & 255] == 0) {
                    param5++;
                    break L5;
                  } else {
                    param5++;
                    param0[param5] = param3;
                    break L5;
                  }
                }
                param4++;
                if (param2[param1[param4] & 255] == 0) {
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

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        var11 = param9 >> 16 & 255;
        var12 = param9 >> 8 & 255;
        var13 = param9 & 255;
        var14 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var15 = var14 + var14 + var14 + var14 + param5;
        var16 = -param6;
        L0: while (true) {
          if (var16 >= 0) {
            return;
          } else {
            var17 = var15;
            L1: while (true) {
              if (var17 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var16++;
                continue L0;
              } else {
                param3++;
                var10 = param2[param1[param3] & 255];
                if (var10 == 0) {
                  param4++;
                  var17++;
                  continue L1;
                } else {
                  L2: {
                    var18 = var10 >> 16 & 255;
                    var19 = var10 >> 8 & 255;
                    var20 = var10 & 255;
                    if (var18 != var19) {
                      break L2;
                    } else {
                      if (var19 != var20) {
                        break L2;
                      } else {
                        if (var18 > 128) {
                          param4++;
                          param0[param4] = (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 16) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7 << 8) + (var13 * (256 - var20) + 255 * (var20 - 128) >> 7);
                          var17++;
                          continue L1;
                        } else {
                          param4++;
                          param0[param4] = (var18 * var11 >> 7 << 16) + (var19 * var12 >> 7 << 8) + (var20 * var13 >> 7);
                          var17++;
                          continue L1;
                        }
                      }
                    }
                  }
                  param4++;
                  param0[param4] = var10;
                  var17++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
