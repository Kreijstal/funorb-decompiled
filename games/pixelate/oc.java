/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends ng {
    private int field_I;
    static tf field_W;
    private int field_T;
    static tf field_N;
    private tf field_K;
    boolean field_Y;
    private tf field_L;
    private tf field_F;
    private int field_M;
    static de[] field_H;
    static tf field_S;
    private int field_V;
    private int field_Z;
    private int field_R;
    int field_Q;
    private tf[] field_P;
    static boolean field_G;
    static ak field_U;
    static boolean field_J;
    static ak field_O;
    static String field_X;

    private final void d(byte param0) {
        ng var3 = null;
        this.field_P = new tf[]{this.a(this.field_Z, this.field_I, (byte) -121), this.a(this.field_V, this.field_T, (byte) -125)};
        if (param0 <= 73) {
          var3 = (ng) null;
          this.a(59, -16, -71, (ng) null);
          this.field_F = this.c(true);
          this.field_K = this.field_F.e();
          this.field_L = new tf(this.field_C >> -1648378015, this.field_C);
          return;
        } else {
          this.field_F = this.c(true);
          this.field_K = this.field_F.e();
          this.field_L = new tf(this.field_C >> -1648378015, this.field_C);
          return;
        }
    }

    public static void a(byte param0) {
        field_U = null;
        field_H = null;
        if (param0 != -9) {
          return;
        } else {
          field_N = null;
          field_S = null;
          field_O = null;
          field_W = null;
          field_X = null;
          return;
        }
    }

    private final tf c(boolean param0) {
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        tf var10 = null;
        tf var11 = null;
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        var2 = this.field_C >> 1529768609;
        if (!param0) {
          this.a(-24, 16, 122, (byte) -10);
          var10 = new tf(var2, this.field_C);
          h.a(-72, var10);
          var4 = 0;
          L0: while (true) {
            if (this.field_C <= var4) {
              ia.a((byte) 92);
              return var10;
            } else {
              var5 = 0;
              L1: while (true) {
                if (var2 <= var5) {
                  var4++;
                  continue L0;
                } else {
                  L2: {
                    var6 = (double)var5 * (double)var5 / (double)((this.field_C + -var4) * var4);
                    var8 = 1;
                    if (var6 < 1.0) {
                      L3: {
                        var6 = Math.sqrt(-var6 + 1.0);
                        if (1.0 <= var6) {
                          stackOut_22_0 = 255;
                          stackIn_23_0 = stackOut_22_0;
                          break L3;
                        } else {
                          stackOut_21_0 = (int)(var6 * 255.0);
                          stackIn_23_0 = stackOut_21_0;
                          break L3;
                        }
                      }
                      var8 = stackIn_23_0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  t.a(var5, var4, var8 << -1687818648 | var8 | var8 << -235718512);
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } else {
          var11 = new tf(var2, this.field_C);
          h.a(-72, var11);
          var4 = 0;
          L4: while (true) {
            if (this.field_C <= var4) {
              ia.a((byte) 92);
              return var11;
            } else {
              var5 = 0;
              L5: while (true) {
                if (var2 <= var5) {
                  var4++;
                  continue L4;
                } else {
                  L6: {
                    var6 = (double)var5 * (double)var5 / (double)((this.field_C + -var4) * var4);
                    var8 = 1;
                    if (var6 < 1.0) {
                      L7: {
                        var6 = Math.sqrt(-var6 + 1.0);
                        if (1.0 <= var6) {
                          stackOut_9_0 = 255;
                          stackIn_10_0 = stackOut_9_0;
                          break L7;
                        } else {
                          stackOut_8_0 = (int)(var6 * 255.0);
                          stackIn_10_0 = stackOut_8_0;
                          break L7;
                        }
                      }
                      var8 = stackIn_10_0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  t.a(var5, var4, var8 << -1687818648 | var8 | var8 << -235718512);
                  var5++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final static void a(te param0, boolean param1) {
        if (!param1) {
            return;
        }
        try {
            bn.field_I.a(param0, (byte) 26);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "oc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    oc(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 250501985, (16711422 & param6) >> -1947667999);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param1 == 0) {
          var5 = 19 % ((param3 - 70) / 49);
          var6 = this.field_z + param2;
          var7 = this.field_p + param0;
          this.a(this.field_P[0], 1177347297, var6, var7);
          if (65536 > this.field_Q) {
            hp.a(var6 + (this.field_E * this.field_Q >> -2029193488), this.field_C + var7, var6 + this.field_E, (byte) -126, var7);
            this.a(this.field_P[1], 1177347297, var6, var7);
            ia.a((byte) 92);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        this.field_Z = param1;
        this.field_V = (16711422 & param1) >> -1145291679;
        if (param0 <= 87) {
          field_O = (ak) null;
          this.field_I = param2;
          this.field_T = param2 >> -2002775423 & 8355711;
          this.d((byte) 120);
          return;
        } else {
          this.field_I = param2;
          this.field_T = param2 >> -2002775423 & 8355711;
          this.d((byte) 120);
          return;
        }
    }

    final void a(int param0, int param1, int param2, ng param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_Y) {
                break L1;
              } else {
                this.field_R = this.field_R + 1;
                if (2 * this.field_M < this.field_R) {
                  this.field_R = this.field_R - this.field_M * 2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 40) {
              break L0;
            } else {
              this.field_Q = 103;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("oc.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 94, param2, param3, param4);
        this.d((byte) 96);
        if (param1 < 19) {
            this.field_M = -109;
        }
    }

    private final tf a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        tf var15 = null;
        tf var16 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var13 = Pixelate.field_H ? 1 : 0;
        if (param2 >= -119) {
          field_U = (ak) null;
          var15 = new tf(2 * this.field_M, this.field_C);
          h.a(-66, var15);
          var5 = this.field_C >> 1177347297;
          var6 = 0;
          L0: while (true) {
            if (this.field_C <= var6) {
              ia.a((byte) 92);
              return var15;
            } else {
              L1: {
                var7 = (2 * this.field_M - 1) * (var6 >> -434876063) % (2 * this.field_M);
                var8 = 16711935 & param0;
                var9 = param0 & 65280;
                var10 = var6 - var5;
                var11 = 128 - -(int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
                if (256 > var11) {
                  stackOut_15_0 = (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> 624566664;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                } else {
                  stackOut_14_0 = var9 | var8;
                  stackIn_16_0 = stackOut_14_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_16_0;
                t.b(var7, var6, this.field_M, var12);
                t.b(-(this.field_M * 2) + var7, var6, this.field_M, var12);
                var9 = param1 & 65280;
                var8 = param1 & 16711935;
                if (var11 >= 256) {
                  stackOut_18_0 = var8 | var9;
                  stackIn_19_0 = stackOut_18_0;
                  break L2;
                } else {
                  stackOut_17_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 2054322600;
                  stackIn_19_0 = stackOut_17_0;
                  break L2;
                }
              }
              var12 = stackIn_19_0;
              t.b(this.field_M + var7, var6, this.field_M, var12);
              t.b(-this.field_M + var7, var6, this.field_M, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          var16 = new tf(2 * this.field_M, this.field_C);
          h.a(-66, var16);
          var5 = this.field_C >> 1177347297;
          var6 = 0;
          L3: while (true) {
            if (this.field_C <= var6) {
              ia.a((byte) 92);
              return var16;
            } else {
              L4: {
                var7 = (2 * this.field_M - 1) * (var6 >> -434876063) % (2 * this.field_M);
                var8 = 16711935 & param0;
                var9 = param0 & 65280;
                var10 = var6 - var5;
                var11 = 128 - -(int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
                if (256 > var11) {
                  stackOut_5_0 = (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> 624566664;
                  stackIn_6_0 = stackOut_5_0;
                  break L4;
                } else {
                  stackOut_4_0 = var9 | var8;
                  stackIn_6_0 = stackOut_4_0;
                  break L4;
                }
              }
              L5: {
                var12 = stackIn_6_0;
                t.b(var7, var6, this.field_M, var12);
                t.b(-(this.field_M * 2) + var7, var6, this.field_M, var12);
                var9 = param1 & 65280;
                var8 = param1 & 16711935;
                if (var11 >= 256) {
                  stackOut_8_0 = var8 | var9;
                  stackIn_9_0 = stackOut_8_0;
                  break L5;
                } else {
                  stackOut_7_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 2054322600;
                  stackIn_9_0 = stackOut_7_0;
                  break L5;
                }
              }
              var12 = stackIn_9_0;
              t.b(this.field_M + var7, var6, this.field_M, var12);
              t.b(-this.field_M + var7, var6, this.field_M, var12);
              var6++;
              continue L3;
            }
          }
        }
    }

    private final void a(tf param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2 + this.field_E;
              if (param1 == 1177347297) {
                break L1;
              } else {
                this.field_M = -54;
                break L1;
              }
            }
            hp.a(this.field_F.field_F + param2, this.field_C + param3, var5_int - this.field_F.field_F, (byte) -112, param3);
            var6 = param2 - this.field_R;
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  ia.a((byte) 92);
                  if (this.field_F.field_F + param2 >= t.field_e) {
                    h.a(-122, this.field_L);
                    param0.b(-this.field_R, 0);
                    param0.b(-this.field_R + this.field_M * 2, 0);
                    this.field_K.g(0, 0);
                    ia.a((byte) 92);
                    this.field_L.b(param2, param3);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-this.field_F.field_F + var5_int <= t.field_h) {
                  h.a(param1 + -1177347371, this.field_L);
                  var7 = this.field_E - (this.field_F.field_F + -this.field_R);
                  L4: while (true) {
                    if (this.field_M * 2 >= var7) {
                      param0.b(-var7, 0);
                      param0.b(-var7 + this.field_M * 2, 0);
                      this.field_F.g(0, 0);
                      ia.a((byte) 92);
                      this.field_L.b(-this.field_F.field_F + var5_int, param3);
                      break L0;
                    } else {
                      var7 = var7 - 2 * this.field_M;
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                param0.b(var6, param3);
                var6 = var6 + param0.field_F;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("oc.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private oc(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_V = param7;
        this.field_T = param8;
        this.field_Z = param5;
        this.field_I = param6;
        this.field_M = param4;
        this.a(param2, (byte) 33, param1, param0, param3);
    }

    static {
        field_H = new de[18];
        hb.a(true, 127, 0, 590, new int[]{28, 1, 5, 20, 21, 27, 6, 4, 3, 22, 19}, 30, 50);
        hb.a(true, 175, 1, 460, new int[]{2, 20, 21, 27, 5, 9}, 30, 180);
        hb.a(true, 175, 2, 460, new int[]{2, 20, 21, 27, 5, 11, 13}, 30, 180);
        hb.a(true, 175, 4, 460, new int[]{2, 20, 21, 27, 5, 13}, 30, 180);
        hb.a(true, 410, 5, 610, new int[]{23, 8}, 30, 30);
        hb.a(true, 410, 6, 460, new int[]{23, 7}, 30, 180);
        hb.a(true, 420, 7, 460, new int[]{25, 8, 26}, 30, 70);
        hb.a(true, 420, 8, 460, new int[]{8, 23}, 30, 180);
        hb.a(true, 420, 9, 460, new int[]{8, 3}, 30, 180);
        hb.a(true, 260, 10, 460, new int[]{23, 24}, 30, 180);
        hb.a(true, 420, 11, 460, new int[]{7}, 30, 180);
        hb.a(true, 175, 12, 460, new int[]{}, 30, 180);
        hb.a(true, 420, 13, 460, new int[]{33, 34}, 30, 180);
        hb.a(true, 360, 16, 460, new int[]{0, 29, 7}, 30, 180);
        hb.a(true, 420, 17, 460, new int[]{7}, 30, 180);
        hb.a(true, 175, 14, 460, new int[]{}, 30, 180);
        field_S = fi.a(600);
        field_W = fi.a(180);
        field_N = fi.a(300);
        field_X = "Play free version";
    }
}
