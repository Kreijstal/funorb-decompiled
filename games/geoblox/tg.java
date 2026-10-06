/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends com.ms.dll.Callback {
    private volatile boolean field_e;
    private int field_a;
    private boolean field_d;
    private volatile int field_b;
    private volatile int field_c;

    final void a(int param0, boolean param1, java.awt.Component param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_22_1 = false;
        boolean stackIn_28_1 = false;
        Throwable decompiledCaughtException = null;
        if (param0 != 12758) {
          this.field_d = true;
        }
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_b == var5) {
          stackIn_6_0 = (this.field_e) ? 0 : 1;
          if (stackIn_6_0 != (param1 ? 1 : 0)) {
            return;
          }
        }
        if (!this.field_d) {
          this.field_a = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_d = true;
        }
        if (var5 == this.field_b) {
          stackIn_28_1 = !(!param1);
          this.field_e = stackIn_28_1;
        } else {
          if (0 != this.field_b) {
            this.field_e = true;
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
          stackIn_22_1 = !(!param1);
          this.field_e = stackIn_22_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param1);
        if (param0 > -45) {
            java.awt.Component var5 = (java.awt.Component) null;
            this.a(74, true, (java.awt.Component) null);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int var5;
        if (this.field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (param1 != 101024) {
            if (1 != param1) {
              return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
            }
            this.field_b = 0;
            this.field_e = true;
            return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
          }
          if (this.field_e) {
            stackIn_7_0 = this.field_a;
          } else {
            stackIn_7_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        var5 = 65535 & param3;
        if (var5 == 1) {
          if (!this.field_e) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = this.field_a;
          }
          com.ms.win32.User32.SetCursor(stackIn_16_0);
          return 0;
        }
        if (param1 != 101024) {
          if (1 != param1) {
            return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
          }
          this.field_b = 0;
          this.field_e = true;
          return com.ms.win32.User32.CallWindowProc(this.field_c, param0, param1, param2, param3);
        }
        if (this.field_e) {
          stackIn_21_0 = this.field_a;
        } else {
          stackIn_21_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_21_0);
        return 0;
    }

    tg() {
        this.field_e = true;
    }
}
