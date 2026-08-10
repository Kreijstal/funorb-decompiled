/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int[] field_h;
    static volatile boolean field_f;
    static sf[] field_d;
    static String field_j;
    static int field_e;
    static String field_i;
    static wk[] field_g;
    static int field_b;
    static int field_c;
    static cm field_a;
    static mi field_k;

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              qe.a((java.awt.Component) ((Object) param0), param1 ^ -21768);
              hb.a(0, (java.awt.Component) ((Object) param0));
              if (param1 == 9174) {
                break L1;
              } else {
                field_b = -11;
                break L1;
              }
            }
            if (nc.field_j == null) {
              break L0;
            } else {
              nc.field_j.b((java.awt.Component) ((Object) param0), true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("pa.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 < 13) {
          field_k = (mi) null;
          field_j = null;
          field_k = null;
          field_g = null;
          field_a = null;
          field_i = null;
          field_d = null;
          field_h = null;
          return;
        } else {
          field_j = null;
          field_k = null;
          field_g = null;
          field_a = null;
          field_i = null;
          field_d = null;
          field_h = null;
          return;
        }
    }

    final static void a(int param0, mg param1) {
        if (!(param1 != null)) {
            return;
        }
        jk.field_i = param1;
        qf.field_c.field_M.g(6);
        qf.field_c.a(jk.field_i, 127);
        if (param0 != 12105) {
            return;
        }
        try {
            vb.field_e = true;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "pa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, tc param2) {
        try {
            ic.field_B.a(3, param2);
            vh.a(param0, param2, (byte) 109);
            if (param1 > -24) {
                mg var4 = (mg) null;
                pa.a(45, (mg) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "pa.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(cm param0, int param1, cm param2) {
        try {
            int var3_int = -47 / ((param1 - 53) / 45);
            rj.field_d = param2;
            field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "pa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = true;
        field_e = -1;
        field_c = -1;
        field_j = "Co-op highscores";
        field_i = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
