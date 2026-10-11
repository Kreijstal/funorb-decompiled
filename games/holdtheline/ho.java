/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho extends gd {
    static mf field_n;
    static int field_i;
    static byte[] field_m;
    static java.math.BigInteger field_k;
    static ql field_j;
    static int field_l;

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, (byte) 122) == g.field_k) {
            stackIn_3_0 = nd.field_a;
            return stackIn_3_0;
          }
          if (!param1) {
            field_l = -45;
          }
          stackIn_7_0 = pk.field_J;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ho.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_k = null;
        field_j = null;
        field_n = null;
        if (param0 != -76) {
          field_k = (java.math.BigInteger) null;
          field_m = null;
          return;
        }
        field_m = null;
    }

    final fd a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        fd stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        fd stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 52) {
            stackIn_2_0 = (fd) null;
            return stackIn_2_0;
          }
          stackIn_6_0 = (pg.a(param0, (byte) -128) != null) ? 0 : 1;
          var3_int = stackIn_6_0;
          if (var3_int != 0) {
            return tg.field_d;
          }
          stackIn_9_0 = g.field_k;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ho.N(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    ho(nk param0) {
        super(param0);
    }

    static {
        field_n = new mf("");
        field_m = new byte[]{(byte)77, (byte)71, (byte)72, (byte)84, (byte)76};
        field_i = 640;
        field_k = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
