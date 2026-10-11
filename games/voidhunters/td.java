/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class td extends rqa {
    final static String a(int param0, int param1) {
        if (param0 == 0) {
          return uf.field_F;
        }
        if (param0 == 1) {
          return eia.field_r;
        }
        if (param1 <= 88) {
          return (String) null;
        }
        if (param0 == 2) {
          return null;
        }
        if (param0 == 3) {
          return whb.field_d;
        }
        if (param0 == 4) {
          return bpb.field_o;
        }
        if (param0 == 5) {
          return null;
        }
        if (6 != param0) {
          return "Unknown component type";
        }
        return null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        File var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (File) null;
            td.a((byte) -64, (String) null, (File) null);
          }
          stackIn_3_0 = new nc(frb.a(224, 118));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("td.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    td(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, String param1, File param2) {
        try {
          jma.field_q.put(param1, param2);
          int var3_int = 97 / ((63 - param0) / 59);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "td.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
