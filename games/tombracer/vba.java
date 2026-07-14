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
        int var7 = 0;
        ((vba) this).field_w = new int[42];
        ((vba) this).field_r = new int[42];
        for (var7 = 0; var7 < ((vba) this).field_w.length; var7++) {
            ((vba) this).field_w[var7] = uca.field_c.a(3, 0);
        }
        ((vba) this).field_o = false;
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
              if (0 == (((vba) this).field_t ^ -1)) {
                break L2;
              } else {
                ((vba) this).field_r[((vba) this).field_t] = ((vba) this).field_r[((vba) this).field_t] + 3;
                if ((((vba) this).field_r[((vba) this).field_t] + 3 ^ -1) >= -9) {
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
                if (-2 != hf.field_b) {
                  break L3;
                } else {
                  var4 = this.b(lba.field_p, jm.field_m, true);
                  if (var4 != ((vba) this).field_t) {
                    if (0 != var4) {
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
            ((vba) this).field_r[var4] = ((vba) this).field_r[var4] - 1;
            if (0 > ((vba) this).field_r[var4] - 1) {
              ((vba) this).field_r[var4] = 0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final nh h(int param0, int param1) {
        if (eq.c(param1)) {
            // ifne L31
        }
        if (!(!this.a(false, param0))) {
            return lva.field_m[param0];
        }
        return lva.field_m[42 + ((vba) this).field_w[param0]];
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
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var4 = this.d(-29787);
          var5 = -1;
          var6 = 0;
          var7 = -1;
          var8 = -1;
          var9 = 0;
          if (param2) {
            break L0;
          } else {
            ((vba) this).field_s = -44;
            break L0;
          }
        }
        L1: while (true) {
          if (-1 <= var4) {
            return -1;
          } else {
            L2: {
              L3: {
                if (-1 == var5) {
                  break L3;
                } else {
                  if (9 != var6) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var6 = 0;
                var5++;
                if (-10 <= var4) {
                  stackOut_8_0 = 9;
                  stackIn_9_0 = stackOut_8_0;
                  break L4;
                } else {
                  stackOut_7_0 = var4;
                  stackIn_9_0 = stackOut_7_0;
                  break L4;
                }
              }
              var10 = stackIn_9_0;
              var7 = (40 * (9 - var10) >> 1933619713) + ((-360 + (-188 + (aaa.a(false) - 80)) >> -486271103) + 40);
              var8 = 44 * var5 + ((-540 + (-80 + aaa.a(false) - 8) >> 923471041) + 80);
              break L2;
            }
            if (this.i(var9, 38)) {
              L5: {
                if (param1 < var7) {
                  break L5;
                } else {
                  if (param0 < var8) {
                    break L5;
                  } else {
                    if (var7 - -40 <= param1) {
                      break L5;
                    } else {
                      if (param0 >= 44 + var8) {
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
              var9++;
              continue L1;
            } else {
              var9++;
              continue L1;
            }
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
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        var3 = this.d(-29787);
        var4 = -1;
        if (param0 <= -102) {
          var5 = 0;
          var6 = -1;
          var7 = -1;
          var8 = 0;
          L0: while (true) {
            if (-1 <= (var3 ^ -1)) {
              return;
            } else {
              L1: {
                L2: {
                  if (var4 == -1) {
                    break L2;
                  } else {
                    if ((var5 ^ -1) == -10) {
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
                    stackOut_9_0 = var3;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 9;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                var9_int = stackIn_10_0;
                var6 = (40 * (-var9_int + 9) >> -1682440063) + (-540 + (-80 + aaa.a(false) + -8) >> 1178670177) + 40;
                var7 = (-8 + (aaa.a(false) + -80) - 540 >> 1421631809) + param1 - -80 - -(44 * var4);
                break L1;
              }
              if (this.i(var8, 94)) {
                var9 = this.h(var8, 0);
                var10 = ((vba) this).field_r[var8];
                var9.a(-(var10 >> -1977970271) + (var6 - -4), -(var10 >> 889818081) + (var7 - -4), var10 + 32, var10 + 32);
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
        } else {
          return;
        }
    }

    private final boolean a(boolean param0, int param1) {
        if (param0) {
            Object var4 = null;
            int discarded$0 = this.a((String) null, (qla) null, -5, -61, -30, (da) null, 39, -50, -125);
        }
        return vaa.a(rb.field_o, param1, -101);
    }

    final static pha a(byte param0, long param1) {
        if (param0 != -40) {
            field_v = -0.5121414661407471f;
        }
        return (pha) (Object) tc.field_d.a(param0 ^ 88, param1);
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
        ha var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var10 = 0;
        nh[] var11 = null;
        String var12 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var3 = 26;
          var4 = -180 + aaa.a(false) - 40;
          var5 = 9 + (80 + param0);
          var6_ref = tga.field_a;
          if (param1 == -22) {
            break L0;
          } else {
            ((vba) this).field_w = null;
            break L0;
          }
        }
        L1: {
          var7 = var4;
          var8_int = var5;
          var11 = dr.field_a;
          tra.a(1, var11, (byte) -89, var7, var6_ref, 180, 1, 180, var8_int, 0);
          if ((((vba) this).field_t ^ -1) != 0) {
            stackOut_4_0 = ((vba) this).field_t;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = ((vba) this).field_s;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var6 = stackIn_5_0;
        if (-1 == var6) {
          return;
        } else {
          if (this.i(var6, 65)) {
            L2: {
              this.h(var6, 0).a(var4 - -var3, var3 + var5);
              var7 = var5 + 20 + 180;
              var8 = lq.field_p[var6].toUpperCase();
              var12 = kv.field_c[var6];
              var10 = this.a(var8, ds.field_n, -6671872, 180, var4, eda.field_f, 128, var7, 15);
              var7 = var7 + (5 + 15 * var10);
              if (!this.a(false, var6)) {
                kn.field_p.a(var7, false, pg.field_x, var4, -6671872, -1);
                break L2;
              } else {
                kn.field_p.a(var7, false, dl.field_p, var4, -14671840, -1);
                break L2;
              }
            }
            var7 += 20;
            int discarded$1 = this.a(var12 + "<br><br>" + jn.field_r + sw.field_zb[var6] + "       " + vla.field_m + sw.field_zb[var6] / 100, kv.field_a, -14671840, 180, var4, kn.field_p, param1 ^ -150, var7, 15);
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
        int var12 = 0;
        int var13 = TombRacer.field_G ? 1 : 0;
        String[] var14 = new String[10];
        String[] var10 = var14;
        int var11 = param1.a(param0, -99, var14, (nh[]) null, new int[1]);
        if (param6 != 128) {
            return -59;
        }
        for (var12 = 0; var14.length > var12; var12++) {
            param5.a(var12 * param8 + param7, false, var14[var12], param4, param2, -1);
        }
        return var11;
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
        if (param0 != -10) {
            field_x = null;
        }
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
