/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_g;
    static int field_e;
    java.awt.Frame field_i;
    static bd field_h;
    static int[] field_k;
    static bd field_j;
    static bd field_f;
    static ql field_a;
    static int field_d;
    static String field_b;
    static bd field_c;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_g = true;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ue.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param1.equals("S")) {
            stackIn_11_0 = Short.TYPE;
            return stackIn_11_0;
          }
          if (param1.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param1.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param1.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (param0 != 0) {
            field_c = (bd) null;
          }
          if (param1.equals("D")) {
            stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!param1.equals("C")) {
            return Class.forName(param1);
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("ue.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, boolean param1) {
        if (wb.field_R > 0) {
        }
        if (!param1) {
          w.field_r = w.field_r + param0;
          qb.field_k = qb.field_k - param0;
          if (0 >= rf.field_f) {
          }
          return;
        }
        ue.a((byte) -119);
        w.field_r = w.field_r + param0;
        qb.field_k = qb.field_k - param0;
        if (0 >= rf.field_f) {
        }
    }

    ue() {
    }

    final void a(boolean param0, fd param1) {
        try {
          sd.a(param1, -106, this.field_i);
          if (!param0) {
            field_h = (bd) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ue.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_a = null;
        field_j = null;
        if (param0 == -27) {
          field_f = null;
          field_k = null;
          field_b = null;
          return;
        }
        ue.a((byte) 62);
        field_f = null;
        field_k = null;
        field_b = null;
    }

    static {
        field_d = 0;
        field_a = new ql();
        field_b = "FROM ONLY";
    }
}
