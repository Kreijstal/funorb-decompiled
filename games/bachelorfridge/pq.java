/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends com.ms.dll.Callback {
    private volatile boolean field_c;
    private volatile int field_a;
    private int field_b;
    private boolean field_d;
    private volatile int field_e;

    final void a(java.awt.Component param0, byte param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_17_1 = false;
        boolean stackIn_30_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_e) {
          stackIn_4_0 = (param2) ? 0 : 1;
          stackIn_7_1 = (this.field_c) ? 0 : 1;
          if (stackIn_4_0 == stackIn_7_1) {
            return;
          }
        }
        if (!this.field_d) {
          this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_d = true;
        }
        if (param1 >= -23) {
          this.callback(-85, 14, 75, 9);
        }
        if (this.field_e == var5) {
          stackIn_17_1 = (param2);
          this.field_c = stackIn_17_1;
        } else {
          if (this.field_e != 0) {
            this.field_c = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_a);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_e = var5;
            this.field_a = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
          }
          stackIn_30_1 = (param2);
          this.field_c = stackIn_30_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 9537) {
          this.field_e = 62;
          com.ms.win32.User32.SetCursorPos(param1, param0);
          return;
        }
        com.ms.win32.User32.SetCursorPos(param1, param0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_e != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (101024 != param1) {
            if (1 != param1) {
              return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
            }
            this.field_e = 0;
            this.field_c = true;
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          if (!this.field_c) {
            stackIn_21_0 = 0;
          } else {
            stackIn_21_0 = this.field_b;
          }
          com.ms.win32.User32.SetCursor(stackIn_21_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (!this.field_c) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = this.field_b;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        if (101024 != param1) {
          if (1 != param1) {
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          this.field_e = 0;
          this.field_c = true;
          return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
        }
        if (!this.field_c) {
          stackIn_12_0 = 0;
        } else {
          stackIn_12_0 = this.field_b;
        }
        com.ms.win32.User32.SetCursor(stackIn_12_0);
        return 0;
    }

    pq() {
        this.field_c = true;
    }
}
