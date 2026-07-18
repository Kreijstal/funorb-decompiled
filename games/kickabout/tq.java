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
        eq.a(0);
        qn.a(-24823, il.field_d[0].field_o, el.field_I, eb.field_b, sh.field_c, oe.field_f);
    }

    final static ut[] a(int param0, boolean param1, int param2, int param3, boolean param4, byte param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ut var9 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        ut var13 = null;
        ut var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = on.field_a;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = on.field_g;
          var8 = on.field_f;
          var9 = new ut(16, param0);
          var9.e();
          on.g(0, 0, 16, param0, param2, param3);
          var10 = null;
          var11 = null;
          if (param4) {
            var13 = var9.b();
            var10 = (Object) (Object) var13;
            var13.e();
            on.f(0, 0, 5, 0);
            on.f(0, 1, 3, 0);
            on.f(0, 2, 2, 0);
            on.f(0, 3, 1, 0);
            on.f(0, 4, 1, 0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1) {
            var14 = var9.b();
            var11 = (Object) (Object) var14;
            var14.e();
            on.f(11, 0, 5, 0);
            on.f(13, 1, 3, 0);
            on.f(14, 2, 2, 0);
            on.f(15, 3, 1, 0);
            on.f(15, 4, 1, 0);
            break L1;
          } else {
            break L1;
          }
        }
        on.a(var18, var7, var8);
        return new ut[]{null, null, null, (ut) var10, var9, (ut) var11, null, null, null};
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        li stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 84) {
                break L1;
              } else {
                int discarded$2 = tq.h(5);
                break L1;
              }
            }
            stackOut_2_0 = new li(ha.a(param1[0].c(param0 + -84), (byte) -48));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("tq.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    tq(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int h(int param0) {
        if (param0 != -2521) {
            field_C = null;
            return (int)hd.field_K;
        }
        return (int)hd.field_K;
    }

    public static void g(int param0) {
        if (param0 <= 12) {
          tq.a((byte) 12, false);
          field_B = null;
          field_D = null;
          field_C = null;
          field_E = null;
          field_F = null;
          return;
        } else {
          field_B = null;
          field_D = null;
          field_C = null;
          field_E = null;
          field_F = null;
          return;
        }
    }

    final static void a(byte param0, boolean param1) {
        cl.field_d = param1 ? true : false;
        if (param0 != 50) {
            tq.g(-123);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Click 'My Results' to view these rewards.";
        field_C = "achievements";
        field_B = new char[]{'[', ']', '#'};
        field_D = "This password contains repeated characters, and would be easy to guess";
    }
}
