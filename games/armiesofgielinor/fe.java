/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    private static d field_i;
    static int field_b;
    private static String[] field_k;
    private static int field_a;
    private static wk field_g;
    private static int field_f;
    static wk[] field_l;
    private static int[] field_d;
    private static int field_n;
    static int[][] field_o;
    private static int field_h;
    private static int field_c;
    private static int field_j;
    private static int field_m;
    private static int[] field_e;

    private final static void a(int param0, int param1, int param2, int param3, wk[] param4, int[] param5, boolean param6) {
        int var14 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        var7 = 0;
        var8 = (param5.length << 16) / param3;
        var9 = 0;
        var11 = param4[0].field_y;
        var12 = param4[0].field_v;
        for (var14 = 0; var14 < param3; var14++) {
          if (var14 >= var12) {
            if (param3 - var14 > var12) {
              var13 = 3;
            } else {
              var13 = 6;
              if (param3 - var14 == var12) {
                var7 = 0;
              }
            }
          } else {
            var13 = 0;
          }
          var10 = param5[var9 >> 16];
          var9 = var9 + var8;
          var17 = (param1 + var14) * qn.field_l + param0;
          var18 = 0;
          while (var18 < 3) {
            var19 = var7 % var12 * var11;
            if (var18 != 1) {
              var15 = -var11;
              while (var15 < 0) {
                var20 = param4[var13].field_B[var19];
                if (var20 != 0) {
                  if ((var20 & -65281) == 0) {
                    var20 = fe.a(var10, var20 >> 8, 0, 0);
                  }
                  qn.field_d[var17] = var20;
                }
                var15++;
                var19++;
                var17++;
              }
            } else {
              var16 = param2 - (var11 << 1);
              if (var13 == 4 &&
                !param6) {
                var17 = var17 + var16;
              } else {
                var20 = param4[var13].field_B[var19];
                if (var20 != 0) {
                  if ((var20 & -65281) == 0) {
                    var20 = fe.a(var10, var20 >> 8, 0, 0);
                  }
                  var15 = -var16;
                  while (var15 < 0) {
                    qn.field_d[var17] = var20;
                    var15++;
                    var17++;
                  }
                } else {
                  var17 = var17 + var16;
                }
              }
            }
            var18++;
            var13++;
          }
          var7++;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wk[] param4, int[] param5, int param6, int param7) {
        fe.a(param0, param1, param2, param3, param4, param5, param6, param7, true);
    }

    final static void a(String param0, int param1, int param2, int param3, int[] param4, boolean param5, int param6, int param7) {
        int var12 = 0;
        field_d[0] = param3 << (param5 ? 1 : 0);
        int var8 = field_i.a(param0, field_d, field_k);
        int var9 = field_i.field_v >> (param5 ? 1 : 0);
        int var10 = var9 * var8;
        int var11 = 0;
        if (param7 == 1) {
          var11 = (param6 - var10) / 2;
        } else {
          if (param7 == 2) {
            var11 = param6 - var10;
          }
        }
        for (var12 = 0; var12 < var8; var12++) {
          fe.c(field_k[var12], param1, param2 + var11 + var9 * var12, param4, param5);
        }
    }

    final static void b(String param0, int param1, int param2, int[] param3, boolean param4) {
        param1 = param1 - (field_i.a(param0) >> (param4 ? 1 : 0));
        fe.a(param0, param1, param2, param3, param4);
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 16384;
        while (var2 > param0) {
          var2 = var2 >> 2;
        }
        while (var2 != 0) {
          if (var1 + var2 < param0) {
            param0 = param0 - (var1 + var2);
            var1 = var1 + 2 * var2;
          }
          var1 = var1 >> 1;
          var2 = var2 >> 2;
        }
        return var1;
    }

    private final static boolean c(int param0, int param1) {
        if (field_m < 0) {
          return false;
        }
        int var2 = field_f - param0;
        int var3 = field_n - param1;
        int var4 = var2 * var2 + var3 * var3;
        if (var4 > field_m * field_m) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, wk[] param4, int param5) {
        int var6;
        int var7;
        int var8;
        param4[0].e(param0, param1, param5);
        param4[1].e(param0 + param2 - param4[0].field_y, param1, param5);
        param4[2].e(param0, param1 + param3 - param4[0].field_v, param5);
        param4[3].e(param0 + param2 - param4[0].field_y, param1 + param3 - param4[0].field_v, param5);
        var6 = param1;
        var7 = param3 - param4[0].field_v;
        var8 = param2 - param4[0].field_y;
        for (param1 = 0; param1 < param3; param1++) {
          if (param1 >= param4[0].field_v) {
            if (param1 < var7) {
              qn.d(param0, var6, param0 + param2 - 1, var6, 0, param5);
            } else {
              qn.d(param0 + param4[0].field_y, var6, param0 + var8 - 1, var6, 0, param5);
            }
          } else {
            qn.d(param0 + param4[0].field_y, var6, param0 + var8 - 1, var6, 0, param5);
          }
          var6++;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var7 = param5 / 2 + 1;
        double var9Lifetime1;
        double var9Lifetime2;
        for (var8 = 0; var8 < param3; var8++) {
          var9 = (double)param4 * 3.141592653589793 * 2.0 / 100.0;
          var11 = (double)var8 * 3.141592653589793 * 2.0 / (double)param3;
          qn.a((int)(((double)param0 + (Math.cos(var9) * Math.cos(var11) * (double)param5 - Math.sin(var9) * Math.sin(var11) * (double)var7)) * 16.0), (int)(((double)param1 + (Math.sin(var9) * Math.cos(var11) * (double)var7 + Math.cos(var9) * Math.sin(var11) * (double)param5)) * 16.0), param6, 15, field_o[param2]);
          var9Lifetime1 = (double)(param4 + 5) * 3.141592653589793 * 2.0 / 100.0;
          qn.a((int)(((double)param0 + (Math.cos(var9Lifetime1) * Math.cos(var11) * (double)param5 - Math.sin(var9Lifetime1) * Math.sin(var11) * (double)var7)) * 16.0), (int)(((double)param1 + (Math.sin(var9Lifetime1) * Math.cos(var11) * (double)var7 + Math.cos(var9Lifetime1) * Math.sin(var11) * (double)param5)) * 16.0), param6, 31, field_o[param2]);
          var9Lifetime2 = (double)(param4 + 10) * 3.141592653589793 * 2.0 / 100.0;
          qn.a((int)(((double)param0 + (Math.cos(var9Lifetime2) * Math.cos(var11) * (double)param5 - Math.sin(var9Lifetime2) * Math.sin(var11) * (double)var7)) * 16.0), (int)(((double)param1 + (Math.sin(var9Lifetime2) * Math.cos(var11) * (double)var7 + Math.cos(var9Lifetime2) * Math.sin(var11) * (double)param5)) * 16.0), param6, 63, field_o[param2]);
        }
    }

    final static void a(String param0, int param1, int param2, boolean param3) {
        int var4 = field_i.a(param0) + 40;
        if (param3) {
          var4 = var4 >> 1;
          param2 -= 26;
          param1 -= 10;
          fe.a(field_l[0], param1, param2, field_l[2].field_y >> 1, field_l[2].field_v >> 1);
          fe.a(field_l[2], param1 + var4 - (field_l[2].field_y >> 1), param2, field_l[2].field_y >> 1, field_l[2].field_v >> 1);
          fe.a(field_l[1], param1 + (field_l[0].field_y >> 1), param2, var4 - field_l[0].field_y, field_l[1].field_v >> 1);
        } else {
          param2 -= 26;
          param1 -= 20;
          fe.a(field_l[0], param1, param2);
          fe.a(field_l[2], param1 + var4 - field_l[2].field_y, param2);
          fe.a(field_l[1], param1 + field_l[0].field_y, param2, var4 - (field_l[0].field_y << 1), field_l[1].field_v);
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int incrementValue$7 = 0;
        int var16;
        int var17;
        int var18;
        int var19;
        var16 = param3;
        while (param8 < 0) {
          param7 = (param9 >> 16) * param15;
          for (param6 = -param12; param6 < 0; param6++) {
            boolean decompiledFrameRemainder0 = true;
            param0 = param4[(param3 >> 16) + param7];
            if (param0 == 0) {
              param10++;
            } else {
              param1 = param5[param10];
              if (param1 != 0) {
                var17 = ((param0 & 16711680) >>> 16) * ((param1 & 16711680) >>> 16) >>> 8;
                var18 = (param0 & 65280) * (param1 & 65280) >>> 24;
                var19 = (param0 & 255) * (param1 & 255) >>> 8;
                incrementValue$7 = param10;
                param10++;
                param5[incrementValue$7] = (var17 << 16) + (var18 << 8) + var19;
                param3 = param3 + param13;
                decompiledFrameRemainder0 = false;
              }
              else {
                param10++;
              }
            }
            if (decompiledFrameRemainder0) {
              param3 = param3 + param13;
            }
          }
          param9 = param9 + param14;
          param3 = var16;
          param10 = param10 + param11;
          param8++;
        }
    }

    final static void c(String param0, int param1, int param2, int[] param3, boolean param4) {
        param1 = param1 - (field_i.a(param0) >> (param4 ? 2 : 1));
        fe.a(param0, param1, param2, param3, param4);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 > 256) {
          var2 = param1 - 256;
          param1 = 256;
        }
        int var3 = ((param0 & 16711680) * param1 >> 8 & 16711680) + (var2 << 16);
        int var4 = ((param0 & 65280) * param1 >> 8 & 65280) + (var2 << 8);
        int var5 = ((param0 & 255) * param1 >> 8 & 255) + var2;
        if (var3 > 16711680) {
          var3 = 16711680;
        }
        if (var4 > 65280) {
          var4 = 65280;
        }
        if (var5 > 255) {
          var5 = 255;
        }
        return var3 | var4 | var5;
    }

    final static void a(String param0, int param1, int param2, int[] param3, boolean param4) {
        int var8 = 0;
        fe.a();
        int[] var5 = qn.field_d;
        int var6 = qn.field_l;
        int var7 = qn.field_g;
        if (field_g != null) {
          if (field_i == null) {
            return;
          }
          param2 = param2 - (field_i.field_v - field_i.field_L);
          var8 = field_i.a(param0);
          if ((var8 & 1) == 1) {
            var8++;
          }
          field_g.b();
          qn.b();
          field_i.b(param0, 0, field_i.field_H + 3, 0, -1);
          qn.a(var5, var6, var7);
          fe.c();
          if (param4) {
            fe.a(field_g, param1, param2, var8, param3);
          } else {
            fe.b(field_g, param1, param2, var8, param3);
          }
          return;
        }
    }

    final static void a(wk param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var13 = 0;
        int var15 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        if (param3 > 0) {
          if (param4 <= 0) {
            return;
          }
          var5 = param0.field_y;
          var6 = param0.field_v;
          var7 = 0;
          var8 = 0;
          var9 = param0.field_A;
          var10 = param0.field_x;
          var11 = (var9 << 16) / param3;
          var12 = (var10 << 16) / param4;
          if (param0.field_w > 0) {
            var13 = ((param0.field_w << 16) + var11 - 1) / var11;
            param1 = param1 + var13;
            var7 = var7 + (var13 * var11 - (param0.field_w << 16));
          }
          if (param0.field_z > 0) {
            var13Lifetime1 = ((param0.field_z << 16) + var12 - 1) / var12;
            param2 = param2 + var13Lifetime1;
            var8 = var8 + (var13Lifetime1 * var12 - (param0.field_z << 16));
          }
          if (var5 < var9) {
            param3 = ((var5 << 16) - var7 + var11 - 1) / var11;
          }
          if (var6 < var10) {
            param4 = ((var6 << 16) - var8 + var12 - 1) / var12;
          }
          var13Lifetime2 = param1 + param2 * qn.field_l;
          var14 = qn.field_l - param3;
          if (param2 + param4 > qn.field_f) {
            param4 = param4 - (param2 + param4 - qn.field_f);
          }
          if (param2 < qn.field_a) {
            var15 = qn.field_a - param2;
            param4 = param4 - var15;
            var13Lifetime2 = var13Lifetime2 + var15 * qn.field_l;
            var8 = var8 + var12 * var15;
          }
          if (param1 + param3 > qn.field_e) {
            var15Lifetime1 = param1 + param3 - qn.field_e;
            param3 = param3 - var15Lifetime1;
            var14 = var14 + var15Lifetime1;
          }
          if (param1 < qn.field_j) {
            var15Lifetime2 = qn.field_j - param1;
            param3 = param3 - var15Lifetime2;
            var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
            var7 = var7 + var11 * var15Lifetime2;
            var14 = var14 + var15Lifetime2;
          }
          fe.a(0, 0, 0, var7, param0.field_B, qn.field_d, 0, 0, -param4, var8, var13Lifetime2, var14, param3, var11, var12, var5);
          return;
        }
    }

    final static void a(wk param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param1 = param1 + param0.field_w;
        param2 = param2 + param0.field_z;
        int var4 = param1 + param2 * qn.field_l;
        int var5 = 0;
        int var6 = param0.field_v;
        int var7 = param0.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param2 < qn.field_a) {
          var10 = qn.field_a - param2;
          var6 = var6 - var10;
          param2 = qn.field_a;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * qn.field_l;
        }
        if (param2 + var6 > qn.field_f) {
          var6 = var6 - (param2 + var6 - qn.field_f);
        }
        if (param1 < qn.field_j) {
          var10Lifetime1 = qn.field_j - param1;
          var7 = var7 - var10Lifetime1;
          param1 = qn.field_j;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param1 + var7 > qn.field_e) {
          var10Lifetime2 = param1 + var7 - qn.field_e;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          fe.a(0, qn.field_d, param0.field_B, 0, var5, var4, var7, var6, var8, var9, param3);
          return;
        }
    }

    final static void a(String param0, int param1, int param2, int param3, boolean param4) {
        int var8 = 0;
        fe.a();
        int[] var5 = qn.field_d;
        int var6 = qn.field_l;
        int var7 = qn.field_g;
        if (field_g != null) {
          if (field_i == null) {
            return;
          }
          param2 = param2 - (field_i.field_H - field_i.field_L);
          var8 = field_i.a(param0);
          if ((var8 & 1) == 1) {
            var8++;
          }
          field_g.b();
          qn.b();
          field_i.b(param0, 0, field_i.field_H + 3, 0, -1);
          qn.a(var5, var6, var7);
          fe.c();
          if (param4) {
            fe.b(field_g, param1, param2, var8, param3);
          } else {
            fe.c(field_g, param1, param2, var8, param3);
          }
          return;
        }
    }

    final static void d(String param0, int param1, int param2, int param3, boolean param4) {
        param1 = param1 - (field_i.a(param0) >> (param4 ? 1 : 0));
        fe.a(param0, param1, param2, param3, param4);
    }

    final static wk[] a(int param0, int param1, int param2, int param3, wk[] param4, int[] param5) {
        int var14 = 0;
        wk[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var11Lifetime1;
        var6 = new wk[4];
        var6[0] = new wk(param2, param4[0].field_v);
        var6[3] = new wk(param2, param4[0].field_v);
        var6[1] = new wk(param4[0].field_y, param3 - param4[0].field_v * 2);
        var6[2] = new wk(param4[0].field_y, param3 - param4[0].field_v * 2);
        var9 = 0;
        var10 = 0;
        var11 = 0;
        var12 = (param5.length << 16) / param3;
        var13 = 0;
        for (var14 = 0; var14 < param3; var14++) {
          var11Lifetime1 = param5[var13 >> 16];
          var13 = var13 + var12;
          if (var14 < param4[0].field_v) {
            var8 = 0;
            for (var15 = 0; var15 < param2; var15++) {
              if (var15 >= param4[0].field_y) {
                if (param2 - var15 > param4[0].field_y) {
                  var7 = 1;
                } else {
                  if (param2 - var15 == param4[0].field_y) {
                    var10 = 0;
                  }
                  var7 = 2;
                }
              } else {
                var7 = 0;
              }
              var16 = var7 + var8;
              var17 = param4[var16].field_B[var10 % param4[0].field_y + var9 % param4[0].field_v * param4[0].field_y];
              var10++;
              if (var17 != 0) {
                if ((var17 & 65280) == var17) {
                  var17 = fe.a(var11Lifetime1, var17 >> 8, 0, 0);
                }
                var6[0].field_B[var15 + var14 * param2] = var17;
              }
            }
          } else if (var14 < param3 - param4[0].field_v) {
            var10 = 0;
            for (var15 = 0; var15 < param4[0].field_y; var15++) {
              var16 = 3;
              var17 = param4[var16].field_B[var10 % param4[0].field_y + var9 % param4[0].field_v * param4[0].field_y];
              if (var17 != 0) {
                if ((var17 & 65280) == var17) {
                  var17 = fe.a(var11Lifetime1, var17 >> 8, 0, 0);
                }
                var6[1].field_B[var15 + (var14 - param4[0].field_v) * param4[0].field_y] = var17;
              }
              var16 = 5;
              var17 = param4[var16].field_B[var10 % param4[0].field_y + var9 % param4[0].field_v * param4[0].field_y];
              if (var17 != 0) {
                if ((var17 & 65280) == var17) {
                  var17 = fe.a(var11Lifetime1, var17 >> 8, 0, 0);
                }
                var6[2].field_B[var15 + (var14 - param4[0].field_v) * param4[0].field_y] = var17;
              }
              var10++;
            }
            var9++;
          } else {
            if (var14 == param3 - param4[0].field_v) {
              var9 = 0;
            }
            var8 = 6;
            for (var15 = 0; var15 < param2; var15++) {
              if (var15 >= param4[0].field_y) {
                if (param2 - var15 > param4[0].field_y) {
                  var7 = 1;
                } else {
                  if (param2 - var15 == param4[0].field_y) {
                    var10 = 0;
                  }
                  var7 = 2;
                }
              } else {
                var7 = 0;
              }
              var16 = var7 + var8;
              var17 = param4[var16].field_B[var10 % param4[0].field_y + var9 % param4[0].field_v * param4[0].field_y];
              var10++;
              if (var17 != 0) {
                if ((var17 & 65280) == var17) {
                  var17 = fe.a(var11Lifetime1, var17 >> 8, 0, 0);
                }
                var6[3].field_B[var15 + (var14 - param3 + param4[0].field_v) * param2] = var17;
              }
            }
          }
          var9++;
        }
        return var6;
    }

    final static void a(wk param0) {
        int var1 = 0;
        if (param0 == null) {
          return;
        }
        if (param0.field_B == null) {
          return;
        }
        for (var1 = 0; var1 < param0.field_B.length; var1++) {
          if (param0.field_B[var1] == 1) {
            param0.field_B[var1] = 0;
          }
        }
    }

    private final static void a(String param0, int param1, int param2) {
        fe.a(param0, param1, param2, false);
    }

    final static void a(wk param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        Throwable decompiledCaughtException = null;
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
        int var19_int = 0;
        Exception var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        if (field_e == null ||
          field_e.length != qn.field_l) {
          field_e = new int[qn.field_l];
        }
        var7 = param2 & 15;
        var8 = param1 & 15;
        param2 = param2 >> 4;
        param1 = param1 >> 4;
        var15 = param3 + param4 * qn.field_l;
        var16 = qn.field_l - param5;
        var17 = param2 * param0.field_y + param1;
        var18 = param0.field_y - param5;
        try {
          var19_int = -qn.field_g;
          while (var19_int < 0) {
            var20 = param6[-1 - var19_int];
            var21 = param5 - 1;
            while (var21 >= 0) {
              var9 = param0.field_B[var17];
              var10 = var9 & 16711935;
              var11 = var9 & 65280;
              var13 = var10 * var8 & 267390960;
              var14 = var11 * var8 & 1044480;
              var12 = var13 | var14;
              var11Lifetime1 = var12 + var20;
              var20 = (var9 << 4) - var12;
              var10Lifetime1 = var11Lifetime1 & 267390960;
              var9Lifetime1 = var11Lifetime1 & 1044480;
              var13Lifetime1 = var10Lifetime1 * var7 & -16711936;
              var14Lifetime1 = var9Lifetime1 * var7 & 16711680;
              var12Lifetime1 = var13Lifetime1 | var14Lifetime1;
              qn.field_d[var15] = var12Lifetime1 + field_e[var21] >> 8;
              field_e[var21] = (var11Lifetime1 << 4) - var12Lifetime1;
              var21--;
              var15++;
              var17++;
            }
            var15 = var15 + var16;
            param6[-1 - var19_int] = var20;
            var19_int++;
            var17 = var17 + var18;
          }
          return;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = (Exception) (Object) decompiledCaughtException;
          return;
        }
    }

    final static void c(int param0, int param1, int param2, int param3) {
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
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        var4 = 1;
        var5 = param2 * param2;
        var6 = (param2 - var4) * (param2 - var4);
        var7 = var5 - var6;
        var8 = param0 - param2 - 1;
        var9 = param0 + param2 + 1;
        if (var8 < qn.field_j) {
          var8 = qn.field_j;
        }
        if (var8 > qn.field_e) {
          return;
        }
        if (var9 < qn.field_j) {
          return;
        }
        if (var9 > qn.field_e) {
          var9 = qn.field_e;
        }
        var10 = param1 - param2 - 1;
        var11 = param1 + param2 + 1;
        if (var10 < qn.field_a) {
          var10 = qn.field_a;
        }
        if (var10 > qn.field_f) {
          return;
        }
        if (var11 < qn.field_a) {
          return;
        }
        if (var11 > qn.field_f) {
          var11 = qn.field_f;
        }
        if (field_m > 0) {
          var12 = field_f - field_m;
          var13 = field_f + field_m;
          var14 = field_n - field_m;
          var15 = field_n + field_m;
          if (var8 < var12) {
            var8 = var12;
          }
          if (var8 > var13) {
            return;
          }
          if (var9 < var12) {
            return;
          }
          if (var9 > var13) {
            var9 = var13;
          }
          if (var10 < var14) {
            var10 = var14;
          }
          if (var10 > var15) {
            return;
          }
          if (var11 < var14) {
            return;
          }
          if (var11 > var15) {
            var11 = var15;
          }
        }
        var12Lifetime1 = var8 + var10 * qn.field_l;
        var13Lifetime1 = qn.field_l + var8 - var9;
        for (var14Lifetime1 = var10; var14Lifetime1 < var11; var14Lifetime1++) {
          var15Lifetime1 = var8;
          while (var15Lifetime1 < var9) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (!fe.c(var15Lifetime1, var14Lifetime1)) {
              var16 = param0 - var15Lifetime1;
              var17 = param1 - var14Lifetime1;
              var18 = var16 * var16 + var17 * var17;
              if (var18 < var5) {
                if (var18 >= var6) {
                  var18 = 256 - (var18 - var6 << 8) / var7;
                  qn.field_d[var12Lifetime1] = fe.a(qn.field_d[var12Lifetime1], param3, var18);
                } else {
                  qn.field_d[var12Lifetime1] = param3;
                  if (var16 > 0) {
                    var19 = 0;
                    while (true) {
                      if (var19 >= var16 * 2) {
                        var15Lifetime1--;
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                      if (var15Lifetime1 >= var9) {
                        var15Lifetime1--;
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      qn.field_d[var12Lifetime1] = param3;
                      var12Lifetime1++;
                      var15Lifetime1++;
                      if (!fe.c(var15Lifetime1, var14Lifetime1)) {
                        var19++;
                        continue;
                      }
                      break;
                    }
                    if ((decompiledFrameCompleted1) &&
                      (decompiledFrameCompleted0)) {
                      var15Lifetime1--;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                }
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              var12Lifetime1++;
            }
            var15Lifetime1++;
          }
          var12Lifetime1 = var12Lifetime1 + var13Lifetime1;
        }
        return;
    }

    final static void c(String param0, int param1, int param2, int param3, boolean param4) {
        param1 = param1 - (field_i.a(param0) >> (param4 ? 2 : 1));
        fe.a(param0, param1, param2, param3, param4);
    }

    private final static int a(int param0, int param1, int param2) {
        if (param2 < 1) {
          return param0;
        }
        if (param2 > 255) {
          return param1;
        }
        int var3 = param0 & 16711935;
        int var4 = param0 & 65280;
        int var5 = param1 & 16711935;
        int var6 = param1 & 65280;
        int var7 = 256 - param2;
        return var3 * var7 + var5 * param2 >> 8 & 16711935 | var4 * var7 + var6 * param2 >> 8 & 65280;
    }

    public static void b() {
        field_o = (int[][]) null;
        field_l = null;
        field_i = null;
        field_g = null;
        field_d = null;
        field_k = null;
        field_e = null;
    }

    final static void c(wk param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var5;
        param2 -= 3;
        param1 = param1 + param0.field_w;
        param2 = param2 + param0.field_z;
        var5 = 0;
        for (var6 = 0; var6 < param0.field_v; var6++) {
          for (var7 = 0; var7 < param3; var7++) {
            if (param0.field_B[var5] > 0) {
              fe.b(param1 + var7, param2 + var6, param4, param0.field_B[var5] & 255);
            }
            var5++;
          }
          var5 = var5 + (param0.field_y - param3);
        }
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$5 = 0;
        int var12;
        int var13;
        int var14;
        for (var10 = -param7; var10 < 0; var10++) {
          for (var11 = -param6; var11 < 0; var11++) {
            param3 = param2[param4++];
            if (param3 != 0) {
              param0 = param1[param5];
              if (param0 != 0) {
                var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
                var14 = (param3 & 255) * (param0 & 255) >>> 8;
                incrementValue$5 = param5;
                param5++;
                param1[incrementValue$5] = (var12 << 16) + (var13 << 8) + var14;
              } else {
                param5++;
              }
            } else {
              param5++;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    final static void b(String param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        field_d[0] = param3 << (param4 ? 1 : 0);
        int var5 = field_i.a(param0, field_d, field_k);
        int var6 = field_i.field_v >> (param4 ? 1 : 0);
        for (var7 = 0; var7 < var5; var7++) {
          fe.b(field_k[var7], param1, param2 + var6 * var7, param4);
        }
    }

    final static int b(int param0, int param1) {
        int var2 = (param0 & 16711935) * param1 >>> 8;
        int var3 = (param0 & 65280) * param1 >>> 8;
        return var2 & 16711935 | var3 & 65280;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 15;
        int var6 = 64;
        fe.a(param0, param1, param2, param3, param4, var5, var6);
    }

    private final static void a() {
        field_h = qn.field_j;
        field_a = qn.field_a;
        field_j = qn.field_e;
        field_c = qn.field_f;
    }

    private final static void b(int param0, int param1, int param2, int param3) {
        if (param0 < qn.field_j) {
          return;
        }
        if (param0 >= qn.field_e) {
          return;
        }
        if (param1 < qn.field_a) {
          return;
        }
        if (param1 >= qn.field_f) {
          return;
        }
        int var4 = param2 & 65280;
        param2 = param2 & 16711935;
        var4 = var4 * param3;
        param2 = param2 * param3;
        var4 = var4 & 16711680;
        param2 = param2 & -16711936;
        int var5 = qn.field_l * param1 + param0;
        int var6 = qn.field_d[var5];
        var4 = var4 + ((var6 & 65280) * (256 - param3) & 16711680);
        param2 = param2 + ((var6 & 16711935) * (256 - param3) & -16711936);
        qn.field_d[var5] = (param2 | var4) >>> 8;
    }

    final static void a(wk param0, int param1, int param2) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param1 = param1 + param0.field_w;
        param2 = param2 + param0.field_z;
        int var3 = param1 + param2 * qn.field_l;
        int var4 = 0;
        int var5 = param0.field_v;
        int var6 = param0.field_y;
        int var7 = qn.field_l - var6;
        int var8 = 0;
        if (param2 < qn.field_a) {
          var9 = qn.field_a - param2;
          var5 = var5 - var9;
          param2 = qn.field_a;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * qn.field_l;
        }
        if (param2 + var5 > qn.field_f) {
          var5 = var5 - (param2 + var5 - qn.field_f);
        }
        if (param1 < qn.field_j) {
          var9Lifetime1 = qn.field_j - param1;
          var6 = var6 - var9Lifetime1;
          param1 = qn.field_j;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param1 + var6 > qn.field_e) {
          var9Lifetime2 = param1 + var6 - qn.field_e;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          fe.a(0, qn.field_d, param0.field_B, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void a(wk param0, int param1, int param2, int param3, int[] param4) {
        int var7 = 0;
        int var9 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int var5;
        int var6;
        int var8;
        int var10;
        param2 -= 3;
        if (param3 > param0.field_y) {
          param3 = param0.field_y;
        }
        var5 = 0;
        var6 = param0.field_y;
        for (var7 = 0; var7 < param0.field_v >> 1; var7++) {
          var8 = param4[var7 * param4.length / (param0.field_v >> 1)];
          for (var9 = 0; var9 < param3 >> 1; var9++) {
            incrementValue$20 = var5;
            var5++;
            var10 = param0.field_B[incrementValue$20] & 255;
            incrementValue$21 = var5;
            var5++;
            var10 = var10 + (param0.field_B[incrementValue$21] & 255);
            incrementValue$22 = var6;
            var6++;
            var10 = var10 + (param0.field_B[incrementValue$22] & 255);
            incrementValue$23 = var6;
            var6++;
            var10 = var10 + (param0.field_B[incrementValue$23] & 255);
            var10 = var10 >> 2;
            if (var10 > 0) {
              fe.b(param1 + var9, param2 + var7, var8, var10);
            }
          }
          var5 = var5 + (param0.field_y - param3);
          var5 = var5 + param0.field_y;
          var6 = var6 + (param0.field_y - param3);
          var6 = var6 + param0.field_y;
        }
    }

    private final static void c() {
        qn.field_j = field_h;
        qn.field_a = field_a;
        qn.field_e = field_j;
        qn.field_f = field_c;
    }

    private final static void b(wk param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int var5;
        int var6;
        int var9;
        param2 -= 3;
        if (param3 > param0.field_y) {
          param3 = param0.field_y;
        }
        var5 = 0;
        var6 = param0.field_y;
        for (var7 = 0; var7 < param0.field_v >> 1; var7++) {
          for (var8 = 0; var8 < param3 >> 1; var8++) {
            incrementValue$20 = var5;
            var5++;
            var9 = param0.field_B[incrementValue$20] & 255;
            incrementValue$21 = var5;
            var5++;
            var9 = var9 + (param0.field_B[incrementValue$21] & 255);
            incrementValue$22 = var6;
            var6++;
            var9 = var9 + (param0.field_B[incrementValue$22] & 255);
            incrementValue$23 = var6;
            var6++;
            var9 = var9 + (param0.field_B[incrementValue$23] & 255);
            var9 = var9 >> 2;
            if (var9 > 0) {
              fe.b(param1 + var8, param2 + var7, param4, var9);
            }
          }
          var5 = var5 + (param0.field_y - param3);
          var5 = var5 + param0.field_y;
          var6 = var6 + (param0.field_y - param3);
          var6 = var6 + param0.field_y;
        }
    }

    final static void a(String param0, int param1, int param2, int[] param3, int param4, boolean param5) {
        if (param4 != 0) {
          if (param4 != 1) {
            if (param4 != 2) {
              return;
            }
            fe.b(param0, param1, param2, param3, param5);
          } else {
            fe.b(param0, param1, param2, param5);
            fe.c(param0, param1, param2, param3, param5);
          }
        } else {
          fe.a(param0, param1, param2, param5);
          fe.a(param0, param1, param2, param3, param5);
        }
    }

    final static void a(String param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var8 = 0;
        field_d[0] = param3 << (param5 ? 1 : 0);
        int var6 = field_i.a(param0, field_d, field_k);
        int var7 = field_i.field_v >> (param5 ? 1 : 0);
        for (var8 = 0; var8 < var6; var8++) {
          fe.c(field_k[var8], param1, param2 + var7 * var8, param4, param5);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wk[] param4, int[] param5, int param6, int param7, boolean param8) {
        int var16 = 0;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var10Lifetime1;
        if (param7 > 0) {
          qn.b(param0, param1, param2, param3, param6, param7);
        }
        if (param0 >= qn.field_j &&
          param1 >= qn.field_a &&
          param0 + param2 < qn.field_e &&
          param1 + param3 < qn.field_f) {
          fe.a(param0, param1, param2, param3, param4, param5, param8);
          return;
        }
        var9 = 0;
        var10 = 0;
        var11 = (param5.length << 16) / param3;
        var12 = 0;
        var13 = param4[0].field_y;
        var14 = param4[0].field_v;
        for (var16 = 0; var16 < param3; var16++) {
          if (var16 >= var14) {
            if (param3 - var16 > var14) {
              var15 = 3;
            } else {
              var15 = 6;
              if (param3 - var16 == var14) {
                var9 = 0;
              }
            }
          } else {
            var15 = 0;
          }
          var10Lifetime1 = param5[var12 >> 16];
          var12 = var12 + var11;
          var19 = param0;
          var20 = 0;
          while (var20 < 3) {
            var21 = var9 % var14 * var13;
            if (var20 != 1) {
              var17 = -var13;
              while (var17 < 0) {
                var22 = param4[var15].field_B[var21];
                if (var22 != 0) {
                  if ((var22 & -65281) == 0) {
                    var22 = fe.a(var10Lifetime1, var22 >> 8, 0, 0);
                  }
                  qn.a(var19, param1 + var16, var22);
                }
                var17++;
                var21++;
                var19++;
              }
            } else {
              var18 = param2 - (var13 << 1);
              if (var15 == 4 &&
                !param8) {
                var19 = var19 + var18;
              } else {
                var22 = param4[var15].field_B[var21];
                if (var22 != 0) {
                  var17 = -var18;
                  while (var17 < 0) {
                    if ((var22 & -65281) == 0) {
                      var22 = fe.a(var10Lifetime1, var22 >> 8, 0, 0);
                    }
                    qn.a(var19, param1 + var16, var22);
                    var17++;
                    var19++;
                  }
                } else {
                  var19 = var19 + var18;
                }
              }
            }
            var20++;
            var15++;
          }
          var9++;
        }
    }

    final static void b(String param0, int param1, int param2, boolean param3) {
        param1 = param1 - (field_i.a(param0) >> (param3 ? 2 : 1));
        fe.a(param0, param1, param2, param3);
    }

    final static void a(d param0) {
        field_i = param0;
        int var1 = 1000;
        int var2 = field_i.field_v + field_i.field_L + 6;
        if ((var2 & 1) == 1) {
          var2++;
        }
        field_g = new wk(var1, var2);
    }

    final static void a(int param0, int param1, int param2, int param3, wk[] param4, int[] param5, int param6, int param7, String param8, boolean param9, int[] param10) {
        fe.b(param0, param1, param2, param3, param4, param5, param6, param7);
        int var11 = param0 + param2 / 2;
        int var12 = param1 + field_i.field_v / (param9 ? 2 : 1) - 4;
        fe.a(param8, var11, var12, param10, 1, param9);
    }

    final static void a(String param0, int param1, int param2, int param3, int[] param4, boolean param5) {
        fe.a(param0, param1, param2, param3, param4, param5, 0, 0);
    }

    final static void b(String param0, int param1, int param2) {
        param1 = param1 - (field_i.a(param0) >> 1);
        fe.a(param0, param1, param2);
    }

    private final static int a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        param2 = param0 & 16711935;
        param3 = param0 & 65280;
        if (param1 < 128) {
          param0 = (param2 * param1 & 2139127680 | param3 * param1 & 8355840) >>> 7;
        } else {
          param1 -= 128;
          var4 = 256 - param1;
          param2 = param2 * var4;
          param3 = param3 * var4;
          param2 = param2 + 16711935 * param1;
          param3 = param3 + 65280 * param1;
          param0 = (param2 & -16711936 | param3 & 16711680) >>> 8;
        }
        return param0;
    }

    final static void b(int param0, int param1, int param2, int param3, wk[] param4, int[] param5, int param6, int param7) {
        fe.a(param0, param1, param2, param3, param4, param5, param6, param7, false);
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$1 = 0;
        int var13;
        int var14;
        int var15;
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = -param6; var12 < 0; var12++) {
            param3 = param2[param4++];
            if (param3 != 0) {
              param0 = param1[param5];
              if (param0 != 0) {
                var13 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                var14 = (param3 & 65280) * (param0 & 65280) >>> 24;
                var15 = (param3 & 255) * (param0 & 255) >>> 8;
                var13 = var13 * param10 + ((param0 & 16711680) >>> 16) * (256 - param10) >> 8;
                var14 = var14 * param10 + ((param0 & 65280) >>> 8) * (256 - param10) >> 8;
                var15 = var15 * param10 + (param0 & 255) * (256 - param10) >> 8;
                incrementValue$1 = param5;
                param5++;
                param1[incrementValue$1] = (var13 << 16) + (var14 << 8) + var15;
              } else {
                param5++;
              }
            } else {
              param5++;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    private final static void b(wk param0, int param1, int param2, int param3, int[] param4) {
        int var6 = 0;
        int var8 = 0;
        int var5;
        int var7;
        param2 -= 3;
        var5 = 0;
        if (param3 > param0.field_y) {
          param3 = param0.field_y;
        }
        for (var6 = 0; var6 < param0.field_v; var6++) {
          var7 = param4[var6 * param4.length / param0.field_v];
          for (var8 = 0; var8 < param3; var8++) {
            if (param0.field_B[var5] > 0) {
              fe.b(param1 + var8, param2 + var6, var7, param0.field_B[var5] & 255);
            }
            var5++;
          }
          var5 = var5 + (param0.field_y - param3);
        }
    }

    static {
        field_b = 0;
        field_k = new String[20];
        field_m = -1;
        field_d = new int[]{0};
    }
}
