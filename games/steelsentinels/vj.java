/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends com.ms.dll.Callback {
    private int field_e;
    private volatile boolean field_d;
    private volatile int field_b;
    private volatile int field_c;
    private boolean field_a;

    final void a(java.awt.Component param0, int param1, boolean param2) {
        boolean stackIn_5_0 = false;
        int stackIn_6_1 = 0;
        boolean stackIn_15_1 = false;
        boolean stackIn_28_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        if (param1 != 32512) {
          this.a(-24, -44, true);
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_c == var5) {
          stackIn_5_0 = param2;
          stackIn_6_1 = (this.field_d) ? 0 : 1;
          if ((stackIn_5_0 ? 1 : 0) != stackIn_6_1) {
            return;
          }
        }
        if (!this.field_a) {
          this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (this.field_c == var5) {
          stackIn_15_1 = (param2);
          this.field_d = stackIn_15_1;
        } else {
          if (0 != this.field_c) {
            this.field_d = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_b);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_c = var5;
            this.field_b = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
          }
          stackIn_28_1 = (param2);
          this.field_d = stackIn_28_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, int param1, boolean param2) {
        com.ms.win32.User32.SetCursorPos(param1, param0);
        if (param2) {
          this.callback(101, 84, -67, 91);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (101024 != param1) {
            if (1 != param1) {
              return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
            }
            this.field_c = 0;
            this.field_d = true;
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          if (!this.field_d) {
            stackIn_8_0 = 0;
          } else {
            stackIn_8_0 = this.field_e;
          }
          com.ms.win32.User32.SetCursor(stackIn_8_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (var5Lifetime1 == 1) {
          if (!this.field_d) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = this.field_e;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (101024 != param1) {
          if (1 != param1) {
            return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
          }
          this.field_c = 0;
          this.field_d = true;
          return com.ms.win32.User32.CallWindowProc(this.field_b, param0, param1, param2, param3);
        }
        if (!this.field_d) {
          stackIn_22_0 = 0;
        } else {
          stackIn_22_0 = this.field_e;
        }
        com.ms.win32.User32.SetCursor(stackIn_22_0);
        return 0;
    }

    vj() {
        this.field_d = true;
    }
}
