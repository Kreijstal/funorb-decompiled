/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_d;
    static int field_e;
    static int field_c;
    static le field_b;
    private int[] field_a;

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = TrackController.field_F ? 1 : 0;
          if (param1 == -70) {
            break L0;
          } else {
            var6 = null;
            String discarded$2 = oe.a((CharSequence) null, (byte) 1, false);
            break L0;
          }
        }
        var3 = lb.a(param0, param2, 1236);
        if (var3 == null) {
          var4 = 0;
          L1: while (true) {
            if (var4 < param0.length()) {
              if (!ue.a(-16490, param0.charAt(var4))) {
                return gj.field_d;
              } else {
                var4++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return var3;
        }
    }

    oe(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= param0.length - -(param0.length >> -1176631327)) {
            var2 = var2 << 1;
        }
        ((oe) this).field_a = new int[var2 + var2];
        for (var3 = 0; var2 + var2 > var3; var3++) {
            ((oe) this).field_a[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = var2 - 1 & param0[var3];
            while (((oe) this).field_a[1 + var4 + var4] != -1) {
                var4 = var2 - 1 & var4 - -1;
            }
            ((oe) this).field_a[var4 + var4] = param0[var3];
            ((oe) this).field_a[1 + var4 + var4] = var3;
        }
    }

    final static void a(boolean param0, kk param1, kk param2, kk param3, int param4) {
        sa.field_Q = c.a("", param4 + 59176);
        sa.field_Q.a(false, true);
        ak.a(param3, param1, param2, 127);
        jh.a(-128);
        fd.field_h = hf.field_f;
        if (param4 != -28484) {
            Object var6 = null;
            String discarded$0 = oe.a((CharSequence) null, (byte) 110, true);
        }
        rk.field_X = hf.field_f;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        var3 = (((oe) this).field_a.length >> -1540622911) + -1;
        if (param1 == -26556) {
          var4 = param0 & var3;
          L0: while (true) {
            var5 = ((oe) this).field_a[1 + var4 + var4];
            if (var5 != -1) {
              if (param0 == ((oe) this).field_a[var4 + var4]) {
                return var5;
              } else {
                var4 = var3 & var4 + 1;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          return -121;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Achievements";
        field_b = new le();
    }
}
