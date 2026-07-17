/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    static String field_h;
    static String field_f;
    static String field_g;
    static String field_a;
    static tq field_d;
    static String field_c;
    static String field_b;
    static String field_e;

    public static void b(int param0) {
        field_e = null;
        field_h = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_g = null;
        if (param0 != 10066329) {
          return;
        } else {
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void b(byte param0) {
        i.field_a.field_n = 0;
        if (param0 >= -87) {
            vc.b(-65);
            i.field_a.field_p = 0;
            return;
        }
        i.field_a.field_p = 0;
    }

    final static void a(br param0, br param1) {
        try {
            if (param1.field_b != null) {
                param1.a(true);
            }
            param1.field_b = param0.field_b;
            param1.field_d = param0;
            param1.field_b.field_d = param1;
            param1.field_d.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "vc.E(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    final static void a() {
        ud.field_V[92] = 74;
        ud.field_V[44] = 71;
        ud.field_V[46] = 72;
        ud.field_V[93] = 43;
        ud.field_V[45] = 26;
        ud.field_V[61] = 27;
        ud.field_V[91] = 42;
        ud.field_V[192] = 28;
        ud.field_V[222] = 58;
        ud.field_V[520] = 59;
        ud.field_V[59] = 57;
        ud.field_V[47] = 73;
    }

    final static boolean a(int param0) {
        if (gi.field_i == null) {
            return false;
        }
        if (!gi.field_i.h(124)) {
            return false;
        }
        return true;
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            wm.field_Q[0] = ah.field_e.e(16711680);
            wm.field_Q[1] = ah.field_e.e(7829248);
            wm.field_Q[2] = ah.field_e.e(16776960);
            wm.field_Q[3] = ah.field_e.e(30464);
            wm.field_Q[4] = ah.field_e.e(65280);
            wm.field_Q[5] = ah.field_e.e(30583);
            wm.field_Q[6] = ah.field_e.e(65535);
            wm.field_Q[7] = ah.field_e.e(119);
            wm.field_Q[8] = ah.field_e.e(255);
            wm.field_Q[9] = ah.field_e.e(16745473);
            ia.field_s = ah.field_e.e(16777215);
            rj.field_F = ah.field_e.e(6710886);
            var8 = ah.field_e.field_P[0];
            var7 = var8;
            var6 = var7;
            var5 = var6;
            var4 = var5;
            var1_array = var4;
            ah.field_e.field_P = new int[13][];
            ah.field_e.field_P[0] = var8;
            ah.field_e.field_P[4] = new int[ah.field_e.field_P[0].length];
            var2 = 0;
            L1: while (true) {
              if (ah.field_e.field_P[4].length <= var2) {
                ke.a(16777215, 2, -17895, 65793, 13369344);
                ke.a(4194304, 0, -17895, 8388608, 16711680);
                ke.a(16777215, 1, -17895, 65793, 5481009);
                ke.a(4210688, 3, -17895, 8421376, 16776960);
                ke.a(0, 5, -17895, 0, 0);
                ke.a(0, 6, -17895, 4473924, 10066329);
                ke.a(16777215, 7, -17895, 4473924, 10066329);
                ke.a(0, 8, -17895, 4996418, 14540253);
                ke.a(0, 9, -17895, 16777215, 14540253);
                ke.a(4096, 10, -17895, 16384, 5481009);
                ke.a(16777215, 11, -17895, 4473924, 5481009);
                ke.a(4096, 12, -17895, 16384, 16556032);
                break L0;
              } else {
                ah.field_e.field_P[4][var2] = 16777215;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "vc.D(" + 1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Your powerups will recharge faster.";
        field_a = "Select any target!";
        field_c = "Searching for opponents";
        field_g = "Report abuse";
        field_b = "These slots can only be unlocked with the appropriate traits.";
        field_h = "Who can join";
        field_e = "This is <%0>'s RuneScape clan if they have one.";
    }
}
