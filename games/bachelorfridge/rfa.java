/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rfa {
    static kv field_a;
    static sna field_b;

    final static int a(boolean param0, int param1) {
        param1 = (param1 >>> 1 & 1431655765) + (1431655765 & param1);
        if (!param0) {
          param1 = (858993459 & param1) + (param1 >>> 2 & -214748365);
          param1 = param1 + (param1 >>> 4) & 252645135;
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
        return -30;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -101) {
          field_b = (sna) null;
        }
    }

    final static cj a(int param0, lu param1) {
        RuntimeException var2 = null;
        rv stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 29428) {
            rfa.a((byte) 60);
          }
          stackIn_3_0 = new rv(param1);
          return (cj) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rfa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
    }
}
