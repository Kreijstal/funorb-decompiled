/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends wp {
    static jn field_E;
    static ci field_G;
    static int field_F;

    wr(String param0, qm param1, boolean param2) {
        this(param0, param1);
        ((wr) this).field_C = param2 ? true : false;
    }

    private wr(String param0, mh param1, qm param2) {
        super(param0, param1, param2);
        ((wr) this).field_w = ks.field_x.field_i;
    }

    final static void a(int param0, ah param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        L0: {
          var15 = Sumoblitz.field_L ? 1 : 0;
          var2 = 588;
          var3 = 428;
          var4 = param1.field_C >> 1751684968;
          var5 = param1.field_z >> 2129928360;
          var6 = param1.field_m >> 1746227656;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = ro.a(var4, var2, 26, 614, var5, false, 26, var6, 26);
          if (var10 == -1) {
            break L0;
          } else {
            L1: {
              if (-1.5707963267948966 < param1.field_s) {
                if (param1.field_s < 1.5707963267948966) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L1;
              }
            }
            var7 = stackIn_7_0;
            var9 = 26;
            var8 = var10;
            break L0;
          }
        }
        L2: {
          if (0 == (var10 ^ -1)) {
            var10 = ro.a(var4, var2, 454, 614, var5, false, 454, var6, 26);
            if (-1 != var10) {
              L3: {
                var8 = var10;
                var9 = 454;
                if (-1.5707963267948966 <= param1.field_s) {
                  if (param1.field_s > 1.5707963267948966) {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L3;
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_18_0 = stackOut_15_0;
                    break L3;
                  }
                } else {
                  stackOut_13_0 = 1;
                  stackIn_18_0 = stackOut_13_0;
                  break L3;
                }
              }
              var7 = stackIn_18_0;
              break L2;
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (0 != var10) {
            break L4;
          } else {
            var10 = ro.a(var4, var3, 26, 26, var5, false, 454, var6, 26);
            if (0 != var10) {
              L5: {
                if (param1.field_s <= 0.0) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L5;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L5;
                }
              }
              var7 = stackIn_25_0;
              var8 = 26;
              var9 = var10;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L6: {
          if (param0 != var10) {
            break L6;
          } else {
            var10 = ro.a(var4, var3, 26, 614, var5, false, 454, var6, 614);
            if ((var10 ^ -1) == 0) {
              break L6;
            } else {
              L7: {
                var9 = var10;
                var8 = 614;
                if (param1.field_s >= 0.0) {
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L7;
                } else {
                  stackOut_29_0 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L7;
                }
              }
              var7 = stackIn_31_0;
              break L6;
            }
          }
        }
        L8: {
          L9: {
            var11 = var4 - var8;
            var12 = -var9 + var5;
            var13 = Math.sqrt((double)(var11 * var11 - -(var12 * var12)));
            if (param1.a(true)) {
              break L9;
            } else {
              if (var7 == 0) {
                ro.a(param1, (byte) 113);
                break L8;
              } else {
                if (param1.field_p == 0) {
                  ro.a(param1, (byte) 113);
                  break L8;
                } else {
                  break L9;
                }
              }
            }
          }
          L10: {
            L11: {
              if ((var4 ^ -1) < -27) {
                break L11;
              } else {
                if (0 > param1.field_E) {
                  param1.field_E = -param1.field_E;
                  if (-1 == param1.field_E) {
                    param1.field_E = 256;
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  break L11;
                }
              }
            }
            if (rj.field_c + -52 >= var4) {
              break L10;
            } else {
              if ((param1.field_E ^ -1) < -1) {
                param1.field_E = -param1.field_E;
                if (param1.field_E != -1) {
                  break L10;
                } else {
                  param1.field_E = -256;
                  break L10;
                }
              } else {
                break L10;
              }
            }
          }
          L12: {
            if (var5 > 26) {
              break L12;
            } else {
              if (param1.field_A >= 0) {
                break L12;
              } else {
                param1.field_A = -param1.field_A;
                if (-1 == (param1.field_A ^ -1)) {
                  param1.field_A = 256;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
          }
          if (-52 + rl.field_k >= var5) {
            break L8;
          } else {
            if ((param1.field_A ^ -1) < -1) {
              param1.field_A = -param1.field_A;
              if (0 != param1.field_A) {
                break L8;
              } else {
                param1.field_A = 256;
                break L8;
              }
            } else {
              break L8;
            }
          }
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != 454) {
            field_E = null;
        }
        field_E = null;
    }

    private wr(String param0, qm param1) {
        this(param0, ks.field_x.field_h, param1);
        ((wr) this).field_w = ks.field_x.field_i;
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        vr.a((java.awt.Component) (Object) param1, -1);
        pl.a((java.awt.Component) (Object) param1, 7);
        if (!param0) {
            field_F = -67;
        }
        if (!(as.field_w == null)) {
            as.field_w.a((java.awt.Component) (Object) param1, (byte) 76);
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        ((wr) this).field_C = !((wr) this).field_C ? true : false;
        super.b(param0, param1, param2, param3);
    }

    final static wc a(boolean param0, fs param1, boolean param2) {
        ah[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ah var15 = null;
        int var16 = 0;
        ah[] var17 = null;
        int stackIn_10_0 = 0;
        fs stackIn_14_0 = null;
        fs stackIn_15_0 = null;
        fs stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        fs stackIn_17_0 = null;
        fs stackIn_18_0 = null;
        fs stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        fs stackOut_13_0 = null;
        fs stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        fs stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        fs stackOut_16_0 = null;
        fs stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        fs stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          var16 = Sumoblitz.field_L ? 1 : 0;
          if (!param0) {
            param1.field_p = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var17 = new ah[100];
          var3 = var17;
          var4 = 1;
          var5 = param1.e(-31302);
          var6 = 0;
          if (var5 >= -2) {
            break L1;
          } else {
            var6 = param1.e(-31302);
            break L1;
          }
        }
        L2: {
          var7 = param2 ? 1 : 0;
          if (var5 > 3) {
            L3: {
              if (-2 == param1.e(-31302)) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var7 = stackIn_10_0;
            break L2;
          } else {
            break L2;
          }
        }
        var8 = param1.e(-31302);
        var9 = 0;
        L4: while (true) {
          if (var9 >= var8) {
            return new wc(var17, var6, var7 != 0);
          } else {
            L5: {
              var10 = param1.e(-31302);
              var11 = param1.e(-31302);
              stackOut_13_0 = (fs) param1;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (param2) {
                stackOut_15_0 = (fs) (Object) stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L5;
              } else {
                stackOut_14_0 = (fs) (Object) stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L5;
              }
            }
            L6: {
              var12 = ((fs) (Object) stackIn_16_0).c(stackIn_16_1 != 0);
              var13 = param1.c(true);
              stackOut_16_0 = (fs) param1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (param2) {
                stackOut_18_0 = (fs) (Object) stackIn_18_0;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L6;
              } else {
                stackOut_17_0 = (fs) (Object) stackIn_17_0;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L6;
              }
            }
            L7: {
              byte discarded$1 = ((fs) (Object) stackIn_19_0).d(stackIn_19_1 != 0);
              var14 = 0;
              if (-5 > var5) {
                var14 = param1.e(-31302);
                break L7;
              } else {
                break L7;
              }
            }
            if (-1 <= var10) {
              if ((var10 ^ -1) > -9) {
                if ((var11 ^ -1) <= -1) {
                  if (var11 < 7) {
                    var15 = uj.a(var10, var12, var11, (byte) 84, var13);
                    var15.field_F = var14;
                    var4++;
                    var3[var4] = var15;
                    var9++;
                    continue L4;
                  } else {
                    var9++;
                    continue L4;
                  }
                } else {
                  var9++;
                  continue L4;
                }
              } else {
                var9++;
                continue L4;
              }
            } else {
              var9++;
              continue L4;
            }
          }
        }
    }

    final static vk a(fr param0, int param1, String param2, int param3) {
        if (param3 != -24674) {
            return null;
        }
        int var4 = jaggl.OpenGL.glGenProgramARB();
        jaggl.OpenGL.glBindProgramARB(param1, var4);
        jaggl.OpenGL.glProgramStringARB(param1, 34933, param2);
        jaggl.OpenGL.glGetIntegerv(34379, mb.field_h, 0);
        if ((mb.field_h[0] ^ -1) != 0) {
            jaggl.OpenGL.glBindProgramARB(param1, 0);
            return null;
        }
        jaggl.OpenGL.glBindProgramARB(param1, 0);
        return new vk(param0, param1, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new jn();
    }
}
