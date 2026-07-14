/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends qa {
    static vc field_O;
    int field_I;
    private int field_N;
    private dd[] field_E;
    private dd field_F;
    private int field_B;
    private int field_L;
    private int field_K;
    private int field_C;
    private dd field_P;
    static vg field_D;
    static volatile int field_J;
    private int field_G;
    static fh field_A;
    private dd field_M;
    static fa field_Q;
    boolean field_H;

    private final dd b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dd var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = fleas.field_A ? 1 : 0;
        var14 = new dd(((lk) this).field_N * 2, ((lk) this).field_j);
        r.a(var14, 45);
        var5 = ((lk) this).field_j >> -34084671;
        var6 = 0;
        L0: while (true) {
          if (((lk) this).field_j <= var6) {
            ia.a(-121);
            var6 = 83 % ((9 - param2) / 48);
            return var14;
          } else {
            L1: {
              var7 = (((lk) this).field_N * 2 - 1) * (var6 >> 409506081) % (2 * ((lk) this).field_N);
              var8 = 16711935 & param1;
              var9 = param1 & 65280;
              var10 = var6 + -var5;
              var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
              if (-257 < (var11 ^ -1)) {
                stackOut_4_0 = (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> 502419848;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var9 | var8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              gb.b(var7, var6, ((lk) this).field_N, var12);
              var8 = 16711935 & param0;
              var9 = param0 & 65280;
              gb.b(var7 + -(((lk) this).field_N * 2), var6, ((lk) this).field_N, var12);
              if (256 <= var11) {
                stackOut_7_0 = var9 | var8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (16711680 & var9 * var11 | var8 * var11 & -16711936) >>> -215237912;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            gb.b(var7 + ((lk) this).field_N, var6, ((lk) this).field_N, var12);
            gb.b(-((lk) this).field_N + var7, var6, ((lk) this).field_N, var12);
            var6++;
            continue L0;
          }
        }
    }

    final static void a(int param0, String param1) {
        fg.field_m = param1;
        if (param0 != -15493) {
            return;
        }
        cg.a((byte) -105, 12);
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        if (param3 > -85) {
            return;
        }
        if (!(!((lk) this).field_H)) {
            ((lk) this).field_B = ((lk) this).field_B + 1;
            if (((lk) this).field_N * 2 < ((lk) this).field_B) {
                ((lk) this).field_B = ((lk) this).field_B - ((lk) this).field_N * 2;
            }
        }
    }

    final static kc a(String param0, boolean param1, byte param2, String param3) {
        CharSequence var8 = null;
        long var4 = 0L;
        if (param2 != -35) {
            Object var7 = null;
            lk.a(63, (String) null);
        }
        String var6 = null;
        if ((param3.indexOf('@') ^ -1) == 0) {
            var8 = (CharSequence) (Object) param3;
            var4 = uj.a(var8, (byte) -126);
        } else {
            var6 = param3;
        }
        return r.a(param1, var4, (byte) 84, var6, param0);
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (!(0 == param3)) {
            return;
        }
        if (!param2) {
            return;
        }
        int var5 = param1 - -((lk) this).field_y;
        int var6 = ((lk) this).field_z + param0;
        this.a(((lk) this).field_E[0], var6, 0, var5);
        if (-65537 < (((lk) this).field_I ^ -1)) {
            mi.a((byte) -52, var5 - -((lk) this).field_u, var5 + (((lk) this).field_u * ((lk) this).field_I >> 650292688), var6 - -((lk) this).field_j, var6);
            this.a(((lk) this).field_E[1], var6, 0, var5);
            ia.a(-68);
        }
    }

    final static int k(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!wf.b(-113)) {
            L1: {
              bk.field_a.b(105, bg.a(pb.field_d, ob.field_e, 96), bg.a(ag.field_f, kc.field_b, 115));
              if (!bk.field_a.b(-46)) {
                break L1;
              } else {
                var1 = 1;
                break L1;
              }
            }
            if (param0 == 10999) {
              L2: {
                var3 = 0;
                if (var1 != 0) {
                  if (-1 <= bk.field_a.field_k) {
                    L3: {
                      var3 = em.field_e[bk.field_a.field_k];
                      if (var3 == 2) {
                        break L3;
                      } else {
                        if (var3 != -6) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    md.i(124);
                    break L2;
                  } else {
                    if (-3 == (vc.field_a ^ -1)) {
                      break L2;
                    } else {
                      md.i(-109);
                      break L2;
                    }
                  }
                } else {
                  if (var2 == 0) {
                    break L2;
                  } else {
                    if (-3 == vc.field_a) {
                      break L2;
                    } else {
                      md.i(-109);
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (-1 != (var3 ^ -1)) {
                  break L4;
                } else {
                  if (2 != vc.field_a) {
                    break L4;
                  } else {
                    var4 = -sd.field_h + lj.a((byte) -38);
                    var6 = (int)((-var4 + 10999L) / 1000L);
                    if (var6 <= 0) {
                      pf.a(5, 1, true);
                      var3 = 2;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              return var3;
            } else {
              return 108;
            }
          } else {
            L5: {
              bk.field_a.h(0);
              if (!bk.field_a.b(-66)) {
                break L5;
              } else {
                var1 = 1;
                break L5;
              }
            }
            if (-14 == (ji.field_a ^ -1)) {
              var2 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    private final dd d(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = fleas.field_A ? 1 : 0;
        int var2 = ((lk) this).field_j >> 1509851841;
        dd var3 = new dd(var2, ((lk) this).field_j);
        r.a(var3, 45);
        if (param0 != -15) {
            field_D = null;
        }
        for (var4 = 0; ((lk) this).field_j > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((lk) this).field_j));
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                gb.a(var5, var4, var8 << -2076140760 | var8 | var8 << -1840242832);
            }
        }
        ia.a(-106);
        return var3;
    }

    lk(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 794305025, (16711422 & param6) >> -1440119039);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(124);
    }

    private final void a(dd param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = fleas.field_A ? 1 : 0;
          var5 = ((lk) this).field_u + param3;
          mi.a((byte) -52, var5 + -((lk) this).field_P.field_w, param3 - -((lk) this).field_P.field_w, param1 + ((lk) this).field_j, param1);
          var6 = -((lk) this).field_B + param3;
          if (param2 == 0) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              ia.a(param2 ^ -81);
              if (gb.field_l > ((lk) this).field_P.field_w + param3) {
                break L2;
              } else {
                r.a(((lk) this).field_M, 45);
                param0.d(-((lk) this).field_B, 0);
                param0.d(((lk) this).field_N * 2 - ((lk) this).field_B, 0);
                ((lk) this).field_F.a(0, 0);
                ia.a(-70);
                ((lk) this).field_M.d(param3, param1);
                break L2;
              }
            }
            L3: {
              if (var5 - ((lk) this).field_P.field_w > gb.field_h) {
                break L3;
              } else {
                r.a(((lk) this).field_M, 45);
                var7 = ((lk) this).field_B + (-((lk) this).field_P.field_w + ((lk) this).field_u);
                L4: while (true) {
                  if (var7 <= ((lk) this).field_N * 2) {
                    param0.d(-var7, 0);
                    param0.d(-var7 + ((lk) this).field_N * 2, 0);
                    ((lk) this).field_P.a(0, 0);
                    ia.a(-79);
                    ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5, param1);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((lk) this).field_N;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            param0.d(var6, param1);
            var6 = var6 + param0.field_w;
            continue L1;
          }
        }
    }

    final static boolean a(int param0) {
        int var1 = 2 / ((param0 - -62) / 39);
        return true;
    }

    public static void c(boolean param0) {
        field_O = null;
        field_D = null;
        field_Q = null;
        field_A = null;
        if (!param0) {
            lk.c(true);
        }
    }

    final static void a(byte param0) {
        if (vg.field_z != 0 + -wf.field_c) {
            if (vg.field_z != -wf.field_c + 250) {
            }
        }
        if (param0 != 35) {
            field_J = -59;
        }
        vg.field_z = vg.field_z + 1;
    }

    private final void j(int param0) {
        if (param0 < 116) {
            return;
        }
        ((lk) this).field_E = new dd[]{this.b(((lk) this).field_G, ((lk) this).field_C, -117), this.b(((lk) this).field_L, ((lk) this).field_K, 118)};
        ((lk) this).field_P = this.d((byte) -15);
        ((lk) this).field_F = ((lk) this).field_P.b();
        ((lk) this).field_M = new dd(((lk) this).field_j >> 628191361, ((lk) this).field_j);
    }

    final static boolean i(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 10) {
            break L0;
          } else {
            int discarded$2 = lk.k(67);
            break L0;
          }
        }
        L1: {
          L2: {
            if (10 > bh.field_t) {
              break L2;
            } else {
              if (ci.field_f) {
                break L2;
              } else {
                if (qh.j(32391)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void a(byte param0, int param1, int param2) {
        ((lk) this).field_L = (param1 & 16711422) >> -1387688991;
        ((lk) this).field_G = param1;
        ((lk) this).field_C = param2;
        ((lk) this).field_K = 8355711 & param2 >> 867289153;
        if (param0 <= 77) {
            lk.c(false);
        }
        this.j(119);
    }

    private lk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((lk) this).field_L = param8;
        ((lk) this).field_C = param5;
        ((lk) this).field_G = param6;
        ((lk) this).field_K = param7;
        ((lk) this).field_N = param4;
        ((lk) this).a(param0, param2, param1, param3, 80);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new vc();
        field_J = 0;
        field_A = new fh(6, 0, 4, 2);
    }
}
