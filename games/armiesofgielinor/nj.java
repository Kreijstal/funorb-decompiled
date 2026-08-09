/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends wk {
    final void g(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var3 = param0 + param1 * qn.field_l;
        int var4 = 0;
        int var5 = this.field_v;
        int var6 = this.field_y;
        int var7 = qn.field_l - var6;
        int var8 = 0;
        if (param1 < qn.field_a) {
            var9 = qn.field_a - param1;
            var5 = var5 - var9;
            param1 = qn.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * qn.field_l;
        }
        if (param1 + var5 > qn.field_f) {
            var5 = var5 - (param1 + var5 - qn.field_f);
        }
        if (param0 < qn.field_j) {
            var9 = qn.field_j - param0;
            var6 = var6 - var9;
            param0 = qn.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > qn.field_e) {
            var9 = param0 + var6 - qn.field_e;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        nj.e(qn.field_d, this.field_B, 0, var4, var3, var6, var5, var7, var8);
    }

    private final static void f(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param5;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                incrementValue$11 = param3;
                param3++;
                param2 = param1[incrementValue$11];
                var12 = param2 >>> 24;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = param0[param4];
                  var14 = 256 - var12;
                  var15 = (param2 & 16711935) * param9 & -16711936;
                  var16 = (param2 & 65280) * param9 & 16711680;
                  param2 = (var15 | var16) >>> 8;
                  incrementValue$12 = param4;
                  param4++;
                  param0[incrementValue$12] = ((param2 & 16711935) * var12 + (var13 & 16711935) * var14 & -16711936) + ((param2 & 65280) * var12 + (var13 & 65280) * var14 & 16711680) >>> 8;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int incrementValue$0 = 0;
        int var17 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                param2 = param1[(param3 >> 16) + var14];
                var16 = param2 >>> 24;
                if (var16 != 0) {
                    var17 = 256 - var16;
                    var18 = param0[param5];
                    incrementValue$0 = param5;
                    param5++;
                    param0[incrementValue$0] = ((param2 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((param2 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >>> 8;
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

    final void c(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_w;
        param1 = param1 + (this.field_x - this.field_v - this.field_z);
        int var3 = param0 + (param1 + this.field_v - 1) * qn.field_l;
        int var4 = 0;
        int var5 = this.field_v;
        int var6 = this.field_y;
        int var7 = -qn.field_l - var6;
        int var8 = 0;
        if (param1 < qn.field_a) {
            var5 = var5 - (qn.field_a - param1);
            param1 = qn.field_a;
        }
        if (param1 + var5 > qn.field_f) {
            var9 = param1 + var5 - qn.field_f;
            var5 = var5 - var9;
            var3 = var3 - var9 * qn.field_l;
            var4 = var4 + var9 * var6;
        }
        if (param0 < qn.field_j) {
            var9 = qn.field_j - param0;
            var6 = var6 - var9;
            param0 = qn.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > qn.field_e) {
            var9 = param0 + var6 - qn.field_e;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        nj.e(qn.field_d, this.field_B, 0, var4, var3, var6, var5, var7, var8);
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        var12 = param11 & 16711935;
        var13 = param11 >> 8 & 255;
        param6 = -param8;
        L0: while (true) {
          if (param6 >= 0) {
            return;
          } else {
            param5 = -param7;
            L1: while (true) {
              if (param5 >= 0) {
                param4 = param4 + param9;
                param3 = param3 + param10;
                param6++;
                continue L0;
              } else {
                incrementValue$11 = param3;
                param3++;
                param2 = param1[incrementValue$11];
                var14 = param2 >>> 24;
                param2 = param2 & 16777215;
                if (var14 == 0) {
                  param4++;
                  param5++;
                  continue L1;
                } else {
                  L2: {
                    var15 = 0;
                    if (param2 >> 8 != (param2 & 65535)) {
                      var15 = param2;
                      break L2;
                    } else {
                      param2 = param2 & 255;
                      var15 = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
                      break L2;
                    }
                  }
                  var16 = 256 - var14;
                  var17 = param0[param4];
                  incrementValue$12 = param4;
                  param4++;
                  param0[incrementValue$12] = ((var15 & 16711935) * var14 + (var17 & 16711935) * var16 & -16711936) + ((var15 & 65280) * var14 + (var17 & 65280) * var16 & 16711680) >>> 8;
                  param5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void f(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
            var10 = qn.field_a - param1;
            var6 = var6 - var10;
            param1 = qn.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
            var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
            var10 = qn.field_j - param0;
            var7 = var7 - var10;
            param0 = qn.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > qn.field_e) {
            var10 = param0 + var7 - qn.field_e;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        nj.b(0, 0, 0, qn.field_d, this.field_B, var5, 0, var4, 0, var7, var6, var8, var9, param2);
    }

    final void d(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
            var10 = qn.field_a - param1;
            var6 = var6 - var10;
            param1 = qn.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
            var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
            var10 = qn.field_j - param0;
            var7 = var7 - var10;
            param0 = qn.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > qn.field_e) {
            var10 = param0 + var7 - qn.field_e;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        nj.c(qn.field_d, this.field_B, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
    }

    final void b(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
            var10 = qn.field_a - param1;
            var6 = var6 - var10;
            param1 = qn.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
            var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
            var10 = qn.field_j - param0;
            var7 = var7 - var10;
            param0 = qn.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > qn.field_e) {
            var10 = param0 + var7 - qn.field_e;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        nj.e(qn.field_d, this.field_B, 0, var5, var4, var7, var6, var8, var9, param2);
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var13 = 0;
        int var15 = 0;
        if (param2 <= 0 || param3 <= 0) {
            return;
        }
        int var5 = this.field_y;
        int var6 = this.field_v;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field_A;
        int var10 = this.field_x;
        int var11 = (var9 << 16) / param2;
        int var12 = (var10 << 16) / param3;
        if (this.field_w > 0) {
            var13 = ((this.field_w << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (this.field_w << 16));
        }
        if (this.field_z > 0) {
            var13 = ((this.field_z << 16) + var12 - 1) / var12;
            param1 = param1 + var13;
            var8 = var8 + (var13 * var12 - (this.field_z << 16));
        }
        if (var5 < var9) {
            param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        var13 = param0 + param1 * qn.field_l;
        int var14 = qn.field_l - param2;
        if (param1 + param3 > qn.field_f) {
            param3 = param3 - (param1 + param3 - qn.field_f);
        }
        if (param1 < qn.field_a) {
            var15 = qn.field_a - param1;
            param3 = param3 - var15;
            var13 = var13 + var15 * qn.field_l;
            var8 = var8 + var12 * var15;
        }
        if (param0 + param2 > qn.field_e) {
            var15 = param0 + param2 - qn.field_e;
            param2 = param2 - var15;
            var14 = var14 + var15;
        }
        if (param0 < qn.field_j) {
            var15 = qn.field_j - param0;
            param2 = param2 - var15;
            var13 = var13 + var15;
            var7 = var7 + var11 * var15;
            var14 = var14 + var15;
        }
        nj.d(qn.field_d, this.field_B, 0, var7, var8, var13, var14, param2, param3, var11, var12, var5);
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int incrementValue$0 = 0;
        int var13 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
            var15 = (param4 >> 16) * param11;
            for (var16 = -param7; var16 < 0; var16++) {
                var17 = param1[(param3 >> 16) + var15];
                var18 = param0[param5];
                var19 = (var17 >>> 24) * param12 >> 8;
                var20 = 256 - var19;
                incrementValue$0 = param5;
                param5++;
                param0[incrementValue$0] = ((var17 & 16711935) * var19 + (var18 & 16711935) * var20 & -16711936) + ((var17 & 65280) * var19 + (var18 & 65280) * var20 & 16711680) >>> 8;
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var13;
            param5 = param5 + param6;
        }
    }

    final void h(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        L0: {
          var3 = this.field_y >> 1;
          var4 = this.field_v >> 1;
          param0 = param0 + this.field_w / 2;
          param1 = param1 + this.field_z / 2;
          if (param0 >= qn.field_j) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = qn.field_j - param0 << 1;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= qn.field_e) {
            stackIn_6_0 = this.field_y - 2;
            break L1;
          } else {
            stackIn_6_0 = (qn.field_e - param0 << 1) - 2;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= qn.field_a) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = qn.field_a - param1 << 1;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= qn.field_f) {
            stackIn_12_0 = this.field_v - 2;
            break L3;
          } else {
            stackIn_12_0 = (qn.field_f - param1 << 1) - 2;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var9 = var7;
        L4: while (true) {
          if (var9 > var8) {
            return;
          } else {
            var10 = var9 * this.field_y + var5;
            var11 = (param1 + (var9 >> 1)) * qn.field_l + (param0 + (var5 >> 1));
            var12 = var5;
            L5: while (true) {
              if (var12 > var6) {
                var9 += 2;
                continue L4;
              } else {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                var18 = 0;
                var19 = 0;
                L6: while (true) {
                  if (var19 >= 4) {
                    if (var18 != 0) {
                      var15 = (var15 / var18 << 16) + var17 / var18;
                      var16 = var16 / var18 << 8;
                      var19 = var18 >> 2;
                      var20 = 256 - var19;
                      var21 = qn.field_d[var11];
                      qn.field_d[var11] = (var19 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
                      var12 += 2;
                      var11++;
                      var10 += 2;
                      continue L5;
                    } else {
                      var12 += 2;
                      var11++;
                      var10 += 2;
                      continue L5;
                    }
                  } else {
                    L7: {
                      stackIn_20_0 = this.field_B;

                      stackIn_20_1 = var10 + (var19 & 1);

                      if ((var19 & 2) != 0) {
                        stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = 0;
                        break L7;
                      } else {
                        stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = this.field_y;
                        break L7;
                      }
                    }
                    var13 = stackIn_21_0[stackIn_21_1 + stackIn_21_2];
                    var14 = var13 >>> 24;
                    var18 = var18 + var14;
                    var15 = var15 + var14 * (var13 >> 16 & 255);
                    var16 = var16 + var14 * (var13 >> 8 & 255);
                    var17 = var17 + var14 * (var13 & 255);
                    var19++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    private final static void e(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var9 = -param5;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                incrementValue$11 = param3;
                param3++;
                param2 = param1[incrementValue$11];
                var12 = param2 >>> 24;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = 256 - var12;
                  var14 = param0[param4];
                  incrementValue$12 = param4;
                  param4++;
                  param0[incrementValue$12] = ((param2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void f(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var3 = param0 + param1 * qn.field_l;
        int var4 = 0;
        int var5 = this.field_v;
        int var6 = this.field_y;
        int var7 = qn.field_l - var6;
        int var8 = 0;
        if (param1 < qn.field_a) {
            var9 = qn.field_a - param1;
            var5 = var5 - var9;
            param1 = qn.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * qn.field_l;
        }
        if (param1 + var5 > qn.field_f) {
            var5 = var5 - (param1 + var5 - qn.field_f);
        }
        if (param0 < qn.field_j) {
            var9 = qn.field_j - param0;
            var6 = var6 - var9;
            param0 = qn.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > qn.field_e) {
            var9 = param0 + var6 - qn.field_e;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        nj.e(qn.field_d, this.field_B, 0, var4, var3, var6, var5, var7, var8);
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var9 = -param5;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                incrementValue$11 = param3;
                param3--;
                param2 = param1[incrementValue$11];
                var12 = param2 >>> 24;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = 256 - var12;
                  var14 = param0[param4];
                  incrementValue$12 = param4;
                  param4++;
                  param0[incrementValue$12] = ((param2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    nj(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    nj(int param0, int param1) {
        super(param0, param1);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var14 = 0;
        int var16 = 0;
        if (param4 == 256) {
            this.c(param0, param1, param2, param3);
            return;
        }
        if (param2 <= 0 || param3 <= 0) {
            return;
        }
        int var6 = this.field_y;
        int var7 = this.field_v;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field_A;
        int var11 = this.field_x;
        int var12 = (var10 << 16) / param2;
        int var13 = (var11 << 16) / param3;
        if (this.field_w > 0) {
            var14 = ((this.field_w << 16) + var12 - 1) / var12;
            param0 = param0 + var14;
            var8 = var8 + (var14 * var12 - (this.field_w << 16));
        }
        if (this.field_z > 0) {
            var14 = ((this.field_z << 16) + var13 - 1) / var13;
            param1 = param1 + var14;
            var9 = var9 + (var14 * var13 - (this.field_z << 16));
        }
        if (var6 < var10) {
            param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        var14 = param0 + param1 * qn.field_l;
        int var15 = qn.field_l - param2;
        if (param1 + param3 > qn.field_f) {
            param3 = param3 - (param1 + param3 - qn.field_f);
        }
        if (param1 < qn.field_a) {
            var16 = qn.field_a - param1;
            param3 = param3 - var16;
            var14 = var14 + var16 * qn.field_l;
            var9 = var9 + var13 * var16;
        }
        if (param0 + param2 > qn.field_e) {
            var16 = param0 + param2 - qn.field_e;
            param2 = param2 - var16;
            var15 = var15 + var16;
        }
        if (param0 < qn.field_j) {
            var16 = qn.field_j - param0;
            param2 = param2 - var16;
            var14 = var14 + var16;
            var8 = var8 + var12 * var16;
            var15 = var15 + var16;
        }
        nj.d(qn.field_d, this.field_B, 0, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
    }

    final void e(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
            var10 = qn.field_a - param1;
            var6 = var6 - var10;
            param1 = qn.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
            var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
            var10 = qn.field_j - param0;
            var7 = var7 - var10;
            param0 = qn.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > qn.field_e) {
            var10 = param0 + var7 - qn.field_e;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        nj.d(qn.field_d, this.field_B, 0, var5, var4, var7, var6, var8, var9, param2);
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int incrementValue$0 = 0;
        int var18 = 0;
        int var13 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
            var15 = (param4 >> 16) * param11;
            for (var16 = -param7; var16 < 0; var16++) {
                param2 = param1[(param3 >> 16) + var15];
                var17 = param2 >>> 24;
                if (var17 != 0) {
                    var18 = param0[param5];
                    var19 = 256 - var17;
                    var20 = (param2 & 16711935) * param12 & -16711936;
                    var21 = (param2 & 65280) * param12 & 16711680;
                    param2 = (var20 | var21) >>> 8;
                    incrementValue$0 = param5;
                    param5++;
                    param0[incrementValue$0] = ((param2 & 16711935) * var17 + (var18 & 16711935) * var19 & -16711936) + ((param2 & 65280) * var17 + (var18 & 65280) * var19 & 16711680) >>> 8;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var13;
            param5 = param5 + param6;
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int incrementValue$0 = 0;
        int var14 = 0;
        int var15 = 0;
        int incrementValue$1 = 0;
        for (var10 = -param6; var10 < 0; var10++) {
            for (var11 = -param5; var11 < 0; var11++) {
                var12 = (param1[param3] >>> 24) * param9 >> 8;
                var13 = 256 - var12;
                incrementValue$0 = param3;
                param3++;
                var14 = param1[incrementValue$0];
                var15 = param0[param4];
                incrementValue$1 = param4;
                param4++;
                param0[incrementValue$1] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13 & -16711936) + ((var14 & 65280) * var12 + (var15 & 65280) * var13 & 16711680) >>> 8;
            }
            param4 = param4 + param7;
            param3 = param3 + param8;
        }
    }

    final void d(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + (this.field_A - this.field_y - this.field_w);
        param1 = param1 + this.field_z;
        int var3 = param0 + param1 * qn.field_l;
        int var4 = this.field_y - 1;
        int var5 = this.field_v;
        int var6 = this.field_y;
        int var7 = qn.field_l - var6;
        int var8 = var6 + var6;
        if (param1 < qn.field_a) {
            var9 = qn.field_a - param1;
            var5 = var5 - var9;
            param1 = qn.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * qn.field_l;
        }
        if (param1 + var5 > qn.field_f) {
            var5 = var5 - (param1 + var5 - qn.field_f);
        }
        if (param0 < qn.field_j) {
            var9 = qn.field_j - param0;
            var6 = var6 - var9;
            param0 = qn.field_j;
            var4 = var4 - var9;
            var3 = var3 + var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > qn.field_e) {
            var9 = param0 + var6 - qn.field_e;
            var6 = var6 - var9;
            var8 = var8 - var9;
            var7 = var7 + var9;
        }
        if (var6 <= 0 || var5 <= 0) {
            return;
        }
        nj.d(qn.field_d, this.field_B, 0, var4, var3, var6, var5, var7, var8);
    }

    final void c(int param0, int param1, int param2, int param3, int param4) {
        int var14 = 0;
        int var16 = 0;
        if (param2 <= 0 || param3 <= 0) {
            return;
        }
        int var6 = this.field_y;
        int var7 = this.field_v;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field_A;
        int var11 = this.field_x;
        int var12 = (var10 << 16) / param2;
        int var13 = (var11 << 16) / param3;
        if (this.field_w > 0) {
            var14 = ((this.field_w << 16) + var12 - 1) / var12;
            param0 = param0 + var14;
            var8 = var8 + (var14 * var12 - (this.field_w << 16));
        }
        if (this.field_z > 0) {
            var14 = ((this.field_z << 16) + var13 - 1) / var13;
            param1 = param1 + var14;
            var9 = var9 + (var14 * var13 - (this.field_z << 16));
        }
        if (var6 < var10) {
            param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        var14 = param0 + param1 * qn.field_l;
        int var15 = qn.field_l - param2;
        if (param1 + param3 > qn.field_f) {
            param3 = param3 - (param1 + param3 - qn.field_f);
        }
        if (param1 < qn.field_a) {
            var16 = qn.field_a - param1;
            param3 = param3 - var16;
            var14 = var14 + var16 * qn.field_l;
            var9 = var9 + var13 * var16;
        }
        if (param0 + param2 > qn.field_e) {
            var16 = param0 + param2 - qn.field_e;
            param2 = param2 - var16;
            var15 = var15 + var16;
        }
        if (param0 < qn.field_j) {
            var16 = qn.field_j - param0;
            param2 = param2 - var16;
            var14 = var14 + var16;
            var8 = var8 + var12 * var16;
            var15 = var15 + var16;
        }
        nj.c(qn.field_d, this.field_B, 0, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
    }

    final void g(int param0, int param1, int param2) {
        int var10 = 0;
        if (param2 == 256) {
            this.g(param0, param1);
            return;
        }
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
            var10 = qn.field_a - param1;
            var6 = var6 - var10;
            param1 = qn.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
            var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
            var10 = qn.field_j - param0;
            var7 = var7 - var10;
            param0 = qn.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > qn.field_e) {
            var10 = param0 + var7 - qn.field_e;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 <= 0 || var6 <= 0) {
            return;
        }
        nj.f(qn.field_d, this.field_B, 0, var5, var4, var7, var6, var8, var9, param2);
    }

    final void h(int param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        L0: {
          var4 = this.field_y >> 1;
          var5 = this.field_v >> 1;
          param0 = param0 + this.field_w / 2;
          param1 = param1 + this.field_z / 2;
          if (param0 >= qn.field_j) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = qn.field_j - param0 << 1;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (param0 + var4 <= qn.field_e) {
            stackIn_6_0 = this.field_y - 2;
            break L1;
          } else {
            stackIn_6_0 = (qn.field_e - param0 << 1) - 2;
            break L1;
          }
        }
        L2: {
          var7 = stackIn_6_0;
          if (param1 >= qn.field_a) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = qn.field_a - param1 << 1;
            break L2;
          }
        }
        L3: {
          var8 = stackIn_9_0;
          if (param1 + var5 <= qn.field_f) {
            stackIn_12_0 = this.field_v - 2;
            break L3;
          } else {
            stackIn_12_0 = (qn.field_f - param1 << 1) - 2;
            break L3;
          }
        }
        var9 = stackIn_12_0;
        var10 = var8;
        L4: while (true) {
          if (var10 > var9) {
            return;
          } else {
            var11 = var10 * this.field_y + var6;
            var12 = (param1 + (var10 >> 1)) * qn.field_l + (param0 + (var6 >> 1));
            var13 = var6;
            L5: while (true) {
              if (var13 > var7) {
                var10 += 2;
                continue L4;
              } else {
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                var18 = 0;
                var19 = 0;
                var20 = 0;
                L6: while (true) {
                  if (var20 >= 4) {
                    if (var19 != 0) {
                      var16 = (var16 / var19 << 16) + var18 / var19;
                      var17 = var17 / var19 << 8;
                      var20 = var19 * param2 >> 10;
                      var21 = 256 - var20;
                      var22 = qn.field_d[var12];
                      qn.field_d[var12] = (var20 * var16 + var21 * (var22 & 16711935) & -16711936) + (var20 * var17 + var21 * (var22 & 65280) & 16711680) >>> 8;
                      var13 += 2;
                      var12++;
                      var11 += 2;
                      continue L5;
                    } else {
                      var13 += 2;
                      var12++;
                      var11 += 2;
                      continue L5;
                    }
                  } else {
                    L7: {
                      stackIn_20_0 = this.field_B;

                      stackIn_20_1 = var11 + (var20 & 1);

                      if ((var20 & 2) != 0) {
                        stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = 0;
                        break L7;
                      } else {
                        stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = this.field_y;
                        break L7;
                      }
                    }
                    var14 = stackIn_21_0[stackIn_21_1 + stackIn_21_2];
                    var15 = var14 >>> 24;
                    var19 = var19 + var15;
                    var16 = var16 + var15 * (var14 >> 16 & 255);
                    var17 = var17 + var15 * (var14 >> 8 & 255);
                    var18 = var18 + var15 * (var14 & 255);
                    var20++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    private final static void b(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var14;
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          } else {
            param6 = -param9;
            L1: while (true) {
              if (param6 >= 0) {
                param7 = param7 + param11;
                param5 = param5 + param12;
                param8++;
                continue L0;
              } else {
                incrementValue$11 = param5;
                param5++;
                param0 = param4[incrementValue$11];
                if (param0 == 0) {
                  param7++;
                  param6++;
                  continue L1;
                } else {
                  var14 = param13 * (param0 >>> 24) >> 8 & 255;
                  param1 = (param0 & 16711935) * var14;
                  param0 = (param1 & -16711936) + (param0 * var14 - param1 & 16711680) >>> 8;
                  param1 = param3[param7];
                  param2 = param0 + param1;
                  param0 = (param0 & 16711935) + (param1 & 16711935);
                  param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                  incrementValue$12 = param7;
                  param7++;
                  param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
                  param6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void e(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        var15 = -param6;
        L0: while (true) {
          if (var15 >= 0) {
            return;
          } else {
            var16 = var14;
            L1: while (true) {
              if (var16 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var15++;
                continue L0;
              } else {
                incrementValue$0 = param3;
                param3++;
                param2 = param1[incrementValue$0];
                var17 = param2 >>> 24;
                if (var17 == 0) {
                  param4++;
                  var16++;
                  continue L1;
                } else {
                  L2: {
                    L3: {
                      var19 = param2 >> 16 & 255;
                      var20 = param2 >> 8 & 255;
                      var21 = param2 & 255;
                      if (var19 != var20) {
                        break L3;
                      } else {
                        if (var20 != var21) {
                          break L3;
                        } else {
                          if (var19 > 128) {
                            var18 = (var10 * (256 - var19) + 255 * (var19 - 128) >> 7 << 16) + (var11 * (256 - var20) + 255 * (var20 - 128) >> 7 << 8) + (var12 * (256 - var21) + 255 * (var21 - 128) >> 7);
                            break L2;
                          } else {
                            var18 = (var19 * var10 >> 7 << 16) + (var20 * var11 >> 7 << 8) + (var21 * var12 >> 7);
                            break L2;
                          }
                        }
                      }
                    }
                    var18 = param2;
                    break L2;
                  }
                  var22 = 256 - var17;
                  var23 = param0[param4];
                  incrementValue$1 = param4;
                  param4++;
                  param0[incrementValue$1] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & 65280) * var17 + (var23 & 65280) * var22 & 16711680) >>> 8;
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void e(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int[] var22;
        int[] var23;
        L0: {
          var3 = this.field_y >> 2;
          var4 = this.field_v >> 2;
          param0 = param0 + this.field_w / 4;
          param1 = param1 + this.field_z / 4;
          if (param0 >= qn.field_j) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = qn.field_j - param0 << 2;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= qn.field_e) {
            stackIn_6_0 = this.field_y - 4;
            break L1;
          } else {
            stackIn_6_0 = (qn.field_e - param0 << 2) - 4;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= qn.field_a) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = qn.field_a - param1 << 2;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= qn.field_f) {
            stackIn_12_0 = this.field_v - 4;
            break L3;
          } else {
            stackIn_12_0 = (qn.field_f - param1 << 2) - 4;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var23 = new int[16];
        var22 = var23;
        var9 = var22;
        var10 = var7;
        L4: while (true) {
          if (var10 > var8) {
            return;
          } else {
            var11 = var5;
            L5: while (true) {
              if (var11 > var6) {
                var10 += 4;
                continue L4;
              } else {
                var12 = var10 * this.field_y + var11;
                var13 = (param1 + (var10 >> 2)) * qn.field_l + (param0 + (var11 >> 2));
                var14 = 0;
                L6: while (true) {
                  if (var14 >= 4) {
                    var23 = var22;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                    var18 = 0;
                    var19 = 0;
                    L7: while (true) {
                      if (var19 >= 16) {
                        if (var15 != 0) {
                          var16 = (var16 / var15 << 16) + var18 / var15;
                          var17 = var17 / var15 << 8;
                          var19 = var15 >> 4;
                          var20 = 256 - var19;
                          var21 = qn.field_d[var13];
                          qn.field_d[var13] = (var19 * var16 + var20 * (var21 & 16711935) & -16711936) + (var19 * var17 + var20 * (var21 & 65280) & 16711680) >>> 8;
                          var11 += 4;
                          continue L5;
                        } else {
                          var11 += 4;
                          continue L5;
                        }
                      } else {
                        var14 = var23[var19] >>> 24;
                        var15 = var15 + var14;
                        var16 = var16 + var14 * (var23[var19] >> 16 & 255);
                        var17 = var17 + var14 * (var23[var19] >> 8 & 255);
                        var18 = var18 + var14 * (var23[var19] & 255);
                        var19++;
                        continue L7;
                      }
                    }
                  } else {
                    var15 = 0;
                    L8: while (true) {
                      if (var15 >= 4) {
                        var14++;
                        continue L6;
                      } else {
                        var9[(var14 << 2) + var15] = this.field_B[var12 + var14 * this.field_y + var15];
                        var15++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }
}
