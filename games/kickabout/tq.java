/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends tm {
    static nu field_F;
    static String field_E;
    static String field_C;
    static String field_D;
    static char[] field_B;

    final static void g(byte param0) {
        if (param0 == -47) {
          eq.a(0);
          qn.a(param0 - 24776, il.field_d[0].field_o, el.field_I, eb.field_b, sh.field_c, oe.field_f);
          return;
        }
        tq.a(83, false, -82, 24, true, (byte) 68);
        eq.a(0);
        qn.a(param0 - 24776, il.field_d[0].field_o, el.field_I, eb.field_b, sh.field_c, oe.field_f);
    }

    final static ut[] a(int param0, boolean param1, int param2, int param3, boolean param4, byte param5) {
        ut var19 = null;
        ut var20 = null;
        ut var17 = null;
        ut var18 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var16 = on.field_a;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = on.field_g;
        int var8 = on.field_f;
        ut var9 = new ut(16, param0);
        var9.e();
        if (param5 == -46) {
          on.g(0, 0, 16, param0, param2, param3);
          var10 = null;
          var11 = null;
          if (param4) {
            var19 = var9.b();
            var10 = var19;
            var19.e();
            on.f(0, 0, 5, 0);
            on.f(0, 1, 3, 0);
            on.f(0, 2, 2, 0);
            on.f(0, 3, 1, 0);
            on.f(0, 4, 1, 0);
          }
          if (param1) {
            var20 = var9.b();
            var11 = var20;
            var20.e();
            on.f(11, 0, 5, 0);
            on.f(13, 1, 3, 0);
            on.f(14, 2, 2, 0);
            on.f(15, 3, 1, 0);
            on.f(15, 4, 1, 0);
          }
          on.a(var16, var7, var8);
          return new ut[]{null, null, null, (ut) (var10), var9, (ut) (var11), null, null, null};
        }
        field_E = (String) null;
        on.g(0, 0, 16, param0, param2, param3);
        var10 = null;
        var11 = null;
        if (param4) {
          var17 = var9.b();
          var10 = var17;
          var17.e();
          on.f(0, 0, 5, 0);
          on.f(0, 1, 3, 0);
          on.f(0, 2, 2, 0);
          on.f(0, 3, 1, 0);
          on.f(0, 4, 1, 0);
        }
        if (param1) {
          var18 = var9.b();
          var11 = var18;
          var18.e();
          on.f(11, 0, 5, 0);
          on.f(13, 1, 3, 0);
          on.f(14, 2, 2, 0);
          on.f(15, 3, 1, 0);
          on.f(15, 4, 1, 0);
        }
        on.a(var16, var7, var8);
        return new ut[]{null, null, null, (ut) (var10), var9, (ut) (var11), null, null, null};
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 84) {
            tq.h(5);
          }
          stackIn_3_0 = new li(ha.a(param1[0].c(param0 - 84), (byte) -48));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    tq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int h(int param0) {
        if (param0 != -2521) {
          field_C = (String) null;
          return (int)hd.field_K;
        }
        return (int)hd.field_K;
    }

    public static void g(int param0) {
        if (param0 > 12) {
          field_B = null;
          field_D = null;
          field_C = null;
          field_E = null;
          field_F = null;
          return;
        }
        tq.$cfr$intArgs$a$7ffe4b125357(12, false);
        field_B = null;
        field_D = null;
        field_C = null;
        field_E = null;
        field_F = null;
    }

    final static void a(byte param0, boolean param1) {
        cl.field_d = param1 ? true : false;
        if (param0 != 50) {
          tq.g(-123);
        }
    }

    static {
        field_E = "Click 'My Results' to view these rewards.";
        field_C = "achievements";
        field_B = new char[]{(char)91, (char)93, (char)35};
        field_D = "This password contains repeated characters, and would be easy to guess";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$7ffe4b125357(int param0, boolean param1) {
        cl.field_d = param1 ? true : false;
        if (param0 != 50) {
          tq.g(-123);
        }
    }
}
