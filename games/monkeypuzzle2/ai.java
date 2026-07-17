/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends bh {
    int[] field_m;
    byte[] field_n;

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((ai) this).field_a;
          param1 = param1 + ((ai) this).field_k;
          var3 = param0 + param1 * ge.field_h;
          var4 = 0;
          var5 = ((ai) this).field_d;
          var6 = ((ai) this).field_i;
          var7 = ge.field_h - var6;
          var8 = 0;
          if (param1 >= ge.field_f) {
            break L0;
          } else {
            var9 = ge.field_f - param1;
            var5 = var5 - var9;
            param1 = ge.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * ge.field_h;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= ge.field_k) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - ge.field_k);
            break L1;
          }
        }
        L2: {
          if (param0 >= ge.field_a) {
            break L2;
          } else {
            var9 = ge.field_a - param0;
            var6 = var6 - var9;
            param0 = ge.field_a;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= ge.field_j) {
            break L3;
          } else {
            var9 = param0 + var6 - ge.field_j;
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
            ai.b(ge.field_i, ((ai) this).field_n, ((ai) this).field_m, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    final le a() {
        int var3 = 0;
        int var1 = ((ai) this).field_i * ((ai) this).field_d;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
            var2[var3] = ((ai) this).field_m[((ai) this).field_n[var3] & 255];
        }
        return new le(((ai) this).field_c, ((ai) this).field_l, ((ai) this).field_a, ((ai) this).field_k, ((ai) this).field_i, ((ai) this).field_d, var2);
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
          param0 = param0 + ((ai) this).field_a;
          param1 = param1 + ((ai) this).field_k;
          var3 = param0 + param1 * ge.field_h;
          var4 = 0;
          var5 = ((ai) this).field_d;
          var6 = ((ai) this).field_i;
          var7 = ge.field_h - var6;
          var8 = 0;
          if (param1 >= ge.field_f) {
            break L0;
          } else {
            var9 = ge.field_f - param1;
            var5 = var5 - var9;
            param1 = ge.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * ge.field_h;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= ge.field_k) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - ge.field_k);
            break L1;
          }
        }
        L2: {
          if (param0 >= ge.field_a) {
            break L2;
          } else {
            var9 = ge.field_a - param0;
            var6 = var6 - var9;
            param0 = ge.field_a;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= ge.field_j) {
            break L3;
          } else {
            var9 = param0 + var6 - ge.field_j;
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
            ai.a(0, ((ai) this).field_n, var4, var3, 0, ge.field_i, ((ai) this).field_m, var6, var7, var8, 0, var5);
            return;
          } else {
            return;
          }
        }
    }

    final void b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((ai) this).field_m.length <= 255) {
          var1 = ((ai) this).field_i * ((ai) this).field_d - 1;
          var2 = ((ai) this).field_d - 1;
          L0: while (true) {
            if (var2 < 0) {
              return;
            } else {
              var3 = 0;
              var4 = ((ai) this).field_i - 1;
              L1: while (true) {
                if (var4 < 0) {
                  var2--;
                  continue L0;
                } else {
                  var5 = ((ai) this).field_n[var1];
                  if (var5 != 0) {
                    var3 = 0;
                    var1--;
                    var4--;
                    continue L1;
                  } else {
                    L2: {
                      var3++;
                      if (var3 != 512) {
                        break L2;
                      } else {
                        var3 = 510;
                        break L2;
                      }
                    }
                    if ((var3 & 1) == 0) {
                      ((ai) this).field_n[var1] = (byte) -1;
                      ((ai) this).field_n[var1 + 1] = (byte)(var3 - 2 >> 1);
                      var1--;
                      var4--;
                      continue L1;
                    } else {
                      var1--;
                      var4--;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } else {
          throw new IllegalStateException();
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
                    int incrementValue$10 = param4;
                    param4++;
                    param3 = param1[incrementValue$10];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      int incrementValue$11 = param5;
                      param5++;
                      param0[incrementValue$11] = param2[param3 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$12 = param4;
                  param4++;
                  param3 = param1[incrementValue$12];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    int incrementValue$13 = param5;
                    param5++;
                    param0[incrementValue$13] = param2[param3 & 255];
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$14 = param4;
                  param4++;
                  param3 = param1[incrementValue$14];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    int incrementValue$15 = param5;
                    param5++;
                    param0[incrementValue$15] = param2[param3 & 255];
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$16 = param4;
                  param4++;
                  param3 = param1[incrementValue$16];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    int incrementValue$17 = param5;
                    param5++;
                    param0[incrementValue$17] = param2[param3 & 255];
                    break L5;
                  }
                }
                int incrementValue$18 = param4;
                param4++;
                param3 = param1[incrementValue$18];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  int incrementValue$19 = param5;
                  param5++;
                  param0[incrementValue$19] = param2[param3 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int param0, byte[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var13 = 256 - param12;
        param10 = -param11;
        L0: while (true) {
          if (param10 >= 0) {
            return;
          } else {
            L1: {
              param4 = param7;
              if (param2 <= 0) {
                break L1;
              } else {
                if (param1[param2 - 1] != -1) {
                  break L1;
                } else {
                  param4--;
                  param2++;
                  param3++;
                  break L1;
                }
              }
            }
            L2: while (true) {
              if (param4 <= 0) {
                param3 = param3 + param8;
                param2 = param2 + param9;
                param10++;
                continue L0;
              } else {
                int incrementValue$211 = param2;
                param2++;
                param0 = param1[incrementValue$211];
                param4--;
                if (param0 == 0) {
                  param3++;
                  continue L2;
                } else {
                  if (param0 != -1) {
                    var14 = param5[param3];
                    var15 = param6[param0 & 255];
                    int incrementValue$212 = param3;
                    param3++;
                    param5[incrementValue$212] = ((var15 & 16711935) * param12 + (var14 & 16711935) * var13 & -16711936) + ((var15 & 65280) * param12 + (var14 & 65280) * var13 & 16711680) >> 8;
                    continue L2;
                  } else {
                    L3: {
                      int incrementValue$213 = param2;
                      param2++;
                      param0 = param1[incrementValue$213] & 255;
                      param4--;
                      param0 = param0 + param0;
                      if (param0 <= param4) {
                        break L3;
                      } else {
                        param0 = param4;
                        break L3;
                      }
                    }
                    param2 = param2 + param0;
                    param4 = param4 - param0;
                    param3 = param3 + (param0 + 2);
                    continue L2;
                  }
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
          param0 = param0 + ((ai) this).field_a;
          param1 = param1 + ((ai) this).field_k;
          var4 = param0 + param1 * ge.field_h;
          var5 = 0;
          var6 = ((ai) this).field_d;
          var7 = ((ai) this).field_i;
          var8 = ge.field_h - var7;
          var9 = 0;
          if (param1 >= ge.field_f) {
            break L0;
          } else {
            var10 = ge.field_f - param1;
            var6 = var6 - var10;
            param1 = ge.field_f;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * ge.field_h;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= ge.field_k) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - ge.field_k);
            break L1;
          }
        }
        L2: {
          if (param0 >= ge.field_a) {
            break L2;
          } else {
            var10 = ge.field_a - param0;
            var7 = var7 - var10;
            param0 = ge.field_a;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= ge.field_j) {
            break L3;
          } else {
            var10 = param0 + var7 - ge.field_j;
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
            ai.a(ge.field_i, ((ai) this).field_n, ((ai) this).field_m, var5, var4, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
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
                int incrementValue$66 = param3;
                param3++;
                var13 = param1[incrementValue$66];
                if (var13 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param2[var13 & 255];
                  var14 = param0[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((ai) this).field_a;
          param1 = param1 + ((ai) this).field_k;
          var4 = param0 + param1 * ge.field_h;
          var5 = 0;
          var6 = ((ai) this).field_d;
          var7 = ((ai) this).field_i;
          var8 = ge.field_h - var7;
          var9 = 0;
          if (param1 >= ge.field_f) {
            break L0;
          } else {
            var10 = ge.field_f - param1;
            var6 = var6 - var10;
            param1 = ge.field_f;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * ge.field_h;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= ge.field_k) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - ge.field_k);
            break L1;
          }
        }
        L2: {
          if (param0 >= ge.field_a) {
            break L2;
          } else {
            var10 = ge.field_a - param0;
            var7 = var7 - var10;
            param0 = ge.field_a;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= ge.field_j) {
            break L3;
          } else {
            var10 = param0 + var7 - ge.field_j;
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
            ai.a(0, ((ai) this).field_n, var5, var4, 0, ge.field_i, ((ai) this).field_m, var7, var8, var9, 0, var6, param2);
            return;
          } else {
            return;
          }
        }
    }

    ai(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((ai) this).field_c = param0;
        ((ai) this).field_l = param1;
        ((ai) this).field_a = param2;
        ((ai) this).field_k = param3;
        ((ai) this).field_i = param4;
        ((ai) this).field_d = param5;
        ((ai) this).field_n = param6;
        ((ai) this).field_m = param7;
    }

    private final static void a(int param0, byte[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8, int param9, int param10, int param11) {
        param10 = -param11;
        L0: while (true) {
          if (param10 >= 0) {
            return;
          } else {
            L1: {
              param4 = param7;
              if (param2 <= 0) {
                break L1;
              } else {
                if (param1[param2 - 1] != -1) {
                  break L1;
                } else {
                  param4--;
                  param2++;
                  param3++;
                  break L1;
                }
              }
            }
            L2: while (true) {
              if (param4 <= 0) {
                param3 = param3 + param8;
                param2 = param2 + param9;
                param10++;
                continue L0;
              } else {
                int incrementValue$211 = param2;
                param2++;
                param0 = param1[incrementValue$211];
                param4--;
                if (param0 == 0) {
                  param3++;
                  continue L2;
                } else {
                  if (param0 != -1) {
                    int incrementValue$212 = param3;
                    param3++;
                    param5[incrementValue$212] = param6[param0 & 255];
                    continue L2;
                  } else {
                    L3: {
                      int incrementValue$213 = param2;
                      param2++;
                      param0 = param1[incrementValue$213] & 255;
                      param4--;
                      param0 = param0 + param0;
                      if (param0 <= param4) {
                        break L3;
                      } else {
                        param0 = param4;
                        break L3;
                      }
                    }
                    param2 = param2 + param0;
                    param4 = param4 - param0;
                    param3 = param3 + (param0 + 2);
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    ai(int param0, int param1, int param2) {
        ((ai) this).field_i = param0;
        ((ai) this).field_c = param0;
        ((ai) this).field_d = param1;
        ((ai) this).field_l = param1;
        ((ai) this).field_k = 0;
        ((ai) this).field_a = 0;
        ((ai) this).field_n = new byte[param0 * param1];
        ((ai) this).field_m = new int[param2];
    }
}
