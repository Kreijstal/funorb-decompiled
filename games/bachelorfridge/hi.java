/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static lda field_a;

    final static void a(int param0) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = BachelorFridge.field_y;
        try {
          var1 = vv.field_e;
          synchronized (var1) {
            ce.field_x = ce.field_x + 1;
            gha.field_q = jaa.field_s;
            if (param0 < 82) {
              return;
            }
            if (0 > gfa.field_c) {
              var5 = 0;
              var2 = var5;
              while (var5 < 112) {
                wga.field_q[var5] = false;
                var5++;
              }
              gfa.field_c = cj.field_i;
            } else {
              while (cj.field_i != gfa.field_c) {
                var2 = wd.field_x[cj.field_i];
                cj.field_i = 1 + cj.field_i & 127;
                if (var2 < 0) {
                  wga.field_q[~var2] = false;
                  continue;
                }
                wga.field_q[var2] = true;
              }
            }
            jaa.field_s = lma.field_x;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "hi.A(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int[] param1) {
        int var4 = 0;
        int var2_int = 0;
        int var3 = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = BachelorFridge.field_y;
        try {
          var2_int = param1.length;
          ik.field_d = new int[2 + var2_int];
          ik.field_d[0] = 50;
          var3 = 590;
          ik.field_d[1 + var2_int] = var3;
          if (!param0) {
            field_a = (lda) null;
          }
          for (var4 = var2_int; 0 < var4; var4--) {
            var3 = var3 - param1[var4 - 1];
            ik.field_d[var4] = var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("hi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 17) {
          hi.a((byte) -70);
        }
    }

    static {
    }
}
