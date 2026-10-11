/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var7Lifetime1;
        if (param5 <= 0) {
          vj.d(param0, param1, param2, param3);
          return;
        }
        if (param5 >= param4) {
          return;
        }
        param0 = param0 - param5;
        param1 = param1 - param5;
        var6 = param4 - param5;
        if (param1 >= vj.field_h &&
          param1 < vj.field_b) {
          if (param0 < vj.field_f) {
            param2 = param2 - (vj.field_f - param0);
            param0 = vj.field_f;
          }
          if (param0 + param2 > vj.field_a) {
            param2 = vj.field_a - param0;
          }
          if (param1 % param4 >= var6) {
            return;
          }
          if (param0 % param4 >= var6) {
            var7 = param4 - param0 % param4;
            param2 = param2 - var7;
            param0 = param0 + var7;
          }
          if ((param0 + param2 - 1) % param4 >= var6) {
            param2 = param2 - (1 + (param0 + param2 - 1) % param4 - var6);
          }
          var7Lifetime1 = param0 + param1 * vj.field_l;
          var8 = param0 % param4;
          var9 = vj.field_j;
          param0 = -param2;
          while (true) {
            if (param0 >= 0) {
              return;
            }
            incrementValue$0 = var8;
            var8++;
            if (incrementValue$0 == var6) {
              param0 = param0 + param5;
              var7Lifetime1 = var7Lifetime1 + param5;
              var8 = 0;
              continue;
            }
            var9[var7Lifetime1++] = param3;
            param0++;
          }
        }
        return;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int[] var13;
        int var7Lifetime1;
        if (param5 <= 0) {
          vj.c(param0, param1, param2, param3);
          return;
        }
        if (param5 >= param4) {
          return;
        }
        param0 = param0 - param5;
        param1 = param1 - param5;
        var6 = param4 - param5;
        if (param0 >= vj.field_f &&
          param0 < vj.field_a) {
          if (param1 < vj.field_h) {
            param2 = param2 - (vj.field_h - param1);
            param1 = vj.field_h;
          }
          if (param1 + param2 > vj.field_b) {
            param2 = vj.field_b - param1;
          }
          if (param0 % param4 >= var6) {
            return;
          }
          if (param1 % param4 >= var6) {
            var7 = param4 - param1 % param4;
            param2 = param2 - var7;
            param1 = param1 + var7;
          }
          if ((param1 + param2 - 1) % param4 >= var6) {
            param2 = param2 - (1 + (param1 + param2 - 1) % param4 - var6);
          }
          var7Lifetime1 = param0 + param1 * vj.field_l;
          var8 = param1 % param4;
          var13 = vj.field_j;
          param1 = -param2;
          while (param1 < 0) {
            incrementValue$0 = var8;
            var8++;
            if (incrementValue$0 != var6) {
              var13[var7Lifetime1] = param3;
              var7Lifetime1 = var7Lifetime1 + vj.field_l;
              param1++;
              continue;
            }
            param1 = param1 + param5;
            var7Lifetime1 = var7Lifetime1 + vj.field_l * param5;
            var8 = 0;
          }
          return;
        }
        return;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int var13;
        int var14;
        int var15;
        int var16;
        var13 = param7;
        var14 = -param6;
        while (true) {
          if (var14 >= 0) {
            return;
          }
          incrementValue$3 = param8;
          param8++;
          if (incrementValue$3 == param9) {
            var14 = var14 + param10;
            param4 = param4 + (param11 + param5) * param10;
            param3 = param3 + (param12 + param5) * param10;
            param8 = 0;
            continue;
          }
          param7 = var13;
          var15 = -param5;
          while (true) {
            if (var15 >= 0) {
              param4 = param4 + param11;
              param3 = param3 + param12;
              var14++;
              break;
            }
            incrementValue$4 = param7;
            param7++;
            if (incrementValue$4 == param9) {
              var16 = param10;
              if (var15 + param10 > 0) {
                var16 = -var15;
              }
              var15 = var15 + var16;
              param4 = param4 + var16;
              param3 = param3 + var16;
              param7 = 0;
              continue;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            var15++;
          }
        }
    }

    final static void a(kc param0, int param1, int param2, int param3, int param4, int param5) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime2Lifetime1;
        if (param5 <= 0) {
          param0.c(param1, param2, param3);
          return;
        }
        if (param5 >= param4) {
          return;
        }
        param1 = param1 - param5;
        param2 = param2 - param5;
        var6 = param4 - param5;
        param1 = param1 + param0.field_q;
        param2 = param2 + param0.field_n;
        var7 = 0;
        var8 = param0.field_o;
        var9 = param0.field_p;
        if (param2 < vj.field_h) {
          var10 = vj.field_h - param2;
          var8 = var8 - var10;
          param2 = vj.field_h;
          var7 = var7 + var10 * var9;
        }
        if (param2 + var8 > vj.field_b) {
          var8 = vj.field_b - param2;
        }
        if (param1 < vj.field_f) {
          var10Lifetime1 = vj.field_f - param1;
          var9 = var9 - var10Lifetime1;
          param1 = vj.field_f;
          var7 = var7 + var10Lifetime1;
        }
        if (param1 + var9 > vj.field_a) {
          var9 = vj.field_a - param1;
        }
        if (var9 > 0 &&
          var8 > 0) {
          if (param1 % param4 >= var6) {
            var10Lifetime2 = param4 - param1 % param4;
            var9 = var9 - var10Lifetime2;
            param1 = param1 + var10Lifetime2;
            var7 = var7 + var10Lifetime2;
          }
          if ((param1 + var9 - 1) % param4 >= var6) {
            var9 = var9 - (1 + (param1 + var9 - 1) % param4 - var6);
          }
          if (param2 % param4 >= var6) {
            var10Lifetime2Lifetime1 = param4 - param2 % param4;
            var8 = var8 - var10Lifetime2Lifetime1;
            param2 = param2 + var10Lifetime2Lifetime1;
            var7 = var7 + var10Lifetime2Lifetime1 * param0.field_p;
          }
          if ((param2 + var8 - 1) % param4 >= var6) {
            var8 = var8 - (1 + (param2 + var8 - 1) % param4 - var6);
          }
          ae.a(vj.field_j, param0.field_r, 0, var7, param1 + param2 * vj.field_l, var9, var8, param1 % param4, param2 % param4, var6, param5, vj.field_l - var9, param0.field_p - var9, param3);
          return;
        }
        return;
    }

    final static void a(kc param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime2Lifetime1;
        int var9Lifetime2Lifetime2;
        if (param4 <= 0) {
          param0.d(param1, param2);
          return;
        }
        if (param4 >= param3) {
          return;
        }
        param1 = param1 - param4;
        param2 = param2 - param4;
        var5 = param3 - param4;
        param1 = param1 + param0.field_q;
        param2 = param2 + param0.field_n;
        var6 = 0;
        var7 = param0.field_o;
        var8 = param0.field_p;
        if (param2 < vj.field_h) {
          var9 = vj.field_h - param2;
          var7 = var7 - var9;
          param2 = vj.field_h;
          var6 = var6 + var9 * var8;
        }
        if (param2 + var7 > vj.field_b) {
          var7 = vj.field_b - param2;
        }
        if (param1 < vj.field_f) {
          var9Lifetime1 = vj.field_f - param1;
          var8 = var8 - var9Lifetime1;
          param1 = vj.field_f;
          var6 = var6 + var9Lifetime1;
        }
        if (param1 + var8 > vj.field_a) {
          var8 = vj.field_a - param1;
        }
        if (var8 > 0 &&
          var7 > 0) {
          if (param1 % param3 >= var5) {
            var9Lifetime2 = param3 - param1 % param3;
            var8 = var8 - var9Lifetime2;
            param1 = param1 + var9Lifetime2;
            var6 = var6 + var9Lifetime2;
          }
          if ((param1 + var8 - 1) % param3 >= var5) {
            var8 = var8 - (1 + (param1 + var8 - 1) % param3 - var5);
          }
          if (param2 % param3 >= var5) {
            var9Lifetime2Lifetime1 = param3 - param2 % param3;
            var7 = var7 - var9Lifetime2Lifetime1;
            param2 = param2 + var9Lifetime2Lifetime1;
            var6 = var6 + var9Lifetime2Lifetime1 * param0.field_p;
          }
          if ((param2 + var7 - 1) % param3 >= var5) {
            var7 = var7 - (1 + (param2 + var7 - 1) % param3 - var5);
          }
          var9Lifetime2Lifetime2 = param1 + param2 * vj.field_l;
          var10 = vj.field_l - var8;
          var11 = param0.field_p - var8;
          ae.a(vj.field_j, param0.field_r, 0, var6, var9Lifetime2Lifetime2, var8, var7, param1 % param3, param2 % param3, var5, param4, var10, var11);
          return;
        }
        return;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$4 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        var14 = param13 & 16711935;
        var15 = param13 >> 8 & 255;
        var16 = param7;
        var17 = -param6;
        while (true) {
          if (var17 >= 0) {
            return;
          }
          incrementValue$0 = param8;
          param8++;
          if (incrementValue$0 == param9) {
            var17 = var17 + param10;
            param4 = param4 + vj.field_l * param10;
            param3 = param3 + (param12 + param5) * param10;
            param8 = 0;
            continue;
          }
          param7 = var16;
          var18 = -param5;
          while (true) {
            if (var18 >= 0) {
              param4 = param4 + param11;
              param3 = param3 + param12;
              var17++;
              break;
            }
            incrementValue$1 = param7;
            param7++;
            if (incrementValue$1 == param9) {
              var19 = param10;
              if (var18 + param10 > 0) {
                var19 = -var18;
              }
              var18 = var18 + var19;
              param4 = param4 + var19;
              param3 = param3 + var19;
              param7 = 0;
              continue;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              if (param2 >> 8 != (param2 & 65535)) {
                param0[param4++] = param2;
              } else {
                param2 = param2 & 255;
                incrementValue$4 = param4;
                param4++;
                param0[incrementValue$4] = (param2 * var14 >> 8 & 16711935) + (param2 * var15 & 65280);
              }
            }
            var18++;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        int var8;
        int var8Lifetime1;
        if (param6 <= 0) {
          vj.c(param0, param1, param2, param3, param4);
          return;
        }
        if (param6 >= param5) {
          return;
        }
        param0 = param0 - param6;
        param1 = param1 - param6;
        var7 = param5 - param6;
        if (param1 < vj.field_h) {
          param3 = param3 - (vj.field_h - param1);
          param1 = vj.field_h;
        }
        if (param1 + param3 > vj.field_b) {
          param3 = vj.field_b - param1;
        }
        if (param0 < vj.field_f) {
          param2 = param2 - (vj.field_f - param0);
          param0 = vj.field_f;
        }
        if (param0 + param2 > vj.field_a) {
          param2 = vj.field_a - param0;
        }
        if (param2 > 0 &&
          param3 > 0) {
          if (param0 % param5 >= var7) {
            var8 = param5 - param0 % param5;
            param2 = param2 - var8;
            param0 = param0 + var8;
          }
          if ((param0 + param2 - 1) % param5 >= var7) {
            param2 = param2 - (1 + (param0 + param2 - 1) % param5 - var7);
          }
          if (param1 % param5 >= var7) {
            var8Lifetime1 = param5 - param1 % param5;
            param3 = param3 - var8Lifetime1;
            param1 = param1 + var8Lifetime1;
          }
          if ((param1 + param3 - 1) % param5 >= var7) {
            param3 = param3 - (1 + (param1 + param3 - 1) % param5 - var7);
          }
          ae.a(vj.field_j, param4, param0 + param1 * vj.field_l, param2, param3, param0 % param5, param1 % param5, var7, param6, vj.field_l - param2);
          return;
        }
        return;
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        var10 = param5;
        var11 = -param4;
        while (true) {
          if (var11 >= 0) {
            return;
          }
          incrementValue$3 = param6;
          param6++;
          if (incrementValue$3 == param7) {
            var11 = var11 + param8;
            param2 = param2 + vj.field_l * param8;
            param6 = 0;
            continue;
          }
          param5 = var10;
          var12 = -param3;
          while (true) {
            if (var12 >= 0) {
              param2 = param2 + param9;
              var11++;
              break;
            }
            incrementValue$4 = param5;
            param5++;
            if (incrementValue$4 != param7) {
              param0[param2++] = param1;
              var12++;
              continue;
            }
            var13 = param8;
            if (var12 + param8 > 0) {
              var13 = -var12;
            }
            var12 = var12 + var13;
            param2 = param2 + var13;
            param5 = 0;
          }
        }
    }
}
