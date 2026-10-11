/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends com.ms.dll.Callback {
    private volatile int field_b;
    private volatile boolean field_d;
    private boolean field_c;
    private volatile int field_a;
    private int field_e;

    final void a(int param0, int param1, int param2) {
        if (param0 != 0) {
          this.field_a = -126;
          com.ms.win32.User32.SetCursorPos(param1, param2);
          return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    final void a(boolean param0, int param1, java.awt.Component param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_18_1 = false;
        boolean stackIn_31_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        if (param1 > -34) {
          return;
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_a) {
          stackIn_6_0 = (param0) ? 0 : 1;
          stackIn_9_1 = (this.field_d) ? 0 : 1;
          if (stackIn_6_0 == stackIn_9_1) {
            return;
          }
        }
        if (!this.field_c) {
          this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (var5 == this.field_a) {
          stackIn_18_1 = (param0);
          this.field_d = stackIn_18_1;
        } else {
          if (0 != this.field_a) {
            this.field_d = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_b);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_a = var5;
            this.field_b = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
          }
          stackIn_31_1 = (param0);
          this.field_d = stackIn_31_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
        return;
    }

    qj() {
        this.field_d = true;
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (this.field_a != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 == 101024) {
            com.ms.win32.User32.SetCursor(this.field_d ? this.field_e : 0);
            return 0;
          }
          if (param1 == 1) {
            this.field_a = 0;
            this.field_d = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
        }
        var5Lifetime1 = 65535 & param3;
        if (var5Lifetime1 == 1) {
          com.ms.win32.User32.SetCursor(this.field_d ? this.field_e : 0);
          return 0;
        }
        if (param1 == 101024) {
          com.ms.win32.User32.SetCursor(this.field_d ? this.field_e : 0);
          return 0;
        }
        if (param1 == 1) {
          this.field_a = 0;
          this.field_d = true;
        }
        return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
    }
}
