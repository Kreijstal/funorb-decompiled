/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ofb extends rqa {
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          tc.a(70, param0[1].a(7), param0[0].a(14));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ofb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    ofb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static phb a(int param0, int param1, asb param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        phb stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (pa.a(param0, param3, param2, param1)) {
            stackIn_4_0 = jgb.a(-91);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (phb) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ofb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static lkb a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        lkb var7 = null;
        int var8 = 0;
        lkb stackIn_3_0 = null;
        lkb stackIn_7_0 = null;
        lkb stackIn_10_0 = null;
        lkb stackIn_15_0 = null;
        lkb stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = br.field_f;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = qw.field_j;
            return stackIn_7_0;
          }
          var3 = up.a((byte) -67, '.', param1);
          if (2 > var3.length) {
            stackIn_10_0 = br.field_f;
            return stackIn_10_0;
          }
          var4 = var3;
          var5 = param0;
          while (true) {
            if (var4.length <= var5) {
              stackIn_18_0 = qj.a((byte) -74, var3[-1 + var3.length]);
              return stackIn_18_0;
            }
            var6 = var4[var5];
            var7 = mqa.a(-23150, var6);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_15_0 = var7;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ofb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_o = true;
    }
}
