/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int field_a;
    static pb field_b;

    final static jd a(int param0) {
        int var1 = 63 / ((-10 - param0) / 63);
        if (ml.field_e != null) {
          return ml.field_e;
        }
        ml.field_e = new jd(qj.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, qj.field_d.field_s, -1, 2147483647, true);
        return ml.field_e;
    }

    public static void b(int param0) {
        if (param0 != 1567641170) {
          return;
        }
        field_b = null;
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Bounce.field_N;
        try {
          var3 = ih.a(param2, param1, false);
          var4 = 68 / ((-7 - param0) / 57);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          var5 = 0;
          while (true) {
            if (param1.length() <= var5) {
              return null;
            }
            if (uc.a(2, param1.charAt(var5))) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_9_0 = wb.field_d;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("vd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, wi param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          if (param0 <= 35) {
            field_a = 33;
          }
          de.field_b = param1.a(-1640531527) << 5;
          var2_int = param1.d((byte) -104);
          kf.field_a = (7 & var2_int) << 18;
          de.field_b = de.field_b + (var2_int >> 3);
          kf.field_a = kf.field_a + (param1.a(-1640531527) << 2);
          var2_intLifetime1 = param1.d((byte) -119);
          ed.field_b = (63 & var2_intLifetime1) << 15;
          kf.field_a = kf.field_a + (var2_intLifetime1 >> 6);
          ed.field_b = ed.field_b + (param1.d((byte) -119) << 7);
          var2_intLifetime2 = param1.d((byte) -119);
          qe.field_i = (1 & var2_intLifetime2) << 16;
          ed.field_b = ed.field_b + (var2_intLifetime2 >> 1);
          qe.field_i = qe.field_i + param1.a(-1640531527);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "vd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 6;
        field_b = null;
    }
}
