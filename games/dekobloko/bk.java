/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends w {
    static String field_Nb;
    static w field_Rb;
    private w field_Pb;
    static String field_Qb;
    static String field_Ob;

    public static void e(int param0) {
        if (param0 != 15338) {
            field_Nb = null;
        }
        field_Nb = null;
        field_Ob = null;
        field_Qb = null;
        field_Rb = null;
    }

    bk(w param0, w param1, w param2, w param3, w param4, w param5) {
        int var12 = 0;
        w var13 = null;
        w var14 = null;
        int var15 = 0;
        w var17 = new w(0L, param1, gk.field_Gb.toUpperCase());
        var17.field_X = 1;
        ((bk) this).field_Pb = new w(0L, param2);
        w var8 = new w(0L, param3);
        w var9 = new w(0L, param3, dc.field_c);
        var9.field_X = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; var12 < dk.field_j.length; var12++) {
            var13 = new w(0L, param3, uf.field_B[var12]);
            var14 = new w(0L, param3, dk.field_j[var12]);
            var15 = param3.field_J.a(dk.field_j[var12]);
            if (var15 > var11) {
                var11 = var15;
            }
            var13.a(65, 0, var10, 15, 20);
            var14.a(640, 0, var10, 15, 90);
            var8.a(var13, -16834);
            var8.a(var14, -16834);
            var10 += 30;
        }
        var17.a(20 + var11 - -90, 0, 0, 24, 0);
        var10 += 15;
        ((bk) this).a(var17.field_mb, 0, 100, var10 - -var17.field_N, 100);
        ((bk) this).field_Pb.a(15, 0, 5, 15, var17.field_mb + -20);
        var8.a(((bk) this).field_mb, 0, var17.field_N, ((bk) this).field_N - var17.field_N, 0);
        var9.a(((bk) this).field_mb, 0, 20, 15, 0);
        var8.field_lb = ea.a(2105376, -20982, 3, var8.field_N, 8421504, 11579568);
        var17.a(((bk) this).field_Pb, -16834);
        var8.a(var9, -16834);
        ((bk) this).a(var17, -16834);
        ((bk) this).a(var8, -16834);
        ((bk) this).field_vb = -(((bk) this).field_mb >> 1562314049) + 320;
        var10 = -(((bk) this).field_N >> 757186753) + 240;
    }

    final boolean b(int param0, boolean param1) {
        Object var4 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            var4 = null;
            bk.a((byte) 4, 96, (vj) null);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              ((bk) this).a(false, true);
              if (-1 == ig.field_Yb) {
                break L3;
              } else {
                if (-1 == ((bk) this).field_ob) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (-1 == (((bk) this).field_Pb.field_ob ^ -1)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(byte param0, int param1, vj param2) {
        int var4 = client.field_A ? 1 : 0;
        if (param0 != -93) {
            bk.e(40);
        }
        uk var5 = (uk) (Object) param2.c((byte) -119);
        uk var3 = (uk) (Object) param2.c((byte) -119);
        while (var5 != null) {
            var5.b(11976, param1);
            var3 = (uk) (Object) param2.d(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "Game options";
        field_Qb = "Elapsed time";
        field_Ob = "Waiting for extra data";
    }
}
