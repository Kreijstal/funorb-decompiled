/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends da {
    static int field_n;
    static String[] field_m;
    static boolean field_p;
    static String field_l;
    static int[] field_o;

    public static void g(int param0) {
        if (param0 == -27799) {
          field_o = null;
          field_m = null;
          field_l = null;
          return;
        }
        na.g(15);
        field_o = null;
        field_m = null;
        field_l = null;
    }

    final ba a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        ba stackIn_3_0 = null;
        ba stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!qb.a(var4, -51)) {
            stackIn_3_0 = ir.field_a;
            return stackIn_3_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = cf.a(107, var5);
          if (~var3_int < param0 &&
            var3_int <= 130) {
            return qm.field_G;
          }
          stackIn_8_0 = ir.field_a;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("na.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    na(kp param0) {
        super(param0);
    }

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3614) {
            na.g(-83);
          }
          if (this.a(-1, param1) != ir.field_a) {
            return null;
          }
          stackIn_5_0 = br.field_S;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("na.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_n = 1;
        field_l = "Chat view has been scrolled up. Scroll down to chat.";
        field_o = new int[28];
    }
}
