/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends lea {
    static String field_G;
    static String field_J;
    static dn field_H;
    static String field_I;
    static int field_L;
    static String field_K;

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        ue var5 = null;
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
            var4 = super.a(param0, param1, param2);
            var4.a((byte) -3, 2);
            var5 = new ue(param2, param0);
            var5.a(3, false);
            var4.a((byte) 83, (nv) (var5));
            var6 = rm.field_a;
            var7 = (kga) ((Object) var6.a(12, param1 ^ 117));
            var7.b((byte) 98, 2);
            var4.a(var5, (byte) 124, var7);
            stackIn_1_0 = (fsa) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("gd.AC(").append(param0).append(',').append(param1).append(',');

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

    gd(la param0, int param1) {
        super(param0, param1);
    }

    public static void e(boolean param0) {
        field_K = null;
        field_I = null;
        field_H = null;
        if (!param0) {
            return;
        }
        field_J = null;
        field_G = null;
    }

    gd(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_G = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_J = "Show players in <%0>'s game";
        field_I = "Try changing the '<%0>' setting.";
        field_H = new dn();
        field_K = "Offline";
    }
}
