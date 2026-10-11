/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kcb extends rqa {
    static int field_o;
    static int field_p;

    final static tv[] a(int param0, dja param1, faa param2, int param3, int param4, tv[] param5) {
        int var7 = 0;
        tv[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        tv var9 = null;
        faa var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (param4 >= -45) {
            kcb.a(-101, (dja) null, (faa) null, -50, 54, (tv[]) null);
          }
          var6_int = param2.i(0, param0);
          if (0 != var6_int) {
            if (param5 == null ||
              param5.length != var6_int) {
              param5 = param1.a(11995, var6_int);
            }
            for (var7 = 0; var7 < var6_int; var7++) {
              if (!kv.a(false, param2)) {
                param5[var7] = null;
              } else {
                if (param5[var7] == null) {
                  param5[var7] = param1.a((byte) -122);
                }
                var8 = param3;
                var9 = param5[var7];
                var10 = param2;
                if (1 == var8) {
                  var9.a(var10, false);
                }
                if (2 == var8) {
                  ((tva) (var9)).a(-81, var10);
                }
                if (var8 == 3) {
                  ((sjb) (var9)).a(var10, 67);
                }
              }
            }
          } else {
            param5 = null;
          }
          stackIn_23_0 = (tv[]) (param5);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = var6;
          stackIn_26_1 = new StringBuilder().append("kcb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          nda.field_q = param0[0].a(98);
          if (param1 < -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kcb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    kcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = 5;
        field_p = -1;
    }
}
