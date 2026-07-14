/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ou extends fd {
    private ut field_I;
    private ut field_D;
    static int field_y;
    private int field_F;
    private ut[] field_z;
    private int field_x;
    private int field_A;
    private int field_G;
    boolean field_w;
    int field_C;
    private ut field_v;
    private int field_H;
    private int field_E;
    static int field_B;

    private final ut a(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        int var2 = ((ou) this).field_i >> -1951459327;
        if (param0) {
            ((ou) this).field_D = null;
        }
        ut var3 = new ut(var2, ((ou) this).field_i);
        iw.a(99, var3);
        for (var4 = 0; ((ou) this).field_i > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((ou) this).field_i + -var4) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                on.a(var5, var4, var8 << 554622184 | var8 | var8 << 1985072272);
            }
        }
        ta.e(124);
        return var3;
    }

    final static void a(byte param0, sj param1) {
        int var3 = 0;
        int var4 = 0;
        kk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ml var8 = null;
        int var9 = 0;
        ml var10 = null;
        var7 = Kickabout.field_G;
        var8 = new ml(param1.a("", "logo.fo3d", 48));
        var10 = var8;
        var3 = var10.h((byte) -109);
        var10.p(-111);
        sq.field_H = ds.a(var10, (byte) -4);
        sm.field_l = new int[var3][];
        ba.field_n = new kk[var3];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3) {
            L1: {
              var10.l((byte) -63);
              if (param0 == 49) {
                break L1;
              } else {
                field_y = -86;
                break L1;
              }
            }
            var9 = 0;
            var4 = var9;
            L2: while (true) {
              if (var3 <= var9) {
                return;
              } else {
                var5 = ba.field_n[var9];
                var5.a(6, 6, 256, 1, 6);
                var5.a(false);
                var6 = new int[]{var5.field_h + var5.field_y >> -1654777791, var5.field_s - -var5.field_x >> 1638215841, var5.field_t + var5.field_w >> 1414549793};
                sm.field_l[var9] = var6;
                var5.a(-var6[2], -var6[0], param0 ^ 49, -var6[1]);
                var9++;
                continue L2;
              }
            }
          } else {
            ba.field_n[var4] = vi.a((byte) 80, var8);
            var4++;
            continue L0;
          }
        }
    }

    private final void a(ut param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        if (param2 == 124) {
          var5 = ((ou) this).field_n + param1;
          pt.a(var5 + -((ou) this).field_v.field_q, -22914, param1 - -((ou) this).field_v.field_q, ((ou) this).field_i + param3, param3);
          var6 = param1 + -((ou) this).field_H;
          L0: while (true) {
            if (var5 <= var6) {
              L1: {
                ta.e(param2 + -1);
                if (on.field_b > ((ou) this).field_v.field_q + param1) {
                  break L1;
                } else {
                  iw.a(param2 ^ -84, ((ou) this).field_I);
                  param0.c(-((ou) this).field_H, 0);
                  param0.c(((ou) this).field_G * 2 - ((ou) this).field_H, 0);
                  ((ou) this).field_D.e(0, 0);
                  ta.e(117);
                  ((ou) this).field_I.c(param1, param3);
                  break L1;
                }
              }
              L2: {
                if (on.field_c < var5 + -((ou) this).field_v.field_q) {
                  break L2;
                } else {
                  iw.a(-107, ((ou) this).field_I);
                  var7 = ((ou) this).field_n + -((ou) this).field_v.field_q + ((ou) this).field_H;
                  L3: while (true) {
                    if (var7 <= ((ou) this).field_G * 2) {
                      param0.c(-var7, 0);
                      param0.c(-var7 + 2 * ((ou) this).field_G, 0);
                      ((ou) this).field_v.e(0, 0);
                      ta.e(120);
                      ((ou) this).field_I.c(-((ou) this).field_v.field_q + var5, param3);
                      break L2;
                    } else {
                      var7 = var7 - ((ou) this).field_G * 2;
                      continue L3;
                    }
                  }
                }
              }
              return;
            } else {
              param0.c(var6, param3);
              var6 = var6 + param0.field_q;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            ou.a(-7);
        }
        wq.field_g = false;
        hk.field_G = false;
        qd.b(38, -1);
        mj.field_a = vj.field_a;
        wk.field_f = vj.field_a;
    }

    final void a(byte param0, int param1, int param2) {
        ((ou) this).field_A = param1;
        ((ou) this).field_F = 8355711 & param2 >> 2025978209;
        if (param0 != 21) {
            Object var5 = null;
            ou.a((byte) -30, (sj) null);
        }
        ((ou) this).field_E = param2;
        ((ou) this).field_x = (16711422 & param1) >> -944344703;
        this.a((byte) 121);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) 121);
    }

    private final ut a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ut var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = Kickabout.field_G;
        var14 = new ut(((ou) this).field_G * 2, ((ou) this).field_i);
        iw.a(-66, var14);
        if (param0 == -257) {
          var5 = ((ou) this).field_i >> 1602903777;
          var6 = 0;
          L0: while (true) {
            if (((ou) this).field_i <= var6) {
              ta.e(122);
              return var14;
            } else {
              L1: {
                var7 = (2 * ((ou) this).field_G + -1) * (var6 >> -102644607) % (((ou) this).field_G * 2);
                var8 = param2 & 16711935;
                var9 = param2 & 65280;
                var10 = var6 - var5;
                var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
                if (-257 < (var11 ^ -1)) {
                  stackOut_6_0 = (var11 * var8 & -16711936 | 16711680 & var9 * var11) >>> -924534296;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = var8 | var9;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                on.f(var7, var6, ((ou) this).field_G, var12);
                var9 = 65280 & param1;
                on.f(-(((ou) this).field_G * 2) + var7, var6, ((ou) this).field_G, var12);
                var8 = param1 & 16711935;
                if (256 <= var11) {
                  stackOut_9_0 = var8 | var9;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = (-16711936 & var11 * var8 | var11 * var9 & 16711680) >>> 773111592;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              on.f(var7 - -((ou) this).field_G, var6, ((ou) this).field_G, var12);
              on.f(-((ou) this).field_G + var7, var6, ((ou) this).field_G, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    ou(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1016589217, param6 >> 174795073 & 8355711);
    }

    final static int b(int param0, int param1, int param2, int param3) {
        if (!(on.field_g < param1 + param0)) {
            return param1;
        }
        if (-1 >= (param1 + (param2 + -param0) ^ -1)) {
            return -param0 + (param1 - -param2);
        }
        if (param3 < 126) {
            int discarded$0 = ou.b(80, 123, -76, -16);
        }
        return -param0 + on.field_g;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != param0) {
            return;
        }
        int var5 = ((ou) this).field_t + param2;
        int var6 = param3 + ((ou) this).field_g;
        this.a(((ou) this).field_z[0], var5, (byte) 124, var6);
        if (param1 != 65) {
            ((ou) this).field_x = 38;
        }
        if (65536 > ((ou) this).field_C) {
            pt.a(var5 - -((ou) this).field_n, -22914, var5 + (((ou) this).field_C * ((ou) this).field_n >> -959270480), ((ou) this).field_i + var6, var6);
            this.a(((ou) this).field_z[1], var5, (byte) 124, var6);
            ta.e(127);
        }
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        if (param0 != 12) {
            ou.a(27);
        }
        if (((ou) this).field_w) {
            ((ou) this).field_H = ((ou) this).field_H + 1;
            if (!(((ou) this).field_H <= ((ou) this).field_G * 2)) {
                ((ou) this).field_H = ((ou) this).field_H - ((ou) this).field_G * 2;
            }
        }
    }

    private final void a(byte param0) {
        if (param0 != 121) {
            return;
        }
        ((ou) this).field_z = new ut[]{this.a(-257, ((ou) this).field_A, ((ou) this).field_E), this.a(-257, ((ou) this).field_x, ((ou) this).field_F)};
        ((ou) this).field_v = this.a(false);
        ((ou) this).field_D = ((ou) this).field_v.f();
        ((ou) this).field_I = new ut(((ou) this).field_i >> -1890802207, ((ou) this).field_i);
    }

    final static int b(int param0, int param1, int param2, boolean param3) {
        if (param1 != -1951459327) {
            return 80;
        }
        return hg.g(100);
    }

    private ou(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((ou) this).field_G = param4;
        ((ou) this).field_x = param8;
        ((ou) this).field_A = param6;
        ((ou) this).field_F = param7;
        ((ou) this).field_E = param5;
        ((ou) this).a(param3, 1, param0, param2, param1);
    }

    static {
    }
}
