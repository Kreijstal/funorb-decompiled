/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nkb extends rqa {
    static byte[] field_p;
    static int field_r;
    static int field_q;
    static String field_o;

    final static void a(int param0, boolean param1) {
        if (param0 != 12) {
          return;
        }
        wba.field_p.a(7861, param1);
    }

    nkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 > -67) {
          field_q = -100;
        }
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
            this.a((nc[]) null, -79);
          }
          stackIn_3_0 = new nc(frb.a(12, 95));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nkb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static tpa a(int param0) {
        if (dn.field_r == kla.field_d) {
          throw new IllegalStateException();
        }
        if (dn.field_r == gka.field_o) {
          dn.field_r = kla.field_d;
          return cjb.field_b;
        }
        if (param0 != 10589) {
          field_p = (byte[]) null;
          return null;
        }
        return null;
    }

    final static void a(boolean param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            nkb.e((byte) 12);
          }
          if (!ssa.b(2)) {
            return;
          }
          System.out.println(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("nkb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        gmb discarded$0 = new gmb();
    }
}
