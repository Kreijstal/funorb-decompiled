/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lba extends rqa {
    static String field_o;

    lba(String param0, Class[] param1, String param2) {
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
          if (param1 > -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new nc(wkb.field_c);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lba.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != 49) {
          field_o = (String) null;
        }
    }

    final static void a(int param0) {
        rg.field_b = false;
        tla.field_c = false;
        cea.a(-86, param0);
        lrb.field_b = kla.field_d;
        dn.field_r = kla.field_d;
    }

    static {
        field_o = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
