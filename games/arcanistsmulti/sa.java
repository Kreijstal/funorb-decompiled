/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends kc {
    static String field_Gb;
    static int field_Bb;
    static int field_Hb;
    static int field_Db;
    static String field_Eb;
    private kc field_Fb;
    static kc field_Cb;

    sa(kc param0, kc param1, kc param2, kc param3, kc param4, kc param5) {
        int var12 = 0;
        kc var13 = null;
        kc var14 = null;
        int var15 = 0;
        kc var17 = new kc(0L, param1, mo.field_j.toUpperCase());
        var17.field_X = 1;
        ((sa) this).field_Fb = new kc(0L, param2);
        kc var8 = new kc(0L, param3);
        kc var9 = new kc(0L, param3, li.field_H);
        var9.field_X = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; var12 < me.field_L.length; var12++) {
            var13 = new kc(0L, param3, no.field_vb[var12]);
            var14 = new kc(0L, param3, me.field_L[var12]);
            var15 = param3.field_Z.b(me.field_L[var12]);
            var13.a(65, 20, var10, 15, (byte) -120);
            if (var11 < var15) {
                var11 = var15;
            }
            var14.a(640, 90, var10, 15, (byte) -120);
            var8.a(var13, 60);
            var8.a(var14, 77);
            var10 += 30;
        }
        var10 += 15;
        var17.a(20 + (var11 - -90), 0, 0, 24, (byte) -120);
        ((sa) this).a(var17.field_x, 100, 100, var17.field_I + var10, (byte) -120);
        ((sa) this).field_Fb.a(15, -20 + var17.field_x, 5, 15, (byte) -120);
        var8.a(((sa) this).field_x, 0, var17.field_I, ((sa) this).field_I - var17.field_I, (byte) -120);
        var9.a(((sa) this).field_x, 0, 20, 15, (byte) -120);
        var8.field_v = of.a(3, var8.field_I, 1, 2105376, 11579568, 8421504);
        var17.a(((sa) this).field_Fb, 27);
        var8.a(var9, 126);
        ((sa) this).a(var17, 21);
        ((sa) this).a(var8, 17);
        ((sa) this).field_T = 320 - (((sa) this).field_x >> -461052383);
        var10 = -(((sa) this).field_I >> 1521859105) + 240;
    }

    final static boolean a(String param0, int param1) {
        if (param1 != 320) {
            Object var3 = null;
            boolean discarded$0 = sa.a((String) null, 69);
        }
        return mf.a(-1, param0) != null ? true : false;
    }

    final boolean c(boolean param0, byte param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        ((sa) this).b(true, (byte) 46);
        if (param1 == 48) {
          L0: {
            L1: {
              L2: {
                if (re.field_r == 0) {
                  break L2;
                } else {
                  if (0 == ((sa) this).field_U) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (((sa) this).field_Fb.field_U == 0) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                break L1;
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    public static void e(int param0) {
        field_Eb = null;
        field_Cb = null;
        field_Gb = null;
        if (param0 != 26820) {
            field_Gb = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = "Cancel";
        field_Hb = 0;
        field_Gb = "Advertising websites";
    }
}
