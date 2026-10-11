/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends rqa {
    static oe field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oaa.field_i = param0[0].a(8);
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
          stackIn_7_1 = new StringBuilder().append("kk.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ij a(ij param0, ij param1, int param2, dja param3, int param4) {
        Object stackIn_3_0 = null;
        ij stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        tv var6 = null;
        int var7 = 0;
        tv var8 = null;
        int var9 = 0;
        tv var10 = null;
        tv var11 = null;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (ij) (stackIn_3_0);
          }
          if (param0 == null) {
            param0 = new ij();
          }
          var5_int = param1.c(3) - param0.c(3);
          if (var5_int > 0) {
            for (var6_int = 0; var5_int > var6_int; var6_int++) {
              param0.b(-10258, (ksa) ((Object) param3.a((byte) 6)));
            }
          } else {
            if (var5_int < 0) {
              var5_int = -var5_int;
              for (var6_int = 0; var6_int < var5_int; var6_int++) {
                param0.c((byte) -104);
              }
            }
          }
          var6 = (tv) ((Object) param0.d(0));
          var7 = 80 / ((param4 + 6) / 48);
          var8 = (tv) ((Object) param1.d(0));
          while (var8 != null) {
            var9 = param2;
            var10 = var8;
            var11 = var6;
            if (var9 != 1) {
              if (var9 == 2) {
                ((tva) (var10)).a(var11, 29106);
              } else {
                if (var9 != 3) {
                  var6 = (tv) ((Object) param0.a((byte) 94));
                  var8 = (tv) ((Object) param1.a((byte) 116));
                  continue;
                }
                ((sjb) (var10)).a(var11, (byte) 39);
              }
            } else {
              var10.b((byte) 105, var11);
            }
            var6 = (tv) ((Object) param0.a((byte) 94));
            var8 = (tv) ((Object) param1.a((byte) 116));
          }
          stackIn_27_0 = (ij) (param0);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("kk.B(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 <= 94) {
          dja var2 = (dja) null;
          kk.a((ij) null, (ij) null, 83, (dja) null, 17);
        }
    }

    kk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Fighters";
        field_o = new oe();
    }
}
