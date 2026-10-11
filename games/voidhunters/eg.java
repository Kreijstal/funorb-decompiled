/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends rqa {
    static rbb field_p;
    static int field_o;

    final static void a(int param0, int param1, phb[] param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          if (param2 != null &&
            param4 > 0) {
            var5_int = param2[0].field_m;
            var6 = param2[2].field_m;
            var7 = param2[1].field_m;
            param2[0].a(param3, param1);
            param2[2].a(param4 + (param3 - var6), param1);
            dma.a(ola.field_o);
            dma.g(var5_int + param3, param1, param4 + param3 - var6, param1 + param2[param0].field_n);
            var8 = param3 + var5_int;
            var9 = -var6 + param4 + param3;
            for (param3 = var8; param3 < var9; param3 = param3 + var7) {
              param2[1].a(param3, param1);
            }
            dma.b(ola.field_o);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("eg.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    eg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
            field_p = (rbb) null;
          }
          stackIn_3_0 = new nc(frb.a(71, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eg.A(");
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
        if (param0 > -43) {
          field_o = -91;
        }
    }

    final static void e(byte param0) {
        if (fda.e((byte) 104)) {
          return;
        }
        if (!wh.g(-127)) {
          return;
        }
        kc var1 = es.field_b;
        if (var1 == null) {
          return;
        }
        if (bqa.a(false)) {
          var1 = new kc();
          es.field_b.b((byte) 87, var1);
          var1.field_f = null;
        }
        byte[] var2 = dab.a(-30234, var1);
        if (var2 == null) {
          nkb.a(false, "Failed to write player gamedata");
          return;
        }
        if (var2.length > 200) {
          nkb.a(false, "Failed to write player gamedata");
          return;
        }
        nkb.a(false, "Submitting " + var2.length + " bytes to clientdata");
        if (param0 > -35) {
          field_o = -50;
        } else {
          jla.a(var2, (byte) 64, 6);
          return;
        }
        jla.a(var2, (byte) 64, 6);
    }

    static {
        field_o = 2;
    }
}
