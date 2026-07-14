/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends lk {
    private int field_x;
    private int field_w;
    private tg[] field_z;
    private tg field_I;
    static String field_J;
    static String field_D;
    private int field_K;
    private tg field_M;
    boolean field_C;
    static int field_y;
    private int field_L;
    static String[] field_E;
    static String[] field_A;
    int field_F;
    private int field_H;
    private int field_G;
    private tg field_B;

    final static void a(int param0, boolean param1, int param2) {
        ck.field_c = param0;
        sj.field_d = param2;
        if (!param1) {
            int discarded$0 = ll.c(62, 103, 114);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(true);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != param0) {
            return;
        }
        if (param2 <= 33) {
            field_J = null;
        }
        int var5 = ((ll) this).field_r + param3;
        int var6 = ((ll) this).field_i + param1;
        this.a(((ll) this).field_z[0], var5, (byte) -23, var6);
        if (((ll) this).field_F < 65536) {
            ai.a(((ll) this).field_k + var5, ((ll) this).field_m + var6, var6, (((ll) this).field_k * ((ll) this).field_F >> 333476176) + var5, -19852);
            this.a(((ll) this).field_z[1], var5, (byte) -108, var6);
            ve.a(-121);
        }
    }

    private final tg b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        tg var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = Bounce.field_N;
          var14 = new tg(2 * ((ll) this).field_K, ((ll) this).field_m);
          if (param1 == -30578) {
            break L0;
          } else {
            ((ll) this).field_w = -85;
            break L0;
          }
        }
        kh.a(var14, 1);
        var5 = ((ll) this).field_m >> 943676897;
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((ll) this).field_m) {
            ve.a(-124);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> 255962913) * (2 * ((ll) this).field_K - 1) % (((ll) this).field_K * 2);
              var8 = param0 & 16711935;
              var9 = 65280 & param0;
              var10 = var6 - var5;
              var11 = (int)(Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5 * 128.0) + 128;
              if (256 > var11) {
                stackOut_6_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> -530336344;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = var9 | var8;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              na.a(var7, var6, ((ll) this).field_K, var12);
              var9 = 65280 & param2;
              var8 = 16711935 & param2;
              na.a(var7 + -(((ll) this).field_K * 2), var6, ((ll) this).field_K, var12);
              if (-257 >= (var11 ^ -1)) {
                stackOut_9_0 = var8 | var9;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = (var11 * var8 & -16711936 | 16711680 & var9 * var11) >>> -833159192;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            na.a(((ll) this).field_K + var7, var6, ((ll) this).field_K, var12);
            na.a(var7 - ((ll) this).field_K, var6, ((ll) this).field_K, var12);
            var6++;
            continue L1;
          }
        }
    }

    final void a(int param0, int param1, int param2, lk param3) {
        if (param0 != -1) {
            tg discarded$0 = this.d((byte) -57);
        }
        if (!(!((ll) this).field_C)) {
            ((ll) this).field_w = ((ll) this).field_w + 1;
            if (!(((ll) this).field_w <= 2 * ((ll) this).field_K)) {
                ((ll) this).field_w = ((ll) this).field_w - 2 * ((ll) this).field_K;
            }
        }
    }

    final static int c(int param0, int param1, int param2) {
        int var4 = Bounce.field_N;
        if (param0 != -15083) {
            return 28;
        }
        int var3 = 1;
        while (param1 < -2) {
            if (-1 != (1 & param1)) {
                var3 = var3 * param2;
            }
            param1 = param1 >> 1;
            param2 = param2 * param2;
        }
        if (1 == param1) {
            return param2 * var3;
        }
        return var3;
    }

    private final void a(boolean param0) {
        ((ll) this).field_z = new tg[]{this.b(((ll) this).field_G, -30578, ((ll) this).field_H), this.b(((ll) this).field_L, -30578, ((ll) this).field_x)};
        if (!param0) {
            ((ll) this).field_C = true;
        }
        ((ll) this).field_M = this.d((byte) -21);
        ((ll) this).field_I = ((ll) this).field_M.a();
        ((ll) this).field_B = new tg(((ll) this).field_m >> -738631167, ((ll) this).field_m);
    }

    private final void a(tg param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        var5 = ((ll) this).field_k + param1;
        ai.a(var5 + -((ll) this).field_M.field_s, ((ll) this).field_m + param3, param3, ((ll) this).field_M.field_s + param1, -19852);
        var6 = param1 + -((ll) this).field_w;
        L0: while (true) {
          if (var6 >= var5) {
            L1: {
              ve.a(-125);
              if (na.field_g <= param1 - -((ll) this).field_M.field_s) {
                kh.a(((ll) this).field_B, 1);
                param0.a(-((ll) this).field_w, 0);
                param0.a(-((ll) this).field_w + 2 * ((ll) this).field_K, 0);
                ((ll) this).field_I.e(0, 0);
                ve.a(-119);
                ((ll) this).field_B.a(param1, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (na.field_b >= var5 - ((ll) this).field_M.field_s) {
                kh.a(((ll) this).field_B, 1);
                var7 = ((ll) this).field_k + -((ll) this).field_M.field_s + ((ll) this).field_w;
                L3: while (true) {
                  if (var7 <= 2 * ((ll) this).field_K) {
                    param0.a(-var7, 0);
                    param0.a(2 * ((ll) this).field_K - var7, 0);
                    ((ll) this).field_M.e(0, 0);
                    ve.a(-120);
                    ((ll) this).field_B.a(var5 - ((ll) this).field_M.field_s, param3);
                    break L2;
                  } else {
                    var7 = var7 - ((ll) this).field_K * 2;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            var7 = 18 % ((-66 - param2) / 41);
            return;
          } else {
            param0.a(var6, param3);
            var6 = var6 + param0.field_s;
            continue L0;
          }
        }
    }

    public static void e(byte param0) {
        if (param0 >= -35) {
            ll.e((byte) 2);
        }
        field_A = null;
        field_J = null;
        field_D = null;
        field_E = null;
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 334829249, param6 >> 1448762113 & 8355711);
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 <= 125) {
            return;
        }
        ((ll) this).field_x = (param0 & 16711422) >> -899694559;
        ((ll) this).field_G = param2;
        ((ll) this).field_L = (param2 & 16711422) >> 234730113;
        ((ll) this).field_H = param0;
        this.a(true);
    }

    private final tg d(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Bounce.field_N;
        int var2 = ((ll) this).field_m >> 26196609;
        tg var3 = new tg(var2, ((ll) this).field_m);
        kh.a(var3, 1);
        for (var4 = 0; var4 < ((ll) this).field_m; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((ll) this).field_m) * var4);
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                na.a(var5, var4, var8 << 1789911408 | (var8 << 785080008 | var8));
            }
        }
        if (param0 != -21) {
            ((ll) this).field_H = 121;
        }
        ve.a(param0 ^ 107);
        return var3;
    }

    private ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((ll) this).field_H = param6;
        ((ll) this).field_x = param8;
        ((ll) this).field_K = param4;
        ((ll) this).field_G = param5;
        ((ll) this).field_L = param7;
        ((ll) this).b(param3, 80, param2, param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Please send me news and updates (I can unsubscribe at any time)";
        field_J = "This password contains your Player Name, and would be easy to guess";
        field_A = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_y = 0;
    }
}
