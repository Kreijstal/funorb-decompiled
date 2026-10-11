/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends com.ms.dll.Callback {
    private boolean field_c;
    private volatile int field_a;
    private volatile int field_b;
    private int field_e;
    private volatile boolean field_d;

    final void a(int param0, java.awt.Component param1, boolean param2) {
        boolean stackIn_10_1 = false;
        boolean stackIn_25_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (this.field_b == var5 &&
          this.field_d == param2) {
          return;
        }
        if (!this.field_c) {
          this.field_e = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_c = true;
        }
        if (this.field_b == var5) {
          stackIn_10_1 = (param2);
          this.field_d = stackIn_10_1;
        } else {
          if (this.field_b != 0) {
            this.field_d = true;
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
          stackIn_25_1 = (param2);
          this.field_d = stackIn_25_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
        if (param0 != 11333) {
          this.a(-21, (byte) -73, -121);
        }
    }

    final void a(int param0, byte param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param0, param2);
        if (param1 <= 46) {
          this.field_b = -95;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (this.field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 == 101024) {
            com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_e);
            return 0;
          }
          if (param1 == 1) {
            this.field_b = 0;
            this.field_d = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_e);
          return 0;
        }
        if (param1 == 101024) {
          com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_e);
          return 0;
        }
        if (param1 == 1) {
          this.field_b = 0;
          this.field_d = true;
        }
        return com.ms.win32.User32.CallWindowProc(this.field_a, param0, param1, param2, param3);
    }

    fl() {
        this.field_d = true;
    }
}
