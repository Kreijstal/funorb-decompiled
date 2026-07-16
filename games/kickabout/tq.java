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
        if (param0 != -47) {
          ut[] discarded$2 = tq.a(83, false, -82, 24, true, (byte) 68);
          eq.a(0);
          qn.a(param0 + -24776, il.field_d[0].field_o, el.field_I, eb.field_b, sh.field_c, oe.field_f);
          return;
        } else {
          eq.a(0);
          qn.a(param0 + -24776, il.field_d[0].field_o, el.field_I, eb.field_b, sh.field_c, oe.field_f);
          return;
        }
    }

    final static ut[] a(int param0, boolean param1, int param2, int param3, boolean param4, byte param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ut var9 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        int[] var15 = null;
        int[] var16 = null;
        ut var17 = null;
        ut var18 = null;
        int[] var19 = null;
        ut var20 = null;
        ut var21 = null;
        int[] var22 = null;
        var22 = on.field_a;
        var19 = var22;
        var16 = var19;
        var15 = var16;
        var12 = var15;
        var6 = var12;
        var7 = on.field_g;
        var8 = on.field_f;
        var9 = new ut(16, param0);
        var9.e();
        if (param5 != -46) {
          L0: {
            field_E = null;
            on.g(0, 0, 16, param0, param2, param3);
            var10 = null;
            var11 = null;
            if (param4) {
              var17 = var9.b();
              var10 = (Object) (Object) var17;
              var17.e();
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
              var18 = var9.b();
              var11 = (Object) (Object) var18;
              var18.e();
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
          on.a(var22, var7, var8);
          return new ut[]{null, null, null, (ut) var10, var9, (ut) var11, null, null, null};
        } else {
          L2: {
            on.g(0, 0, 16, param0, param2, param3);
            var10 = null;
            var11 = null;
            if (param4) {
              var20 = var9.b();
              var10 = (Object) (Object) var20;
              var20.e();
              on.f(0, 0, 5, 0);
              on.f(0, 1, 3, 0);
              on.f(0, 2, 2, 0);
              on.f(0, 3, 1, 0);
              on.f(0, 4, 1, 0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param1) {
              var21 = var9.b();
              var11 = (Object) (Object) var21;
              var21.e();
              on.f(11, 0, 5, 0);
              on.f(13, 1, 3, 0);
              on.f(14, 2, 2, 0);
              on.f(15, 3, 1, 0);
              on.f(15, 4, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          on.a(var22, var7, var8);
          return new ut[]{null, null, null, (ut) var10, var9, (ut) var11, null, null, null};
        }
    }

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
          int discarded$2 = tq.h(5);
          return new li(ha.a(param1[0].c(param0 + -84), (byte) -48));
        } else {
          return new li(ha.a(param1[0].c(param0 + -84), (byte) -48));
        }
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
        field_B = new char[]{(char)91, (char)93, (char)35};
        field_D = "This password contains repeated characters, and would be easy to guess";
    }
}
