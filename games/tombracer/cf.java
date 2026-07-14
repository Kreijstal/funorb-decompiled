/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf implements bo {
    private int field_d;
    static String field_f;
    private int field_j;
    private int[] field_b;
    static String field_c;
    private int field_g;
    private int[][] field_i;
    private int[] field_a;
    static String field_e;
    private int[] field_h;

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_e = null;
        if (param0 != 10) {
            field_c = null;
        }
    }

    public final void a(int param0, kh param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        param1.i(param0 + -192);
        param1.a((byte) 115, ((cf) this).field_g, 3);
        for (var3 = 0; ((cf) this).field_g > var3; var3++) {
            for (var4 = 0; -4 < (var4 ^ -1); var4++) {
                param1.a((byte) -128, ((cf) this).field_i[var3][var4], 8);
            }
        }
        for (var3 = 0; var3 < ((cf) this).field_g; var3++) {
            param1.a((byte) -127, ((cf) this).field_b[var3], 10);
        }
        if (param0 != 200) {
            field_f = null;
        }
        for (var3 = 0; ((cf) this).field_g > var3; var3++) {
            param1.a((byte) 69, ((cf) this).field_a[var3] + 1, 4);
            param1.a((byte) -128, ((cf) this).field_h[var3], 10);
        }
        param1.a((byte) 55, ((cf) this).field_d - -1, 3);
        param1.a((byte) -125, 1 + ((cf) this).field_j, 16);
        param1.k(param0 ^ -1826190742);
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "S2CRoundResultPacket:";
        var1 = var1 + " winner:" + ((cf) this).field_d;
        var1 = var1 + " totals:";
        for (var2 = 0; ((cf) this).field_g > var2; var2++) {
            var1 = var1 + ((cf) this).field_b[var2] + " ";
        }
        return var1;
    }

    public final void a(kh param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        param0.h((byte) -71);
        ((cf) this).field_g = param0.b((byte) 44, 3);
        ((cf) this).field_i = new int[((cf) this).field_g][3];
        var3 = 0;
        L0: while (true) {
          if (((cf) this).field_g <= var3) {
            L1: {
              if (param1 == -19) {
                break L1;
              } else {
                var6 = null;
                ((cf) this).a(41, (kh) null);
                break L1;
              }
            }
            ((cf) this).field_b = new int[((cf) this).field_g];
            var3 = 0;
            L2: while (true) {
              if (((cf) this).field_g <= var3) {
                ((cf) this).field_a = new int[((cf) this).field_g];
                ((cf) this).field_h = new int[((cf) this).field_g];
                var3 = 0;
                L3: while (true) {
                  if (var3 >= ((cf) this).field_g) {
                    ((cf) this).field_d = param0.b((byte) 44, 3) - 1;
                    ((cf) this).field_j = -1 + param0.b((byte) 44, 16);
                    param0.i((byte) 98);
                    return;
                  } else {
                    ((cf) this).field_a[var3] = -1 + param0.b((byte) 44, 4);
                    ((cf) this).field_h[var3] = param0.b((byte) 44, 10);
                    var3++;
                    continue L3;
                  }
                }
              } else {
                ((cf) this).field_b[var3] = param0.b((byte) 44, 10);
                var3++;
                continue L2;
              }
            }
          } else {
            var4 = 0;
            L4: while (true) {
              if (-4 >= (var4 ^ -1)) {
                var3++;
                continue L0;
              } else {
                ((cf) this).field_i[var3][var4] = param0.b((byte) 44, 8);
                var4++;
                continue L4;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 > -100) {
            field_c = null;
        }
        ff.field_w = param0;
        if (!(null == fq.field_e)) {
            fq.field_e.a(param0, -83);
        }
        if (!(null == tva.field_d)) {
            tva.field_d.a((byte) 91, param0);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != -16390) {
            cf.a(-31);
        }
        int var4 = -param2 + param3;
        if (!(var4 <= 0)) {
            while (var4 < -param0 / 2) {
                var4 = var4 + param0;
            }
            while (var4 > param0 / 2) {
                var4 = var4 - param0;
            }
        }
        return var4;
    }

    final void a(qh param0, int param1) {
        int var4 = 0;
        hca var5 = null;
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        ff var8 = param0.field_k;
        for (var4 = param1; var8.field_H.length > var4; var4++) {
            var5 = var8.field_H[var4];
            for (var6 = 0; 3 > var6; var6++) {
                var5.a(true, var6, ((cf) this).field_i[var4][var6]);
            }
            var5.a((byte) 126, ((cf) this).field_b[var4]);
            var5.b(18202625, ((cf) this).field_a[var4]);
            var5.f(((cf) this).field_h[var4], -25915);
        }
        param0.field_k.field_E = ((cf) this).field_j;
        param0.a((byte) 101, ((cf) this).field_i, ((cf) this).field_d);
    }

    cf(int param0) {
        ((cf) this).field_g = param0;
        ((cf) this).field_a = new int[((cf) this).field_g];
        ((cf) this).field_h = new int[((cf) this).field_g];
        ((cf) this).field_i = new int[((cf) this).field_g][3];
        ((cf) this).field_b = new int[((cf) this).field_g];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0> has joined your game.";
        field_c = "You can ask to join this game";
    }
}
