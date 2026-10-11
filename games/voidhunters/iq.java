/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iq {
    static int field_a;

    final static tv[] a(dja[] param0, tv[] param1, Class[] param2, dja param3, int param4, faa param5, int param6, int param7) {
        int var11 = 0;
        tv[] stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        tv var14 = null;
        faa var15 = null;
        int var16 = 0;
        var16 = VoidHunters.field_G;
        try {
          var8_int = 56 % ((param7 - 59) / 43);
          var9 = param5.i(0, param4);
          if (var9 != 0) {
            if (param1 == null ||
              param1.length != var9) {
              param1 = param3.a(11995, var9);
            }
            var10 = iia.a(-118, param0.length - 1);
            for (var11 = 0; var9 > var11; var11++) {
              if (!kv.a(false, param5)) {
                param1[var11] = null;
              } else {
                var12 = param5.i(0, var10);
                if (param1[var11] == null ||
                  param1[var11].getClass() != param2[var12]) {
                  param1[var11] = param0[var12].a((byte) -120);
                }
                var13 = param6;
                var14 = param1[var11];
                var15 = param5;
                if (var13 == 1) {
                  var14.a(var15, false);
                }
                if (2 == var13) {
                  ((tva) (var14)).a(-128, var15);
                }
                if (var13 == 3) {
                  ((sjb) (var14)).a(var15, -97);
                }
              }
            }
          } else {
            param1 = null;
          }
          stackIn_26_0 = (tv[]) (param1);
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_29_0 = var8;
          stackIn_29_1 = new StringBuilder().append("iq.A(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param3 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_a = -1;
    }
}
