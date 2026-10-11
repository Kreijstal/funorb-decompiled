/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ml {
    static String field_p;
    static bi field_o;
    static boolean field_n;
    static String field_q;

    final String a(boolean param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(-11196, param1) == tj.field_b) {
            stackIn_2_0 = ig.field_b;
            return stackIn_2_0;
          }
          if (param0) {
            var4 = (String) null;
            this.a(true, (String) null);
          }
          stackIn_6_0 = dn.field_g;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mm.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_p = null;
        field_q = null;
        field_o = null;
        if (param0 >= -67) {
          field_p = (String) null;
        }
    }

    mm(go param0) {
        super(param0);
    }

    final static void f(int param0) {
        if (ji.field_G != null) {
          ji.field_G.i((byte) -104);
        }
        sj.field_b = new ir();
        if (param0 == -26049) {
          ae.field_f.b(sj.field_b, -54);
          return;
        }
        field_o = (bi) null;
        ae.field_f.b(sj.field_b, -54);
    }

    final static void d(int param0) {
        if (param0 == -16705) {
          bq.field_h = new dg(ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w);
          return;
        }
        field_n = false;
        bq.field_h = new dg(ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w);
    }

    final u b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        u stackIn_5_0 = null;
        u stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (vn.a(64, param1) != null) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param0 != -11196) {
            stackIn_5_0 = (u) null;
            return stackIn_5_0;
          }
          if (var3_int != 0) {
            return p.field_g;
          }
          stackIn_9_0 = tj.field_b;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("mm.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_q = "Project is complete. Click to place.";
        field_p = "Invite only";
    }
}
