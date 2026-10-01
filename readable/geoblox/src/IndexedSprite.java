/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexedSprite extends ha {
    int[] palette;
    byte[] indices;

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    final void a(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_b;
        param1 = param1 + this.field_f;
        int var3 = param0 + param1 * SoftwareRasterizer.stride;
        int var4 = 0;
        int var5 = this.field_d;
        int var6 = this.field_a;
        int var7 = SoftwareRasterizer.stride - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
            var9 = SoftwareRasterizer.clipTop - param1;
            var5 = var5 - var9;
            param1 = SoftwareRasterizer.clipTop;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * SoftwareRasterizer.stride;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
            var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
            var9 = SoftwareRasterizer.clipLeft - param0;
            var6 = var6 - var9;
            param0 = SoftwareRasterizer.clipLeft;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
            var9 = param0 + var6 - SoftwareRasterizer.clipRight;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            IndexedSprite.a(SoftwareRasterizer.framebuffer, this.indices, this.palette, 0, var4, var3, var6, var5, var7, var8);
            return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        param0 = param0 + this.field_b;
        param1 = param1 + this.field_f;
        int var4 = param0 + param1 * SoftwareRasterizer.stride;
        int var5 = 0;
        int var6 = this.field_d;
        int var7 = this.field_a;
        int var8 = SoftwareRasterizer.stride - var7;
        int var9 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
            var10 = SoftwareRasterizer.clipTop - param1;
            var6 = var6 - var10;
            param1 = SoftwareRasterizer.clipTop;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * SoftwareRasterizer.stride;
        }
        if (param1 + var6 > SoftwareRasterizer.clipBottom) {
            var6 = var6 - (param1 + var6 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
            var10 = SoftwareRasterizer.clipLeft - param0;
            var7 = var7 - var10;
            param0 = SoftwareRasterizer.clipLeft;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (param0 + var7 > SoftwareRasterizer.clipRight) {
            var10 = param0 + var7 - SoftwareRasterizer.clipRight;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
        }
        if (var7 > 0) {
            if (var6 <= 0) {
                return;
            }
            IndexedSprite.b(SoftwareRasterizer.framebuffer, this.indices, this.palette, var5, var4, var7, var6, var8, var9, param2);
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
            param4 = param7;
            if (param2 > 0) {
              if (param1[param2 - 1] == -1) {
                param4--;
                param2++;
                param3++;
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
                    incrementValue$14 = param2;
                    param2++;
                    param0 = param1[incrementValue$14] & 255;
                    param4--;
                    param0 = param0 + param0;
                    if (param0 > param4) {
                      param0 = param4;
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

    final void b(int param0, int param1) {
        int var9 = 0;
        param0 = param0 + this.field_b;
        param1 = param1 + this.field_f;
        int var3 = param0 + param1 * SoftwareRasterizer.stride;
        int var4 = 0;
        int var5 = this.field_d;
        int var6 = this.field_a;
        int var7 = SoftwareRasterizer.stride - var6;
        int var8 = 0;
        if (param1 < SoftwareRasterizer.clipTop) {
            var9 = SoftwareRasterizer.clipTop - param1;
            var5 = var5 - var9;
            param1 = SoftwareRasterizer.clipTop;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * SoftwareRasterizer.stride;
        }
        if (param1 + var5 > SoftwareRasterizer.clipBottom) {
            var5 = var5 - (param1 + var5 - SoftwareRasterizer.clipBottom);
        }
        if (param0 < SoftwareRasterizer.clipLeft) {
            var9 = SoftwareRasterizer.clipLeft - param0;
            var6 = var6 - var9;
            param0 = SoftwareRasterizer.clipLeft;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (param0 + var6 > SoftwareRasterizer.clipRight) {
            var9 = param0 + var6 - SoftwareRasterizer.clipRight;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            IndexedSprite.a(0, this.indices, var4, var3, 0, SoftwareRasterizer.framebuffer, this.palette, var6, var7, var8, 0, var5);
            return;
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
                incrementValue$2 = param4;
                param4++;
                param3 = param1[incrementValue$2];
                if (param3 == 0) {
                  param5++;
                } else {
                  incrementValue$3 = param5;
                  param5++;
                  param0[incrementValue$3] = param2[param3 & 255];
                }
                incrementValue$4 = param4;
                param4++;
                param3 = param1[incrementValue$4];
                if (param3 == 0) {
                  param5++;
                } else {
                  incrementValue$5 = param5;
                  param5++;
                  param0[incrementValue$5] = param2[param3 & 255];
                }
                incrementValue$6 = param4;
                param4++;
                param3 = param1[incrementValue$6];
                if (param3 == 0) {
                  param5++;
                } else {
                  incrementValue$7 = param5;
                  param5++;
                  param0[incrementValue$7] = param2[param3 & 255];
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

    IndexedSprite(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_e = param0;
        this.field_c = param1;
        this.field_b = param2;
        this.field_f = param3;
        this.field_a = param4;
        this.field_d = param5;
        this.indices = param6;
        this.palette = param7;
    }

    IndexedSprite(int param0, int param1, int param2) {
        this.field_a = param0;
        this.field_e = param0;
        this.field_d = param1;
        this.field_c = param1;
        this.field_f = 0;
        this.field_b = 0;
        this.indices = new byte[param0 * param1];
        this.palette = new int[param2];
    }
}
