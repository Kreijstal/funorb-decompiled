/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends bh {
    int field_v;
    int[] field_t;
    static String field_q;
    int field_p;
    static boolean field_n;
    static ck field_r;
    int field_u;
    int field_s;
    int field_o;
    int field_w;

    final void a(byte param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
        Object var10 = null;
        ((wc) this).field_s = param1;
        if (param0 != 37) {
          var10 = null;
          String discarded$2 = wc.a(false, (CharSequence) null, -40);
          ((wc) this).field_p = param5;
          ((wc) this).field_t = param2;
          ((wc) this).field_u = param7;
          ((wc) this).field_w = param3;
          ((wc) this).field_v = param6;
          ((wc) this).field_o = param4;
          return;
        } else {
          ((wc) this).field_p = param5;
          ((wc) this).field_t = param2;
          ((wc) this).field_u = param7;
          ((wc) this).field_w = param3;
          ((wc) this).field_v = param6;
          ((wc) this).field_o = param4;
          return;
        }
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 2) {
            wc.a(64, -36, -122);
            field_r = null;
            return;
        }
        field_r = null;
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        var3 = rb.a(param0, (byte) 19, param1);
        if (var3 != null) {
          return var3;
        } else {
          var4 = param2;
          L0: while (true) {
            if (param1.length() > var4) {
              if (!ci.a(param1.charAt(var4), (byte) 90)) {
                return jk.field_g;
              } else {
                var4++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        if (param0 <= param1 - -5) {
          return;
        } else {
          var3 = param1;
          var4 = gn.field_e[var3];
          var5 = gn.field_e[var3 + 1];
          var6 = gn.field_e[2 + var3];
          var7 = gn.field_e[var3 - -3];
          var8 = gn.field_e[4 + var3];
          var9 = param1 + 5;
          L0: while (true) {
            if (var9 >= param0) {
              gn.field_e[var3] = var4;
              gn.field_e[var3 - -1] = var5;
              gn.field_e[var3 + 2] = var6;
              gn.field_e[var3 - -3] = var7;
              gn.field_e[4 + var3] = var8;
              wc.a(var3, param1, param2);
              wc.a(param0, 5 + var3, param2 + 0);
              return;
            } else {
              var10 = gn.field_e[3 + var9];
              if (var7 < var10) {
                gn.field_e[var3] = gn.field_e[var9];
                gn.field_e[var3 - -1] = gn.field_e[var9 + 1];
                gn.field_e[2 + var3] = gn.field_e[2 + var9];
                gn.field_e[3 + var3] = var10;
                gn.field_e[4 + var3] = gn.field_e[var9 - -4];
                var3 += 5;
                gn.field_e[var9] = gn.field_e[var3];
                gn.field_e[1 + var9] = gn.field_e[var3 + 1];
                gn.field_e[var9 + 2] = gn.field_e[var3 + 2];
                gn.field_e[var9 - -3] = gn.field_e[3 + var3];
                gn.field_e[4 + var9] = gn.field_e[4 + var3];
                var9 += 5;
                var9 += 5;
                continue L0;
              } else {
                var9 += 5;
                var9 += 5;
                continue L0;
              }
            }
          }
        }
    }

    wc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = true;
        field_q = "<%0> is not on your friend list.";
    }
}
