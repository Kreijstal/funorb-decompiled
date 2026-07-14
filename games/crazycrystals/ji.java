/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends pn {
    private int[] field_p;
    static int field_t;
    private int[] field_o;
    private int[] field_v;
    private int[] field_q;
    boolean field_s;
    private int[] field_m;
    private int[] field_n;
    private int[] field_r;
    static String field_x;
    static String field_u;
    private int[] field_w;

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        if (param0 != 16736352) {
            Object var10 = null;
            boolean discarded$0 = ((ji) this).a(true, (f[][]) null, (mj) null);
            return true;
        }
        return true;
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        if (param0) {
            return true;
        }
        return true;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        if (param0 != -21) {
            Object var9 = null;
            boolean discarded$0 = ((ji) this).a(false, (f[][]) null, (mj) null);
            return true;
        }
        return true;
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
            return true;
        }
        return true;
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6 = -119 / ((param4 - 73) / 42);
        return (f) this;
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return 58;
        }
        return 3;
    }

    final static void a(int param0, java.awt.Component param1) {
        int var2 = -94 / ((param0 - 43) / 35);
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) tm.field_b);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) tm.field_b);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) tm.field_b);
        uc.field_b = 0;
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        f stackIn_15_0 = null;
        f stackOut_14_0 = null;
        Object stackOut_13_0 = null;
        var7 = CrazyCrystals.field_B;
        ((ji) this).field_s = true;
        var5 = 0;
        var6 = 101 % ((param2 - -43) / 51);
        L0: while (true) {
          if (192 <= var5) {
            L1: {
              if (((ji) this).field_s) {
                stackOut_14_0 = ((ji) this).field_l;
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = this;
                stackIn_15_0 = (f) (Object) stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          } else {
            if (-1 > (((ji) this).field_m[var5] ^ -1)) {
              L2: {
                ((ji) this).field_s = false;
                ((ji) this).field_v[var5] = ((ji) this).field_v[var5] + ((ji) this).field_r[var5];
                ((ji) this).field_o[var5] = ((ji) this).field_o[var5] + ((ji) this).field_w[var5];
                ((ji) this).field_q[var5] = ((ji) this).field_q[var5] + ((ji) this).field_n[var5];
                ((ji) this).field_r[var5] = ((ji) this).field_r[var5] - ((ji) this).field_r[var5] / 8;
                ((ji) this).field_w[var5] = ((ji) this).field_w[var5] - ((ji) this).field_w[var5] / 8;
                ((ji) this).field_n[var5] = ((ji) this).field_n[var5] - ((ji) this).field_n[var5] / 8;
                if (((ji) this).field_q[var5] < 0) {
                  ((ji) this).field_q[var5] = -((ji) this).field_q[var5];
                  if (((ji) this).field_n[var5] >= 0) {
                    break L2;
                  } else {
                    ((ji) this).field_n[var5] = -((ji) this).field_n[var5];
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              ((ji) this).field_n[var5] = ((ji) this).field_n[var5] - 64;
              ((ji) this).field_m[var5] = ((ji) this).field_m[var5] - ((ji) this).field_p[var5];
              if (0 > ((ji) this).field_m[var5]) {
                ((ji) this).field_m[var5] = 0;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    ji(f param0, int param1, int param2) {
        super(param0);
        int var4 = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        ((ji) this).field_p = new int[192];
        ((ji) this).field_v = new int[192];
        ((ji) this).field_o = new int[192];
        ((ji) this).field_n = new int[192];
        ((ji) this).field_s = false;
        ((ji) this).field_q = new int[192];
        ((ji) this).field_r = new int[192];
        ((ji) this).field_m = new int[192];
        ((ji) this).field_w = new int[192];
        var4 = 0;
        L0: while (true) {
          if ((var4 ^ -1) <= -193) {
          } else {
            ((ji) this).field_v[var4] = param1 * 5461 + 32768;
            ((ji) this).field_o[var4] = param2 * 5461 + 32768;
            ((ji) this).field_q[var4] = 32768;
            var5 = Math.random() * 6.283185307179586;
            var7 = 1.998 * Math.random() - 0.999;
            var9 = 4096.0 * Math.pow(Math.random(), 0.3333333333333333);
            var11 = var9 * Math.sqrt(1.0 - var7 * var7);
            ((ji) this).field_r[var4] = (int)(var11 * Math.sin(var5));
            ((ji) this).field_w[var4] = (int)(var11 * Math.cos(var5));
            ((ji) this).field_n[var4] = (int)(var7 * var9);
            ((ji) this).field_m[var4] = 255;
            var13 = (int)Math.pow(4.0, Math.random() + 1.0);
            ((ji) this).field_p[var4] = var13;
            ((ji) this).field_v[var4] = ((ji) this).field_v[var4] + ((ji) this).field_r[var4];
            ((ji) this).field_o[var4] = ((ji) this).field_o[var4] + ((ji) this).field_w[var4];
            ((ji) this).field_q[var4] = ((ji) this).field_q[var4] + ((ji) this).field_n[var4];
            var4++;
            continue L0;
          }
        }
    }

    final static boolean f(int param0) {
        if (param0 != 250) {
            field_t = -10;
        }
        return 250 < sn.field_c ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        wm var17 = null;
        var16 = CrazyCrystals.field_B;
        var17 = jf.a(480, param6, 0, param6 - -(param2 * 2), 0);
        if (var17 == null) {
          return;
        } else {
          param4 = param4 - 2 * param1 * param0;
          param6 = param6 - param3 * (param2 * 2);
          var9 = param1 * param2 / 3;
          var10 = 0;
          L0: while (true) {
            if (var10 >= var9) {
              L1: {
                if (param5 == 5461) {
                  break L1;
                } else {
                  ((ji) this).field_n = null;
                  break L1;
                }
              }
              var17.a((byte) -79);
              return;
            } else {
              if ((((ji) this).field_m[var10] ^ -1) < -1) {
                var11 = param6 - -(param2 * ((ji) this).field_v[var10] >> 1788322063);
                var12 = (param1 * (((ji) this).field_o[var10] * 2 - ((ji) this).field_q[var10]) >> -1357614704) + param4;
                var13 = (65280 & ((255 - ((ji) this).field_m[var10]) * (255 - ((ji) this).field_m[var10]) ^ -1)) << -654903288;
                var14 = ((ji) this).field_m[var10] << -164257944 | ((ji) this).field_m[var10] >> 2135870753;
                var15 = var13 | var14;
                kh.b(var11, var12, var15);
                kh.b(-1 + var11, var12, var15 >> 332649505 & 8355711);
                kh.b(var11 - -1, var12, (var15 & 16711423) >> 576028065);
                kh.b(var11, -1 + var12, var15 >> -1160722335 & 8355711);
                kh.b(var11, 1 + var12, var15 >> -461688863 & 8355711);
                var10++;
                continue L0;
              } else {
                var10++;
                continue L0;
              }
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = -77 / ((param0 - 74) / 41);
        ((ji) this).a(0, param2, param1, 0, param5, 5461, param4);
    }

    public static void e(byte param0) {
        if (param0 != -8) {
            return;
        }
        field_u = null;
        field_x = null;
    }

    final int a(boolean param0) {
        if (param0) {
            ji.e((byte) -61);
        }
        return ((ji) this).field_l.a(false);
    }

    final boolean b(byte param0) {
        if (param0 < 43) {
            return false;
        }
        return true;
    }

    final int b(int param0) {
        if (param0 != -3445) {
            field_x = null;
        }
        return ((ji) this).field_l.b(-3445);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        ((ji) this).field_l = ((ji) this).field_l.a(param0, param1, param2, param3, param4, param5);
        return (f) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 55;
        field_u = "Esc";
    }
}
