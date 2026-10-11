/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static String field_a;

    final static void a(byte param0) {
        om.field_s.field_a = 0;
        om.field_s.field_e = 0;
        if (param0 != -26) {
          a.a(-100);
        }
    }

    final static vj a(String param0, int param1) {
        RuntimeException var2 = null;
        vj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6728) {
            a.a((byte) 115);
          }
          stackIn_3_0 = new vj(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("a.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (!tl.field_g) {
          if (mf.field_f == null) {
            mf.field_f = ij.a(param0 ^ -108, 4);
          }
          if (mf.field_f.field_o) {
            oj.field_B = oj.field_B & ~mf.field_f.field_s;
            i.field_o = i.field_o | mf.field_f.field_s;
            mf.field_f = null;
            tl.field_g = true;
          }
        }
        if (tl.field_g) {
          tg.a((byte) -124);
        }
        if (param0 == 0) {
          return;
        }
        a.a(false);
    }

    final static bm a(mi param0, int param1, int param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 83 % ((param3 + 25) / 50);
          if (mc.a(param2, param1, param0, (byte) 119)) {
            return ei.o(85);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("a.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          String var2 = (String) null;
          a.a((String) null, -30);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "<col=FFFFFF>Spread fire:</col> carefully tuned to send blasts into every corner of the tunnel, this weapon will hit everything. If you need precision, you'll get it at close range.";
    }
}
