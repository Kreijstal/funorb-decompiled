/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends w {
    private int field_x;
    static db[] field_A;
    private int field_E;
    private int field_y;
    int field_K;
    private db field_z;
    private db[] field_F;
    static String field_L;
    private int field_C;
    static String field_B;
    private db field_D;
    private int field_M;
    private int field_I;
    boolean field_G;
    private db field_H;

    private final db a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        db var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = Lexicominos.field_L ? 1 : 0;
        var14 = new db(((md) this).field_I * 2, ((md) this).field_v);
        de.a(var14, 6);
        var5 = ((md) this).field_v >> 344066273;
        if (param2 <= -38) {
          var6 = 0;
          L0: while (true) {
            if (((md) this).field_v <= var6) {
              pd.a(-22949);
              return var14;
            } else {
              L1: {
                var7 = (var6 >> 561276993) * (2 * ((md) this).field_I - 1) % (2 * ((md) this).field_I);
                var8 = 16711935 & param1;
                var9 = param1 & 65280;
                var10 = -var5 + var6;
                var11 = 128 - -(int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
                if (var11 >= 256) {
                  stackOut_6_0 = var8 | var9;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> -1584727736;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                lf.a(var7, var6, ((md) this).field_I, var12);
                lf.a(var7 - ((md) this).field_I * 2, var6, ((md) this).field_I, var12);
                var9 = param0 & 65280;
                var8 = param0 & 16711935;
                if ((var11 ^ -1) > -257) {
                  stackOut_9_0 = (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> -1867272600;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = var9 | var8;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              lf.a(((md) this).field_I + var7, var6, ((md) this).field_I, var12);
              lf.a(-((md) this).field_I + var7, var6, ((md) this).field_I, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final void b(int param0, int param1, int param2) {
        ((md) this).field_E = param0;
        ((md) this).field_C = (16711422 & param0) >> -2039515423;
        ((md) this).field_M = (16711422 & param1) >> -959690047;
        if (param2 <= 68) {
            ((md) this).field_H = null;
        }
        ((md) this).field_x = param1;
        this.f(-90);
    }

    md(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -363799263 & 8355711, param6 >> 796309793 & 8355711);
    }

    private final db d(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Lexicominos.field_L ? 1 : 0;
        int var2 = ((md) this).field_v >> 1875780257;
        db var3 = new db(var2, ((md) this).field_v);
        de.a(var3, 6);
        for (var4 = 0; var4 < ((md) this).field_v; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((md) this).field_v + -var4) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
                }
                lf.a(var5, var4, var8 << 1252259600 | (var8 << -1444140344 | var8));
            }
        }
        pd.a(-22949);
        if (param0) {
            Object var10 = null;
            ((md) this).a((byte) 4, (w) null, -98, 94);
        }
        return var3;
    }

    public static void e(int param0) {
        if (param0 != 344066273) {
            Object var2 = null;
            boolean discarded$0 = md.a((String) null, 98);
        }
        field_L = null;
        field_B = null;
        field_A = null;
    }

    final void a(byte param0, w param1, int param2, int param3) {
        if (((md) this).field_G) {
            ((md) this).field_y = ((md) this).field_y + 1;
            if (!(((md) this).field_y <= 2 * ((md) this).field_I)) {
                ((md) this).field_y = ((md) this).field_y - 2 * ((md) this).field_I;
            }
        }
        if (param0 != -119) {
            ((md) this).b(94, -94, -98);
        }
    }

    final static boolean a(String param0, int param1) {
        if (param1 > -86) {
            md.e(-86);
        }
        CharSequence var3 = (CharSequence) (Object) param0;
        return cb.field_t.equals((Object) (Object) ck.a(var3, (byte) -48));
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        int var5 = ((md) this).field_t + param2;
        int var6 = param1 + ((md) this).field_o;
        this.a(((md) this).field_F[0], var6, 16711935, var5);
        if (((md) this).field_K < 65536) {
            ca.a(var5 + ((md) this).field_j, var6, var5 - -(((md) this).field_K * ((md) this).field_j >> 2069378928), var6 + ((md) this).field_v, false);
            this.a(((md) this).field_F[1], var6, param0 + 16712050, var5);
            pd.a(param0 ^ 22998);
        }
        if (param0 != -115) {
            ((md) this).b(-108, -108, -95);
        }
    }

    private final void f(int param0) {
        ((md) this).field_F = new db[]{this.a(((md) this).field_E, ((md) this).field_x, (byte) -50), this.a(((md) this).field_C, ((md) this).field_M, (byte) -98)};
        if (param0 >= -59) {
            db discarded$0 = this.d(false);
        }
        ((md) this).field_H = this.d(false);
        ((md) this).field_z = ((md) this).field_H.g();
        ((md) this).field_D = new db(((md) this).field_v >> 953499905, ((md) this).field_v);
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f(-72);
    }

    private final void a(db param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        var5 = param3 + ((md) this).field_j;
        ca.a(-((md) this).field_H.field_p + var5, param1, ((md) this).field_H.field_p + param3, ((md) this).field_v + param1, false);
        var6 = -((md) this).field_y + param3;
        L0: while (true) {
          if (var5 <= var6) {
            L1: {
              pd.a(-22949);
              if (lf.field_g <= param3 + ((md) this).field_H.field_p) {
                de.a(((md) this).field_D, param2 + -16711929);
                param0.d(-((md) this).field_y, 0);
                param0.d(-((md) this).field_y + 2 * ((md) this).field_I, 0);
                ((md) this).field_z.e(0, 0);
                pd.a(-22949);
                ((md) this).field_D.d(param3, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (lf.field_e >= var5 - ((md) this).field_H.field_p) {
                de.a(((md) this).field_D, 6);
                var7 = ((md) this).field_j + -((md) this).field_H.field_p + ((md) this).field_y;
                L3: while (true) {
                  if (2 * ((md) this).field_I >= var7) {
                    param0.d(-var7, 0);
                    param0.d(2 * ((md) this).field_I - var7, 0);
                    ((md) this).field_H.e(0, 0);
                    pd.a(-22949);
                    ((md) this).field_D.d(var5 + -((md) this).field_H.field_p, param1);
                    break L2;
                  } else {
                    var7 = var7 - 2 * ((md) this).field_I;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (param2 == 16711935) {
                break L4;
              } else {
                ((md) this).field_K = -126;
                break L4;
              }
            }
            return;
          } else {
            param0.d(var6, param1);
            var6 = var6 + param0.field_p;
            continue L0;
          }
        }
    }

    private md(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((md) this).field_x = param5;
        ((md) this).field_E = param6;
        ((md) this).field_C = param8;
        ((md) this).field_I = param4;
        ((md) this).field_M = param7;
        ((md) this).a(param3, param2, true, param1, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Reload game";
        field_L = "LONGER";
    }
}
