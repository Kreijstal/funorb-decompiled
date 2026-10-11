/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static int field_a;
    static rb field_b;

    final static void a(boolean param0, ll param1, boolean param2, int param3, int param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        java.awt.Component var8 = null;
        try {
          vj.field_t[0] = p.field_b.nextInt();
          vj.field_t[1] = p.field_b.nextInt();
          vj.field_t[3] = (int)dh.field_b;
          dh.field_e.field_j = 0;
          if (param3 != -27886) {
            var8 = (java.awt.Component) null;
            rk.a((byte) 84, (java.awt.Component) null);
          }
          vj.field_t[2] = (int)(dh.field_b >> 32);
          dh.field_e.h(-115, vj.field_t[0]);
          dh.field_e.h(30, vj.field_t[1]);
          dh.field_e.h(85, vj.field_t[2]);
          dh.field_e.h(80, vj.field_t[3]);
          cc.a(dh.field_e, 10);
          dh.field_e.a(param4, (byte) 105);
          param1.a(false, dh.field_e);
          dp.field_e.field_j = 0;
          if (!param2) {
            dp.field_e.i(16, -122);
          } else {
            dp.field_e.i(18, 110);
          }
          dp.field_e.field_j = dp.field_e.field_j + 2;
          var5_int = dp.field_e.field_j;
          dp.field_e.h(-108, h.field_b);
          dp.field_e.a(lg.field_u, -80);
          var6 = 0;
          if (ih.field_S) {
            var6 = var6 | 1;
          }
          if (ni.field_a) {
            var6 = var6 | 4;
          }
          if (param0) {
            var6 = var6 | 8;
          }
          if (ia.field_b != null) {
            var6 = var6 | 16;
          }
          dp.field_e.i(var6, param3 + 27799);
          var7 = ff.a(hc.a(0), (byte) 42);
          if (var7 == null) {
            var7 = "";
          }
          dp.field_e.a(param3 ^ -27758, var7);
          if (ia.field_b != null) {
            dp.field_e.a((byte) -88, ia.field_b);
          }
          ab.a(dh.field_e, pm.field_c, (byte) -105, dp.field_e, pj.field_p);
          dp.field_e.g(57, -var5_int + dp.field_e.field_j);
          vl.a((byte) -46, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("rk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 16) {
          java.awt.Component var2 = (java.awt.Component) null;
          rk.a((byte) -88, (java.awt.Component) null);
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
          if (param0 >= -13) {
            java.awt.Component var3 = (java.awt.Component) null;
            rk.a((byte) -12, (java.awt.Component) null);
          }
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener(ea.field_c);
          param1.addFocusListener(ea.field_c);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "rk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 0;
    }
}
