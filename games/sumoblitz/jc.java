/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends na {
    static int field_f;
    static String field_e;

    final gf a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        gf stackIn_2_0 = null;
        gf stackIn_5_0 = null;
        gf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!jf.a(param0 ^ -13159, var4)) {
            stackIn_2_0 = qr.field_e;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = no.a((byte) -128, var5);
          if (param0 != 26) {
            stackIn_5_0 = (gf) null;
            return stackIn_5_0;
          }
          if (var3_int > 0 &&
            var3_int <= 130) {
            return qe.field_a;
          }
          stackIn_10_0 = qr.field_e;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("jc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    jc(dh param0) {
        super(param0);
    }

    public static void c(byte param0) {
        field_e = null;
        int var1 = 5 % ((param0 + 18) / 53);
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 26, param1) == qr.field_e) {
            stackIn_3_0 = gn.field_g;
            return stackIn_3_0;
          }
          if (param0 == 0) {
            return null;
          }
          jc.b(true);
          stackIn_7_0 = null;
          return (String) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int b(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          if (!param0) {
            field_f = 118;
          }
          while (var2 < aa.field_a.length) {
            if (aa.field_a[var2] != null &&
              aa.field_a[var2].field_Q != 0) {
              var1_int++;
            }
            var2++;
          }
          stackIn_12_0 = var1_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "jc.A(" + param0 + ')');
        }
    }

    static {
        field_f = 0;
        field_e = "Go Back";
    }
}
