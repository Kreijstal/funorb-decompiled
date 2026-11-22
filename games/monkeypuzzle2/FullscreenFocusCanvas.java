/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFocusCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    static int[] field_a;
    java.awt.Frame fullscreenFrame;
    static String field_f;
    static int field_e;
    static String field_b;
    volatile boolean focusLost;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void exitFullscreen(byte param0, PlatformTaskDispatcher param1) {
        if (param0 != -107) {
          return;
        }
        try {
          rk.exitFullscreenFrame(param1, this.fullscreenFrame, false);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "r.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.focusLost = true;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "r.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        param1 = param1 & 8191;
        if (param0 == 71) {
          if (param1 >= 4096) {
            if (6144 > param1) {
              stackIn_19_0 = -tj.field_b[6144 - param1];
            } else {
              stackIn_19_0 = tj.field_b[-6144 + param1];
            }
            return stackIn_19_0;
          }
          if (2048 > param1) {
            stackIn_15_0 = tj.field_b[2048 - param1];
          } else {
            stackIn_15_0 = -tj.field_b[param1 - 2048];
          }
          return stackIn_15_0;
        }
        FullscreenFocusCanvas.a((byte) -100, 80);
        if (param1 >= 4096) {
          if (6144 > param1) {
            stackIn_9_0 = -tj.field_b[6144 - param1];
          } else {
            stackIn_9_0 = tj.field_b[-6144 + param1];
          }
          return stackIn_9_0;
        }
        if (2048 > param1) {
          stackIn_5_0 = tj.field_b[2048 - param1];
        } else {
          stackIn_5_0 = -tj.field_b[param1 - 2048];
        }
        return stackIn_5_0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = -44 / ((param0 + 23) / 59);
        field_f = null;
    }

    FullscreenFocusCanvas() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        field_f = "The account name you use to access RuneScape and other Jagex.com games";
        field_b = "Invalid password.";
    }
}
