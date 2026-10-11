/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fqb extends rqa {
    static String field_p;
    static String[] field_o;

    final static boolean a(int param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (hoa.a(param1, false)) {
          return true;
        }
        if (param0 != 16647) {
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (160 == param1) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (param1 != 95) {
          return false;
        }
        return true;
    }

    fqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static byte[] a(byte param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        fj var5 = null;
        byte[] var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param3 > 0) {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; param1 > var5_int; var5_int++) {
              var8[var5_int] = param2[var5_int + param3];
            }
          } else {
            var4 = param2;
          }
          var5 = new fj();
          var5.b((byte) -88);
          var5.a(var4, -7, (long)(8 * param1));
          var6 = new byte[64];
          if (param0 != 25) {
            field_o = (String[]) null;
          }
          var5.a(var6, 0, (byte) 89);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("fqb.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 27154) {
          field_p = (String) null;
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
          si.a(87, 62, param0[0].a(89));
          if (param1 > -119) {
            field_o = (String[]) null;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fqb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = new String[3];
        field_p = "Cancel";
    }
}
