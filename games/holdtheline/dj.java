/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class dj extends ub {
    private String field_K;
    private int field_I;
    private int field_G;
    private qi field_J;
    static String field_N;
    private boolean field_M;
    private int field_L;
    static String field_H;

    final String f(int param0) {
        int var2 = ((dj) this).field_B.field_p ? 1 : 0;
        ((dj) this).field_B.field_p = ((dj) this).field_p;
        String var3 = ((dj) this).field_B.f(param0);
        ((dj) this).field_B.field_p = var2 != 0 ? true : false;
        return var3;
    }

    final static void a(boolean param0, String param1, int param2, String param3) {
        o.field_d = param1;
        ec.field_v = param3;
        da.a(param0, qd.field_g, 22676);
        if (param2 >= -5) {
            dj.h(108);
        }
    }

    dj(int param0, int param1, int param2, int param3, n param4, boolean param5, int param6, int param7, qi param8, int param9, String param10) {
        super(param0, param1, param2, param3, (dh) null, (tb) null);
        ((dj) this).field_J = param8;
        ((dj) this).field_K = param10;
        ((dj) this).field_I = param9;
        ((dj) this).field_L = param6;
        ((dj) this).field_B = param4;
        ((dj) this).field_G = param7;
        ((dj) this).field_M = param5 ? true : false;
        int var12 = -((dj) this).field_G + ((dj) this).field_L;
        int var13 = ((dj) this).field_J.b(param10, var12, ((dj) this).field_J.field_G) - -(((dj) this).field_G * 2);
        if (var13 <= param3) {
            var13 = param3;
        } else {
            ((dj) this).a(param0, (byte) 122, param1, var13, param2);
        }
        int var14 = !((dj) this).field_M ? ((dj) this).field_L + 2 * ((dj) this).field_G : 0;
        ((dj) this).field_B.a(var14, (byte) 122, (-param3 + var13 >> -755336223) + ((dj) this).field_G, param3 + -(((dj) this).field_G * 2), param2 - ((dj) this).field_L + -(((dj) this).field_G * 3));
    }

    public static void h(int param0) {
        if (param0 != 18701) {
            dj.b(-116, -1);
        }
        field_H = null;
        field_N = null;
    }

    final static void a(int param0, vk param1, boolean param2) {
        int var3 = 0;
        wd var4 = null;
        qm var5 = null;
        qm var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var15 = HoldTheLine.field_D;
          if (param1.field_o != 0) {
            if ((param1.field_o ^ -1) != -2) {
              if (param1.field_o == 2) {
                a.field_F.field_b.b(0, 0);
                mn.a(param1.field_u, (vd) (Object) new qd(lk.field_a.field_b), (byte) -40);
                break L0;
              } else {
                if (param1.field_o == 3) {
                  kc.field_b.field_b.b(0, 0);
                  mn.a(param1.field_u, (vd) (Object) new qd(ug.field_b.field_b, 0.5f), (byte) -102);
                  break L0;
                } else {
                  if (4 == param1.field_o) {
                    ug.field_b.field_b.b(0, 0);
                    mn.a(param1.field_u, (vd) (Object) new qd(ha.field_i.field_b, 0.5f), (byte) -30);
                    break L0;
                  } else {
                    if (-6 != (param1.field_o ^ -1)) {
                      if ((param1.field_o ^ -1) != -7) {
                        break L0;
                      } else {
                        hg.field_Q.field_b.b(0, 0);
                        tn.a(param1.field_u, 10000536, (vd) (Object) new qd(fd.field_e.field_b));
                        break L0;
                      }
                    } else {
                      ha.field_i.field_b.b(0, 0);
                      mn.a(param1.field_u, (vd) (Object) new qd(kc.field_b.field_b, 0.5f), (byte) -125);
                      break L0;
                    }
                  }
                }
              }
            } else {
              a.field_F.field_b.b(0, 0);
              mn.a(param1.field_u, (vd) (Object) new qd(hf.field_h.field_b), (byte) -15);
              break L0;
            }
          } else {
            ol.field_h.field_b.b(0, 0);
            mn.a(param1.field_u, (vd) (Object) new qd(fd.field_e.field_b), (byte) -23);
            break L0;
          }
        }
        L1: {
          if (-3 == param0) {
            break L1;
          } else {
            if (param0 != 6) {
              L2: {
                if (2 != param1.field_p) {
                  if (-2 == param1.field_p) {
                    stackOut_21_0 = 13941600;
                    stackIn_22_0 = stackOut_21_0;
                    break L2;
                  } else {
                    stackOut_20_0 = 16777215;
                    stackIn_22_0 = stackOut_20_0;
                    break L2;
                  }
                } else {
                  stackOut_18_0 = 8372223;
                  stackIn_22_0 = stackOut_18_0;
                  break L2;
                }
              }
              var3 = stackIn_22_0;
              var4 = param1.field_u[0];
              var5 = var4.c(true);
              var6 = var4.o(-14);
              var7 = (float)((var6.field_h + var5.field_h) / 2) + 0.5f;
              var8 = (float)((var6.field_f + var5.field_f) / 2) + 0.5f;
              var9 = (float)(var6.field_h - var5.field_h);
              var10 = (float)(var6.field_f - var5.field_f);
              var11 = (float)Math.sqrt((double)(var9 * var9 + var10 * var10));
              var10 = var10 / var11;
              var9 = var9 / var11;
              var12 = (int)(6.0f + var11) / 12;
              var19 = new int[8];
              var18 = var19;
              var17 = var18;
              var16 = var17;
              var13 = var16;
              var14 = -var12;
              L3: while (true) {
                if (var12 <= var14) {
                  break L1;
                } else {
                  var13[3] = (int)(var10 * (float)(6 + 6 * var14) + var8 - var9 * 0.0f);
                  var13[5] = (int)(var8 + (float)(var14 * 6 + 6) * var10 - 6.0f * var9);
                  var13[0] = (int)(var9 * (float)(6 * var14) + var7 + var10 * 0.0f);
                  var13[4] = (int)(var7 + (float)(6 * var14 + 6) * var9 + 6.0f * var10);
                  var13[6] = (int)(var10 * 6.0f + (var9 * (float)(6 * var14) + var7));
                  var13[1] = (int)(-(var9 * 0.0f) + (var10 * (float)(var14 * 6) + var8));
                  var13[2] = (int)(var10 * 0.0f + (var7 + (float)(6 + 6 * var14) * var9));
                  var13[7] = (int)(-(6.0f * var9) + (var10 * (float)(var14 * 6) + var8));
                  var14++;
                  gf.a(var19, var3);
                  var13[7] = (int)(var8 + (float)(var14 * 6) * var10 + 6.0f * var9);
                  var13[1] = (int)(0.0f * var9 + (var10 * (float)(var14 * 6) + var8));
                  var13[5] = (int)(var8 + (float)(var14 * 6 + 6) * var10 + var9 * 6.0f);
                  var13[2] = (int)(-(0.0f * var10) + ((float)(6 + var14 * 6) * var9 + var7));
                  var13[4] = (int)(-(var10 * 6.0f) + (var7 + (float)(6 + var14 * 6) * var9));
                  var13[0] = (int)(-(0.0f * var10) + (var7 + var9 * (float)(var14 * 6)));
                  var13[3] = (int)(var9 * 0.0f + (var8 + (float)(6 + var14 * 6) * var10));
                  var13[6] = (int)(-(var10 * 6.0f) + (var7 + (float)(var14 * 6) * var9));
                  gf.a(var19, var3);
                  var14++;
                  continue L3;
                }
              }
            } else {
              break L1;
            }
          }
        }
        L4: {
          if (!param2) {
            break L4;
          } else {
            field_N = null;
            break L4;
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HoldTheLine.field_D;
          if (param1 == 28433) {
            break L0;
          } else {
            field_N = null;
            break L0;
          }
        }
        L1: {
          var2 = 0;
          var3 = cf.field_q;
          if (-6 < (var3 ^ -1)) {
            var2 = var3 * var3 * 8192 / 1100;
            break L1;
          } else {
            if (var3 < 105) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L1;
            } else {
              if (120 <= var3) {
                break L1;
              } else {
                var3 = -var3 + 120;
                var2 = -(8192 * (var3 * var3) / 3300) + 8192;
                break L1;
              }
            }
          }
        }
        L2: {
          var4 = 1;
          var5 = 0;
          if (-4 == param0) {
            var4 = -1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (-2 != param0) {
            break L3;
          } else {
            var5 = 1;
            break L3;
          }
        }
        L4: {
          if (-5 != (param0 ^ -1)) {
            break L4;
          } else {
            var5 = 1;
            var4 = 1;
            break L4;
          }
        }
        L5: {
          if (param0 != 5) {
            break L5;
          } else {
            var5 = 1;
            var4 = -1;
            break L5;
          }
        }
        L6: {
          if (6 != param0) {
            break L6;
          } else {
            var4 = 1;
            var5 = -1;
            break L6;
          }
        }
        L7: {
          L8: {
            if (-8 == (param0 ^ -1)) {
              break L8;
            } else {
              if (param0 == 8) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var4 = -1;
          var5 = -1;
          break L7;
        }
        L9: {
          if (11 != param0) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (12 == param0) {
            var5 = -1;
            var4 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (param0 != 13) {
            break L11;
          } else {
            var4 = 1;
            var5 = -1;
            break L11;
          }
        }
        L12: {
          if (param0 != 14) {
            break L12;
          } else {
            var4 = -1;
            var5 = 1;
            break L12;
          }
        }
        L13: {
          if (-16 == (param0 ^ -1)) {
            var4 = 1;
            var5 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        fe.field_b = ti.a(var2 * var5, var4 * var2, (byte) -90);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        qi stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        qi stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        qi stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        qi stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        qi stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        qi stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        L0: {
          if (param0 == -9532) {
            break L0;
          } else {
            ((dj) this).field_K = null;
            break L0;
          }
        }
        var5 = ((dj) this).field_k + param2;
        var6 = ((dj) this).field_o + param1;
        super.a(param0 ^ 0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          L1: {
            if (!((dj) this).field_M) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              stackOut_4_0 = -(((dj) this).field_G * 2) + (-((dj) this).field_L + ((dj) this).field_x);
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
          }
          L2: {
            var7 = stackIn_6_0;
            stackOut_6_0 = ((dj) this).field_J;
            stackOut_6_1 = ((dj) this).field_K;
            stackOut_6_2 = ((dj) this).field_G + (var7 + var5);
            stackOut_6_3 = var6 - -((dj) this).field_G;
            stackOut_6_4 = ((dj) this).field_L - ((dj) this).field_G;
            stackOut_6_5 = -(((dj) this).field_G * 2) + ((dj) this).field_u;
            stackOut_6_6 = ((dj) this).field_I;
            stackOut_6_7 = -1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            stackIn_8_3 = stackOut_6_3;
            stackIn_8_4 = stackOut_6_4;
            stackIn_8_5 = stackOut_6_5;
            stackIn_8_6 = stackOut_6_6;
            stackIn_8_7 = stackOut_6_7;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            stackIn_7_3 = stackOut_6_3;
            stackIn_7_4 = stackOut_6_4;
            stackIn_7_5 = stackOut_6_5;
            stackIn_7_6 = stackOut_6_6;
            stackIn_7_7 = stackOut_6_7;
            if (!((dj) this).field_M) {
              stackOut_8_0 = (qi) (Object) stackIn_8_0;
              stackOut_8_1 = (String) (Object) stackIn_8_1;
              stackOut_8_2 = stackIn_8_2;
              stackOut_8_3 = stackIn_8_3;
              stackOut_8_4 = stackIn_8_4;
              stackOut_8_5 = stackIn_8_5;
              stackOut_8_6 = stackIn_8_6;
              stackOut_8_7 = stackIn_8_7;
              stackOut_8_8 = 2;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              stackIn_9_3 = stackOut_8_3;
              stackIn_9_4 = stackOut_8_4;
              stackIn_9_5 = stackOut_8_5;
              stackIn_9_6 = stackOut_8_6;
              stackIn_9_7 = stackOut_8_7;
              stackIn_9_8 = stackOut_8_8;
              break L2;
            } else {
              stackOut_7_0 = (qi) (Object) stackIn_7_0;
              stackOut_7_1 = (String) (Object) stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = stackIn_7_3;
              stackOut_7_4 = stackIn_7_4;
              stackOut_7_5 = stackIn_7_5;
              stackOut_7_6 = stackIn_7_6;
              stackOut_7_7 = stackIn_7_7;
              stackOut_7_8 = 0;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              stackIn_9_4 = stackOut_7_4;
              stackIn_9_5 = stackOut_7_5;
              stackIn_9_6 = stackOut_7_6;
              stackIn_9_7 = stackOut_7_7;
              stackIn_9_8 = stackOut_7_8;
              break L2;
            }
          }
          int discarded$1 = ((qi) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8, 1, ((dj) this).field_J.field_G);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Unfortunately we are unable to create an account for you at this time.";
        field_H = "<img=10>";
    }
}
