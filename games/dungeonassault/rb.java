/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ck {
    static String[] field_J;
    static String field_M;
    static int field_N;
    static en field_O;
    static int field_L;
    static String field_K;
    static String field_I;

    rb(String param0, pg param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_E = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int[] b(int param0, int param1, int param2) {
        int var4 = 0;
        int[] var5 = new int[param2];
        int[] var3 = var5;
        for (var4 = 0; var4 < 64; var4++) {
          var5[var4] = hj.a((byte) 101, param0, var4 << 2, param1);
        }
        return var5;
    }

    final static cn a(int param0, cn param1, int param2, byte param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        cn var7 = null;
        cn stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        var6 = DungeonAssault.field_K;
        try {
          var7 = new cn(param1.field_y + param0 * 2, param1.field_v + param0 * 2);
          jh.a(var7);
          for (var5 = 0; var5 < param0; var5++) {
            param1.e(-param1.field_w + param0, param0 - param1.field_A, param2);
            gf.d(1, 1, 0, 0, var7.field_y, var7.field_v);
          }
          param1.e(param0 - param1.field_w, -param1.field_A + param0, 0);
          jh.b();
          var7.field_A = param1.field_A - param0;
          var7.field_w = param1.field_w - param0;
          var5Lifetime1 = 64 / ((34 - param3) / 42);
          stackIn_5_0 = var7;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("rb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_O = null;
        if (param0 != 4935) {
          rb.a(39);
        }
        field_I = null;
        field_J = null;
        field_M = null;
        field_K = null;
    }

    final static int a(byte param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 91) {
            var4 = (String) null;
            rb.$cfr$intArgs$a$62abead39cee(-6, true, (String) null);
          }
          if (param1) {
            stackIn_6_0 = mp.field_a.b(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = hc.field_e.b(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("rb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private rb(String param0, pg param1) {
        this(param0, hl.field_a.field_o, param1);
        try {
          this.field_o = hl.field_a.field_q;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private rb(String param0, ca param1, pg param2) {
        super(param0, param1, param2);
        try {
          this.field_o = hl.field_a.field_q;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_E = !this.field_E ? true : false;
        super.b(param0, param1, param2, param3);
    }

    static {
        field_J = new String[]{"Rank", "Name", "Renown", "Last Raided"};
        field_N = -1;
        field_K = "The attack of this monster is lethal.";
        field_L = 0;
        field_I = "<col=8B1717>Disarm</col>";
        field_M = "Defences: ";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$62abead39cee(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 91) {
            var4 = (String) null;
            rb.$cfr$intArgs$a$62abead39cee(-6, true, (String) null);
          }
          if (param1) {
            stackIn_6_0 = mp.field_a.b(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = hc.field_e.b(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("rb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }
}
