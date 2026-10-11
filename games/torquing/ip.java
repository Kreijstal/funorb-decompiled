/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip {
    static hh field_b;
    static k field_a;
    static String field_c;
    static String field_d;

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        nj var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -28) {
            var3 = (nj) null;
            ip.a(false, (nj) null);
          }
          stackIn_3_0 = ij.a(true, 10, param1, -98);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ip.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static nh a(int param0, int param1) {
        int var2 = -59 / ((-69 - param1) / 43);
        nh var3 = new nh();
        to.field_q.a((byte) 54, var3);
        hj.a(false, param0);
        return var3;
    }

    public static void b(int param0) {
        int var1 = -39 % ((param0 - 6) / 32);
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static java.applet.Applet a(int param0) {
        if (wj.field_g != null) {
          return wj.field_g;
        }
        if (param0 != 9) {
          field_a = (k) null;
          return (java.applet.Applet) ((Object) vk.field_B);
        }
        return (java.applet.Applet) ((Object) vk.field_B);
    }

    final static void a(boolean param0, nj param1) {
        mc var2 = null;
        nj var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = Torquing.field_u;
        try {
          var2 = (mc) (uj.field_a.b(0));
          while (var2 != null) {
            var3 = var2.field_j;
            if (var3.e()) {
              var2.f(0);
            } else {
              if (var3.field_m == param1.field_m &&
                var3.k() == param1.k() &&
                var3.g() * 9 < param1.g() * 10 &&
                param1.g() * 9 < var3.g() * 10) {
                return;
              }
            }
            var2 = (mc) (uj.field_a.f(-24059));
          }
          uj.field_a.a((byte) 54, new mc(param1));
          ni.a(param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("ip.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static sm[] a(la param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        sm[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(-1, param2);
          var5 = param0.a(param3, -101, var4_int);
          if (param1 >= -105) {
            field_a = (k) null;
          }
          stackIn_3_0 = fq.a(param0, -25960, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ip.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_b = new hh();
        field_a = new k(14, 0, 4, 1);
        field_d = "Retry";
    }
}
