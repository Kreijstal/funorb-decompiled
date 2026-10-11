/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends com.ms.dll.Callback {
    private volatile int field_e;
    private volatile boolean field_c;
    private int field_d;
    private volatile int field_b;
    private boolean field_a;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (this.field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 == 101024) {
            com.ms.win32.User32.SetCursor(this.field_c ? this.field_d : 0);
            return 0;
          }
          if (param1 == 1) {
            this.field_b = 0;
            this.field_c = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
        }
        var5Lifetime1 = 65535 & param3;
        if (1 == var5Lifetime1) {
          com.ms.win32.User32.SetCursor(!this.field_c ? 0 : this.field_d);
          return 0;
        }
        if (param1 == 101024) {
          com.ms.win32.User32.SetCursor(this.field_c ? this.field_d : 0);
          return 0;
        }
        if (param1 == 1) {
          this.field_b = 0;
          this.field_c = true;
        }
        return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_14_1 = false;
        boolean stackIn_27_1 = false;
        Throwable decompiledCaughtException = null;
        if (param2 != -4) {
          this.field_e = 72;
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_b == var5) {
          stackIn_6_0 = (this.field_c) ? 0 : 1;
          if (stackIn_6_0 != (param0 ? 1 : 0)) {
            return;
          }
        }
        if (!this.field_a) {
          this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (var5 == this.field_b) {
          stackIn_14_1 = (param0);
          this.field_c = stackIn_14_1;
        } else {
          if (0 != this.field_b) {
            this.field_c = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_e);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_b = var5;
            this.field_e = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
          }
          stackIn_27_1 = (param0);
          this.field_c = stackIn_27_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, int param1, int param2) {
        if (param2 == 32512) {
          com.ms.win32.User32.SetCursorPos(param0, param1);
          return;
        }
        this.callback(18, -64, -120, -4);
        com.ms.win32.User32.SetCursorPos(param0, param1);
    }

    gb() {
        this.field_c = true;
    }
}
