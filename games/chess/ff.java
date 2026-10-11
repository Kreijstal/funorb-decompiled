/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends com.ms.dll.Callback {
    private int field_b;
    private boolean field_c;
    private volatile int field_e;
    private volatile boolean field_a;
    private volatile int field_d;

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_e != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (32 != param1) {
          if (param1 != 101024) {
            if (1 != param1) {
              return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
            }
            this.field_e = 0;
            this.field_a = true;
            return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
          }
          if (this.field_a) {
            stackIn_8_0 = this.field_b;
          } else {
            stackIn_8_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_8_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (!this.field_a) {
            stackIn_17_0 = 0;
          } else {
            stackIn_17_0 = this.field_b;
          }
          com.ms.win32.User32.SetCursor(stackIn_17_0);
          return 0;
        }
        if (param1 != 101024) {
          if (1 != param1) {
            return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
          }
          this.field_e = 0;
          this.field_a = true;
          return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
        }
        if (this.field_a) {
          stackIn_23_0 = this.field_b;
        } else {
          stackIn_23_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_23_0);
        return 0;
    }

    final void a(int param0, boolean param1, java.awt.Component param2) {
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_24_1 = false;
        boolean stackIn_30_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_e) {
          stackIn_3_0 = param1;
          stackIn_4_1 = (this.field_a) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (param0 != 29783) {
          this.callback(-4, -87, -50, -103);
        }
        if (!this.field_c) {
          this.field_b = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (var5 == this.field_e) {
          stackIn_30_1 = (param1);
          this.field_a = stackIn_30_1;
        } else {
          if (this.field_e != 0) {
            this.field_a = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_e, -4, this.field_d);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_e = var5;
            this.field_d = com.ms.win32.User32.SetWindowLong(this.field_e, -4, this);
          }
          stackIn_24_1 = (param1);
          this.field_a = stackIn_24_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param1, param2);
        if (param0 != 0) {
          java.awt.Component var5 = (java.awt.Component) null;
          this.a(-91, false, (java.awt.Component) null);
        }
    }

    ff() {
        this.field_a = true;
    }
}
