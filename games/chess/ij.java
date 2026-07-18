/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static String field_c;
    static String field_b;
    static String field_d;
    static String field_e;
    static String field_f;
    static String[] field_a;

    final static void a(um param0, boolean param1, um param2, byte param3) {
        try {
            da.a(fi.field_b, r.field_Tb, ic.field_c, bj.field_eb, ia.field_o, qn.field_P, af.field_o, tk.field_d, param1, false, sj.field_k, (lh) (Object) pk.field_a);
            el.field_z = ao.a(param2, "chatfilter", 2993, "lobby");
            nk.field_x[2] = ii.field_K;
            nk.field_x[1] = gg.field_g;
            if (param3 <= 70) {
                Object var5 = null;
                ij.a((um) null, false, (um) null, (byte) 17);
            }
            nk.field_x[0] = fm.field_Q;
            int discarded$0 = 1513239;
            dm.a((lh) (Object) v.field_k, param0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ij.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b() {
        field_d = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_e = null;
    }

    final static void a() {
        i.a(true, oc.field_o, -5136, ih.field_Q);
        ag.field_e = true;
    }

    final static kf a(int param0, int param1, um param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        kf stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var4 = param2.b((byte) -74, param1);
            var3 = var4;
            if (var4 != null) {
              stackOut_5_0 = new kf(var4);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (kf) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("ij.B(").append(-109).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "The '<%0>' setting needs to be changed.";
        field_f = "Black's move";
        field_e = "Public";
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_d = "Instructions";
    }
}
