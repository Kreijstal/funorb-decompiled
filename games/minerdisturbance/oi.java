/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends fe {
    private ea field_F;
    private int field_Q;
    private int field_H;
    static String field_K;
    private int field_N;
    private int field_P;
    boolean field_O;
    private int field_D;
    private ea[] field_E;
    static String[] field_J;
    private ea field_M;
    private int field_L;
    int field_R;
    private ea field_I;

    final void a(int param0, int param1, byte param2) {
        if (param2 > -103) {
            Object var5 = null;
            ((oi) this).a(55, 86, (byte) 13, (fe) null);
        }
        ((oi) this).field_L = param1 >> 562189217 & 8355711;
        ((oi) this).field_Q = (param0 & 16711422) >> 312698497;
        ((oi) this).field_H = param0;
        ((oi) this).field_P = param1;
        this.a(-1262785631);
    }

    private final ea a(int param0, int param1, boolean param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ea var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = MinerDisturbance.field_ab;
          if (!param2) {
            break L0;
          } else {
            ((oi) this).field_Q = 49;
            break L0;
          }
        }
        var14 = new ea(2 * ((oi) this).field_N, ((oi) this).field_q);
        vb.a(var14, 125);
        var5 = ((oi) this).field_q >> -1523268447;
        var6 = 0;
        L1: while (true) {
          if (((oi) this).field_q <= var6) {
            tk.b(true);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -851865311) * (((oi) this).field_N * 2 + -1) % (2 * ((oi) this).field_N);
              var8 = param0 & 16711935;
              var9 = param0 & 65280;
              var10 = var6 - var5;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
              if (var11 < 256) {
                stackOut_6_0 = (-16711936 & var8 * var11 | 16711680 & var9 * var11) >>> 1777000040;
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
              eh.e(var7, var6, ((oi) this).field_N, var12);
              var9 = 65280 & param1;
              var8 = param1 & 16711935;
              eh.e(-(((oi) this).field_N * 2) + var7, var6, ((oi) this).field_N, var12);
              if (-257 >= (var11 ^ -1)) {
                stackOut_9_0 = var9 | var8;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = (-16711936 & var11 * var8 | 16711680 & var11 * var9) >>> -564666040;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            eh.e(var7 - -((oi) this).field_N, var6, ((oi) this).field_N, var12);
            eh.e(-((oi) this).field_N + var7, var6, ((oi) this).field_N, var12);
            var6++;
            continue L1;
          }
        }
    }

    oi(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1245071425 & 8355711, 8355711 & param6 >> -1880108831);
    }

    public static void a(byte param0) {
        field_J = null;
        field_K = null;
        if (param0 < 15) {
            field_K = null;
        }
    }

    private final void a(int param0) {
        if (param0 != -1262785631) {
            return;
        }
        ((oi) this).field_E = new ea[]{this.a(((oi) this).field_P, ((oi) this).field_H, false), this.a(((oi) this).field_L, ((oi) this).field_Q, false)};
        ((oi) this).field_F = this.c((byte) -125);
        ((oi) this).field_I = ((oi) this).field_F.e();
        ((oi) this).field_M = new ea(((oi) this).field_q >> -1262785631, ((oi) this).field_q);
    }

    private final ea c(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = MinerDisturbance.field_ab;
        int var2 = ((oi) this).field_q >> 555381601;
        ea var3 = new ea(var2, ((oi) this).field_q);
        vb.a(var3, 125);
        for (var4 = 0; var4 < ((oi) this).field_q; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((oi) this).field_q));
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = var6 < 1.0 ? (int)(var6 * 255.0) : 255;
                }
                eh.b(var5, var4, var8 << 973089680 | (var8 | var8 << -937519352));
            }
        }
        tk.b(true);
        if (param0 >= -105) {
            this.a(65);
        }
        return var3;
    }

    final static void a(we param0, we param1, int param2, int param3) {
        w.field_S = param3;
        ta.field_b = param0;
        if (param2 < 86) {
            Object var5 = null;
            oi.a((we) null, (we) null, -28, -53);
        }
        gh.field_b = param1;
        ti.a((byte) 88, eh.field_c / 2, eh.field_g / 2);
        vl.a(param1.field_E + param1.field_N, param1.field_N, false, param0.field_N - -param0.field_E, param0.field_N);
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != -19804) {
            oi.a((byte) -17);
        }
        return pd.a(param1, 10, true, (byte) 78);
    }

    private final void a(int param0, int param1, int param2, ea param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = MinerDisturbance.field_ab;
          var5 = param2 - -((oi) this).field_v;
          wf.a(param1, param2 + ((oi) this).field_F.field_y, (byte) 8, -((oi) this).field_F.field_y + var5, ((oi) this).field_q + param1);
          if (param0 == 21984) {
            break L0;
          } else {
            var9 = null;
            boolean discarded$1 = oi.a(-125, (CharSequence) null);
            break L0;
          }
        }
        var6 = param2 - ((oi) this).field_D;
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              tk.b(true);
              if (eh.field_a > ((oi) this).field_F.field_y + param2) {
                break L2;
              } else {
                vb.a(((oi) this).field_M, 126);
                param3.f(-((oi) this).field_D, 0);
                param3.f(-((oi) this).field_D + ((oi) this).field_N * 2, 0);
                ((oi) this).field_I.e(0, 0);
                tk.b(true);
                ((oi) this).field_M.f(param2, param1);
                break L2;
              }
            }
            L3: {
              if (var5 - ((oi) this).field_F.field_y > eh.field_k) {
                break L3;
              } else {
                vb.a(((oi) this).field_M, 127);
                var7 = ((oi) this).field_v - (((oi) this).field_F.field_y + -((oi) this).field_D);
                L4: while (true) {
                  if (var7 <= ((oi) this).field_N * 2) {
                    param3.f(-var7, 0);
                    param3.f(-var7 + 2 * ((oi) this).field_N, 0);
                    ((oi) this).field_F.e(0, 0);
                    tk.b(true);
                    ((oi) this).field_M.f(-((oi) this).field_F.field_y + var5, param1);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((oi) this).field_N;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            param3.f(var6, param1);
            var6 = var6 + param3.field_y;
            continue L1;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        if (param0 != 4) {
            Object var7 = null;
            oi.a((we) null, (we) null, -20, 96);
        }
        int var5 = param1 - -((oi) this).field_u;
        int var6 = ((oi) this).field_t + param2;
        this.a(param0 + 21980, var6, var5, ((oi) this).field_E[0]);
        if (!(((oi) this).field_R >= 65536)) {
            wf.a(var6, (((oi) this).field_v * ((oi) this).field_R >> -1806436432) + var5, (byte) 8, ((oi) this).field_v + var5, var6 - -((oi) this).field_q);
            this.a(21984, var6, var5, ((oi) this).field_E[1]);
            tk.b(true);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 > -33) {
            ((oi) this).field_F = null;
        }
        super.a(param0, -67, param2, param3, param4);
        this.a(-1262785631);
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        if (((oi) this).field_O) {
            ((oi) this).field_D = ((oi) this).field_D + 1;
            if (!(((oi) this).field_D <= ((oi) this).field_N * 2)) {
                ((oi) this).field_D = ((oi) this).field_D - 2 * ((oi) this).field_N;
            }
        }
        if (param2 <= 49) {
            this.a(-126);
        }
    }

    private oi(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((oi) this).field_H = param6;
        ((oi) this).field_L = param7;
        ((oi) this).field_P = param5;
        ((oi) this).field_N = param4;
        ((oi) this).field_Q = param8;
        ((oi) this).a(param3, -72, param0, param2, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_K = "Connection timed out. Please try using a different server.";
    }
}
