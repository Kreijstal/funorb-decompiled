/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends com.ms.dll.Callback {
    private volatile int field_a;
    private volatile int field_d;
    private boolean field_c;
    private int field_e;
    private volatile boolean field_b;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_d != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
            }
            this.field_d = 0;
            this.field_b = true;
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          if (this.field_b) {
            stackIn_22_0 = this.field_e;
          } else {
            stackIn_22_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_22_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (this.field_b) {
            stackIn_8_0 = this.field_e;
          } else {
            stackIn_8_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_8_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
          }
          this.field_d = 0;
          this.field_b = true;
          return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
        }
        if (this.field_b) {
          stackIn_13_0 = this.field_e;
        } else {
          stackIn_13_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_13_0);
        return 0;
    }

    final void a(java.awt.Component param0, boolean param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_5_0 = false;
        int stackIn_6_1 = 0;
        boolean stackIn_15_1 = false;
        boolean stackIn_27_1 = false;
        Throwable decompiledCaughtException = null;
        if (param2 != -1101) {
          return;
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_d) {
          stackIn_5_0 = this.field_b;
          stackIn_6_1 = (param1) ? 0 : 1;
          if ((stackIn_5_0 ? 1 : 0) != stackIn_6_1) {
            return;
          }
        }
        if (!this.field_c) {
          this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (var5 == this.field_d) {
          stackIn_15_1 = (param1);
          this.field_b = stackIn_15_1;
        } else {
          if (this.field_d != 0) {
            this.field_b = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_d, -4, this.field_a);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_d = var5;
            this.field_a = com.ms.win32.User32.SetWindowLong(this.field_d, -4, this);
          }
          stackIn_27_1 = (param1);
          this.field_b = stackIn_27_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 >= -10) {
          java.awt.Component var5 = (java.awt.Component) null;
          this.a((java.awt.Component) null, true, 29);
        }
    }

    cl() {
        this.field_b = true;
    }
}
