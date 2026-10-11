/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends com.ms.dll.Callback {
    private volatile boolean field_e;
    private volatile int field_a;
    private boolean field_b;
    private int field_d;
    private volatile int field_c;

    final void a(int param0, int param1, int param2) {
        if (param2 > -89) {
          this.a(-75, -95, -122);
          com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    final void a(int param0, java.awt.Component param1, boolean param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_27_1 = false;
        boolean stackIn_33_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (param0 != 32512) {
          this.callback(26, -83, -16, -117);
        }
        if (this.field_c == var5) {
          stackIn_6_0 = (this.field_e) ? 0 : 1;
          stackIn_9_1 = (param2) ? 0 : 1;
          if (stackIn_6_0 == stackIn_9_1) {
            return;
          }
        }
        if (!this.field_b) {
          this.field_d = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_b = true;
        }
        if (var5 == this.field_c) {
          stackIn_33_1 = (param2);
          this.field_e = stackIn_33_1;
        } else {
          if (this.field_c != 0) {
            this.field_e = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_a);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_c = var5;
            this.field_a = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
          }
          stackIn_27_1 = (param2);
          this.field_e = stackIn_27_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (101024 != param1) {
            if (param1 == 1) {
              this.field_c = 0;
              this.field_e = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          if (!this.field_e) {
            stackIn_11_0 = 0;
          } else {
            stackIn_11_0 = this.field_d;
          }
          com.ms.win32.User32.SetCursor(stackIn_11_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (1 == var5Lifetime1) {
          if (!this.field_e) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = this.field_d;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (101024 != param1) {
          if (param1 == 1) {
            this.field_c = 0;
            this.field_e = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
        }
        if (!this.field_e) {
          stackIn_26_0 = 0;
        } else {
          stackIn_26_0 = this.field_d;
        }
        com.ms.win32.User32.SetCursor(stackIn_26_0);
        return 0;
    }

    rb() {
        this.field_e = true;
    }
}
