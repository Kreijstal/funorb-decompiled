/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends com.ms.dll.Callback {
    private int field_a;
    private boolean field_b;
    private volatile int field_c;
    private volatile int field_e;
    private volatile boolean field_d;

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param2, param1);
        if (param0 != 26899) {
          this.field_b = false;
        }
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        if (param0 != this.field_c) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 == 101024) {
            com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_a);
            return 0;
          }
          if (param1 == 1) {
            this.field_c = 0;
            this.field_d = true;
          }
          return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_a);
          return 0;
        }
        if (param1 == 101024) {
          com.ms.win32.User32.SetCursor(!this.field_d ? 0 : this.field_a);
          return 0;
        }
        if (param1 == 1) {
          this.field_c = 0;
          this.field_d = true;
        }
        return com.ms.win32.User32.CallWindowProc(this.field_e, param0, param1, param2, param3);
    }

    final void a(int param0, java.awt.Component param1, boolean param2) {
        boolean stackIn_5_0 = false;
        int stackIn_6_1 = 0;
        boolean stackIn_23_1 = false;
        boolean stackIn_29_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        if (param0 <= 49) {
          this.field_a = 16;
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
        if (!this.field_b) {
          this.field_a = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_b = true;
        }
        if (this.field_c == var5) {
          stackIn_29_1 = (param2);
          this.field_d = stackIn_29_1;
        } else {
          if (this.field_c != 0) {
            this.field_d = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_c, -4, this.field_e);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_c = var5;
            this.field_e = com.ms.win32.User32.SetWindowLong(this.field_c, -4, this);
          }
          stackIn_23_1 = (param2);
          this.field_d = stackIn_23_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    ca() {
        this.field_d = true;
    }
}
