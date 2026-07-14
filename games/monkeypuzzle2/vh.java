/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends t {
    static float[] field_C;
    static String field_F;
    private int field_D;
    static float[] field_H;
    static int field_I;
    static va field_B;
    static le[] field_E;
    static String field_L;
    static String field_K;
    private kf field_J;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        na var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        le var12 = null;
        le var13 = null;
        le var14 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            L1: {
              var5 = param3 + ((vh) this).field_r - -(((vh) this).field_l >> 1468482689);
              var6 = (((vh) this).field_p >> 1464415297) + ((vh) this).field_e + param2;
              var8 = ((vh) this).field_J.b(false);
              if (var8 == ke.field_d) {
                break L1;
              } else {
                if (f.field_g != var8) {
                  if (ol.field_h == var8) {
                    var14 = hk.field_i[2];
                    var14.c(-(var14.field_k >> -2106367167) + var5, var6 - (var14.field_j >> 947155105), 256);
                    break L0;
                  } else {
                    if (var8 != wj.field_i) {
                      break L0;
                    } else {
                      var13 = hk.field_i[1];
                      var13.c(var5 + -(var13.field_k >> -1966904863), -(var13.field_j >> -1192748447) + var6, 256);
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var12 = hk.field_i[0];
                var9 = var12.field_m << -951602431;
                var10 = var12.field_n << 591028673;
                if (null == wi.field_e) {
                  break L3;
                } else {
                  if (wi.field_e.field_k < var9) {
                    break L3;
                  } else {
                    if (wi.field_e.field_j < var10) {
                      break L3;
                    } else {
                      mc.a(param0 ^ -8495, wi.field_e);
                      ge.d();
                      break L2;
                    }
                  }
                }
              }
              wi.field_e = new le(var9, var10);
              mc.a(-8497, wi.field_e);
              break L2;
            }
            var12.b(112, 144, var12.field_m << 1140997188, var12.field_n << 1785401540, -((vh) this).field_D << -1405992022, 4096);
            tj.b(653);
            wi.field_e.c(-var12.field_m + var5, -var12.field_n + var6, 256);
            break L0;
          }
          return;
        }
    }

    final String a(byte param0) {
        if (!(!((vh) this).field_g)) {
            return ((vh) this).field_J.b((byte) 82);
        }
        if (param0 == 54) {
            return null;
        }
        vh.a(-25);
        return null;
    }

    final static boolean a(int[] param0, byte param1) {
        long var2 = 0L;
        nh var4_ref_nh = null;
        int var4 = 0;
        int var5_int = 0;
        nh var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (wh.field_b == dk.field_h) {
          L0: {
            var2 = pf.a(0);
            if (ff.field_g == -1) {
              break L0;
            } else {
              if (-1 <= sb.field_f) {
                break L0;
              } else {
                var4_ref_nh = (nh) (Object) cb.field_a.a((byte) -117);
                if (var4_ref_nh == null) {
                  break L0;
                } else {
                  if (var2 > var4_ref_nh.field_e) {
                    var4_ref_nh.c(-19822);
                    rc.field_f = var4_ref_nh.field_h.length;
                    MonkeyPuzzle2.field_D.field_h = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (var5_int >= rc.field_f) {
                        bk.field_f = il.field_e;
                        il.field_e = hk.field_l;
                        hk.field_l = wk.field_a;
                        wk.field_a = var4_ref_nh.field_g;
                        return true;
                      } else {
                        MonkeyPuzzle2.field_D.field_g[var5_int] = var4_ref_nh.field_h[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (param1 > 120) {
            L2: while (true) {
              L3: {
                if (-1 >= (sb.field_f ^ -1)) {
                  break L3;
                } else {
                  MonkeyPuzzle2.field_D.field_h = 0;
                  if (!hj.a(1, true)) {
                    return false;
                  } else {
                    sb.field_f = MonkeyPuzzle2.field_D.r(-118);
                    MonkeyPuzzle2.field_D.field_h = 0;
                    rc.field_f = param0[sb.field_f];
                    break L3;
                  }
                }
              }
              if (gb.a(true)) {
                if (-1 != (ff.field_g ^ -1)) {
                  L4: {
                    var4 = ff.field_g;
                    if (rc.field_l != 0.0) {
                      var4 = (int)((double)var4 + pi.field_l.nextGaussian() * rc.field_l);
                      if (var4 < 0) {
                        var4 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var5 = new nh(var2 + (long)var4, sb.field_f, new byte[rc.field_f]);
                  var6 = 0;
                  L5: while (true) {
                    if (rc.field_f <= var6) {
                      cb.field_a.a(-8212, (ug) (Object) var5);
                      sb.field_f = -1;
                      continue L2;
                    } else {
                      var5.field_h[var6] = MonkeyPuzzle2.field_D.field_g[var6];
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  bk.field_f = il.field_e;
                  il.field_e = hk.field_l;
                  hk.field_l = wk.field_a;
                  wk.field_a = sb.field_f;
                  sb.field_f = -1;
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        int var2 = -111 / ((-67 - param1) / 48);
        ni.a((java.awt.Component) (Object) param0, (byte) -124);
        ac.a(-117, (java.awt.Component) (Object) param0);
        if (null != eb.field_A) {
            eb.field_A.a(0, (java.awt.Component) (Object) param0);
        }
    }

    final static void a(String param0, String param1, byte param2) {
        int var3 = -14 % ((16 - param2) / 63);
        if (me.field_f != null) {
            me.field_f.g((byte) -75);
        }
        j.field_e = new qi(param0, param1, false, true, true);
        jh.field_C.c((byte) 67, (we) (Object) j.field_e);
    }

    final void a(we param0, int param1, int param2, byte param3) {
        ((vh) this).field_D = ((vh) this).field_D + 1;
        if (param3 >= -13) {
            Object var6 = null;
            boolean discarded$0 = vh.a((int[]) null, (byte) -48);
        }
        super.a(param0, param1, param2, (byte) -44);
    }

    final static boolean c(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -23) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (si.field_o == null) {
              break L2;
            } else {
              if (null == si.field_o.j(-50)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(we param0, boolean param1) {
        if (param1) {
            field_I = -126;
            return false;
        }
        return false;
    }

    public static void a(int param0) {
        field_B = null;
        field_H = null;
        field_F = null;
        field_E = null;
        field_C = null;
        field_K = null;
        if (param0 != -9473) {
            vh.a(-33);
        }
        field_L = null;
    }

    vh(kf param0) {
        ((vh) this).field_J = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_F = "Fullscreen";
        field_C = new float[65536];
        field_H = new float[65536];
        for (var0 = 0; var0 < 65536; var0++) {
            field_C[var0] = (float)Math.sin(3.141592653589793 * (double)var0 / 32768.0);
            field_H[var0] = (float)Math.cos((double)var0 * 3.141592653589793 / 32768.0);
        }
        field_E = new le[5];
        field_L = "Quit to website";
        field_K = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
