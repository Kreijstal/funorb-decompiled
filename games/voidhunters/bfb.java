/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bfb {
    static int field_h;
    private static boolean field_d;
    static int[] field_g;
    private static int[] field_e;
    private static int[] field_k;
    static int field_b;
    static int field_a;
    static int field_f;
    private static int[] field_c;
    static int field_j;
    private static int[] field_i;

    final static int c() {
        return field_g[0] % dma.field_g;
    }

    private final static void a() {
        field_f = field_a / 2;
        field_j = field_h / 2;
    }

    public static void b() {
        field_g = null;
        field_i = null;
        field_c = null;
        field_e = null;
        field_k = null;
    }

    final static int d() {
        return field_g[0] / dma.field_g;
    }

    final static void e() {
        bfb.a(dma.field_d, dma.field_c, dma.field_a, dma.field_f);
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
        if (field_d) {
          if (param5 > field_a) {
            param5 = field_a;
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
        if (field_b == 0) {
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
        L2: {
          if (field_b == 254) {
            while (true) {
              param3--;
              if (param3 < 0) {
                param3 = param5 - param4 & 3;
                while (true) {
                  param3--;
                  if (param3 < 0) {
                    break L2;
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
          var6 = field_b;
          var7 = 256 - field_b;
          param2 = ((param2 & 16711935) * var7 >> 8 & 16711935) + ((param2 & 65280) * var7 >> 8 & 65280);
          while (true) {
            param3--;
            if (param3 < 0) {
              param3 = param5 - param4 & 3;
              while (true) {
                param3--;
                if (param3 < 0) {
                  break L2;
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

    final static void a(int param0, int param1, int param2) {
        boolean stackIn_8_0 = false;
        stackIn_8_0 = !(param0 >= 0) || !(param0 <= field_a) || !(param1 >= 0) || !(param1 <= field_a) || !(param2 >= 0) || !(param2 <= field_a);
        field_d = stackIn_8_0;
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
          if (param0 >= field_h) {
            return;
          }
          if (param1 > field_h) {
            param1 = field_h;
          }
          if (param2 > field_h) {
            param2 = field_h;
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
              param0 = field_g[param0];
              while (true) {
                param2--;
                if (param2 >= 0) {
                  bfb.a(dma.field_i, param0, param6, 0, param3 >> 16, param4 >> 16);
                  param4 = param4 + var9;
                  param3 = param3 + var7;
                  param0 = param0 + dma.field_g;
                  continue;
                }
                break;
              }
              param1--;
              while (param1 >= 0) {
                bfb.a(dma.field_i, param0, param6, 0, param3 >> 16, param5 >> 16);
                param5 = param5 + var8;
                param3 = param3 + var7;
                param0 = param0 + dma.field_g;
                param1--;
              }
              return;
            }
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = field_g[param0];
            while (true) {
              param2--;
              if (param2 >= 0) {
                bfb.a(dma.field_i, param0, param6, 0, param4 >> 16, param3 >> 16);
                param4 = param4 + var9;
                param3 = param3 + var7;
                param0 = param0 + dma.field_g;
                continue;
              }
              break;
            }
            param1--;
            while (param1 >= 0) {
              bfb.a(dma.field_i, param0, param6, 0, param5 >> 16, param3 >> 16);
              param5 = param5 + var8;
              param3 = param3 + var7;
              param0 = param0 + dma.field_g;
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
            param0 = field_g[param0];
            while (true) {
              param1--;
              if (param1 >= 0) {
                bfb.a(dma.field_i, param0, param6, 0, param3 >> 16, param5 >> 16);
                param5 = param5 + var9;
                param3 = param3 + var7;
                param0 = param0 + dma.field_g;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              bfb.a(dma.field_i, param0, param6, 0, param4 >> 16, param5 >> 16);
              param5 = param5 + var9;
              param4 = param4 + var8;
              param0 = param0 + dma.field_g;
              param2--;
            }
            return;
          }
          param2 = param2 - param1;
          param1 = param1 - param0;
          param0 = field_g[param0];
          while (true) {
            param1--;
            if (param1 >= 0) {
              bfb.a(dma.field_i, param0, param6, 0, param5 >> 16, param3 >> 16);
              param5 = param5 + var9;
              param3 = param3 + var7;
              param0 = param0 + dma.field_g;
              continue;
            }
            break;
          }
          param2--;
          while (param2 >= 0) {
            bfb.a(dma.field_i, param0, param6, 0, param5 >> 16, param4 >> 16);
            param5 = param5 + var9;
            param4 = param4 + var8;
            param0 = param0 + dma.field_g;
            param2--;
          }
          return;
        }
        if (param1 > param2) {
          if (param2 >= field_h) {
            return;
          }
          if (param0 > field_h) {
            param0 = field_h;
          }
          if (param1 > field_h) {
            param1 = field_h;
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
              param2 = field_g[param2];
              while (true) {
                param1--;
                if (param1 >= 0) {
                  bfb.a(dma.field_i, param2, param6, 0, param5 >> 16, param3 >> 16);
                  param3 = param3 + var8;
                  param5 = param5 + var9;
                  param2 = param2 + dma.field_g;
                  continue;
                }
                break;
              }
              param0--;
              while (param0 >= 0) {
                bfb.a(dma.field_i, param2, param6, 0, param5 >> 16, param4 >> 16);
                param4 = param4 + var7;
                param5 = param5 + var9;
                param2 = param2 + dma.field_g;
                param0--;
              }
              return;
            }
            param0 = param0 - param1;
            param1 = param1 - param2;
            param2 = field_g[param2];
            while (true) {
              param1--;
              if (param1 >= 0) {
                bfb.a(dma.field_i, param2, param6, 0, param3 >> 16, param5 >> 16);
                param3 = param3 + var8;
                param5 = param5 + var9;
                param2 = param2 + dma.field_g;
                continue;
              }
              break;
            }
            param0--;
            while (param0 >= 0) {
              bfb.a(dma.field_i, param2, param6, 0, param4 >> 16, param5 >> 16);
              param4 = param4 + var7;
              param5 = param5 + var9;
              param2 = param2 + dma.field_g;
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
            param2 = field_g[param2];
            while (true) {
              param0--;
              if (param0 >= 0) {
                bfb.a(dma.field_i, param2, param6, 0, param5 >> 16, param4 >> 16);
                param4 = param4 + var8;
                param5 = param5 + var9;
                param2 = param2 + dma.field_g;
                continue;
              }
              break;
            }
            param1--;
            while (param1 >= 0) {
              bfb.a(dma.field_i, param2, param6, 0, param3 >> 16, param4 >> 16);
              param4 = param4 + var8;
              param3 = param3 + var7;
              param2 = param2 + dma.field_g;
              param1--;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = field_g[param2];
          while (true) {
            param0--;
            if (param0 >= 0) {
              bfb.a(dma.field_i, param2, param6, 0, param4 >> 16, param5 >> 16);
              param4 = param4 + var8;
              param5 = param5 + var9;
              param2 = param2 + dma.field_g;
              continue;
            }
            break;
          }
          param1--;
          while (param1 >= 0) {
            bfb.a(dma.field_i, param2, param6, 0, param4 >> 16, param3 >> 16);
            param4 = param4 + var8;
            param3 = param3 + var7;
            param2 = param2 + dma.field_g;
            param1--;
          }
          return;
        }
        if (param1 >= field_h) {
          return;
        }
        if (param2 > field_h) {
          param2 = field_h;
        }
        if (param0 > field_h) {
          param0 = field_h;
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
            param1 = field_g[param1];
            while (true) {
              param0--;
              if (param0 >= 0) {
                bfb.a(dma.field_i, param1, param6, 0, param4 >> 16, param5 >> 16);
                param5 = param5 + var7;
                param4 = param4 + var8;
                param1 = param1 + dma.field_g;
                continue;
              }
              break;
            }
            param2--;
            while (param2 >= 0) {
              bfb.a(dma.field_i, param1, param6, 0, param4 >> 16, param3 >> 16);
              param3 = param3 + var9;
              param4 = param4 + var8;
              param1 = param1 + dma.field_g;
              param2--;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = field_g[param1];
          while (true) {
            param0--;
            if (param0 >= 0) {
              bfb.a(dma.field_i, param1, param6, 0, param5 >> 16, param4 >> 16);
              param5 = param5 + var7;
              param4 = param4 + var8;
              param1 = param1 + dma.field_g;
              continue;
            }
            break;
          }
          param2--;
          while (param2 >= 0) {
            bfb.a(dma.field_i, param1, param6, 0, param3 >> 16, param4 >> 16);
            param3 = param3 + var9;
            param4 = param4 + var8;
            param1 = param1 + dma.field_g;
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
          param1 = field_g[param1];
          while (true) {
            param2--;
            if (param2 >= 0) {
              bfb.a(dma.field_i, param1, param6, 0, param4 >> 16, param3 >> 16);
              param3 = param3 + var7;
              param4 = param4 + var8;
              param1 = param1 + dma.field_g;
              continue;
            }
            break;
          }
          param0--;
          while (param0 >= 0) {
            bfb.a(dma.field_i, param1, param6, 0, param5 >> 16, param3 >> 16);
            param3 = param3 + var7;
            param5 = param5 + var9;
            param1 = param1 + dma.field_g;
            param0--;
          }
          return;
        }
        param0 = param0 - param2;
        param2 = param2 - param1;
        param1 = field_g[param1];
        while (true) {
          param2--;
          if (param2 >= 0) {
            bfb.a(dma.field_i, param1, param6, 0, param3 >> 16, param4 >> 16);
            param3 = param3 + var7;
            param4 = param4 + var8;
            param1 = param1 + dma.field_g;
            continue;
          }
          break;
        }
        param0--;
        while (param0 >= 0) {
          bfb.a(dma.field_i, param1, param6, 0, param3 >> 16, param5 >> 16);
          param3 = param3 + var7;
          param5 = param5 + var9;
          param1 = param1 + dma.field_g;
          param0--;
        }
        return;
    }

    private final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        field_a = param2 - param0;
        field_h = param3 - param1;
        bfb.a();
        if (field_g.length < field_h) {
          field_g = new int[hj.a(field_h, (byte) -105)];
        }
        int var4 = param1 * dma.field_g + param0;
        for (var5 = 0; var5 < field_h; var5++) {
          field_g[var5] = var4;
          var4 = var4 + dma.field_g;
        }
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        field_d = false;
        field_k = new int[2048];
        field_e = new int[2048];
        field_c = new int[2048];
        field_g = new int[1024];
        field_b = 0;
        field_i = new int[512];
        for (var0 = 1; var0 < 512; var0++) {
          field_i[var0] = 32768 / var0;
        }
        for (var0Lifetime1 = 1; var0Lifetime1 < 2048; var0Lifetime1++) {
          field_c[var0Lifetime1] = 65536 / var0Lifetime1;
        }
        for (var0Lifetime2 = 0; var0Lifetime2 < 2048; var0Lifetime2++) {
          field_e[var0Lifetime2] = (int)(65536.0 * Math.sin((double)var0Lifetime2 * 0.0030679615));
          field_k[var0Lifetime2] = (int)(65536.0 * Math.cos((double)var0Lifetime2 * 0.0030679615));
        }
    }
}
