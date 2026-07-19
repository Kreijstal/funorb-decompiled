/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static int field_d;
    static int[] field_c;
    static int field_j;
    private static int[] field_h;
    static int field_b;
    private static int[] field_g;
    static int field_k;
    static int field_l;
    static int field_a;
    static int[] field_f;
    private static int[] field_e;
    static int[] field_i;

    final static void a(int[] param0) {
        param0[0] = field_a;
        param0[1] = field_k;
        param0[2] = field_b;
        param0[3] = field_j;
    }

    final static void g(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
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
        if (param4 != 0) {
          if (param4 != 256) {
            L0: {
              if (param2 >= 0) {
                break L0;
              } else {
                param2 = -param2;
                break L0;
              }
            }
            L1: {
              var5 = 256 - param4;
              var6 = (param3 >> 16 & 255) * param4;
              var7 = (param3 >> 8 & 255) * param4;
              var8 = (param3 & 255) * param4;
              var12 = param1 - param2;
              if (var12 >= field_k) {
                break L1;
              } else {
                var12 = field_k;
                break L1;
              }
            }
            L2: {
              var13 = param1 + param2 + 1;
              if (var13 <= field_j) {
                break L2;
              } else {
                var13 = field_j;
                break L2;
              }
            }
            L3: {
              var14 = var12;
              var15 = param2 * param2;
              var16 = 0;
              var17 = param1 - var14;
              var18 = var17 * var17;
              var19 = var18 - var17;
              if (param1 <= var13) {
                break L3;
              } else {
                param1 = var13;
                break L3;
              }
            }
            L4: while (true) {
              if (var14 >= param1) {
                var16 = param2;
                var17 = -var17;
                var19 = var17 * var17 + var15;
                var18 = var19 - var16;
                var19 = var19 - var17;
                L5: while (true) {
                  if (var14 >= var13) {
                    return;
                  } else {
                    L6: while (true) {
                      L7: {
                        if (var19 <= var15) {
                          break L7;
                        } else {
                          if (var18 <= var15) {
                            break L7;
                          } else {
                            incrementValue$6 = var16;
                            var16--;
                            var19 = var19 - (incrementValue$6 + var16);
                            var18 = var18 - (var16 + var16);
                            continue L6;
                          }
                        }
                      }
                      L8: {
                        var20 = param0 - var16;
                        if (var20 >= field_a) {
                          break L8;
                        } else {
                          var20 = field_a;
                          break L8;
                        }
                      }
                      L9: {
                        var21 = param0 + var16;
                        if (var21 <= field_b - 1) {
                          break L9;
                        } else {
                          var21 = field_b - 1;
                          break L9;
                        }
                      }
                      var25 = var20 + var14 * field_l;
                      var22 = var25;
                      var23 = var20;
                      L10: while (true) {
                        if (var23 > var21) {
                          var14++;
                          var19 = var19 + (var17 + var17);
                          incrementValue$7 = var17;
                          var17++;
                          var18 = var18 + (incrementValue$7 + var17);
                          continue L5;
                        } else {
                          var9 = (field_i[var25] >> 16 & 255) * var5;
                          var10 = (field_i[var25] >> 8 & 255) * var5;
                          var11 = (field_i[var25] & 255) * var5;
                          var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                          incrementValue$8 = var25;
                          var25++;
                          field_i[incrementValue$8] = var24;
                          var23++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              } else {
                L11: while (true) {
                  L12: {
                    if (var19 <= var15) {
                      break L12;
                    } else {
                      if (var18 > var15) {
                        L13: {
                          var20 = param0 - var16 + 1;
                          if (var20 >= field_a) {
                            break L13;
                          } else {
                            var20 = field_a;
                            break L13;
                          }
                        }
                        L14: {
                          var21 = param0 + var16;
                          if (var21 <= field_b) {
                            break L14;
                          } else {
                            var21 = field_b;
                            break L14;
                          }
                        }
                        var22 = var20 + var14 * field_l;
                        var23 = var20;
                        L15: while (true) {
                          if (var23 >= var21) {
                            var14++;
                            incrementValue$9 = var17;
                            var17--;
                            var18 = var18 - (incrementValue$9 + var17);
                            var19 = var19 - (var17 + var17);
                            continue L4;
                          } else {
                            var9 = (field_i[var22] >> 16 & 255) * var5;
                            var10 = (field_i[var22] >> 8 & 255) * var5;
                            var11 = (field_i[var22] & 255) * var5;
                            var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                            incrementValue$10 = var22;
                            var22++;
                            field_i[incrementValue$10] = var24;
                            var23++;
                            continue L15;
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  var18 = var18 + (var16 + var16);
                  incrementValue$11 = var16;
                  var16++;
                  var19 = var19 + (incrementValue$11 + var16);
                  continue L11;
                }
              }
            }
          } else {
            em.d(param0, param1, param2, param3);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$0 = 0;
        if (param0 < field_a) {
            param2 = param2 - (field_a - param0);
            param0 = field_a;
        }
        if (param1 < field_k) {
            param3 = param3 - (field_k - param1);
            param1 = field_k;
        }
        if (param0 + param2 > field_b) {
            param2 = field_b - param0;
        }
        if (param1 + param3 > field_j) {
            param3 = field_j - param1;
        }
        param4 = ((param4 & 16711935) * param5 >> 8 & 16711935) + ((param4 & 65280) * param5 >> 8 & 65280);
        int var6 = 256 - param5;
        int var7 = field_l - param2;
        int var8 = param0 + param1 * field_l;
        for (var9 = 0; var9 < param3; var9++) {
            for (var10 = -param2; var10 < 0; var10++) {
                var11 = field_i[var8];
                var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
                incrementValue$0 = var8;
                var8++;
                field_i[incrementValue$0] = param4 + var11;
            }
            var8 = var8 + var7;
        }
    }

    private final static void f(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        if (param0 >= field_a) {
            if (param0 >= field_b) {
                return;
            }
            if (param1 < field_k) {
                param2 = param2 - (field_k - param1);
                param1 = field_k;
            }
            if (param1 + param2 > field_j) {
                param2 = field_j - param1;
            }
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * field_l;
            for (var13 = 0; var13 < param2; var13++) {
                var9 = (field_i[var12] >> 16 & 255) * var5;
                var10 = (field_i[var12] >> 8 & 255) * var5;
                var11 = (field_i[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                field_i[var12] = var14;
                var12 = var12 + field_l;
            }
            return;
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        field_i = param0;
        field_l = param1;
        field_d = param2;
        em.f(0, 0, param1, param2);
    }

    final static void c() {
        field_a = 0;
        field_k = 0;
        field_b = field_l;
        field_j = field_d;
        em.b();
    }

    final static void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var6 = 0;
          var7 = 65536 / param3;
          if (param0 >= field_a) {
            break L0;
          } else {
            param2 = param2 - (field_a - param0);
            param0 = field_a;
            break L0;
          }
        }
        L1: {
          if (param1 >= field_k) {
            break L1;
          } else {
            var6 = var6 + (field_k - param1) * var7;
            param3 = param3 - (field_k - param1);
            param1 = field_k;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= field_b) {
            break L2;
          } else {
            param2 = field_b - param0;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= field_j) {
            break L3;
          } else {
            param3 = field_j - param1;
            break L3;
          }
        }
        var8 = field_l - param2;
        var9 = param0 + param1 * field_l;
        var10 = -param3;
        L4: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = 65536 - var6 >> 8;
            var12 = var6 >> 8;
            var13 = ((param4 & 16711935) * var11 + (param5 & 16711935) * var12 & -16711936) + ((param4 & 65280) * var11 + (param5 & 65280) * var12 & 16711680) >>> 8;
            var14 = -param2;
            L5: while (true) {
              if (var14 >= 0) {
                var9 = var9 + var8;
                var6 = var6 + var7;
                var10++;
                continue L4;
              } else {
                incrementValue$1 = var9;
                var9++;
                field_i[incrementValue$1] = var13;
                var14++;
                continue L5;
              }
            }
          }
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        em.a(field_i, 0, param2 + param3 * field_l, param0, param2, param4, field_l - param4, param5);
        em.a(field_i, 0, param2 + param3 * field_l, param1, param3, param5, field_l - param4, param2, param4);
    }

    final static void e(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var5 = 0;
        for (var6 = 0; var6 < 4; var6++) {
            var5 = 128 - (var6 << 5);
            em.c(param0 + var6, param1 + param3 + var6, param2, param4, var5);
            em.f(param0 + param2 + var6, param1 + var6, param3 + 1, param4, var5);
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        em.e(param0, param1, param2, param4);
        em.e(param0, param1 + param3 - 1, param2, param4);
        em.g(param0, param1, param3, param4);
        em.g(param0 + param2 - 1, param1, param3, param4);
    }

    private final static void c(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        if (param1 >= field_k) {
            if (param1 >= field_j) {
                return;
            }
            if (param0 < field_a) {
                param2 = param2 - (field_a - param0);
                param0 = field_a;
            }
            if (param0 + param2 > field_b) {
                param2 = field_b - param0;
            }
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * field_l;
            for (var13 = 0; var13 < param2; var13++) {
                var9 = (field_i[var12] >> 16 & 255) * var5;
                var10 = (field_i[var12] >> 8 & 255) * var5;
                var11 = (field_i[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                incrementValue$0 = var12;
                var12++;
                field_i[incrementValue$0] = var14;
            }
            return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        if (param0 < field_a) {
            param2 = param2 - (field_a - param0);
            param0 = field_a;
        }
        if (param1 < field_k) {
            param3 = param3 - (field_k - param1);
            param1 = field_k;
        }
        if (param0 + param2 > field_b) {
            param2 = field_b - param0;
        }
        if (param1 + param3 > field_j) {
            param3 = field_j - param1;
        }
        int var5 = field_l - param2;
        int var6 = param0 + param1 * field_l;
        for (var7 = -param3; var7 < 0; var7++) {
            for (var8 = -param2; var8 < 0; var8++) {
                incrementValue$0 = var6;
                var6++;
                field_i[incrementValue$0] = param4;
            }
            var6 = var6 + var5;
        }
    }

    private final static void b() {
        field_c = null;
        field_f = null;
    }

    final static void h(int param0, int param1, int param2, int param3) {
        if (field_a < param0) {
            field_a = param0;
        }
        if (field_k < param1) {
            field_k = param1;
        }
        if (field_b > param2) {
            field_b = param2;
        }
        if (field_j > param3) {
            field_j = param3;
        }
        em.b();
    }

    final static void c(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$0 = 0;
        if (param0 < field_a) {
            param2 = param2 - (field_a - param0);
            param0 = field_a;
        }
        if (param0 + param2 > field_b) {
            param2 = field_b - param0;
        }
        if (param1 < field_k) {
            param3 = param3 - (field_k - param1);
            param1 = field_k;
        }
        if (param1 + param3 > field_j) {
            param3 = field_j - param1;
        }
        int var4 = param0 + param1 * field_l;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            for (var5 = 0; var5 < param3; var5++) {
                for (var6 = 0; var6 < param2; var6++) {
                    var7 = field_i[var4];
                    var8 = var7 >> 15 & 510;
                    var9 = var7 >> 8 & 255;
                    var10 = var7 & 255;
                    var11 = (var10 + var8) / 3 + var9 >> 1;
                    incrementValue$0 = var4;
                    var4++;
                    field_i[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
                }
                var4 = var4 + (field_l - param2);
            }
            return;
        }
    }

    final static void b(int[] param0) {
        field_a = param0[0];
        field_k = param0[1];
        field_b = param0[2];
        field_j = param0[3];
        em.b();
    }

    final static void g(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 >= field_a) {
            if (param0 >= field_b) {
                return;
            }
            if (param1 < field_k) {
                param2 = param2 - (field_k - param1);
                param1 = field_k;
            }
            if (param1 + param2 > field_j) {
                param2 = field_j - param1;
            }
            var4 = param0 + param1 * field_l;
            var5 = 0;
            while (var5 < param2) {
                field_i[var4] = param3;
                var5++;
                var4 = var4 + field_l;
            }
            return;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
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
        L0: {
          var8 = 16384 / (2 * param3 + 1);
          var9 = 1 + param3 - param5 - param4;
          if (0 >= var9) {
            break L0;
          } else {
            var9 = 0;
            break L0;
          }
        }
        L1: {
          var10 = field_l - param4 - param5 - param3;
          if (0 >= var10) {
            break L1;
          } else {
            var10 = 0;
            break L1;
          }
        }
        L2: {
          var11 = 0;
          var12 = param4 + param3 + 1;
          if (field_l >= var12) {
            break L2;
          } else {
            var11 = var12 - field_l;
            var12 = field_l;
            break L2;
          }
        }
        var13 = -param7;
        L3: while (true) {
          if (var13 >= 0) {
            return;
          } else {
            L4: {
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = param2 - param3;
              var18 = var17 - (param3 << 1) - 1;
              var19 = param4 - param3;
              if (var19 >= 0) {
                break L4;
              } else {
                var17 = var17 - var19;
                var18 = var18 - var19;
                var19 = 0;
                break L4;
              }
            }
            var20 = var12 - var19;
            L5: while (true) {
              if (var19 >= var12) {
                var18 = var18 + var11;
                incrementValue$6 = param2;
                param2++;
                param0[incrementValue$6] = (var14 / var20 << 16) + (var15 / var20 << 8) + var16 / var20;
                var19 = 1 - param5;
                L6: while (true) {
                  if (var19 >= var9) {
                    L7: while (true) {
                      if (var19 >= var10) {
                        L8: while (true) {
                          if (var19 >= 0) {
                            param2 = param2 + param6;
                            var13++;
                            continue L3;
                          } else {
                            L9: {
                              incrementValue$7 = var18;
                              var18++;
                              param1 = param0[incrementValue$7];
                              var14 = var14 - (param1 >> 16 & 255);
                              var15 = var15 - (param1 >> 8 & 255);
                              var16 = var16 - (param1 & 255);
                              var20--;
                              var21 = var14 / var20;
                              var22 = var15 / var20;
                              var23 = var16 / var20;
                              if (var21 >= 0) {
                                if (var21 <= 255) {
                                  break L9;
                                } else {
                                  var21 = 255;
                                  break L9;
                                }
                              } else {
                                var21 = 0;
                                break L9;
                              }
                            }
                            L10: {
                              if (var22 >= 0) {
                                if (var22 <= 255) {
                                  break L10;
                                } else {
                                  var22 = 255;
                                  break L10;
                                }
                              } else {
                                var22 = 0;
                                break L10;
                              }
                            }
                            L11: {
                              if (var23 >= 0) {
                                if (var23 <= 255) {
                                  break L11;
                                } else {
                                  var23 = 255;
                                  break L11;
                                }
                              } else {
                                var23 = 0;
                                break L11;
                              }
                            }
                            incrementValue$8 = param2;
                            param2++;
                            param0[incrementValue$8] = (var21 << 16) + (var22 << 8) + var23;
                            var19++;
                            continue L8;
                          }
                        }
                      } else {
                        L12: {
                          incrementValue$9 = var18;
                          var18++;
                          param1 = param0[incrementValue$9];
                          var14 = var14 - (param1 >> 16 & 255);
                          if (var14 >= 0) {
                            break L12;
                          } else {
                            var14 = 0;
                            break L12;
                          }
                        }
                        L13: {
                          var15 = var15 - (param1 >> 8 & 255);
                          if (var15 >= 0) {
                            break L13;
                          } else {
                            var15 = 0;
                            break L13;
                          }
                        }
                        L14: {
                          var16 = var16 - (param1 & 255);
                          if (var16 >= 0) {
                            break L14;
                          } else {
                            var16 = 0;
                            break L14;
                          }
                        }
                        L15: {
                          param1 = param0[var17];
                          var17++;
                          var14 = var14 + (param1 >> 16 & 255);
                          var15 = var15 + (param1 >> 8 & 255);
                          var16 = var16 + (param1 & 255);
                          var21 = var14 * var8 >> 14;
                          var22 = var15 * var8 >> 14;
                          var23 = var16 * var8 >> 14;
                          if (var21 <= 255) {
                            break L15;
                          } else {
                            var21 = 255;
                            break L15;
                          }
                        }
                        L16: {
                          if (var22 <= 255) {
                            break L16;
                          } else {
                            var22 = 255;
                            break L16;
                          }
                        }
                        L17: {
                          if (var23 <= 255) {
                            break L17;
                          } else {
                            var23 = 255;
                            break L17;
                          }
                        }
                        incrementValue$10 = param2;
                        param2++;
                        param0[incrementValue$10] = (var21 << 16) + (var22 << 8) + var23;
                        var19++;
                        continue L7;
                      }
                    }
                  } else {
                    L18: {
                      var18++;
                      if (param4 + param5 + var19 + param3 >= field_b) {
                        break L18;
                      } else {
                        param1 = param0[var17];
                        var17++;
                        var14 = var14 + (param1 >> 16 & 255);
                        var15 = var15 + (param1 >> 8 & 255);
                        var16 = var16 + (param1 & 255);
                        var20++;
                        break L18;
                      }
                    }
                    var21 = var14 / var20;
                    var22 = var15 / var20;
                    var23 = var16 / var20;
                    incrementValue$11 = param2;
                    param2++;
                    param0[incrementValue$11] = (var21 << 16) + (var22 << 8) + var23;
                    var19++;
                    continue L6;
                  }
                }
              } else {
                param1 = param0[var17];
                var14 = var14 + (param1 >> 16 & 255);
                var15 = var15 + (param1 >> 8 & 255);
                var16 = var16 + (param1 & 255);
                var17++;
                var18++;
                var19++;
                continue L5;
              }
            }
          }
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        em.c(param0, param1, param2, param4, param5);
        em.c(param0, param1 + param3 - 1, param2, param4, param5);
        if (param3 >= 3) {
            em.f(param0, param1 + 1, param3 - 2, param4, param5);
            em.f(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5);
            return;
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 != 0) {
          if (param2 != 0) {
            L0: {
              if (param2 + param3 >= 0) {
                break L0;
              } else {
                param0 = param0 + param2;
                param2 = -param2;
                param1 = param1 + param3;
                param3 = -param3;
                break L0;
              }
            }
            if (param2 <= param3) {
              L1: {
                param0 = param0 << 16;
                param0 = param0 + 32768;
                param2 = param2 << 16;
                var5 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
                param3 = param3 + param1;
                if (param1 >= field_k) {
                  break L1;
                } else {
                  param0 = param0 + var5 * (field_k - param1);
                  param1 = field_k;
                  break L1;
                }
              }
              L2: {
                if (param3 < field_j) {
                  break L2;
                } else {
                  param3 = field_j - 1;
                  break L2;
                }
              }
              L3: while (true) {
                if (param1 > param3) {
                  return;
                } else {
                  L4: {
                    var6 = param0 >> 16;
                    if (var6 < field_a) {
                      break L4;
                    } else {
                      if (var6 >= field_b) {
                        break L4;
                      } else {
                        field_i[var6 + param1 * field_l] = param4;
                        break L4;
                      }
                    }
                  }
                  param0 = param0 + var5;
                  param1++;
                  continue L3;
                }
              }
            } else {
              L5: {
                param1 = param1 << 16;
                param1 = param1 + 32768;
                param3 = param3 << 16;
                var5 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
                param2 = param2 + param0;
                if (param0 >= field_a) {
                  break L5;
                } else {
                  param1 = param1 + var5 * (field_a - param0);
                  param0 = field_a;
                  break L5;
                }
              }
              L6: {
                if (param2 < field_b) {
                  break L6;
                } else {
                  param2 = field_b - 1;
                  break L6;
                }
              }
              L7: while (true) {
                if (param0 > param2) {
                  return;
                } else {
                  L8: {
                    var6 = param1 >> 16;
                    if (var6 < field_k) {
                      break L8;
                    } else {
                      if (var6 >= field_j) {
                        break L8;
                      } else {
                        field_i[param0 + var6 * field_l] = param4;
                        break L8;
                      }
                    }
                  }
                  param1 = param1 + var5;
                  param0++;
                  continue L7;
                }
              }
            }
          } else {
            L9: {
              if (param3 < 0) {
                em.g(param0, param1 + param3, -param3 + 1, param4);
                break L9;
              } else {
                em.g(param0, param1, param3 + 1, param4);
                break L9;
              }
            }
            return;
          }
        } else {
          L10: {
            if (param2 < 0) {
              em.e(param0 + param2, param1, -param2 + 1, param4);
              break L10;
            } else {
              em.e(param0, param1, param2 + 1, param4);
              break L10;
            }
          }
          return;
        }
    }

    final static void f(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 > field_l) {
            param2 = field_l;
        }
        if (param3 > field_d) {
            param3 = field_d;
        }
        field_a = param0;
        field_k = param1;
        field_b = param2;
        field_j = param3;
        em.b();
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
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
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        L0: {
          L1: {
            if (field_h == null) {
              break L1;
            } else {
              if (field_h.length >= param8) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          field_h = new int[param8];
          field_e = new int[param8];
          field_g = new int[param8];
          break L0;
        }
        L2: {
          var27 = field_h;
          var24 = var27;
          var9 = var24;
          var28 = field_e;
          var25 = var28;
          var10 = var25;
          var29 = field_g;
          var26 = var29;
          var11 = var26;
          qg.a(var27, 0, param8);
          qg.a(var28, 0, param8);
          qg.a(var29, 0, param8);
          var12 = 16384 / (2 * param3 + 1);
          var13 = param4 - param3;
          if (var13 >= 0) {
            break L2;
          } else {
            var13 = 0;
            break L2;
          }
        }
        L3: {
          var14 = param7 + var13 * field_l;
          var15 = param4 + param3;
          var16 = 0;
          if (var15 < field_d) {
            break L3;
          } else {
            var16 = var15 - field_d + 1;
            var15 = field_d - 1;
            break L3;
          }
        }
        var17 = var15 - var13 + 1;
        L4: while (true) {
          if (var13 > var15) {
            var14 = var14 + var16 * field_l;
            var18 = 0;
            L5: while (true) {
              if (var18 >= param8) {
                L6: {
                  param2 = param2 + param6;
                  var13 = 1 - param5;
                  var18 = 1 + param3 - param5 - param4;
                  if (0 >= var18) {
                    break L6;
                  } else {
                    var18 = 0;
                    break L6;
                  }
                }
                L7: {
                  var19 = param7 + (param4 - param3) * field_l;
                  if (var13 >= var18) {
                    break L7;
                  } else {
                    var19 = var19 + (var18 - var13) * field_l;
                    break L7;
                  }
                }
                L8: while (true) {
                  if (var13 >= var18) {
                    L9: {
                      var18 = field_d - param4 - param5 - param3;
                      if (0 >= var18) {
                        break L9;
                      } else {
                        var18 = 0;
                        break L9;
                      }
                    }
                    L10: while (true) {
                      if (var13 >= var18) {
                        L11: while (true) {
                          if (var13 >= 0) {
                            return;
                          } else {
                            var20 = 0;
                            L12: while (true) {
                              if (var20 >= param8) {
                                var19 = var19 + param6;
                                var17--;
                                var20 = 0;
                                L13: while (true) {
                                  if (var20 >= param8) {
                                    param2 = param2 + param6;
                                    var13++;
                                    continue L11;
                                  } else {
                                    L14: {
                                      var21 = var27[var20] / var17;
                                      var22 = var28[var20] / var17;
                                      var23 = var29[var20] / var17;
                                      if (var21 >= 0) {
                                        if (var21 <= 255) {
                                          break L14;
                                        } else {
                                          var21 = 255;
                                          break L14;
                                        }
                                      } else {
                                        var21 = 0;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if (var22 >= 0) {
                                        if (var22 <= 255) {
                                          break L15;
                                        } else {
                                          var22 = 255;
                                          break L15;
                                        }
                                      } else {
                                        var22 = 0;
                                        break L15;
                                      }
                                    }
                                    L16: {
                                      if (var23 >= 0) {
                                        if (var23 <= 255) {
                                          break L16;
                                        } else {
                                          var23 = 255;
                                          break L16;
                                        }
                                      } else {
                                        var23 = 0;
                                        break L16;
                                      }
                                    }
                                    incrementValue$9 = param2;
                                    param2++;
                                    param0[incrementValue$9] = (var21 << 16) + (var22 << 8) + var23;
                                    var20++;
                                    continue L13;
                                  }
                                }
                              } else {
                                incrementValue$10 = var19;
                                var19++;
                                param1 = param0[incrementValue$10];
                                var9[var20] = var9[var20] - (param1 >> 16 & 255);
                                var10[var20] = var10[var20] - (param1 >> 8 & 255);
                                var11[var20] = var11[var20] - (param1 & 255);
                                var20++;
                                continue L12;
                              }
                            }
                          }
                        }
                      } else {
                        var20 = 0;
                        L17: while (true) {
                          if (var20 >= param8) {
                            var19 = var19 + param6;
                            var20 = 0;
                            L18: while (true) {
                              if (var20 >= param8) {
                                var14 = var14 + param6;
                                var20 = 0;
                                L19: while (true) {
                                  if (var20 >= param8) {
                                    param2 = param2 + param6;
                                    var13++;
                                    continue L10;
                                  } else {
                                    L20: {
                                      var21 = var27[var20] * var12 >> 14;
                                      var22 = var28[var20] * var12 >> 14;
                                      var23 = var29[var20] * var12 >> 14;
                                      if (var21 <= 255) {
                                        break L20;
                                      } else {
                                        var21 = 255;
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (var22 <= 255) {
                                        break L21;
                                      } else {
                                        var22 = 255;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (var23 <= 255) {
                                        break L22;
                                      } else {
                                        var23 = 255;
                                        break L22;
                                      }
                                    }
                                    incrementValue$11 = param2;
                                    param2++;
                                    param0[incrementValue$11] = (var21 << 16) + (var22 << 8) + var23;
                                    var20++;
                                    continue L19;
                                  }
                                }
                              } else {
                                incrementValue$12 = var14;
                                var14++;
                                param1 = param0[incrementValue$12];
                                var9[var20] = var9[var20] + (param1 >> 16 & 255);
                                var10[var20] = var10[var20] + (param1 >> 8 & 255);
                                var11[var20] = var11[var20] + (param1 & 255);
                                var20++;
                                continue L18;
                              }
                            }
                          } else {
                            L23: {
                              incrementValue$13 = var19;
                              var19++;
                              param1 = param0[incrementValue$13];
                              var21 = var27[var20] - (param1 >> 16 & 255);
                              stackOut_36_0 = (int[]) (var9);
                              stackOut_36_1 = var20;
                              stackIn_38_0 = stackOut_36_0;
                              stackIn_38_1 = stackOut_36_1;
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              if (var21 >= 0) {
                                stackOut_38_0 = (int[]) ((Object) stackIn_38_0);
                                stackOut_38_1 = stackIn_38_1;
                                stackOut_38_2 = var21;
                                stackIn_39_0 = stackOut_38_0;
                                stackIn_39_1 = stackOut_38_1;
                                stackIn_39_2 = stackOut_38_2;
                                break L23;
                              } else {
                                stackOut_37_0 = (int[]) ((Object) stackIn_37_0);
                                stackOut_37_1 = stackIn_37_1;
                                stackOut_37_2 = 0;
                                stackIn_39_0 = stackOut_37_0;
                                stackIn_39_1 = stackOut_37_1;
                                stackIn_39_2 = stackOut_37_2;
                                break L23;
                              }
                            }
                            L24: {
                              stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                              var21 = var28[var20] - (param1 >> 8 & 255);
                              stackOut_39_0 = (int[]) (var10);
                              stackOut_39_1 = var20;
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              if (var21 >= 0) {
                                stackOut_41_0 = (int[]) ((Object) stackIn_41_0);
                                stackOut_41_1 = stackIn_41_1;
                                stackOut_41_2 = var21;
                                stackIn_42_0 = stackOut_41_0;
                                stackIn_42_1 = stackOut_41_1;
                                stackIn_42_2 = stackOut_41_2;
                                break L24;
                              } else {
                                stackOut_40_0 = (int[]) ((Object) stackIn_40_0);
                                stackOut_40_1 = stackIn_40_1;
                                stackOut_40_2 = 0;
                                stackIn_42_0 = stackOut_40_0;
                                stackIn_42_1 = stackOut_40_1;
                                stackIn_42_2 = stackOut_40_2;
                                break L24;
                              }
                            }
                            L25: {
                              stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                              var21 = var29[var20] - (param1 & 255);
                              stackOut_42_0 = (int[]) (var11);
                              stackOut_42_1 = var20;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              if (var21 >= 0) {
                                stackOut_44_0 = (int[]) ((Object) stackIn_44_0);
                                stackOut_44_1 = stackIn_44_1;
                                stackOut_44_2 = var21;
                                stackIn_45_0 = stackOut_44_0;
                                stackIn_45_1 = stackOut_44_1;
                                stackIn_45_2 = stackOut_44_2;
                                break L25;
                              } else {
                                stackOut_43_0 = (int[]) ((Object) stackIn_43_0);
                                stackOut_43_1 = stackIn_43_1;
                                stackOut_43_2 = 0;
                                stackIn_45_0 = stackOut_43_0;
                                stackIn_45_1 = stackOut_43_1;
                                stackIn_45_2 = stackOut_43_2;
                                break L25;
                              }
                            }
                            stackIn_45_0[stackIn_45_1] = stackIn_45_2;
                            var20++;
                            continue L17;
                          }
                        }
                      }
                    }
                  } else {
                    L26: {
                      if (var13 + param4 + param5 + param3 >= field_j) {
                        var14 = var14 + field_l;
                        break L26;
                      } else {
                        var20 = 0;
                        L27: while (true) {
                          if (var20 >= param8) {
                            var14 = var14 + param6;
                            var17++;
                            break L26;
                          } else {
                            incrementValue$14 = var14;
                            var14++;
                            param1 = param0[incrementValue$14];
                            var9[var20] = var9[var20] + (param1 >> 16 & 255);
                            var10[var20] = var10[var20] + (param1 >> 8 & 255);
                            var11[var20] = var11[var20] + (param1 & 255);
                            var20++;
                            continue L27;
                          }
                        }
                      }
                    }
                    var20 = 0;
                    L28: while (true) {
                      if (var20 >= param8) {
                        param2 = param2 + param6;
                        var13++;
                        continue L8;
                      } else {
                        var21 = var27[var20] / var17;
                        var22 = var28[var20] / var17;
                        var23 = var29[var20] / var17;
                        incrementValue$15 = param2;
                        param2++;
                        param0[incrementValue$15] = (var21 << 16) + (var22 << 8) + var23;
                        var20++;
                        continue L28;
                      }
                    }
                  }
                }
              } else {
                incrementValue$16 = param2;
                param2++;
                param0[incrementValue$16] = (var27[var18] / var17 << 16) + (var28[var18] / var17 << 8) + var29[var18] / var17;
                var18++;
                continue L5;
              }
            }
          } else {
            var18 = 0;
            L29: while (true) {
              if (var18 >= param8) {
                var14 = var14 + param6;
                var13++;
                continue L4;
              } else {
                incrementValue$17 = var14;
                var14++;
                param1 = param0[incrementValue$17];
                var9[var18] = var9[var18] + (param1 >> 16 & 255);
                var10[var18] = var10[var18] + (param1 >> 8 & 255);
                var11[var18] = var11[var18] + (param1 & 255);
                var18++;
                continue L29;
              }
            }
          }
        }
    }

    private final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5) {
        while (param4 < 0) {
            param2 = param0 + param3 - 7;
            while (param0 < param2) {
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
            }
            param2 += 7;
            while (param0 < param2) {
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
            }
            param0 = param0 + param5;
            param4++;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 < field_a) {
          return;
        } else {
          L0: {
            if (param1 < field_k) {
              break L0;
            } else {
              if (param0 >= field_b) {
                break L0;
              } else {
                if (param1 < field_j) {
                  var3 = param0 + param1 * field_l;
                  var4 = field_i[var3];
                  var5 = param2 + var4;
                  param2 = (param2 & 16711935) + (var4 & 16711935);
                  var4 = (param2 & 16777472) + (var5 - param2 & 65536);
                  field_i[var3] = var5 - var4 | var4 - (var4 >>> 8);
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final static void d(int param0, int param1, int param2, int param3) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
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
        if (param2 != 0) {
          L0: {
            if (param2 >= 0) {
              break L0;
            } else {
              param2 = -param2;
              break L0;
            }
          }
          L1: {
            var4 = param1 - param2;
            if (var4 >= field_k) {
              break L1;
            } else {
              var4 = field_k;
              break L1;
            }
          }
          L2: {
            var5 = param1 + param2 + 1;
            if (var5 <= field_j) {
              break L2;
            } else {
              var5 = field_j;
              break L2;
            }
          }
          L3: {
            var6 = var4;
            var7 = param2 * param2;
            var8 = 0;
            var9 = param1 - var6;
            var10 = var9 * var9;
            var11 = var10 - var9;
            if (param1 <= var5) {
              break L3;
            } else {
              param1 = var5;
              break L3;
            }
          }
          L4: while (true) {
            if (var6 >= param1) {
              var8 = param2;
              var9 = var6 - param1;
              var11 = var9 * var9 + var7;
              var10 = var11 - var8;
              var11 = var11 - var9;
              L5: while (true) {
                if (var6 >= var5) {
                  return;
                } else {
                  L6: while (true) {
                    L7: {
                      if (var11 <= var7) {
                        break L7;
                      } else {
                        if (var10 <= var7) {
                          break L7;
                        } else {
                          incrementValue$6 = var8;
                          var8--;
                          var11 = var11 - (incrementValue$6 + var8);
                          var10 = var10 - (var8 + var8);
                          continue L6;
                        }
                      }
                    }
                    L8: {
                      var12 = param0 - var8;
                      if (var12 >= field_a) {
                        break L8;
                      } else {
                        var12 = field_a;
                        break L8;
                      }
                    }
                    L9: {
                      var13 = param0 + var8;
                      if (var13 <= field_b - 1) {
                        break L9;
                      } else {
                        var13 = field_b - 1;
                        break L9;
                      }
                    }
                    var14 = var12 + var6 * field_l;
                    var15 = var12;
                    L10: while (true) {
                      if (var15 > var13) {
                        var6++;
                        var11 = var11 + (var9 + var9);
                        incrementValue$7 = var9;
                        var9++;
                        var10 = var10 + (incrementValue$7 + var9);
                        continue L5;
                      } else {
                        incrementValue$8 = var14;
                        var14++;
                        field_i[incrementValue$8] = param3;
                        var15++;
                        continue L10;
                      }
                    }
                  }
                }
              }
            } else {
              L11: while (true) {
                L12: {
                  if (var11 <= var7) {
                    break L12;
                  } else {
                    if (var10 > var7) {
                      L13: {
                        var12 = param0 - var8 + 1;
                        if (var12 >= field_a) {
                          break L13;
                        } else {
                          var12 = field_a;
                          break L13;
                        }
                      }
                      L14: {
                        var13 = param0 + var8;
                        if (var13 <= field_b) {
                          break L14;
                        } else {
                          var13 = field_b;
                          break L14;
                        }
                      }
                      var14 = var12 + var6 * field_l;
                      var15 = var12;
                      L15: while (true) {
                        if (var15 >= var13) {
                          var6++;
                          incrementValue$9 = var9;
                          var9--;
                          var10 = var10 - (incrementValue$9 + var9);
                          var11 = var11 - (var9 + var9);
                          continue L4;
                        } else {
                          incrementValue$10 = var14;
                          var14++;
                          field_i[incrementValue$10] = param3;
                          var15++;
                          continue L15;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                var10 = var10 + (var8 + var8);
                incrementValue$11 = var8;
                var8++;
                var11 = var11 + (incrementValue$11 + var8);
                continue L11;
              }
            }
          }
        } else {
          em.b(param0, param1, param3);
          return;
        }
    }

    final static void b(int param0, int param1, int param2, int param3) {
        if (param0 < field_a) {
            param2 = param2 - (field_a - param0);
            param0 = field_a;
        }
        if (param1 < field_k) {
            param3 = param3 - (field_k - param1);
            param1 = field_k;
        }
        if (param0 + param2 > field_b) {
            param2 = field_b - param0;
        }
        if (param1 + param3 > field_j) {
            param3 = field_j - param1;
        }
        int var4 = field_l - param2;
        int var5 = param0 + param1 * field_l;
        em.a(var5, field_i, 0, param2, -param3, var4);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (param2 != 0) {
          L0: {
            if (param2 >= 0) {
              break L0;
            } else {
              param2 = -param2;
              break L0;
            }
          }
          L1: {
            if (field_b <= field_a) {
              break L1;
            } else {
              if (field_j > field_k) {
                if (param0 + param2 < field_a) {
                  break L1;
                } else {
                  L2: {
                    if (param0 - param2 >= field_b) {
                      break L2;
                    } else {
                      if (param1 + param2 < field_k) {
                        break L2;
                      } else {
                        if (param1 - param2 < field_j) {
                          L3: {
                            L4: {
                              var4 = param0 + param1 * field_l;
                              var5 = var4;
                              var6 = var4 - param2 * field_l;
                              var7 = var4 + param2 * field_l;
                              var8 = param2;
                              var9 = 0;
                              param2 = param2 * param2;
                              var10 = param2 - var8;
                              if (param0 - var8 < field_a) {
                                break L4;
                              } else {
                                if (param0 + var8 >= field_b) {
                                  break L4;
                                } else {
                                  if (param1 - var8 < field_k) {
                                    break L4;
                                  } else {
                                    if (param1 + var8 < field_j) {
                                      field_i[var4 - var8] = param3;
                                      field_i[var4 + var8] = param3;
                                      field_i[var6] = param3;
                                      field_i[var7] = param3;
                                      L5: while (true) {
                                        L6: {
                                          incrementValue$2 = var9;
                                          var9++;
                                          var10 = var10 + (incrementValue$2 + var9);
                                          var4 = var4 - field_l;
                                          var5 = var5 + field_l;
                                          if (var10 <= param2) {
                                            break L6;
                                          } else {
                                            var8--;
                                            var10 = var10 - (var8 + var8);
                                            var6 = var6 + field_l;
                                            var7 = var7 - field_l;
                                            break L6;
                                          }
                                        }
                                        if (var8 >= var9) {
                                          field_i[var6 - var9] = param3;
                                          field_i[var6 + var9] = param3;
                                          field_i[var4 - var8] = param3;
                                          field_i[var4 + var8] = param3;
                                          field_i[var5 - var8] = param3;
                                          field_i[var5 + var8] = param3;
                                          field_i[var7 - var9] = param3;
                                          field_i[var7 + var9] = param3;
                                          continue L5;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                            L7: {
                              if (param0 - var8 < field_a) {
                                break L7;
                              } else {
                                if (param1 < field_k) {
                                  break L7;
                                } else {
                                  if (param1 >= field_j) {
                                    break L7;
                                  } else {
                                    field_i[var4 - var8] = param3;
                                    break L7;
                                  }
                                }
                              }
                            }
                            L8: {
                              if (param0 + var8 >= field_b) {
                                break L8;
                              } else {
                                if (param1 < field_k) {
                                  break L8;
                                } else {
                                  if (param1 >= field_j) {
                                    break L8;
                                  } else {
                                    field_i[var4 + var8] = param3;
                                    break L8;
                                  }
                                }
                              }
                            }
                            L9: {
                              if (param1 - var8 < field_k) {
                                if (param1 + var8 >= field_j) {
                                  break L9;
                                } else {
                                  if (param0 < field_a) {
                                    break L9;
                                  } else {
                                    if (param0 >= field_b) {
                                      break L9;
                                    } else {
                                      field_i[var7] = param3;
                                      break L9;
                                    }
                                  }
                                }
                              } else {
                                if (param1 + var8 >= field_j) {
                                  break L9;
                                } else {
                                  if (param0 < field_a) {
                                    break L9;
                                  } else {
                                    if (param0 >= field_b) {
                                      break L9;
                                    } else {
                                      field_i[var7] = param3;
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                            L10: while (true) {
                              L11: {
                                incrementValue$3 = var9;
                                var9++;
                                var10 = var10 + (incrementValue$3 + var9);
                                var4 = var4 - field_l;
                                var5 = var5 + field_l;
                                if (var10 <= param2) {
                                  break L11;
                                } else {
                                  var8--;
                                  var10 = var10 - (var8 + var8);
                                  var6 = var6 + field_l;
                                  var7 = var7 - field_l;
                                  break L11;
                                }
                              }
                              if (var8 >= var9) {
                                L12: {
                                  if (param1 - var8 < field_k) {
                                    break L12;
                                  } else {
                                    if (param1 - var8 >= field_j) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (param0 - var9 < field_a) {
                                          break L13;
                                        } else {
                                          if (param0 - var9 >= field_b) {
                                            break L13;
                                          } else {
                                            field_i[var6 - var9] = param3;
                                            break L13;
                                          }
                                        }
                                      }
                                      if (param0 + var9 < field_a) {
                                        break L12;
                                      } else {
                                        if (param0 + var9 >= field_b) {
                                          break L12;
                                        } else {
                                          field_i[var6 + var9] = param3;
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                }
                                L14: {
                                  if (param1 - var9 < field_k) {
                                    break L14;
                                  } else {
                                    if (param1 - var9 >= field_j) {
                                      break L14;
                                    } else {
                                      L15: {
                                        if (param0 - var8 < field_a) {
                                          break L15;
                                        } else {
                                          if (param0 - var8 >= field_b) {
                                            break L15;
                                          } else {
                                            field_i[var4 - var8] = param3;
                                            break L15;
                                          }
                                        }
                                      }
                                      if (param0 + var8 < field_a) {
                                        break L14;
                                      } else {
                                        if (param0 + var8 >= field_b) {
                                          break L14;
                                        } else {
                                          field_i[var4 + var8] = param3;
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                }
                                L16: {
                                  if (param1 + var9 < field_k) {
                                    break L16;
                                  } else {
                                    if (param1 + var9 >= field_j) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (param0 - var8 < field_a) {
                                          break L17;
                                        } else {
                                          if (param0 - var8 >= field_b) {
                                            break L17;
                                          } else {
                                            field_i[var5 - var8] = param3;
                                            break L17;
                                          }
                                        }
                                      }
                                      if (param0 + var8 < field_a) {
                                        break L16;
                                      } else {
                                        if (param0 + var8 >= field_b) {
                                          break L16;
                                        } else {
                                          field_i[var5 + var8] = param3;
                                          break L16;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (param1 + var8 < field_k) {
                                  continue L10;
                                } else {
                                  if (param1 + var8 >= field_j) {
                                    continue L10;
                                  } else {
                                    L18: {
                                      if (param0 - var9 < field_a) {
                                        break L18;
                                      } else {
                                        if (param0 - var9 >= field_b) {
                                          break L18;
                                        } else {
                                          field_i[var7 - var9] = param3;
                                          break L18;
                                        }
                                      }
                                    }
                                    if (param0 + var9 < field_a) {
                                      continue L10;
                                    } else {
                                      if (param0 + var9 >= field_b) {
                                        continue L10;
                                      } else {
                                        field_i[var7 + var9] = param3;
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          em.b(param0, param1, param3);
          return;
        }
    }

    final static void b(int param0, int param1, int param2) {
        if (param0 < field_a) {
          return;
        } else {
          L0: {
            if (param1 < field_k) {
              break L0;
            } else {
              if (param0 >= field_b) {
                break L0;
              } else {
                if (param1 < field_j) {
                  field_i[param0 + param1 * field_l] = param2;
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final static void e(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param1 >= field_k) {
            if (param1 >= field_j) {
                return;
            }
            if (param0 < field_a) {
                param2 = param2 - (field_a - param0);
                param0 = field_a;
            }
            if (param0 + param2 > field_b) {
                param2 = field_b - param0;
            }
            var4 = param0 + param1 * field_l;
            for (var5 = 0; var5 < param2; var5++) {
                field_i[var4 + var5] = param3;
            }
            return;
        }
    }

    public static void a() {
        field_i = null;
        field_c = null;
        field_f = null;
        field_h = null;
        field_e = null;
        field_g = null;
    }

    final static void d() {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var0 = 0;
        int var1 = field_l * field_d - 7;
        while (var0 < var1) {
            incrementValue$0 = var0;
            var0++;
            field_i[incrementValue$0] = 0;
            incrementValue$1 = var0;
            var0++;
            field_i[incrementValue$1] = 0;
            incrementValue$2 = var0;
            var0++;
            field_i[incrementValue$2] = 0;
            incrementValue$3 = var0;
            var0++;
            field_i[incrementValue$3] = 0;
            incrementValue$4 = var0;
            var0++;
            field_i[incrementValue$4] = 0;
            incrementValue$5 = var0;
            var0++;
            field_i[incrementValue$5] = 0;
            incrementValue$6 = var0;
            var0++;
            field_i[incrementValue$6] = 0;
            incrementValue$7 = var0;
            var0++;
            field_i[incrementValue$7] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            incrementValue$8 = var0;
            var0++;
            field_i[incrementValue$8] = 0;
        }
    }

    static {
        field_j = 0;
        field_b = 0;
        field_k = 0;
        field_a = 0;
    }
}
