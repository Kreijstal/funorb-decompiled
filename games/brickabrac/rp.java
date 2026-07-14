/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends km {
    static String field_r;
    static jp field_s;
    private vl field_v;
    static mh field_t;
    static int field_x;
    static jp field_w;
    static String field_z;
    static jp field_u;
    static String field_y;

    final int b(int param0, int param1) {
        int var3 = ((rp) this).field_m[param0].field_f;
        if (param1 != 1) {
            field_t = null;
        }
        if ((var3 ^ -1) == -43) {
            return super.b(7, 1);
        }
        return super.b(param0, 1);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = BrickABrac.field_J ? 1 : 0;
        if (!(lb.field_i <= param0)) {
            param2 = param2 - (-param0 + lb.field_i);
            param0 = lb.field_i;
        }
        if (param5 < lb.field_b) {
            param4 = param4 - (-param5 + lb.field_b);
            param5 = lb.field_b;
        }
        if (!(param0 + param2 <= lb.field_f)) {
            param2 = -param0 + lb.field_f;
        }
        if (!(lb.field_j >= param4 + param5)) {
            param4 = lb.field_j + -param5;
        }
        int var6 = -param2 + lb.field_c;
        int var7 = lb.field_c * param5 + param0;
        for (param5 = 0; param4 > param5; param5++) {
            for (param0 = -param2; param0 < 0; param0++) {
                var8 = lb.field_l[var7];
                var7++;
                lb.field_l[var7] = ik.a(-16711936, ik.a(var8, 16711935) * param3) + ik.a(16711680, param3 * ik.a(65280, var8)) >>> 1844834056;
            }
            var7 = var7 + var6;
        }
        if (param1 != 65280) {
            field_y = null;
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = ((rp) this).field_m[param1].field_f;
        if (!param0) {
            field_s = null;
        }
        if (-43 != (var3 ^ -1)) {
            return super.a(true, param1);
        }
        return 19;
    }

    final void b(byte param0) {
        nq var4 = null;
        int var3 = BrickABrac.field_J ? 1 : 0;
        super.b((byte) -68);
        im.a(((rp) this).field_l + (-((rp) this).field_j + 30), 0, 468, 0, 6, (byte) -90, -15 + ((rp) this).field_j);
        vi.a((byte) -105);
        ((rp) this).a(0);
        if (param0 > -14) {
            field_s = null;
        }
        si.a(pq.field_k, (byte) -118, po.field_a, hc.field_h);
        if (!pg.c(77)) {
            var4 = (nq) (Object) ((rp) this).field_v.d(-90);
            while (var4 != null) {
                var4.a(2);
                var4 = (nq) (Object) ((rp) this).field_v.a((byte) 116);
            }
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        nq var6 = null;
        int var5 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, param1, -95);
        if (param2 > -52) {
            int discarded$0 = ((rp) this).b((byte) 59, 93);
        }
        if (param1) {
            if (-1 > (c.field_g ^ -1)) {
                c.field_g = c.field_g - 1;
                if (0 == c.field_g - 1) {
                    fc.a(-59, field_s);
                    pa.a(true);
                    sc.b(-96);
                    if (si.field_k != null) {
                        pe.field_n = si.field_k.field_m;
                    }
                    si.field_k = rd.a(0, (byte) 19);
                    hc.field_h = 2 * hi.field_w.a(-37880252, 2);
                    im.field_e = 50;
                }
            }
        }
        if (!pg.c(112)) {
            var6 = (nq) (Object) ((rp) this).field_v.d(-90);
            while (var6 != null) {
                var6.c(0);
                var6 = (nq) (Object) ((rp) this).field_v.a((byte) 116);
            }
        }
    }

    final void a(int param0, int param1, char param2) {
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 == -120) {
          L0: {
            if (pg.c(117)) {
              if ((((rp) this).field_h.field_j ^ -1) == -10) {
                if (-100 == (param1 ^ -1)) {
                  ((rp) this).field_h.a(false, 0);
                  break L0;
                } else {
                  if ((param1 ^ -1) == -97) {
                    ((rp) this).field_h.a(false, 0);
                    break L0;
                  } else {
                    if (param1 == -98) {
                      ((rp) this).field_h.a(false, 0);
                      break L0;
                    } else {
                      if (-99 != param1) {
                        break L0;
                      } else {
                        ((rp) this).field_h.a(false, 8);
                        break L0;
                      }
                    }
                  }
                }
              } else {
                L1: {
                  if (96 == param1) {
                    break L1;
                  } else {
                    if ((param1 ^ -1) != -98) {
                      if (param1 == 99) {
                        ((rp) this).field_h.a(false, 1 - -((rp) this).field_h.field_j);
                        break L0;
                      } else {
                        if (param1 == 98) {
                          if ((((rp) this).field_h.field_j ^ -1) >= -1) {
                            ((rp) this).field_h.a(false, 9);
                            break L0;
                          } else {
                            ((rp) this).field_h.a(false, -1 + ((rp) this).field_h.field_j);
                            break L0;
                          }
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                ((rp) this).field_h.a(false, 9);
                break L0;
              }
            } else {
              super.a(-120, param1, param2);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        field_s = null;
        field_u = null;
        field_z = null;
        field_t = null;
        field_y = null;
        field_w = null;
        if (param0) {
            Object var2 = null;
            rp.a((byte) -63, 85, -10, 116, -76, 75, -37, -95, (int[]) null, 59);
        }
        field_r = null;
    }

    final void d(int param0) {
        if (param0 > -60) {
            rp.c(false);
        }
        if (!pg.c(102)) {
            ((rp) this).a(g.field_o, 0);
        }
    }

    final int a(int param0, int param1) {
        if (param0 > -71) {
            field_u = null;
        }
        int var3 = ((rp) this).field_m[param1].field_f;
        if ((var3 ^ -1) == -43) {
            return 147;
        }
        return super.a(-106, param1);
    }

    rp() {
        super(0, 180, 460, 150, 35, hc.field_e);
        ((rp) this).field_v = new vl();
        int var1 = 468;
        var1 = var1 - da.field_E[1].field_z;
        ((rp) this).field_v.a((nm) (Object) new nq(12, var1, da.field_E[1], rd.a(ii.field_s, new String[1], (byte) 103)), (byte) 3);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = BrickABrac.field_J ? 1 : 0;
        if (param0 <= 115) {
            field_y = null;
        }
        while (true) {
            param6--;
            if (0 > param6) {
                break;
            }
            var17 = param8;
            var10 = var17;
            var11 = param5;
            var12 = param7;
            var13 = param9;
            var14 = param1;
            var15 = var17[var11] >> -467298431 & 8355711;
            var10[var11] = ik.a(255, var14 >> 1004577617) - (-ik.a(var12 >> -1763585791, 16711680) + (-(ik.a(33423869, var13) >> 155375881) - var15));
            param9 = param9 + param4;
            param1 = param1 + param2;
            param5++;
            param7 = param7 + param3;
        }
    }

    final int b(byte param0, int param1) {
        int var4 = -61 % ((param0 - 66) / 45);
        int var3 = ((rp) this).field_m[param1].field_f;
        if (42 != var3) {
            return super.b((byte) 121, param1);
        }
        return ((rp) this).field_q - -super.b((byte) 8, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Invite only";
        field_s = new jp(640, 480);
        field_z = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_y = "Click or press F10 to open Quick Chat";
    }
}
