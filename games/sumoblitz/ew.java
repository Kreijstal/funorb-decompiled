/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ew extends na {
    static int field_e;
    static int field_f;

    final static eg a(byte param0, int param1) {
        int var3 = 115 % ((param0 - 30) / 47);
        eg var2 = new eg();
        wr.field_E.a((ms) (var2), (byte) 39);
        ou.a(127, param1);
        return var2;
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 26, param1) == qr.field_e) {
            stackIn_2_0 = aj.field_t;
            return stackIn_2_0;
          }
          if (param0 == 0) {
            stackIn_7_0 = nw.field_h;
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ew.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ew(dh param0) {
        super(param0);
    }

    final gf a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        gf stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 26) {
            field_e = 68;
          }
          stackIn_5_0 = (il.a(param1, (byte) 38) != null) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            return qe.field_a;
          }
          stackIn_8_0 = qr.field_e;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ew.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
    }
}
