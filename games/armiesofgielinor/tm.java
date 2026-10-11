/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    static int field_c;
    private static boolean field_g;
    static int field_l;
    static lh field_o;
    private static int[] field_i;
    static int field_j;
    static boolean field_a;
    private static boolean field_d;
    private static float field_b;
    static int[] field_n;
    static int field_q;
    static int[] field_k;
    private static boolean field_p;
    static int[] field_e;
    static int field_f;
    static int[] field_h;
    static int[] field_m;

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int incrementValue$14 = 0;
        int incrementValue$13 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (field_a) {
          if (param5 > field_l) {
            param5 = field_l;
          }
          if (param4 < 0) {
            param4 = 0;
          }
        }
        if (param4 >= param5) {
          return;
        }
        param1 = param1 + param4;
        param6 = param6 + param7 * param4;
        if (!field_g) {
          param3 = param5 - param4;
          if (field_f == 0) {
            do {
              incrementValue$14 = param1;
              param1++;
              param0[incrementValue$14] = field_h[param6 >> 8];
              param6 = param6 + param7;
              param3--;
            } while (param3 > 0);
            return;
          }
          var8 = field_f;
          var9 = 256 - field_f;
          do {
            param2 = field_h[param6 >> 8];
            param6 = param6 + param7;
            param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
            var10 = param0[param1];
            incrementValue$13 = param1;
            param1++;
            param0[incrementValue$13] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
            param3--;
          } while (param3 > 0);
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        param3 = param5 - param4 >> 2;
        param7 = param7 << 2;
        if (field_f == 0) {
          if (param3 > 0) {
            do {
              param2 = field_h[param6 >> 8];
              param6 = param6 + param7;
              param0[param1++] = param2;
              param0[param1++] = param2;
              param0[param1++] = param2;
              param0[param1++] = param2;
              param3--;
            } while (param3 > 0);
          }
          param3 = param5 - param4 & 3;
          if (param3 <= 0) {
            return;
          }
          param2 = field_h[param6 >> 8];
          do {
            param0[param1++] = param2;
            param3--;
          } while (param3 > 0);
          decompiledFrameRemainder0 = false;
        }
        else {
          var8 = field_f;
          var9 = 256 - field_f;
          if (param3 > 0) {
            do {
              param2 = field_h[param6 >> 8];
              param6 = param6 + param7;
              param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
              var10 = param0[param1];
              incrementValue$15 = param1;
              param1++;
              param0[incrementValue$15] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
              var10 = param0[param1];
              incrementValue$16 = param1;
              param1++;
              param0[incrementValue$16] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
              var10 = param0[param1];
              incrementValue$17 = param1;
              param1++;
              param0[incrementValue$17] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
              var10 = param0[param1];
              incrementValue$18 = param1;
              param1++;
              param0[incrementValue$18] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
              param3--;
            } while (param3 > 0);
          }
          param3 = param5 - param4 & 3;
          if (param3 > 0) {
            param2 = field_h[param6 >> 8];
            param2 = ((param2 & 16711935) * var9 >> 8 & 16711935) + ((param2 & 65280) * var9 >> 8 & 65280);
            do {
              var10 = param0[param1];
              incrementValue$19 = param1;
              param1++;
              param0[incrementValue$19] = param2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 65280) * var8 >> 8 & 65280);
              param3--;
            } while (param3 > 0);
          }
        }

    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int var6;
        int var7;
        int var8;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        if (field_a) {
          if (param5 > field_l) {
            param5 = field_l;
          }
          if (param4 < 0) {
            param4 = 0;
          }
        }
        if (param4 >= param5) {
          return;
        }
        param1 = param1 + param4;
        param3 = param5 - param4 >> 2;
        if (field_f == 0) {
          while (true) {
            param3--;
            if (param3 < 0) {
              param3 = param5 - param4 & 3;
              while (true) {
                param3--;
                if (param3 < 0) {
                  return;
                }
                param0[param1++] = param2;
              }
            }
            param0[param1++] = param2;
            param0[param1++] = param2;
            param0[param1++] = param2;
            param0[param1++] = param2;
          }
        }
        regionExit1: {
          if (field_f == 254) {
            while (true) {
              param3--;
              if (param3 < 0) {
                param3 = param5 - param4 & 3;
                while (true) {
                  param3--;
                  if (param3 < 0) {
                    break regionExit1;
                  }
                  incrementValue$12 = param1;
                  param1++;
                  param0[incrementValue$12] = param0[param1];
                }
              }
              incrementValue$13 = param1;
              param1++;
              param0[incrementValue$13] = param0[param1];
              incrementValue$14 = param1;
              param1++;
              param0[incrementValue$14] = param0[param1];
              incrementValue$15 = param1;
              param1++;
              param0[incrementValue$15] = param0[param1];
              incrementValue$16 = param1;
              param1++;
              param0[incrementValue$16] = param0[param1];
            }
          }
          var6 = field_f;
          var7 = 256 - field_f;
          param2 = ((param2 & 16711935) * var7 >> 8 & 16711935) + ((param2 & 65280) * var7 >> 8 & 65280);
          while (true) {
            param3--;
            if (param3 < 0) {
              param3 = param5 - param4 & 3;
              while (true) {
                param3--;
                if (param3 < 0) {
                  break regionExit1;
                }
                var8 = param0[param1];
                incrementValue$7 = param1;
                param1++;
                param0[incrementValue$7] = param2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
              }
            }
            var8Lifetime1 = param0[param1];
            incrementValue$8 = param1;
            param1++;
            param0[incrementValue$8] = param2 + ((var8Lifetime1 & 16711935) * var6 >> 8 & 16711935) + ((var8Lifetime1 & 65280) * var6 >> 8 & 65280);
            var8Lifetime2 = param0[param1];
            incrementValue$9 = param1;
            param1++;
            param0[incrementValue$9] = param2 + ((var8Lifetime2 & 16711935) * var6 >> 8 & 16711935) + ((var8Lifetime2 & 65280) * var6 >> 8 & 65280);
            var8Lifetime3 = param0[param1];
            incrementValue$10 = param1;
            param1++;
            param0[incrementValue$10] = param2 + ((var8Lifetime3 & 16711935) * var6 >> 8 & 16711935) + ((var8Lifetime3 & 65280) * var6 >> 8 & 65280);
            var8Lifetime4 = param0[param1];
            incrementValue$11 = param1;
            param1++;
            param0[incrementValue$11] = param2 + ((var8Lifetime4 & 16711935) * var6 >> 8 & 16711935) + ((var8Lifetime4 & 65280) * var6 >> 8 & 65280);
          }
        }
    }

    final static void a() {
        tm.a(SoftwareRaster.field_j, SoftwareRaster.field_a, SoftwareRaster.field_e, SoftwareRaster.field_f);
    }

    final static void c() {
        field_c = field_l / 2;
        field_j = field_q / 2;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_l = param2 - param0;
        field_q = param3 - param1;
        tm.c();
        if (field_k.length < field_q) {
          field_k = new int[rs.a((byte) 84, field_q)];
        }
        int var4 = param1 * SoftwareRaster.field_l + param0;
        for (var5 = 0; var5 < field_q; var5++) {
          field_k[var5] = var4;
          var4 = var4 + SoftwareRaster.field_l;
        }
    }

    private final static void a(float param0) {
        field_b = param0;
        field_b = (float)((double)field_b + (Math.random() * 0.03 - 0.015));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int localTemp$2 = 0;
        int localTemp$3 = 0;
        int localTemp$4 = 0;
        int localTemp$5 = 0;
        int var7;
        int var8;
        int var9;
        var7 = 0;
        if (param1 != param0) {
          var7 = (param4 - param3 << 16) / (param1 - param0);
        }
        var8 = 0;
        if (param2 != param1) {
          var8 = (param5 - param4 << 16) / (param2 - param1);
        }
        var9 = 0;
        if (param2 != param0) {
          var9 = (param3 - param5 << 16) / (param0 - param2);
        }
        if (param0 <= param1 &&
          param0 <= param2) {
          if (param0 >= field_q) {
            return;
          }
          if (param1 > field_q) {
            param1 = field_q;
          }
          if (param2 > field_q) {
            param2 = field_q;
          }
          if (param1 >= param2) {
            localTemp$0 = param3 << 16;
            param3 = localTemp$0;
            param4 = localTemp$0;
            if (param0 < 0) {
              param4 = param4 - var9 * param0;
              param3 = param3 - var7 * param0;
              param0 = 0;
            }
            param5 = param5 << 16;
            if (param2 < 0) {
              param5 = param5 - var8 * param2;
              param2 = 0;
            }
            if ((param0 == param2 ||
              var9 >= var7) &&
              (param0 != param2 ||
              var8 <= var7)) {
              param1 = param1 - param2;
              param2 = param2 - param0;
              param0 = field_k[param0];
              while (true) {
                param2--;
                if (param2 >= 0) {
                  tm.a(SoftwareRaster.field_d, param0, param6, 0, param3 >> 16, param4 >> 16);
                  param4 = param4 + var9;
                  param3 = param3 + var7;
                  param0 = param0 + SoftwareRaster.field_l;
                  continue;
                }
                break;
              }
              param1--;
              while (param1 >= 0) {
                tm.a(SoftwareRaster.field_d, param0, param6, 0, param3 >> 16, param5 >> 16);
                param5 = param5 + var8;
                param3 = param3 + var7;
                param0 = param0 + SoftwareRaster.field_l;
                param1--;
              }
              return;
            }
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = field_k[param0];
            while (true) {
              param2--;
              if (param2 >= 0) {
                tm.a(SoftwareRaster.field_d, param0, param6, 0, param4 >> 16, param3 >> 16);
                param4 = param4 + var9;
                param3 = param3 + var7;
                param0 = param0 + SoftwareRaster.field_l;
                continue;
              }
              break;
            }
            param1--;
            while (param1 >= 0) {
              tm.a(SoftwareRaster.field_d, param0, param6, 0, param5 >> 16, param3 >> 16);
              param5 = param5 + var8;
              param3 = param3 + var7;
              param0 = param0 + SoftwareRaster.field_l;
              param1--;
            }
            return;
          }
          localTemp$1 = param3 << 16;
          param3 = localTemp$1;
          param5 = localTemp$1;
          if (param0 < 0) {
            param5 = param5 - var9 * param0;
            param3 = param3 - var7 * param0;
            param0 = 0;
          }
          param4 = param4 << 16;
          if (param1 < 0) {
            param4 = param4 - var8 * param1;
            param1 = 0;
          }
          if ((param0 == param1 ||
            var9 >= var7) &&
            (param0 != param1 ||
            var9 <= var8)) {
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = field_k[param0];
            while (true) {
              param1--;
              if (param1 >= 0) {
                tm.a(SoftwareRaster.field_d, param0, param6, 0, param3 >> 16, param5 >> 16);
                param5 = param5 + var9;
                param3 = param3 + var7;
                param0 = param0 + SoftwareRaster.field_l;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              tm.a(SoftwareRaster.field_d, param0, param6, 0, param4 >> 16, param5 >> 16);
              param5 = param5 + var9;
              param4 = param4 + var8;
              param0 = param0 + SoftwareRaster.field_l;
              param2--;
            }
            return;
          }
          param2 = param2 - param1;
          param1 = param1 - param0;
          param0 = field_k[param0];
          while (true) {
            param1--;
            if (param1 >= 0) {
              tm.a(SoftwareRaster.field_d, param0, param6, 0, param5 >> 16, param3 >> 16);
              param5 = param5 + var9;
              param3 = param3 + var7;
              param0 = param0 + SoftwareRaster.field_l;
              continue;
            }
            break;
          }
          param2--;
          while (param2 >= 0) {
            tm.a(SoftwareRaster.field_d, param0, param6, 0, param5 >> 16, param4 >> 16);
            param5 = param5 + var9;
            param4 = param4 + var8;
            param0 = param0 + SoftwareRaster.field_l;
            param2--;
          }
          return;
        }
        if (param1 > param2) {
          if (param2 >= field_q) {
            return;
          }
          if (param0 > field_q) {
            param0 = field_q;
          }
          if (param1 > field_q) {
            param1 = field_q;
          }
          if (param0 >= param1) {
            localTemp$2 = param5 << 16;
            param5 = localTemp$2;
            param3 = localTemp$2;
            if (param2 < 0) {
              param3 = param3 - var8 * param2;
              param5 = param5 - var9 * param2;
              param2 = 0;
            }
            param4 = param4 << 16;
            if (param1 < 0) {
              param4 = param4 - var7 * param1;
              param1 = 0;
            }
            if (var8 >= var9) {
              param0 = param0 - param1;
              param1 = param1 - param2;
              param2 = field_k[param2];
              while (true) {
                param1--;
                if (param1 >= 0) {
                  tm.a(SoftwareRaster.field_d, param2, param6, 0, param5 >> 16, param3 >> 16);
                  param3 = param3 + var8;
                  param5 = param5 + var9;
                  param2 = param2 + SoftwareRaster.field_l;
                  continue;
                }
                break;
              }
              param0--;
              while (param0 >= 0) {
                tm.a(SoftwareRaster.field_d, param2, param6, 0, param5 >> 16, param4 >> 16);
                param4 = param4 + var7;
                param5 = param5 + var9;
                param2 = param2 + SoftwareRaster.field_l;
                param0--;
              }
              return;
            }
            param0 = param0 - param1;
            param1 = param1 - param2;
            param2 = field_k[param2];
            while (true) {
              param1--;
              if (param1 >= 0) {
                tm.a(SoftwareRaster.field_d, param2, param6, 0, param3 >> 16, param5 >> 16);
                param3 = param3 + var8;
                param5 = param5 + var9;
                param2 = param2 + SoftwareRaster.field_l;
                continue;
              }
              break;
            }
            param0--;
            while (param0 >= 0) {
              tm.a(SoftwareRaster.field_d, param2, param6, 0, param4 >> 16, param5 >> 16);
              param4 = param4 + var7;
              param5 = param5 + var9;
              param2 = param2 + SoftwareRaster.field_l;
              param0--;
            }
            return;
          }
          localTemp$3 = param5 << 16;
          param5 = localTemp$3;
          param4 = localTemp$3;
          if (param2 < 0) {
            param4 = param4 - var8 * param2;
            param5 = param5 - var9 * param2;
            param2 = 0;
          }
          param3 = param3 << 16;
          if (param0 < 0) {
            param3 = param3 - var7 * param0;
            param0 = 0;
          }
          if (var8 >= var9) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = field_k[param2];
            while (true) {
              param0--;
              if (param0 >= 0) {
                tm.a(SoftwareRaster.field_d, param2, param6, 0, param5 >> 16, param4 >> 16);
                param4 = param4 + var8;
                param5 = param5 + var9;
                param2 = param2 + SoftwareRaster.field_l;
                continue;
              }
              break;
            }
            param1--;
            while (param1 >= 0) {
              tm.a(SoftwareRaster.field_d, param2, param6, 0, param3 >> 16, param4 >> 16);
              param4 = param4 + var8;
              param3 = param3 + var7;
              param2 = param2 + SoftwareRaster.field_l;
              param1--;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = field_k[param2];
          while (true) {
            param0--;
            if (param0 >= 0) {
              tm.a(SoftwareRaster.field_d, param2, param6, 0, param4 >> 16, param5 >> 16);
              param4 = param4 + var8;
              param5 = param5 + var9;
              param2 = param2 + SoftwareRaster.field_l;
              continue;
            }
            break;
          }
          param1--;
          while (param1 >= 0) {
            tm.a(SoftwareRaster.field_d, param2, param6, 0, param4 >> 16, param3 >> 16);
            param4 = param4 + var8;
            param3 = param3 + var7;
            param2 = param2 + SoftwareRaster.field_l;
            param1--;
          }
          return;
        }
        if (param1 >= field_q) {
          return;
        }
        if (param2 > field_q) {
          param2 = field_q;
        }
        if (param0 > field_q) {
          param0 = field_q;
        }
        if (param2 >= param0) {
          localTemp$4 = param4 << 16;
          param4 = localTemp$4;
          param5 = localTemp$4;
          if (param1 < 0) {
            param5 = param5 - var7 * param1;
            param4 = param4 - var8 * param1;
            param1 = 0;
          }
          param3 = param3 << 16;
          if (param0 < 0) {
            param3 = param3 - var9 * param0;
            param0 = 0;
          }
          if (var7 >= var8) {
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = field_k[param1];
            while (true) {
              param0--;
              if (param0 >= 0) {
                tm.a(SoftwareRaster.field_d, param1, param6, 0, param4 >> 16, param5 >> 16);
                param5 = param5 + var7;
                param4 = param4 + var8;
                param1 = param1 + SoftwareRaster.field_l;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              tm.a(SoftwareRaster.field_d, param1, param6, 0, param4 >> 16, param3 >> 16);
              param3 = param3 + var9;
              param4 = param4 + var8;
              param1 = param1 + SoftwareRaster.field_l;
              param2--;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = field_k[param1];
          while (true) {
            param0--;
            if (param0 >= 0) {
              tm.a(SoftwareRaster.field_d, param1, param6, 0, param5 >> 16, param4 >> 16);
              param5 = param5 + var7;
              param4 = param4 + var8;
              param1 = param1 + SoftwareRaster.field_l;
              continue;
            }
            break;
          }
          param2--;
          while (param2 >= 0) {
            tm.a(SoftwareRaster.field_d, param1, param6, 0, param3 >> 16, param4 >> 16);
            param3 = param3 + var9;
            param4 = param4 + var8;
            param1 = param1 + SoftwareRaster.field_l;
            param2--;
          }
          return;
        }
        localTemp$5 = param4 << 16;
        param4 = localTemp$5;
        param3 = localTemp$5;
        if (param1 < 0) {
          param3 = param3 - var7 * param1;
          param4 = param4 - var8 * param1;
          param1 = 0;
        }
        param5 = param5 << 16;
        if (param2 < 0) {
          param5 = param5 - var9 * param2;
          param2 = 0;
        }
        if ((param1 == param2 ||
          var7 >= var8) &&
          (param1 != param2 ||
          var7 <= var9)) {
          param0 = param0 - param2;
          param2 = param2 - param1;
          param1 = field_k[param1];
          while (true) {
            param2--;
            if (param2 >= 0) {
              tm.a(SoftwareRaster.field_d, param1, param6, 0, param4 >> 16, param3 >> 16);
              param3 = param3 + var7;
              param4 = param4 + var8;
              param1 = param1 + SoftwareRaster.field_l;
              continue;
            }
            break;
          }
          param0--;
          while (param0 >= 0) {
            tm.a(SoftwareRaster.field_d, param1, param6, 0, param5 >> 16, param3 >> 16);
            param3 = param3 + var7;
            param5 = param5 + var9;
            param1 = param1 + SoftwareRaster.field_l;
            param0--;
          }
          return;
        }
        param0 = param0 - param2;
        param2 = param2 - param1;
        param1 = field_k[param1];
        while (true) {
          param2--;
          if (param2 >= 0) {
            tm.a(SoftwareRaster.field_d, param1, param6, 0, param3 >> 16, param4 >> 16);
            param3 = param3 + var7;
            param4 = param4 + var8;
            param1 = param1 + SoftwareRaster.field_l;
            continue;
          }
          break;
        }
        param0--;
        while (param0 >= 0) {
          tm.a(SoftwareRaster.field_d, param1, param6, 0, param3 >> 16, param5 >> 16);
          param3 = param3 + var7;
          param5 = param5 + var9;
          param1 = param1 + SoftwareRaster.field_l;
          param0--;
        }
        return;
    }

    private final static void a(int param0, int param1) {
        int var3 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int var2;
        double var4;
        double var6;
        double var9;
        double var11;
        double var13;
        double var15;
        double var17_double;
        int var17;
        int var18;
        double var19_double;
        int var19;
        int var20;
        double var21;
        double var23;
        double var25;
        var2 = param0 * 128;
        for (var3 = param0; var3 < param1; var3++) {
          var4 = (double)(var3 >> 3) / 64.0 + 0.0078125;
          var6 = (double)(var3 & 7) / 8.0 + 0.0625;
          for (var8 = 0; var8 < 128; var8++) {
            var9 = (double)var8 / 128.0;
            var11 = var9;
            var13 = var9;
            var15 = var9;
            if (var6 != 0.0) {
              if (!(var9 < 0.5)) {
                var17_double = var9 + var6 - var9 * var6;
              } else {
                var17_double = var9 * (1.0 + var6);
              }
              var19_double = 2.0 * var9 - var17_double;
              var21 = var4 + 0.3333333333333333;
              if (var21 > 1.0) {
                var21 = var21 - 1.0;
              }
              var23 = var4;
              var25 = var4 - 0.3333333333333333;
              if (var25 < 0.0) {
                var25 = var25 + 1.0;
              }
              if (!(6.0 * var21 < 1.0)) {
                if (!(2.0 * var21 < 1.0)) {
                  if (!(3.0 * var21 < 2.0)) {
                    var11 = var19_double;
                  } else {
                    var11 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var21) * 6.0;
                  }
                } else {
                  var11 = var17_double;
                }
              } else {
                var11 = var19_double + (var17_double - var19_double) * 6.0 * var21;
              }
              if (!(6.0 * var23 < 1.0)) {
                if (!(2.0 * var23 < 1.0)) {
                  if (!(3.0 * var23 < 2.0)) {
                    var13 = var19_double;
                  } else {
                    var13 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var23) * 6.0;
                  }
                } else {
                  var13 = var17_double;
                }
              } else {
                var13 = var19_double + (var17_double - var19_double) * 6.0 * var23;
              }
              if (!(6.0 * var25 < 1.0)) {
                if (!(2.0 * var25 < 1.0)) {
                  if (!(3.0 * var25 < 2.0)) {
                    var15 = var19_double;
                  } else {
                    var15 = var19_double + (var17_double - var19_double) * (0.6666666666666666 - var25) * 6.0;
                  }
                } else {
                  var15 = var17_double;
                }
              } else {
                var15 = var19_double + (var17_double - var19_double) * 6.0 * var25;
              }
            }
            var11 = Math.pow(var11, (double)field_b);
            var13 = Math.pow(var13, (double)field_b);
            var15 = Math.pow(var15, (double)field_b);
            var17 = (int)(var11 * 256.0);
            var18 = (int)(var13 * 256.0);
            var19 = (int)(var15 * 256.0);
            var20 = (var17 << 16) + (var18 << 8) + var19;
            if (var20 == 0) {
              var20 = 1;
            }
            incrementValue$0 = var2;
            var2++;
            field_h[incrementValue$0] = var20;
          }
        }
    }

    final static void c(int param0, int param1) {
        int var2 = field_k[0];
        int var3 = var2 / SoftwareRaster.field_l;
        int var4 = var2 - var3 * SoftwareRaster.field_l;
        field_c = param0 - var4;
        field_j = param1 - var3;
    }

    final static void b(float param0) {
        tm.a(param0);
        tm.a(0, 512);
    }

    public static void b() {
        field_k = null;
        field_h = null;
        field_o = null;
        field_i = null;
        field_m = null;
        field_n = null;
        field_e = null;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int dupTemp$18 = 0;
        int dupTemp$19 = 0;
        int dupTemp$20 = 0;
        int dupTemp$21 = 0;
        int dupTemp$22 = 0;
        int dupTemp$23 = 0;
        int dupTemp$24 = 0;
        int dupTemp$25 = 0;
        int dupTemp$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int dupTemp$36 = 0;
        int dupTemp$37 = 0;
        int dupTemp$38 = 0;
        int dupTemp$39 = 0;
        int dupTemp$40 = 0;
        int dupTemp$41 = 0;
        int dupTemp$42 = 0;
        int dupTemp$43 = 0;
        int dupTemp$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (field_a) {
          if (param6 > field_l) {
            param6 = field_l;
          }
          if (param5 < 0) {
            param5 = 0;
          }
        }
        if (param5 >= param6) {
          return;
        }
        param4 = param4 + param5;
        param7 = param7 + param8 * param5;
        var17 = param6 - param5;
        if (!field_p) {
          var23 = param5 - field_c;
          param9 = param9 + (param12 >> 3) * var23;
          param10 = param10 + (param13 >> 3) * var23;
          param11 = param11 + (param14 >> 3) * var23;
          var22 = param11 >> 14;
          if (var22 == 0) {
            var18 = 0;
            var19 = 0;
          } else {
            var18 = param9 / var22;
            var19 = param10 / var22;
          }
          param9 = param9 + param12;
          param10 = param10 + param13;
          param11 = param11 + param14;
          var22 = param11 >> 14;
          if (var22 == 0) {
            var20 = 0;
            var21 = 0;
          } else {
            var20 = param9 / var22;
            var21 = param10 / var22;
          }
          param2 = (var18 << 18) + var19;
          var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
          var17 = var17 >> 3;
          param8 = param8 << 3;
          var15 = param7 >> 8;
          if (!field_d) {
            if (var17 > 0) {
              do {
                dupTemp$18 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$18;
                if (dupTemp$18 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$19 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$19;
                if (dupTemp$19 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$20 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$20;
                if (dupTemp$20 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$21 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$21;
                if (dupTemp$21 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$22 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$22;
                if (dupTemp$22 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$23 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$23;
                if (dupTemp$23 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$24 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$24;
                if (dupTemp$24 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$25 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$25;
                if (dupTemp$25 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                var18 = var20;
                var19 = var21;
                param9 = param9 + param12;
                param10 = param10 + param13;
                param11 = param11 + param14;
                var22 = param11 >> 14;
                if (var22 == 0) {
                  var20 = 0;
                  var21 = 0;
                } else {
                  var20 = param9 / var22;
                  var21 = param10 / var22;
                }
                param2 = (var18 << 18) + var19;
                var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                param7 = param7 + param8;
                var15 = param7 >> 8;
                var17--;
              } while (var17 > 0);
            }
            var17 = param6 - param5 & 7;
            if (var17 > 0) {
              do {
                dupTemp$26 = param1[(param2 & 16256) + (param2 >>> 25)];
                param3 = dupTemp$26;
                if (dupTemp$26 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                var17--;
              } while (var17 > 0);
            }
          } else {
            if (var17 > 0) {
              do {
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$27 = param4;
                param4++;
                param0[incrementValue$27] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$28 = param4;
                param4++;
                param0[incrementValue$28] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$29 = param4;
                param4++;
                param0[incrementValue$29] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$30 = param4;
                param4++;
                param0[incrementValue$30] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$31 = param4;
                param4++;
                param0[incrementValue$31] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$32 = param4;
                param4++;
                param0[incrementValue$32] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$33 = param4;
                param4++;
                param0[incrementValue$33] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$34 = param4;
                param4++;
                param0[incrementValue$34] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                var18 = var20;
                var19 = var21;
                param9 = param9 + param12;
                param10 = param10 + param13;
                param11 = param11 + param14;
                var22 = param11 >> 14;
                if (var22 == 0) {
                  var20 = 0;
                  var21 = 0;
                } else {
                  var20 = param9 / var22;
                  var21 = param10 / var22;
                }
                param2 = (var18 << 18) + var19;
                var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
                param7 = param7 + param8;
                var15 = param7 >> 8;
                var17--;
              } while (var17 > 0);
            }
            var17 = param6 - param5 & 7;
            if (var17 > 0) {
              do {
                param3 = param1[(param2 & 16256) + (param2 >>> 25)];
                incrementValue$35 = param4;
                param4++;
                param0[incrementValue$35] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                var17--;
              } while (var17 > 0);
            }
          }
        } else {
          var23 = param5 - field_c;
          param9 = param9 + (param12 >> 3) * var23;
          param10 = param10 + (param13 >> 3) * var23;
          param11 = param11 + (param14 >> 3) * var23;
          var22 = param11 >> 12;
          if (var22 == 0) {
            var18 = 0;
            var19 = 0;
          } else {
            var18 = param9 / var22;
            var19 = param10 / var22;
          }
          param9 = param9 + param12;
          param10 = param10 + param13;
          param11 = param11 + param14;
          var22 = param11 >> 12;
          if (var22 == 0) {
            var20 = 0;
            var21 = 0;
          } else {
            var20 = param9 / var22;
            var21 = param10 / var22;
          }
          param2 = (var18 << 20) + var19;
          var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
          var17 = var17 >> 3;
          param8 = param8 << 3;
          var15 = param7 >> 8;
          if (!field_d) {
            if (var17 > 0) {
              do {
                dupTemp$36 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$36;
                if (dupTemp$36 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$37 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$37;
                if (dupTemp$37 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$38 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$38;
                if (dupTemp$38 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$39 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$39;
                if (dupTemp$39 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$40 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$40;
                if (dupTemp$40 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$41 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$41;
                if (dupTemp$41 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$42 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$42;
                if (dupTemp$42 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                dupTemp$43 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$43;
                if (dupTemp$43 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                var18 = var20;
                var19 = var21;
                param9 = param9 + param12;
                param10 = param10 + param13;
                param11 = param11 + param14;
                var22 = param11 >> 12;
                if (var22 == 0) {
                  var20 = 0;
                  var21 = 0;
                } else {
                  var20 = param9 / var22;
                  var21 = param10 / var22;
                }
                param2 = (var18 << 20) + var19;
                var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                param7 = param7 + param8;
                var15 = param7 >> 8;
                var17--;
              } while (var17 > 0);
            }
            var17 = param6 - param5 & 7;
            if (var17 > 0) {
              do {
                dupTemp$44 = param1[(param2 & 4032) + (param2 >>> 26)];
                param3 = dupTemp$44;
                if (dupTemp$44 != 0) {
                  param0[param4] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                }
                param4++;
                param2 = param2 + var16;
                var17--;
              } while (var17 > 0);
            }
          } else {
            if (var17 > 0) {
              do {
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$45 = param4;
                param4++;
                param0[incrementValue$45] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$46 = param4;
                param4++;
                param0[incrementValue$46] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$47 = param4;
                param4++;
                param0[incrementValue$47] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$48 = param4;
                param4++;
                param0[incrementValue$48] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$49 = param4;
                param4++;
                param0[incrementValue$49] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$50 = param4;
                param4++;
                param0[incrementValue$50] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$51 = param4;
                param4++;
                param0[incrementValue$51] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$52 = param4;
                param4++;
                param0[incrementValue$52] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                var18 = var20;
                var19 = var21;
                param9 = param9 + param12;
                param10 = param10 + param13;
                param11 = param11 + param14;
                var22 = param11 >> 12;
                if (var22 == 0) {
                  var20 = 0;
                  var21 = 0;
                } else {
                  var20 = param9 / var22;
                  var21 = param10 / var22;
                }
                param2 = (var18 << 20) + var19;
                var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                param7 = param7 + param8;
                var15 = param7 >> 8;
                var17--;
              } while (var17 > 0);
            }
            var17 = param6 - param5 & 7;
            if (var17 > 0) {
              do {
                param3 = param1[(param2 & 4032) + (param2 >>> 26)];
                incrementValue$53 = param4;
                param4++;
                param0[incrementValue$53] = ((param3 & 16711935) * var15 & -16711936) + ((param3 & 65280) * var15 & 16711680) >> 8;
                param2 = param2 + var16;
                var17--;
              } while (var17 > 0);
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18) {
        int localTemp$4 = 0;
        int localTemp$5 = 0;
        int localTemp$6 = 0;
        int localTemp$7 = 0;
        int localTemp$8 = 0;
        int localTemp$9 = 0;
        int[] var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int[] var42;
        int[] var43;
        boolean stackIn_6_0 = false;
        int var20Lifetime1;
        int var41Lifetime1;
        int var41Lifetime2;
        int var41Lifetime3;
        int var41Lifetime4;
        int var41Lifetime1Lifetime1;
        var43 = field_o.a(param18, field_b, -11606);
        var42 = var43;
        var19 = var42;
        if (var19 != null &&
          field_f <= 10) {
          field_p = field_o.a(param18, 5409);
          stackIn_6_0 = (field_o.b(-26298, param18) == 0);
          field_d = stackIn_6_0;
          var20 = param4 - param3;
          var21 = param1 - param0;
          var22 = param5 - param3;
          var23 = param2 - param0;
          var24 = param7 - param6;
          var25 = param8 - param6;
          var26 = 0;
          if (param1 != param0) {
            var26 = (param4 - param3 << 16) / (param1 - param0);
          }
          var27 = 0;
          if (param2 != param1) {
            var27 = (param5 - param4 << 16) / (param2 - param1);
          }
          var28 = 0;
          if (param2 != param0) {
            var28 = (param3 - param5 << 16) / (param0 - param2);
          }
          var29 = var20 * var23 - var22 * var21;
          if (var29 == 0) {
            return;
          }
          var30 = (var24 * var23 - var25 * var21 << 9) / var29;
          var31 = (var25 * var20 - var24 * var22 << 9) / var29;
          param10 = param9 - param10;
          param13 = param12 - param13;
          param16 = param15 - param16;
          param11 = param11 - param9;
          param14 = param14 - param12;
          param17 = param17 - param15;
          var32 = param11 * param12 - param14 * param9 << 14;
          var33 = param14 * param15 - param17 * param12 << 8;
          var34 = param17 * param9 - param11 * param15 << 5;
          var35 = param10 * param12 - param13 * param9 << 14;
          var36 = param13 * param15 - param16 * param12 << 8;
          var37 = param16 * param9 - param10 * param15 << 5;
          var38 = param13 * param11 - param10 * param14 << 14;
          var39 = param16 * param14 - param13 * param17 << 8;
          var40 = param10 * param17 - param16 * param11 << 5;
          if (param0 <= param1 &&
            param0 <= param2) {
            if (param0 >= field_q) {
              return;
            }
            if (param1 > field_q) {
              param1 = field_q;
            }
            if (param2 > field_q) {
              param2 = field_q;
            }
            param6 = (param6 << 9) - var30 * param3 + var30;
            if (param1 >= param2) {
              localTemp$4 = param3 << 16;
              param3 = localTemp$4;
              param4 = localTemp$4;
              if (param0 < 0) {
                param4 = param4 - var28 * param0;
                param3 = param3 - var26 * param0;
                param6 = param6 - var31 * param0;
                param0 = 0;
              }
              param5 = param5 << 16;
              if (param2 < 0) {
                param5 = param5 - var27 * param2;
                param2 = 0;
              }
              var41 = param0 - field_j;
              var32 = var32 + var34 * var41;
              var35 = var35 + var37 * var41;
              var38 = var38 + var40 * var41;
              if ((param0 == param2 ||
                var28 >= var26) && (param0 != param2 ||
                var27 <= var26)) {
                param1 = param1 - param2;
                param2 = param2 - param0;
                param0 = field_k[param0];
                while (true) {
                  param2--;
                  if (param2 >= 0) {
                    tm.a(SoftwareRaster.field_d, var43, 0, 0, param0, param3 >> 16, param4 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                    param4 = param4 + var28;
                    param3 = param3 + var26;
                    param6 = param6 + var31;
                    param0 = param0 + SoftwareRaster.field_l;
                    var32 = var32 + var34;
                    var35 = var35 + var37;
                    var38 = var38 + var40;
                    continue;
                  }
                  break;
                }
                param1--;
                while (param1 >= 0) {
                  tm.a(SoftwareRaster.field_d, var43, 0, 0, param0, param3 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                  param5 = param5 + var27;
                  param3 = param3 + var26;
                  param6 = param6 + var31;
                  param0 = param0 + SoftwareRaster.field_l;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  param1--;
                }
                return;
              }
              param1 = param1 - param2;
              param2 = param2 - param0;
              param0 = field_k[param0];
              while (true) {
                param2--;
                if (param2 >= 0) {
                  tm.a(SoftwareRaster.field_d, var43, 0, 0, param0, param4 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                  param4 = param4 + var28;
                  param3 = param3 + var26;
                  param6 = param6 + var31;
                  param0 = param0 + SoftwareRaster.field_l;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  continue;
                }
                break;
              }
              param1--;
              while (param1 >= 0) {
                tm.a(SoftwareRaster.field_d, var43, 0, 0, param0, param5 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var31;
                param0 = param0 + SoftwareRaster.field_l;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                param1--;
              }
              return;
            }
            localTemp$5 = param3 << 16;
            param3 = localTemp$5;
            param5 = localTemp$5;
            if (param0 < 0) {
              param5 = param5 - var28 * param0;
              param3 = param3 - var26 * param0;
              param6 = param6 - var31 * param0;
              param0 = 0;
            }
            param4 = param4 << 16;
            if (param1 < 0) {
              param4 = param4 - var27 * param1;
              param1 = 0;
            }
            var41Lifetime4 = param0 - field_j;
            var32 = var32 + var34 * var41Lifetime4;
            var35 = var35 + var37 * var41Lifetime4;
            var38 = var38 + var40 * var41Lifetime4;
            if ((param0 == param1 ||
              var28 >= var26) && (param0 != param1 ||
              var28 <= var27)) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = field_k[param0];
              while (true) {
                param1--;
                if (param1 >= 0) {
                  tm.a(SoftwareRaster.field_d, var43, 0, 0, param0, param3 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                  param5 = param5 + var28;
                  param3 = param3 + var26;
                  param6 = param6 + var31;
                  param0 = param0 + SoftwareRaster.field_l;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  continue;
                }
                break;
              }
              param2--;
              while (param2 >= 0) {
                tm.a(SoftwareRaster.field_d, var43, 0, 0, param0, param4 >> 16, param5 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                param5 = param5 + var28;
                param4 = param4 + var27;
                param6 = param6 + var31;
                param0 = param0 + SoftwareRaster.field_l;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                param2--;
              }
              return;
            }
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = field_k[param0];
            while (true) {
              param1--;
              if (param1 >= 0) {
                tm.a(SoftwareRaster.field_d, var43, 0, 0, param0, param5 >> 16, param3 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
                param5 = param5 + var28;
                param3 = param3 + var26;
                param6 = param6 + var31;
                param0 = param0 + SoftwareRaster.field_l;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              tm.a(SoftwareRaster.field_d, var43, 0, 0, param0, param5 >> 16, param4 >> 16, param6, var30, var32, var35, var38, var33, var36, var39);
              param5 = param5 + var28;
              param4 = param4 + var27;
              param6 = param6 + var31;
              param0 = param0 + SoftwareRaster.field_l;
              var32 = var32 + var34;
              var35 = var35 + var37;
              var38 = var38 + var40;
              param2--;
            }
            return;
          }
          if (param1 > param2) {
            if (param2 >= field_q) {
              return;
            }
            if (param0 > field_q) {
              param0 = field_q;
            }
            if (param1 > field_q) {
              param1 = field_q;
            }
            param8 = (param8 << 9) - var30 * param5 + var30;
            if (param0 >= param1) {
              localTemp$6 = param5 << 16;
              param5 = localTemp$6;
              param3 = localTemp$6;
              if (param2 < 0) {
                param3 = param3 - var27 * param2;
                param5 = param5 - var28 * param2;
                param8 = param8 - var31 * param2;
                param2 = 0;
              }
              param4 = param4 << 16;
              if (param1 < 0) {
                param4 = param4 - var26 * param1;
                param1 = 0;
              }
              var41Lifetime1 = param2 - field_j;
              var32 = var32 + var34 * var41Lifetime1;
              var35 = var35 + var37 * var41Lifetime1;
              var38 = var38 + var40 * var41Lifetime1;
              if (var27 >= var28) {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = field_k[param2];
                while (true) {
                  param1--;
                  if (param1 >= 0) {
                    tm.a(SoftwareRaster.field_d, var43, 0, 0, param2, param5 >> 16, param3 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                    param3 = param3 + var27;
                    param5 = param5 + var28;
                    param8 = param8 + var31;
                    param2 = param2 + SoftwareRaster.field_l;
                    var32 = var32 + var34;
                    var35 = var35 + var37;
                    var38 = var38 + var40;
                    continue;
                  }
                  break;
                }
                param0--;
                while (param0 >= 0) {
                  tm.a(SoftwareRaster.field_d, var43, 0, 0, param2, param5 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                  param4 = param4 + var26;
                  param5 = param5 + var28;
                  param8 = param8 + var31;
                  param2 = param2 + SoftwareRaster.field_l;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  param0--;
                }
                return;
              }
              param0 = param0 - param1;
              param1 = param1 - param2;
              param2 = field_k[param2];
              while (true) {
                param1--;
                if (param1 >= 0) {
                  tm.a(SoftwareRaster.field_d, var43, 0, 0, param2, param3 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                  param3 = param3 + var27;
                  param5 = param5 + var28;
                  param8 = param8 + var31;
                  param2 = param2 + SoftwareRaster.field_l;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  continue;
                }
                break;
              }
              param0--;
              while (param0 >= 0) {
                tm.a(SoftwareRaster.field_d, var43, 0, 0, param2, param4 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                param4 = param4 + var26;
                param5 = param5 + var28;
                param8 = param8 + var31;
                param2 = param2 + SoftwareRaster.field_l;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                param0--;
              }
              return;
            }
            localTemp$7 = param5 << 16;
            param5 = localTemp$7;
            param4 = localTemp$7;
            if (param2 < 0) {
              param4 = param4 - var27 * param2;
              param5 = param5 - var28 * param2;
              param8 = param8 - var31 * param2;
              param2 = 0;
            }
            param3 = param3 << 16;
            if (param0 < 0) {
              param3 = param3 - var26 * param0;
              param0 = 0;
            }
            var41Lifetime1Lifetime1 = param2 - field_j;
            var32 = var32 + var34 * var41Lifetime1Lifetime1;
            var35 = var35 + var37 * var41Lifetime1Lifetime1;
            var38 = var38 + var40 * var41Lifetime1Lifetime1;
            if (var27 >= var28) {
              param1 = param1 - param0;
              param0 = param0 - param2;
              param2 = field_k[param2];
              while (true) {
                param0--;
                if (param0 >= 0) {
                  tm.a(SoftwareRaster.field_d, var43, 0, 0, param2, param5 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                  param4 = param4 + var27;
                  param5 = param5 + var28;
                  param8 = param8 + var31;
                  param2 = param2 + SoftwareRaster.field_l;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  continue;
                }
                break;
              }
              param1--;
              while (param1 >= 0) {
                tm.a(SoftwareRaster.field_d, var43, 0, 0, param2, param3 >> 16, param4 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                param4 = param4 + var27;
                param3 = param3 + var26;
                param8 = param8 + var31;
                param2 = param2 + SoftwareRaster.field_l;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                param1--;
              }
              return;
            }
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = field_k[param2];
            while (true) {
              param0--;
              if (param0 >= 0) {
                tm.a(SoftwareRaster.field_d, var43, 0, 0, param2, param4 >> 16, param5 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
                param4 = param4 + var27;
                param5 = param5 + var28;
                param8 = param8 + var31;
                param2 = param2 + SoftwareRaster.field_l;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                continue;
              }
              break;
            }
            param1--;
            while (param1 >= 0) {
              tm.a(SoftwareRaster.field_d, var43, 0, 0, param2, param4 >> 16, param3 >> 16, param8, var30, var32, var35, var38, var33, var36, var39);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param8 = param8 + var31;
              param2 = param2 + SoftwareRaster.field_l;
              var32 = var32 + var34;
              var35 = var35 + var37;
              var38 = var38 + var40;
              param1--;
            }
            return;
          }
          if (param1 >= field_q) {
            return;
          }
          if (param2 > field_q) {
            param2 = field_q;
          }
          if (param0 > field_q) {
            param0 = field_q;
          }
          param7 = (param7 << 9) - var30 * param4 + var30;
          if (param2 >= param0) {
            localTemp$8 = param4 << 16;
            param4 = localTemp$8;
            param5 = localTemp$8;
            if (param1 < 0) {
              param5 = param5 - var26 * param1;
              param4 = param4 - var27 * param1;
              param7 = param7 - var31 * param1;
              param1 = 0;
            }
            param3 = param3 << 16;
            if (param0 < 0) {
              param3 = param3 - var28 * param0;
              param0 = 0;
            }
            var41Lifetime2 = param1 - field_j;
            var32 = var32 + var34 * var41Lifetime2;
            var35 = var35 + var37 * var41Lifetime2;
            var38 = var38 + var40 * var41Lifetime2;
            if (var26 >= var27) {
              param2 = param2 - param0;
              param0 = param0 - param1;
              param1 = field_k[param1];
              while (true) {
                param0--;
                if (param0 >= 0) {
                  tm.a(SoftwareRaster.field_d, var43, 0, 0, param1, param4 >> 16, param5 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                  param5 = param5 + var26;
                  param4 = param4 + var27;
                  param7 = param7 + var31;
                  param1 = param1 + SoftwareRaster.field_l;
                  var32 = var32 + var34;
                  var35 = var35 + var37;
                  var38 = var38 + var40;
                  continue;
                }
                break;
              }
              param2--;
              while (param2 >= 0) {
                tm.a(SoftwareRaster.field_d, var43, 0, 0, param1, param4 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                param3 = param3 + var28;
                param4 = param4 + var27;
                param7 = param7 + var31;
                param1 = param1 + SoftwareRaster.field_l;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                param2--;
              }
              return;
            }
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = field_k[param1];
            while (true) {
              param0--;
              if (param0 >= 0) {
                tm.a(SoftwareRaster.field_d, var43, 0, 0, param1, param5 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                param5 = param5 + var26;
                param4 = param4 + var27;
                param7 = param7 + var31;
                param1 = param1 + SoftwareRaster.field_l;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              tm.a(SoftwareRaster.field_d, var43, 0, 0, param1, param3 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
              param3 = param3 + var28;
              param4 = param4 + var27;
              param7 = param7 + var31;
              param1 = param1 + SoftwareRaster.field_l;
              var32 = var32 + var34;
              var35 = var35 + var37;
              var38 = var38 + var40;
              param2--;
            }
            return;
          }
          localTemp$9 = param4 << 16;
          param4 = localTemp$9;
          param3 = localTemp$9;
          if (param1 < 0) {
            param3 = param3 - var26 * param1;
            param4 = param4 - var27 * param1;
            param7 = param7 - var31 * param1;
            param1 = 0;
          }
          param5 = param5 << 16;
          if (param2 < 0) {
            param5 = param5 - var28 * param2;
            param2 = 0;
          }
          var41Lifetime3 = param1 - field_j;
          var32 = var32 + var34 * var41Lifetime3;
          var35 = var35 + var37 * var41Lifetime3;
          var38 = var38 + var40 * var41Lifetime3;
          if ((param1 == param2 ||
            var26 >= var27) && (param1 != param2 ||
            var26 <= var28)) {
            param0 = param0 - param2;
            param2 = param2 - param1;
            param1 = field_k[param1];
            while (true) {
              param2--;
              if (param2 >= 0) {
                tm.a(SoftwareRaster.field_d, var43, 0, 0, param1, param4 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
                param3 = param3 + var26;
                param4 = param4 + var27;
                param7 = param7 + var31;
                param1 = param1 + SoftwareRaster.field_l;
                var32 = var32 + var34;
                var35 = var35 + var37;
                var38 = var38 + var40;
                continue;
              }
              break;
            }
            param0--;
            while (param0 >= 0) {
              tm.a(SoftwareRaster.field_d, var43, 0, 0, param1, param5 >> 16, param3 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
              param3 = param3 + var26;
              param5 = param5 + var28;
              param7 = param7 + var31;
              param1 = param1 + SoftwareRaster.field_l;
              var32 = var32 + var34;
              var35 = var35 + var37;
              var38 = var38 + var40;
              param0--;
            }
            return;
          }
          param0 = param0 - param2;
          param2 = param2 - param1;
          param1 = field_k[param1];
          while (true) {
            param2--;
            if (param2 >= 0) {
              tm.a(SoftwareRaster.field_d, var43, 0, 0, param1, param3 >> 16, param4 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
              param3 = param3 + var26;
              param4 = param4 + var27;
              param7 = param7 + var31;
              param1 = param1 + SoftwareRaster.field_l;
              var32 = var32 + var34;
              var35 = var35 + var37;
              var38 = var38 + var40;
              continue;
            }
            break;
          }
          param0--;
          while (param0 >= 0) {
            tm.a(SoftwareRaster.field_d, var43, 0, 0, param1, param3 >> 16, param5 >> 16, param7, var30, var32, var35, var38, var33, var36, var39);
            param3 = param3 + var26;
            param5 = param5 + var28;
            param7 = param7 + var31;
            param1 = param1 + SoftwareRaster.field_l;
            var32 = var32 + var34;
            var35 = var35 + var37;
            var38 = var38 + var40;
            param0--;
          }
          return;
        }
        var20Lifetime1 = field_o.a(param18, (byte) -5);
        tm.a(param0, param1, param2, param3, param4, param5, tm.b(var20Lifetime1, param6), tm.b(var20Lifetime1, param7), tm.b(var20Lifetime1, param8));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int localTemp$2 = 0;
        int localTemp$3 = 0;
        int localTemp$4 = 0;
        int localTemp$5 = 0;
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
        var9 = param4 - param3;
        var10 = param1 - param0;
        var11 = param5 - param3;
        var12 = param2 - param0;
        var13 = param7 - param6;
        var14 = param8 - param6;
        if (param2 == param1) {
          var15 = 0;
        } else {
          var15 = (param5 - param4 << 16) / (param2 - param1);
        }
        if (param1 == param0) {
          var16 = 0;
        } else {
          var16 = (var9 << 16) / var10;
        }
        if (param2 == param0) {
          var17 = 0;
        } else {
          var17 = (var11 << 16) / var12;
        }
        var18 = var9 * var12 - var11 * var10;
        if (var18 == 0) {
          return;
        }
        var19 = (var13 * var12 - var14 * var10 << 8) / var18;
        var20 = (var14 * var9 - var13 * var11 << 8) / var18;
        if (param0 <= param1 &&
          param0 <= param2) {
          if (param0 >= field_q) {
            return;
          }
          if (param1 > field_q) {
            param1 = field_q;
          }
          if (param2 > field_q) {
            param2 = field_q;
          }
          param6 = (param6 << 8) - var19 * param3 + var19;
          if (param1 >= param2) {
            localTemp$0 = param3 << 16;
            param3 = localTemp$0;
            param4 = localTemp$0;
            if (param0 < 0) {
              param4 = param4 - var17 * param0;
              param3 = param3 - var16 * param0;
              param6 = param6 - var20 * param0;
              param0 = 0;
            }
            param5 = param5 << 16;
            if (param2 < 0) {
              param5 = param5 - var15 * param2;
              param2 = 0;
            }
            if ((param0 == param2 ||
              var17 >= var16) &&
              (param0 != param2 ||
              var15 <= var16)) {
              param1 = param1 - param2;
              param2 = param2 - param0;
              param0 = field_k[param0];
              while (true) {
                param2--;
                if (param2 >= 0) {
                  tm.a(SoftwareRaster.field_d, param0, 0, 0, param3 >> 16, param4 >> 16, param6, var19);
                  param4 = param4 + var17;
                  param3 = param3 + var16;
                  param6 = param6 + var20;
                  param0 = param0 + SoftwareRaster.field_l;
                  continue;
                }
                break;
              }
              param1--;
              while (param1 >= 0) {
                tm.a(SoftwareRaster.field_d, param0, 0, 0, param3 >> 16, param5 >> 16, param6, var19);
                param5 = param5 + var15;
                param3 = param3 + var16;
                param6 = param6 + var20;
                param0 = param0 + SoftwareRaster.field_l;
                param1--;
              }
              return;
            }
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = field_k[param0];
            while (true) {
              param2--;
              if (param2 >= 0) {
                tm.a(SoftwareRaster.field_d, param0, 0, 0, param4 >> 16, param3 >> 16, param6, var19);
                param4 = param4 + var17;
                param3 = param3 + var16;
                param6 = param6 + var20;
                param0 = param0 + SoftwareRaster.field_l;
                continue;
              }
              break;
            }
            param1--;
            while (param1 >= 0) {
              tm.a(SoftwareRaster.field_d, param0, 0, 0, param5 >> 16, param3 >> 16, param6, var19);
              param5 = param5 + var15;
              param3 = param3 + var16;
              param6 = param6 + var20;
              param0 = param0 + SoftwareRaster.field_l;
              param1--;
            }
            return;
          }
          localTemp$1 = param3 << 16;
          param3 = localTemp$1;
          param5 = localTemp$1;
          if (param0 < 0) {
            param5 = param5 - var17 * param0;
            param3 = param3 - var16 * param0;
            param6 = param6 - var20 * param0;
            param0 = 0;
          }
          param4 = param4 << 16;
          if (param1 < 0) {
            param4 = param4 - var15 * param1;
            param1 = 0;
          }
          if ((param0 == param1 ||
            var17 >= var16) &&
            (param0 != param1 ||
            var17 <= var15)) {
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = field_k[param0];
            while (true) {
              param1--;
              if (param1 >= 0) {
                tm.a(SoftwareRaster.field_d, param0, 0, 0, param3 >> 16, param5 >> 16, param6, var19);
                param5 = param5 + var17;
                param3 = param3 + var16;
                param6 = param6 + var20;
                param0 = param0 + SoftwareRaster.field_l;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              tm.a(SoftwareRaster.field_d, param0, 0, 0, param4 >> 16, param5 >> 16, param6, var19);
              param5 = param5 + var17;
              param4 = param4 + var15;
              param6 = param6 + var20;
              param0 = param0 + SoftwareRaster.field_l;
              param2--;
            }
            return;
          }
          param2 = param2 - param1;
          param1 = param1 - param0;
          param0 = field_k[param0];
          while (true) {
            param1--;
            if (param1 >= 0) {
              tm.a(SoftwareRaster.field_d, param0, 0, 0, param5 >> 16, param3 >> 16, param6, var19);
              param5 = param5 + var17;
              param3 = param3 + var16;
              param6 = param6 + var20;
              param0 = param0 + SoftwareRaster.field_l;
              continue;
            }
            break;
          }
          param2--;
          while (param2 >= 0) {
            tm.a(SoftwareRaster.field_d, param0, 0, 0, param5 >> 16, param4 >> 16, param6, var19);
            param5 = param5 + var17;
            param4 = param4 + var15;
            param6 = param6 + var20;
            param0 = param0 + SoftwareRaster.field_l;
            param2--;
          }
          return;
        }
        if (param1 > param2) {
          if (param2 >= field_q) {
            return;
          }
          if (param0 > field_q) {
            param0 = field_q;
          }
          if (param1 > field_q) {
            param1 = field_q;
          }
          param8 = (param8 << 8) - var19 * param5 + var19;
          if (param0 >= param1) {
            localTemp$2 = param5 << 16;
            param5 = localTemp$2;
            param3 = localTemp$2;
            if (param2 < 0) {
              param3 = param3 - var15 * param2;
              param5 = param5 - var17 * param2;
              param8 = param8 - var20 * param2;
              param2 = 0;
            }
            param4 = param4 << 16;
            if (param1 < 0) {
              param4 = param4 - var16 * param1;
              param1 = 0;
            }
            if (var15 >= var17) {
              param0 = param0 - param1;
              param1 = param1 - param2;
              param2 = field_k[param2];
              while (true) {
                param1--;
                if (param1 >= 0) {
                  tm.a(SoftwareRaster.field_d, param2, 0, 0, param5 >> 16, param3 >> 16, param8, var19);
                  param3 = param3 + var15;
                  param5 = param5 + var17;
                  param8 = param8 + var20;
                  param2 = param2 + SoftwareRaster.field_l;
                  continue;
                }
                break;
              }
              param0--;
              while (param0 >= 0) {
                tm.a(SoftwareRaster.field_d, param2, 0, 0, param5 >> 16, param4 >> 16, param8, var19);
                param4 = param4 + var16;
                param5 = param5 + var17;
                param8 = param8 + var20;
                param2 = param2 + SoftwareRaster.field_l;
                param0--;
              }
              return;
            }
            param0 = param0 - param1;
            param1 = param1 - param2;
            param2 = field_k[param2];
            while (true) {
              param1--;
              if (param1 >= 0) {
                tm.a(SoftwareRaster.field_d, param2, 0, 0, param3 >> 16, param5 >> 16, param8, var19);
                param3 = param3 + var15;
                param5 = param5 + var17;
                param8 = param8 + var20;
                param2 = param2 + SoftwareRaster.field_l;
                continue;
              }
              break;
            }
            param0--;
            while (param0 >= 0) {
              tm.a(SoftwareRaster.field_d, param2, 0, 0, param4 >> 16, param5 >> 16, param8, var19);
              param4 = param4 + var16;
              param5 = param5 + var17;
              param8 = param8 + var20;
              param2 = param2 + SoftwareRaster.field_l;
              param0--;
            }
            return;
          }
          localTemp$3 = param5 << 16;
          param5 = localTemp$3;
          param4 = localTemp$3;
          if (param2 < 0) {
            param4 = param4 - var15 * param2;
            param5 = param5 - var17 * param2;
            param8 = param8 - var20 * param2;
            param2 = 0;
          }
          param3 = param3 << 16;
          if (param0 < 0) {
            param3 = param3 - var16 * param0;
            param0 = 0;
          }
          if (var15 >= var17) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = field_k[param2];
            while (true) {
              param0--;
              if (param0 >= 0) {
                tm.a(SoftwareRaster.field_d, param2, 0, 0, param5 >> 16, param4 >> 16, param8, var19);
                param4 = param4 + var15;
                param5 = param5 + var17;
                param8 = param8 + var20;
                param2 = param2 + SoftwareRaster.field_l;
                continue;
              }
              break;
            }
            param1--;
            while (param1 >= 0) {
              tm.a(SoftwareRaster.field_d, param2, 0, 0, param3 >> 16, param4 >> 16, param8, var19);
              param4 = param4 + var15;
              param3 = param3 + var16;
              param8 = param8 + var20;
              param2 = param2 + SoftwareRaster.field_l;
              param1--;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = field_k[param2];
          while (true) {
            param0--;
            if (param0 >= 0) {
              tm.a(SoftwareRaster.field_d, param2, 0, 0, param4 >> 16, param5 >> 16, param8, var19);
              param4 = param4 + var15;
              param5 = param5 + var17;
              param8 = param8 + var20;
              param2 = param2 + SoftwareRaster.field_l;
              continue;
            }
            break;
          }
          param1--;
          while (param1 >= 0) {
            tm.a(SoftwareRaster.field_d, param2, 0, 0, param4 >> 16, param3 >> 16, param8, var19);
            param4 = param4 + var15;
            param3 = param3 + var16;
            param8 = param8 + var20;
            param2 = param2 + SoftwareRaster.field_l;
            param1--;
          }
          return;
        }
        if (param1 >= field_q) {
          return;
        }
        if (param2 > field_q) {
          param2 = field_q;
        }
        if (param0 > field_q) {
          param0 = field_q;
        }
        param7 = (param7 << 8) - var19 * param4 + var19;
        if (param2 >= param0) {
          localTemp$4 = param4 << 16;
          param4 = localTemp$4;
          param5 = localTemp$4;
          if (param1 < 0) {
            param5 = param5 - var16 * param1;
            param4 = param4 - var15 * param1;
            param7 = param7 - var20 * param1;
            param1 = 0;
          }
          param3 = param3 << 16;
          if (param0 < 0) {
            param3 = param3 - var17 * param0;
            param0 = 0;
          }
          if (var16 >= var15) {
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = field_k[param1];
            while (true) {
              param0--;
              if (param0 >= 0) {
                tm.a(SoftwareRaster.field_d, param1, 0, 0, param4 >> 16, param5 >> 16, param7, var19);
                param5 = param5 + var16;
                param4 = param4 + var15;
                param7 = param7 + var20;
                param1 = param1 + SoftwareRaster.field_l;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              tm.a(SoftwareRaster.field_d, param1, 0, 0, param4 >> 16, param3 >> 16, param7, var19);
              param3 = param3 + var17;
              param4 = param4 + var15;
              param7 = param7 + var20;
              param1 = param1 + SoftwareRaster.field_l;
              param2--;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = field_k[param1];
          while (true) {
            param0--;
            if (param0 >= 0) {
              tm.a(SoftwareRaster.field_d, param1, 0, 0, param5 >> 16, param4 >> 16, param7, var19);
              param5 = param5 + var16;
              param4 = param4 + var15;
              param7 = param7 + var20;
              param1 = param1 + SoftwareRaster.field_l;
              continue;
            }
            break;
          }
          param2--;
          while (param2 >= 0) {
            tm.a(SoftwareRaster.field_d, param1, 0, 0, param3 >> 16, param4 >> 16, param7, var19);
            param3 = param3 + var17;
            param4 = param4 + var15;
            param7 = param7 + var20;
            param1 = param1 + SoftwareRaster.field_l;
            param2--;
          }
          return;
        }
        localTemp$5 = param4 << 16;
        param4 = localTemp$5;
        param3 = localTemp$5;
        if (param1 < 0) {
          param3 = param3 - var16 * param1;
          param4 = param4 - var15 * param1;
          param7 = param7 - var20 * param1;
          param1 = 0;
        }
        param5 = param5 << 16;
        if (param2 < 0) {
          param5 = param5 - var17 * param2;
          param2 = 0;
        }
        if ((param1 == param2 ||
          var16 >= var15) &&
          (param1 != param2 ||
          var16 <= var17)) {
          param0 = param0 - param2;
          param2 = param2 - param1;
          param1 = field_k[param1];
          while (true) {
            param2--;
            if (param2 >= 0) {
              tm.a(SoftwareRaster.field_d, param1, 0, 0, param4 >> 16, param3 >> 16, param7, var19);
              param3 = param3 + var16;
              param4 = param4 + var15;
              param7 = param7 + var20;
              param1 = param1 + SoftwareRaster.field_l;
              continue;
            }
            break;
          }
          param0--;
          while (param0 >= 0) {
            tm.a(SoftwareRaster.field_d, param1, 0, 0, param5 >> 16, param3 >> 16, param7, var19);
            param3 = param3 + var16;
            param5 = param5 + var17;
            param7 = param7 + var20;
            param1 = param1 + SoftwareRaster.field_l;
            param0--;
          }
          return;
        }
        param0 = param0 - param2;
        param2 = param2 - param1;
        param1 = field_k[param1];
        while (true) {
          param2--;
          if (param2 >= 0) {
            tm.a(SoftwareRaster.field_d, param1, 0, 0, param3 >> 16, param4 >> 16, param7, var19);
            param3 = param3 + var16;
            param4 = param4 + var15;
            param7 = param7 + var20;
            param1 = param1 + SoftwareRaster.field_l;
            continue;
          }
          break;
        }
        param0--;
        while (param0 >= 0) {
          tm.a(SoftwareRaster.field_d, param1, 0, 0, param3 >> 16, param5 >> 16, param7, var19);
          param3 = param3 + var16;
          param5 = param5 + var17;
          param7 = param7 + var20;
          param1 = param1 + SoftwareRaster.field_l;
          param0--;
        }
        return;
    }

    private final static int b(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
          param1 = 2;
        } else {
          if (param1 > 126) {
            param1 = 126;
          }
        }
        return (param0 & 65408) + param1;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        field_g = true;
        field_i = new int[512];
        field_d = false;
        field_a = false;
        field_b = 1.0f;
        field_n = new int[2048];
        field_p = false;
        field_k = new int[1024];
        field_f = 0;
        field_m = new int[2048];
        field_e = new int[2048];
        field_h = new int[65536];
        for (var0 = 1; var0 < 512; var0++) {
          field_i[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          field_m[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          field_n[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          field_e[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
