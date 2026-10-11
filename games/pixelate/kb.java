/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kb extends ch implements bp {
    static String field_M;
    static String field_J;
    static ob field_L;
    static int[] field_N;
    static String[] field_I;
    private oa field_K;

    final static void a(int param0, cb param1, vi param2, boolean param3, java.awt.Component param4, int param5) {
        try {
          if (param5 <= 102) {
            java.awt.Component var7 = (java.awt.Component) null;
            kb.a(-5, (cb) null, (vi) null, false, (java.awt.Component) null, -3);
          }
          oh.a(1024, param0, param3, param0, (byte) -110, param4, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "kb.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = -101 % ((-56 - param2) / 62);
          var3 = bc.b(0, param1);
          if (-1 == param0.indexOf(param1) &&
            param0.indexOf(var3) == -1) {
            stackIn_12_0 = (param0.startsWith(param1)) || (param0.startsWith(var3)) || (param0.endsWith(param1)) || (param0.endsWith(var3));
            return stackIn_12_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("kb.M(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    void a(oa param0, int param1) {
        try {
          this.field_K = param0;
          this.field_K.field_g = this;
          if (param1 != 20672) {
            field_M = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "kb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_I = null;
        field_N = null;
        field_J = null;
        field_L = null;
        field_M = null;
        if (param0 != 125) {
          field_L = (ob) null;
        }
    }

    abstract int l(int param0);

    abstract boolean m(int param0);

    public final ml a(int param0) {
        if (param0 != 1) {
          return (ml) null;
        }
        return (ml) ((Object) this.field_K);
    }

    abstract int e(byte param0);

    abstract int c(boolean param0);

    kb(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4);
    }

    static {
        field_N = new int[1024];
        field_M = "Hide players in <%0>'s game";
        field_J = "Start Game";
        field_I = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
