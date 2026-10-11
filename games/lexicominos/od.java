/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends com.ms.dll.Callback {
    private boolean field_a;
    private volatile int field_d;
    private volatile boolean field_e;
    private volatile int field_b;
    private int field_c;

    final void a(java.awt.Component param0, boolean param1, boolean param2) {
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_23_1 = false;
        boolean stackIn_30_1 = false;
        boolean stackIn_34_1 = false;
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        Object var6 = null;
        com.ms.awt.WComponentPeer var9 = null;
        var9 = (com.ms.awt.WComponentPeer) null;
        var5 = var9.getTopHwnd();
        if (var5 == this.field_b) {
          stackIn_3_0 = param1;
          stackIn_4_1 = (this.field_e) ? 0 : 1;
          if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
            return;
          }
        }
        if (!this.field_a) {
          this.field_c = com.ms.win32.User32.LoadCursor(0, 32512);
          com.ms.dll.Root.alloc(this);
          this.field_a = true;
        }
        if (this.field_b == var5) {
          if (param2) {
            stackIn_30_1 = (param1);
            this.field_e = stackIn_30_1;
          } else {
            this.callback(85, -115, -36, 38);
            stackIn_34_1 = (param1);
            this.field_e = stackIn_34_1;
          }
        } else {
          if (0 != this.field_b) {
            this.field_e = true;
            com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
            var6 = this;
            synchronized (var6) {
              com.ms.win32.User32.SetWindowLong(this.field_b, -4, this.field_d);
            }
          }
          var6 = this;
          synchronized (var6) {
            this.field_b = var5;
            this.field_d = com.ms.win32.User32.SetWindowLong(this.field_b, -4, this);
          }
          if (!param2) {
            this.callback(85, -115, -36, 38);
          }
          stackIn_23_1 = (param1);
          this.field_e = stackIn_23_1;
        }
        com.ms.win32.User32.SendMessage(var5, 101024, 0, 0);
    }

    final void a(int param0, int param1, int param2) {
        com.ms.win32.User32.SetCursorPos(param0, param1);
        int var4 = 56 % ((param2 - 67) / 44);
    }

    od() {
        this.field_e = true;
    }

    final synchronized int callback(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int var5;
        int var5Lifetime1;
        if (this.field_b != param0) {
          var5 = com.ms.win32.User32.GetWindowLong(param0, -4);
          return com.ms.win32.User32.CallWindowProc(var5, param0, param1, param2, param3);
        }
        if (param1 != 32) {
          if (param1 != 101024) {
            if (param1 != 1) {
              return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
            }
            this.field_b = 0;
            this.field_e = true;
            return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
          }
          if (this.field_e) {
            stackIn_23_0 = this.field_c;
          } else {
            stackIn_23_0 = 0;
          }
          com.ms.win32.User32.SetCursor(stackIn_23_0);
          return 0;
        }
        var5Lifetime1 = param3 & 65535;
        if (var5Lifetime1 == 1) {
          if (!this.field_e) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = this.field_c;
          }
          com.ms.win32.User32.SetCursor(stackIn_7_0);
          return 0;
        }
        if (param1 != 101024) {
          if (param1 != 1) {
            return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
          }
          this.field_b = 0;
          this.field_e = true;
          return com.ms.win32.User32.CallWindowProc(this.field_d, param0, param1, param2, param3);
        }
        if (this.field_e) {
          stackIn_13_0 = this.field_c;
        } else {
          stackIn_13_0 = 0;
        }
        com.ms.win32.User32.SetCursor(stackIn_13_0);
        return 0;
    }
}
