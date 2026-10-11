/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends com.ms.dll.Callback {
    private volatile int field_c;
    private boolean field_a;
    private volatile boolean field_d;
    private int field_e;
    private volatile int field_b;

    final void a(boolean param0, byte param1, java.awt.Component param2) {
        int stackIn_4_0 = 0;
        boolean stackIn_22_1 = false;
        boolean stackIn_31_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_b) {
          stackIn_4_0 = (param0) ? 0 : 1;
          if (stackIn_4_0 != (this.field_d ? 1 : 0)) {
            return;
          }
        }
        if (!this.field_a) {
          this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (this.field_b == var5) {
          if (param1 < 28) {
            return;
          }
          stackIn_31_1 = (param0);
          this.field_d = stackIn_31_1;
        } else {
          if (0 != this.field_b) {
            this.field_d = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_c);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_b = var5;
            this.field_c = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
          }
          if (param1 < 28) {
            return;
          }
          stackIn_22_1 = (param0);
          this.field_d = stackIn_22_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (101024 != param1) {
            if (param1 == 1) {
              this.field_b = 0;
              this.field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
          }
          if (!this.field_d) {
            stackIn_11_0 = 0;
          } else {
            stackIn_11_0 = this.field_e;
          }
          com.ms.win32.User32.SetCursor(stackIn_11_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (1 == var5Lifetime1) {
          if (this.field_d) {
            stackIn_17_0 = this.field_e;
          } else {
            stackIn_17_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (101024 != param1) {
          if (param1 == 1) {
            this.field_b = 0;
            this.field_d = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
        }
        if (!this.field_d) {
          stackIn_26_0 = 0;
        } else {
          stackIn_26_0 = this.field_e;
        }
        com.ms.win32.User32.SetCursor(stackIn_26_0);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param0);
        int var4 = -33 % ((param2 - 22) / 49);
    }

    kd() {
        this.field_d = true;
    }
}
