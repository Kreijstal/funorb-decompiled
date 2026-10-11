/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wda extends rqa {
    static String field_r;
    static int field_q;
    static int field_p;
    static int field_s;
    static kba field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          hb.a((String) (param0[0].field_b), 32);
          if (param1 <= -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wda.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(rsb param0, int param1, lta param2, byte param3, lbb param4) {
        int var7 = 0;
        bba[] var6 = null;
        bba var8 = null;
        wm[] var9 = null;
        rna[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        una var13 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var12 = VoidHunters.field_G;
        try {
          if (param3 > 0) {
            return;
          }
          chb.a(0);
          var13 = param0.field_g.e(0);
          if (var13 != null) {
            var6 = var13.b(1);
            if (var6 != null) {
              for (var7 = 0; var7 < var6.length; var7++) {
                var8 = var6[var7];
                var9 = var8.a((byte) -126);
                var10 = var8.c((byte) -42);
                if (var9 != null &&
                  var10 != null) {
                  var11 = ada.a(param0, param4, false, var10);
                  if (var11 >= 0 &&
                    var11 < glb.field_c.length) {
                    aba.a(param4, var9, param2, var11, (byte) 51, param1, param0);
                  }
                }
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("wda.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 >= -16) {
          field_r = (String) null;
        }
        field_o = null;
        field_r = null;
    }

    wda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_r = "As a team, reach a total size of 100 components to win";
        field_p = 80;
        field_s = 0;
        field_q = 5;
        field_o = new kba();
    }
}
