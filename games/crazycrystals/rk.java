/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_e;
    static int field_d;
    static int field_g;
    static dl field_a;
    static String field_f;
    static oi field_c;
    static int field_b;

    final static void a(String[] args, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3928) {
                break L1;
              } else {
                field_b = -46;
                break L1;
              }
            }
            L2: {
              if (uo.field_i != null) {
                uo.field_i.field_L.a(args, 0);
                break L2;
              } else {
                break L2;
              }
            }
            if (oh.field_d == null) {
              break L0;
            } else {
              oh.field_d.field_A.a(args, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("rk.C(");

            if (args == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 54) {
            return;
        }
        field_e = null;
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final static void a(int param0) {
        if (!gl.field_c) {
            throw new IllegalStateException();
        }
        jd.field_z = true;
        fl.a(true, param0 + 1);
        hp.field_s = param0;
    }

    static {
        field_d = 54;
        field_e = "Waiting for sound effects";
        field_a = new dl(540, 140);
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_c = new oi();
    }
}
