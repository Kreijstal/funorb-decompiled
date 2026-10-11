/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static ib field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 < 85) {
          String var2 = (String) null;
          kh.a((String) null, 30, true, (String) null, 125, (bg) null, (String) null);
        }
    }

    final static int a(byte param0) {
        if (param0 > -39) {
          String var2 = (String) null;
          kh.a((String) null, -3, false, (String) null, 109, (bg) null, (String) null);
          c.field_h.b(true);
          if (lg.field_n.a((byte) -122)) {
            return 0;
          }
          return lf.a(3);
        }
        c.field_h.b(true);
        if (lg.field_n.a((byte) -122)) {
          return 0;
        }
        return lf.a(3);
    }

    final static boolean a(String param0, int param1, boolean param2, String param3, int param4, bg param5, String param6) {
        RuntimeException var7 = null;
        jg var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (di.field_a != ch.field_d) {
            return false;
          }
          var8 = new jg(wg.field_j, param5);
          wg.field_j.b((byte) -33, var8);
          if (!ad.c(false)) {
            cg.field_a = null;
            ac.field_c = param0;
            v.field_b = param6;
            v.field_c = param2;
            dd.field_d = param4;
            ch.field_d = cf.field_b;
            mh.field_F = param3;
          } else {
            var8.h((byte) 114);
          }
          if (param1 <= 69) {
            kh.a(53);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("kh.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_a = new ib();
    }
}
