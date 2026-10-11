/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hia extends rqa {
    static int[][] field_o;

    hia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(int param0) {
        if (param0 != 0) {
          hia.e(-101);
          field_o = (int[][]) null;
          return;
        }
        field_o = (int[][]) null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(190, 62, param0[0].a(85));
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 43);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hia.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static llb a(int param0) {
        if (param0 != 0) {
          return (llb) null;
        }
        return vra.field_b.field_yb;
    }

    static {
    }
}
