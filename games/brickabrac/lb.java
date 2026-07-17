/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    private static int[] field_k;
    static int field_f;
    static int[] field_h;
    static int field_j;
    static int[] field_l;
    private static int[] field_a;
    static int field_i;
    static int field_b;
    static int field_d;
    private static int[] field_g;
    static int[] field_e;
    static int field_c;

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int[] param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17) {
        int var18 = 0;
        while (param17 < 0) {
            param3 = param14;
            param4 = param12;
            for (var18 = param13; var18 < 0; var18++) {
                if (param3 < param6) {
                    param0 = param10[(param6 - param3) * param9 / param6];
                    param1 = param8[param7];
                    param2 = param0 + param1;
                    param0 = (param0 & 16711935) + (param1 & 16711935);
                    param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                    param8[param7] = param2 - param1 | param1 - (param1 >>> 8);
                }
                param7++;
                param3 = param3 + param4;
                param4 = param4 + param5;
            }
            param7 = param7 + param11;
            param14 = param14 + param15;
            param15 = param15 + param16;
            param17++;
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

    final static void a() {
        field_i = 0;
        field_b = 0;
        field_f = field_c;
        field_j = field_d;
        lb.b();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        if (param6 != 256) {
          if (param4 != 0) {
            L0: {
              var7 = 256 - param6;
              param5 = ((param5 & 16711935) * param6 >> 8 & 16711935) + ((param5 & 65280) * param6 >> 8 & 65280);
              if (param4 >= 0) {
                break L0;
              } else {
                param4 = -param4;
                break L0;
              }
            }
            L1: {
              var8 = param0 + param4;
              var9 = param1 + param4;
              var10 = param1;
              if (var10 >= field_b) {
                break L1;
              } else {
                var10 = field_b;
                break L1;
              }
            }
            L2: {
              var11 = param1 + param3;
              if (var11 <= field_j) {
                break L2;
              } else {
                var11 = field_j;
                break L2;
              }
            }
            L3: {
              var12 = param2 - param4 - param4 - 1;
              var13 = var10;
              var14 = param4 * param4;
              var15 = 0;
              var16 = var9 - var13;
              var17 = var16 * var16;
              var18 = var17 - var16;
              if (var9 <= var11) {
                break L3;
              } else {
                var9 = var11;
                break L3;
              }
            }
            L4: while (true) {
              if (var13 >= var9) {
                L5: {
                  var16 = var13 - var9;
                  var19 = param0;
                  if (var19 >= field_i) {
                    break L5;
                  } else {
                    var19 = field_i;
                    break L5;
                  }
                }
                L6: {
                  var20 = param0 + param2;
                  if (var20 <= field_f) {
                    break L6;
                  } else {
                    var20 = field_f;
                    break L6;
                  }
                }
                L7: {
                  var21 = var19 + var13 * field_c;
                  var22 = field_c + var19 - var20;
                  var23 = param1 + param3 - param4 - 1;
                  if (var23 <= field_j) {
                    break L7;
                  } else {
                    var23 = field_j;
                    break L7;
                  }
                }
                L8: while (true) {
                  if (var13 >= var23) {
                    var16 = 0;
                    var15 = param4;
                    var18 = var16 * var16 + var14;
                    var17 = var18 - var15;
                    var18 = var18 - var16;
                    L9: while (true) {
                      if (var13 >= var11) {
                        return;
                      } else {
                        L10: while (true) {
                          L11: {
                            if (var18 <= var14) {
                              break L11;
                            } else {
                              if (var17 <= var14) {
                                break L11;
                              } else {
                                int incrementValue$7 = var15;
                                var15--;
                                var18 = var18 - (incrementValue$7 + var15);
                                var17 = var17 - (var15 + var15);
                                continue L10;
                              }
                            }
                          }
                          L12: {
                            var19 = var8 - var15;
                            if (var19 >= field_i) {
                              break L12;
                            } else {
                              var19 = field_i;
                              break L12;
                            }
                          }
                          L13: {
                            var20 = var8 + var12 + var15;
                            if (var20 <= field_f - 1) {
                              break L13;
                            } else {
                              var20 = field_f - 1;
                              break L13;
                            }
                          }
                          var21 = var19 + var13 * field_c;
                          var22 = var19;
                          L14: while (true) {
                            if (var22 > var20) {
                              var13++;
                              var18 = var18 + (var16 + var16);
                              int incrementValue$8 = var16;
                              var16++;
                              var17 = var17 + (incrementValue$8 + var16);
                              continue L9;
                            } else {
                              var23 = field_l[var21];
                              var23 = ((var23 & 16711935) * var7 >> 8 & 16711935) + ((var23 & 65280) * var7 >> 8 & 65280);
                              int incrementValue$9 = var21;
                              var21++;
                              field_l[incrementValue$9] = param5 + var23;
                              var22++;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var24 = var19;
                    L15: while (true) {
                      if (var24 >= var20) {
                        var13++;
                        var21 = var21 + var22;
                        continue L8;
                      } else {
                        var25 = field_l[var21];
                        var25 = ((var25 & 16711935) * var7 >> 8 & 16711935) + ((var25 & 65280) * var7 >> 8 & 65280);
                        int incrementValue$10 = var21;
                        var21++;
                        field_l[incrementValue$10] = param5 + var25;
                        var24++;
                        continue L15;
                      }
                    }
                  }
                }
              } else {
                L16: while (true) {
                  L17: {
                    if (var18 <= var14) {
                      break L17;
                    } else {
                      if (var17 > var14) {
                        L18: {
                          var19 = var8 - var15 + 1;
                          if (var19 >= field_i) {
                            break L18;
                          } else {
                            var19 = field_i;
                            break L18;
                          }
                        }
                        L19: {
                          var20 = var8 + var12 + var15;
                          if (var20 <= field_f) {
                            break L19;
                          } else {
                            var20 = field_f;
                            break L19;
                          }
                        }
                        var21 = var19 + var13 * field_c;
                        var22 = var19;
                        L20: while (true) {
                          if (var22 >= var20) {
                            var13++;
                            int incrementValue$11 = var16;
                            var16--;
                            var17 = var17 - (incrementValue$11 + var16);
                            var18 = var18 - (var16 + var16);
                            continue L4;
                          } else {
                            var23 = field_l[var21];
                            var23 = ((var23 & 16711935) * var7 >> 8 & 16711935) + ((var23 & 65280) * var7 >> 8 & 65280);
                            int incrementValue$12 = var21;
                            var21++;
                            field_l[incrementValue$12] = param5 + var23;
                            var22++;
                            continue L20;
                          }
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  var17 = var17 + (var15 + var15);
                  int incrementValue$13 = var15;
                  var15++;
                  var18 = var18 + (incrementValue$13 + var15);
                  continue L16;
                }
              }
            }
          } else {
            lb.d(param0, param1, param2, param3, param5, param6);
            return;
          }
        } else {
          lb.b(param0, param1, param2, param3, param4, param5);
          return;
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        field_l = param0;
        field_c = param1;
        field_d = param2;
        lb.e(0, 0, param1, param2);
    }

    final static void g(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 >= field_i) {
            if (param0 >= field_f) {
                return;
            }
            if (param1 < field_b) {
                param2 = param2 - (field_b - param1);
                param1 = field_b;
            }
            if (param1 + param2 > field_j) {
                param2 = field_j - param1;
            }
            var4 = param0 + param1 * field_c;
            var5 = 0;
            while (var5 < param2) {
                field_l[var4] = param3;
                var5++;
                var4 = var4 + field_c;
            }
            return;
        }
    }

    final static void f(int param0, int param1, int param2, int param3) {
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
            if (var4 >= field_b) {
              break L1;
            } else {
              var4 = field_b;
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
                          int incrementValue$6 = var8;
                          var8--;
                          var11 = var11 - (incrementValue$6 + var8);
                          var10 = var10 - (var8 + var8);
                          continue L6;
                        }
                      }
                    }
                    L8: {
                      var12 = param0 - var8;
                      if (var12 >= field_i) {
                        break L8;
                      } else {
                        var12 = field_i;
                        break L8;
                      }
                    }
                    L9: {
                      var13 = param0 + var8;
                      if (var13 <= field_f - 1) {
                        break L9;
                      } else {
                        var13 = field_f - 1;
                        break L9;
                      }
                    }
                    var14 = var12 + var6 * field_c;
                    var15 = var12;
                    L10: while (true) {
                      if (var15 > var13) {
                        var6++;
                        var11 = var11 + (var9 + var9);
                        int incrementValue$7 = var9;
                        var9++;
                        var10 = var10 + (incrementValue$7 + var9);
                        continue L5;
                      } else {
                        int incrementValue$8 = var14;
                        var14++;
                        field_l[incrementValue$8] = param3;
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
                        if (var12 >= field_i) {
                          break L13;
                        } else {
                          var12 = field_i;
                          break L13;
                        }
                      }
                      L14: {
                        var13 = param0 + var8;
                        if (var13 <= field_f) {
                          break L14;
                        } else {
                          var13 = field_f;
                          break L14;
                        }
                      }
                      var14 = var12 + var6 * field_c;
                      var15 = var12;
                      L15: while (true) {
                        if (var15 >= var13) {
                          var6++;
                          int incrementValue$9 = var9;
                          var9--;
                          var10 = var10 - (incrementValue$9 + var9);
                          var11 = var11 - (var9 + var9);
                          continue L4;
                        } else {
                          int incrementValue$10 = var14;
                          var14++;
                          field_l[incrementValue$10] = param3;
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
                int incrementValue$11 = var8;
                var8++;
                var11 = var11 + (incrementValue$11 + var8);
                continue L11;
              }
            }
          }
        } else {
          lb.a(param0, param1, param3);
          return;
        }
    }

    final static void b(int param0, int param1, int param2, int param3) {
        if (param0 < field_i) {
            param2 = param2 - (field_i - param0);
            param0 = field_i;
        }
        if (param1 < field_b) {
            param3 = param3 - (field_b - param1);
            param1 = field_b;
        }
        if (param0 + param2 > field_f) {
            param2 = field_f - param0;
        }
        if (param1 + param3 > field_j) {
            param3 = field_j - param1;
        }
        int var4 = field_c - param2;
        int var5 = param0 + param1 * field_c;
        lb.a(var5, field_l, 0, param2, -param3, var4);
    }

    final static void e(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 > field_c) {
            param2 = field_c;
        }
        if (param3 > field_d) {
            param3 = field_d;
        }
        field_i = param0;
        field_b = param1;
        field_f = param2;
        field_j = param3;
        lb.b();
    }

    private final static void c(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param1 >= field_b) {
            if (param1 >= field_j) {
                return;
            }
            if (param0 < field_i) {
                param2 = param2 - (field_i - param0);
                param0 = field_i;
            }
            if (param0 + param2 > field_f) {
                param2 = field_f - param0;
            }
            var5 = param0 + param1 * field_c;
            var6 = (param3 & 16711935) * param4;
            param3 = (var6 & -16711936) + (param3 * param4 - var6 & 16711680) >>> 8;
            for (var7 = 0; var7 < param2; var7++) {
                var6 = field_l[var5];
                var8 = param3 + var6;
                var6 = (param3 & 16711935) + (var6 & 16711935);
                var6 = (var6 & 16777472) + (var8 - var6 & 65536);
                int incrementValue$0 = var5;
                var5++;
                field_l[incrementValue$0] = var8 - var6 | var6 - (var6 >>> 8);
            }
            return;
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        if (param4 != 0) {
          L0: {
            if (param4 >= 0) {
              break L0;
            } else {
              param4 = -param4;
              break L0;
            }
          }
          L1: {
            var6 = param0 + param4;
            var7 = param1 + param4;
            var8 = param0 + param2 - param4 - 1;
            var9 = param1 + param3 - param4 - 1;
            if (field_f <= field_i) {
              break L1;
            } else {
              if (field_j > field_b) {
                if (param0 + param2 <= field_i) {
                  break L1;
                } else {
                  L2: {
                    if (param0 >= field_f) {
                      break L2;
                    } else {
                      if (param1 + param3 < field_b) {
                        break L2;
                      } else {
                        if (param1 < field_j) {
                          L3: {
                            L4: {
                              var10 = var6 + (var7 - param4) * field_c;
                              var11 = var8 + (var7 - param4) * field_c;
                              var12 = var6 + var7 * field_c;
                              var13 = var8 + var7 * field_c;
                              var14 = var6 + var9 * field_c;
                              var15 = var8 + var9 * field_c;
                              var16 = var6 + (var9 + param4) * field_c;
                              var17 = var8 + (var9 + param4) * field_c;
                              var18 = param4;
                              var19 = 0;
                              var20 = param4 * param4;
                              var21 = var20 - var18;
                              if (param0 < field_i) {
                                break L4;
                              } else {
                                if (param0 + param2 >= field_f) {
                                  break L4;
                                } else {
                                  if (param1 < field_b) {
                                    break L4;
                                  } else {
                                    if (param1 + param3 < field_j) {
                                      var22 = var12;
                                      L5: while (true) {
                                        if (var22 > var14) {
                                          var22 = var13;
                                          L6: while (true) {
                                            if (var22 > var15) {
                                              var22 = var10;
                                              L7: while (true) {
                                                if (var22 > var11) {
                                                  var22 = var16;
                                                  L8: while (true) {
                                                    if (var22 > var17) {
                                                      L9: while (true) {
                                                        L10: {
                                                          int incrementValue$2 = var19;
                                                          var19++;
                                                          var21 = var21 + (incrementValue$2 + var19);
                                                          var12 = var12 - field_c;
                                                          var13 = var13 - field_c;
                                                          var14 = var14 + field_c;
                                                          var15 = var15 + field_c;
                                                          if (var21 <= var20) {
                                                            break L10;
                                                          } else {
                                                            var18--;
                                                            var21 = var21 - (var18 + var18);
                                                            var10 = var10 + field_c;
                                                            var11 = var11 + field_c;
                                                            var16 = var16 - field_c;
                                                            var17 = var17 - field_c;
                                                            break L10;
                                                          }
                                                        }
                                                        if (var18 >= var19) {
                                                          field_l[var10 - var19] = 16777215;
                                                          field_l[var11 + var19] = 16777215;
                                                          field_l[var12 - var18] = 16777215;
                                                          field_l[var13 + var18] = 16777215;
                                                          field_l[var14 - var18] = 16777215;
                                                          field_l[var15 + var18] = 16777215;
                                                          field_l[var16 - var19] = 16777215;
                                                          field_l[var17 + var19] = 16777215;
                                                          continue L9;
                                                        } else {
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      field_l[var22] = 16777215;
                                                      var22++;
                                                      continue L8;
                                                    }
                                                  }
                                                } else {
                                                  field_l[var22] = 16777215;
                                                  var22++;
                                                  continue L7;
                                                }
                                              }
                                            } else {
                                              field_l[var22 + var18] = 16777215;
                                              var22 = var22 + field_c;
                                              continue L6;
                                            }
                                          }
                                        } else {
                                          field_l[var22 - var18] = 16777215;
                                          var22 = var22 + field_c;
                                          continue L5;
                                        }
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                            lb.g(param0, param1 + var18, param3 - var18 - var18, 16777215);
                            lb.g(param0 + param2 - 1, param1 + var18, param3 - var18 - var18, 16777215);
                            lb.c(param0 + var18, param1, param2 - var18 - var18, 16777215);
                            lb.c(param0 + var18, param1 + param3 - 1, param2 - var18 - var18, 16777215);
                            L11: while (true) {
                              L12: {
                                int incrementValue$3 = var19;
                                var19++;
                                var21 = var21 + (incrementValue$3 + var19);
                                var12 = var12 - field_c;
                                var13 = var13 - field_c;
                                var14 = var14 + field_c;
                                var15 = var15 + field_c;
                                if (var21 <= var20) {
                                  break L12;
                                } else {
                                  var18--;
                                  var21 = var21 - (var18 + var18);
                                  var10 = var10 + field_c;
                                  var11 = var11 + field_c;
                                  var16 = var16 - field_c;
                                  var17 = var17 - field_c;
                                  break L12;
                                }
                              }
                              if (var18 >= var19) {
                                L13: {
                                  if (var7 - var18 < field_b) {
                                    break L13;
                                  } else {
                                    if (var7 - var18 >= field_j) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if (var6 - var19 < field_i) {
                                          break L14;
                                        } else {
                                          if (var6 - var19 >= field_f) {
                                            break L14;
                                          } else {
                                            field_l[var10 - var19] = 16777215;
                                            break L14;
                                          }
                                        }
                                      }
                                      if (var8 + var19 < field_i) {
                                        break L13;
                                      } else {
                                        if (var8 + var19 >= field_f) {
                                          break L13;
                                        } else {
                                          field_l[var11 + var19] = 16777215;
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                                L15: {
                                  if (var7 - var19 < field_b) {
                                    break L15;
                                  } else {
                                    if (var7 - var19 >= field_j) {
                                      break L15;
                                    } else {
                                      L16: {
                                        if (var6 - var18 < field_i) {
                                          break L16;
                                        } else {
                                          if (var6 - var18 >= field_f) {
                                            break L16;
                                          } else {
                                            field_l[var12 - var18] = 16777215;
                                            break L16;
                                          }
                                        }
                                      }
                                      if (var8 + var18 < field_i) {
                                        break L15;
                                      } else {
                                        if (var8 + var18 >= field_f) {
                                          break L15;
                                        } else {
                                          field_l[var13 + var18] = 16777215;
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                }
                                L17: {
                                  if (var9 + var19 < field_b) {
                                    break L17;
                                  } else {
                                    if (var9 + var19 >= field_j) {
                                      break L17;
                                    } else {
                                      L18: {
                                        if (var6 - var18 < field_i) {
                                          break L18;
                                        } else {
                                          if (var6 - var18 >= field_f) {
                                            break L18;
                                          } else {
                                            field_l[var14 - var18] = 16777215;
                                            break L18;
                                          }
                                        }
                                      }
                                      if (var8 + var18 < field_i) {
                                        break L17;
                                      } else {
                                        if (var8 + var18 >= field_f) {
                                          break L17;
                                        } else {
                                          field_l[var15 + var18] = 16777215;
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var9 + var18 < field_b) {
                                  continue L11;
                                } else {
                                  if (var9 + var18 >= field_j) {
                                    continue L11;
                                  } else {
                                    L19: {
                                      if (var6 - var19 < field_i) {
                                        break L19;
                                      } else {
                                        if (var6 - var19 >= field_f) {
                                          break L19;
                                        } else {
                                          field_l[var16 - var19] = 16777215;
                                          break L19;
                                        }
                                      }
                                    }
                                    if (var8 + var19 < field_i) {
                                      continue L11;
                                    } else {
                                      if (var8 + var19 >= field_f) {
                                        continue L11;
                                      } else {
                                        field_l[var17 + var19] = 16777215;
                                        continue L11;
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
          lb.e(param0, param1, param2, param3, 16777215);
          return;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
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
            if (field_g == null) {
              break L1;
            } else {
              if (field_g.length >= param8) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          field_g = new int[param8];
          field_a = new int[param8];
          field_k = new int[param8];
          break L0;
        }
        L2: {
          var33 = field_g;
          var30 = var33;
          var27 = var30;
          var24 = var27;
          var9 = var24;
          var34 = field_a;
          var31 = var34;
          var28 = var31;
          var25 = var28;
          var10 = var25;
          var35 = field_k;
          var32 = var35;
          var29 = var32;
          var26 = var29;
          var11 = var26;
          pm.a(var33, 0, param8);
          pm.a(var34, 0, param8);
          pm.a(var35, 0, param8);
          var12 = 16384 / (2 * param3 + 1);
          var13 = 0 - param3;
          if (var13 >= 0) {
            break L2;
          } else {
            var13 = 0;
            break L2;
          }
        }
        L3: {
          var14 = var13 * field_c;
          var15 = param3;
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
            var14 = var14 + var16 * field_c;
            var18 = 0;
            L5: while (true) {
              if (var18 >= param8) {
                L6: {
                  param2 = param2 + param6;
                  var13 = 1 - param5;
                  var18 = 1 + param3 - param5;
                  if (0 >= var18) {
                    break L6;
                  } else {
                    var18 = 0;
                    break L6;
                  }
                }
                L7: {
                  var19 = (0 - param3) * field_c;
                  if (var13 >= var18) {
                    break L7;
                  } else {
                    var19 = var19 + (var18 - var13) * field_c;
                    break L7;
                  }
                }
                L8: while (true) {
                  if (var13 >= var18) {
                    L9: {
                      var18 = field_d - param5 - param3;
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
                                      var21 = var33[var20] / var17;
                                      var22 = var34[var20] / var17;
                                      var23 = var35[var20] / var17;
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
                                    int incrementValue$9 = param2;
                                    param2++;
                                    param0[incrementValue$9] = (var21 << 16) + (var22 << 8) + var23;
                                    var20++;
                                    continue L13;
                                  }
                                }
                              } else {
                                int incrementValue$10 = var19;
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
                                      var21 = var33[var20] * var12 >> 14;
                                      var22 = var34[var20] * var12 >> 14;
                                      var23 = var35[var20] * var12 >> 14;
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
                                    int incrementValue$11 = param2;
                                    param2++;
                                    param0[incrementValue$11] = (var21 << 16) + (var22 << 8) + var23;
                                    var20++;
                                    continue L19;
                                  }
                                }
                              } else {
                                int incrementValue$12 = var14;
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
                              int incrementValue$13 = var19;
                              var19++;
                              param1 = param0[incrementValue$13];
                              var21 = var33[var20] - (param1 >> 16 & 255);
                              stackOut_36_0 = (int[]) var9;
                              stackOut_36_1 = var20;
                              stackIn_38_0 = stackOut_36_0;
                              stackIn_38_1 = stackOut_36_1;
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              if (var21 >= 0) {
                                stackOut_38_0 = (int[]) (Object) stackIn_38_0;
                                stackOut_38_1 = stackIn_38_1;
                                stackOut_38_2 = var21;
                                stackIn_39_0 = stackOut_38_0;
                                stackIn_39_1 = stackOut_38_1;
                                stackIn_39_2 = stackOut_38_2;
                                break L23;
                              } else {
                                stackOut_37_0 = (int[]) (Object) stackIn_37_0;
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
                              var21 = var34[var20] - (param1 >> 8 & 255);
                              stackOut_39_0 = (int[]) var10;
                              stackOut_39_1 = var20;
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              if (var21 >= 0) {
                                stackOut_41_0 = (int[]) (Object) stackIn_41_0;
                                stackOut_41_1 = stackIn_41_1;
                                stackOut_41_2 = var21;
                                stackIn_42_0 = stackOut_41_0;
                                stackIn_42_1 = stackOut_41_1;
                                stackIn_42_2 = stackOut_41_2;
                                break L24;
                              } else {
                                stackOut_40_0 = (int[]) (Object) stackIn_40_0;
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
                              var21 = var35[var20] - (param1 & 255);
                              stackOut_42_0 = (int[]) var11;
                              stackOut_42_1 = var20;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              if (var21 >= 0) {
                                stackOut_44_0 = (int[]) (Object) stackIn_44_0;
                                stackOut_44_1 = stackIn_44_1;
                                stackOut_44_2 = var21;
                                stackIn_45_0 = stackOut_44_0;
                                stackIn_45_1 = stackOut_44_1;
                                stackIn_45_2 = stackOut_44_2;
                                break L25;
                              } else {
                                stackOut_43_0 = (int[]) (Object) stackIn_43_0;
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
                      if (var13 + param5 + param3 >= field_j) {
                        var14 = var14 + field_c;
                        break L26;
                      } else {
                        var20 = 0;
                        L27: while (true) {
                          if (var20 >= param8) {
                            var14 = var14 + param6;
                            var17++;
                            break L26;
                          } else {
                            int incrementValue$14 = var14;
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
                        var21 = var33[var20] / var17;
                        var22 = var34[var20] / var17;
                        var23 = var35[var20] / var17;
                        int incrementValue$15 = param2;
                        param2++;
                        param0[incrementValue$15] = (var21 << 16) + (var22 << 8) + var23;
                        var20++;
                        continue L28;
                      }
                    }
                  }
                }
              } else {
                int incrementValue$16 = param2;
                param2++;
                param0[incrementValue$16] = (var33[var18] / var17 << 16) + (var34[var18] / var17 << 8) + var35[var18] / var17;
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
                int incrementValue$17 = var14;
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

    final static void g(int param0, int param1, int param2, int param3, int param4, int param5) {
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
          if (param0 >= field_i) {
            break L0;
          } else {
            param2 = param2 - (field_i - param0);
            param0 = field_i;
            break L0;
          }
        }
        L1: {
          if (param1 >= field_b) {
            break L1;
          } else {
            var6 = var6 + (field_b - param1) * var7;
            param3 = param3 - (field_b - param1);
            param1 = field_b;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= field_f) {
            break L2;
          } else {
            param2 = field_f - param0;
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
        var8 = field_c - param2;
        var9 = param0 + param1 * field_c;
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
                int incrementValue$1 = var9;
                var9++;
                field_l[incrementValue$1] = var13;
                var14++;
                continue L5;
              }
            }
          }
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
                if (param1 >= field_b) {
                  break L1;
                } else {
                  param0 = param0 + var5 * (field_b - param1);
                  param1 = field_b;
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
                    if (var6 < field_i) {
                      break L4;
                    } else {
                      if (var6 >= field_f) {
                        break L4;
                      } else {
                        field_l[var6 + param1 * field_c] = param4;
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
                if (param0 >= field_i) {
                  break L5;
                } else {
                  param1 = param1 + var5 * (field_i - param0);
                  param0 = field_i;
                  break L5;
                }
              }
              L6: {
                if (param2 < field_f) {
                  break L6;
                } else {
                  param2 = field_f - 1;
                  break L6;
                }
              }
              L7: while (true) {
                if (param0 > param2) {
                  return;
                } else {
                  L8: {
                    var6 = param1 >> 16;
                    if (var6 < field_b) {
                      break L8;
                    } else {
                      if (var6 >= field_j) {
                        break L8;
                      } else {
                        field_l[param0 + var6 * field_c] = param4;
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
                lb.g(param0, param1 + param3, -param3 + 1, param4);
                break L9;
              } else {
                lb.g(param0, param1, param3 + 1, param4);
                break L9;
              }
            }
            return;
          }
        } else {
          L10: {
            if (param2 < 0) {
              lb.c(param0 + param2, param1, -param2 + 1, param4);
              break L10;
            } else {
              lb.c(param0, param1, param2 + 1, param4);
              break L10;
            }
          }
          return;
        }
    }

    final static void c(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param1 >= field_b) {
            if (param1 >= field_j) {
                return;
            }
            if (param0 < field_i) {
                param2 = param2 - (field_i - param0);
                param0 = field_i;
            }
            if (param0 + param2 > field_f) {
                param2 = field_f - param0;
            }
            var4 = param0 + param1 * field_c;
            for (var5 = 0; var5 < param2; var5++) {
                field_l[var4 + var5] = param3;
            }
            return;
        }
    }

    private final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9, int param10, int[] param11, int param12, int param13, int param14) {
        param3 = param14;
        param4 = param13;
        while (param8 < 0) {
            param1 = (param6 - param3) * 255 / param6;
            if (param1 >= param11.length) {
                return true;
            }
            param0 = param11[param1];
            param1 = param9[param7];
            param2 = param0 + param1;
            param0 = (param0 & 16711935) + (param1 & 16711935);
            param1 = (param0 & 16777472) + (param2 - param0 & 65536);
            param9[param7] = param2 - param1 | param1 - (param1 >>> 8);
            param7 = param7 + param12;
            param3 = param3 + param4;
            param4 = param4 + param5;
            param8++;
        }
        return false;
    }

    private final static void h(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (param0 >= field_i) {
            if (param0 >= field_f) {
                return;
            }
            if (param1 < field_b) {
                param2 = param2 - (field_b - param1);
                param1 = field_b;
            }
            if (param1 + param2 > field_j) {
                param2 = field_j - param1;
            }
            var5 = param0 + param1 * field_c;
            var6 = (param3 & 16711935) * param4;
            param3 = (var6 & -16711936) + (param3 * param4 - var6 & 16711680) >>> 8;
            for (var7 = 0; var7 < param2; var7++) {
                var6 = field_l[var5];
                var8 = param3 + var6;
                var9 = (param3 & 16711935) + (var6 & 16711935);
                var6 = (var9 & 16777472) + (var8 - var9 & 65536);
                field_l[var5] = var8 - var6 | var6 - (var6 >>> 8);
                var5 = var5 + field_c;
            }
            return;
        }
    }

    final static void d() {
        int var0 = 0;
        int var1 = field_c * field_d - 7;
        while (var0 < var1) {
            int incrementValue$0 = var0;
            var0++;
            field_l[incrementValue$0] = 0;
            int incrementValue$1 = var0;
            var0++;
            field_l[incrementValue$1] = 0;
            int incrementValue$2 = var0;
            var0++;
            field_l[incrementValue$2] = 0;
            int incrementValue$3 = var0;
            var0++;
            field_l[incrementValue$3] = 0;
            int incrementValue$4 = var0;
            var0++;
            field_l[incrementValue$4] = 0;
            int incrementValue$5 = var0;
            var0++;
            field_l[incrementValue$5] = 0;
            int incrementValue$6 = var0;
            var0++;
            field_l[incrementValue$6] = 0;
            int incrementValue$7 = var0;
            var0++;
            field_l[incrementValue$7] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            int incrementValue$8 = var0;
            var0++;
            field_l[incrementValue$8] = 0;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 < field_i) {
          return;
        } else {
          L0: {
            if (param1 < field_b) {
              break L0;
            } else {
              if (param0 >= field_f) {
                break L0;
              } else {
                if (param1 < field_j) {
                  field_l[param0 + param1 * field_c] = param2;
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

    final static void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param0 < field_i) {
            param2 = param2 - (field_i - param0);
            param0 = field_i;
        }
        if (param1 < field_b) {
            param3 = param3 - (field_b - param1);
            param1 = field_b;
        }
        if (param0 + param2 > field_f) {
            param2 = field_f - param0;
        }
        if (param1 + param3 > field_j) {
            param3 = field_j - param1;
        }
        param4 = ((param4 & 16711935) * param5 >> 8 & 16711935) + ((param4 & 65280) * param5 >> 8 & 65280);
        int var6 = 256 - param5;
        int var7 = field_c - param2;
        int var8 = param0 + param1 * field_c;
        for (var9 = 0; var9 < param3; var9++) {
            for (var10 = -param2; var10 < 0; var10++) {
                var11 = field_l[var8];
                var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
                int incrementValue$0 = var8;
                var8++;
                field_l[incrementValue$0] = param4 + var11;
            }
            var8 = var8 + var7;
        }
    }

    final static void d(int param0, int param1, int param2, int param3) {
        if (field_i < param0) {
            field_i = param0;
        }
        if (field_b < param1) {
            field_b = param1;
        }
        if (field_f > param2) {
            field_f = param2;
        }
        if (field_j > param3) {
            field_j = param3;
        }
        lb.b();
    }

    final static void b(int[] param0) {
        field_i = param0[0];
        field_b = param0[1];
        field_f = param0[2];
        field_j = param0[3];
        lb.b();
    }

    final static void f(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 != 0) {
          if (param2 != 0) {
            L0: {
              var6 = (param4 & 16711935) * param5;
              param4 = (var6 & -16711936) + (param4 * param5 - var6 & 16711680) >>> 8;
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
                var9 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
                param3 = param3 + param1;
                if (param1 >= field_b) {
                  break L1;
                } else {
                  param0 = param0 + var9 * (field_b - param1);
                  param1 = field_b;
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
                    var10 = param0 >> 16;
                    if (var10 < field_i) {
                      break L4;
                    } else {
                      if (var10 >= field_f) {
                        break L4;
                      } else {
                        var8 = var10 + param1 * field_c;
                        var6 = field_l[var8];
                        var7 = param4 + var6;
                        var11 = (param4 & 16711935) + (var6 & 16711935);
                        var6 = (var11 & 16777472) + (var7 - var11 & 65536);
                        field_l[var8] = var7 - var6 | var6 - (var6 >>> 8);
                        break L4;
                      }
                    }
                  }
                  param0 = param0 + var9;
                  param1++;
                  continue L3;
                }
              }
            } else {
              L5: {
                param1 = param1 << 16;
                param1 = param1 + 32768;
                param3 = param3 << 16;
                var9 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
                param2 = param2 + param0;
                if (param0 >= field_i) {
                  break L5;
                } else {
                  param1 = param1 + var9 * (field_i - param0);
                  param0 = field_i;
                  break L5;
                }
              }
              L6: {
                if (param2 < field_f) {
                  break L6;
                } else {
                  param2 = field_f - 1;
                  break L6;
                }
              }
              L7: while (true) {
                if (param0 > param2) {
                  return;
                } else {
                  L8: {
                    var10 = param1 >> 16;
                    if (var10 < field_b) {
                      break L8;
                    } else {
                      if (var10 >= field_j) {
                        break L8;
                      } else {
                        var8 = param0 + var10 * field_c;
                        var6 = field_l[var8];
                        var7 = param4 + var6;
                        var11 = (param4 & 16711935) + (var6 & 16711935);
                        var6 = (var11 & 16777472) + (var7 - var11 & 65536);
                        field_l[var8] = var7 - var6 | var6 - (var6 >>> 8);
                        break L8;
                      }
                    }
                  }
                  param1 = param1 + var9;
                  param0++;
                  continue L7;
                }
              }
            }
          } else {
            L9: {
              if (param3 < 0) {
                lb.h(param0, param1 + param3, -param3 + 1, param4, param5);
                break L9;
              } else {
                lb.h(param0, param1, param3 + 1, param4, param5);
                break L9;
              }
            }
            return;
          }
        } else {
          L10: {
            if (param2 < 0) {
              lb.c(param0 + param2, param1, -param2 + 1, param4, param5);
              break L10;
            } else {
              lb.c(param0, param1, param2 + 1, param4, param5);
              break L10;
            }
          }
          return;
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int[] param4) {
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
        L0: {
          var5 = param2 * param2;
          var6 = param1 - param2 >> 4;
          var7 = param1 + param2 + 15 >> 4;
          if (var6 >= field_b) {
            break L0;
          } else {
            var6 = field_b;
            break L0;
          }
        }
        L1: {
          if (var7 <= field_j) {
            break L1;
          } else {
            var7 = field_j;
            break L1;
          }
        }
        var8 = (var6 << 4) - param1;
        var8 = var8 * var8;
        var9 = (var6 + 1 << 4) - param1;
        var9 = var9 * var9;
        var10 = (var6 + 2 << 4) - param1;
        var10 = var10 * var10;
        var11 = var9 - var8;
        var12 = var10 - var9;
        var13 = var12 - var11;
        var14 = var6 * field_c;
        var15 = field_c;
        var16 = var6 - var7;
        L2: while (true) {
          if (var16 >= 0) {
            return;
          } else {
            L3: {
              var17 = param0 - param2 >> 4;
              var18 = param0 + param2 + 15 >> 4;
              if (var17 >= field_i) {
                break L3;
              } else {
                var17 = field_i;
                break L3;
              }
            }
            L4: {
              if (var18 <= field_f) {
                break L4;
              } else {
                var18 = field_f;
                break L4;
              }
            }
            var19 = param0 + 15 >> 4;
            var20 = var19;
            L5: while (true) {
              if (var17 >= var19) {
                L6: while (true) {
                  if (var18 <= var20) {
                    L7: {
                      var21 = (var17 << 4) - param0;
                      var21 = var21 * var21;
                      var22 = (var17 + 1 << 4) - param0;
                      var22 = var22 * var22;
                      var23 = (var17 + 2 << 4) - param0;
                      var23 = var23 * var23;
                      var24 = var22 - var21;
                      var25 = var23 - var22;
                      var26 = var25 - var24;
                      var27 = (var18 - 1 << 4) - param0;
                      var27 = var27 * var27;
                      var28 = (var18 - 2 << 4) - param0;
                      var28 = var28 * var28;
                      var29 = var28 - var27;
                      if (!lb.a(0, 0, 0, 0, 0, var26, var5, var14 + var17, var17 - var18, field_l, 255, param4, 1, var24, var8 + var21)) {
                        break L7;
                      } else {
                        boolean discarded$1 = lb.a(0, 0, 0, 0, 0, var26, var5, var14 + var18 - 1, var17 - var18, field_l, 255, param4, -1, var29, var8 + var27);
                        break L7;
                      }
                    }
                    var14 = var14 + var15;
                    var8 = var8 + var11;
                    var11 = var11 + var13;
                    var16++;
                    continue L2;
                  } else {
                    var21 = var20 + var18 >> 1;
                    var22 = (var21 << 4) - param0;
                    var22 = var22 * var22;
                    if (var8 + var22 >= var5) {
                      var18 = var21;
                      continue L6;
                    } else {
                      var20 = var21 + 1;
                      continue L6;
                    }
                  }
                }
              } else {
                var21 = var17 + var19 >> 1;
                var22 = (var21 << 4) - param0;
                var22 = var22 * var22;
                if (var8 + var22 >= var5) {
                  var17 = var21 + 1;
                  continue L5;
                } else {
                  var19 = var21;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param0 < field_i) {
            param2 = param2 - (field_i - param0);
            param0 = field_i;
        }
        if (param0 + param2 > field_f) {
            param2 = field_f - param0;
        }
        if (param1 < field_b) {
            param3 = param3 - (field_b - param1);
            param1 = field_b;
        }
        if (param1 + param3 > field_j) {
            param3 = field_j - param1;
        }
        int var4 = param0 + param1 * field_c;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            for (var5 = 0; var5 < param3; var5++) {
                for (var6 = 0; var6 < param2; var6++) {
                    var7 = field_l[var4];
                    var8 = var7 >> 15 & 510;
                    var9 = var7 >> 8 & 255;
                    var10 = var7 & 255;
                    var11 = (var10 + var8) / 3 + var9 >> 1;
                    int incrementValue$0 = var4;
                    var4++;
                    field_l[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
                }
                var4 = var4 + (field_c - param2);
            }
            return;
        }
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4) {
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
        if (param1 >= field_b) {
            if (param1 >= field_j) {
                return;
            }
            if (param0 < field_i) {
                param2 = param2 - (field_i - param0);
                param0 = field_i;
            }
            if (param0 + param2 > field_f) {
                param2 = field_f - param0;
            }
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * field_c;
            for (var13 = 0; var13 < param2; var13++) {
                var9 = (field_l[var12] >> 16 & 255) * var5;
                var10 = (field_l[var12] >> 8 & 255) * var5;
                var11 = (field_l[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                int incrementValue$0 = var12;
                var12++;
                field_l[incrementValue$0] = var14;
            }
            return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
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
        L0: {
          var5 = param2 * param2;
          var6 = param0 - param2 >> 4;
          var7 = param0 + param2 + 15 >> 4;
          var8 = param1 - param2 >> 4;
          var9 = param1 + param2 + 15 >> 4;
          if (var6 >= field_i) {
            break L0;
          } else {
            var6 = field_i;
            break L0;
          }
        }
        L1: {
          if (var7 <= field_f) {
            break L1;
          } else {
            var7 = field_f;
            break L1;
          }
        }
        L2: {
          if (var8 >= field_b) {
            break L2;
          } else {
            var8 = field_b;
            break L2;
          }
        }
        L3: {
          if (var9 <= field_j) {
            break L3;
          } else {
            var9 = field_j;
            break L3;
          }
        }
        var10 = (var6 << 4) - param0;
        var10 = var10 * var10;
        var11 = (var6 + 1 << 4) - param0;
        var11 = var11 * var11;
        var12 = (var6 + 2 << 4) - param0;
        var12 = var12 * var12;
        var13 = var11 - var10;
        var14 = var12 - var11;
        var15 = var14 - var13;
        var16 = (var8 << 4) - param1;
        var16 = var16 * var16;
        var17 = (var8 + 1 << 4) - param1;
        var17 = var17 * var17;
        var18 = (var8 + 2 << 4) - param1;
        var18 = var18 * var18;
        var19 = var17 - var16;
        var20 = var18 - var17;
        var21 = var20 - var19;
        var22 = var6 + var8 * field_c;
        var23 = field_c + var6 - var7;
        lb.a(0, 0, 0, 0, 0, var15, var5, var22, field_l, param3, param4, var23, var13, var6 - var7, var16 + var10, var19, var21, var8 - var9);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var5 = 0;
        for (var6 = 0; var6 < 4; var6++) {
            var5 = 128 - (var6 << 5);
            lb.b(param0 + var6, param1 + param3 + var6, param2, 5592405, var5);
            lb.f(param0 + param2 + var6, param1 + var6, param3 + 1, 5592405, var5);
        }
    }

    final static void e(int param0, int param1, int param2, int param3, int param4) {
        lb.c(param0, param1, param2, param4);
        lb.c(param0, param1 + param3 - 1, param2, param4);
        lb.g(param0, param1, param3, param4);
        lb.g(param0 + param2 - 1, param1, param3, param4);
    }

    final static void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        lb.a(field_l, 0, 0 * field_c, param0, 0, param4, field_c - param4, param5);
        lb.a(field_l, 0, 0 * field_c, param1, 0, param5, field_c - param4, 0, param4);
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
        if (param0 >= field_i) {
            if (param0 >= field_f) {
                return;
            }
            if (param1 < field_b) {
                param2 = param2 - (field_b - param1);
                param1 = field_b;
            }
            if (param1 + param2 > field_j) {
                param2 = field_j - param1;
            }
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * field_c;
            for (var13 = 0; var13 < param2; var13++) {
                var9 = (field_l[var12] >> 16 & 255) * var5;
                var10 = (field_l[var12] >> 8 & 255) * var5;
                var11 = (field_l[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                field_l[var12] = var14;
                var12 = var12 + field_c;
            }
            return;
        }
    }

    final static void g(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        if (param0 < field_i) {
            param2 = param2 - (field_i - param0);
            param0 = field_i;
        }
        if (param1 < field_b) {
            param3 = param3 - (field_b - param1);
            param1 = field_b;
        }
        if (param0 + param2 > field_f) {
            param2 = field_f - param0;
        }
        if (param1 + param3 > field_j) {
            param3 = field_j - param1;
        }
        int var5 = field_c - param2;
        int var6 = param0 + param1 * field_c;
        for (var7 = -param3; var7 < 0; var7++) {
            for (var8 = -param2; var8 < 0; var8++) {
                int incrementValue$0 = var6;
                var6++;
                field_l[incrementValue$0] = param4;
            }
            var6 = var6 + var5;
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        if (param4 != 0) {
          L0: {
            if (param4 >= 0) {
              break L0;
            } else {
              param4 = -param4;
              break L0;
            }
          }
          L1: {
            var6 = param0 + param4;
            var7 = param1 + param4;
            var8 = param1;
            if (var8 >= field_b) {
              break L1;
            } else {
              var8 = field_b;
              break L1;
            }
          }
          L2: {
            var9 = param1 + param3;
            if (var9 <= field_j) {
              break L2;
            } else {
              var9 = field_j;
              break L2;
            }
          }
          L3: {
            var10 = param2 - param4 - param4 - 1;
            var11 = var8;
            var12 = param4 * param4;
            var13 = 0;
            var14 = var7 - var11;
            var15 = var14 * var14;
            var16 = var15 - var14;
            if (var7 <= var9) {
              break L3;
            } else {
              var7 = var9;
              break L3;
            }
          }
          L4: while (true) {
            if (var11 >= var7) {
              L5: {
                var14 = var11 - var7;
                var17 = param0;
                if (var17 >= field_i) {
                  break L5;
                } else {
                  var17 = field_i;
                  break L5;
                }
              }
              L6: {
                var18 = param0 + param2;
                if (var18 <= field_f) {
                  break L6;
                } else {
                  var18 = field_f;
                  break L6;
                }
              }
              L7: {
                var19 = var17 + var11 * field_c;
                var20 = field_c + var17 - var18;
                var21 = param1 + param3 - param4 - 1;
                if (var21 <= field_j) {
                  break L7;
                } else {
                  var21 = field_j;
                  break L7;
                }
              }
              L8: while (true) {
                if (var11 >= var21) {
                  var14 = 0;
                  var13 = param4;
                  var16 = var14 * var14 + var12;
                  var15 = var16 - var13;
                  var16 = var16 - var14;
                  L9: while (true) {
                    if (var11 >= var9) {
                      return;
                    } else {
                      L10: while (true) {
                        L11: {
                          if (var16 <= var12) {
                            break L11;
                          } else {
                            if (var15 <= var12) {
                              break L11;
                            } else {
                              int incrementValue$7 = var13;
                              var13--;
                              var16 = var16 - (incrementValue$7 + var13);
                              var15 = var15 - (var13 + var13);
                              continue L10;
                            }
                          }
                        }
                        L12: {
                          var17 = var6 - var13;
                          if (var17 >= field_i) {
                            break L12;
                          } else {
                            var17 = field_i;
                            break L12;
                          }
                        }
                        L13: {
                          var18 = var6 + var10 + var13;
                          if (var18 <= field_f - 1) {
                            break L13;
                          } else {
                            var18 = field_f - 1;
                            break L13;
                          }
                        }
                        var19 = var17 + var11 * field_c;
                        var20 = var17;
                        L14: while (true) {
                          if (var20 > var18) {
                            var11++;
                            var16 = var16 + (var14 + var14);
                            int incrementValue$8 = var14;
                            var14++;
                            var15 = var15 + (incrementValue$8 + var14);
                            continue L9;
                          } else {
                            int incrementValue$9 = var19;
                            var19++;
                            field_l[incrementValue$9] = param5;
                            var20++;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var22 = var17;
                  L15: while (true) {
                    if (var22 >= var18) {
                      var11++;
                      var19 = var19 + var20;
                      continue L8;
                    } else {
                      int incrementValue$10 = var19;
                      var19++;
                      field_l[incrementValue$10] = param5;
                      var22++;
                      continue L15;
                    }
                  }
                }
              }
            } else {
              L16: while (true) {
                L17: {
                  if (var16 <= var12) {
                    break L17;
                  } else {
                    if (var15 > var12) {
                      L18: {
                        var17 = var6 - var13 + 1;
                        if (var17 >= field_i) {
                          break L18;
                        } else {
                          var17 = field_i;
                          break L18;
                        }
                      }
                      L19: {
                        var18 = var6 + var10 + var13;
                        if (var18 <= field_f) {
                          break L19;
                        } else {
                          var18 = field_f;
                          break L19;
                        }
                      }
                      var19 = var17 + var11 * field_c;
                      var20 = var17;
                      L20: while (true) {
                        if (var20 >= var18) {
                          var11++;
                          int incrementValue$11 = var14;
                          var14--;
                          var15 = var15 - (incrementValue$11 + var14);
                          var16 = var16 - (var14 + var14);
                          continue L4;
                        } else {
                          int incrementValue$12 = var19;
                          var19++;
                          field_l[incrementValue$12] = param5;
                          var20++;
                          continue L20;
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                var15 = var15 + (var13 + var13);
                int incrementValue$13 = var13;
                var13++;
                var16 = var16 + (incrementValue$13 + var13);
                continue L16;
              }
            }
          }
        } else {
          lb.g(param0, param1, param2, param3, param5);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        lb.b(param0, param1, param2, 0, param5);
        lb.b(param0, param1 + param3 - 1, param2, 0, param5);
        if (param3 >= 3) {
            lb.f(param0, param1 + 1, param3 - 2, 0, param5);
            lb.f(param0 + param2 - 1, param1 + 1, param3 - 2, 0, param5);
            return;
        }
    }

    final static void a(int[] param0) {
        param0[0] = field_i;
        param0[1] = field_b;
        param0[2] = field_f;
        param0[3] = field_j;
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
          var9 = 1 + param3 - param5;
          if (0 >= var9) {
            break L0;
          } else {
            var9 = 0;
            break L0;
          }
        }
        L1: {
          var10 = field_c - param5 - param3;
          if (0 >= var10) {
            break L1;
          } else {
            var10 = 0;
            break L1;
          }
        }
        L2: {
          var11 = 0;
          var12 = param3 + 1;
          if (field_c >= var12) {
            break L2;
          } else {
            var11 = var12 - field_c;
            var12 = field_c;
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
              var19 = 0 - param3;
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
                int incrementValue$6 = param2;
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
                              int incrementValue$7 = var18;
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
                            int incrementValue$8 = param2;
                            param2++;
                            param0[incrementValue$8] = (var21 << 16) + (var22 << 8) + var23;
                            var19++;
                            continue L8;
                          }
                        }
                      } else {
                        L12: {
                          int incrementValue$9 = var18;
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
                        int incrementValue$10 = param2;
                        param2++;
                        param0[incrementValue$10] = (var21 << 16) + (var22 << 8) + var23;
                        var19++;
                        continue L7;
                      }
                    }
                  } else {
                    L18: {
                      var18++;
                      if (param5 + var19 + param3 >= field_f) {
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
                    int incrementValue$11 = param2;
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

    public static void c() {
        field_l = null;
        field_e = null;
        field_h = null;
        field_g = null;
        field_a = null;
        field_k = null;
    }

    private final static void b() {
        field_e = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_f = 0;
        field_b = 0;
        field_i = 0;
    }
}
