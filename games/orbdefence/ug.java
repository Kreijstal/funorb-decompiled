/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends hi {
    static tl field_p;
    static String field_o;
    private vi field_n;
    static int field_q;
    static String field_r;

    final static boolean a(byte param0, be param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -88 / ((2 - param0) / 56);
          stackIn_1_0 = param1.b((byte) -72);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ug.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final String a(int param0, String param1) {
        ga var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_n instanceof ib) {
            var3 = ((ib) ((Object) this.field_n)).a((byte) -115);
            if (var3 != null) {
              if (var3.d(param0 + 3453) == nc.field_bb &&
                !param1.equals(this.field_n.field_l)) {
                stackIn_7_0 = cc.field_i;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.a(123);
              return stackIn_9_0;
            }
          }
          if (!param1.equals(this.field_n.field_l)) {
            stackIn_12_0 = cc.field_i;
            return stackIn_12_0;
          }
          if (param0 == -11300) {
            return null;
          }
          stackIn_16_0 = (String) null;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ug.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_o = null;
        int var1 = 49 / ((param0 - 7) / 43);
        field_r = null;
        field_p = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ul.d(param2, param1, param4, param3, 0);
        param1++;
        param3 -= 2;
        param2++;
        param4 -= 2;
        ul.a(param2, param1, param4, param3, 11184810, 4605510);
        param2 += 2;
        param3 -= 4;
        param1 += 2;
        param4 -= 4;
        ul.c(param2, param1, param4, param3, 2500134, 5921370);
        param3 -= 2;
        param1++;
        param4 -= 2;
        param2++;
        if (param0 >= 32) {
          ul.d(param2, param1, param4, param3, 0);
          param1++;
          param2++;
          param4 -= 2;
          param3 -= 2;
          ul.a(param2, param1, param4, param3, 394758, 1710618);
          gk.field_a.e(param2, param1, param4, param3, 64);
          return;
        }
    }

    final qd a(String param0, byte param1) {
        ga var3 = null;
        RuntimeException var3_ref = null;
        qd stackIn_6_0 = null;
        qd stackIn_9_0 = null;
        qd stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_n instanceof ib) {
            var3 = ((ib) ((Object) this.field_n)).a((byte) 22);
            if (var3 != null &&
              var3.d(-7847) != nc.field_bb) {
              stackIn_6_0 = vh.field_h;
              return stackIn_6_0;
            }
          }
          if (param1 != -99) {
            stackIn_9_0 = (qd) null;
            return stackIn_9_0;
          }
          if (!param0.equals(this.field_n.field_l)) {
            stackIn_13_0 = vh.field_h;
          } else {
            stackIn_13_0 = nc.field_bb;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ug.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    ug(vi param0, vi param1) {
        super(param0);
        try {
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "MEGA SHOT";
        field_p = new tl();
    }
}
