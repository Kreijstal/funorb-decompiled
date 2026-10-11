/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends jf {
    static he[] field_vb;
    static he field_ub;
    static id field_sb;
    static long field_rb;
    static int field_tb;

    final void a(int param0, vg param1) {
        try {
          if (param0 != 33) {
            field_tb = -12;
          }
          super.a(param0 ^ 0, param1);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "el.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    el(k param0, vg param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        kc var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var4 = (kc) (rd.field_C.h(-11151));
          if (param0) {
            return;
          }
          while (var4 != null) {
            rh.a(125, var4, param1);
            var4 = (kc) (rd.field_C.e(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "el.R(" + param0 + ',' + param1 + ')');
        }
    }

    final static hj a(String param0, int param1, byte param2) {
        ka var3 = null;
        RuntimeException var3_ref = null;
        ka stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ka();
          ((hj) ((Object) var3)).field_b = param0;
          if (param2 <= 20) {
            el.a(true, 81);
          }
          ((hj) ((Object) var3)).field_d = param1;
          stackIn_3_0 = var3;
          return (hj) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("el.P(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void n(int param0) {
        field_sb = null;
        field_vb = null;
        if (param0 != 20) {
          return;
        }
        field_ub = null;
    }

    static {
        field_tb = 0;
    }
}
