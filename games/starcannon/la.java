/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static String field_a;
    static int field_b;
    static int field_c;
    static int[] field_d;

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          for (var2_int = 0; var2_int < param1.length(); var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!eh.a((char) var3, false) &&
              !wc.a(48, (char) var3)) {
              return true;
            }
          }
          if (param0 == 96) {
            return false;
          }
          field_c = -105;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("la.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 64) {
          return 110;
        }
        int var3 = param2 >> 31 & param1 - 1;
        return var3 + ((param2 >>> 31) + param2) % param1;
    }

    final static void a(int param0) {
        re.a(param0 ^ param0);
        if (kj.field_E != null) {
          wf.a(kj.field_E, false);
        }
        te.a((byte) 98);
        li.a(1392);
        vf.a(79);
        if (jb.b(param0 - 127)) {
          d.field_b.d((byte) 76, 1);
          nf.a(0, (byte) 95);
        }
        ec.a((byte) 27);
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        int var1 = -33 / ((param0 + 66) / 38);
    }

    final static void a(int param0, we param1, int param2) {
        ia var3 = null;
        try {
          var3 = d.field_b;
          var3.d((byte) 73, param2);
          var3.a(2, -111);
          var3.a(param0, -73);
          var3.a(param1.field_g, -86);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Collecting the same power-up as the currently active laser will increase the power of all your weapons.";
        field_b = 64;
        field_c = 0;
    }
}
