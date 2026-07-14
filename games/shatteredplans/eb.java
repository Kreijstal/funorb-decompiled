/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_d;
    static String[] field_f;
    static String field_e;
    static int field_b;
    static int[] field_a;
    volatile boolean field_c;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -1314558012) {
            return;
        }
        field_f = null;
        field_e = null;
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var5 = 0; var5 < gd.field_b.length; var5++) {
            param1 = gd.field_b[var5];
            var6 = var5 << -74577948;
            while (true) {
                param1--;
                if (param1 == 0) {
                    break;
                }
                var6++;
                param0 = jl.field_M[var6];
                param4[param2[param0]] = param4[param2[param0]] + 1;
                jl.field_M[param4[param2[param0]]] = param0;
            }
        }
        if (param3 != 12) {
            field_b = -26;
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(qb param0, int param1) {
        if (param1 != -17115) {
            field_b = 54;
        }
        ql.a(((eb) this).field_d, 0, param0);
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((eb) this).field_c = true;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        float var3 = 0.0f;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27_int = 0;
        double var27 = 0.0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_54_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        L0: {
          var34 = ShatteredPlansClient.field_F ? 1 : 0;
          var3 = 0.15000000596046448f + (float)di.field_m / 1000.0f;
          var1 = -(int)(200.0 * Math.sin((double)var3));
          var2 = -200 + (int)(200.0 * Math.cos((double)var3));
          ks.field_j.f(var1, var2);
          gf.h(0, 0, gf.field_b, gf.field_k);
          var4 = 125;
          var5 = 400;
          var6 = var5 - -150;
          var7 = 100 + var6;
          var8 = var6 - -150;
          var9 = var5 + 50;
          var10 = -80;
          var11 = 140;
          var2 = var10;
          var1 = -260;
          if (var5 > di.field_m) {
            if (di.field_m < var4) {
              stackOut_4_0 = var10;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = re.a(var10, -var4 + var5, -var4 + di.field_m, var11, param0 + -320);
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = var11;
            stackIn_5_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = stackIn_5_0;
          tf.field_b.c(var1, var2 + (var12 - 120), 128);
          qq.field_n.f(var1, var12 - -var2);
          if (var5 <= di.field_m) {
            stackOut_9_0 = 205 + var10 << -1061957692;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          } else {
            if (di.field_m < var4) {
              stackOut_8_0 = 0;
              stackIn_10_0 = stackOut_8_0;
              break L1;
            } else {
              stackOut_7_0 = re.a(0, -var4 + var5, di.field_m + -var4, 205 - -var10 << 742301380, 0);
              stackIn_10_0 = stackOut_7_0;
              break L1;
            }
          }
        }
        L2: {
          var13 = stackIn_10_0;
          var14 = 454 + var1 << 609578692;
          var15 = -var13 + (var10 + 374 - -var2 << 851901028);
          var16 = 32 - -vc.a((byte) -39, 32);
          if (var6 > di.field_m) {
            gf.b(var14, var15, var16, 128, fe.field_u);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var17 = 454 + (var1 + 3);
          var18 = var17 << -1951805212;
          var19 = (var13 >> -1936225948) + -36;
          if (param0 == 320) {
            break L3;
          } else {
            eb.b(62);
            break L3;
          }
        }
        L4: {
          var20 = var19 << -190982460;
          var21 = 144;
          if (var7 > di.field_m) {
            break L4;
          } else {
            var22 = -var7 + di.field_m;
            var23 = -var7 + 1000;
            var24 = var22 << -1198081726;
            var24 = var24 + var22 * 16 * var22 / var23;
            var20 = var20 - (var24 >> -1314558012);
            var21 = var21 * (-var22 + var23) / var23;
            var17 = var17 + (var24 >> -1830644956);
            var19 = var19 - (var24 >> 2001301032);
            var18 = var18 + var24;
            break L4;
          }
        }
        L5: {
          var22 = 454 + var1 - -3 << -1074827996;
          var23 = 169 + var10 << -1112830972;
          var24 = -var7 + 950 << -1572258974;
          var24 = var24 + (-var7 + 950) * (-(var7 * 16) + 15200) / (1000 + -var7);
          var22 = var22 + var24;
          var23 = var23 - (var24 >> 1787680868);
          gf.d(0, 0, var22 - -320 >> -1826874268, 480);
          gf.d(var17, var19, 20, 4, 0);
          if (di.field_m >= var9) {
            L6: {
              var25 = -var9 + di.field_m;
              var26 = var6 - var9;
              var27_int = 440 * var25 / var26;
              var28 = var27_int - -rg.a(64, -64, (byte) 109);
              if ((var28 ^ -1) <= -1) {
                break L6;
              } else {
                var28 = 0;
                break L6;
              }
            }
            L7: {
              if (255 >= var28) {
                break L7;
              } else {
                var28 = 255;
                break L7;
              }
            }
            L8: {
              gf.a(16 + var17, var19 + 2, (var28 >> 1984694722) * 65793);
              var28 = -40 + (var27_int + rg.a(64, -64, (byte) 114));
              if (var28 < 0) {
                var28 = 0;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (var28 <= 255) {
                break L9;
              } else {
                var28 = 255;
                break L9;
              }
            }
            L10: {
              gf.a(3 + var17, var19 - -3, 65793 * (var28 >> 1702483618));
              var28 = rg.a(64, -64, (byte) 98) + (var27_int - 80);
              if (-1 < (var28 ^ -1)) {
                var28 = 0;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (var28 <= 255) {
                break L11;
              } else {
                var28 = 255;
                break L11;
              }
            }
            L12: {
              gf.a(var17 - -12, var19, 65793 * (var28 >> -871687582));
              var28 = -120 + var27_int + rg.a(64, -64, (byte) 126);
              if (var28 < 0) {
                var28 = 0;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if ((var28 ^ -1) >= -256) {
                break L13;
              } else {
                var28 = 255;
                break L13;
              }
            }
            gf.a(var17 - -7, 1 + var19, (var28 >> 1108437922) * 65793);
            break L5;
          } else {
            break L5;
          }
        }
        L14: {
          gf.a();
          if (var9 <= di.field_m) {
            L15: {
              var25 = -var9 + di.field_m;
              var26 = -var9 + var8;
              var27 = 0.0003141592653589793 * (double)var25 * (double)var25;
              if (var25 > var26) {
                stackOut_43_0 = 128;
                stackIn_44_0 = stackOut_43_0;
                break L15;
              } else {
                stackOut_42_0 = var25 * 128 / var26;
                stackIn_44_0 = stackOut_42_0;
                break L15;
              }
            }
            var29 = stackIn_44_0;
            var30 = 0;
            L16: while (true) {
              if ((var30 ^ -1) <= -4) {
                L17: {
                  if (600 > var25) {
                    stackOut_53_0 = var25;
                    stackIn_54_0 = stackOut_53_0;
                    break L17;
                  } else {
                    stackOut_52_0 = 600;
                    stackIn_54_0 = stackOut_52_0;
                    break L17;
                  }
                }
                var30 = stackIn_54_0;
                var31 = -1 + sd.field_p;
                var32 = 0;
                L18: while (true) {
                  if (var30 <= var32) {
                    break L14;
                  } else {
                    L19: {
                      if ((var31 ^ -1) <= -1) {
                        break L19;
                      } else {
                        // wide iinc 31 600
                        break L19;
                      }
                    }
                    var33 = 256 * (var30 - var32) / 600;
                    gf.b(p.field_A[var31], np.field_f[var31], var33, 12, fe.field_x);
                    gf.b(p.field_A[var31], np.field_f[var31], var33 >> -118837918, 128, fe.field_x);
                    var31--;
                    var32++;
                    continue L18;
                  }
                }
              } else {
                var31 = (int)(Math.cos(3.141592653589793 * (double)(2 * var30) / 3.0 + var27) * (double)(var21 >> 2064758561));
                var31 = var31 + var18;
                var32 = (int)((double)var21 * Math.sin(var27 + 3.141592653589793 * (double)(var30 * 2) / 3.0));
                var32 = var32 + var20;
                if (var22 + 320 >= var31) {
                  gf.g(var17, var19, var31 >> 605130468, var32 >> -1715380860, 0);
                  gf.b(var31, var32, 64, var29, fe.field_x);
                  p.field_A[sd.field_p] = var31;
                  np.field_f[sd.field_p] = var32;
                  sd.field_p = sd.field_p + 1;
                  if (-601 == (sd.field_p + 1 ^ -1)) {
                    sd.field_p = 0;
                    var30++;
                    continue L16;
                  } else {
                    var30++;
                    continue L16;
                  }
                } else {
                  var30++;
                  continue L16;
                }
              }
            }
          } else {
            break L14;
          }
        }
        L20: {
          if (900 < di.field_m) {
            L21: {
              if ((di.field_m ^ -1) < -951) {
                var16 = re.a(0, 50, -900 + di.field_m, 256, 0);
                break L21;
              } else {
                var16 = re.a(256, 50, -950 + di.field_m, 0, 0);
                break L21;
              }
            }
            gf.a(var22, var23, var16, 12, fe.field_v);
            gf.a(var22 + 128, var23 - 16, var16 >> -655431071, 12, fe.field_v);
            gf.a(var22 - -256, var23 - 32, var16 >> 493738498, 12, fe.field_v);
            break L20;
          } else {
            break L20;
          }
        }
        L22: {
          var25 = -var22 + var18;
          if (-1 <= var25) {
            break L22;
          } else {
            L23: {
              var16 = var25;
              if (-321 >= var16) {
                break L23;
              } else {
                var20 = var20 - (var16 + -320 >> 1756076258);
                var18 = var18 + (var16 - 320 << 208399937);
                var16 = -(var16 >> -17281886) + 320;
                break L23;
              }
            }
            gf.b(var18, var20, var16, 256, fe.field_u);
            break L22;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    eb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_e = "Offer NAP";
        field_a = new int[]{18, 19, 9};
    }
}
