/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir extends tm {
    static int field_D;
    static String field_B;
    static String field_C;
    static int[] field_A;

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
                field_B = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = new li(mi.a(true));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ir.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1) {
        L0: {
          if (eq.a(false)) {
            param0 = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 16355) {
          ti.a(63, param0);
          if (gs.field_b) {
            on.g(ni.field_l.field_b.field_s, ni.field_l.field_b.field_J, ni.field_l.field_b.field_q, ni.field_l.field_b.field_mb);
            ni.field_l.field_b.a(122, param0);
            gp.a(param0, (byte) -93);
            return;
          } else {
            gp.a(param0, (byte) -93);
            return;
          }
        } else {
          ir.a(false, 111);
          ti.a(63, param0);
          if (!gs.field_b) {
            gp.a(param0, (byte) -93);
            return;
          } else {
            on.g(ni.field_l.field_b.field_s, ni.field_l.field_b.field_J, ni.field_l.field_b.field_q, ni.field_l.field_b.field_mb);
            ni.field_l.field_b.a(122, param0);
            gp.a(param0, (byte) -93);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_A = null;
        field_C = null;
        field_B = null;
        if (param0) {
            ir.a(false, -68);
        }
    }

    ir(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(float param0, int param1, float param2, float param3, float param4, float param5, float param6) {
        if (rq.field_D == null) {
          vg.field_Bb = new gq();
          rq.field_D = new dp(vg.field_Bb);
          pi.field_b.a(rq.field_D);
          qd.field_c = new tf();
          rq.field_D.a(param5);
          rq.field_D.f(param4);
          rq.field_D.c(param0);
          if (param1 <= -10) {
            rq.field_D.b(param6);
            rq.field_D.e(param3);
            rq.field_D.d(param2);
            return;
          } else {
            field_A = (int[]) null;
            rq.field_D.b(param6);
            rq.field_D.e(param3);
            rq.field_D.d(param2);
            return;
          }
        } else {
          if (null == vg.field_Bb) {
            vg.field_Bb = new gq();
            rq.field_D = new dp(vg.field_Bb);
            pi.field_b.a(rq.field_D);
            qd.field_c = new tf();
            rq.field_D.a(param5);
            rq.field_D.f(param4);
            rq.field_D.c(param0);
            if (param1 <= -10) {
              rq.field_D.b(param6);
              rq.field_D.e(param3);
              rq.field_D.d(param2);
              return;
            } else {
              field_A = (int[]) null;
              rq.field_D.b(param6);
              rq.field_D.e(param3);
              rq.field_D.d(param2);
              return;
            }
          } else {
            if (null == qd.field_c) {
              vg.field_Bb = new gq();
              rq.field_D = new dp(vg.field_Bb);
              pi.field_b.a(rq.field_D);
              qd.field_c = new tf();
              rq.field_D.a(param5);
              rq.field_D.f(param4);
              rq.field_D.c(param0);
              if (param1 <= -10) {
                rq.field_D.b(param6);
                rq.field_D.e(param3);
                rq.field_D.d(param2);
                return;
              } else {
                field_A = (int[]) null;
                rq.field_D.b(param6);
                rq.field_D.e(param3);
                rq.field_D.d(param2);
                return;
              }
            } else {
              rq.field_D.a(param5);
              rq.field_D.f(param4);
              rq.field_D.c(param0);
              if (param1 <= -10) {
                rq.field_D.b(param6);
                rq.field_D.e(param3);
                rq.field_D.d(param2);
                return;
              } else {
                field_A = (int[]) null;
                rq.field_D.b(param6);
                rq.field_D.e(param3);
                rq.field_D.d(param2);
                return;
              }
            }
          }
        }
    }

    static {
        field_B = "create new auction";
        field_C = "Change display name";
        field_A = new int[8192];
    }
}
