/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends com.ms.dll.Callback {
    private boolean field_e;
    private volatile int field_a;
    private volatile boolean field_c;
    private int field_b;
    private volatile int field_d;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (101024 != param1) {
            if (param1 == 1) {
              this.field_a = 0;
              this.field_c = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
          }
          if (!this.field_c) {
            stackIn_12_0 = 0;
          } else {
            stackIn_12_0 = this.field_b;
          }
          com.ms.win32.User32.SetCursor(stackIn_12_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (1 == var5Lifetime1) {
          if (!this.field_c) {
            stackIn_18_0 = 0;
          } else {
            stackIn_18_0 = this.field_b;
          }
          com.ms.win32.User32.SetCursor(stackIn_18_0);
          return 0;
        }
        if (101024 != param1) {
          if (param1 == 1) {
            this.field_a = 0;
            this.field_c = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
        }
        if (!this.field_c) {
          stackIn_27_0 = 0;
        } else {
          stackIn_27_0 = this.field_b;
        }
        com.ms.win32.User32.SetCursor(stackIn_27_0);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 1) {
          return;
        }
        com.ms.win32.User32.SetCursorPos(param0, param2);
    }

    final void a(byte param0, java.awt.Component param1, boolean param2) {
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_25_1 = false;
        boolean stackIn_31_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_a == var5) {
          stackIn_3_0 = param2;
          stackIn_4_1 = (this.field_c) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (param0 >= -39) {
          this.field_d = 44;
        }
        if (!this.field_e) {
          this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_e = true;
        }
        if (this.field_a == var5) {
          stackIn_31_1 = (param2);
          this.field_c = stackIn_31_1;
        } else {
          if (this.field_a != 0) {
            this.field_c = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_a, -4, this.field_d);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_a = var5;
            this.field_d = com.ms.win32.User32.SetWindowLong(this.field_a, -4, this);
          }
          stackIn_25_1 = (param2);
          this.field_c = stackIn_25_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    w() {
        this.field_c = true;
    }
}
