/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -119) {
            stackIn_4_0 = new nc(frb.a(159, 121));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qe.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime1Lifetime1;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 < 128) {
          var3 = 44 / ((param1 + 12) / 34);
          return (char)var2;
        }
        if (var2 < 160) {
          var3Lifetime1 = tu.field_c[var2 - 128];
          if (var3Lifetime1 == 0) {
            var3Lifetime1 = 63;
          }
          var2 = var3Lifetime1;
          var3Lifetime1Lifetime1 = 44 / ((param1 + 12) / 34);
          return (char)var2;
        }
        var3Lifetime2 = 44 / ((param1 + 12) / 34);
        return (char)var2;
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 <= 56) {
          field_o = (String) null;
        }
    }

    qe(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static vcb a(int param0) {
        if (param0 == 0) {
          return new vcb(0, 0, msa.field_s.field_s, 0, (wwa) null, msa.field_s.field_e, msa.field_s.field_l, msa.field_s.field_s, msa.field_s.field_s, msa.field_s.field_r, msa.field_s.field_i, false, true, 32768, 0);
        }
        return (vcb) null;
    }

    static {
        field_o = "Ship at <%0>% complexity";
    }
}
