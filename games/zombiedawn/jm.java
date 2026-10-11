/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends tc {
    static ec field_B;

    final static int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var2 = param0 * (param0 * param0 >> 12) >> 12;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 > 63) {
          var3 = 6 * param0 - 61440;
          var4 = (var3 * param0 >> 12) + 40960;
          return var2 * var4 >> 12;
        }
        jm.a(-123, 65);
        var3Lifetime1 = 6 * param0 - 61440;
        var4Lifetime1 = (var3Lifetime1 * param0 >> 12) + 40960;
        return var2 * var4Lifetime1 >> 12;
    }

    final static void a(String param0, String param1, int param2) {
        if (kk.field_i != null) {
          kk.field_i.h((byte) -34);
        }
        he.field_a = new ih(param1, param0, false, true, true);
        if (param2 != -901373652) {
          return;
        }
        try {
          bm.field_d.b(20, he.field_a);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "jm.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String b(int param0, ga param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12307) {
            field_B = (ec) null;
          }
          stackIn_3_0 = mo.a(95, param1.field_o.length(), '*');
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    jm(int param0) {
        this(ia.field_e, param0);
    }

    private jm(rb param0, int param1) {
        super(param0, param1);
    }

    public static void a(boolean param0) {
        field_B = null;
        if (param0) {
          field_B = (ec) null;
        }
    }

    static {
    }
}
