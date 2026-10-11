/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int field_a;
    static hr field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static dk a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        dk var5 = null;
        dk stackIn_4_0 = null;
        dk stackIn_7_0 = null;
        dk stackIn_12_0 = null;
        dk stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_7_0 = qo.field_a;
              return stackIn_7_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(1 + var2_int);
            if (param1 < 0) {
              field_b = (hr) null;
            }
            var5 = g.a((byte) -126, var3);
            if (var5 == null) {
              stackIn_14_0 = lh.a(var4, -1);
              return stackIn_14_0;
            }
            stackIn_12_0 = var5;
            return stackIn_12_0;
          }
          stackIn_4_0 = en.field_j;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("il.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(boolean param0, ki param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_intLifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 9; var2_int++) {
            if (null != nt.field_m[var2_int] &&
              !qr.field_b.field_x.a(eb.field_b, nt.field_m[var2_int], -1, param1, 176400)) {
              return false;
            }
          }
          if (param0) {
            return false;
          }
          var4 = 0;
          var2_intLifetime1 = var4;
          while (var4 < 9) {
            if (nt.field_m[var4] != null &&
              !qr.field_b.field_r.a(eb.field_b, nt.field_m[var4], -1, param1, 176400)) {
              return false;
            }
            var4++;
          }
          qr.field_b.field_x.a((byte) 28);
          qr.field_b.field_r.a((byte) 28);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("il.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 26238) {
          field_a = 82;
        }
    }

    final static void a(byte param0, String param1) {
        System.out.println("Error: " + aw.a("%0a", param1, "\n", true));
        if (param0 < 4) {
          il.a(81);
        }
    }

    static {
        field_a = 0;
    }
}
