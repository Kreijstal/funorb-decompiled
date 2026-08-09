/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends lea {
    static cn field_H;
    static String field_G;
    static ka[] field_J;
    static String field_I;

    public static void s(byte param0) {
        field_H = null;
        field_J = null;
        field_I = null;
        if (param0 != -18) {
            field_J = (ka[]) null;
            field_G = null;
            return;
        }
        field_G = null;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        ef var5 = null;
        mfa var6 = null;
        kga var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = super.a(param0, 3, param2);
            var5 = new ef(param2, param0);
            var5.a(ci.a(4, -1), 5);
            var4.a((byte) 83, (nv) (var5));
            var4.l(param1, 146366800);
            var6 = rm.field_a;
            var7 = (kga) ((Object) var6.a(12, 104));
            var7.b((byte) 74, 4);
            var4.a(var5, (byte) 124, var7);
            stackIn_1_0 = (fsa) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("df.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    df(la param0, int param1) {
        super(param0, param1);
    }

    df(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_G = "Type your password again to make sure it's correct";
        field_I = "Cancel rematch";
    }
}
