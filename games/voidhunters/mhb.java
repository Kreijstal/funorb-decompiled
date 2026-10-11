/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mhb extends rqa {
    static ij field_o;

    final static caa a(int param0, caa param1, int[] param2) {
        caa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        caa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new caa(0, 0, 0);
          var3.field_g = param1.field_g;
          var3.field_e = param1.field_e;
          var4 = 50 / ((param0 - 20) / 62);
          var3.field_d = param1.field_d;
          var3.field_j = param1.field_j;
          var3.field_a = param1.field_a;
          var3.field_f = param1.field_f;
          var3.field_i = param2;
          var3.field_h = param1.field_h;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("mhb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 == -2679) {
          return (384 & param1) != 0 ? true : false;
        }
        mhb.e((byte) 84);
        return (384 & param1) != 0 ? true : false;
    }

    public static void e(byte param0) {
        if (param0 != -127) {
          mhb.a(8, 67, -87);
          field_o = null;
          return;
        }
        field_o = null;
    }

    mhb(String param0, Class[] param1, String param2) {
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
          si.a(30, 62, param0[0].a(23));
          if (param1 > -119) {
            field_o = (ij) null;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mhb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = new ij();
    }
}
