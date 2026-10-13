/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_c;
    static String[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 8) {
          return;
        }
        field_c = null;
    }

    final static void a(mh param0, byte param1, byte[] param2, mh param3, int param4, int param5, mh param6, int param7, int param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          wc.field_e = param9;
          oc.field_p = -1L;
          jg.field_c = param2;
          cq.field_p = param2.length;
          fh.field_d = false;
          rh.field_d = new byte[(wc.field_e + 7) / 8];
          o.field_e = null;
          nl.field_f = null;
          var10_int = 0;
          for (var11 = 0; jg.field_c.length > var11; var11++) {
            var10_int = var10_int + (jg.field_c[var11] & 255);
          }
          var10_int = (7 + var10_int) / 8;
          lj.field_p = new byte[var10_int];
          if (param3.field_bb == null) {
            param3.field_bb = new NodeDeque();
          }
          ua.field_c = param3.field_bb;
          ua.field_c.clear((byte) -60);
          eq.field_m = new mk(param5);
          m.field_h = -1;
          MenuSelection.field_i = 0;
          uf.field_c = 0;
          ko.field_s = -1;
          if (param6.field_bb == null) {
            param6.field_bb = new NodeDeque();
          }
          rq.field_a = param6.field_bb;
          rq.field_a.clear((byte) -48);
          pn.field_i = new mk(param8);
          if (param0.field_bb == null) {
            param0.field_bb = new NodeDeque();
          }
          mp.field_Tb = param0.field_bb;
          mp.field_Tb.clear((byte) -61);
          if (param1 != 86) {
            return;
          }
          BrickABrac.field_F = new mk(param7);
          ic.field_b = 0L;
          cm.field_o = param4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_19_0 = var10;
          stackIn_19_1 = new StringBuilder().append("hm.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static int a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        oe var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var4 = (oe) null;
            hm.a(-91, (oe) null, 44);
          }
          if (param0) {
            stackIn_6_0 = kp.field_b.c(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = ni.field_Wb.c(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static l a(int param0, oe param1, int param2) {
        RuntimeException var3 = null;
        l stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_b = (String[]) null;
          }
          stackIn_3_0 = sk.a((byte) -9, kl.b(param1, 100, param2));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = "Withdraw invitation to <%0> to join this game";
        field_a = "Private";
    }
}
