/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static int field_e;
    int field_f;
    int field_c;
    static int field_b;
    static int field_d;
    int field_a;

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Chess.field_G;
        try {
          if (!qm.a(param2, param0, (byte) 97)) {
            return false;
          }
          for (var3_int = 0; param0.length() > var3_int; var3_int++) {
            if (!am.a(-36, param0.charAt(var3_int))) {
              return false;
            }
          }
          var4 = 114 / ((param1 - 55) / 36);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("fh.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, ln param1) {
        ln var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ln var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          if (param0 >= -113) {
            var4 = (ln) null;
            fh.a((byte) -34, (ln) null);
          }
          param1.c(-2193);
          var2 = (ln) (nk.field_t.g(-18110));
          while (var2 != null) {
            if (var2.a(-7, param1)) {
              var2 = (ln) (nk.field_t.a((byte) -114));
              continue;
            }
            break;
          }
          if (var2 != null) {
            he.a(param1, var2, true);
            return;
          }
          nk.field_t.a((o) (param1), (byte) 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("fh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_d = 0;
    }
}
