/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cha {
    java.awt.Image field_a;
    static String field_b;
    static String field_h;
    static String field_c;
    int field_e;
    int field_f;
    static mla field_d;
    int[] field_g;

    public static void a(boolean param0) {
        field_b = null;
        field_c = null;
        if (!param0) {
          field_c = (String) null;
          field_d = null;
          field_h = null;
          return;
        } else {
          field_d = null;
          field_h = null;
          return;
        }
    }

    final void a(int param0) {
        if (param0 != -19216) {
          field_h = (String) null;
          bea.a(this.field_g, this.field_f, this.field_e);
          return;
        } else {
          bea.a(this.field_g, this.field_f, this.field_e);
          return;
        }
    }

    final static int a(goa param0, goa param1, int param2) {
        RuntimeException var3 = null;
        goa var4 = null;
        String var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                var4 = (goa) null;
                cha.a((goa) null, (goa) null, -60);
                break L1;
              }
            }
            var5 = (String) null;
            stackIn_3_0 = fja.a(param0, (String) null, false, 0, param1, 94, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("cha.I(");

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, ha param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        try {
            param2.KA(param0, param4, param0 + param3, param3 + param4);
            param2.za(param0 + param3, param3 + param4, param3, param6, param7);
            param2.KA(-param3 + param5 + param0, param4, param0 - -param5, param4 + param3);
            param2.za(param0 + param5 + -param3, param3 + param4, param3, param6, param7);
            param2.KA(param5 + (param0 + -param3), -param3 + param4 + param8, param5 + param0, param4 - -param8);
            param2.za(-param3 + (param0 - -param5), param8 + param4 - param3, param3, param6, param7);
            param2.KA(param0, param8 + (param4 + -param3), param3 + param0, param8 + param4);
            param2.za(param0 + param3, param8 + param4 + -param3, param3, param6, param7);
            param2.la();
            param2.aa(param3 + param0, param4, param5 - param3 * 2, param3, param6, param7);
            param2.aa(param3 + param0, param4 + param8 + -param3, -(2 * param3) + param5, param3, param6, param7);
            param2.aa(param0, param4 - -param3, param3, param8 - param3 * 2, param6, param7);
            param2.aa(-param3 + (param0 - -param5), param3 + param4, param3, -(param1 * param3) + param8, param6, param7);
            param2.aa(param0 + param3, param4 + param3, param5 + -(2 * param3), param8 + -(param3 * 2), param6, param7);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cha.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    abstract void a(int param0, int param1, java.awt.Component param2, byte param3);

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    static {
        field_b = "Clan";
        field_c = "Your request to join has been declined.";
        field_h = "Round Winner";
        field_d = new mla();
    }
}
