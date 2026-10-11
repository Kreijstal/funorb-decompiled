/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static int field_b;
    static String field_a;

    final static void a(int param0, boolean param1) {
        if (param1) {
          field_b = 93;
        }
        de.a((byte) 92);
    }

    public static void a(byte param0) {
        if (param0 >= -43) {
          String var2 = (String) null;
          ic.a((String) null, true);
        }
        field_a = null;
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (ua.field_d != null) {
          var1 = ua.field_d;
          synchronized (var1) {
            ua.field_d = null;
          }
        }
        if (param0 != 0) {
          ic.a((byte) -120);
        }
    }

    final static w a(String param0, boolean param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        w stackIn_4_0 = null;
        w stackIn_7_0 = null;
        w stackIn_15_0 = null;
        w stackIn_18_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = nh.field_f;
            return stackIn_4_0;
          }
          if (63 < var2_int) {
            stackIn_7_0 = ei.field_d;
            return stackIn_7_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (0 == var3 ||
                var3 == -1 + var2_int) {
                stackIn_15_0 = td.field_d;
                return stackIn_15_0;
              }
            } else {
              if (ml.field_l.indexOf(var4) == -1) {
                stackIn_18_0 = td.field_d;
                return stackIn_18_0;
              }
            }
          }
          if (!param1) {
            return null;
          }
          field_a = (String) null;
          stackIn_23_0 = null;
          return (w) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("ic.D(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_a = "End Game";
    }
}
