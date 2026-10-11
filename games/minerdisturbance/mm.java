/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm implements uj {
    static vm field_a;
    static vf field_b;

    final static boolean b(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        if (param0 < 32) {
          field_b = (vf) null;
        }
        var1_ref = di.field_O;
        synchronized (var1_ref) {
          if (dn.field_w == ll.field_d) {
            return false;
          }
          lj.field_t = jk.field_ib[dn.field_w];
          ud.field_c = hj.field_n[dn.field_w];
          dn.field_w = 127 & 1 + dn.field_w;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    public static void a(int param0) {
        if (param0 != 1) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    public final void a(boolean param0) {
        je.l();
        if (param0) {
          field_a = (vm) null;
        }
    }

    final static void a(boolean param0, wh param1, int param2, int param3, boolean param4, int param5) {
        Object var6 = null;
        Throwable var7 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var6 = mj.field_o;
          synchronized (var6) {
            if (de.field_b == param1) {
              return;
            }
            if (param3 != 1) {
              mm.a(-97);
            }
            de.field_b = param1;
            if (null != de.field_b) {
              km.field_a.a(de.field_b, param4, param0, param5, param2, -22604);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("mm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) (stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final String a(byte param0) {
        int var2 = 104 % ((param0 + 33) / 62);
        return "Print Total Volcano Points";
    }

    static {
    }
}
