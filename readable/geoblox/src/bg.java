/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends m {
    private byte[][] field_K;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var8 = param1 + param2 * SoftwareRasterizer.stride;
        var9 = SoftwareRasterizer.stride - param3;
        var10 = 0;
        var11 = 0;
        if (param2 < SoftwareRasterizer.clipTop) {
          var12 = SoftwareRasterizer.clipTop - param2;
          param4 = param4 - var12;
          param2 = SoftwareRasterizer.clipTop;
          var11 = var11 + var12 * param3;
          var8 = var8 + var12 * SoftwareRasterizer.stride;
        }
        if (param2 + param4 > SoftwareRasterizer.clipBottom) {
          param4 = param4 - (param2 + param4 - SoftwareRasterizer.clipBottom);
        }
        if (param1 < SoftwareRasterizer.clipLeft) {
          var12 = SoftwareRasterizer.clipLeft - param1;
          param3 = param3 - var12;
          param1 = SoftwareRasterizer.clipLeft;
          var11 = var11 + var12;
          var8 = var8 + var12;
          var10 = var10 + var12;
          var9 = var9 + var12;
        }
        if (param1 + param3 > SoftwareRasterizer.clipRight) {
          var12 = param1 + param3 - SoftwareRasterizer.clipRight;
          param3 = param3 - var12;
          var10 = var10 + var12;
          var9 = var9 + var12;
        }
        if (param3 > 0) {
          if (param4 > 0) {
            if (SoftwareRasterizer.field_a == null) {
              bg.a(SoftwareRasterizer.framebuffer, this.field_K[param0], param5, var11, var8, param3, param4, var9, var10);
            } else {
              bg.a(SoftwareRasterizer.framebuffer, this.field_K[param0], param1, param2, param3, param4, param5, var11, var8, var9, var10, SoftwareRasterizer.field_a, SoftwareRasterizer.field_l);
            }
            return;
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int[] param12) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        var13 = param2 - SoftwareRasterizer.clipLeft;
        var14 = param3 - SoftwareRasterizer.clipTop;
        var15 = var14;
        L0: while (true) {
          if (var15 >= var14 + param5) {
            return;
          }
          {
            var16 = param11[var15];
            var17 = param12[var15];
            var18 = param4;
            if (var13 <= var16) {
              var19 = var16 - var13;
              if (var19 >= param4) {
                param7 = param7 + (param4 + param10);
                param8 = param8 + (param4 + param9);
                var15++;
                continue L0;
              }
              param7 = param7 + var19;
              var18 = var18 - var19;
              param8 = param8 + var19;
            } else {
              var19 = var13 - var16;
              if (var19 >= var17) {
                param7 = param7 + (param4 + param10);
                param8 = param8 + (param4 + param9);
                var15++;
                continue L0;
              }
              var17 = var17 - var19;
            }
            var19 = 0;
            if (var18 >= var17) {
              var19 = var18 - var17;
            } else {
              var17 = var18;
            }
            var20 = -var17;
            L3: while (true) {
              if (var20 >= 0) {
                param7 = param7 + (var19 + param10);
                param8 = param8 + (var19 + param9);
                var15++;
                continue L0;
              }
              {
                incrementValue$0 = param7;
                param7++;
                if (param1[incrementValue$0] == 0) {
                  param8++;
                  var20++;
                  continue L3;
                }
                {
                  incrementValue$1 = param8;
                  param8++;
                  SoftwareRasterizer.framebuffer[incrementValue$1] = param6;
                  var20++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var13 = 0;
        int var9 = param1 + param2 * SoftwareRasterizer.stride;
        int var10 = SoftwareRasterizer.stride - param3;
        int var11 = 0;
        int var12 = 0;
        if (param2 < SoftwareRasterizer.clipTop) {
            var13 = SoftwareRasterizer.clipTop - param2;
            param4 = param4 - var13;
            param2 = SoftwareRasterizer.clipTop;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * SoftwareRasterizer.stride;
        }
        if (param2 + param4 > SoftwareRasterizer.clipBottom) {
            param4 = param4 - (param2 + param4 - SoftwareRasterizer.clipBottom);
        }
        if (param1 < SoftwareRasterizer.clipLeft) {
            var13 = SoftwareRasterizer.clipLeft - param1;
            param3 = param3 - var13;
            param1 = SoftwareRasterizer.clipLeft;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (param1 + param3 > SoftwareRasterizer.clipRight) {
            var13 = param1 + param3 - SoftwareRasterizer.clipRight;
            param3 = param3 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
        }
        if (param3 <= 0 || param4 <= 0) {
            return;
        }
        bg.a(SoftwareRasterizer.framebuffer, this.field_K[param0], param5, var12, var9, param3, param4, var10, var11, param6);
    }

    bg(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, byte[][] param5) {
        super(param0, param1, param2, param3, param4);
        this.field_K = new byte[256][];
        this.field_K = param5;
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        int var9;
        int var10;
        int var11;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  }
                  {
                    incrementValue$0 = param3;
                    param3++;
                    if (param1[incrementValue$0] == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    }
                    {
                      incrementValue$1 = param4;
                      param4++;
                      param0[incrementValue$1] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              }
              {
                incrementValue$2 = param3;
                param3++;
                if (param1[incrementValue$2] == 0) {
                  param4++;
                } else {
                  incrementValue$3 = param4;
                  param4++;
                  param0[incrementValue$3] = param2;
                }
                incrementValue$4 = param3;
                param3++;
                if (param1[incrementValue$4] == 0) {
                  param4++;
                } else {
                  incrementValue$5 = param4;
                  param4++;
                  param0[incrementValue$5] = param2;
                }
                incrementValue$6 = param3;
                param3++;
                if (param1[incrementValue$6] == 0) {
                  param4++;
                } else {
                  incrementValue$7 = param4;
                  param4++;
                  param0[incrementValue$7] = param2;
                }
                incrementValue$8 = param3;
                param3++;
                if (param1[incrementValue$8] == 0) {
                  param4++;
                  var11++;
                  continue L1;
                }
                {
                  incrementValue$9 = param4;
                  param4++;
                  param0[incrementValue$9] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        int var12;
        param2 = ((param2 & 16711935) * param9 & -16711936) + ((param2 & 65280) * param9 & 16711680) >> 8;
        param9 = 256 - param9;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          }
          var11 = -param5;
          L1: while (true) {
            if (var11 >= 0) {
              param4 = param4 + param7;
              param3 = param3 + param8;
              var10++;
              continue L0;
            }
            {
              incrementValue$11 = param3;
              param3++;
              if (param1[incrementValue$11] == 0) {
                param4++;
                var11++;
                continue L1;
              }
              {
                var12 = param0[param4];
                incrementValue$12 = param4;
                param4++;
                param0[incrementValue$12] = (((var12 & 16711935) * param9 & -16711936) + ((var12 & 65280) * param9 & 16711680) >> 8) + param2;
                var11++;
                continue L1;
              }
            }
          }
        }
    }
}
