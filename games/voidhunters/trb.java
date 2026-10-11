/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class trb extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          wkb.field_c = param0[0].a(68);
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("trb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        param5 = param5 - param2;
        param0 = param0 - param1;
        if (param5 < -param3) {
          return false;
        }
        if (-param3 > param0) {
          return false;
        }
        if (param5 > param3) {
          return false;
        }
        if (param0 > param3) {
          return false;
        }
        int var6 = Math.max(vma.a(114, param3), Math.max(vma.a(122, param5), vma.a(122, param0))) - 13;
        if (var6 > 0) {
          param0 = param0 >> var6;
          param3 = param3 >> var6;
          param5 = param5 >> var6;
        }
        if (param3 <= 0) {
          return false;
        }
        var6 = -11 / ((-20 - param4) / 58);
        if ((param5 | param0) == 0) {
          return true;
        }
        return param3 * param3 >= param0 * param0 + param5 * param5 ? true : false;
    }

    trb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, ij param1, int param2, boolean param3, ij param4) {
        ntb[] var5 = null;
        RuntimeException var5_ref = null;
        ntb[] var6 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = gn.a(param2 ^ param2, param1);
          var6 = gn.a(0, param4);
          stackIn_1_0 = tja.a(var6, param0, var5, param3, param2 ^ 5542);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("trb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
