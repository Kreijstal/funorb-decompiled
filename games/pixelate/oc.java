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
        Object var3 = null;
        ((oc) this).field_P = new tf[]{this.a(((oc) this).field_Z, ((oc) this).field_I, (byte) -121), this.a(((oc) this).field_V, ((oc) this).field_T, (byte) -125)};
        if (param0 <= 73) {
          var3 = null;
          ((oc) this).a(59, -16, -71, (ng) null);
          ((oc) this).field_F = this.c(true);
          ((oc) this).field_K = ((oc) this).field_F.e();
          ((oc) this).field_L = new tf(((oc) this).field_C >> -1648378015, ((oc) this).field_C);
          return;
        } else {
          ((oc) this).field_F = this.c(true);
          ((oc) this).field_K = ((oc) this).field_F.e();
          ((oc) this).field_L = new tf(((oc) this).field_C >> -1648378015, ((oc) this).field_C);
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
        var2 = ((oc) this).field_C >> 1529768609;
        if (!param0) {
          ((oc) this).a(-24, 16, 122, (byte) -10);
          var10 = new tf(var2, ((oc) this).field_C);
          h.a(-72, var10);
          var4 = 0;
          L0: while (true) {
            if (((oc) this).field_C <= var4) {
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
                    var6 = (double)var5 * (double)var5 / (double)((((oc) this).field_C + -var4) * var4);
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
          var11 = new tf(var2, ((oc) this).field_C);
          h.a(-72, var11);
          var4 = 0;
          L4: while (true) {
            if (((oc) this).field_C <= var4) {
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
                    var6 = (double)var5 * (double)var5 / (double)((((oc) this).field_C + -var4) * var4);
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
        bn.field_I.a((ak) (Object) param0, (byte) 26);
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
          var6 = ((oc) this).field_z + param2;
          var7 = ((oc) this).field_p + param0;
          this.a(((oc) this).field_P[0], 1177347297, var6, var7);
          if (65536 > ((oc) this).field_Q) {
            hp.a(var6 + (((oc) this).field_E * ((oc) this).field_Q >> -2029193488), ((oc) this).field_C + var7, var6 + ((oc) this).field_E, (byte) -126, var7);
            this.a(((oc) this).field_P[1], 1177347297, var6, var7);
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
        ((oc) this).field_Z = param1;
        ((oc) this).field_V = (16711422 & param1) >> -1145291679;
        if (param0 <= 87) {
          field_O = null;
          ((oc) this).field_I = param2;
          ((oc) this).field_T = param2 >> -2002775423 & 8355711;
          this.d((byte) 120);
          return;
        } else {
          ((oc) this).field_I = param2;
          ((oc) this).field_T = param2 >> -2002775423 & 8355711;
          this.d((byte) 120);
          return;
        }
    }

    final void a(int param0, int param1, int param2, ng param3) {
        L0: {
          if (!((oc) this).field_Y) {
            break L0;
          } else {
            ((oc) this).field_R = ((oc) this).field_R + 1;
            if (2 * ((oc) this).field_M < ((oc) this).field_R) {
              ((oc) this).field_R = ((oc) this).field_R - ((oc) this).field_M * 2;
              break L0;
            } else {
              if (param0 == 40) {
                return;
              } else {
                ((oc) this).field_Q = 103;
                return;
              }
            }
          }
        }
        if (param0 != 40) {
          ((oc) this).field_Q = 103;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 94, param2, param3, param4);
        this.d((byte) 96);
        if (param1 < 19) {
            ((oc) this).field_M = -109;
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
          field_U = null;
          var15 = new tf(2 * ((oc) this).field_M, ((oc) this).field_C);
          h.a(-66, var15);
          var5 = ((oc) this).field_C >> 1177347297;
          var6 = 0;
          L0: while (true) {
            if (((oc) this).field_C <= var6) {
              ia.a((byte) 92);
              return var15;
            } else {
              L1: {
                var7 = (2 * ((oc) this).field_M - 1) * (var6 >> -434876063) % (2 * ((oc) this).field_M);
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
                t.b(var7, var6, ((oc) this).field_M, var12);
                t.b(-(((oc) this).field_M * 2) + var7, var6, ((oc) this).field_M, var12);
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
              t.b(((oc) this).field_M + var7, var6, ((oc) this).field_M, var12);
              t.b(-((oc) this).field_M + var7, var6, ((oc) this).field_M, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          var16 = new tf(2 * ((oc) this).field_M, ((oc) this).field_C);
          h.a(-66, var16);
          var5 = ((oc) this).field_C >> 1177347297;
          var6 = 0;
          L3: while (true) {
            if (((oc) this).field_C <= var6) {
              ia.a((byte) 92);
              return var16;
            } else {
              L4: {
                var7 = (2 * ((oc) this).field_M - 1) * (var6 >> -434876063) % (2 * ((oc) this).field_M);
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
                t.b(var7, var6, ((oc) this).field_M, var12);
                t.b(-(((oc) this).field_M * 2) + var7, var6, ((oc) this).field_M, var12);
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
              t.b(((oc) this).field_M + var7, var6, ((oc) this).field_M, var12);
              t.b(-((oc) this).field_M + var7, var6, ((oc) this).field_M, var12);
              var6++;
              continue L3;
            }
          }
        }
    }

    private final void a(tf param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        var5 = param2 + ((oc) this).field_E;
        if (param1 == 1177347297) {
          hp.a(((oc) this).field_F.field_F + param2, ((oc) this).field_C + param3, var5 - ((oc) this).field_F.field_F, (byte) -112, param3);
          var6 = param2 - ((oc) this).field_R;
          L0: while (true) {
            if (var5 <= var6) {
              L1: {
                ia.a((byte) 92);
                if (((oc) this).field_F.field_F + param2 >= t.field_e) {
                  h.a(-122, ((oc) this).field_L);
                  param0.b(-((oc) this).field_R, 0);
                  param0.b(-((oc) this).field_R + ((oc) this).field_M * 2, 0);
                  ((oc) this).field_K.g(0, 0);
                  ia.a((byte) 92);
                  ((oc) this).field_L.b(param2, param3);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-((oc) this).field_F.field_F + var5 <= t.field_h) {
                  h.a(param1 + -1177347371, ((oc) this).field_L);
                  var7 = ((oc) this).field_E - (((oc) this).field_F.field_F + -((oc) this).field_R);
                  L3: while (true) {
                    if (((oc) this).field_M * 2 >= var7) {
                      param0.b(-var7, 0);
                      param0.b(-var7 + ((oc) this).field_M * 2, 0);
                      ((oc) this).field_F.g(0, 0);
                      ia.a((byte) 92);
                      ((oc) this).field_L.b(-((oc) this).field_F.field_F + var5, param3);
                      break L2;
                    } else {
                      var7 = var7 - 2 * ((oc) this).field_M;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              return;
            } else {
              param0.b(var6, param3);
              var6 = var6 + param0.field_F;
              continue L0;
            }
          }
        } else {
          ((oc) this).field_M = -54;
          hp.a(((oc) this).field_F.field_F + param2, ((oc) this).field_C + param3, var5 - ((oc) this).field_F.field_F, (byte) -112, param3);
          var6 = param2 - ((oc) this).field_R;
          L4: while (true) {
            if (var5 <= var6) {
              L5: {
                ia.a((byte) 92);
                if (((oc) this).field_F.field_F + param2 >= t.field_e) {
                  h.a(-122, ((oc) this).field_L);
                  param0.b(-((oc) this).field_R, 0);
                  param0.b(-((oc) this).field_R + ((oc) this).field_M * 2, 0);
                  ((oc) this).field_K.g(0, 0);
                  ia.a((byte) 92);
                  ((oc) this).field_L.b(param2, param3);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (-((oc) this).field_F.field_F + var5 <= t.field_h) {
                  h.a(param1 + -1177347371, ((oc) this).field_L);
                  var7 = ((oc) this).field_E - (((oc) this).field_F.field_F + -((oc) this).field_R);
                  L7: while (true) {
                    if (((oc) this).field_M * 2 >= var7) {
                      param0.b(-var7, 0);
                      param0.b(-var7 + ((oc) this).field_M * 2, 0);
                      ((oc) this).field_F.g(0, 0);
                      ia.a((byte) 92);
                      ((oc) this).field_L.b(-((oc) this).field_F.field_F + var5, param3);
                      break L6;
                    } else {
                      var7 = var7 - 2 * ((oc) this).field_M;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              }
              return;
            } else {
              param0.b(var6, param3);
              var6 = var6 + param0.field_F;
              continue L4;
            }
          }
        }
    }

    private oc(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((oc) this).field_V = param7;
        ((oc) this).field_T = param8;
        ((oc) this).field_Z = param5;
        ((oc) this).field_I = param6;
        ((oc) this).field_M = param4;
        ((oc) this).a(param2, (byte) 33, param1, param0, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new de[18];
        hb.a(true, 127, 0, 590, new int[11], 30, 50);
        hb.a(true, 175, 1, 460, new int[6], 30, 180);
        hb.a(true, 175, 2, 460, new int[7], 30, 180);
        hb.a(true, 175, 4, 460, new int[6], 30, 180);
        hb.a(true, 410, 5, 610, new int[2], 30, 30);
        hb.a(true, 410, 6, 460, new int[2], 30, 180);
        hb.a(true, 420, 7, 460, new int[3], 30, 70);
        hb.a(true, 420, 8, 460, new int[2], 30, 180);
        hb.a(true, 420, 9, 460, new int[2], 30, 180);
        hb.a(true, 260, 10, 460, new int[2], 30, 180);
        hb.a(true, 420, 11, 460, new int[1], 30, 180);
        hb.a(true, 175, 12, 460, new int[0], 30, 180);
        hb.a(true, 420, 13, 460, new int[2], 30, 180);
        hb.a(true, 360, 16, 460, new int[3], 30, 180);
        hb.a(true, 420, 17, 460, new int[1], 30, 180);
        hb.a(true, 175, 14, 460, new int[0], 30, 180);
        field_S = fi.a(600);
        field_W = fi.a(180);
        field_N = fi.a(300);
        field_X = "Play free version";
    }
}
