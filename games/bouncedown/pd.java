/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static jf[] field_a;
    static String field_b;

    final static void a(int param0) {
        String var1 = null;
        if (!fe.field_g) {
          throw new IllegalStateException();
        }
        if (null != nk.field_a) {
          nk.field_a.a(true);
        }
        if (param0 == 11173) {
          var1 = fd.c((byte) 61);
          vk.field_c = new ci(var1, (String) null, true, false, false);
          q.field_N.b(ed.field_c, false);
          ed.field_c.a(param0 ^ 437, vk.field_c);
          ed.field_c.i((byte) -85);
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        qh.field_e = aj.field_e[param1];
        if (param0) {
          pc.field_p = hc.field_d[param1];
          ii.field_l = nl.field_b[param1];
          return;
        }
        field_a = (jf[]) null;
        pc.field_p = hc.field_d[param1];
        ii.field_l = nl.field_b[param1];
    }

    final static rg a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_9_0 = null;
        rg stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vc.field_F == qg.field_g) {
            return null;
          }
          if (param0 != 1059) {
            field_b = (String) null;
          }
          if (he.field_p == vc.field_F &&
            param1.equals(t.field_t)) {
            vc.field_F = wj.field_a;
            stackIn_11_0 = oa.field_c;
            return stackIn_11_0;
          }
          vc.field_F = qg.field_g;
          oa.field_c = null;
          t.field_t = param1;
          stackIn_9_0 = null;
          return (rg) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("pd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = -102 / ((param0 + 62) / 48);
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Mouse over an icon for details";
    }
}
