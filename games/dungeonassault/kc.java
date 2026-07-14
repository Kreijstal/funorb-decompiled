/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends ii implements vg {
    private int[] field_N;
    private se field_K;
    private int field_O;
    static String field_P;
    private nk field_L;
    private ck[] field_T;
    static int[][] field_S;
    static int[] field_Q;
    static int[] field_M;
    static int[][] field_V;
    private String field_R;
    static int field_U;

    final void a(int param0, int param1, String param2) {
        int var4 = ((kc) this).field_O;
        if (param1 != 6824) {
            return;
        }
        this.a(var4 + 1, 0);
        ((kc) this).field_T[var4] = ((kc) this).a(param2, (pg) this, (byte) -82);
        ((kc) this).field_N[var4] = param0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2 ^ 0, param3);
        int discarded$0 = ((kc) this).field_K.a(((kc) this).field_R, 14 + param1 + ((kc) this).field_q, ((kc) this).field_v + (param3 - -10), ((kc) this).field_x + -28, ((kc) this).field_s, 16777215, -1, param2, 0, ((kc) this).field_K.field_H);
    }

    kc(nk param0, se param1, String param2) {
        super(0, 0, 288, 0, (ca) null);
        ((kc) this).field_O = 0;
        ((kc) this).field_K = param1;
        ((kc) this).field_R = param2;
        ((kc) this).field_L = param0;
        int var4 = null != ((kc) this).field_R ? ((kc) this).field_K.a(((kc) this).field_R, 260, ((kc) this).field_K.field_H) : 0;
        ((kc) this).b(0, 288, 0, 0, var4 + 22);
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        if (param1 != 98) {
            return;
        }
        for (var6 = 0; ((kc) this).field_O > var6; var6++) {
            if (!(((kc) this).field_T[var6] != param0)) {
                var7 = ((kc) this).field_N[var6];
                if (0 == (var7 ^ -1)) {
                    ((kc) this).field_L.j((byte) 85);
                    break;
                }
                sn.a(73, ((kc) this).field_N[var6]);
                break;
            }
        }
    }

    public static void a(int param0) {
        field_M = null;
        field_V = null;
        field_S = null;
        field_P = null;
        field_Q = null;
        if (param0 != 0) {
            field_Q = null;
        }
    }

    final static ki[] a(qg param0, int param1) {
        int var5 = 0;
        ki var6 = null;
        int var7 = DungeonAssault.field_K;
        if (!param0.a(param1 + 61)) {
            return new ki[]{};
        }
        pn var9 = param0.a(false);
        while (var9.field_c == 0) {
            pj.a(0, 10L);
        }
        if (var9.field_c == 2) {
            return new ki[]{};
        }
        int[] var13 = (int[]) var9.field_f;
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var3 = var10;
        ki[] var4 = new ki[var13.length >> -1385974494];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new ki();
            var4[var5] = var6;
            var6.field_g = var3[var5 << -1108092254];
            var6.field_d = var3[(var5 << 2082260066) + 1];
            var6.field_b = var3[2 + (var5 << 118331554)];
            var6.field_a = var3[3 + (var5 << 1768350626)];
        }
        if (param1 != 10) {
            Object var8 = null;
            ki[] discarded$0 = kc.a((qg) null, 35);
        }
        return var4;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (param0 <= ((kc) this).field_O) {
            return;
        }
        ck[] var7 = new ck[param0];
        ck[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = param1; ((kc) this).field_O > var5; var5++) {
            var7[var5] = ((kc) this).field_T[var5];
            var4[var5] = ((kc) this).field_N[var5];
        }
        ((kc) this).field_O = param0;
        ((kc) this).field_N = var4;
        ((kc) this).field_T = var3;
    }

    final static ab a(String param0, boolean param1) {
        if (param0 != null) {
            // ifeq L14
        } else {
            return to.field_e;
        }
        int var2 = param0.indexOf('@');
        if (!(var2 != -1)) {
            return ri.field_e;
        }
        String var3 = param0.substring(0, var2);
        String var4 = param0.substring(var2 + 1);
        ab var5 = mo.a(var3, param1);
        if (var5 != null) {
            return var5;
        }
        return ed.a(-97, var4);
    }

    final ck a(String param0, pg param1, byte param2) {
        ck var4 = new ck(param0, param1);
        if (param2 > -73) {
            ((kc) this).a(-80, 42, 35, 65);
        }
        var4.field_o = (ca) (Object) new na();
        int var5 = ((kc) this).field_s + -2;
        ((kc) this).b(0, ((kc) this).field_x, 0, 0, ((kc) this).field_s - -34);
        var4.b(0, -14 + ((kc) this).field_x, var5, 7, 30);
        ((kc) this).b((byte) -126, (lm) (Object) var4);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        field_P = "If you attempt to raid this dragon you will awaken it.<br><br>Do you wish to proceed?";
        field_S = new int[9][];
        field_V = new int[9][];
        var0 = 0;
        L0: while (true) {
          if (-9 > (var0 ^ -1)) {
            field_M = new int[32];
            var0 = 0;
            L1: while (true) {
              if (var0 >= 32) {
              } else {
                var1 = 112 + var0 * 2;
                field_M[var0] = mp.a(var1 * 65793, -2147483648);
                var0++;
                continue L1;
              }
            }
          } else {
            field_S[var0] = new int[32];
            var1 = var0 * 8 + 106;
            var2 = 8 * var0 + 192;
            var3 = 80 - -(6 * var0);
            var4 = 6 * var0 + 144;
            var5 = var0 * 10;
            var6 = var0 * 10 - -8;
            var7 = 0;
            L2: while (true) {
              if (32 <= var7) {
                var4 = 4 * var0 + 223;
                var2 = 223 - -(var0 * 4);
                var1 = 128 - -(var0 * 8);
                var6 = var0 * 4 + 223;
                field_V[var0] = new int[32];
                var3 = 128 - -(8 * var0);
                var5 = 96 - -(6 * var0);
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= -33) {
                    var0++;
                    continue L0;
                  } else {
                    var8 = var7 * (var2 + -var1) / 32 + var1;
                    var9 = (var4 - var3) * var7 / 32 + var3;
                    var10 = var5 - -((var6 + -var5) * var7 / 32);
                    field_V[var0][var7] = mp.a(mp.a(mp.a(var8, 77168640) << -496700080, var9 << 110803880), var10);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var8 = (var2 - var1) * var7 / 32 + var1;
                var9 = var3 + var7 * (var4 + -var3) / 32;
                var10 = (-var5 + var6) * var7 / 32 + var5;
                field_S[var0][var7] = mp.a(mp.a(var9 << -1560959032, mp.a(-445743104, var8) << 86569456), var10);
                var7++;
                continue L2;
              }
            }
          }
        }
    }
}
