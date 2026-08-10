/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends hg {
    int[] field_p;
    int field_h;
    int field_i;
    static cn field_l;
    int field_r;
    int field_n;
    static String field_j;
    int field_q;
    static int[] field_k;
    int field_o;
    static int field_g;
    static ed[] field_m;

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        if (param1 != 29) {
            return;
        }
        try {
            this.field_q = param7;
            this.field_n = param2;
            this.field_h = param0;
            this.field_r = param3;
            this.field_i = param5;
            this.field_p = param6;
            this.field_o = param4;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "mi.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final static void a(int param0, String param1, String param2) {
        try {
            jh.a(false, param2, false, param1);
            if (param0 != 0) {
                field_k = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "mi.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 109) {
              stackIn_4_0 = qi.a(param0.length, 0, param0, (byte) -109);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("mi.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_j = null;
        field_m = null;
        if (param0 <= 65) {
            field_m = (ed[]) null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    mi() {
    }

    static {
        field_j = "You have <%0> unread messages!";
        field_l = new cn();
    }
}
