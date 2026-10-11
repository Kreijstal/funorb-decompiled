/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends com.ms.dll.Callback {
    private volatile int field_d;
    private volatile int field_c;
    private volatile boolean field_b;
    private boolean field_e;
    private int field_a;

    final void a(boolean param0, java.awt.Component param1, byte param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_5_0 = false;
        int stackIn_6_1 = 0;
        boolean stackIn_16_1 = false;
        boolean stackIn_29_1 = false;
        Throwable decompiledCaughtException = null;
        if (param2 >= -19) {
          return;
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_c) {
          stackIn_5_0 = this.field_b;
          stackIn_6_1 = (param0) ? 0 : 1;
          if ((stackIn_5_0 ? 1 : 0) != stackIn_6_1) {
            return;
          }
        }
        if (!this.field_e) {
          this.field_a = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_e = true;
        }
        if (var5 == this.field_c) {
          stackIn_16_1 = (param0);
          this.field_b = stackIn_16_1;
        } else {
          if (0 != this.field_c) {
            this.field_b = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_d);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_c = var5;
            this.field_d = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
          }
          stackIn_29_1 = (param0);
          this.field_b = stackIn_29_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int var5;
        int var5Lifetime1;
        if (param0 != this.field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (param1 != 101024) {
            if (param1 == 1) {
              this.field_c = 0;
              this.field_b = true;
            }
            return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
          }
          if (this.field_b) {
            stackIn_12_0 = this.field_a;
          } else {
            stackIn_12_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_12_0);
          return 0;
        }
        var5Lifetime1 = 65535 & param3;
        if (var5Lifetime1 == 1) {
          if (this.field_b) {
            stackIn_18_0 = this.field_a;
          } else {
            stackIn_18_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_18_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 == 1) {
            this.field_c = 0;
            this.field_b = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
        }
        if (this.field_b) {
          stackIn_27_0 = this.field_a;
        } else {
          stackIn_27_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_27_0);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param0, param1);
        if (param2 != 0) {
          java.awt.Component var5 = (java.awt.Component) null;
          this.a(true, (java.awt.Component) null, (byte) 63);
        }
    }

    tb() {
        this.field_b = true;
    }
}
