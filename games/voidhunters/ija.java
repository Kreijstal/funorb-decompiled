/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ija {
    int field_h;
    static String field_c;
    int field_d;
    int field_e;
    int field_a;
    static mob field_b;
    int field_g;
    int field_f;

    abstract void a(int param0, int param1);

    final static void a(int param0) {
        fh var2 = null;
        int var3 = VoidHunters.field_G;
        try {
            vob.field_p = 0;
            mq.field_k = 0;
            kbb.field_q = null;
            mr.field_M.e(120);
            int var1_int = -31 % ((param0 - -31) / 39);
            st.field_o.e(97);
            var2 = ae.field_f.c(-43);
            while (var2 != null) {
                var2.d((byte) -35);
                var2 = ae.field_f.d(-1);
            }
            var2 = om.field_c.c(-94);
            while (var2 != null) {
                var2.d((byte) -35);
                var2 = om.field_c.d(-1);
            }
            iwa.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ija.G(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            field_b = (mob) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static Object[] a(Object param0, Object[] param1, int param2, dja param3) {
        RuntimeException var4 = null;
        dja var5 = null;
        Object[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                var5 = (dja) null;
                ija.a(param1[1], (Object[]) null, ((int[]) (param1[7]))[7], (dja) null);
                break L1;
              }
            }
            stackIn_3_0 = kn.a(param1, param0, false, param3, param2 + -110);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ija.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_c = "Players: ";
    }
}
