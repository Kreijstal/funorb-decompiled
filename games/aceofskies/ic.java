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
        if (ua.field_d != null) {
          Object var1 = ua.field_d;
          synchronized (var1) {
            ua.field_d = null;
          }
        }
        if (param0 != 0) {
          ic.a((byte) -120);
        }
    }

    final static w a(String param0, boolean param1) {
        String stackIn_27_2 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var2_int = param0.length();
          if (var2_int == 0) {
            w stackIn_4_0 = nh.field_f;
            return stackIn_4_0;
          }
          if (63 < var2_int) {
            w stackIn_7_0 = ei.field_d;
            return stackIn_7_0;
          }
          for (int var3 = 0; var3 < var2_int; var3++) {
            int var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (0 == var3 ||
                var3 == -1 + var2_int) {
                w stackIn_15_0 = td.field_d;
                return stackIn_15_0;
              }
            } else {
              if (ml.field_l.indexOf(var4) == -1) {
                w stackIn_18_0 = td.field_d;
                return stackIn_18_0;
              }
            }
          }
          if (!param1) {
            return null;
          }
          field_a = (String) null;
          Object stackIn_23_0 = null;
          return (w) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_26_0 = var2;
          StringBuilder stackIn_26_1 = new StringBuilder().append("ic.D(");
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
