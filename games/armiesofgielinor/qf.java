/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static String field_b;
    static je field_e;
    static int[] field_d;
    static um field_f;
    static String field_g;
    static String field_a;
    static String field_c;

    public static void a(byte param0) {
        field_g = null;
        int var1 = -77 % ((81 - param0) / 37);
        field_c = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_b = null;
        field_f = null;
    }

    final static void a(int param0, String param1, int param2, byte param3, int param4, int param5, int param6, int param7, hd param8) {
        am.field_x = param5;
        vq.field_d = param2;
        vq.field_c = param8;
        ek.field_e = param4;
        hq.field_e = param0;
        db.field_c = param1;
        if (param3 < 9) {
            return;
        }
        try {
            er.field_a = param6;
            gm.field_i = param7;
            ai.field_T = (bp) ((Object) new ae());
            ou.field_h = new vo(param8);
            oi.field_c = new dd(ai.field_T, ou.field_h);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "qf.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        if (param0 != 56) {
            field_e = (je) null;
        }
    }

    final static void a(int param0) {
        if (param0 != 56) {
          L0: {
            field_d = (int[]) null;
            rl.field_C.j(-114);
            if (pq.field_a == null) {
              pq.field_a = new cr(rl.field_C, aw.field_h);
              break L0;
            } else {
              break L0;
            }
          }
          rl.field_C.a(pq.field_a, 0);
          return;
        } else {
          L1: {
            rl.field_C.j(-114);
            if (pq.field_a == null) {
              pq.field_a = new cr(rl.field_C, aw.field_h);
              break L1;
            } else {
              break L1;
            }
          }
          rl.field_C.a(pq.field_a, 0);
          return;
        }
    }

    final static void a(nr param0, int param1, int param2, nr param3, int param4, int param5) {
        try {
            if (param5 >= -107) {
                field_b = (String) null;
            }
            et.field_b = param1;
            el.field_c = param2;
            cp.field_a = param4;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "qf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_b = "You are being refunded for your prestige levels!<br>You will earn runes at quadruple rate until all <%0> have been refunded.";
        field_d = new int[56];
        field_a = "(ongoing)";
        field_g = "Final score";
        field_c = "Continue";
    }
}
