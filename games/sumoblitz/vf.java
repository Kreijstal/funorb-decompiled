/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static int field_b;
    static qr field_c;
    static String field_e;
    static ki field_a;
    static int field_d;

    final static void a(byte param0) {
        if (null != hc.field_c) {
          hc.field_c.n(-7);
          if (param0 == -49) {
            ro.field_a = new vq();
            vi.field_y.b((byte) -94, ro.field_a);
            return;
          }
          vf.a(3);
          ro.field_a = new vq();
          vi.field_y.b((byte) -94, ro.field_a);
          return;
        }
        if (param0 != -49) {
          vf.a(3);
          ro.field_a = new vq();
          vi.field_y.b((byte) -94, ro.field_a);
          return;
        }
        ro.field_a = new vq();
        vi.field_y.b((byte) -94, ro.field_a);
    }

    final static bo a(ki param0, boolean param1, String param2, String param3, ki param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        bo stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_c = (qr) null;
          }
          var5_int = param4.a(0, param2);
          var6 = param4.a(var5_int, param3, (byte) 126);
          stackIn_3_0 = tf.a(param0, (byte) -71, var5_int, var6, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vf.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        if (param0 != 1) {
          ki var2 = (ki) null;
          vf.a((ki) null, false, (String) null, (String) null, (ki) null);
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = rg.field_C[param0];
          for (var2 = 1; var2 < rg.field_C.length; var2++) {
            var3 = rg.field_C[var2];
            la.a(Sumoblitz.field_G, var2 << 4, Sumoblitz.field_G, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "vf.B(" + param0 + ')');
        }
    }

    static {
        field_b = 200;
        field_e = "Reload game";
        field_c = new qr();
    }
}
