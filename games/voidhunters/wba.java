/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wba extends rqa {
    static int[] field_o;
    static ge field_p;

    final static aja a(byte param0, ha param1, phb param2) {
        int var4 = 0;
        aja var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        jva var6 = null;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        aja stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (!(param2 instanceof jva)) {
            var6 = new jva(param2.field_q, param2.field_p);
            var6.field_l = param2.field_l;
            var6.field_n = param2.field_n;
            var6.field_m = param2.field_m;
            var6.field_k = param2.field_k;
            for (var4 = 0; var6.field_r.length > var4; var4++) {
              stackIn_6_0 = var6.field_r;
              stackIn_6_1 = var4;
              if (0 != param2.field_r[var4]) {
                stackIn_7_2 = knb.a(-16777216, param2.field_r[var4]);
              } else {
                stackIn_7_2 = 0;
              }
              stackIn_6_0[stackIn_6_1] = stackIn_7_2;
            }
            param2 = (phb) ((Object) var6);
          }
          if (param0 > -61) {
            field_o = (int[]) null;
          }
          var3 = param1.a(param2.field_m, param2.field_m, param2.field_r, 0, (byte) 64, param2.field_n);
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("wba.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            wba.a(73);
          }
          stackIn_3_0 = new nc(frb.a(190, 116));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wba.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 > -70) {
          field_p = (ge) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    wba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
