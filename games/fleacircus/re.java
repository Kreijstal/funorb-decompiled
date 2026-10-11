/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    int field_a;
    static String field_b;

    final static void a(int param0) {
        fh.a(-55);
        if (param0 != -17634) {
          return;
        }
        jg.field_d = true;
        fk.field_D = true;
        nb.field_a.i(-106);
        wf.a(dh.field_c, false, false);
    }

    public static void a(byte param0) {
        if (param0 >= -26) {
          re.a((byte) 91);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static String a(byte param0, int param1, rh param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 125) {
            field_b = (String) null;
          }
          if (!param2.b((byte) -106)) {
            stackIn_5_0 = (String) (param4);
            return stackIn_5_0;
          }
          stackIn_7_0 = param3 + " - " + param2.b(param1, -2) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("re.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (!param2) {
          var3 = param0 >>> 31;
          return (param0 + var3) / param1 - var3;
        }
        String var4 = (String) null;
        re.a((byte) 110, 3, (rh) null, (String) null, (String) null);
        var3Lifetime1 = param0 >>> 31;
        return (param0 + var3Lifetime1) / param1 - var3Lifetime1;
    }

    static {
        field_b = "<%0>Teleporter:<%1> these always come in pairs, and teleport the fleas back and forth.";
    }
}
