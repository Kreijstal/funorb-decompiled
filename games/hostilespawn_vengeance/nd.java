/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static rd field_e;
    int field_c;
    static bm field_d;
    int field_b;
    static bd field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, oj param1, int param2) {
        int var4 = 0;
        lf[] var3 = null;
        lf var5 = null;
        int var6 = 0;
        oj var7 = null;
        lf[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param2 != 18459) {
            var7 = (oj) null;
            nd.a(78, (oj) null, -25);
          }
          var8 = md.field_g;
          var3 = var8;
          for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            var5.a(param0, 576, param1);
            var5.b(61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("nd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        if (param0 != 30401) {
          field_d = (bm) null;
        }
    }

    final static ii a(int param0, String param1) {
        RuntimeException var2 = null;
        ii stackIn_6_0 = null;
        ii stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (c.field_a.d((byte) -16) &&
            !param1.equals(c.field_a.a((byte) -34))) {
            c.field_a = ta.a(false, param1);
          }
          if (param0 == 3888) {
            stackIn_8_0 = c.field_a;
            return stackIn_8_0;
          }
          stackIn_6_0 = (ii) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("nd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    nd(int param0, int param1, int param2, int param3) {
        this.field_b = param3;
        this.field_c = param0;
    }

    static {
        field_d = new bm();
    }
}
