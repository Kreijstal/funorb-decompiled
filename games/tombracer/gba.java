/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gba extends vg {
    String[] field_g;
    static int[] field_f;

    final static void a(int param0, int param1, int param2, ka param3, int param4, ka param5, int param6, int param7, int param8, int param9, int param10) {
        int var15 = 0;
        int var16 = TombRacer.field_G ? 1 : 0;
        int var11 = param9 / param2 - 2;
        int var12 = param6 + -(param2 * (var11 - 1) / param0);
        int var13 = var12 + param2 * var11;
        int var14 = param1;
        gqa.a(param4, -83584144, -param2 + var12, var14, param3, param10);
        gqa.a(param8, -83584144, var13, var14, param3, param10);
        for (var15 = 0; var15 < var11; var15++) {
            gqa.a(dfa.a(param7, 2048, 96), -83584144, var12 + var15 * param2, var14, param5, param10);
        }
    }

    final static la a(int param0, boolean param1, g param2, int param3, dt param4) {
        la var5 = null;
        Exception var5_ref = null;
        la stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        la stackOut_2_0 = null;
        try {
          L0: {
            var5 = new la(param4, param2.field_f, param2.field_c, param0, param1);
            var5.a((byte) 46, param2.field_e);
            if (param3 == 21789) {
              break L0;
            } else {
              field_f = null;
              break L0;
            }
          }
          stackOut_2_0 = (la) var5;
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return null;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            field_f = null;
        }
    }

    final static cn a(int param0, int param1) {
        if (param0 >= -83) {
            return null;
        }
        if (null != lga.field_B) {
            return lga.field_B;
        }
        if (0 == (param1 ^ -1)) {
            return lga.field_B;
        }
        return nt.a(param1, 1, 5200, false, true, true);
    }

    gba(String[] param0) {
        ((gba) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[2];
    }
}
