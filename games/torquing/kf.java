/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends gm {
    private int field_y;
    int field_L;
    static String field_B;
    private int field_x;
    static String field_D;
    private int field_I;
    private int field_J;
    private int field_A;
    private t field_G;
    static int field_F;
    boolean field_M;
    private t field_H;
    private t field_E;
    private int field_z;
    private t[] field_C;

    public static void a(boolean param0) {
        if (param0) {
            String discarded$0 = kf.a(-16);
        }
        field_B = null;
        field_D = null;
    }

    private final void h(int param0) {
        ((kf) this).field_C = new t[]{this.b(((kf) this).field_J, ((kf) this).field_I, (byte) 49), this.b(((kf) this).field_y, ((kf) this).field_z, (byte) 49)};
        ((kf) this).field_E = this.b(false);
        if (param0 != -917474783) {
            String discarded$0 = kf.a(84);
        }
        ((kf) this).field_H = ((kf) this).field_E.b();
        ((kf) this).field_G = new t(((kf) this).field_o >> -917474783, ((kf) this).field_o);
    }

    final static String a(String param0, char param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = Torquing.field_u;
          var4 = param0.length();
          var5 = param2.length();
          var6 = var4;
          var7 = -1 + var5;
          var8 = -94 / ((-7 - param3) / 41);
          if (-1 == (var7 ^ -1)) {
            break L0;
          } else {
            var9_int = 0;
            L1: while (true) {
              var9_int = param0.indexOf((int) param1, var9_int);
              if ((var9_int ^ -1) <= -1) {
                var6 = var6 + var7;
                var9_int++;
                continue L1;
              } else {
                break L0;
              }
            }
          }
        }
        var9 = new StringBuilder(var6);
        var10 = 0;
        L2: while (true) {
          var11 = param0.indexOf((int) param1, var10);
          if (var11 >= 0) {
            StringBuilder discarded$3 = var9.append(param0.substring(var10, var11));
            var10 = var11 - -1;
            StringBuilder discarded$4 = var9.append(param2);
            continue L2;
          } else {
            StringBuilder discarded$5 = var9.append(param0.substring(var10));
            return var9.toString();
          }
        }
    }

    private final t b(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        t var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = Torquing.field_u;
        var14 = new t(((kf) this).field_A * 2, ((kf) this).field_o);
        tm.a((byte) -116, var14);
        var5 = ((kf) this).field_o >> 473048801;
        var6 = 0;
        L0: while (true) {
          if (((kf) this).field_o <= var6) {
            L1: {
              if (param2 == 49) {
                break L1;
              } else {
                ((kf) this).c(-42, -27, (byte) -8);
                break L1;
              }
            }
            r.a(127);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -518965119) * (2 * ((kf) this).field_A + -1) % (2 * ((kf) this).field_A);
              var8 = 16711935 & param0;
              var9 = 65280 & param0;
              var10 = var6 + -var5;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
              if (-257 < (var11 ^ -1)) {
                stackOut_4_0 = (-16711936 & var11 * var8 | var11 * var9 & 16711680) >>> 289302376;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = var9 | var8;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_5_0;
              ph.b(var7, var6, ((kf) this).field_A, var12);
              ph.b(var7 + -(((kf) this).field_A * 2), var6, ((kf) this).field_A, var12);
              var8 = 16711935 & param1;
              var9 = 65280 & param1;
              if (256 <= var11) {
                stackOut_7_0 = var8 | var9;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = (var11 * var8 & -16711936 | 16711680 & var9 * var11) >>> 1966065800;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            var12 = stackIn_8_0;
            ph.b(var7 - -((kf) this).field_A, var6, ((kf) this).field_A, var12);
            ph.b(var7 + -((kf) this).field_A, var6, ((kf) this).field_A, var12);
            var6++;
            continue L0;
          }
        }
    }

    kf(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1226686721, 8355711 & param6 >> 307511521);
    }

    final static void b(int param0, int param1) {
        int var3 = Torquing.field_u;
        cb var5 = (cb) (Object) ae.field_nb.b(0);
        while (var5 != null) {
            pd.a(var5, true, param0);
            var5 = (cb) (Object) ae.field_nb.f(-24059);
        }
        if (param1 != -8190) {
            Object var4 = null;
            String discarded$0 = kf.a((String) null, 'ￕ', (String) null, 48);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = -126 / ((66 - param0) / 57);
        super.a((byte) 125, param1, param2, param3, param4);
        this.h(-917474783);
    }

    private final t b(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Torquing.field_u;
        int var2 = ((kf) this).field_o >> -790994879;
        t var3 = new t(var2, ((kf) this).field_o);
        tm.a((byte) 81, var3);
        for (var4 = 0; var4 < ((kf) this).field_o; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((kf) this).field_o - var4));
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
                }
                ph.a(var5, var4, var8 << 104853520 | (var8 | var8 << 1881861320));
            }
        }
        if (param0) {
            ((kf) this).a(74, (byte) 84, -119, 72);
        }
        r.a(126);
        return var3;
    }

    final static String a(int param0) {
        String var1 = "";
        if (param0 != 17241) {
            field_D = null;
        }
        if (!(un.field_k == null)) {
            var1 = un.field_k.i(-116);
        }
        if (!(0 != var1.length())) {
            var1 = jg.a(true);
        }
        if (!(var1.length() != 0)) {
            var1 = field_B;
        }
        return var1;
    }

    private final void a(int param0, t param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Torquing.field_u;
          var5 = param0 - -((kf) this).field_p;
          ld.a(var5 + -((kf) this).field_E.field_s, param0 + ((kf) this).field_E.field_s, ((kf) this).field_o + param3, param3, (byte) -99);
          var6 = param0 + -((kf) this).field_x;
          if (param2 > 105) {
            break L0;
          } else {
            ((kf) this).field_C = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              r.a(124);
              if (param0 + ((kf) this).field_E.field_s < ph.field_k) {
                break L2;
              } else {
                tm.a((byte) -119, ((kf) this).field_G);
                param1.d(-((kf) this).field_x, 0);
                param1.d(-((kf) this).field_x + 2 * ((kf) this).field_A, 0);
                ((kf) this).field_H.a(0, 0);
                r.a(124);
                ((kf) this).field_G.d(param0, param3);
                break L2;
              }
            }
            L3: {
              if (var5 + -((kf) this).field_E.field_s > ph.field_a) {
                break L3;
              } else {
                tm.a((byte) 119, ((kf) this).field_G);
                var7 = -((kf) this).field_E.field_s + ((kf) this).field_p - -((kf) this).field_x;
                L4: while (true) {
                  if (var7 <= 2 * ((kf) this).field_A) {
                    param1.d(-var7, 0);
                    param1.d(2 * ((kf) this).field_A + -var7, 0);
                    ((kf) this).field_E.a(0, 0);
                    r.a(125);
                    ((kf) this).field_G.d(-((kf) this).field_E.field_s + var5, param3);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((kf) this).field_A;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            param1.d(var6, param3);
            var6 = var6 + param1.field_s;
            continue L1;
          }
        }
    }

    final void c(int param0, int param1, byte param2) {
        ((kf) this).field_y = 8355711 & param1 >> -1878423999;
        ((kf) this).field_I = param0;
        if (param2 != 125) {
            ((kf) this).field_G = null;
        }
        ((kf) this).field_J = param1;
        ((kf) this).field_z = (param0 & 16711422) >> 2117678241;
        this.h(-917474783);
    }

    final static void a(byte param0) {
        Object var2 = null;
        uj.a((String) null, -32082, ol.field_a);
        if (param0 >= -45) {
            field_D = null;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(param0 == 0)) {
            return;
        }
        if (param1 > -7) {
            ((kf) this).field_x = -1;
        }
        int var5 = ((kf) this).field_w + param3;
        int var6 = ((kf) this).field_k + param2;
        this.a(var5, ((kf) this).field_C[0], (byte) 125, var6);
        if (!(-65537 >= (((kf) this).field_L ^ -1))) {
            ld.a(((kf) this).field_p + var5, var5 + (((kf) this).field_p * ((kf) this).field_L >> 151945840), ((kf) this).field_o + var6, var6, (byte) -98);
            this.a(var5, ((kf) this).field_C[1], (byte) 124, var6);
            r.a(125);
        }
    }

    final void a(int param0, gm param1, int param2, int param3) {
        int var5 = -100 % ((param0 - -28) / 43);
        if (((kf) this).field_M) {
            ((kf) this).field_x = ((kf) this).field_x + 1;
            if (((kf) this).field_x > 2 * ((kf) this).field_A) {
                ((kf) this).field_x = ((kf) this).field_x - ((kf) this).field_A * 2;
            }
        }
    }

    private kf(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((kf) this).field_z = param8;
        ((kf) this).field_J = param5;
        ((kf) this).field_A = param4;
        ((kf) this).field_I = param6;
        ((kf) this).field_y = param7;
        ((kf) this).a((byte) -122, param0, param1, param3, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Player";
        field_D = "Unpacking levels";
    }
}
