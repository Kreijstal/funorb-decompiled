/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends rqa {
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 27);
          }
          si.a(214, 62, param0[0].a(113));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ak.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ak(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int e(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = VoidHunters.field_G;
        try {
          if (null == fwa.field_g) {
            var1_int = 107 % ((param0 + 59) / 38);
            stackIn_13_0 = 9;
            return stackIn_13_0;
          }
          var1_intLifetime1 = 0;
          for (var2 = 3; 12 > var2; var2++) {
            var3 = fwa.field_g.field_c[var2];
            if (fwa.field_g.a(var3, true, false) ||
              fwa.field_g.c(var3, 78)) {
              var1_intLifetime1++;
            }
          }
          stackIn_11_0 = var1_intLifetime1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "ak.B(" + param0 + ')');
        }
    }

    static {
        field_o = true;
    }
}
