/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj implements fc {
    static uf field_a;
    static int field_b;
    static si field_c;

    final static void a(gk param0, int param1, boolean param2, rb param3) {
        try {
          fe.field_i = param1 * mg.f(66) / 1000;
          fd.a(param0, -1);
          ci.a((byte) -116, param0);
          ub.a((byte) -32, param0);
          if (param2) {
            field_a = (uf) null;
          }
          rj.a(255);
          ta.c(0);
          oa.field_a = -fe.field_i + 0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "pj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 18) {
          return true;
        }
        return ij.field_a;
    }

    final static void a(boolean param0, int param1) {
        q.field_N.a(0, 0, -56);
        if (param1 != 1) {
          CharSequence var3 = (CharSequence) null;
          pj.a(true, 'ﾺ', (CharSequence) null);
        }
    }

    public static void a(int param0) {
        if (param0 != -4) {
          pj.a(-34);
        }
        field_c = null;
        field_a = null;
    }

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        tg var8 = null;
        int var9 = 0;
        try {
          var6_int = param4 + param1.field_r;
          var7 = param0 + param1.field_i;
          dh.a(var7, 1232050056, param1.field_k, var6_int, param1.field_m);
          var8 = la.field_E[1];
          if (param1 instanceof wd &&
            ((wd) (param1)).field_z) {
            var8.a((-var8.field_t + param1.field_k >> 1) + (1 + var6_int), var7 + 1 + (param1.field_m - var8.field_o >> 1), 256);
          }
          if (param1.e(1)) {
            ck.a(2 + var6_int, param1.field_m - 4, -4 + param1.field_k, 2 + var7, 14677);
          }
          var9 = 51 % ((param2 + 60) / 56);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("pj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(boolean param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          var3_int = 0;
          var4 = param2.length();
          if (param0) {
            pj.a((byte) -103);
          }
          for (var5 = 0; var5 < var4; var5++) {
            if (param2.charAt(var5) == param1) {
              var3_int++;
            }
          }
          stackIn_9_0 = var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pj.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_b = 20;
    }
}
