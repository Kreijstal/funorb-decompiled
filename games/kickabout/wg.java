/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends com.ms.dll.Callback {
    private int field_c;
    private boolean field_b;
    private volatile int field_a;
    private volatile boolean field_e;
    private volatile int field_d;

    final void a(java.awt.Component param0, boolean param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        Throwable var8 = null;
        com.ms.awt.WComponentPeer var9 = null;
        boolean stackIn_20_1 = false;
        boolean stackIn_26_1 = false;
        Throwable decompiledCaughtException = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        if (param2 >= -72) {
          this.field_c = 127;
        }
        var5 = var9.getTopHwnd();
        if (this.field_a == var5 &&
          this.field_e == param1) {
          return;
        }
        if (!this.field_b) {
          this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_b = true;
        }
        if (var5 == this.field_a) {
          stackIn_26_1 = (param1);
          this.field_e = stackIn_26_1;
        } else {
          if (this.field_a != 0) {
            this.field_e = true;
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
          stackIn_20_1 = (param1);
          this.field_e = stackIn_20_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, byte param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param0);
        if (param1 != -40) {
          this.callback(-26, -63, -123, 69);
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (param0 != this.field_a) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 == 101024) {
            com.ms.win32.User32.SetCursor(!this.field_e ? 0 : this.field_c);
            return 0;
          }
          if (param1 == 1) {
            this.field_a = 0;
            this.field_e = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
        }
        var5Lifetime1 = 65535 & param3;
        if (var5Lifetime1 == 1) {
          com.ms.win32.User32.SetCursor(this.field_e ? this.field_c : 0);
          return 0;
        }
        if (param1 == 101024) {
          com.ms.win32.User32.SetCursor(!this.field_e ? 0 : this.field_c);
          return 0;
        }
        if (param1 == 1) {
          this.field_a = 0;
          this.field_e = true;
        }
        return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
    }

    wg() {
        this.field_e = true;
    }
}
