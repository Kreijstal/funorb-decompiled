/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends dm {
    private Object field_C;
    static String field_y;
    static int field_D;
    static String field_G;
    static mg field_F;
    static int field_E;
    static int field_z;
    static String field_A;
    static String field_B;

    mj(Object param0, int param1) {
        super(param1);
        try {
          this.field_C = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "mj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void f(int param0) {
        sj.a(mb.g((byte) 93), 20298);
        if (param0 != 0) {
          field_z = -18;
        }
    }

    final static void a(int param0, boolean param1) {
        w.field_I.a(param1, 11358);
        if (param0 != 0) {
          mj.g(37);
        }
    }

    final Object b(byte param0) {
        if (param0 != -109) {
          this.d(-120);
          return this.field_C;
        }
        return this.field_C;
    }

    final boolean d(int param0) {
        if (param0 < 65) {
          field_F = (mg) null;
          return false;
        }
        return false;
    }

    public static void g(int param0) {
        if (param0 <= -96) {
          field_G = null;
          field_y = null;
          field_B = null;
          field_A = null;
          field_F = null;
          return;
        }
        mj.g(125);
        field_G = null;
        field_y = null;
        field_B = null;
        field_A = null;
        field_F = null;
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        String var4 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = od.b(0, param1);
          if (param0.indexOf(param1) != -1) {
            return true;
          }
          if (-1 != param0.indexOf(var3)) {
            return true;
          }
          if (param2 <= 105) {
            var4 = (String) null;
            mj.a((String) null, (String) null, (byte) -49);
          }
          stackIn_14_0 = (param0.startsWith(param1)) || (param0.startsWith(var3)) || (param0.endsWith(param1)) || (param0.endsWith(var3));
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("mj.H(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_A = "Game";
        field_G = "Virogrid";
        field_D = 0;
        field_E = 0;
        field_y = "<%0> has entered a game.";
    }
}
