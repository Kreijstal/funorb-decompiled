/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static boolean[] field_b;
    int field_a;
    static hd[] field_c;
    static String field_d;
    va field_e;
    static cn field_f;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 == 30) {
          field_c = null;
          field_f = null;
          return;
        }
        cf.a(45);
        field_c = null;
        field_f = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4;
        nl.field_g.h(param1, param3);
        if (param2 < 125) {
          return;
        }
        if (!param0) {
          return;
        }
        var4 = jc.field_e % nl.field_g.field_y * 2;
        if (var4 >= nl.field_g.field_y) {
          var4 = nl.field_g.field_y - (var4 - nl.field_g.field_y);
        }
        if (10 <= var4) {
          if (nl.field_g.field_y - 40 < var4) {
            var4 = -40 + nl.field_g.field_y;
          }
        } else {
          var4 = 10;
        }
        rk.a(30, 80, var4, 0, param3, param1, 0, 116, nl.field_g);
    }

    cf(va param0, int param1) {
        try {
          this.field_a = param1;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static fa a(int param0, va param1, int param2) {
        RuntimeException var3 = null;
        fa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 100) {
            field_c = (hd[]) null;
          }
          stackIn_3_0 = l.a(ni.b(param1, 100, param2), 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = new boolean[]{true, true, true, true, false, false};
        field_d = "3D VIEW: ";
    }
}
