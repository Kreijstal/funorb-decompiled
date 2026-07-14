/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss extends ea {
    private int field_y;
    private ll field_A;
    private int field_B;
    private int field_x;
    private ll field_D;
    private int field_s;
    private ll field_C;
    int field_z;
    private int field_v;
    private int field_r;
    private ll[] field_w;
    boolean field_u;
    static boolean field_t;

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 <= 122) {
            return;
        }
        this.a(param0, param1, param2, param3, (byte) 124);
        this.a(-104);
    }

    private final ll b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ll var13 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = new ll(((ss) this).field_y * 2, ((ss) this).field_n);
        cm.a(var13, -14492);
        var5 = ((ss) this).field_n >> 723342241;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((ss) this).field_n) {
            L1: {
              if (param1 == 128) {
                break L1;
              } else {
                ((ss) this).a(90, 49, (byte) 110);
                break L1;
              }
            }
            sl.c(2765);
            return var13;
          } else {
            L2: {
              var7 = (var6 >> -1889073951) * (2 * ((ss) this).field_y + -1) % (((ss) this).field_y * 2);
              var8 = 16711935 & param0;
              var9 = param0 & 65280;
              var10 = -var5 + var6;
              var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5));
              if (var11 < 256) {
                stackOut_4_0 = (-16711936 & var11 * var8 | var9 * var11 & 16711680) >>> -222422424;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = var8 | var9;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_5_0;
              vp.b(var7, var6, ((ss) this).field_y, var12);
              var9 = param2 & 65280;
              var8 = 16711935 & param2;
              vp.b(-(2 * ((ss) this).field_y) + var7, var6, ((ss) this).field_y, var12);
              if (-257 < (var11 ^ -1)) {
                stackOut_7_0 = (-16711936 & var11 * var8 | 16711680 & var11 * var9) >>> -2045428152;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = var9 | var8;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            var12 = stackIn_8_0;
            vp.b(((ss) this).field_y + var7, var6, ((ss) this).field_y, var12);
            vp.b(-((ss) this).field_y + var7, var6, ((ss) this).field_y, var12);
            var6++;
            continue L0;
          }
        }
    }

    private final void a(int param0) {
        ((ss) this).field_w = new ll[]{this.b(((ss) this).field_v, 128, ((ss) this).field_B), this.b(((ss) this).field_x, 128, ((ss) this).field_s)};
        int var2 = 64 % ((param0 - -63) / 35);
        ((ss) this).field_D = this.b(true);
        ((ss) this).field_C = ((ss) this).field_D.a();
        ((ss) this).field_A = new ll(((ss) this).field_n >> 1380815521, ((ss) this).field_n);
    }

    ss(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -1152842559 & 8355711, 8355711 & param6 >> 2014843105);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        int var5 = param3 + ((ss) this).field_p;
        int var6 = ((ss) this).field_h + param2;
        this.a(var5, 118, var6, ((ss) this).field_w[0]);
        if (param0 < 64) {
            ((ss) this).field_B = -13;
        }
        if (!(((ss) this).field_z >= 65536)) {
            fp.a((byte) 77, var6, var6 + ((ss) this).field_n, ((ss) this).field_q + var5, (((ss) this).field_q * ((ss) this).field_z >> 1193983056) + var5);
            this.a(var5, -101, var6, ((ss) this).field_w[1]);
            sl.c(2765);
        }
    }

    final void a(int param0, int param1, byte param2) {
        ((ss) this).field_x = (16711422 & param1) >> 451915745;
        ((ss) this).field_B = param0;
        int var4 = -88 % ((-6 - param2) / 58);
        ((ss) this).field_v = param1;
        ((ss) this).field_s = (param0 & 16711422) >> -117049695;
        this.a(-116);
    }

    private final ll b(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        if (!param0) {
            ((ss) this).field_v = -80;
        }
        int var2 = ((ss) this).field_n >> -367475647;
        ll var3 = new ll(var2, ((ss) this).field_n);
        cm.a(var3, -14492);
        for (var4 = 0; var4 < ((ss) this).field_n; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((ss) this).field_n) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 <= var6 ? 255 : (int)(255.0 * var6);
                }
                vp.a(var5, var4, var8 | var8 << -1704431032 | var8 << 1161378064);
            }
        }
        sl.c(2765);
        return var3;
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        if (!(!((ss) this).field_u)) {
            ((ss) this).field_r = ((ss) this).field_r + 1;
            if (!(2 * ((ss) this).field_y >= ((ss) this).field_r)) {
                ((ss) this).field_r = ((ss) this).field_r - ((ss) this).field_y * 2;
            }
        }
        if (param0 <= 13) {
            ((ss) this).field_z = 30;
        }
    }

    private final void a(int param0, int param1, int param2, ll param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = AceOfSkies.field_G ? 1 : 0;
        var5 = ((ss) this).field_q + param0;
        fp.a((byte) 44, param2, param2 - -((ss) this).field_n, -((ss) this).field_D.field_r + var5, param0 + ((ss) this).field_D.field_r);
        var6 = -13 / ((-39 - param1) / 58);
        var7 = -((ss) this).field_r + param0;
        L0: while (true) {
          if (var5 <= var7) {
            L1: {
              sl.c(2765);
              if (((ss) this).field_D.field_r + param0 >= vp.field_b) {
                cm.a(((ss) this).field_A, -14492);
                param3.b(-((ss) this).field_r, 0);
                param3.b(2 * ((ss) this).field_y - ((ss) this).field_r, 0);
                ((ss) this).field_C.a(0, 0);
                sl.c(2765);
                ((ss) this).field_A.b(param0, param2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (vp.field_k >= var5 - ((ss) this).field_D.field_r) {
                cm.a(((ss) this).field_A, -14492);
                var8 = ((ss) this).field_r + ((ss) this).field_q + -((ss) this).field_D.field_r;
                L3: while (true) {
                  if (2 * ((ss) this).field_y >= var8) {
                    param3.b(-var8, 0);
                    param3.b(((ss) this).field_y * 2 - var8, 0);
                    ((ss) this).field_D.a(0, 0);
                    sl.c(2765);
                    ((ss) this).field_A.b(var5 - ((ss) this).field_D.field_r, param2);
                    break L2;
                  } else {
                    var8 = var8 - 2 * ((ss) this).field_y;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            return;
          } else {
            param3.b(var7, param2);
            var7 = var7 + ((ll) param3).field_r;
            continue L0;
          }
        }
    }

    private ss(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((ss) this).field_s = param8;
        ((ss) this).field_y = param4;
        ((ss) this).field_B = param6;
        ((ss) this).field_v = param5;
        ((ss) this).field_x = param7;
        ((ss) this).a(param3, param0, param1, param2, (byte) 127);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = false;
    }
}
