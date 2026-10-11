/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static wb field_c;
    static int field_a;
    static int field_b;

    final static void a(aa param0, byte param1) {
        String stackIn_2_0 = null;
        long stackIn_2_1 = 0L;
        String stackIn_2_2 = null;
        int stackIn_3_3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wi var5 = null;
        String var6 = null;
        wi var7 = null;
        String var8 = null;
        wi var9 = null;
        String var10 = null;
        wi var11 = null;
        String var12 = null;
        wi var13 = null;
        try {
          stackIn_2_0 = param0.field_m;
          stackIn_2_1 = param0.field_k;
          stackIn_2_2 = param0.field_n;
          if (1 != param0.field_j) {
            stackIn_3_3 = 0;
          } else {
            stackIn_3_3 = param0.field_b;
          }
          em.a(stackIn_2_0, stackIn_2_1, stackIn_2_2, stackIn_3_3, param0.field_q, -163, (gp) null, (int[]) null, param0.field_j);
          if (0 == param0.field_j &&
            !pk.b(121) &&
            io.field_c == null &&
            bn.field_S == null) {
            if (!lh.field_g) {
              var5 = eg.field_n;
              var6 = kc.field_s;
              var5.field_b.a(var6, (byte) -33, 14);
            }
            var7 = eg.field_n;
            var8 = nn.field_h;
            var7.field_b.a(var8, (byte) -128, 20);
          }
          if (param0.field_j == 1 &&
            !pk.b(120) &&
            io.field_c != null &&
            param0.field_b == io.field_c.c((byte) 8)) {
            if (!lh.field_g) {
              var9 = eg.field_n;
              var10 = ee.field_c;
              var9.field_b.a(var10, (byte) -60, 14);
            }
            var11 = eg.field_n;
            var12 = od.field_Eb;
            var11.field_b.a(var12, (byte) -73, 20);
          }
          eg.field_n.c(-24);
          eg.field_n.b(false, (byte) -98);
          eg.field_n.a(param0.field_j, param0.field_l, -3);
          eg.field_n.b(8893);
          if (param1 <= 96) {
            field_a = -88;
          }
          eg.field_n.a((byte) 99, param0);
          var13 = eg.field_n;
          var3 = uo.field_a;
          var4 = ji.field_c;
          var13.field_b.b(0, var3, 88, var4, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("fj.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var5 = -63 % ((param2 - 41) / 63);
            var4 = param3.getGraphics();
            qa.field_f.a(var4, false, param0, param1);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_6_0 = var4_ref2;
          stackIn_6_1 = new StringBuilder().append("fj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (!param0) {
          ui.field_a = param1 * 400 / 150;
          ui.field_j = (param1 << 16) / 150;
          ui.field_k = param1 * 100 / 150;
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 < 112) {
          aa var2 = (aa) null;
          fj.a((aa) null, (byte) -67);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_c = new wb();
    }
}
