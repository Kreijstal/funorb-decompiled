/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends lr {
    int[][] field_U;
    private byte[][] field_V;

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var9 = param1 + param2 * qh.field_l;
          var10 = qh.field_l - param3;
          var11 = 0;
          var12 = 0;
          if (param2 >= qh.field_c) {
            break L0;
          } else {
            var13 = qh.field_c - param2;
            param4 = param4 - var13;
            param2 = qh.field_c;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * qh.field_l;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= qh.field_g) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - qh.field_g);
            break L1;
          }
        }
        L2: {
          if (param1 >= qh.field_b) {
            break L2;
          } else {
            var13 = qh.field_b - param1;
            param3 = param3 - var13;
            param1 = qh.field_b;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= qh.field_j) {
            break L3;
          } else {
            var13 = param1 + param3 - qh.field_j;
            param3 = param3 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L3;
          }
        }
        L4: {
          if (param3 <= 0) {
            break L4;
          } else {
            if (param4 > 0) {
              L5: {
                if (!param7) {
                  kl.b(0, qh.field_d, this.field_V[param0], this.field_U[param5], var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                } else {
                  an.b(qh.field_d, this.field_V[param0], param5, var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                }
              }
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
                    incrementValue$10 = param4;
                    param4++;
                    param0 = param2[incrementValue$10];
                    if (param2[incrementValue$10] == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$11 = param5;
                      param5++;
                      param1[incrementValue$11] = param3[param0 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$12 = param4;
                  param4++;
                  param0 = param2[incrementValue$12];
                  if (param2[incrementValue$12] == 0) {
                    param5++;
                    break L3;
                  } else {
                    incrementValue$13 = param5;
                    param5++;
                    param1[incrementValue$13] = param3[param0 & 255];
                    break L3;
                  }
                }
                L4: {
                  incrementValue$14 = param4;
                  param4++;
                  param0 = param2[incrementValue$14];
                  if (param2[incrementValue$14] == 0) {
                    param5++;
                    break L4;
                  } else {
                    incrementValue$15 = param5;
                    param5++;
                    param1[incrementValue$15] = param3[param0 & 255];
                    break L4;
                  }
                }
                L5: {
                  incrementValue$16 = param4;
                  param4++;
                  param0 = param2[incrementValue$16];
                  if (param2[incrementValue$16] == 0) {
                    param5++;
                    break L5;
                  } else {
                    incrementValue$17 = param5;
                    param5++;
                    param1[incrementValue$17] = param3[param0 & 255];
                    break L5;
                  }
                }
                incrementValue$18 = param4;
                param4++;
                param0 = param2[incrementValue$18];
                if (param2[incrementValue$18] == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$19 = param5;
                  param5++;
                  param1[incrementValue$19] = param3[param0 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    kl(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        this.field_V = new byte[256][];
        this.field_V = param6;
        this.field_U = new int[4][];
        this.field_U[0] = param5;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var9 = param1 + param2 * qh.field_l;
          var10 = qh.field_l - param3;
          var11 = param4;
          var12 = -1;
          var13 = param4 - 1;
          if (param2 >= qh.field_c) {
            break L0;
          } else {
            var14 = qh.field_c - param2;
            param4 = param4 - var14;
            param2 = qh.field_c;
            var13 = var13 - var14;
            var9 = var9 + var14 * qh.field_l;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= qh.field_g) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - qh.field_g);
            break L1;
          }
        }
        L2: {
          if (param1 >= qh.field_b) {
            break L2;
          } else {
            var14 = qh.field_b - param1;
            param3 = param3 - var14;
            param1 = qh.field_b;
            var13 = var13 + var14 * var11;
            var9 = var9 + var14;
            var10 = var10 + var14;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= qh.field_j) {
            break L3;
          } else {
            var14 = param1 + param3 - qh.field_j;
            param3 = param3 - var14;
            var10 = var10 + var14;
            break L3;
          }
        }
        L4: {
          if (param3 <= 0) {
            break L4;
          } else {
            if (param4 > 0) {
              L5: {
                var12 = var12 - var11 * param3;
                if (!param7) {
                  kl.a(0, qh.field_d, this.field_V[param0], this.field_U[param5], var13, var9, var11, param3, param4, var10, var12, param6);
                  break L5;
                } else {
                  an.a(qh.field_d, this.field_V[param0], param5, var13, var9, var11, param3, param4, var10, var12, param6);
                  break L5;
                }
              }
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var8 = param1 + param2 * qh.field_l;
          var9 = qh.field_l - param3;
          var10 = 0;
          var11 = 0;
          if (param2 >= qh.field_c) {
            break L0;
          } else {
            var12 = qh.field_c - param2;
            param4 = param4 - var12;
            param2 = qh.field_c;
            var11 = var11 + var12 * param3;
            var8 = var8 + var12 * qh.field_l;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= qh.field_g) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - qh.field_g);
            break L1;
          }
        }
        L2: {
          if (param1 >= qh.field_b) {
            break L2;
          } else {
            var12 = qh.field_b - param1;
            param3 = param3 - var12;
            param1 = qh.field_b;
            var11 = var11 + var12;
            var8 = var8 + var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= qh.field_j) {
            break L3;
          } else {
            var12 = param1 + param3 - qh.field_j;
            param3 = param3 - var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L3;
          }
        }
        L4: {
          if (param3 <= 0) {
            break L4;
          } else {
            if (param4 > 0) {
              L5: {
                if (!param6) {
                  kl.a(0, qh.field_d, this.field_V[param0], this.field_U[param5], var11, var8, param3, param4, var9, var10);
                  break L5;
                } else {
                  an.a(qh.field_d, this.field_V[param0], param5, var11, var8, param3, param4, var9, var10);
                  break L5;
                }
              }
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void b(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var11 = 256 - param10;
        var12 = -param7;
        L0: while (true) {
          if (var12 >= 0) {
            return;
          } else {
            var13 = -param6;
            L1: while (true) {
              if (var13 >= 0) {
                param5 = param5 + param8;
                param4 = param4 + param9;
                var12++;
                continue L0;
              } else {
                incrementValue$50 = param4;
                param4++;
                param0 = param2[incrementValue$50];
                if (param2[incrementValue$50] == 0) {
                  param5++;
                  var13++;
                  continue L1;
                } else {
                  var14 = param1[param5];
                  var15 = param3[param0 & 255];
                  incrementValue$51 = param5;
                  param5++;
                  param1[incrementValue$51] = ((var15 & 16711935) * param10 + (var14 & 16711935) * var11 & -16711936) + ((var15 & 65280) * param10 + (var14 & 65280) * var11 & 16711680) >> 8;
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var8 = param1 + param2 * qh.field_l;
          var9 = qh.field_l - param3;
          var10 = param4;
          var11 = -1;
          var12 = param4 - 1;
          if (param2 >= qh.field_c) {
            break L0;
          } else {
            var13 = qh.field_c - param2;
            param4 = param4 - var13;
            param2 = qh.field_c;
            var12 = var12 - var13;
            var8 = var8 + var13 * qh.field_l;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= qh.field_g) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - qh.field_g);
            break L1;
          }
        }
        L2: {
          if (param1 >= qh.field_b) {
            break L2;
          } else {
            var13 = qh.field_b - param1;
            param3 = param3 - var13;
            param1 = qh.field_b;
            var12 = var12 + var13 * var10;
            var8 = var8 + var13;
            var9 = var9 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= qh.field_j) {
            break L3;
          } else {
            var13 = param1 + param3 - qh.field_j;
            param3 = param3 - var13;
            var9 = var9 + var13;
            break L3;
          }
        }
        L4: {
          if (param3 <= 0) {
            break L4;
          } else {
            if (param4 > 0) {
              L5: {
                var11 = var11 - var10 * param3;
                if (!param6) {
                  kl.a(0, qh.field_d, this.field_V[param0], this.field_U[param5], var12, var8, var10, param3, param4, var9, var11);
                  break L5;
                } else {
                  an.a(qh.field_d, this.field_V[param0], param5, var12, var8, var10, param3, param4, var9, var11);
                  break L5;
                }
              }
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int incrementValue$0 = 0;
        int var15 = 0;
        int var12 = 256 - param11;
        for (var13 = -param8; var13 < 0; var13++) {
            for (var14 = -param7; var14 < 0; var14++) {
                param0 = param2[param4];
                if (param2[param4] != 0) {
                    var15 = param1[param5];
                    var16 = param3[param0 & 255];
                    incrementValue$0 = param5;
                    param5++;
                    param1[incrementValue$0] = ((var16 & 16711935) * param11 + (var15 & 16711935) * var12 & -16711936) + ((var16 & 65280) * param11 + (var15 & 65280) * var12 & 16711680) >> 8;
                } else {
                    param5++;
                }
                param4 = param4 + param6;
            }
            param5 = param5 + param9;
            param4 = param4 + param10;
        }
    }

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var11 = -(param7 >> 2);
        param7 = -(param7 & 3);
        var12 = -param8;
        L0: while (true) {
          if (var12 >= 0) {
            return;
          } else {
            var13 = var11;
            L1: while (true) {
              if (var13 >= 0) {
                var13 = param7;
                L2: while (true) {
                  if (var13 >= 0) {
                    param5 = param5 + param9;
                    param4 = param4 + param10;
                    var12++;
                    continue L0;
                  } else {
                    L3: {
                      param0 = param2[param4];
                      if (param2[param4] == 0) {
                        param5++;
                        break L3;
                      } else {
                        incrementValue$5 = param5;
                        param5++;
                        param1[incrementValue$5] = param3[param0 & 255];
                        break L3;
                      }
                    }
                    param4 = param4 + param6;
                    var13++;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  param0 = param2[param4];
                  if (param2[param4] == 0) {
                    param5++;
                    break L4;
                  } else {
                    incrementValue$6 = param5;
                    param5++;
                    param1[incrementValue$6] = param3[param0 & 255];
                    break L4;
                  }
                }
                L5: {
                  param4 = param4 + param6;
                  param0 = param2[param4];
                  if (param2[param4] == 0) {
                    param5++;
                    break L5;
                  } else {
                    incrementValue$7 = param5;
                    param5++;
                    param1[incrementValue$7] = param3[param0 & 255];
                    break L5;
                  }
                }
                L6: {
                  param4 = param4 + param6;
                  param0 = param2[param4];
                  if (param2[param4] == 0) {
                    param5++;
                    break L6;
                  } else {
                    incrementValue$8 = param5;
                    param5++;
                    param1[incrementValue$8] = param3[param0 & 255];
                    break L6;
                  }
                }
                L7: {
                  param4 = param4 + param6;
                  param0 = param2[param4];
                  if (param2[param4] == 0) {
                    param5++;
                    break L7;
                  } else {
                    incrementValue$9 = param5;
                    param5++;
                    param1[incrementValue$9] = param3[param0 & 255];
                    break L7;
                  }
                }
                param4 = param4 + param6;
                var13++;
                continue L1;
              }
            }
          }
        }
    }
}
