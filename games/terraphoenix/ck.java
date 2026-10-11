/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends java.awt.Canvas implements java.awt.event.FocusListener {
    static bm field_a;
    static String field_c;
    static int[] field_f;
    volatile boolean field_d;
    java.awt.Frame field_e;
    static int field_b;

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(he param0, int param1) {
        try {
          if (param1 != 4) {
            java.awt.Frame var4 = (java.awt.Frame) null;
            ck.a((he) null, -11, (java.awt.Frame) null);
          }
          ck.a(param0, 103, this.field_e);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ck.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(se param0, int param1) {
        try {
          p.field_a[rd.field_t] = param0;
          rd.field_t = rd.field_t + 1;
          if (param1 != -31661) {
            field_c = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ck.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_d = true;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ck.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Container b(int param0) {
        if (param0 <= 112) {
          java.awt.Frame var2 = (java.awt.Frame) null;
          ck.a((he) null, 73, (java.awt.Frame) null);
          if (null != al.field_W) {
            return (java.awt.Container) ((Object) al.field_W);
          }
          return (java.awt.Container) ((Object) dg.a(false));
        }
        if (null != al.field_W) {
          return (java.awt.Container) ((Object) al.field_W);
        }
        return (java.awt.Container) ((Object) dg.a(false));
    }

    public static void a(int param0) {
        if (param0 == -8917) {
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        }
        field_f = (int[]) null;
        field_a = null;
        field_f = null;
        field_c = null;
    }

    public final void update(java.awt.Graphics param0) {
    }

    ck() {
    }

    final static void a(he param0, int param1, java.awt.Frame param2) {
        mf var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Terraphoenix.field_V;
        try {
          while (true) {
            var3 = param0.a(param2, -121);
            while (var3.field_d == 0) {
              gi.a((byte) -41, 10L);
            }
            if (1 != var3.field_d) {
              gi.a((byte) -78, 100L);
              continue;
            }
            break;
          }
          param2.setVisible(false);
          if (param1 <= 78) {
            field_f = (int[]) null;
          }
          param2.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ck.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_f = new int[]{1, 2, 3, 3, 2, -1, 8, 12, -1, 2, 2, 2, 13, 1, 4, 15};
        field_c = "Log in / Create account";
    }
}
