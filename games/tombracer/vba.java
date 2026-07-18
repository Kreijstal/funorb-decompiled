/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vba extends we {
    private int[] field_w;
    private int[] field_r;
    private int field_t;
    static float field_v;
    static int[] field_x;
    static boolean[] field_u;
    private int field_s;

    vba(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        int var7_int = 0;
        ((vba) this).field_w = new int[42];
        ((vba) this).field_r = new int[42];
        try {
            for (var7_int = 0; var7_int < ((vba) this).field_w.length; var7_int++) {
                ((vba) this).field_w[var7_int] = uca.field_c.a(3, 0);
            }
            ((vba) this).field_o = false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vba.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
            return 48;
        }
        return ((vba) this).a((byte) 126, param0) + ((vba) this).field_m[param0].e(param1 ^ 141);
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2);
        var4 = 0;
        L0: while (true) {
          if (42 <= var4) {
            L1: {
              if (-1 != ((vba) this).field_s) {
                ((vba) this).field_r[((vba) this).field_s] = ((vba) this).field_r[((vba) this).field_s] + 2;
                if (((vba) this).field_r[((vba) this).field_s] + 2 > 4) {
                  ((vba) this).field_r[((vba) this).field_s] = 4;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((vba) this).field_t == -1) {
                break L2;
              } else {
                ((vba) this).field_r[((vba) this).field_t] = ((vba) this).field_r[((vba) this).field_t] + 3;
                if (((vba) this).field_r[((vba) this).field_t] + 3 <= 8) {
                  break L2;
                } else {
                  ((vba) this).field_r[((vba) this).field_t] = 8;
                  break L2;
                }
              }
            }
            if (!((vba) this).field_q.b(20)) {
              return;
            } else {
              L3: {
                ((vba) this).field_s = this.b(sta.field_B, jba.field_j, true);
                if (hf.field_b != 1) {
                  break L3;
                } else {
                  var4 = this.b(lba.field_p, jm.field_m, true);
                  if (~var4 != ~((vba) this).field_t) {
                    if (var4 != -1) {
                      ((vba) this).field_t = var4;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    ((vba) this).field_t = -1;
                    break L3;
                  }
                }
              }
              return;
            }
          } else {
            L4: {
              ((vba) this).field_r[var4] = ((vba) this).field_r[var4] - 1;
              if (0 <= ((vba) this).field_r[var4] - 1) {
                break L4;
              } else {
                ((vba) this).field_r[var4] = 0;
                break L4;
              }
            }
            var4++;
            continue L0;
          }
        }
    }

    private final nh h(int param0, int param1) {
        L0: {
          L1: {
            if (!eq.c(0)) {
              break L1;
            } else {
              if (oj.field_tb[82]) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (this.a(false, param0)) {
            break L0;
          } else {
            return lva.field_m[42 + ((vba) this).field_w[param0]];
          }
        }
        return lva.field_m[param0];
    }

    private final int b(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        var4 = this.d(-29787);
        var5 = -1;
        var6 = 0;
        var7 = -1;
        var8 = -1;
        var9 = 0;
        L0: while (true) {
          if (var4 <= 0) {
            return -1;
          } else {
            L1: {
              L2: {
                if (-1 == var5) {
                  break L2;
                } else {
                  if (9 != var6) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var6 = 0;
                var5++;
                if (var4 >= 9) {
                  stackOut_7_0 = 9;
                  stackIn_8_0 = stackOut_7_0;
                  break L3;
                } else {
                  stackOut_6_0 = var4;
                  stackIn_8_0 = stackOut_6_0;
                  break L3;
                }
              }
              var10 = stackIn_8_0;
              var7 = (40 * (9 - var10) >> 1) + ((-360 + (-188 + (aaa.a(false) - 80)) >> 1) + 40);
              var8 = 44 * var5 + ((-540 + (-80 + aaa.a(false) - 8) >> 1) + 80);
              break L1;
            }
            L4: {
              if (!this.i(var9, 38)) {
                break L4;
              } else {
                L5: {
                  if (~param1 > ~var7) {
                    break L5;
                  } else {
                    if (param0 < var8) {
                      break L5;
                    } else {
                      if (var7 - -40 <= param1) {
                        break L5;
                      } else {
                        if (~param0 <= ~(44 + var8)) {
                          break L5;
                        } else {
                          return var9;
                        }
                      }
                    }
                  }
                }
                var4--;
                var7 += 40;
                var6++;
                break L4;
              }
            }
            var9++;
            continue L0;
          }
        }
    }

    private final void j(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        nh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        var3 = this.d(-29787);
        var4 = -1;
        var5 = 0;
        var6 = -1;
        var7 = -1;
        var8 = 0;
        L0: while (true) {
          if (var3 <= 0) {
            return;
          } else {
            L1: {
              L2: {
                if (var4 == -1) {
                  break L2;
                } else {
                  if (var5 == 9) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var5 = 0;
                var4++;
                if (var3 < 9) {
                  stackOut_7_0 = var3;
                  stackIn_8_0 = stackOut_7_0;
                  break L3;
                } else {
                  stackOut_6_0 = 9;
                  stackIn_8_0 = stackOut_6_0;
                  break L3;
                }
              }
              var9_int = stackIn_8_0;
              var6 = (40 * (-var9_int + 9) >> 1) + (-540 + (-80 + aaa.a(false) + -8) >> 1) + 40;
              var7 = (-8 + (aaa.a(false) + -80) - 540 >> 1) + param1 - -80 - -(44 * var4);
              break L1;
            }
            if (this.i(var8, 94)) {
              var9 = this.h(var8, 0);
              var10 = ((vba) this).field_r[var8];
              var9.a(-(var10 >> 1) + (var6 - -4), -(var10 >> 1) + (var7 - -4), var10 + 32, var10 + 32);
              var5++;
              var3--;
              var6 += 40;
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    private final boolean a(boolean param0, int param1) {
        return vaa.a(rb.field_o, param1, -101);
    }

    final static pha a(byte param0, long param1) {
        return (pha) (Object) tc.field_d.a(-128, param1);
    }

    private final boolean i(int param0, int param1) {
        if (param1 <= 30) {
            ((vba) this).a(false, 72, (byte) -87);
        }
        return lk.field_h[param0];
    }

    final int a(byte param0, int param1) {
        if (param0 <= 111) {
            return 68;
        }
        return aaa.a(false) / 2 - (-15 + ((vba) this).field_m[param1].e(-163) / 2 * ((vba) this).field_m.length) - -(((vba) this).field_m[param1].e(-163) * param1);
    }

    private final void c(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ha var6_ref_ha = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var10 = 0;
        nh[] var11 = null;
        String var12 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var3 = 26;
          var4 = -180 + aaa.a(false) - 40;
          var5 = 9 + (80 + param0);
          var6_ref_ha = tga.field_a;
          var7 = var4;
          var8_int = var5;
          var11 = dr.field_a;
          tra.a(1, var11, (byte) -89, var7, var6_ref_ha, 180, 1, 180, var8_int, 0);
          if (((vba) this).field_t != -1) {
            stackOut_2_0 = ((vba) this).field_t;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((vba) this).field_s;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        if (-1 == var6) {
          return;
        } else {
          if (this.i(var6, 65)) {
            L1: {
              this.h(var6, 0).a(var4 - -var3, var3 + var5);
              var7 = var5 + 200;
              var8 = lq.field_p[var6].toUpperCase();
              var12 = kv.field_c[var6];
              var10 = this.a(var8, ds.field_n, -6671872, 180, var4, eda.field_f, 128, var7, 15);
              var7 = var7 + (5 + 15 * var10);
              if (!this.a(false, var6)) {
                kn.field_p.a(var7, false, pg.field_x, var4, -6671872, -1);
                break L1;
              } else {
                kn.field_p.a(var7, false, dl.field_p, var4, -14671840, -1);
                break L1;
              }
            }
            var7 += 20;
            int discarded$1 = this.a(var12 + "<br><br>" + jn.field_r + sw.field_zb[var6] + "       " + vla.field_m + sw.field_zb[var6] / 100, kv.field_a, -14671840, 180, var4, kn.field_p, 128, var7, 15);
            return;
          } else {
            return;
          }
        }
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
            ((vba) this).field_r = null;
        }
        return -30 + koa.b(param1 ^ 30);
    }

    private final int a(String param0, qla param1, int param2, int param3, int param4, da param5, int param6, int param7, int param8) {
        String[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var14 = new String[10];
            var10 = var14;
            var11 = param1.a(param0, -99, var14, (nh[]) null, new int[1]);
            var12 = 0;
            L1: while (true) {
              if (var14.length <= var12) {
                stackOut_6_0 = var11;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param5.a(var12 * 15 + param7, false, var14[var12], param4, param2, -1);
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var10_ref;
            stackOut_8_1 = new StringBuilder().append("vba.IA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',').append(180).append(',').append(param4).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 128 + ',' + param7 + ',' + 15 + ')');
        }
        return stackIn_7_0;
    }

    final String b(int param0, byte param1) {
        if (param1 <= 111) {
            field_u = null;
        }
        if (!(0 != param0)) {
            return fga.field_a;
        }
        return super.b(param0, (byte) 121);
    }

    final void a(boolean param0, int param1, byte param2) {
        qr.field_v.a(63 + param1, false, qja.field_i.toUpperCase(), 65, -14279929, -1);
        this.j(-119, param1);
        this.c(param1, (byte) -22);
        if (!(!vpa.a(7))) {
            kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, 405 + param1, ooa.field_h);
        }
        if (param2 >= -9) {
            ((vba) this).field_r = null;
        }
    }

    private final int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (param0 == -29787) {
            break L0;
          } else {
            int discarded$2 = this.d(76);
            break L0;
          }
        }
        var2 = 0;
        var3 = 0;
        L1: while (true) {
          if (42 <= var3) {
            return var2;
          } else {
            if (this.i(var3, 37)) {
              var2++;
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    public static void d(byte param0) {
        field_x = null;
        field_u = null;
    }

    final boolean c(int param0, int param1) {
        if (param1 != 0) {
            return true;
        }
        return super.c(param0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[]{128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128};
        field_v = 0.25f;
    }
}
