/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static int[] field_a;

    final static void a(int param0, sm param1, int param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        if (param0 < param4.length) {
          var5 = param4[param0];
          if (var5 != 0) {
            L0: {
              param2 = param2 + param1.field_a;
              param3 = param3 + param1.field_g;
              var6 = param2 + param3 * ph.field_j;
              var7 = 0;
              var8 = param1.field_d;
              var9 = param1.field_c;
              var10 = ph.field_j - var9;
              var11 = 0;
              if (param3 >= ph.field_c) {
                break L0;
              } else {
                var12 = ph.field_c - param3;
                var8 = var8 - var12;
                param3 = ph.field_c;
                var7 = var7 + var12 * var9;
                var6 = var6 + var12 * ph.field_j;
                break L0;
              }
            }
            L1: {
              if (param3 + var8 <= ph.field_h) {
                break L1;
              } else {
                var8 = var8 - (param3 + var8 - ph.field_h);
                break L1;
              }
            }
            L2: {
              if (param2 >= ph.field_k) {
                break L2;
              } else {
                var12 = ph.field_k - param2;
                var9 = var9 - var12;
                param2 = ph.field_k;
                var7 = var7 + var12;
                var6 = var6 + var12;
                var11 = var11 + var12;
                var10 = var10 + var12;
                break L2;
              }
            }
            L3: {
              if (param2 + var9 <= ph.field_a) {
                break L3;
              } else {
                var12 = param2 + var9 - ph.field_a;
                var9 = var9 - var12;
                var11 = var11 + var12;
                var10 = var10 + var12;
                break L3;
              }
            }
            L4: {
              if (var9 <= 0) {
                break L4;
              } else {
                if (var8 > 0) {
                  var12 = param3 - 1 << 2;
                  var13 = param2;
                  vi.a(ph.field_e, param1.field_l, param1.field_k, 0, var7, var6, var5, var12, var13, var9, var8, var10, var11);
                  return;
                } else {
                  break L4;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          param1.a(param2, param3);
          return;
        }
    }

    public static void a() {
        field_a = null;
    }

    final static void a(int param0, t param1, int param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        if (param0 < param4.length) {
          var5 = param4[param0];
          if (var5 != 0) {
            L0: {
              param2 = param2 + param1.field_v;
              param3 = param3 + param1.field_r;
              var6 = param2 + param3 * ph.field_j;
              var7 = 0;
              var8 = param1.field_t;
              var9 = param1.field_s;
              var10 = ph.field_j - var9;
              var11 = 0;
              if (param3 >= ph.field_c) {
                break L0;
              } else {
                var12 = ph.field_c - param3;
                var8 = var8 - var12;
                param3 = ph.field_c;
                var7 = var7 + var12 * var9;
                var6 = var6 + var12 * ph.field_j;
                break L0;
              }
            }
            L1: {
              if (param3 + var8 <= ph.field_h) {
                break L1;
              } else {
                var8 = var8 - (param3 + var8 - ph.field_h);
                break L1;
              }
            }
            L2: {
              if (param2 >= ph.field_k) {
                break L2;
              } else {
                var12 = ph.field_k - param2;
                var9 = var9 - var12;
                param2 = ph.field_k;
                var7 = var7 + var12;
                var6 = var6 + var12;
                var11 = var11 + var12;
                var10 = var10 + var12;
                break L2;
              }
            }
            L3: {
              if (param2 + var9 <= ph.field_a) {
                break L3;
              } else {
                var12 = param2 + var9 - ph.field_a;
                var9 = var9 - var12;
                var11 = var11 + var12;
                var10 = var10 + var12;
                break L3;
              }
            }
            L4: {
              if (var9 <= 0) {
                break L4;
              } else {
                if (var8 > 0) {
                  var12 = param3 - 1 << 2;
                  var13 = param2;
                  vi.a(ph.field_e, param1.field_y, var7, var6, var5, var12, var13, var9, var8, var10, var11);
                  return;
                } else {
                  break L4;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          param1.b(param2, param3);
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int var11 = 0;
        int var12 = 0;
        var11 = -param8;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            param5 = param5 + 4 & 12;
            if ((param4 >> param5 & 15) != 0) {
              var12 = param3 + param7 - 3;
              L1: while (true) {
                if (param3 >= var12) {
                  var12 += 3;
                  L2: while (true) {
                    if (param3 >= var12) {
                      param3 = param3 + param9;
                      param2 = param2 + param10;
                      param6 = param6 - param7;
                      var11++;
                      continue L0;
                    } else {
                      if ((param4 & 1 << (param5 | param6 & 3)) == 0) {
                        param3++;
                        param2++;
                        param6++;
                        continue L2;
                      } else {
                        incrementValue$10 = param3;
                        param3++;
                        incrementValue$11 = param2;
                        param2++;
                        param0[incrementValue$10] = param1[incrementValue$11];
                        param6++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  L3: {
                    if ((param4 & 1 << (param5 | param6 & 3)) == 0) {
                      param3++;
                      param2++;
                      break L3;
                    } else {
                      incrementValue$12 = param3;
                      param3++;
                      incrementValue$13 = param2;
                      param2++;
                      param0[incrementValue$12] = param1[incrementValue$13];
                      break L3;
                    }
                  }
                  L4: {
                    param6++;
                    if ((param4 & 1 << (param5 | param6 & 3)) == 0) {
                      param3++;
                      param2++;
                      break L4;
                    } else {
                      incrementValue$14 = param3;
                      param3++;
                      incrementValue$15 = param2;
                      param2++;
                      param0[incrementValue$14] = param1[incrementValue$15];
                      break L4;
                    }
                  }
                  L5: {
                    param6++;
                    if ((param4 & 1 << (param5 | param6 & 3)) == 0) {
                      param3++;
                      param2++;
                      break L5;
                    } else {
                      incrementValue$16 = param3;
                      param3++;
                      incrementValue$17 = param2;
                      param2++;
                      param0[incrementValue$16] = param1[incrementValue$17];
                      break L5;
                    }
                  }
                  param6++;
                  if ((param4 & 1 << (param5 | param6 & 3)) == 0) {
                    param3++;
                    param2++;
                    param6++;
                    continue L1;
                  } else {
                    incrementValue$18 = param3;
                    param3++;
                    incrementValue$19 = param2;
                    param2++;
                    param0[incrementValue$18] = param1[incrementValue$19];
                    param6++;
                    continue L1;
                  }
                }
              }
            } else {
              param3 = param3 + (param9 + param7);
              param2 = param2 + (param10 + param7);
              var11++;
              continue L0;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var13 = -(param9 >> 2);
        param9 = -(param9 & 3);
        var14 = -param10;
        L0: while (true) {
          if (var14 >= 0) {
            return;
          } else {
            param7 = param7 + 4 & 12;
            if ((param6 >> param7 & 15) != 0) {
              var15 = var13;
              L1: while (true) {
                if (var15 >= 0) {
                  var15 = param9;
                  L2: while (true) {
                    if (var15 >= 0) {
                      param5 = param5 + param11;
                      param4 = param4 + param12;
                      param8 = param8 + (param9 + (var13 << 2));
                      var14++;
                      continue L0;
                    } else {
                      if ((param6 & 1 << (param7 | param8 & 3)) == 0) {
                        param5++;
                        param4++;
                        param8++;
                        var15++;
                        continue L2;
                      } else {
                        incrementValue$10 = param5;
                        param5++;
                        incrementValue$11 = param4;
                        param4++;
                        param0[incrementValue$10] = param2[param1[incrementValue$11] & 255];
                        param8++;
                        var15++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  L3: {
                    if ((param6 & 1 << (param7 | param8 & 3)) == 0) {
                      param5++;
                      param4++;
                      break L3;
                    } else {
                      incrementValue$12 = param5;
                      param5++;
                      incrementValue$13 = param4;
                      param4++;
                      param0[incrementValue$12] = param2[param1[incrementValue$13] & 255];
                      break L3;
                    }
                  }
                  L4: {
                    param8++;
                    if ((param6 & 1 << (param7 | param8 & 3)) == 0) {
                      param5++;
                      param4++;
                      break L4;
                    } else {
                      incrementValue$14 = param5;
                      param5++;
                      incrementValue$15 = param4;
                      param4++;
                      param0[incrementValue$14] = param2[param1[incrementValue$15] & 255];
                      break L4;
                    }
                  }
                  L5: {
                    param8++;
                    if ((param6 & 1 << (param7 | param8 & 3)) == 0) {
                      param5++;
                      param4++;
                      break L5;
                    } else {
                      incrementValue$16 = param5;
                      param5++;
                      incrementValue$17 = param4;
                      param4++;
                      param0[incrementValue$16] = param2[param1[incrementValue$17] & 255];
                      break L5;
                    }
                  }
                  param8++;
                  if ((param6 & 1 << (param7 | param8 & 3)) == 0) {
                    param5++;
                    param4++;
                    param8++;
                    var15++;
                    continue L1;
                  } else {
                    incrementValue$18 = param5;
                    param5++;
                    incrementValue$19 = param4;
                    param4++;
                    param0[incrementValue$18] = param2[param1[incrementValue$19] & 255];
                    param8++;
                    var15++;
                    continue L1;
                  }
                }
              }
            } else {
              param5 = param5 + (param11 - param9 - (var13 << 2));
              param4 = param4 + (param12 - param9 - (var13 << 2));
              var14++;
              continue L0;
            }
          }
        }
    }

    static {
        field_a = new int[]{0, 32800, 41120, 41380, 42405, 46565, 62965, 65015};
    }
}
