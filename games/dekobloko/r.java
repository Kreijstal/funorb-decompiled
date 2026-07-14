/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends ce {
    private int field_N;
    boolean field_L;
    private ck field_O;
    private int field_J;
    private int field_M;
    private ck[] field_P;
    private int field_S;
    private ck field_K;
    private int field_H;
    private ck field_G;
    private int field_R;
    int field_Q;

    r(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -1519559391, (param6 & 16711422) >> -1248347583);
    }

    final static void a(boolean param0, int param1) {
        if (vh.field_h != null) {
            vh.field_h.a(1141039778, param0);
        }
        if (param1 != 4028) {
            r.a(false, 20);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.b(true);
    }

    private final void b(boolean param0) {
        if (!param0) {
            ck discarded$0 = this.e((byte) 116);
        }
        ((r) this).field_P = new ck[]{this.b(-81, ((r) this).field_M, ((r) this).field_H), this.b(-107, ((r) this).field_S, ((r) this).field_N)};
        ((r) this).field_O = this.e((byte) -125);
        ((r) this).field_K = ((r) this).field_O.e();
        ((r) this).field_G = new ck(((r) this).field_y >> 1564443297, ((r) this).field_y);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(-1 == (param2 ^ -1))) {
            return;
        }
        int var5 = ((r) this).field_u + param0;
        if (param1 > -103) {
            ((r) this).a(-17, 35, 5);
        }
        int var6 = param3 - -((r) this).field_D;
        this.a(-2044, var6, var5, ((r) this).field_P[0]);
        if (!(65536 <= ((r) this).field_Q)) {
            gg.a(var6, 20763, var5 - -((r) this).field_t, var5 + (((r) this).field_Q * ((r) this).field_t >> -172186704), ((r) this).field_y + var6);
            this.a(-2044, var6, var5, ((r) this).field_P[1]);
            mk.a((byte) -5);
        }
    }

    private final ck e(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = client.field_A ? 1 : 0;
        int var2 = ((r) this).field_y >> -760619487;
        ck var3 = new ck(var2, ((r) this).field_y);
        tb.a(true, var3);
        for (var4 = 0; var4 < ((r) this).field_y; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((r) this).field_y));
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 <= var6 ? 255 : (int)(255.0 * var6);
                }
                hk.a(var5, var4, var8 << 23521128 | var8 | var8 << -98736656);
            }
        }
        mk.a((byte) -5);
        if (param0 > -73) {
            ((r) this).field_M = -48;
        }
        return var3;
    }

    private final ck b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ck var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = client.field_A ? 1 : 0;
          if (param0 < -78) {
            break L0;
          } else {
            ((r) this).field_K = null;
            break L0;
          }
        }
        var14 = new ck(2 * ((r) this).field_J, ((r) this).field_y);
        tb.a(true, var14);
        var5 = ((r) this).field_y >> 1326292865;
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((r) this).field_y) {
            mk.a((byte) -5);
            return var14;
          } else {
            L2: {
              var7 = (-1 + ((r) this).field_J * 2) * (var6 >> 221156193) % (((r) this).field_J * 2);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = -var5 + var6;
              var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
              if ((var11 ^ -1) > -257) {
                stackOut_6_0 = (var8 * var11 & -16711936 | 16711680 & var9 * var11) >>> -464832536;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = var8 | var9;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              hk.a(var7, var6, ((r) this).field_J, var12);
              var9 = param1 & 65280;
              hk.a(-(((r) this).field_J * 2) + var7, var6, ((r) this).field_J, var12);
              var8 = 16711935 & param1;
              if ((var11 ^ -1) > -257) {
                stackOut_9_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> -721839096;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var8 | var9;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            hk.a(var7 - -((r) this).field_J, var6, ((r) this).field_J, var12);
            hk.a(-((r) this).field_J + var7, var6, ((r) this).field_J, var12);
            var6++;
            continue L1;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 4088) {
            ck discarded$0 = this.e((byte) 42);
        }
        ((r) this).field_N = 8355711 & param2 >> -111273055;
        ((r) this).field_H = param2;
        ((r) this).field_M = param0;
        ((r) this).field_S = (param0 & 16711422) >> -329332639;
        this.b(true);
    }

    final void a(ce param0, int param1, int param2, int param3) {
        if (param1 <= 38) {
            ((r) this).field_Q = -76;
        }
        if (((r) this).field_L) {
            ((r) this).field_R = ((r) this).field_R + 1;
            if (2 * ((r) this).field_J < ((r) this).field_R) {
                ((r) this).field_R = ((r) this).field_R - 2 * ((r) this).field_J;
            }
        }
    }

    private final void a(int param0, int param1, int param2, ck param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = client.field_A ? 1 : 0;
          var5 = param2 + ((r) this).field_t;
          if (param0 == -2044) {
            break L0;
          } else {
            r.a(true, 38);
            break L0;
          }
        }
        gg.a(param1, 20763, var5 + -((r) this).field_O.field_I, ((r) this).field_O.field_I + param2, ((r) this).field_y + param1);
        var6 = param2 + -((r) this).field_R;
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              mk.a((byte) -5);
              if (param2 + ((r) this).field_O.field_I < hk.field_c) {
                break L2;
              } else {
                tb.a(true, ((r) this).field_G);
                param3.c(-((r) this).field_R, 0);
                param3.c(-((r) this).field_R + ((r) this).field_J * 2, 0);
                ((r) this).field_K.f(0, 0);
                mk.a((byte) -5);
                ((r) this).field_G.c(param2, param1);
                break L2;
              }
            }
            L3: {
              if (-((r) this).field_O.field_I + var5 > hk.field_g) {
                break L3;
              } else {
                tb.a(true, ((r) this).field_G);
                var7 = -((r) this).field_O.field_I + (((r) this).field_t - -((r) this).field_R);
                L4: while (true) {
                  if (((r) this).field_J * 2 >= var7) {
                    param3.c(-var7, 0);
                    param3.c(2 * ((r) this).field_J - var7, 0);
                    ((r) this).field_O.f(0, 0);
                    mk.a((byte) -5);
                    ((r) this).field_G.c(var5 - ((r) this).field_O.field_I, param1);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((r) this).field_J;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            param3.c(var6, param1);
            var6 = var6 + param3.field_I;
            continue L1;
          }
        }
    }

    private r(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((r) this).field_H = param5;
        ((r) this).field_S = param8;
        ((r) this).field_J = param4;
        ((r) this).field_M = param6;
        ((r) this).field_N = param7;
        ((r) this).b(param3, param2, param0, param1, -16555);
    }

    static {
    }
}
