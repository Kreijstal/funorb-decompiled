/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String field_a;
    String field_e;
    boolean field_c;
    String[] field_d;
    boolean field_b;
    int field_f;

    final static la a(byte param0, String param1) {
        RuntimeException var2 = null;
        la stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -63) {
            field_a = (String) null;
          }
          stackIn_3_0 = new la(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("mb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 != 105) {
            var6 = (String[]) null;
            mb.a(58, 95, (String) null, (String[]) null);
          }
          ee.field_c = c.field_o;
          if (param1 == 255) {
            stackIn_7_0 = !(cg.field_l >= 13);
            n.field_k = mc.b(stackIn_7_0, 102);
            var7 = (String[]) null;
            th.a((byte) 83, (String[]) null);
            return;
          }
          if (100 > param1) {
            n.field_k = wi.a(param1, (byte) -108, param2);
            return;
          }
          if (param1 > 105) {
            n.field_k = wi.a(param1, (byte) -108, param2);
            return;
          }
          var8 = param3;
          th.a((byte) 85, var8);
          n.field_k = oe.a(-118, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("mb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          var1_int = qg.field_b[param0];
          for (var2 = 1; qg.field_b.length > var2; var2++) {
            var3 = qg.field_b[var2];
            o.a(bf.field_a, var2 << 4, bf.field_a, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "mb.C(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 72 / ((param0 - 46) / 49);
    }

    mb(boolean param0) {
        this.field_c = param0 ? true : false;
    }

    static {
    }
}
