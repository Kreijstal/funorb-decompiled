/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_b;
    static byte[] field_c;
    static ka[] field_d;
    private int[] field_e;
    static int[] field_a;

    public static void c(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 1) {
            field_c = null;
        }
        field_d = null;
    }

    final static ji a(int param0, int param1, int[] param2, byte param3, int param4, int param5, int param6, int param7, int param8) {
        ji var9 = new ji(param4, param7, param5, param6, param1, param0, param2);
        if (param3 != 77) {
            Object var10 = null;
            ji discarded$0 = wi.a(85, 87, (int[]) null, (byte) -123, -94, 96, 7, -66, 33);
        }
        wf.field_g.a((da) (Object) var9, param3 + -188);
        ul.a(-18261, var9, param8);
        return var9;
    }

    final static ef a(String param0, byte param1) {
        if (qc.field_i != eh.field_p) {
          L0: {
            if (param1 > 90) {
              break L0;
            } else {
              boolean discarded$2 = wi.a(2);
              break L0;
            }
          }
          L1: {
            if (hf.field_b != eh.field_p) {
              break L1;
            } else {
              if (param0.equals((Object) (Object) ta.field_zb)) {
                eh.field_p = mg.field_c;
                return gf.field_w;
              } else {
                break L1;
              }
            }
          }
          ta.field_zb = param0;
          eh.field_p = qc.field_i;
          gf.field_w = null;
          return null;
        } else {
          return null;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
            return true;
        }
        return ib.a(88, gi.b(param0 ^ 12476));
    }

    wi(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= param0.length - -(param0.length >> 484641857)) {
            var2 = var2 << 1;
        }
        ((wi) this).field_e = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((wi) this).field_e[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = var2 - 1 & param0[var3];
            while (0 != (((wi) this).field_e[var4 + var4 + 1] ^ -1)) {
                var4 = var2 + -1 & 1 + var4;
            }
            ((wi) this).field_e[var4 + var4] = param0[var3];
            ((wi) this).field_e[1 + (var4 + var4)] = var3;
        }
    }

    final static String b(int param0) {
        if (param0 != 1) {
            field_a = null;
        }
        if (sj.field_R) {
            return null;
        }
        if (bk.field_p < cf.field_a) {
            return null;
        }
        if (!(cf.field_a + ef.field_e <= bk.field_p)) {
            return ie.field_g;
        }
        return null;
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        var4 = -97 % ((21 - param0) / 60);
        var3 = (((wi) this).field_e.length >> 1263360449) + -1;
        var5 = var3 & param1;
        L0: while (true) {
          var6 = ((wi) this).field_e[var5 - (-var5 - 1)];
          if (-1 != var6) {
            if (param1 != ((wi) this).field_e[var5 + var5]) {
              var5 = 1 + var5 & var3;
              continue L0;
            } else {
              return var6;
            }
          } else {
            return -1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[520];
        field_b = "members-only content";
    }
}
