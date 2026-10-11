/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qea extends rqa {
    static int[] field_r;
    static int field_p;
    static int field_q;
    static int field_o;

    qea(String param0, Class[] param1, String param2) {
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
            qea.a((byte) -45, -12);
          }
          si.a(74, 62, param0[0].a(118));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qea.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_r = null;
        if (!param0) {
          qea.a(-19, -41, true, 117, -123, 114, 51);
        }
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          if (param0 != -29) {
            field_r = (int[]) null;
          }
          hqb.a(0, pn.field_b, bea.field_e, true, param1, (byte) 24, rha.field_d);
          for (var2_int = 0; bea.field_e > var2_int; var2_int++) {
            sv.field_f[var2_int + param1] = var2_int;
          }
          hqb.a(param1, qbb.field_a, bea.field_e + param1, false, param1 + param1, (byte) 24, npa.field_d);
          if (bea.field_e <= param1) {
            return;
          }
          bea.field_e = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "qea.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        String var7 = null;
        int var8 = 105 / ((27 - param1) / 52);
        if (ow.field_b == 2) {
          var7 = iqa.field_o;
        } else {
          var7 = kia.field_b;
        }
        VoidHunters.a(param4, param3, param6, param0, var7, param5, true, param2);
    }

    static {
        field_r = new int[16];
        field_q = 100;
        field_o = 0;
    }
}
