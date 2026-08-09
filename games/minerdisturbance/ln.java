/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends hd {
    byte[] field_m;
    int[] field_n;

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
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
                incrementValue$11 = param3;
                param3++;
                var13 = param1[incrementValue$11];
                if (var13 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param2[var13 & 255];
                  var14 = param0[param4];
                  incrementValue$12 = param4;
                  param4++;
                  param0[incrementValue$12] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void c(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_b;
        param1 = param1 + this.field_e;
        int var3 = param0 + param1 * eh.field_g;
        int var4 = 0;
        int var5 = this.field_f;
        int var6 = this.field_a;
        int var7 = eh.field_g - var6;
        int var8 = 0;
        if (param1 < eh.field_d) {
            var9 = eh.field_d - param1;
            var5 = var5 - var9;
            param1 = eh.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * eh.field_g;
        }
        if (param1 + var5 > eh.field_e) {
            var5 = var5 - (param1 + var5 - eh.field_e);
        }
        if (param0 < eh.field_a) {
            var9 = eh.field_a - param0;
            var6 = var6 - var9;
            param0 = eh.field_a;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > eh.field_k) {
            var9 = param0 + var6 - eh.field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            ln.a(eh.field_f, this.field_m, this.field_n, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_b;
        param1 = param1 + this.field_e;
        int var4 = param0 + param1 * eh.field_g;
        int var5 = 0;
        int var6 = this.field_f;
        int var7 = this.field_a;
        int var8 = eh.field_g - var7;
        int var9 = 0;
        if (param1 < eh.field_d) {
            var10 = eh.field_d - param1;
            var6 = var6 - var10;
            param1 = eh.field_d;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * eh.field_g;
        }
        if (param1 + var6 > eh.field_e) {
            var6 = var6 - (param1 + var6 - eh.field_e);
        }
        if (param0 < eh.field_a) {
            var10 = eh.field_a - param0;
            var7 = var7 - var10;
            param0 = eh.field_a;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > eh.field_k) {
            var10 = param0 + var7 - eh.field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            ln.a(eh.field_f, this.field_m, this.field_n, var5, var4, var7, var6, var8, var9, param2);
            return;
        }
    }

    final void a(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_b;
        param1 = param1 + this.field_e;
        int var3 = param0 + param1 * eh.field_g;
        int var4 = 0;
        int var5 = this.field_f;
        int var6 = this.field_a;
        int var7 = eh.field_g - var6;
        int var8 = 0;
        if (param1 < eh.field_d) {
            var9 = eh.field_d - param1;
            var5 = var5 - var9;
            param1 = eh.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * eh.field_g;
        }
        if (param1 + var5 > eh.field_e) {
            var5 = var5 - (param1 + var5 - eh.field_e);
        }
        if (param0 < eh.field_a) {
            var9 = eh.field_a - param0;
            var6 = var6 - var9;
            param0 = eh.field_a;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > eh.field_k) {
            var9 = param0 + var6 - eh.field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            ln.b(eh.field_f, this.field_m, this.field_n, 0, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    private final static void a(int param0, byte[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
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
                incrementValue$12 = param2;
                param2++;
                param0 = param1[incrementValue$12];
                param4--;
                if (param0 == 0) {
                  param3++;
                  continue L2;
                } else {
                  if (param0 != -1) {
                    incrementValue$13 = param3;
                    param3++;
                    param5[incrementValue$13] = param6[param0 & 255];
                    continue L2;
                  } else {
                    L3: {
                      incrementValue$14 = param2;
                      param2++;
                      param0 = param1[incrementValue$14] & 255;
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
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
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
        int var9 = 0;
        param0 = param0 + this.field_b;
        param1 = param1 + this.field_e;
        int var3 = param0 + param1 * eh.field_g;
        int var4 = 0;
        int var5 = this.field_f;
        int var6 = this.field_a;
        int var7 = eh.field_g - var6;
        int var8 = 0;
        if (param1 < eh.field_d) {
            var9 = eh.field_d - param1;
            var5 = var5 - var9;
            param1 = eh.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * eh.field_g;
        }
        if (param1 + var5 > eh.field_e) {
            var5 = var5 - (param1 + var5 - eh.field_e);
        }
        if (param0 < eh.field_a) {
            var9 = eh.field_a - param0;
            var6 = var6 - var9;
            param0 = eh.field_a;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > eh.field_k) {
            var9 = param0 + var6 - eh.field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            ln.a(0, this.field_m, var4, var3, 0, eh.field_f, this.field_n, var6, var7, var8, 0, var5);
            return;
        }
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        int var10;
        int var11;
        int var12;
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
                    incrementValue$0 = param4;
                    param4++;
                    param3 = param1[incrementValue$0];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$1 = param5;
                      param5++;
                      param0[incrementValue$1] = param2[param3 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$2 = param4;
                  param4++;
                  param3 = param1[incrementValue$2];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    incrementValue$3 = param5;
                    param5++;
                    param0[incrementValue$3] = param2[param3 & 255];
                    break L3;
                  }
                }
                L4: {
                  incrementValue$4 = param4;
                  param4++;
                  param3 = param1[incrementValue$4];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    incrementValue$5 = param5;
                    param5++;
                    param0[incrementValue$5] = param2[param3 & 255];
                    break L4;
                  }
                }
                L5: {
                  incrementValue$6 = param4;
                  param4++;
                  param3 = param1[incrementValue$6];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    incrementValue$7 = param5;
                    param5++;
                    param0[incrementValue$7] = param2[param3 & 255];
                    break L5;
                  }
                }
                incrementValue$8 = param4;
                param4++;
                param3 = param1[incrementValue$8];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$9 = param5;
                  param5++;
                  param0[incrementValue$9] = param2[param3 & 255];
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
