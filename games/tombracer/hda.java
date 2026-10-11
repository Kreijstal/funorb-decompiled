/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hda extends tc {
    static String field_h;

    final pl a(byte param0) {
        if (param0 != 113) {
          hda.b((byte) -6);
          return fq.field_c;
        }
        return fq.field_c;
    }

    public static void b(byte param0) {
        field_h = null;
        if (param0 > -127) {
          field_h = (String) null;
        }
    }

    hda(long param0, String param1) {
        super(param0, param1);
    }

    final static sc a(int param0, int param1, cg param2) {
        RuntimeException var3 = null;
        sc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1303) {
            hda.b((byte) 32);
          }
          stackIn_3_0 = new sc(param2, param0 * kta.field_d / 1000);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hda.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_h = "PRESS <img=8><img=9> TO DROP WHAT YOU'RE CARRYING";
    }
}
