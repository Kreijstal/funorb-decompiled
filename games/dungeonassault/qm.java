/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends ip {
    static md field_q;
    static String field_p;
    static cn field_m;
    static long field_o;
    static cf field_n;
    static u[] field_r;

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 44) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.a(param1, 52) != pd.field_J) {
            return sh.field_b;
          }
          stackIn_6_0 = uj.field_a;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 != 57) {
          qm.a(-9, 'ￅ');
          if (param1 < 48) {
            return false;
          }
          if (param1 <= 57) {
            return true;
          }
          return false;
        }
        if (param1 < 48) {
          return false;
        }
        if (param1 <= 57) {
          return true;
        }
        return false;
    }

    public static void d(boolean param0) {
        field_q = null;
        field_m = null;
        if (param0) {
          return;
        }
        field_r = null;
        field_p = null;
        field_n = null;
    }

    final od a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        od stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != kc.a(param0, true)) ? 0 : 1;
          var3_int = stackIn_3_0;
          var4 = -1 % ((param1 - 5) / 44);
          if (var3_int != 0) {
            return c.field_d;
          }
          stackIn_6_0 = pd.field_J;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qm.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    qm(rm param0) {
        super(param0);
    }

    final static int a(int param0, int param1, boolean param2, String param3, String param4, int param5, String param6) {
        cd var7 = null;
        RuntimeException var7_ref = null;
        cd var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != 57) {
            field_q = (md) null;
          }
          var7 = new cd(param4);
          var8 = new cd(param6);
          stackIn_3_0 = op.a(var7, param0, param1, var8, param3, ~param5, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("qm.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_p = "<col=FF0000>Attack -2</col>";
        field_q = new md();
    }
}
