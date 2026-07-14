/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nda extends pu {
    static kv field_l;

    final static void a(int param0, lda param1, int param2, int param3, int param4, po param5, po param6, lda param7, int param8, boolean param9, lda param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        qm.field_a = param6;
        lha.field_b = param5;
        jk.a(param15, param17, param13, (byte) -64, param3);
        jn.a(param2, param10, param14, param9);
        if (param9) {
          return;
        } else {
          v.a(param8, (byte) 124, param0, param1, param7, param19);
          stackOut_1_0 = param12;
          stackOut_1_1 = 1;
          stackIn_3_0 = stackOut_1_0;
          stackIn_3_1 = stackOut_1_1;
          fg.a(stackIn_3_0, stackIn_3_1 != 0, param16);
          cm.a(param4, param11, param18, -123);
          return;
        }
    }

    public static void b(int param0) {
        int var1 = -73 / ((0 - param0) / 41);
        field_l = null;
    }

    static {
    }
}
