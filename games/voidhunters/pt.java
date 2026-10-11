/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pt extends rqa {
    static int field_o;

    final static String a(int param0, int param1) {
        if (param1 > -26) {
          pt.a(-66, 68);
        }
        return "0" + (param0 + 1) + "/" + "0" + mb.field_k.length;
    }

    final static tv[] a(int param0, int param1, tv[] param2, dja param3, int param4, faa param5) {
        int var8 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        tv[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = VoidHunters.field_G;
        try {
          var7 = 47 / ((82 - param0) / 43);
          var6_int = param5.i(0, param4);
          if (0 != var6_int) {
            if (param2 == null ||
              param2.length != var6_int) {
              param2 = param3.a(11995, var6_int);
            }
            for (var8 = 0; var8 < var6_int; var8++) {
              if (kv.a(false, param5)) {
                if (param2[var8] == null) {
                  param2[var8] = param3.a((byte) 109);
                }
                ((utb) ((Object) param2[var8])).a(param5, 32);
              } else {
                param2[var8] = null;
              }
            }
          } else {
            param2 = null;
          }
          stackIn_17_0 = (tv[]) (param2);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("pt.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    pt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
          if (param1 >= -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -95);
          }
          stackIn_3_0 = new nc(oq.field_E);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pt.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = 64;
    }
}
