/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends rqa {
    static int[] field_o;

    kq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 11105) {
          field_o = (int[]) null;
          if (param0 > param1) {
            return 2048 - hob.a((param1 << 16) / param0, (byte) -126);
          }
          return hob.a((param0 << 16) / param1, (byte) -127);
        }
        if (param0 > param1) {
          return 2048 - hob.a((param1 << 16) / param0, (byte) -126);
        }
        return hob.a((param0 << 16) / param1, (byte) -127);
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
          hbb.field_z = param0[0].a(9);
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 67);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kq.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(float param0, byte param1, int param2, int param3, int param4) {
        if (!li.field_i) {
          dma.c(param4, param2, (int)param0, param3);
          if (param1 < 52) {
            field_o = (int[]) null;
            return;
          }
          return;
        }
        if (rfa.field_p) {
          og.field_r.a(Math.max(1, (int)param0), param2, param4, (byte) 97, -16777216 | param3);
          if (param1 < 52) {
            field_o = (int[]) null;
            return;
          }
          return;
        }
        if (param1 >= 52) {
          return;
        }
        field_o = (int[]) null;
    }

    public static void e(byte param0) {
        if (param0 < 56) {
          return;
        }
        field_o = null;
    }

    static {
        field_o = new int[128];
    }
}
