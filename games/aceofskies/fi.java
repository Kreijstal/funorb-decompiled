/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends com.ms.dll.Callback {
    private volatile boolean field_d;
    private int field_b;
    private volatile int field_a;
    private volatile int field_e;
    private boolean field_c;

    final void a(boolean param0, java.awt.Component param1, int param2) {
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_13_1 = false;
        boolean stackIn_29_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_a == var5) {
          stackIn_3_0 = param0;
          stackIn_4_1 = (this.field_d) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (!this.field_c) {
          this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (var5 == this.field_a) {
          stackIn_13_1 = (param0);
          this.field_d = stackIn_13_1;
        } else {
          if (this.field_a != 0) {
            this.field_d = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_e);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_a = var5;
            this.field_e = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
          }
          stackIn_29_1 = (param0);
          this.field_d = stackIn_29_1;
        }
        if (param2 != -4) {
          return;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_a != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (1 == param1) {
              this.field_a = 0;
              this.field_d = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
          }
          if (!this.field_d) {
            stackIn_11_0 = 0;
          } else {
            stackIn_11_0 = this.field_b;
          }
          com.ms.win32.User32.SetCursor(stackIn_11_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (this.field_d) {
            stackIn_17_0 = this.field_b;
          } else {
            stackIn_17_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (param1 != 101024) {
          if (1 == param1) {
            this.field_a = 0;
            this.field_d = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
        }
        if (!this.field_d) {
          stackIn_26_0 = 0;
        } else {
          stackIn_26_0 = this.field_b;
        }
        com.ms.win32.User32.SetCursor(stackIn_26_0);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 0) {
          this.field_d = false;
          com.ms.win32.User32.SetCursorPos(param1, param2);
          return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param2);
    }

    fi() {
        this.field_d = true;
    }
}
