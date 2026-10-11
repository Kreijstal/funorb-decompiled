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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 84) {
            field_B = (String) null;
          }
          stackIn_3_0 = new li(mi.a(true));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ir.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (eq.a(false)) {
          param0 = false;
        }
        if (param1 != 16355) {
          ir.a(false, 111);
          ti.a(63, param0);
          if (gs.field_b) {
            on.g(ni.field_l.field_b.field_s, ni.field_l.field_b.field_J, ni.field_l.field_b.field_q, ni.field_l.field_b.field_mb);
            ni.field_l.field_b.a(122, param0);
            gp.a(param0, (byte) -93);
            return;
          }
          gp.a(param0, (byte) -93);
          return;
        }
        ti.a(63, param0);
        if (!gs.field_b) {
          gp.a(param0, (byte) -93);
          return;
        }
        on.g(ni.field_l.field_b.field_s, ni.field_l.field_b.field_J, ni.field_l.field_b.field_q, ni.field_l.field_b.field_mb);
        ni.field_l.field_b.a(122, param0);
        gp.a(param0, (byte) -93);
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
        } else {
          if (null == vg.field_Bb) {
            vg.field_Bb = new gq();
            rq.field_D = new dp(vg.field_Bb);
            pi.field_b.a(rq.field_D);
            qd.field_c = new tf();
          } else {
            if (null == qd.field_c) {
              vg.field_Bb = new gq();
              rq.field_D = new dp(vg.field_Bb);
              pi.field_b.a(rq.field_D);
              qd.field_c = new tf();
            }
          }
        }
        rq.field_D.a(param5);
        rq.field_D.f(param4);
        rq.field_D.c(param0);
        if (param1 > -10) {
          field_A = (int[]) null;
        }
        rq.field_D.b(param6);
        rq.field_D.e(param3);
        rq.field_D.d(param2);
    }

    static {
        field_B = "create new auction";
        field_C = "Change display name";
        field_A = new int[8192];
    }
}
