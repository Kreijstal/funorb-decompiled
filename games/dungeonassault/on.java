/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends com.ms.dll.Callback {
    private boolean field_d;
    private int field_c;
    private volatile int field_a;
    private volatile boolean field_e;
    private volatile int field_b;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (1 != param1) {
              return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
            }
            this.field_b = 0;
            this.field_e = true;
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          if (!this.field_e) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = this.field_c;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (1 == var5Lifetime1) {
          if (!this.field_e) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = this.field_c;
          }
          com.ms.win32.User32.SetCursor(stackIn_16_0);
          return 0;
        }
        if (param1 != 101024) {
          if (1 != param1) {
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          this.field_b = 0;
          this.field_e = true;
          return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
        }
        if (!this.field_e) {
          stackIn_21_0 = 0;
        } else {
          stackIn_21_0 = this.field_c;
        }
        com.ms.win32.User32.SetCursor(stackIn_21_0);
        return 0;
    }

    final void a(int param0, java.awt.Component param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_18_1 = false;
        boolean stackIn_30_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_b) {
          stackIn_4_0 = (this.field_e) ? 0 : 1;
          stackIn_7_1 = (param2) ? 0 : 1;
          if (stackIn_4_0 == stackIn_7_1) {
            return;
          }
        }
        if (!this.field_d) {
          this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_d = true;
        }
        if (param0 != -14677) {
          this.field_b = -126;
        }
        if (this.field_b == var5) {
          stackIn_18_1 = (param2);
          this.field_e = stackIn_18_1;
        } else {
          if (this.field_b != 0) {
            this.field_e = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_a);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_b = var5;
            this.field_a = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
          }
          stackIn_30_1 = (param2);
          this.field_e = stackIn_30_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, boolean param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param0, param2);
        if (!param1) {
          this.field_e = false;
        }
    }

    on() {
        this.field_e = true;
    }
}
