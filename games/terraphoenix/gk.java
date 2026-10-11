/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends com.ms.dll.Callback {
    private int field_e;
    private boolean field_a;
    private volatile int field_d;
    private volatile boolean field_c;
    private volatile int field_b;

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param1);
        if (param0 != -2) {
          this.callback(96, 11, 73, 3);
        }
    }

    final void a(boolean param0, java.awt.Component param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_12_1 = false;
        boolean stackIn_25_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (param2 > -15) {
          return;
        }
        if (this.field_d == var5 &&
          this.field_c == param0) {
          return;
        }
        if (!this.field_a) {
          this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (var5 == this.field_d) {
          stackIn_12_1 = (param0);
          this.field_c = stackIn_12_1;
        } else {
          if (this.field_d != 0) {
            this.field_c = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_d, -4, this.field_b);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_d = var5;
            this.field_b = com.ms.win32.User32.SetWindowLong(this.field_d, -4, this);
          }
          stackIn_25_1 = (param0);
          this.field_c = stackIn_25_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_d) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (param1 == 1) {
              this.field_d = 0;
              this.field_c = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          if (this.field_c) {
            stackIn_11_0 = this.field_e;
          } else {
            stackIn_11_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_11_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (1 == var5Lifetime1) {
          if (!this.field_c) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = this.field_e;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 == 1) {
            this.field_d = 0;
            this.field_c = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
        }
        if (this.field_c) {
          stackIn_26_0 = this.field_e;
        } else {
          stackIn_26_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_26_0);
        return 0;
    }

    gk() {
        this.field_c = true;
    }
}
