/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends bg {
    static pd field_z;
    private int field_x;
    private int field_v;
    private int field_A;
    private boolean field_w;
    static jl field_y;
    private int field_r;
    static bb field_o;
    private int field_m;
    private int field_s;
    private int[] field_t;
    private int field_n;
    private int field_q;
    private int field_u;
    private int field_p;

    final static void d(byte param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        rl var4_ref_rl = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        rl var17 = null;
        int var17_int = 0;
        rl var17_ref = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        bg.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = ck.field_b.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var1 <= var3) {
            L1: {
              if (param0 == 106) {
                break L1;
              } else {
                field_z = null;
                break L1;
              }
            }
            L2: {
              var3 = bg.field_a[9] >> -1079431544;
              var4 = bg.field_a[10] >> -500785240;
              var5 = bg.field_a[11] >> -1386663992;
              var6 = ga.field_f << 1880007972;
              var7 = 0;
              var8 = mi.d(-4096, var6) >> -156295704;
              var9 = th.a(var6, param0 + 8085) >> 977282984;
              if ((uf.field_d ^ -1) == 0) {
                break L2;
              } else {
                if (-1 == bg.field_k) {
                  break L2;
                } else {
                  var9 = -128;
                  var8 = -bg.field_k + 240;
                  var7 = -320 + uf.field_d;
                  break L2;
                }
              }
            }
            var10 = 256.0 / Math.sqrt((double)(var9 * var9 + var7 * var7 - -(var8 * var8)));
            var7 = (int)((double)var7 * var10);
            var9 = (int)((double)var9 * var10);
            var8 = (int)((double)var8 * var10);
            var12 = var7 + -var3;
            var13 = -var4 + var8;
            var14 = var9 - var5;
            var10 = 256.0 / Math.sqrt((double)(var12 * var12 - -(var13 * var13) + var14 * var14));
            var14 = (int)((double)var14 * var10);
            var13 = (int)((double)var13 * var10);
            var12 = (int)((double)var12 * var10);
            var15 = 0;
            L3: while (true) {
              if (var15 >= ck.field_b.length) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L4: while (true) {
                  if (var17_int >= ck.field_b.length) {
                    var23[var16] = -2147483648;
                    var17_ref = ck.field_b[var16];
                    g.a(var16, 100);
                    var18 = 0;
                    L5: while (true) {
                      if (-4 >= (var18 ^ -1)) {
                        qm.a(var17_ref, bg.field_a, false, oe.field_Hb, (byte) 98, true, false);
                        uk.a(var14, var17_ref, var12, var9, var8, var13, 20126, var7);
                        var15++;
                        continue L3;
                      } else {
                        oe.field_Hb[var18] = oe.field_Hb[var18] + wc.field_p[var15][var18];
                        var18++;
                        continue L5;
                      }
                    }
                  } else {
                    if (var23[var17_int] > var23[var16]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L4;
                    } else {
                      var17_int++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_rl = ck.field_b[var3];
            var17 = var4_ref_rl;
            var17 = var4_ref_rl;
            var4_ref_rl.a((byte) -17);
            g.a(var3, 67);
            var5 = var4_ref_rl.field_c + var4_ref_rl.field_b >> -331582207;
            var6 = var4_ref_rl.field_F + var4_ref_rl.field_t >> 1271052833;
            var7 = var4_ref_rl.field_g + var4_ref_rl.field_x >> 641027521;
            var8 = bg.field_a[9] >> -2139004798;
            var9 = bg.field_a[10] >> -60562686;
            var10_int = bg.field_a[11] >> -179205566;
            var11 = var8 * oe.field_Hb[3] + (var9 * oe.field_Hb[4] - -(var10_int * oe.field_Hb[5])) >> 271572462;
            var12 = var9 * oe.field_Hb[7] + var8 * oe.field_Hb[6] - -(oe.field_Hb[8] * var10_int) >> 1419286606;
            var13 = var10_int * oe.field_Hb[11] + var9 * oe.field_Hb[10] + var8 * oe.field_Hb[9] >> -1131507826;
            var2[var3] = var13 * var7 + var11 * var5 + var12 * var6 >> -1725414608;
            var3++;
            continue L0;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 > -95) {
            return;
        }
        field_y = null;
        field_z = null;
        field_o = null;
    }

    ma(int[] param0, boolean param1, int param2) {
        this(param0, param1, 615, 435 + -param2);
    }

    final static boolean a(boolean param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          var1 = hm.a(64);
          if (param0) {
            break L0;
          } else {
            boolean discarded$2 = ma.a(true);
            break L0;
          }
        }
        var3 = -io.field_d + var1;
        if (30000L < var3) {
          io.field_d = var1;
          on.field_ob = 0;
          return true;
        } else {
          L1: {
            var5 = 3000;
            if (-8 >= on.field_ob) {
              var5 = 12000;
              break L1;
            } else {
              if (-6 <= on.field_ob) {
                var5 = 9000;
                break L1;
              } else {
                if (on.field_ob >= 3) {
                  var5 = 6000;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          if (var3 > (long)var5) {
            on.field_ob = on.field_ob + 1;
            io.field_d = var1;
            return true;
          } else {
            return false;
          }
        }
    }

    final static void a(byte param0, long param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param1);
        } catch (InterruptedException interruptedException) {
        }
        if (param0 != 37) {
            field_o = null;
        }
    }

    final static boolean e(byte param0) {
        if (param0 != 37) {
            return true;
        }
        return to.field_s;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int[] stackIn_21_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_20_0 = null;
        int[] stackOut_19_0 = null;
        L0: {
          var8 = Pixelate.field_H ? 1 : 0;
          var2 = (((ma) this).field_v << -1032182367) + (((ma) this).field_n >> -806683327);
          if (-1 < (var2 ^ -1)) {
            var2 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (gd.field_h.length <= var2) {
            var2 = -1 + gd.field_h.length;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          ((ma) this).a(65, var2, ((ma) this).field_m, ((ma) this).field_n);
          t.f(320, ((ma) this).field_m - -3, 19, 0, 128);
          t.f(321, 4 + ((ma) this).field_m, 18, 16777215, 128);
          if (((ma) this).field_v != ((ma) this).field_A) {
            L3: {
              if (((ma) this).field_A <= ((ma) this).field_v) {
                stackOut_10_0 = ((ma) this).field_A;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = ((ma) this).field_v;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var3 = stackIn_11_0;
              if (((ma) this).field_A > ((ma) this).field_v) {
                stackOut_13_0 = ((ma) this).field_A;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              } else {
                stackOut_12_0 = ((ma) this).field_v;
                stackIn_14_0 = stackOut_12_0;
                break L4;
              }
            }
            var4 = stackIn_14_0;
            var5 = var3;
            L5: while (true) {
              if (var4 <= var5) {
                break L2;
              } else {
                if (-1 != (var5 ^ -1)) {
                  L6: {
                    if (0 > var5) {
                      stackOut_20_0 = kp.field_z;
                      stackIn_21_0 = stackOut_20_0;
                      break L6;
                    } else {
                      stackOut_19_0 = kp.field_w;
                      stackIn_21_0 = stackOut_19_0;
                      break L6;
                    }
                  }
                  var12 = stackIn_21_0;
                  var11 = var12;
                  var10 = var11;
                  var9 = var10;
                  var6 = var9;
                  var7 = 31;
                  var7 = 31 + -(31 * Math.abs(-((ma) this).field_v + var5) / Math.abs(-((ma) this).field_A + ((ma) this).field_v));
                  if (var7 > 0) {
                    t.a(320 - -var5 << -414374652, ((ma) this).field_m + -7 << -821295196, 64, var7, var12);
                    t.a(320 + var5 << 1487511588, ((ma) this).field_m + 30 << 681533700, 64, var7, var12);
                    var5 += 2;
                    continue L5;
                  } else {
                    var5 += 2;
                    continue L5;
                  }
                } else {
                  var5 += 2;
                  continue L5;
                }
              }
            }
          } else {
            break L2;
          }
        }
        L7: {
          var3 = 1;
          if (0 > ((ma) this).field_v) {
            var3 = 0;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (param0 == 2) {
            break L8;
          } else {
            ((ma) this).field_x = -37;
            break L8;
          }
        }
        L9: {
          if (0 >= ((ma) this).field_v) {
            break L9;
          } else {
            var3 = 2;
            break L9;
          }
        }
        ll.field_m[var3].b(-8 + (((ma) this).field_v + 320), -10 + ((ma) this).field_m);
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          super.a((byte) 21);
          if (param0 == 12804) {
            break L0;
          } else {
            ma.c((byte) 73);
            break L0;
          }
        }
        L1: {
          var3 = ((ma) this).field_t[1] + -((ma) this).field_t[0];
          if (var3 <= 1024) {
            break L1;
          } else {
            var3 = 1024;
            break L1;
          }
        }
        L2: {
          if (var3 >= -1024) {
            break L2;
          } else {
            var3 = -1024;
            break L2;
          }
        }
        L3: {
          var4 = var3 * 299 >> -1152011510;
          if (((ma) this).field_w) {
            var4 = -var4;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var4 != ((ma) this).field_r) {
            L5: {
              ((ma) this).field_p = ((ma) this).field_v;
              ((ma) this).field_q = ((ma) this).field_A;
              ((ma) this).field_r = var4;
              var5 = Math.abs(-((ma) this).field_r + ((ma) this).field_v);
              ((ma) this).field_u = 60 * var5 / 640;
              ((ma) this).field_x = 0;
              if (-2 < (((ma) this).field_u ^ -1)) {
                ((ma) this).field_u = 1;
                break L5;
              } else {
                break L5;
              }
            }
            if ((var5 ^ -1) > -129) {
              ((ma) this).field_s = -(var5 * 20 >> 1097225831);
              break L4;
            } else {
              ((ma) this).field_s = -20;
              break L4;
            }
          } else {
            L6: {
              var5 = ((ma) this).field_u * ((ma) this).field_u;
              if (((ma) this).field_x < ((ma) this).field_u) {
                ((ma) this).field_x = ((ma) this).field_x + 1;
                var6 = (((ma) this).field_u - ((ma) this).field_x) * (((ma) this).field_u + -((ma) this).field_x);
                ((ma) this).field_v = ((ma) this).field_r - -((-((ma) this).field_r + ((ma) this).field_p) * var6 / var5);
                break L6;
              } else {
                break L6;
              }
            }
            if (((ma) this).field_u <= ((ma) this).field_s) {
              break L4;
            } else {
              ((ma) this).field_s = ((ma) this).field_s + 1;
              if (((ma) this).field_s <= 0) {
                break L4;
              } else {
                var6 = (((ma) this).field_u + -((ma) this).field_s) * (-((ma) this).field_s + ((ma) this).field_u);
                ((ma) this).field_A = ((ma) this).field_r + (-((ma) this).field_r + ((ma) this).field_q) * var6 / var5;
                break L4;
              }
            }
          }
        }
    }

    ma(int[] param0, boolean param1, int param2, int param3) {
        ((ma) this).field_v = 0;
        ((ma) this).field_r = 0;
        ((ma) this).field_A = 0;
        ((ma) this).field_q = 0;
        ((ma) this).field_p = 0;
        ((ma) this).field_n = param2;
        ((ma) this).field_t = param0;
        ((ma) this).field_m = param3;
        ((ma) this).field_w = param1 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new bb();
    }
}
