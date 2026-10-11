/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class heb extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          gv.a(param0[1].a(117), param0[0].a(123), -10923);
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 99);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("heb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0, String param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        String stackIn_36_0 = null;
        String stackIn_40_0 = null;
        Object stackIn_44_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4 = null;
        try {
          if (param0 == 1) {
            stackIn_3_0 = isa.a(ub.field_g, new String[]{param1}, 90);
            return stackIn_3_0;
          }
          if (param0 == 2) {
            stackIn_6_0 = isa.a(dgb.field_a, new String[]{param1}, 104);
            return stackIn_6_0;
          }
          if (param0 == 3) {
            stackIn_10_0 = isa.a(wu.field_e, new String[]{param1}, param2 ^ -3290);
            return stackIn_10_0;
          }
          if (param0 == 4) {
            stackIn_14_0 = isa.a(og.field_s, new String[]{param1}, 108);
            return stackIn_14_0;
          }
          if (param0 == 5) {
            stackIn_17_0 = isa.a(eaa.field_o, new String[]{param1}, 120);
            return stackIn_17_0;
          }
          if (param0 == 6) {
            stackIn_21_0 = isa.a(fpb.field_b, new String[]{param1}, 111);
            return stackIn_21_0;
          }
          if (param0 == 7) {
            stackIn_25_0 = isa.a(btb.field_c, new String[]{param1}, param2 ^ -3268);
            return stackIn_25_0;
          }
          if (8 == param0) {
            stackIn_28_0 = isa.a(acb.field_o, new String[]{param1}, 90);
            return stackIn_28_0;
          }
          if (param0 == 11) {
            stackIn_32_0 = isa.a(ar.field_a, new String[]{param1}, 72);
            return stackIn_32_0;
          }
          if (param0 == 12) {
            stackIn_36_0 = isa.a(ddb.field_o, new String[]{param1}, 123);
            return stackIn_36_0;
          }
          if (13 == param0) {
            stackIn_40_0 = isa.a(rv.field_b, new String[]{param1}, 110);
            return stackIn_40_0;
          }
          if (param2 == -3223) {
            return null;
          }
          var4 = (String) null;
          heb.a(42, (String) null, -110);
          stackIn_44_0 = null;
          return (String) (stackIn_44_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_47_0 = var3;
          stackIn_47_1 = new StringBuilder().append("heb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param2).append(')').toString());
        }
    }

    heb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
