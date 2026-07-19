/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends hd {
    byte[] field_m;
    int[] field_n;

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
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
                incrementValue$66 = param3;
                param3++;
                var13 = param1[incrementValue$66];
                if (var13 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param2[var13 & 255];
                  var14 = param0[param4];
                  incrementValue$67 = param4;
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

    final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + this.field_b;
          param1 = param1 + this.field_e;
          var3 = param0 + param1 * eh.field_g;
          var4 = 0;
          var5 = this.field_f;
          var6 = this.field_a;
          var7 = eh.field_g - var6;
          var8 = 0;
          if (param1 >= eh.field_d) {
            break L0;
          } else {
            var9 = eh.field_d - param1;
            var5 = var5 - var9;
            param1 = eh.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * eh.field_g;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= eh.field_e) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - eh.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= eh.field_a) {
            break L2;
          } else {
            var9 = eh.field_a - param0;
            var6 = var6 - var9;
            param0 = eh.field_a;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= eh.field_k) {
            break L3;
          } else {
            var9 = param0 + var6 - eh.field_k;
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
            ln.a(eh.field_f, this.field_m, this.field_n, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
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
          param0 = param0 + this.field_b;
          param1 = param1 + this.field_e;
          var4 = param0 + param1 * eh.field_g;
          var5 = 0;
          var6 = this.field_f;
          var7 = this.field_a;
          var8 = eh.field_g - var7;
          var9 = 0;
          if (param1 >= eh.field_d) {
            break L0;
          } else {
            var10 = eh.field_d - param1;
            var6 = var6 - var10;
            param1 = eh.field_d;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * eh.field_g;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= eh.field_e) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - eh.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= eh.field_a) {
            break L2;
          } else {
            var10 = eh.field_a - param0;
            var7 = var7 - var10;
            param0 = eh.field_a;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= eh.field_k) {
            break L3;
          } else {
            var10 = param0 + var7 - eh.field_k;
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
            ln.a(eh.field_f, this.field_m, this.field_n, var5, var4, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
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
          param0 = param0 + this.field_b;
          param1 = param1 + this.field_e;
          var3 = param0 + param1 * eh.field_g;
          var4 = 0;
          var5 = this.field_f;
          var6 = this.field_a;
          var7 = eh.field_g - var6;
          var8 = 0;
          if (param1 >= eh.field_d) {
            break L0;
          } else {
            var9 = eh.field_d - param1;
            var5 = var5 - var9;
            param1 = eh.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * eh.field_g;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= eh.field_e) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - eh.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= eh.field_a) {
            break L2;
          } else {
            var9 = eh.field_a - param0;
            var6 = var6 - var9;
            param0 = eh.field_a;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= eh.field_k) {
            break L3;
          } else {
            var9 = param0 + var6 - eh.field_k;
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
            ln.b(eh.field_f, this.field_m, this.field_n, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    private final static void a(int param0, byte[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$211 = 0;
        int incrementValue$212 = 0;
        int incrementValue$213 = 0;
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
                incrementValue$211 = param2;
                param2++;
                param0 = param1[incrementValue$211];
                param4--;
                if (param0 == 0) {
                  param3++;
                  continue L2;
                } else {
                  if (param0 != -1) {
                    incrementValue$212 = param3;
                    param3++;
                    param5[incrementValue$212] = param6[param0 & 255];
                    continue L2;
                  } else {
                    L3: {
                      incrementValue$213 = param2;
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

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var11 = 0;
        int var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
            for (var11 = var9; var11 < 0; var11++) {
                incrementValue$0 = param4;
                param4++;
                incrementValue$1 = param3;
                param3++;
                param0[incrementValue$0] = param2[param1[incrementValue$1] & 255];
                incrementValue$2 = param4;
                param4++;
                incrementValue$3 = param3;
                param3++;
                param0[incrementValue$2] = param2[param1[incrementValue$3] & 255];
                incrementValue$4 = param4;
                param4++;
                incrementValue$5 = param3;
                param3++;
                param0[incrementValue$4] = param2[param1[incrementValue$5] & 255];
                incrementValue$6 = param4;
                param4++;
                incrementValue$7 = param3;
                param3++;
                param0[incrementValue$6] = param2[param1[incrementValue$7] & 255];
            }
            for (var11 = param5; var11 < 0; var11++) {
                incrementValue$8 = param4;
                param4++;
                incrementValue$9 = param3;
                param3++;
                param0[incrementValue$8] = param2[param1[incrementValue$9] & 255];
            }
            param4 = param4 + param7;
            param3 = param3 + param8;
        }
    }

    final void a() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_n.length <= 255) {
          var1 = this.field_a * this.field_f - 1;
          var2 = this.field_f - 1;
          L0: while (true) {
            if (var2 < 0) {
              return;
            } else {
              var3 = 0;
              var4 = this.field_a - 1;
              L1: while (true) {
                if (var4 < 0) {
                  var2--;
                  continue L0;
                } else {
                  var5 = this.field_m[var1];
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
                      this.field_m[var1] = (byte)-1;
                      this.field_m[var1 + 1] = (byte)(var3 - 2 >> 1);
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

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + this.field_b;
          param1 = param1 + this.field_e;
          var3 = param0 + param1 * eh.field_g;
          var4 = 0;
          var5 = this.field_f;
          var6 = this.field_a;
          var7 = eh.field_g - var6;
          var8 = 0;
          if (param1 >= eh.field_d) {
            break L0;
          } else {
            var9 = eh.field_d - param1;
            var5 = var5 - var9;
            param1 = eh.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * eh.field_g;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= eh.field_e) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - eh.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= eh.field_a) {
            break L2;
          } else {
            var9 = eh.field_a - param0;
            var6 = var6 - var9;
            param0 = eh.field_a;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= eh.field_k) {
            break L3;
          } else {
            var9 = param0 + var6 - eh.field_k;
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
            ln.a(0, this.field_m, var4, var3, 0, eh.field_f, this.field_n, var6, var7, var8, 0, var5);
            return;
          } else {
            return;
          }
        }
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
                    param3 = param1[incrementValue$10];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$11 = param5;
                      param5++;
                      param0[incrementValue$11] = param2[param3 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$12 = param4;
                  param4++;
                  param3 = param1[incrementValue$12];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    incrementValue$13 = param5;
                    param5++;
                    param0[incrementValue$13] = param2[param3 & 255];
                    break L3;
                  }
                }
                L4: {
                  incrementValue$14 = param4;
                  param4++;
                  param3 = param1[incrementValue$14];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    incrementValue$15 = param5;
                    param5++;
                    param0[incrementValue$15] = param2[param3 & 255];
                    break L4;
                  }
                }
                L5: {
                  incrementValue$16 = param4;
                  param4++;
                  param3 = param1[incrementValue$16];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    incrementValue$17 = param5;
                    param5++;
                    param0[incrementValue$17] = param2[param3 & 255];
                    break L5;
                  }
                }
                incrementValue$18 = param4;
                param4++;
                param3 = param1[incrementValue$18];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$19 = param5;
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

    ln(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_j = param0;
        this.field_k = param1;
        this.field_b = param2;
        this.field_e = param3;
        this.field_a = param4;
        this.field_f = param5;
        this.field_m = param6;
        this.field_n = param7;
    }

    ln(int param0, int param1, int param2) {
        this.field_a = param0;
        this.field_j = param0;
        this.field_f = param1;
        this.field_k = param1;
        this.field_e = 0;
        this.field_b = 0;
        this.field_m = new byte[param0 * param1];
        this.field_n = new int[param2];
    }
}
